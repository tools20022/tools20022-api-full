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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
 * SwitchExecution.mmRedemptionLeg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
 * SwitchExecution.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1#mmSwitchExecutionDetails
 * SwitchOrderConfirmation1.mmSwitchExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice#mmSwitchDetails
 * SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSwitchDetails}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.SwitchExecutionRedemptionLeg> redemptionLeg;
	/**
	 * Redemption leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmRelatedSwitchExecution
	 * SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
	 * SwitchExecutionRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmRedemptionLegDetails
	 * SwitchExecution3.mmRedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmRedemptionLegDetails
	 * SwitchExecution4.mmRedemptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmRedemptionLeg
	 * SwitchExecution5.mmRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmRedemptionLegDetails
	 * SwitchExecution7.mmRedemptionLegDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmRedemptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.mmRedemptionLegDetails, com.tools20022.repository.msg.SwitchExecution4.mmRedemptionLegDetails,
					com.tools20022.repository.msg.SwitchExecution5.mmRedemptionLeg, com.tools20022.repository.msg.SwitchExecution7.mmRedemptionLegDetails);
			elementContext_lazy = () -> SwitchExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionLeg";
			definition = "Redemption leg of a switch order execution.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg> subscriptionLeg;
	/**
	 * Subscription leg of a switch order execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmRelatedSwitchExecution
	 * SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
	 * SwitchExecutionSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution3#mmSubscriptionLegDetails
	 * SwitchExecution3.mmSubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution4#mmSubscriptionLegDetails
	 * SwitchExecution4.mmSubscriptionLegDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution5#mmSubscriptionLeg
	 * SwitchExecution5.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchExecution7#mmSubscriptionLegDetails
	 * SwitchExecution7.mmSubscriptionLegDetails}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmSubscriptionLeg = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchExecution3.mmSubscriptionLegDetails, com.tools20022.repository.msg.SwitchExecution4.mmSubscriptionLegDetails,
					com.tools20022.repository.msg.SwitchExecution5.mmSubscriptionLeg, com.tools20022.repository.msg.SwitchExecution7.mmSubscriptionLegDetails);
			elementContext_lazy = () -> SwitchExecution.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionLeg";
			definition = "Subscription leg of a switch order execution.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwitchExecution";
				definition = "Execution of a switch order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution, com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SwitchOrderConfirmation1.mmSwitchExecutionDetails,
						com.tools20022.repository.choice.SubscriptionOrRedemptionOrSwitchOrderExecutionDataChoice.mmSwitchDetails);
				superType_lazy = () -> InvestmentFundOrderExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecution.mmRedemptionLeg, com.tools20022.repository.entity.SwitchExecution.mmSubscriptionLeg);
				derivationComponent_lazy = () -> Arrays.asList(SwitchExecution3.mmObject(), SwitchExecution4.mmObject(), SwitchOrderConfirmation1.mmObject(), SwitchExecution5.mmObject(), SwitchExecution7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SwitchExecutionRedemptionLeg> getRedemptionLeg() {
		return redemptionLeg;
	}

	public void setRedemptionLeg(List<com.tools20022.repository.entity.SwitchExecutionRedemptionLeg> redemptionLeg) {
		this.redemptionLeg = redemptionLeg;
	}

	public List<SwitchExecutionSubscriptionLeg> getSubscriptionLeg() {
		return subscriptionLeg;
	}

	public void setSubscriptionLeg(List<com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg> subscriptionLeg) {
		this.subscriptionLeg = subscriptionLeg;
	}
}