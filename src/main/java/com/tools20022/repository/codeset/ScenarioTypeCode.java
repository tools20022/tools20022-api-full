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
import com.tools20022.repository.codeset.ScenarioTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of scenario based on how the risk factors moves for that scenario were
 * conceived.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ScenarioTypeCode#Historical
 * ScenarioTypeCode.Historical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ScenarioTypeCode#Hypothetical
 * ScenarioTypeCode.Hypothetical}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ScenarioType1Code
 * ScenarioType1Code}</li>
 * </ul>
 * </li>
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
 * "ScenarioTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Type of scenario based on how the risk factors moves for that scenario were conceived."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ScenarioTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Scenario that replays an event that occurred in the past, including
	 * antithetic historical scenarios.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ScenarioTypeCode
	 * ScenarioTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Historical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scenario that replays an event that occurred in the past, including antithetic historical scenarios."
	 * </li>
	 * </ul>
	 */
	public static final ScenarioTypeCode Historical = new ScenarioTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Historical";
			definition = "Scenario that replays an event that occurred in the past, including antithetic historical scenarios.";
			owner_lazy = () -> com.tools20022.repository.codeset.ScenarioTypeCode.mmObject();
			codeName = "HIST";
		}
	};
	/**
	 * Scenario that is defined by a hypothetical or theoretical event that may
	 * happen in the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ScenarioTypeCode
	 * ScenarioTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HYPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hypothetical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scenario that is defined by a hypothetical or theoretical event that may happen in the future."
	 * </li>
	 * </ul>
	 */
	public static final ScenarioTypeCode Hypothetical = new ScenarioTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hypothetical";
			definition = "Scenario that is defined by a hypothetical or theoretical event that may happen in the future.";
			owner_lazy = () -> com.tools20022.repository.codeset.ScenarioTypeCode.mmObject();
			codeName = "HYPT";
		}
	};
	final static private LinkedHashMap<String, ScenarioTypeCode> codesByName = new LinkedHashMap<>();

	protected ScenarioTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ScenarioTypeCode";
				definition = "Type of scenario based on how the risk factors moves for that scenario were conceived.";
				derivation_lazy = () -> Arrays.asList(ScenarioType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ScenarioTypeCode.Historical, com.tools20022.repository.codeset.ScenarioTypeCode.Hypothetical);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Historical.getCodeName().get(), Historical);
		codesByName.put(Hypothetical.getCodeName().get(), Hypothetical);
	}

	public static ScenarioTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ScenarioTypeCode[] values() {
		ScenarioTypeCode[] values = new ScenarioTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ScenarioTypeCode> {
		@Override
		public ScenarioTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ScenarioTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}