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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Information related to the transportation of goods by rail.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportByRail" src="doc-files/TransportByRail.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportByRail#mmCarriageIdentification
 * TransportByRail.mmCarriageIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportByRail
 * SingleTransport1.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#mmTransportByRail
 * SingleTransport4.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#mmTransportByRail
 * SingleTransport2.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportByRail
 * SingleTransport5.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#mmTransportByRail
 * SingleTransport3.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRail
 * SingleTransport6.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#mmTransportByRail
 * SingleTransport7.mmTransportByRail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByRail
 * SingleTransport8.mmTransportByRail}</li>
 * </ul>
 * </li>
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
	protected Max35Text carriageIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute mmCarriageIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TransportByRail.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CarriageIdentification";
			definition = "Identifies the carriage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TransportByRail.class.getMethod("getCarriageIdentification", new Class[]{});
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
				name = "TransportByRail";
				definition = "Information related to the transportation of goods by rail.";
				derivationElement_lazy = () -> Arrays.asList(SingleTransport1.mmTransportByRail, SingleTransport4.mmTransportByRail, SingleTransport2.mmTransportByRail, SingleTransport5.mmTransportByRail,
						SingleTransport3.mmTransportByRail, SingleTransport6.mmTransportByRail, SingleTransport7.mmTransportByRail, SingleTransport8.mmTransportByRail);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportByRail.mmCarriageIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransportByRail1.mmObject(), TransportByRail3.mmObject(), TransportByRail2.mmObject(), TransportByRail4.mmObject(), TransportByRail5.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TransportByRail.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCarriageIdentification() {
		return carriageIdentification;
	}

	public TransportByRail setCarriageIdentification(Max35Text carriageIdentification) {
		this.carriageIdentification = Objects.requireNonNull(carriageIdentification);
		return this;
	}
}