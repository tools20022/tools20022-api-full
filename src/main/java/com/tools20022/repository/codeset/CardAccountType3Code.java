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
import com.tools20022.repository.codeset.CardAccountType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#CertificateOfDeposit
 * CardAccountType3Code.CertificateOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Checking
 * CardAccountType3Code.Checking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#CreditCard
 * CardAccountType3Code.CreditCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Current
 * CardAccountType3Code.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#DebitCard
 * CardAccountType3Code.DebitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Default
 * CardAccountType3Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#EpurseCard
 * CardAccountType3Code.EpurseCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#HomeEquityLoan
 * CardAccountType3Code.HomeEquityLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#InstalmentLoan
 * CardAccountType3Code.InstalmentLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Investment
 * CardAccountType3Code.Investment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#LineOfCredit
 * CardAccountType3Code.LineOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MobilePhoneAccount
 * CardAccountType3Code.MobilePhoneAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MoneyMarket
 * CardAccountType3Code.MoneyMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MoneyMarketChecking
 * CardAccountType3Code.MoneyMarketChecking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#MortgageLoan
 * CardAccountType3Code.MortgageLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#RetirementAccount
 * CardAccountType3Code.RetirementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#RevolvingLoanAccount
 * CardAccountType3Code.RevolvingLoanAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Savings
 * CardAccountType3Code.Savings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#StockOrBond
 * CardAccountType3Code.StockOrBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#Universal
 * CardAccountType3Code.Universal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#PrePaid
 * CardAccountType3Code.PrePaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code#FleetCard
 * CardAccountType3Code.FleetCard}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardAccountType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of cardholder account used for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code
 * CardAccountType2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardAccountType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#CertificateOfDeposit
	 * CardAccountType2Code.CertificateOfDeposit}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code CertificateOfDeposit = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateOfDeposit";
			previousVersion_lazy = () -> CardAccountType2Code.CertificateOfDeposit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.CertificateOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Checking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Checking
	 * CardAccountType2Code.Checking}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Checking = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Checking";
			previousVersion_lazy = () -> CardAccountType2Code.Checking;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Checking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#CreditCard
	 * CardAccountType2Code.CreditCard}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code CreditCard = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditCard";
			previousVersion_lazy = () -> CardAccountType2Code.CreditCard;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.CreditCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Current
	 * CardAccountType2Code.Current}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Current = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			previousVersion_lazy = () -> CardAccountType2Code.Current;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#DebitCard
	 * CardAccountType2Code.DebitCard}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code DebitCard = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitCard";
			previousVersion_lazy = () -> CardAccountType2Code.DebitCard;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.DebitCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Default
	 * CardAccountType2Code.Default}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Default = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			previousVersion_lazy = () -> CardAccountType2Code.Default;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EpurseCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#EpurseCard
	 * CardAccountType2Code.EpurseCard}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code EpurseCard = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EpurseCard";
			previousVersion_lazy = () -> CardAccountType2Code.EpurseCard;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.EpurseCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#HomeEquityLoan
	 * CardAccountType2Code.HomeEquityLoan}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code HomeEquityLoan = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityLoan";
			previousVersion_lazy = () -> CardAccountType2Code.HomeEquityLoan;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.HomeEquityLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#InstalmentLoan
	 * CardAccountType2Code.InstalmentLoan}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code InstalmentLoan = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentLoan";
			previousVersion_lazy = () -> CardAccountType2Code.InstalmentLoan;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.InstalmentLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Investment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Investment
	 * CardAccountType2Code.Investment}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Investment = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Investment";
			previousVersion_lazy = () -> CardAccountType2Code.Investment;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Investment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineOfCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#LineOfCredit
	 * CardAccountType2Code.LineOfCredit}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code LineOfCredit = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineOfCredit";
			previousVersion_lazy = () -> CardAccountType2Code.LineOfCredit;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.LineOfCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MobilePhoneAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MobilePhoneAccount
	 * CardAccountType2Code.MobilePhoneAccount}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code MobilePhoneAccount = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MobilePhoneAccount";
			previousVersion_lazy = () -> CardAccountType2Code.MobilePhoneAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.MobilePhoneAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MoneyMarket
	 * CardAccountType2Code.MoneyMarket}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code MoneyMarket = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarket";
			previousVersion_lazy = () -> CardAccountType2Code.MoneyMarket;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.MoneyMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyMarketChecking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MoneyMarketChecking
	 * CardAccountType2Code.MoneyMarketChecking}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code MoneyMarketChecking = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyMarketChecking";
			previousVersion_lazy = () -> CardAccountType2Code.MoneyMarketChecking;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.MoneyMarketChecking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageLoan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#MortgageLoan
	 * CardAccountType2Code.MortgageLoan}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code MortgageLoan = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageLoan";
			previousVersion_lazy = () -> CardAccountType2Code.MortgageLoan;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.MortgageLoan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetirementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#RetirementAccount
	 * CardAccountType2Code.RetirementAccount}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code RetirementAccount = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RetirementAccount";
			previousVersion_lazy = () -> CardAccountType2Code.RetirementAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.RetirementAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevolvingLoanAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#RevolvingLoanAccount
	 * CardAccountType2Code.RevolvingLoanAccount}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code RevolvingLoanAccount = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevolvingLoanAccount";
			previousVersion_lazy = () -> CardAccountType2Code.RevolvingLoanAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.RevolvingLoanAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Savings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Savings
	 * CardAccountType2Code.Savings}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Savings = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Savings";
			previousVersion_lazy = () -> CardAccountType2Code.Savings;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Savings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockOrBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#StockOrBond
	 * CardAccountType2Code.StockOrBond}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code StockOrBond = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockOrBond";
			previousVersion_lazy = () -> CardAccountType2Code.StockOrBond;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.StockOrBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType2Code#Universal
	 * CardAccountType2Code.Universal}</li>
	 * </ul>
	 */
	public static final CardAccountType3Code Universal = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Universal";
			previousVersion_lazy = () -> CardAccountType2Code.Universal;
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.Universal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrePaid"</li>
	 * </ul>
	 */
	public static final CardAccountType3Code PrePaid = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrePaid";
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.PrePaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardAccountType3Code
	 * CardAccountType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FleetCard"</li>
	 * </ul>
	 */
	public static final CardAccountType3Code FleetCard = new CardAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FleetCard";
			owner_lazy = () -> com.tools20022.repository.codeset.CardAccountType3Code.mmObject();
			codeName = CardAccountTypeCode.FleetCard.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardAccountType3Code> codesByName = new LinkedHashMap<>();

	protected CardAccountType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardAccountType3Code";
				definition = "Type of cardholder account used for the transaction.";
				previousVersion_lazy = () -> CardAccountType2Code.mmObject();
				trace_lazy = () -> CardAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardAccountType3Code.CertificateOfDeposit, com.tools20022.repository.codeset.CardAccountType3Code.Checking,
						com.tools20022.repository.codeset.CardAccountType3Code.CreditCard, com.tools20022.repository.codeset.CardAccountType3Code.Current, com.tools20022.repository.codeset.CardAccountType3Code.DebitCard,
						com.tools20022.repository.codeset.CardAccountType3Code.Default, com.tools20022.repository.codeset.CardAccountType3Code.EpurseCard, com.tools20022.repository.codeset.CardAccountType3Code.HomeEquityLoan,
						com.tools20022.repository.codeset.CardAccountType3Code.InstalmentLoan, com.tools20022.repository.codeset.CardAccountType3Code.Investment, com.tools20022.repository.codeset.CardAccountType3Code.LineOfCredit,
						com.tools20022.repository.codeset.CardAccountType3Code.MobilePhoneAccount, com.tools20022.repository.codeset.CardAccountType3Code.MoneyMarket,
						com.tools20022.repository.codeset.CardAccountType3Code.MoneyMarketChecking, com.tools20022.repository.codeset.CardAccountType3Code.MortgageLoan,
						com.tools20022.repository.codeset.CardAccountType3Code.RetirementAccount, com.tools20022.repository.codeset.CardAccountType3Code.RevolvingLoanAccount, com.tools20022.repository.codeset.CardAccountType3Code.Savings,
						com.tools20022.repository.codeset.CardAccountType3Code.StockOrBond, com.tools20022.repository.codeset.CardAccountType3Code.Universal, com.tools20022.repository.codeset.CardAccountType3Code.PrePaid,
						com.tools20022.repository.codeset.CardAccountType3Code.FleetCard);
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
		codesByName.put(PrePaid.getCodeName().get(), PrePaid);
		codesByName.put(FleetCard.getCodeName().get(), FleetCard);
	}

	public static CardAccountType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardAccountType3Code[] values() {
		CardAccountType3Code[] values = new CardAccountType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardAccountType3Code> {
		@Override
		public CardAccountType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardAccountType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}