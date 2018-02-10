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
import com.tools20022.repository.codeset.AccountManagementType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the instruction for which an status is required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code#AccountModification
 * AccountManagementType3Code.AccountModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code#AccountOpening
 * AccountManagementType3Code.AccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code#GetAccountDetails
 * AccountManagementType3Code.GetAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code#AccountStatus
 * AccountManagementType3Code.AccountStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountManagementTypeCode
 * AccountManagementTypeCode}</li>
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
 * "AccountManagementType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the instruction for which an status is required."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountManagementType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
	 * AccountManagementType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountModification"</li>
	 * </ul>
	 */
	public static final AccountManagementType3Code AccountModification = new AccountManagementType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountModification";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType3Code.mmObject();
			codeName = AccountManagementTypeCode.AccountModification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
	 * AccountManagementType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOpening"</li>
	 * </ul>
	 */
	public static final AccountManagementType3Code AccountOpening = new AccountManagementType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOpening";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType3Code.mmObject();
			codeName = AccountManagementTypeCode.AccountOpening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
	 * AccountManagementType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GetAccountDetails"</li>
	 * </ul>
	 */
	public static final AccountManagementType3Code GetAccountDetails = new AccountManagementType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GetAccountDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType3Code.mmObject();
			codeName = AccountManagementTypeCode.GetAccountDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType3Code
	 * AccountManagementType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatus"</li>
	 * </ul>
	 */
	public static final AccountManagementType3Code AccountStatus = new AccountManagementType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType3Code.mmObject();
			codeName = AccountManagementTypeCode.AccountStatus.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountManagementType3Code> codesByName = new LinkedHashMap<>();

	protected AccountManagementType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementType3Code";
				definition = "Specifies the instruction for which an status is required.";
				trace_lazy = () -> AccountManagementTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementType3Code.AccountModification, com.tools20022.repository.codeset.AccountManagementType3Code.AccountOpening,
						com.tools20022.repository.codeset.AccountManagementType3Code.GetAccountDetails, com.tools20022.repository.codeset.AccountManagementType3Code.AccountStatus);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountModification.getCodeName().get(), AccountModification);
		codesByName.put(AccountOpening.getCodeName().get(), AccountOpening);
		codesByName.put(GetAccountDetails.getCodeName().get(), GetAccountDetails);
		codesByName.put(AccountStatus.getCodeName().get(), AccountStatus);
	}

	public static AccountManagementType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountManagementType3Code[] values() {
		AccountManagementType3Code[] values = new AccountManagementType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountManagementType3Code> {
		@Override
		public AccountManagementType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountManagementType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}