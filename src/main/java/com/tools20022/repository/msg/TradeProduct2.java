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
import com.tools20022.repository.msg.CountryCodeAndName1;
import com.tools20022.repository.msg.ProductCharacteristics3;
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
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmIdentification
 * TradeProduct2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmName
 * TradeProduct2.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct2#mmDescription
 * TradeProduct2.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmCountryOfOrigin
 * TradeProduct2.mmCountryOfOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCharacteristics
 * TradeProduct2.mmProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmProductCategory
 * TradeProduct2.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeProduct2#mmGlobalSerialIdentifier
 * TradeProduct2.mmGlobalSerialIdentifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeProduct2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Tangible output or service produced by human or mechanical effort, or by a natural process for purposes of specifying a product."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct3 TradeProduct3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TradeProduct1
 * TradeProduct1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeProduct2", propOrder = {"identification", "name", "description", "countryOfOrigin", "productCharacteristics", "productCategory", "globalSerialIdentifier"})
public class TradeProduct2 {

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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmIdentification
	 * TradeProduct3.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmIdentification
	 * TradeProduct1.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, List<ProductIdentifier2Choice>> mmIdentification = new MMMessageAttribute<TradeProduct2, List<ProductIdentifier2Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmIdentification);
			previousVersion_lazy = () -> TradeProduct1.mmIdentification;
			minOccurs = 0;
			complexType_lazy = () -> ProductIdentifier2Choice.mmObject();
		}

		@Override
		public List<ProductIdentifier2Choice> getValue(TradeProduct2 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(TradeProduct2 obj, List<ProductIdentifier2Choice> value) {
			obj.setIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeProduct3#mmName
	 * TradeProduct3.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmName
	 * TradeProduct1.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, Optional<Max35Text>> mmName = new MMMessageAttribute<TradeProduct2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of a product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmName);
			previousVersion_lazy = () -> TradeProduct1.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeProduct2 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(TradeProduct2 obj, Optional<Max35Text> value) {
			obj.setName(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the goods and/or services of a trade transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmDescription
	 * TradeProduct3.mmDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmDescription
	 * TradeProduct1.mmDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, Optional<Max140Text>> mmDescription = new MMMessageAttribute<TradeProduct2, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Information about the goods and/or services of a trade transaction.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmDescription);
			previousVersion_lazy = () -> TradeProduct1.mmDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(TradeProduct2 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(TradeProduct2 obj, Optional<Max140Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfOrgn")
	protected List<CountryCodeAndName1> countryOfOrigin;
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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfOrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of origin of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmCountryOfOrigin
	 * TradeProduct3.mmCountryOfOrigin}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmCountryOfOrigin
	 * TradeProduct1.mmCountryOfOrigin}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, List<CountryCodeAndName1>> mmCountryOfOrigin = new MMMessageAttribute<TradeProduct2, List<CountryCodeAndName1>>() {
		{
			businessElementTrace_lazy = () -> Product.mmOrigin;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfOrigin";
			definition = "Country of origin of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmCountryOfOrigin);
			previousVersion_lazy = () -> TradeProduct1.mmCountryOfOrigin;
			minOccurs = 0;
			complexType_lazy = () -> CountryCodeAndName1.mmObject();
		}

		@Override
		public List<CountryCodeAndName1> getValue(TradeProduct2 obj) {
			return obj.getCountryOfOrigin();
		}

		@Override
		public void setValue(TradeProduct2 obj, List<CountryCodeAndName1> value) {
			obj.setCountryOfOrigin(value);
		}
	};
	@XmlElement(name = "PdctChrtcs")
	protected List<ProductCharacteristics3> productCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProductCharacteristics3
	 * ProductCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
	 * Product.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctChrtcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the characteristic of a product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmProductCharacteristics
	 * TradeProduct3.mmProductCharacteristics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCharacteristics
	 * TradeProduct1.mmProductCharacteristics}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeProduct2, List<ProductCharacteristics3>> mmProductCharacteristics = new MMMessageAssociationEnd<TradeProduct2, List<ProductCharacteristics3>>() {
		{
			businessElementTrace_lazy = () -> Product.mmCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristic of a product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmProductCharacteristics);
			previousVersion_lazy = () -> TradeProduct1.mmProductCharacteristics;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCharacteristics3.mmObject();
		}

		@Override
		public List<ProductCharacteristics3> getValue(TradeProduct2 obj) {
			return obj.getProductCharacteristics();
		}

		@Override
		public void setValue(TradeProduct2 obj, List<ProductCharacteristics3> value) {
			obj.setProductCharacteristics(value);
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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmProductCategory
	 * TradeProduct3.mmProductCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmProductCategory
	 * TradeProduct1.mmProductCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, List<ProductCategory1Choice>> mmProductCategory = new MMMessageAttribute<TradeProduct2, List<ProductCategory1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Category of the product.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmProductCategory);
			previousVersion_lazy = () -> TradeProduct1.mmProductCategory;
			minOccurs = 0;
			complexType_lazy = () -> ProductCategory1Choice.mmObject();
		}

		@Override
		public List<ProductCategory1Choice> getValue(TradeProduct2 obj) {
			return obj.getProductCategory();
		}

		@Override
		public void setValue(TradeProduct2 obj, List<ProductCategory1Choice> value) {
			obj.setProductCategory(value);
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
	 * {@linkplain com.tools20022.repository.msg.TradeProduct2 TradeProduct2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblSrlIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalSerialIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique global serial identifier for this product instance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeProduct3#mmGlobalSerialIdentifier
	 * TradeProduct3.mmGlobalSerialIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeProduct1#mmGlobalSerialIdentifier
	 * TradeProduct1.mmGlobalSerialIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeProduct2, List<Max35Text>> mmGlobalSerialIdentifier = new MMMessageAttribute<TradeProduct2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ProductIdentification.mmIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeProduct2.mmObject();
			isDerived = false;
			xmlTag = "GblSrlIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalSerialIdentifier";
			definition = "Unique global serial identifier for this product instance.";
			nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmGlobalSerialIdentifier);
			previousVersion_lazy = () -> TradeProduct1.mmGlobalSerialIdentifier;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(TradeProduct2 obj) {
			return obj.getGlobalSerialIdentifier();
		}

		@Override
		public void setValue(TradeProduct2 obj, List<Max35Text> value) {
			obj.setGlobalSerialIdentifier(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeProduct2.mmIdentification, com.tools20022.repository.msg.TradeProduct2.mmName, com.tools20022.repository.msg.TradeProduct2.mmDescription,
						com.tools20022.repository.msg.TradeProduct2.mmCountryOfOrigin, com.tools20022.repository.msg.TradeProduct2.mmProductCharacteristics, com.tools20022.repository.msg.TradeProduct2.mmProductCategory,
						com.tools20022.repository.msg.TradeProduct2.mmGlobalSerialIdentifier);
				trace_lazy = () -> Product.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeProduct2";
				definition = "Tangible output or service produced by human or mechanical effort, or by a natural process for purposes of specifying a product.";
				nextVersions_lazy = () -> Arrays.asList(TradeProduct3.mmObject());
				previousVersion_lazy = () -> TradeProduct1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProductIdentifier2Choice> getIdentification() {
		return identification == null ? identification = new ArrayList<>() : identification;
	}

	public TradeProduct2 setIdentification(List<ProductIdentifier2Choice> identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public TradeProduct2 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public TradeProduct2 setDescription(Max140Text description) {
		this.description = description;
		return this;
	}

	public List<CountryCodeAndName1> getCountryOfOrigin() {
		return countryOfOrigin == null ? countryOfOrigin = new ArrayList<>() : countryOfOrigin;
	}

	public TradeProduct2 setCountryOfOrigin(List<CountryCodeAndName1> countryOfOrigin) {
		this.countryOfOrigin = Objects.requireNonNull(countryOfOrigin);
		return this;
	}

	public List<ProductCharacteristics3> getProductCharacteristics() {
		return productCharacteristics == null ? productCharacteristics = new ArrayList<>() : productCharacteristics;
	}

	public TradeProduct2 setProductCharacteristics(List<ProductCharacteristics3> productCharacteristics) {
		this.productCharacteristics = Objects.requireNonNull(productCharacteristics);
		return this;
	}

	public List<ProductCategory1Choice> getProductCategory() {
		return productCategory == null ? productCategory = new ArrayList<>() : productCategory;
	}

	public TradeProduct2 setProductCategory(List<ProductCategory1Choice> productCategory) {
		this.productCategory = Objects.requireNonNull(productCategory);
		return this;
	}

	public List<Max35Text> getGlobalSerialIdentifier() {
		return globalSerialIdentifier == null ? globalSerialIdentifier = new ArrayList<>() : globalSerialIdentifier;
	}

	public TradeProduct2 setGlobalSerialIdentifier(List<Max35Text> globalSerialIdentifier) {
		this.globalSerialIdentifier = Objects.requireNonNull(globalSerialIdentifier);
		return this;
	}
}