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
import com.tools20022.repository.codeset.Insurance1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of insurance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Insurance1Code#LifeInsurance
 * Insurance1Code.LifeInsurance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Insurance1Code#PermanentDisabilityInsurance
 * Insurance1Code.PermanentDisabilityInsurance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InsuranceCode InsuranceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LIFE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Insurance1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of insurance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Insurance1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Insurance1Code
	 * Insurance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeInsurance"</li>
	 * </ul>
	 */
	public static final Insurance1Code LifeInsurance = new Insurance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeInsurance";
			owner_lazy = () -> com.tools20022.repository.codeset.Insurance1Code.mmObject();
			codeName = InsuranceCode.LifeInsurance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Insurance1Code
	 * Insurance1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PermanentDisabilityInsurance"</li>
	 * </ul>
	 */
	public static final Insurance1Code PermanentDisabilityInsurance = new Insurance1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PermanentDisabilityInsurance";
			owner_lazy = () -> com.tools20022.repository.codeset.Insurance1Code.mmObject();
			codeName = InsuranceCode.PermanentDisabilityInsurance.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Insurance1Code> codesByName = new LinkedHashMap<>();

	protected Insurance1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LIFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Insurance1Code";
				definition = "Specifies the type of insurance.";
				trace_lazy = () -> InsuranceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Insurance1Code.LifeInsurance, com.tools20022.repository.codeset.Insurance1Code.PermanentDisabilityInsurance);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LifeInsurance.getCodeName().get(), LifeInsurance);
		codesByName.put(PermanentDisabilityInsurance.getCodeName().get(), PermanentDisabilityInsurance);
	}

	public static Insurance1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Insurance1Code[] values() {
		Insurance1Code[] values = new Insurance1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Insurance1Code> {
		@Override
		public Insurance1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Insurance1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}