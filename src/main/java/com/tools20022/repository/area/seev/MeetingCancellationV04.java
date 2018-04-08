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
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.ProxyVotingISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MeetingCancellation message is sent by the party that sent the
 * MeetingNotification message to the original receiver. It is sent to cancel
 * the previous MeetingNotification message or to advise the cancellation of a
 * meeting.<br>
 * <b>Usage</b><br>
 * The MeetingCancellation message is used in two different situations.<br>
 * First, it is used to cancel a previously sent MeetingNotification message. In
 * this case, the MessageCancellation, the MeetingReference and the Reason
 * building blocks need to be present.<br>
 * Second, it is used to advise that the meeting is cancelled. In this case,
 * only the MeetingReference and Reason building blocks need to be present.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmIdentification
 * MeetingCancellationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmMessageCancellation
 * MeetingCancellationV04.mmMessageCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmMeetingReference
 * MeetingCancellationV04.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmNotifyingParty
 * MeetingCancellationV04.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmSecurity
 * MeetingCancellationV04.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmReason
 * MeetingCancellationV04.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmExtension
 * MeetingCancellationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOPreviousversion
 * ProxyVotingISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.002.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation1Guideline#for_seev_MeetingCancellationV04
 * ConstraintCancellation1Guideline.for_seev_MeetingCancellationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation2Guideline#for_seev_MeetingCancellationV04
 * ConstraintCancellation2Guideline.for_seev_MeetingCancellationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference1Guideline#for_seev_MeetingCancellationV04
 * ConstraintMeetingIdentificationAndPreviousReference1Guideline.
 * for_seev_MeetingCancellationV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference2Guideline#for_seev_MeetingCancellationV04
 * ConstraintMeetingIdentificationAndPreviousReference2Guideline.
 * for_seev_MeetingCancellationV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05
 * MeetingCancellationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03
 * MeetingCancellationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingCancellationV04", propOrder = {"identification", "messageCancellation", "meetingReference", "notifyingParty", "security", "reason", "extension"})
public class MeetingCancellationV04 {

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
	 * definition} = "Identifies the cancellation message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, MessageIdentification1> mmIdentification = new MMMessageBuildingBlock<MeetingCancellationV04, MessageIdentification1>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the cancellation message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingCancellationV04 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, MessageIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "MsgCxl")
	protected AmendInformation1 messageCancellation;
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
	 * xmlTag} = "MsgCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information indicating that the cancellation of a message previously sent is requested (and not the cancellation of the meeting)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, Optional<AmendInformation1>> mmMessageCancellation = new MMMessageBuildingBlock<MeetingCancellationV04, Optional<AmendInformation1>>() {
		{
			xmlTag = "MsgCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageCancellation";
			definition = "Information indicating that the cancellation of a message previously sent is requested (and not the cancellation of the meeting).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation1.mmObject();
		}

		@Override
		public Optional<AmendInformation1> getValue(MeetingCancellationV04 obj) {
			return obj.getMessageCancellation();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, Optional<AmendInformation1> value) {
			obj.setMessageCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference5 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference5
	 * MeetingReference5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmMeetingReference
	 * MeetingCancellationV05.mmMeetingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, MeetingReference5> mmMeetingReference = new MMMessageBuildingBlock<MeetingCancellationV04, MeetingReference5>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			nextVersions_lazy = () -> Arrays.asList(MeetingCancellationV05.mmMeetingReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference5.mmObject();
		}

		@Override
		public MeetingReference5 getValue(MeetingCancellationV04 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, MeetingReference5 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "NtifngPty")
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
	 * definition} = "Party notifying the cancellation of the meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, Optional<PartyIdentification9Choice>> mmNotifyingParty = new MMMessageBuildingBlock<MeetingCancellationV04, Optional<PartyIdentification9Choice>>() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the cancellation of the meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification9Choice> getValue(MeetingCancellationV04 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, Optional<PartyIdentification9Choice> value) {
			obj.setNotifyingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Scty")
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
	 * "Identifies the security for which the meeting was organised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmSecurity
	 * MeetingCancellationV05.mmSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, List<SecurityPosition6>> mmSecurity = new MMMessageBuildingBlock<MeetingCancellationV04, List<SecurityPosition6>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting was organised.";
			nextVersions_lazy = () -> Arrays.asList(MeetingCancellationV05.mmSecurity);
			maxOccurs = 200;
			minOccurs = 0;
			complexType_lazy = () -> SecurityPosition6.mmObject();
		}

		@Override
		public List<SecurityPosition6> getValue(MeetingCancellationV04 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, List<SecurityPosition6> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected MeetingCancellationReason2 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2
	 * MeetingCancellationReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the justification for the cancellation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmReason
	 * MeetingCancellationV05.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, MeetingCancellationReason2> mmReason = new MMMessageBuildingBlock<MeetingCancellationV04, MeetingCancellationReason2>() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Defines the justification for the cancellation.";
			nextVersions_lazy = () -> Arrays.asList(MeetingCancellationV05.mmReason);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingCancellationReason2.mmObject();
		}

		@Override
		public MeetingCancellationReason2 getValue(MeetingCancellationV04 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, MeetingCancellationReason2 value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV04, List<Extension2>> mmExtension = new MMMessageBuildingBlock<MeetingCancellationV04, List<Extension2>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		@Override
		public List<Extension2> getValue(MeetingCancellationV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(MeetingCancellationV04 obj, List<Extension2> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation1Guideline.for_seev_MeetingCancellationV04,
						com.tools20022.repository.constraints.ConstraintCancellation2Guideline.for_seev_MeetingCancellationV04,
						com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference1Guideline.for_seev_MeetingCancellationV04,
						com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference2Guideline.for_seev_MeetingCancellationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationV04";
				definition = "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present.";
				nextVersions_lazy = () -> Arrays.asList(MeetingCancellationV05.mmObject());
				previousVersion_lazy = () -> MeetingCancellationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgCxl";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingCancellationV04.mmIdentification, com.tools20022.repository.area.seev.MeetingCancellationV04.mmMessageCancellation,
						com.tools20022.repository.area.seev.MeetingCancellationV04.mmMeetingReference, com.tools20022.repository.area.seev.MeetingCancellationV04.mmNotifyingParty,
						com.tools20022.repository.area.seev.MeetingCancellationV04.mmSecurity, com.tools20022.repository.area.seev.MeetingCancellationV04.mmReason, com.tools20022.repository.area.seev.MeetingCancellationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "002";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingCancellationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingCancellationV04 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<AmendInformation1> getMessageCancellation() {
		return messageCancellation == null ? Optional.empty() : Optional.of(messageCancellation);
	}

	public MeetingCancellationV04 setMessageCancellation(AmendInformation1 messageCancellation) {
		this.messageCancellation = messageCancellation;
		return this;
	}

	public MeetingReference5 getMeetingReference() {
		return meetingReference;
	}

	public MeetingCancellationV04 setMeetingReference(MeetingReference5 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public Optional<PartyIdentification9Choice> getNotifyingParty() {
		return notifyingParty == null ? Optional.empty() : Optional.of(notifyingParty);
	}

	public MeetingCancellationV04 setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = notifyingParty;
		return this;
	}

	public List<SecurityPosition6> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingCancellationV04 setSecurity(List<SecurityPosition6> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public MeetingCancellationReason2 getReason() {
		return reason;
	}

	public MeetingCancellationV04 setReason(MeetingCancellationReason2 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public MeetingCancellationV04 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.04")
	static public class Document {
		@XmlElement(name = "MtgCxl", required = true)
		public MeetingCancellationV04 messageBody;
	}
}