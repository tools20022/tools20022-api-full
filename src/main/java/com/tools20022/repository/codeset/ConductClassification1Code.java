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
import com.tools20022.repository.codeset.ConductClassification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the classification of the conduct.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code#NonStandard
 * ConductClassification1Code.NonStandard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code#Reluctant
 * ConductClassification1Code.Reluctant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code#Standard
 * ConductClassification1Code.Standard}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ConductClassificationCode
 * ConductClassificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NSTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConductClassification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the classification of the conduct."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ConductClassification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code
	 * ConductClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandard"</li>
	 * </ul>
	 */
	public static final ConductClassification1Code NonStandard = new ConductClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandard";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassification1Code.mmObject();
			codeName = ConductClassificationCode.NonStandard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code
	 * ConductClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reluctant"</li>
	 * </ul>
	 */
	public static final ConductClassification1Code Reluctant = new ConductClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reluctant";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassification1Code.mmObject();
			codeName = ConductClassificationCode.Reluctant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ConductClassification1Code
	 * ConductClassification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * </ul>
	 */
	public static final ConductClassification1Code Standard = new ConductClassification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			owner_lazy = () -> com.tools20022.repository.codeset.ConductClassification1Code.mmObject();
			codeName = ConductClassificationCode.Standard.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ConductClassification1Code> codesByName = new LinkedHashMap<>();

	protected ConductClassification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NSTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ConductClassification1Code";
				definition = "Specifies the classification of the conduct.";
				trace_lazy = () -> ConductClassificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ConductClassification1Code.NonStandard, com.tools20022.repository.codeset.ConductClassification1Code.Reluctant,
						com.tools20022.repository.codeset.ConductClassification1Code.Standard);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NonStandard.getCodeName().get(), NonStandard);
		codesByName.put(Reluctant.getCodeName().get(), Reluctant);
		codesByName.put(Standard.getCodeName().get(), Standard);
	}

	public static ConductClassification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ConductClassification1Code[] values() {
		ConductClassification1Code[] values = new ConductClassification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ConductClassification1Code> {
		@Override
		public ConductClassification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ConductClassification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}