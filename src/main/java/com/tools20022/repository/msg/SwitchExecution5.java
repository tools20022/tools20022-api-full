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
import com.tools20022.repository.entity.SwitchExecution;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#InvestmentAccountDetails
 * SwitchExecution5.InvestmentAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution5#RedemptionLeg
 * SwitchExecution5.RedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#SubscriptionLeg
 * SwitchExecution5.SubscriptionLeg}</li>
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
public class SwitchExecution5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account information of the switch order / switch order confirmation for
	 * which the advice is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount30
	 * InvestmentAccount30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#InvestmentAccount
	 * InvestmentFundTransaction.InvestmentAccount}</li>
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
	public static final MMMessageAssociationEnd InvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SwitchExecution5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.InvestmentAccount;
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the switch order / switch order confirmation for which the advice is given.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccount30.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Redemption leg information of the switch order / switch order
	 * confirmation for which the advice is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4
	 * SwitchExecutionRedemptionLeg4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#RedemptionLeg
	 * SwitchExecution.RedemptionLeg}</li>
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
	public static final MMMessageAssociationEnd RedemptionLeg = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SwitchExecution5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SwitchExecution.RedemptionLeg;
			isDerived = false;
			xmlTag = "RedLeg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg information of the switch order / switch order confirmation for which the advice is given.";
			minOccurs = 1;
			type_lazy = () -> SwitchExecutionRedemptionLeg4.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Subscription leg information of the switch order / switch order
	 * confirmation for which the advice is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4
	 * SwitchExecutionSubscriptionLeg4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#SubscriptionLeg
	 * SwitchExecution.SubscriptionLeg}</li>
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
	public static final MMMessageAssociationEnd SubscriptionLeg = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SwitchExecution5.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SwitchExecution.SubscriptionLeg;
			isDerived = false;
			xmlTag = "SbcptLeg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg information of the switch order / switch order confirmation for which the advice is given.";
			minOccurs = 1;
			type_lazy = () -> SwitchExecutionSubscriptionLeg4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution5.InvestmentAccountDetails, com.tools20022.repository.msg.SwitchExecution5.RedemptionLeg,
						com.tools20022.repository.msg.SwitchExecution5.SubscriptionLeg);
				trace_lazy = () -> SwitchExecution.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SwitchExecution5";
				definition = "Extract of trade data for a switch order confirmation.";
			}
		});
		return mmObject_lazy.get();
	}
}