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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCurrency
 * BreakdownByCurrency2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCashOutForecast
 * BreakdownByCurrency2.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmCashInForecast
 * BreakdownByCurrency2.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2#mmNetCashForecast
 * BreakdownByCurrency2.mmNetCashForecast}</li>
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
 * "BreakdownByCurrency2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by currency."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1
 * BreakdownByCurrency1}</li>
 * </ul>
 */
public class BreakdownByCurrency2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * Currency for which the cash flow is being reported.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
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
	 * definition} = "Currency for which the cash flow is being reported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCurrency
	 * BreakdownByCurrency1.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByCurrency2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByCurrency1.mmCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast;
	/**
	 * Cash movement out of the fund as a result of transactions in shares in an
	 * investment fund, for example, redemptions or switch-outs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCashOutForecast
	 * BreakdownByCurrency1.mmCashOutForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCurrency2.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> BreakdownByCurrency1.mmCashOutForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashInForecast5> cashInForecast;
	/**
	 * Cash movement into the fund as a result of transactions in shares in an
	 * investment fund, for example, subscriptions or switch-ins.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast5
	 * CashInForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmCashInForecast
	 * BreakdownByCurrency1.mmCashInForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCurrency2.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> BreakdownByCurrency1.mmCashInForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast;
	/**
	 * Net cash as a result of the cash-in and cash-out flows specified for the
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash as a result of the cash-in and cash-out flows specified for the currency."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCurrency1#mmNetCashForecast
	 * BreakdownByCurrency1.mmNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCurrency2.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the currency.";
			previousVersion_lazy = () -> BreakdownByCurrency1.mmNetCashForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BreakdownByCurrency2.mmCurrency, BreakdownByCurrency2.mmCashOutForecast, BreakdownByCurrency2.mmCashInForecast, BreakdownByCurrency2.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByCurrency2";
				definition = "Specifies the cash-in and cash-out flows by currency.";
				previousVersion_lazy = () -> BreakdownByCurrency1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = currency;
	}

	public List<CashOutForecast5> getCashOutForecast() {
		return cashOutForecast;
	}

	public void setCashOutForecast(List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast) {
		this.cashOutForecast = cashOutForecast;
	}

	public List<CashInForecast5> getCashInForecast() {
		return cashInForecast;
	}

	public void setCashInForecast(List<com.tools20022.repository.msg.CashInForecast5> cashInForecast) {
		this.cashInForecast = cashInForecast;
	}

	public List<NetCashForecast4> getNetCashForecast() {
		return netCashForecast;
	}

	public void setNetCashForecast(List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast) {
		this.netCashForecast = netCashForecast;
	}
}