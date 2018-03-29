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
import com.tools20022.repository.msg.AdditionalParameters1;
import com.tools20022.repository.msg.CashInForecast3;
import com.tools20022.repository.msg.CashOutForecast3;
import com.tools20022.repository.msg.NetCashForecast2;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BreakdownByParty1", propOrder = {"party", "additionalParameters", "cashInForecast", "cashOutForecast", "netCashForecast"})
public class BreakdownByParty1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected PartyIdentification2Choice party;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<BreakdownByParty1, PartyIdentification2Choice> mmParty = new MMMessageAttribute<BreakdownByParty1, PartyIdentification2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty1.mmObject();
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

		@Override
		public PartyIdentification2Choice getValue(BreakdownByParty1 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(BreakdownByParty1 obj, PartyIdentification2Choice value) {
			obj.setParty(value);
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
	public static final MMMessageAssociationEnd<BreakdownByParty1, Optional<AdditionalParameters1>> mmAdditionalParameters = new MMMessageAssociationEnd<BreakdownByParty1, Optional<AdditionalParameters1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "AddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalParameters";
			definition = "Additional parameter/s applied to the cash flow by party.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmAdditionalParameters);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalParameters1.mmObject();
		}

		@Override
		public Optional<AdditionalParameters1> getValue(BreakdownByParty1 obj) {
			return obj.getAdditionalParameters();
		}

		@Override
		public void setValue(BreakdownByParty1 obj, Optional<AdditionalParameters1> value) {
			obj.setAdditionalParameters(value.orElse(null));
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
	public static final MMMessageAssociationEnd<BreakdownByParty1, List<CashInForecast3>> mmCashInForecast = new MMMessageAssociationEnd<BreakdownByParty1, List<CashInForecast3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "CshInFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInForecast";
			definition = "Cash movement into the fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmCashInForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast3.mmObject();
		}

		@Override
		public List<CashInForecast3> getValue(BreakdownByParty1 obj) {
			return obj.getCashInForecast();
		}

		@Override
		public void setValue(BreakdownByParty1 obj, List<CashInForecast3> value) {
			obj.setCashInForecast(value);
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
	public static final MMMessageAssociationEnd<BreakdownByParty1, List<CashOutForecast3>> mmCashOutForecast = new MMMessageAssociationEnd<BreakdownByParty1, List<CashOutForecast3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "CshOutFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutForecast";
			definition = "Cash movement out of the fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmCashOutForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast3.mmObject();
		}

		@Override
		public List<CashOutForecast3> getValue(BreakdownByParty1 obj) {
			return obj.getCashOutForecast();
		}

		@Override
		public void setValue(BreakdownByParty1 obj, List<CashOutForecast3> value) {
			obj.setCashOutForecast(value);
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
	public static final MMMessageAssociationEnd<BreakdownByParty1, List<NetCashForecast2>> mmNetCashForecast = new MMMessageAssociationEnd<BreakdownByParty1, List<NetCashForecast2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BreakdownByParty1.mmObject();
			isDerived = false;
			xmlTag = "NetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetCashForecast";
			definition = "Net cash as a result of the cash-in and cash-out flows specified for the party.";
			nextVersions_lazy = () -> Arrays.asList(BreakdownByParty3.mmNetCashForecast);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast2.mmObject();
		}

		@Override
		public List<NetCashForecast2> getValue(BreakdownByParty1 obj) {
			return obj.getNetCashForecast();
		}

		@Override
		public void setValue(BreakdownByParty1 obj, List<NetCashForecast2> value) {
			obj.setNetCashForecast(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BreakdownByParty1.mmParty, com.tools20022.repository.msg.BreakdownByParty1.mmAdditionalParameters,
						com.tools20022.repository.msg.BreakdownByParty1.mmCashInForecast, com.tools20022.repository.msg.BreakdownByParty1.mmCashOutForecast, com.tools20022.repository.msg.BreakdownByParty1.mmNetCashForecast);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public BreakdownByParty1 setParty(PartyIdentification2Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<AdditionalParameters1> getAdditionalParameters() {
		return additionalParameters == null ? Optional.empty() : Optional.of(additionalParameters);
	}

	public BreakdownByParty1 setAdditionalParameters(AdditionalParameters1 additionalParameters) {
		this.additionalParameters = additionalParameters;
		return this;
	}

	public List<CashInForecast3> getCashInForecast() {
		return cashInForecast == null ? cashInForecast = new ArrayList<>() : cashInForecast;
	}

	public BreakdownByParty1 setCashInForecast(List<CashInForecast3> cashInForecast) {
		this.cashInForecast = Objects.requireNonNull(cashInForecast);
		return this;
	}

	public List<CashOutForecast3> getCashOutForecast() {
		return cashOutForecast == null ? cashOutForecast = new ArrayList<>() : cashOutForecast;
	}

	public BreakdownByParty1 setCashOutForecast(List<CashOutForecast3> cashOutForecast) {
		this.cashOutForecast = Objects.requireNonNull(cashOutForecast);
		return this;
	}

	public List<NetCashForecast2> getNetCashForecast() {
		return netCashForecast == null ? netCashForecast = new ArrayList<>() : netCashForecast;
	}

	public BreakdownByParty1 setNetCashForecast(List<NetCashForecast2> netCashForecast) {
		this.netCashForecast = Objects.requireNonNull(netCashForecast);
		return this;
	}
}