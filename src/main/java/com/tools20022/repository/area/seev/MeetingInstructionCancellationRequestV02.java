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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * xmlTag} = "MtgInstrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmInstructionCancellationIdentification
 * MeetingInstructionCancellationRequestV02.
 * mmInstructionCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmPreviousReference
 * MeetingInstructionCancellationRequestV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmMeetingReference
 * MeetingInstructionCancellationRequestV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmRequestingParty
 * MeetingInstructionCancellationRequestV02.mmRequestingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmSecurityIdentification
 * MeetingInstructionCancellationRequestV02.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02#mmInstructedPosition
 * MeetingInstructionCancellationRequestV02.mmInstructedPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.005.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionCancellationRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03
 * MeetingInstructionCancellationRequestV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingInstructionCancellationRequestV02", propOrder = {"instructionCancellationIdentification", "previousReference", "meetingReference", "requestingParty", "securityIdentification", "instructedPosition"})
public class MeetingInstructionCancellationRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 instructionCancellationIdentification;
	/**
	 * Uniquely identifies the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uniquely identifies the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionCancellationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationIdentification";
			definition = "Uniquely identifies the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getInstructionCancellationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MessageIdentification previousReference;
	/**
	 * Identifies the instruction to be cancelled.
	 * <p>
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
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Identifies the instruction to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingReference3 meetingReference;
	/**
	 * Series of elements which allow to identify a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
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
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MeetingReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getMeetingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification9Choice requestingParty;
	/**
	 * Party requesting the cancellation.
	 * <p>
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
	public static final MMMessageBuildingBlock mmRequestingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "RqstngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestingParty";
			definition = "Party requesting the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getRequestingParty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification3 securityIdentification;
	/**
	 * Identifies the security for which the meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3
	 * SecurityIdentification3}</li>
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
	public static final MMMessageBuildingBlock mmSecurityIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security for which the meeting is organised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getSecurityIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SafekeepingAccount3> instructedPosition;
	/**
	 * Identifies the account and instructed positions for which the instruction
	 * cancellation request applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount3
	 * SafekeepingAccount3}</li>
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
	public static final MMMessageBuildingBlock mmInstructedPosition = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstdPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedPosition";
			definition = "Identifies the account and instructed positions for which the instruction cancellation request applies.";
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingAccount3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV02.class.getMethod("getInstructedPosition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionCancellationRequestV02";
				definition = "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgInstrCxlReq";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmInstructionCancellationIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmPreviousReference, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmRequestingParty, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmSecurityIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV02.mmInstructedPosition);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "005";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingInstructionCancellationRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrCxlId", required = true)
	public MessageIdentification1 getInstructionCancellationIdentification() {
		return instructionCancellationIdentification;
	}

	public void setInstructionCancellationIdentification(MessageIdentification1 instructionCancellationIdentification) {
		this.instructionCancellationIdentification = instructionCancellationIdentification;
	}

	@XmlElement(name = "PrvsRef", required = true)
	public MessageIdentification getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(MessageIdentification previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "MtgRef")
	public MeetingReference3 getMeetingReference() {
		return meetingReference;
	}

	public void setMeetingReference(MeetingReference3 meetingReference) {
		this.meetingReference = meetingReference;
	}

	@XmlElement(name = "RqstngPty")
	public PartyIdentification9Choice getRequestingParty() {
		return requestingParty;
	}

	public void setRequestingParty(PartyIdentification9Choice requestingParty) {
		this.requestingParty = requestingParty;
	}

	@XmlElement(name = "SctyId")
	public SecurityIdentification3 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(SecurityIdentification3 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "InstdPos")
	public List<SafekeepingAccount3> getInstructedPosition() {
		return instructedPosition;
	}

	public void setInstructedPosition(List<SafekeepingAccount3> instructedPosition) {
		this.instructedPosition = instructedPosition;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.005.02.02")
	static public class Document {
		@XmlElement(name = "MtgInstrCxlReq", required = true)
		public MeetingInstructionCancellationRequestV02 messageBody;
	}
}