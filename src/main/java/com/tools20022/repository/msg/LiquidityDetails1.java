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
import com.tools20022.repository.msg.CashBalance6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityDetails1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding liquidity valuation."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LiquidityDetails1", propOrder = {"balance", "netAvailableLiquidity", "nonCashReservedAmount", "cashReservedAmount"})
public class LiquidityDetails1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bal", required = true)
	protected CashBalance6 balance;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LiquidityDetails1, CashBalance6> mmBalance = new MMMessageAssociationEnd<LiquidityDetails1, CashBalance6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Current balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashBalance6.mmObject();
		}

		@Override
		public CashBalance6 getValue(LiquidityDetails1 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(LiquidityDetails1 obj, CashBalance6 value) {
			obj.setBalance(value);
		}
	};
	@XmlElement(name = "NetAvlblLqdty", required = true)
	protected ActiveCurrencyAndAmount netAvailableLiquidity;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAvailableLiquidity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net available liquidity on the account(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount> mmNetAvailableLiquidity = new MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "NetAvlblLqdty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAvailableLiquidity";
			definition = "Net available liquidity on the account(s).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(LiquidityDetails1 obj) {
			return obj.getNetAvailableLiquidity();
		}

		@Override
		public void setValue(LiquidityDetails1 obj, ActiveCurrencyAndAmount value) {
			obj.setNetAvailableLiquidity(value);
		}
	};
	@XmlElement(name = "NonCshRsvdAmt", required = true)
	protected ActiveCurrencyAndAmount nonCashReservedAmount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCashReservedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of liquidity reserved for operations other than cash withdrawal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount> mmNonCashReservedAmount = new MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "NonCshRsvdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCashReservedAmount";
			definition = "Total amount of liquidity reserved for operations other than cash withdrawal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(LiquidityDetails1 obj) {
			return obj.getNonCashReservedAmount();
		}

		@Override
		public void setValue(LiquidityDetails1 obj, ActiveCurrencyAndAmount value) {
			obj.setNonCashReservedAmount(value);
		}
	};
	@XmlElement(name = "CshRsvdAmt", required = true)
	protected ActiveCurrencyAndAmount cashReservedAmount;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashReservedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of liquidity reserved for cash withdrawal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount> mmCashReservedAmount = new MMMessageAttribute<LiquidityDetails1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LiquidityDetails1.mmObject();
			isDerived = false;
			xmlTag = "CshRsvdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashReservedAmount";
			definition = "Total amount of liquidity reserved for cash withdrawal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(LiquidityDetails1 obj) {
			return obj.getCashReservedAmount();
		}

		@Override
		public void setValue(LiquidityDetails1 obj, ActiveCurrencyAndAmount value) {
			obj.setCashReservedAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LiquidityDetails1.mmBalance, com.tools20022.repository.msg.LiquidityDetails1.mmNetAvailableLiquidity,
						com.tools20022.repository.msg.LiquidityDetails1.mmNonCashReservedAmount, com.tools20022.repository.msg.LiquidityDetails1.mmCashReservedAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LiquidityDetails1";
				definition = "Information regarding liquidity valuation.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashBalance6 getBalance() {
		return balance;
	}

	public LiquidityDetails1 setBalance(CashBalance6 balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public ActiveCurrencyAndAmount getNetAvailableLiquidity() {
		return netAvailableLiquidity;
	}

	public LiquidityDetails1 setNetAvailableLiquidity(ActiveCurrencyAndAmount netAvailableLiquidity) {
		this.netAvailableLiquidity = Objects.requireNonNull(netAvailableLiquidity);
		return this;
	}

	public ActiveCurrencyAndAmount getNonCashReservedAmount() {
		return nonCashReservedAmount;
	}

	public LiquidityDetails1 setNonCashReservedAmount(ActiveCurrencyAndAmount nonCashReservedAmount) {
		this.nonCashReservedAmount = Objects.requireNonNull(nonCashReservedAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getCashReservedAmount() {
		return cashReservedAmount;
	}

	public LiquidityDetails1 setCashReservedAmount(ActiveCurrencyAndAmount cashReservedAmount) {
		this.cashReservedAmount = Objects.requireNonNull(cashReservedAmount);
		return this;
	}
}