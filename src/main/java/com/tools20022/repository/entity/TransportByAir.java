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
import com.tools20022.repository.choice.AirportName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related to the transportation of goods by air.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportByAir" src="doc-files/TransportByAir.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByAir#AirportName
 * TransportByAir.AirportName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByAir#FlightNumber
 * TransportByAir.FlightNumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#TransportByAir
 * SingleTransport1.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#TransportByAir
 * SingleTransport4.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#TransportByAir
 * SingleTransport2.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#TransportByAir
 * SingleTransport5.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#TransportByAir
 * SingleTransport3.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#TransportByAir
 * SingleTransport6.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#TransportByAir
 * SingleTransport7.TransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#TransportByAir
 * SingleTransport8.TransportByAir}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AirportName1Choice
 * AirportName1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir1
 * TransportByAir1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir3
 * TransportByAir3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir2
 * TransportByAir2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir4
 * TransportByAir4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportByAir5
 * TransportByAir5}</li>
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
 * "TransportByAir"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by air."</li>
 * </ul>
 */
public class TransportByAir extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies an airport by means of its IATA identification code. Example:
	 * LHR.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#AirportCode
	 * AirportName1Choice.AirportCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AirportName1Choice#OtherAirportDescription
	 * AirportName1Choice.OtherAirportDescription}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirportName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an airport by means of its IATA identification code. Example: LHR."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AirportName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AirportName1Choice.AirportCode, com.tools20022.repository.choice.AirportName1Choice.OtherAirportDescription);
			elementContext_lazy = () -> TransportByAir.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AirportName";
			definition = "Identifies an airport by means of its IATA identification code. Example: LHR.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	/**
	 * Identifies the flight and the carrier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#FlightNumber
	 * TransportByAir4.FlightNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlightNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the flight and the carrier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FlightNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir4.FlightNumber);
			elementContext_lazy = () -> TransportByAir.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FlightNumber";
			definition = "Identifies the flight and the carrier.";
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
				name = "TransportByAir";
				definition = "Information related to the transportation of goods by air.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport1.TransportByAir, com.tools20022.repository.msg.SingleTransport4.TransportByAir,
						com.tools20022.repository.msg.SingleTransport2.TransportByAir, com.tools20022.repository.msg.SingleTransport5.TransportByAir, com.tools20022.repository.msg.SingleTransport3.TransportByAir,
						com.tools20022.repository.msg.SingleTransport6.TransportByAir, com.tools20022.repository.msg.SingleTransport7.TransportByAir, com.tools20022.repository.msg.SingleTransport8.TransportByAir);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportByAir.AirportName, com.tools20022.repository.entity.TransportByAir.FlightNumber);
				derivationComponent_lazy = () -> Arrays.asList(AirportName1Choice.mmObject(), TransportByAir1.mmObject(), TransportByAir3.mmObject(), TransportByAir2.mmObject(), TransportByAir4.mmObject(), TransportByAir5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}