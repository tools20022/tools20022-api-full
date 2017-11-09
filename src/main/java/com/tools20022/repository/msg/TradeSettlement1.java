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
import com.tools20022.repository.area.tsin.FinancialInvoiceV01;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmDuePayableAmount
 * TradeSettlement1.mmDuePayableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmCreditorReference
 * TradeSettlement1.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentReference
 * TradeSettlement1.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyCode
 * TradeSettlement1.mmInvoiceCurrencyCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoicer
 * TradeSettlement1.mmInvoicer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoicee
 * TradeSettlement1.mmInvoicee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPayee
 * TradeSettlement1.mmPayee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPayer
 * TradeSettlement1.mmPayer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTaxCurrencyExchange
 * TradeSettlement1.mmTaxCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyExchange
 * TradeSettlement1.mmInvoiceCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentCurrencyExchange
 * TradeSettlement1.mmPaymentCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentMeans
 * TradeSettlement1.mmPaymentMeans}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTax
 * TradeSettlement1.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmBillingPeriod
 * TradeSettlement1.mmBillingPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAllowanceCharge
 * TradeSettlement1.mmAllowanceCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmSubTotalCalculatedTax
 * TradeSettlement1.mmSubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLogisticsCharge
 * TradeSettlement1.mmLogisticsCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPaymentTerms
 * TradeSettlement1.mmPaymentTerms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmMonetarySummation
 * TradeSettlement1.mmMonetarySummation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmAdjustmentAmountAndReason
 * TradeSettlement1.mmAdjustmentAmountAndReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceReferencedDocument
 * TradeSettlement1.mmInvoiceReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmProformaInvoiceReferencedDocument
 * TradeSettlement1.mmProformaInvoiceReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmLetterOfCreditReferencedDocument
 * TradeSettlement1.mmLetterOfCreditReferencedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmFinancialCard
 * TradeSettlement1.mmFinancialCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmPurchaseAccountingAccount
 * TradeSettlement1.mmPurchaseAccountingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmIssuerFactoringListIdentification
 * TradeSettlement1.mmIssuerFactoringListIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmIssuerFactoringAgreementIdentification
 * TradeSettlement1.mmIssuerFactoringAgreementIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
 * CommercialTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeSettlement
 * FinancialInvoiceV01.mmTradeSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeSettlement1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeSettlement2
 * TradeSettlement2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TradeSettlement1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CurrencyAndAmount> duePayableAmount;
	/**
	 * Monetary value that is an exact amount due and payable, such as the
	 * amount due to the creditor.
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
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
	 * definition} =
	 * "Monetary value that is an exact amount due and payable, such as the amount due to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmDuePayableAmount
	 * TradeSettlement2.mmDuePayableAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDuePayableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "DuePyblAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuePayableAmount";
			definition = "Monetary value that is an exact amount due and payable, such as the amount due to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmDuePayableAmount);
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CreditorReferenceInformation2> creditorReference;
	/**
	 * Unique and unambiguous reference assigned by the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation2
	 * CreditorReferenceInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned by the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "CdtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CreditorReferenceInformation2.mmObject();
		}
	};
	protected List<Max35Text> paymentReference;
	/**
	 * Unique and unambiguous identifier for a payment transaction, as assigned
	 * by the originator. The payment transaction reference is used for
	 * reconciliation or to link tasks relating to the payment transaction.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
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
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CurrencyCode invoiceCurrencyCode;
	/**
	 * Code specifying the currency of the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceCurrency
	 * Invoice.mmInvoiceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcCcyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrencyCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code specifying the currency of the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvoiceCurrencyCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmInvoiceCurrency;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyCode";
			definition = "Code specifying the currency of the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected TradeParty1 invoicer;
	/**
	 * Organization issuing the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoicerRole InvoicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Organization issuing the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoicerRole.mmObject();
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Organization issuing the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmObject();
		}
	};
	protected TradeParty1 invoicee;
	/**
	 * Party to whom the invoice was issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Invcee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invoicee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to whom the invoice was issued."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Party to whom the invoice was issued.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmObject();
		}
	};
	protected TradeParty1 payee;
	/**
	 * Party specified to receive payment for the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BuyerRole BuyerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pyee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party specified to receive payment for the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPayee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BuyerRole.mmObject();
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Pyee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payee";
			definition = "Party specified to receive payment for the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmObject();
		}
	};
	protected TradeParty1 payer;
	/**
	 * Party specified to initiate payment for the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SellerRole SellerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party specified to initiate payment for the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPayer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SellerRole.mmObject();
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Pyer";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payer";
			definition = "Party specified to initiate payment for the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeParty1.mmObject();
		}
	};
	protected CurrencyReference2 taxCurrencyExchange;
	/**
	 * Currency exchange applicable to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
	 * Tax.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmCurrencyExchange;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "TaxCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCurrencyExchange";
			definition = "Currency exchange applicable to a tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReference2.mmObject();
		}
	};
	protected CurrencyReference2 invoiceCurrencyExchange;
	/**
	 * Currency exchange applicable to the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
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
	 * definition} = "Currency exchange applicable to the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceCurrencyExchange";
			definition = "Currency exchange applicable to the invoice.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReference2.mmObject();
		}
	};
	protected CurrencyReference2 paymentCurrencyExchange;
	/**
	 * Currency exchange applicable to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference2
	 * CurrencyReference2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to the payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCurrencyExchange";
			definition = "Currency exchange applicable to the payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReference2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentMeans1> paymentMeans;
	/**
	 * Means of payment (for example, credit transfer, cheque, money order, or
	 * credit card) specified to initiate payment of the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentMeans1
	 * PaymentMeans1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmPayment
	 * CommercialTradeSettlement.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means of payment (for example, credit transfer, cheque, money order, or credit card) specified to initiate payment of the invoice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentMeans = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmPayment;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMeans";
			definition = "Means of payment (for example, credit transfer, cheque, money order, or credit card) specified to initiate payment of the invoice.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentMeans1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementTax1> tax;
	/**
	 * Amount of money due to the government or tax authority, according to
	 * various pre-defined parameters such as thresholds or income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTax1
	 * SettlementTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTax1.mmObject();
		}
	};
	protected Period1 billingPeriod;
	/**
	 * Specifies the applicable billing period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period1 Period1}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
	 * Invoice.mmPeriodCovered}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
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
	 * definition} = "Specifies the applicable billing period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBillingPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmPeriodCovered;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "BllgPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BillingPeriod";
			definition = "Specifies the applicable billing period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Period1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementAllowanceCharge1> allowanceCharge;
	/**
	 * Allowance or charge specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementAllowanceCharge1
	 * SettlementAllowanceCharge1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allowance Allowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allowance or charge specified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAllowanceCharge = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Allowance.mmObject();
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "AllwncChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceCharge";
			definition = "Allowance or charge specified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementAllowanceCharge1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1> subTotalCalculatedTax;
	/**
	 * Tax subtotal calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
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
	 * definition} = "Tax subtotal calculated."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmSubTotalCalculatedTax
	 * TradeSettlement2.mmSubTotalCalculatedTax}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubTotalCalculatedTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Product.mmTax;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "SubTtlClctdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalCalculatedTax";
			definition = "Tax subtotal calculated.";
			nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmSubTotalCalculatedTax);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ChargesDetails2> logisticsCharge;
	/**
	 * Logistics service charge specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ChargesDetails2
	 * ChargesDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmLogisticsCharge
	 * LineItem.mmLogisticsCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LogstcsChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LogisticsCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logistics service charge specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLogisticsCharge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmLogisticsCharge;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "LogstcsChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LogisticsCharge";
			definition = "Logistics service charge specified.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ChargesDetails2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentTerms3> paymentTerms;
	/**
	 * Payment terms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTerms3
	 * PaymentTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentObligation
	 * Payment.mmPaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment terms."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentObligation;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PmtTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTerms";
			definition = "Payment terms.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTerms3.mmObject();
		}
	};
	protected SettlementMonetarySummation1 monetarySummation;
	/**
	 * Monetary totals specified for the invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntrySummtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetarySummation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monetary totals specified for the invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetarySummation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "MntrySummtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetarySummation";
			definition = "Monetary totals specified for the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DocumentAdjustment2> adjustmentAmountAndReason;
	/**
	 * Financial adjustment specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentAdjustment2
	 * DocumentAdjustment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmFinancialAdjustment
	 * LineItem.mmFinancialAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstmntAmtAndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentAmountAndReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial adjustment specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdjustmentAmountAndReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LineItem.mmFinancialAdjustment;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "AdjstmntAmtAndRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentAmountAndReason";
			definition = "Financial adjustment specified.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentAdjustment2.mmObject();
		}
	};
	protected DocumentIdentification22 invoiceReferencedDocument;
	/**
	 * Invoice document referenced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcRefdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInvoiceReferencedDocument = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "InvcRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceReferencedDocument";
			definition = "Invoice document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	protected DocumentIdentification22 proformaInvoiceReferencedDocument;
	/**
	 * Pro-forma invoice document referenced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification22
	 * DocumentIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ProfrmInvcRefdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProformaInvoiceReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pro-forma invoice document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProformaInvoiceReferencedDocument = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmInvoice;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "ProfrmInvcRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProformaInvoiceReferencedDocument";
			definition = "Pro-forma invoice document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification22.mmObject();
		}
	};
	protected DocumentIdentification7 letterOfCreditReferencedDocument;
	/**
	 * Letter of credit document referenced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrOfCdtRefdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfCreditReferencedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Letter of credit document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterOfCreditReferencedDocument = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "LttrOfCdtRefdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfCreditReferencedDocument";
			definition = "Letter of credit document referenced.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancialCard1> financialCard;
	/**
	 * Financial card specified. The card is used to represent a financial
	 * account for the purpose of payment settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialCard1
	 * FinancialCard1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmPaymentCard
	 * CardPayment.mmPaymentCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial card specified. The card is used to represent a financial account for the purpose of payment settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialCard = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmPaymentCard;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "FinCard";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCard";
			definition = "Financial card specified. The card is used to represent a financial account for the purpose of payment settlement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialCard1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountingAccount1> purchaseAccountingAccount;
	/**
	 * Specific purchase account for recording debits and credits for accounting
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountingAccount1
	 * AccountingAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade#mmPurchaseAccount
	 * CommercialTrade.mmPurchaseAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurchsAcctgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseAccountingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific purchase account for recording debits and credits for accounting purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurchaseAccountingAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTrade.mmPurchaseAccount;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "PurchsAcctgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseAccountingAccount";
			definition = "Specific purchase account for recording debits and credits for accounting purposes.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountingAccount1.mmObject();
		}
	};
	protected List<Max35Text> issuerFactoringListIdentification;
	/**
	 * Factoring list document referenced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrFactrgListId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFactoringListIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factoring list document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerFactoringListIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "IssrFactrgListId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFactoringListIdentification";
			definition = "Factoring list document referenced.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> issuerFactoringAgreementIdentification;
	/**
	 * Factoring agreement document referenced.
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmIdentification
	 * InvoiceFinancingAgreement.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrFactrgAgrmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerFactoringAgreementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Factoring agreement document referenced."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerFactoringAgreementIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> TradeSettlement1.mmObject();
			isDerived = false;
			xmlTag = "IssrFactrgAgrmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerFactoringAgreementIdentification";
			definition = "Factoring agreement document referenced.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradeSettlement1.mmDuePayableAmount, TradeSettlement1.mmCreditorReference, TradeSettlement1.mmPaymentReference, TradeSettlement1.mmInvoiceCurrencyCode, TradeSettlement1.mmInvoicer,
						TradeSettlement1.mmInvoicee, TradeSettlement1.mmPayee, TradeSettlement1.mmPayer, TradeSettlement1.mmTaxCurrencyExchange, TradeSettlement1.mmInvoiceCurrencyExchange, TradeSettlement1.mmPaymentCurrencyExchange,
						TradeSettlement1.mmPaymentMeans, TradeSettlement1.mmTax, TradeSettlement1.mmBillingPeriod, TradeSettlement1.mmAllowanceCharge, TradeSettlement1.mmSubTotalCalculatedTax, TradeSettlement1.mmLogisticsCharge,
						TradeSettlement1.mmPaymentTerms, TradeSettlement1.mmMonetarySummation, TradeSettlement1.mmAdjustmentAmountAndReason, TradeSettlement1.mmInvoiceReferencedDocument,
						TradeSettlement1.mmProformaInvoiceReferencedDocument, TradeSettlement1.mmLetterOfCreditReferencedDocument, TradeSettlement1.mmFinancialCard, TradeSettlement1.mmPurchaseAccountingAccount,
						TradeSettlement1.mmIssuerFactoringListIdentification, TradeSettlement1.mmIssuerFactoringAgreementIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInvoiceV01.mmTradeSettlement);
				trace_lazy = () -> CommercialTradeSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeSettlement1";
				definition = "Trade settlement details for this invoice which involves the payment of an outstanding debt, account, or charge";
				nextVersions_lazy = () -> Arrays.asList(TradeSettlement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getDuePayableAmount() {
		return duePayableAmount;
	}

	public void setDuePayableAmount(List<CurrencyAndAmount> duePayableAmount) {
		this.duePayableAmount = duePayableAmount;
	}

	public List<CreditorReferenceInformation2> getCreditorReference() {
		return creditorReference;
	}

	public void setCreditorReference(List<com.tools20022.repository.msg.CreditorReferenceInformation2> creditorReference) {
		this.creditorReference = creditorReference;
	}

	public List<Max35Text> getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(List<Max35Text> paymentReference) {
		this.paymentReference = paymentReference;
	}

	public CurrencyCode getInvoiceCurrencyCode() {
		return invoiceCurrencyCode;
	}

	public void setInvoiceCurrencyCode(CurrencyCode invoiceCurrencyCode) {
		this.invoiceCurrencyCode = invoiceCurrencyCode;
	}

	public TradeParty1 getInvoicer() {
		return invoicer;
	}

	public void setInvoicer(com.tools20022.repository.msg.TradeParty1 invoicer) {
		this.invoicer = invoicer;
	}

	public TradeParty1 getInvoicee() {
		return invoicee;
	}

	public void setInvoicee(com.tools20022.repository.msg.TradeParty1 invoicee) {
		this.invoicee = invoicee;
	}

	public TradeParty1 getPayee() {
		return payee;
	}

	public void setPayee(com.tools20022.repository.msg.TradeParty1 payee) {
		this.payee = payee;
	}

	public TradeParty1 getPayer() {
		return payer;
	}

	public void setPayer(com.tools20022.repository.msg.TradeParty1 payer) {
		this.payer = payer;
	}

	public CurrencyReference2 getTaxCurrencyExchange() {
		return taxCurrencyExchange;
	}

	public void setTaxCurrencyExchange(com.tools20022.repository.msg.CurrencyReference2 taxCurrencyExchange) {
		this.taxCurrencyExchange = taxCurrencyExchange;
	}

	public CurrencyReference2 getInvoiceCurrencyExchange() {
		return invoiceCurrencyExchange;
	}

	public void setInvoiceCurrencyExchange(com.tools20022.repository.msg.CurrencyReference2 invoiceCurrencyExchange) {
		this.invoiceCurrencyExchange = invoiceCurrencyExchange;
	}

	public CurrencyReference2 getPaymentCurrencyExchange() {
		return paymentCurrencyExchange;
	}

	public void setPaymentCurrencyExchange(com.tools20022.repository.msg.CurrencyReference2 paymentCurrencyExchange) {
		this.paymentCurrencyExchange = paymentCurrencyExchange;
	}

	public List<PaymentMeans1> getPaymentMeans() {
		return paymentMeans;
	}

	public void setPaymentMeans(List<com.tools20022.repository.msg.PaymentMeans1> paymentMeans) {
		this.paymentMeans = paymentMeans;
	}

	public List<SettlementTax1> getTax() {
		return tax;
	}

	public void setTax(List<com.tools20022.repository.msg.SettlementTax1> tax) {
		this.tax = tax;
	}

	public Period1 getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(com.tools20022.repository.msg.Period1 billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public List<SettlementAllowanceCharge1> getAllowanceCharge() {
		return allowanceCharge;
	}

	public void setAllowanceCharge(List<com.tools20022.repository.msg.SettlementAllowanceCharge1> allowanceCharge) {
		this.allowanceCharge = allowanceCharge;
	}

	public List<SettlementSubTotalCalculatedTax1> getSubTotalCalculatedTax() {
		return subTotalCalculatedTax;
	}

	public void setSubTotalCalculatedTax(List<com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1> subTotalCalculatedTax) {
		this.subTotalCalculatedTax = subTotalCalculatedTax;
	}

	public List<ChargesDetails2> getLogisticsCharge() {
		return logisticsCharge;
	}

	public void setLogisticsCharge(List<com.tools20022.repository.msg.ChargesDetails2> logisticsCharge) {
		this.logisticsCharge = logisticsCharge;
	}

	public List<PaymentTerms3> getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(List<com.tools20022.repository.msg.PaymentTerms3> paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public SettlementMonetarySummation1 getMonetarySummation() {
		return monetarySummation;
	}

	public void setMonetarySummation(com.tools20022.repository.msg.SettlementMonetarySummation1 monetarySummation) {
		this.monetarySummation = monetarySummation;
	}

	public List<DocumentAdjustment2> getAdjustmentAmountAndReason() {
		return adjustmentAmountAndReason;
	}

	public void setAdjustmentAmountAndReason(List<com.tools20022.repository.msg.DocumentAdjustment2> adjustmentAmountAndReason) {
		this.adjustmentAmountAndReason = adjustmentAmountAndReason;
	}

	public DocumentIdentification22 getInvoiceReferencedDocument() {
		return invoiceReferencedDocument;
	}

	public void setInvoiceReferencedDocument(com.tools20022.repository.msg.DocumentIdentification22 invoiceReferencedDocument) {
		this.invoiceReferencedDocument = invoiceReferencedDocument;
	}

	public DocumentIdentification22 getProformaInvoiceReferencedDocument() {
		return proformaInvoiceReferencedDocument;
	}

	public void setProformaInvoiceReferencedDocument(com.tools20022.repository.msg.DocumentIdentification22 proformaInvoiceReferencedDocument) {
		this.proformaInvoiceReferencedDocument = proformaInvoiceReferencedDocument;
	}

	public DocumentIdentification7 getLetterOfCreditReferencedDocument() {
		return letterOfCreditReferencedDocument;
	}

	public void setLetterOfCreditReferencedDocument(com.tools20022.repository.msg.DocumentIdentification7 letterOfCreditReferencedDocument) {
		this.letterOfCreditReferencedDocument = letterOfCreditReferencedDocument;
	}

	public List<FinancialCard1> getFinancialCard() {
		return financialCard;
	}

	public void setFinancialCard(List<com.tools20022.repository.msg.FinancialCard1> financialCard) {
		this.financialCard = financialCard;
	}

	public List<AccountingAccount1> getPurchaseAccountingAccount() {
		return purchaseAccountingAccount;
	}

	public void setPurchaseAccountingAccount(List<com.tools20022.repository.msg.AccountingAccount1> purchaseAccountingAccount) {
		this.purchaseAccountingAccount = purchaseAccountingAccount;
	}

	public List<Max35Text> getIssuerFactoringListIdentification() {
		return issuerFactoringListIdentification;
	}

	public void setIssuerFactoringListIdentification(List<Max35Text> issuerFactoringListIdentification) {
		this.issuerFactoringListIdentification = issuerFactoringListIdentification;
	}

	public List<Max35Text> getIssuerFactoringAgreementIdentification() {
		return issuerFactoringAgreementIdentification;
	}

	public void setIssuerFactoringAgreementIdentification(List<Max35Text> issuerFactoringAgreementIdentification) {
		this.issuerFactoringAgreementIdentification = issuerFactoringAgreementIdentification;
	}
}