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
import com.tools20022.repository.codeset.CashAccountType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CashPayment
 * CashAccountType4Code.CashPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Charges
 * CashAccountType4Code.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Commission
 * CashAccountType4Code.Commission}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Tax
 * CashAccountType4Code.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CashIncome
 * CashAccountType4Code.CashIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#CashTrading
 * CashAccountType4Code.CashTrading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Settlement
 * CashAccountType4Code.Settlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Current
 * CashAccountType4Code.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Savings
 * CashAccountType4Code.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#OverNightDeposit
 * CashAccountType4Code.OverNightDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#MarginalLending
 * CashAccountType4Code.MarginalLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#NonResidentExternal
 * CashAccountType4Code.NonResidentExternal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#MoneyMarket
 * CashAccountType4Code.MoneyMarket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Loan
 * CashAccountType4Code.Loan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Salary
 * CashAccountType4Code.Salary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code#Overdraft
 * CashAccountType4Code.Overdraft}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashAccountType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature, or use, of the cash account."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashAccountType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CashPayment = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.CashPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Charges = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Charges.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Commission = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commission";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Commission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Tax = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Tax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CashIncome = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncome";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.CashIncome.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code CashTrading = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashTrading";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.CashTrading.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Settlement = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Settlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Current = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Savings = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Savings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverNightDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code OverNightDeposit = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverNightDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.OverNightDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginalLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code MarginalLending = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginalLending";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.MarginalLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentExternal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code NonResidentExternal = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentExternal";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.NonResidentExternal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code MoneyMarket = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.MoneyMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Loan = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Loan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Salary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Salary = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Salary";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Salary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashAccountType4Code
	 * CashAccountType4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Overdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CashAccountType4Code Overdraft = new CashAccountType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Overdraft";
			owner_lazy = () -> com.tools20022.repository.codeset.CashAccountType4Code.mmObject();
			codeName = CashAccountTypeCode.Overdraft.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CashAccountType4Code> codesByName = new LinkedHashMap<>();

	protected CashAccountType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashAccountType4Code";
				definition = "Specifies the nature, or use, of the cash account.";
				trace_lazy = () -> CashAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashAccountType4Code.CashPayment, com.tools20022.repository.codeset.CashAccountType4Code.Charges,
						com.tools20022.repository.codeset.CashAccountType4Code.Commission, com.tools20022.repository.codeset.CashAccountType4Code.Tax, com.tools20022.repository.codeset.CashAccountType4Code.CashIncome,
						com.tools20022.repository.codeset.CashAccountType4Code.CashTrading, com.tools20022.repository.codeset.CashAccountType4Code.Settlement, com.tools20022.repository.codeset.CashAccountType4Code.Current,
						com.tools20022.repository.codeset.CashAccountType4Code.Savings, com.tools20022.repository.codeset.CashAccountType4Code.OverNightDeposit, com.tools20022.repository.codeset.CashAccountType4Code.MarginalLending,
						com.tools20022.repository.codeset.CashAccountType4Code.NonResidentExternal, com.tools20022.repository.codeset.CashAccountType4Code.MoneyMarket, com.tools20022.repository.codeset.CashAccountType4Code.Loan,
						com.tools20022.repository.codeset.CashAccountType4Code.Salary, com.tools20022.repository.codeset.CashAccountType4Code.Overdraft);
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
		codesByName.put(NonResidentExternal.getCodeName().get(), NonResidentExternal);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(Loan.getCodeName().get(), Loan);
		codesByName.put(Salary.getCodeName().get(), Salary);
		codesByName.put(Overdraft.getCodeName().get(), Overdraft);
	}

	public static CashAccountType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashAccountType4Code[] values() {
		CashAccountType4Code[] values = new CashAccountType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashAccountType4Code> {
		@Override
		public CashAccountType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashAccountType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}