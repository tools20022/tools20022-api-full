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
import com.tools20022.repository.choice.InstructionType1Choice;
import com.tools20022.repository.choice.InstructionTypeStatus1Choice;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.MeetingReference4;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SecurityIdentification11;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Receiver of the MeetingInstruction or
 * MeetingInstructionCancellationRequest sends the MeetingInstructionStatus
 * message to the Sender of these messages.<br>
 * The message gives the status of a complete message or of one or more specific
 * instructions within the message.<br>
 * <b>Usage</b><br>
 * The MeetingInstructionStatus message is used for four purposes.<br>
 * First, it provides the status on the processing of a
 * MeetingInstructionCancellationRequest message, for example, whether the
 * request message is rejected or accepted.<br>
 * Second, it is used to provide a global processing or rejection status of a
 * MeetingInstruction message.<br>
 * Third, it is used to provide a detailed processing or rejection status of a
 * MeetingInstruction message, for example, for each instruction in the
 * MeetingInstruction message the processing or rejection status is individually
 * reported by using the InstructionIdentification element. This identification
 * allows the receiver of the status message to link the status confirmation to
 * its original instruction.<br>
 * The blocking of securities should be confirmed via an MT 508 (Intra-Position
 * Advice).<br>
 * Fourth, it is used as a reminder to request voting instructions. This is done
 * by indicating NONREF in the Identification element of the
 * InstructionIdentification component and by using the status code NotReceived
 * in the ProcessingStatus.
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
 * xmlTag} = "MtgInstrSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmIdentification
 * MeetingInstructionStatusV03.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmInstructionType
 * MeetingInstructionStatusV03.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmMeetingReference
 * MeetingInstructionStatusV03.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmReportingParty
 * MeetingInstructionStatusV03.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmSecurityIdentification
 * MeetingInstructionStatusV03.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmInstructionTypeStatus
 * MeetingInstructionStatusV03.mmInstructionTypeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.006.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionStatusV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04
 * MeetingInstructionStatusV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02
 * MeetingInstructionStatusV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingInstructionStatusV03", propOrder = {"identification", "instructionType", "meetingReference", "reportingParty", "securityIdentification", "instructionTypeStatus"})
public class MeetingInstructionStatusV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 identification;
	/**
	 * Identifies the meeting instruction status message.
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
	 * definition} = "Identifies the meeting instruction status message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the meeting instruction status message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionType1Choice instructionType;
	/**
	 * Type of instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice
	 * InstructionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionType = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getInstructionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingReference4 meetingReference;
	/**
	 * Series of elements which allow to identify a meeting.
	 * <p>
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
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getMeetingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification9Choice reportingParty;
	/**
	 * Party reporting the status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party reporting the status."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party reporting the status.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getReportingParty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecurityIdentification11 securityIdentification;
	/**
	 * Identifies the securities for which the meeting is organised.
	 * <p>
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
	 * "Identifies the securities for which the meeting is organised. "</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the securities for which the meeting is organised. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification11.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getSecurityIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InstructionTypeStatus1Choice instructionTypeStatus;
	/**
	 * Type of instruction status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice
	 * InstructionTypeStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrTpSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionTypeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of instruction status."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionTypeStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrTpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionTypeStatus";
			definition = "Type of instruction status.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionTypeStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingInstructionStatusV03.class.getMethod("getInstructionTypeStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionStatusV03";
				definition = "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.";
				nextVersions_lazy = () -> Arrays.asList(MeetingInstructionStatusV04.mmObject());
				previousVersion_lazy = () -> MeetingInstructionStatusV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgInstrSts";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmIdentification, com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmInstructionType,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmMeetingReference, com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmReportingParty,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmSecurityIdentification, com.tools20022.repository.area.seev.MeetingInstructionStatusV03.mmInstructionTypeStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "006";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingInstructionStatusV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public void setIdentification(MessageIdentification1 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "InstrTp", required = true)
	public InstructionType1Choice getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(InstructionType1Choice instructionType) {
		this.instructionType = instructionType;
	}

	@XmlElement(name = "MtgRef", required = true)
	public MeetingReference4 getMeetingReference() {
		return meetingReference;
	}

	public void setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = meetingReference;
	}

	@XmlElement(name = "RptgPty", required = true)
	public PartyIdentification9Choice getReportingParty() {
		return reportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice reportingParty) {
		this.reportingParty = reportingParty;
	}

	@XmlElement(name = "SctyId", required = true)
	public SecurityIdentification11 getSecurityIdentification() {
		return securityIdentification;
	}

	public void setSecurityIdentification(SecurityIdentification11 securityIdentification) {
		this.securityIdentification = securityIdentification;
	}

	@XmlElement(name = "InstrTpSts", required = true)
	public InstructionTypeStatus1Choice getInstructionTypeStatus() {
		return instructionTypeStatus;
	}

	public void setInstructionTypeStatus(InstructionTypeStatus1Choice instructionTypeStatus) {
		this.instructionTypeStatus = instructionTypeStatus;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.03.03")
	static public class Document {
		@XmlElement(name = "MtgInstrSts", required = true)
		public MeetingInstructionStatusV03 messageBody;
	}
}