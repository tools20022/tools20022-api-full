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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information supplied to enable the matching/reconciliation of an entry with
 * the items that the payment is intended to settle, such as commercial invoices
 * in an accounts' receivable system, in a structured form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentInformation
 * StructuredRemittanceInformation10.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentAmount
 * StructuredRemittanceInformation10.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmCreditorReferenceInformation
 * StructuredRemittanceInformation10.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmInvoicer
 * StructuredRemittanceInformation10.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmInvoicee
 * StructuredRemittanceInformation10.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmTaxRemittance
 * StructuredRemittanceInformation10.mmTaxRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmGarnishmentRemittance
 * StructuredRemittanceInformation10.mmGarnishmentRemittance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation10.mmAdditionalRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "StructuredRemittanceInformation10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12
 * StructuredRemittanceInformation12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
 * StructuredRemittanceInformation9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredRemittanceInformation10", propOrder = {"referredDocumentInformation", "referredDocumentAmount", "creditorReferenceInformation", "invoicer", "invoicee", "taxRemittance", "garnishmentRemittance",
		"additionalRemittanceInformation"})
public class StructuredRemittanceInformation10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RfrdDocInf")
	protected List<com.tools20022.repository.msg.ReferredDocumentInformation4> referredDocumentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation4
	 * ReferredDocumentInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the content of the referred document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentInformation
	 * StructuredRemittanceInformation9.mmReferredDocumentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocumentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Set of elements used to provide the content of the referred document.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmReferredDocumentInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation4.mmObject();
		}
	};
	@XmlElement(name = "RfrdDocAmt")
	protected RemittanceAmount2 referredDocumentAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmRemittedAmount
	 * Document.mmRemittedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the amounts of the referred document."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentAmount
	 * StructuredRemittanceInformation9.mmReferredDocumentAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocumentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmRemittedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmReferredDocumentAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
		}
	};
	@XmlElement(name = "CdtrRefInf")
	protected CreditorReferenceInformation2 creditorReferenceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrRefInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorReferenceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference information provided by the creditor to allow the identification of the underlying documents."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation9.mmCreditorReferenceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorReferenceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmCreditorReferenceInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditorReferenceInformation2.mmObject();
		}
	};
	@XmlElement(name = "Invcr")
	protected PartyIdentification43 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoicerRole InvoicerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
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
	 * definition} =
	 * "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmInvoicer
	 * StructuredRemittanceInformation9.mmInvoicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoicerRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmInvoicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "Invcee")
	protected PartyIdentification43 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
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
	 * definition} =
	 * "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmInvoicee
	 * StructuredRemittanceInformation9.mmInvoicee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmInvoicee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "TaxRmt")
	protected TaxInformation4 taxRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation4
	 * TaxInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRemittance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides remittance information about a payment made for tax-related purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxRemittance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "TaxRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRemittance";
			definition = "Provides remittance information about a payment made for tax-related purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxInformation4.mmObject();
		}
	};
	@XmlElement(name = "GrnshmtRmt")
	protected Garnishment1 garnishmentRemittance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Garnishment1
	 * Garnishment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Garnishment Garnishment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrnshmtRmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GarnishmentRemittance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides remittance information about a payment for garnishment-related purposes. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGarnishmentRemittance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Garnishment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "GrnshmtRmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GarnishmentRemittance";
			definition = "Provides remittance information about a payment for garnishment-related purposes. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Garnishment1.mmObject();
		}
	};
	@XmlElement(name = "AddtlRmtInf")
	protected List<Max140Text> additionalRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
	 * StructuredRemittanceInformation10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information, in free text form, to complement the structured remittance information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmAdditionalRemittanceInformation
	 * StructuredRemittanceInformation9.mmAdditionalRemittanceInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRemittanceInformation = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation10.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			previousVersion_lazy = () -> StructuredRemittanceInformation9.mmAdditionalRemittanceInformation;
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmReferredDocumentInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation10.mmReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation10.mmCreditorReferenceInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation10.mmInvoicer, com.tools20022.repository.msg.StructuredRemittanceInformation10.mmInvoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation10.mmTaxRemittance, com.tools20022.repository.msg.StructuredRemittanceInformation10.mmGarnishmentRemittance,
						com.tools20022.repository.msg.StructuredRemittanceInformation10.mmAdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation10";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
				nextVersions_lazy = () -> Arrays.asList(StructuredRemittanceInformation12.mmObject());
				previousVersion_lazy = () -> StructuredRemittanceInformation9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReferredDocumentInformation4> getReferredDocumentInformation() {
		return referredDocumentInformation == null ? referredDocumentInformation = new ArrayList<>() : referredDocumentInformation;
	}

	public StructuredRemittanceInformation10 setReferredDocumentInformation(List<com.tools20022.repository.msg.ReferredDocumentInformation4> referredDocumentInformation) {
		this.referredDocumentInformation = Objects.requireNonNull(referredDocumentInformation);
		return this;
	}

	public Optional<RemittanceAmount2> getReferredDocumentAmount() {
		return referredDocumentAmount == null ? Optional.empty() : Optional.of(referredDocumentAmount);
	}

	public StructuredRemittanceInformation10 setReferredDocumentAmount(com.tools20022.repository.msg.RemittanceAmount2 referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
		return this;
	}

	public Optional<CreditorReferenceInformation2> getCreditorReferenceInformation() {
		return creditorReferenceInformation == null ? Optional.empty() : Optional.of(creditorReferenceInformation);
	}

	public StructuredRemittanceInformation10 setCreditorReferenceInformation(com.tools20022.repository.msg.CreditorReferenceInformation2 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
		return this;
	}

	public Optional<PartyIdentification43> getInvoicer() {
		return invoicer == null ? Optional.empty() : Optional.of(invoicer);
	}

	public StructuredRemittanceInformation10 setInvoicer(com.tools20022.repository.msg.PartyIdentification43 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<PartyIdentification43> getInvoicee() {
		return invoicee == null ? Optional.empty() : Optional.of(invoicee);
	}

	public StructuredRemittanceInformation10 setInvoicee(com.tools20022.repository.msg.PartyIdentification43 invoicee) {
		this.invoicee = invoicee;
		return this;
	}

	public Optional<TaxInformation4> getTaxRemittance() {
		return taxRemittance == null ? Optional.empty() : Optional.of(taxRemittance);
	}

	public StructuredRemittanceInformation10 setTaxRemittance(com.tools20022.repository.msg.TaxInformation4 taxRemittance) {
		this.taxRemittance = taxRemittance;
		return this;
	}

	public Optional<Garnishment1> getGarnishmentRemittance() {
		return garnishmentRemittance == null ? Optional.empty() : Optional.of(garnishmentRemittance);
	}

	public StructuredRemittanceInformation10 setGarnishmentRemittance(com.tools20022.repository.msg.Garnishment1 garnishmentRemittance) {
		this.garnishmentRemittance = garnishmentRemittance;
		return this;
	}

	public List<Max140Text> getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation == null ? additionalRemittanceInformation = new ArrayList<>() : additionalRemittanceInformation;
	}

	public StructuredRemittanceInformation10 setAdditionalRemittanceInformation(List<Max140Text> additionalRemittanceInformation) {
		this.additionalRemittanceInformation = Objects.requireNonNull(additionalRemittanceInformation);
		return this;
	}
}