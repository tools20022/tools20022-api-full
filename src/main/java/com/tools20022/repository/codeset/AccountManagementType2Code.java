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
import com.tools20022.repository.codeset.AccountManagementType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Refer to an account management instruction ie, either an account opening
 * instruction or an account modification instruction or a get account details
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code#AccountOpening
 * AccountManagementType2Code.AccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code#AccountModification
 * AccountManagementType2Code.AccountModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code#GetAccountDetails
 * AccountManagementType2Code.GetAccountDetails}</li>
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
 * "AccountManagementType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Refer to an account management instruction ie, either an account opening instruction or an account modification instruction or a get account details message."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountManagementType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
	 * AccountManagementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOpening"</li>
	 * </ul>
	 */
	public static final AccountManagementType2Code AccountOpening = new AccountManagementType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOpening";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType2Code.mmObject();
			codeName = AccountManagementTypeCode.AccountOpening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
	 * AccountManagementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountModification"</li>
	 * </ul>
	 */
	public static final AccountManagementType2Code AccountModification = new AccountManagementType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountModification";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType2Code.mmObject();
			codeName = AccountManagementTypeCode.AccountModification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementType2Code
	 * AccountManagementType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GetAccountDetails"</li>
	 * </ul>
	 */
	public static final AccountManagementType2Code GetAccountDetails = new AccountManagementType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GetAccountDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementType2Code.mmObject();
			codeName = AccountManagementTypeCode.GetAccountDetails.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountManagementType2Code> codesByName = new LinkedHashMap<>();

	protected AccountManagementType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementType2Code";
				definition = "Refer to an account management instruction ie, either an account opening instruction or an account modification instruction or a get account details message.";
				trace_lazy = () -> AccountManagementTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementType2Code.AccountOpening, com.tools20022.repository.codeset.AccountManagementType2Code.AccountModification,
						com.tools20022.repository.codeset.AccountManagementType2Code.GetAccountDetails);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountOpening.getCodeName().get(), AccountOpening);
		codesByName.put(AccountModification.getCodeName().get(), AccountModification);
		codesByName.put(GetAccountDetails.getCodeName().get(), GetAccountDetails);
	}

	public static AccountManagementType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountManagementType2Code[] values() {
		AccountManagementType2Code[] values = new AccountManagementType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountManagementType2Code> {
		@Override
		public AccountManagementType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountManagementType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}