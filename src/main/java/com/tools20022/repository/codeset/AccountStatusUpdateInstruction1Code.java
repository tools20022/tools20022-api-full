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
import com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code#Close
 * AccountStatusUpdateInstruction1Code.Close}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code#Reactive
 * AccountStatusUpdateInstruction1Code.Reactive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstructionCode
 * AccountStatusUpdateInstructionCode}</li>
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
 * "AccountStatusUpdateInstruction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account status update instructed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountStatusUpdateInstruction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code
	 * AccountStatusUpdateInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Close"</li>
	 * </ul>
	 */
	public static final AccountStatusUpdateInstruction1Code Close = new AccountStatusUpdateInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Close";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code.mmObject();
			codeName = AccountStatusUpdateInstructionCode.Close.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code
	 * AccountStatusUpdateInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reactive"</li>
	 * </ul>
	 */
	public static final AccountStatusUpdateInstruction1Code Reactive = new AccountStatusUpdateInstruction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reactive";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code.mmObject();
			codeName = AccountStatusUpdateInstructionCode.Reactive.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountStatusUpdateInstruction1Code> codesByName = new LinkedHashMap<>();

	protected AccountStatusUpdateInstruction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusUpdateInstruction1Code";
				definition = "Specifies the type of account status update instructed.";
				trace_lazy = () -> AccountStatusUpdateInstructionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code.Close, com.tools20022.repository.codeset.AccountStatusUpdateInstruction1Code.Reactive);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Close.getCodeName().get(), Close);
		codesByName.put(Reactive.getCodeName().get(), Reactive);
	}

	public static AccountStatusUpdateInstruction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountStatusUpdateInstruction1Code[] values() {
		AccountStatusUpdateInstruction1Code[] values = new AccountStatusUpdateInstruction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountStatusUpdateInstruction1Code> {
		@Override
		public AccountStatusUpdateInstruction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountStatusUpdateInstruction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}