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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InvestorProfileStatus1Choice;
import com.tools20022.repository.choice.ProfileType1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.HighFrequencyTradingProfile1;
import com.tools20022.repository.msg.MarketMakerProfile1;
import com.tools20022.repository.msg.TreasuryProfile1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about actions that may be taken on an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestorProfile1#mmType
 * InvestorProfile1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestorProfile1#mmStatus
 * InvestorProfile1.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestorProfile1#mmTreasury
 * InvestorProfile1.mmTreasury}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestorProfile1#mmHighFrequencyTrading
 * InvestorProfile1.mmHighFrequencyTrading}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestorProfile1#mmMarketMaker
 * InvestorProfile1.mmMarketMaker}</li>
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
 * "InvestorProfile1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about actions that may be taken on an account."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestorProfile1", propOrder = {"type", "status", "treasury", "highFrequencyTrading", "marketMaker"})
public class InvestorProfile1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp")
	protected ProfileType1Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ProfileType1Choice
	 * ProfileType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of profile."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestorProfile1, Optional<ProfileType1Choice>> mmType = new MMMessageAssociationEnd<InvestorProfile1, Optional<ProfileType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of profile.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProfileType1Choice.mmObject();
		}

		@Override
		public Optional<ProfileType1Choice> getValue(InvestorProfile1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(InvestorProfile1 obj, Optional<ProfileType1Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected InvestorProfileStatus1Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestorProfileStatus1Choice
	 * InvestorProfileStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the profile."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestorProfile1, Optional<InvestorProfileStatus1Choice>> mmStatus = new MMMessageAssociationEnd<InvestorProfile1, Optional<InvestorProfileStatus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the profile.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestorProfileStatus1Choice.mmObject();
		}

		@Override
		public Optional<InvestorProfileStatus1Choice> getValue(InvestorProfile1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(InvestorProfile1 obj, Optional<InvestorProfileStatus1Choice> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Trsr")
	protected TreasuryProfile1 treasury;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TreasuryProfile1
	 * TreasuryProfile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trsr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Treasury"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the profile for treasury trading."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestorProfile1, Optional<TreasuryProfile1>> mmTreasury = new MMMessageAssociationEnd<InvestorProfile1, Optional<TreasuryProfile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
			isDerived = false;
			xmlTag = "Trsr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Treasury";
			definition = "Information about the profile for treasury trading.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TreasuryProfile1.mmObject();
		}

		@Override
		public Optional<TreasuryProfile1> getValue(InvestorProfile1 obj) {
			return obj.getTreasury();
		}

		@Override
		public void setValue(InvestorProfile1 obj, Optional<TreasuryProfile1> value) {
			obj.setTreasury(value.orElse(null));
		}
	};
	@XmlElement(name = "HghFrqcyTradg")
	protected HighFrequencyTradingProfile1 highFrequencyTrading;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.HighFrequencyTradingProfile1
	 * HighFrequencyTradingProfile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HghFrqcyTradg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighFrequencyTrading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the profile for high frequency trading."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestorProfile1, Optional<HighFrequencyTradingProfile1>> mmHighFrequencyTrading = new MMMessageAssociationEnd<InvestorProfile1, Optional<HighFrequencyTradingProfile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
			isDerived = false;
			xmlTag = "HghFrqcyTradg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HighFrequencyTrading";
			definition = "Information about the profile for high frequency trading.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HighFrequencyTradingProfile1.mmObject();
		}

		@Override
		public Optional<HighFrequencyTradingProfile1> getValue(InvestorProfile1 obj) {
			return obj.getHighFrequencyTrading();
		}

		@Override
		public void setValue(InvestorProfile1 obj, Optional<HighFrequencyTradingProfile1> value) {
			obj.setHighFrequencyTrading(value.orElse(null));
		}
	};
	@XmlElement(name = "MktMakr")
	protected MarketMakerProfile1 marketMaker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketMakerProfile1
	 * MarketMakerProfile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktMakr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the profile for a market marker."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestorProfile1, Optional<MarketMakerProfile1>> mmMarketMaker = new MMMessageAssociationEnd<InvestorProfile1, Optional<MarketMakerProfile1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
			isDerived = false;
			xmlTag = "MktMakr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketMaker";
			definition = "Information about the profile for a market marker.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketMakerProfile1.mmObject();
		}

		@Override
		public Optional<MarketMakerProfile1> getValue(InvestorProfile1 obj) {
			return obj.getMarketMaker();
		}

		@Override
		public void setValue(InvestorProfile1 obj, Optional<MarketMakerProfile1> value) {
			obj.setMarketMaker(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestorProfile1.mmType, com.tools20022.repository.msg.InvestorProfile1.mmStatus, com.tools20022.repository.msg.InvestorProfile1.mmTreasury,
						com.tools20022.repository.msg.InvestorProfile1.mmHighFrequencyTrading, com.tools20022.repository.msg.InvestorProfile1.mmMarketMaker);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestorProfile1";
				definition = "Information about actions that may be taken on an account.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ProfileType1Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public InvestorProfile1 setType(ProfileType1Choice type) {
		this.type = type;
		return this;
	}

	public Optional<InvestorProfileStatus1Choice> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public InvestorProfile1 setStatus(InvestorProfileStatus1Choice status) {
		this.status = status;
		return this;
	}

	public Optional<TreasuryProfile1> getTreasury() {
		return treasury == null ? Optional.empty() : Optional.of(treasury);
	}

	public InvestorProfile1 setTreasury(TreasuryProfile1 treasury) {
		this.treasury = treasury;
		return this;
	}

	public Optional<HighFrequencyTradingProfile1> getHighFrequencyTrading() {
		return highFrequencyTrading == null ? Optional.empty() : Optional.of(highFrequencyTrading);
	}

	public InvestorProfile1 setHighFrequencyTrading(HighFrequencyTradingProfile1 highFrequencyTrading) {
		this.highFrequencyTrading = highFrequencyTrading;
		return this;
	}

	public Optional<MarketMakerProfile1> getMarketMaker() {
		return marketMaker == null ? Optional.empty() : Optional.of(marketMaker);
	}

	public InvestorProfile1 setMarketMaker(MarketMakerProfile1 marketMaker) {
		this.marketMaker = marketMaker;
		return this;
	}
}