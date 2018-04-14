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
import com.tools20022.repository.codeset.ERISAEligibility1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies information about ERISA (Eligibility to federal Employee Retirement
 * Income Security Act) eligibility.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code#ERISAEligible
 * ERISAEligibility1Code.ERISAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code#NotERISAEligible
 * ERISAEligibility1Code.NotERISAEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code#ERISAEligibilityUnknown
 * ERISAEligibility1Code.ERISAEligibilityUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ERISAEligibilityCode
 * ERISAEligibilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ERISAEligibility1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies information about ERISA (Eligibility to federal Employee Retirement Income Security Act) eligibility."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ELIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ERISAEligibility1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code
	 * ERISAEligibility1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ERISAEligibility1Code ERISAEligible = new ERISAEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.ERISAEligibility1Code.mmObject();
			codeName = ERISAEligibilityCode.ERISAEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code
	 * ERISAEligibility1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotERISAEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ERISAEligibility1Code NotERISAEligible = new ERISAEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotERISAEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.ERISAEligibility1Code.mmObject();
			codeName = ERISAEligibilityCode.NotERISAEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ERISAEligibility1Code
	 * ERISAEligibility1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERISAEligibilityUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ERISAEligibility1Code ERISAEligibilityUnknown = new ERISAEligibility1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERISAEligibilityUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.ERISAEligibility1Code.mmObject();
			codeName = ERISAEligibilityCode.ERISAEligibilityUnknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ERISAEligibility1Code> codesByName = new LinkedHashMap<>();

	protected ERISAEligibility1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ELIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ERISAEligibility1Code";
				definition = "Specifies information about ERISA (Eligibility to federal Employee Retirement Income Security Act) eligibility.";
				trace_lazy = () -> ERISAEligibilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ERISAEligibility1Code.ERISAEligible, com.tools20022.repository.codeset.ERISAEligibility1Code.NotERISAEligible,
						com.tools20022.repository.codeset.ERISAEligibility1Code.ERISAEligibilityUnknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ERISAEligible.getCodeName().get(), ERISAEligible);
		codesByName.put(NotERISAEligible.getCodeName().get(), NotERISAEligible);
		codesByName.put(ERISAEligibilityUnknown.getCodeName().get(), ERISAEligibilityUnknown);
	}

	public static ERISAEligibility1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ERISAEligibility1Code[] values() {
		ERISAEligibility1Code[] values = new ERISAEligibility1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ERISAEligibility1Code> {
		@Override
		public ERISAEligibility1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ERISAEligibility1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}