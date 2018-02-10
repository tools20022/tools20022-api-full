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
import com.tools20022.repository.codeset.Standardisation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the terms of the security (underlying instruments,
 * expiration date, contract size) are defined according to the exchange
 * specifications or whether they can be user defined.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code#Flexible
 * Standardisation1Code.Flexible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code#NonStandardised
 * Standardisation1Code.NonStandardised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code#Standardised
 * Standardisation1Code.Standardised}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StandardisationCode
 * StandardisationCode}</li>
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
 * "Standardisation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Standardisation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code
	 * Standardisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Flexible"</li>
	 * </ul>
	 */
	public static final Standardisation1Code Flexible = new Standardisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Flexible";
			owner_lazy = () -> com.tools20022.repository.codeset.Standardisation1Code.mmObject();
			codeName = StandardisationCode.Flexible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code
	 * Standardisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardised"</li>
	 * </ul>
	 */
	public static final Standardisation1Code NonStandardised = new Standardisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardised";
			owner_lazy = () -> com.tools20022.repository.codeset.Standardisation1Code.mmObject();
			codeName = StandardisationCode.NonStandardised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Standardisation1Code
	 * Standardisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standardised"</li>
	 * </ul>
	 */
	public static final Standardisation1Code Standardised = new Standardisation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standardised";
			owner_lazy = () -> com.tools20022.repository.codeset.Standardisation1Code.mmObject();
			codeName = StandardisationCode.Standardised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Standardisation1Code> codesByName = new LinkedHashMap<>();

	protected Standardisation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Standardisation1Code";
				definition = "Specifies whether the terms of the security (underlying instruments, expiration date, contract size) are defined according to the exchange specifications or whether they can be user defined.";
				trace_lazy = () -> StandardisationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Standardisation1Code.Flexible, com.tools20022.repository.codeset.Standardisation1Code.NonStandardised,
						com.tools20022.repository.codeset.Standardisation1Code.Standardised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Flexible.getCodeName().get(), Flexible);
		codesByName.put(NonStandardised.getCodeName().get(), NonStandardised);
		codesByName.put(Standardised.getCodeName().get(), Standardised);
	}

	public static Standardisation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Standardisation1Code[] values() {
		Standardisation1Code[] values = new Standardisation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Standardisation1Code> {
		@Override
		public Standardisation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Standardisation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}