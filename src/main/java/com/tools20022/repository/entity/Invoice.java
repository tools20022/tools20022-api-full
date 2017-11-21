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
import com.tools20022.repository.entity.FinancialDocument;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * </ul>
 * </li>
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
	public static final MMBusinessAttribute mmCreditDebitNoteAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount1.mmCreditNoteAmount, RemittanceAmount2.mmCreditNoteAmount, InvoiceRequestInformation1.mmCreditDebitNoteAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitNoteAmount";
			definition = "Amount of credit/debit note related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getCreditDebitNoteAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalTaxAmount;
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
	public static final MMBusinessAttribute mmTotalTaxAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RemittanceAmount1.mmTaxAmount, RemittanceAmount2.mmTaxAmount, SettlementMonetarySummation1.mmTaxTotalAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalTaxAmount";
			definition = "Sum of all tax amounts related to the invoice. It is derived from the association between line item and tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getTotalTaxAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalInvoiceAmount;
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
	public static final MMBusinessAttribute mmTotalInvoiceAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OriginalInvoiceInformation1.mmTotalInvoiceAmount, SettlementMonetarySummation1.mmGrandTotalAmount, LineItem5.mmLineItemsTotalAmount, LineItem5.mmTotalNetAmount,
					LineItem7.mmLineItemsTotalAmount, LineItem7.mmTotalNetAmount, LineItem6.mmAcceptedTotalNetAmount, LineItem8.mmAcceptedTotalNetAmount, LineItem4.mmLineItemsTotalAmount, LineItem4.mmTotalNetAmount,
					LineItem9.mmLineItemsTotalAmount, LineItem9.mmTotalNetAmount, LineItem11.mmLineItemsTotalAmount, LineItem11.mmTotalNetAmount, LineItem12.mmLineItemsTotalAmount, LineItem12.mmTotalNetAmount,
					LineItem14.mmAcceptedTotalNetAmount, LineItem13.mmLineItemsTotalAmount, LineItem13.mmTotalNetAmount, LineItem15.mmLineItemsTotalAmount, LineItem15.mmTotalNetAmount, FinancialItem1.mmTotalAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalInvoiceAmount";
			definition = "Total amount of the invoice, being the sum of total invoice lines amounts, total invoice additional amounts (allowances and charges) and total tax amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getTotalInvoiceAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode invoiceCurrency;
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
	public static final MMBusinessAttribute mmInvoiceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmInvoiceCurrencyCode, FinancialItemParameters1.mmCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceCurrency";
			definition = "Code specifying the currency of the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getInvoiceCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.DateTimePeriod> periodCovered;
	/**
	 * Specifies the period covered by an invoice for instance for recurring
	 * services.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPeriodCovered = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmBillingPeriod, BillingStatement1.mmFromToDate, BillingReport1.mmBillingPeriod, BillingCancellationReport1.mmBillingPeriod, BillingSearchCriteria1.mmBillingPeriod,
					BillingStatement2.mmFromToDate);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PeriodCovered";
			definition = "Specifies the period covered by an invoice for instance for recurring services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement;
	/**
	 * Specifies the process which takes place to settle an invoice.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTradeSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TradeSettlement";
			definition = "Specifies the process which takes place to settle an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CommercialTradeSettlement.mmObject();
		}
	};
	protected CurrencyAndAmount totalCharge;
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
	public static final MMBusinessAttribute mmTotalCharge = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmChargeTotalAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalCharge";
			definition = "Algebraical sum of charges related to the invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getTotalCharge", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount totalPrepaidAmount;
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
	public static final MMBusinessAttribute mmTotalPrepaidAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementMonetarySummation1.mmTotalPrepaidAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getTotalPrepaidAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.LineItem> lineItem;
	/**
	 * Unit of information showing the related provision of products and/or
	 * services and monetary summations reported as a discrete line item.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmLineItem = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem5.mmLineItemDetails, LineItem7.mmLineItemDetails, LineItem6.mmLineItemDetails, LineItem8.mmLineItemDetails, LineItem4.mmCommercialLineItems, LineItem9.mmCommercialLineItems,
					CertificateDataSet1.mmLineItem, LineItem11.mmLineItemDetails, CertificateDataSet2.mmLineItem, LineItem12.mmCommercialLineItems, CardPaymentInvoice1.mmLineItem, LineItem14.mmLineItemDetails, LineItem13.mmLineItemDetails,
					LineItem15.mmCommercialLineItems, CardPaymentInvoice2.mmLineItem);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LineItem";
			definition = "Unit of information  showing the related  provision of products and/or services and monetary summations reported as a discrete line item.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LineItem.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LineItem.mmObject();
		}
	};
	protected CurrencyAndAmount totalNetAmount;
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
	public static final MMBusinessAttribute mmTotalNetAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem6.mmOrderedTotalNetAmount, LineItem8.mmOrderedTotalNetAmount, LineItem14.mmOrderedTotalNetAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalNetAmount";
			definition = "Total amount after taxes, adjustments and charges.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getTotalNetAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Specifies currency exchange information which is used when currency
	 * conversion is necessary.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(TradeSettlement1.mmInvoiceCurrencyExchange, BillingStatement1.mmCurrencyExchange, FinancingItemList1.mmAgreedRate, BillingStatement2.mmCurrencyExchange);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Specifies currency exchange information which is used when currency conversion is necessary.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected ExternalBillingCompensationTypeCode billingCompensationType;
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
	public static final MMBusinessAttribute mmBillingCompensationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BillingCompensationType1Choice.mmCode, BillingCompensationType1Choice.mmProprietary, BillingCompensation1.mmType);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationType";
			definition = "Defines the type of billing compensation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExternalBillingCompensationTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getBillingCompensationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.InvoicePartyRole> invoicePartyRole;
	/**
	 * Role played by a party in the context of invoices.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvoicePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoicePartyRole";
			definition = "Role played by a party in the context of invoices.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoicePartyRole.mmObject();
		}
	};
	protected Invoice originalInvoice;
	/**
	 * Invoice to which another invoice is associated.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmOriginalInvoice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(InvoiceFinancingDetails1.mmOriginalInvoiceInformation);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalInvoice";
			definition = "Invoice to which another invoice is associated.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmRelatedInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Invoice> relatedInvoice;
	/**
	 * Specifies another invoice linked to the current one, for instance a
	 * previous invoice for which a credit note is available.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Specifies another invoice linked to the current one, for instance a previous invoice for which a credit note is available.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmOriginalInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected InvoiceFinancingAgreement invoiceFinancingTransaction;
	/**
	 * Financing transaction related to an invoice.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvoiceFinancingTransaction = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingItemList1.mmTotalRequestFinancing, FinancialItem1.mmFinancingStatus);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceFinancingTransaction";
			definition = "Financing transaction related to an invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceFinancingAgreement.mmObject();
		}
	};
	protected CurrencyAndAmount billingCompensationAmount;
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
	public static final MMBusinessAttribute mmBillingCompensationAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BillingCompensationAmount";
			definition = "Specifies the compensation amount of an incorrect billing.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getBillingCompensationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvoiceStatus invoiceStatus;
	/**
	 * Status of the invoice or of the billing process.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvoiceStatus = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvoiceStatus";
			definition = "Status of the invoice or of the billing process.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmInvoice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvoiceStatus.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Payment> payment;
	/**
	 * Payment related to an invoice.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmPayment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ReconciliationList1.mmPaymentMeans);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Payment related to an invoice.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmInvoiceReconciliation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected DebitCreditCode creditDebitIndicator;
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
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialItem1.mmCreditDebitIndicator);
			elementContext_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates the direction of the invoice amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Invoice.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Invoice";
				definition = "General information about an invoice, such as number, issue date date and monetary amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DateTimePeriod.mmRelatedInvoice, com.tools20022.repository.entity.Payment.mmInvoiceReconciliation,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice, com.tools20022.repository.entity.Invoice.mmOriginalInvoice, com.tools20022.repository.entity.Invoice.mmRelatedInvoice,
						com.tools20022.repository.entity.InvoicePartyRole.mmInvoice, com.tools20022.repository.entity.InvoiceFinancingAgreement.mmInvoice, com.tools20022.repository.entity.LineItem.mmInvoice,
						com.tools20022.repository.entity.CommercialTradeSettlement.mmInvoice, com.tools20022.repository.entity.InvoiceStatus.mmInvoice);
				derivationElement_lazy = () -> Arrays.asList(InvoiceLegalIssue1.mmInvoiceLegalStatement, BillingReport1.mmRegulatoryData, BillingReport1.mmInvoiceTotals, BillingReport1.mmServiceCategoryTotals,
						BillingCancellationReport1.mmRegulatoryData, ReconciliationList1.mmParameters, ReconciliationList1.mmItem, FinancialItem1.mmItemContext, FinancialItem1.mmFinancialDocumentReference,
						FinancialItemParameters1.mmRelatedItem);
				superType_lazy = () -> FinancialDocument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Invoice.mmCreditDebitNoteAmount, com.tools20022.repository.entity.Invoice.mmTotalTaxAmount, com.tools20022.repository.entity.Invoice.mmTotalInvoiceAmount,
						com.tools20022.repository.entity.Invoice.mmInvoiceCurrency, com.tools20022.repository.entity.Invoice.mmPeriodCovered, com.tools20022.repository.entity.Invoice.mmTradeSettlement,
						com.tools20022.repository.entity.Invoice.mmTotalCharge, com.tools20022.repository.entity.Invoice.mmTotalPrepaidAmount, com.tools20022.repository.entity.Invoice.mmLineItem,
						com.tools20022.repository.entity.Invoice.mmTotalNetAmount, com.tools20022.repository.entity.Invoice.mmCurrencyExchange, com.tools20022.repository.entity.Invoice.mmBillingCompensationType,
						com.tools20022.repository.entity.Invoice.mmInvoicePartyRole, com.tools20022.repository.entity.Invoice.mmOriginalInvoice, com.tools20022.repository.entity.Invoice.mmRelatedInvoice,
						com.tools20022.repository.entity.Invoice.mmInvoiceFinancingTransaction, com.tools20022.repository.entity.Invoice.mmBillingCompensationAmount, com.tools20022.repository.entity.Invoice.mmInvoiceStatus,
						com.tools20022.repository.entity.Invoice.mmPayment, com.tools20022.repository.entity.Invoice.mmCreditDebitIndicator);
				derivationComponent_lazy = () -> Arrays.asList(InvoiceTotals1.mmObject(), OriginalInvoiceInformation1.mmObject(), InvoiceFinancingDetails1.mmObject(), SettlementMonetarySummation1.mmObject(),
						InvoiceIdentification1.mmObject(), BillingCompensationType1Choice.mmObject(), BillingStatement1.mmObject(), InvoiceLegalIssue1.mmObject(), InvoiceTotals2.mmObject(), ServiceCategoryTotals1.mmObject(),
						BillingReport1.mmObject(), BillingCancellationReport1.mmObject(), BillingSearchCriteria1.mmObject(), FinancingItemList1.mmObject(), FinancialItemParameters1.mmObject(), BillingStatement2.mmObject());
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

	public void setCreditDebitNoteAmount(CurrencyAndAmount creditDebitNoteAmount) {
		this.creditDebitNoteAmount = creditDebitNoteAmount;
	}

	public CurrencyAndAmount getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(CurrencyAndAmount totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public CurrencyAndAmount getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public void setTotalInvoiceAmount(CurrencyAndAmount totalInvoiceAmount) {
		this.totalInvoiceAmount = totalInvoiceAmount;
	}

	public CurrencyCode getInvoiceCurrency() {
		return invoiceCurrency;
	}

	public void setInvoiceCurrency(CurrencyCode invoiceCurrency) {
		this.invoiceCurrency = invoiceCurrency;
	}

	public List<DateTimePeriod> getPeriodCovered() {
		return periodCovered;
	}

	public void setPeriodCovered(List<com.tools20022.repository.entity.DateTimePeriod> periodCovered) {
		this.periodCovered = periodCovered;
	}

	public List<CommercialTradeSettlement> getTradeSettlement() {
		return tradeSettlement;
	}

	public void setTradeSettlement(List<com.tools20022.repository.entity.CommercialTradeSettlement> tradeSettlement) {
		this.tradeSettlement = tradeSettlement;
	}

	public CurrencyAndAmount getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(CurrencyAndAmount totalCharge) {
		this.totalCharge = totalCharge;
	}

	public CurrencyAndAmount getTotalPrepaidAmount() {
		return totalPrepaidAmount;
	}

	public void setTotalPrepaidAmount(CurrencyAndAmount totalPrepaidAmount) {
		this.totalPrepaidAmount = totalPrepaidAmount;
	}

	public List<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<com.tools20022.repository.entity.LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	public CurrencyAndAmount getTotalNetAmount() {
		return totalNetAmount;
	}

	public void setTotalNetAmount(CurrencyAndAmount totalNetAmount) {
		this.totalNetAmount = totalNetAmount;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public ExternalBillingCompensationTypeCode getBillingCompensationType() {
		return billingCompensationType;
	}

	public void setBillingCompensationType(ExternalBillingCompensationTypeCode billingCompensationType) {
		this.billingCompensationType = billingCompensationType;
	}

	public List<InvoicePartyRole> getInvoicePartyRole() {
		return invoicePartyRole;
	}

	public void setInvoicePartyRole(List<com.tools20022.repository.entity.InvoicePartyRole> invoicePartyRole) {
		this.invoicePartyRole = invoicePartyRole;
	}

	public Invoice getOriginalInvoice() {
		return originalInvoice;
	}

	public void setOriginalInvoice(com.tools20022.repository.entity.Invoice originalInvoice) {
		this.originalInvoice = originalInvoice;
	}

	public List<Invoice> getRelatedInvoice() {
		return relatedInvoice;
	}

	public void setRelatedInvoice(List<com.tools20022.repository.entity.Invoice> relatedInvoice) {
		this.relatedInvoice = relatedInvoice;
	}

	public InvoiceFinancingAgreement getInvoiceFinancingTransaction() {
		return invoiceFinancingTransaction;
	}

	public void setInvoiceFinancingTransaction(com.tools20022.repository.entity.InvoiceFinancingAgreement invoiceFinancingTransaction) {
		this.invoiceFinancingTransaction = invoiceFinancingTransaction;
	}

	public CurrencyAndAmount getBillingCompensationAmount() {
		return billingCompensationAmount;
	}

	public void setBillingCompensationAmount(CurrencyAndAmount billingCompensationAmount) {
		this.billingCompensationAmount = billingCompensationAmount;
	}

	public InvoiceStatus getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(com.tools20022.repository.entity.InvoiceStatus invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<com.tools20022.repository.entity.Payment> payment) {
		this.payment = payment;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}
}