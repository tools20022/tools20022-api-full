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
 * Specifies the type of the corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#ElectionInstruction
 * DTCCorporateActionInstructionTypeCode.ElectionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#ProtectInstruction
 * DTCCorporateActionInstructionTypeCode.ProtectInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#InstructionWithdrawal
 * DTCCorporateActionInstructionTypeCode.InstructionWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#ProtectWithdrawal
 * DTCCorporateActionInstructionTypeCode.ProtectWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#CoverProtectSystem
 * DTCCorporateActionInstructionTypeCode.CoverProtectSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#CoverProtectAgent
 * DTCCorporateActionInstructionTypeCode.CoverProtectAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
 * DTCCorporateActionInstructionType1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code
 * DTCCorporateActionInstructionType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ELCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCorporateActionInstructionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the corporate action instruction."</li>
 * </ul>
 */
public class DTCCorporateActionInstructionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction on a option in corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction on a option in corporate action."</li>
	 * </ul>
	 */
	public static final MMCode ElectionInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionInstruction";
			definition = "Instruction on a option in corporate action.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "ELCT";
		}
	};
	/**
	 * Instruction for a protect on a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction for a protect on a corporate action."</li>
	 * </ul>
	 */
	public static final MMCode ProtectInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectInstruction";
			definition = "Instruction for a protect on a corporate action.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "PRTC";
		}
	};
	/**
	 * Withdrawal of previously submitted instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal of previously submitted instruction."</li>
	 * </ul>
	 */
	public static final MMCode InstructionWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionWithdrawal";
			definition = "Withdrawal of previously submitted instruction.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "WIIN";
		}
	};
	/**
	 * Withdrawal of a previously submitted protect instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal of a previously submitted protect instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ProtectWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectWithdrawal";
			definition = "Withdrawal of a previously submitted protect instruction.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "WIPR";
		}
	};
	/**
	 * Instruction on covering a protect at the service provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction on covering a protect at the service provider."</li>
	 * </ul>
	 */
	public static final MMCode CoverProtectSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectSystem";
			definition = "Instruction on covering a protect at the service provider.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "CPSY";
		}
	};
	/**
	 * Instruction on covering a protect at the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
	 * DTCCorporateActionInstructionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction on covering a protect at the agent."</li>
	 * </ul>
	 */
	public static final MMCode CoverProtectAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectAgent";
			definition = "Instruction on covering a protect at the agent.";
			owner_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
			codeName = "CPAG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ELCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCCorporateActionInstructionTypeCode";
				definition = "Specifies the type of the corporate action instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.ElectionInstruction, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.ProtectInstruction,
						com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.InstructionWithdrawal, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.ProtectWithdrawal,
						com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.CoverProtectSystem, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.CoverProtectAgent);
				derivation_lazy = () -> Arrays.asList(DTCCorporateActionInstructionType1Code.mmObject(), DTCCorporateActionInstructionType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}