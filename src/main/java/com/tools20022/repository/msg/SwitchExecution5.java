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
import com.tools20022.repository.entity.InvestmentFundTransaction;
import com.tools20022.repository.entity.SwitchExecution;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extract of trade data for a switch order confirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmInvestmentAccountDetails
 * SwitchExecution5.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmRedemptionLeg
 * SwitchExecution5.mmRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmSubscriptionLeg
 * SwitchExecution5.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchExecution
 * SwitchExecution}</li>
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
 * "SwitchExecution5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extract of trade data for a switch order confirmation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchExecution5", propOrder = {"investmentAccountDetails", "redemptionLeg", "subscriptionLeg"})
public class SwitchExecution5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount30 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount30
	 * InvestmentAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5
	 * SwitchExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information of the switch order / switch order confirmation for which the advice is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution5.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the switch order / switch order confirmation for which the advice is given.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount30.mmObject();
		}
	};
	@XmlElement(name = "RedLeg", required = true)
	protected List<com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4> redemptionLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4
	 * SwitchExecutionRedemptionLeg4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
	 * SwitchExecution.mmRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5
	 * SwitchExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption leg information of the switch order / switch order confirmation for which the advice is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionLeg = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SwitchExecution.mmRedemptionLeg;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution5.mmObject();
			isDerived = false;
			xmlTag = "RedLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg information of the switch order / switch order confirmation for which the advice is given.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4.mmObject();
		}
	};
	@XmlElement(name = "SbcptLeg", required = true)
	protected List<com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4> subscriptionLeg;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4
	 * SwitchExecutionSubscriptionLeg4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
	 * SwitchExecution.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5
	 * SwitchExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subscription leg information of the switch order / switch order confirmation for which the advice is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionLeg = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SwitchExecution.mmSubscriptionLeg;
			componentContext_lazy = () -> com.tools20022.repository.msg.SwitchExecution5.mmObject();
			isDerived = false;
			xmlTag = "SbcptLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg information of the switch order / switch order confirmation for which the advice is given.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution5.mmInvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecution5.mmRedemptionLeg,
						com.tools20022.repository.msg.SwitchExecution5.mmSubscriptionLeg);
				trace_lazy = () -> SwitchExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SwitchExecution5";
				definition = "Extract of trade data for a switch order confirmation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount30> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public SwitchExecution5 setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount30 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public List<SwitchExecutionRedemptionLeg4> getRedemptionLeg() {
		return redemptionLeg == null ? redemptionLeg = new ArrayList<>() : redemptionLeg;
	}

	public SwitchExecution5 setRedemptionLeg(List<com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4> redemptionLeg) {
		this.redemptionLeg = Objects.requireNonNull(redemptionLeg);
		return this;
	}

	public List<SwitchExecutionSubscriptionLeg4> getSubscriptionLeg() {
		return subscriptionLeg == null ? subscriptionLeg = new ArrayList<>() : subscriptionLeg;
	}

	public SwitchExecution5 setSubscriptionLeg(List<com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4> subscriptionLeg) {
		this.subscriptionLeg = Objects.requireNonNull(subscriptionLeg);
		return this;
	}
}