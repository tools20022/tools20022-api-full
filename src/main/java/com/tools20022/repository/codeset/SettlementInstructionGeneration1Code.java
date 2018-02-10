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
import com.tools20022.repository.codeset.SettlementInstructionGeneration1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Settlement Instruction Generation Code.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGeneration1Code#InstructionGenerationByETCProvider
 * SettlementInstructionGeneration1Code.InstructionGenerationByETCProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGeneration1Code#NotInstructionGenerationByETCProvider
 * SettlementInstructionGeneration1Code.NotInstructionGenerationByETCProvider}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode
 * SettlementInstructionGenerationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * "SettlementInstructionGeneration1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Settlement Instruction Generation Code."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionGeneration1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGeneration1Code
	 * SettlementInstructionGeneration1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionGenerationByETCProvider"</li>
	 * </ul>
	 */
	public static final SettlementInstructionGeneration1Code InstructionGenerationByETCProvider = new SettlementInstructionGeneration1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionGenerationByETCProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionGeneration1Code.mmObject();
			codeName = SettlementInstructionGenerationCode.InstructionGenerationByETCProvider.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGeneration1Code
	 * SettlementInstructionGeneration1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInstructionGenerationByETCProvider"</li>
	 * </ul>
	 */
	public static final SettlementInstructionGeneration1Code NotInstructionGenerationByETCProvider = new SettlementInstructionGeneration1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInstructionGenerationByETCProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionGeneration1Code.mmObject();
			codeName = SettlementInstructionGenerationCode.NotInstructionGenerationByETCProvider.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionGeneration1Code> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionGeneration1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionGeneration1Code";
				definition = "Settlement Instruction Generation Code.";
				trace_lazy = () -> SettlementInstructionGenerationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionGeneration1Code.InstructionGenerationByETCProvider,
						com.tools20022.repository.codeset.SettlementInstructionGeneration1Code.NotInstructionGenerationByETCProvider);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstructionGenerationByETCProvider.getCodeName().get(), InstructionGenerationByETCProvider);
		codesByName.put(NotInstructionGenerationByETCProvider.getCodeName().get(), NotInstructionGenerationByETCProvider);
	}

	public static SettlementInstructionGeneration1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionGeneration1Code[] values() {
		SettlementInstructionGeneration1Code[] values = new SettlementInstructionGeneration1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionGeneration1Code> {
		@Override
		public SettlementInstructionGeneration1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionGeneration1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}