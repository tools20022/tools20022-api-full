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
import com.tools20022.repository.codeset.AccountManagementStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of an account management instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code#Received
 * AccountManagementStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code#Accepted
 * AccountManagementStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code#ProcessingOngoing
 * AccountManagementStatus1Code.ProcessingOngoing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code#SentToNextParty
 * AccountManagementStatus1Code.SentToNextParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
 * AccountManagementStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RECE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountManagementStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of an account management instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountManagementStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code
	 * AccountManagementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final AccountManagementStatus1Code Received = new AccountManagementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatus1Code.mmObject();
			codeName = AccountManagementStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code
	 * AccountManagementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final AccountManagementStatus1Code Accepted = new AccountManagementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatus1Code.mmObject();
			codeName = AccountManagementStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code
	 * AccountManagementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOngoing"</li>
	 * </ul>
	 */
	public static final AccountManagementStatus1Code ProcessingOngoing = new AccountManagementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOngoing";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatus1Code.mmObject();
			codeName = AccountManagementStatusCode.ProcessingOngoing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatus1Code
	 * AccountManagementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToNextParty"</li>
	 * </ul>
	 */
	public static final AccountManagementStatus1Code SentToNextParty = new AccountManagementStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToNextParty";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountManagementStatus1Code.mmObject();
			codeName = AccountManagementStatusCode.SentToNextParty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountManagementStatus1Code> codesByName = new LinkedHashMap<>();

	protected AccountManagementStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RECE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountManagementStatus1Code";
				definition = "Specifies the status of an account management instruction.";
				trace_lazy = () -> AccountManagementStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountManagementStatus1Code.Received, com.tools20022.repository.codeset.AccountManagementStatus1Code.Accepted,
						com.tools20022.repository.codeset.AccountManagementStatus1Code.ProcessingOngoing, com.tools20022.repository.codeset.AccountManagementStatus1Code.SentToNextParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(ProcessingOngoing.getCodeName().get(), ProcessingOngoing);
		codesByName.put(SentToNextParty.getCodeName().get(), SentToNextParty);
	}

	public static AccountManagementStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountManagementStatus1Code[] values() {
		AccountManagementStatus1Code[] values = new AccountManagementStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountManagementStatus1Code> {
		@Override
		public AccountManagementStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountManagementStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}