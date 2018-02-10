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
import com.tools20022.repository.codeset.ValidationCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the validation of a signature used to sign the file.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationCode#ValidationSuccessful
 * ValidationCode.ValidationSuccessful}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationCode#ValidationUnkonwn
 * ValidationCode.ValidationUnkonwn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ValidationCode#ValidationFailed
 * ValidationCode.ValidationFailed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Validation1Code
 * Validation1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Validation2Code
 * Validation2Code}</li>
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
 * "ValidationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the validation of a signature used to sign the file."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ValidationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Validation of the signature is successful.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationCode
	 * ValidationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OKAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationSuccessful"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation of the signature is successful."</li>
	 * </ul>
	 */
	public static final ValidationCode ValidationSuccessful = new ValidationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSuccessful";
			definition = "Validation of the signature is successful.";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationCode.mmObject();
			codeName = "OKAY";
		}
	};
	/**
	 * Validation of the signature is unknown or not yet executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationCode
	 * ValidationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationUnkonwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation of the signature is unknown or not yet executed."</li>
	 * </ul>
	 */
	public static final ValidationCode ValidationUnkonwn = new ValidationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationUnkonwn";
			definition = "Validation of the signature is unknown or not yet executed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationCode.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Validation of the signature has failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ValidationCode
	 * ValidationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation of the signature has failed."</li>
	 * </ul>
	 */
	public static final ValidationCode ValidationFailed = new ValidationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationFailed";
			definition = "Validation of the signature has failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ValidationCode.mmObject();
			codeName = "NTOK";
		}
	};
	final static private LinkedHashMap<String, ValidationCode> codesByName = new LinkedHashMap<>();

	protected ValidationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValidationCode";
				definition = "Specifies the validation of a signature used to sign the file.";
				derivation_lazy = () -> Arrays.asList(Validation1Code.mmObject(), Validation2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ValidationCode.ValidationSuccessful, com.tools20022.repository.codeset.ValidationCode.ValidationUnkonwn,
						com.tools20022.repository.codeset.ValidationCode.ValidationFailed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ValidationSuccessful.getCodeName().get(), ValidationSuccessful);
		codesByName.put(ValidationUnkonwn.getCodeName().get(), ValidationUnkonwn);
		codesByName.put(ValidationFailed.getCodeName().get(), ValidationFailed);
	}

	public static ValidationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ValidationCode[] values() {
		ValidationCode[] values = new ValidationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ValidationCode> {
		@Override
		public ValidationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ValidationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}