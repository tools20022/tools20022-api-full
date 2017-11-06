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
import com.tools20022.repository.codeset.PaymentCategoryPurposeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction that resulted in the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurposeCode
 * PaymentCategoryPurposeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmTradeSettlementPayment
 * PaymentCategoryPurpose1Code.mmTradeSettlementPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmSalaryPayment
 * PaymentCategoryPurpose1Code.mmSalaryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmTreasuryPayment
 * PaymentCategoryPurpose1Code.mmTreasuryPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmCashManagementTransfer
 * PaymentCategoryPurpose1Code.mmCashManagementTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmDividend
 * PaymentCategoryPurpose1Code.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmGovernmentPayment
 * PaymentCategoryPurpose1Code.mmGovernmentPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmInterest
 * PaymentCategoryPurpose1Code.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmLoan
 * PaymentCategoryPurpose1Code.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmPensionPayment
 * PaymentCategoryPurpose1Code.mmPensionPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmSecurities
 * PaymentCategoryPurpose1Code.mmSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmSocialSecurityBenefit
 * PaymentCategoryPurpose1Code.mmSocialSecurityBenefit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmSupplierPayment
 * PaymentCategoryPurpose1Code.mmSupplierPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmTaxPayment
 * PaymentCategoryPurpose1Code.mmTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmTrade
 * PaymentCategoryPurpose1Code.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmValueAddedTaxPayment
 * PaymentCategoryPurpose1Code.mmValueAddedTaxPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmHedging
 * PaymentCategoryPurpose1Code.mmHedging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmIntraCompanyPayment
 * PaymentCategoryPurpose1Code.mmIntraCompanyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code#mmWithHolding
 * PaymentCategoryPurpose1Code.mmWithHolding}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CORT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCategoryPurpose1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of transaction that resulted in the payment."</li>
 * </ul>
 */
public class PaymentCategoryPurpose1Code extends PaymentCategoryPurposeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlementPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmTradeSettlementPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlementPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SalaryPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmSalaryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SalaryPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TreasuryPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmTreasuryPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TreasuryPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashManagementTransfer"</li>
	 * </ul>
	 */
	public static final MMCode mmCashManagementTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashManagementTransfer";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmGovernmentPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * </ul>
	 */
	public static final MMCode mmLoan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PensionPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmPensionPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PensionPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * </ul>
	 */
	public static final MMCode mmSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SocialSecurityBenefit"</li>
	 * </ul>
	 */
	public static final MMCode mmSocialSecurityBenefit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SocialSecurityBenefit";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplierPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmSupplierPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplierPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final MMCode mmTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueAddedTaxPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmValueAddedTaxPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueAddedTaxPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hedging"</li>
	 * </ul>
	 */
	public static final MMCode mmHedging = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hedging";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraCompanyPayment"</li>
	 * </ul>
	 */
	public static final MMCode mmIntraCompanyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraCompanyPayment";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentCategoryPurpose1Code
	 * PaymentCategoryPurpose1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithHolding"</li>
	 * </ul>
	 */
	public static final MMCode mmWithHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithHolding";
			owner_lazy = () -> PaymentCategoryPurpose1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CORT");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentCategoryPurpose1Code";
				definition = "Specifies the type of transaction that resulted in the payment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmTradeSettlementPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmSalaryPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmTreasuryPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmCashManagementTransfer,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmDividend, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmGovernmentPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmInterest, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmLoan,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmPensionPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmSecurities,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmSocialSecurityBenefit, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmSupplierPayment,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmTaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmTrade,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmValueAddedTaxPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmHedging,
						com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmIntraCompanyPayment, com.tools20022.repository.codeset.PaymentCategoryPurpose1Code.mmWithHolding);
				trace_lazy = () -> PaymentCategoryPurposeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}