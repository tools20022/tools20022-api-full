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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the cash-in and cash-out flows by country.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByCountry1#mmCountry
 * BreakdownByCountry1.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#mmCashInForecast
 * BreakdownByCountry1.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#mmCashOutForecast
 * BreakdownByCountry1.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#mmNetCashForecast
 * BreakdownByCountry1.mmNetCashForecast}</li>
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
 * "BreakdownByCountry1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by country."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByCountry2
 * BreakdownByCountry2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class BreakdownByCountry1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode country;
	/**
	 * Country for which the cash flow is being reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1
	 * BreakdownByCountry1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country for which the cash flow is being reported."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCountry
	 * BreakdownByCountry2.mmCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByCountry1.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is being reported.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCountry2.mmCountry);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashInForecast3> cashInForecast;
	/**
	 * Cash movement into the fund as a result of investment funds transactions,
	 * eg, subscriptions or switch-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast3
	 * CashInForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1
	 * BreakdownByCountry1}</li>
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
	 * "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCashInForecast
	 * BreakdownByCountry2.mmCashInForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry1.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCountry2.mmCashInForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashOutForecast3> cashOutForecast;
	/**
	 * Cash movement out of the fund as a result of investment funds
	 * transactions, eg, redemptions or switch-out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast3
	 * CashOutForecast3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1
	 * BreakdownByCountry1}</li>
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
	 * "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmCashOutForecast
	 * BreakdownByCountry2.mmCashOutForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry1.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCountry2.mmCashOutForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast2> netCashForecast;
	/**
	 * Net cash as a result of the cash-in and cash-out flows specified for the
	 * country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast2
	 * NetCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1
	 * BreakdownByCountry1}</li>
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
	 * "Net cash as a result of the cash-in and cash-out flows specified for the country."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#mmNetCashForecast
	 * BreakdownByCountry2.mmNetCashForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry1.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the country.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByCountry2.mmNetCashForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BreakdownByCountry1.mmCountry, BreakdownByCountry1.mmCashInForecast, BreakdownByCountry1.mmCashOutForecast, BreakdownByCountry1.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByCountry1";
				definition = "Specifies the cash-in and cash-out flows by country.";
				nextVersions_lazy = () -> Arrays.asList(BreakdownByCountry2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CountryCode getCountry() {
		return country;
	}

	public void setCountry(CountryCode country) {
		this.country = country;
	}

	public List<CashInForecast3> getCashInForecast() {
		return cashInForecast;
	}

	public void setCashInForecast(List<com.tools20022.repository.msg.CashInForecast3> cashInForecast) {
		this.cashInForecast = cashInForecast;
	}

	public List<CashOutForecast3> getCashOutForecast() {
		return cashOutForecast;
	}

	public void setCashOutForecast(List<com.tools20022.repository.msg.CashOutForecast3> cashOutForecast) {
		this.cashOutForecast = cashOutForecast;
	}

	public List<NetCashForecast2> getNetCashForecast() {
		return netCashForecast;
	}

	public void setNetCashForecast(List<com.tools20022.repository.msg.NetCashForecast2> netCashForecast) {
		this.netCashForecast = netCashForecast;
	}
}