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
import com.tools20022.repository.codeset.RegisteredNumberTypeCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Code values for the registered number type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberTypeCode
 * RegisteredNumberTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#mmAustralianBusinessNumber
 * RegisteredNumberType1Code.mmAustralianBusinessNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#mmAustralianCompanyNumber
 * RegisteredNumberType1Code.mmAustralianCompanyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#mmAustralianRegisteredBodyNumber
 * RegisteredNumberType1Code.mmAustralianRegisteredBodyNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#mmAustralianRegisteredSchemeNumber
 * RegisteredNumberType1Code.mmAustralianRegisteredSchemeNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RegisteredNumberType1Code#mmOther
 * RegisteredNumberType1Code.mmOther}</li>
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
 * "RegisteredNumberType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code values for the registered number type."</li>
 * </ul>
 */
public class RegisteredNumberType1Code extends RegisteredNumberTypeCode {

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
	public static final MMCode mmAustralianBusinessNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianBusinessNumber";
			owner_lazy = () -> RegisteredNumberType1Code.mmObject();
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
	public static final MMCode mmAustralianCompanyNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianCompanyNumber";
			owner_lazy = () -> RegisteredNumberType1Code.mmObject();
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
	public static final MMCode mmAustralianRegisteredBodyNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredBodyNumber";
			owner_lazy = () -> RegisteredNumberType1Code.mmObject();
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
	public static final MMCode mmAustralianRegisteredSchemeNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AustralianRegisteredSchemeNumber";
			owner_lazy = () -> RegisteredNumberType1Code.mmObject();
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
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> RegisteredNumberType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegisteredNumberType1Code";
				definition = "Code values for the registered number type.";
				code_lazy = () -> Arrays.asList(RegisteredNumberType1Code.mmAustralianBusinessNumber, RegisteredNumberType1Code.mmAustralianCompanyNumber, RegisteredNumberType1Code.mmAustralianRegisteredBodyNumber,
						RegisteredNumberType1Code.mmAustralianRegisteredSchemeNumber, RegisteredNumberType1Code.mmOther);
				trace_lazy = () -> RegisteredNumberTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}