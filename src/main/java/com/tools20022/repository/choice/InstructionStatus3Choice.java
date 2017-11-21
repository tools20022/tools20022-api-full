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
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DetailedInstructionStatus8;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmGlobalInstructionStatus
 * InstructionStatus3Choice.mmGlobalInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice#mmDetailedInstructionStatus
 * InstructionStatus3Choice.mmDetailedInstructionStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
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
 * "InstructionStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status applying to the instruction request received."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.InstructionStatus5Choice
 * InstructionStatus5Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstructionStatus3Choice", propOrder = {"globalInstructionStatus", "detailedInstructionStatus"})
public class InstructionStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected InstructionStatus4Choice globalInstructionStatus;
	/**
	 * Status applying globally to the instruction received. The instruction is
	 * identified by the InstructionIdentification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus4Choice
	 * InstructionStatus4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice
	 * InstructionStatus3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmGlobalInstructionStatus
	 * InstructionStatus5Choice.mmGlobalInstructionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGlobalInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> InstructionStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "GblInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalInstructionStatus";
			definition = "Status applying globally to the instruction received. The instruction is identified by the InstructionIdentification.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatus5Choice.mmGlobalInstructionStatus);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.InstructionStatus4Choice.mmObject();
		}
	};
	protected List<DetailedInstructionStatus8> detailedInstructionStatus;
	/**
	 * Status applying to individual instructions of a MeetingInstruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionStatus8
	 * DetailedInstructionStatus8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus3Choice
	 * InstructionStatus3Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.InstructionStatus5Choice#mmDetailedInstructionStatus
	 * InstructionStatus5Choice.mmDetailedInstructionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> InstructionStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "DtldInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedInstructionStatus";
			definition = "Status applying to individual instructions of a MeetingInstruction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatus5Choice.mmDetailedInstructionStatus);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DetailedInstructionStatus8.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionStatus3Choice.mmGlobalInstructionStatus, InstructionStatus3Choice.mmDetailedInstructionStatus);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionStatus3Choice";
				definition = "Status applying to the instruction request received.";
				nextVersions_lazy = () -> Arrays.asList(InstructionStatus5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GblInstrSts", required = true)
	public InstructionStatus4Choice getGlobalInstructionStatus() {
		return globalInstructionStatus;
	}

	public void setGlobalInstructionStatus(com.tools20022.repository.choice.InstructionStatus4Choice globalInstructionStatus) {
		this.globalInstructionStatus = globalInstructionStatus;
	}

	@XmlElement(name = "DtldInstrSts", required = true)
	public List<DetailedInstructionStatus8> getDetailedInstructionStatus() {
		return detailedInstructionStatus;
	}

	public void setDetailedInstructionStatus(List<DetailedInstructionStatus8> detailedInstructionStatus) {
		this.detailedInstructionStatus = detailedInstructionStatus;
	}
}