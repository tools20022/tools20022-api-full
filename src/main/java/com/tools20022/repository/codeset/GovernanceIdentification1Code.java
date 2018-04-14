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
import com.tools20022.repository.codeset.GovernanceIdentification1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the identification of the rules and laws governing the undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code#InternationalStandbyPractices
 * GovernanceIdentification1Code.InternationalStandbyPractices}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code#None
 * GovernanceIdentification1Code.None}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code#UniformCustomsAndPractice
 * GovernanceIdentification1Code.UniformCustomsAndPractice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code#UniformRulesForDemandGuarantees
 * GovernanceIdentification1Code.UniformRulesForDemandGuarantees}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentificationCode
 * GovernanceIdentificationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GovernanceIdentification1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the identification of the rules and laws governing the undertaking."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ISPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class GovernanceIdentification1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code
	 * GovernanceIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternationalStandbyPractices"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GovernanceIdentification1Code InternationalStandbyPractices = new GovernanceIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternationalStandbyPractices";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentification1Code.mmObject();
			codeName = GovernanceIdentificationCode.InternationalStandbyPractices.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code
	 * GovernanceIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "None"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GovernanceIdentification1Code None = new GovernanceIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "None";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentification1Code.mmObject();
			codeName = GovernanceIdentificationCode.None.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code
	 * GovernanceIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformCustomsAndPractice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GovernanceIdentification1Code UniformCustomsAndPractice = new GovernanceIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformCustomsAndPractice";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentification1Code.mmObject();
			codeName = GovernanceIdentificationCode.UniformCustomsAndPractice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.GovernanceIdentification1Code
	 * GovernanceIdentification1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniformRulesForDemandGuarantees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final GovernanceIdentification1Code UniformRulesForDemandGuarantees = new GovernanceIdentification1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniformRulesForDemandGuarantees";
			owner_lazy = () -> com.tools20022.repository.codeset.GovernanceIdentification1Code.mmObject();
			codeName = GovernanceIdentificationCode.UniformRulesForDemandGuarantees.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, GovernanceIdentification1Code> codesByName = new LinkedHashMap<>();

	protected GovernanceIdentification1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ISPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "GovernanceIdentification1Code";
				definition = "Specifies the identification of the rules and laws governing the undertaking.";
				trace_lazy = () -> GovernanceIdentificationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.GovernanceIdentification1Code.InternationalStandbyPractices, com.tools20022.repository.codeset.GovernanceIdentification1Code.None,
						com.tools20022.repository.codeset.GovernanceIdentification1Code.UniformCustomsAndPractice, com.tools20022.repository.codeset.GovernanceIdentification1Code.UniformRulesForDemandGuarantees);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InternationalStandbyPractices.getCodeName().get(), InternationalStandbyPractices);
		codesByName.put(None.getCodeName().get(), None);
		codesByName.put(UniformCustomsAndPractice.getCodeName().get(), UniformCustomsAndPractice);
		codesByName.put(UniformRulesForDemandGuarantees.getCodeName().get(), UniformRulesForDemandGuarantees);
	}

	public static GovernanceIdentification1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static GovernanceIdentification1Code[] values() {
		GovernanceIdentification1Code[] values = new GovernanceIdentification1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, GovernanceIdentification1Code> {
		@Override
		public GovernanceIdentification1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(GovernanceIdentification1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}