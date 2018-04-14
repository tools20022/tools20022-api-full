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
import com.tools20022.repository.codeset.CardAccountType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of cardholder account used for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#CertificateOfDeposit
 * CardAccountType2Code.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Checking
 * CardAccountType2Code.Checking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#CreditCard
 * CardAccountType2Code.CreditCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Current
 * CardAccountType2Code.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#DebitCard
 * CardAccountType2Code.DebitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Default
 * CardAccountType2Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#EpurseCard
 * CardAccountType2Code.EpurseCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#HomeEquityLoan
 * CardAccountType2Code.HomeEquityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#InstalmentLoan
 * CardAccountType2Code.InstalmentLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Investment
 * CardAccountType2Code.Investment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#LineOfCredit
 * CardAccountType2Code.LineOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MobilePhoneAccount
 * CardAccountType2Code.MobilePhoneAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MoneyMarket
 * CardAccountType2Code.MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MoneyMarketChecking
 * CardAccountType2Code.MoneyMarketChecking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MortgageLoan
 * CardAccountType2Code.MortgageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#RetirementAccount
 * CardAccountType2Code.RetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#RevolvingLoanAccount
 * CardAccountType2Code.RevolvingLoanAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Savings
 * CardAccountType2Code.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#StockOrBond
 * CardAccountType2Code.StockOrBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Universal
 * CardAccountType2Code.Universal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardAccountTypeCode
 * CardAccountTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAccountType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cardholder account used for the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardAccountType3Code
 * CardAccountType3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardAccountType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
	 * CardAccountType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#CertificateOfDeposit
	 * CardAccountType3Code.CertificateOfDeposit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code CertificateOfDeposit = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.CertificateOfDeposit);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.CertificateOfDeposit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Checking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Checking
	 * CardAccountType3Code.Checking}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Checking = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Checking";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Checking);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Checking.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#CreditCard
	 * CardAccountType3Code.CreditCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code CreditCard = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCard";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.CreditCard);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.CreditCard.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Current
	 * CardAccountType3Code.Current}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Current = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Current);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Current.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#DebitCard
	 * CardAccountType3Code.DebitCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code DebitCard = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCard";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.DebitCard);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.DebitCard.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Default
	 * CardAccountType3Code.Default}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Default = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Default);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Default.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EpurseCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#EpurseCard
	 * CardAccountType3Code.EpurseCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code EpurseCard = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EpurseCard";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.EpurseCard);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.EpurseCard.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#HomeEquityLoan
	 * CardAccountType3Code.HomeEquityLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code HomeEquityLoan = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoan";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.HomeEquityLoan);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.HomeEquityLoan.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#InstalmentLoan
	 * CardAccountType3Code.InstalmentLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code InstalmentLoan = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentLoan";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.InstalmentLoan);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.InstalmentLoan.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Investment
	 * CardAccountType3Code.Investment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Investment = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investment";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Investment);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Investment.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#LineOfCredit
	 * CardAccountType3Code.LineOfCredit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code LineOfCredit = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineOfCredit";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.LineOfCredit);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.LineOfCredit.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePhoneAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MobilePhoneAccount
	 * CardAccountType3Code.MobilePhoneAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code MobilePhoneAccount = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePhoneAccount";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.MobilePhoneAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.MobilePhoneAccount.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MoneyMarket
	 * CardAccountType3Code.MoneyMarket}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code MoneyMarket = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.MoneyMarket);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.MoneyMarket.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarketChecking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MoneyMarketChecking
	 * CardAccountType3Code.MoneyMarketChecking}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code MoneyMarketChecking = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarketChecking";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.MoneyMarketChecking);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.MoneyMarketChecking.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MortgageLoan
	 * CardAccountType3Code.MortgageLoan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code MortgageLoan = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageLoan";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.MortgageLoan);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.MortgageLoan.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#RetirementAccount
	 * CardAccountType3Code.RetirementAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code RetirementAccount = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementAccount";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.RetirementAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.RetirementAccount.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolvingLoanAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#RevolvingLoanAccount
	 * CardAccountType3Code.RevolvingLoanAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code RevolvingLoanAccount = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevolvingLoanAccount";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.RevolvingLoanAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.RevolvingLoanAccount.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Savings
	 * CardAccountType3Code.Savings}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Savings = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Savings);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Savings.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockOrBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#StockOrBond
	 * CardAccountType3Code.StockOrBond}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code StockOrBond = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockOrBond";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.StockOrBond);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.StockOrBond.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Universal
	 * CardAccountType3Code.Universal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CardAccountType2Code Universal = new CardAccountType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Universal";
			nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.Universal);
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType2Code.mmObject();
			codeName = CardAccountTypeCode.Universal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardAccountType2Code> codesByName = new LinkedHashMap<>();

	protected CardAccountType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccountType2Code";
				definition = "Type of cardholder account used for the transaction.";
				nextVersions_lazy = () -> Arrays.asList(CardAccountType3Code.mmObject());
				trace_lazy = () -> CardAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType2Code.CertificateOfDeposit, com.tools20022.repository.codeset.CardAccountType2Code.Checking,
						com.tools20022.repository.codeset.CardAccountType2Code.CreditCard, com.tools20022.repository.codeset.CardAccountType2Code.Current, com.tools20022.repository.codeset.CardAccountType2Code.DebitCard,
						com.tools20022.repository.codeset.CardAccountType2Code.Default, com.tools20022.repository.codeset.CardAccountType2Code.EpurseCard, com.tools20022.repository.codeset.CardAccountType2Code.HomeEquityLoan,
						com.tools20022.repository.codeset.CardAccountType2Code.InstalmentLoan, com.tools20022.repository.codeset.CardAccountType2Code.Investment, com.tools20022.repository.codeset.CardAccountType2Code.LineOfCredit,
						com.tools20022.repository.codeset.CardAccountType2Code.MobilePhoneAccount, com.tools20022.repository.codeset.CardAccountType2Code.MoneyMarket,
						com.tools20022.repository.codeset.CardAccountType2Code.MoneyMarketChecking, com.tools20022.repository.codeset.CardAccountType2Code.MortgageLoan,
						com.tools20022.repository.codeset.CardAccountType2Code.RetirementAccount, com.tools20022.repository.codeset.CardAccountType2Code.RevolvingLoanAccount, com.tools20022.repository.codeset.CardAccountType2Code.Savings,
						com.tools20022.repository.codeset.CardAccountType2Code.StockOrBond, com.tools20022.repository.codeset.CardAccountType2Code.Universal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CertificateOfDeposit.getCodeName().get(), CertificateOfDeposit);
		codesByName.put(Checking.getCodeName().get(), Checking);
		codesByName.put(CreditCard.getCodeName().get(), CreditCard);
		codesByName.put(Current.getCodeName().get(), Current);
		codesByName.put(DebitCard.getCodeName().get(), DebitCard);
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(EpurseCard.getCodeName().get(), EpurseCard);
		codesByName.put(HomeEquityLoan.getCodeName().get(), HomeEquityLoan);
		codesByName.put(InstalmentLoan.getCodeName().get(), InstalmentLoan);
		codesByName.put(Investment.getCodeName().get(), Investment);
		codesByName.put(LineOfCredit.getCodeName().get(), LineOfCredit);
		codesByName.put(MobilePhoneAccount.getCodeName().get(), MobilePhoneAccount);
		codesByName.put(MoneyMarket.getCodeName().get(), MoneyMarket);
		codesByName.put(MoneyMarketChecking.getCodeName().get(), MoneyMarketChecking);
		codesByName.put(MortgageLoan.getCodeName().get(), MortgageLoan);
		codesByName.put(RetirementAccount.getCodeName().get(), RetirementAccount);
		codesByName.put(RevolvingLoanAccount.getCodeName().get(), RevolvingLoanAccount);
		codesByName.put(Savings.getCodeName().get(), Savings);
		codesByName.put(StockOrBond.getCodeName().get(), StockOrBond);
		codesByName.put(Universal.getCodeName().get(), Universal);
	}

	public static CardAccountType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardAccountType2Code[] values() {
		CardAccountType2Code[] values = new CardAccountType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardAccountType2Code> {
		@Override
		public CardAccountType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardAccountType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}