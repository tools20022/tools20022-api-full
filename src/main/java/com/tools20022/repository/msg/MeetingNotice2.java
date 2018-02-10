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
import com.tools20022.repository.area.seev.MeetingNotificationV02;
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.choice.DateFormat3Choice;
import com.tools20022.repository.codeset.MeetingType2Code;
import com.tools20022.repository.codeset.MeetingTypeClassification1Code;
import com.tools20022.repository.codeset.ProxyNotAllowedCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the shareholders meeting, specifying the participation
 * requirements and the voting procedures. Alternatively, it may indicate where
 * such information may be obtained.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ProxyAuthorisedOrNotRule
 * MeetingNotice2.ProxyAuthorisedOrNotRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ResolutionProposalThresholdOrPercentageRule
 * MeetingNotice2.ResolutionProposalThresholdOrPercentageRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#ClassificationOrExtendedClassificationRule
 * MeetingNotice2.ClassificationOrExtendedClassificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmMeetingIdentification
 * MeetingNotice2.mmMeetingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmIssuerMeetingIdentification
 * MeetingNotice2.mmIssuerMeetingIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#mmType
 * MeetingNotice2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmClassification
 * MeetingNotice2.mmClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmExtendedClassification
 * MeetingNotice2.mmExtendedClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAnnouncementDate
 * MeetingNotice2.mmAnnouncementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceRequired
 * MeetingNotice2.mmAttendanceRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationInformation
 * MeetingNotice2.mmAttendanceConfirmationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationDeadline
 * MeetingNotice2.mmAttendanceConfirmationDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationSTPDeadline
 * MeetingNotice2.mmAttendanceConfirmationSTPDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAttendanceConfirmationMarketDeadline
 * MeetingNotice2.mmAttendanceConfirmationMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmAdditionalDocumentationURLAddress
 * MeetingNotice2.mmAdditionalDocumentationURLAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalDeadline
 * MeetingNotice2.mmResolutionProposalDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalMarketDeadline
 * MeetingNotice2.mmResolutionProposalMarketDeadline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThreshold
 * MeetingNotice2.mmResolutionProposalThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThresholdPercentage
 * MeetingNotice2.mmResolutionProposalThresholdPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmTotalNumberOfSecuritiesOutstanding
 * MeetingNotice2.mmTotalNumberOfSecuritiesOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmTotalNumberOfVotingRights
 * MeetingNotice2.mmTotalNumberOfVotingRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxyAppointmentNotificationAddress
 * MeetingNotice2.mmProxyAppointmentNotificationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxyNotAllowed
 * MeetingNotice2.mmProxyNotAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxy
 * MeetingNotice2.mmProxy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmContactPersonDetails
 * MeetingNotice2.mmContactPersonDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResultPublicationDate
 * MeetingNotice2.mmResultPublicationDate}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeeting
 * MeetingNotificationV02.mmMeeting}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotice2", propOrder = {"meetingIdentification", "issuerMeetingIdentification", "type", "classification", "extendedClassification", "announcementDate", "attendanceRequired", "attendanceConfirmationInformation",
		"attendanceConfirmationDeadline", "attendanceConfirmationSTPDeadline", "attendanceConfirmationMarketDeadline", "additionalDocumentationURLAddress", "resolutionProposalDeadline", "resolutionProposalMarketDeadline",
		"resolutionProposalThreshold", "resolutionProposalThresholdPercentage", "totalNumberOfSecuritiesOutstanding", "totalNumberOfVotingRights", "proxyAppointmentNotificationAddress", "proxyNotAllowed", "proxy", "contactPersonDetails",
		"resultPublicationDate"})
public class MeetingNotice2 {

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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "MtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingIdentification";
			definition = "Identification assigned to a general meeting by the party notifying the meeting. It must be unique for the party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	 * "Identification assigned to a meeting by the issuer. It must be unique for the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerMeetingIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> IssuerMeeting.mmIssuerMeetingIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "IssrMtgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerMeetingIdentification";
			definition = "Identification assigned to a meeting by the issuer. It must be unique for the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected MeetingType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingType2Code
	 * MeetingType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmType
	 * Meeting.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of security holders meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingType2Code.mmObject();
		}
	};
	@XmlElement(name = "Clssfctn")
	protected MeetingTypeClassification1Code classification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingTypeClassification1Code
	 * MeetingTypeClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "Clssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Classification";
			definition = "Classifies the type of meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MeetingTypeClassification1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedClssfctn")
	protected Extended350Code extendedClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingEventClassification
	 * Meeting.mmMeetingEventClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This code can be used in case another meeting classifications is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedClassification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingEventClassification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "XtndedClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedClassification";
			definition = "This code can be used in case another meeting classifications is required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmAnnouncementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAnnouncementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AnncmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDate";
			definition = "Official meeting announcement date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "AttndncReqrd", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	 * "Indicates whether physical participation to a meeting is required in order to be allowed to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceRequired = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AttndncReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceRequired";
			definition = "Indicates whether physical participation to a meeting is required in order to be allowed to vote.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmAttendanceConfirmationInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmAttendanceConfirmation;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationInformation";
			definition = "Indicates how to order the attendance card or to give notice of attendance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "AttndncConfDdln")
	protected DateFormat2Choice attendanceConfirmationDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmAttendanceConfirmationDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "AttndncConfSTPDdln")
	protected DateFormat2Choice attendanceConfirmationSTPDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmSTPDeadline
	 * Deadline.mmSTPDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	 * "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting (STP mode). This deadline is set by an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceConfirmationSTPDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmSTPDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfSTPDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationSTPDeadline";
			definition = "Date and time by which the beneficial owner or agent must notify of their intention to participate in a meeting (STP mode). This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "AttndncConfMktDdln")
	protected DateFormat2Choice attendanceConfirmationMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmAttendanceConfirmationMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AttndncConfMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceConfirmationMarketDeadline";
			definition = "Date and time by which the attendance to the meeting should be confirmed. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmAdditionalDocumentationURLAddress = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ElectronicAddress.mmURLAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "AddtlDcmnttnURLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentationURLAddress";
			definition = "Address to use over the www (HTTP) service where addtional information on the meeting may be found.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "RsltnPrpslDdln")
	protected DateFormat2Choice resolutionProposalDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmIntermediaryDeadline
	 * Deadline.mmIntermediaryDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmResolutionProposalDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmIntermediaryDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalDeadline";
			definition = "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "RsltnPrpslMktDdln")
	protected DateFormat2Choice resolutionProposalMarketDeadline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Deadline#mmMarketDeadline
	 * Deadline.mmMarketDeadline}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmResolutionProposalMarketDeadline = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Deadline.mmMarketDeadline;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslMktDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalMarketDeadline";
			definition = "Date and time by which security holders can propose amendments or new resolutions. This deadline is set by the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmResolutionProposalThreshold = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ResolutionProposal.mmResolutionProposalThreshold;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslThrshld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThreshold";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmResolutionProposalThresholdPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ResolutionProposal.mmResolutionProposalThresholdPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "RsltnPrpslThrshldPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThresholdPercentage";
			definition = "Specifies the minimum stake in share capital or cash value or number of security holders required to table resolutions. This minimum is expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmTotalNumberOfSecuritiesOutstanding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfSecuritiesOutstanding;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfSctiesOutsdng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfSecuritiesOutstanding";
			definition = "Number of securities admitted to the vote, expressed as an amount and a currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmTotalNumberOfVotingRights = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> MeetingParticipation.mmTotalNumberOfVotingRights;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfVtngRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfVotingRights";
			definition = "Number of rights admitted to the vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAssociationEnd mmProxyAppointmentNotificationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "PrxyAppntmntNtfctnAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAppointmentNotificationAddress";
			definition = "Address where the information on the proxy should be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmProxyNotAllowed = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "PrxyNotAllwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyNotAllowed";
			definition = "Indicates that no proxy is allowed for a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ProxyNotAllowedCode.mmObject();
		}
	};
	@XmlElement(name = "Prxy")
	protected ProxyAppointmentInformation1 proxy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProxyAppointmentInformation1
	 * ProxyAppointmentInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmProxyAppointmentConditions
	 * Meeting.mmProxyAppointmentConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAssociationEnd mmProxy = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmProxyAppointmentConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "Prxy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proxy";
			definition = "Specifies the elements required to assign a proxy.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProxyAppointmentInformation1.mmObject();
		}
	};
	@XmlElement(name = "CtctPrsnDtls")
	protected List<com.tools20022.repository.msg.MeetingContactPerson1> contactPersonDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MeetingContactPerson1
	 * MeetingContactPerson1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAssociationEnd mmContactPersonDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "CtctPrsnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPersonDetails";
			definition = "Contact person at the party organising the meeting, at the issuer or at an intermediary.";
			maxOccurs = 12;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MeetingContactPerson1.mmObject();
		}
	};
	@XmlElement(name = "RsltPblctnDt")
	protected DateFormat3Choice resultPublicationDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
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
	public static final MMMessageAttribute mmResultPublicationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmResultPublicationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			isDerived = false;
			xmlTag = "RsltPblctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultPublicationDate";
			definition = "Date on which a company publishes the results of its meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat3Choice.mmObject();
		}
	};
	/**
	 * Either Proxy or ProxyNotAllowed may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxyNotAllowed
	 * MeetingNotice2.mmProxyNotAllowed}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.MeetingNotice2#mmProxy
	 * MeetingNotice2.mmProxy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAuthorisedOrNotRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Proxy or ProxyNotAllowed may be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor ProxyAuthorisedOrNotRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAuthorisedOrNotRule";
			definition = "Either Proxy or ProxyNotAllowed may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.mmProxyNotAllowed, com.tools20022.repository.msg.MeetingNotice2.mmProxy);
		}
	};
	/**
	 * Either ResolutionProposalThreshold or ResolutionProposalPercentage may be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThreshold
	 * MeetingNotice2.mmResolutionProposalThreshold}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmResolutionProposalThresholdPercentage
	 * MeetingNotice2.mmResolutionProposalThresholdPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionProposalThresholdOrPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ResolutionProposalThreshold or ResolutionProposalPercentage may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ResolutionProposalThresholdOrPercentageRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionProposalThresholdOrPercentageRule";
			definition = "Either ResolutionProposalThreshold or ResolutionProposalPercentage may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalThreshold, com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalThresholdPercentage);
		}
	};
	/**
	 * Either Classification or ExtendedClassification may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2 MeetingNotice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmClassification
	 * MeetingNotice2.mmClassification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MeetingNotice2#mmExtendedClassification
	 * MeetingNotice2.mmExtendedClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassificationOrExtendedClassificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Classification or ExtendedClassification may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor ClassificationOrExtendedClassificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassificationOrExtendedClassificationRule";
			definition = "Either Classification or ExtendedClassification may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.MeetingNotice2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.mmClassification, com.tools20022.repository.msg.MeetingNotice2.mmExtendedClassification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.mmMeetingIdentification, com.tools20022.repository.msg.MeetingNotice2.mmIssuerMeetingIdentification,
						com.tools20022.repository.msg.MeetingNotice2.mmType, com.tools20022.repository.msg.MeetingNotice2.mmClassification, com.tools20022.repository.msg.MeetingNotice2.mmExtendedClassification,
						com.tools20022.repository.msg.MeetingNotice2.mmAnnouncementDate, com.tools20022.repository.msg.MeetingNotice2.mmAttendanceRequired, com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationInformation,
						com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationDeadline, com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationSTPDeadline,
						com.tools20022.repository.msg.MeetingNotice2.mmAttendanceConfirmationMarketDeadline, com.tools20022.repository.msg.MeetingNotice2.mmAdditionalDocumentationURLAddress,
						com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalDeadline, com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalMarketDeadline,
						com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalThreshold, com.tools20022.repository.msg.MeetingNotice2.mmResolutionProposalThresholdPercentage,
						com.tools20022.repository.msg.MeetingNotice2.mmTotalNumberOfSecuritiesOutstanding, com.tools20022.repository.msg.MeetingNotice2.mmTotalNumberOfVotingRights,
						com.tools20022.repository.msg.MeetingNotice2.mmProxyAppointmentNotificationAddress, com.tools20022.repository.msg.MeetingNotice2.mmProxyNotAllowed, com.tools20022.repository.msg.MeetingNotice2.mmProxy,
						com.tools20022.repository.msg.MeetingNotice2.mmContactPersonDetails, com.tools20022.repository.msg.MeetingNotice2.mmResultPublicationDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV02.mmMeeting);
				trace_lazy = () -> MeetingNotice.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "MeetingNotice2";
				definition = "Information about the shareholders meeting, specifying the participation requirements and the voting procedures. Alternatively, it may indicate where such information may be obtained.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingNotice2.ProxyAuthorisedOrNotRule, com.tools20022.repository.msg.MeetingNotice2.ResolutionProposalThresholdOrPercentageRule,
						com.tools20022.repository.msg.MeetingNotice2.ClassificationOrExtendedClassificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMeetingIdentification() {
		return meetingIdentification == null ? Optional.empty() : Optional.of(meetingIdentification);
	}

	public MeetingNotice2 setMeetingIdentification(Max35Text meetingIdentification) {
		this.meetingIdentification = meetingIdentification;
		return this;
	}

	public Optional<Max35Text> getIssuerMeetingIdentification() {
		return issuerMeetingIdentification == null ? Optional.empty() : Optional.of(issuerMeetingIdentification);
	}

	public MeetingNotice2 setIssuerMeetingIdentification(Max35Text issuerMeetingIdentification) {
		this.issuerMeetingIdentification = issuerMeetingIdentification;
		return this;
	}

	public MeetingType2Code getType() {
		return type;
	}

	public MeetingNotice2 setType(MeetingType2Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<MeetingTypeClassification1Code> getClassification() {
		return classification == null ? Optional.empty() : Optional.of(classification);
	}

	public MeetingNotice2 setClassification(MeetingTypeClassification1Code classification) {
		this.classification = classification;
		return this;
	}

	public Optional<Extended350Code> getExtendedClassification() {
		return extendedClassification == null ? Optional.empty() : Optional.of(extendedClassification);
	}

	public MeetingNotice2 setExtendedClassification(Extended350Code extendedClassification) {
		this.extendedClassification = extendedClassification;
		return this;
	}

	public Optional<ISODate> getAnnouncementDate() {
		return announcementDate == null ? Optional.empty() : Optional.of(announcementDate);
	}

	public MeetingNotice2 setAnnouncementDate(ISODate announcementDate) {
		this.announcementDate = announcementDate;
		return this;
	}

	public YesNoIndicator getAttendanceRequired() {
		return attendanceRequired;
	}

	public MeetingNotice2 setAttendanceRequired(YesNoIndicator attendanceRequired) {
		this.attendanceRequired = Objects.requireNonNull(attendanceRequired);
		return this;
	}

	public Optional<Max350Text> getAttendanceConfirmationInformation() {
		return attendanceConfirmationInformation == null ? Optional.empty() : Optional.of(attendanceConfirmationInformation);
	}

	public MeetingNotice2 setAttendanceConfirmationInformation(Max350Text attendanceConfirmationInformation) {
		this.attendanceConfirmationInformation = attendanceConfirmationInformation;
		return this;
	}

	public Optional<DateFormat2Choice> getAttendanceConfirmationDeadline() {
		return attendanceConfirmationDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationDeadline);
	}

	public MeetingNotice2 setAttendanceConfirmationDeadline(DateFormat2Choice attendanceConfirmationDeadline) {
		this.attendanceConfirmationDeadline = attendanceConfirmationDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getAttendanceConfirmationSTPDeadline() {
		return attendanceConfirmationSTPDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationSTPDeadline);
	}

	public MeetingNotice2 setAttendanceConfirmationSTPDeadline(DateFormat2Choice attendanceConfirmationSTPDeadline) {
		this.attendanceConfirmationSTPDeadline = attendanceConfirmationSTPDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getAttendanceConfirmationMarketDeadline() {
		return attendanceConfirmationMarketDeadline == null ? Optional.empty() : Optional.of(attendanceConfirmationMarketDeadline);
	}

	public MeetingNotice2 setAttendanceConfirmationMarketDeadline(DateFormat2Choice attendanceConfirmationMarketDeadline) {
		this.attendanceConfirmationMarketDeadline = attendanceConfirmationMarketDeadline;
		return this;
	}

	public Optional<Max256Text> getAdditionalDocumentationURLAddress() {
		return additionalDocumentationURLAddress == null ? Optional.empty() : Optional.of(additionalDocumentationURLAddress);
	}

	public MeetingNotice2 setAdditionalDocumentationURLAddress(Max256Text additionalDocumentationURLAddress) {
		this.additionalDocumentationURLAddress = additionalDocumentationURLAddress;
		return this;
	}

	public Optional<DateFormat2Choice> getResolutionProposalDeadline() {
		return resolutionProposalDeadline == null ? Optional.empty() : Optional.of(resolutionProposalDeadline);
	}

	public MeetingNotice2 setResolutionProposalDeadline(DateFormat2Choice resolutionProposalDeadline) {
		this.resolutionProposalDeadline = resolutionProposalDeadline;
		return this;
	}

	public Optional<DateFormat2Choice> getResolutionProposalMarketDeadline() {
		return resolutionProposalMarketDeadline == null ? Optional.empty() : Optional.of(resolutionProposalMarketDeadline);
	}

	public MeetingNotice2 setResolutionProposalMarketDeadline(DateFormat2Choice resolutionProposalMarketDeadline) {
		this.resolutionProposalMarketDeadline = resolutionProposalMarketDeadline;
		return this;
	}

	public Optional<Max350Text> getResolutionProposalThreshold() {
		return resolutionProposalThreshold == null ? Optional.empty() : Optional.of(resolutionProposalThreshold);
	}

	public MeetingNotice2 setResolutionProposalThreshold(Max350Text resolutionProposalThreshold) {
		this.resolutionProposalThreshold = resolutionProposalThreshold;
		return this;
	}

	public Optional<PercentageRate> getResolutionProposalThresholdPercentage() {
		return resolutionProposalThresholdPercentage == null ? Optional.empty() : Optional.of(resolutionProposalThresholdPercentage);
	}

	public MeetingNotice2 setResolutionProposalThresholdPercentage(PercentageRate resolutionProposalThresholdPercentage) {
		this.resolutionProposalThresholdPercentage = resolutionProposalThresholdPercentage;
		return this;
	}

	public Optional<CurrencyAndAmount> getTotalNumberOfSecuritiesOutstanding() {
		return totalNumberOfSecuritiesOutstanding == null ? Optional.empty() : Optional.of(totalNumberOfSecuritiesOutstanding);
	}

	public MeetingNotice2 setTotalNumberOfSecuritiesOutstanding(CurrencyAndAmount totalNumberOfSecuritiesOutstanding) {
		this.totalNumberOfSecuritiesOutstanding = totalNumberOfSecuritiesOutstanding;
		return this;
	}

	public Optional<Number> getTotalNumberOfVotingRights() {
		return totalNumberOfVotingRights == null ? Optional.empty() : Optional.of(totalNumberOfVotingRights);
	}

	public MeetingNotice2 setTotalNumberOfVotingRights(Number totalNumberOfVotingRights) {
		this.totalNumberOfVotingRights = totalNumberOfVotingRights;
		return this;
	}

	public Optional<PostalAddress1> getProxyAppointmentNotificationAddress() {
		return proxyAppointmentNotificationAddress == null ? Optional.empty() : Optional.of(proxyAppointmentNotificationAddress);
	}

	public MeetingNotice2 setProxyAppointmentNotificationAddress(com.tools20022.repository.msg.PostalAddress1 proxyAppointmentNotificationAddress) {
		this.proxyAppointmentNotificationAddress = proxyAppointmentNotificationAddress;
		return this;
	}

	public Optional<ProxyNotAllowedCode> getProxyNotAllowed() {
		return proxyNotAllowed == null ? Optional.empty() : Optional.of(proxyNotAllowed);
	}

	public MeetingNotice2 setProxyNotAllowed(ProxyNotAllowedCode proxyNotAllowed) {
		this.proxyNotAllowed = proxyNotAllowed;
		return this;
	}

	public Optional<ProxyAppointmentInformation1> getProxy() {
		return proxy == null ? Optional.empty() : Optional.of(proxy);
	}

	public MeetingNotice2 setProxy(com.tools20022.repository.msg.ProxyAppointmentInformation1 proxy) {
		this.proxy = proxy;
		return this;
	}

	public List<MeetingContactPerson1> getContactPersonDetails() {
		return contactPersonDetails == null ? contactPersonDetails = new ArrayList<>() : contactPersonDetails;
	}

	public MeetingNotice2 setContactPersonDetails(List<com.tools20022.repository.msg.MeetingContactPerson1> contactPersonDetails) {
		this.contactPersonDetails = Objects.requireNonNull(contactPersonDetails);
		return this;
	}

	public Optional<DateFormat3Choice> getResultPublicationDate() {
		return resultPublicationDate == null ? Optional.empty() : Optional.of(resultPublicationDate);
	}

	public MeetingNotice2 setResultPublicationDate(DateFormat3Choice resultPublicationDate) {
		this.resultPublicationDate = resultPublicationDate;
		return this;
	}
}