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
import com.tools20022.repository.codeset.ATMServiceType4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of service to be offered for a customer at an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#AccountStatements
 * ATMServiceType4Code.AccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#BalanceInquiry
 * ATMServiceType4Code.BalanceInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#Deposit
 * ATMServiceType4Code.Deposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#PINChange
 * ATMServiceType4Code.PINChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#StandardWithdrawal
 * ATMServiceType4Code.StandardWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#ProfileWithdrawal
 * ATMServiceType4Code.ProfileWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#PreAuthorisedWithdrawal
 * ATMServiceType4Code.PreAuthorisedWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code#ChosenWithdrawal
 * ATMServiceType4Code.ChosenWithdrawal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
 * ATMServiceTypeCode}</li>
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
 * "ATMServiceType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of service to be offered for a customer at an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code AccountStatements = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.AccountStatements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code BalanceInquiry = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.BalanceInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code Deposit = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.Deposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChange"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code PINChange = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChange";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.PINChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code StandardWithdrawal = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.StandardWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code ProfileWithdrawal = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.ProfileWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAuthorisedWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code PreAuthorisedWithdrawal = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAuthorisedWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.PreAuthorisedWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType4Code
	 * ATMServiceType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChosenWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType4Code ChosenWithdrawal = new ATMServiceType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChosenWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType4Code.mmObject();
			codeName = ATMServiceTypeCode.ChosenWithdrawal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType4Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType4Code";
				definition = "Type of service to be offered for a customer at an ATM.";
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType4Code.AccountStatements, com.tools20022.repository.codeset.ATMServiceType4Code.BalanceInquiry,
						com.tools20022.repository.codeset.ATMServiceType4Code.Deposit, com.tools20022.repository.codeset.ATMServiceType4Code.PINChange, com.tools20022.repository.codeset.ATMServiceType4Code.StandardWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType4Code.ProfileWithdrawal, com.tools20022.repository.codeset.ATMServiceType4Code.PreAuthorisedWithdrawal,
						com.tools20022.repository.codeset.ATMServiceType4Code.ChosenWithdrawal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountStatements.getCodeName().get(), AccountStatements);
		codesByName.put(BalanceInquiry.getCodeName().get(), BalanceInquiry);
		codesByName.put(Deposit.getCodeName().get(), Deposit);
		codesByName.put(PINChange.getCodeName().get(), PINChange);
		codesByName.put(StandardWithdrawal.getCodeName().get(), StandardWithdrawal);
		codesByName.put(ProfileWithdrawal.getCodeName().get(), ProfileWithdrawal);
		codesByName.put(PreAuthorisedWithdrawal.getCodeName().get(), PreAuthorisedWithdrawal);
		codesByName.put(ChosenWithdrawal.getCodeName().get(), ChosenWithdrawal);
	}

	public static ATMServiceType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType4Code[] values() {
		ATMServiceType4Code[] values = new ATMServiceType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType4Code> {
		@Override
		public ATMServiceType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}