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
import com.tools20022.repository.entity.System;
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
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#SettlementParty
 * SecuritiesSettlementSystem.SettlementParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlementSystem
 * SecuritiesSettlementPartyRole.SecuritiesSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount1#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount1.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount4#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount4.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount8#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount8.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount1#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount1.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount4#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount4.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount8#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount8.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount5#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount5.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount6#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount6.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount7.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount7.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount9#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount9.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount9#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount9.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount11#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount11.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount11#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount11.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount14#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount14.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount13#SecuritiesSettlementSystem
 * DeliveringPartiesAndAccount13.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount14#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount14.SecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount13#SecuritiesSettlementSystem
 * ReceivingPartiesAndAccount13.SecuritiesSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
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
 * "SecuritiesSettlementSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the system used in a settlement process."</li>
 * </ul>
 */
public class SecuritiesSettlementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Party which settles through a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#SecuritiesSettlementSystem
	 * SecuritiesSettlementPartyRole.SecuritiesSettlementSystem}</li>
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
	public static final MMBusinessAssociationEnd SettlementParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesSettlementSystem.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SettlementParty";
			definition = "Party which settles through a system.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlementSystem;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementSystem";
				definition = "Specifies the system used in a settlement process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementPartyRole.SecuritiesSettlementSystem);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount1.SecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount4.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount8.SecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount1.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount4.SecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount8.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount5.SecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount6.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount7.SecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount7.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount9.SecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount9.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount11.SecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount11.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount14.SecuritiesSettlementSystem, com.tools20022.repository.msg.DeliveringPartiesAndAccount13.SecuritiesSettlementSystem,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount14.SecuritiesSettlementSystem, com.tools20022.repository.msg.ReceivingPartiesAndAccount13.SecuritiesSettlementSystem);
				superType_lazy = () -> System.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesSettlementSystem.SettlementParty);
			}
		});
		return mmObject_lazy.get();
	}
}