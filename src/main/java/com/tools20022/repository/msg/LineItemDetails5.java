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
import com.tools20022.repository.choice.ProductCharacteristics1Choice;
import com.tools20022.repository.choice.ProductIdentifier2Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PercentageTolerance1;
import com.tools20022.repository.msg.Quantity2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Calculation of the current situation of a line item as a result of the
 * submission of a commercial dataset.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmLineItemIdentification
 * LineItemDetails5.mmLineItemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductName
 * LineItemDetails5.mmProductName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductIdentifier
 * LineItemDetails5.mmProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCharacteristics
 * LineItemDetails5.mmProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmProductCategory
 * LineItemDetails5.mmProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOrderedQuantity
 * LineItemDetails5.mmOrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmAcceptedQuantity
 * LineItemDetails5.mmAcceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOutstandingQuantity
 * LineItemDetails5.mmOutstandingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmPendingQuantity
 * LineItemDetails5.mmPendingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmQuantityTolerance
 * LineItemDetails5.mmQuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOrderedAmount
 * LineItemDetails5.mmOrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmAcceptedAmount
 * LineItemDetails5.mmAcceptedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmOutstandingAmount
 * LineItemDetails5.mmOutstandingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmPendingAmount
 * LineItemDetails5.mmPendingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmPriceTolerance
 * LineItemDetails5.mmPriceTolerance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItemDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the current situation of a line item as a result of the submission of a commercial dataset."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItemDetails5", propOrder = {"lineItemIdentification", "productName", "productIdentifier", "productCharacteristics", "productCategory", "orderedQuantity", "acceptedQuantity", "outstandingQuantity", "pendingQuantity",
		"quantityTolerance", "orderedAmount", "acceptedAmount", "outstandingAmount", "pendingAmount", "priceTolerance"})
public class LineItemDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LineItmId", required = true)
	protected Max35Text lineItemIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmIdentification
	 * LineItem.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number assigned to a line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, Max35Text> mmLineItemIdentification = new MMMessageAttribute<LineItemDetails5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> LineItem.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Sequential number assigned to a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(LineItemDetails5 obj) {
			return obj.getLineItemIdentification();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Max35Text value) {
			obj.setLineItemIdentification(value);
		}
	};
	@XmlElement(name = "PdctNm")
	protected Max70Text productName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmName
	 * Product.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the product detailed in the corresponding line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, Optional<Max70Text>> mmProductName = new MMMessageAttribute<LineItemDetails5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> Product.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductName";
			definition = "Name of the product detailed in the corresponding line item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(LineItemDetails5 obj) {
			return obj.getProductName();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Optional<Max70Text> value) {
			obj.setProductName(value.orElse(null));
		}
	};
	@XmlElement(name = "PdctIdr")
	protected List<ProductIdentifier2Choice> productIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product of the corresponding line item."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, List<ProductIdentifier2Choice>> mmProductIdentifier = new MMMessageAssociationEnd<LineItemDetails5, List<ProductIdentifier2Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentifier";
			definition = "Identifies the product of the corresponding line item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductIdentifier2Choice.mmObject();
		}

		@Override
		public List<ProductIdentifier2Choice> getValue(LineItemDetails5 obj) {
			return obj.getProductIdentifier();
		}

		@Override
		public void setValue(LineItemDetails5 obj, List<ProductIdentifier2Choice> value) {
			obj.setProductIdentifier(value);
		}
	};
	@XmlElement(name = "PdctChrtcs")
	protected List<ProductCharacteristics1Choice> productCharacteristics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProductCharacteristics1Choice
	 * ProductCharacteristics1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmCharacteristics
	 * Product.mmCharacteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, List<ProductCharacteristics1Choice>> mmProductCharacteristics = new MMMessageAssociationEnd<LineItemDetails5, List<ProductCharacteristics1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmCharacteristics;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristic of a product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCharacteristics1Choice.mmObject();
		}

		@Override
		public List<ProductCharacteristics1Choice> getValue(LineItemDetails5 obj) {
			return obj.getProductCharacteristics();
		}

		@Override
		public void setValue(LineItemDetails5 obj, List<ProductCharacteristics1Choice> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctCtgy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the category of product."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, List<ProductCategory1Choice>> mmProductCategory = new MMMessageAssociationEnd<LineItemDetails5, List<ProductCategory1Choice>>() {
		{
			businessElementTrace_lazy = () -> Product.mmProductCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Identifies the category of product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCategory1Choice.mmObject();
		}

		@Override
		public List<ProductCategory1Choice> getValue(LineItemDetails5 obj) {
			return obj.getProductCategory();
		}

		@Override
		public void setValue(LineItemDetails5 obj, List<ProductCategory1Choice> value) {
			obj.setProductCategory(value);
		}
	};
	@XmlElement(name = "OrdrdQty", required = true)
	protected Quantity2 orderedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity2 Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmQuantity
	 * Product.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity ordered for a line as indicated in the baseline."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Quantity2> mmOrderedQuantity = new MMMessageAssociationEnd<LineItemDetails5, Quantity2>() {
		{
			businessElementTrace_lazy = () -> Product.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrdrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity ordered for a line as indicated in the baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity2.mmObject();
		}

		@Override
		public Quantity2 getValue(LineItemDetails5 obj) {
			return obj.getOrderedQuantity();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Quantity2 value) {
			obj.setOrderedQuantity(value);
		}
	};
	@XmlElement(name = "AccptdQty", required = true)
	protected Quantity2 acceptedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity2 Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity accepted by data set submission."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Quantity2> mmAcceptedQuantity = new MMMessageAssociationEnd<LineItemDetails5, Quantity2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "AccptdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedQuantity";
			definition = "Quantity accepted by data set submission.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity2.mmObject();
		}

		@Override
		public Quantity2 getValue(LineItemDetails5 obj) {
			return obj.getAcceptedQuantity();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Quantity2 value) {
			obj.setAcceptedQuantity(value);
		}
	};
	@XmlElement(name = "OutsdngQty", required = true)
	protected Quantity2 outstandingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity2 Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the ordered quantity and the accepted one."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Quantity2> mmOutstandingQuantity = new MMMessageAssociationEnd<LineItemDetails5, Quantity2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OutsdngQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingQuantity";
			definition = "Difference between the ordered quantity and the accepted one.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity2.mmObject();
		}

		@Override
		public Quantity2 getValue(LineItemDetails5 obj) {
			return obj.getOutstandingQuantity();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Quantity2 value) {
			obj.setOutstandingQuantity(value);
		}
	};
	@XmlElement(name = "PdgQty", required = true)
	protected Quantity2 pendingQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity2 Quantity2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product for which a mismatched data set has been submitted and has not yet been accepted or rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Quantity2> mmPendingQuantity = new MMMessageAssociationEnd<LineItemDetails5, Quantity2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdgQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingQuantity";
			definition = "Quantity of a product for which a mismatched data set has been submitted and has not yet been accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity2.mmObject();
		}

		@Override
		public Quantity2 getValue(LineItemDetails5 obj) {
			return obj.getPendingQuantity();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Quantity2 value) {
			obj.setPendingQuantity(value);
		}
	};
	@XmlElement(name = "QtyTlrnce")
	protected PercentageTolerance1 quantityTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentageTolerance1
	 * PercentageTolerance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#mmQuantityTolerance
	 * ProductQuantity.mmQuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyTlrnce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed on the quantity of goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Optional<PercentageTolerance1>> mmQuantityTolerance = new MMMessageAssociationEnd<LineItemDetails5, Optional<PercentageTolerance1>>() {
		{
			businessElementTrace_lazy = () -> ProductQuantity.mmQuantityTolerance;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "QtyTlrnce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed on the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PercentageTolerance1.mmObject();
		}

		@Override
		public Optional<PercentageTolerance1> getValue(LineItemDetails5 obj) {
			return obj.getQuantityTolerance();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Optional<PercentageTolerance1> value) {
			obj.setQuantityTolerance(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrdAmt", required = true)
	protected CurrencyAndAmount orderedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#mmTotalAmount
	 * PurchaseOrder.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price multiplied by the ordered quantity for a line as indicated in the baseline."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, CurrencyAndAmount> mmOrderedAmount = new MMMessageAttribute<LineItemDetails5, CurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> PurchaseOrder.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrdrdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedAmount";
			definition = "Price multiplied by the ordered quantity for a line as indicated in the baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItemDetails5 obj) {
			return obj.getOrderedAmount();
		}

		@Override
		public void setValue(LineItemDetails5 obj, CurrencyAndAmount value) {
			obj.setOrderedAmount(value);
		}
	};
	@XmlElement(name = "AccptdAmt", required = true)
	protected CurrencyAndAmount acceptedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the accepted quantity for a line."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, CurrencyAndAmount> mmAcceptedAmount = new MMMessageAttribute<LineItemDetails5, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "AccptdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Price multiplied by the accepted quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItemDetails5 obj) {
			return obj.getAcceptedAmount();
		}

		@Override
		public void setValue(LineItemDetails5 obj, CurrencyAndAmount value) {
			obj.setAcceptedAmount(value);
		}
	};
	@XmlElement(name = "OutsdngAmt", required = true)
	protected CurrencyAndAmount outstandingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutsdngAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the outstanding quantity for a line."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, CurrencyAndAmount> mmOutstandingAmount = new MMMessageAttribute<LineItemDetails5, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OutsdngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingAmount";
			definition = "Price multiplied by the outstanding quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItemDetails5 obj) {
			return obj.getOutstandingAmount();
		}

		@Override
		public void setValue(LineItemDetails5 obj, CurrencyAndAmount value) {
			obj.setOutstandingAmount(value);
		}
	};
	@XmlElement(name = "PdgAmt", required = true)
	protected CurrencyAndAmount pendingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the pending quantity for a line."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemDetails5, CurrencyAndAmount> mmPendingAmount = new MMMessageAttribute<LineItemDetails5, CurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingAmount";
			definition = "Price multiplied by the pending quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(LineItemDetails5 obj) {
			return obj.getPendingAmount();
		}

		@Override
		public void setValue(LineItemDetails5 obj, CurrencyAndAmount value) {
			obj.setPendingAmount(value);
		}
	};
	@XmlElement(name = "PricTlrnce")
	protected PercentageTolerance1 priceTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentageTolerance1
	 * PercentageTolerance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
	 * Price.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5
	 * LineItemDetails5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTlrnce"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LineItemDetails5, Optional<PercentageTolerance1>> mmPriceTolerance = new MMMessageAssociationEnd<LineItemDetails5, Optional<PercentageTolerance1>>() {
		{
			businessElementTrace_lazy = () -> Price.mmPriceTolerance;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PricTlrnce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTolerance";
			definition = "Variance on price for the goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PercentageTolerance1.mmObject();
		}

		@Override
		public Optional<PercentageTolerance1> getValue(LineItemDetails5 obj) {
			return obj.getPriceTolerance();
		}

		@Override
		public void setValue(LineItemDetails5 obj, Optional<PercentageTolerance1> value) {
			obj.setPriceTolerance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails5.mmLineItemIdentification, com.tools20022.repository.msg.LineItemDetails5.mmProductName,
						com.tools20022.repository.msg.LineItemDetails5.mmProductIdentifier, com.tools20022.repository.msg.LineItemDetails5.mmProductCharacteristics, com.tools20022.repository.msg.LineItemDetails5.mmProductCategory,
						com.tools20022.repository.msg.LineItemDetails5.mmOrderedQuantity, com.tools20022.repository.msg.LineItemDetails5.mmAcceptedQuantity, com.tools20022.repository.msg.LineItemDetails5.mmOutstandingQuantity,
						com.tools20022.repository.msg.LineItemDetails5.mmPendingQuantity, com.tools20022.repository.msg.LineItemDetails5.mmQuantityTolerance, com.tools20022.repository.msg.LineItemDetails5.mmOrderedAmount,
						com.tools20022.repository.msg.LineItemDetails5.mmAcceptedAmount, com.tools20022.repository.msg.LineItemDetails5.mmOutstandingAmount, com.tools20022.repository.msg.LineItemDetails5.mmPendingAmount,
						com.tools20022.repository.msg.LineItemDetails5.mmPriceTolerance);
				trace_lazy = () -> LineItem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LineItemDetails5";
				definition = "Calculation of the current situation of a line item as a result of the submission of a commercial dataset.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLineItemIdentification() {
		return lineItemIdentification;
	}

	public LineItemDetails5 setLineItemIdentification(Max35Text lineItemIdentification) {
		this.lineItemIdentification = Objects.requireNonNull(lineItemIdentification);
		return this;
	}

	public Optional<Max70Text> getProductName() {
		return productName == null ? Optional.empty() : Optional.of(productName);
	}

	public LineItemDetails5 setProductName(Max70Text productName) {
		this.productName = productName;
		return this;
	}

	public List<ProductIdentifier2Choice> getProductIdentifier() {
		return productIdentifier == null ? productIdentifier = new ArrayList<>() : productIdentifier;
	}

	public LineItemDetails5 setProductIdentifier(List<ProductIdentifier2Choice> productIdentifier) {
		this.productIdentifier = Objects.requireNonNull(productIdentifier);
		return this;
	}

	public List<ProductCharacteristics1Choice> getProductCharacteristics() {
		return productCharacteristics == null ? productCharacteristics = new ArrayList<>() : productCharacteristics;
	}

	public LineItemDetails5 setProductCharacteristics(List<ProductCharacteristics1Choice> productCharacteristics) {
		this.productCharacteristics = Objects.requireNonNull(productCharacteristics);
		return this;
	}

	public List<ProductCategory1Choice> getProductCategory() {
		return productCategory == null ? productCategory = new ArrayList<>() : productCategory;
	}

	public LineItemDetails5 setProductCategory(List<ProductCategory1Choice> productCategory) {
		this.productCategory = Objects.requireNonNull(productCategory);
		return this;
	}

	public Quantity2 getOrderedQuantity() {
		return orderedQuantity;
	}

	public LineItemDetails5 setOrderedQuantity(Quantity2 orderedQuantity) {
		this.orderedQuantity = Objects.requireNonNull(orderedQuantity);
		return this;
	}

	public Quantity2 getAcceptedQuantity() {
		return acceptedQuantity;
	}

	public LineItemDetails5 setAcceptedQuantity(Quantity2 acceptedQuantity) {
		this.acceptedQuantity = Objects.requireNonNull(acceptedQuantity);
		return this;
	}

	public Quantity2 getOutstandingQuantity() {
		return outstandingQuantity;
	}

	public LineItemDetails5 setOutstandingQuantity(Quantity2 outstandingQuantity) {
		this.outstandingQuantity = Objects.requireNonNull(outstandingQuantity);
		return this;
	}

	public Quantity2 getPendingQuantity() {
		return pendingQuantity;
	}

	public LineItemDetails5 setPendingQuantity(Quantity2 pendingQuantity) {
		this.pendingQuantity = Objects.requireNonNull(pendingQuantity);
		return this;
	}

	public Optional<PercentageTolerance1> getQuantityTolerance() {
		return quantityTolerance == null ? Optional.empty() : Optional.of(quantityTolerance);
	}

	public LineItemDetails5 setQuantityTolerance(PercentageTolerance1 quantityTolerance) {
		this.quantityTolerance = quantityTolerance;
		return this;
	}

	public CurrencyAndAmount getOrderedAmount() {
		return orderedAmount;
	}

	public LineItemDetails5 setOrderedAmount(CurrencyAndAmount orderedAmount) {
		this.orderedAmount = Objects.requireNonNull(orderedAmount);
		return this;
	}

	public CurrencyAndAmount getAcceptedAmount() {
		return acceptedAmount;
	}

	public LineItemDetails5 setAcceptedAmount(CurrencyAndAmount acceptedAmount) {
		this.acceptedAmount = Objects.requireNonNull(acceptedAmount);
		return this;
	}

	public CurrencyAndAmount getOutstandingAmount() {
		return outstandingAmount;
	}

	public LineItemDetails5 setOutstandingAmount(CurrencyAndAmount outstandingAmount) {
		this.outstandingAmount = Objects.requireNonNull(outstandingAmount);
		return this;
	}

	public CurrencyAndAmount getPendingAmount() {
		return pendingAmount;
	}

	public LineItemDetails5 setPendingAmount(CurrencyAndAmount pendingAmount) {
		this.pendingAmount = Objects.requireNonNull(pendingAmount);
		return this;
	}

	public Optional<PercentageTolerance1> getPriceTolerance() {
		return priceTolerance == null ? Optional.empty() : Optional.of(priceTolerance);
	}

	public LineItemDetails5 setPriceTolerance(PercentageTolerance1 priceTolerance) {
		this.priceTolerance = priceTolerance;
		return this;
	}
}