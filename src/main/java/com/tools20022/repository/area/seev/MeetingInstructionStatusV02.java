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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.CancellationStatus1Choice;
import com.tools20022.repository.choice.InstructionStatus1Choice;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.MeetingReference3;
import com.tools20022.repository.msg.MessageIdentification;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SecurityIdentification3;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * MeetingInstructionCancellationRequest message, ie, whether the request
 * message is rejected or accepted.<br>
 * Second, it is used to provide a global processing or rejection status of a
 * MeetingInstruction message.<br>
 * Third, it is used to provide a detailed processing or rejection status of a
 * MeetingInstruction message, ie, for each instruction in the
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.006.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#InstructionOrInstructionCancellationIdentificationRule
 * MeetingInstructionStatusV02.
 * InstructionOrInstructionCancellationIdentificationRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#InstructionOrCancellationStatusRule
 * MeetingInstructionStatusV02.InstructionOrCancellationStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmMeetingInstructionStatusIdentification
 * MeetingInstructionStatusV02.mmMeetingInstructionStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionIdentification
 * MeetingInstructionStatusV02.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionCancellationIdentification
 * MeetingInstructionStatusV02.mmInstructionCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmMeetingReference
 * MeetingInstructionStatusV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmReportingParty
 * MeetingInstructionStatusV02.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmSecurityIdentification
 * MeetingInstructionStatusV02.mmSecurityIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionStatus
 * MeetingInstructionStatusV02.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmCancellationStatus
 * MeetingInstructionStatusV02.mmCancellationStatus}</li>
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
 * xmlTag} = "MtgInstrSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionStatusV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, ie, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, ie, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatus1Rule#for_seev_MeetingInstructionStatusV02
 * ConstraintStatus1Rule.for_seev_MeetingInstructionStatusV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatus2Rule#for_seev_MeetingInstructionStatusV02
 * ConstraintStatus2Rule.for_seev_MeetingInstructionStatusV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReminder1Rule#for_seev_MeetingInstructionStatusV02
 * ConstraintReminder1Rule.for_seev_MeetingInstructionStatusV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03
 * MeetingInstructionStatusV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingInstructionStatusV02", propOrder = {"meetingInstructionStatusIdentification", "instructionIdentification", "instructionCancellationIdentification", "meetingReference", "reportingParty", "securityIdentification",
		"instructionStatus", "cancellationStatus"})
public class MeetingInstructionStatusV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either the InstructionIdentification or the
	 * InstructionCancellationIdentification must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02
	 * MeetingInstructionStatusV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionIdentification
	 * MeetingInstructionStatusV02.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionCancellationIdentification
	 * MeetingInstructionStatusV02.mmInstructionCancellationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionOrInstructionCancellationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either the InstructionIdentification or the InstructionCancellationIdentification must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor InstructionOrInstructionCancellationIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionOrInstructionCancellationIdentificationRule";
			definition = "Either the InstructionIdentification or the InstructionCancellationIdentification must be present, but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionIdentification,
					com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionCancellationIdentification);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmObject();
		}
	};
	/**
	 * Either the InstructionStatus or the CancellationStatus must be present,
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02
	 * MeetingInstructionStatusV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmInstructionStatus
	 * MeetingInstructionStatusV02.mmInstructionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV02#mmCancellationStatus
	 * MeetingInstructionStatusV02.mmCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionOrCancellationStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either the InstructionStatus or the CancellationStatus must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor InstructionOrCancellationStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionOrCancellationStatusRule";
			definition = "Either the InstructionStatus or the CancellationStatus must be present, but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionStatus, com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmCancellationStatus);
			messageDefinition_lazy = () -> com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmObject();
		}
	};
	@XmlElement(name = "MtgInstrStsId", required = true)
	protected MessageIdentification1 meetingInstructionStatusIdentification;
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
	 * xmlTag} = "MtgInstrStsId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingInstructionStatusIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the meeting instruction status message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification1> mmMeetingInstructionStatusIdentification = new MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification1>() {
		{
			xmlTag = "MtgInstrStsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingInstructionStatusIdentification";
			definition = "Identifies the meeting instruction status message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingInstructionStatusV02 obj) {
			return obj.getMeetingInstructionStatusIdentification();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, MessageIdentification1 value) {
			obj.setMeetingInstructionStatusIdentification(value);
		}
	};
	@XmlElement(name = "InstrId", required = true)
	protected MessageIdentification instructionIdentification;
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
	 * xmlTag} = "InstrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction message for which the status is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification> mmInstructionIdentification = new MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification>() {
		{
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the meeting instruction message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(MeetingInstructionStatusV02 obj) {
			return obj.getInstructionIdentification();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, MessageIdentification value) {
			obj.setInstructionIdentification(value);
		}
	};
	@XmlElement(name = "InstrCxlId", required = true)
	protected MessageIdentification instructionCancellationIdentification;
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
	 * xmlTag} = "InstrCxlId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction cancellation request message for which the status is provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification> mmInstructionCancellationIdentification = new MMMessageBuildingBlock<MeetingInstructionStatusV02, MessageIdentification>() {
		{
			xmlTag = "InstrCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationIdentification";
			definition = "Identifies the meeting instruction cancellation request message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public MessageIdentification getValue(MeetingInstructionStatusV02 obj) {
			return obj.getInstructionCancellationIdentification();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, MessageIdentification value) {
			obj.setInstructionCancellationIdentification(value);
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference3 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
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
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, MeetingReference3> mmMeetingReference = new MMMessageBuildingBlock<MeetingInstructionStatusV02, MeetingReference3>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference3.mmObject();
		}

		@Override
		public MeetingReference3 getValue(MeetingInstructionStatusV02 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, MeetingReference3 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "RptgPty", required = true)
	protected PartyIdentification9Choice reportingParty;
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
	 * xmlTag} = "RptgPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party reporting the status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, PartyIdentification9Choice> mmReportingParty = new MMMessageBuildingBlock<MeetingInstructionStatusV02, PartyIdentification9Choice>() {
		{
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party reporting the status.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public PartyIdentification9Choice getValue(MeetingInstructionStatusV02 obj) {
			return obj.getReportingParty();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, PartyIdentification9Choice value) {
			obj.setReportingParty(value);
		}
	};
	@XmlElement(name = "SctyId", required = true)
	protected SecurityIdentification3 securityIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification3
	 * SecurityIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities for which the meeting is organised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, SecurityIdentification3> mmSecurityIdentification = new MMMessageBuildingBlock<MeetingInstructionStatusV02, SecurityIdentification3>() {
		{
			xmlTag = "SctyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityIdentification";
			definition = "Identifies the securities for which the meeting is organised.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification3.mmObject();
		}

		@Override
		public SecurityIdentification3 getValue(MeetingInstructionStatusV02 obj) {
			return obj.getSecurityIdentification();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, SecurityIdentification3 value) {
			obj.setSecurityIdentification(value);
		}
	};
	@XmlElement(name = "InstrSts", required = true)
	protected InstructionStatus1Choice instructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus1Choice
	 * InstructionStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to the instruction request received. The instruction is identified by the InstructionIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, InstructionStatus1Choice> mmInstructionStatus = new MMMessageBuildingBlock<MeetingInstructionStatusV02, InstructionStatus1Choice>() {
		{
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Status applying to the instruction request received. The instruction is identified by the InstructionIdentification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionStatus1Choice.mmObject();
		}

		@Override
		public InstructionStatus1Choice getValue(MeetingInstructionStatusV02 obj) {
			return obj.getInstructionStatus();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, InstructionStatus1Choice value) {
			obj.setInstructionStatus(value);
		}
	};
	@XmlElement(name = "CxlSts", required = true)
	protected CancellationStatus1Choice cancellationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus1Choice
	 * CancellationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to the instruction cancellation request received. The instruction cancellation is identified by the InstructionCancellationIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingInstructionStatusV02, CancellationStatus1Choice> mmCancellationStatus = new MMMessageBuildingBlock<MeetingInstructionStatusV02, CancellationStatus1Choice>() {
		{
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Status applying to the instruction cancellation request received. The instruction cancellation is identified by the InstructionCancellationIdentification.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CancellationStatus1Choice.mmObject();
		}

		@Override
		public CancellationStatus1Choice getValue(MeetingInstructionStatusV02 obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(MeetingInstructionStatusV02 obj, CancellationStatus1Choice value) {
			obj.setCancellationStatus(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatus1Rule.for_seev_MeetingInstructionStatusV02,
						com.tools20022.repository.constraints.ConstraintStatus2Rule.for_seev_MeetingInstructionStatusV02, com.tools20022.repository.constraints.ConstraintReminder1Rule.for_seev_MeetingInstructionStatusV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionStatusV02";
				definition = "Scope\r\nThe Receiver of the MeetingInstruction or MeetingInstructionCancellationRequest sends the MeetingInstructionStatus message to the Sender of these messages.\r\nThe message gives the status of a complete message or of one or more specific instructions within the message.\r\nUsage\r\nThe MeetingInstructionStatus message is used for four purposes.\r\nFirst, it provides the status on the processing of a MeetingInstructionCancellationRequest message, ie, whether the request message is rejected or accepted.\r\nSecond, it is used to provide a global processing or rejection status of a MeetingInstruction message.\r\nThird, it is used to provide a detailed processing or rejection status of a MeetingInstruction message, ie, for each instruction in the MeetingInstruction message the processing or rejection status is individually reported by using the InstructionIdentification element. This identification allows the receiver of the status message to link the status confirmation to its original instruction.\r\nThe blocking of securities should be confirmed via an MT 508 (Intra-Position Advice).\r\nFourth, it is used as a reminder to request voting instructions. This is done by indicating NONREF in the Identification element of the InstructionIdentification component and by using the status code NotReceived in the ProcessingStatus.";
				nextVersions_lazy = () -> Arrays.asList(MeetingInstructionStatusV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV02.InstructionOrInstructionCancellationIdentificationRule,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.InstructionOrCancellationStatusRule);
				rootElement = "Document";
				xmlTag = "MtgInstrSts";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmMeetingInstructionStatusIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionIdentification, com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionCancellationIdentification,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmMeetingReference, com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmReportingParty,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmSecurityIdentification, com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmInstructionStatus,
						com.tools20022.repository.area.seev.MeetingInstructionStatusV02.mmCancellationStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "006";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingInstructionStatusV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMeetingInstructionStatusIdentification() {
		return meetingInstructionStatusIdentification;
	}

	public MeetingInstructionStatusV02 setMeetingInstructionStatusIdentification(MessageIdentification1 meetingInstructionStatusIdentification) {
		this.meetingInstructionStatusIdentification = Objects.requireNonNull(meetingInstructionStatusIdentification);
		return this;
	}

	public MessageIdentification getInstructionIdentification() {
		return instructionIdentification;
	}

	public MeetingInstructionStatusV02 setInstructionIdentification(MessageIdentification instructionIdentification) {
		this.instructionIdentification = Objects.requireNonNull(instructionIdentification);
		return this;
	}

	public MessageIdentification getInstructionCancellationIdentification() {
		return instructionCancellationIdentification;
	}

	public MeetingInstructionStatusV02 setInstructionCancellationIdentification(MessageIdentification instructionCancellationIdentification) {
		this.instructionCancellationIdentification = Objects.requireNonNull(instructionCancellationIdentification);
		return this;
	}

	public MeetingReference3 getMeetingReference() {
		return meetingReference;
	}

	public MeetingInstructionStatusV02 setMeetingReference(MeetingReference3 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public PartyIdentification9Choice getReportingParty() {
		return reportingParty;
	}

	public MeetingInstructionStatusV02 setReportingParty(PartyIdentification9Choice reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public SecurityIdentification3 getSecurityIdentification() {
		return securityIdentification;
	}

	public MeetingInstructionStatusV02 setSecurityIdentification(SecurityIdentification3 securityIdentification) {
		this.securityIdentification = Objects.requireNonNull(securityIdentification);
		return this;
	}

	public InstructionStatus1Choice getInstructionStatus() {
		return instructionStatus;
	}

	public MeetingInstructionStatusV02 setInstructionStatus(InstructionStatus1Choice instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}

	public CancellationStatus1Choice getCancellationStatus() {
		return cancellationStatus;
	}

	public MeetingInstructionStatusV02 setCancellationStatus(CancellationStatus1Choice cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.006.001.02")
	static public class Document {
		@XmlElement(name = "MtgInstrSts", required = true)
		public MeetingInstructionStatusV02 messageBody;
	}
}