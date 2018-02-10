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
import com.tools20022.repository.codeset.Referred1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.Referred1Code#Referred
 * Referred1Code.Referred}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Referred1Code#NotReferred
 * Referred1Code.NotReferred}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Referred1Code#NotKnown
 * Referred1Code.NotKnown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ReferredCode ReferredCode}</li>
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
 * "Referred1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates if the investor was referred."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Referred1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Referred1Code
	 * Referred1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Referred"</li>
	 * </ul>
	 */
	public static final Referred1Code Referred = new Referred1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Referred";
			owner_lazy = () -> com.tools20022.repository.codeset.Referred1Code.mmObject();
			codeName = ReferredCode.Referred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Referred1Code
	 * Referred1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReferred"</li>
	 * </ul>
	 */
	public static final Referred1Code NotReferred = new Referred1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReferred";
			owner_lazy = () -> com.tools20022.repository.codeset.Referred1Code.mmObject();
			codeName = ReferredCode.NotReferred.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Referred1Code
	 * Referred1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotKnown"</li>
	 * </ul>
	 */
	public static final Referred1Code NotKnown = new Referred1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotKnown";
			owner_lazy = () -> com.tools20022.repository.codeset.Referred1Code.mmObject();
			codeName = ReferredCode.NotKnown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Referred1Code> codesByName = new LinkedHashMap<>();

	protected Referred1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("REFR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Referred1Code";
				definition = "Indicates if the investor was referred.";
				trace_lazy = () -> ReferredCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Referred1Code.Referred, com.tools20022.repository.codeset.Referred1Code.NotReferred, com.tools20022.repository.codeset.Referred1Code.NotKnown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Referred.getCodeName().get(), Referred);
		codesByName.put(NotReferred.getCodeName().get(), NotReferred);
		codesByName.put(NotKnown.getCodeName().get(), NotKnown);
	}

	public static Referred1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Referred1Code[] values() {
		Referred1Code[] values = new Referred1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Referred1Code> {
		@Override
		public Referred1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Referred1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}