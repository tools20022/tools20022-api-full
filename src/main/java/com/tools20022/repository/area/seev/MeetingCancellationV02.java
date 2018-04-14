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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.002.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmCancellationIdentification
 * MeetingCancellationV02.mmCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmMessageCancellation
 * MeetingCancellationV02.mmMessageCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmMeetingReference
 * MeetingCancellationV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmNotifyingParty
 * MeetingCancellationV02.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmSecurity
 * MeetingCancellationV02.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV02#mmReason
 * MeetingCancellationV02.mmReason}</li>
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
 * xmlTag} = "MtgCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation1Guideline#for_seev_MeetingCancellationV02
 * ConstraintCancellation1Guideline.for_seev_MeetingCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation2Guideline#for_seev_MeetingCancellationV02
 * ConstraintCancellation2Guideline.for_seev_MeetingCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference1Guideline#for_seev_MeetingCancellationV02
 * ConstraintMeetingIdentificationAndPreviousReference1Guideline.
 * for_seev_MeetingCancellationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference2Guideline#for_seev_MeetingCancellationV02
 * ConstraintMeetingIdentificationAndPreviousReference2Guideline.
 * for_seev_MeetingCancellationV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03
 * MeetingCancellationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingCancellationV02", propOrder = {"cancellationIdentification", "messageCancellation", "meetingReference", "notifyingParty", "security", "reason"})
public class MeetingCancellationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlId", required = true)
	protected MessageIdentification1 cancellationIdentification;
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
	 * xmlTag} = "CxlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the cancellation message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, MessageIdentification1> mmCancellationIdentification = new MMMessageBuildingBlock<MeetingCancellationV02, MessageIdentification1>() {
		{
			xmlTag = "CxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationIdentification";
			definition = "Identifies the cancellation message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingCancellationV02 obj) {
			return obj.getCancellationIdentification();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, MessageIdentification1 value) {
			obj.setCancellationIdentification(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information indicating that the cancellation of a message previously sent is requested (and not the cancellation of the meeting)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, Optional<AmendInformation1>> mmMessageCancellation = new MMMessageBuildingBlock<MeetingCancellationV02, Optional<AmendInformation1>>() {
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
		public Optional<AmendInformation1> getValue(MeetingCancellationV02 obj) {
			return obj.getMessageCancellation();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, Optional<AmendInformation1> value) {
			obj.setMessageCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference2 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference2
	 * MeetingReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, MeetingReference2> mmMeetingReference = new MMMessageBuildingBlock<MeetingCancellationV02, MeetingReference2>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference2.mmObject();
		}

		@Override
		public MeetingReference2 getValue(MeetingCancellationV02 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, MeetingReference2 value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party notifying the cancellation of the meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, Optional<PartyIdentification9Choice>> mmNotifyingParty = new MMMessageBuildingBlock<MeetingCancellationV02, Optional<PartyIdentification9Choice>>() {
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
		public Optional<PartyIdentification9Choice> getValue(MeetingCancellationV02 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, Optional<PartyIdentification9Choice> value) {
			obj.setNotifyingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "Scty")
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
	 * "Identifies the security for which the meeting was organised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, List<SecurityPosition5>> mmSecurity = new MMMessageBuildingBlock<MeetingCancellationV02, List<SecurityPosition5>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting was organised.";
			maxOccurs = 200;
			minOccurs = 0;
			complexType_lazy = () -> SecurityPosition5.mmObject();
		}

		@Override
		public List<SecurityPosition5> getValue(MeetingCancellationV02 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, List<SecurityPosition5> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected MeetingCancellationReason1 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason1
	 * MeetingCancellationReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the justification for the cancellation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV02, MeetingCancellationReason1> mmReason = new MMMessageBuildingBlock<MeetingCancellationV02, MeetingCancellationReason1>() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Defines the justification for the cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingCancellationReason1.mmObject();
		}

		@Override
		public MeetingCancellationReason1 getValue(MeetingCancellationV02 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(MeetingCancellationV02 obj, MeetingCancellationReason1 value) {
			obj.setReason(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation1Guideline.for_seev_MeetingCancellationV02,
						com.tools20022.repository.constraints.ConstraintCancellation2Guideline.for_seev_MeetingCancellationV02,
						com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference1Guideline.for_seev_MeetingCancellationV02,
						com.tools20022.repository.constraints.ConstraintMeetingIdentificationAndPreviousReference2Guideline.for_seev_MeetingCancellationV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationV02";
				definition = "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present.";
				nextVersions_lazy = () -> Arrays.asList(MeetingCancellationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgCxl";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingCancellationV02.mmCancellationIdentification, com.tools20022.repository.area.seev.MeetingCancellationV02.mmMessageCancellation,
						com.tools20022.repository.area.seev.MeetingCancellationV02.mmMeetingReference, com.tools20022.repository.area.seev.MeetingCancellationV02.mmNotifyingParty,
						com.tools20022.repository.area.seev.MeetingCancellationV02.mmSecurity, com.tools20022.repository.area.seev.MeetingCancellationV02.mmReason);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "002";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingCancellationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getCancellationIdentification() {
		return cancellationIdentification;
	}

	public MeetingCancellationV02 setCancellationIdentification(MessageIdentification1 cancellationIdentification) {
		this.cancellationIdentification = Objects.requireNonNull(cancellationIdentification);
		return this;
	}

	public Optional<AmendInformation1> getMessageCancellation() {
		return messageCancellation == null ? Optional.empty() : Optional.of(messageCancellation);
	}

	public MeetingCancellationV02 setMessageCancellation(AmendInformation1 messageCancellation) {
		this.messageCancellation = messageCancellation;
		return this;
	}

	public MeetingReference2 getMeetingReference() {
		return meetingReference;
	}

	public MeetingCancellationV02 setMeetingReference(MeetingReference2 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public Optional<PartyIdentification9Choice> getNotifyingParty() {
		return notifyingParty == null ? Optional.empty() : Optional.of(notifyingParty);
	}

	public MeetingCancellationV02 setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = notifyingParty;
		return this;
	}

	public List<SecurityPosition5> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingCancellationV02 setSecurity(List<SecurityPosition5> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public MeetingCancellationReason1 getReason() {
		return reason;
	}

	public MeetingCancellationV02 setReason(MeetingCancellationReason1 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.02")
	static public class Document {
		@XmlElement(name = "MtgCxl", required = true)
		public MeetingCancellationV02 messageBody;
	}
}