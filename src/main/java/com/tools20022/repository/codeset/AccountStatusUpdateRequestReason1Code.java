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
import com.tools20022.repository.codeset.AccountStatusUpdateRequestReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Sepcifes the reason for a request for a change to an account status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateRequestReason1Code#AccountClosureInstructionError
 * AccountStatusUpdateRequestReason1Code.AccountClosureInstructionError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateRequestReasonCode
 * AccountStatusUpdateRequestReasonCode}</li>
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
 * "AccountStatusUpdateRequestReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Sepcifes the reason for a request for a change to an account status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountStatusUpdateRequestReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusUpdateRequestReason1Code
	 * AccountStatusUpdateRequestReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountClosureInstructionError"</li>
	 * </ul>
	 */
	public static final AccountStatusUpdateRequestReason1Code AccountClosureInstructionError = new AccountStatusUpdateRequestReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountClosureInstructionError";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountStatusUpdateRequestReason1Code.mmObject();
			codeName = AccountStatusUpdateRequestReasonCode.AccountClosureInstructionError.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountStatusUpdateRequestReason1Code> codesByName = new LinkedHashMap<>();

	protected AccountStatusUpdateRequestReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatusUpdateRequestReason1Code";
				definition = "Sepcifes the reason for a request for a change to an account status.";
				trace_lazy = () -> AccountStatusUpdateRequestReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountStatusUpdateRequestReason1Code.AccountClosureInstructionError);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountClosureInstructionError.getCodeName().get(), AccountClosureInstructionError);
	}

	public static AccountStatusUpdateRequestReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountStatusUpdateRequestReason1Code[] values() {
		AccountStatusUpdateRequestReason1Code[] values = new AccountStatusUpdateRequestReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountStatusUpdateRequestReason1Code> {
		@Override
		public AccountStatusUpdateRequestReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountStatusUpdateRequestReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}