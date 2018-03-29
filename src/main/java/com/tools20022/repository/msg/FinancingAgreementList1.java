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
import com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01;
import com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01;
import com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01;
import com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.InvoiceFinancingAgreement;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines a list of party management registration and guarantee requests.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmIdentifier
 * FinancingAgreementList1.mmIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmDate
 * FinancingAgreementList1.mmDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmRelatedDocument
 * FinancingAgreementList1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmAgreementRequestor
 * FinancingAgreementList1.mmAgreementRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmAgreementResponder
 * FinancingAgreementList1.mmAgreementResponder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeApplicant
 * FinancingAgreementList1.mmGuaranteeApplicant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeBeneficiary
 * FinancingAgreementList1.mmGuaranteeBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmGuaranteeIssuer
 * FinancingAgreementList1.mmGuaranteeIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmNotificationInformation
 * FinancingAgreementList1.mmNotificationInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmItem
 * FinancingAgreementList1.mmItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmItemCount
 * FinancingAgreementList1.mmItemCount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmControlSum
 * FinancingAgreementList1.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmAdditionalInformation
 * FinancingAgreementList1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1#mmValidationStatusInformation
 * FinancingAgreementList1.mmValidationStatusInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeAcknowledgementV01#mmAcknowledgementList
 * PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeStatusV01#mmAgreementList
 * PartyRegistrationAndGuaranteeStatusV01.mmAgreementList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeNotificationV01#mmNotificationList
 * PartyRegistrationAndGuaranteeNotificationV01.mmNotificationList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.PartyRegistrationAndGuaranteeRequestV01#mmAgreementList
 * PartyRegistrationAndGuaranteeRequestV01.mmAgreementList}</li>
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
 * "FinancingAgreementList1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines a list of party management registration and guarantee requests."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingAgreementList1", propOrder = {"identifier", "date", "relatedDocument", "agreementRequestor", "agreementResponder", "guaranteeApplicant", "guaranteeBeneficiary", "guaranteeIssuer", "notificationInformation",
		"item", "itemCount", "controlSum", "additionalInformation", "validationStatusInformation"})
public class FinancingAgreementList1 {

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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	 * "Identification assigned to unambiguously identify the agreement list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementList1, Max35Text> mmIdentifier = new MMMessageAttribute<FinancingAgreementList1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Identification assigned to unambiguously identify the agreement list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(FinancingAgreementList1 obj) {
			return obj.getIdentifier();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, Max35Text value) {
			obj.setIdentifier(value);
		}
	};
	@XmlElement(name = "Dt", required = true)
	protected ISODate date;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creation date of this list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementList1, ISODate> mmDate = new MMMessageAttribute<FinancingAgreementList1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Creation date of this list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(FinancingAgreementList1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, ISODate value) {
			obj.setDate(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	 * definition} = "Reference to related document."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, List<QualifiedDocumentInformation1>> mmRelatedDocument = new MMMessageAssociationEnd<FinancingAgreementList1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "RltdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDocument";
			definition = "Reference to related document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(FinancingAgreementList1 obj) {
			return obj.getRelatedDocument();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedDocument(value);
		}
	};
	@XmlElement(name = "AgrmtRqstr", required = true)
	protected QualifiedPartyIdentification1 agreementRequestor;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtRqstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requestor of the agreement(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1> mmAgreementRequestor = new MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementRequestor";
			definition = "Requestor of the agreement(s).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingAgreementList1 obj) {
			return obj.getAgreementRequestor();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, QualifiedPartyIdentification1 value) {
			obj.setAgreementRequestor(value);
		}
	};
	@XmlElement(name = "AgrmtRspndr", required = true)
	protected QualifiedPartyIdentification1 agreementResponder;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrmtRspndr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementResponder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party the agreement(s) are (to be) made with."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1> mmAgreementResponder = new MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtRspndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementResponder";
			definition = "Party the agreement(s) are (to be) made with.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingAgreementList1 obj) {
			return obj.getAgreementResponder();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, QualifiedPartyIdentification1 value) {
			obj.setAgreementResponder(value);
		}
	};
	@XmlElement(name = "GrntApplcnt", required = true)
	protected QualifiedPartyIdentification1 guaranteeApplicant;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntApplcnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeApplicant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applicant of the guarantee."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1> mmGuaranteeApplicant = new MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntApplcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeApplicant";
			definition = "Applicant of the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingAgreementList1 obj) {
			return obj.getGuaranteeApplicant();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, QualifiedPartyIdentification1 value) {
			obj.setGuaranteeApplicant(value);
		}
	};
	@XmlElement(name = "GrntNbfcry", required = true)
	protected QualifiedPartyIdentification1 guaranteeBeneficiary;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntNbfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficiary of the guarantee."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1> mmGuaranteeBeneficiary = new MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntNbfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeBeneficiary";
			definition = "Beneficiary of the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingAgreementList1 obj) {
			return obj.getGuaranteeBeneficiary();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, QualifiedPartyIdentification1 value) {
			obj.setGuaranteeBeneficiary(value);
		}
	};
	@XmlElement(name = "GrntIssr", required = true)
	protected QualifiedPartyIdentification1 guaranteeIssuer;
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteeIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that issues the guarantee."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1> mmGuaranteeIssuer = new MMMessageAssociationEnd<FinancingAgreementList1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeIssuer";
			definition = "Party that issues the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingAgreementList1 obj) {
			return obj.getGuaranteeIssuer();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, QualifiedPartyIdentification1 value) {
			obj.setGuaranteeIssuer(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	 * "Party or parties to notify and to acknowledge the agreement."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, List<FinancingNotificationParties1>> mmNotificationInformation = new MMMessageAssociationEnd<FinancingAgreementList1, List<FinancingNotificationParties1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationInformation";
			definition = "Party or parties to notify and to acknowledge the agreement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancingNotificationParties1.mmObject();
		}

		@Override
		public List<FinancingNotificationParties1> getValue(FinancingAgreementList1 obj) {
			return obj.getNotificationInformation();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, List<FinancingNotificationParties1> value) {
			obj.setNotificationInformation(value);
		}
	};
	@XmlElement(name = "Itm", required = true)
	protected List<FinancingAgreementItem1> item;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementItem1
	 * FinancingAgreementItem1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingAgreement
	 * InvoiceFinancingAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Itm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Item"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of agreement items."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingAgreementList1, List<FinancingAgreementItem1>> mmItem = new MMMessageAssociationEnd<FinancingAgreementList1, List<FinancingAgreementItem1>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingAgreement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Itm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Item";
			definition = "List of agreement items.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancingAgreementItem1.mmObject();
		}

		@Override
		public List<FinancingAgreementItem1> getValue(FinancingAgreementList1 obj) {
			return obj.getItem();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, List<FinancingAgreementItem1> value) {
			obj.setItem(value);
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	public static final MMMessageAttribute<FinancingAgreementList1, Max15NumericText> mmItemCount = new MMMessageAttribute<FinancingAgreementList1, Max15NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
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
		public Max15NumericText getValue(FinancingAgreementList1 obj) {
			return obj.getItemCount();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, Max15NumericText value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	public static final MMMessageAttribute<FinancingAgreementList1, Optional<DecimalNumber>> mmControlSum = new MMMessageAttribute<FinancingAgreementList1, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
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
		public Optional<DecimalNumber> getValue(FinancingAgreementList1 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	 * definition} =
	 * "Additional proprietary formal information concerning the list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancingAgreementList1, Optional<Max2000Text>> mmAdditionalInformation = new MMMessageAttribute<FinancingAgreementList1, Optional<Max2000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional proprietary formal information concerning the list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Optional<Max2000Text> getValue(FinancingAgreementList1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, Optional<Max2000Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.FinancingAgreementList1
	 * FinancingAgreementList1}</li>
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
	public static final MMMessageAssociationEnd<FinancingAgreementList1, Optional<ValidationStatusInformation1>> mmValidationStatusInformation = new MMMessageAssociationEnd<FinancingAgreementList1, Optional<ValidationStatusInformation1>>() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingAgreementList1.mmObject();
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
		public Optional<ValidationStatusInformation1> getValue(FinancingAgreementList1 obj) {
			return obj.getValidationStatusInformation();
		}

		@Override
		public void setValue(FinancingAgreementList1 obj, Optional<ValidationStatusInformation1> value) {
			obj.setValidationStatusInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingAgreementList1.mmIdentifier, com.tools20022.repository.msg.FinancingAgreementList1.mmDate,
						com.tools20022.repository.msg.FinancingAgreementList1.mmRelatedDocument, com.tools20022.repository.msg.FinancingAgreementList1.mmAgreementRequestor,
						com.tools20022.repository.msg.FinancingAgreementList1.mmAgreementResponder, com.tools20022.repository.msg.FinancingAgreementList1.mmGuaranteeApplicant,
						com.tools20022.repository.msg.FinancingAgreementList1.mmGuaranteeBeneficiary, com.tools20022.repository.msg.FinancingAgreementList1.mmGuaranteeIssuer,
						com.tools20022.repository.msg.FinancingAgreementList1.mmNotificationInformation, com.tools20022.repository.msg.FinancingAgreementList1.mmItem, com.tools20022.repository.msg.FinancingAgreementList1.mmItemCount,
						com.tools20022.repository.msg.FinancingAgreementList1.mmControlSum, com.tools20022.repository.msg.FinancingAgreementList1.mmAdditionalInformation,
						com.tools20022.repository.msg.FinancingAgreementList1.mmValidationStatusInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementList, PartyRegistrationAndGuaranteeStatusV01.mmAgreementList,
						PartyRegistrationAndGuaranteeNotificationV01.mmNotificationList, PartyRegistrationAndGuaranteeRequestV01.mmAgreementList);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingAgreementList1";
				definition = "Defines a list of party management registration and guarantee requests.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentifier() {
		return identifier;
	}

	public FinancingAgreementList1 setIdentifier(Max35Text identifier) {
		this.identifier = Objects.requireNonNull(identifier);
		return this;
	}

	public ISODate getDate() {
		return date;
	}

	public FinancingAgreementList1 setDate(ISODate date) {
		this.date = Objects.requireNonNull(date);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument == null ? relatedDocument = new ArrayList<>() : relatedDocument;
	}

	public FinancingAgreementList1 setRelatedDocument(List<QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = Objects.requireNonNull(relatedDocument);
		return this;
	}

	public QualifiedPartyIdentification1 getAgreementRequestor() {
		return agreementRequestor;
	}

	public FinancingAgreementList1 setAgreementRequestor(QualifiedPartyIdentification1 agreementRequestor) {
		this.agreementRequestor = Objects.requireNonNull(agreementRequestor);
		return this;
	}

	public QualifiedPartyIdentification1 getAgreementResponder() {
		return agreementResponder;
	}

	public FinancingAgreementList1 setAgreementResponder(QualifiedPartyIdentification1 agreementResponder) {
		this.agreementResponder = Objects.requireNonNull(agreementResponder);
		return this;
	}

	public QualifiedPartyIdentification1 getGuaranteeApplicant() {
		return guaranteeApplicant;
	}

	public FinancingAgreementList1 setGuaranteeApplicant(QualifiedPartyIdentification1 guaranteeApplicant) {
		this.guaranteeApplicant = Objects.requireNonNull(guaranteeApplicant);
		return this;
	}

	public QualifiedPartyIdentification1 getGuaranteeBeneficiary() {
		return guaranteeBeneficiary;
	}

	public FinancingAgreementList1 setGuaranteeBeneficiary(QualifiedPartyIdentification1 guaranteeBeneficiary) {
		this.guaranteeBeneficiary = Objects.requireNonNull(guaranteeBeneficiary);
		return this;
	}

	public QualifiedPartyIdentification1 getGuaranteeIssuer() {
		return guaranteeIssuer;
	}

	public FinancingAgreementList1 setGuaranteeIssuer(QualifiedPartyIdentification1 guaranteeIssuer) {
		this.guaranteeIssuer = Objects.requireNonNull(guaranteeIssuer);
		return this;
	}

	public List<FinancingNotificationParties1> getNotificationInformation() {
		return notificationInformation == null ? notificationInformation = new ArrayList<>() : notificationInformation;
	}

	public FinancingAgreementList1 setNotificationInformation(List<FinancingNotificationParties1> notificationInformation) {
		this.notificationInformation = Objects.requireNonNull(notificationInformation);
		return this;
	}

	public List<FinancingAgreementItem1> getItem() {
		return item == null ? item = new ArrayList<>() : item;
	}

	public FinancingAgreementList1 setItem(List<FinancingAgreementItem1> item) {
		this.item = Objects.requireNonNull(item);
		return this;
	}

	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public FinancingAgreementList1 setItemCount(Max15NumericText itemCount) {
		this.itemCount = Objects.requireNonNull(itemCount);
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public FinancingAgreementList1 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public Optional<Max2000Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public FinancingAgreementList1 setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<ValidationStatusInformation1> getValidationStatusInformation() {
		return validationStatusInformation == null ? Optional.empty() : Optional.of(validationStatusInformation);
	}

	public FinancingAgreementList1 setValidationStatusInformation(ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
		return this;
	}
}