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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.001.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
public class MeetingNotificationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 identification;
	/**
	 * Identifies the meeting notification message.
	 * <p>
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
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the meeting notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected AmendInformation1 amendment;
	/**
	 * Information specific to an amendment.
	 * <p>
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
	public static final MMMessageBuildingBlock mmAmendment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation1.mmObject();
		}
	};
	protected NotificationStatus1 notificationStatus;
	/**
	 * Defines the global status of the event contained in the notification.
	 * <p>
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
	public static final MMMessageBuildingBlock mmNotificationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtfctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationStatus";
			definition = "Defines the global status of the event contained in the notification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationStatus1.mmObject();
		}
	};
	protected MeetingNotice3 meeting;
	/**
	 * Specifies information about the meeting. This component contains meeting
	 * identifications, various deadlines, contact persons, electronic and
	 * postal locations for accessing information and proxy assignment
	 * parameters.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMeeting = new MMMessageBuildingBlock() {
		{
			xmlTag = "Mtg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingNotice3.mmObject();
		}
	};
	protected List<Meeting3> meetingDetails;
	/**
	 * Dates and details of the shareholders meeting.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMeetingDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDetails";
			definition = "Dates and details of the shareholders meeting.";
			maxOccurs = 5;
			minOccurs = 1;
			complexType_lazy = () -> Meeting3.mmObject();
		}
	};
	protected PartyIdentification9Choice notifyingParty;
	/**
	 * Party notifying the meeting.
	 * <p>
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
	public static final MMMessageBuildingBlock mmNotifyingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}
	};
	protected IssuerInformation1 issuer;
	/**
	 * Specifies the institution that is the issuer of the security to which the
	 * meeting applies.
	 * <p>
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
	public static final MMMessageBuildingBlock mmIssuer = new MMMessageBuildingBlock() {
		{
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Specifies the institution that is the issuer of the security to which the meeting applies.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerInformation1.mmObject();
		}
	};
	protected List<IssuerAgent1> issuerAgent;
	/**
	 * Agents of the issuer.
	 * <p>
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
	public static final MMMessageBuildingBlock mmIssuerAgent = new MMMessageBuildingBlock() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Agents of the issuer.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> IssuerAgent1.mmObject();
		}
	};
	protected List<SecurityPosition6> security;
	/**
	 * Net position of a segregated holding, in a single security, within the
	 * overall position held in a securities account.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition6.mmObject();
		}
	};
	protected List<Resolution2> resolution;
	/**
	 * Detailed information of a resolution proposed to the vote.
	 * <p>
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
	public static final MMMessageBuildingBlock mmResolution = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution";
			definition = "Detailed information of a resolution proposed to the vote.";
			maxOccurs = 1000;
			minOccurs = 0;
			complexType_lazy = () -> Resolution2.mmObject();
		}
	};
	protected VoteParameters2 vote;
	/**
	 * Specifies the conditions to be allowed to vote, the different voting
	 * methods and options, the voting deadlines and the parameters of the
	 * incentive premium.
	 * <p>
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
	public static final MMMessageBuildingBlock mmVote = new MMMessageBuildingBlock() {
		{
			xmlTag = "Vote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vote";
			definition = "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> VoteParameters2.mmObject();
		}
	};
	protected EntitlementAssessment2 entitlementSpecification;
	/**
	 * Specifies the entitlement ratio and the different deadlines for
	 * calculating the entitlement.
	 * <p>
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
	public static final MMMessageBuildingBlock mmEntitlementSpecification = new MMMessageBuildingBlock() {
		{
			xmlTag = "EntitlmntSpcfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementSpecification";
			definition = "Specifies the entitlement ratio and the different deadlines for calculating the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EntitlementAssessment2.mmObject();
		}
	};
	protected PowerOfAttorneyRequirements2 powerOfAttorneyRequirements;
	/**
	 * Specifies requirements relative to the use of Power of Attorney.
	 * <p>
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
	public static final MMMessageBuildingBlock mmPowerOfAttorneyRequirements = new MMMessageBuildingBlock() {
		{
			xmlTag = "PwrOfAttnyRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies requirements relative to the use of Power of Attorney.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotificationV03";
				definition = "Scope\r\nA notifying party, eg, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.";
				nextVersions_lazy = () -> Arrays.asList(MeetingNotificationV04.mmObject());
				previousVersion_lazy = () -> MeetingNotificationV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgNtfctn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV03.mmIdentification, MeetingNotificationV03.mmAmendment, MeetingNotificationV03.mmNotificationStatus, MeetingNotificationV03.mmMeeting,
						MeetingNotificationV03.mmMeetingDetails, MeetingNotificationV03.mmNotifyingParty, MeetingNotificationV03.mmIssuer, MeetingNotificationV03.mmIssuerAgent, MeetingNotificationV03.mmSecurity,
						MeetingNotificationV03.mmResolution, MeetingNotificationV03.mmVote, MeetingNotificationV03.mmEntitlementSpecification, MeetingNotificationV03.mmPowerOfAttorneyRequirements);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "001";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(MessageIdentification1 identification) {
		this.identification = identification;
	}

	public AmendInformation1 getAmendment() {
		return amendment;
	}

	public void setAmendment(AmendInformation1 amendment) {
		this.amendment = amendment;
	}

	public NotificationStatus1 getNotificationStatus() {
		return notificationStatus;
	}

	public void setNotificationStatus(NotificationStatus1 notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public MeetingNotice3 getMeeting() {
		return meeting;
	}

	public void setMeeting(MeetingNotice3 meeting) {
		this.meeting = meeting;
	}

	public List<Meeting3> getMeetingDetails() {
		return meetingDetails;
	}

	public void setMeetingDetails(List<Meeting3> meetingDetails) {
		this.meetingDetails = meetingDetails;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public void setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = notifyingParty;
	}

	public IssuerInformation1 getIssuer() {
		return issuer;
	}

	public void setIssuer(IssuerInformation1 issuer) {
		this.issuer = issuer;
	}

	public List<IssuerAgent1> getIssuerAgent() {
		return issuerAgent;
	}

	public void setIssuerAgent(List<IssuerAgent1> issuerAgent) {
		this.issuerAgent = issuerAgent;
	}

	public List<SecurityPosition6> getSecurity() {
		return security;
	}

	public void setSecurity(List<SecurityPosition6> security) {
		this.security = security;
	}

	public List<Resolution2> getResolution() {
		return resolution;
	}

	public void setResolution(List<Resolution2> resolution) {
		this.resolution = resolution;
	}

	public VoteParameters2 getVote() {
		return vote;
	}

	public void setVote(VoteParameters2 vote) {
		this.vote = vote;
	}

	public EntitlementAssessment2 getEntitlementSpecification() {
		return entitlementSpecification;
	}

	public void setEntitlementSpecification(EntitlementAssessment2 entitlementSpecification) {
		this.entitlementSpecification = entitlementSpecification;
	}

	public PowerOfAttorneyRequirements2 getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements;
	}

	public void setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements2 powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
	}
}