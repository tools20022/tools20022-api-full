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
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmIdentification
 * MeetingInstructionCancellationRequestV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmPreviousReference
 * MeetingInstructionCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmMeetingReference
 * MeetingInstructionCancellationRequestV04.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmRequestingParty
 * MeetingInstructionCancellationRequestV04.mmRequestingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmSecurityIdentification
 * MeetingInstructionCancellationRequestV04.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmInstructedPosition
 * MeetingInstructionCancellationRequestV04.mmInstructedPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04#mmExtension
 * MeetingInstructionCancellationRequestV04.mmExtension}</li>
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
 * xmlTag} = "MtgInstrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.005.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation3Guideline#forMeetingInstructionCancellationRequestV04
 * ConstraintCancellation3Guideline.forMeetingInstructionCancellationRequestV04}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionCancellationRequestV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05
 * MeetingInstructionCancellationRequestV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV03
 * MeetingInstructionCancellationRequestV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingInstructionCancellationRequestV04", propOrder = {"identification", "previousReference", "meetingReference", "requestingParty", "securityIdentification", "instructedPosition", "extension"})
public class MeetingInstructionCancellationRequestV04 {

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
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Uniquely identifies the cancellation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmPreviousReference
	 * MeetingInstructionCancellationRequestV05.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Identifies the instruction to be cancelled.";
			nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmPreviousReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmMeetingReference
	 * MeetingInstructionCancellationRequestV05.mmMeetingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmMeetingReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getMeetingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
				return MeetingInstructionCancellationRequestV04.class.getMethod("getRequestingParty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmFinancialInstrumentIdentification
	 * MeetingInstructionCancellationRequestV05.
	 * mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the security for which the meeting is organised.";
			nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getSecurityIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV05#mmInstructedPosition
	 * MeetingInstructionCancellationRequestV05.mmInstructedPosition}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructedPosition = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstdPos";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedPosition";
			definition = "Identifies the account and instructed positions for which the instruction cancellation request applies.";
			nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmInstructedPosition);
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingAccount4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getInstructedPosition", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionCancellationRequestV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation3Guideline.forMeetingInstructionCancellationRequestV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionCancellationRequestV04";
				definition = "Scope\r\nThe MeetingInstructionCancellationRequest message is sent by the same party that sent the MeetingInstruction message. It is sent to request the cancellation of all instructions included in the original the MeetingInstruction message.\r\nUsage\r\nThis message must be answered by a MeetingInstructionStatus message. Some instructions in the previously sent MeetingInstruction message may have already been executed and cannot be cancelled. This information should appear clearly in the status message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingInstructionCancellationRequestV05.mmObject());
				previousVersion_lazy = () -> MeetingInstructionCancellationRequestV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgInstrCxlReq";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmPreviousReference, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmRequestingParty, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmSecurityIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmInstructedPosition, com.tools20022.repository.area.seev.MeetingInstructionCancellationRequestV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "005";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingInstructionCancellationRequestV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingInstructionCancellationRequestV04 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public MessageIdentification getPreviousReference() {
		return previousReference;
	}

	public MeetingInstructionCancellationRequestV04 setPreviousReference(MessageIdentification previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<MeetingReference4> getMeetingReference() {
		return meetingReference == null ? Optional.empty() : Optional.of(meetingReference);
	}

	public MeetingInstructionCancellationRequestV04 setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = meetingReference;
		return this;
	}

	public Optional<PartyIdentification9Choice> getRequestingParty() {
		return requestingParty == null ? Optional.empty() : Optional.of(requestingParty);
	}

	public MeetingInstructionCancellationRequestV04 setRequestingParty(PartyIdentification9Choice requestingParty) {
		this.requestingParty = requestingParty;
		return this;
	}

	public Optional<SecurityIdentification11> getSecurityIdentification() {
		return securityIdentification == null ? Optional.empty() : Optional.of(securityIdentification);
	}

	public MeetingInstructionCancellationRequestV04 setSecurityIdentification(SecurityIdentification11 securityIdentification) {
		this.securityIdentification = securityIdentification;
		return this;
	}

	public List<SafekeepingAccount4> getInstructedPosition() {
		return instructedPosition == null ? instructedPosition = new ArrayList<>() : instructedPosition;
	}

	public MeetingInstructionCancellationRequestV04 setInstructedPosition(List<SafekeepingAccount4> instructedPosition) {
		this.instructedPosition = Objects.requireNonNull(instructedPosition);
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public MeetingInstructionCancellationRequestV04 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.005.001.04")
	static public class Document {
		@XmlElement(name = "MtgInstrCxlReq", required = true)
		public MeetingInstructionCancellationRequestV04 messageBody;
	}
}