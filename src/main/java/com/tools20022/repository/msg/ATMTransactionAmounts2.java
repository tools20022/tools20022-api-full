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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Limit of amounts for the customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmCurrency
 * ATMTransactionAmounts2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMaximumAuthorisableAmount
 * ATMTransactionAmounts2.mmMaximumAuthorisableAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMinimumAllowedAmount
 * ATMTransactionAmounts2.mmMinimumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMaximumAllowedAmount
 * ATMTransactionAmounts2.mmMaximumAllowedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmDailyBalance
 * ATMTransactionAmounts2.mmDailyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmWeeklyBalance
 * ATMTransactionAmounts2.mmWeeklyBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2#mmMonthlyBalance
 * ATMTransactionAmounts2.mmMonthlyBalance}</li>
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
 * "ATMTransactionAmounts2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Limit of amounts for the customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4
 * ATMTransactionAmounts4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3
 * ATMTransactionAmounts3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransactionAmounts2", propOrder = {"currency", "maximumAuthorisableAmount", "minimumAllowedAmount", "maximumAllowedAmount", "dailyBalance", "weeklyBalance", "monthlyBalance"})
public class ATMTransactionAmounts2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode currency;
	/**
	 * Currency of the limits, if different from the requested amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCurrency
	 * Limit.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the limits, if different from the requested amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmCurrency
	 * ATMTransactionAmounts3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the limits, if different from the requested amount.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts3.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAuthorisableAmount;
	/**
	 * Maximum amount allowed in the authorised currency if the withdrawal was
	 * not approved.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAuthsbAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAuthorisableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed in the authorised currency if the withdrawal was not approved."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmMaximumAmount
	 * ATMTransactionAmounts3.mmMaximumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAuthorisableAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAvailableAmount;
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "MaxAuthsbAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAuthorisableAmount";
			definition = "Maximum amount allowed in the authorised currency if the withdrawal was not approved.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts3.mmMaximumAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumAllowedAmount;
	/**
	 * Minimum amount allowed for a withdrawal in the authorised currency.
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAllwdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAllowedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount allowed for a withdrawal in the authorised currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts3#mmMinimumAmount
	 * ATMTransactionAmounts3.mmMinimumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumAllowedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "MinAllwdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAllowedAmount";
			definition = "Minimum amount allowed for a withdrawal in the authorised currency.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts3.mmMinimumAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAllowedAmount;
	/**
	 * Maximum amount allowed for a withdrawal in the authorised currency.
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAllwdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum amount allowed for a withdrawal in the authorised currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmAvailableAmount
	 * ATMTransactionAmounts4.mmAvailableAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAllowedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedAmount";
			definition = "Maximum amount allowed for a withdrawal in the authorised currency.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmAvailableAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount4 dailyBalance;
	/**
	 * Remaining daily amount of the customer totals after the withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
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
	 * "Remaining daily amount of the customer totals after the withdrawal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmDailyBalance
	 * ATMTransactionAmounts4.mmDailyBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDailyBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "DalyBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DailyBalance";
			definition = "Remaining daily amount of the customer totals after the withdrawal.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmDailyBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected DetailedAmount4 weeklyBalance;
	/**
	 * Remaining weekly amount of the customer totals after the withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
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
	 * "Remaining weekly amount of the customer totals after the withdrawal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmWeeklyBalance
	 * ATMTransactionAmounts4.mmWeeklyBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWeeklyBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "WklyBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeeklyBalance";
			definition = "Remaining weekly amount of the customer totals after the withdrawal.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmWeeklyBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};
	protected DetailedAmount4 monthlyBalance;
	/**
	 * Remaining monthly amount of the customer totals after the withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount4
	 * DetailedAmount4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts2
	 * ATMTransactionAmounts2}</li>
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
	 * "Remaining monthly amount of the customer totals after the withdrawal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts4#mmMonthlyBalance
	 * ATMTransactionAmounts4.mmMonthlyBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonthlyBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> ATMTransactionAmounts2.mmObject();
			isDerived = false;
			xmlTag = "MnthlyBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyBalance";
			definition = "Remaining monthly amount of the customer totals after the withdrawal.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmMonthlyBalance);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTransactionAmounts2.mmCurrency, ATMTransactionAmounts2.mmMaximumAuthorisableAmount, ATMTransactionAmounts2.mmMinimumAllowedAmount, ATMTransactionAmounts2.mmMaximumAllowedAmount,
						ATMTransactionAmounts2.mmDailyBalance, ATMTransactionAmounts2.mmWeeklyBalance, ATMTransactionAmounts2.mmMonthlyBalance);
				trace_lazy = () -> Limit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransactionAmounts2";
				definition = "Limit of amounts for the customer.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransactionAmounts4.mmObject(), ATMTransactionAmounts3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "MaxAuthsbAmt")
	public ImpliedCurrencyAndAmount getMaximumAuthorisableAmount() {
		return maximumAuthorisableAmount;
	}

	public void setMaximumAuthorisableAmount(ImpliedCurrencyAndAmount maximumAuthorisableAmount) {
		this.maximumAuthorisableAmount = maximumAuthorisableAmount;
	}

	@XmlElement(name = "MinAllwdAmt")
	public ImpliedCurrencyAndAmount getMinimumAllowedAmount() {
		return minimumAllowedAmount;
	}

	public void setMinimumAllowedAmount(ImpliedCurrencyAndAmount minimumAllowedAmount) {
		this.minimumAllowedAmount = minimumAllowedAmount;
	}

	@XmlElement(name = "MaxAllwdAmt")
	public ImpliedCurrencyAndAmount getMaximumAllowedAmount() {
		return maximumAllowedAmount;
	}

	public void setMaximumAllowedAmount(ImpliedCurrencyAndAmount maximumAllowedAmount) {
		this.maximumAllowedAmount = maximumAllowedAmount;
	}

	@XmlElement(name = "DalyBal")
	public DetailedAmount4 getDailyBalance() {
		return dailyBalance;
	}

	public void setDailyBalance(com.tools20022.repository.msg.DetailedAmount4 dailyBalance) {
		this.dailyBalance = dailyBalance;
	}

	@XmlElement(name = "WklyBal")
	public DetailedAmount4 getWeeklyBalance() {
		return weeklyBalance;
	}

	public void setWeeklyBalance(com.tools20022.repository.msg.DetailedAmount4 weeklyBalance) {
		this.weeklyBalance = weeklyBalance;
	}

	@XmlElement(name = "MnthlyBal")
	public DetailedAmount4 getMonthlyBalance() {
		return monthlyBalance;
	}

	public void setMonthlyBalance(com.tools20022.repository.msg.DetailedAmount4 monthlyBalance) {
		this.monthlyBalance = monthlyBalance;
	}
}