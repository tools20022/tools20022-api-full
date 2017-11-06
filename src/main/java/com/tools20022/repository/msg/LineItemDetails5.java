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
import com.tools20022.repository.choice.ProductCategory1Choice;
import com.tools20022.repository.choice.ProductCharacteristics1Choice;
import com.tools20022.repository.choice.ProductIdentifier2Choice;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.LineItem;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItemDetails5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the current situation of a line item as a result of the submission of a commercial dataset."
 * </li>
 * </ul>
 */
public class LineItemDetails5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text lineItemIdentification;
	/**
	 * Sequential number assigned to a line item.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential number assigned to a line item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineItemIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LineItem.mmIdentification;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Sequential number assigned to a line item.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text productName;
	/**
	 * Name of the product detailed in the corresponding line item.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the product detailed in the corresponding line item."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmName;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductName";
			definition = "Name of the product detailed in the corresponding line item.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected List<ProductIdentifier2Choice> productIdentifier;
	/**
	 * Identifies the product of the corresponding line item.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the product of the corresponding line item."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductIdentifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmProductIdentification;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentifier";
			definition = "Identifies the product of the corresponding line item.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductIdentifier2Choice.mmObject();
		}
	};
	protected List<ProductCharacteristics1Choice> productCharacteristics;
	/**
	 * Identifies the characteristic of a product.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCharacteristics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the characteristic of a product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductCharacteristics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmCharacteristics;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristic of a product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCharacteristics1Choice.mmObject();
		}
	};
	protected List<ProductCategory1Choice> productCategory;
	/**
	 * Identifies the category of product.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the category of product."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProductCategory = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmProductCategory;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Identifies the category of product.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProductCategory1Choice.mmObject();
		}
	};
	protected Quantity2 orderedQuantity;
	/**
	 * Quantity ordered for a line as indicated in the baseline.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity ordered for a line as indicated in the baseline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrderedQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.mmQuantity;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrdrdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity ordered for a line as indicated in the baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Quantity2.mmObject();
		}
	};
	protected Quantity2 acceptedQuantity;
	/**
	 * Quantity accepted by data set submission.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity accepted by data set submission."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "AccptdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedQuantity";
			definition = "Quantity accepted by data set submission.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Quantity2.mmObject();
		}
	};
	protected Quantity2 outstandingQuantity;
	/**
	 * Difference between the ordered quantity and the accepted one.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference between the ordered quantity and the accepted one."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOutstandingQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OutsdngQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingQuantity";
			definition = "Difference between the ordered quantity and the accepted one.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Quantity2.mmObject();
		}
	};
	protected Quantity2 pendingQuantity;
	/**
	 * Quantity of a product for which a mismatched data set has been submitted
	 * and has not yet been accepted or rejected..
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of a product for which a mismatched data set has been submitted and has not yet been accepted or rejected.."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPendingQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdgQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingQuantity";
			definition = "Quantity of a product for which a mismatched data set has been submitted and has not yet been accepted or rejected..";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Quantity2.mmObject();
		}
	};
	protected PercentageTolerance1 quantityTolerance;
	/**
	 * Variance allowed on the quantity of goods.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed on the quantity of goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityTolerance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.mmQuantityTolerance;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "QtyTlrnce";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed on the quantity of goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PercentageTolerance1.mmObject();
		}
	};
	protected CurrencyAndAmount orderedAmount;
	/**
	 * Price multiplied by the ordered quantity for a line as indicated in the
	 * baseline.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price multiplied by the ordered quantity for a line as indicated in the baseline."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.mmTotalAmount;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OrdrdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedAmount";
			definition = "Price multiplied by the ordered quantity for a line as indicated in the baseline.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount acceptedAmount;
	/**
	 * Price multiplied by the accepted quantity for a line.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the accepted quantity for a line."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "AccptdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Price multiplied by the accepted quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount outstandingAmount;
	/**
	 * Price multiplied by the outstanding quantity for a line.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutstandingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the outstanding quantity for a line."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOutstandingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "OutsdngAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingAmount";
			definition = "Price multiplied by the outstanding quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyAndAmount pendingAmount;
	/**
	 * Price multiplied by the pending quantity for a line.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price multiplied by the pending quantity for a line."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPendingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PdgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingAmount";
			definition = "Price multiplied by the pending quantity for a line.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageTolerance1 priceTolerance;
	/**
	 * Variance on price for the goods.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceTolerance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Price.mmPriceTolerance;
			componentContext_lazy = () -> LineItemDetails5.mmObject();
			isDerived = false;
			xmlTag = "PricTlrnce";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTolerance";
			definition = "Variance on price for the goods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PercentageTolerance1.mmObject();
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LineItemDetails5";
				definition = "Calculation of the current situation of a line item as a result of the submission of a commercial dataset.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getLineItemIdentification() {
		return lineItemIdentification;
	}

	public void setLineItemIdentification(Max35Text lineItemIdentification) {
		this.lineItemIdentification = lineItemIdentification;
	}

	public Max70Text getProductName() {
		return productName;
	}

	public void setProductName(Max70Text productName) {
		this.productName = productName;
	}

	public List<ProductIdentifier2Choice> getProductIdentifier() {
		return productIdentifier;
	}

	public void setProductIdentifier(List<ProductIdentifier2Choice> productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	public List<ProductCharacteristics1Choice> getProductCharacteristics() {
		return productCharacteristics;
	}

	public void setProductCharacteristics(List<ProductCharacteristics1Choice> productCharacteristics) {
		this.productCharacteristics = productCharacteristics;
	}

	public List<ProductCategory1Choice> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<ProductCategory1Choice> productCategory) {
		this.productCategory = productCategory;
	}

	public Quantity2 getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(com.tools20022.repository.msg.Quantity2 orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public Quantity2 getAcceptedQuantity() {
		return acceptedQuantity;
	}

	public void setAcceptedQuantity(com.tools20022.repository.msg.Quantity2 acceptedQuantity) {
		this.acceptedQuantity = acceptedQuantity;
	}

	public Quantity2 getOutstandingQuantity() {
		return outstandingQuantity;
	}

	public void setOutstandingQuantity(com.tools20022.repository.msg.Quantity2 outstandingQuantity) {
		this.outstandingQuantity = outstandingQuantity;
	}

	public Quantity2 getPendingQuantity() {
		return pendingQuantity;
	}

	public void setPendingQuantity(com.tools20022.repository.msg.Quantity2 pendingQuantity) {
		this.pendingQuantity = pendingQuantity;
	}

	public PercentageTolerance1 getQuantityTolerance() {
		return quantityTolerance;
	}

	public void setQuantityTolerance(com.tools20022.repository.msg.PercentageTolerance1 quantityTolerance) {
		this.quantityTolerance = quantityTolerance;
	}

	public CurrencyAndAmount getOrderedAmount() {
		return orderedAmount;
	}

	public void setOrderedAmount(CurrencyAndAmount orderedAmount) {
		this.orderedAmount = orderedAmount;
	}

	public CurrencyAndAmount getAcceptedAmount() {
		return acceptedAmount;
	}

	public void setAcceptedAmount(CurrencyAndAmount acceptedAmount) {
		this.acceptedAmount = acceptedAmount;
	}

	public CurrencyAndAmount getOutstandingAmount() {
		return outstandingAmount;
	}

	public void setOutstandingAmount(CurrencyAndAmount outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	public CurrencyAndAmount getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(CurrencyAndAmount pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public PercentageTolerance1 getPriceTolerance() {
		return priceTolerance;
	}

	public void setPriceTolerance(com.tools20022.repository.msg.PercentageTolerance1 priceTolerance) {
		this.priceTolerance = priceTolerance;
	}
}