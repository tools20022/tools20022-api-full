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
import com.tools20022.repository.entity.VoteInstructionRequest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Vote1;
import com.tools20022.repository.msg.Vote3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Determines how the voting instructions are specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteChoice#mmVoteInstruction
 * VoteChoice.mmVoteInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.VoteChoice#mmGlobalVoteInstruction
 * VoteChoice.mmGlobalVoteInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.VoteInstructionRequest
 * VoteInstructionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VoteChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Determines how the voting instructions are specified."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "VoteChoice", propOrder = {"voteInstruction", "globalVoteInstruction"})
public class VoteChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Vote1> voteInstruction;
	/**
	 * Instruction specifying the instructed quantity of voting rights per
	 * resolution. Split votes can be indicated. If only one type of decision is
	 * indicated, the number of votes cast must not be adjusted if the position
	 * of the voting party increases.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vote1 Vote1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmVotePerResolution
	 * VoteInstructionRequest.mmVotePerResolution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.VoteChoice VoteChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction specifying the instructed quantity of voting rights per resolution. Split votes can be indicated. If only one type of decision is indicated, the number of votes cast must not be adjusted if the position of the voting party increases."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVoteInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmVotePerResolution;
			componentContext_lazy = () -> VoteChoice.mmObject();
			isDerived = false;
			xmlTag = "VoteInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstruction";
			definition = "Instruction specifying the instructed quantity of voting rights per resolution. Split votes can be indicated. If only one type of decision is indicated, the number of votes cast must not be adjusted if the position of the voting party increases.";
			maxOccurs = 200;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Vote1.mmObject();
		}
	};
	protected List<Vote3> globalVoteInstruction;
	/**
	 * Instruction specifiying a vote instruction per resolution for the entire
	 * entitlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Vote3 Vote3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.VoteInstructionRequest#mmGlobalVoteInstruction
	 * VoteInstructionRequest.mmGlobalVoteInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.VoteChoice VoteChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblVoteInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalVoteInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction specifiying a vote instruction per resolution for the entire entitlement. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGlobalVoteInstruction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> VoteInstructionRequest.mmGlobalVoteInstruction;
			componentContext_lazy = () -> VoteChoice.mmObject();
			isDerived = false;
			xmlTag = "GblVoteInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalVoteInstruction";
			definition = "Instruction specifiying a vote instruction per resolution for the entire entitlement. ";
			maxOccurs = 200;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Vote3.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(VoteChoice.mmVoteInstruction, VoteChoice.mmGlobalVoteInstruction);
				trace_lazy = () -> VoteInstructionRequest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "VoteChoice";
				definition = "Determines how the voting instructions are specified.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "VoteInstr", required = true)
	public List<Vote1> getVoteInstruction() {
		return voteInstruction;
	}

	public void setVoteInstruction(List<Vote1> voteInstruction) {
		this.voteInstruction = voteInstruction;
	}

	@XmlElement(name = "GblVoteInstr", required = true)
	public List<Vote3> getGlobalVoteInstruction() {
		return globalVoteInstruction;
	}

	public void setGlobalVoteInstruction(List<Vote3> globalVoteInstruction) {
		this.globalVoteInstruction = globalVoteInstruction;
	}
}