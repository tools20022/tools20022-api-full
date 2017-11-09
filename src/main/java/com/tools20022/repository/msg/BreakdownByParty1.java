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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the cash-in and cash-out flows by party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmParty
 * BreakdownByParty1.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmAdditionalParameters
 * BreakdownByParty1.mmAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmCashInForecast
 * BreakdownByParty1.mmCashInForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmCashOutForecast
 * BreakdownByParty1.mmCashOutForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1#mmNetCashForecast
 * BreakdownByParty1.mmNetCashForecast}</li>
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
 * "BreakdownByParty1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the cash-in and cash-out flows by party."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByParty3
 * BreakdownByParty3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class BreakdownByParty1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification2Choice party;
	/**
	 * Party, eg, fund management company, for which the cash flow is being
	 * reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
	 * BreakdownByParty1}</li>
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
	 * "Party, eg, fund management company, for which the cash flow is being reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmParty
	 * BreakdownByParty3.mmParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Party, eg, fund management company, for which the cash flow is being reported.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmParty);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected AdditionalParameters1 additionalParameters;
	/**
	 * Additional parameter/s applied to the cash flow by party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalParameters1
	 * AdditionalParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
	 * BreakdownByParty1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmAdditionalParameters
	 * BreakdownByParty3.mmAdditionalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameter/s applied to the cash flow by party.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmAdditionalParameters);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditionalParameters1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
	 * BreakdownByParty1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmCashInForecast
	 * BreakdownByParty3.mmCashInForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashInForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmCashInForecast);
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
	 * BreakdownByParty1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmCashOutForecast
	 * BreakdownByParty3.mmCashOutForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashOutForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmCashOutForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashOutForecast3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NetCashForecast2> netCashForecast;
	/**
	 * Net cash as a result of the cash-in and cash-out flows specified for the
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast2
	 * NetCashForecast2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty1
	 * BreakdownByParty1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BreakdownByParty3#mmNetCashForecast
	 * BreakdownByParty3.mmNetCashForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNetCashForecast = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the party.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmNetCashForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NetCashForecast2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(BreakdownByParty1.mmParty, BreakdownByParty1.mmAdditionalParameters, BreakdownByParty1.mmCashInForecast, BreakdownByParty1.mmCashOutForecast, BreakdownByParty1.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BreakdownByParty1";
				definition = "Specifies the cash-in and cash-out flows by party.";
				nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification2Choice getParty() {
		return party;
	}

	public void setParty(PartyIdentification2Choice party) {
		this.party = party;
	}

	public AdditionalParameters1 getAdditionalParameters() {
		return additionalParameters;
	}

	public void setAdditionalParameters(com.tools20022.repository.msg.AdditionalParameters1 additionalParameters) {
		this.additionalParameters = additionalParameters;
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