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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A notifying party, eg, an issuer, its agent or an intermediary, sends the
 * MeetingNotification message to a party holding the right to vote, to announce
 * a shareholders meeting.<br>
 * <b>Usage</b><br>
 * The MeetingNotification message is used to announce a shareholders meeting,
 * ie, it provides information on the participation details and requirements for
 * the meeting, the vote parameters and the resolutions. The MeetingNotification
 * message may also be used to announce an update.<br>
 * To notify an update, the Amendment building block must be filled in. Any
 * building block that is modified must be included in the amendment message.
 * The information previously notified and not repeated in the amendment message
 * remains valid.<br>
 * To update the resolutions of the agenda, the complete list of resolutions
 * must be repeated in the amendment message. The resolutions that are deleted
 * should be assigned the status Withdrawn.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.001.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeetingNotificationIdentification
 * MeetingNotificationV02.mmMeetingNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmAmendment
 * MeetingNotificationV02.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmNotificationStatus
 * MeetingNotificationV02.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeeting
 * MeetingNotificationV02.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeetingDetails
 * MeetingNotificationV02.mmMeetingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmNotifyingParty
 * MeetingNotificationV02.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmIssuer
 * MeetingNotificationV02.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmIssuerAgent
 * MeetingNotificationV02.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmSecurity
 * MeetingNotificationV02.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmResolution
 * MeetingNotificationV02.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmVote
 * MeetingNotificationV02.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmEntitlementSpecification
 * MeetingNotificationV02.mmEntitlementSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmPowerOfAttorneyRequirements
 * MeetingNotificationV02.mmPowerOfAttorneyRequirements}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotificationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, ie, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03
 * MeetingNotificationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotificationV02", propOrder = {"meetingNotificationIdentification", "amendment", "notificationStatus", "meeting", "meetingDetails", "notifyingParty", "issuer", "issuerAgent", "security", "resolution", "vote",
		"entitlementSpecification", "powerOfAttorneyRequirements"})
public class MeetingNotificationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtgNtfctnId", required = true)
	protected MessageIdentification1 meetingNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgNtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the meeting notification message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, MessageIdentification1> mmMeetingNotificationIdentification = new MMMessageBuildingBlock<MeetingNotificationV02, MessageIdentification1>() {
		{
			xmlTag = "MtgNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingNotificationIdentification";
			definition = "Identifies the meeting notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingNotificationV02 obj) {
			return obj.getMeetingNotificationIdentification();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, MessageIdentification1 value) {
			obj.setMeetingNotificationIdentification(value);
		}
	};
	@XmlElement(name = "Amdmnt")
	protected AmendInformation1 amendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmendInformation1
	 * AmendInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to an amendment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, Optional<AmendInformation1>> mmAmendment = new MMMessageBuildingBlock<MeetingNotificationV02, Optional<AmendInformation1>>() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation1.mmObject();
		}

		@Override
		public Optional<AmendInformation1> getValue(MeetingNotificationV02 obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, Optional<AmendInformation1> value) {
			obj.setAmendment(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnSts", required = true)
	protected NotificationStatus1 notificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus1
	 * NotificationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the global status of the event contained in the notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, NotificationStatus1> mmNotificationStatus = new MMMessageBuildingBlock<MeetingNotificationV02, NotificationStatus1>() {
		{
			xmlTag = "NtfctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationStatus";
			definition = "Defines the global status of the event contained in the notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationStatus1.mmObject();
		}

		@Override
		public NotificationStatus1 getValue(MeetingNotificationV02 obj) {
			return obj.getNotificationStatus();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, NotificationStatus1 value) {
			obj.setNotificationStatus(value);
		}
	};
	@XmlElement(name = "Mtg", required = true)
	protected MeetingNotice2 meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MeetingNotice2
	 * MeetingNotice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, MeetingNotice2> mmMeeting = new MMMessageBuildingBlock<MeetingNotificationV02, MeetingNotice2>() {
		{
			xmlTag = "Mtg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingNotice2.mmObject();
		}

		@Override
		public MeetingNotice2 getValue(MeetingNotificationV02 obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, MeetingNotice2 value) {
			obj.setMeeting(value);
		}
	};
	@XmlElement(name = "MtgDtls", required = true)
	protected List<Meeting2> meetingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates and details of the shareholders meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, List<Meeting2>> mmMeetingDetails = new MMMessageBuildingBlock<MeetingNotificationV02, List<Meeting2>>() {
		{
			xmlTag = "MtgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDetails";
			definition = "Dates and details of the shareholders meeting.";
			maxOccurs = 5;
			minOccurs = 1;
			complexType_lazy = () -> Meeting2.mmObject();
		}

		@Override
		public List<Meeting2> getValue(MeetingNotificationV02 obj) {
			return obj.getMeetingDetails();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, List<Meeting2> value) {
			obj.setMeetingDetails(value);
		}
	};
	@XmlElement(name = "NtifngPty", required = true)
	protected PartyIdentification9Choice notifyingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party notifying the meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, PartyIdentification9Choice> mmNotifyingParty = new MMMessageBuildingBlock<MeetingNotificationV02, PartyIdentification9Choice>() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public PartyIdentification9Choice getValue(MeetingNotificationV02 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, PartyIdentification9Choice value) {
			obj.setNotifyingParty(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected PartyIdentification9Choice issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the institution that is the issuer of the security to which the meeting applies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, PartyIdentification9Choice> mmIssuer = new MMMessageBuildingBlock<MeetingNotificationV02, PartyIdentification9Choice>() {
		{
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Specifies the institution that is the issuer of the security to which the meeting applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public PartyIdentification9Choice getValue(MeetingNotificationV02 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, PartyIdentification9Choice value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<IssuerAgent1> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.IssuerAgent1
	 * IssuerAgent1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agents of the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, List<IssuerAgent1>> mmIssuerAgent = new MMMessageBuildingBlock<MeetingNotificationV02, List<IssuerAgent1>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Agents of the issuer.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> IssuerAgent1.mmObject();
		}

		@Override
		public List<IssuerAgent1> getValue(MeetingNotificationV02 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, List<IssuerAgent1> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition5> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition5
	 * SecurityPosition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, List<SecurityPosition5>> mmSecurity = new MMMessageBuildingBlock<MeetingNotificationV02, List<SecurityPosition5>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition5.mmObject();
		}

		@Override
		public List<SecurityPosition5> getValue(MeetingNotificationV02 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, List<SecurityPosition5> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Rsltn")
	protected List<Resolution2> resolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Resolution2
	 * Resolution2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsltn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information of a resolution proposed to the vote."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, List<Resolution2>> mmResolution = new MMMessageBuildingBlock<MeetingNotificationV02, List<Resolution2>>() {
		{
			xmlTag = "Rsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution";
			definition = "Detailed information of a resolution proposed to the vote.";
			maxOccurs = 200;
			minOccurs = 0;
			complexType_lazy = () -> Resolution2.mmObject();
		}

		@Override
		public List<Resolution2> getValue(MeetingNotificationV02 obj) {
			return obj.getResolution();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, List<Resolution2> value) {
			obj.setResolution(value);
		}
	};
	@XmlElement(name = "Vote")
	protected VoteParameters1 vote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.VoteParameters1
	 * VoteParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vote"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, Optional<VoteParameters1>> mmVote = new MMMessageBuildingBlock<MeetingNotificationV02, Optional<VoteParameters1>>() {
		{
			xmlTag = "Vote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vote";
			definition = "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> VoteParameters1.mmObject();
		}

		@Override
		public Optional<VoteParameters1> getValue(MeetingNotificationV02 obj) {
			return obj.getVote();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, Optional<VoteParameters1> value) {
			obj.setVote(value.orElse(null));
		}
	};
	@XmlElement(name = "EntitlmntSpcfctn", required = true)
	protected EntitlementAssessment1 entitlementSpecification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment1
	 * EntitlementAssessment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntSpcfctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entitlement ratio and the different deadlines for calculating the entitlement."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, EntitlementAssessment1> mmEntitlementSpecification = new MMMessageBuildingBlock<MeetingNotificationV02, EntitlementAssessment1>() {
		{
			xmlTag = "EntitlmntSpcfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementSpecification";
			definition = "Specifies the entitlement ratio and the different deadlines for calculating the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EntitlementAssessment1.mmObject();
		}

		@Override
		public EntitlementAssessment1 getValue(MeetingNotificationV02 obj) {
			return obj.getEntitlementSpecification();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, EntitlementAssessment1 value) {
			obj.setEntitlementSpecification(value);
		}
	};
	@XmlElement(name = "PwrOfAttnyRqrmnts")
	protected PowerOfAttorneyRequirements2 powerOfAttorneyRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
	 * PowerOfAttorneyRequirements2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttnyRqrmnts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies requirements relative to the use of Power of Attorney."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV02, Optional<PowerOfAttorneyRequirements2>> mmPowerOfAttorneyRequirements = new MMMessageBuildingBlock<MeetingNotificationV02, Optional<PowerOfAttorneyRequirements2>>() {
		{
			xmlTag = "PwrOfAttnyRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies requirements relative to the use of Power of Attorney.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
		}

		@Override
		public Optional<PowerOfAttorneyRequirements2> getValue(MeetingNotificationV02 obj) {
			return obj.getPowerOfAttorneyRequirements();
		}

		@Override
		public void setValue(MeetingNotificationV02 obj, Optional<PowerOfAttorneyRequirements2> value) {
			obj.setPowerOfAttorneyRequirements(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotificationV02";
				definition = "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, ie, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.";
				nextVersions_lazy = () -> Arrays.asList(MeetingNotificationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgNtfctn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV02.mmMeetingNotificationIdentification, com.tools20022.repository.area.seev.MeetingNotificationV02.mmAmendment,
						com.tools20022.repository.area.seev.MeetingNotificationV02.mmNotificationStatus, com.tools20022.repository.area.seev.MeetingNotificationV02.mmMeeting,
						com.tools20022.repository.area.seev.MeetingNotificationV02.mmMeetingDetails, com.tools20022.repository.area.seev.MeetingNotificationV02.mmNotifyingParty,
						com.tools20022.repository.area.seev.MeetingNotificationV02.mmIssuer, com.tools20022.repository.area.seev.MeetingNotificationV02.mmIssuerAgent, com.tools20022.repository.area.seev.MeetingNotificationV02.mmSecurity,
						com.tools20022.repository.area.seev.MeetingNotificationV02.mmResolution, com.tools20022.repository.area.seev.MeetingNotificationV02.mmVote,
						com.tools20022.repository.area.seev.MeetingNotificationV02.mmEntitlementSpecification, com.tools20022.repository.area.seev.MeetingNotificationV02.mmPowerOfAttorneyRequirements);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "001";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingNotificationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMeetingNotificationIdentification() {
		return meetingNotificationIdentification;
	}

	public MeetingNotificationV02 setMeetingNotificationIdentification(MessageIdentification1 meetingNotificationIdentification) {
		this.meetingNotificationIdentification = Objects.requireNonNull(meetingNotificationIdentification);
		return this;
	}

	public Optional<AmendInformation1> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public MeetingNotificationV02 setAmendment(AmendInformation1 amendment) {
		this.amendment = amendment;
		return this;
	}

	public NotificationStatus1 getNotificationStatus() {
		return notificationStatus;
	}

	public MeetingNotificationV02 setNotificationStatus(NotificationStatus1 notificationStatus) {
		this.notificationStatus = Objects.requireNonNull(notificationStatus);
		return this;
	}

	public MeetingNotice2 getMeeting() {
		return meeting;
	}

	public MeetingNotificationV02 setMeeting(MeetingNotice2 meeting) {
		this.meeting = Objects.requireNonNull(meeting);
		return this;
	}

	public List<Meeting2> getMeetingDetails() {
		return meetingDetails == null ? meetingDetails = new ArrayList<>() : meetingDetails;
	}

	public MeetingNotificationV02 setMeetingDetails(List<Meeting2> meetingDetails) {
		this.meetingDetails = Objects.requireNonNull(meetingDetails);
		return this;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public MeetingNotificationV02 setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = Objects.requireNonNull(notifyingParty);
		return this;
	}

	public PartyIdentification9Choice getIssuer() {
		return issuer;
	}

	public MeetingNotificationV02 setIssuer(PartyIdentification9Choice issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<IssuerAgent1> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public MeetingNotificationV02 setIssuerAgent(List<IssuerAgent1> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<SecurityPosition5> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingNotificationV02 setSecurity(List<SecurityPosition5> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<Resolution2> getResolution() {
		return resolution == null ? resolution = new ArrayList<>() : resolution;
	}

	public MeetingNotificationV02 setResolution(List<Resolution2> resolution) {
		this.resolution = Objects.requireNonNull(resolution);
		return this;
	}

	public Optional<VoteParameters1> getVote() {
		return vote == null ? Optional.empty() : Optional.of(vote);
	}

	public MeetingNotificationV02 setVote(VoteParameters1 vote) {
		this.vote = vote;
		return this;
	}

	public EntitlementAssessment1 getEntitlementSpecification() {
		return entitlementSpecification;
	}

	public MeetingNotificationV02 setEntitlementSpecification(EntitlementAssessment1 entitlementSpecification) {
		this.entitlementSpecification = Objects.requireNonNull(entitlementSpecification);
		return this;
	}

	public Optional<PowerOfAttorneyRequirements2> getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements == null ? Optional.empty() : Optional.of(powerOfAttorneyRequirements);
	}

	public MeetingNotificationV02 setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements2 powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.02")
	static public class Document {
		@XmlElement(name = "MtgNtfctn", required = true)
		public MeetingNotificationV02 messageBody;
	}
}