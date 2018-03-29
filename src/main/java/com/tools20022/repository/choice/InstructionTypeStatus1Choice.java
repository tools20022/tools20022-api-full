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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV03;
import com.tools20022.repository.area.seev.MeetingInstructionStatusV04;
import com.tools20022.repository.choice.CancellationStatus2Choice;
import com.tools20022.repository.choice.InstructionStatus3Choice;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmInstructionStatus
 * InstructionTypeStatus1Choice.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice#mmCancellationStatus
 * InstructionTypeStatus1Choice.mmCancellationStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV03#mmInstructionTypeStatus
 * MeetingInstructionStatusV03.mmInstructionTypeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV04#mmInstructionTypeStatus
 * MeetingInstructionStatusV04.mmInstructionTypeStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionTypeStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of instruction type status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice
 * InstructionTypeStatus2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionTypeStatus1Choice", propOrder = {"instructionStatus", "cancellationStatus"})
public class InstructionTypeStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstrSts", required = true)
	protected InstructionStatus3Choice instructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice
	 * InstructionStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice
	 * InstructionTypeStatus1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmInstructionStatus
	 * InstructionTypeStatus2Choice.mmInstructionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionTypeStatus1Choice, InstructionStatus3Choice> mmInstructionStatus = new MMMessageAssociationEnd<InstructionTypeStatus1Choice, InstructionStatus3Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Status applying to the instruction request received. The instruction is identified by the InstructionIdentification.";
			nextVersions_lazy = () -> Arrays.asList(InstructionTypeStatus2Choice.mmInstructionStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionStatus3Choice.mmObject();
		}

		@Override
		public InstructionStatus3Choice getValue(InstructionTypeStatus1Choice obj) {
			return obj.getInstructionStatus();
		}

		@Override
		public void setValue(InstructionTypeStatus1Choice obj, InstructionStatus3Choice value) {
			obj.setInstructionStatus(value);
		}
	};
	@XmlElement(name = "CxlSts", required = true)
	protected CancellationStatus2Choice cancellationStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus1Choice
	 * InstructionTypeStatus1Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionTypeStatus2Choice#mmCancellationStatus
	 * InstructionTypeStatus2Choice.mmCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionTypeStatus1Choice, CancellationStatus2Choice> mmCancellationStatus = new MMMessageAssociationEnd<InstructionTypeStatus1Choice, CancellationStatus2Choice>() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmInstructionCancellationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatus";
			definition = "Status applying to the instruction cancellation request received. The instruction cancellation is identified by the InstructionCancellationIdentification.";
			nextVersions_lazy = () -> Arrays.asList(InstructionTypeStatus2Choice.mmCancellationStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CancellationStatus2Choice.mmObject();
		}

		@Override
		public CancellationStatus2Choice getValue(InstructionTypeStatus1Choice obj) {
			return obj.getCancellationStatus();
		}

		@Override
		public void setValue(InstructionTypeStatus1Choice obj, CancellationStatus2Choice value) {
			obj.setCancellationStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmInstructionStatus, com.tools20022.repository.choice.InstructionTypeStatus1Choice.mmCancellationStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionStatusV03.mmInstructionTypeStatus, MeetingInstructionStatusV04.mmInstructionTypeStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionTypeStatus1Choice";
				definition = "Choice of instruction type status.";
				nextVersions_lazy = () -> Arrays.asList(InstructionTypeStatus2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionStatus3Choice getInstructionStatus() {
		return instructionStatus;
	}

	public InstructionTypeStatus1Choice setInstructionStatus(InstructionStatus3Choice instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}

	public CancellationStatus2Choice getCancellationStatus() {
		return cancellationStatus;
	}

	public InstructionTypeStatus1Choice setCancellationStatus(CancellationStatus2Choice cancellationStatus) {
		this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
		return this;
	}
}