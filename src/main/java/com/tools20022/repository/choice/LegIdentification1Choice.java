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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of leg.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#mmRedemptionLegIdentification
 * LegIdentification1Choice.mmRedemptionLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice#mmSubscriptionLegIdentification
 * LegIdentification1Choice.mmSubscriptionLegIdentification}</li>
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
 * "LegIdentification1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of leg."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "LegIdentification1Choice", propOrder = {"redemptionLegIdentification", "subscriptionLegIdentification"})
public class LegIdentification1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text redemptionLegIdentification;
	/**
	 * Unique technical identifier for the instance of the leg within a switch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice
	 * LegIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for the instance of the leg within a switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRedemptionLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> LegIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "RedLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLegIdentification";
			definition = "Unique technical identifier for the instance of the leg within a switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text subscriptionLegIdentification;
	/**
	 * Unique technical identifier for the instance of the leg within a switch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LegIdentification1Choice
	 * LegIdentification1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for the instance of the leg within a switch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriptionLegIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> LegIdentification1Choice.mmObject();
			isDerived = false;
			xmlTag = "SbcptLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLegIdentification";
			definition = "Unique technical identifier for the instance of the leg within a switch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(LegIdentification1Choice.mmRedemptionLegIdentification, LegIdentification1Choice.mmSubscriptionLegIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LegIdentification1Choice";
				definition = "Choice of leg.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RedLegId", required = true)
	public Max35Text getRedemptionLegIdentification() {
		return redemptionLegIdentification;
	}

	public void setRedemptionLegIdentification(Max35Text redemptionLegIdentification) {
		this.redemptionLegIdentification = redemptionLegIdentification;
	}

	@XmlElement(name = "SbcptLegId", required = true)
	public Max35Text getSubscriptionLegIdentification() {
		return subscriptionLegIdentification;
	}

	public void setSubscriptionLegIdentification(Max35Text subscriptionLegIdentification) {
		this.subscriptionLegIdentification = subscriptionLegIdentification;
	}
}