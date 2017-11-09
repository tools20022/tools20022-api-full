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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.RedemptionOrder;
import com.tools20022.repository.entity.SubscriptionOrder;
import com.tools20022.repository.entity.SwitchOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RedemptionOrder10;
import com.tools20022.repository.msg.SubscriptionOrder10;
import com.tools20022.repository.msg.SwitchOrder5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of subscription, redemption or switch order details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#mmSubscriptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#mmRedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmRedemptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice#mmSwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSwitchDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
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
 * "SubscriptionOrRedemptionOrSwitchOrderDataChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of subscription, redemption or switch order details."</li>
 * </ul>
 */
public class SubscriptionOrRedemptionOrSwitchOrderDataChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SubscriptionOrder10 subscriptionDetails;
	/**
	 * Subscription order data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubscriptionOrder10
	 * SubscriptionOrder10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionOrder
	 * SubscriptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderDataChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subscription order data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SubscriptionOrder.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmObject();
			isDerived = false;
			xmlTag = "SbcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDetails";
			definition = "Subscription order data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SubscriptionOrder10.mmObject();
		}
	};
	protected RedemptionOrder10 redemptionDetails;
	/**
	 * Redemption order data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionOrder10
	 * RedemptionOrder10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderDataChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption order data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmObject();
			isDerived = false;
			xmlTag = "RedDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDetails";
			definition = "Redemption order data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RedemptionOrder10.mmObject();
		}
	};
	protected SwitchOrder5 switchDetails;
	/**
	 * Switch order data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwitchOrder5
	 * SwitchOrder5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderDataChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch order data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwitchDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SwitchOrder.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmObject();
			isDerived = false;
			xmlTag = "SwtchDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchDetails";
			definition = "Switch order data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwitchOrder5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSubscriptionDetails, SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmRedemptionDetails,
						SubscriptionOrRedemptionOrSwitchOrderDataChoice.mmSwitchDetails);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SubscriptionOrRedemptionOrSwitchOrderDataChoice";
				definition = "Choice of subscription, redemption or switch order details.";
			}
		});
		return mmObject_lazy.get();
	}

	public SubscriptionOrder10 getSubscriptionDetails() {
		return subscriptionDetails;
	}

	public void setSubscriptionDetails(SubscriptionOrder10 subscriptionDetails) {
		this.subscriptionDetails = subscriptionDetails;
	}

	public RedemptionOrder10 getRedemptionDetails() {
		return redemptionDetails;
	}

	public void setRedemptionDetails(RedemptionOrder10 redemptionDetails) {
		this.redemptionDetails = redemptionDetails;
	}

	public SwitchOrder5 getSwitchDetails() {
		return switchDetails;
	}

	public void setSwitchDetails(SwitchOrder5 switchDetails) {
		this.switchDetails = switchDetails;
	}
}