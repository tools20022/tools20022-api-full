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
import com.tools20022.repository.choice.ShipmentDate1Choice;
import com.tools20022.repository.datatype.Exact7NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related for the transportation of goods by sea.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TransportBySea" src="doc-files/TransportBySea.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#VesselName
 * TransportBySea.VesselName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#VoyageNumber
 * TransportBySea.VoyageNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportBySea#ChartererName
 * TransportBySea.ChartererName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#MasterName
 * TransportBySea.MasterName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#OwnerName
 * TransportBySea.OwnerName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea#IMONumber
 * TransportBySea.IMONumber}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#TransportBySea
 * SingleTransport1.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport4#TransportBySea
 * SingleTransport4.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport2#TransportBySea
 * SingleTransport2.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#TransportBySea
 * SingleTransport5.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport3#TransportBySea
 * SingleTransport3.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport6#TransportBySea
 * SingleTransport6.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport7#TransportBySea
 * SingleTransport7.TransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#TransportBySea
 * SingleTransport8.TransportBySea}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Transport
 * Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea1
 * TransportBySea1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea3
 * TransportBySea3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea2
 * TransportBySea2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea4
 * TransportBySea4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5
 * TransportBySea5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ShipmentDate1Choice
 * ShipmentDate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea6
 * TransportBySea6}</li>
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
 * "TransportBySea"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related for the transportation of goods by sea."</li>
 * </ul>
 */
public class TransportBySea extends Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Name of a vessel.
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
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea2#VesselName
	 * TransportBySea2.VesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#VesselName
	 * MultimodalTransport2.VesselName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea4#VesselName
	 * TransportBySea4.VesselName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#VesselName
	 * TransportBySea5.VesselName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea6#VesselName
	 * TransportBySea6.VesselName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VesselName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a vessel."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VesselName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea2.VesselName, com.tools20022.repository.msg.MultimodalTransport2.VesselName, com.tools20022.repository.msg.TransportBySea4.VesselName,
					com.tools20022.repository.msg.TransportBySea5.VesselName, com.tools20022.repository.msg.TransportBySea6.VesselName);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the voyage.
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#VoyageNumber
	 * TransportBySea5.VoyageNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoyageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the voyage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute VoyageNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.VoyageNumber);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "VoyageNumber";
			definition = "Identifies the voyage.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Name of the company or individual that acts in the capacity of charterer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#ChartererName
	 * TransportBySea5.ChartererName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChartererName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that acts in the capacity of charterer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ChartererName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.ChartererName);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ChartererName";
			definition = "Name of the company or individual that acts in the capacity of charterer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Name of the master or captain of a vessel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#MasterName
	 * TransportBySea5.MasterName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the master or captain of a vessel."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MasterName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.MasterName);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MasterName";
			definition = "Name of the master or captain of a vessel.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * Name of the company or individual that acts in the capacity of owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#OwnerName
	 * TransportBySea5.OwnerName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that acts in the capacity of owner."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OwnerName = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.OwnerName);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OwnerName";
			definition = "Name of the company or individual that acts in the capacity of owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	/**
	 * International Maritime Organisation identification of a ship. This is a
	 * unique seven digit number that is assigned to vessels and aids banks in
	 * determining whether a vessel is subject to an order that would not permit
	 * a bank to handle a certain transaction under local or international laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact7NumericText
	 * Exact7NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#IMONumber
	 * TransportBySea5.IMONumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMONumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Maritime Organisation identification of a ship. This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute IMONumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.IMONumber);
			elementContext_lazy = () -> TransportBySea.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IMONumber";
			definition = "International Maritime Organisation identification of a ship. This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Exact7NumericText.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransportBySea";
				definition = "Information related for the transportation of goods by sea.";
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport1.TransportBySea, com.tools20022.repository.msg.SingleTransport4.TransportBySea,
						com.tools20022.repository.msg.SingleTransport2.TransportBySea, com.tools20022.repository.msg.SingleTransport5.TransportBySea, com.tools20022.repository.msg.SingleTransport3.TransportBySea,
						com.tools20022.repository.msg.SingleTransport6.TransportBySea, com.tools20022.repository.msg.SingleTransport7.TransportBySea, com.tools20022.repository.msg.SingleTransport8.TransportBySea);
				superType_lazy = () -> Transport.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TransportBySea.VesselName, com.tools20022.repository.entity.TransportBySea.VoyageNumber, com.tools20022.repository.entity.TransportBySea.ChartererName,
						com.tools20022.repository.entity.TransportBySea.MasterName, com.tools20022.repository.entity.TransportBySea.OwnerName, com.tools20022.repository.entity.TransportBySea.IMONumber);
				derivationComponent_lazy = () -> Arrays.asList(TransportBySea1.mmObject(), TransportBySea3.mmObject(), TransportBySea2.mmObject(), TransportBySea4.mmObject(), TransportBySea5.mmObject(), ShipmentDate1Choice.mmObject(),
						TransportBySea6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}