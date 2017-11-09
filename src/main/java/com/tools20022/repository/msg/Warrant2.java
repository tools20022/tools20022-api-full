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
import com.tools20022.repository.choice.WarrantStyle2Choice;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.entity.Organisation;
import com.tools20022.repository.entity.Warrant;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#mmMultiplier
 * Warrant2.mmMultiplier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#mmSubscriptionPrice
 * Warrant2.mmSubscriptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#mmType
 * Warrant2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Warrant2#mmWarrantAgent
 * Warrant2.mmWarrantAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Warrant2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time."
 * </li>
 * </ul>
 */
public class Warrant2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BaseOneRate multiplier;
	/**
	 * Specifies the ratio or multiply factor used to convert from contracts to
	 * shares.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant2
	 * Warrant2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mltplr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiplier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMultiplier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Warrant.mmMultiplier;
			componentContext_lazy = () -> Warrant2.mmObject();
			isDerived = false;
			xmlTag = "Mltplr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multiplier";
			definition = "Specifies the ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected Price1 subscriptionPrice;
	/**
	 * Pre-determined price at which the holder of a warrant is entitled to buy
	 * the underlying instrument.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant2
	 * Warrant2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Warrant.mmSubscriptionPrice;
			componentContext_lazy = () -> Warrant2.mmObject();
			isDerived = false;
			xmlTag = "SbcptPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPrice";
			definition = "Pre-determined price at which the holder of a warrant is entitled to buy the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected WarrantStyle2Choice type;
	/**
	 * Indicates when a warrant can be exercised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.WarrantStyle2Choice
	 * WarrantStyle2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmStyle
	 * Warrant.mmStyle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant2
	 * Warrant2}</li>
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
	 * definition} = "Indicates when a warrant can be exercised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Warrant.mmStyle;
			componentContext_lazy = () -> Warrant2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates when a warrant can be exercised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> WarrantStyle2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Organisation2> warrantAgent;
	/**
	 * Entity appointed by the issuer to process the exercising of warrants,
	 * sometimes responsible for the issuance of the warrants into the market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation2
	 * Organisation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Warrant2
	 * Warrant2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WarrtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity appointed by the issuer to process the exercising of warrants, sometimes responsible for the issuance of the warrants into the market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWarrantAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> Warrant2.mmObject();
			isDerived = false;
			xmlTag = "WarrtAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantAgent";
			definition = "Entity appointed by the issuer to process the exercising of warrants, sometimes responsible for the issuance of the warrants into the market.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Warrant2.mmMultiplier, Warrant2.mmSubscriptionPrice, Warrant2.mmType, Warrant2.mmWarrantAgent);
				trace_lazy = () -> Warrant.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Warrant2";
				definition = "Financial instrument that gives the holder the right to purchase shares or bonds at a given price within a specified time.";
			}
		});
		return mmObject_lazy.get();
	}

	public BaseOneRate getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(BaseOneRate multiplier) {
		this.multiplier = multiplier;
	}

	public Price1 getSubscriptionPrice() {
		return subscriptionPrice;
	}

	public void setSubscriptionPrice(com.tools20022.repository.msg.Price1 subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}

	public WarrantStyle2Choice getType() {
		return type;
	}

	public void setType(WarrantStyle2Choice type) {
		this.type = type;
	}

	public List<Organisation2> getWarrantAgent() {
		return warrantAgent;
	}

	public void setWarrantAgent(List<com.tools20022.repository.msg.Organisation2> warrantAgent) {
		this.warrantAgent = warrantAgent;
	}
}