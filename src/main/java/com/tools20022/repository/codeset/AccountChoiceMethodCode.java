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
import com.tools20022.repository.codeset.AccountChoiceMethodCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#AccountSelected
 * AccountChoiceMethodCode.AccountSelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#Entered
 * AccountChoiceMethodCode.Entered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#ImplicitAccount
 * AccountChoiceMethodCode.ImplicitAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#ImplicitType
 * AccountChoiceMethodCode.ImplicitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#TypeSelected
 * AccountChoiceMethodCode.TypeSelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode#NoSelection
 * AccountChoiceMethodCode.NoSelection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountChoiceMethod1Code
 * AccountChoiceMethod1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountChoiceMethodCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Method used by the cardholder and the terminal for the choice of the account."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountChoiceMethodCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account selected in an account list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSelected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account selected in an account list."</li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode AccountSelected = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSelected";
			definition = "Account selected in an account list.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "ACSL";
		}
	};
	/**
	 * Account identification is entered by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account identification is entered by the customer."</li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode Entered = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entered";
			definition = "Account identification is entered by the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Account is selected according to the configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImplicitAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is selected according to the configuration."</li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode ImplicitAccount = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImplicitAccount";
			definition = "Account is selected according to the configuration.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "IMAC";
		}
	};
	/**
	 * Type of account is selected according to the configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMPL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImplicitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of account is selected according to the configuration."</li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode ImplicitType = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImplicitType";
			definition = "Type of account is selected according to the configuration.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "IMPL";
		}
	};
	/**
	 * Type of account selected in a list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeSelected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of account selected in a list."</li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode TypeSelected = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeSelected";
			definition = "Type of account selected in a list.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "TPSL";
		}
	};
	/**
	 * Account is not selected by the customer or a profile, but by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountChoiceMethodCode
	 * AccountChoiceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOSL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is not selected by the customer or a profile, but by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final AccountChoiceMethodCode NoSelection = new AccountChoiceMethodCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoSelection";
			definition = "Account is not selected by the customer or a profile, but by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountChoiceMethodCode.mmObject();
			codeName = "NOSL";
		}
	};
	final static private LinkedHashMap<String, AccountChoiceMethodCode> codesByName = new LinkedHashMap<>();

	protected AccountChoiceMethodCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountChoiceMethodCode";
				definition = "Method used by the cardholder and the terminal for the choice of the account.";
				derivation_lazy = () -> Arrays.asList(AccountChoiceMethod1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountChoiceMethodCode.AccountSelected, com.tools20022.repository.codeset.AccountChoiceMethodCode.Entered,
						com.tools20022.repository.codeset.AccountChoiceMethodCode.ImplicitAccount, com.tools20022.repository.codeset.AccountChoiceMethodCode.ImplicitType,
						com.tools20022.repository.codeset.AccountChoiceMethodCode.TypeSelected, com.tools20022.repository.codeset.AccountChoiceMethodCode.NoSelection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountSelected.getCodeName().get(), AccountSelected);
		codesByName.put(Entered.getCodeName().get(), Entered);
		codesByName.put(ImplicitAccount.getCodeName().get(), ImplicitAccount);
		codesByName.put(ImplicitType.getCodeName().get(), ImplicitType);
		codesByName.put(TypeSelected.getCodeName().get(), TypeSelected);
		codesByName.put(NoSelection.getCodeName().get(), NoSelection);
	}

	public static AccountChoiceMethodCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountChoiceMethodCode[] values() {
		AccountChoiceMethodCode[] values = new AccountChoiceMethodCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountChoiceMethodCode> {
		@Override
		public AccountChoiceMethodCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountChoiceMethodCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}