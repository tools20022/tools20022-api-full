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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashInForecast3;
import com.tools20022.repository.msg.CashOutForecast3;
import com.tools20022.repository.msg.NetCashForecast2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the cash-in and cash-out flows by currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCurrency
 * BreakdownByCurrency1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCashOutForecast
 * BreakdownByCurrency1.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCashInForecast
 * BreakdownByCurrency1.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmNetCashForecast
 * BreakdownByCurrency1.mmNetCashForecast}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BreakdownByCurrency1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by currency."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
 * BreakdownByCurrency2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakdownByCurrency1", propOrder = {"currency", "cashOutForecast", "cashInForecast", "netCashForecast"})
public class BreakdownByCurrency1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy", required = true)
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1
	 * BreakdownByCurrency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCurrency
	 * BreakdownByCurrency2.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BreakdownByCurrency1, ActiveOrHistoricCurrencyCode> mmCurrency = new MMMessageAttribute<BreakdownByCurrency1, ActiveOrHistoricCurrencyCode>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCurrency1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency for which the cash flow is being reported.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmCurrency);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(BreakdownByCurrency1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(BreakdownByCurrency1 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "CshOutFcst")
	protected List<CashOutForecast3> cashOutForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast3
	 * CashOutForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1
	 * BreakdownByCurrency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCashOutForecast
	 * BreakdownByCurrency2.mmCashOutForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCurrency1, List<CashOutForecast3>> mmCashOutForecast = new MMMessageAssociationEnd<BreakdownByCurrency1, List<CashOutForecast3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCurrency1.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmCashOutForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast3.mmObject();
		}

		@Override
		public List<CashOutForecast3> getValue(BreakdownByCurrency1 obj) {
			return obj.getCashOutForecast();
		}

		@Override
		public void setValue(BreakdownByCurrency1 obj, List<CashOutForecast3> value) {
			obj.setCashOutForecast(value);
		}
	};
	@XmlElement(name = "CshInFcst")
	protected List<CashInForecast3> cashInForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast3
	 * CashInForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1
	 * BreakdownByCurrency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCashInForecast
	 * BreakdownByCurrency2.mmCashInForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCurrency1, List<CashInForecast3>> mmCashInForecast = new MMMessageAssociationEnd<BreakdownByCurrency1, List<CashInForecast3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCurrency1.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmCashInForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast3.mmObject();
		}

		@Override
		public List<CashInForecast3> getValue(BreakdownByCurrency1 obj) {
			return obj.getCashInForecast();
		}

		@Override
		public void setValue(BreakdownByCurrency1 obj, List<CashInForecast3> value) {
			obj.setCashInForecast(value);
		}
	};
	@XmlElement(name = "NetCshFcst")
	protected List<NetCashForecast2> netCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast2
	 * NetCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1
	 * BreakdownByCurrency1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified for the currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmNetCashForecast
	 * BreakdownByCurrency2.mmNetCashForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BreakdownByCurrency1, List<NetCashForecast2>> mmNetCashForecast = new MMMessageAssociationEnd<BreakdownByCurrency1, List<NetCashForecast2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByCurrency1.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the currency.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmNetCashForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast2.mmObject();
		}

		@Override
		public List<NetCashForecast2> getValue(BreakdownByCurrency1 obj) {
			return obj.getNetCashForecast();
		}

		@Override
		public void setValue(BreakdownByCurrency1 obj, List<NetCashForecast2> value) {
			obj.setNetCashForecast(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByCurrency1.mmCurrency, com.tools20022.repository.msg.BreakdownByCurrency1.mmCashOutForecast,
						com.tools20022.repository.msg.BreakdownByCurrency1.mmCashInForecast, com.tools20022.repository.msg.BreakdownByCurrency1.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByCurrency1";
				definition = "Specifies the cash-in and cash-out flows by currency.";
				nextVersions_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public BreakdownByCurrency1 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public List<CashOutForecast3> getCashOutForecast() {
		return cashOutForecast == null ? cashOutForecast = new ArrayList<>() : cashOutForecast;
	}

	public BreakdownByCurrency1 setCashOutForecast(List<CashOutForecast3> cashOutForecast) {
		this.cashOutForecast = Objects.requireNonNull(cashOutForecast);
		return this;
	}

	public List<CashInForecast3> getCashInForecast() {
		return cashInForecast == null ? cashInForecast = new ArrayList<>() : cashInForecast;
	}

	public BreakdownByCurrency1 setCashInForecast(List<CashInForecast3> cashInForecast) {
		this.cashInForecast = Objects.requireNonNull(cashInForecast);
		return this;
	}

	public List<NetCashForecast2> getNetCashForecast() {
		return netCashForecast == null ? netCashForecast = new ArrayList<>() : netCashForecast;
	}

	public BreakdownByCurrency1 setNetCashForecast(List<NetCashForecast2> netCashForecast) {
		this.netCashForecast = Objects.requireNonNull(netCashForecast);
		return this;
	}
}