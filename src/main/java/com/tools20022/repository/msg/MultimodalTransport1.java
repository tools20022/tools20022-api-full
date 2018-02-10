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
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to multimodal transportation of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmDepartureAirport
 * MultimodalTransport1.mmDepartureAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmDestinationAirport
 * MultimodalTransport1.mmDestinationAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPortOfLoading
 * MultimodalTransport1.mmPortOfLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPortOfDischarge
 * MultimodalTransport1.mmPortOfDischarge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfReceipt
 * MultimodalTransport1.mmPlaceOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfDelivery
 * MultimodalTransport1.mmPlaceOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmTakingInCharge
 * MultimodalTransport1.mmTakingInCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#mmPlaceOfFinalDestination
 * MultimodalTransport1.mmPlaceOfFinalDestination}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MultimodalTransport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to multimodal transportation of goods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MultimodalTransport1", propOrder = {"departureAirport", "destinationAirport", "portOfLoading", "portOfDischarge", "placeOfReceipt", "placeOfDelivery", "takingInCharge", "placeOfFinalDestination"})
public class MultimodalTransport1 {

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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
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
	@XmlElement(name = "DstnAirprt")
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "DstnAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationAirport";
			definition = "Place where the goods must arrive.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}
	};
	@XmlElement(name = "PortOfLoadng")
	protected List<Max35Text> portOfLoading;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PortOfLoadng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortOfLoading"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the port where the goods are loaded on board the ship."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfLoading = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PortOfDschrge")
	protected List<Max35Text> portOfDischarge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PortOfDschrge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortOfDischarge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the port where the goods are discharged."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfDischarge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfRct")
	protected List<Max35Text> placeOfReceipt;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfRct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the location where the goods are received for transportation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfReceipt = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfReceipt";
			definition = "Identifies the location where the goods are received for transportation.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfDlvry")
	protected List<Max35Text> placeOfDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfDlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the location of delivery of the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfDelivery = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfDelivery";
			definition = "Identifies the location of delivery of the goods.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TakngInChrg")
	protected List<Max35Text> takingInCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TakngInChrg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TakingInCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the location where the goods are take in charge for transportation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTakingInCharge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "TakngInChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingInCharge";
			definition = "Identifies the location where the goods are take in charge for transportation.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfFnlDstn")
	protected List<Max35Text> placeOfFinalDestination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1
	 * MultimodalTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfFnlDstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfFinalDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the location of the final destination of the goods."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfFinalDestination = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport1.mmObject();
			isDerived = false;
			xmlTag = "PlcOfFnlDstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfFinalDestination";
			definition = "Identifies the location of the final destination of the goods.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.MultimodalTransport1.mmDepartureAirport, com.tools20022.repository.msg.MultimodalTransport1.mmDestinationAirport,
								com.tools20022.repository.msg.MultimodalTransport1.mmPortOfLoading, com.tools20022.repository.msg.MultimodalTransport1.mmPortOfDischarge, com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfReceipt,
								com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport1.mmTakingInCharge,
								com.tools20022.repository.msg.MultimodalTransport1.mmPlaceOfFinalDestination);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MultimodalTransport1";
				definition = "Information related to multimodal transportation of goods.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AirportName1Choice> getDepartureAirport() {
		return departureAirport == null ? departureAirport = new ArrayList<>() : departureAirport;
	}

	public MultimodalTransport1 setDepartureAirport(List<AirportName1Choice> departureAirport) {
		this.departureAirport = Objects.requireNonNull(departureAirport);
		return this;
	}

	public List<AirportName1Choice> getDestinationAirport() {
		return destinationAirport == null ? destinationAirport = new ArrayList<>() : destinationAirport;
	}

	public MultimodalTransport1 setDestinationAirport(List<AirportName1Choice> destinationAirport) {
		this.destinationAirport = Objects.requireNonNull(destinationAirport);
		return this;
	}

	public List<Max35Text> getPortOfLoading() {
		return portOfLoading == null ? portOfLoading = new ArrayList<>() : portOfLoading;
	}

	public MultimodalTransport1 setPortOfLoading(List<Max35Text> portOfLoading) {
		this.portOfLoading = Objects.requireNonNull(portOfLoading);
		return this;
	}

	public List<Max35Text> getPortOfDischarge() {
		return portOfDischarge == null ? portOfDischarge = new ArrayList<>() : portOfDischarge;
	}

	public MultimodalTransport1 setPortOfDischarge(List<Max35Text> portOfDischarge) {
		this.portOfDischarge = Objects.requireNonNull(portOfDischarge);
		return this;
	}

	public List<Max35Text> getPlaceOfReceipt() {
		return placeOfReceipt == null ? placeOfReceipt = new ArrayList<>() : placeOfReceipt;
	}

	public MultimodalTransport1 setPlaceOfReceipt(List<Max35Text> placeOfReceipt) {
		this.placeOfReceipt = Objects.requireNonNull(placeOfReceipt);
		return this;
	}

	public List<Max35Text> getPlaceOfDelivery() {
		return placeOfDelivery == null ? placeOfDelivery = new ArrayList<>() : placeOfDelivery;
	}

	public MultimodalTransport1 setPlaceOfDelivery(List<Max35Text> placeOfDelivery) {
		this.placeOfDelivery = Objects.requireNonNull(placeOfDelivery);
		return this;
	}

	public List<Max35Text> getTakingInCharge() {
		return takingInCharge == null ? takingInCharge = new ArrayList<>() : takingInCharge;
	}

	public MultimodalTransport1 setTakingInCharge(List<Max35Text> takingInCharge) {
		this.takingInCharge = Objects.requireNonNull(takingInCharge);
		return this;
	}

	public List<Max35Text> getPlaceOfFinalDestination() {
		return placeOfFinalDestination == null ? placeOfFinalDestination = new ArrayList<>() : placeOfFinalDestination;
	}

	public MultimodalTransport1 setPlaceOfFinalDestination(List<Max35Text> placeOfFinalDestination) {
		this.placeOfFinalDestination = Objects.requireNonNull(placeOfFinalDestination);
		return this;
	}
}