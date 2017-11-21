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
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the system used in a settlement process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesSettlementSystem"
 * src="doc-files/SecuritiesSettlementSystem.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
 * SecuritiesSettlementSystem.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount1.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount4.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount8.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount1.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount4.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount8.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount5#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount5.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount6#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount6.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount7.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount7.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount9.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount11.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount11.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount14.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount14.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem}</li>
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
 * "SecuritiesSettlementSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the system used in a settlement process."</li>
 * </ul>
 */
public class SecuritiesSettlementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesSettlementPartyRole settlementParty;
	/**
	 * Party which settles through a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
	 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which settles through a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSettlementParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementParty";
			definition = "Party which settles through a system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementSystem";
				definition = "Specifies the system used in a settlement process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem);
				derivationElement_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount1.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount4.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount8.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount1.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount4.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount8.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount5.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount6.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount7.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount7.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount9.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount11.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount11.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount14.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount14.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementSystem.mmSettlementParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementSystem.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesSettlementPartyRole getSettlementParty() {
		return settlementParty;
	}

	public void setSettlementParty(com.tools20022.repository.entity.SecuritiesSettlementPartyRole settlementParty) {
		this.settlementParty = settlementParty;
	}
}