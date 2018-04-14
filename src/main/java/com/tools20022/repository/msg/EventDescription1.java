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
import com.tools20022.repository.area.tsmt.PartyEventAdviceV01;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max2000Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.Jurisdiction;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GovernanceRules2;
import com.tools20022.repository.msg.QualifiedDocumentInformation1;
import com.tools20022.repository.msg.QualifiedPartyIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes an event not covered by other formal messages, for example a trace
 * after a telephone call.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmIdentifier
 * EventDescription1.mmIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmDate
 * EventDescription1.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmRecipient
 * EventDescription1.mmRecipient}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmAdvisor
 * EventDescription1.mmAdvisor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EventDescription1#mmOtherParty
 * EventDescription1.mmOtherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmLanguageCode
 * EventDescription1.mmLanguageCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmDescription
 * EventDescription1.mmDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedDocument
 * EventDescription1.mmRelatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedLetter
 * EventDescription1.mmRelatedLetter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmRelatedMessage
 * EventDescription1.mmRelatedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmAssociatedDocument
 * EventDescription1.mmAssociatedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmGoverningContract
 * EventDescription1.mmGoverningContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EventDescription1#mmLegalContext
 * EventDescription1.mmLegalContext}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.PartyEventAdviceV01#mmEventNotice
 * PartyEventAdviceV01.mmEventNotice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventDescription1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes an event not covered by other formal messages, for example a trace after a telephone call."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EventDescription1", propOrder = {"identifier", "date", "recipient", "advisor", "otherParty", "languageCode", "description", "relatedDocument", "relatedLetter", "relatedMessage", "associatedDocument", "governingContract",
		"legalContext"})
public class EventDescription1 {

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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Idr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EventDescription1, Max35Text> mmIdentifier = new MMMessageAttribute<EventDescription1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "Idr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identifier";
			definition = "Identification of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(EventDescription1 obj) {
			return obj.getIdentifier();
		}

		@Override
		public void setValue(EventDescription1 obj, Max35Text value) {
			obj.setIdentifier(value);
		}
	};
	@XmlElement(name = "Dt")
	protected ISODateTime date;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmIssueDate
	 * Document.mmIssueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when event occurred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EventDescription1, Optional<ISODateTime>> mmDate = new MMMessageAttribute<EventDescription1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Document.mmIssueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "Dt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Date";
			definition = "Date when event occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(EventDescription1 obj) {
			return obj.getDate();
		}

		@Override
		public void setValue(EventDescription1 obj, Optional<ISODateTime> value) {
			obj.setDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Rcpt", required = true)
	protected QualifiedPartyIdentification1 recipient;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to be advised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, QualifiedPartyIdentification1> mmRecipient = new MMMessageAssociationEnd<EventDescription1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "Rcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recipient";
			definition = "Party to be advised.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(EventDescription1 obj) {
			return obj.getRecipient();
		}

		@Override
		public void setValue(EventDescription1 obj, QualifiedPartyIdentification1 value) {
			obj.setRecipient(value);
		}
	};
	@XmlElement(name = "Advsr", required = true)
	protected QualifiedPartyIdentification1 advisor;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Advsr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advisor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advising party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, QualifiedPartyIdentification1> mmAdvisor = new MMMessageAssociationEnd<EventDescription1, QualifiedPartyIdentification1>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "Advsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advisor";
			definition = "Advising party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(EventDescription1 obj) {
			return obj.getAdvisor();
		}

		@Override
		public void setValue(EventDescription1 obj, QualifiedPartyIdentification1 value) {
			obj.setAdvisor(value);
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<QualifiedPartyIdentification1> otherParty;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Parties involved in the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedPartyIdentification1>> mmOtherParty = new MMMessageAssociationEnd<EventDescription1, List<QualifiedPartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Parties involved in the event.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public List<QualifiedPartyIdentification1> getValue(EventDescription1 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedPartyIdentification1> value) {
			obj.setOtherParty(value);
		}
	};
	@XmlElement(name = "LangCd", required = true)
	protected LanguageCode languageCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmLanguage
	 * Document.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LangCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LanguageCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for a language used for the description."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EventDescription1, LanguageCode> mmLanguageCode = new MMMessageAttribute<EventDescription1, LanguageCode>() {
		{
			businessElementTrace_lazy = () -> Document.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "LangCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LanguageCode";
			definition = "Identifier for a language used for the description.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public LanguageCode getValue(EventDescription1 obj) {
			return obj.getLanguageCode();
		}

		@Override
		public void setValue(EventDescription1 obj, LanguageCode value) {
			obj.setLanguageCode(value);
		}
	};
	@XmlElement(name = "Desc", required = true)
	protected Max2000Text description;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free form description of event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EventDescription1, Max2000Text> mmDescription = new MMMessageAttribute<EventDescription1, Max2000Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free form description of event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max2000Text.mmObject();
		}

		@Override
		public Max2000Text getValue(EventDescription1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(EventDescription1 obj, Max2000Text value) {
			obj.setDescription(value);
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdDoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to related document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>> mmRelatedDocument = new MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
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
		public List<QualifiedDocumentInformation1> getValue(EventDescription1 obj) {
			return obj.getRelatedDocument();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedDocument(value);
		}
	};
	@XmlElement(name = "RltdLttr")
	protected List<QualifiedDocumentInformation1> relatedLetter;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdLttr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLetter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of related letter."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>> mmRelatedLetter = new MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "RltdLttr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedLetter";
			definition = "Identifier of related letter.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(EventDescription1 obj) {
			return obj.getRelatedLetter();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedLetter(value);
		}
	};
	@XmlElement(name = "RltdMsg")
	protected List<QualifiedDocumentInformation1> relatedMessage;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdMsg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of related message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>> mmRelatedMessage = new MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "RltdMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedMessage";
			definition = "Identifier of related message.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(EventDescription1 obj) {
			return obj.getRelatedMessage();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setRelatedMessage(value);
		}
	};
	@XmlElement(name = "AssoctdDoc")
	protected List<QualifiedDocumentInformation1> associatedDocument;
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
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AssoctdDoc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssociatedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Associated free form document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>> mmAssociatedDocument = new MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>>() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "AssoctdDoc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssociatedDocument";
			definition = "Associated free form document.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(EventDescription1 obj) {
			return obj.getAssociatedDocument();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setAssociatedDocument(value);
		}
	};
	@XmlElement(name = "GovngCtrct")
	protected List<QualifiedDocumentInformation1> governingContract;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document#mmAgreement
	 * Document.mmAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GovngCtrct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GoverningContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the contractual context."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>> mmGoverningContract = new MMMessageAssociationEnd<EventDescription1, List<QualifiedDocumentInformation1>>() {
		{
			businessElementTrace_lazy = () -> Document.mmAgreement;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "GovngCtrct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GoverningContract";
			definition = "Reference to the contractual context.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedDocumentInformation1.mmObject();
		}

		@Override
		public List<QualifiedDocumentInformation1> getValue(EventDescription1 obj) {
			return obj.getGoverningContract();
		}

		@Override
		public void setValue(EventDescription1 obj, List<QualifiedDocumentInformation1> value) {
			obj.setGoverningContract(value);
		}
	};
	@XmlElement(name = "LglCntxt")
	protected GovernanceRules2 legalContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GovernanceRules2
	 * GovernanceRules2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmGovernanceRules
	 * Jurisdiction.mmGovernanceRules}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EventDescription1
	 * EventDescription1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglCntxt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rules and laws governing the event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EventDescription1, Optional<GovernanceRules2>> mmLegalContext = new MMMessageAssociationEnd<EventDescription1, Optional<GovernanceRules2>>() {
		{
			businessElementTrace_lazy = () -> Jurisdiction.mmGovernanceRules;
			componentContext_lazy = () -> com.tools20022.repository.msg.EventDescription1.mmObject();
			isDerived = false;
			xmlTag = "LglCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalContext";
			definition = "Rules and laws governing the event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> GovernanceRules2.mmObject();
		}

		@Override
		public Optional<GovernanceRules2> getValue(EventDescription1 obj) {
			return obj.getLegalContext();
		}

		@Override
		public void setValue(EventDescription1 obj, Optional<GovernanceRules2> value) {
			obj.setLegalContext(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EventDescription1.mmIdentifier, com.tools20022.repository.msg.EventDescription1.mmDate, com.tools20022.repository.msg.EventDescription1.mmRecipient,
						com.tools20022.repository.msg.EventDescription1.mmAdvisor, com.tools20022.repository.msg.EventDescription1.mmOtherParty, com.tools20022.repository.msg.EventDescription1.mmLanguageCode,
						com.tools20022.repository.msg.EventDescription1.mmDescription, com.tools20022.repository.msg.EventDescription1.mmRelatedDocument, com.tools20022.repository.msg.EventDescription1.mmRelatedLetter,
						com.tools20022.repository.msg.EventDescription1.mmRelatedMessage, com.tools20022.repository.msg.EventDescription1.mmAssociatedDocument, com.tools20022.repository.msg.EventDescription1.mmGoverningContract,
						com.tools20022.repository.msg.EventDescription1.mmLegalContext);
				messageBuildingBlock_lazy = () -> Arrays.asList(PartyEventAdviceV01.mmEventNotice);
				trace_lazy = () -> Document.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventDescription1";
				definition = "Describes an event not covered by other formal messages, for example a trace after a telephone call.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentifier() {
		return identifier;
	}

	public EventDescription1 setIdentifier(Max35Text identifier) {
		this.identifier = Objects.requireNonNull(identifier);
		return this;
	}

	public Optional<ISODateTime> getDate() {
		return date == null ? Optional.empty() : Optional.of(date);
	}

	public EventDescription1 setDate(ISODateTime date) {
		this.date = date;
		return this;
	}

	public QualifiedPartyIdentification1 getRecipient() {
		return recipient;
	}

	public EventDescription1 setRecipient(QualifiedPartyIdentification1 recipient) {
		this.recipient = Objects.requireNonNull(recipient);
		return this;
	}

	public QualifiedPartyIdentification1 getAdvisor() {
		return advisor;
	}

	public EventDescription1 setAdvisor(QualifiedPartyIdentification1 advisor) {
		this.advisor = Objects.requireNonNull(advisor);
		return this;
	}

	public List<QualifiedPartyIdentification1> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public EventDescription1 setOtherParty(List<QualifiedPartyIdentification1> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public LanguageCode getLanguageCode() {
		return languageCode;
	}

	public EventDescription1 setLanguageCode(LanguageCode languageCode) {
		this.languageCode = Objects.requireNonNull(languageCode);
		return this;
	}

	public Max2000Text getDescription() {
		return description;
	}

	public EventDescription1 setDescription(Max2000Text description) {
		this.description = Objects.requireNonNull(description);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedDocument() {
		return relatedDocument == null ? relatedDocument = new ArrayList<>() : relatedDocument;
	}

	public EventDescription1 setRelatedDocument(List<QualifiedDocumentInformation1> relatedDocument) {
		this.relatedDocument = Objects.requireNonNull(relatedDocument);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedLetter() {
		return relatedLetter == null ? relatedLetter = new ArrayList<>() : relatedLetter;
	}

	public EventDescription1 setRelatedLetter(List<QualifiedDocumentInformation1> relatedLetter) {
		this.relatedLetter = Objects.requireNonNull(relatedLetter);
		return this;
	}

	public List<QualifiedDocumentInformation1> getRelatedMessage() {
		return relatedMessage == null ? relatedMessage = new ArrayList<>() : relatedMessage;
	}

	public EventDescription1 setRelatedMessage(List<QualifiedDocumentInformation1> relatedMessage) {
		this.relatedMessage = Objects.requireNonNull(relatedMessage);
		return this;
	}

	public List<QualifiedDocumentInformation1> getAssociatedDocument() {
		return associatedDocument == null ? associatedDocument = new ArrayList<>() : associatedDocument;
	}

	public EventDescription1 setAssociatedDocument(List<QualifiedDocumentInformation1> associatedDocument) {
		this.associatedDocument = Objects.requireNonNull(associatedDocument);
		return this;
	}

	public List<QualifiedDocumentInformation1> getGoverningContract() {
		return governingContract == null ? governingContract = new ArrayList<>() : governingContract;
	}

	public EventDescription1 setGoverningContract(List<QualifiedDocumentInformation1> governingContract) {
		this.governingContract = Objects.requireNonNull(governingContract);
		return this;
	}

	public Optional<GovernanceRules2> getLegalContext() {
		return legalContext == null ? Optional.empty() : Optional.of(legalContext);
	}

	public EventDescription1 setLegalContext(GovernanceRules2 legalContext) {
		this.legalContext = legalContext;
		return this;
	}
}