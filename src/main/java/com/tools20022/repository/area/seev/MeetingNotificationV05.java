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
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ProxyVotingISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A notifying party, for example, an issuer, its agent or an intermediary,
 * sends the MeetingNotification message to a party holding the right to vote,
 * to announce a shareholders meeting.<br>
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
 * should be assigned the status Withdrawn.<br>
 * This message definition is intended for use with the Business Application
 * Header (head.001.001.01).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.001.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmAmendment
 * MeetingNotificationV05.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmNotificationStatus
 * MeetingNotificationV05.mmNotificationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeeting
 * MeetingNotificationV05.mmMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmMeetingDetails
 * MeetingNotificationV05.mmMeetingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmIssuer
 * MeetingNotificationV05.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmIssuerAgent
 * MeetingNotificationV05.mmIssuerAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmSecurity
 * MeetingNotificationV05.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmResolution
 * MeetingNotificationV05.mmResolution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmVote
 * MeetingNotificationV05.mmVote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmEntitlementSpecification
 * MeetingNotificationV05.mmEntitlementSpecification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmPowerOfAttorneyRequirements
 * MeetingNotificationV05.mmPowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmAdditionalInformation
 * MeetingNotificationV05.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmSupplementaryData
 * MeetingNotificationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ProxyVotingISOLatestversion
 * ProxyVotingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingNotificationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA notifying party, for example, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintResolution1Guideline#for_seev_MeetingNotificationV05
 * ConstraintResolution1Guideline.for_seev_MeetingNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline#for_seev_MeetingNotificationV05
 * ConstraintVoteInstructionType1Guideline.for_seev_MeetingNotificationV05}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintEntitlementDate1Guideline#for_seev_MeetingNotificationV05
 * ConstraintEntitlementDate1Guideline.for_seev_MeetingNotificationV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04
 * MeetingNotificationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingNotificationV05", propOrder = {"amendment", "notificationStatus", "meeting", "meetingDetails", "issuer", "issuerAgent", "security", "resolution", "vote", "entitlementSpecification", "powerOfAttorneyRequirements",
		"additionalInformation", "supplementaryData"})
public class MeetingNotificationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmAmendment
	 * MeetingNotificationV04.mmAmendment}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, Optional<AmendInformation1>> mmAmendment = new MMMessageBuildingBlock<MeetingNotificationV05, Optional<AmendInformation1>>() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amendment.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmAmendment;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation1.mmObject();
		}

		@Override
		public Optional<AmendInformation1> getValue(MeetingNotificationV05 obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, Optional<AmendInformation1> value) {
			obj.setAmendment(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnSts", required = true)
	protected NotificationStatus2 notificationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NotificationStatus2
	 * NotificationStatus2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmNotificationStatus
	 * MeetingNotificationV04.mmNotificationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, NotificationStatus2> mmNotificationStatus = new MMMessageBuildingBlock<MeetingNotificationV05, NotificationStatus2>() {
		{
			xmlTag = "NtfctnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationStatus";
			definition = "Defines the global status of the event contained in the notification.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmNotificationStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NotificationStatus2.mmObject();
		}

		@Override
		public NotificationStatus2 getValue(MeetingNotificationV05 obj) {
			return obj.getNotificationStatus();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, NotificationStatus2 value) {
			obj.setNotificationStatus(value);
		}
	};
	@XmlElement(name = "Mtg", required = true)
	protected MeetingNotice4 meeting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MeetingNotice4
	 * MeetingNotice4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmMeeting
	 * MeetingNotificationV04.mmMeeting}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, MeetingNotice4> mmMeeting = new MMMessageBuildingBlock<MeetingNotificationV05, MeetingNotice4>() {
		{
			xmlTag = "Mtg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Meeting";
			definition = "Specifies information about the meeting. This component contains meeting identifications, various deadlines, contact persons, electronic and postal locations for accessing information and proxy assignment parameters.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmMeeting;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingNotice4.mmObject();
		}

		@Override
		public MeetingNotice4 getValue(MeetingNotificationV05 obj) {
			return obj.getMeeting();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, MeetingNotice4 value) {
			obj.setMeeting(value);
		}
	};
	@XmlElement(name = "MtgDtls", required = true)
	protected List<Meeting4> meetingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Meeting4
	 * Meeting4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmMeetingDetails
	 * MeetingNotificationV04.mmMeetingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, List<Meeting4>> mmMeetingDetails = new MMMessageBuildingBlock<MeetingNotificationV05, List<Meeting4>>() {
		{
			xmlTag = "MtgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingDetails";
			definition = "Dates and details of the shareholders meeting.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmMeetingDetails;
			maxOccurs = 5;
			minOccurs = 1;
			complexType_lazy = () -> Meeting4.mmObject();
		}

		@Override
		public List<Meeting4> getValue(MeetingNotificationV05 obj) {
			return obj.getMeetingDetails();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, List<Meeting4> value) {
			obj.setMeetingDetails(value);
		}
	};
	@XmlElement(name = "Issr", required = true)
	protected IssuerInformation2 issuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IssuerInformation2
	 * IssuerInformation2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIssuer
	 * MeetingNotificationV04.mmIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, IssuerInformation2> mmIssuer = new MMMessageBuildingBlock<MeetingNotificationV05, IssuerInformation2>() {
		{
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Specifies the institution that is the issuer of the security to which the meeting applies.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmIssuer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> IssuerInformation2.mmObject();
		}

		@Override
		public IssuerInformation2 getValue(MeetingNotificationV05 obj) {
			return obj.getIssuer();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, IssuerInformation2 value) {
			obj.setIssuer(value);
		}
	};
	@XmlElement(name = "IssrAgt")
	protected List<IssuerAgent2> issuerAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.IssuerAgent2
	 * IssuerAgent2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmIssuerAgent
	 * MeetingNotificationV04.mmIssuerAgent}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, List<IssuerAgent2>> mmIssuerAgent = new MMMessageBuildingBlock<MeetingNotificationV05, List<IssuerAgent2>>() {
		{
			xmlTag = "IssrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerAgent";
			definition = "Agents of the issuer.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmIssuerAgent;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> IssuerAgent2.mmObject();
		}

		@Override
		public List<IssuerAgent2> getValue(MeetingNotificationV05 obj) {
			return obj.getIssuerAgent();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, List<IssuerAgent2> value) {
			obj.setIssuerAgent(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition8> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition8
	 * SecurityPosition8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmSecurity
	 * MeetingNotificationV04.mmSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, List<SecurityPosition8>> mmSecurity = new MMMessageBuildingBlock<MeetingNotificationV05, List<SecurityPosition8>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmSecurity;
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition8.mmObject();
		}

		@Override
		public List<SecurityPosition8> getValue(MeetingNotificationV05 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, List<SecurityPosition8> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Rsltn")
	protected List<Resolution3> resolution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Resolution3
	 * Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmResolution
	 * MeetingNotificationV04.mmResolution}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, List<Resolution3>> mmResolution = new MMMessageBuildingBlock<MeetingNotificationV05, List<Resolution3>>() {
		{
			xmlTag = "Rsltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Resolution";
			definition = "Detailed information of a resolution proposed to the vote.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmResolution;
			maxOccurs = 1000;
			minOccurs = 0;
			complexType_lazy = () -> Resolution3.mmObject();
		}

		@Override
		public List<Resolution3> getValue(MeetingNotificationV05 obj) {
			return obj.getResolution();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, List<Resolution3> value) {
			obj.setResolution(value);
		}
	};
	@XmlElement(name = "Vote")
	protected VoteParameters4 vote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.VoteParameters4
	 * VoteParameters4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmVote
	 * MeetingNotificationV04.mmVote}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, Optional<VoteParameters4>> mmVote = new MMMessageBuildingBlock<MeetingNotificationV05, Optional<VoteParameters4>>() {
		{
			xmlTag = "Vote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vote";
			definition = "Specifies the conditions to be allowed to vote, the different voting methods and options, the voting deadlines and the parameters of the incentive premium.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmVote;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> VoteParameters4.mmObject();
		}

		@Override
		public Optional<VoteParameters4> getValue(MeetingNotificationV05 obj) {
			return obj.getVote();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, Optional<VoteParameters4> value) {
			obj.setVote(value.orElse(null));
		}
	};
	@XmlElement(name = "EntitlmntSpcfctn")
	protected EntitlementAssessment3 entitlementSpecification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EntitlementAssessment3
	 * EntitlementAssessment3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmEntitlementSpecification
	 * MeetingNotificationV04.mmEntitlementSpecification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, Optional<EntitlementAssessment3>> mmEntitlementSpecification = new MMMessageBuildingBlock<MeetingNotificationV05, Optional<EntitlementAssessment3>>() {
		{
			xmlTag = "EntitlmntSpcfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementSpecification";
			definition = "Specifies the entitlement ratio and the different deadlines for calculating the entitlement.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmEntitlementSpecification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> EntitlementAssessment3.mmObject();
		}

		@Override
		public Optional<EntitlementAssessment3> getValue(MeetingNotificationV05 obj) {
			return obj.getEntitlementSpecification();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, Optional<EntitlementAssessment3> value) {
			obj.setEntitlementSpecification(value.orElse(null));
		}
	};
	@XmlElement(name = "PwrOfAttnyRqrmnts")
	protected PowerOfAttorneyRequirements3 powerOfAttorneyRequirements;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmPowerOfAttorneyRequirements
	 * MeetingNotificationV04.mmPowerOfAttorneyRequirements}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, Optional<PowerOfAttorneyRequirements3>> mmPowerOfAttorneyRequirements = new MMMessageBuildingBlock<MeetingNotificationV05, Optional<PowerOfAttorneyRequirements3>>() {
		{
			xmlTag = "PwrOfAttnyRqrmnts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyRequirements";
			definition = "Specifies requirements relative to the use of Power of Attorney.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmPowerOfAttorneyRequirements;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
		}

		@Override
		public Optional<PowerOfAttorneyRequirements3> getValue(MeetingNotificationV05 obj) {
			return obj.getPowerOfAttorneyRequirements();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, Optional<PowerOfAttorneyRequirements3> value) {
			obj.setPowerOfAttorneyRequirements(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CorporateEventNarrative2 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateEventNarrative2
	 * CorporateEventNarrative2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional narrative information about the corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV04#mmAdditionalInformation
	 * MeetingNotificationV04.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, Optional<CorporateEventNarrative2>> mmAdditionalInformation = new MMMessageBuildingBlock<MeetingNotificationV05, Optional<CorporateEventNarrative2>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional narrative information about the corporate event.";
			previousVersion_lazy = () -> MeetingNotificationV04.mmAdditionalInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateEventNarrative2.mmObject();
		}

		@Override
		public Optional<CorporateEventNarrative2> getValue(MeetingNotificationV05 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, Optional<CorporateEventNarrative2> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingNotificationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MeetingNotificationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MeetingNotificationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MeetingNotificationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintResolution1Guideline.for_seev_MeetingNotificationV05,
						com.tools20022.repository.constraints.ConstraintVoteInstructionType1Guideline.for_seev_MeetingNotificationV05,
						com.tools20022.repository.constraints.ConstraintEntitlementDate1Guideline.for_seev_MeetingNotificationV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingNotificationV05";
				definition = "Scope\r\nA notifying party, for example, an issuer, its agent or an intermediary, sends the MeetingNotification message to a party holding the right to vote, to announce a shareholders meeting.\r\nUsage\r\nThe MeetingNotification message is used to announce a shareholders meeting, for example, it provides information on the participation details and requirements for the meeting, the vote parameters and the resolutions. The MeetingNotification message may also be used to announce an update.\r\nTo notify an update, the Amendment building block must be filled in. Any building block that is modified must be included in the amendment message. The information previously notified and not repeated in the amendment message remains valid.\r\nTo update the resolutions of the agenda, the complete list of resolutions must be repeated in the amendment message. The resolutions that are deleted should be assigned the status Withdrawn.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01).";
				previousVersion_lazy = () -> MeetingNotificationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MtgNtfctn";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingNotificationV05.mmAmendment, com.tools20022.repository.area.seev.MeetingNotificationV05.mmNotificationStatus,
						com.tools20022.repository.area.seev.MeetingNotificationV05.mmMeeting, com.tools20022.repository.area.seev.MeetingNotificationV05.mmMeetingDetails, com.tools20022.repository.area.seev.MeetingNotificationV05.mmIssuer,
						com.tools20022.repository.area.seev.MeetingNotificationV05.mmIssuerAgent, com.tools20022.repository.area.seev.MeetingNotificationV05.mmSecurity,
						com.tools20022.repository.area.seev.MeetingNotificationV05.mmResolution, com.tools20022.repository.area.seev.MeetingNotificationV05.mmVote,
						com.tools20022.repository.area.seev.MeetingNotificationV05.mmEntitlementSpecification, com.tools20022.repository.area.seev.MeetingNotificationV05.mmPowerOfAttorneyRequirements,
						com.tools20022.repository.area.seev.MeetingNotificationV05.mmAdditionalInformation, com.tools20022.repository.area.seev.MeetingNotificationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "001";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingNotificationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmendInformation1> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public MeetingNotificationV05 setAmendment(AmendInformation1 amendment) {
		this.amendment = amendment;
		return this;
	}

	public NotificationStatus2 getNotificationStatus() {
		return notificationStatus;
	}

	public MeetingNotificationV05 setNotificationStatus(NotificationStatus2 notificationStatus) {
		this.notificationStatus = Objects.requireNonNull(notificationStatus);
		return this;
	}

	public MeetingNotice4 getMeeting() {
		return meeting;
	}

	public MeetingNotificationV05 setMeeting(MeetingNotice4 meeting) {
		this.meeting = Objects.requireNonNull(meeting);
		return this;
	}

	public List<Meeting4> getMeetingDetails() {
		return meetingDetails == null ? meetingDetails = new ArrayList<>() : meetingDetails;
	}

	public MeetingNotificationV05 setMeetingDetails(List<Meeting4> meetingDetails) {
		this.meetingDetails = Objects.requireNonNull(meetingDetails);
		return this;
	}

	public IssuerInformation2 getIssuer() {
		return issuer;
	}

	public MeetingNotificationV05 setIssuer(IssuerInformation2 issuer) {
		this.issuer = Objects.requireNonNull(issuer);
		return this;
	}

	public List<IssuerAgent2> getIssuerAgent() {
		return issuerAgent == null ? issuerAgent = new ArrayList<>() : issuerAgent;
	}

	public MeetingNotificationV05 setIssuerAgent(List<IssuerAgent2> issuerAgent) {
		this.issuerAgent = Objects.requireNonNull(issuerAgent);
		return this;
	}

	public List<SecurityPosition8> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingNotificationV05 setSecurity(List<SecurityPosition8> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<Resolution3> getResolution() {
		return resolution == null ? resolution = new ArrayList<>() : resolution;
	}

	public MeetingNotificationV05 setResolution(List<Resolution3> resolution) {
		this.resolution = Objects.requireNonNull(resolution);
		return this;
	}

	public Optional<VoteParameters4> getVote() {
		return vote == null ? Optional.empty() : Optional.of(vote);
	}

	public MeetingNotificationV05 setVote(VoteParameters4 vote) {
		this.vote = vote;
		return this;
	}

	public Optional<EntitlementAssessment3> getEntitlementSpecification() {
		return entitlementSpecification == null ? Optional.empty() : Optional.of(entitlementSpecification);
	}

	public MeetingNotificationV05 setEntitlementSpecification(EntitlementAssessment3 entitlementSpecification) {
		this.entitlementSpecification = entitlementSpecification;
		return this;
	}

	public Optional<PowerOfAttorneyRequirements3> getPowerOfAttorneyRequirements() {
		return powerOfAttorneyRequirements == null ? Optional.empty() : Optional.of(powerOfAttorneyRequirements);
	}

	public MeetingNotificationV05 setPowerOfAttorneyRequirements(PowerOfAttorneyRequirements3 powerOfAttorneyRequirements) {
		this.powerOfAttorneyRequirements = powerOfAttorneyRequirements;
		return this;
	}

	public Optional<CorporateEventNarrative2> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public MeetingNotificationV05 setAdditionalInformation(CorporateEventNarrative2 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MeetingNotificationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.001.001.05")
	static public class Document {
		@XmlElement(name = "MtgNtfctn", required = true)
		public MeetingNotificationV05 messageBody;
	}
}