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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code values for the registered number type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code
 * RegisteredNumberType1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#mmAustralianBusinessNumber
 * RegisteredNumberTypeCode.mmAustralianBusinessNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#mmAustralianCompanyNumber
 * RegisteredNumberTypeCode.mmAustralianCompanyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#mmAustralianRegisteredBodyNumber
 * RegisteredNumberTypeCode.mmAustralianRegisteredBodyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#mmAustralianRegisteredSchemeNumber
 * RegisteredNumberTypeCode.mmAustralianRegisteredSchemeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode#mmOther
 * RegisteredNumberTypeCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegisteredNumberTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code values for the registered number type."</li>
 * </ul>
 */
public class RegisteredNumberTypeCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianBusinessNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Australian Business Number (ABN) is a single identifier for use in business dealings with the Australian Taxation Office (ATO) and with other government agencies."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAustralianBusinessNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBusinessNumber";
			definition = "Australian Business Number (ABN) is a single identifier for use in business dealings with the Australian Taxation Office (ATO) and with other government agencies.";
			owner_lazy = () -> RegisteredNumberTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianCompanyNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a company, issued by the Australian Securities &amp; Investments Commission (ASIC) upon registration."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAustralianCompanyNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianCompanyNumber";
			definition = "Number identifying a company, issued by the Australian Securities & Investments Commission (ASIC) upon registration.";
			owner_lazy = () -> RegisteredNumberTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredBodyNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ARBNs are issued to registrable Australian bodies and foreign companies. The ARBN is a unique identifier and no two bodies can have the same ARBN. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAustralianRegisteredBodyNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredBodyNumber";
			definition = "ARBNs are issued to registrable Australian bodies and foreign companies. The ARBN is a unique identifier and no two bodies can have the same ARBN. ";
			owner_lazy = () -> RegisteredNumberTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AustralianRegisteredSchemeNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ARSNs are issued to Managed Investment Schemes. The ARSN is a unique identifier and no two bodies can have the same ARSN. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAustralianRegisteredSchemeNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredSchemeNumber";
			definition = "ARSNs are issued to Managed Investment Schemes. The ARSN is a unique identifier and no two bodies can have the same ARSN. ";
			owner_lazy = () -> RegisteredNumberTypeCode.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other registered number type."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other registered number type.";
			owner_lazy = () -> RegisteredNumberTypeCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredNumberTypeCode";
				definition = "Code values for the registered number type.";
				code_lazy = () -> Arrays.asList(RegisteredNumberTypeCode.mmAustralianBusinessNumber, RegisteredNumberTypeCode.mmAustralianCompanyNumber, RegisteredNumberTypeCode.mmAustralianRegisteredBodyNumber,
						RegisteredNumberTypeCode.mmAustralianRegisteredSchemeNumber, RegisteredNumberTypeCode.mmOther);
				derivation_lazy = () -> Arrays.asList(RegisteredNumberType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}