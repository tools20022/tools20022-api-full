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
import com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the seniority type of a specific debt instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code#SubordinatedDebt
 * DebtInstrumentSeniorityType2Code.SubordinatedDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code#SeniorDebt
 * DebtInstrumentSeniorityType2Code.SeniorDebt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code#Other
 * DebtInstrumentSeniorityType2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityTypeCode
 * DebtInstrumentSeniorityTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DebtInstrumentSeniorityType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the seniority type of a specific debt instrument."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DebtInstrumentSeniorityType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code
	 * DebtInstrumentSeniorityType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubordinatedDebt"</li>
	 * </ul>
	 */
	public static final DebtInstrumentSeniorityType2Code SubordinatedDebt = new DebtInstrumentSeniorityType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubordinatedDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.mmObject();
			codeName = DebtInstrumentSeniorityTypeCode.SubordinatedDebt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code
	 * DebtInstrumentSeniorityType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeniorDebt"</li>
	 * </ul>
	 */
	public static final DebtInstrumentSeniorityType2Code SeniorDebt = new DebtInstrumentSeniorityType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorDebt";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.mmObject();
			codeName = DebtInstrumentSeniorityTypeCode.SeniorDebt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code
	 * DebtInstrumentSeniorityType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DebtInstrumentSeniorityType2Code Other = new DebtInstrumentSeniorityType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.mmObject();
			codeName = DebtInstrumentSeniorityTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DebtInstrumentSeniorityType2Code> codesByName = new LinkedHashMap<>();

	protected DebtInstrumentSeniorityType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DebtInstrumentSeniorityType2Code";
				definition = "Specifies the seniority type of a specific debt instrument.";
				trace_lazy = () -> DebtInstrumentSeniorityTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.SubordinatedDebt, com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.SeniorDebt,
						com.tools20022.repository.codeset.DebtInstrumentSeniorityType2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SubordinatedDebt.getCodeName().get(), SubordinatedDebt);
		codesByName.put(SeniorDebt.getCodeName().get(), SeniorDebt);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DebtInstrumentSeniorityType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DebtInstrumentSeniorityType2Code[] values() {
		DebtInstrumentSeniorityType2Code[] values = new DebtInstrumentSeniorityType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DebtInstrumentSeniorityType2Code> {
		@Override
		public DebtInstrumentSeniorityType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DebtInstrumentSeniorityType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}