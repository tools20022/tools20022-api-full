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
import com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01;
import com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01;
import com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01;
import com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01;
import com.tools20022.repository.choice.FinancingRateOrAmountChoice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a list of financing items exchanged between two parties, for
 * example invoice, credit, financing request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmIdentifier
 * FinancingItemList1.mmIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingItemList1#mmIssueDate
 * FinancingItemList1.mmIssueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmRelatedDocument
 * FinancingItemList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAmountCutOffDate
 * FinancingItemList1.mmAmountCutOffDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAssignee
 * FinancingItemList1.mmAssignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAssigner
 * FinancingItemList1.mmAssigner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmNotificationInformation
 * FinancingItemList1.mmNotificationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmFinancialItem
 * FinancingItemList1.mmFinancialItem}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingItemList1#mmItemCount
 * FinancingItemList1.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmControlSum
 * FinancingItemList1.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmTotalRequestAmount
 * FinancingItemList1.mmTotalRequestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmTotalRequestFinancing
 * FinancingItemList1.mmTotalRequestFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAgreedRate
 * FinancingItemList1.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmFinancingInstalment
 * FinancingItemList1.mmFinancingInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAdditionalInformation
 * FinancingItemList1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmValidationStatusInformation
 * FinancingItemList1.mmValidationStatusInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmFinancingStatus
 * FinancingItemList1.mmFinancingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentRequestV01#mmAssignmentList
 * InvoiceAssignmentRequestV01.mmAssignmentList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentNotificationV01#mmNotificationList
 * InvoiceAssignmentNotificationV01.mmNotificationList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentAcknowledgementV01#mmPaymentStatusList
 * InvoiceAssignmentAcknowledgementV01.mmPaymentStatusList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceAssignmentStatusV01#mmAssignmentList
 * InvoiceAssignmentStatusV01.mmAssignmentList}</li>
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
 * "FinancingItemList1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a list of financing items exchanged between two parties, for example invoice, credit, financing request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingItemList1", propOrder = {"identifier", "issueDate", "relatedDocument", "amountCutOffDate", "assignee", "assigner", "notificationInformation", "financialItem", "itemCount", "controlSum", "totalRequestAmount",
		"totalRequestFinancing", "agreedRate", "financingInstalment", "additionalInformation", "validationStatusInformation", "financingStatus"})
public class FinancingItemList1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Idr", required = true)
	protected Max35Text identifier;
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmIdentification
	 * InvoiceFinancingAgreement.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Idr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to unambiguously identify the financing item list."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Max35Text> mmIdentifier = new MMMessageAttribute<FinancingItemList1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Identification assigned to unambiguously identify the financing item list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FinancingItemList1 obj) {
			return obj.getIdentifier();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Max35Text value) {
			obj.setIdentifier(value);
		}
	};
	@XmlElement(name = "IsseDt", required = true)
	protected ISODate issueDate;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IsseDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of creation of this document."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, ISODate> mmIssueDate = new MMMessageAttribute<FinancingItemList1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "IsseDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueDate";
			definition = "Date of creation of this document.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(FinancingItemList1 obj) {
			return obj.getIssueDate();
		}

		@Override
		public void setValue(FinancingItemList1 obj, ISODate value) {
			obj.setIssueDate(value);
		}
	};
	@XmlElement(name = "RltdDoc")
	protected List<QualifiedDocumentInformation1> relatedDocument;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedDocumentInformation1
	 * QualifiedDocumentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDoc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to related documents for example to original assignment in a status response or retry."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, List<QualifiedDocumentInformation1>> mmRelatedDocument = new MMMessageAssociationEnd<FinancingItemList1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "RltdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDocument";
			definition = "Reference to related documents for example to original assignment in a status response or retry.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancingItemList1 obj) {
			return obj.getRelatedDocument();
		}

		@Override
		public void setValue(FinancingItemList1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedDocument(value);
		}
	};
	@XmlElement(name = "AmtCutOffDt")
	protected ISODate amountCutOffDate;
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
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCutOffDate
	 * CashBalance.mmCutOffDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtCutOffDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountCutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cut off date for items used to establish the total request amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Optional<ISODate>> mmAmountCutOffDate = new MMMessageAttribute<FinancingItemList1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCutOffDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "AmtCutOffDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountCutOffDate";
			definition = "Cut off date for items used to establish the total request amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FinancingItemList1 obj) {
			return obj.getAmountCutOffDate();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<ISODate> value) {
			obj.setAmountCutOffDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Assgne", required = true)
	protected QualifiedPartyIdentification1 assignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which the list is assigned."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, QualifiedPartyIdentification1> mmAssignee = new MMMessageAssociationEnd<FinancingItemList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "Assgne";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignee";
			definition = "Party to which the list is assigned.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingItemList1 obj) {
			return obj.getAssignee();
		}

		@Override
		public void setValue(FinancingItemList1 obj, QualifiedPartyIdentification1 value) {
			obj.setAssignee(value);
		}
	};
	@XmlElement(name = "Assgnr", required = true)
	protected QualifiedPartyIdentification1 assigner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assigner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party assigning the list."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, QualifiedPartyIdentification1> mmAssigner = new MMMessageAssociationEnd<FinancingItemList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "Assgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assigner";
			definition = "Party assigning the list.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingItemList1 obj) {
			return obj.getAssigner();
		}

		@Override
		public void setValue(FinancingItemList1 obj, QualifiedPartyIdentification1 value) {
			obj.setAssigner(value);
		}
	};
	@XmlElement(name = "NtfctnInf")
	protected List<FinancingNotificationParties1> notificationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1
	 * FinancingNotificationParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmPartyRole
	 * Document.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies parties that notify the assignment(s) and the notified parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, List<FinancingNotificationParties1>> mmNotificationInformation = new MMMessageAssociationEnd<FinancingItemList1, List<FinancingNotificationParties1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationInformation";
			definition = "Identifies parties that notify the assignment(s) and the notified parties.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingNotificationParties1.mmObject();
		}

		@Override
		public List<FinancingNotificationParties1> getValue(FinancingItemList1 obj) {
			return obj.getNotificationInformation();
		}

		@Override
		public void setValue(FinancingItemList1 obj, List<FinancingNotificationParties1> value) {
			obj.setNotificationInformation(value);
		}
	};
	@XmlElement(name = "FinItm")
	protected List<FinancialItem1> financialItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialItem1
	 * FinancialItem1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of items/transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, List<FinancialItem1>> mmFinancialItem = new MMMessageAssociationEnd<FinancingItemList1, List<FinancialItem1>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingAgreement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "FinItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialItem";
			definition = "List of items/transactions.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialItem1.mmObject();
		}

		@Override
		public List<FinancialItem1> getValue(FinancingItemList1 obj) {
			return obj.getFinancialItem();
		}

		@Override
		public void setValue(FinancingItemList1 obj, List<FinancialItem1> value) {
			obj.setFinancialItem(value);
		}
	};
	@XmlElement(name = "ItmCnt", required = true)
	protected Max15NumericText itemCount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ItmCnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ItemCount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of individual items contained in the list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Max15NumericText> mmItemCount = new MMMessageAttribute<FinancingItemList1, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Number of individual items contained in the list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Max15NumericText getValue(FinancingItemList1 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Max15NumericText value) {
			obj.setItemCount(value);
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the list, irrespective of currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Optional<DecimalNumber>> mmControlSum = new MMMessageAttribute<FinancingItemList1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the list, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(FinancingItemList1 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlReqAmt")
	protected ActiveCurrencyAndAmount totalRequestAmount;
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
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmRequestedAmount
	 * InvoiceFinancingAgreement.mmRequestedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlReqAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount in all items. Requires same currency, necessary when financing request is in percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Optional<ActiveCurrencyAndAmount>> mmTotalRequestAmount = new MMMessageAttribute<FinancingItemList1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmRequestedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "TtlReqAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestAmount";
			definition = "Total amount in all items. Requires same currency, necessary when financing request is in percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(FinancingItemList1 obj) {
			return obj.getTotalRequestAmount();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalRequestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlReqFincg")
	protected FinancingRateOrAmountChoice totalRequestFinancing;
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
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmInvoiceFinancingTransaction
	 * Invoice.mmInvoiceFinancingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlReqFincg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, Optional<FinancingRateOrAmountChoice>> mmTotalRequestFinancing = new MMMessageAssociationEnd<FinancingItemList1, Optional<FinancingRateOrAmountChoice>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmInvoiceFinancingTransaction;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "TtlReqFincg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestFinancing";
			definition = "Total amount requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingRateOrAmountChoice.mmObject();
		}

		@Override
		public Optional<FinancingRateOrAmountChoice> getValue(FinancingItemList1 obj) {
			return obj.getTotalRequestFinancing();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<FinancingRateOrAmountChoice> value) {
			obj.setTotalRequestFinancing(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrdRate")
	protected AgreedRate1 agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AgreedRate1
	 * AgreedRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acceptable exchange rate for financing by different currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, Optional<AgreedRate1>> mmAgreedRate = new MMMessageAssociationEnd<FinancingItemList1, Optional<AgreedRate1>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Acceptable exchange rate for financing by different currency.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AgreedRate1.mmObject();
		}

		@Override
		public Optional<AgreedRate1> getValue(FinancingItemList1 obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<AgreedRate1> value) {
			obj.setAgreedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "FincgInstlmt")
	protected List<Instalment2> financingInstalment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Instalment2
	 * Instalment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgInstlmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingInstalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instalment for the financing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, List<Instalment2>> mmFinancingInstalment = new MMMessageAssociationEnd<FinancingItemList1, List<Instalment2>>() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "FincgInstlmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingInstalment";
			definition = "Instalment for the financing.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Instalment2.mmObject();
		}

		@Override
		public List<Instalment2> getValue(FinancingItemList1 obj) {
			return obj.getFinancingInstalment();
		}

		@Override
		public void setValue(FinancingItemList1 obj, List<Instalment2> value) {
			obj.setFinancingInstalment(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max2000Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2000Text
	 * Max2000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional free form information concerning the list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingItemList1, Optional<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<FinancingItemList1, Optional<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional free form information concerning the list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(FinancingItemList1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<Max2000Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "VldtnStsInf")
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ValidationStatusInformation1
	 * ValidationStatusInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtnStsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationStatusInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation status of the list."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, Optional<ValidationStatusInformation1>> mmValidationStatusInformation = new MMMessageAssociationEnd<FinancingItemList1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the list.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ValidationStatusInformation1.mmObject();
		}

		@Override
		public Optional<ValidationStatusInformation1> getValue(FinancingItemList1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setValidationStatusInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "FincgSts")
	protected FinancingInformationAndStatus1 financingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement#mmInvoiceFinancingStatus
	 * InvoiceFinancingAgreement.mmInvoiceFinancingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1
	 * FinancingItemList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financing status if applicable to the nature of the items."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingItemList1, Optional<FinancingInformationAndStatus1>> mmFinancingStatus = new MMMessageAssociationEnd<FinancingItemList1, Optional<FinancingInformationAndStatus1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingItemList1.mmObject();
			isDerived = false;
			xmlTag = "FincgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingStatus";
			definition = "Financing status if applicable to the nature of the items.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingInformationAndStatus1.mmObject();
		}

		@Override
		public Optional<FinancingInformationAndStatus1> getValue(FinancingItemList1 obj) {
			return obj.getFinancingStatus();
		}

		@Override
		public void setValue(FinancingItemList1 obj, Optional<FinancingInformationAndStatus1> value) {
			obj.setFinancingStatus(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingItemList1.mmIdentifier, com.tools20022.repository.msg.FinancingItemList1.mmIssueDate,
						com.tools20022.repository.msg.FinancingItemList1.mmRelatedDocument, com.tools20022.repository.msg.FinancingItemList1.mmAmountCutOffDate, com.tools20022.repository.msg.FinancingItemList1.mmAssignee,
						com.tools20022.repository.msg.FinancingItemList1.mmAssigner, com.tools20022.repository.msg.FinancingItemList1.mmNotificationInformation, com.tools20022.repository.msg.FinancingItemList1.mmFinancialItem,
						com.tools20022.repository.msg.FinancingItemList1.mmItemCount, com.tools20022.repository.msg.FinancingItemList1.mmControlSum, com.tools20022.repository.msg.FinancingItemList1.mmTotalRequestAmount,
						com.tools20022.repository.msg.FinancingItemList1.mmTotalRequestFinancing, com.tools20022.repository.msg.FinancingItemList1.mmAgreedRate, com.tools20022.repository.msg.FinancingItemList1.mmFinancingInstalment,
						com.tools20022.repository.msg.FinancingItemList1.mmAdditionalInformation, com.tools20022.repository.msg.FinancingItemList1.mmValidationStatusInformation,
						com.tools20022.repository.msg.FinancingItemList1.mmFinancingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(InvoiceAssignmentRequestV01.mmAssignmentList, InvoiceAssignmentNotificationV01.mmNotificationList, InvoiceAssignmentAcknowledgementV01.mmPaymentStatusList,
						InvoiceAssignmentStatusV01.mmAssignmentList);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingItemList1";
				definition = "Specifies a list of financing items exchanged between two parties, for example invoice, credit, financing request.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentifier() {
		return identifier;
	}

	public FinancingItemList1 setIdentifier(Max35Text identifier) {
		this.identifier = Objects.requireNonNull(identifier);
		return this;
	}

	public ISODate getIssueDate() {
		return issueDate;
	}

	public FinancingItemList1 setIssueDate(ISODate issueDate) {
		this.issueDate = Objects.requireNonNull(issueDate);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument == null ? relatedDocument = new ArrayList<>() : relatedDocument;
	}

	public FinancingItemList1 setRelatedDocument(List<QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = Objects.requireNonNull(relatedDocument);
		return this;
	}

	public Optional<ISODate> getAmountCutOffDate() {
		return amountCutOffDate == null ? Optional.empty() : Optional.of(amountCutOffDate);
	}

	public FinancingItemList1 setAmountCutOffDate(ISODate amountCutOffDate) {
		this.amountCutOffDate = amountCutOffDate;
		return this;
	}

	public QualifiedPartyIdentification1 getAssignee() {
		return assignee;
	}

	public FinancingItemList1 setAssignee(QualifiedPartyIdentification1 assignee) {
		this.assignee = Objects.requireNonNull(assignee);
		return this;
	}

	public QualifiedPartyIdentification1 getAssigner() {
		return assigner;
	}

	public FinancingItemList1 setAssigner(QualifiedPartyIdentification1 assigner) {
		this.assigner = Objects.requireNonNull(assigner);
		return this;
	}

	public List<FinancingNotificationParties1> getNotificationInformation() {
		return notificationInformation == null ? notificationInformation = new ArrayList<>() : notificationInformation;
	}

	public FinancingItemList1 setNotificationInformation(List<FinancingNotificationParties1> notificationInformation) {
		this.notificationInformation = Objects.requireNonNull(notificationInformation);
		return this;
	}

	public List<FinancialItem1> getFinancialItem() {
		return financialItem == null ? financialItem = new ArrayList<>() : financialItem;
	}

	public FinancingItemList1 setFinancialItem(List<FinancialItem1> financialItem) {
		this.financialItem = Objects.requireNonNull(financialItem);
		return this;
	}

	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public FinancingItemList1 setItemCount(Max15NumericText itemCount) {
		this.itemCount = Objects.requireNonNull(itemCount);
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public FinancingItemList1 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalRequestAmount() {
		return totalRequestAmount == null ? Optional.empty() : Optional.of(totalRequestAmount);
	}

	public FinancingItemList1 setTotalRequestAmount(ActiveCurrencyAndAmount totalRequestAmount) {
		this.totalRequestAmount = totalRequestAmount;
		return this;
	}

	public Optional<FinancingRateOrAmountChoice> getTotalRequestFinancing() {
		return totalRequestFinancing == null ? Optional.empty() : Optional.of(totalRequestFinancing);
	}

	public FinancingItemList1 setTotalRequestFinancing(FinancingRateOrAmountChoice totalRequestFinancing) {
		this.totalRequestFinancing = totalRequestFinancing;
		return this;
	}

	public Optional<AgreedRate1> getAgreedRate() {
		return agreedRate == null ? Optional.empty() : Optional.of(agreedRate);
	}

	public FinancingItemList1 setAgreedRate(AgreedRate1 agreedRate) {
		this.agreedRate = agreedRate;
		return this;
	}

	public List<Instalment2> getFinancingInstalment() {
		return financingInstalment == null ? financingInstalment = new ArrayList<>() : financingInstalment;
	}

	public FinancingItemList1 setFinancingInstalment(List<Instalment2> financingInstalment) {
		this.financingInstalment = Objects.requireNonNull(financingInstalment);
		return this;
	}

	public Optional<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public FinancingItemList1 setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<ValidationStatusInformation1> getValidationStatusInformation() {
		return validationStatusInformation == null ? Optional.empty() : Optional.of(validationStatusInformation);
	}

	public FinancingItemList1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
		return this;
	}

	public Optional<FinancingInformationAndStatus1> getFinancingStatus() {
		return financingStatus == null ? Optional.empty() : Optional.of(financingStatus);
	}

	public FinancingItemList1 setFinancingStatus(FinancingInformationAndStatus1 financingStatus) {
		this.financingStatus = financingStatus;
		return this;
	}
}