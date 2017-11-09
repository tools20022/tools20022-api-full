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
import com.tools20022.repository.choice.ReferredDocumentAmount1Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.InvoiceeRole;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Structured information supplied to enable the matching, i.e. reconciliation,
 * of a payment with the items that the payment is intended to settle, eg,
 * commercial invoices in an accounts receivable system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentInformation
 * StructuredRemittanceInformation6.mmReferredDocumentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentRelatedDate
 * StructuredRemittanceInformation6.mmReferredDocumentRelatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmReferredDocumentAmount
 * StructuredRemittanceInformation6.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmCreditorReferenceInformation
 * StructuredRemittanceInformation6.mmCreditorReferenceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmInvoicer
 * StructuredRemittanceInformation6.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmInvoicee
 * StructuredRemittanceInformation6.mmInvoicee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6#mmAdditionalRemittanceInformation
 * StructuredRemittanceInformation6.mmAdditionalRemittanceInformation}</li>
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
 * "StructuredRemittanceInformation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Structured information supplied to enable the matching, i.e.  reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system."
 * </li>
 * </ul>
 */
public class StructuredRemittanceInformation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ReferredDocumentInformation1 referredDocumentInformation;
	/**
	 * Reference information to allow the identification of the underlying
	 * reference documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReferredDocumentInformation1
	 * ReferredDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * "Reference information to allow the identification of the underlying reference documents."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReferredDocumentInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentInformation";
			definition = "Reference information to allow the identification of the underlying reference documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReferredDocumentInformation1.mmObject();
		}
	};
	protected ISODate referredDocumentRelatedDate;
	/**
	 * Date associated with the referred document, eg, date of issue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocRltdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentRelatedDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date associated with the referred document, eg, date of issue."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferredDocumentRelatedDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocRltdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentRelatedDate";
			definition = "Date associated with the referred document, eg, date of issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<ReferredDocumentAmount1Choice> referredDocumentAmount;
	/**
	 * Amount of money and currency of a document referred to in the remittance
	 * section. The amount is typically either the original amount due and
	 * payable, or the amount actually remitted for the referred document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReferredDocumentAmount1Choice
	 * ReferredDocumentAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAmount
	 * Document.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * definition} =
	 * "Amount of money and currency of a document referred to in the remittance section. The amount is typically either the original amount due and payable, or the amount actually remitted for the referred document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferredDocumentAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Amount of money and currency of a document referred to in the remittance section. The amount is typically either the original amount due and payable, or the amount actually remitted for the referred document.";
			minOccurs = 0;
			complexType_lazy = () -> ReferredDocumentAmount1Choice.mmObject();
		}
	};
	protected CreditorReferenceInformation1 creditorReferenceInformation;
	/**
	 * Reference information provided by the creditor to allow the
	 * identification of the underlying documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditorReferenceInformation1
	 * CreditorReferenceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorReferenceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "CdtrRefInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReferenceInformation";
			definition = "Reference information provided by the creditor to allow the identification of the underlying documents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CreditorReferenceInformation1.mmObject();
		}
	};
	protected PartyIdentification8 invoicer;
	/**
	 * Identification of the organization issuing the invoice when different
	 * than the creditor or final party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * "Identification of the organization issuing the invoice when different than the creditor or final party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organization issuing the invoice when different than the creditor or final party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected PartyIdentification8 invoicee;
	/**
	 * Identification of the party to whom an invoice is issued, when different
	 * than the originator or debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * "Identification of the party to whom an invoice is issued, when different than the originator or debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoicee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when different than the originator or debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification8.mmObject();
		}
	};
	protected Max140Text additionalRemittanceInformation;
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation6
	 * StructuredRemittanceInformation6}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRemittanceInformation = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> StructuredRemittanceInformation6.mmObject();
			isDerived = false;
			xmlTag = "AddtlRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRemittanceInformation";
			definition = "Additional information, in free text form, to complement the structured remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StructuredRemittanceInformation6.mmReferredDocumentInformation, StructuredRemittanceInformation6.mmReferredDocumentRelatedDate,
						StructuredRemittanceInformation6.mmReferredDocumentAmount, StructuredRemittanceInformation6.mmCreditorReferenceInformation, StructuredRemittanceInformation6.mmInvoicer, StructuredRemittanceInformation6.mmInvoicee,
						StructuredRemittanceInformation6.mmAdditionalRemittanceInformation);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation6";
				definition = "Structured information supplied to enable the matching, i.e.  reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system.";
			}
		});
		return mmObject_lazy.get();
	}

	public ReferredDocumentInformation1 getReferredDocumentInformation() {
		return referredDocumentInformation;
	}

	public void setReferredDocumentInformation(com.tools20022.repository.msg.ReferredDocumentInformation1 referredDocumentInformation) {
		this.referredDocumentInformation = referredDocumentInformation;
	}

	public ISODate getReferredDocumentRelatedDate() {
		return referredDocumentRelatedDate;
	}

	public void setReferredDocumentRelatedDate(ISODate referredDocumentRelatedDate) {
		this.referredDocumentRelatedDate = referredDocumentRelatedDate;
	}

	public List<ReferredDocumentAmount1Choice> getReferredDocumentAmount() {
		return referredDocumentAmount;
	}

	public void setReferredDocumentAmount(List<ReferredDocumentAmount1Choice> referredDocumentAmount) {
		this.referredDocumentAmount = referredDocumentAmount;
	}

	public CreditorReferenceInformation1 getCreditorReferenceInformation() {
		return creditorReferenceInformation;
	}

	public void setCreditorReferenceInformation(com.tools20022.repository.msg.CreditorReferenceInformation1 creditorReferenceInformation) {
		this.creditorReferenceInformation = creditorReferenceInformation;
	}

	public PartyIdentification8 getInvoicer() {
		return invoicer;
	}

	public void setInvoicer(com.tools20022.repository.msg.PartyIdentification8 invoicer) {
		this.invoicer = invoicer;
	}

	public PartyIdentification8 getInvoicee() {
		return invoicee;
	}

	public void setInvoicee(com.tools20022.repository.msg.PartyIdentification8 invoicee) {
		this.invoicee = invoicee;
	}

	public Max140Text getAdditionalRemittanceInformation() {
		return additionalRemittanceInformation;
	}

	public void setAdditionalRemittanceInformation(Max140Text additionalRemittanceInformation) {
		this.additionalRemittanceInformation = additionalRemittanceInformation;
	}
}