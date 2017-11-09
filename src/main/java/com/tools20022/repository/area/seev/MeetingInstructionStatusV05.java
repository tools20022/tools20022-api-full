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
import com.tools20022.repository.choice.InstructionType1Choice;
import com.tools20022.repository.choice.InstructionTypeStatus2Choice;
import com.tools20022.repository.msg.MeetingReference7;
import com.tools20022.repository.msg.SecurityIdentification14;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ProxyVotingISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * in the ProcessingStatus.<br>
 * This message definition is intended for use with the Business Application
 * Header (head.001.001.01).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.006.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ProxyVotingISOLatestversion
 * ProxyVotingISOLatestversion}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmInstructionType
 * MeetingInstructionStatusV05.mmInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmMeetingReference
 * MeetingInstructionStatusV05.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmFinancialInstrumentIdentification
 * MeetingInstructionStatusV05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmInstructionTypeStatus
 * MeetingInstructionStatusV05.mmInstructionTypeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmSupplementaryData
 * MeetingInstructionStatusV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionStatusV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04
 * MeetingInstructionStatusV04}</li>
 * </ul>
 */
public class MeetingInstructionStatusV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmInstructionType
	 * MeetingInstructionStatusV04.mmInstructionType}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionType = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionType";
			definition = "Type of instruction.";
			previousVersion_lazy = () -> MeetingInstructionStatusV04.mmInstructionType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType1Choice.mmObject();
		}
	};
	protected MeetingReference7 meetingReference;
	/**
	 * Series of elements which allow to identify a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7
	 * MeetingReference7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmMeetingReference
	 * MeetingInstructionStatusV04.mmMeetingReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			previousVersion_lazy = () -> MeetingInstructionStatusV04.mmMeetingReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference7.mmObject();
		}
	};
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * Identifies the securities for which the meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities for which the meeting is organised. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmSecurityIdentification
	 * MeetingInstructionStatusV04.mmSecurityIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancialInstrumentIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identifies the securities for which the meeting is organised. ";
			previousVersion_lazy = () -> MeetingInstructionStatusV04.mmSecurityIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}
	};
	protected InstructionTypeStatus2Choice instructionTypeStatus;
	/**
	 * Type of instruction status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice
	 * InstructionTypeStatus2Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmInstructionTypeStatus
	 * MeetingInstructionStatusV04.mmInstructionTypeStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInstructionTypeStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "InstrTpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionTypeStatus";
			definition = "Type of instruction status.";
			previousVersion_lazy = () -> MeetingInstructionStatusV04.mmInstructionTypeStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionTypeStatus2Choice.mmObject();
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionStatusV05";
				definition = "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, for example, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, for example, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01).";
				previousVersion_lazy = () -> MeetingInstructionStatusV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MtgInstrSts";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionStatusV05.mmInstructionType, MeetingInstructionStatusV05.mmMeetingReference, MeetingInstructionStatusV05.mmFinancialInstrumentIdentification,
						MeetingInstructionStatusV05.mmInstructionTypeStatus, MeetingInstructionStatusV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "006";
						version = "05";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionType1Choice getInstructionType() {
		return instructionType;
	}

	public void setInstructionType(InstructionType1Choice instructionType) {
		this.instructionType = instructionType;
	}

	public MeetingReference7 getMeetingReference() {
		return meetingReference;
	}

	public void setMeetingReference(MeetingReference7 meetingReference) {
		this.meetingReference = meetingReference;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	public InstructionTypeStatus2Choice getInstructionTypeStatus() {
		return instructionTypeStatus;
	}

	public void setInstructionTypeStatus(InstructionTypeStatus2Choice instructionTypeStatus) {
		this.instructionTypeStatus = instructionTypeStatus;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}