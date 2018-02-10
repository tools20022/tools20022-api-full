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
import com.tools20022.repository.codeset.Instruction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies further instructions concerning the processing of a payment
 * instruction, provided by the sending clearing agent to the next agent(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Instruction1Code#PayTheBeneficiary
 * Instruction1Code.PayTheBeneficiary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction1Code#TimeTill
 * Instruction1Code.TimeTill}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Instruction1Code#TimeFrom
 * Instruction1Code.TimeFrom}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionCode
 * InstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PBEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Instruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Instruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayTheBeneficiary"</li>
	 * </ul>
	 */
	public static final Instruction1Code PayTheBeneficiary = new Instruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayTheBeneficiary";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction1Code.mmObject();
			codeName = InstructionCode.PayTheBeneficiary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeTill"</li>
	 * </ul>
	 */
	public static final Instruction1Code TimeTill = new Instruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeTill";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction1Code.mmObject();
			codeName = InstructionCode.TimeTill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeFrom"</li>
	 * </ul>
	 */
	public static final Instruction1Code TimeFrom = new Instruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeFrom";
			owner_lazy = () -> com.tools20022.repository.codeset.Instruction1Code.mmObject();
			codeName = InstructionCode.TimeFrom.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Instruction1Code> codesByName = new LinkedHashMap<>();

	protected Instruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PBEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Instruction1Code";
				definition = "Specifies further instructions concerning the processing of a payment instruction, provided by the sending clearing agent to the next agent(s).";
				trace_lazy = () -> InstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Instruction1Code.PayTheBeneficiary, com.tools20022.repository.codeset.Instruction1Code.TimeTill, com.tools20022.repository.codeset.Instruction1Code.TimeFrom);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PayTheBeneficiary.getCodeName().get(), PayTheBeneficiary);
		codesByName.put(TimeTill.getCodeName().get(), TimeTill);
		codesByName.put(TimeFrom.getCodeName().get(), TimeFrom);
	}

	public static Instruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Instruction1Code[] values() {
		Instruction1Code[] values = new Instruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Instruction1Code> {
		@Override
		public Instruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Instruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}