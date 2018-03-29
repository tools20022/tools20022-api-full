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
import com.tools20022.repository.choice.CounterpartyTradeNature4Choice;
import com.tools20022.repository.choice.OrganisationIdentification5Choice;
import com.tools20022.repository.codeset.OptionParty1Code;
import com.tools20022.repository.codeset.TradingCapacity7Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to counterparty identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Counterparty16#mmIdentification
 * Counterparty16.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Counterparty16#mmNature
 * Counterparty16.mmNature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Counterparty16#mmTradingCapacity
 * Counterparty16.mmTradingCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Counterparty16#mmCounterpartySide
 * Counterparty16.mmCounterpartySide}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Counterparty16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to counterparty identification."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Counterparty16", propOrder = {"identification", "nature", "tradingCapacity", "counterpartySide"})
public class Counterparty16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected OrganisationIdentification5Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationIdentification5Choice
	 * OrganisationIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Counterparty16 Counterparty16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique code identifying the reporting counterparty of the contract."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Counterparty16, OrganisationIdentification5Choice> mmIdentification = new MMMessageAssociationEnd<Counterparty16, OrganisationIdentification5Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Counterparty16.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique code identifying the reporting counterparty of the contract.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification5Choice.mmObject();
		}

		@Override
		public OrganisationIdentification5Choice getValue(Counterparty16 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Counterparty16 obj, OrganisationIdentification5Choice value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Ntr", required = true)
	protected CounterpartyTradeNature4Choice nature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyTradeNature4Choice
	 * CounterpartyTradeNature4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer#mmRole
	 * RolePlayer.mmRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Counterparty16 Counterparty16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the reporting counterparty is a central counterparty, a financial, non-financial counterparty or other type of counterparty in accordance with regulation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Counterparty16, CounterpartyTradeNature4Choice> mmNature = new MMMessageAssociationEnd<Counterparty16, CounterpartyTradeNature4Choice>() {
		{
			businessElementTrace_lazy = () -> RolePlayer.mmRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.Counterparty16.mmObject();
			isDerived = false;
			xmlTag = "Ntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nature";
			definition = "Indicates if the reporting counterparty is a central counterparty, a financial, non-financial counterparty or other type of counterparty in accordance with regulation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyTradeNature4Choice.mmObject();
		}

		@Override
		public CounterpartyTradeNature4Choice getValue(Counterparty16 obj) {
			return obj.getNature();
		}

		@Override
		public void setValue(Counterparty16 obj, CounterpartyTradeNature4Choice value) {
			obj.setNature(value);
		}
	};
	@XmlElement(name = "TradgCpcty", required = true)
	protected TradingCapacity7Code tradingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity7Code
	 * TradingCapacity7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Counterparty16 Counterparty16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the trading capacity of the seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Counterparty16, TradingCapacity7Code> mmTradingCapacity = new MMMessageAttribute<Counterparty16, TradingCapacity7Code>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Counterparty16.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Identifies the trading capacity of the seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity7Code.mmObject();
		}

		@Override
		public TradingCapacity7Code getValue(Counterparty16 obj) {
			return obj.getTradingCapacity();
		}

		@Override
		public void setValue(Counterparty16 obj, TradingCapacity7Code value) {
			obj.setTradingCapacity(value);
		}
	};
	@XmlElement(name = "CtrPtySd", required = true)
	protected OptionParty1Code counterpartySide;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OptionParty1Code
	 * OptionParty1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmSide
	 * ClearingMemberRole.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Counterparty16 Counterparty16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the reporting counterparty is a buyer or a seller."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Counterparty16, OptionParty1Code> mmCounterpartySide = new MMMessageAttribute<Counterparty16, OptionParty1Code>() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.Counterparty16.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySide";
			definition = "Identifies whether the reporting counterparty is a buyer or a seller.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OptionParty1Code.mmObject();
		}

		@Override
		public OptionParty1Code getValue(Counterparty16 obj) {
			return obj.getCounterpartySide();
		}

		@Override
		public void setValue(Counterparty16 obj, OptionParty1Code value) {
			obj.setCounterpartySide(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Counterparty16.mmIdentification, com.tools20022.repository.msg.Counterparty16.mmNature, com.tools20022.repository.msg.Counterparty16.mmTradingCapacity,
						com.tools20022.repository.msg.Counterparty16.mmCounterpartySide);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Counterparty16";
				definition = "Information related to counterparty identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrganisationIdentification5Choice getIdentification() {
		return identification;
	}

	public Counterparty16 setIdentification(OrganisationIdentification5Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public CounterpartyTradeNature4Choice getNature() {
		return nature;
	}

	public Counterparty16 setNature(CounterpartyTradeNature4Choice nature) {
		this.nature = Objects.requireNonNull(nature);
		return this;
	}

	public TradingCapacity7Code getTradingCapacity() {
		return tradingCapacity;
	}

	public Counterparty16 setTradingCapacity(TradingCapacity7Code tradingCapacity) {
		this.tradingCapacity = Objects.requireNonNull(tradingCapacity);
		return this;
	}

	public OptionParty1Code getCounterpartySide() {
		return counterpartySide;
	}

	public Counterparty16 setCounterpartySide(OptionParty1Code counterpartySide) {
		this.counterpartySide = Objects.requireNonNull(counterpartySide);
		return this;
	}
}