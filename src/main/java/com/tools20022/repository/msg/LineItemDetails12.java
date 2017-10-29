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
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.LineItem;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#LineItemIdentification
 * LineItemDetails12.LineItemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductName
 * LineItemDetails12.ProductName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductIdentifier
 * LineItemDetails12.ProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductCharacteristics
 * LineItemDetails12.ProductCharacteristics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#ProductCategory
 * LineItemDetails12.ProductCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OrderedQuantity
 * LineItemDetails12.OrderedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#AcceptedQuantity
 * LineItemDetails12.AcceptedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OutstandingQuantity
 * LineItemDetails12.OutstandingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#PendingQuantity
 * LineItemDetails12.PendingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#QuantityTolerance
 * LineItemDetails12.QuantityTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OrderedAmount
 * LineItemDetails12.OrderedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#AcceptedAmount
 * LineItemDetails12.AcceptedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#OutstandingAmount
 * LineItemDetails12.OutstandingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#PendingAmount
 * LineItemDetails12.PendingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#PriceTolerance
 * LineItemDetails12.PriceTolerance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
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
 * "LineItemDetails12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the current situation of a line item as a result of the submission of a commercial dataset."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.LineItemDetails8 LineItemDetails8}</li>
 * </ul>
 */
public class LineItemDetails12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sequential number assigned to a line item.
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
	 * {@linkplain com.tools20022.repository.entity.LineItem#Identification
	 * LineItem.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#LineItemIdentification
	 * LineItemDetails8.LineItemIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute LineItemIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LineItem.Identification;
			isDerived = false;
			xmlTag = "LineItmId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItemIdentification";
			definition = "Sequential number assigned to a line item.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.LineItemIdentification;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Product#Name Product.Name}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductName
	 * LineItemDetails8.ProductName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ProductName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.Name;
			isDerived = false;
			xmlTag = "PdctNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductName";
			definition = "Name of the product detailed in the corresponding line item.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.ProductName;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Product#ProductIdentification
	 * Product.ProductIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductIdentifier
	 * LineItemDetails8.ProductIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProductIdentifier = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.ProductIdentification;
			isDerived = false;
			xmlTag = "PdctIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentifier";
			definition = "Identifies the product of the corresponding line item.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.ProductIdentifier;
			minOccurs = 0;
			type_lazy = () -> ProductIdentifier2Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Product#Characteristics
	 * Product.Characteristics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductCharacteristics
	 * LineItemDetails8.ProductCharacteristics}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProductCharacteristics = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.Characteristics;
			isDerived = false;
			xmlTag = "PdctChrtcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCharacteristics";
			definition = "Identifies the characteristic of a product.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.ProductCharacteristics;
			minOccurs = 0;
			type_lazy = () -> ProductCharacteristics1Choice.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Product#ProductCategory
	 * Product.ProductCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#ProductCategory
	 * LineItemDetails8.ProductCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ProductCategory = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.ProductCategory;
			isDerived = false;
			xmlTag = "PdctCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductCategory";
			definition = "Identifies the category of product.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.ProductCategory;
			minOccurs = 0;
			type_lazy = () -> ProductCategory1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Quantity ordered for a line as indicated in the baseline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#Quantity
	 * Product.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OrderedQuantity
	 * LineItemDetails8.OrderedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OrderedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Product.Quantity;
			isDerived = false;
			xmlTag = "OrdrdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedQuantity";
			definition = "Quantity ordered for a line as indicated in the baseline.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.OrderedQuantity;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quantity9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Quantity accepted by data set submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#AcceptedQuantity
	 * LineItemDetails8.AcceptedQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AcceptedQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "AccptdQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedQuantity";
			definition = "Quantity accepted by data set submission.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.AcceptedQuantity;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quantity9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Difference between the ordered quantity and the accepted one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OutstandingQuantity
	 * LineItemDetails8.OutstandingQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OutstandingQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "OutsdngQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingQuantity";
			definition = "Difference between the ordered quantity and the accepted one.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.OutstandingQuantity;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quantity9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Quantity of a product for which a mismatched data set has been submitted
	 * and has not yet been accepted or rejected..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity9 Quantity9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#PendingQuantity
	 * LineItemDetails8.PendingQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PendingQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "PdgQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingQuantity";
			definition = "Quantity of a product for which a mismatched data set has been submitted and has not yet been accepted or rejected..";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.PendingQuantity;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Quantity9.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.ProductQuantity#QuantityTolerance
	 * ProductQuantity.QuantityTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#QuantityTolerance
	 * LineItemDetails8.QuantityTolerance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd QuantityTolerance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ProductQuantity.QuantityTolerance;
			isDerived = false;
			xmlTag = "QtyTlrnce";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityTolerance";
			definition = "Variance allowed on the quantity of goods.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.QuantityTolerance;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PercentageTolerance1.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.PurchaseOrder#TotalAmount
	 * PurchaseOrder.TotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OrderedAmount
	 * LineItemDetails8.OrderedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OrderedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PurchaseOrder.TotalAmount;
			isDerived = false;
			xmlTag = "OrdrdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderedAmount";
			definition = "Price multiplied by the ordered quantity for a line as indicated in the baseline.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.OrderedAmount;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#AcceptedAmount
	 * LineItemDetails8.AcceptedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AcceptedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "AccptdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedAmount";
			definition = "Price multiplied by the accepted quantity for a line.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.AcceptedAmount;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#OutstandingAmount
	 * LineItemDetails8.OutstandingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OutstandingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "OutsdngAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutstandingAmount";
			definition = "Price multiplied by the outstanding quantity for a line.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.OutstandingAmount;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#PendingAmount
	 * LineItemDetails8.PendingAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PendingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			isDerived = false;
			xmlTag = "PdgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingAmount";
			definition = "Price multiplied by the pending quantity for a line.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.PendingAmount;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Price#PriceTolerance
	 * Price.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12
	 * LineItemDetails12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#PriceTolerance
	 * LineItemDetails8.PriceTolerance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PriceTolerance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LineItemDetails12.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Price.PriceTolerance;
			isDerived = false;
			xmlTag = "PricTlrnce";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTolerance";
			definition = "Variance on price for the goods.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.LineItemDetails8.PriceTolerance;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> PercentageTolerance1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails12.LineItemIdentification, com.tools20022.repository.msg.LineItemDetails12.ProductName,
						com.tools20022.repository.msg.LineItemDetails12.ProductIdentifier, com.tools20022.repository.msg.LineItemDetails12.ProductCharacteristics, com.tools20022.repository.msg.LineItemDetails12.ProductCategory,
						com.tools20022.repository.msg.LineItemDetails12.OrderedQuantity, com.tools20022.repository.msg.LineItemDetails12.AcceptedQuantity, com.tools20022.repository.msg.LineItemDetails12.OutstandingQuantity,
						com.tools20022.repository.msg.LineItemDetails12.PendingQuantity, com.tools20022.repository.msg.LineItemDetails12.QuantityTolerance, com.tools20022.repository.msg.LineItemDetails12.OrderedAmount,
						com.tools20022.repository.msg.LineItemDetails12.AcceptedAmount, com.tools20022.repository.msg.LineItemDetails12.OutstandingAmount, com.tools20022.repository.msg.LineItemDetails12.PendingAmount,
						com.tools20022.repository.msg.LineItemDetails12.PriceTolerance);
				trace_lazy = () -> LineItem.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LineItemDetails12";
				definition = "Calculation of the current situation of a line item as a result of the submission of a commercial dataset.";
				previousVersion_lazy = () -> LineItemDetails8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}