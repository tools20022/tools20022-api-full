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
import com.tools20022.repository.codeset.AccountManagementTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#AccountOpening
 * AccountManagementTypeCode.AccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#AccountModification
 * AccountManagementTypeCode.AccountModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#GetAccountDetails
 * AccountManagementTypeCode.GetAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#AccountClosure
 * AccountManagementTypeCode.AccountClosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode#AccountStatus
 * AccountManagementTypeCode.AccountStatus}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Refers to an account management instruction, that is, either an account opening instruction or an account modification instruction or a get account details message."
 * </li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountManagementTypeCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account opening instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AccountManagementTypeCode AccountOpening = new AccountManagementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOpening";
			definition = "Refers to an account opening instruction message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account modification instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AccountManagementTypeCode AccountModification = new AccountManagementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountModification";
			definition = "Refers to an account modification instruction message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GetAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to a get account details message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AccountManagementTypeCode GetAccountDetails = new AccountManagementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GetAccountDetails";
			definition = "Refers to a get account details message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to an account closure instruction message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AccountManagementTypeCode AccountClosure = new AccountManagementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosure";
			definition = "Refers to an account closure instruction message.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Refers to the account status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AccountManagementTypeCode AccountStatus = new AccountManagementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatus";
			definition = "Refers to the account status.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementTypeCode.mmObject();
			codeName = "ACST";
		}
	};
	final static private LinkedHashMap<String, AccountManagementTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountManagementTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementTypeCode";
				definition = "Refers to an account management instruction, that is, either an account opening instruction or an account modification instruction or a get account details message.";
				derivation_lazy = () -> Arrays.asList(AccountManagementType2Code.mmObject(), AccountManagementType1Code.mmObject(), AccountManagementType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementTypeCode.AccountOpening, com.tools20022.repository.codeset.AccountManagementTypeCode.AccountModification,
						com.tools20022.repository.codeset.AccountManagementTypeCode.GetAccountDetails, com.tools20022.repository.codeset.AccountManagementTypeCode.AccountClosure,
						com.tools20022.repository.codeset.AccountManagementTypeCode.AccountStatus);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountOpening.getCodeName().get(), AccountOpening);
		codesByName.put(AccountModification.getCodeName().get(), AccountModification);
		codesByName.put(GetAccountDetails.getCodeName().get(), GetAccountDetails);
		codesByName.put(AccountClosure.getCodeName().get(), AccountClosure);
		codesByName.put(AccountStatus.getCodeName().get(), AccountStatus);
	}

	public static AccountManagementTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountManagementTypeCode[] values() {
		AccountManagementTypeCode[] values = new AccountManagementTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountManagementTypeCode> {
		@Override
		public AccountManagementTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountManagementTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}