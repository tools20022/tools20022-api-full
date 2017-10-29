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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.BillingCompensationType1Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.ExternalBillingCompensationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.FinancialDocument;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#CreditDebitNoteAmount
 * Invoice.CreditDebitNoteAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TotalTaxAmount
 * Invoice.TotalTaxAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TotalInvoiceAmount
 * Invoice.TotalInvoiceAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#InvoiceCurrency
 * Invoice.InvoiceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#PeriodCovered
 * Invoice.PeriodCovered}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TradeSettlement
 * Invoice.TradeSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TotalCharge
 * Invoice.TotalCharge}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TotalPrepaidAmount
 * Invoice.TotalPrepaidAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#LineItem
 * Invoice.LineItem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#TotalNetAmount
 * Invoice.TotalNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
 * Invoice.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#BillingCompensationType
 * Invoice.BillingCompensationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#InvoicePartyRole
 * Invoice.InvoicePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#OriginalInvoice
 * Invoice.OriginalInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#RelatedInvoice
 * Invoice.RelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#InvoiceFinancingTransaction
 * Invoice.InvoiceFinancingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#BillingCompensationAmount
 * Invoice.BillingCompensationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#InvoiceStatus
 * Invoice.InvoiceStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#Payment
 * Invoice.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Invoice#CreditDebitIndicator
 * Invoice.CreditDebitIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvoice
 * DateTimePeriod.RelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Payment#InvoiceReconciliation
 * Payment.InvoiceReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedInvoice
 * CurrencyExchange.RelatedInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#OriginalInvoice
 * Invoice.OriginalInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#RelatedInvoice
 * Invoice.RelatedInvoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoicePartyRole#Invoice
 * InvoicePartyRole.Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Invoice
 * InvoiceFinancingAgreement.Invoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LineItem#Invoice
 * LineItem.Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Invoice
 * CommercialTradeSettlement.Invoice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvoiceStatus#Invoice
 * InvoiceStatus.Invoice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceLegalIssue1#InvoiceLegalStatement
 * InvoiceLegalIssue1.InvoiceLegalStatement}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#RegulatoryData
 * BillingReport1.RegulatoryData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingReport1#InvoiceTotals
 * BillingReport1.InvoiceTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingReport1#ServiceCategoryTotals
 * BillingReport1.ServiceCategoryTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#RegulatoryData
 * BillingCancellationReport1.RegulatoryData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#Parameters
 * ReconciliationList1.Parameters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReconciliationList1#Item
 * ReconciliationList1.Item}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#ItemContext
 * FinancialItem1.ItemContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItem1#FinancialDocumentReference
 * FinancialItem1.FinancialDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#RelatedItem
 * FinancialItemParameters1.RelatedItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.FinancialDocument
 * FinancialDocument}</li>
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
	/**
	 * Amount of credit/debit note related to the invoice.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#CreditNoteAmount
	 * RemittanceAmount1.CreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#CreditNoteAmount
	 * RemittanceAmount2.CreditNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#CreditDebitNoteAmount
	 * InvoiceRequestInformation1.CreditDebitNoteAmount}</li>
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
	public static final MMBusinessAttribute CreditDebitNoteAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount1.CreditNoteAmount, com.tools20022.repository.msg.RemittanceAmount2.CreditNoteAmount,
					com.tools20022.repository.msg.InvoiceRequestInformation1.CreditDebitNoteAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitNoteAmount";
			definition = "Amount of credit/debit note related to the invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sum of all tax amounts related to the invoice. It is derived from the
	 * association between line item and tax.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount1#TaxAmount
	 * RemittanceAmount1.TaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceAmount2#TaxAmount
	 * RemittanceAmount2.TaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#TaxTotalAmount
	 * SettlementMonetarySummation1.TaxTotalAmount}</li>
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
	public static final MMBusinessAttribute TotalTaxAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RemittanceAmount1.TaxAmount, com.tools20022.repository.msg.RemittanceAmount2.TaxAmount,
					com.tools20022.repository.msg.SettlementMonetarySummation1.TaxTotalAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalTaxAmount";
			definition = "Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Total amount of the invoice, being the sum of total invoice lines
	 * amounts, total invoice additional amounts (allowances and charges) and
	 * total tax amounts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalInvoiceInformation1#TotalInvoiceAmount
	 * OriginalInvoiceInformation1.TotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#GrandTotalAmount
	 * SettlementMonetarySummation1.GrandTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem5#LineItemsTotalAmount
	 * LineItem5.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#TotalNetAmount
	 * LineItem5.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#LineItemsTotalAmount
	 * LineItem7.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#TotalNetAmount
	 * LineItem7.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem6#AcceptedTotalNetAmount
	 * LineItem6.AcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#AcceptedTotalNetAmount
	 * LineItem8.AcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#LineItemsTotalAmount
	 * LineItem4.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#TotalNetAmount
	 * LineItem4.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#LineItemsTotalAmount
	 * LineItem9.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#TotalNetAmount
	 * LineItem9.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#LineItemsTotalAmount
	 * LineItem11.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#TotalNetAmount
	 * LineItem11.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#LineItemsTotalAmount
	 * LineItem12.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#TotalNetAmount
	 * LineItem12.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#AcceptedTotalNetAmount
	 * LineItem14.AcceptedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#LineItemsTotalAmount
	 * LineItem13.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#TotalNetAmount
	 * LineItem13.TotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#LineItemsTotalAmount
	 * LineItem15.LineItemsTotalAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#TotalNetAmount
	 * LineItem15.TotalNetAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.FinancialItem1#TotalAmount
	 * FinancialItem1.TotalAmount}</li>
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
	public static final MMBusinessAttribute TotalInvoiceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalInvoiceInformation1.TotalInvoiceAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.GrandTotalAmount,
					com.tools20022.repository.msg.LineItem5.LineItemsTotalAmount, com.tools20022.repository.msg.LineItem5.TotalNetAmount, com.tools20022.repository.msg.LineItem7.LineItemsTotalAmount,
					com.tools20022.repository.msg.LineItem7.TotalNetAmount, com.tools20022.repository.msg.LineItem6.AcceptedTotalNetAmount, com.tools20022.repository.msg.LineItem8.AcceptedTotalNetAmount,
					com.tools20022.repository.msg.LineItem4.LineItemsTotalAmount, com.tools20022.repository.msg.LineItem4.TotalNetAmount, com.tools20022.repository.msg.LineItem9.LineItemsTotalAmount,
					com.tools20022.repository.msg.LineItem9.TotalNetAmount, com.tools20022.repository.msg.LineItem11.LineItemsTotalAmount, com.tools20022.repository.msg.LineItem11.TotalNetAmount,
					com.tools20022.repository.msg.LineItem12.LineItemsTotalAmount, com.tools20022.repository.msg.LineItem12.TotalNetAmount, com.tools20022.repository.msg.LineItem14.AcceptedTotalNetAmount,
					com.tools20022.repository.msg.LineItem13.LineItemsTotalAmount, com.tools20022.repository.msg.LineItem13.TotalNetAmount, com.tools20022.repository.msg.LineItem15.LineItemsTotalAmount,
					com.tools20022.repository.msg.LineItem15.TotalNetAmount, com.tools20022.repository.msg.FinancialItem1.TotalAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalInvoiceAmount";
			definition = "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Code specifying the currency of the invoice.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#InvoiceCurrencyCode
	 * TradeSettlement1.InvoiceCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItemParameters1#Currency
	 * FinancialItemParameters1.Currency}</li>
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
	public static final MMBusinessAttribute InvoiceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.InvoiceCurrencyCode, com.tools20022.repository.msg.FinancialItemParameters1.Currency);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceCurrency";
			definition = "Code specifying the currency of the invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies the period covered by an invoice for instance for recurring
	 * services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#RelatedInvoice
	 * DateTimePeriod.RelatedInvoice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#BillingPeriod
	 * TradeSettlement1.BillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#FromToDate
	 * BillingStatement1.FromToDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingReport1#BillingPeriod
	 * BillingReport1.BillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingCancellationReport1#BillingPeriod
	 * BillingCancellationReport1.BillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingSearchCriteria1#BillingPeriod
	 * BillingSearchCriteria1.BillingPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#FromToDate
	 * BillingStatement2.FromToDate}</li>
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
	public static final MMBusinessAssociationEnd PeriodCovered = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.BillingPeriod, com.tools20022.repository.msg.BillingStatement1.FromToDate, com.tools20022.repository.msg.BillingReport1.BillingPeriod,
					com.tools20022.repository.msg.BillingCancellationReport1.BillingPeriod, com.tools20022.repository.msg.BillingSearchCriteria1.BillingPeriod, com.tools20022.repository.msg.BillingStatement2.FromToDate);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PeriodCovered";
			definition = "Specifies the period covered by an invoice for instance for recurring services.";
			minOccurs = 0;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the process which takes place to settle an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#Invoice
	 * CommercialTradeSettlement.Invoice}</li>
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
	public static final MMBusinessAssociationEnd TradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the process which takes place to settle an invoice.";
			minOccurs = 0;
			type_lazy = () -> CommercialTradeSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Algebraical sum of charges related to the invoice.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#ChargeTotalAmount
	 * SettlementMonetarySummation1.ChargeTotalAmount}</li>
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
	public static final MMBusinessAttribute TotalCharge = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementMonetarySummation1.ChargeTotalAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalCharge";
			definition = "Algebraical sum of charges related to the invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Monetary value of the total prepaid amount being reported for this
	 * settlement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#TotalPrepaidAmount
	 * SettlementMonetarySummation1.TotalPrepaidAmount}</li>
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
	public static final MMBusinessAttribute TotalPrepaidAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementMonetarySummation1.TotalPrepaidAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Unit of information showing the related provision of products and/or
	 * services and monetary summations reported as a discrete line item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#Invoice
	 * LineItem.Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LineItem LineItem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#LineItemDetails
	 * LineItem5.LineItemDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#LineItemDetails
	 * LineItem7.LineItemDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem6#LineItemDetails
	 * LineItem6.LineItemDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem8#LineItemDetails
	 * LineItem8.LineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem4#CommercialLineItems
	 * LineItem4.CommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem9#CommercialLineItems
	 * LineItem9.CommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet1#LineItem
	 * CertificateDataSet1.LineItem}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#LineItemDetails
	 * LineItem11.LineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateDataSet2#LineItem
	 * CertificateDataSet2.LineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem12#CommercialLineItems
	 * LineItem12.CommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#LineItem
	 * CardPaymentInvoice1.LineItem}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem14#LineItemDetails
	 * LineItem14.LineItemDetails}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#LineItemDetails
	 * LineItem13.LineItemDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem15#CommercialLineItems
	 * LineItem15.CommercialLineItems}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#LineItem
	 * CardPaymentInvoice2.LineItem}</li>
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
	public static final MMBusinessAssociationEnd LineItem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.LineItemDetails, com.tools20022.repository.msg.LineItem7.LineItemDetails, com.tools20022.repository.msg.LineItem6.LineItemDetails,
					com.tools20022.repository.msg.LineItem8.LineItemDetails, com.tools20022.repository.msg.LineItem4.CommercialLineItems, com.tools20022.repository.msg.LineItem9.CommercialLineItems,
					com.tools20022.repository.msg.CertificateDataSet1.LineItem, com.tools20022.repository.msg.LineItem11.LineItemDetails, com.tools20022.repository.msg.CertificateDataSet2.LineItem,
					com.tools20022.repository.msg.LineItem12.CommercialLineItems, com.tools20022.repository.msg.CardPaymentInvoice1.LineItem, com.tools20022.repository.msg.LineItem14.LineItemDetails,
					com.tools20022.repository.msg.LineItem13.LineItemDetails, com.tools20022.repository.msg.LineItem15.CommercialLineItems, com.tools20022.repository.msg.CardPaymentInvoice2.LineItem);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Total amount after taxes, adjustments and charges.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.LineItem6#OrderedTotalNetAmount
	 * LineItem6.OrderedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem8#OrderedTotalNetAmount
	 * LineItem8.OrderedTotalNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem14#OrderedTotalNetAmount
	 * LineItem14.OrderedTotalNetAmount}</li>
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
	public static final MMBusinessAttribute TotalNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem6.OrderedTotalNetAmount, com.tools20022.repository.msg.LineItem8.OrderedTotalNetAmount, com.tools20022.repository.msg.LineItem14.OrderedTotalNetAmount);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalNetAmount";
			definition = "Total amount after taxes, adjustments and charges.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies currency exchange information which is used when currency
	 * conversion is necessary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedInvoice
	 * CurrencyExchange.RelatedInvoice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#InvoiceCurrencyExchange
	 * TradeSettlement1.InvoiceCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#CurrencyExchange
	 * BillingStatement1.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#AgreedRate
	 * FinancingItemList1.AgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#CurrencyExchange
	 * BillingStatement2.CurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.InvoiceCurrencyExchange, com.tools20022.repository.msg.BillingStatement1.CurrencyExchange,
					com.tools20022.repository.msg.FinancingItemList1.AgreedRate, com.tools20022.repository.msg.BillingStatement2.CurrencyExchange);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies currency exchange information which is used when currency conversion is necessary.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the type of billing compensation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice#Code
	 * BillingCompensationType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BillingCompensationType1Choice#Proprietary
	 * BillingCompensationType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingCompensation1#Type
	 * BillingCompensation1.Type}</li>
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
	public static final MMBusinessAttribute BillingCompensationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BillingCompensationType1Choice.Code, com.tools20022.repository.choice.BillingCompensationType1Choice.Proprietary,
					com.tools20022.repository.msg.BillingCompensation1.Type);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationType";
			definition = "Defines the type of billing compensation.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalBillingCompensationTypeCode.mmObject();
		}
	};
	/**
	 * Role played by a party in the context of invoices.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoicePartyRole#Invoice
	 * InvoicePartyRole.Invoice}</li>
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
	public static final MMBusinessAssociationEnd InvoicePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoicePartyRole";
			definition = "Role played by a party in the context of invoices.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invoice to which another invoice is associated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#RelatedInvoice
	 * Invoice.RelatedInvoice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvoiceFinancingDetails1#OriginalInvoiceInformation
	 * InvoiceFinancingDetails1.OriginalInvoiceInformation}</li>
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
	public static final MMBusinessAssociationEnd OriginalInvoice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceFinancingDetails1.OriginalInvoiceInformation);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalInvoice";
			definition = "Invoice to which another invoice is associated.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.RelatedInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies another invoice linked to the current one, for instance a
	 * previous invoice for which a credit note is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#OriginalInvoice
	 * Invoice.OriginalInvoice}</li>
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
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Specifies another invoice linked to the current one, for instance a previous invoice for which a credit note is available.";
			minOccurs = 0;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.OriginalInvoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Financing transaction related to an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#Invoice
	 * InvoiceFinancingAgreement.Invoice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#TotalRequestFinancing
	 * FinancingItemList1.TotalRequestFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1#FinancingStatus
	 * FinancialItem1.FinancingStatus}</li>
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
	public static final MMBusinessAssociationEnd InvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingItemList1.TotalRequestFinancing, com.tools20022.repository.msg.FinancialItem1.FinancingStatus);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Financing transaction related to an invoice.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvoiceFinancingAgreement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the compensation amount of an incorrect billing.
	 * <p>
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
	public static final MMBusinessAttribute BillingCompensationAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationAmount";
			definition = "Specifies the compensation amount of an incorrect billing.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Status of the invoice or of the billing process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceStatus#Invoice
	 * InvoiceStatus.Invoice}</li>
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
	public static final MMBusinessAssociationEnd InvoiceStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InvoiceStatus";
			definition = "Status of the invoice or of the billing process.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.Invoice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment related to an invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#InvoiceReconciliation
	 * Payment.InvoiceReconciliation}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ReconciliationList1#PaymentMeans
	 * ReconciliationList1.PaymentMeans}</li>
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
	public static final MMBusinessAssociationEnd Payment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReconciliationList1.PaymentMeans);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment related to an invoice.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.InvoiceReconciliation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates the direction of the invoice amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialItem1#CreditDebitIndicator
	 * FinancialItem1.CreditDebitIndicator}</li>
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
	public static final MMBusinessAttribute CreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialItem1.CreditDebitIndicator);
			elementContext_lazy = () -> Invoice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates the direction of the invoice amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Invoice";
				definition = "General information about an invoice, such as number, issue date date and monetary amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.RelatedInvoice, com.tools20022.repository.entity.Payment.InvoiceReconciliation,
						com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice, com.tools20022.repository.entity.Invoice.OriginalInvoice, com.tools20022.repository.entity.Invoice.RelatedInvoice,
						com.tools20022.repository.entity.InvoicePartyRole.Invoice, com.tools20022.repository.entity.InvoiceFinancingAgreement.Invoice, com.tools20022.repository.entity.LineItem.Invoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.Invoice, com.tools20022.repository.entity.InvoiceStatus.Invoice);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceLegalIssue1.InvoiceLegalStatement, com.tools20022.repository.msg.BillingReport1.RegulatoryData,
						com.tools20022.repository.msg.BillingReport1.InvoiceTotals, com.tools20022.repository.msg.BillingReport1.ServiceCategoryTotals, com.tools20022.repository.msg.BillingCancellationReport1.RegulatoryData,
						com.tools20022.repository.msg.ReconciliationList1.Parameters, com.tools20022.repository.msg.ReconciliationList1.Item, com.tools20022.repository.msg.FinancialItem1.ItemContext,
						com.tools20022.repository.msg.FinancialItem1.FinancialDocumentReference, com.tools20022.repository.msg.FinancialItemParameters1.RelatedItem);
				superType_lazy = () -> FinancialDocument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Invoice.CreditDebitNoteAmount, com.tools20022.repository.entity.Invoice.TotalTaxAmount, com.tools20022.repository.entity.Invoice.TotalInvoiceAmount,
						com.tools20022.repository.entity.Invoice.InvoiceCurrency, com.tools20022.repository.entity.Invoice.PeriodCovered, com.tools20022.repository.entity.Invoice.TradeSettlement,
						com.tools20022.repository.entity.Invoice.TotalCharge, com.tools20022.repository.entity.Invoice.TotalPrepaidAmount, com.tools20022.repository.entity.Invoice.LineItem,
						com.tools20022.repository.entity.Invoice.TotalNetAmount, com.tools20022.repository.entity.Invoice.CurrencyExchange, com.tools20022.repository.entity.Invoice.BillingCompensationType,
						com.tools20022.repository.entity.Invoice.InvoicePartyRole, com.tools20022.repository.entity.Invoice.OriginalInvoice, com.tools20022.repository.entity.Invoice.RelatedInvoice,
						com.tools20022.repository.entity.Invoice.InvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.BillingCompensationAmount, com.tools20022.repository.entity.Invoice.InvoiceStatus,
						com.tools20022.repository.entity.Invoice.Payment, com.tools20022.repository.entity.Invoice.CreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(InvoiceTotals1.mmObject(), OriginalInvoiceInformation1.mmObject(), InvoiceFinancingDetails1.mmObject(), SettlementMonetarySummation1.mmObject(),
						InvoiceIdentification1.mmObject(), BillingCompensationType1Choice.mmObject(), BillingStatement1.mmObject(), InvoiceLegalIssue1.mmObject(), InvoiceTotals2.mmObject(), ServiceCategoryTotals1.mmObject(),
						BillingReport1.mmObject(), BillingCancellationReport1.mmObject(), BillingSearchCriteria1.mmObject(), FinancingItemList1.mmObject(), FinancialItemParameters1.mmObject(), BillingStatement2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}