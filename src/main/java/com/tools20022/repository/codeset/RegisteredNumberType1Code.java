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
import com.tools20022.repository.codeset.RegisteredNumberType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code values for the registered number type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#AustralianBusinessNumber
 * RegisteredNumberType1Code.AustralianBusinessNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#AustralianCompanyNumber
 * RegisteredNumberType1Code.AustralianCompanyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#AustralianRegisteredBodyNumber
 * RegisteredNumberType1Code.AustralianRegisteredBodyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#AustralianRegisteredSchemeNumber
 * RegisteredNumberType1Code.AustralianRegisteredSchemeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#Other
 * RegisteredNumberType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
 * RegisteredNumberTypeCode}</li>
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
 * "RegisteredNumberType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code values for the registered number type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegisteredNumberType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBusinessNumber"</li>
	 * </ul>
	 */
	public static final RegisteredNumberType1Code AustralianBusinessNumber = new RegisteredNumberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBusinessNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberType1Code.mmObject();
			codeName = RegisteredNumberTypeCode.AustralianBusinessNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianCompanyNumber"</li>
	 * </ul>
	 */
	public static final RegisteredNumberType1Code AustralianCompanyNumber = new RegisteredNumberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianCompanyNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberType1Code.mmObject();
			codeName = RegisteredNumberTypeCode.AustralianCompanyNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredBodyNumber"</li>
	 * </ul>
	 */
	public static final RegisteredNumberType1Code AustralianRegisteredBodyNumber = new RegisteredNumberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredBodyNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberType1Code.mmObject();
			codeName = RegisteredNumberTypeCode.AustralianRegisteredBodyNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredSchemeNumber"</li>
	 * </ul>
	 */
	public static final RegisteredNumberType1Code AustralianRegisteredSchemeNumber = new RegisteredNumberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredSchemeNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberType1Code.mmObject();
			codeName = RegisteredNumberTypeCode.AustralianRegisteredSchemeNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
	 * RegisteredNumberType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final RegisteredNumberType1Code Other = new RegisteredNumberType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberType1Code.mmObject();
			codeName = RegisteredNumberTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RegisteredNumberType1Code> codesByName = new LinkedHashMap<>();

	protected RegisteredNumberType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredNumberType1Code";
				definition = "Code values for the registered number type.";
				trace_lazy = () -> RegisteredNumberTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegisteredNumberType1Code.AustralianBusinessNumber, com.tools20022.repository.codeset.RegisteredNumberType1Code.AustralianCompanyNumber,
						com.tools20022.repository.codeset.RegisteredNumberType1Code.AustralianRegisteredBodyNumber, com.tools20022.repository.codeset.RegisteredNumberType1Code.AustralianRegisteredSchemeNumber,
						com.tools20022.repository.codeset.RegisteredNumberType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AustralianBusinessNumber.getCodeName().get(), AustralianBusinessNumber);
		codesByName.put(AustralianCompanyNumber.getCodeName().get(), AustralianCompanyNumber);
		codesByName.put(AustralianRegisteredBodyNumber.getCodeName().get(), AustralianRegisteredBodyNumber);
		codesByName.put(AustralianRegisteredSchemeNumber.getCodeName().get(), AustralianRegisteredSchemeNumber);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static RegisteredNumberType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegisteredNumberType1Code[] values() {
		RegisteredNumberType1Code[] values = new RegisteredNumberType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegisteredNumberType1Code> {
		@Override
		public RegisteredNumberType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegisteredNumberType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}