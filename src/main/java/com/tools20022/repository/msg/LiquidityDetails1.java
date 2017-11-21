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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information regarding liquidity valuation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.LiquidityDetails1#mmBalance
 * LiquidityDetails1.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1#mmNetAvailableLiquidity
 * LiquidityDetails1.mmNetAvailableLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1#mmNonCashReservedAmount
 * LiquidityDetails1.mmNonCashReservedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1#mmCashReservedAmount
 * LiquidityDetails1.mmCashReservedAmount}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding liquidity valuation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LiquidityDetails1", propOrder = {"balance", "netAvailableLiquidity", "nonCashReservedAmount", "cashReservedAmount"})
public class LiquidityDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashBalance6 balance;
	/**
	 * Current balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance6
	 * CashBalance6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Current balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalance6.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netAvailableLiquidity;
	/**
	 * Net available liquidity on the account(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAvlblLqdty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAvailableLiquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net available liquidity on the account(s). "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAvailableLiquidity = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "NetAvlblLqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAvailableLiquidity";
			definition = "Net available liquidity on the account(s). ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount nonCashReservedAmount;
	/**
	 * Total amount of liquidity reserved for operations other than cash
	 * withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonCshRsvdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCashReservedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of liquidity reserved for operations other than cash withdrawal."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonCashReservedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "NonCshRsvdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCashReservedAmount";
			definition = "Total amount of liquidity reserved for operations other than cash withdrawal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashReservedAmount;
	/**
	 * Total amount of liquidity reserved for cash withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshRsvdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of liquidity reserved for cash withdrawal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashReservedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "CshRsvdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservedAmount";
			definition = "Total amount of liquidity reserved for cash withdrawal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LiquidityDetails1.mmBalance, LiquidityDetails1.mmNetAvailableLiquidity, LiquidityDetails1.mmNonCashReservedAmount, LiquidityDetails1.mmCashReservedAmount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityDetails1";
				definition = "Information regarding liquidity valuation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Bal", required = true)
	public CashBalance6 getBalance() {
		return balance;
	}

	public void setBalance(com.tools20022.repository.msg.CashBalance6 balance) {
		this.balance = balance;
	}

	@XmlElement(name = "NetAvlblLqdty", required = true)
	public ActiveCurrencyAndAmount getNetAvailableLiquidity() {
		return netAvailableLiquidity;
	}

	public void setNetAvailableLiquidity(ActiveCurrencyAndAmount netAvailableLiquidity) {
		this.netAvailableLiquidity = netAvailableLiquidity;
	}

	@XmlElement(name = "NonCshRsvdAmt", required = true)
	public ActiveCurrencyAndAmount getNonCashReservedAmount() {
		return nonCashReservedAmount;
	}

	public void setNonCashReservedAmount(ActiveCurrencyAndAmount nonCashReservedAmount) {
		this.nonCashReservedAmount = nonCashReservedAmount;
	}

	@XmlElement(name = "CshRsvdAmt", required = true)
	public ActiveCurrencyAndAmount getCashReservedAmount() {
		return cashReservedAmount;
	}

	public void setCashReservedAmount(ActiveCurrencyAndAmount cashReservedAmount) {
		this.cashReservedAmount = cashReservedAmount;
	}
}