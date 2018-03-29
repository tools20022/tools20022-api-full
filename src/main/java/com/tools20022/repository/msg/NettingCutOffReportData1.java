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
import com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Pagination;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the meta data associated with a netting cut off report.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmMessageIdentification
 * NettingCutOffReportData1.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmCreationDateTime
 * NettingCutOffReportData1.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmReportType
 * NettingCutOffReportData1.mmReportType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmActivationDate
 * NettingCutOffReportData1.mmActivationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmNetServiceParticipantIdentification
 * NettingCutOffReportData1.mmNetServiceParticipantIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmReportServicer
 * NettingCutOffReportData1.mmReportServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmNetServiceType
 * NettingCutOffReportData1.mmNetServiceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1#mmMessagePagination
 * NettingCutOffReportData1.mmMessagePagination}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.NettingCutOffReferenceDataReportV01#mmReportData
 * NettingCutOffReferenceDataReportV01.mmReportData}</li>
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
 * "NettingCutOffReportData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the meta data associated with a netting cut off report."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NettingCutOffReportData1", propOrder = {"messageIdentification", "creationDateTime", "reportType", "activationDate", "netServiceParticipantIdentification", "reportServicer", "netServiceType", "messagePagination"})
public class NettingCutOffReportData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected Max35Text messageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingCutOffReportData1, Max35Text> mmMessageIdentification = new MMMessageAttribute<NettingCutOffReportData1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identifier for a message, as assigned by the Sender. This unique identifier can be used for cross-referencing purposes in subsequent messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(NettingCutOffReportData1 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Max35Text value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the net report was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingCutOffReportData1, ISODateTime> mmCreationDateTime = new MMMessageAttribute<NettingCutOffReportData1, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the net report was generated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(NettingCutOffReportData1 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "RptTp", required = true)
	protected Max4Text reportType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of net report, indicating how the obligations have been calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingCutOffReportData1, Max4Text> mmReportType = new MMMessageAttribute<NettingCutOffReportData1, Max4Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportType";
			definition = "Describes the type of net report, indicating how the obligations have been calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Max4Text getValue(NettingCutOffReportData1 obj) {
			return obj.getReportType();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Max4Text value) {
			obj.setReportType(value);
		}
	};
	@XmlElement(name = "ActvtnDt", required = true)
	protected ISODate activationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the proposed netting cut off will become active."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingCutOffReportData1, ISODate> mmActivationDate = new MMMessageAttribute<NettingCutOffReportData1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "ActvtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivationDate";
			definition = "Date on which the proposed netting cut off will become active.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(NettingCutOffReportData1 obj) {
			return obj.getActivationDate();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, ISODate value) {
			obj.setActivationDate(value);
		}
	};
	@XmlElement(name = "NetSvcPtcptId")
	protected PartyIdentification73Choice netServiceParticipantIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcPtcptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceParticipantIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the participant receiving the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NettingCutOffReportData1, Optional<PartyIdentification73Choice>> mmNetServiceParticipantIdentification = new MMMessageAssociationEnd<NettingCutOffReportData1, Optional<PartyIdentification73Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcPtcptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceParticipantIdentification";
			definition = "Describes the participant receiving the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(NettingCutOffReportData1 obj) {
			return obj.getNetServiceParticipantIdentification();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setNetServiceParticipantIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RptSvcr")
	protected PartyIdentification73Choice reportServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the central system responsible for generating the net report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NettingCutOffReportData1, Optional<PartyIdentification73Choice>> mmReportServicer = new MMMessageAssociationEnd<NettingCutOffReportData1, Optional<PartyIdentification73Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "RptSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportServicer";
			definition = "Describes the central system responsible for generating the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(NettingCutOffReportData1 obj) {
			return obj.getReportServicer();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setReportServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "NetSvcTp")
	protected Max35Text netServiceType;
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
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the type of netting service supporting the net report."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NettingCutOffReportData1, Optional<Max35Text>> mmNetServiceType = new MMMessageAttribute<NettingCutOffReportData1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceType";
			definition = "Describes the type of netting service supporting the net report.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(NettingCutOffReportData1 obj) {
			return obj.getNetServiceType();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Optional<Max35Text> value) {
			obj.setNetServiceType(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgPgntn")
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Pagination Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NettingCutOffReportData1
	 * NettingCutOffReportData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within the net cut off report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NettingCutOffReportData1, Optional<Pagination>> mmMessagePagination = new MMMessageAssociationEnd<NettingCutOffReportData1, Optional<Pagination>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NettingCutOffReportData1.mmObject();
			isDerived = false;
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Page number of the message (within the net cut off report) and continuation indicator to indicate that the report is to continue or that the message is the last page of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(NettingCutOffReportData1 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(NettingCutOffReportData1 obj, Optional<Pagination> value) {
			obj.setMessagePagination(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NettingCutOffReportData1.mmMessageIdentification, com.tools20022.repository.msg.NettingCutOffReportData1.mmCreationDateTime,
						com.tools20022.repository.msg.NettingCutOffReportData1.mmReportType, com.tools20022.repository.msg.NettingCutOffReportData1.mmActivationDate,
						com.tools20022.repository.msg.NettingCutOffReportData1.mmNetServiceParticipantIdentification, com.tools20022.repository.msg.NettingCutOffReportData1.mmReportServicer,
						com.tools20022.repository.msg.NettingCutOffReportData1.mmNetServiceType, com.tools20022.repository.msg.NettingCutOffReportData1.mmMessagePagination);
				messageBuildingBlock_lazy = () -> Arrays.asList(NettingCutOffReferenceDataReportV01.mmReportData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingCutOffReportData1";
				definition = "Specifies the meta data associated with a netting cut off report.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMessageIdentification() {
		return messageIdentification;
	}

	public NettingCutOffReportData1 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public NettingCutOffReportData1 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max4Text getReportType() {
		return reportType;
	}

	public NettingCutOffReportData1 setReportType(Max4Text reportType) {
		this.reportType = Objects.requireNonNull(reportType);
		return this;
	}

	public ISODate getActivationDate() {
		return activationDate;
	}

	public NettingCutOffReportData1 setActivationDate(ISODate activationDate) {
		this.activationDate = Objects.requireNonNull(activationDate);
		return this;
	}

	public Optional<PartyIdentification73Choice> getNetServiceParticipantIdentification() {
		return netServiceParticipantIdentification == null ? Optional.empty() : Optional.of(netServiceParticipantIdentification);
	}

	public NettingCutOffReportData1 setNetServiceParticipantIdentification(PartyIdentification73Choice netServiceParticipantIdentification) {
		this.netServiceParticipantIdentification = netServiceParticipantIdentification;
		return this;
	}

	public Optional<PartyIdentification73Choice> getReportServicer() {
		return reportServicer == null ? Optional.empty() : Optional.of(reportServicer);
	}

	public NettingCutOffReportData1 setReportServicer(PartyIdentification73Choice reportServicer) {
		this.reportServicer = reportServicer;
		return this;
	}

	public Optional<Max35Text> getNetServiceType() {
		return netServiceType == null ? Optional.empty() : Optional.of(netServiceType);
	}

	public NettingCutOffReportData1 setNetServiceType(Max35Text netServiceType) {
		this.netServiceType = netServiceType;
		return this;
	}

	public Optional<Pagination> getMessagePagination() {
		return messagePagination == null ? Optional.empty() : Optional.of(messagePagination);
	}

	public NettingCutOffReportData1 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
		return this;
	}
}