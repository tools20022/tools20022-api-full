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
import com.tools20022.repository.entity.RedemptionExecution;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4;
import com.tools20022.repository.msg.SwitchRedemptionLegExecution2;
import com.tools20022.repository.msg.SwitchRedemptionLegExecution3;
import com.tools20022.repository.msg.SwitchRedemptionLegExecution4;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Execution of the redemption part, in a switch between investment funds or
 * investment fund classes.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchExecutionRedemptionLeg"
 * src="doc-files/SwitchExecutionRedemptionLeg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmRelatedSwitchExecution
 * SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg#mmPercentageOfTotalSubscriptionAmount
 * SwitchExecutionRedemptionLeg.mmPercentageOfTotalSubscriptionAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution2
 * SwitchRedemptionLegExecution2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution3
 * SwitchRedemptionLegExecution3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchExecutionRedemptionLeg4
 * SwitchExecutionRedemptionLeg4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4
 * SwitchRedemptionLegExecution4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
 * SwitchExecution.mmRedemptionLeg}</li>
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
 * "SwitchExecutionRedemptionLeg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Execution of the redemption part, in a switch between investment funds or investment fund classes."
 * </li>
 * </ul>
 */
public class SwitchExecutionRedemptionLeg extends RedemptionExecution {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SwitchExecution relatedSwitchExecution;
	/**
	 * Switch execution process for which a redemption leg is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchExecution#mmRedemptionLeg
	 * SwitchExecution.mmRedemptionLeg}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
	 * SwitchExecutionRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSwitchExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Switch execution process for which a redemption leg is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSwitchExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSwitchExecution";
			definition = "Switch execution process for which a redemption leg is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmRedemptionLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchExecution.mmObject();
		}
	};
	protected PercentageRate percentageOfTotalSubscriptionAmount;
	/**
	 * Percentage of the total amount subscribed, and that came from redemption
	 * of investment funds or investment fund classes.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SwitchExecutionRedemptionLeg
	 * SwitchExecutionRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfTotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the total amount subscribed, and that came from redemption of investment funds or investment fund classes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfTotalSubscriptionAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfTotalSubscriptionAmount";
			definition = "Percentage of the total amount subscribed, and that came from redemption of investment funds or investment fund classes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchExecutionRedemptionLeg.class.getMethod("getPercentageOfTotalSubscriptionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchExecutionRedemptionLeg";
				definition = "Execution of the redemption part, in a switch between investment funds or investment fund classes.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecution.mmRedemptionLeg);
				superType_lazy = () -> RedemptionExecution.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmRelatedSwitchExecution, com.tools20022.repository.entity.SwitchExecutionRedemptionLeg.mmPercentageOfTotalSubscriptionAmount);
				derivationComponent_lazy = () -> Arrays.asList(SwitchRedemptionLegExecution2.mmObject(), SwitchRedemptionLegExecution3.mmObject(), SwitchExecutionRedemptionLeg4.mmObject(), SwitchRedemptionLegExecution4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchExecutionRedemptionLeg.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SwitchExecution getRelatedSwitchExecution() {
		return relatedSwitchExecution;
	}

	public void setRelatedSwitchExecution(com.tools20022.repository.entity.SwitchExecution relatedSwitchExecution) {
		this.relatedSwitchExecution = relatedSwitchExecution;
	}

	public PercentageRate getPercentageOfTotalSubscriptionAmount() {
		return percentageOfTotalSubscriptionAmount;
	}

	public void setPercentageOfTotalSubscriptionAmount(PercentageRate percentageOfTotalSubscriptionAmount) {
		this.percentageOfTotalSubscriptionAmount = percentageOfTotalSubscriptionAmount;
	}
}