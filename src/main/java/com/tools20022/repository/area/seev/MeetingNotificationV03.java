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
 * for example, it provides information on the participation details and
 * requirements for the meeting, the vote parameters and the resolutions. The
 * MeetingNotification message may also be used to announce an update.<br>
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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmIdentification
 * MeetingNotificationV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmAmendment
 * MeetingNotificationV03.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmNotificationStatus
 * MeetingNotificationV03.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmMeeting
 * MeetingNotificationV03.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmMeetingDetails
 * MeetingNotificationV03.mmMeetingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmNotifyingParty
 * MeetingNotificationV03.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmIssuer
 * MeetingNotificationV03.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmIssuerAgent
 * MeetingNotificationV03.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmSecurity
 * MeetingNotificationV03.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmResolution
 * MeetingNotificationV03.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmVote
 * MeetingNotificationV03.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmEntitlementSpecification
 * MeetingNotificationV03.mmEntitlementSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV03#mmPowerOfAttorneyRequirements
 * MeetingNotificationV03.mmPowerOfAttorneyRequirements}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.001.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintResolution1Guideline#for_seev_MeetingNotificationV03
 * ConstraintResolution1Guideline.for_seev_MeetingNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline#for_seev_MeetingNotificationV03
 * ConstraintVoteInstructionType1Guideline.for_seev_MeetingNotificationV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntitlementDate1Guideline#for_seev_MeetingNotificationV03
 * ConstraintEntitlementDate1Guideline.for_seev_MeetingNotificationV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotificationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04
 * MeetingNotificationV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02
 * MeetingNotificationV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotificationV03", propOrder = {"identification", "amendment", "notificationStatus", "meeting", "meetingDetails", "notifyingParty", "issuer", "issuerAgent", "security", "resolution", "vote",
		"entitlementSpecification", "powerOfAttorneyRequirements"})
public class MeetingNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected MessageIdentification1 identification;
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
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the meeting notification message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, MessageIdentification1> mmIdentification = new MMMessageBuildingBlock<MeetingNotificationV03, MessageIdentification1>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the meeting notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingNotificationV03 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, MessageIdentification1 value) {
			obj.setIdentification(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to an amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, Optional<AmendInformation1>> mmAmendment = new MMMessageBuildingBlock<MeetingNotificationV03, Optional<AmendInformation1>>() {
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
		public Optional<AmendInformation1> getValue(MeetingNotificationV03 obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, Optional<AmendInformation1> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the global status of the event contained in the notification."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, NotificationStatus1> mmNotificationStatus = new MMMessageBuildingBlock<MeetingNotificationV03, NotificationStatus1>() {
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
		public NotificationStatus1 getValue(MeetingNotificationV03 obj) {
			return obj.getNotificationStatus();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, NotificationStatus1 value) {
			obj.setNotificationStatus(value);
		}
	};
	@XmlElement(name = "Mtg", required = true)
	protected MeetingNotice3 meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MeetingNotice3
	 * MeetingNotice3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Meeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, MeetingNotice3> mmMeeting = new MMMessageBuildingBlock<MeetingNotificationV03, MeetingNotice3>() {
		{
			xmlTag = "Mtg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingNotice3.mmObject();
		}

		@Override
		public MeetingNotice3 getValue(MeetingNotificationV03 obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, MeetingNotice3 value) {
			obj.setMeeting(value);
		}
	};
	@XmlElement(name = "MtgDtls", required = true)
	protected List<Meeting3> meetingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Meeting3
	 * Meeting3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dates and details of the shareholders meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, List<Meeting3>> mmMeetingDetails = new MMMessageBuildingBlock<MeetingNotificationV03, List<Meeting3>>() {
		{
			xmlTag = "MtgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDetails";
			definition = "Dates and details of the shareholders meeting.";
			maxOccurs = 5;
			minOccurs = 1;
			complexType_lazy = () -> Meeting3.mmObject();
		}

		@Override
		public List<Meeting3> getValue(MeetingNotificationV03 obj) {
			return obj.getMeetingDetails();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, List<Meeting3> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party notifying the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, PartyIdentification9Choice> mmNotifyingParty = new MMMessageBuildingBlock<MeetingNotificationV03, PartyIdentification9Choice>() {
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
		public PartyIdentification9Choice getValue(MeetingNotificationV03 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, PartyIdentification9Choice value) {
			obj.setNotifyingParty(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected IssuerInformation1 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation1
	 * IssuerInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the institution that is the issuer of the security to which the meeting applies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, IssuerInformation1> mmIssuer = new MMMessageBuildingBlock<MeetingNotificationV03, IssuerInformation1>() {
		{
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Specifies the institution that is the issuer of the security to which the meeting applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerInformation1.mmObject();
		}

		@Override
		public IssuerInformation1 getValue(MeetingNotificationV03 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, IssuerInformation1 value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agents of the issuer."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, List<IssuerAgent1>> mmIssuerAgent = new MMMessageBuildingBlock<MeetingNotificationV03, List<IssuerAgent1>>() {
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
		public List<IssuerAgent1> getValue(MeetingNotificationV03 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, List<IssuerAgent1> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition6> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition6
	 * SecurityPosition6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, List<SecurityPosition6>> mmSecurity = new MMMessageBuildingBlock<MeetingNotificationV03, List<SecurityPosition6>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition6.mmObject();
		}

		@Override
		public List<SecurityPosition6> getValue(MeetingNotificationV03 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, List<SecurityPosition6> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Resolution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information of a resolution proposed to the vote."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, List<Resolution2>> mmResolution = new MMMessageBuildingBlock<MeetingNotificationV03, List<Resolution2>>() {
		{
			xmlTag = "Rsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution";
			definition = "Detailed information of a resolution proposed to the vote.";
			maxOccurs = 1000;
			minOccurs = 0;
			complexType_lazy = () -> Resolution2.mmObject();
		}

		@Override
		public List<Resolution2> getValue(MeetingNotificationV03 obj) {
			return obj.getResolution();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, List<Resolution2> value) {
			obj.setResolution(value);
		}
	};
	@XmlElement(name = "Vote")
	protected VoteParameters2 vote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.VoteParameters2
	 * VoteParameters2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, Optional<VoteParameters2>> mmVote = new MMMessageBuildingBlock<MeetingNotificationV03, Optional<VoteParameters2>>() {
		{
			xmlTag = "Vote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vote";
			definition = "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> VoteParameters2.mmObject();
		}

		@Override
		public Optional<VoteParameters2> getValue(MeetingNotificationV03 obj) {
			return obj.getVote();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, Optional<VoteParameters2> value) {
			obj.setVote(value.orElse(null));
		}
	};
	@XmlElement(name = "EntitlmntSpcfctn", required = true)
	protected EntitlementAssessment2 entitlementSpecification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment2
	 * EntitlementAssessment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntSpcfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementSpecification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the entitlement ratio and the different deadlines for calculating the entitlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, EntitlementAssessment2> mmEntitlementSpecification = new MMMessageBuildingBlock<MeetingNotificationV03, EntitlementAssessment2>() {
		{
			xmlTag = "EntitlmntSpcfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementSpecification";
			definition = "Specifies the entitlement ratio and the different deadlines for calculating the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EntitlementAssessment2.mmObject();
		}

		@Override
		public EntitlementAssessment2 getValue(MeetingNotificationV03 obj) {
			return obj.getEntitlementSpecification();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, EntitlementAssessment2 value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyRequirements"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies requirements relative to the use of Power of Attorney."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV03, Optional<PowerOfAttorneyRequirements2>> mmPowerOfAttorneyRequirements = new MMMessageBuildingBlock<MeetingNotificationV03, Optional<PowerOfAttorneyRequirements2>>() {
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
		public Optional<PowerOfAttorneyRequirements2> getValue(MeetingNotificationV03 obj) {
			return obj.getPowerOfAttorneyRequirements();
		}

		@Override
		public void setValue(MeetingNotificationV03 obj, Optional<PowerOfAttorneyRequirements2> value) {
			obj.setPowerOfAttorneyRequirements(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintResolution1Guideline.for_seev_MeetingNotificationV03,
						com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline.for_seev_MeetingNotificationV03,
						com.tools20022.repository.constraints.ConstraintEntitlementDate1Guideline.for_seev_MeetingNotificationV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotificationV03";
				definition = "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.";
				nextVersions_lazy = () -> Arrays.asList(MeetingNotificationV04.mmObject());
				previousVersion_lazy = () -> MeetingNotificationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgNtfctn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV03.mmIdentification, com.tools20022.repository.area.seev.MeetingNotificationV03.mmAmendment,
						com.tools20022.repository.area.seev.MeetingNotificationV03.mmNotificationStatus, com.tools20022.repository.area.seev.MeetingNotificationV03.mmMeeting,
						com.tools20022.repository.area.seev.MeetingNotificationV03.mmMeetingDetails, com.tools20022.repository.area.seev.MeetingNotificationV03.mmNotifyingParty,
						com.tools20022.repository.area.seev.MeetingNotificationV03.mmIssuer, com.tools20022.repository.area.seev.MeetingNotificationV03.mmIssuerAgent, com.tools20022.repository.area.seev.MeetingNotificationV03.mmSecurity,
						com.tools20022.repository.area.seev.MeetingNotificationV03.mmResolution, com.tools20022.repository.area.seev.MeetingNotificationV03.mmVote,
						com.tools20022.repository.area.seev.MeetingNotificationV03.mmEntitlementSpecification, com.tools20022.repository.area.seev.MeetingNotificationV03.mmPowerOfAttorneyRequirements);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "001";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingNotificationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingNotificationV03 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<AmendInformation1> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public MeetingNotificationV03 setAmendment(AmendInformation1 amendment) {
		this.amendment = amendment;
		return this;
	}

	public NotificationStatus1 getNotificationStatus() {
		return notificationStatus;
	}

	public MeetingNotificationV03 setNotificationStatus(NotificationStatus1 notificationStatus) {
		this.notificationStatus = Objects.requireNonNull(notificationStatus);
		return this;
	}

	public MeetingNotice3 getMeeting() {
		return meeting;
	}

	public MeetingNotificationV03 setMeeting(MeetingNotice3 meeting) {
		this.meeting = Objects.requireNonNull(meeting);
		return this;
	}

	public List<Meeting3> getMeetingDetails() {
		return meetingDetails == null ? meetingDetails = new ArrayList<>() : meetingDetails;
	}

	public MeetingNotificationV03 setMeetingDetails(List<Meeting3> meetingDetails) {
		this.meetingDetails = Objects.requireNonNull(meetingDetails);
		return this;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public MeetingNotificationV03 setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = Objects.requireNonNull(notifyingParty);
		return this;
	}

	public IssuerInformation1 getIssuer() {
		return issuer;
	}

	public MeetingNotificationV03 setIssuer(IssuerInformation1 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<IssuerAgent1> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public MeetingNotificationV03 setIssuerAgent(List<IssuerAgent1> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<SecurityPosition6> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingNotificationV03 setSecurity(List<SecurityPosition6> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<Resolution2> getResolution() {
		return resolution == null ? resolution = new ArrayList<>() : resolution;
	}

	public MeetingNotificationV03 setResolution(List<Resolution2> resolution) {
		this.resolution = Objects.requireNonNull(resolution);
		return this;
	}

	public Optional<VoteParameters2> getVote() {
		return vote == null ? Optional.empty() : Optional.of(vote);
	}

	public MeetingNotificationV03 setVote(VoteParameters2 vote) {
		this.vote = vote;
		return this;
	}

	public EntitlementAssessment2 getEntitlementSpecification() {
		return entitlementSpecification;
	}

	public MeetingNotificationV03 setEntitlementSpecification(EntitlementAssessment2 entitlementSpecification) {
		this.entitlementSpecification = Objects.requireNonNull(entitlementSpecification);
		return this;
	}

	public Optional<PowerOfAttorneyRequirements2> getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements == null ? Optional.empty() : Optional.of(powerOfAttorneyRequirements);
	}

	public MeetingNotificationV03 setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements2 powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.03")
	static public class Document {
		@XmlElement(name = "MtgNtfctn", required = true)
		public MeetingNotificationV03 messageBody;
	}
}