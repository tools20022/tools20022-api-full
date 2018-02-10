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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceRequestInformation1", propOrder = {"invoiceGeneralInformation", "invoiceTotalsInformation", "creditDebitNoteAmount", "instalmentInformation", "requestedAmount", "supplier", "buyer", "invoicePaymentInformation",
		"referredDocument"})
public class InvoiceRequestInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvcGnlInf", required = true)
	protected DocumentGeneralInformation1 invoiceGeneralInformation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "InvcTtlsInf", required = true)
	protected InvoiceTotals1 invoiceTotalsInformation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "CdtDbtNoteAmt")
	protected ActiveCurrencyAndAmount creditDebitNoteAmount;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "InstlmtInf")
	protected List<com.tools20022.repository.msg.Instalment1> instalmentInformation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "ReqdAmt")
	protected FinancingRateOrAmountChoice requestedAmount;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "Spplr", required = true)
	protected PartyAndAccountIdentificationAndContactInformation1 supplier;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "Buyr", required = true)
	protected PartyIdentificationAndContactInformation1 buyer;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "InvcPmtInf", required = true)
	protected PaymentInformation15 invoicePaymentInformation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
	@XmlElement(name = "RfrdDoc")
	protected List<com.tools20022.repository.msg.ReferredDocumentInformation2> referredDocument;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.InvoiceRequestInformation1.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvoiceRequestInformation1.mmInvoiceGeneralInformation, com.tools20022.repository.msg.InvoiceRequestInformation1.mmInvoiceTotalsInformation,
						com.tools20022.repository.msg.InvoiceRequestInformation1.mmCreditDebitNoteAmount, com.tools20022.repository.msg.InvoiceRequestInformation1.mmInstalmentInformation,
						com.tools20022.repository.msg.InvoiceRequestInformation1.mmRequestedAmount, com.tools20022.repository.msg.InvoiceRequestInformation1.mmSupplier, com.tools20022.repository.msg.InvoiceRequestInformation1.mmBuyer,
						com.tools20022.repository.msg.InvoiceRequestInformation1.mmInvoicePaymentInformation, com.tools20022.repository.msg.InvoiceRequestInformation1.mmReferredDocument);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceFinancingRequestV01.mmInvoiceRequestInformation);
				trace_lazy = () -> InvoiceFinancingAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public InvoiceRequestInformation1 setInvoiceGeneralInformation(com.tools20022.repository.msg.DocumentGeneralInformation1 invoiceGeneralInformation) {
		this.invoiceGeneralInformation = Objects.requireNonNull(invoiceGeneralInformation);
		return this;
	}

	public InvoiceTotals1 getInvoiceTotalsInformation() {
		return invoiceTotalsInformation;
	}

	public InvoiceRequestInformation1 setInvoiceTotalsInformation(com.tools20022.repository.msg.InvoiceTotals1 invoiceTotalsInformation) {
		this.invoiceTotalsInformation = Objects.requireNonNull(invoiceTotalsInformation);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCreditDebitNoteAmount() {
		return creditDebitNoteAmount == null ? Optional.empty() : Optional.of(creditDebitNoteAmount);
	}

	public InvoiceRequestInformation1 setCreditDebitNoteAmount(ActiveCurrencyAndAmount creditDebitNoteAmount) {
		this.creditDebitNoteAmount = creditDebitNoteAmount;
		return this;
	}

	public List<Instalment1> getInstalmentInformation() {
		return instalmentInformation == null ? instalmentInformation = new ArrayList<>() : instalmentInformation;
	}

	public InvoiceRequestInformation1 setInstalmentInformation(List<com.tools20022.repository.msg.Instalment1> instalmentInformation) {
		this.instalmentInformation = Objects.requireNonNull(instalmentInformation);
		return this;
	}

	public Optional<FinancingRateOrAmountChoice> getRequestedAmount() {
		return requestedAmount == null ? Optional.empty() : Optional.of(requestedAmount);
	}

	public InvoiceRequestInformation1 setRequestedAmount(FinancingRateOrAmountChoice requestedAmount) {
		this.requestedAmount = requestedAmount;
		return this;
	}

	public PartyAndAccountIdentificationAndContactInformation1 getSupplier() {
		return supplier;
	}

	public InvoiceRequestInformation1 setSupplier(com.tools20022.repository.msg.PartyAndAccountIdentificationAndContactInformation1 supplier) {
		this.supplier = Objects.requireNonNull(supplier);
		return this;
	}

	public PartyIdentificationAndContactInformation1 getBuyer() {
		return buyer;
	}

	public InvoiceRequestInformation1 setBuyer(com.tools20022.repository.msg.PartyIdentificationAndContactInformation1 buyer) {
		this.buyer = Objects.requireNonNull(buyer);
		return this;
	}

	public PaymentInformation15 getInvoicePaymentInformation() {
		return invoicePaymentInformation;
	}

	public InvoiceRequestInformation1 setInvoicePaymentInformation(com.tools20022.repository.msg.PaymentInformation15 invoicePaymentInformation) {
		this.invoicePaymentInformation = Objects.requireNonNull(invoicePaymentInformation);
		return this;
	}

	public List<ReferredDocumentInformation2> getReferredDocument() {
		return referredDocument == null ? referredDocument = new ArrayList<>() : referredDocument;
	}

	public InvoiceRequestInformation1 setReferredDocument(List<com.tools20022.repository.msg.ReferredDocumentInformation2> referredDocument) {
		this.referredDocument = Objects.requireNonNull(referredDocument);
		return this;
	}
}