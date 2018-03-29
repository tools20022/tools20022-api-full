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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.MeetingType1Code;
import com.tools20022.repository.codeset.ProxyNotAllowedCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MeetingContactPerson;
import com.tools20022.repository.msg.NameAndAddress5;
import com.tools20022.repository.msg.PostalAddress1;
import com.tools20022.repository.msg.ProxyParameters;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the general meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#InitiatedByHolderOrInitiatedByCourt
 * MeetingNotice1.InitiatedByHolderOrInitiatedByCourt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ProxyAuthorisedOrNot
 * MeetingNotice1.ProxyAuthorisedOrNot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#ResolutionProposalThresholdOrPercentage
 * MeetingNotice1.ResolutionProposalThresholdOrPercentage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmMeetingIdentification
 * MeetingNotice1.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmIssuerMeetingIdentification
 * MeetingNotice1.mmIssuerMeetingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#mmType
 * MeetingNotice1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAnnouncementDate
 * MeetingNotice1.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceRequired
 * MeetingNotice1.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationInformation
 * MeetingNotice1.mmAttendanceConfirmationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationDeadline
 * MeetingNotice1.mmAttendanceConfirmationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationElectronicDeadline
 * MeetingNotice1.mmAttendanceConfirmationElectronicDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAttendanceConfirmationMarketDeadline
 * MeetingNotice1.mmAttendanceConfirmationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmAdditionalDocumentationURLAddress
 * MeetingNotice1.mmAdditionalDocumentationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalDeadline
 * MeetingNotice1.mmResolutionProposalDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalMarketDeadline
 * MeetingNotice1.mmResolutionProposalMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxyAppointmentNotificationAddress
 * MeetingNotice1.mmProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmTotalNumberOfSecuritiesOutstanding
 * MeetingNotice1.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmTotalNumberOfVotingRights
 * MeetingNotice1.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmContactPersonDetails
 * MeetingNotice1.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResultPublicationDate
 * MeetingNotice1.mmResultPublicationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmInitiatedByHolder
 * MeetingNotice1.mmInitiatedByHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmInitiatedByCourt
 * MeetingNotice1.mmInitiatedByCourt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxyNotAllowed
 * MeetingNotice1.mmProxyNotAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxy
 * MeetingNotice1.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThreshold
 * MeetingNotice1.mmResolutionProposalThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThresholdPercentage
 * MeetingNotice1.mmResolutionProposalThresholdPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingNotice
 * MeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotice1", propOrder = {"meetingIdentification", "issuerMeetingIdentification", "type", "announcementDate", "attendanceRequired", "attendanceConfirmationInformation", "attendanceConfirmationDeadline",
		"attendanceConfirmationElectronicDeadline", "attendanceConfirmationMarketDeadline", "additionalDocumentationURLAddress", "resolutionProposalDeadline", "resolutionProposalMarketDeadline", "proxyAppointmentNotificationAddress",
		"totalNumberOfSecuritiesOutstanding", "totalNumberOfVotingRights", "contactPersonDetails", "resultPublicationDate", "initiatedByHolder", "initiatedByCourt", "proxyNotAllowed", "proxy", "resolutionProposalThreshold",
		"resolutionProposalThresholdPercentage"})
public class MeetingNotice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtgId")
	protected Max35Text meetingIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
	 * Meeting.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Max35Text>> mmMeetingIdentification = new MMMessageAttribute<MeetingNotice1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "MtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MeetingNotice1 obj) {
			return obj.getMeetingIdentification();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Max35Text> value) {
			obj.setMeetingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IssrMtgId")
	protected Max35Text issuerMeetingIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmIssuerMeetingIdentification
	 * IssuerMeeting.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrMtgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerMeetingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned to a general meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Max35Text>> mmIssuerMeetingIdentification = new MMMessageAttribute<MeetingNotice1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> IssuerMeeting.mmIssuerMeetingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "IssrMtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a general meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MeetingNotice1 obj) {
			return obj.getIssuerMeetingIdentification();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Max35Text> value) {
			obj.setIssuerMeetingIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MeetingType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType1Code
	 * MeetingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmType
	 * Meeting.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of meeting for which instructions are sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, MeetingType1Code> mmType = new MMMessageAttribute<MeetingNotice1, MeetingType1Code>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of meeting for which instructions are sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingType1Code.mmObject();
		}

		@Override
		public MeetingType1Code getValue(MeetingNotice1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(MeetingNotice1 obj, MeetingType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "AnncmntDt")
	protected ISODate announcementDate;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AnncmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Official meeting announcement date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODate>> mmAnnouncementDate = new MMMessageAttribute<MeetingNotice1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Official meeting announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MeetingNotice1 obj) {
			return obj.getAnnouncementDate();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODate> value) {
			obj.setAnnouncementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncReqrd")
	protected YesNoIndicator attendanceRequired;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceRequired
	 * Meeting.mmAttendanceRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether physical participation to a general meeting is required in order to be allowed to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<YesNoIndicator>> mmAttendanceRequired = new MMMessageAttribute<MeetingNotice1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AttndncReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a general meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(MeetingNotice1 obj) {
			return obj.getAttendanceRequired();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<YesNoIndicator> value) {
			obj.setAttendanceRequired(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfInf")
	protected Max350Text attendanceConfirmationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAttendanceConfirmation
	 * Meeting.mmAttendanceConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how to order the attendance card or to give notice of attendance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Max350Text>> mmAttendanceConfirmationInformation = new MMMessageAttribute<MeetingNotice1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationInformation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(MeetingNotice1 obj) {
			return obj.getAttendanceConfirmationInformation();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Max350Text> value) {
			obj.setAttendanceConfirmationInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfDdln")
	protected ISODateTime attendanceConfirmationDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>> mmAttendanceConfirmationDeadline = new MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MeetingNotice1 obj) {
			return obj.getAttendanceConfirmationDeadline();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODateTime> value) {
			obj.setAttendanceConfirmationDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfElctrncDdln")
	protected ISODateTime attendanceConfirmationElectronicDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfElctrncDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationElectronicDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting (STP mode). This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>> mmAttendanceConfirmationElectronicDeadline = new MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfElctrncDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationElectronicDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting (STP mode). This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MeetingNotice1 obj) {
			return obj.getAttendanceConfirmationElectronicDeadline();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODateTime> value) {
			obj.setAttendanceConfirmationElectronicDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AttndncConfMktDdln")
	protected ISODateTime attendanceConfirmationMarketDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>> mmAttendanceConfirmationMarketDeadline = new MMMessageAttribute<MeetingNotice1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationMarketDeadline";
			definition = "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(MeetingNotice1 obj) {
			return obj.getAttendanceConfirmationMarketDeadline();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODateTime> value) {
			obj.setAttendanceConfirmationMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlDcmnttnURLAdr")
	protected Max256Text additionalDocumentationURLAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#mmURLAddress
	 * ElectronicAddress.mmURLAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlDcmnttnURLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentationURLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address to use over the www (HTTP) service where addtional information on the meeting may be found."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Max256Text>> mmAdditionalDocumentationURLAddress = new MMMessageAttribute<MeetingNotice1, Optional<Max256Text>>() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "AddtlDcmnttnURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentationURLAddress";
			definition = "Address to use over the www (HTTP) service where addtional information on the meeting may be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(MeetingNotice1 obj) {
			return obj.getAdditionalDocumentationURLAddress();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Max256Text> value) {
			obj.setAdditionalDocumentationURLAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnPrpslDdln")
	protected ISODate resolutionProposalDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnPrpslDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODate>> mmResolutionProposalDeadline = new MMMessageAttribute<MeetingNotice1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalDeadline";
			definition = "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MeetingNotice1 obj) {
			return obj.getResolutionProposalDeadline();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODate> value) {
			obj.setResolutionProposalDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnPrpslMktDdln")
	protected ISODate resolutionProposalMarketDeadline;
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
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnPrpslMktDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalMarketDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODate>> mmResolutionProposalMarketDeadline = new MMMessageAttribute<MeetingNotice1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalMarketDeadline";
			definition = "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MeetingNotice1 obj) {
			return obj.getResolutionProposalMarketDeadline();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODate> value) {
			obj.setResolutionProposalMarketDeadline(value.orElse(null));
		}
	};
	@XmlElement(name = "PrxyAppntmntNtfctnAdr")
	protected PostalAddress1 proxyAppointmentNotificationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAppntmntNtfctnAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAppointmentNotificationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address where the information on the proxy should be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice1, Optional<PostalAddress1>> mmProxyAppointmentNotificationAddress = new MMMessageAssociationEnd<MeetingNotice1, Optional<PostalAddress1>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntNtfctnAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentNotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PostalAddress1.mmObject();
		}

		@Override
		public Optional<PostalAddress1> getValue(MeetingNotice1 obj) {
			return obj.getProxyAppointmentNotificationAddress();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<PostalAddress1> value) {
			obj.setProxyAppointmentNotificationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfSctiesOutsdng")
	protected CurrencyAndAmount totalNumberOfSecuritiesOutstanding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecuritiesOutstanding
	 * MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfSctiesOutsdng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfSecuritiesOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of securities admitted to the vote, expressed as an amount and a currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<CurrencyAndAmount>> mmTotalNumberOfSecuritiesOutstanding = new MMMessageAttribute<MeetingNotice1, Optional<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfSctiesOutsdng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<CurrencyAndAmount> getValue(MeetingNotice1 obj) {
			return obj.getTotalNumberOfSecuritiesOutstanding();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<CurrencyAndAmount> value) {
			obj.setTotalNumberOfSecuritiesOutstanding(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfVtngRghts")
	protected Number totalNumberOfVotingRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfVotingRights
	 * MeetingParticipation.mmTotalNumberOfVotingRights}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfVtngRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfVotingRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of rights admitted to the vote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Number>> mmTotalNumberOfVotingRights = new MMMessageAttribute<MeetingNotice1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfVotingRights;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(MeetingNotice1 obj) {
			return obj.getTotalNumberOfVotingRights();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Number> value) {
			obj.setTotalNumberOfVotingRights(value.orElse(null));
		}
	};
	@XmlElement(name = "CtctPrsnDtls")
	protected List<MeetingContactPerson> contactPersonDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MeetingContactPerson
	 * MeetingContactPerson}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtctPrsnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPersonDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contact person at the party organising the meeting, at the issuer or at an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice1, List<MeetingContactPerson>> mmContactPersonDetails = new MMMessageAssociationEnd<MeetingNotice1, List<MeetingContactPerson>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonDetails";
			definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
			maxOccurs = 12;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MeetingContactPerson.mmObject();
		}

		@Override
		public List<MeetingContactPerson> getValue(MeetingNotice1 obj) {
			return obj.getContactPersonDetails();
		}

		@Override
		public void setValue(MeetingNotice1 obj, List<MeetingContactPerson> value) {
			obj.setContactPersonDetails(value);
		}
	};
	@XmlElement(name = "RsltPblctnDt")
	protected ISODate resultPublicationDate;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltPblctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultPublicationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a company publishes the results of its meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ISODate>> mmResultPublicationDate = new MMMessageAttribute<MeetingNotice1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "RsltPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which a company publishes the results of its meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(MeetingNotice1 obj) {
			return obj.getResultPublicationDate();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ISODate> value) {
			obj.setResultPublicationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "InittdByHldr")
	protected NameAndAddress5 initiatedByHolder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InittdByHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatedByHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the security holder or the association of security holders which initiated the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice1, Optional<NameAndAddress5>> mmInitiatedByHolder = new MMMessageAssociationEnd<MeetingNotice1, Optional<NameAndAddress5>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "InittdByHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatedByHolder";
			definition = "Identifies the security holder or the association of security holders which initiated the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public Optional<NameAndAddress5> getValue(MeetingNotice1 obj) {
			return obj.getInitiatedByHolder();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<NameAndAddress5> value) {
			obj.setInitiatedByHolder(value.orElse(null));
		}
	};
	@XmlElement(name = "InittdByCrt")
	protected NameAndAddress5 initiatedByCourt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InittdByCrt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatedByCourt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the court of justice which requested that the meeting take place."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice1, Optional<NameAndAddress5>> mmInitiatedByCourt = new MMMessageAssociationEnd<MeetingNotice1, Optional<NameAndAddress5>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "InittdByCrt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatedByCourt";
			definition = "Identifies the court of justice which requested that the meeting take place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public Optional<NameAndAddress5> getValue(MeetingNotice1 obj) {
			return obj.getInitiatedByCourt();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<NameAndAddress5> value) {
			obj.setInitiatedByCourt(value.orElse(null));
		}
	};
	@XmlElement(name = "PrxyNotAllwd")
	protected ProxyNotAllowedCode proxyNotAllowed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyNotAllowedCode
	 * ProxyNotAllowedCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyNotAllwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that no proxy is allowed for a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<ProxyNotAllowedCode>> mmProxyNotAllowed = new MMMessageAttribute<MeetingNotice1, Optional<ProxyNotAllowedCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "PrxyNotAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyNotAllowed";
			definition = "Indicates that no proxy is allowed for a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProxyNotAllowedCode.mmObject();
		}

		@Override
		public Optional<ProxyNotAllowedCode> getValue(MeetingNotice1 obj) {
			return obj.getProxyNotAllowed();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ProxyNotAllowedCode> value) {
			obj.setProxyNotAllowed(value.orElse(null));
		}
	};
	@XmlElement(name = "Prxy")
	protected ProxyParameters proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProxyParameters
	 * ProxyParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proxy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the elements required to assign a proxy."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingNotice1, Optional<ProxyParameters>> mmProxy = new MMMessageAssociationEnd<MeetingNotice1, Optional<ProxyParameters>>() {
		{
			businessElementTrace_lazy = () -> Meeting.mmProxyAppointmentConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Specifies the elements required to assign a proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProxyParameters.mmObject();
		}

		@Override
		public Optional<ProxyParameters> getValue(MeetingNotice1 obj) {
			return obj.getProxy();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<ProxyParameters> value) {
			obj.setProxy(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnPrpslThrshld")
	protected Max350Text resolutionProposalThreshold;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmResolutionProposalThreshold
	 * ResolutionProposal.mmResolutionProposalThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnPrpslThrshld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThreshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<Max350Text>> mmResolutionProposalThreshold = new MMMessageAttribute<MeetingNotice1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> ResolutionProposal.mmResolutionProposalThreshold;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThreshold";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(MeetingNotice1 obj) {
			return obj.getResolutionProposalThreshold();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<Max350Text> value) {
			obj.setResolutionProposalThreshold(value.orElse(null));
		}
	};
	@XmlElement(name = "RsltnPrpslThrshldPctg")
	protected PercentageRate resolutionProposalThresholdPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ResolutionProposal#mmResolutionProposalThresholdPercentage
	 * ResolutionProposal.mmResolutionProposalThresholdPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnPrpslThrshldPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThresholdPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingNotice1, Optional<PercentageRate>> mmResolutionProposalThresholdPercentage = new MMMessageAttribute<MeetingNotice1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ResolutionProposal.mmResolutionProposalThresholdPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslThrshldPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThresholdPercentage";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(MeetingNotice1 obj) {
			return obj.getResolutionProposalThresholdPercentage();
		}

		@Override
		public void setValue(MeetingNotice1 obj, Optional<PercentageRate> value) {
			obj.setResolutionProposalThresholdPercentage(value.orElse(null));
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmInitiatedByHolder
	 * MeetingNotice1.mmInitiatedByHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmInitiatedByCourt
	 * MeetingNotice1.mmInitiatedByCourt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatedByHolderOrInitiatedByCourt"</li>
	 * </ul>
	 */
	public static final MMXor InitiatedByHolderOrInitiatedByCourt = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatedByHolderOrInitiatedByCourt";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmInitiatedByHolder, com.tools20022.repository.msg.MeetingNotice1.mmInitiatedByCourt);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxyNotAllowed
	 * MeetingNotice1.mmProxyNotAllowed}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice1#mmProxy
	 * MeetingNotice1.mmProxy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAuthorisedOrNot"</li>
	 * </ul>
	 */
	public static final MMXor ProxyAuthorisedOrNot = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAuthorisedOrNot";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmProxyNotAllowed, com.tools20022.repository.msg.MeetingNotice1.mmProxy);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1 MeetingNotice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThreshold
	 * MeetingNotice1.mmResolutionProposalThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice1#mmResolutionProposalThresholdPercentage
	 * MeetingNotice1.mmResolutionProposalThresholdPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThresholdOrPercentage"</li>
	 * </ul>
	 */
	public static final MMXor ResolutionProposalThresholdOrPercentage = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThresholdOrPercentage";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalThreshold, com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalThresholdPercentage);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.mmMeetingIdentification, com.tools20022.repository.msg.MeetingNotice1.mmIssuerMeetingIdentification,
						com.tools20022.repository.msg.MeetingNotice1.mmType, com.tools20022.repository.msg.MeetingNotice1.mmAnnouncementDate, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceRequired,
						com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationInformation, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationDeadline,
						com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationElectronicDeadline, com.tools20022.repository.msg.MeetingNotice1.mmAttendanceConfirmationMarketDeadline,
						com.tools20022.repository.msg.MeetingNotice1.mmAdditionalDocumentationURLAddress, com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalDeadline,
						com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalMarketDeadline, com.tools20022.repository.msg.MeetingNotice1.mmProxyAppointmentNotificationAddress,
						com.tools20022.repository.msg.MeetingNotice1.mmTotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.MeetingNotice1.mmTotalNumberOfVotingRights,
						com.tools20022.repository.msg.MeetingNotice1.mmContactPersonDetails, com.tools20022.repository.msg.MeetingNotice1.mmResultPublicationDate, com.tools20022.repository.msg.MeetingNotice1.mmInitiatedByHolder,
						com.tools20022.repository.msg.MeetingNotice1.mmInitiatedByCourt, com.tools20022.repository.msg.MeetingNotice1.mmProxyNotAllowed, com.tools20022.repository.msg.MeetingNotice1.mmProxy,
						com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalThreshold, com.tools20022.repository.msg.MeetingNotice1.mmResolutionProposalThresholdPercentage);
				trace_lazy = () -> MeetingNotice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingNotice1";
				definition = "Information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice1.InitiatedByHolderOrInitiatedByCourt, com.tools20022.repository.msg.MeetingNotice1.ProxyAuthorisedOrNot,
						com.tools20022.repository.msg.MeetingNotice1.ResolutionProposalThresholdOrPercentage);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMeetingIdentification() {
		return meetingIdentification == null ? Optional.empty() : Optional.of(meetingIdentification);
	}

	public MeetingNotice1 setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
		return this;
	}

	public Optional<Max35Text> getIssuerMeetingIdentification() {
		return issuerMeetingIdentification == null ? Optional.empty() : Optional.of(issuerMeetingIdentification);
	}

	public MeetingNotice1 setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
		return this;
	}

	public MeetingType1Code getType() {
		return type;
	}

	public MeetingNotice1 setType(MeetingType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<ISODate> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public MeetingNotice1 setAnnouncementDate(ISODate announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public Optional<YesNoIndicator> getAttendanceRequired() {
		return attendanceRequired == null ? Optional.empty() : Optional.of(attendanceRequired);
	}

	public MeetingNotice1 setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = attendanceRequired;
		return this;
	}

	public Optional<Max350Text> getAttendanceConfirmationInformation() {
		return attendanceConfirmationInformation == null ? Optional.empty() : Optional.of(attendanceConfirmationInformation);
	}

	public MeetingNotice1 setAttendanceConfirmationInformation(Max350Text attendanceConfirmationInformation) {
		this.attendanceConfirmationInformation = attendanceConfirmationInformation;
		return this;
	}

	public Optional<ISODateTime> getAttendanceConfirmationDeadline() {
		return attendanceConfirmationDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationDeadline);
	}

	public MeetingNotice1 setAttendanceConfirmationDeadline(ISODateTime attendanceConfirmationDeadline) {
		this.attendanceConfirmationDeadline = attendanceConfirmationDeadline;
		return this;
	}

	public Optional<ISODateTime> getAttendanceConfirmationElectronicDeadline() {
		return attendanceConfirmationElectronicDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationElectronicDeadline);
	}

	public MeetingNotice1 setAttendanceConfirmationElectronicDeadline(ISODateTime attendanceConfirmationElectronicDeadline) {
		this.attendanceConfirmationElectronicDeadline = attendanceConfirmationElectronicDeadline;
		return this;
	}

	public Optional<ISODateTime> getAttendanceConfirmationMarketDeadline() {
		return attendanceConfirmationMarketDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationMarketDeadline);
	}

	public MeetingNotice1 setAttendanceConfirmationMarketDeadline(ISODateTime attendanceConfirmationMarketDeadline) {
		this.attendanceConfirmationMarketDeadline = attendanceConfirmationMarketDeadline;
		return this;
	}

	public Optional<Max256Text> getAdditionalDocumentationURLAddress() {
		return additionalDocumentationURLAddress == null ? Optional.empty() : Optional.of(additionalDocumentationURLAddress);
	}

	public MeetingNotice1 setAdditionalDocumentationURLAddress(Max256Text additionalDocumentationURLAddress) {
		this.additionalDocumentationURLAddress = additionalDocumentationURLAddress;
		return this;
	}

	public Optional<ISODate> getResolutionProposalDeadline() {
		return resolutionProposalDeadline == null ? Optional.empty() : Optional.of(resolutionProposalDeadline);
	}

	public MeetingNotice1 setResolutionProposalDeadline(ISODate resolutionProposalDeadline) {
		this.resolutionProposalDeadline = resolutionProposalDeadline;
		return this;
	}

	public Optional<ISODate> getResolutionProposalMarketDeadline() {
		return resolutionProposalMarketDeadline == null ? Optional.empty() : Optional.of(resolutionProposalMarketDeadline);
	}

	public MeetingNotice1 setResolutionProposalMarketDeadline(ISODate resolutionProposalMarketDeadline) {
		this.resolutionProposalMarketDeadline = resolutionProposalMarketDeadline;
		return this;
	}

	public Optional<PostalAddress1> getProxyAppointmentNotificationAddress() {
		return proxyAppointmentNotificationAddress == null ? Optional.empty() : Optional.of(proxyAppointmentNotificationAddress);
	}

	public MeetingNotice1 setProxyAppointmentNotificationAddress(PostalAddress1 proxyAppointmentNotificationAddress) {
		this.proxyAppointmentNotificationAddress = proxyAppointmentNotificationAddress;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding == null ? Optional.empty() : Optional.of(totalNumberOfSecuritiesOutstanding);
	}

	public MeetingNotice1 setTotalNumberOfSecuritiesOutstanding(CurrencyAndAmount totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
		return this;
	}

	public Optional<Number> getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights == null ? Optional.empty() : Optional.of(totalNumberOfVotingRights);
	}

	public MeetingNotice1 setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
		return this;
	}

	public List<MeetingContactPerson> getContactPersonDetails() {
		return contactPersonDetails == null ? contactPersonDetails = new ArrayList<>() : contactPersonDetails;
	}

	public MeetingNotice1 setContactPersonDetails(List<MeetingContactPerson> contactPersonDetails) {
		this.contactPersonDetails = Objects.requireNonNull(contactPersonDetails);
		return this;
	}

	public Optional<ISODate> getResultPublicationDate() {
		return resultPublicationDate == null ? Optional.empty() : Optional.of(resultPublicationDate);
	}

	public MeetingNotice1 setResultPublicationDate(ISODate resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
		return this;
	}

	public Optional<NameAndAddress5> getInitiatedByHolder() {
		return initiatedByHolder == null ? Optional.empty() : Optional.of(initiatedByHolder);
	}

	public MeetingNotice1 setInitiatedByHolder(NameAndAddress5 initiatedByHolder) {
		this.initiatedByHolder = initiatedByHolder;
		return this;
	}

	public Optional<NameAndAddress5> getInitiatedByCourt() {
		return initiatedByCourt == null ? Optional.empty() : Optional.of(initiatedByCourt);
	}

	public MeetingNotice1 setInitiatedByCourt(NameAndAddress5 initiatedByCourt) {
		this.initiatedByCourt = initiatedByCourt;
		return this;
	}

	public Optional<ProxyNotAllowedCode> getProxyNotAllowed() {
		return proxyNotAllowed == null ? Optional.empty() : Optional.of(proxyNotAllowed);
	}

	public MeetingNotice1 setProxyNotAllowed(ProxyNotAllowedCode proxyNotAllowed) {
		this.proxyNotAllowed = proxyNotAllowed;
		return this;
	}

	public Optional<ProxyParameters> getProxy() {
		return proxy == null ? Optional.empty() : Optional.of(proxy);
	}

	public MeetingNotice1 setProxy(ProxyParameters proxy) {
		this.proxy = proxy;
		return this;
	}

	public Optional<Max350Text> getResolutionProposalThreshold() {
		return resolutionProposalThreshold == null ? Optional.empty() : Optional.of(resolutionProposalThreshold);
	}

	public MeetingNotice1 setResolutionProposalThreshold(Max350Text resolutionProposalThreshold) {
		this.resolutionProposalThreshold = resolutionProposalThreshold;
		return this;
	}

	public Optional<PercentageRate> getResolutionProposalThresholdPercentage() {
		return resolutionProposalThresholdPercentage == null ? Optional.empty() : Optional.of(resolutionProposalThresholdPercentage);
	}

	public MeetingNotice1 setResolutionProposalThresholdPercentage(PercentageRate resolutionProposalThresholdPercentage) {
		this.resolutionProposalThresholdPercentage = resolutionProposalThresholdPercentage;
		return this;
	}
}