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
import com.tools20022.repository.codeset.Validation1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.Validation1Code#ValidationSuccessful
 * Validation1Code.ValidationSuccessful}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Validation1Code#ValidationUnkonwn
 * Validation1Code.ValidationUnkonwn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Validation1Code#ValidationFailed
 * Validation1Code.ValidationFailed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ValidationCode ValidationCode}</li>
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
 * "Validation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the validation of a signature used to sign the file."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Validation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Validation1Code
	 * Validation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationSuccessful"</li>
	 * </ul>
	 */
	public static final Validation1Code ValidationSuccessful = new Validation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationSuccessful";
			owner_lazy = () -> com.tools20022.repository.codeset.Validation1Code.mmObject();
			codeName = ValidationCode.ValidationSuccessful.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Validation1Code
	 * Validation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationUnkonwn"</li>
	 * </ul>
	 */
	public static final Validation1Code ValidationUnkonwn = new Validation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationUnkonwn";
			owner_lazy = () -> com.tools20022.repository.codeset.Validation1Code.mmObject();
			codeName = ValidationCode.ValidationUnkonwn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Validation1Code
	 * Validation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidationFailed"</li>
	 * </ul>
	 */
	public static final Validation1Code ValidationFailed = new Validation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidationFailed";
			owner_lazy = () -> com.tools20022.repository.codeset.Validation1Code.mmObject();
			codeName = ValidationCode.ValidationFailed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Validation1Code> codesByName = new LinkedHashMap<>();

	protected Validation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Validation1Code";
				definition = "Specifies the validation of a signature used to sign the file.";
				trace_lazy = () -> ValidationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Validation1Code.ValidationSuccessful, com.tools20022.repository.codeset.Validation1Code.ValidationUnkonwn,
						com.tools20022.repository.codeset.Validation1Code.ValidationFailed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ValidationSuccessful.getCodeName().get(), ValidationSuccessful);
		codesByName.put(ValidationUnkonwn.getCodeName().get(), ValidationUnkonwn);
		codesByName.put(ValidationFailed.getCodeName().get(), ValidationFailed);
	}

	public static Validation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Validation1Code[] values() {
		Validation1Code[] values = new Validation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Validation1Code> {
		@Override
		public Validation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Validation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}