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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AgentIdentificationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the agent which will have to process the instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#InstructedAgent
 * AgentIdentificationCode.InstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#IntermediaryAgent1
 * AgentIdentificationCode.IntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#IntermediaryAgent2
 * AgentIdentificationCode.IntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#IntermediaryAgent3
 * AgentIdentificationCode.IntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#InstructingAgent
 * AgentIdentificationCode.InstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#InstructingReimbursementAgent
 * AgentIdentificationCode.InstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#InstructedReimbursementAgent
 * AgentIdentificationCode.InstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#ThirdReimbursementAgent
 * AgentIdentificationCode.ThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AgentIdentificationCode#PreviousInstructingAgent
 * AgentIdentificationCode.PreviousInstructingAgent}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the agent which will have to process the instructions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INDA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AgentIdentificationCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the instructed agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode InstructedAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InstructedAgent";
			definition = "Instruction(s) intended for the instructed agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the first intermediary agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode IntermediaryAgent1 = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent1";
			definition = "Instruction(s) intended for the first intermediary agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the second intermediary agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode IntermediaryAgent2 = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent2";
			definition = "Instruction(s) intended for the second intermediary agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the third intermediary agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode IntermediaryAgent3 = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "IntermediaryAgent3";
			definition = "Instruction(s) intended for the third intermediary agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the instructing agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode InstructingAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InstructingAgent";
			definition = "Instruction(s) intended for the instructing agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the instructing reimbursement agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode InstructingReimbursementAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InstructingReimbursementAgent";
			definition = "Instruction(s) intended for the instructing reimbursement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the instructed reimbursement agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode InstructedReimbursementAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "InstructedReimbursementAgent";
			definition = "Instruction(s) intended for the instructed reimbursement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction(s) intended for the third reimbursement agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode ThirdReimbursementAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "ThirdReimbursementAgent";
			definition = "Instruction(s) intended for the third reimbursement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction(s) intended for the previous agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * </ul>
	 */
	public static final AgentIdentificationCode PreviousInstructingAgent = new AgentIdentificationCode() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PreviousInstructingAgent";
			definition = "Instruction(s) intended for the previous agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.AgentIdentificationCode.mmObject();
			codeName = "PRVA";
		}
	};
	final static private LinkedHashMap<String, AgentIdentificationCode> codesByName = new LinkedHashMap<>();

	protected AgentIdentificationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INDA");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "AgentIdentificationCode";
				definition = "Identifies the agent which will have to process the instructions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AgentIdentificationCode.InstructedAgent, com.tools20022.repository.codeset.AgentIdentificationCode.IntermediaryAgent1,
						com.tools20022.repository.codeset.AgentIdentificationCode.IntermediaryAgent2, com.tools20022.repository.codeset.AgentIdentificationCode.IntermediaryAgent3,
						com.tools20022.repository.codeset.AgentIdentificationCode.InstructingAgent, com.tools20022.repository.codeset.AgentIdentificationCode.InstructingReimbursementAgent,
						com.tools20022.repository.codeset.AgentIdentificationCode.InstructedReimbursementAgent, com.tools20022.repository.codeset.AgentIdentificationCode.ThirdReimbursementAgent,
						com.tools20022.repository.codeset.AgentIdentificationCode.PreviousInstructingAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstructedAgent.getCodeName().get(), InstructedAgent);
		codesByName.put(IntermediaryAgent1.getCodeName().get(), IntermediaryAgent1);
		codesByName.put(IntermediaryAgent2.getCodeName().get(), IntermediaryAgent2);
		codesByName.put(IntermediaryAgent3.getCodeName().get(), IntermediaryAgent3);
		codesByName.put(InstructingAgent.getCodeName().get(), InstructingAgent);
		codesByName.put(InstructingReimbursementAgent.getCodeName().get(), InstructingReimbursementAgent);
		codesByName.put(InstructedReimbursementAgent.getCodeName().get(), InstructedReimbursementAgent);
		codesByName.put(ThirdReimbursementAgent.getCodeName().get(), ThirdReimbursementAgent);
		codesByName.put(PreviousInstructingAgent.getCodeName().get(), PreviousInstructingAgent);
	}

	public static AgentIdentificationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AgentIdentificationCode[] values() {
		AgentIdentificationCode[] values = new AgentIdentificationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AgentIdentificationCode> {
		@Override
		public AgentIdentificationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AgentIdentificationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}