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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Trade settlement details for this invoice which involves the payment of an
 * outstanding debt, account, or charge
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmPaymentReference
 * TradeSettlement2.mmPaymentReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDueDate
 * TradeSettlement2.mmDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
 * TradeSettlement2.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmInvoiceCurrencyExchange
 * TradeSettlement2.mmInvoiceCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDeliveryDate
 * TradeSettlement2.mmDeliveryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmBillingPeriod
 * TradeSettlement2.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmTaxTotalAmount
 * TradeSettlement2.mmTaxTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmExemptionReasonCode
 * TradeSettlement2.mmExemptionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmExemptionReason
 * TradeSettlement2.mmExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmSubTotalCalculatedTax
 * TradeSettlement2.mmSubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmEarlyPayments
 * TradeSettlement2.mmEarlyPayments}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeSettlement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1 TradeSettlement1}</li>
 * </ul>
 */
public class TradeSettlement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CreditorReferenceInformation2 paymentReference;
	/**
	 * Payment or creditor reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment or creditor reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Payment or creditor reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditorReferenceInformation2.mmObject();
		}
	};
	protected ISODate dueDate;
	/**
	 * Date when invoice should be paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DueDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when invoice should be paid. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DueDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueDate";
			definition = "Date when invoice should be paid. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CurrencyAndAmount duePayableAmount;
	/**
	 * Payable amount with currency code.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DuePyblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuePayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payable amount with currency code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmDuePayableAmount
	 * TradeSettlement1.mmDuePayableAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Payable amount with currency code.";
			previousVersion_lazy = () -> TradeSettlement1.mmDuePayableAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyReference3 invoiceCurrencyExchange;
	/**
	 * If invoice currency is different from local tax reporting currency, then
	 * applied exchange rate is given in this message structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcCcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If invoice currency is different from local tax reporting currency, then applied exchange rate is given in this message structure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceCurrencyExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyExchange";
			definition = "If invoice currency is different from local tax reporting currency, then applied exchange rate is given in this message structure.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReference3.mmObject();
		}
	};
	protected ISODate deliveryDate;
	/**
	 * Date when goods/services are delivered to buyer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when goods/services are delivered to buyer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "DlvryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDate";
			definition = "Date when goods/services are delivered to buyer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Period2 billingPeriod;
	/**
	 * Period during which delivery executed or agreed invoicing period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period2 Period2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmStartDate
	 * Trade.mmStartDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BllgPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which delivery executed or agreed invoicing period."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBillingPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmStartDate;
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Period during which delivery executed or agreed invoicing period.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Period2.mmObject();
		}
	};
	protected CurrencyAndAmount taxTotalAmount;
	/**
	 * Tax total amount with currency code.
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
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmTotalAcceptedAmount
	 * CommercialTrade.mmTotalAcceptedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax total amount with currency code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmTotalAcceptedAmount;
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "TaxTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTotalAmount";
			definition = "Tax total amount with currency code.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max4Text exemptionReasonCode;
	/**
	 * Reason for tax exemption expressed as a code, if invoice or card
	 * transaction is out of tax processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for tax exemption expressed as a code,  if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReasonCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonCode";
			definition = "Reason for tax exemption expressed as a code,  if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected Max500Text exemptionReason;
	/**
	 * Reason for a tax exemption, if invoice or card transaction is out of tax
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for a tax exemption, if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption, if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2> subTotalCalculatedTax;
	/**
	 * Calculated tax subtotal
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlClctdTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalCalculatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated tax subtotal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmSubTotalCalculatedTax
	 * TradeSettlement1.mmSubTotalCalculatedTax}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubTotalCalculatedTax = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "SubTtlClctdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalCalculatedTax";
			definition = "Calculated tax subtotal";
			previousVersion_lazy = () -> TradeSettlement1.mmSubTotalCalculatedTax;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.EarlyPayment1> earlyPayments;
	/**
	 * Details of each early payment discount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EarlyPayment1
	 * EarlyPayment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2
	 * TradeSettlement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EarlyPmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyPayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of each early payment discount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEarlyPayments = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TradeSettlement2.mmObject();
			isDerived = false;
			xmlTag = "EarlyPmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyPayments";
			definition = "Details of each early payment discount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EarlyPayment1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeSettlement2.mmPaymentReference, TradeSettlement2.mmDueDate, TradeSettlement2.mmDuePayableAmount, TradeSettlement2.mmInvoiceCurrencyExchange, TradeSettlement2.mmDeliveryDate,
						TradeSettlement2.mmBillingPeriod, TradeSettlement2.mmTaxTotalAmount, TradeSettlement2.mmExemptionReasonCode, TradeSettlement2.mmExemptionReason, TradeSettlement2.mmSubTotalCalculatedTax,
						TradeSettlement2.mmEarlyPayments);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeSettlement2";
				definition = "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge";
				previousVersion_lazy = () -> TradeSettlement1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CreditorReferenceInformation2 getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(com.tools20022.repository.msg.CreditorReferenceInformation2 paymentReference) {
		this.paymentReference = paymentReference;
	}

	public ISODate getDueDate() {
		return dueDate;
	}

	public void setDueDate(ISODate dueDate) {
		this.dueDate = dueDate;
	}

	public CurrencyAndAmount getDuePayableAmount() {
		return duePayableAmount;
	}

	public void setDuePayableAmount(CurrencyAndAmount duePayableAmount) {
		this.duePayableAmount = duePayableAmount;
	}

	public CurrencyReference3 getInvoiceCurrencyExchange() {
		return invoiceCurrencyExchange;
	}

	public void setInvoiceCurrencyExchange(com.tools20022.repository.msg.CurrencyReference3 invoiceCurrencyExchange) {
		this.invoiceCurrencyExchange = invoiceCurrencyExchange;
	}

	public ISODate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(ISODate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Period2 getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(com.tools20022.repository.msg.Period2 billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public CurrencyAndAmount getTaxTotalAmount() {
		return taxTotalAmount;
	}

	public void setTaxTotalAmount(CurrencyAndAmount taxTotalAmount) {
		this.taxTotalAmount = taxTotalAmount;
	}

	public Max4Text getExemptionReasonCode() {
		return exemptionReasonCode;
	}

	public void setExemptionReasonCode(Max4Text exemptionReasonCode) {
		this.exemptionReasonCode = exemptionReasonCode;
	}

	public Max500Text getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(Max500Text exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	public List<SettlementSubTotalCalculatedTax2> getSubTotalCalculatedTax() {
		return subTotalCalculatedTax;
	}

	public void setSubTotalCalculatedTax(List<com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2> subTotalCalculatedTax) {
		this.subTotalCalculatedTax = subTotalCalculatedTax;
	}

	public List<EarlyPayment1> getEarlyPayments() {
		return earlyPayments;
	}

	public void setEarlyPayments(List<com.tools20022.repository.msg.EarlyPayment1> earlyPayments) {
		this.earlyPayments = earlyPayments;
	}
}