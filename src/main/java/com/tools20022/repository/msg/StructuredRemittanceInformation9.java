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
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.InvoiceeRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentInformation
 * StructuredRemittanceInformation9.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmReferredDocumentAmount
 * StructuredRemittanceInformation9.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmCreditorReferenceInformation
 * StructuredRemittanceInformation9.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmInvoicer
 * StructuredRemittanceInformation9.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmInvoicee
 * StructuredRemittanceInformation9.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation9.mmAdditionalRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
 * "StructuredRemittanceInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10
 * StructuredRemittanceInformation10}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class StructuredRemittanceInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.ReferredDocumentInformation3> referredDocumentInformation;
	/**
	 * Set of elements used to identify the documents referred to in the
	 * remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation3
	 * ReferredDocumentInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * "Set of elements used to identify the documents referred to in the remittance information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentInformation
	 * StructuredRemittanceInformation10.mmReferredDocumentInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentInformation
	 * StructuredRemittanceInformation12.mmReferredDocumentInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocumentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Set of elements used to identify the documents referred to in the remittance information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmReferredDocumentInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation12.mmReferredDocumentInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation3.mmObject();
		}
	};
	protected RemittanceAmount2 referredDocumentAmount;
	/**
	 * Provides details on the amounts of the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceAmount2
	 * RemittanceAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmReferredDocumentAmount
	 * StructuredRemittanceInformation10.mmReferredDocumentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmReferredDocumentAmount
	 * StructuredRemittanceInformation12.mmReferredDocumentAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocumentAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Document.mmAmount;
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Provides details on the amounts of the referred document.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation12.mmReferredDocumentAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceAmount2.mmObject();
		}
	};
	protected CreditorReferenceInformation2 creditorReferenceInformation;
	/**
	 * Reference information provided by the creditor to allow the
	 * identification of the underlying documents.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation10.mmCreditorReferenceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmCreditorReferenceInformation
	 * StructuredRemittanceInformation12.mmCreditorReferenceInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorReferenceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmCreditorReferenceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation12.mmCreditorReferenceInformation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditorReferenceInformation2.mmObject();
		}
	};
	protected PartyIdentification43 invoicer;
	/**
	 * Identification of the organisation issuing the invoice, when it is
	 * different from the creditor or ultimate creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmInvoicer
	 * StructuredRemittanceInformation10.mmInvoicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmInvoicer
	 * StructuredRemittanceInformation12.mmInvoicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organisation issuing the invoice, when it is different from the creditor or ultimate creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmInvoicer, com.tools20022.repository.msg.StructuredRemittanceInformation12.mmInvoicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected PartyIdentification43 invoicee;
	/**
	 * Identification of the party to whom an invoice is issued, when it is
	 * different from the debtor or ultimate debtor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmInvoicee
	 * StructuredRemittanceInformation10.mmInvoicee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmInvoicee
	 * StructuredRemittanceInformation12.mmInvoicee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when it is different from the debtor or ultimate debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmInvoicee, com.tools20022.repository.msg.StructuredRemittanceInformation12.mmInvoicee);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	protected List<Max140Text> additionalRemittanceInformation;
	/**
	 * Additional information, in free text form, to complement the structured
	 * remittance information.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation9
	 * StructuredRemittanceInformation9}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation10#mmAdditionalRemittanceInformation
	 * StructuredRemittanceInformation10.mmAdditionalRemittanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation12#mmAdditionalRemittanceInformation
	 * StructuredRemittanceInformation12.mmAdditionalRemittanceInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRemittanceInformation = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation9.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation10.mmAdditionalRemittanceInformation,
					com.tools20022.repository.msg.StructuredRemittanceInformation12.mmAdditionalRemittanceInformation);
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation9.mmReferredDocumentInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation9.mmReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation9.mmCreditorReferenceInformation,
						com.tools20022.repository.msg.StructuredRemittanceInformation9.mmInvoicer, com.tools20022.repository.msg.StructuredRemittanceInformation9.mmInvoicee,
						com.tools20022.repository.msg.StructuredRemittanceInformation9.mmAdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation9";
				definition = "Information supplied to enable the matching/reconciliation of an entry with the items that the payment is intended to settle, such as commercial invoices in an accounts' receivable system, in a structured form.";
				nextVersions_lazy = () -> Arrays.asList(StructuredRemittanceInformation10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReferredDocumentInformation3> getReferredDocumentInformation() {
		return referredDocumentInformation;
	}

	public void setReferredDocumentInformation(List<com.tools20022.repository.msg.ReferredDocumentInformation3> referredDocumentInformation) {
		this.referredDocumentInformation = referredDocumentInformation;
	}

	public RemittanceAmount2 getReferredDocumentAmount() {
		return referredDocumentAmount;
	}

	public void setReferredDocumentAmount(com.tools20022.repository.msg.RemittanceAmount2 referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
	}

	public CreditorReferenceInformation2 getCreditorReferenceInformation() {
		return creditorReferenceInformation;
	}

	public void setCreditorReferenceInformation(com.tools20022.repository.msg.CreditorReferenceInformation2 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
	}

	public PartyIdentification43 getInvoicer() {
		return invoicer;
	}

	public void setInvoicer(com.tools20022.repository.msg.PartyIdentification43 invoicer) {
		this.invoicer = invoicer;
	}

	public PartyIdentification43 getInvoicee() {
		return invoicee;
	}

	public void setInvoicee(com.tools20022.repository.msg.PartyIdentification43 invoicee) {
		this.invoicee = invoicee;
	}

	public List<Max140Text> getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation;
	}

	public void setAdditionalRemittanceInformation(List<Max140Text> additionalRemittanceInformation) {
		this.additionalRemittanceInformation = additionalRemittanceInformation;
	}
}