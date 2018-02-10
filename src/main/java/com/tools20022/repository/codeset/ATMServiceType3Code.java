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
import com.tools20022.repository.codeset.ATMServiceType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the type of inquiry selected by the customer or the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#AccountStatements
 * ATMServiceType3Code.AccountStatements}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#CardVerification
 * ATMServiceType3Code.CardVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#DynamicCurrencyConversion
 * ATMServiceType3Code.DynamicCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#ExchangeRateDeposit
 * ATMServiceType3Code.ExchangeRateDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#ExchangeRateWithdrawal
 * ATMServiceType3Code.ExchangeRateWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#SelectEMVApplication
 * ATMServiceType3Code.SelectEMVApplication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#CustomerProfile
 * ATMServiceType3Code.CustomerProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code#BalanceInquiry
 * ATMServiceType3Code.BalanceInquiry}</li>
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
 * "ATMServiceType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of inquiry selected by the customer or the ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatements"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code AccountStatements = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatements";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.AccountStatements.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerification"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code CardVerification = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.CardVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DynamicCurrencyConversion"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code DynamicCurrencyConversion = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DynamicCurrencyConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.DynamicCurrencyConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateDeposit"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code ExchangeRateDeposit = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.ExchangeRateDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRateWithdrawal"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code ExchangeRateWithdrawal = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRateWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.ExchangeRateWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelectEMVApplication"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code SelectEMVApplication = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelectEMVApplication";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.SelectEMVApplication.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerProfile"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code CustomerProfile = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerProfile";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerProfile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType3Code
	 * ATMServiceType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceInquiry"</li>
	 * </ul>
	 */
	public static final ATMServiceType3Code BalanceInquiry = new ATMServiceType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType3Code.mmObject();
			codeName = ATMServiceTypeCode.BalanceInquiry.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType3Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType3Code";
				definition = "Describes the type of inquiry selected by the customer or the ATM.";
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType3Code.AccountStatements, com.tools20022.repository.codeset.ATMServiceType3Code.CardVerification,
						com.tools20022.repository.codeset.ATMServiceType3Code.DynamicCurrencyConversion, com.tools20022.repository.codeset.ATMServiceType3Code.ExchangeRateDeposit,
						com.tools20022.repository.codeset.ATMServiceType3Code.ExchangeRateWithdrawal, com.tools20022.repository.codeset.ATMServiceType3Code.SelectEMVApplication,
						com.tools20022.repository.codeset.ATMServiceType3Code.CustomerProfile, com.tools20022.repository.codeset.ATMServiceType3Code.BalanceInquiry);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountStatements.getCodeName().get(), AccountStatements);
		codesByName.put(CardVerification.getCodeName().get(), CardVerification);
		codesByName.put(DynamicCurrencyConversion.getCodeName().get(), DynamicCurrencyConversion);
		codesByName.put(ExchangeRateDeposit.getCodeName().get(), ExchangeRateDeposit);
		codesByName.put(ExchangeRateWithdrawal.getCodeName().get(), ExchangeRateWithdrawal);
		codesByName.put(SelectEMVApplication.getCodeName().get(), SelectEMVApplication);
		codesByName.put(CustomerProfile.getCodeName().get(), CustomerProfile);
		codesByName.put(BalanceInquiry.getCodeName().get(), BalanceInquiry);
	}

	public static ATMServiceType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType3Code[] values() {
		ATMServiceType3Code[] values = new ATMServiceType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType3Code> {
		@Override
		public ATMServiceType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}