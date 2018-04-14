/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.ProductIdentifier2Choice;
import com.tools20022.repository.codeset.ProductIdentifierCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Information used to identify a product.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProductIdentification"
 * src="doc-files/ProductIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmIdentifier
 * ProductIdentification.mmIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmProduct
 * ProductIdentification.mmProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmType
 * ProductIdentification.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmGlobalSerialIdentifier
 * ProductIdentification.mmGlobalSerialIdentifier}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
 * Product.mmProductIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice#mmStructuredProductIdentifier
 * ProductIdentifier2Choice.mmStructuredProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice#mmOtherProductIdentifier
 * ProductIdentifier2Choice.mmOtherProductIdentifier}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ProductIdentifier2
 * ProductIdentifier2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice
 * ProductIdentifier2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to identify a product."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class ProductIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Product2#mmProductCode
	 * Product2.mmProductCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmProductCode
	 * Product1.mmProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ProductIdentifier2#mmIdentifier
	 * ProductIdentifier2.mmIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmGlobalSerialIdentifier
	 * TradeProduct1.mmGlobalSerialIdentifier}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmProductCode
	 * Product3.mmProductCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product4#mmProductCode
	 * Product4.mmProductCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product5#mmProductCode
	 * Product5.mmProductCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmGlobalSerialIdentifier
	 * TradeProduct2.mmGlobalSerialIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmGlobalSerialIdentifier
	 * TradeProduct3.mmGlobalSerialIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the product identifier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProductIdentification, Max35Text> mmIdentifier = new MMBusinessAttribute<ProductIdentification, Max35Text>() {
		{
			derivation_lazy = () -> Arrays.asList(Product2.mmProductCode, Product1.mmProductCode, ProductIdentifier2.mmIdentifier, TradeProduct1.mmGlobalSerialIdentifier, Product3.mmProductCode, Product4.mmProductCode,
					Product5.mmProductCode, TradeProduct2.mmGlobalSerialIdentifier, TradeProduct3.mmGlobalSerialIdentifier);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identifier";
			definition = "Specifies the product identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ProductIdentification obj) {
			return obj.getIdentifier();
		}

		@Override
		public void setValue(ProductIdentification obj, Max35Text value) {
			obj.setIdentifier(value);
		}
	};
	protected Product product;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
	 * Product.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the product for which an identification is specified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ProductIdentification, Optional<Product>> mmProduct = new MMBusinessAssociationEnd<ProductIdentification, Optional<Product>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Specifies the product for which an identification is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> Product.mmProductIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Product.mmObject();
		}

		@Override
		public Optional<Product> getValue(ProductIdentification obj) {
			return obj.getProduct();
		}

		@Override
		public void setValue(ProductIdentification obj, Optional<Product> value) {
			obj.setProduct(value.orElse(null));
		}
	};
	protected ProductIdentifierCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProductIdentifierCode
	 * ProductIdentifierCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ProductIdentifier2#mmType
	 * ProductIdentifier2.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product identifier by means of a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProductIdentification, ProductIdentifierCode> mmType = new MMBusinessAttribute<ProductIdentification, ProductIdentifierCode>() {
		{
			derivation_lazy = () -> Arrays.asList(ProductIdentifier2.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Specifies the type of product identifier by means of a code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ProductIdentifierCode.mmObject();
		}

		@Override
		public ProductIdentifierCode getValue(ProductIdentification obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ProductIdentification obj, ProductIdentifierCode value) {
			obj.setType(value);
		}
	};
	protected Max35Text globalSerialIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification
	 * ProductIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalSerialIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique global serial identifier for a product instance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<ProductIdentification, Max35Text> mmGlobalSerialIdentifier = new MMBusinessAttribute<ProductIdentification, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProductIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GlobalSerialIdentifier";
			definition = "Unique global serial identifier for a product instance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ProductIdentification obj) {
			return obj.getGlobalSerialIdentifier();
		}

		@Override
		public void setValue(ProductIdentification obj, Max35Text value) {
			obj.setGlobalSerialIdentifier(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductIdentification";
				definition = "Information used to identify a product.";
				associationDomain_lazy = () -> Arrays.asList(Product.mmProductIdentification);
				derivationElement_lazy = () -> Arrays.asList(ProductIdentifier2Choice.mmStructuredProductIdentifier, ProductIdentifier2Choice.mmOtherProductIdentifier);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProductIdentification.mmIdentifier, com.tools20022.repository.entity.ProductIdentification.mmProduct,
						com.tools20022.repository.entity.ProductIdentification.mmType, com.tools20022.repository.entity.ProductIdentification.mmGlobalSerialIdentifier);
				derivationComponent_lazy = () -> Arrays.asList(ProductIdentifier2.mmObject(), ProductIdentifier2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProductIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentifier() {
		return identifier;
	}

	public ProductIdentification setIdentifier(Max35Text identifier) {
		this.identifier = Objects.requireNonNull(identifier);
		return this;
	}

	public Optional<Product> getProduct() {
		return product == null ? Optional.empty() : Optional.of(product);
	}

	public ProductIdentification setProduct(Product product) {
		this.product = product;
		return this;
	}

	public ProductIdentifierCode getType() {
		return type;
	}

	public ProductIdentification setType(ProductIdentifierCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Max35Text getGlobalSerialIdentifier() {
		return globalSerialIdentifier;
	}

	public ProductIdentification setGlobalSerialIdentifier(Max35Text globalSerialIdentifier) {
		this.globalSerialIdentifier = Objects.requireNonNull(globalSerialIdentifier);
		return this;
	}
}