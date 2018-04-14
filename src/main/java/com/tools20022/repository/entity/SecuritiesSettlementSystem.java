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
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.System System}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem#mmSettlementParty
 * SecuritiesSettlementSystem.mmSettlementParty}</li>
 * </ul>
 * </li>
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
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount18#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount18.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount17.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount17#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount17.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18#mmSecuritiesSettlementSystem
 * ReceivingPartiesAndAccount18.mmSecuritiesSettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementSystem"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the system used in a settlement process."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesSettlementSystem extends System {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesSettlementPartyRole settlementParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
	 * SecuritiesSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole#mmSecuritiesSettlementSystem
	 * SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which settles through a system."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesSettlementSystem, Optional<SecuritiesSettlementPartyRole>> mmSettlementParty = new MMBusinessAssociationEnd<SecuritiesSettlementSystem, Optional<SecuritiesSettlementPartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlementSystem.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SettlementParty";
			definition = "Party which settles through a system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
		}

		@Override
		public Optional<SecuritiesSettlementPartyRole> getValue(SecuritiesSettlementSystem obj) {
			return obj.getSettlementParty();
		}

		@Override
		public void setValue(SecuritiesSettlementSystem obj, Optional<SecuritiesSettlementPartyRole> value) {
			obj.setSettlementParty(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementSystem";
				definition = "Specifies the system used in a settlement process.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesSettlementPartyRole.mmSecuritiesSettlementSystem);
				derivationElement_lazy = () -> Arrays.asList(DeliveringPartiesAndAccount1.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount4.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount8.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount1.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount4.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount8.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount5.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount6.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount7.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount7.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount9.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount9.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount11.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount11.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount14.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount13.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount14.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount13.mmSecuritiesSettlementSystem,
						DeliveringPartiesAndAccount18.mmSecuritiesSettlementSystem, DeliveringPartiesAndAccount17.mmSecuritiesSettlementSystem, ReceivingPartiesAndAccount17.mmSecuritiesSettlementSystem,
						ReceivingPartiesAndAccount18.mmSecuritiesSettlementSystem);
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

	public Optional<SecuritiesSettlementPartyRole> getSettlementParty() {
		return settlementParty == null ? Optional.empty() : Optional.of(settlementParty);
	}

	public SecuritiesSettlementSystem setSettlementParty(SecuritiesSettlementPartyRole settlementParty) {
		this.settlementParty = settlementParty;
		return this;
	}
}