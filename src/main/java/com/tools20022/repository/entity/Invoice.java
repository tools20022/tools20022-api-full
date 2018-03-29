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
import com.tools20022.repository.choice.BillingCompensationType1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalBillingCompensationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * General information about an invoice, such as number, issue date date and
 * monetary amounts.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Invoice" src="doc-files/Invoice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitNoteAmount
 * Invoice.mmCreditDebitNoteAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmTotalTaxAmount
 * Invoice.mmTotalTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
 * Invoice.mmTotalInvoiceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceCurrency
 * Invoice.mmInvoiceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPeriodCovered
 * Invoice.mmPeriodCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmTradeSettlement
 * Invoice.mmTradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmTotalCharge
 * Invoice.mmTotalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalPrepaidAmount
 * Invoice.mmTotalPrepaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
 * Invoice.mmLineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmTotalNetAmount
 * Invoice.mmTotalNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
 * Invoice.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmBillingCompensationType
 * Invoice.mmBillingCompensationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmInvoicePartyRole
 * Invoice.mmInvoicePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmOriginalInvoice
 * Invoice.mmOriginalInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmRelatedInvoice
 * Invoice.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceFinancingTransaction
 * Invoice.mmInvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmBillingCompensationAmount
 * Invoice.mmBillingCompensationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceStatus
 * Invoice.mmInvoiceStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmPayment
 * Invoice.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitIndicator
 * Invoice.mmCreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvoice
 * DateTimePeriod.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
 * Payment.mmInvoiceReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedInvoice
 * CurrencyExchange.mmRelatedInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmOriginalInvoice
 * Invoice.mmOriginalInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmRelatedInvoice
 * Invoice.mmRelatedInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoicePartyRole#mmInvoice
 * InvoicePartyRole.mmInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoice
 * InvoiceFinancingAgreement.mmInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#mmInvoice
 * LineItem.mmInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
 * CommercialTradeSettlement.mmInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus#mmInvoice
 * InvoiceStatus.mmInvoice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#mmInvoiceLegalStatement
 * InvoiceLegalIssue1.mmInvoiceLegalStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmRegulatoryData
 * BillingReport1.mmRegulatoryData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#mmInvoiceTotals
 * BillingReport1.mmInvoiceTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmServiceCategoryTotals
 * BillingReport1.mmServiceCategoryTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmRegulatoryData
 * BillingCancellationReport1.mmRegulatoryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmParameters
 * ReconciliationList1.mmParameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#mmItem
 * ReconciliationList1.mmItem}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#mmItemContext
 * FinancialItem1.mmItemContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmFinancialDocumentReference
 * FinancialItem1.mmFinancialDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmRelatedItem
 * FinancialItemParameters1.mmRelatedItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmRegulatoryData
 * BillingReport2.mmRegulatoryData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2#mmInvoiceTotals
 * BillingReport2.mmInvoiceTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmServiceCategoryTotals
 * BillingReport2.mmServiceCategoryTotals}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceTotals1 InvoiceTotals1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1
 * OriginalInvoiceInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1
 * InvoiceFinancingDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
 * SettlementMonetarySummation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceIdentification1
 * InvoiceIdentification1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice
 * BillingCompensationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement1
 * BillingStatement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1
 * InvoiceLegalIssue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvoiceTotals2 InvoiceTotals2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1
 * ServiceCategoryTotals1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1 BillingReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingCancellationReport1
 * BillingCancellationReport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingSearchCriteria1
 * BillingSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingItemList1
 * FinancingItemList1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItemParameters1
 * FinancialItemParameters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingStatement2
 * BillingStatement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingSearchCriteria2
 * BillingSearchCriteria2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport2 BillingReport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ServiceCategoryTotals2
 * ServiceCategoryTotals2}</li>
 * </ul>
 * </li>
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
 * "Invoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General information about an invoice, such as number, issue date date and monetary amounts."
 * </li>
 * </ul>
 */
public class Invoice extends FinancialDocument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount creditDebitNoteAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmCreditNoteAmount
	 * RemittanceAmount1.mmCreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmCreditNoteAmount
	 * RemittanceAmount2.mmCreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmCreditDebitNoteAmount
	 * InvoiceRequestInformation1.mmCreditDebitNoteAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitNoteAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of credit/debit note related to the invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmCreditDebitNoteAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount1.mmCreditNoteAmount, RemittanceAmount2.mmCreditNoteAmount, InvoiceRequestInformation1.mmCreditDebitNoteAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitNoteAmount";
			definition = "Amount of credit/debit note related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getCreditDebitNoteAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setCreditDebitNoteAmount(value);
		}
	};
	protected CurrencyAndAmount totalTaxAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#mmTaxAmount
	 * RemittanceAmount1.mmTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#mmTaxAmount
	 * RemittanceAmount2.mmTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTaxTotalAmount
	 * SettlementMonetarySummation1.mmTaxTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmTotalTaxAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount1.mmTaxAmount, RemittanceAmount2.mmTaxAmount, SettlementMonetarySummation1.mmTaxTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalTaxAmount";
			definition = "Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getTotalTaxAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setTotalTaxAmount(value);
		}
	};
	protected CurrencyAndAmount totalInvoiceAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#mmTotalInvoiceAmount
	 * OriginalInvoiceInformation1.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmGrandTotalAmount
	 * SettlementMonetarySummation1.mmGrandTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#mmLineItemsTotalAmount
	 * LineItem5.mmLineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmTotalNetAmount
	 * LineItem5.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmLineItemsTotalAmount
	 * LineItem7.mmLineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmTotalNetAmount
	 * LineItem7.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#mmAcceptedTotalNetAmount
	 * LineItem6.mmAcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmAcceptedTotalNetAmount
	 * LineItem8.mmAcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#mmLineItemsTotalAmount
	 * LineItem4.mmLineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmTotalNetAmount
	 * LineItem4.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmLineItemsTotalAmount
	 * LineItem9.mmLineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmTotalNetAmount
	 * LineItem9.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmLineItemsTotalAmount
	 * LineItem11.mmLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmTotalNetAmount
	 * LineItem11.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#mmLineItemsTotalAmount
	 * LineItem12.mmLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#mmTotalNetAmount
	 * LineItem12.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmAcceptedTotalNetAmount
	 * LineItem14.mmAcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemsTotalAmount
	 * LineItem13.mmLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmTotalNetAmount
	 * LineItem13.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmLineItemsTotalAmount
	 * LineItem15.mmLineItemsTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmTotalNetAmount
	 * LineItem15.mmTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmTotalAmount
	 * FinancialItem1.mmTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalInvoiceAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmTotalInvoiceAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalInvoiceInformation1.mmTotalInvoiceAmount, SettlementMonetarySummation1.mmGrandTotalAmount, LineItem5.mmLineItemsTotalAmount, LineItem5.mmTotalNetAmount,
					LineItem7.mmLineItemsTotalAmount, LineItem7.mmTotalNetAmount, LineItem6.mmAcceptedTotalNetAmount, LineItem8.mmAcceptedTotalNetAmount, LineItem4.mmLineItemsTotalAmount, LineItem4.mmTotalNetAmount,
					LineItem9.mmLineItemsTotalAmount, LineItem9.mmTotalNetAmount, LineItem11.mmLineItemsTotalAmount, LineItem11.mmTotalNetAmount, LineItem12.mmLineItemsTotalAmount, LineItem12.mmTotalNetAmount,
					LineItem14.mmAcceptedTotalNetAmount, LineItem13.mmLineItemsTotalAmount, LineItem13.mmTotalNetAmount, LineItem15.mmLineItemsTotalAmount, LineItem15.mmTotalNetAmount, FinancialItem1.mmTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalInvoiceAmount";
			definition = "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getTotalInvoiceAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setTotalInvoiceAmount(value);
		}
	};
	protected CurrencyCode invoiceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyCode
	 * TradeSettlement1.mmInvoiceCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#mmCurrency
	 * FinancialItemParameters1.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code specifying the currency of the invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyCode> mmInvoiceCurrency = new MMBusinessAttribute<Invoice, CurrencyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmInvoiceCurrencyCode, FinancialItemParameters1.mmCurrency);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceCurrency";
			definition = "Code specifying the currency of the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(Invoice obj) {
			return obj.getInvoiceCurrency();
		}

		@Override
		public void setValue(Invoice obj, CurrencyCode value) {
			obj.setInvoiceCurrency(value);
		}
	};
	protected List<DateTimePeriod> periodCovered;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmRelatedInvoice
	 * DateTimePeriod.mmRelatedInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmBillingPeriod
	 * TradeSettlement1.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmFromToDate
	 * BillingStatement1.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#mmBillingPeriod
	 * BillingReport1.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#mmBillingPeriod
	 * BillingCancellationReport1.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#mmBillingPeriod
	 * BillingSearchCriteria1.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmFromToDate
	 * BillingStatement2.mmFromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria2#mmBillingPeriod
	 * BillingSearchCriteria2.mmBillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport2#mmBillingPeriod
	 * BillingReport2.mmBillingPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the period covered by an invoice for instance for recurring services."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<DateTimePeriod>> mmPeriodCovered = new MMBusinessAssociationEnd<Invoice, List<DateTimePeriod>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmBillingPeriod, BillingStatement1.mmFromToDate, BillingReport1.mmBillingPeriod, BillingCancellationReport1.mmBillingPeriod, BillingSearchCriteria1.mmBillingPeriod,
					BillingStatement2.mmFromToDate, BillingSearchCriteria2.mmBillingPeriod, BillingReport2.mmBillingPeriod);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodCovered";
			definition = "Specifies the period covered by an invoice for instance for recurring services.";
			minOccurs = 0;
			opposite_lazy = () -> DateTimePeriod.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> DateTimePeriod.mmObject();
		}

		@Override
		public List<DateTimePeriod> getValue(Invoice obj) {
			return obj.getPeriodCovered();
		}

		@Override
		public void setValue(Invoice obj, List<DateTimePeriod> value) {
			obj.setPeriodCovered(value);
		}
	};
	protected List<CommercialTradeSettlement> tradeSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmInvoice
	 * CommercialTradeSettlement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement
	 * CommercialTradeSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the process which takes place to settle an invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<CommercialTradeSettlement>> mmTradeSettlement = new MMBusinessAssociationEnd<Invoice, List<CommercialTradeSettlement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the process which takes place to settle an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> CommercialTradeSettlement.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
		}

		@Override
		public List<CommercialTradeSettlement> getValue(Invoice obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(Invoice obj, List<CommercialTradeSettlement> value) {
			obj.setTradeSettlement(value);
		}
	};
	protected CurrencyAndAmount totalCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmChargeTotalAmount
	 * SettlementMonetarySummation1.mmChargeTotalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Algebraical sum of charges related to the invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmTotalCharge = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmChargeTotalAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalCharge";
			definition = "Algebraical sum of charges related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getTotalCharge();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setTotalCharge(value);
		}
	};
	protected CurrencyAndAmount totalPrepaidAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTotalPrepaidAmount
	 * SettlementMonetarySummation1.mmTotalPrepaidAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPrepaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total prepaid amount being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmTotalPrepaidAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmTotalPrepaidAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getTotalPrepaidAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setTotalPrepaidAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.LineItem> lineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmInvoice
	 * LineItem.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#mmLineItemDetails
	 * LineItem5.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#mmLineItemDetails
	 * LineItem7.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#mmLineItemDetails
	 * LineItem6.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmLineItemDetails
	 * LineItem8.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#mmCommercialLineItems
	 * LineItem4.mmCommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#mmCommercialLineItems
	 * LineItem9.mmCommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#mmLineItem
	 * CertificateDataSet1.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#mmLineItemDetails
	 * LineItem11.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#mmLineItem
	 * CertificateDataSet2.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#mmCommercialLineItems
	 * LineItem12.mmCommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmLineItem
	 * CardPaymentInvoice1.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmLineItemDetails
	 * LineItem14.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#mmLineItemDetails
	 * LineItem13.mmLineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#mmCommercialLineItems
	 * LineItem15.mmCommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmLineItem
	 * CardPaymentInvoice2.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmLineItem
	 * CardPaymentInvoice3.mmLineItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<LineItem>> mmLineItem = new MMBusinessAssociationEnd<Invoice, List<LineItem>>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem5.mmLineItemDetails, LineItem7.mmLineItemDetails, LineItem6.mmLineItemDetails, LineItem8.mmLineItemDetails, LineItem4.mmCommercialLineItems, LineItem9.mmCommercialLineItems,
					CertificateDataSet1.mmLineItem, LineItem11.mmLineItemDetails, CertificateDataSet2.mmLineItem, LineItem12.mmCommercialLineItems, CardPaymentInvoice1.mmLineItem, LineItem14.mmLineItemDetails, LineItem13.mmLineItemDetails,
					LineItem15.mmCommercialLineItems, CardPaymentInvoice2.mmLineItem, CardPaymentInvoice3.mmLineItem);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}

		@Override
		public List<LineItem> getValue(Invoice obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(Invoice obj, List<LineItem> value) {
			obj.setLineItem(value);
		}
	};
	protected CurrencyAndAmount totalNetAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#mmOrderedTotalNetAmount
	 * LineItem6.mmOrderedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#mmOrderedTotalNetAmount
	 * LineItem8.mmOrderedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#mmOrderedTotalNetAmount
	 * LineItem14.mmOrderedTotalNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount after taxes, adjustments and charges."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmTotalNetAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem6.mmOrderedTotalNetAmount, LineItem8.mmOrderedTotalNetAmount, LineItem14.mmOrderedTotalNetAmount);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNetAmount";
			definition = "Total amount after taxes, adjustments and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getTotalNetAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setTotalNetAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedInvoice
	 * CurrencyExchange.mmRelatedInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmInvoiceCurrencyExchange
	 * TradeSettlement1.mmInvoiceCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmCurrencyExchange
	 * BillingStatement1.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAgreedRate
	 * FinancingItemList1.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmCurrencyExchange
	 * BillingStatement2.mmCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies currency exchange information which is used when currency conversion is necessary."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<CurrencyExchange>> mmCurrencyExchange = new MMBusinessAssociationEnd<Invoice, List<CurrencyExchange>>() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmInvoiceCurrencyExchange, BillingStatement1.mmCurrencyExchange, FinancingItemList1.mmAgreedRate, BillingStatement2.mmCurrencyExchange);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies currency exchange information which is used when currency conversion is necessary.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}

		@Override
		public List<CurrencyExchange> getValue(Invoice obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(Invoice obj, List<CurrencyExchange> value) {
			obj.setCurrencyExchange(value);
		}
	};
	protected ExternalBillingCompensationTypeCode billingCompensationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalBillingCompensationTypeCode
	 * ExternalBillingCompensationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice#mmCode
	 * BillingCompensationType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice#mmProprietary
	 * BillingCompensationType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCompensation1#mmType
	 * BillingCompensation1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingCompensationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of billing compensation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, ExternalBillingCompensationTypeCode> mmBillingCompensationType = new MMBusinessAttribute<Invoice, ExternalBillingCompensationTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BillingCompensationType1Choice.mmCode, BillingCompensationType1Choice.mmProprietary, BillingCompensation1.mmType);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationType";
			definition = "Defines the type of billing compensation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBillingCompensationTypeCode.mmObject();
		}

		@Override
		public ExternalBillingCompensationTypeCode getValue(Invoice obj) {
			return obj.getBillingCompensationType();
		}

		@Override
		public void setValue(Invoice obj, ExternalBillingCompensationTypeCode value) {
			obj.setBillingCompensationType(value);
		}
	};
	protected List<com.tools20022.repository.entity.InvoicePartyRole> invoicePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoicePartyRole#mmInvoice
	 * InvoicePartyRole.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvoicePartyRole
	 * InvoicePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role played by a party in the context of invoices."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<InvoicePartyRole>> mmInvoicePartyRole = new MMBusinessAssociationEnd<Invoice, List<InvoicePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoicePartyRole";
			definition = "Role played by a party in the context of invoices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmObject();
		}

		@Override
		public List<InvoicePartyRole> getValue(Invoice obj) {
			return obj.getInvoicePartyRole();
		}

		@Override
		public void setValue(Invoice obj, List<InvoicePartyRole> value) {
			obj.setInvoicePartyRole(value);
		}
	};
	protected Invoice originalInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmRelatedInvoice
	 * Invoice.mmRelatedInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#mmOriginalInvoiceInformation
	 * InvoiceFinancingDetails1.mmOriginalInvoiceInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invoice to which another invoice is associated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, Invoice> mmOriginalInvoice = new MMBusinessAssociationEnd<Invoice, Invoice>() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceFinancingDetails1.mmOriginalInvoiceInformation);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalInvoice";
			definition = "Invoice to which another invoice is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Invoice.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public Invoice getValue(Invoice obj) {
			return obj.getOriginalInvoice();
		}

		@Override
		public void setValue(Invoice obj, Invoice value) {
			obj.setOriginalInvoice(value);
		}
	};
	protected List<Invoice> relatedInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmOriginalInvoice
	 * Invoice.mmOriginalInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies another invoice linked to the current one, for instance a previous invoice for which a credit note is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<Invoice>> mmRelatedInvoice = new MMBusinessAssociationEnd<Invoice, List<Invoice>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Specifies another invoice linked to the current one, for instance a previous invoice for which a credit note is available.";
			minOccurs = 0;
			opposite_lazy = () -> Invoice.mmOriginalInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Invoice.mmObject();
		}

		@Override
		public List<Invoice> getValue(Invoice obj) {
			return obj.getRelatedInvoice();
		}

		@Override
		public void setValue(Invoice obj, List<Invoice> value) {
			obj.setRelatedInvoice(value);
		}
	};
	protected InvoiceFinancingAgreement invoiceFinancingTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoice
	 * InvoiceFinancingAgreement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmTotalRequestFinancing
	 * FinancingItemList1.mmTotalRequestFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmFinancingStatus
	 * FinancialItem1.mmFinancingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceFinancingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financing transaction related to an invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, InvoiceFinancingAgreement> mmInvoiceFinancingTransaction = new MMBusinessAssociationEnd<Invoice, InvoiceFinancingAgreement>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingItemList1.mmTotalRequestFinancing, FinancialItem1.mmFinancingStatus);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Financing transaction related to an invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvoiceFinancingAgreement.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
		}

		@Override
		public InvoiceFinancingAgreement getValue(Invoice obj) {
			return obj.getInvoiceFinancingTransaction();
		}

		@Override
		public void setValue(Invoice obj, InvoiceFinancingAgreement value) {
			obj.setInvoiceFinancingTransaction(value);
		}
	};
	protected CurrencyAndAmount billingCompensationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BillingCompensationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the compensation amount of an incorrect billing."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, CurrencyAndAmount> mmBillingCompensationAmount = new MMBusinessAttribute<Invoice, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationAmount";
			definition = "Specifies the compensation amount of an incorrect billing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Invoice obj) {
			return obj.getBillingCompensationAmount();
		}

		@Override
		public void setValue(Invoice obj, CurrencyAndAmount value) {
			obj.setBillingCompensationAmount(value);
		}
	};
	protected InvoiceStatus invoiceStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceStatus#mmInvoice
	 * InvoiceStatus.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvoiceStatus
	 * InvoiceStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the invoice or of the billing process."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, com.tools20022.repository.entity.InvoiceStatus> mmInvoiceStatus = new MMBusinessAssociationEnd<Invoice, com.tools20022.repository.entity.InvoiceStatus>() {
		{
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceStatus";
			definition = "Status of the invoice or of the billing process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.InvoiceStatus getValue(Invoice obj) {
			return obj.getInvoiceStatus();
		}

		@Override
		public void setValue(Invoice obj, com.tools20022.repository.entity.InvoiceStatus value) {
			obj.setInvoiceStatus(value);
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInvoiceReconciliation
	 * Payment.mmInvoiceReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#mmPaymentMeans
	 * ReconciliationList1.mmPaymentMeans}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment related to an invoice."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Invoice, List<Payment>> mmPayment = new MMBusinessAssociationEnd<Invoice, List<Payment>>() {
		{
			derivation_lazy = () -> Arrays.asList(ReconciliationList1.mmPaymentMeans);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment related to an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmInvoiceReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}

		@Override
		public List<Payment> getValue(Invoice obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(Invoice obj, List<Payment> value) {
			obj.setPayment(value);
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1#mmCreditDebitIndicator
	 * FinancialItem1.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Invoice
	 * Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the direction of the invoice amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Invoice, DebitCreditCode> mmCreditDebitIndicator = new MMBusinessAttribute<Invoice, DebitCreditCode>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialItem1.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> Invoice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates the direction of the invoice amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		@Override
		public DebitCreditCode getValue(Invoice obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(Invoice obj, DebitCreditCode value) {
			obj.setCreditDebitIndicator(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Invoice";
				definition = "General information about an invoice, such as number, issue date date and monetary amounts.";
				associationDomain_lazy = () -> Arrays.asList(DateTimePeriod.mmRelatedInvoice, com.tools20022.repository.entity.Payment.mmInvoiceReconciliation, com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice,
						Invoice.mmOriginalInvoice, Invoice.mmRelatedInvoice, com.tools20022.repository.entity.InvoicePartyRole.mmInvoice, InvoiceFinancingAgreement.mmInvoice, com.tools20022.repository.entity.LineItem.mmInvoice,
						CommercialTradeSettlement.mmInvoice, com.tools20022.repository.entity.InvoiceStatus.mmInvoice);
				derivationElement_lazy = () -> Arrays.asList(InvoiceLegalIssue1.mmInvoiceLegalStatement, BillingReport1.mmRegulatoryData, BillingReport1.mmInvoiceTotals, BillingReport1.mmServiceCategoryTotals,
						BillingCancellationReport1.mmRegulatoryData, ReconciliationList1.mmParameters, ReconciliationList1.mmItem, FinancialItem1.mmItemContext, FinancialItem1.mmFinancialDocumentReference,
						FinancialItemParameters1.mmRelatedItem, BillingReport2.mmRegulatoryData, BillingReport2.mmInvoiceTotals, BillingReport2.mmServiceCategoryTotals);
				superType_lazy = () -> FinancialDocument.mmObject();
				element_lazy = () -> Arrays.asList(Invoice.mmCreditDebitNoteAmount, Invoice.mmTotalTaxAmount, Invoice.mmTotalInvoiceAmount, Invoice.mmInvoiceCurrency, Invoice.mmPeriodCovered, Invoice.mmTradeSettlement,
						Invoice.mmTotalCharge, Invoice.mmTotalPrepaidAmount, Invoice.mmLineItem, Invoice.mmTotalNetAmount, Invoice.mmCurrencyExchange, Invoice.mmBillingCompensationType, Invoice.mmInvoicePartyRole,
						Invoice.mmOriginalInvoice, Invoice.mmRelatedInvoice, Invoice.mmInvoiceFinancingTransaction, Invoice.mmBillingCompensationAmount, Invoice.mmInvoiceStatus, Invoice.mmPayment, Invoice.mmCreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(InvoiceTotals1.mmObject(), OriginalInvoiceInformation1.mmObject(), InvoiceFinancingDetails1.mmObject(), SettlementMonetarySummation1.mmObject(),
						InvoiceIdentification1.mmObject(), BillingCompensationType1Choice.mmObject(), BillingStatement1.mmObject(), InvoiceLegalIssue1.mmObject(), InvoiceTotals2.mmObject(), ServiceCategoryTotals1.mmObject(),
						BillingReport1.mmObject(), BillingCancellationReport1.mmObject(), BillingSearchCriteria1.mmObject(), FinancingItemList1.mmObject(), FinancialItemParameters1.mmObject(), BillingStatement2.mmObject(),
						BillingSearchCriteria2.mmObject(), BillingReport2.mmObject(), ServiceCategoryTotals2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Invoice.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getCreditDebitNoteAmount() {
		return creditDebitNoteAmount;
	}

	public Invoice setCreditDebitNoteAmount(CurrencyAndAmount creditDebitNoteAmount) {
		this.creditDebitNoteAmount = Objects.requireNonNull(creditDebitNoteAmount);
		return this;
	}

	public CurrencyAndAmount getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public Invoice setTotalTaxAmount(CurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = Objects.requireNonNull(totalTaxAmount);
		return this;
	}

	public CurrencyAndAmount getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public Invoice setTotalInvoiceAmount(CurrencyAndAmount totalInvoiceAmount) {
		this.totalInvoiceAmount = Objects.requireNonNull(totalInvoiceAmount);
		return this;
	}

	public CurrencyCode getInvoiceCurrency() {
		return invoiceCurrency;
	}

	public Invoice setInvoiceCurrency(CurrencyCode invoiceCurrency) {
		this.invoiceCurrency = Objects.requireNonNull(invoiceCurrency);
		return this;
	}

	public List<DateTimePeriod> getPeriodCovered() {
		return periodCovered == null ? periodCovered = new ArrayList<>() : periodCovered;
	}

	public Invoice setPeriodCovered(List<DateTimePeriod> periodCovered) {
		this.periodCovered = Objects.requireNonNull(periodCovered);
		return this;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement == null ? tradeSettlement = new ArrayList<>() : tradeSettlement;
	}

	public Invoice setTradeSettlement(List<CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public CurrencyAndAmount getTotalCharge() {
		return totalCharge;
	}

	public Invoice setTotalCharge(CurrencyAndAmount totalCharge) {
		this.totalCharge = Objects.requireNonNull(totalCharge);
		return this;
	}

	public CurrencyAndAmount getTotalPrepaidAmount() {
		return totalPrepaidAmount;
	}

	public Invoice setTotalPrepaidAmount(CurrencyAndAmount totalPrepaidAmount) {
		this.totalPrepaidAmount = Objects.requireNonNull(totalPrepaidAmount);
		return this;
	}

	public List<LineItem> getLineItem() {
		return lineItem == null ? lineItem = new ArrayList<>() : lineItem;
	}

	public Invoice setLineItem(List<com.tools20022.repository.entity.LineItem> lineItem) {
		this.lineItem = Objects.requireNonNull(lineItem);
		return this;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public Invoice setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = Objects.requireNonNull(totalNetAmount);
		return this;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange == null ? currencyExchange = new ArrayList<>() : currencyExchange;
	}

	public Invoice setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = Objects.requireNonNull(currencyExchange);
		return this;
	}

	public ExternalBillingCompensationTypeCode getBillingCompensationType() {
		return billingCompensationType;
	}

	public Invoice setBillingCompensationType(ExternalBillingCompensationTypeCode billingCompensationType) {
		this.billingCompensationType = Objects.requireNonNull(billingCompensationType);
		return this;
	}

	public List<InvoicePartyRole> getInvoicePartyRole() {
		return invoicePartyRole == null ? invoicePartyRole = new ArrayList<>() : invoicePartyRole;
	}

	public Invoice setInvoicePartyRole(List<com.tools20022.repository.entity.InvoicePartyRole> invoicePartyRole) {
		this.invoicePartyRole = Objects.requireNonNull(invoicePartyRole);
		return this;
	}

	public Invoice getOriginalInvoice() {
		return originalInvoice;
	}

	public Invoice setOriginalInvoice(Invoice originalInvoice) {
		this.originalInvoice = Objects.requireNonNull(originalInvoice);
		return this;
	}

	public List<Invoice> getRelatedInvoice() {
		return relatedInvoice == null ? relatedInvoice = new ArrayList<>() : relatedInvoice;
	}

	public Invoice setRelatedInvoice(List<Invoice> relatedInvoice) {
		this.relatedInvoice = Objects.requireNonNull(relatedInvoice);
		return this;
	}

	public InvoiceFinancingAgreement getInvoiceFinancingTransaction() {
		return invoiceFinancingTransaction;
	}

	public Invoice setInvoiceFinancingTransaction(InvoiceFinancingAgreement invoiceFinancingTransaction) {
		this.invoiceFinancingTransaction = Objects.requireNonNull(invoiceFinancingTransaction);
		return this;
	}

	public CurrencyAndAmount getBillingCompensationAmount() {
		return billingCompensationAmount;
	}

	public Invoice setBillingCompensationAmount(CurrencyAndAmount billingCompensationAmount) {
		this.billingCompensationAmount = Objects.requireNonNull(billingCompensationAmount);
		return this;
	}

	public InvoiceStatus getInvoiceStatus() {
		return invoiceStatus;
	}

	public Invoice setInvoiceStatus(com.tools20022.repository.entity.InvoiceStatus invoiceStatus) {
		this.invoiceStatus = Objects.requireNonNull(invoiceStatus);
		return this;
	}

	public List<Payment> getPayment() {
		return payment == null ? payment = new ArrayList<>() : payment;
	}

	public Invoice setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public Invoice setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = Objects.requireNonNull(creditDebitIndicator);
		return this;
	}
}