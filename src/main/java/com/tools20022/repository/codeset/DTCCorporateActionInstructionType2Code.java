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
import com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code#InstructionWithdrawal
 * DTCCorporateActionInstructionType2Code.InstructionWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code#ProtectWithdrawal
 * DTCCorporateActionInstructionType2Code.ProtectWithdrawal}</li>
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
 * <li>"WIIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCorporateActionInstructionType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the corporate action instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCorporateActionInstructionType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code
	 * DTCCorporateActionInstructionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType2Code InstructionWithdrawal = new DTCCorporateActionInstructionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.InstructionWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code
	 * DTCCorporateActionInstructionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCCorporateActionInstructionType2Code ProtectWithdrawal = new DTCCorporateActionInstructionType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code.mmObject();
			codeName = DTCCorporateActionInstructionTypeCode.ProtectWithdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCorporateActionInstructionType2Code> codesByName = new LinkedHashMap<>();

	protected DTCCorporateActionInstructionType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WIIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCorporateActionInstructionType2Code";
				definition = "Specifies the type of the corporate action instruction.";
				trace_lazy = () -> DTCCorporateActionInstructionTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code.InstructionWithdrawal, com.tools20022.repository.codeset.DTCCorporateActionInstructionType2Code.ProtectWithdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InstructionWithdrawal.getCodeName().get(), InstructionWithdrawal);
		codesByName.put(ProtectWithdrawal.getCodeName().get(), ProtectWithdrawal);
	}

	public static DTCCorporateActionInstructionType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCorporateActionInstructionType2Code[] values() {
		DTCCorporateActionInstructionType2Code[] values = new DTCCorporateActionInstructionType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCorporateActionInstructionType2Code> {
		@Override
		public DTCCorporateActionInstructionType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCorporateActionInstructionType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}