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
import com.tools20022.repository.codeset.CashAccountType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature, or use, of the cash account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#CashPayment
 * CashAccountType2Code.CashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Charges
 * CashAccountType2Code.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Commission
 * CashAccountType2Code.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Tax
 * CashAccountType2Code.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#CashIncome
 * CashAccountType2Code.CashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#CashTrading
 * CashAccountType2Code.CashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Settlement
 * CashAccountType2Code.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Current
 * CashAccountType2Code.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#Savings
 * CashAccountType2Code.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#OverNightDeposit
 * CashAccountType2Code.OverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code#MarginalLending
 * CashAccountType2Code.MarginalLending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CashAccountTypeCode
 * CashAccountTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature, or use, of the cash account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPayment"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code CashPayment = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.CashPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Charges = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Charges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Commission = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Tax = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Tax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncome"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code CashIncome = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.CashIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTrading"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code CashTrading = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashTrading";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.CashTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Settlement = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Settlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Current = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code Savings = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.Savings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNightDeposit"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code OverNightDeposit = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverNightDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.OverNightDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType2Code
	 * CashAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * </ul>
	 */
	public static final CashAccountType2Code MarginalLending = new CashAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginalLending";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType2Code.mmObject();
			codeName = CashAccountTypeCode.MarginalLending.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashAccountType2Code> codesByName = new LinkedHashMap<>();

	protected CashAccountType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountType2Code";
				definition = "Specifies the nature, or use, of the cash account.";
				trace_lazy = () -> CashAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashAccountType2Code.CashPayment, com.tools20022.repository.codeset.CashAccountType2Code.Charges,
						com.tools20022.repository.codeset.CashAccountType2Code.Commission, com.tools20022.repository.codeset.CashAccountType2Code.Tax, com.tools20022.repository.codeset.CashAccountType2Code.CashIncome,
						com.tools20022.repository.codeset.CashAccountType2Code.CashTrading, com.tools20022.repository.codeset.CashAccountType2Code.Settlement, com.tools20022.repository.codeset.CashAccountType2Code.Current,
						com.tools20022.repository.codeset.CashAccountType2Code.Savings, com.tools20022.repository.codeset.CashAccountType2Code.OverNightDeposit, com.tools20022.repository.codeset.CashAccountType2Code.MarginalLending);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CashPayment.getCodeName().get(), CashPayment);
		codesByName.put(Charges.getCodeName().get(), Charges);
		codesByName.put(Commission.getCodeName().get(), Commission);
		codesByName.put(Tax.getCodeName().get(), Tax);
		codesByName.put(CashIncome.getCodeName().get(), CashIncome);
		codesByName.put(CashTrading.getCodeName().get(), CashTrading);
		codesByName.put(Settlement.getCodeName().get(), Settlement);
		codesByName.put(Current.getCodeName().get(), Current);
		codesByName.put(Savings.getCodeName().get(), Savings);
		codesByName.put(OverNightDeposit.getCodeName().get(), OverNightDeposit);
		codesByName.put(MarginalLending.getCodeName().get(), MarginalLending);
	}

	public static CashAccountType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountType2Code[] values() {
		CashAccountType2Code[] values = new CashAccountType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountType2Code> {
		@Override
		public CashAccountType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}