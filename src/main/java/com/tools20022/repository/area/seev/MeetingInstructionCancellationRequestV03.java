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
 * The MeetingInstructionCancellationRequest message is sent by the same party
 * that sent the MeetingInstruction message. It is sent to request the
 * cancellation of all instructions included in the original the
 * MeetingInstruction message.<br>
 * <b>Usage</b><br>
 * This message must be answered by a MeetingInstructionStatus message. Some
 * instructions in the previously sent MeetingInstruction message may have
 * already been executed and cannot be cancelled. This information should appear
 * clearly in the status message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmIdentification
 * MeetingInstructionCancellationRequestV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmPreviousReference
 * MeetingInstructionCancellationRequestV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmMeetingReference
 * MeetingInstructionCancellationRequestV03.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmRequestingParty
 * MeetingInstructionCancellationRequestV03.mmRequestingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmSecurityIdentification
 * MeetingInstructionCancellationRequestV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03#mmInstructedPosition
 * MeetingInstructionCancellationRequestV03.mmInstructedPosition}</li>
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
 * xmlTag} = "MtgInstrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.005.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation3Guideline#for_seev_MeetingInstructionCancellationRequestV03
 * ConstraintCancellation3Guideline.
 * for_seev_MeetingInstructionCancellationRequestV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionCancellationRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04
 * MeetingInstructionCancellationRequestV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02
 * MeetingInstructionCancellationRequestV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingInstructionCancellationRequestV03", propOrder = {"identification", "previousReference", "meetingReference", "requestingParty", "securityIdentification", "instructedPosition"})
public class MeetingInstructionCancellationRequestV03 {

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
	 * definition} = "Uniquely identifies the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, MessageIdentification1> mmIdentification = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, MessageIdentification1>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, MessageIdentification1 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "PrvsRef", required = true)
	protected MessageIdentification previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the instruction to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, MessageIdentification> mmPreviousReference = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, MessageIdentification>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Identifies the instruction to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, MessageIdentification value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "MtgRef")
	protected MeetingReference4 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4
	 * MeetingReference4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<MeetingReference4>> mmMeetingReference = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<MeetingReference4>>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}

		@Override
		public Optional<MeetingReference4> getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, Optional<MeetingReference4> value) {
			obj.setMeetingReference(value.orElse(null));
		}
	};
	@XmlElement(name = "RqstngPty")
	protected PartyIdentification9Choice requestingParty;
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
	 * xmlTag} = "RqstngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party requesting the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<PartyIdentification9Choice>> mmRequestingParty = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<PartyIdentification9Choice>>() {
		{
			xmlTag = "RqstngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestingParty";
			definition = "Party requesting the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification9Choice> getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getRequestingParty();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, Optional<PartyIdentification9Choice> value) {
			obj.setRequestingParty(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyId")
	protected SecurityIdentification11 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification11
	 * SecurityIdentification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the security for which the meeting is organised."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<SecurityIdentification11>> mmSecurityIdentification = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, Optional<SecurityIdentification11>>() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security for which the meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		@Override
		public Optional<SecurityIdentification11> getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, Optional<SecurityIdentification11> value) {
			obj.setSecurityIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdPos")
	protected List<SafekeepingAccount4> instructedPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount4
	 * SafekeepingAccount4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account and instructed positions for which the instruction cancellation request applies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, List<SafekeepingAccount4>> mmInstructedPosition = new MMMessageBuildingBlock<MeetingInstructionCancellationRequestV03, List<SafekeepingAccount4>>() {
		{
			xmlTag = "InstdPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedPosition";
			definition = "Identifies the account and instructed positions for which the instruction cancellation request applies.";
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingAccount4.mmObject();
		}

		@Override
		public List<SafekeepingAccount4> getValue(MeetingInstructionCancellationRequestV03 obj) {
			return obj.getInstructedPosition();
		}

		@Override
		public void setValue(MeetingInstructionCancellationRequestV03 obj, List<SafekeepingAccount4> value) {
			obj.setInstructedPosition(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation3Guideline.for_seev_MeetingInstructionCancellationRequestV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionCancellationRequestV03";
				definition = "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV04.mmObject());
				previousVersion_lazy = () -> MeetingInstructionCancellationRequestV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgInstrCxlReq";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmPreviousReference, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmRequestingParty, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmSecurityIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03.mmInstructedPosition);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "005";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingInstructionCancellationRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingInstructionCancellationRequestV03 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MessageIdentification getPreviousReference() {
		return previousReference;
	}

	public MeetingInstructionCancellationRequestV03 setPreviousReference(MessageIdentification previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<MeetingReference4> getMeetingReference() {
		return meetingReference == null ? Optional.empty() : Optional.of(meetingReference);
	}

	public MeetingInstructionCancellationRequestV03 setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = meetingReference;
		return this;
	}

	public Optional<PartyIdentification9Choice> getRequestingParty() {
		return requestingParty == null ? Optional.empty() : Optional.of(requestingParty);
	}

	public MeetingInstructionCancellationRequestV03 setRequestingParty(PartyIdentification9Choice requestingParty) {
		this.requestingParty = requestingParty;
		return this;
	}

	public Optional<SecurityIdentification11> getSecurityIdentification() {
		return securityIdentification == null ? Optional.empty() : Optional.of(securityIdentification);
	}

	public MeetingInstructionCancellationRequestV03 setSecurityIdentification(SecurityIdentification11 securityIdentification) {
		this.securityIdentification = securityIdentification;
		return this;
	}

	public List<SafekeepingAccount4> getInstructedPosition() {
		return instructedPosition == null ? instructedPosition = new ArrayList<>() : instructedPosition;
	}

	public MeetingInstructionCancellationRequestV03 setInstructedPosition(List<SafekeepingAccount4> instructedPosition) {
		this.instructedPosition = Objects.requireNonNull(instructedPosition);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.005.001.03")
	static public class Document {
		@XmlElement(name = "MtgInstrCxlReq", required = true)
		public MeetingInstructionCancellationRequestV03 messageBody;
	}
}