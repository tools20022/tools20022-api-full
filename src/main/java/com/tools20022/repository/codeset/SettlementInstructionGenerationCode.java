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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies if the ETC service provider is to generate a settlement instruction
 * or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode#mmInstructionGenerationByETCProvider
 * SettlementInstructionGenerationCode.mmInstructionGenerationByETCProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode#mmNotInstructionGenerationByETCProvider
 * SettlementInstructionGenerationCode.mmNotInstructionGenerationByETCProvider}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGeneration1Code
 * SettlementInstructionGeneration1Code}</li>
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
 * <li>"GENS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInstructionGenerationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the ETC service provider is to generate a settlement instruction or not."
 * </li>
 * </ul>
 */
public class SettlementInstructionGenerationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies if the ETC service provider is to generate a settlement
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode
	 * SettlementInstructionGenerationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GENS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionGenerationByETCProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the ETC service provider is to generate a settlement instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstructionGenerationByETCProvider = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionGenerationByETCProvider";
			definition = "Specifies if the ETC service provider is to generate a settlement instruction.";
			owner_lazy = () -> SettlementInstructionGenerationCode.mmObject();
			codeName = "GENS";
		}
	};
	/**
	 * Specifies if the ETC service provider is not to generate a settlement
	 * instruction where a previous agreement to do so exists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode
	 * SettlementInstructionGenerationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInstructionGenerationByETCProvider"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the ETC service provider is not to generate a settlement instruction where a previous agreement to do so exists."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotInstructionGenerationByETCProvider = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInstructionGenerationByETCProvider";
			definition = "Specifies if the ETC service provider is not to generate a settlement instruction where a previous agreement to do so exists.";
			owner_lazy = () -> SettlementInstructionGenerationCode.mmObject();
			codeName = "NOGE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("GENS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionGenerationCode";
				definition = "Specifies if the ETC service provider is to generate a settlement instruction or not.";
				code_lazy = () -> Arrays.asList(SettlementInstructionGenerationCode.mmInstructionGenerationByETCProvider, SettlementInstructionGenerationCode.mmNotInstructionGenerationByETCProvider);
				derivation_lazy = () -> Arrays.asList(SettlementInstructionGeneration1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}