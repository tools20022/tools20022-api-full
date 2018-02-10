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
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the cash-in and cash-out flows by party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmParty
 * BreakdownByParty3.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmAdditionalParameters
 * BreakdownByParty3.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmCashInForecast
 * BreakdownByParty3.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmCashOutForecast
 * BreakdownByParty3.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmNetCashForecast
 * BreakdownByParty3.mmNetCashForecast}</li>
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
 * "BreakdownByParty3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
 * BreakdownByParty1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakdownByParty3", propOrder = {"party", "additionalParameters", "cashInForecast", "cashOutForecast", "netCashForecast"})
public class BreakdownByParty3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected InvestmentAccount42 party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount42
	 * InvestmentAccount42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, for example, fund management company, for which the cash flow is being reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmParty
	 * BreakdownByParty1.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Party, for example, fund management company, for which the cash flow is being reported.";
			previousVersion_lazy = () -> BreakdownByParty1.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.InvestmentAccount42.mmObject();
		}
	};
	@XmlElement(name = "AddtlParams")
	protected AdditionalParameters1 additionalParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalParameters1
	 * AdditionalParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional parameter/s applied to the cash flow by party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmAdditionalParameters
	 * BreakdownByParty1.mmAdditionalParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
			isDerived = false;
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameter/s applied to the cash flow by party.";
			previousVersion_lazy = () -> BreakdownByParty1.mmAdditionalParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalParameters1.mmObject();
		}
	};
	@XmlElement(name = "CshInFcst")
	protected List<com.tools20022.repository.msg.CashInForecast5> cashInForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast5
	 * CashInForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmCashInForecast
	 * BreakdownByParty1.mmCashInForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			previousVersion_lazy = () -> BreakdownByParty1.mmCashInForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashInForecast5.mmObject();
		}
	};
	@XmlElement(name = "CshOutFcst")
	protected List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmCashOutForecast
	 * BreakdownByParty1.mmCashOutForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			previousVersion_lazy = () -> BreakdownByParty1.mmCashOutForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
		}
	};
	@XmlElement(name = "NetCshFcst")
	protected List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
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
	 * "Net cash as a result of the cash-in and cash-out flows specified for the party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmNetCashForecast
	 * BreakdownByParty1.mmNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty3.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the party.";
			previousVersion_lazy = () -> BreakdownByParty1.mmNetCashForecast;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByParty3.mmParty, com.tools20022.repository.msg.BreakdownByParty3.mmAdditionalParameters,
						com.tools20022.repository.msg.BreakdownByParty3.mmCashInForecast, com.tools20022.repository.msg.BreakdownByParty3.mmCashOutForecast, com.tools20022.repository.msg.BreakdownByParty3.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByParty3";
				definition = "Specifies the cash-in and cash-out flows by party.";
				previousVersion_lazy = () -> BreakdownByParty1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccount42 getParty() {
		return party;
	}

	public BreakdownByParty3 setParty(com.tools20022.repository.msg.InvestmentAccount42 party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<AdditionalParameters1> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public BreakdownByParty3 setAdditionalParameters(com.tools20022.repository.msg.AdditionalParameters1 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public List<CashInForecast5> getCashInForecast() {
		return cashInForecast == null ? cashInForecast = new ArrayList<>() : cashInForecast;
	}

	public BreakdownByParty3 setCashInForecast(List<com.tools20022.repository.msg.CashInForecast5> cashInForecast) {
		this.cashInForecast = Objects.requireNonNull(cashInForecast);
		return this;
	}

	public List<CashOutForecast5> getCashOutForecast() {
		return cashOutForecast == null ? cashOutForecast = new ArrayList<>() : cashOutForecast;
	}

	public BreakdownByParty3 setCashOutForecast(List<com.tools20022.repository.msg.CashOutForecast5> cashOutForecast) {
		this.cashOutForecast = Objects.requireNonNull(cashOutForecast);
		return this;
	}

	public List<NetCashForecast4> getNetCashForecast() {
		return netCashForecast == null ? netCashForecast = new ArrayList<>() : netCashForecast;
	}

	public BreakdownByParty3 setNetCashForecast(List<com.tools20022.repository.msg.NetCashForecast4> netCashForecast) {
		this.netCashForecast = Objects.requireNonNull(netCashForecast);
		return this;
	}
}