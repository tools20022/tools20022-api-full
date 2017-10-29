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

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to the transportation of goods by rail.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportByRail" src="doc-files/TransportByRail.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportByRail#CarriageIdentification
 * TransportByRail.CarriageIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#TransportByRail
 * SingleTransport1.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#TransportByRail
 * SingleTransport4.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#TransportByRail
 * SingleTransport2.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#TransportByRail
 * SingleTransport5.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#TransportByRail
 * SingleTransport3.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#TransportByRail
 * SingleTransport6.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#TransportByRail
 * SingleTransport7.TransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#TransportByRail
 * SingleTransport8.TransportByRail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRail1
 * TransportByRail1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRail3
 * TransportByRail3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRail2
 * TransportByRail2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRail4
 * TransportByRail4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByRail5
 * TransportByRail5}</li>
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
 * "TransportByRail"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by rail."</li>
 * </ul>
 */
public class TransportByRail extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the carriage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRail
	 * TransportByRail}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarriageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the carriage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CarriageIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> TransportByRail.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CarriageIdentification";
			definition = "Identifies the carriage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransportByRail";
				definition = "Information related to the transportation of goods by rail.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport1.TransportByRail, com.tools20022.repository.msg.SingleTransport4.TransportByRail,
						com.tools20022.repository.msg.SingleTransport2.TransportByRail, com.tools20022.repository.msg.SingleTransport5.TransportByRail, com.tools20022.repository.msg.SingleTransport3.TransportByRail,
						com.tools20022.repository.msg.SingleTransport6.TransportByRail, com.tools20022.repository.msg.SingleTransport7.TransportByRail, com.tools20022.repository.msg.SingleTransport8.TransportByRail);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportByRail.CarriageIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransportByRail1.mmObject(), TransportByRail3.mmObject(), TransportByRail2.mmObject(), TransportByRail4.mmObject(), TransportByRail5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}