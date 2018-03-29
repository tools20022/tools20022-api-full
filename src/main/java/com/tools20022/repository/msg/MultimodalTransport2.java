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
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportBySea;
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
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmDepartureAirport
 * MultimodalTransport2.mmDepartureAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmDestinationAirport
 * MultimodalTransport2.mmDestinationAirport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmAirCarrierName
 * MultimodalTransport2.mmAirCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPortOfLoading
 * MultimodalTransport2.mmPortOfLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPortOfDischarge
 * MultimodalTransport2.mmPortOfDischarge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmVesselName
 * MultimodalTransport2.mmVesselName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfReceipt
 * MultimodalTransport2.mmPlaceOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfDelivery
 * MultimodalTransport2.mmPlaceOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmTakingInCharge
 * MultimodalTransport2.mmTakingInCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmPlaceOfFinalDestination
 * MultimodalTransport2.mmPlaceOfFinalDestination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmTransitLocation
 * MultimodalTransport2.mmTransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmRoadCarrierName
 * MultimodalTransport2.mmRoadCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#mmRailCarrierName
 * MultimodalTransport2.mmRailCarrierName}</li>
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
 * "MultimodalTransport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to multimodal transportation of goods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MultimodalTransport2", propOrder = {"departureAirport", "destinationAirport", "airCarrierName", "portOfLoading", "portOfDischarge", "vesselName", "placeOfReceipt", "placeOfDelivery", "takingInCharge",
		"placeOfFinalDestination", "transitLocation", "roadCarrierName", "railCarrierName"})
public class MultimodalTransport2 {

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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAssociationEnd<MultimodalTransport2, List<AirportName1Choice>> mmDepartureAirport = new MMMessageAssociationEnd<MultimodalTransport2, List<AirportName1Choice>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "DprtureAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepartureAirport";
			definition = "Place from where the goods must leave.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}

		@Override
		public List<AirportName1Choice> getValue(MultimodalTransport2 obj) {
			return obj.getDepartureAirport();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<AirportName1Choice> value) {
			obj.setDepartureAirport(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAssociationEnd<MultimodalTransport2, List<AirportName1Choice>> mmDestinationAirport = new MMMessageAssociationEnd<MultimodalTransport2, List<AirportName1Choice>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "DstnAirprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DestinationAirport";
			definition = "Place where the goods must arrive.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AirportName1Choice.mmObject();
		}

		@Override
		public List<AirportName1Choice> getValue(MultimodalTransport2 obj) {
			return obj.getDestinationAirport();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<AirportName1Choice> value) {
			obj.setDestinationAirport(value);
		}
	};
	@XmlElement(name = "AirCrrierNm")
	protected List<Max35Text> airCarrierName;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmAirCarrierName = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "AirCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AirCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getAirCarrierName();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setAirCarrierName(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmPortOfLoading = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getPortOfLoading();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setPortOfLoading(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmPortOfDischarge = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getPortOfDischarge();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setPortOfDischarge(value);
		}
	};
	@XmlElement(name = "VsslNm")
	protected List<Max35Text> vesselName;
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
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmVesselName
	 * TransportBySea.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VsslNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VesselName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of a vessel."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmVesselName = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmVesselName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "VsslNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getVesselName();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setVesselName(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmPlaceOfReceipt = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfReceipt";
			definition = "Identifies the location where the goods are received for transportation.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getPlaceOfReceipt();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setPlaceOfReceipt(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmPlaceOfDelivery = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfDelivery";
			definition = "Identifies the location of delivery of the goods.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getPlaceOfDelivery();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setPlaceOfDelivery(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmTakingInCharge = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "TakngInChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TakingInCharge";
			definition = "Identifies the location where the goods are take in charge for transportation.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getTakingInCharge();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setTakingInCharge(value);
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
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
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
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmPlaceOfFinalDestination = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "PlcOfFnlDstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfFinalDestination";
			definition = "Identifies the location of the final destination of the goods.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getPlaceOfFinalDestination();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setPlaceOfFinalDestination(value);
		}
	};
	@XmlElement(name = "TrnstLctn")
	protected List<Max35Text> transitLocation;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnstLctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransitLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies a place in a country."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmTransitLocation = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "TrnstLctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransitLocation";
			definition = "Specifies a place in a country.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getTransitLocation();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setTransitLocation(value);
		}
	};
	@XmlElement(name = "RoadCrrierNm")
	protected List<Max35Text> roadCarrierName;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RoadCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoadCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmRoadCarrierName = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "RoadCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoadCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getRoadCarrierName();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setRoadCarrierName(value);
		}
	};
	@XmlElement(name = "RailCrrierNm")
	protected List<Max35Text> railCarrierName;
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2
	 * MultimodalTransport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RailCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RailCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MultimodalTransport2, List<Max35Text>> mmRailCarrierName = new MMMessageAttribute<MultimodalTransport2, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.MultimodalTransport2.mmObject();
			isDerived = false;
			xmlTag = "RailCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RailCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MultimodalTransport2 obj) {
			return obj.getRailCarrierName();
		}

		@Override
		public void setValue(MultimodalTransport2 obj, List<Max35Text> value) {
			obj.setRailCarrierName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MultimodalTransport2.mmDepartureAirport, com.tools20022.repository.msg.MultimodalTransport2.mmDestinationAirport,
						com.tools20022.repository.msg.MultimodalTransport2.mmAirCarrierName, com.tools20022.repository.msg.MultimodalTransport2.mmPortOfLoading, com.tools20022.repository.msg.MultimodalTransport2.mmPortOfDischarge,
						com.tools20022.repository.msg.MultimodalTransport2.mmVesselName, com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfDelivery,
						com.tools20022.repository.msg.MultimodalTransport2.mmTakingInCharge, com.tools20022.repository.msg.MultimodalTransport2.mmPlaceOfFinalDestination,
						com.tools20022.repository.msg.MultimodalTransport2.mmTransitLocation, com.tools20022.repository.msg.MultimodalTransport2.mmRoadCarrierName, com.tools20022.repository.msg.MultimodalTransport2.mmRailCarrierName);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MultimodalTransport2";
				definition = "Information related to multimodal transportation of goods.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<AirportName1Choice> getDepartureAirport() {
		return departureAirport == null ? departureAirport = new ArrayList<>() : departureAirport;
	}

	public MultimodalTransport2 setDepartureAirport(List<AirportName1Choice> departureAirport) {
		this.departureAirport = Objects.requireNonNull(departureAirport);
		return this;
	}

	public List<AirportName1Choice> getDestinationAirport() {
		return destinationAirport == null ? destinationAirport = new ArrayList<>() : destinationAirport;
	}

	public MultimodalTransport2 setDestinationAirport(List<AirportName1Choice> destinationAirport) {
		this.destinationAirport = Objects.requireNonNull(destinationAirport);
		return this;
	}

	public List<Max35Text> getAirCarrierName() {
		return airCarrierName == null ? airCarrierName = new ArrayList<>() : airCarrierName;
	}

	public MultimodalTransport2 setAirCarrierName(List<Max35Text> airCarrierName) {
		this.airCarrierName = Objects.requireNonNull(airCarrierName);
		return this;
	}

	public List<Max35Text> getPortOfLoading() {
		return portOfLoading == null ? portOfLoading = new ArrayList<>() : portOfLoading;
	}

	public MultimodalTransport2 setPortOfLoading(List<Max35Text> portOfLoading) {
		this.portOfLoading = Objects.requireNonNull(portOfLoading);
		return this;
	}

	public List<Max35Text> getPortOfDischarge() {
		return portOfDischarge == null ? portOfDischarge = new ArrayList<>() : portOfDischarge;
	}

	public MultimodalTransport2 setPortOfDischarge(List<Max35Text> portOfDischarge) {
		this.portOfDischarge = Objects.requireNonNull(portOfDischarge);
		return this;
	}

	public List<Max35Text> getVesselName() {
		return vesselName == null ? vesselName = new ArrayList<>() : vesselName;
	}

	public MultimodalTransport2 setVesselName(List<Max35Text> vesselName) {
		this.vesselName = Objects.requireNonNull(vesselName);
		return this;
	}

	public List<Max35Text> getPlaceOfReceipt() {
		return placeOfReceipt == null ? placeOfReceipt = new ArrayList<>() : placeOfReceipt;
	}

	public MultimodalTransport2 setPlaceOfReceipt(List<Max35Text> placeOfReceipt) {
		this.placeOfReceipt = Objects.requireNonNull(placeOfReceipt);
		return this;
	}

	public List<Max35Text> getPlaceOfDelivery() {
		return placeOfDelivery == null ? placeOfDelivery = new ArrayList<>() : placeOfDelivery;
	}

	public MultimodalTransport2 setPlaceOfDelivery(List<Max35Text> placeOfDelivery) {
		this.placeOfDelivery = Objects.requireNonNull(placeOfDelivery);
		return this;
	}

	public List<Max35Text> getTakingInCharge() {
		return takingInCharge == null ? takingInCharge = new ArrayList<>() : takingInCharge;
	}

	public MultimodalTransport2 setTakingInCharge(List<Max35Text> takingInCharge) {
		this.takingInCharge = Objects.requireNonNull(takingInCharge);
		return this;
	}

	public List<Max35Text> getPlaceOfFinalDestination() {
		return placeOfFinalDestination == null ? placeOfFinalDestination = new ArrayList<>() : placeOfFinalDestination;
	}

	public MultimodalTransport2 setPlaceOfFinalDestination(List<Max35Text> placeOfFinalDestination) {
		this.placeOfFinalDestination = Objects.requireNonNull(placeOfFinalDestination);
		return this;
	}

	public List<Max35Text> getTransitLocation() {
		return transitLocation == null ? transitLocation = new ArrayList<>() : transitLocation;
	}

	public MultimodalTransport2 setTransitLocation(List<Max35Text> transitLocation) {
		this.transitLocation = Objects.requireNonNull(transitLocation);
		return this;
	}

	public List<Max35Text> getRoadCarrierName() {
		return roadCarrierName == null ? roadCarrierName = new ArrayList<>() : roadCarrierName;
	}

	public MultimodalTransport2 setRoadCarrierName(List<Max35Text> roadCarrierName) {
		this.roadCarrierName = Objects.requireNonNull(roadCarrierName);
		return this;
	}

	public List<Max35Text> getRailCarrierName() {
		return railCarrierName == null ? railCarrierName = new ArrayList<>() : railCarrierName;
	}

	public MultimodalTransport2 setRailCarrierName(List<Max35Text> railCarrierName) {
		this.railCarrierName = Objects.requireNonNull(railCarrierName);
		return this;
	}
}