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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4;
import com.tools20022.repository.msg.SwitchSubscriptionLegExecution2;
import com.tools20022.repository.msg.SwitchSubscriptionLegExecution3;
import com.tools20022.repository.msg.SwitchSubscriptionLegExecution4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Execution of the subscription part, in a switch between investment funds or
 * investment fund classes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchExecutionSubscriptionLeg"
 * src="doc-files/SwitchExecutionSubscriptionLeg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg#mmPercentageOfTotalRedemptionAmount
 * SwitchExecutionSubscriptionLeg.mmPercentageOfTotalRedemptionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
 * SwitchExecution.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution2
 * SwitchSubscriptionLegExecution2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution3
 * SwitchSubscriptionLegExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchExecutionSubscriptionLeg4
 * SwitchExecutionSubscriptionLeg4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4
 * SwitchSubscriptionLegExecution4}</li>
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
 * "SwitchExecutionSubscriptionLeg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Execution of the subscription part, in a switch between investment funds or investment fund classes."
 * </li>
 * </ul>
 */
public class SwitchExecutionSubscriptionLeg extends SubscriptionExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SwitchExecution relatedSwitchExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmSubscriptionLeg
	 * SwitchExecution.mmSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SwitchExecution
	 * SwitchExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
	 * SwitchExecutionSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSwitchExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Switch execution process for which a subcription leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSwitchExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSwitchExecution";
			definition = "Switch execution process for which a subcription leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmSubscriptionLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmObject();
		}
	};
	protected PercentageRate percentageOfTotalRedemptionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg
	 * SwitchExecutionSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfTotalRedemptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfTotalRedemptionAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfTotalRedemptionAmount";
			definition = "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchExecutionSubscriptionLeg.class.getMethod("getPercentageOfTotalRedemptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchExecutionSubscriptionLeg";
				definition = "Execution of the subscription part, in a switch between investment funds or investment fund classes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecution.mmSubscriptionLeg);
				superType_lazy = () -> SubscriptionExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmRelatedSwitchExecution,
						com.tools20022.repository.entity.SwitchExecutionSubscriptionLeg.mmPercentageOfTotalRedemptionAmount);
				derivationComponent_lazy = () -> Arrays.asList(SwitchSubscriptionLegExecution2.mmObject(), SwitchSubscriptionLegExecution3.mmObject(), SwitchExecutionSubscriptionLeg4.mmObject(), SwitchSubscriptionLegExecution4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchExecutionSubscriptionLeg.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SwitchExecution> getRelatedSwitchExecution() {
		return relatedSwitchExecution == null ? Optional.empty() : Optional.of(relatedSwitchExecution);
	}

	public SwitchExecutionSubscriptionLeg setRelatedSwitchExecution(com.tools20022.repository.entity.SwitchExecution relatedSwitchExecution) {
		this.relatedSwitchExecution = relatedSwitchExecution;
		return this;
	}

	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return percentageOfTotalRedemptionAmount;
	}

	public SwitchExecutionSubscriptionLeg setPercentageOfTotalRedemptionAmount(PercentageRate percentageOfTotalRedemptionAmount) {
		this.percentageOfTotalRedemptionAmount = Objects.requireNonNull(percentageOfTotalRedemptionAmount);
		return this;
	}
}