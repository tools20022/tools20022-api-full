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
import com.tools20022.repository.choice.WarrantStyle3Choice;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Warrant;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Organisation27;
import com.tools20022.repository.msg.Price1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Financial instrument that gives the holder the right to purchase shares or
 * bonds at a given price within a specified time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant3#mmMultiplier
 * Warrant3.mmMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant3#mmSubscriptionPrice
 * Warrant3.mmSubscriptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant3#mmType
 * Warrant3.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant3#mmWarrantAgent
 * Warrant3.mmWarrantAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Warrant3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Warrant3", propOrder = {"multiplier", "subscriptionPrice", "type", "warrantAgent"})
public class Warrant3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mltplr")
	protected BaseOneRate multiplier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmMultiplier
	 * Warrant.mmMultiplier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant3
	 * Warrant3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mltplr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Warrant3, Optional<BaseOneRate>> mmMultiplier = new MMMessageAttribute<Warrant3, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> Warrant.mmMultiplier;
			componentContext_lazy = () -> com.tools20022.repository.msg.Warrant3.mmObject();
			isDerived = false;
			xmlTag = "Mltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multiplier";
			definition = "Specifies the ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(Warrant3 obj) {
			return obj.getMultiplier();
		}

		@Override
		public void setValue(Warrant3 obj, Optional<BaseOneRate> value) {
			obj.setMultiplier(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptPric")
	protected Price1 subscriptionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant3
	 * Warrant3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPric"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Warrant3, Optional<Price1>> mmSubscriptionPrice = new MMMessageAttribute<Warrant3, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Warrant.mmSubscriptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Warrant3.mmObject();
			isDerived = false;
			xmlTag = "SbcptPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Warrant3 obj) {
			return obj.getSubscriptionPrice();
		}

		@Override
		public void setValue(Warrant3 obj, Optional<Price1> value) {
			obj.setSubscriptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected WarrantStyle3Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.WarrantStyle3Choice
	 * WarrantStyle3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmStyle
	 * Warrant.mmStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant3
	 * Warrant3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates when a warrant can be exercised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Warrant3, Optional<WarrantStyle3Choice>> mmType = new MMMessageAttribute<Warrant3, Optional<WarrantStyle3Choice>>() {
		{
			businessElementTrace_lazy = () -> Warrant.mmStyle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Warrant3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates when a warrant can be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> WarrantStyle3Choice.mmObject();
		}

		@Override
		public Optional<WarrantStyle3Choice> getValue(Warrant3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Warrant3 obj, Optional<WarrantStyle3Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "WarrtAgt")
	protected List<Organisation27> warrantAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation27
	 * Organisation27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant3
	 * Warrant3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WarrtAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the issuer to process the exercising of warrants, sometimes responsible for the issuance of the warrants into the market."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Warrant3, List<Organisation27>> mmWarrantAgent = new MMMessageAssociationEnd<Warrant3, List<Organisation27>>() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Warrant3.mmObject();
			isDerived = false;
			xmlTag = "WarrtAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantAgent";
			definition = "Entity appointed by the issuer to process the exercising of warrants, sometimes responsible for the issuance of the warrants into the market.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Organisation27.mmObject();
		}

		@Override
		public List<Organisation27> getValue(Warrant3 obj) {
			return obj.getWarrantAgent();
		}

		@Override
		public void setValue(Warrant3 obj, List<Organisation27> value) {
			obj.setWarrantAgent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Warrant3.mmMultiplier, com.tools20022.repository.msg.Warrant3.mmSubscriptionPrice, com.tools20022.repository.msg.Warrant3.mmType,
						com.tools20022.repository.msg.Warrant3.mmWarrantAgent);
				trace_lazy = () -> Warrant.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Warrant3";
				definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BaseOneRate> getMultiplier() {
		return multiplier == null ? Optional.empty() : Optional.of(multiplier);
	}

	public Warrant3 setMultiplier(BaseOneRate multiplier) {
		this.multiplier = multiplier;
		return this;
	}

	public Optional<Price1> getSubscriptionPrice() {
		return subscriptionPrice == null ? Optional.empty() : Optional.of(subscriptionPrice);
	}

	public Warrant3 setSubscriptionPrice(Price1 subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
		return this;
	}

	public Optional<WarrantStyle3Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Warrant3 setType(WarrantStyle3Choice type) {
		this.type = type;
		return this;
	}

	public List<Organisation27> getWarrantAgent() {
		return warrantAgent == null ? warrantAgent = new ArrayList<>() : warrantAgent;
	}

	public Warrant3 setWarrantAgent(List<Organisation27> warrantAgent) {
		this.warrantAgent = Objects.requireNonNull(warrantAgent);
		return this;
	}
}