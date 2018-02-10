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
import com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account status update instructed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode#Reactive
 * AccountStatusUpdateInstructionCode.Reactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode#Close
 * AccountStatusUpdateInstructionCode.Close}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code
 * AccountStatusUpdateInstruction1Code}</li>
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
 * "AccountStatusUpdateInstructionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account status update instructed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountStatusUpdateInstructionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account is to be reactivated, any previous instruction to close the
	 * account is rescinded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode
	 * AccountStatusUpdateInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account is to be reactivated, any previous instruction to close the account is rescinded."
	 * </li>
	 * </ul>
	 */
	public static final AccountStatusUpdateInstructionCode Reactive = new AccountStatusUpdateInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reactive";
			definition = "Account is to be reactivated, any previous instruction to close the account is rescinded.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode.mmObject();
			codeName = "REAC";
		}
	};
	/**
	 * Account is to be closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode
	 * AccountStatusUpdateInstructionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Close"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is to be closed."</li>
	 * </ul>
	 */
	public static final AccountStatusUpdateInstructionCode Close = new AccountStatusUpdateInstructionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Close";
			definition = "Account is to be closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode.mmObject();
			codeName = "CLOS";
		}
	};
	final static private LinkedHashMap<String, AccountStatusUpdateInstructionCode> codesByName = new LinkedHashMap<>();

	protected AccountStatusUpdateInstructionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusUpdateInstructionCode";
				definition = "Specifies the type of account status update instructed.";
				derivation_lazy = () -> Arrays.asList(AccountStatusUpdateInstruction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode.Reactive, com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode.Close);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Reactive.getCodeName().get(), Reactive);
		codesByName.put(Close.getCodeName().get(), Close);
	}

	public static AccountStatusUpdateInstructionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountStatusUpdateInstructionCode[] values() {
		AccountStatusUpdateInstructionCode[] values = new AccountStatusUpdateInstructionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountStatusUpdateInstructionCode> {
		@Override
		public AccountStatusUpdateInstructionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountStatusUpdateInstructionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}