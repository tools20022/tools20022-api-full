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
import com.tools20022.repository.codeset.AccountChoiceMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Method used by the cardholder and the terminal for the choice of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#AccountSelected
 * AccountChoiceMethod1Code.AccountSelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#Entered
 * AccountChoiceMethod1Code.Entered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#ImplicitAccount
 * AccountChoiceMethod1Code.ImplicitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#ImplicitType
 * AccountChoiceMethod1Code.ImplicitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#NoSelection
 * AccountChoiceMethod1Code.NoSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code#TypeSelected
 * AccountChoiceMethod1Code.TypeSelected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
 * AccountChoiceMethodCode}</li>
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
 * "AccountChoiceMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Method used by the cardholder and the terminal for the choice of the account."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountChoiceMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSelected"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code AccountSelected = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSelected";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.AccountSelected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entered"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code Entered = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entered";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.Entered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImplicitAccount"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code ImplicitAccount = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImplicitAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.ImplicitAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImplicitType"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code ImplicitType = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImplicitType";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.ImplicitType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSelection"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code NoSelection = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.NoSelection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
	 * AccountChoiceMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeSelected"</li>
	 * </ul>
	 */
	public static final AccountChoiceMethod1Code TypeSelected = new AccountChoiceMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeSelected";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethod1Code.mmObject();
			codeName = AccountChoiceMethodCode.TypeSelected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountChoiceMethod1Code> codesByName = new LinkedHashMap<>();

	protected AccountChoiceMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountChoiceMethod1Code";
				definition = "Method used by the cardholder and the terminal for the choice of the account.";
				trace_lazy = () -> AccountChoiceMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountChoiceMethod1Code.AccountSelected, com.tools20022.repository.codeset.AccountChoiceMethod1Code.Entered,
						com.tools20022.repository.codeset.AccountChoiceMethod1Code.ImplicitAccount, com.tools20022.repository.codeset.AccountChoiceMethod1Code.ImplicitType,
						com.tools20022.repository.codeset.AccountChoiceMethod1Code.NoSelection, com.tools20022.repository.codeset.AccountChoiceMethod1Code.TypeSelected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountSelected.getCodeName().get(), AccountSelected);
		codesByName.put(Entered.getCodeName().get(), Entered);
		codesByName.put(ImplicitAccount.getCodeName().get(), ImplicitAccount);
		codesByName.put(ImplicitType.getCodeName().get(), ImplicitType);
		codesByName.put(NoSelection.getCodeName().get(), NoSelection);
		codesByName.put(TypeSelected.getCodeName().get(), TypeSelected);
	}

	public static AccountChoiceMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountChoiceMethod1Code[] values() {
		AccountChoiceMethod1Code[] values = new AccountChoiceMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountChoiceMethod1Code> {
		@Override
		public AccountChoiceMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountChoiceMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}