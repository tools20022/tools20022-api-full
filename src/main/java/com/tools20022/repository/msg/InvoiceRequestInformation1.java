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
import com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01;
import com.tools20022.repository.choice.FinancingRateOrAmountChoice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Set of characteristics that unambiguously identify the single invoice
 * financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInvoiceGeneralInformation
 * InvoiceRequestInformation1.mmInvoiceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInvoiceTotalsInformation
 * InvoiceRequestInformation1.mmInvoiceTotalsInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmCreditDebitNoteAmount
 * InvoiceRequestInformation1.mmCreditDebitNoteAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInstalmentInformation
 * InvoiceRequestInformation1.mmInstalmentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmRequestedAmount
 * InvoiceRequestInformation1.mmRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmSupplier
 * InvoiceRequestInformation1.mmSupplier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmBuyer
 * InvoiceRequestInformation1.mmBuyer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmInvoicePaymentInformation
 * InvoiceRequestInformation1.mmInvoicePaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1#mmReferredDocument
 * InvoiceRequestInformation1.mmReferredDocument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
 * InvoiceFinancingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestV01#mmInvoiceRequestInformation
 * InvoiceFinancingRequestV01.mmInvoiceRequestInformation}</li>
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
 * "InvoiceRequestInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that unambiguously identify the single invoice financing request."
 * </li>
 * </ul>
 */
public class InvoiceRequestInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DocumentGeneralInformation1 invoiceGeneralInformation;
	/**
	 * General information that unambiguously identify the invoice to be
	 * financed, such as invoice type, invoice number and issue date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation1
	 * DocumentGeneralInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDocument
	 * Agreement.mmDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information that unambiguously identify the invoice to be financed, such as invoice type, invoice number and issue date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceGeneralInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDocument;
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "InvcGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceGeneralInformation";
			definition = "General information that unambiguously identify the invoice to be financed, such as invoice type, invoice number and issue date.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentGeneralInformation1.mmObject();
		}
	};
	protected InvoiceTotals1 invoiceTotalsInformation;
	/**
	 * Specifies totals related to the invoice, such as total invoice amount and
	 * total tax amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceTotals1
	 * InvoiceTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoice
	 * InvoiceFinancingAgreement.mmInvoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcTtlsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceTotalsInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies totals related to the invoice, such as total invoice amount and total tax amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceTotalsInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoice;
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "InvcTtlsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceTotalsInformation";
			definition = "Specifies totals related to the invoice, such as total invoice amount and total tax amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvoiceTotals1.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount creditDebitNoteAmount;
	/**
	 * Amount of credit/debit note related to the invoice to be financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCreditDebitNoteAmount
	 * Invoice.mmCreditDebitNoteAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtNoteAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitNoteAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of credit/debit note related to the invoice to be financed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitNoteAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCreditDebitNoteAmount;
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtNoteAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitNoteAmount";
			definition = "Amount of credit/debit note related to the invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Instalment1> instalmentInformation;
	/**
	 * Details of a single instalment to be financed, related to an invoice
	 * settlement (amount, payment due date).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Instalment1
	 * Instalment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of a single instalment to be financed, related to an invoice settlement (amount, payment due date)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalmentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "InstlmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentInformation";
			definition = "Details of a single instalment to be financed, related to an invoice settlement (amount, payment due date).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Instalment1.mmObject();
		}
	};
	protected FinancingRateOrAmountChoice requestedAmount;
	/**
	 * Amount requested by the requestor party, related to a single invoice to
	 * be financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancingRateOrAmountChoice
	 * FinancingRateOrAmountChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmRequestedAmount
	 * InvoiceFinancingAgreement.mmRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount requested by the requestor party, related to a single invoice to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmRequestedAmount;
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "ReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedAmount";
			definition = "Amount requested by the requestor party, related to a single invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingRateOrAmountChoice.mmObject();
		}
	};
	protected PartyAndAccountIdentificationAndContactInformation1 supplier;
	/**
	 * Person or organization that represents the creditor for the invoice to be
	 * financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1
	 * PartyAndAccountIdentificationAndContactInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancingRequestorRole
	 * FinancingRequestorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Spplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Supplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person or organization that represents the creditor for the invoice to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplier = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancingRequestorRole.mmObject();
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "Spplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Supplier";
			definition = "Person or organization that represents the creditor for the invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1.mmObject();
		}
	};
	protected PartyIdentificationAndContactInformation1 buyer;
	/**
	 * Person or organization that represents the debtor for the invoice to be
	 * financed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndContactInformation1
	 * PartyIdentificationAndContactInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Buyr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person or organization that represents the debtor for the invoice to be financed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBuyer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "Buyr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buyer";
			definition = "Person or organization that represents the debtor for the invoice to be financed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndContactInformation1.mmObject();
		}
	};
	protected PaymentInformation15 invoicePaymentInformation;
	/**
	 * Specifies payment terms and conditions related to a single invoice to be
	 * financed, including identifier of possible account used for payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInformation15
	 * PaymentInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcPmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoicePaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies payment terms and conditions related to a single invoice to be financed, including identifier of possible account used for payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicePaymentInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "InvcPmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoicePaymentInformation";
			definition = "Specifies payment terms and conditions related to a single invoice to be financed, including identifier of possible account used for payment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInformation15.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReferredDocumentInformation2> referredDocument;
	/**
	 * Information about a document related to the invoice to be financed, in
	 * structured form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation2
	 * ReferredDocumentInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialDocument
	 * FinancialDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvoiceRequestInformation1
	 * InvoiceRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about a document related to the invoice to be financed, in structured form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> FinancialDocument.mmObject();
			componentContext_lazy = () -> InvoiceRequestInformation1.mmObject();
			isDerived = false;
			xmlTag = "RfrdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocument";
			definition = "Information about a document related to the invoice to be financed, in structured form.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvoiceRequestInformation1.mmInvoiceGeneralInformation, InvoiceRequestInformation1.mmInvoiceTotalsInformation, InvoiceRequestInformation1.mmCreditDebitNoteAmount,
						InvoiceRequestInformation1.mmInstalmentInformation, InvoiceRequestInformation1.mmRequestedAmount, InvoiceRequestInformation1.mmSupplier, InvoiceRequestInformation1.mmBuyer,
						InvoiceRequestInformation1.mmInvoicePaymentInformation, InvoiceRequestInformation1.mmReferredDocument);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingRequestV01.mmInvoiceRequestInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceRequestInformation1";
				definition = "Set of characteristics that unambiguously identify the single invoice financing request.";
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentGeneralInformation1 getInvoiceGeneralInformation() {
		return invoiceGeneralInformation;
	}

	public void setInvoiceGeneralInformation(com.tools20022.repository.msg.DocumentGeneralInformation1 invoiceGeneralInformation) {
		this.invoiceGeneralInformation = invoiceGeneralInformation;
	}

	public InvoiceTotals1 getInvoiceTotalsInformation() {
		return invoiceTotalsInformation;
	}

	public void setInvoiceTotalsInformation(com.tools20022.repository.msg.InvoiceTotals1 invoiceTotalsInformation) {
		this.invoiceTotalsInformation = invoiceTotalsInformation;
	}

	public ActiveCurrencyAndAmount getCreditDebitNoteAmount() {
		return creditDebitNoteAmount;
	}

	public void setCreditDebitNoteAmount(ActiveCurrencyAndAmount creditDebitNoteAmount) {
		this.creditDebitNoteAmount = creditDebitNoteAmount;
	}

	public List<Instalment1> getInstalmentInformation() {
		return instalmentInformation;
	}

	public void setInstalmentInformation(List<com.tools20022.repository.msg.Instalment1> instalmentInformation) {
		this.instalmentInformation = instalmentInformation;
	}

	public FinancingRateOrAmountChoice getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(FinancingRateOrAmountChoice requestedAmount) {
		this.requestedAmount = requestedAmount;
	}

	public PartyAndAccountIdentificationAndContactInformation1 getSupplier() {
		return supplier;
	}

	public void setSupplier(com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1 supplier) {
		this.supplier = supplier;
	}

	public PartyIdentificationAndContactInformation1 getBuyer() {
		return buyer;
	}

	public void setBuyer(com.tools20022.repository.msg.PartyIdentificationAndContactInformation1 buyer) {
		this.buyer = buyer;
	}

	public PaymentInformation15 getInvoicePaymentInformation() {
		return invoicePaymentInformation;
	}

	public void setInvoicePaymentInformation(com.tools20022.repository.msg.PaymentInformation15 invoicePaymentInformation) {
		this.invoicePaymentInformation = invoicePaymentInformation;
	}

	public List<ReferredDocumentInformation2> getReferredDocument() {
		return referredDocument;
	}

	public void setReferredDocument(List<com.tools20022.repository.msg.ReferredDocumentInformation2> referredDocument) {
		this.referredDocument = referredDocument;
	}
}