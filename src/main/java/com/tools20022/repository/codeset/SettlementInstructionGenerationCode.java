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
import com.tools20022.repository.codeset.SettlementInstructionGenerationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if the ETC service provider is to generate a settlement instruction
 * or not.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode#InstructionGenerationByETCProvider
 * SettlementInstructionGenerationCode.InstructionGenerationByETCProvider}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionGenerationCode#NotInstructionGenerationByETCProvider
 * SettlementInstructionGenerationCode.NotInstructionGenerationByETCProvider}</li>
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
 * "SettlementInstructionGenerationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if the ETC service provider is to generate a settlement instruction or not."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionGenerationCode extends MMCode {

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
	public static final SettlementInstructionGenerationCode InstructionGenerationByETCProvider = new SettlementInstructionGenerationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionGenerationByETCProvider";
			definition = "Specifies if the ETC service provider is to generate a settlement instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionGenerationCode.mmObject();
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
	public static final SettlementInstructionGenerationCode NotInstructionGenerationByETCProvider = new SettlementInstructionGenerationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInstructionGenerationByETCProvider";
			definition = "Specifies if the ETC service provider is not to generate a settlement instruction where a previous agreement to do so exists.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionGenerationCode.mmObject();
			codeName = "NOGE";
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionGenerationCode> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionGenerationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionGenerationCode";
				definition = "Specifies if the ETC service provider is to generate a settlement instruction or not.";
				derivation_lazy = () -> Arrays.asList(SettlementInstructionGeneration1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionGenerationCode.InstructionGenerationByETCProvider,
						com.tools20022.repository.codeset.SettlementInstructionGenerationCode.NotInstructionGenerationByETCProvider);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstructionGenerationByETCProvider.getCodeName().get(), InstructionGenerationByETCProvider);
		codesByName.put(NotInstructionGenerationByETCProvider.getCodeName().get(), NotInstructionGenerationByETCProvider);
	}

	public static SettlementInstructionGenerationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionGenerationCode[] values() {
		SettlementInstructionGenerationCode[] values = new SettlementInstructionGenerationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionGenerationCode> {
		@Override
		public SettlementInstructionGenerationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionGenerationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}