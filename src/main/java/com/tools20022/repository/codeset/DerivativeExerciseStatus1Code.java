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
import com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the exercise status of the derivative products.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code#Exercised
 * DerivativeExerciseStatus1Code.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code#Expired
 * DerivativeExerciseStatus1Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code#Valid
 * DerivativeExerciseStatus1Code.Valid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode
 * DerivativeExerciseStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativeExerciseStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the exercise status of the derivative products."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DerivativeExerciseStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code
	 * DerivativeExerciseStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatus1Code Exercised = new DerivativeExerciseStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.mmObject();
			codeName = DerivativeExerciseStatusCode.Exercised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code
	 * DerivativeExerciseStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatus1Code Expired = new DerivativeExerciseStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.mmObject();
			codeName = DerivativeExerciseStatusCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code
	 * DerivativeExerciseStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valid"</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatus1Code Valid = new DerivativeExerciseStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valid";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.mmObject();
			codeName = DerivativeExerciseStatusCode.Valid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DerivativeExerciseStatus1Code> codesByName = new LinkedHashMap<>();

	protected DerivativeExerciseStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeExerciseStatus1Code";
				definition = "Specifies the exercise status of the derivative products.";
				trace_lazy = () -> DerivativeExerciseStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.Exercised, com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.Expired,
						com.tools20022.repository.codeset.DerivativeExerciseStatus1Code.Valid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Valid.getCodeName().get(), Valid);
	}

	public static DerivativeExerciseStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DerivativeExerciseStatus1Code[] values() {
		DerivativeExerciseStatus1Code[] values = new DerivativeExerciseStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DerivativeExerciseStatus1Code> {
		@Override
		public DerivativeExerciseStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DerivativeExerciseStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}