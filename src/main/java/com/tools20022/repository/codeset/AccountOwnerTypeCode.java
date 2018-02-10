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
import com.tools20022.repository.codeset.AccountOwnerTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * (No doc)
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode#PrimaryOwner
 * AccountOwnerTypeCode.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode#Trustee
 * AccountOwnerTypeCode.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode#CustodianForMinor
 * AccountOwnerTypeCode.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode#Nominee
 * AccountOwnerTypeCode.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode#SecondaryOwner
 * AccountOwnerTypeCode.SecondaryOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountOwnerType1Code
 * AccountOwnerType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOwnerTypeCode"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOwnerTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Owner of the property. The ownership can be split among several owners,
	 * and the primary owner is the one giving its address and account details
	 * for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode
	 * AccountOwnerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Owner of the property. The ownership can be split among several owners, and the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnerTypeCode PrimaryOwner = new AccountOwnerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Owner of the property. The ownership can be split among several owners, and the primary owner is the one giving its address and account details for the registration.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnerTypeCode.mmObject();
			codeName = "POWN";
		}
	};
	/**
	 * Legal owners of the property. However, the beneficiary has the equitable
	 * or beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode
	 * AccountOwnerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnerTypeCode Trustee = new AccountOwnerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnerTypeCode.mmObject();
			codeName = "TRUS";
		}
	};
	/**
	 * Entity that holds shares/units on behalf of a legal minor. Although the
	 * account is registered under the name of the minor, the custodian retains
	 * control of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode
	 * AccountOwnerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnerTypeCode CustodianForMinor = new AccountOwnerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnerTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Entity named by the beneficial owner to act on its behalf, often to
	 * facilitate dealing, or to conceal the identity of the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode
	 * AccountOwnerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnerTypeCode Nominee = new AccountOwnerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnerTypeCode.mmObject();
			codeName = "NOMI";
		}
	};
	/**
	 * One of the owners of the property. The ownership can be split among
	 * several owners, and only the primary owner gives its address and account
	 * details for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnerTypeCode
	 * AccountOwnerTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One of the owners of the property. The ownership can be split among several owners, and only the primary owner gives its address and account details for the registration."
	 * </li>
	 * </ul>
	 */
	public static final AccountOwnerTypeCode SecondaryOwner = new AccountOwnerTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "One of the owners of the property. The ownership can be split among several owners, and only the primary owner gives its address and account details for the registration.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnerTypeCode.mmObject();
			codeName = "SECO";
		}
	};
	final static private LinkedHashMap<String, AccountOwnerTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountOwnerTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountOwnerTypeCode";
				derivation_lazy = () -> Arrays.asList(AccountOwnerType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnerTypeCode.PrimaryOwner, com.tools20022.repository.codeset.AccountOwnerTypeCode.Trustee,
						com.tools20022.repository.codeset.AccountOwnerTypeCode.CustodianForMinor, com.tools20022.repository.codeset.AccountOwnerTypeCode.Nominee, com.tools20022.repository.codeset.AccountOwnerTypeCode.SecondaryOwner);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PrimaryOwner.getCodeName().get(), PrimaryOwner);
		codesByName.put(Trustee.getCodeName().get(), Trustee);
		codesByName.put(CustodianForMinor.getCodeName().get(), CustodianForMinor);
		codesByName.put(Nominee.getCodeName().get(), Nominee);
		codesByName.put(SecondaryOwner.getCodeName().get(), SecondaryOwner);
	}

	public static AccountOwnerTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOwnerTypeCode[] values() {
		AccountOwnerTypeCode[] values = new AccountOwnerTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOwnerTypeCode> {
		@Override
		public AccountOwnerTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOwnerTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}