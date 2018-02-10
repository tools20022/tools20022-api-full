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
import com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the corporate action instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code#ElectionInstruction
 * DTCCorporateActionInstructionType1Code.ElectionInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code#ProtectInstruction
 * DTCCorporateActionInstructionType1Code.ProtectInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code#CoverProtectSystem
 * DTCCorporateActionInstructionType1Code.CoverProtectSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code#CoverProtectAgent
 * DTCCorporateActionInstructionType1Code.CoverProtectAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionTypeCode
 * DTCCorporateActionInstructionTypeCode}</li>
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
 * "DTCCorporateActionInstructionType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the corporate action instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCorporateActionInstructionType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionInstruction"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType1Code ElectionInstruction = new DTCCorporateActionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.ElectionInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectInstruction"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType1Code ProtectInstruction = new DTCCorporateActionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.ProtectInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectSystem"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType1Code CoverProtectSystem = new DTCCorporateActionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.CoverProtectSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code
	 * DTCCorporateActionInstructionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverProtectAgent"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType1Code CoverProtectAgent = new DTCCorporateActionInstructionType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverProtectAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.CoverProtectAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCorporateActionInstructionType1Code> codesByName = new LinkedHashMap<>();

	protected DTCCorporateActionInstructionType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCorporateActionInstructionType1Code";
				definition = "Specifies the type of the corporate action instruction.";
				trace_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.ElectionInstruction, com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.ProtectInstruction,
						com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.CoverProtectSystem, com.tools20022.repository.codeset.DTCCorporateActionInstructionType1Code.CoverProtectAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ElectionInstruction.getCodeName().get(), ElectionInstruction);
		codesByName.put(ProtectInstruction.getCodeName().get(), ProtectInstruction);
		codesByName.put(CoverProtectSystem.getCodeName().get(), CoverProtectSystem);
		codesByName.put(CoverProtectAgent.getCodeName().get(), CoverProtectAgent);
	}

	public static DTCCorporateActionInstructionType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCorporateActionInstructionType1Code[] values() {
		DTCCorporateActionInstructionType1Code[] values = new DTCCorporateActionInstructionType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCorporateActionInstructionType1Code> {
		@Override
		public DTCCorporateActionInstructionType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCorporateActionInstructionType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}