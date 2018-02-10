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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Sale context in which the transaction is performed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleIdentification
 * SaleContext2.mmSaleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleReferenceNumber
 * SaleContext2.mmSaleReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSaleReconciliationIdentification
 * SaleContext2.mmSaleReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmCashierIdentification
 * SaleContext2.mmCashierIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2#mmShiftNumber
 * SaleContext2.mmShiftNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmPurchaseOrderNumber
 * SaleContext2.mmPurchaseOrderNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2#mmInvoiceNumber
 * SaleContext2.mmInvoiceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmDeliveryNoteNumber
 * SaleContext2.mmDeliveryNoteNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmSponsoredMerchant
 * SaleContext2.mmSponsoredMerchant}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2#mmSplitPayment
 * SaleContext2.mmSplitPayment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SaleContext2#mmRemainingAmount
 * SaleContext2.mmRemainingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SaleContext2#mmAdditionalSaleData
 * SaleContext2.mmAdditionalSaleData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "SaleContext2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Sale context in which the transaction is performed."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.SaleContext1
 * SaleContext1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SaleContext2", propOrder = {"saleIdentification", "saleReferenceNumber", "saleReconciliationIdentification", "cashierIdentification", "shiftNumber", "purchaseOrderNumber", "invoiceNumber", "deliveryNoteNumber",
		"sponsoredMerchant", "splitPayment", "remainingAmount", "additionalSaleData"})
public class SaleContext2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SaleId")
	protected Max35Text saleIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the sale terminal (electronic cash register or point of sale terminal) or the sale system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleIdentification
	 * SaleContext1.mmSaleIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "SaleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleIdentification";
			definition = "Identification of the sale terminal (electronic cash register or point of sale terminal) or the sale system.";
			previousVersion_lazy = () -> SaleContext1.mmSaleIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SaleRefNb")
	protected Max35Text saleReferenceNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identify a sale transaction assigned by the sale system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleReferenceNumber
	 * SaleContext1.mmSaleReferenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleReferenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "SaleRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReferenceNumber";
			definition = "Identify a sale transaction assigned by the sale system.";
			previousVersion_lazy = () -> SaleContext1.mmSaleReferenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SaleRcncltnId")
	protected Max35Text saleReconciliationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SaleRcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the reconciliation between the Sale system and the POI system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmSaleReconciliationIdentification
	 * SaleContext1.mmSaleReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSaleReconciliationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "SaleRcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleReconciliationIdentification";
			definition = "Identifier of the reconciliation between the Sale system and the POI system.";
			previousVersion_lazy = () -> SaleContext1.mmSaleReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CshrId")
	protected Max35Text cashierIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashierIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cashier who carried out the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmCashierIdentification
	 * SaleContext1.mmCashierIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashierIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "CshrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashierIdentification";
			definition = "Identification of the cashier who carried out the transaction.";
			previousVersion_lazy = () -> SaleContext1.mmCashierIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ShftNb")
	protected Max2NumericText shiftNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max2NumericText
	 * Max2NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShftNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShiftNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the shift of the cashier."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmShiftNumber
	 * SaleContext1.mmShiftNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShiftNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "ShftNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShiftNumber";
			definition = "Identifies the shift of the cashier.";
			previousVersion_lazy = () -> SaleContext1.mmShiftNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2NumericText.mmObject();
		}
	};
	@XmlElement(name = "PurchsOrdrNb")
	protected Max35Text purchaseOrderNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsOrdrNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseOrderNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the purchase order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPurchaseOrderNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "PurchsOrdrNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseOrderNumber";
			definition = "Identification of the purchase order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "InvcNb")
	protected Max35Text invoiceNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvoiceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "InvcNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceNumber";
			definition = "Identification of the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "DlvryNoteNb")
	protected Max35Text deliveryNoteNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryNoteNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryNoteNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification allocated by the sale system and given to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryNoteNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "DlvryNoteNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryNoteNumber";
			definition = "Identification allocated by the sale system and given to the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SpnsrdMrchnt")
	protected List<com.tools20022.repository.msg.Organisation26> sponsoredMerchant;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation26
	 * Organisation26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpnsrdMrchnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SponsoredMerchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Merchant using the payment services of a payment facilitator, acting as a card acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSponsoredMerchant = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "SpnsrdMrchnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SponsoredMerchant";
			definition = "Merchant using the payment services of a payment facilitator, acting as a card acceptor.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation26.mmObject();
		}
	};
	@XmlElement(name = "SpltPmt")
	protected TrueFalseIndicator splitPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the payment transaction is a partial payment of the sale transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitPayment = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "SpltPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitPayment";
			definition = "True if the payment transaction is a partial payment of the sale transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "RmngAmt")
	protected ImpliedCurrencyAndAmount remainingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining amount to complete the sale transaction, if a partial payment has been completed for the sale transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemainingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "RmngAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingAmount";
			definition = "Remaining amount to complete the sale transaction, if a partial payment has been completed for the sale transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "AddtlSaleData")
	protected Max70Text additionalSaleData;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext2 SaleContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlSaleData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSaleData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information associated with the sale transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SaleContext1#mmAdditionalSaleData
	 * SaleContext1.mmAdditionalSaleData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalSaleData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SaleContext2.mmObject();
			isDerived = false;
			xmlTag = "AddtlSaleData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalSaleData";
			definition = "Additional information associated with the sale transaction.";
			previousVersion_lazy = () -> SaleContext1.mmAdditionalSaleData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SaleContext2.mmSaleIdentification, com.tools20022.repository.msg.SaleContext2.mmSaleReferenceNumber,
						com.tools20022.repository.msg.SaleContext2.mmSaleReconciliationIdentification, com.tools20022.repository.msg.SaleContext2.mmCashierIdentification, com.tools20022.repository.msg.SaleContext2.mmShiftNumber,
						com.tools20022.repository.msg.SaleContext2.mmPurchaseOrderNumber, com.tools20022.repository.msg.SaleContext2.mmInvoiceNumber, com.tools20022.repository.msg.SaleContext2.mmDeliveryNoteNumber,
						com.tools20022.repository.msg.SaleContext2.mmSponsoredMerchant, com.tools20022.repository.msg.SaleContext2.mmSplitPayment, com.tools20022.repository.msg.SaleContext2.mmRemainingAmount,
						com.tools20022.repository.msg.SaleContext2.mmAdditionalSaleData);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SaleContext2";
				definition = "Sale context in which the transaction is performed.";
				previousVersion_lazy = () -> SaleContext1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getSaleIdentification() {
		return saleIdentification == null ? Optional.empty() : Optional.of(saleIdentification);
	}

	public SaleContext2 setSaleIdentification(Max35Text saleIdentification) {
		this.saleIdentification = saleIdentification;
		return this;
	}

	public Optional<Max35Text> getSaleReferenceNumber() {
		return saleReferenceNumber == null ? Optional.empty() : Optional.of(saleReferenceNumber);
	}

	public SaleContext2 setSaleReferenceNumber(Max35Text saleReferenceNumber) {
		this.saleReferenceNumber = saleReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getSaleReconciliationIdentification() {
		return saleReconciliationIdentification == null ? Optional.empty() : Optional.of(saleReconciliationIdentification);
	}

	public SaleContext2 setSaleReconciliationIdentification(Max35Text saleReconciliationIdentification) {
		this.saleReconciliationIdentification = saleReconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getCashierIdentification() {
		return cashierIdentification == null ? Optional.empty() : Optional.of(cashierIdentification);
	}

	public SaleContext2 setCashierIdentification(Max35Text cashierIdentification) {
		this.cashierIdentification = cashierIdentification;
		return this;
	}

	public Optional<Max2NumericText> getShiftNumber() {
		return shiftNumber == null ? Optional.empty() : Optional.of(shiftNumber);
	}

	public SaleContext2 setShiftNumber(Max2NumericText shiftNumber) {
		this.shiftNumber = shiftNumber;
		return this;
	}

	public Optional<Max35Text> getPurchaseOrderNumber() {
		return purchaseOrderNumber == null ? Optional.empty() : Optional.of(purchaseOrderNumber);
	}

	public SaleContext2 setPurchaseOrderNumber(Max35Text purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
		return this;
	}

	public Optional<Max35Text> getInvoiceNumber() {
		return invoiceNumber == null ? Optional.empty() : Optional.of(invoiceNumber);
	}

	public SaleContext2 setInvoiceNumber(Max35Text invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
		return this;
	}

	public Optional<Max35Text> getDeliveryNoteNumber() {
		return deliveryNoteNumber == null ? Optional.empty() : Optional.of(deliveryNoteNumber);
	}

	public SaleContext2 setDeliveryNoteNumber(Max35Text deliveryNoteNumber) {
		this.deliveryNoteNumber = deliveryNoteNumber;
		return this;
	}

	public List<Organisation26> getSponsoredMerchant() {
		return sponsoredMerchant == null ? sponsoredMerchant = new ArrayList<>() : sponsoredMerchant;
	}

	public SaleContext2 setSponsoredMerchant(List<com.tools20022.repository.msg.Organisation26> sponsoredMerchant) {
		this.sponsoredMerchant = Objects.requireNonNull(sponsoredMerchant);
		return this;
	}

	public Optional<TrueFalseIndicator> getSplitPayment() {
		return splitPayment == null ? Optional.empty() : Optional.of(splitPayment);
	}

	public SaleContext2 setSplitPayment(TrueFalseIndicator splitPayment) {
		this.splitPayment = splitPayment;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getRemainingAmount() {
		return remainingAmount == null ? Optional.empty() : Optional.of(remainingAmount);
	}

	public SaleContext2 setRemainingAmount(ImpliedCurrencyAndAmount remainingAmount) {
		this.remainingAmount = remainingAmount;
		return this;
	}

	public Optional<Max70Text> getAdditionalSaleData() {
		return additionalSaleData == null ? Optional.empty() : Optional.of(additionalSaleData);
	}

	public SaleContext2 setAdditionalSaleData(Max70Text additionalSaleData) {
		this.additionalSaleData = additionalSaleData;
		return this;
	}
}