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
import com.tools20022.repository.codeset.CountryCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the cash-in and cash-out flows by country.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByCountry2#Country
 * BreakdownByCountry2.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#CashInForecast
 * BreakdownByCountry2.CashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#CashOutForecast
 * BreakdownByCountry2.CashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2#NetCashForecast
 * BreakdownByCountry2.NetCashForecast}</li>
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
 * "BreakdownByCountry2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by country."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1
 * BreakdownByCountry1}</li>
 * </ul>
 */
public class BreakdownByCountry2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#Country
	 * BreakdownByCountry1.Country}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Country = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "Ctry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Country";
			definition = "Country for which the cash flow is being reported.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry1.Country;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#CashInForecast
	 * BreakdownByCountry1.CashInForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry1.CashInForecast;
			minOccurs = 0;
			type_lazy = () -> CashInForecast5.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#CashOutForecast
	 * BreakdownByCountry1.CashOutForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry1.CashOutForecast;
			minOccurs = 0;
			type_lazy = () -> CashOutForecast5.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Net cash as a result of the cash-in and cash-out flows specified for the
	 * country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByCountry1#NetCashForecast
	 * BreakdownByCountry1.NetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd NetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByCountry2.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the country.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.BreakdownByCountry1.NetCashForecast;
			minOccurs = 0;
			type_lazy = () -> NetCashForecast4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByCountry2.Country, com.tools20022.repository.msg.BreakdownByCountry2.CashInForecast,
						com.tools20022.repository.msg.BreakdownByCountry2.CashOutForecast, com.tools20022.repository.msg.BreakdownByCountry2.NetCashForecast);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BreakdownByCountry2";
				definition = "Specifies the cash-in and cash-out flows by country.";
				previousVersion_lazy = () -> BreakdownByCountry1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}