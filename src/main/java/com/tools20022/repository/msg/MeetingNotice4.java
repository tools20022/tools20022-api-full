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
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.MeetingType3Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information about the shareholders meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmMeetingIdentification
 * MeetingNotice4.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmIssuerMeetingIdentification
 * MeetingNotice4.mmIssuerMeetingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#mmType
 * MeetingNotice4.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmClassification
 * MeetingNotice4.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAnnouncementDate
 * MeetingNotice4.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceRequired
 * MeetingNotice4.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationInformation
 * MeetingNotice4.mmAttendanceConfirmationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationDeadline
 * MeetingNotice4.mmAttendanceConfirmationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationSTPDeadline
 * MeetingNotice4.mmAttendanceConfirmationSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAttendanceConfirmationMarketDeadline
 * MeetingNotice4.mmAttendanceConfirmationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalDocumentationURLAddress
 * MeetingNotice4.mmAdditionalDocumentationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmAdditionalProcedureDetails
 * MeetingNotice4.mmAdditionalProcedureDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmTotalNumberOfSecuritiesOutstanding
 * MeetingNotice4.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmTotalNumberOfVotingRights
 * MeetingNotice4.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyAppointmentNotificationAddress
 * MeetingNotice4.mmProxyAppointmentNotificationAddress}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice4#mmProxyChoice
 * MeetingNotice4.mmProxyChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmContactPersonDetails
 * MeetingNotice4.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice4#mmResultPublicationDate
 * MeetingNotice4.mmResultPublicationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingNotice
 * MeetingNotice}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeeting
 * MeetingNotificationV05.mmMeeting}</li>
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
 * "MeetingNotice4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.MeetingNotice3
 * MeetingNotice3}</li>
 * </ul>
 */
public class MeetingNotice4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text meetingIdentification;
	/**
	 * Identification assigned to the general meeting by the party notifying the
	 * meeting. It must be unique for the party notifying the meeting.
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
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmIdentification
	 * Meeting.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Identification assigned to the general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmMeetingIdentification
	 * MeetingNotice3.mmMeetingIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmIdentification;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "MtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to the general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			previousVersion_lazy = () -> MeetingNotice3.mmMeetingIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text issuerMeetingIdentification;
	/**
	 * Identification assigned to the meeting by the issuer. It must be unique
	 * for the issuer.
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
	 * {@linkplain com.tools20022.repository.entity.IssuerMeeting#mmIssuerMeetingIdentification
	 * IssuerMeeting.mmIssuerMeetingIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Identification assigned to the meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmIssuerMeetingIdentification
	 * MeetingNotice3.mmIssuerMeetingIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IssuerMeeting.mmIssuerMeetingIdentification;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "IssrMtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to the meeting by the issuer. It must be unique for the issuer.";
			previousVersion_lazy = () -> MeetingNotice3.mmIssuerMeetingIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected MeetingType3Code type;
	/**
	 * Specifies the type of security holders meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType3Code
	 * MeetingType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmType
	 * Meeting.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * definition} = "Specifies the type of security holders meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmType
	 * MeetingNotice3.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmType;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of security holders meeting.";
			previousVersion_lazy = () -> MeetingNotice3.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingType3Code.mmObject();
		}
	};
	protected MeetingTypeClassification1Choice classification;
	/**
	 * Classifies the type of meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MeetingTypeClassification1Choice
	 * MeetingTypeClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Clssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Classification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Classifies the type of meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmClassification
	 * MeetingNotice3.mmClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Classifies the type of meeting.";
			previousVersion_lazy = () -> MeetingNotice3.mmClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MeetingTypeClassification1Choice.mmObject();
		}
	};
	protected ISODate announcementDate;
	/**
	 * Official meeting announcement date.
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAnnouncementDate
	 * CorporateActionEvent.mmAnnouncementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAnnouncementDate
	 * MeetingNotice3.mmAnnouncementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Official meeting announcement date.";
			previousVersion_lazy = () -> MeetingNotice3.mmAnnouncementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected YesNoIndicator attendanceRequired;
	/**
	 * Indicates whether physical participation to the meeting is required in
	 * order to be allowed to vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Indicates whether physical participation to the meeting is required in order to be allowed to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceRequired
	 * MeetingNotice3.mmAttendanceRequired}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceRequired = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceRequired;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to the meeting is required in order to be allowed to vote.";
			previousVersion_lazy = () -> MeetingNotice3.mmAttendanceRequired;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text attendanceConfirmationInformation;
	/**
	 * Indicates how to order the attendance card or to give notice of
	 * attendance.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationInformation
	 * MeetingNotice3.mmAttendanceConfirmationInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceConfirmationInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceConfirmation;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationInformation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			previousVersion_lazy = () -> MeetingNotice3.mmAttendanceConfirmationInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DateFormat29Choice attendanceConfirmationDeadline;
	/**
	 * Date and time by which the beneficial owner or agent must notify of its
	 * intention to participate in the meeting. This deadline is set by an
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting. This deadline is set by an intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationDeadline
	 * MeetingNotice3.mmAttendanceConfirmationDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceConfirmationDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting. This deadline is set by an intermediary.";
			previousVersion_lazy = () -> MeetingNotice3.mmAttendanceConfirmationDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	protected DateFormat29Choice attendanceConfirmationSTPDeadline;
	/**
	 * Date and time by which the beneficial owner or agent must notify of its
	 * intention to participate in the meeting (STP mode). This deadline is set
	 * by an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncConfSTPDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceConfirmationSTPDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting (STP mode). This deadline is set by an intermediary."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationSTPDeadline
	 * MeetingNotice3.mmAttendanceConfirmationSTPDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceConfirmationSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationSTPDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of its intention to participate in the meeting (STP mode). This deadline is set by an intermediary.";
			previousVersion_lazy = () -> MeetingNotice3.mmAttendanceConfirmationSTPDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	protected DateFormat29Choice attendanceConfirmationMarketDeadline;
	/**
	 * Date and time by which the attendance to the meeting should be confirmed.
	 * This deadline is set by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAttendanceConfirmationMarketDeadline
	 * MeetingNotice3.mmAttendanceConfirmationMarketDeadline}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceConfirmationMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationMarketDeadline";
			definition = "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer.";
			previousVersion_lazy = () -> MeetingNotice3.mmAttendanceConfirmationMarketDeadline;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat29Choice.mmObject();
		}
	};
	protected Max256Text additionalDocumentationURLAddress;
	/**
	 * Address to use over the www (HTTP) service where additional information
	 * on the meeting may be found.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Address to use over the www (HTTP) service where additional information on the meeting may be found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAdditionalDocumentationURLAddress
	 * MeetingNotice3.mmAdditionalDocumentationURLAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalDocumentationURLAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AddtlDcmnttnURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentationURLAddress";
			definition = "Address to use over the www (HTTP) service where additional information on the meeting may be found.";
			previousVersion_lazy = () -> MeetingNotice3.mmAdditionalDocumentationURLAddress;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AdditionalRights2> additionalProcedureDetails;
	/**
	 * Additional procedural information about the general meeting, specifying
	 * the participation requirements and the voting procedures. Alternatively,
	 * this may indicate where such information may be obtained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalRights2
	 * AdditionalRights2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmAdditionalRight
	 * Meeting.mmAdditionalRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPrcdrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalProcedureDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional procedural information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, this may indicate where such information may be obtained."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmAdditionalProcedureDetails
	 * MeetingNotice3.mmAdditionalProcedureDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalProcedureDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAdditionalRight;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "AddtlPrcdrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalProcedureDetails";
			definition = "Additional procedural information about the general meeting, specifying the participation requirements and the voting procedures. Alternatively, this may indicate where such information may be obtained.";
			previousVersion_lazy = () -> MeetingNotice3.mmAdditionalProcedureDetails;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalRights2.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice totalNumberOfSecuritiesOutstanding;
	/**
	 * Number of securities admitted to the vote, expressed as an amount and a
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingParticipation#mmTotalNumberOfSecuritiesOutstanding
	 * MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmTotalNumberOfSecuritiesOutstanding
	 * MeetingNotice3.mmTotalNumberOfSecuritiesOutstanding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfSecuritiesOutstanding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfSctiesOutsdng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			previousVersion_lazy = () -> MeetingNotice3.mmTotalNumberOfSecuritiesOutstanding;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected Number totalNumberOfVotingRights;
	/**
	 * Number of rights admitted to the vote.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmTotalNumberOfVotingRights
	 * MeetingNotice3.mmTotalNumberOfVotingRights}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfVotingRights = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfVotingRights;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			previousVersion_lazy = () -> MeetingNotice3.mmTotalNumberOfVotingRights;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected PostalAddress1 proxyAppointmentNotificationAddress;
	/**
	 * Address where the information on the proxy should be sent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmProxyAppointmentNotificationAddress
	 * MeetingNotice3.mmProxyAppointmentNotificationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxyAppointmentNotificationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntNtfctnAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentNotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			previousVersion_lazy = () -> MeetingNotice3.mmProxyAppointmentNotificationAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	protected Proxy2Choice proxyChoice;
	/**
	 * Indicates whether a proxy is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Proxy2Choice
	 * Proxy2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether a proxy is allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmProxyChoice
	 * MeetingNotice3.mmProxyChoice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxyChoice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmProxyAppointmentConditions;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "PrxyChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyChoice";
			definition = "Indicates whether a proxy is allowed.";
			previousVersion_lazy = () -> MeetingNotice3.mmProxyChoice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Proxy2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MeetingContactPerson2> contactPersonDetails;
	/**
	 * Contact person at the party organising the meeting, at the issuer or at
	 * an intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MeetingContactPerson2
	 * MeetingContactPerson2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmContactPersonDetails
	 * MeetingNotice3.mmContactPersonDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmContactPersonDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonDetails";
			definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
			previousVersion_lazy = () -> MeetingNotice3.mmContactPersonDetails;
			maxOccurs = 12;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson2.mmObject();
		}
	};
	protected DateFormat3Choice resultPublicationDate;
	/**
	 * Date on which the company publishes the results of its meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat3Choice
	 * DateFormat3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmResultPublicationDate
	 * CorporateActionEvent.mmResultPublicationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice4 MeetingNotice4}</li>
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
	 * "Date on which the company publishes the results of its meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice3#mmResultPublicationDate
	 * MeetingNotice3.mmResultPublicationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmResultPublicationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> MeetingNotice4.mmObject();
			isDerived = false;
			xmlTag = "RsltPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which the company publishes the results of its meeting.";
			previousVersion_lazy = () -> MeetingNotice3.mmResultPublicationDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MeetingNotice4.mmMeetingIdentification, MeetingNotice4.mmIssuerMeetingIdentification, MeetingNotice4.mmType, MeetingNotice4.mmClassification, MeetingNotice4.mmAnnouncementDate,
						MeetingNotice4.mmAttendanceRequired, MeetingNotice4.mmAttendanceConfirmationInformation, MeetingNotice4.mmAttendanceConfirmationDeadline, MeetingNotice4.mmAttendanceConfirmationSTPDeadline,
						MeetingNotice4.mmAttendanceConfirmationMarketDeadline, MeetingNotice4.mmAdditionalDocumentationURLAddress, MeetingNotice4.mmAdditionalProcedureDetails, MeetingNotice4.mmTotalNumberOfSecuritiesOutstanding,
						MeetingNotice4.mmTotalNumberOfVotingRights, MeetingNotice4.mmProxyAppointmentNotificationAddress, MeetingNotice4.mmProxyChoice, MeetingNotice4.mmContactPersonDetails, MeetingNotice4.mmResultPublicationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV05.mmMeeting);
				trace_lazy = () -> MeetingNotice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotice4";
				definition = "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				previousVersion_lazy = () -> MeetingNotice3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMeetingIdentification() {
		return meetingIdentification;
	}

	public void setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
	}

	public Max35Text getIssuerMeetingIdentification() {
		return issuerMeetingIdentification;
	}

	public void setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
	}

	public MeetingType3Code getType() {
		return type;
	}

	public void setType(MeetingType3Code type) {
		this.type = type;
	}

	public MeetingTypeClassification1Choice getClassification() {
		return classification;
	}

	public void setClassification(MeetingTypeClassification1Choice classification) {
		this.classification = classification;
	}

	public ISODate getAnnouncementDate() {
		return announcementDate;
	}

	public void setAnnouncementDate(ISODate announcementDate) {
		this.announcementDate = announcementDate;
	}

	public YesNoIndicator getAttendanceRequired() {
		return attendanceRequired;
	}

	public void setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = attendanceRequired;
	}

	public Max350Text getAttendanceConfirmationInformation() {
		return attendanceConfirmationInformation;
	}

	public void setAttendanceConfirmationInformation(Max350Text attendanceConfirmationInformation) {
		this.attendanceConfirmationInformation = attendanceConfirmationInformation;
	}

	public DateFormat29Choice getAttendanceConfirmationDeadline() {
		return attendanceConfirmationDeadline;
	}

	public void setAttendanceConfirmationDeadline(DateFormat29Choice attendanceConfirmationDeadline) {
		this.attendanceConfirmationDeadline = attendanceConfirmationDeadline;
	}

	public DateFormat29Choice getAttendanceConfirmationSTPDeadline() {
		return attendanceConfirmationSTPDeadline;
	}

	public void setAttendanceConfirmationSTPDeadline(DateFormat29Choice attendanceConfirmationSTPDeadline) {
		this.attendanceConfirmationSTPDeadline = attendanceConfirmationSTPDeadline;
	}

	public DateFormat29Choice getAttendanceConfirmationMarketDeadline() {
		return attendanceConfirmationMarketDeadline;
	}

	public void setAttendanceConfirmationMarketDeadline(DateFormat29Choice attendanceConfirmationMarketDeadline) {
		this.attendanceConfirmationMarketDeadline = attendanceConfirmationMarketDeadline;
	}

	public Max256Text getAdditionalDocumentationURLAddress() {
		return additionalDocumentationURLAddress;
	}

	public void setAdditionalDocumentationURLAddress(Max256Text additionalDocumentationURLAddress) {
		this.additionalDocumentationURLAddress = additionalDocumentationURLAddress;
	}

	public List<AdditionalRights2> getAdditionalProcedureDetails() {
		return additionalProcedureDetails;
	}

	public void setAdditionalProcedureDetails(List<com.tools20022.repository.msg.AdditionalRights2> additionalProcedureDetails) {
		this.additionalProcedureDetails = additionalProcedureDetails;
	}

	public UnitOrFaceAmount1Choice getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding;
	}

	public void setTotalNumberOfSecuritiesOutstanding(UnitOrFaceAmount1Choice totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
	}

	public Number getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights;
	}

	public void setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
	}

	public PostalAddress1 getProxyAppointmentNotificationAddress() {
		return proxyAppointmentNotificationAddress;
	}

	public void setProxyAppointmentNotificationAddress(com.tools20022.repository.msg.PostalAddress1 proxyAppointmentNotificationAddress) {
		this.proxyAppointmentNotificationAddress = proxyAppointmentNotificationAddress;
	}

	public Proxy2Choice getProxyChoice() {
		return proxyChoice;
	}

	public void setProxyChoice(Proxy2Choice proxyChoice) {
		this.proxyChoice = proxyChoice;
	}

	public List<MeetingContactPerson2> getContactPersonDetails() {
		return contactPersonDetails;
	}

	public void setContactPersonDetails(List<com.tools20022.repository.msg.MeetingContactPerson2> contactPersonDetails) {
		this.contactPersonDetails = contactPersonDetails;
	}

	public DateFormat3Choice getResultPublicationDate() {
		return resultPublicationDate;
	}

	public void setResultPublicationDate(DateFormat3Choice resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
	}
}