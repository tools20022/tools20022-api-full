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
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.RedemptionOrder;
import com.tools20022.repository.msg.SwitchRedemptionLegOrder2;
import com.tools20022.repository.msg.SwitchRedemptionLegOrder3;
import com.tools20022.repository.msg.SwitchRedemptionLegOrder4;
import com.tools20022.repository.msg.SwitchRedemptionLegOrder6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Redemption leg, or switch-out, of a switch transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchRedemptionLeg" src="doc-files/SwitchRedemptionLeg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#RedemptionRelatedSwitchOrder
 * SwitchRedemptionLeg.RedemptionRelatedSwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg#PercentageOfTotalSubscriptionAmount
 * SwitchRedemptionLeg.PercentageOfTotalSubscriptionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SwitchOrder#RedemptionLeg
 * SwitchOrder.RedemptionLeg}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RedemptionOrder
 * RedemptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder2
 * SwitchRedemptionLegOrder2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder3
 * SwitchRedemptionLegOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder4
 * SwitchRedemptionLegOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchRedemptionLegOrder6
 * SwitchRedemptionLegOrder6}</li>
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
 * "SwitchRedemptionLeg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Redemption leg, or switch-out, of a switch transaction."</li>
 * </ul>
 */
public class SwitchRedemptionLeg extends RedemptionOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Switch order to which the redemption leg refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#RedemptionLeg
	 * SwitchOrder.RedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SwitchOrder
	 * SwitchOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
	 * SwitchRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionRelatedSwitchOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch order to which the redemption leg refers."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RedemptionRelatedSwitchOrder = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SwitchRedemptionLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RedemptionRelatedSwitchOrder";
			definition = "Switch order to which the redemption leg refers.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SwitchOrder.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchOrder.RedemptionLeg;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage of the total switch amount (buy-driven) to be invested in a
	 * particular investment fund or investment fund class.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice#PercentageOfTotalSubscriptionAmount
	 * FinancialInstrumentQuantity3Choice.PercentageOfTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice#PercentageOfTotalSubscriptionAmount
	 * FinancialInstrumentQuantity5Choice.PercentageOfTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice#PercentageOfTotalSubscriptionAmount
	 * FinancialInstrumentQuantity12Choice.PercentageOfTotalSubscriptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice#PercentageOfTotalSubscriptionAmount
	 * FinancialInstrumentQuantity29Choice.PercentageOfTotalSubscriptionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchRedemptionLeg
	 * SwitchRedemptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfTotalSubscriptionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the total switch amount (buy-driven) to be invested in a particular investment fund or investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageOfTotalSubscriptionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity3Choice.PercentageOfTotalSubscriptionAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity5Choice.PercentageOfTotalSubscriptionAmount, com.tools20022.repository.choice.FinancialInstrumentQuantity12Choice.PercentageOfTotalSubscriptionAmount,
					com.tools20022.repository.choice.FinancialInstrumentQuantity29Choice.PercentageOfTotalSubscriptionAmount);
			elementContext_lazy = () -> SwitchRedemptionLeg.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfTotalSubscriptionAmount";
			definition = "Percentage of the total switch amount (buy-driven) to be invested in a particular investment fund or investment fund class.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SwitchRedemptionLeg";
				definition = "Redemption leg, or switch-out, of a switch transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchOrder.RedemptionLeg);
				superType_lazy = () -> RedemptionOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchRedemptionLeg.RedemptionRelatedSwitchOrder, com.tools20022.repository.entity.SwitchRedemptionLeg.PercentageOfTotalSubscriptionAmount);
				derivationComponent_lazy = () -> Arrays.asList(SwitchRedemptionLegOrder2.mmObject(), SwitchRedemptionLegOrder3.mmObject(), SwitchRedemptionLegOrder4.mmObject(), SwitchRedemptionLegOrder6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}