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
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportByAir;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDepartureAirport
 * TransportByAir5.mmDepartureAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmDestinationAirport
 * TransportByAir5.mmDestinationAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmAirCarrierName
 * TransportByAir5.mmAirCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmAirCarrierCountry
 * TransportByAir5.mmAirCarrierCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmCarrierAgentName
 * TransportByAir5.mmCarrierAgentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportByAir5#mmCarrierAgentCountry
 * TransportByAir5.mmCarrierAgentCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
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
 * "TransportByAir5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the transportation of goods by air."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TransportByAir4
 * TransportByAir4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportByAir5", propOrder = {"departureAirport", "destinationAirport", "airCarrierName", "airCarrierCountry", "carrierAgentName", "carrierAgentCountry"})
public class TransportByAir5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DprtureAirprt")
	protected List<AirportName1Choice> departureAirport;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDepartureAirport
	 * TransportByAir4.mmDepartureAirport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepartureAirport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "DprtureAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepartureAirport";
			definition = "Place from where the goods must leave.";
			previousVersion_lazy = () -> TransportByAir4.mmDepartureAirport;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}
	};
	@XmlElement(name = "DstnAirprt", required = true)
	protected List<AirportName1Choice> destinationAirport;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmDestinationAirport
	 * TransportByAir4.mmDestinationAirport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDestinationAirport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "DstnAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationAirport";
			definition = "Place where the goods must arrive.";
			previousVersion_lazy = () -> TransportByAir4.mmDestinationAirport;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}
	};
	@XmlElement(name = "AirCrrierNm")
	protected Max70Text airCarrierName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierName
	 * TransportByAir4.mmAirCarrierName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAirCarrierName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "AirCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			previousVersion_lazy = () -> TransportByAir4.mmAirCarrierName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "AirCrrierCtry")
	protected CountryCode airCarrierCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AirCrrierCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AirCarrierCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the carrier of the goods, for example, shipping company, is located or registered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmAirCarrierCountry
	 * TransportByAir4.mmAirCarrierCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAirCarrierCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "AirCrrierCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirCarrierCountry";
			definition = "Country in which the carrier of the goods, for example, shipping company, is located or registered.";
			previousVersion_lazy = () -> TransportByAir4.mmAirCarrierCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	@XmlElement(name = "CrrierAgtNm")
	protected Max70Text carrierAgentName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrierAgtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierAgentName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmCarrierAgentName
	 * TransportByAir4.mmCarrierAgentName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentName";
			definition = "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> TransportByAir4.mmCarrierAgentName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	@XmlElement(name = "CrrierAgtCtry")
	protected CountryCode carrierAgentCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5
	 * TransportByAir5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrrierAgtCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CarrierAgentCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#mmCarrierAgentCountry
	 * TransportByAir4.mmCarrierAgentCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportByAir5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentCountry";
			definition = "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> TransportByAir4.mmCarrierAgentCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir5.mmDepartureAirport, com.tools20022.repository.msg.TransportByAir5.mmDestinationAirport,
						com.tools20022.repository.msg.TransportByAir5.mmAirCarrierName, com.tools20022.repository.msg.TransportByAir5.mmAirCarrierCountry, com.tools20022.repository.msg.TransportByAir5.mmCarrierAgentName,
						com.tools20022.repository.msg.TransportByAir5.mmCarrierAgentCountry);
				trace_lazy = () -> TransportByAir.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportByAir5";
				definition = "Information related to the transportation of goods by air.";
				previousVersion_lazy = () -> TransportByAir4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<AirportName1Choice> getDepartureAirport() {
		return departureAirport == null ? departureAirport = new ArrayList<>() : departureAirport;
	}

	public TransportByAir5 setDepartureAirport(List<AirportName1Choice> departureAirport) {
		this.departureAirport = Objects.requireNonNull(departureAirport);
		return this;
	}

	public List<AirportName1Choice> getDestinationAirport() {
		return destinationAirport == null ? destinationAirport = new ArrayList<>() : destinationAirport;
	}

	public TransportByAir5 setDestinationAirport(List<AirportName1Choice> destinationAirport) {
		this.destinationAirport = Objects.requireNonNull(destinationAirport);
		return this;
	}

	public Optional<Max70Text> getAirCarrierName() {
		return airCarrierName == null ? Optional.empty() : Optional.of(airCarrierName);
	}

	public TransportByAir5 setAirCarrierName(Max70Text airCarrierName) {
		this.airCarrierName = airCarrierName;
		return this;
	}

	public Optional<CountryCode> getAirCarrierCountry() {
		return airCarrierCountry == null ? Optional.empty() : Optional.of(airCarrierCountry);
	}

	public TransportByAir5 setAirCarrierCountry(CountryCode airCarrierCountry) {
		this.airCarrierCountry = airCarrierCountry;
		return this;
	}

	public Optional<Max70Text> getCarrierAgentName() {
		return carrierAgentName == null ? Optional.empty() : Optional.of(carrierAgentName);
	}

	public TransportByAir5 setCarrierAgentName(Max70Text carrierAgentName) {
		this.carrierAgentName = carrierAgentName;
		return this;
	}

	public Optional<CountryCode> getCarrierAgentCountry() {
		return carrierAgentCountry == null ? Optional.empty() : Optional.of(carrierAgentCountry);
	}

	public TransportByAir5 setCarrierAgentCountry(CountryCode carrierAgentCountry) {
		this.carrierAgentCountry = carrierAgentCountry;
		return this;
	}
}