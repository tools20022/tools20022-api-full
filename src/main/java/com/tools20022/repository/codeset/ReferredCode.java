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
import com.tools20022.repository.codeset.ReferredCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates if the investor was referred.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ReferredCode#Referred
 * ReferredCode.Referred}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReferredCode#NotReferred
 * ReferredCode.NotReferred}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ReferredCode#NotKnown
 * ReferredCode.NotKnown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Referred1Code
 * Referred1Code}</li>
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
 * <li>"REFR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReferredCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates if the investor was referred."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReferredCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The investor was referred to the fund by a placement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReferredCode ReferredCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The investor was referred to the fund by a placement agent."</li>
	 * </ul>
	 */
	public static final ReferredCode Referred = new ReferredCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referred";
			definition = "The investor was referred to the fund by a placement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReferredCode.mmObject();
			codeName = "REFR";
		}
	};
	/**
	 * The investor was not referred to the fund by a placement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReferredCode ReferredCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The investor was not referred to the fund by a placement agent."</li>
	 * </ul>
	 */
	public static final ReferredCode NotReferred = new ReferredCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReferred";
			definition = "The investor was not referred to the fund by a placement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReferredCode.mmObject();
			codeName = "NRFR";
		}
	};
	/**
	 * It is not known whether the investor was referred to the fund by a
	 * placement agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReferredCode ReferredCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKNW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotKnown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It is not known whether the investor was referred to the fund by a placement agent."
	 * </li>
	 * </ul>
	 */
	public static final ReferredCode NotKnown = new ReferredCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotKnown";
			definition = "It is not known whether the investor was referred to the fund by a placement agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.ReferredCode.mmObject();
			codeName = "UKNW";
		}
	};
	final static private LinkedHashMap<String, ReferredCode> codesByName = new LinkedHashMap<>();

	protected ReferredCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REFR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReferredCode";
				definition = "Indicates if the investor was referred.";
				derivation_lazy = () -> Arrays.asList(Referred1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReferredCode.Referred, com.tools20022.repository.codeset.ReferredCode.NotReferred, com.tools20022.repository.codeset.ReferredCode.NotKnown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Referred.getCodeName().get(), Referred);
		codesByName.put(NotReferred.getCodeName().get(), NotReferred);
		codesByName.put(NotKnown.getCodeName().get(), NotKnown);
	}

	public static ReferredCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReferredCode[] values() {
		ReferredCode[] values = new ReferredCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReferredCode> {
		@Override
		public ReferredCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReferredCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}