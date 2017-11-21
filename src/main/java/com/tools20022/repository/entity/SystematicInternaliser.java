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

import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.SecuritiesTradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Firm which deals on its own account by executing client orders outside a
 * regulated market or a multi-lateral trading facility, against its own books
 * or against orders from other clients.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SystematicInternaliser"
 * src="doc-files/SystematicInternaliser.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradePartyRole
 * SecuritiesTradePartyRole}</li>
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
 * "SystematicInternaliser"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Firm which deals on its own account by executing client orders outside a regulated market or a multi-lateral trading facility, against its own books or against orders from other clients."
 * </li>
 * </ul>
 */
public class SystematicInternaliser extends SecuritiesTradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystematicInternaliser";
				definition = "Firm which deals on its own account by executing client orders outside a regulated market or a multi-lateral trading facility, against its own books or against orders from other clients.";
				superType_lazy = () -> SecuritiesTradePartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return SystematicInternaliser.class;
			}
		});
		return mmObject_lazy.get();
	}
}