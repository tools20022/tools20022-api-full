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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.InvestmentFundOrderExecution;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Execution of a switch order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchExecution" src="doc-files/SwitchExecution.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#RedemptionLeg
 * SwitchExecution.RedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#SubscriptionLeg
 * SwitchExecution.SubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#RelatedSwitchExecution
 * SwitchExecutionRedemptionLeg.RelatedSwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#RelatedSwitchExecution
 * SwitchExecutionSubscriptionLeg.RelatedSwitchExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1#SwitchExecutionDetails
 * SwitchOrderConfirmation1.SwitchExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#SwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.SwitchDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
 * InvestmentFundOrderExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution3
 * SwitchExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution4
 * SwitchExecution4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
 * SwitchOrderConfirmation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution5
 * SwitchExecution5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecution7
 * SwitchExecution7}</li>
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
 * "SwitchExecution"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a switch order."</li>
 * </ul>
 */
public class SwitchExecution extends InvestmentFundOrderExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Redemption leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#RelatedSwitchExecution
	 * SwitchExecutionRedemptionLeg.RelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
	 * SwitchExecutionRedemptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#RedemptionLegDetails
	 * SwitchExecution3.RedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#RedemptionLegDetails
	 * SwitchExecution4.RedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#RedemptionLeg
	 * SwitchExecution5.RedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#RedemptionLegDetails
	 * SwitchExecution7.RedemptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.RedemptionLegDetails, com.tools20022.repository.msg.SwitchExecution4.RedemptionLegDetails,
					com.tools20022.repository.msg.SwitchExecution5.RedemptionLeg, com.tools20022.repository.msg.SwitchExecution7.RedemptionLegDetails);
			elementContext_lazy = () -> SwitchExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg of a switch order execution.";
			minOccurs = 1;
			type_lazy = () -> SwitchExecutionRedemptionLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.RelatedSwitchExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Subscription leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#RelatedSwitchExecution
	 * SwitchExecutionSubscriptionLeg.RelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
	 * SwitchExecutionSubscriptionLeg}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#SubscriptionLegDetails
	 * SwitchExecution3.SubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#SubscriptionLegDetails
	 * SwitchExecution4.SubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#SubscriptionLeg
	 * SwitchExecution5.SubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#SubscriptionLegDetails
	 * SwitchExecution7.SubscriptionLegDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionLeg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Subscription leg of a switch order execution."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.SubscriptionLegDetails, com.tools20022.repository.msg.SwitchExecution4.SubscriptionLegDetails,
					com.tools20022.repository.msg.SwitchExecution5.SubscriptionLeg, com.tools20022.repository.msg.SwitchExecution7.SubscriptionLegDetails);
			elementContext_lazy = () -> SwitchExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg of a switch order execution.";
			minOccurs = 1;
			type_lazy = () -> SwitchExecutionSubscriptionLeg.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.RelatedSwitchExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwitchExecution";
				definition = "Execution of a switch order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.RelatedSwitchExecution, com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.RelatedSwitchExecution);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderConfirmation1.SwitchExecutionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.SwitchDetails);
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecution.RedemptionLeg, com.tools20022.repository.entity.SwitchExecution.SubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(SwitchExecution3.mmObject(), SwitchExecution4.mmObject(), SwitchOrderConfirmation1.mmObject(), SwitchExecution5.mmObject(), SwitchExecution7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}