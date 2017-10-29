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
import com.tools20022.repository.entity.CommercialTradePartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party to whom the goods must be delivered.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ShipTo" src="doc-files/ShipTo.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#ShipTo
 * TradeDelivery1.ShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery1#UltimateShipTo
 * TradeDelivery1.UltimateShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#ShipTo
 * LineItem10.ShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#ShipTo
 * TradeDelivery2.ShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeDelivery2#UltimateShipTo
 * TradeDelivery2.UltimateShipTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#ShipTo
 * LineItem16.ShipTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.CommercialTradePartyRole
 * CommercialTradePartyRole}</li>
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
 * "ShipTo"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party to whom the goods must be delivered."</li>
 * </ul>
 */
public class ShipTo extends CommercialTradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ShipTo";
				definition = "Party to whom the goods must be delivered.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeDelivery1.ShipTo, com.tools20022.repository.msg.TradeDelivery1.UltimateShipTo, com.tools20022.repository.msg.LineItem10.ShipTo,
						com.tools20022.repository.msg.TradeDelivery2.ShipTo, com.tools20022.repository.msg.TradeDelivery2.UltimateShipTo, com.tools20022.repository.msg.LineItem16.ShipTo);
				superType_lazy = () -> CommercialTradePartyRole.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}