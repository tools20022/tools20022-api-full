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
import com.tools20022.repository.codeset.RegisteredNumberTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#AustralianBusinessNumber
 * RegisteredNumberTypeCode.AustralianBusinessNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#AustralianCompanyNumber
 * RegisteredNumberTypeCode.AustralianCompanyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#AustralianRegisteredBodyNumber
 * RegisteredNumberTypeCode.AustralianRegisteredBodyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#AustralianRegisteredSchemeNumber
 * RegisteredNumberTypeCode.AustralianRegisteredSchemeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#Other
 * RegisteredNumberTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
 * RegisteredNumberType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegisteredNumberTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code values for the registered number type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RegisteredNumberTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Australian Business Number (ABN) is a single identifier for use in
	 * business dealings with the Australian Taxation Office (ATO) and with
	 * other government agencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
	 * RegisteredNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBusinessNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Australian Business Number (ABN) is a single identifier for use in business dealings with the Australian Taxation Office (ATO) and with other government agencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RegisteredNumberTypeCode AustralianBusinessNumber = new RegisteredNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBusinessNumber";
			definition = "Australian Business Number (ABN) is a single identifier for use in business dealings with the Australian Taxation Office (ATO) and with other government agencies.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberTypeCode.mmObject();
			codeName = "ABN";
		}
	};
	/**
	 * Number identifying a company, issued by the Australian Securities &amp;
	 * Investments Commission (ASIC) upon registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
	 * RegisteredNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianCompanyNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a company, issued by the Australian Securities &amp; Investments Commission (ASIC) upon registration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RegisteredNumberTypeCode AustralianCompanyNumber = new RegisteredNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianCompanyNumber";
			definition = "Number identifying a company, issued by the Australian Securities & Investments Commission (ASIC) upon registration.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberTypeCode.mmObject();
			codeName = "ACN";
		}
	};
	/**
	 * ARBNs are issued to registrable Australian bodies and foreign companies.
	 * The ARBN is a unique identifier and no two bodies can have the same ARBN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
	 * RegisteredNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARBN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredBodyNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ARBNs are issued to registrable Australian bodies and foreign companies. The ARBN is a unique identifier and no two bodies can have the same ARBN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RegisteredNumberTypeCode AustralianRegisteredBodyNumber = new RegisteredNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredBodyNumber";
			definition = "ARBNs are issued to registrable Australian bodies and foreign companies. The ARBN is a unique identifier and no two bodies can have the same ARBN.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberTypeCode.mmObject();
			codeName = "ARBN";
		}
	};
	/**
	 * ARSNs are issued to Managed Investment Schemes. The ARSN is a unique
	 * identifier and no two bodies can have the same ARSN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
	 * RegisteredNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARSN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredSchemeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ARSNs are issued to Managed Investment Schemes. The ARSN is a unique identifier and no two bodies can have the same ARSN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RegisteredNumberTypeCode AustralianRegisteredSchemeNumber = new RegisteredNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredSchemeNumber";
			definition = "ARSNs are issued to Managed Investment Schemes. The ARSN is a unique identifier and no two bodies can have the same ARSN.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberTypeCode.mmObject();
			codeName = "ARSN";
		}
	};
	/**
	 * Other registered number type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
	 * RegisteredNumberTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other registered number type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RegisteredNumberTypeCode Other = new RegisteredNumberTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other registered number type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RegisteredNumberTypeCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, RegisteredNumberTypeCode> codesByName = new LinkedHashMap<>();

	protected RegisteredNumberTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredNumberTypeCode";
				definition = "Code values for the registered number type.";
				derivation_lazy = () -> Arrays.asList(RegisteredNumberType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RegisteredNumberTypeCode.AustralianBusinessNumber, com.tools20022.repository.codeset.RegisteredNumberTypeCode.AustralianCompanyNumber,
						com.tools20022.repository.codeset.RegisteredNumberTypeCode.AustralianRegisteredBodyNumber, com.tools20022.repository.codeset.RegisteredNumberTypeCode.AustralianRegisteredSchemeNumber,
						com.tools20022.repository.codeset.RegisteredNumberTypeCode.Other);
				minLength = 3;
				maxLength = 4;
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

	public static RegisteredNumberTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RegisteredNumberTypeCode[] values() {
		RegisteredNumberTypeCode[] values = new RegisteredNumberTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RegisteredNumberTypeCode> {
		@Override
		public RegisteredNumberTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RegisteredNumberTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}