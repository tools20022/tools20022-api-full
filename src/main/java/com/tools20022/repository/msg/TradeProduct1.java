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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ProductCategory1Choice;
import com.tools20022.repository.choice.ProductIdentifier2Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Product;
import com.tools20022.repository.entity.ProductIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Tangible output or service produced by human or mechanical effort, or by a
 * natural process for purposes of specifying a product.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#mmIdentification
 * TradeProduct1.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#mmName
 * TradeProduct1.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct1#mmDescription
 * TradeProduct1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmCountryOfOrigin
 * TradeProduct1.mmCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCharacteristics
 * TradeProduct1.mmProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCategory
 * TradeProduct1.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmGlobalSerialIdentifier
 * TradeProduct1.mmGlobalSerialIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
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
 * "TradeProduct1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Tangible output or service produced by human or mechanical effort, or by a natural process for purposes of specifying a product."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeProduct1", propOrder = {"identification", "name", "description", "countryOfOrigin", "productCharacteristics", "productCategory", "globalSerialIdentifier"})
public class TradeProduct1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected List<ProductIdentifier2Choice> identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProductIdentifier2Choice
	 * ProductIdentifier2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductIdentification
	 * Product.mmProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmIdentification
	 * TradeProduct2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmIdentification);
			minOccurs = 0;
			complexType_lazy = () -> ProductIdentifier2Choice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmName
	 * Product.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmName
	 * TradeProduct2.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Desc")
	protected Max140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmDescription
	 * Product.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmDescription
	 * TradeProduct2.mmDescription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmDescription);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "CtryOfOrgn")
	protected List<com.tools20022.repository.msg.CountryCodeAndName1> countryOfOrigin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CountryCodeAndName1
	 * CountryCodeAndName1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmOrigin
	 * Product.mmOrigin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfOrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of origin of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmCountryOfOrigin
	 * TradeProduct2.mmCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryOfOrigin = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmOrigin;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOrigin";
			definition = "Country of origin of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmCountryOfOrigin);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CountryCodeAndName1.mmObject();
		}
	};
	@XmlElement(name = "PdctChrtcs")
	protected List<com.tools20022.repository.msg.ProductCharacteristics2> productCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics2
	 * ProductCharacteristics2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
	 * Product.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctChrtcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the characteristic of a product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCharacteristics
	 * TradeProduct2.mmProductCharacteristics}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristic of a product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmProductCharacteristics);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProductCharacteristics2.mmObject();
		}
	};
	@XmlElement(name = "PdctCtgy")
	protected List<ProductCategory1Choice> productCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProductCategory1Choice
	 * ProductCategory1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmProductCategory
	 * Product.mmProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the product."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCategory
	 * TradeProduct2.mmProductCategory}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmProductCategory);
			minOccurs = 0;
			complexType_lazy = () -> ProductCategory1Choice.mmObject();
		}
	};
	@XmlElement(name = "GblSrlIdr")
	protected List<Max35Text> globalSerialIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductIdentification#mmIdentifier
	 * ProductIdentification.mmIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1 TradeProduct1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblSrlIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalSerialIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique global serial identifier for this product instance."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmGlobalSerialIdentifier
	 * TradeProduct2.mmGlobalSerialIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGlobalSerialIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ProductIdentification.mmIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct1.mmObject();
			isDerived = false;
			xmlTag = "GblSrlIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalSerialIdentifier";
			definition = "Unique global serial identifier for this product instance.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmGlobalSerialIdentifier);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct1.mmIdentification, com.tools20022.repository.msg.TradeProduct1.mmName, com.tools20022.repository.msg.TradeProduct1.mmDescription,
						com.tools20022.repository.msg.TradeProduct1.mmCountryOfOrigin, com.tools20022.repository.msg.TradeProduct1.mmProductCharacteristics, com.tools20022.repository.msg.TradeProduct1.mmProductCategory,
						com.tools20022.repository.msg.TradeProduct1.mmGlobalSerialIdentifier);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeProduct1";
				definition = "Tangible output or service produced by human or mechanical effort, or by a natural process for purposes of specifying a product.";
				nextVersions_lazy = () -> Arrays.asList(TradeProduct2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProductIdentifier2Choice> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public TradeProduct1 setIdentification(List<ProductIdentifier2Choice> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public TradeProduct1 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public TradeProduct1 setDescription(Max140Text description) {
		this.description = description;
		return this;
	}

	public List<CountryCodeAndName1> getCountryOfOrigin() {
		return countryOfOrigin == null ? countryOfOrigin = new ArrayList<>() : countryOfOrigin;
	}

	public TradeProduct1 setCountryOfOrigin(List<com.tools20022.repository.msg.CountryCodeAndName1> countryOfOrigin) {
		this.countryOfOrigin = Objects.requireNonNull(countryOfOrigin);
		return this;
	}

	public List<ProductCharacteristics2> getProductCharacteristics() {
		return productCharacteristics == null ? productCharacteristics = new ArrayList<>() : productCharacteristics;
	}

	public TradeProduct1 setProductCharacteristics(List<com.tools20022.repository.msg.ProductCharacteristics2> productCharacteristics) {
		this.productCharacteristics = Objects.requireNonNull(productCharacteristics);
		return this;
	}

	public List<ProductCategory1Choice> getProductCategory() {
		return productCategory == null ? productCategory = new ArrayList<>() : productCategory;
	}

	public TradeProduct1 setProductCategory(List<ProductCategory1Choice> productCategory) {
		this.productCategory = Objects.requireNonNull(productCategory);
		return this;
	}

	public List<Max35Text> getGlobalSerialIdentifier() {
		return globalSerialIdentifier == null ? globalSerialIdentifier = new ArrayList<>() : globalSerialIdentifier;
	}

	public TradeProduct1 setGlobalSerialIdentifier(List<Max35Text> globalSerialIdentifier) {
		this.globalSerialIdentifier = Objects.requireNonNull(globalSerialIdentifier);
		return this;
	}
}