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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Broker;
import com.tools20022.repository.entity.ExecutingTrader;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ConfirmationParties2;
import com.tools20022.repository.msg.ConfirmationParties4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Party responsible for executing an order (e.g. an executing or give-up
 * broker).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExecutingBrokerRole" src="doc-files/ExecutingBrokerRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole#mmExecutingTrader
 * ExecutingBrokerRole.mmExecutingTrader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExecutingTrader#mmExecutingBroker
 * ExecutingTrader.mmExecutingBroker}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmExecutingBroker
 * ConfirmationParties4.mmExecutingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmExecutingBroker
 * ConfirmationParties2.mmExecutingBroker}</li>
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
 * "ExecutingBrokerRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party responsible for executing an order (e.g. an executing or give-up broker)."
 * </li>
 * </ul>
 */
public class ExecutingBrokerRole extends Broker {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ExecutingTrader executingTrader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingTrader#mmExecutingBroker
	 * ExecutingTrader.mmExecutingBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExecutingTrader
	 * ExecutingTrader}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole
	 * ExecutingBrokerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingTrader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trader at the executing broker"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExecutingBrokerRole, com.tools20022.repository.entity.ExecutingTrader> mmExecutingTrader = new MMBusinessAssociationEnd<ExecutingBrokerRole, com.tools20022.repository.entity.ExecutingTrader>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExecutingBrokerRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutingTrader";
			definition = "Trader at the executing broker";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ExecutingTrader.mmExecutingBroker;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ExecutingTrader.mmObject();
		}

		@Override
		public com.tools20022.repository.entity.ExecutingTrader getValue(ExecutingBrokerRole obj) {
			return obj.getExecutingTrader();
		}

		@Override
		public void setValue(ExecutingBrokerRole obj, com.tools20022.repository.entity.ExecutingTrader value) {
			obj.setExecutingTrader(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutingBrokerRole";
				definition = "Party responsible for executing an order (e.g. an executing or give-up broker).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExecutingTrader.mmExecutingBroker);
				derivationElement_lazy = () -> Arrays.asList(ConfirmationParties4.mmExecutingBroker, ConfirmationParties2.mmExecutingBroker);
				superType_lazy = () -> Broker.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExecutingBrokerRole.mmExecutingTrader);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExecutingBrokerRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExecutingTrader getExecutingTrader() {
		return executingTrader;
	}

	public ExecutingBrokerRole setExecutingTrader(com.tools20022.repository.entity.ExecutingTrader executingTrader) {
		this.executingTrader = Objects.requireNonNull(executingTrader);
		return this;
	}
}