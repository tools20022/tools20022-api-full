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
import com.tools20022.repository.entity.CommercialTradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeDelivery1;
import com.tools20022.repository.msg.TradeDelivery2;
import com.tools20022.repository.msg.TradeDelivery3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party from whom the goods are dispatched.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ShipFrom" src="doc-files/ShipFrom.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
 * CommercialTradePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#mmShipFrom
 * TradeDelivery1.mmShipFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#mmShipFrom
 * TradeDelivery2.mmShipFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery3#mmShipFrom
 * TradeDelivery3.mmShipFrom}</li>
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
 * "ShipFrom"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party from whom the goods are dispatched."</li>
 * </ul>
 */
public class ShipFrom extends CommercialTradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShipFrom";
				definition = "Party from whom the goods are dispatched.";
				derivationElement_lazy = () -> Arrays.asList(TradeDelivery1.mmShipFrom, TradeDelivery2.mmShipFrom, TradeDelivery3.mmShipFrom);
				superType_lazy = () -> CommercialTradePartyRole.mmObject();
			}

			@Override
			public Class<?> getInstanceClass() {
				return ShipFrom.class;
			}
		});
		return mmObject_lazy.get();
	}
}