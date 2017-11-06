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
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmElectionInstruction
 * DTCCorporateActionInstructionTypeCode.mmElectionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmProtectInstruction
 * DTCCorporateActionInstructionTypeCode.mmProtectInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmInstructionWithdrawal
 * DTCCorporateActionInstructionTypeCode.mmInstructionWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmProtectWithdrawal
 * DTCCorporateActionInstructionTypeCode.mmProtectWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmCoverProtectSystem
 * DTCCorporateActionInstructionTypeCode.mmCoverProtectSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode#mmCoverProtectAgent
 * DTCCorporateActionInstructionTypeCode.mmCoverProtectAgent}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMCode mmElectionInstruction = new MMCode() {
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
	public static final MMCode mmProtectInstruction = new MMCode() {
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
	public static final MMCode mmInstructionWithdrawal = new MMCode() {
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
	public static final MMCode mmProtectWithdrawal = new MMCode() {
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
	public static final MMCode mmCoverProtectSystem = new MMCode() {
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
	public static final MMCode mmCoverProtectAgent = new MMCode() {
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
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ELCT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCCorporateActionInstructionTypeCode";
				definition = "Specifies the type of the corporate action instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmElectionInstruction, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmProtectInstruction,
						com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmInstructionWithdrawal, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmProtectWithdrawal,
						com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmCoverProtectSystem, com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode.mmCoverProtectAgent);
				derivation_lazy = () -> Arrays.asList(DTCCorporateActionInstructionType1Code.mmObject(), DTCCorporateActionInstructionType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}