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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AirportName1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportByAir;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information related to the transportation of goods by air.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmDepartureAirport
 * TransportByAir3.mmDepartureAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmDestinationAirport
 * TransportByAir3.mmDestinationAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir3#mmAirCarrierName
 * TransportByAir3.mmAirCarrierName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
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
 * "TransportByAir3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by air."</li>
 * </ul>
 */
public class TransportByAir3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<AirportName1Choice> departureAirport;
	/**
	 * Place from where the goods must leave.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3
	 * TransportByAir3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DprtureAirprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepartureAirport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepartureAirport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> TransportByAir3.mmObject();
			isDerived = false;
			xmlTag = "DprtureAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepartureAirport";
			definition = "Place from where the goods must leave.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}
	};
	protected List<AirportName1Choice> destinationAirport;
	/**
	 * Place where the goods must arrive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AirportName1Choice
	 * AirportName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3
	 * TransportByAir3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstnAirprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DestinationAirport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDestinationAirport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> TransportByAir3.mmObject();
			isDerived = false;
			xmlTag = "DstnAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationAirport";
			definition = "Place where the goods must arrive.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}
	};
	protected Max35Text airCarrierName;
	/**
	 * Identifies the party that is responsible for the conveyance of the goods
	 * from one place to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3
	 * TransportByAir3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AirCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAirCarrierName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> TransportByAir3.mmObject();
			isDerived = false;
			xmlTag = "AirCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransportByAir3.mmDepartureAirport, TransportByAir3.mmDestinationAirport, TransportByAir3.mmAirCarrierName);
				trace_lazy = () -> TransportByAir.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByAir3";
				definition = "Information related to the transportation of goods by air.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AirportName1Choice> getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(List<AirportName1Choice> departureAirport) {
		this.departureAirport = departureAirport;
	}

	public List<AirportName1Choice> getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(List<AirportName1Choice> destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public Max35Text getAirCarrierName() {
		return airCarrierName;
	}

	public void setAirCarrierName(Max35Text airCarrierName) {
		this.airCarrierName = airCarrierName;
	}
}