package com.tools20022.core.metamodel;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.tools20022.core.metamodel.ISODoc.Basis;

abstract class StaticMetamodel implements Metamodel {
	
	protected List<Metamodel.MetamodelType<?>> types;
	protected List<Metamodel.MetamodelEnum<?>> enums;

	private LinkedHashMap<String, Metamodel.MetamodelType<?>> mmTypesByName;
	private LinkedHashMap<Class<? extends GeneratedMetamodelBean>, Metamodel.MetamodelType<?>> mmTypesByClass = new LinkedHashMap<>();
	private LinkedHashMap<Metamodel.MetamodelType<?>, Class<?>> classesBymmTypes = new LinkedHashMap<>();
	private LinkedHashMap<String, Metamodel.MetamodelEnum<?>> mmEnumsByName = new LinkedHashMap<>();
	private LinkedHashMap<Class<? extends Enum<?>>, Metamodel.MetamodelEnum<?>> mmEnumsByClass = new LinkedHashMap<>();

	private volatile boolean cacheIntialized = false;
	
	private void initCache() {
		synchronized (this) {
			if( ! cacheIntialized ) {
				cacheIntialized = true;
			}
		}
	}
	
	@Override
	public MetamodelType<? extends GeneratedMetamodelBean> getTypeByName(String name) {
		synchronized (this) {
			if( mmTypesByName == null ) {
				mmTypesByName = new LinkedHashMap<>();
				for( MetamodelType<?> type: types) {
					mmTypesByName.put(type.getName(), type);
				}
			}
		}
		return mmTypesByName.get(name);
	}

	@Override
	public <B extends GeneratedMetamodelBean> MetamodelType<B> getTypeByClass(Class<B> beanClass) {
		synchronized (this) {
			if( mmTypesByClass == null ) {
				mmTypesByClass = new LinkedHashMap<>();
				for( MetamodelType<?> type: types) {
					mmTypesByClass.put(type.getBeanClass(), type);
				}
			}
		}
		@SuppressWarnings("unchecked")
		MetamodelType<B> ret = (MetamodelType<B>) mmTypesByClass.get(beanClass);
		return ret;
	}

	@Override
	public MetamodelEnum<?> getEnumByName(String name) {
		synchronized (this) {
			if( mmEnumsByName == null ) {
				mmEnumsByName = new LinkedHashMap<>();
				for( MetamodelEnum<?> mmEnum: enums) {
					mmEnumsByName.put(mmEnum.getName(), mmEnum);
				}
			}
		}
		return mmEnumsByName.get(name);
	}

	@Override
	public <E extends Enum<?>> MetamodelEnum<E> getEnumByClass(Class<E> enumClass) {
		synchronized (this) {
			if( mmEnumsByClass == null ) {
				mmEnumsByClass = new LinkedHashMap<>();
				for( MetamodelEnum<?> mmEnum: enums) {
					mmEnumsByClass.put(mmEnum.getEnumJavaClass(), mmEnum);
				}
			}
		}
		@SuppressWarnings("unchecked")
		MetamodelEnum<E> ret = (MetamodelEnum<E>) mmEnumsByClass.get(enumClass);
		return ret;
	}

	@Override
	public List<? extends MetamodelType<? extends GeneratedMetamodelBean>> getAllTypes() {
		return Collections.unmodifiableList(types);
	}

	@Override
	public List<? extends MetamodelEnum<?>> getAllEnums() {
		return Collections.unmodifiableList(enums);
	}
	
	public abstract static class CoreModelElementImpl implements MetamodelElement {

		CoreModelElementImpl() {
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + getName();
		}
	}

	protected final static String getMethodSignature(Method m) {
		return m.getName(); // TODO
	}

	public static class CoreTypeImpl<B extends GeneratedMetamodelBean> extends CoreModelElementImpl implements MetamodelType<B> {
		protected Class<B> beanClass;
		protected Supplier<List<CoreAttributeImpl<B, ?>>> attrs;
		protected Supplier<List<CoreConstraintImpl<B>>> constraints;
		protected Supplier<List<CoreTypeImpl<? super B>>> directSuperTypes;
		protected Supplier<List<CoreTypeImpl<? extends B>>> directSubTypes;
		protected Supplier<List<CoreAttributeImpl<?, ?>>> incomingAttrs;

		protected CoreTypeImpl() {
		}

		@Override
		public Class<B> getBeanClass() {
			return beanClass;
		}

		@Override
		public B newInstance() {
			if (isAbstract())
				throw new RuntimeException("This is an abstract type");
			try {
				return beanClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public boolean isAbstract() {
			return beanClass.isInterface();
		}

		@Override
		public Stream<? extends CoreTypeImpl<? super B>> listSuperTypes(boolean includeThis, boolean recursive) {
			Stream<? extends CoreTypeImpl<? super B>> superTypeStream;
			if (recursive) {
				superTypeStream = listSuperTypes(false, false).flatMap(c -> c.listSuperTypes(true, true));
			} else {
				superTypeStream = directSuperTypes.get().stream();
			}

			if (includeThis) {
				superTypeStream = Stream.concat(Stream.of(this), superTypeStream);
			}

			return superTypeStream;
		}

		@Override
		public Stream<? extends CoreTypeImpl<? extends B>> listSubTypes(boolean includeThis, boolean recursive) {
			Stream<? extends CoreTypeImpl<? extends B>> subTypeStream;
			if (recursive) {
				subTypeStream = listSubTypes(false, false).flatMap(c -> c.listSubTypes(true, true));
			} else {
				subTypeStream = directSubTypes.get().stream();
			}

			if (includeThis) {
				subTypeStream = Stream.concat(Stream.of(this), subTypeStream);
			}

			return subTypeStream;
		}

		@Override
		public Stream<? extends MetamodelAttribute<B, ?>> listDeclaredAttributes() {
			return attrs.get().stream();
		}

		@Override
		public Set<? extends MetamodelAttribute<?, ?>> getIncomingAttributes() {
			return new HashSet<>(incomingAttrs.get());
		}

		@Override
		public Stream<? extends MetamodelConstraint<B>> listDeclaredConstraints() {
			return constraints.get().stream();
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(beanClass);
		}

		@Override
		public String getName() {
			String name = beanClass.getSimpleName();
			if (name.startsWith("MM"))
				name = name.substring(2);
			return name;
		}

	}

	private static MetamodelDocImpl annotToDoc(AnnotatedElement javaElem) {
		ISODoc docAnnot = javaElem.getAnnotation(ISODoc.class);
		if (docAnnot == null) {
			return new MetamodelDocImpl("", Basis.EMPTY, "");
		} else {
			return new MetamodelDocImpl(docAnnot.value(), docAnnot.basis(), docAnnot.ext());
		}
	}

	public static class CoreAttributeImpl<B extends GeneratedMetamodelBean, T> extends CoreModelElementImpl
			implements MetamodelAttribute<B, T> {

		protected CoreTypeImpl<B> metaType;
		protected String name;
		private Method getterMethod;

		private boolean isOptional;
		private boolean isMultiple;
		private boolean isUnique;
		private boolean isContainer;
		private boolean isContainment;
		private Class<?> valueJavaClass;
		private CoreEnumImpl<?> enumType;
		private CoreTypeImpl<?> referncedType;
		protected CoreAttributeImpl<?, B> oppositeAttr;

		CoreAttributeImpl(CoreTypeImpl<B> metaType, Method getterMethod) {
			this.metaType = metaType;
			initMembers();
		}
		
		private void initMembers() {
			synchronized (this) {
				if( name!= null  )
					return;
				try {
					this.name = getPropertyName(getterMethod);

					ParsedType pt = parseValueType(getterMethod.getGenericReturnType());
					if (pt.wrapperClass == null) {
						isOptional = false;
						isMultiple = false;
						isUnique = true;
					} else if (Optional.class.isAssignableFrom(pt.wrapperClass)) {
						isOptional = true;
						isMultiple = false;
						isUnique = true;
					} else if (Collection.class.isAssignableFrom(pt.wrapperClass)) {
						isOptional = true;
						isMultiple = true;
						isUnique = true;
					} else {
						throw new RuntimeException("Unsupported wrapper type: " + pt.wrapperClass);
					}

					isContainer = getterMethod.getAnnotation(Container.class) != null;
					isContainment = getterMethod.getAnnotation(Containment.class) != null;

					if (pt.baseClass.isEnum()) {
						@SuppressWarnings("unchecked")
						Class<? extends Enum<?>> enumClass = (Class<? extends Enum<?>>) pt.baseClass;
						Field coreTypeField = enumClass.getField("coreType"); 
						enumType = (CoreEnumImpl<?>) coreTypeField.get(null);
						valueJavaClass = null;
						referncedType = null;
					} else if (GeneratedMetamodelBean.class.isAssignableFrom(pt.baseClass)) {
						@SuppressWarnings("unchecked")
						Class<? extends GeneratedMetamodelBean> refClass = (Class<? extends GeneratedMetamodelBean>) pt.baseClass;
						enumType = null;
						valueJavaClass = null;
						Field coreTypeField = refClass.getField("coreType"); 
						enumType = (CoreEnumImpl<?>) coreTypeField.get(null);
					} else {
						enumType = null;
						valueJavaClass = pt.baseClass;
						referncedType = null;
					}					
				} catch ( Exception e ) {
					throw new RuntimeException("Invalid metamodel bean structure", e);
				}
			}			
		}

		@Override
		public CoreTypeImpl<B> getDeclaringType() {
			return metaType;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Object get(GeneratedMetamodelBean repoObj) {
			try {
				return getterMethod.invoke(repoObj);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public Method getGetterMethod() {
			return getterMethod;
		}
		
		@Override
		public void set(GeneratedMetamodelBean repoObj, Object value) {
			try {
				Field field = null;
				for (Class<?> declClass = repoObj.getClass(); field == null && declClass != null;) {
					try {
						String fieldName = name + (getReferencedType() != null && !isDerived() ? "_lazy":"");
						field = declClass.getDeclaredField(fieldName);
					} catch (NoSuchFieldException nsfe) {
						// No problem, continue with superclass
						declClass = declClass.getSuperclass();
					}
				}
				boolean isAccessible = field.isAccessible();
				if (!isAccessible) {
					field.setAccessible(true);
				}
				field.set(repoObj, value);
			} catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(getterMethod);
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + metaType.getName() + "." + getName();
		}
		
		@Override
		public boolean isDerived() {
			return getterMethod.getAnnotation(Derived.class) != null;
		}

		@Override
		public boolean isOptional() {
			return isOptional;
		}

		@Override
		public boolean isUnique() {
			return isUnique;
		}

		@Override
		public boolean isMultiple() {
			return isMultiple;
		}

		@Override
		public boolean isContainer() {
			return isContainer;
		}

		@Override
		public boolean isContainment() {
			return isContainment;
		}

		@Override
		public Class<?> getValueJavaClass() {
			return valueJavaClass;
		}

		@Override
		public MetamodelEnum<?> getEnumType() {
			return enumType;
		}

		@Override
		public CoreTypeImpl<?> getReferencedType() {
			return referncedType;
		}

		@Override
		public CoreAttributeImpl<?, B> getOpposite() {
			return oppositeAttr;
		}

		@SuppressWarnings("unchecked")
		private void setOpposite(CoreAttributeImpl<?, ?> oppositeAttr) {
			this.oppositeAttr = (CoreAttributeImpl<?, B>) oppositeAttr;
		}
	}

	public static class CoreConstraintImpl<B extends GeneratedMetamodelBean> extends CoreModelElementImpl
			implements MetamodelConstraint<B> {
		private final MetamodelType<B> metaType;
		private final String name;
		private final Method implMethod;
		private final Consumer<B> checker;

		CoreConstraintImpl(MetamodelType<B> metaType, Class<B> beanClass, Method implMethod, Consumer<B> checker) {
			this.metaType = metaType;
			this.implMethod = implMethod;
			this.name = implMethod.getName();
			this.checker = checker;
		}

		@Override
		public MetamodelType getDeclaringType() {
			return metaType;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(implMethod);
		}

		@Override
		public String toString() {
			return "[" + getClass().getSimpleName() + "]:" + metaType.getName() + "." + getName();
		}

		@Override
		public Consumer<B> checker() {
			return checker;
		}

	}

	public static class CoreEnumImpl<E extends Enum<?>> extends CoreModelElementImpl implements MetamodelEnum<E> {
		final Class<E> enumClass;
		final LinkedHashMap<String, CoreEnumLiteralImpl<E>> mmLiteralsByName = new LinkedHashMap<>();

		public CoreEnumImpl(Class<E> enumClass) {
			this.enumClass = enumClass;
			for (E enumValue : enumClass.getEnumConstants()) {
				CoreEnumLiteralImpl<E> mmEnumLit = new CoreEnumLiteralImpl<E>(enumValue);
				mmLiteralsByName.put(enumValue.name(), mmEnumLit);
			}
		}

		@Override
		public String getName() {
			// TODO: Support MetaName annotation
			String name = enumClass.getSimpleName();
			if (name.startsWith("MM"))
				name = name.substring(2);
			return name;
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			return annotToDoc(enumClass);
		}

		@Override
		public Stream<? extends CoreEnumLiteralImpl<E>> listEnumLiterals() {
			return mmLiteralsByName.values().stream();
		}

		@Override
		public Class<E> getEnumJavaClass() {
			return enumClass;
		}

		@Override
		public CoreEnumLiteralImpl<E> getEnumLiteral(String name) {
			return mmLiteralsByName.get(name);
		}

	}

	public static class CoreEnumLiteralImpl<E extends Enum<?>> extends CoreModelElementImpl implements MetamodelEnumLiteral<E> {
		private final E enumValue;

		CoreEnumLiteralImpl(E enumValue) {
			this.enumValue = enumValue;
		}

		@Override
		public String getName() {
			// TODO: Support MetaName annotation
			return enumValue.name();
		}

		@Override
		public MetamodelDocImpl getDocumentation() {
			Field enumValueAsField;
			try {
				enumValueAsField = enumValue.getClass().getField(enumValue.name());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			return annotToDoc(enumValueAsField);
		}

		@Override
		public E getValue() {
			return enumValue;
		}

	}

	/**
	 * @return the property name or <code>null</code> if the method isn't a getter
	 */
	private static String getPropertyName(Method getterMethod) {
		if (!Modifier.isPublic(getterMethod.getModifiers()))
			return null;
		if (Modifier.isStatic(getterMethod.getModifiers()))
			return null;
		if ("getContainer".equals(getterMethod.getName()))
			return null;
		String propName;
		if (getterMethod.getName().startsWith("get")) {
			propName = getterMethod.getName().substring(3);
		} else if (getterMethod.getName().startsWith("is")) {
			propName = getterMethod.getName().substring(2);
		} else {
			return null;
		}
		propName = propName.substring(0, 1).toLowerCase() + propName.substring(1);
		return propName;
	}

	private static class ParsedType {
		final Class<?> baseClass;
		final Class<?> wrapperClass;

		public ParsedType(Class<?> baseClass, Class<?> wrapperClass) {
			this.baseClass = baseClass;
			this.wrapperClass = wrapperClass;
		}

	}

	private static ParsedType parseValueType(Type returnType) {
		Class<?> baseClass;
		Class<?> wrapperClass;
		if (returnType instanceof ParameterizedType) {
			wrapperClass = (Class<?>) ((ParameterizedType) returnType).getRawType();
			if (((ParameterizedType) returnType).getActualTypeArguments().length != 1)
				throw new RuntimeException("Illegal value type.");
			baseClass = (Class<?>) ((ParameterizedType) returnType).getActualTypeArguments()[0];
		} else {
			wrapperClass = null;
			baseClass = (Class<?>) returnType;
		}
		return new ParsedType(baseClass, wrapperClass);
	}

}
