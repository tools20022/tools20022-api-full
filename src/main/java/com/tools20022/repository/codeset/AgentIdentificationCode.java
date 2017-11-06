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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the agent which will have to process the instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmInstructedAgent
 * AgentIdentificationCode.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmIntermediaryAgent1
 * AgentIdentificationCode.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmIntermediaryAgent2
 * AgentIdentificationCode.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmIntermediaryAgent3
 * AgentIdentificationCode.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmInstructingAgent
 * AgentIdentificationCode.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmInstructingReimbursementAgent
 * AgentIdentificationCode.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmInstructedReimbursementAgent
 * AgentIdentificationCode.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmThirdReimbursementAgent
 * AgentIdentificationCode.mmThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#mmPreviousInstructingAgent
 * AgentIdentificationCode.mmPreviousInstructingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the agent which will have to process the instructions."</li>
 * </ul>
 */
public class AgentIdentificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction(s) intended for the instructed agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the instructed agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInstructedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InstructedAgent";
			definition = "Instruction(s) intended for the instructed agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "INDA";
		}
	};
	/**
	 * Instruction(s) intended for the first intermediary agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INT1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the first intermediary agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntermediaryAgent1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent1";
			definition = "Instruction(s) intended for the first intermediary agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "INT1";
		}
	};
	/**
	 * Instruction(s) intended for the second intermediary agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INT2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the second intermediary agent."</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediaryAgent2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent2";
			definition = "Instruction(s) intended for the second intermediary agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "INT2";
		}
	};
	/**
	 * Instruction(s) intended for the third intermediary agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INT3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the third intermediary agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIntermediaryAgent3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent3";
			definition = "Instruction(s) intended for the third intermediary agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "INT3";
		}
	};
	/**
	 * Instruction(s) intended for the instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the instructing agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInstructingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InstructingAgent";
			definition = "Instruction(s) intended for the instructing agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "INGA";
		}
	};
	/**
	 * Instruction(s) intended for the instructing reimbursement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IGRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the instructing reimbursement agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInstructingReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InstructingReimbursementAgent";
			definition = "Instruction(s) intended for the instructing reimbursement agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "IGRA";
		}
	};
	/**
	 * Instruction(s) intended for the instructed reimbursement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the instructed reimbursement agent."</li>
	 * </ul>
	 */
	public static final MMCode mmInstructedReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "InstructedReimbursementAgent";
			definition = "Instruction(s) intended for the instructed reimbursement agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "IDRA";
		}
	};
	/**
	 * Instruction(s) intended for the third reimbursement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the third reimbursement agent."</li>
	 * </ul>
	 */
	public static final MMCode mmThirdReimbursementAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "ThirdReimbursementAgent";
			definition = "Instruction(s) intended for the third reimbursement agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "THRA";
		}
	};
	/**
	 * Instruction(s) intended for the previous agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode
	 * AgentIdentificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the previous agent."</li>
	 * </ul>
	 */
	public static final MMCode mmPreviousInstructingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
			name = "PreviousInstructingAgent";
			definition = "Instruction(s) intended for the previous agent.";
			owner_lazy = () -> AgentIdentificationCode.mmObject();
			codeName = "PRVA";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("INDA");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				name = "AgentIdentificationCode";
				definition = "Identifies the agent which will have to process the instructions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgentIdentificationCode.mmInstructedAgent, com.tools20022.repository.codeset.AgentIdentificationCode.mmIntermediaryAgent1,
						com.tools20022.repository.codeset.AgentIdentificationCode.mmIntermediaryAgent2, com.tools20022.repository.codeset.AgentIdentificationCode.mmIntermediaryAgent3,
						com.tools20022.repository.codeset.AgentIdentificationCode.mmInstructingAgent, com.tools20022.repository.codeset.AgentIdentificationCode.mmInstructingReimbursementAgent,
						com.tools20022.repository.codeset.AgentIdentificationCode.mmInstructedReimbursementAgent, com.tools20022.repository.codeset.AgentIdentificationCode.mmThirdReimbursementAgent,
						com.tools20022.repository.codeset.AgentIdentificationCode.mmPreviousInstructingAgent);
			}
		});
		return mmObject_lazy.get();
	}
}