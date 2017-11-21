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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmSubscription
 * SettlementInstructionReasonCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmInvestmentSavingsPlan
 * SettlementInstructionReasonCode.mmInvestmentSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmWithdrawalSavingsPlan
 * SettlementInstructionReasonCode.mmWithdrawalSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmSavingsPlan
 * SettlementInstructionReasonCode.mmSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmSecuritiesPurchase
 * SettlementInstructionReasonCode.mmSecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmCharges
 * SettlementInstructionReasonCode.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmAllDebits
 * SettlementInstructionReasonCode.mmAllDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmRedemption
 * SettlementInstructionReasonCode.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmSecuritiesSale
 * SettlementInstructionReasonCode.mmSecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmInterest
 * SettlementInstructionReasonCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmDividend
 * SettlementInstructionReasonCode.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmAllCredits
 * SettlementInstructionReasonCode.mmAllCredits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmAllCreditsAndDebits
 * SettlementInstructionReasonCode.mmAllCreditsAndDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#mmCorporateAction
 * SettlementInstructionReasonCode.mmCorporateAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReason1Code
 * SettlementInstructionReason1Code}</li>
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
 * "SettlementInstructionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of transaction."</li>
 * </ul>
 */
public class SettlementInstructionReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement of subscriptions or subscription legs of a switch transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of subscriptions or subscription legs of a switch transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Settlement of subscriptions or subscription legs of a switch transaction.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Settlement of investments to a savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of investments to a savings plan."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentSavingsPlan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentSavingsPlan";
			definition = "Settlement of investments to a savings plan.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "SAVP";
		}
	};
	/**
	 * Settlement of withdrawals from a savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalSavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of withdrawals from a savings plan."</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalSavingsPlan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalSavingsPlan";
			definition = "Settlement of withdrawals from a savings plan.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "WTHP";
		}
	};
	/**
	 * Settlement of investments to a savings plan and withdrawals from a
	 * savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of investments to a savings plan and withdrawals from a savings plan."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSavingsPlan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlan";
			definition = "Settlement of investments to a savings plan and withdrawals from a savings plan.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "SAVE";
		}
	};
	/**
	 * Settlement of securities purchases.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of securities purchases."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesPurchase = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			definition = "Settlement of securities purchases.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Settlement of charges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of charges."</li>
	 * </ul>
	 */
	public static final MMCode mmCharges = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Settlement of charges.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "CHAR";
		}
	};
	/**
	 * Settlement of all debit amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllDebits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of all debit amounts."</li>
	 * </ul>
	 */
	public static final MMCode mmAllDebits = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDebits";
			definition = "Settlement of all debit amounts.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "CSHO";
		}
	};
	/**
	 * Settlement of redemptions or redemption legs of a switch transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement of redemptions or redemption legs of a switch transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Settlement of redemptions or redemption legs of a switch transaction.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Settlement of securities sales.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSale"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of securities sales."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesSale = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			definition = "Settlement of securities sales.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Settlement of interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of interest."</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Settlement of interest.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Settlement of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of dividends."</li>
	 * </ul>
	 */
	public static final MMCode mmDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Settlement of dividends.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Settlement of all credit amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCredits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of all credit amounts."</li>
	 * </ul>
	 */
	public static final MMCode mmAllCredits = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCredits";
			definition = "Settlement of all credit amounts.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "CSHI";
		}
	};
	/**
	 * Settlement of all credit and debit amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllCreditsAndDebits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of all credit and debit amounts."</li>
	 * </ul>
	 */
	public static final MMCode mmAllCreditsAndDebits = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCreditsAndDebits";
			definition = "Settlement of all credit and debit amounts.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "ALLL";
		}
	};
	/**
	 * Settlement of corporate actions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode
	 * SettlementInstructionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement of corporate actions."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Settlement of corporate actions.";
			owner_lazy = () -> SettlementInstructionReasonCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionReasonCode";
				definition = "Specifies the type of transaction.";
				code_lazy = () -> Arrays.asList(SettlementInstructionReasonCode.mmSubscription, SettlementInstructionReasonCode.mmInvestmentSavingsPlan, SettlementInstructionReasonCode.mmWithdrawalSavingsPlan,
						SettlementInstructionReasonCode.mmSavingsPlan, SettlementInstructionReasonCode.mmSecuritiesPurchase, SettlementInstructionReasonCode.mmCharges, SettlementInstructionReasonCode.mmAllDebits,
						SettlementInstructionReasonCode.mmRedemption, SettlementInstructionReasonCode.mmSecuritiesSale, SettlementInstructionReasonCode.mmInterest, SettlementInstructionReasonCode.mmDividend,
						SettlementInstructionReasonCode.mmAllCredits, SettlementInstructionReasonCode.mmAllCreditsAndDebits, SettlementInstructionReasonCode.mmCorporateAction);
				derivation_lazy = () -> Arrays.asList(SettlementInstructionReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}