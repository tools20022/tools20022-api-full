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
import com.tools20022.repository.codeset.BalanceType13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the kind of the balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code#Investments
 * BalanceType13Code.Investments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code#CashAndCashEquivalents
 * BalanceType13Code.CashAndCashEquivalents}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code#Borrowings
 * BalanceType13Code.Borrowings}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType13Code#Revenues
 * BalanceType13Code.Revenues}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType13Code#Expenses
 * BalanceType13Code.Expenses}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code#InvestorInflowOutflow
 * BalanceType13Code.InvestorInflowOutflow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType13Code#Other
 * BalanceType13Code.Other}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType13Code#Payables
 * BalanceType13Code.Payables}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code#Receivables
 * BalanceType13Code.Receivables}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INVE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceType13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the kind of the balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceType13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investments"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Investments = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investments";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Investments.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndCashEquivalents"</li>
	 * </ul>
	 */
	public static final BalanceType13Code CashAndCashEquivalents = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndCashEquivalents";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.CashAndCashEquivalents.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Borrowings"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Borrowings = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Borrowings";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Borrowings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Revenues"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Revenues = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Revenues";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Revenues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expenses"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Expenses = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expenses";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Expenses.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorInflowOutflow"</li>
	 * </ul>
	 */
	public static final BalanceType13Code InvestorInflowOutflow = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorInflowOutflow";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.InvestorInflowOutflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Other = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payables"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Payables = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payables";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Payables.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType13Code
	 * BalanceType13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Receivables"</li>
	 * </ul>
	 */
	public static final BalanceType13Code Receivables = new BalanceType13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Receivables";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType13Code.mmObject();
			codeName = BalanceTypeCode.Receivables.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceType13Code> codesByName = new LinkedHashMap<>();

	protected BalanceType13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INVE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceType13Code";
				definition = "Specifies the kind of the balance.";
				trace_lazy = () -> BalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceType13Code.Investments, com.tools20022.repository.codeset.BalanceType13Code.CashAndCashEquivalents,
						com.tools20022.repository.codeset.BalanceType13Code.Borrowings, com.tools20022.repository.codeset.BalanceType13Code.Revenues, com.tools20022.repository.codeset.BalanceType13Code.Expenses,
						com.tools20022.repository.codeset.BalanceType13Code.InvestorInflowOutflow, com.tools20022.repository.codeset.BalanceType13Code.Other, com.tools20022.repository.codeset.BalanceType13Code.Payables,
						com.tools20022.repository.codeset.BalanceType13Code.Receivables);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Investments.getCodeName().get(), Investments);
		codesByName.put(CashAndCashEquivalents.getCodeName().get(), CashAndCashEquivalents);
		codesByName.put(Borrowings.getCodeName().get(), Borrowings);
		codesByName.put(Revenues.getCodeName().get(), Revenues);
		codesByName.put(Expenses.getCodeName().get(), Expenses);
		codesByName.put(InvestorInflowOutflow.getCodeName().get(), InvestorInflowOutflow);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Payables.getCodeName().get(), Payables);
		codesByName.put(Receivables.getCodeName().get(), Receivables);
	}

	public static BalanceType13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceType13Code[] values() {
		BalanceType13Code[] values = new BalanceType13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceType13Code> {
		@Override
		public BalanceType13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceType13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}