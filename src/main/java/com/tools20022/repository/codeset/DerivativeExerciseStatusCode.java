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
import com.tools20022.repository.codeset.DerivativeExerciseStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode#Exercised
 * DerivativeExerciseStatusCode.Exercised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode#Expired
 * DerivativeExerciseStatusCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode#Valid
 * DerivativeExerciseStatusCode.Valid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatus1Code
 * DerivativeExerciseStatus1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativeExerciseStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the exercise status of the derivative products."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DerivativeExerciseStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Derivative is exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode
	 * DerivativeExerciseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative is exercised."</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatusCode Exercised = new DerivativeExerciseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercised";
			definition = "Derivative is exercised.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatusCode.mmObject();
			codeName = "EXEC";
		}
	};
	/**
	 * Derivative is expired and will not be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode
	 * DerivativeExerciseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative is expired and will not be exercised."</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatusCode Expired = new DerivativeExerciseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Derivative is expired and will not be exercised.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Derivative is not exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeExerciseStatusCode
	 * DerivativeExerciseStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Valid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative is not exercised."</li>
	 * </ul>
	 */
	public static final DerivativeExerciseStatusCode Valid = new DerivativeExerciseStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Valid";
			definition = "Derivative is not exercised.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeExerciseStatusCode.mmObject();
			codeName = "VALI";
		}
	};
	final static private LinkedHashMap<String, DerivativeExerciseStatusCode> codesByName = new LinkedHashMap<>();

	protected DerivativeExerciseStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeExerciseStatusCode";
				definition = "Specifies the exercise status of the derivative products.";
				derivation_lazy = () -> Arrays.asList(DerivativeExerciseStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DerivativeExerciseStatusCode.Exercised, com.tools20022.repository.codeset.DerivativeExerciseStatusCode.Expired,
						com.tools20022.repository.codeset.DerivativeExerciseStatusCode.Valid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exercised.getCodeName().get(), Exercised);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Valid.getCodeName().get(), Valid);
	}

	public static DerivativeExerciseStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DerivativeExerciseStatusCode[] values() {
		DerivativeExerciseStatusCode[] values = new DerivativeExerciseStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DerivativeExerciseStatusCode> {
		@Override
		public DerivativeExerciseStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DerivativeExerciseStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}