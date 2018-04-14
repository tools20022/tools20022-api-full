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
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of subscription details executed, or redemption details executed, or switch order details executed."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice", propOrder = {"subscriptionDetails", "redemptionDetails", "switchDetails"})
public class SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SbcptDtls", required = true)
	protected SubscriptionExecution8 subscriptionDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subscription order confirmation data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, SubscriptionExecution8> mmSubscriptionDetails = new MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, SubscriptionExecution8>() {
		{
			businessComponentTrace_lazy = () -> SubscriptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
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

		@Override
		public SubscriptionExecution8 getValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj) {
			return obj.getSubscriptionDetails();
		}

		@Override
		public void setValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj, SubscriptionExecution8 value) {
			obj.setSubscriptionDetails(value);
		}
	};
	@XmlElement(name = "RedDtls", required = true)
	protected RedemptionExecution11 redemptionDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption order confirmation data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, RedemptionExecution11> mmRedemptionDetails = new MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, RedemptionExecution11>() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
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

		@Override
		public RedemptionExecution11 getValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj) {
			return obj.getRedemptionDetails();
		}

		@Override
		public void setValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj, RedemptionExecution11 value) {
			obj.setRedemptionDetails(value);
		}
	};
	@XmlElement(name = "SwtchDtls", required = true)
	protected SwitchExecution5 switchDetails;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch order confirmation data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, SwitchExecution5> mmSwitchDetails = new MMMessageAssociationEnd<SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice, SwitchExecution5>() {
		{
			businessComponentTrace_lazy = () -> SwitchExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmObject();
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

		@Override
		public SwitchExecution5 getValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj) {
			return obj.getSwitchDetails();
		}

		@Override
		public void setValue(SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice obj, SwitchExecution5 value) {
			obj.setSwitchDetails(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSubscriptionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmRedemptionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSwitchDetails);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
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

	public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setSubscriptionDetails(SubscriptionExecution8 subscriptionDetails) {
		this.subscriptionDetails = Objects.requireNonNull(subscriptionDetails);
		return this;
	}

	public RedemptionExecution11 getRedemptionDetails() {
		return redemptionDetails;
	}

	public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setRedemptionDetails(RedemptionExecution11 redemptionDetails) {
		this.redemptionDetails = Objects.requireNonNull(redemptionDetails);
		return this;
	}

	public SwitchExecution5 getSwitchDetails() {
		return switchDetails;
	}

	public SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice setSwitchDetails(SwitchExecution5 switchDetails) {
		this.switchDetails = Objects.requireNonNull(switchDetails);
		return this;
	}
}