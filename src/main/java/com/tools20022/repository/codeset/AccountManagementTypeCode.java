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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Refers to an account management instruction, that is, either an account
 * opening instruction or an account modification instruction or a get account
 * details message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#mmAccountOpening
 * AccountManagementTypeCode.mmAccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#mmAccountModification
 * AccountManagementTypeCode.mmAccountModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#mmGetAccountDetails
 * AccountManagementTypeCode.mmGetAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#mmAccountClosure
 * AccountManagementTypeCode.mmAccountClosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#mmAccountStatus
 * AccountManagementTypeCode.mmAccountStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
 * AccountManagementType2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountManagementType1Code
 * AccountManagementType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
 * AccountManagementType3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Refers to an account management instruction, that is, either an account opening instruction or an account modification instruction or a get account details message."
 * </li>
 * </ul>
 */
public class AccountManagementTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Refers to an account opening instruction message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
	 * AccountManagementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account opening instruction message."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountOpening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOpening";
			definition = "Refers to an account opening instruction message.";
			owner_lazy = () -> AccountManagementTypeCode.mmObject();
			codeName = "ACCO";
		}
	};
	/**
	 * Refers to an account modification instruction message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
	 * AccountManagementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account modification instruction message."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountModification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountModification";
			definition = "Refers to an account modification instruction message.";
			owner_lazy = () -> AccountManagementTypeCode.mmObject();
			codeName = "ACCM";
		}
	};
	/**
	 * Refers to a get account details message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
	 * AccountManagementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GACC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GetAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to a get account details message."</li>
	 * </ul>
	 */
	public static final MMCode mmGetAccountDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GetAccountDetails";
			definition = "Refers to a get account details message.";
			owner_lazy = () -> AccountManagementTypeCode.mmObject();
			codeName = "GACC";
		}
	};
	/**
	 * Refers to an account closure instruction message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
	 * AccountManagementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account closure instruction message."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountClosure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosure";
			definition = "Refers to an account closure instruction message.";
			owner_lazy = () -> AccountManagementTypeCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Refers to the account status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
	 * AccountManagementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to the account status."</li>
	 * </ul>
	 */
	public static final MMCode mmAccountStatus = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatus";
			definition = "Refers to the account status.";
			owner_lazy = () -> AccountManagementTypeCode.mmObject();
			codeName = "ACST";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCO");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountManagementTypeCode";
				definition = "Refers to an account management instruction, that is, either an account opening instruction or an account modification instruction or a get account details message.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementTypeCode.mmAccountOpening, com.tools20022.repository.codeset.AccountManagementTypeCode.mmAccountModification,
						com.tools20022.repository.codeset.AccountManagementTypeCode.mmGetAccountDetails, com.tools20022.repository.codeset.AccountManagementTypeCode.mmAccountClosure,
						com.tools20022.repository.codeset.AccountManagementTypeCode.mmAccountStatus);
				derivation_lazy = () -> Arrays.asList(AccountManagementType2Code.mmObject(), AccountManagementType1Code.mmObject(), AccountManagementType3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}