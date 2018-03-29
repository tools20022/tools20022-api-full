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
import com.tools20022.repository.choice.InstructionStatus6Choice;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DetailedInstructionStatus11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status applying to the instruction request received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmGlobalInstructionStatus
 * InstructionStatus5Choice.mmGlobalInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmDetailedInstructionStatus
 * InstructionStatus5Choice.mmDetailedInstructionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
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
 * "InstructionStatus5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status applying to the instruction request received."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice
 * InstructionStatus3Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionStatus5Choice", propOrder = {"globalInstructionStatus", "detailedInstructionStatus"})
public class InstructionStatus5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GblInstrSts", required = true)
	protected InstructionStatus6Choice globalInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus6Choice
	 * InstructionStatus6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice
	 * InstructionStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblInstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying globally to the instruction received. The instruction is identified by the InstructionIdentification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmGlobalInstructionStatus
	 * InstructionStatus3Choice.mmGlobalInstructionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionStatus5Choice, InstructionStatus6Choice> mmGlobalInstructionStatus = new MMMessageAssociationEnd<InstructionStatus5Choice, InstructionStatus6Choice>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "GblInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalInstructionStatus";
			definition = "Status applying globally to the instruction received. The instruction is identified by the InstructionIdentification.";
			previousVersion_lazy = () -> InstructionStatus3Choice.mmGlobalInstructionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InstructionStatus6Choice.mmObject();
		}

		@Override
		public InstructionStatus6Choice getValue(InstructionStatus5Choice obj) {
			return obj.getGlobalInstructionStatus();
		}

		@Override
		public void setValue(InstructionStatus5Choice obj, InstructionStatus6Choice value) {
			obj.setGlobalInstructionStatus(value);
		}
	};
	@XmlElement(name = "DtldInstrSts", required = true)
	protected List<DetailedInstructionStatus11> detailedInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus11
	 * DetailedInstructionStatus11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice
	 * InstructionStatus5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldInstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status applying to individual instructions of a MeetingInstruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmDetailedInstructionStatus
	 * InstructionStatus3Choice.mmDetailedInstructionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionStatus5Choice, List<DetailedInstructionStatus11>> mmDetailedInstructionStatus = new MMMessageAssociationEnd<InstructionStatus5Choice, List<DetailedInstructionStatus11>>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.InstructionStatus5Choice.mmObject();
			isDerived = false;
			xmlTag = "DtldInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedInstructionStatus";
			definition = "Status applying to individual instructions of a MeetingInstruction.";
			previousVersion_lazy = () -> InstructionStatus3Choice.mmDetailedInstructionStatus;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DetailedInstructionStatus11.mmObject();
		}

		@Override
		public List<DetailedInstructionStatus11> getValue(InstructionStatus5Choice obj) {
			return obj.getDetailedInstructionStatus();
		}

		@Override
		public void setValue(InstructionStatus5Choice obj, List<DetailedInstructionStatus11> value) {
			obj.setDetailedInstructionStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.InstructionStatus5Choice.mmGlobalInstructionStatus, com.tools20022.repository.choice.InstructionStatus5Choice.mmDetailedInstructionStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionStatus5Choice";
				definition = "Status applying to the instruction request received.";
				previousVersion_lazy = () -> InstructionStatus3Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InstructionStatus6Choice getGlobalInstructionStatus() {
		return globalInstructionStatus;
	}

	public InstructionStatus5Choice setGlobalInstructionStatus(InstructionStatus6Choice globalInstructionStatus) {
		this.globalInstructionStatus = Objects.requireNonNull(globalInstructionStatus);
		return this;
	}

	public List<DetailedInstructionStatus11> getDetailedInstructionStatus() {
		return detailedInstructionStatus == null ? detailedInstructionStatus = new ArrayList<>() : detailedInstructionStatus;
	}

	public InstructionStatus5Choice setDetailedInstructionStatus(List<DetailedInstructionStatus11> detailedInstructionStatus) {
		this.detailedInstructionStatus = Objects.requireNonNull(detailedInstructionStatus);
		return this;
	}
}