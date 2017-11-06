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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.MeetingStatus;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of instruction type status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmInstructionStatus
 * InstructionTypeStatus2Choice.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmCancellationStatus
 * InstructionTypeStatus2Choice.mmCancellationStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmInstructionTypeStatus
 * MeetingInstructionStatusV05.mmInstructionTypeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionTypeStatus2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of instruction type status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice
 * InstructionTypeStatus1Choice}</li>
 * </ul>
 */
public class InstructionTypeStatus2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected InstructionStatus5Choice instructionStatus;
	/**
	 * Status applying to the instruction request received. The instruction is
	 * identified by the InstructionIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice
	 * InstructionStatus5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice
	 * InstructionTypeStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to the instruction request received. The instruction is identified by the InstructionIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmInstructionStatus
	 * InstructionTypeStatus1Choice.mmInstructionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> InstructionTypeStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Status applying to the instruction request received. The instruction is identified by the InstructionIdentification.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmInstructionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionStatus5Choice.mmObject();
		}
	};
	protected CancellationStatus2Choice cancellationStatus;
	/**
	 * Status applying to the instruction cancellation request received. The
	 * instruction cancellation is identified by the
	 * InstructionCancellationIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CancellationStatus2Choice
	 * CancellationStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmInstructionCancellationStatus
	 * MeetingStatus.mmInstructionCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice
	 * InstructionTypeStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to the instruction cancellation request received. The instruction cancellation is identified by the InstructionCancellationIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmCancellationStatus
	 * InstructionTypeStatus1Choice.mmCancellationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.MeetingStatus.mmInstructionCancellationStatus;
			componentContext_lazy = () -> InstructionTypeStatus2Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Status applying to the instruction cancellation request received. The instruction cancellation is identified by the InstructionCancellationIdentification.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmCancellationStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.CancellationStatus2Choice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionTypeStatus2Choice.mmInstructionStatus, com.tools20022.repository.choice.InstructionTypeStatus2Choice.mmCancellationStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingInstructionStatusV05.mmInstructionTypeStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InstructionTypeStatus2Choice";
				definition = "Choice of instruction type status.";
				previousVersion_lazy = () -> InstructionTypeStatus1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionStatus5Choice getInstructionStatus() {
		return instructionStatus;
	}

	public void setInstructionStatus(com.tools20022.repository.choice.InstructionStatus5Choice instructionStatus) {
		this.instructionStatus = instructionStatus;
	}

	public CancellationStatus2Choice getCancellationStatus() {
		return cancellationStatus;
	}

	public void setCancellationStatus(com.tools20022.repository.choice.CancellationStatus2Choice cancellationStatus) {
		this.cancellationStatus = cancellationStatus;
	}
}