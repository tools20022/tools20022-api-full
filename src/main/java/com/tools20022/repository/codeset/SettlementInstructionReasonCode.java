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
import com.tools20022.repository.codeset.SettlementInstructionReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#Subscription
 * SettlementInstructionReasonCode.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#InvestmentSavingsPlan
 * SettlementInstructionReasonCode.InvestmentSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#WithdrawalSavingsPlan
 * SettlementInstructionReasonCode.WithdrawalSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#SavingsPlan
 * SettlementInstructionReasonCode.SavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#SecuritiesPurchase
 * SettlementInstructionReasonCode.SecuritiesPurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#Charges
 * SettlementInstructionReasonCode.Charges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#AllDebits
 * SettlementInstructionReasonCode.AllDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#Redemption
 * SettlementInstructionReasonCode.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#SecuritiesSale
 * SettlementInstructionReasonCode.SecuritiesSale}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#Interest
 * SettlementInstructionReasonCode.Interest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#Dividend
 * SettlementInstructionReasonCode.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#AllCredits
 * SettlementInstructionReasonCode.AllCredits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#AllCreditsAndDebits
 * SettlementInstructionReasonCode.AllCreditsAndDebits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementInstructionReasonCode#CorporateAction
 * SettlementInstructionReasonCode.CorporateAction}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementInstructionReasonCode extends MMCode {

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
	public static final SettlementInstructionReasonCode Subscription = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Settlement of subscriptions or subscription legs of a switch transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode InvestmentSavingsPlan = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentSavingsPlan";
			definition = "Settlement of investments to a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode WithdrawalSavingsPlan = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalSavingsPlan";
			definition = "Settlement of withdrawals from a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode SavingsPlan = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlan";
			definition = "Settlement of investments to a savings plan and withdrawals from a savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode SecuritiesPurchase = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPurchase";
			definition = "Settlement of securities purchases.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode Charges = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Settlement of charges.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode AllDebits = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllDebits";
			definition = "Settlement of all debit amounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode Redemption = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Settlement of redemptions or redemption legs of a switch transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode SecuritiesSale = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSale";
			definition = "Settlement of securities sales.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode Interest = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Settlement of interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode Dividend = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dividend";
			definition = "Settlement of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode AllCredits = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCredits";
			definition = "Settlement of all credit amounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode AllCreditsAndDebits = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllCreditsAndDebits";
			definition = "Settlement of all credit and debit amounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
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
	public static final SettlementInstructionReasonCode CorporateAction = new SettlementInstructionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Settlement of corporate actions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementInstructionReasonCode.mmObject();
			codeName = "CORP";
		}
	};
	final static private LinkedHashMap<String, SettlementInstructionReasonCode> codesByName = new LinkedHashMap<>();

	protected SettlementInstructionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInstructionReasonCode";
				definition = "Specifies the type of transaction.";
				derivation_lazy = () -> Arrays.asList(SettlementInstructionReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementInstructionReasonCode.Subscription, com.tools20022.repository.codeset.SettlementInstructionReasonCode.InvestmentSavingsPlan,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.WithdrawalSavingsPlan, com.tools20022.repository.codeset.SettlementInstructionReasonCode.SavingsPlan,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.SecuritiesPurchase, com.tools20022.repository.codeset.SettlementInstructionReasonCode.Charges,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.AllDebits, com.tools20022.repository.codeset.SettlementInstructionReasonCode.Redemption,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.SecuritiesSale, com.tools20022.repository.codeset.SettlementInstructionReasonCode.Interest,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.Dividend, com.tools20022.repository.codeset.SettlementInstructionReasonCode.AllCredits,
						com.tools20022.repository.codeset.SettlementInstructionReasonCode.AllCreditsAndDebits, com.tools20022.repository.codeset.SettlementInstructionReasonCode.CorporateAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(InvestmentSavingsPlan.getCodeName().get(), InvestmentSavingsPlan);
		codesByName.put(WithdrawalSavingsPlan.getCodeName().get(), WithdrawalSavingsPlan);
		codesByName.put(SavingsPlan.getCodeName().get(), SavingsPlan);
		codesByName.put(SecuritiesPurchase.getCodeName().get(), SecuritiesPurchase);
		codesByName.put(Charges.getCodeName().get(), Charges);
		codesByName.put(AllDebits.getCodeName().get(), AllDebits);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(SecuritiesSale.getCodeName().get(), SecuritiesSale);
		codesByName.put(Interest.getCodeName().get(), Interest);
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(AllCredits.getCodeName().get(), AllCredits);
		codesByName.put(AllCreditsAndDebits.getCodeName().get(), AllCreditsAndDebits);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
	}

	public static SettlementInstructionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementInstructionReasonCode[] values() {
		SettlementInstructionReasonCode[] values = new SettlementInstructionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementInstructionReasonCode> {
		@Override
		public SettlementInstructionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementInstructionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}