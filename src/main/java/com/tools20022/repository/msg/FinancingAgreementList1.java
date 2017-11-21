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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancingAgreementList1", propOrder = {"identifier", "date", "relatedDocument", "agreementRequestor", "agreementResponder", "guaranteeApplicant", "guaranteeBeneficiary", "guaranteeIssuer", "notificationInformation",
		"item", "itemCount", "controlSum", "additionalInformation", "validationStatusInformation"})
public class FinancingAgreementList1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identifier;
	/**
	 * Identification assigned to unambiguously identify the agreement list.
	 * <p>
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
	public static final MMMessageAttribute mmIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Identification assigned to unambiguously identify the agreement list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate date;
	/**
	 * Creation date of this list.
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
	public static final MMMessageAttribute mmDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Creation date of this list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedDocument;
	/**
	 * Reference to related document.
	 * <p>
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
	public static final MMMessageAssociationEnd mmRelatedDocument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "RltdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDocument";
			definition = "Reference to related document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedDocumentInformation1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 agreementRequestor;
	/**
	 * Requestor of the agreement(s).
	 * <p>
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
	public static final MMMessageAssociationEnd mmAgreementRequestor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtRqstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementRequestor";
			definition = "Requestor of the agreement(s).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 agreementResponder;
	/**
	 * Party the agreement(s) are (to be) made with.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAgreementResponder = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AgrmtRspndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementResponder";
			definition = "Party the agreement(s) are (to be) made with.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 guaranteeApplicant;
	/**
	 * Applicant of the guarantee.
	 * <p>
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
	public static final MMMessageAssociationEnd mmGuaranteeApplicant = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntApplcnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeApplicant";
			definition = "Applicant of the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 guaranteeBeneficiary;
	/**
	 * Beneficiary of the guarantee.
	 * <p>
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
	public static final MMMessageAssociationEnd mmGuaranteeBeneficiary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntNbfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeBeneficiary";
			definition = "Beneficiary of the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected QualifiedPartyIdentification1 guaranteeIssuer;
	/**
	 * Party that issues the guarantee.
	 * <p>
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
	public static final MMMessageAssociationEnd mmGuaranteeIssuer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "GrntIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteeIssuer";
			definition = "Party that issues the guarantee.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> com.tools20022.repository.msg.QualifiedPartyIdentification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancingNotificationParties1> notificationInformation;
	/**
	 * Party or parties to notify and to acknowledge the agreement.
	 * <p>
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
	public static final MMMessageAssociationEnd mmNotificationInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Document.mmPartyRole;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationInformation";
			definition = "Party or parties to notify and to acknowledge the agreement.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancingNotificationParties1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FinancingAgreementItem1> item;
	/**
	 * List of agreement items.
	 * <p>
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
	public static final MMMessageAssociationEnd mmItem = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingAgreement.mmObject();
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "Itm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Item";
			definition = "List of agreement items.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancingAgreementItem1.mmObject();
		}
	};
	protected Max15NumericText itemCount;
	/**
	 * Number of individual items contained in the list.
	 * <p>
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
	public static final MMMessageAttribute mmItemCount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "ItmCnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ItemCount";
			definition = "Number of individual items contained in the list.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber controlSum;
	/**
	 * Total of all individual amounts included in the list, irrespective of
	 * currencies.
	 * <p>
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
	public static final MMMessageAttribute mmControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the list, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected Max2000Text additionalInformation;
	/**
	 * Additional proprietary formal information concerning the list.
	 * <p>
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
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional proprietary formal information concerning the list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}
	};
	protected ValidationStatusInformation1 validationStatusInformation;
	/**
	 * Validation status of the list.
	 * <p>
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
	public static final MMMessageAssociationEnd mmValidationStatusInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvoiceFinancingAgreement.mmInvoiceFinancingStatus;
			componentContext_lazy = () -> FinancingAgreementList1.mmObject();
			isDerived = false;
			xmlTag = "VldtnStsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationStatusInformation";
			definition = "Validation status of the list.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ValidationStatusInformation1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancingAgreementList1.mmIdentifier, FinancingAgreementList1.mmDate, FinancingAgreementList1.mmRelatedDocument, FinancingAgreementList1.mmAgreementRequestor,
						FinancingAgreementList1.mmAgreementResponder, FinancingAgreementList1.mmGuaranteeApplicant, FinancingAgreementList1.mmGuaranteeBeneficiary, FinancingAgreementList1.mmGuaranteeIssuer,
						FinancingAgreementList1.mmNotificationInformation, FinancingAgreementList1.mmItem, FinancingAgreementList1.mmItemCount, FinancingAgreementList1.mmControlSum, FinancingAgreementList1.mmAdditionalInformation,
						FinancingAgreementList1.mmValidationStatusInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(PartyRegistrationAndGuaranteeAcknowledgementV01.mmAcknowledgementList, PartyRegistrationAndGuaranteeStatusV01.mmAgreementList,
						PartyRegistrationAndGuaranteeNotificationV01.mmNotificationList, PartyRegistrationAndGuaranteeRequestV01.mmAgreementList);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingAgreementList1";
				definition = "Defines a list of party management registration and guarantee requests.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Idr", required = true)
	public Max35Text getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Max35Text identifier) {
		this.identifier = identifier;
	}

	@XmlElement(name = "Dt", required = true)
	public ISODate getDate() {
		return date;
	}

	public void setDate(ISODate date) {
		this.date = date;
	}

	@XmlElement(name = "RltdDoc")
	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument;
	}

	public void setRelatedDocument(List<com.tools20022.repository.msg.QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = relatedDocument;
	}

	@XmlElement(name = "AgrmtRqstr", required = true)
	public QualifiedPartyIdentification1 getAgreementRequestor() {
		return agreementRequestor;
	}

	public void setAgreementRequestor(com.tools20022.repository.msg.QualifiedPartyIdentification1 agreementRequestor) {
		this.agreementRequestor = agreementRequestor;
	}

	@XmlElement(name = "AgrmtRspndr", required = true)
	public QualifiedPartyIdentification1 getAgreementResponder() {
		return agreementResponder;
	}

	public void setAgreementResponder(com.tools20022.repository.msg.QualifiedPartyIdentification1 agreementResponder) {
		this.agreementResponder = agreementResponder;
	}

	@XmlElement(name = "GrntApplcnt", required = true)
	public QualifiedPartyIdentification1 getGuaranteeApplicant() {
		return guaranteeApplicant;
	}

	public void setGuaranteeApplicant(com.tools20022.repository.msg.QualifiedPartyIdentification1 guaranteeApplicant) {
		this.guaranteeApplicant = guaranteeApplicant;
	}

	@XmlElement(name = "GrntNbfcry", required = true)
	public QualifiedPartyIdentification1 getGuaranteeBeneficiary() {
		return guaranteeBeneficiary;
	}

	public void setGuaranteeBeneficiary(com.tools20022.repository.msg.QualifiedPartyIdentification1 guaranteeBeneficiary) {
		this.guaranteeBeneficiary = guaranteeBeneficiary;
	}

	@XmlElement(name = "GrntIssr", required = true)
	public QualifiedPartyIdentification1 getGuaranteeIssuer() {
		return guaranteeIssuer;
	}

	public void setGuaranteeIssuer(com.tools20022.repository.msg.QualifiedPartyIdentification1 guaranteeIssuer) {
		this.guaranteeIssuer = guaranteeIssuer;
	}

	@XmlElement(name = "NtfctnInf")
	public List<FinancingNotificationParties1> getNotificationInformation() {
		return notificationInformation;
	}

	public void setNotificationInformation(List<com.tools20022.repository.msg.FinancingNotificationParties1> notificationInformation) {
		this.notificationInformation = notificationInformation;
	}

	@XmlElement(name = "Itm", required = true)
	public List<FinancingAgreementItem1> getItem() {
		return item;
	}

	public void setItem(List<com.tools20022.repository.msg.FinancingAgreementItem1> item) {
		this.item = item;
	}

	@XmlElement(name = "ItmCnt", required = true)
	public Max15NumericText getItemCount() {
		return itemCount;
	}

	public void setItemCount(Max15NumericText itemCount) {
		this.itemCount = itemCount;
	}

	@XmlElement(name = "CtrlSum")
	public DecimalNumber getControlSum() {
		return controlSum;
	}

	public void setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
	}

	@XmlElement(name = "AddtlInf")
	public Max2000Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max2000Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "VldtnStsInf")
	public ValidationStatusInformation1 getValidationStatusInformation() {
		return validationStatusInformation;
	}

	public void setValidationStatusInformation(com.tools20022.repository.msg.ValidationStatusInformation1 validationStatusInformation) {
		this.validationStatusInformation = validationStatusInformation;
	}
}