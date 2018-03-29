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
import com.tools20022.repository.entity.ExecutingBrokerRole;
import com.tools20022.repository.entity.SecuritiesTradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SecuritiesTransactionReport2;
import com.tools20022.repository.msg.SecuritiesTransactionReport4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Trader that executes a trade for an organisation.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ExecutingTrader" src="doc-files/ExecutingTrader.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
 * SecuritiesTradePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExecutingTrader#mmExecutingBroker
 * ExecutingTrader.mmExecutingBroker}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole#mmExecutingTrader
 * ExecutingBrokerRole.mmExecutingTrader}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport2#mmExecutingParty
 * SecuritiesTransactionReport2.mmExecutingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTransactionReport4#mmExecutingParty
 * SecuritiesTransactionReport4.mmExecutingParty}</li>
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
 * "ExecutingTrader"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Trader that executes a trade for an organisation."</li>
 * </ul>
 */
public class ExecutingTrader extends SecuritiesTradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<ExecutingBrokerRole> executingBroker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole#mmExecutingTrader
	 * ExecutingBrokerRole.mmExecutingTrader}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ExecutingBrokerRole
	 * ExecutingBrokerRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ExecutingTrader
	 * ExecutingTrader}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Executing broker which employs the trade"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<ExecutingTrader, List<ExecutingBrokerRole>> mmExecutingBroker = new MMBusinessAssociationEnd<ExecutingTrader, List<ExecutingBrokerRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ExecutingTrader.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutingBroker";
			definition = "Executing broker which employs the trade";
			minOccurs = 0;
			opposite_lazy = () -> ExecutingBrokerRole.mmExecutingTrader;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> ExecutingBrokerRole.mmObject();
		}

		@Override
		public List<ExecutingBrokerRole> getValue(ExecutingTrader obj) {
			return obj.getExecutingBroker();
		}

		@Override
		public void setValue(ExecutingTrader obj, List<ExecutingBrokerRole> value) {
			obj.setExecutingBroker(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExecutingTrader";
				definition = "Trader that executes a trade for an organisation.";
				associationDomain_lazy = () -> Arrays.asList(ExecutingBrokerRole.mmExecutingTrader);
				derivationElement_lazy = () -> Arrays.asList(SecuritiesTransactionReport2.mmExecutingParty, SecuritiesTransactionReport4.mmExecutingParty);
				superType_lazy = () -> SecuritiesTradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ExecutingTrader.mmExecutingBroker);
			}

			@Override
			public Class<?> getInstanceClass() {
				return ExecutingTrader.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<ExecutingBrokerRole> getExecutingBroker() {
		return executingBroker == null ? executingBroker = new ArrayList<>() : executingBroker;
	}

	public ExecutingTrader setExecutingBroker(List<ExecutingBrokerRole> executingBroker) {
		this.executingBroker = Objects.requireNonNull(executingBroker);
		return this;
	}
}