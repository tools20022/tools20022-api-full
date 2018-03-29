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
import com.tools20022.repository.codeset.DocumentType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Structured information supplied to enable the matching, ie, reconciliation,
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
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentType
 * StructuredRemittanceInformation2.mmReferredDocumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentRelatedDate
 * StructuredRemittanceInformation2.mmReferredDocumentRelatedDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmReferredDocumentAmount
 * StructuredRemittanceInformation2.mmReferredDocumentAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmDocumentReferenceNumber
 * StructuredRemittanceInformation2.mmDocumentReferenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmCreditorReference
 * StructuredRemittanceInformation2.mmCreditorReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmInvoicer
 * StructuredRemittanceInformation2.mmInvoicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2#mmInvoicee
 * StructuredRemittanceInformation2.mmInvoicee}</li>
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
 * "StructuredRemittanceInformation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Structured information supplied to enable the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StructuredRemittanceInformation2", propOrder = {"referredDocumentType", "referredDocumentRelatedDate", "referredDocumentAmount", "documentReferenceNumber", "creditorReference", "invoicer", "invoicee"})
public class StructuredRemittanceInformation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RfrdDocTp")
	protected DocumentType1Code referredDocumentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DocumentType1Code
	 * DocumentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmType
	 * Document.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RfrdDocTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferredDocumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the referred document/transaction, eg, invoice or credit note."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredRemittanceInformation2, Optional<DocumentType1Code>> mmReferredDocumentType = new MMMessageAttribute<StructuredRemittanceInformation2, Optional<DocumentType1Code>>() {
		{
			businessElementTrace_lazy = () -> Document.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentType";
			definition = "Specifies the nature of the referred document/transaction, eg, invoice or credit note.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DocumentType1Code.mmObject();
		}

		@Override
		public Optional<DocumentType1Code> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getReferredDocumentType();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<DocumentType1Code> value) {
			obj.setReferredDocumentType(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrdDocRltdDt")
	protected ISODate referredDocumentRelatedDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
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
	public static final MMMessageAttribute<StructuredRemittanceInformation2, Optional<ISODate>> mmReferredDocumentRelatedDate = new MMMessageAttribute<StructuredRemittanceInformation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocRltdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentRelatedDate";
			definition = "Date associated with the referred document, eg, date of issue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getReferredDocumentRelatedDate();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<ISODate> value) {
			obj.setReferredDocumentRelatedDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RfrdDocAmt")
	protected List<ReferredDocumentAmount1Choice> referredDocumentAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
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
	public static final MMMessageAttribute<StructuredRemittanceInformation2, List<ReferredDocumentAmount1Choice>> mmReferredDocumentAmount = new MMMessageAttribute<StructuredRemittanceInformation2, List<ReferredDocumentAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> Document.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "RfrdDocAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferredDocumentAmount";
			definition = "Amount of money and currency of a document referred to in the remittance section. The amount is typically either the original amount due and payable, or the amount actually remitted for the referred document.";
			minOccurs = 0;
			complexType_lazy = () -> ReferredDocumentAmount1Choice.mmObject();
		}

		@Override
		public List<ReferredDocumentAmount1Choice> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getReferredDocumentAmount();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, List<ReferredDocumentAmount1Choice> value) {
			obj.setReferredDocumentAmount(value);
		}
	};
	@XmlElement(name = "DocRefNb")
	protected Max35Text documentReferenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocRefNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentReferenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of a document that distinguishes that document from another document referred to in the remittance information, usually assigned by the originator of the referred document/transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredRemittanceInformation2, Optional<Max35Text>> mmDocumentReferenceNumber = new MMMessageAttribute<StructuredRemittanceInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "DocRefNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentReferenceNumber";
			definition = "Unique and unambiguous identification of a document that distinguishes that document from another document referred to in the remittance information, usually assigned by the originator of the referred document/transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getDocumentReferenceNumber();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<Max35Text> value) {
			obj.setDocumentReferenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrRef")
	protected Max35Text creditorReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
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
	 * "Unique and unambiguous reference assigned by the creditor to refer to the payment transaction.\n\nUsage: if available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the cash.\n\nIf the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<StructuredRemittanceInformation2, Optional<Max35Text>> mmCreditorReference = new MMMessageAttribute<StructuredRemittanceInformation2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "CdtrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorReference";
			definition = "Unique and unambiguous reference assigned by the creditor to refer to the payment transaction.\n\nUsage: if available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the cash.\n\nIf the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getCreditorReference();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<Max35Text> value) {
			obj.setCreditorReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcr")
	protected PartyIdentification1 invoicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation2, Optional<PartyIdentification1>> mmInvoicer = new MMMessageAssociationEnd<StructuredRemittanceInformation2, Optional<PartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "Invcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicer";
			definition = "Identification of the organization issuing the invoice when different than the creditor or final party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getInvoicer();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<PartyIdentification1> value) {
			obj.setInvoicer(value.orElse(null));
		}
	};
	@XmlElement(name = "Invcee")
	protected PartyIdentification1 invoicee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceeRole InvoiceeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StructuredRemittanceInformation2
	 * StructuredRemittanceInformation2}</li>
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
	public static final MMMessageAssociationEnd<StructuredRemittanceInformation2, Optional<PartyIdentification1>> mmInvoicee = new MMMessageAssociationEnd<StructuredRemittanceInformation2, Optional<PartyIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.StructuredRemittanceInformation2.mmObject();
			isDerived = false;
			xmlTag = "Invcee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invoicee";
			definition = "Identification of the party to whom an invoice is issued, when different than the originator or debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(StructuredRemittanceInformation2 obj) {
			return obj.getInvoicee();
		}

		@Override
		public void setValue(StructuredRemittanceInformation2 obj, Optional<PartyIdentification1> value) {
			obj.setInvoicee(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StructuredRemittanceInformation2.mmReferredDocumentType, com.tools20022.repository.msg.StructuredRemittanceInformation2.mmReferredDocumentRelatedDate,
						com.tools20022.repository.msg.StructuredRemittanceInformation2.mmReferredDocumentAmount, com.tools20022.repository.msg.StructuredRemittanceInformation2.mmDocumentReferenceNumber,
						com.tools20022.repository.msg.StructuredRemittanceInformation2.mmCreditorReference, com.tools20022.repository.msg.StructuredRemittanceInformation2.mmInvoicer,
						com.tools20022.repository.msg.StructuredRemittanceInformation2.mmInvoicee);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StructuredRemittanceInformation2";
				definition = "Structured information supplied to enable the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, eg, commercial invoices in an accounts receivable system.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<DocumentType1Code> getReferredDocumentType() {
		return referredDocumentType == null ? Optional.empty() : Optional.of(referredDocumentType);
	}

	public StructuredRemittanceInformation2 setReferredDocumentType(DocumentType1Code referredDocumentType) {
		this.referredDocumentType = referredDocumentType;
		return this;
	}

	public Optional<ISODate> getReferredDocumentRelatedDate() {
		return referredDocumentRelatedDate == null ? Optional.empty() : Optional.of(referredDocumentRelatedDate);
	}

	public StructuredRemittanceInformation2 setReferredDocumentRelatedDate(ISODate referredDocumentRelatedDate) {
		this.referredDocumentRelatedDate = referredDocumentRelatedDate;
		return this;
	}

	public List<ReferredDocumentAmount1Choice> getReferredDocumentAmount() {
		return referredDocumentAmount == null ? referredDocumentAmount = new ArrayList<>() : referredDocumentAmount;
	}

	public StructuredRemittanceInformation2 setReferredDocumentAmount(List<ReferredDocumentAmount1Choice> referredDocumentAmount) {
		this.referredDocumentAmount = Objects.requireNonNull(referredDocumentAmount);
		return this;
	}

	public Optional<Max35Text> getDocumentReferenceNumber() {
		return documentReferenceNumber == null ? Optional.empty() : Optional.of(documentReferenceNumber);
	}

	public StructuredRemittanceInformation2 setDocumentReferenceNumber(Max35Text documentReferenceNumber) {
		this.documentReferenceNumber = documentReferenceNumber;
		return this;
	}

	public Optional<Max35Text> getCreditorReference() {
		return creditorReference == null ? Optional.empty() : Optional.of(creditorReference);
	}

	public StructuredRemittanceInformation2 setCreditorReference(Max35Text creditorReference) {
		this.creditorReference = creditorReference;
		return this;
	}

	public Optional<PartyIdentification1> getInvoicer() {
		return invoicer == null ? Optional.empty() : Optional.of(invoicer);
	}

	public StructuredRemittanceInformation2 setInvoicer(PartyIdentification1 invoicer) {
		this.invoicer = invoicer;
		return this;
	}

	public Optional<PartyIdentification1> getInvoicee() {
		return invoicee == null ? Optional.empty() : Optional.of(invoicee);
	}

	public StructuredRemittanceInformation2 setInvoicee(PartyIdentification1 invoicee) {
		this.invoicee = invoicee;
		return this;
	}
}