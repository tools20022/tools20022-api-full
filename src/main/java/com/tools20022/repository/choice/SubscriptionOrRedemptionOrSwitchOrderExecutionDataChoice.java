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
import com.tools20022.repository.entity.RedemptionExecution;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.entity.SwitchExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RedemptionExecution11;
import com.tools20022.repository.msg.SubscriptionExecution8;
import com.tools20022.repository.msg.SwitchExecution5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of subscription details executed, or redemption details executed, or
 * switch order details executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmSubscriptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.
 * mmSubscriptionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmRedemptionDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmRedemptionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmSwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSwitchDetails}</li>
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
 * "SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of subscription details executed, or redemption details executed, or switch order details executed."
 * </li>
 * </ul>
 */
public class SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected SubscriptionExecution8 subscriptionDetails;
	/**
	 * Subscription order confirmation data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubscriptionExecution8
	 * SubscriptionExecution8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
	 * SubscriptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice}</li>
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
	 * definition} = "Subscription order confirmation data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SubscriptionExecution.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
			isDerived = false;
			xmlTag = "SbcptDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionDetails";
			definition = "Subscription order confirmation data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SubscriptionExecution8.mmObject();
		}
	};
	protected RedemptionExecution11 redemptionDetails;
	/**
	 * Redemption order confirmation data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionExecution11
	 * RedemptionExecution11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice}</li>
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
	 * definition} = "Redemption order confirmation data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
			isDerived = false;
			xmlTag = "RedDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionDetails";
			definition = "Redemption order confirmation data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RedemptionExecution11.mmObject();
		}
	};
	protected SwitchExecution5 switchDetails;
	/**
	 * Switch order confirmation data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SwitchExecution5
	 * SwitchExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice
	 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice}</li>
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
	 * definition} = "Switch order confirmation data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSwitchDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SwitchExecution.mmObject();
			componentContext_lazy = () -> SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
			isDerived = false;
			xmlTag = "SwtchDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchDetails";
			definition = "Switch order confirmation data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SwitchExecution5.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSubscriptionDetails, SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmRedemptionDetails,
						SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSwitchDetails);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice";
				definition = "Choice of subscription details executed, or redemption details executed, or switch order details executed.";
			}
		});
		return mmObject_lazy.get();
	}

	public SubscriptionExecution8 getSubscriptionDetails() {
		return subscriptionDetails;
	}

	public void setSubscriptionDetails(SubscriptionExecution8 subscriptionDetails) {
		this.subscriptionDetails = subscriptionDetails;
	}

	public RedemptionExecution11 getRedemptionDetails() {
		return redemptionDetails;
	}

	public void setRedemptionDetails(RedemptionExecution11 redemptionDetails) {
		this.redemptionDetails = redemptionDetails;
	}

	public SwitchExecution5 getSwitchDetails() {
		return switchDetails;
	}

	public void setSwitchDetails(SwitchExecution5 switchDetails) {
		this.switchDetails = switchDetails;
	}
}