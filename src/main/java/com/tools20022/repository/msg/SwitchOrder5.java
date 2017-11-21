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
import com.tools20022.repository.entity.SwitchOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extract of trade data for a switch order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrder5#mmInvestmentAccountDetails
 * SwitchOrder5.mmInvestmentAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder5#mmRedemptionLeg
 * SwitchOrder5.mmRedemptionLeg}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrder5#mmSubscriptionLeg
 * SwitchOrder5.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SwitchOrder
 * SwitchOrder}</li>
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
 * "SwitchOrder5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extract of trade data for a switch order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SwitchOrder5", propOrder = {"investmentAccountDetails", "redemptionLeg", "subscriptionLeg"})
public class SwitchOrder5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccount30 investmentAccountDetails;
	/**
	 * Account information of the order instruction for which the cancellation
	 * is requested.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5 SwitchOrder5}</li>
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
	 * "Account information of the order instruction for which the cancellation is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> SwitchOrder5.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the order instruction for which the cancellation is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount30.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SwitchRedemptionLegOrder4> redemptionLeg;
	/**
	 * Redemption leg information of the order instruction which the
	 * cancellation is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4
	 * SwitchRedemptionLegOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmRedemptionLeg
	 * SwitchOrder.mmRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5 SwitchOrder5}</li>
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
	 * "Redemption leg information of the order instruction which the cancellation is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionLeg = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmRedemptionLeg;
			componentContext_lazy = () -> SwitchOrder5.mmObject();
			isDerived = false;
			xmlTag = "RedLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg information of the order instruction which the cancellation is requested.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchRedemptionLegOrder4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SwitchSubscriptionLegOrder4> subscriptionLeg;
	/**
	 * Subscription leg information of the order instruction which the
	 * cancellation is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4
	 * SwitchSubscriptionLegOrder4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmSubscriptionLeg
	 * SwitchOrder.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrder5 SwitchOrder5}</li>
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
	 * "Subscription leg information of the order instruction which the cancellation is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionLeg = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SwitchOrder.mmSubscriptionLeg;
			componentContext_lazy = () -> SwitchOrder5.mmObject();
			isDerived = false;
			xmlTag = "SbcptLeg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg information of the order instruction which the cancellation is requested.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SwitchSubscriptionLegOrder4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SwitchOrder5.mmInvestmentAccountDetails, SwitchOrder5.mmRedemptionLeg, SwitchOrder5.mmSubscriptionLeg);
				trace_lazy = () -> SwitchOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SwitchOrder5";
				definition = "Extract of trade data for a switch order.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InvstmtAcctDtls")
	public InvestmentAccount30 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public void setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount30 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
	}

	@XmlElement(name = "RedLeg", required = true)
	public List<SwitchRedemptionLegOrder4> getRedemptionLeg() {
		return redemptionLeg;
	}

	public void setRedemptionLeg(List<com.tools20022.repository.msg.SwitchRedemptionLegOrder4> redemptionLeg) {
		this.redemptionLeg = redemptionLeg;
	}

	@XmlElement(name = "SbcptLeg", required = true)
	public List<SwitchSubscriptionLegOrder4> getSubscriptionLeg() {
		return subscriptionLeg;
	}

	public void setSubscriptionLeg(List<com.tools20022.repository.msg.SwitchSubscriptionLegOrder4> subscriptionLeg) {
		this.subscriptionLeg = subscriptionLeg;
	}
}