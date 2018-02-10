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
import com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.SubscriptionOrder;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SwitchSubscriptionLegOrder2;
import com.tools20022.repository.msg.SwitchSubscriptionLegOrder3;
import com.tools20022.repository.msg.SwitchSubscriptionLegOrder4;
import com.tools20022.repository.msg.SwitchSubscriptionLegOrder6;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Subscription leg, or switch-in, of a switch order.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SwitchSubscriptionLeg"
 * src="doc-files/SwitchSubscriptionLeg.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmSubscriptionRelatedSwitchOrder
 * SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg#mmPercentageOfTotalRedemptionAmount
 * SwitchSubscriptionLeg.mmPercentageOfTotalRedemptionAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmSubscriptionLeg
 * SwitchOrder.mmSubscriptionLeg}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder2
 * SwitchSubscriptionLegOrder2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder3
 * SwitchSubscriptionLegOrder3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder4
 * SwitchSubscriptionLegOrder4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegOrder6
 * SwitchSubscriptionLegOrder6}</li>
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
 * "SwitchSubscriptionLeg"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Subscription leg, or switch-in, of a switch order."</li>
 * </ul>
 */
public class SwitchSubscriptionLeg extends SubscriptionOrder {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SwitchOrder subscriptionRelatedSwitchOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SwitchOrder#mmSubscriptionLeg
	 * SwitchOrder.mmSubscriptionLeg}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
	 * SwitchSubscriptionLeg}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionRelatedSwitchOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Switch order to which the subscription leg refers."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSubscriptionRelatedSwitchOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionRelatedSwitchOrder";
			definition = "Switch order to which the subscription leg refers.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmSubscriptionLeg;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SwitchOrder.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity4Choice#mmPercentageOfTotalRedemptionAmount
	 * FinancialInstrumentQuantity4Choice.mmPercentageOfTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity6Choice#mmPercentageOfTotalRedemptionAmount
	 * FinancialInstrumentQuantity6Choice.mmPercentageOfTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity13Choice#mmPercentageOfTotalRedemptionAmount
	 * FinancialInstrumentQuantity13Choice.mmPercentageOfTotalRedemptionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity26Choice#mmPercentageOfTotalRedemptionAmount
	 * FinancialInstrumentQuantity26Choice.mmPercentageOfTotalRedemptionAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SwitchSubscriptionLeg
	 * SwitchSubscriptionLeg}</li>
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
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentQuantity4Choice.mmPercentageOfTotalRedemptionAmount, FinancialInstrumentQuantity6Choice.mmPercentageOfTotalRedemptionAmount,
					FinancialInstrumentQuantity13Choice.mmPercentageOfTotalRedemptionAmount, FinancialInstrumentQuantity26Choice.mmPercentageOfTotalRedemptionAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SwitchSubscriptionLeg.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageOfTotalRedemptionAmount";
			definition = "Percentage of the total redemption amount used for the subscription in an investment fund or investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SwitchSubscriptionLeg.class.getMethod("getPercentageOfTotalRedemptionAmount", new Class[]{});
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
				name = "SwitchSubscriptionLeg";
				definition = "Subscription leg, or switch-in, of a switch order.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchOrder.mmSubscriptionLeg);
				superType_lazy = () -> SubscriptionOrder.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SwitchSubscriptionLeg.mmSubscriptionRelatedSwitchOrder, com.tools20022.repository.entity.SwitchSubscriptionLeg.mmPercentageOfTotalRedemptionAmount);
				derivationComponent_lazy = () -> Arrays.asList(SwitchSubscriptionLegOrder2.mmObject(), SwitchSubscriptionLegOrder3.mmObject(), SwitchSubscriptionLegOrder4.mmObject(), SwitchSubscriptionLegOrder6.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchSubscriptionLeg.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SwitchOrder> getSubscriptionRelatedSwitchOrder() {
		return subscriptionRelatedSwitchOrder == null ? Optional.empty() : Optional.of(subscriptionRelatedSwitchOrder);
	}

	public SwitchSubscriptionLeg setSubscriptionRelatedSwitchOrder(com.tools20022.repository.entity.SwitchOrder subscriptionRelatedSwitchOrder) {
		this.subscriptionRelatedSwitchOrder = subscriptionRelatedSwitchOrder;
		return this;
	}

	public PercentageRate getPercentageOfTotalRedemptionAmount() {
		return percentageOfTotalRedemptionAmount;
	}

	public SwitchSubscriptionLeg setPercentageOfTotalRedemptionAmount(PercentageRate percentageOfTotalRedemptionAmount) {
		this.percentageOfTotalRedemptionAmount = Objects.requireNonNull(percentageOfTotalRedemptionAmount);
		return this;
	}
}