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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.ProductCategory;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification4;
import com.tools20022.repository.msg.ProductCategory1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies that the category of a product may be indicated by a code or by
 * free text.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice#mmStructuredProductCategory
 * ProductCategory1Choice.mmStructuredProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice#mmOtherProductCategory
 * ProductCategory1Choice.mmOtherProductCategory}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ProductCategory
 * ProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProductCategory1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies that the category of a product may be indicated by a code or by free text."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ProductCategory1Choice", propOrder = {"structuredProductCategory", "otherProductCategory"})
public class ProductCategory1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StrdPdctCtgy", required = true)
	protected ProductCategory1 structuredProductCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProductCategory1
	 * ProductCategory1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice
	 * ProductCategory1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrdPdctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StructuredProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of product category."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductCategory1Choice, ProductCategory1> mmStructuredProductCategory = new MMMessageAssociationEnd<ProductCategory1Choice, ProductCategory1>() {
		{
			businessComponentTrace_lazy = () -> ProductCategory.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductCategory1Choice.mmObject();
			isDerived = false;
			xmlTag = "StrdPdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StructuredProductCategory";
			definition = "Specifies the type of product category.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProductCategory1.mmObject();
		}

		@Override
		public ProductCategory1 getValue(ProductCategory1Choice obj) {
			return obj.getStructuredProductCategory();
		}

		@Override
		public void setValue(ProductCategory1Choice obj, ProductCategory1 value) {
			obj.setStructuredProductCategory(value);
		}
	};
	@XmlElement(name = "OthrPdctCtgy", required = true)
	protected GenericIdentification4 otherProductCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification4
	 * GenericIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductCategory
	 * ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice
	 * ProductCategory1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPdctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of product category not present in the code list."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ProductCategory1Choice, GenericIdentification4> mmOtherProductCategory = new MMMessageAssociationEnd<ProductCategory1Choice, GenericIdentification4>() {
		{
			businessComponentTrace_lazy = () -> ProductCategory.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ProductCategory1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrPdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherProductCategory";
			definition = "Specifies the type of product category not present in the code list.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification4.mmObject();
		}

		@Override
		public GenericIdentification4 getValue(ProductCategory1Choice obj) {
			return obj.getOtherProductCategory();
		}

		@Override
		public void setValue(ProductCategory1Choice obj, GenericIdentification4 value) {
			obj.setOtherProductCategory(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ProductCategory1Choice.mmStructuredProductCategory, com.tools20022.repository.choice.ProductCategory1Choice.mmOtherProductCategory);
				trace_lazy = () -> ProductCategory.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProductCategory1Choice";
				definition = "Specifies that the category of a product may be indicated by a code or by free text.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProductCategory1 getStructuredProductCategory() {
		return structuredProductCategory;
	}

	public ProductCategory1Choice setStructuredProductCategory(ProductCategory1 structuredProductCategory) {
		this.structuredProductCategory = Objects.requireNonNull(structuredProductCategory);
		return this;
	}

	public GenericIdentification4 getOtherProductCategory() {
		return otherProductCategory;
	}

	public ProductCategory1Choice setOtherProductCategory(GenericIdentification4 otherProductCategory) {
		this.otherProductCategory = Objects.requireNonNull(otherProductCategory);
		return this;
	}
}