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
import com.tools20022.repository.codeset.AccountUsageType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of usage of the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code#Investor
 * AccountUsageType2Code.Investor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code#IssuingParticipant
 * AccountUsageType2Code.IssuingParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code#SettlementParticipant
 * AccountUsageType2Code.SettlementParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code#TradingParticipant
 * AccountUsageType2Code.TradingParticipant}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountUsageTypeCode
 * AccountUsageTypeCode}</li>
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
 * "AccountUsageType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of usage of the account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountUsageType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code
	 * AccountUsageType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investor"</li>
	 * </ul>
	 */
	public static final AccountUsageType2Code Investor = new AccountUsageType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investor";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageType2Code.mmObject();
			codeName = AccountUsageTypeCode.Investor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code
	 * AccountUsageType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingParticipant"</li>
	 * </ul>
	 */
	public static final AccountUsageType2Code IssuingParticipant = new AccountUsageType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageType2Code.mmObject();
			codeName = AccountUsageTypeCode.IssuingParticipant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code
	 * AccountUsageType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParticipant"</li>
	 * </ul>
	 */
	public static final AccountUsageType2Code SettlementParticipant = new AccountUsageType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageType2Code.mmObject();
			codeName = AccountUsageTypeCode.SettlementParticipant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountUsageType2Code
	 * AccountUsageType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParticipant"</li>
	 * </ul>
	 */
	public static final AccountUsageType2Code TradingParticipant = new AccountUsageType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParticipant";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountUsageType2Code.mmObject();
			codeName = AccountUsageTypeCode.TradingParticipant.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountUsageType2Code> codesByName = new LinkedHashMap<>();

	protected AccountUsageType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountUsageType2Code";
				definition = "Specifies the type of usage of the account.";
				trace_lazy = () -> AccountUsageTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountUsageType2Code.Investor, com.tools20022.repository.codeset.AccountUsageType2Code.IssuingParticipant,
						com.tools20022.repository.codeset.AccountUsageType2Code.SettlementParticipant, com.tools20022.repository.codeset.AccountUsageType2Code.TradingParticipant);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Investor.getCodeName().get(), Investor);
		codesByName.put(IssuingParticipant.getCodeName().get(), IssuingParticipant);
		codesByName.put(SettlementParticipant.getCodeName().get(), SettlementParticipant);
		codesByName.put(TradingParticipant.getCodeName().get(), TradingParticipant);
	}

	public static AccountUsageType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountUsageType2Code[] values() {
		AccountUsageType2Code[] values = new AccountUsageType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountUsageType2Code> {
		@Override
		public AccountUsageType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountUsageType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}