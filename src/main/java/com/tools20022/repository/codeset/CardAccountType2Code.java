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
import com.tools20022.repository.codeset.CardAccountTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of cardholder account used for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
 * CardAccountTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmCertificateOfDeposit
 * CardAccountType2Code.mmCertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmChecking
 * CardAccountType2Code.mmChecking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmCreditCard
 * CardAccountType2Code.mmCreditCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmCurrent
 * CardAccountType2Code.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmDebitCard
 * CardAccountType2Code.mmDebitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmDefault
 * CardAccountType2Code.mmDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmEpurseCard
 * CardAccountType2Code.mmEpurseCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmHomeEquityLoan
 * CardAccountType2Code.mmHomeEquityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmInstalmentLoan
 * CardAccountType2Code.mmInstalmentLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmInvestment
 * CardAccountType2Code.mmInvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmLineOfCredit
 * CardAccountType2Code.mmLineOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmMobilePhoneAccount
 * CardAccountType2Code.mmMobilePhoneAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmMoneyMarket
 * CardAccountType2Code.mmMoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmMoneyMarketChecking
 * CardAccountType2Code.mmMoneyMarketChecking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmMortgageLoan
 * CardAccountType2Code.mmMortgageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmRetirementAccount
 * CardAccountType2Code.mmRetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmRevolvingLoanAccount
 * CardAccountType2Code.mmRevolvingLoanAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmSavings
 * CardAccountType2Code.mmSavings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmStockOrBond
 * CardAccountType2Code.mmStockOrBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#mmUniversal
 * CardAccountType2Code.mmUniversal}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAccountType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cardholder account used for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardAccountType3Code
 * CardAccountType3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CardAccountType2Code extends CardAccountTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmCertificateOfDeposit
	 * CardAccountType3Code.mmCertificateOfDeposit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCertificateOfDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmCertificateOfDeposit);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Checking"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmChecking
	 * CardAccountType3Code.mmChecking}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChecking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Checking";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmChecking);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmCreditCard
	 * CardAccountType3Code.mmCreditCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCreditCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCard";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmCreditCard);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmCurrent
	 * CardAccountType3Code.mmCurrent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmCurrent);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmDebitCard
	 * CardAccountType3Code.mmDebitCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDebitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCard";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmDebitCard);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmDefault
	 * CardAccountType3Code.mmDefault}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmDefault);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EpurseCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmEpurseCard
	 * CardAccountType3Code.mmEpurseCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmEpurseCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EpurseCard";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmEpurseCard);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmHomeEquityLoan
	 * CardAccountType3Code.mmHomeEquityLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmHomeEquityLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoan";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmHomeEquityLoan);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentLoan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmInstalmentLoan
	 * CardAccountType3Code.mmInstalmentLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstalmentLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentLoan";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmInstalmentLoan);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmInvestment
	 * CardAccountType3Code.mmInvestment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmInvestment);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfCredit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmLineOfCredit
	 * CardAccountType3Code.mmLineOfCredit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLineOfCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineOfCredit";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmLineOfCredit);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePhoneAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmMobilePhoneAccount
	 * CardAccountType3Code.mmMobilePhoneAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMobilePhoneAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePhoneAccount";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmMobilePhoneAccount);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmMoneyMarket
	 * CardAccountType3Code.mmMoneyMarket}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMoneyMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmMoneyMarket);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarketChecking"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmMoneyMarketChecking
	 * CardAccountType3Code.mmMoneyMarketChecking}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMoneyMarketChecking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarketChecking";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmMoneyMarketChecking);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageLoan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmMortgageLoan
	 * CardAccountType3Code.mmMortgageLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMortgageLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageLoan";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmMortgageLoan);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmRetirementAccount
	 * CardAccountType3Code.mmRetirementAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRetirementAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementAccount";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmRetirementAccount);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolvingLoanAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmRevolvingLoanAccount
	 * CardAccountType3Code.mmRevolvingLoanAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRevolvingLoanAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevolvingLoanAccount";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmRevolvingLoanAccount);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmSavings
	 * CardAccountType3Code.mmSavings}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSavings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmSavings);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockOrBond"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmStockOrBond
	 * CardAccountType3Code.mmStockOrBond}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStockOrBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockOrBond";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmStockOrBond);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#mmUniversal
	 * CardAccountType3Code.mmUniversal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUniversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Universal";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.mmUniversal);
			owner_lazy = () -> CardAccountType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardAccountType2Code";
				definition = "Type of cardholder account used for the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType2Code.mmCertificateOfDeposit, com.tools20022.repository.codeset.CardAccountType2Code.mmChecking,
						com.tools20022.repository.codeset.CardAccountType2Code.mmCreditCard, com.tools20022.repository.codeset.CardAccountType2Code.mmCurrent, com.tools20022.repository.codeset.CardAccountType2Code.mmDebitCard,
						com.tools20022.repository.codeset.CardAccountType2Code.mmDefault, com.tools20022.repository.codeset.CardAccountType2Code.mmEpurseCard, com.tools20022.repository.codeset.CardAccountType2Code.mmHomeEquityLoan,
						com.tools20022.repository.codeset.CardAccountType2Code.mmInstalmentLoan, com.tools20022.repository.codeset.CardAccountType2Code.mmInvestment, com.tools20022.repository.codeset.CardAccountType2Code.mmLineOfCredit,
						com.tools20022.repository.codeset.CardAccountType2Code.mmMobilePhoneAccount, com.tools20022.repository.codeset.CardAccountType2Code.mmMoneyMarket,
						com.tools20022.repository.codeset.CardAccountType2Code.mmMoneyMarketChecking, com.tools20022.repository.codeset.CardAccountType2Code.mmMortgageLoan,
						com.tools20022.repository.codeset.CardAccountType2Code.mmRetirementAccount, com.tools20022.repository.codeset.CardAccountType2Code.mmRevolvingLoanAccount,
						com.tools20022.repository.codeset.CardAccountType2Code.mmSavings, com.tools20022.repository.codeset.CardAccountType2Code.mmStockOrBond, com.tools20022.repository.codeset.CardAccountType2Code.mmUniversal);
				trace_lazy = () -> CardAccountTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}