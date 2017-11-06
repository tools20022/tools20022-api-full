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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.Limit;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Withdrawal limits for the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmDisplayFlag
 * ATMTransactionAmounts4.mmDisplayFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmAvailableAmount
 * ATMTransactionAmounts4.mmAvailableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmDailyBalance
 * ATMTransactionAmounts4.mmDailyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmWeeklyBalance
 * ATMTransactionAmounts4.mmWeeklyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmMonthlyBalance
 * ATMTransactionAmounts4.mmMonthlyBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Limit Limit}</li>
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
 * "ATMTransactionAmounts4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Withdrawal limits for the account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts5
 * ATMTransactionAmounts5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
 * ATMTransactionAmounts2}</li>
 * </ul>
 */
public class ATMTransactionAmounts4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator displayFlag;
	/**
	 * True if limits may be displayed on the ATM to the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DispFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisplayFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if limits may be displayed on the ATM to the customer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts5#mmDisplayFlag
	 * ATMTransactionAmounts5.mmDisplayFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDisplayFlag = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransactionAmounts4.mmObject();
			isDerived = false;
			xmlTag = "DispFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisplayFlag";
			definition = "True if limits may be displayed on the ATM to the customer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransactionAmounts5.mmDisplayFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount availableAmount;
	/**
	 * Amount available for withdrawal on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAvailableAmount
	 * Limit.mmAvailableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount available for withdrawal on the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts5#mmMaximumAmount
	 * ATMTransactionAmounts5.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMaximumAllowedAmount
	 * ATMTransactionAmounts2.mmMaximumAllowedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAvailableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Limit.mmAvailableAmount;
			componentContext_lazy = () -> ATMTransactionAmounts4.mmObject();
			isDerived = false;
			xmlTag = "AvlblAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableAmount";
			definition = "Amount available for withdrawal on the account.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransactionAmounts5.mmMaximumAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts2.mmMaximumAllowedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount4 dailyBalance;
	/**
	 * Remaining daily amount of the customer totals for withdrawals on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
	 * Interest.mmAccountBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DalyBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DailyBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining daily amount of the customer totals for withdrawals on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmDailyBalance
	 * ATMTransactionAmounts2.mmDailyBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDailyBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAccountBalance;
			componentContext_lazy = () -> ATMTransactionAmounts4.mmObject();
			isDerived = false;
			xmlTag = "DalyBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DailyBalance";
			definition = "Remaining daily amount of the customer totals for withdrawals on the account.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts2.mmDailyBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected DetailedAmount4 weeklyBalance;
	/**
	 * Remaining weekly amount of the customer totals for withdrawals on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
	 * Interest.mmAccountBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WklyBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeeklyBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining weekly amount of the customer totals for withdrawals on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmWeeklyBalance
	 * ATMTransactionAmounts2.mmWeeklyBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWeeklyBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAccountBalance;
			componentContext_lazy = () -> ATMTransactionAmounts4.mmObject();
			isDerived = false;
			xmlTag = "WklyBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeeklyBalance";
			definition = "Remaining weekly amount of the customer totals for withdrawals on the account.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts2.mmWeeklyBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected DetailedAmount4 monthlyBalance;
	/**
	 * Remaining monthly amount of the customer totals for withdrawals on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccountBalance
	 * Interest.mmAccountBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
	 * ATMTransactionAmounts4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Remaining monthly amount of the customer totals for withdrawals on the account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMonthlyBalance
	 * ATMTransactionAmounts2.mmMonthlyBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonthlyBalance = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Interest.mmAccountBalance;
			componentContext_lazy = () -> ATMTransactionAmounts4.mmObject();
			isDerived = false;
			xmlTag = "MnthlyBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyBalance";
			definition = "Remaining monthly amount of the customer totals for withdrawals on the account.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts2.mmMonthlyBalance;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransactionAmounts4.mmDisplayFlag, com.tools20022.repository.msg.ATMTransactionAmounts4.mmAvailableAmount,
						com.tools20022.repository.msg.ATMTransactionAmounts4.mmDailyBalance, com.tools20022.repository.msg.ATMTransactionAmounts4.mmWeeklyBalance, com.tools20022.repository.msg.ATMTransactionAmounts4.mmMonthlyBalance);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionAmounts4";
				definition = "Withdrawal limits for the account.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts5.mmObject());
				previousVersion_lazy = () -> ATMTransactionAmounts2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getDisplayFlag() {
		return displayFlag;
	}

	public void setDisplayFlag(TrueFalseIndicator displayFlag) {
		this.displayFlag = displayFlag;
	}

	public ImpliedCurrencyAndAmount getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(ImpliedCurrencyAndAmount availableAmount) {
		this.availableAmount = availableAmount;
	}

	public DetailedAmount4 getDailyBalance() {
		return dailyBalance;
	}

	public void setDailyBalance(com.tools20022.repository.msg.DetailedAmount4 dailyBalance) {
		this.dailyBalance = dailyBalance;
	}

	public DetailedAmount4 getWeeklyBalance() {
		return weeklyBalance;
	}

	public void setWeeklyBalance(com.tools20022.repository.msg.DetailedAmount4 weeklyBalance) {
		this.weeklyBalance = weeklyBalance;
	}

	public DetailedAmount4 getMonthlyBalance() {
		return monthlyBalance;
	}

	public void setMonthlyBalance(com.tools20022.repository.msg.DetailedAmount4 monthlyBalance) {
		this.monthlyBalance = monthlyBalance;
	}
}