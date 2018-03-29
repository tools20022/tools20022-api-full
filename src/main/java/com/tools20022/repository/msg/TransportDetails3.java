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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ShipmentDate1Choice;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the shipment date, the charges, the routing and the goods
 * described in the transport document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportDocumentReference
 * TransportDetails3.mmTransportDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportedGoods
 * TransportDetails3.mmTransportedGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmConsignment
 * TransportDetails3.mmConsignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmRoutingSummary
 * TransportDetails3.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmShipmentDate
 * TransportDetails3.mmShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmFreightCharges
 * TransportDetails3.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails3#mmIncoterms
 * TransportDetails3.mmIncoterms}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransportDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the shipment date, the charges, the routing and the goods described in the transport document."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails4
 * TransportDetails4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransportDetails2
 * TransportDetails2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportDetails3", propOrder = {"transportDocumentReference", "transportedGoods", "consignment", "routingSummary", "shipmentDate", "freightCharges", "incoterms"})
public class TransportDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtDocRef", required = true)
	protected List<DocumentIdentification7> transportDocumentReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtDocRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocumentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the identification of the underlying transport document."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportDocumentReference
	 * TransportDetails4.mmTransportDocumentReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmTransportDocumentReference
	 * TransportDetails2.mmTransportDocumentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, List<DocumentIdentification7>> mmTransportDocumentReference = new MMMessageAssociationEnd<TransportDetails3, List<DocumentIdentification7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDocumentReference";
			definition = "Reference to the identification of the underlying transport document.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmTransportDocumentReference);
			previousVersion_lazy = () -> TransportDetails2.mmTransportDocumentReference;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DocumentIdentification7.mmObject();
		}

		@Override
		public List<DocumentIdentification7> getValue(TransportDetails3 obj) {
			return obj.getTransportDocumentReference();
		}

		@Override
		public void setValue(TransportDetails3 obj, List<DocumentIdentification7> value) {
			obj.setTransportDocumentReference(value);
		}
	};
	@XmlElement(name = "TrnsprtdGoods", required = true)
	protected List<TransportedGoods1> transportedGoods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportedGoods1
	 * TransportedGoods1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportedGoods
	 * Transport.mmTransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtdGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportedGoods
	 * TransportDetails4.mmTransportedGoods}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmTransportedGoods
	 * TransportDetails2.mmTransportedGoods}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, List<TransportedGoods1>> mmTransportedGoods = new MMMessageAssociationEnd<TransportDetails3, List<TransportedGoods1>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportedGoods;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtdGoods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmTransportedGoods);
			previousVersion_lazy = () -> TransportDetails2.mmTransportedGoods;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransportedGoods1.mmObject();
		}

		@Override
		public List<TransportedGoods1> getValue(TransportDetails3 obj) {
			return obj.getTransportedGoods();
		}

		@Override
		public void setValue(TransportDetails3 obj, List<TransportedGoods1> value) {
			obj.setTransportedGoods(value);
		}
	};
	@XmlElement(name = "Consgnmt")
	protected Consignment3 consignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Consignment3
	 * Consignment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPackaging
	 * Transport.mmPackaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of goods for transport."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmConsignment
	 * TransportDetails4.mmConsignment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmConsignment
	 * TransportDetails2.mmConsignment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, Optional<Consignment3>> mmConsignment = new MMMessageAssociationEnd<TransportDetails3, Optional<Consignment3>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPackaging;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "Consgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignment";
			definition = "Physical packaging of goods for transport.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmConsignment);
			previousVersion_lazy = () -> TransportDetails2.mmConsignment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Consignment3.mmObject();
		}

		@Override
		public Optional<Consignment3> getValue(TransportDetails3 obj) {
			return obj.getConsignment();
		}

		@Override
		public void setValue(TransportDetails3 obj, Optional<Consignment3> value) {
			obj.setConsignment(value.orElse(null));
		}
	};
	@XmlElement(name = "RtgSummry", required = true)
	protected TransportMeans4 routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans4
	 * TransportMeans4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RtgSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoutingSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the conveyance of goods."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmRoutingSummary
	 * TransportDetails4.mmRoutingSummary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmRoutingSummary
	 * TransportDetails2.mmRoutingSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, TransportMeans4> mmRoutingSummary = new MMMessageAssociationEnd<TransportDetails3, TransportMeans4>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmRoutingSummary);
			previousVersion_lazy = () -> TransportDetails2.mmRoutingSummary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransportMeans4.mmObject();
		}

		@Override
		public TransportMeans4 getValue(TransportDetails3 obj) {
			return obj.getRoutingSummary();
		}

		@Override
		public void setValue(TransportDetails3 obj, TransportMeans4 value) {
			obj.setRoutingSummary(value);
		}
	};
	@XmlElement(name = "ShipmntDt", required = true)
	protected ShipmentDate1Choice shipmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.ShipmentDate1Choice
	 * ShipmentDate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmShipmentDates
	 * Transport.mmShipmentDates}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Shipment date, actual or proposed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmShipmentDate
	 * TransportDetails4.mmShipmentDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, ShipmentDate1Choice> mmShipmentDate = new MMMessageAssociationEnd<TransportDetails3, ShipmentDate1Choice>() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "ShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentDate";
			definition = "Shipment date, actual or proposed.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmShipmentDate);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ShipmentDate1Choice.mmObject();
		}

		@Override
		public ShipmentDate1Choice getValue(TransportDetails3 obj) {
			return obj.getShipmentDate();
		}

		@Override
		public void setValue(TransportDetails3 obj, ShipmentDate1Choice value) {
			obj.setShipmentDate(value);
		}
	};
	@XmlElement(name = "FrghtChrgs")
	protected Charge25 freightCharges;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge25 Charge25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrghtChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmFreightCharges
	 * TransportDetails4.mmFreightCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmFreightCharges
	 * TransportDetails2.mmFreightCharges}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, Optional<Charge25>> mmFreightCharges = new MMMessageAssociationEnd<TransportDetails3, Optional<Charge25>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmFreightCharges);
			previousVersion_lazy = () -> TransportDetails2.mmFreightCharges;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Charge25.mmObject();
		}

		@Override
		public Optional<Charge25> getValue(TransportDetails3 obj) {
			return obj.getFreightCharges();
		}

		@Override
		public void setValue(TransportDetails3 obj, Optional<Charge25> value) {
			obj.setFreightCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "Incotrms")
	protected Incoterms4 incoterms;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms4 Incoterms4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3
	 * TransportDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incotrms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmIncoterms
	 * TransportDetails4.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmIncoterms
	 * TransportDetails2.mmIncoterms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TransportDetails3, Optional<Incoterms4>> mmIncoterms = new MMMessageAssociationEnd<TransportDetails3, Optional<Incoterms4>>() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails3.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmIncoterms);
			previousVersion_lazy = () -> TransportDetails2.mmIncoterms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Incoterms4.mmObject();
		}

		@Override
		public Optional<Incoterms4> getValue(TransportDetails3 obj) {
			return obj.getIncoterms();
		}

		@Override
		public void setValue(TransportDetails3 obj, Optional<Incoterms4> value) {
			obj.setIncoterms(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails3.mmTransportDocumentReference, com.tools20022.repository.msg.TransportDetails3.mmTransportedGoods,
						com.tools20022.repository.msg.TransportDetails3.mmConsignment, com.tools20022.repository.msg.TransportDetails3.mmRoutingSummary, com.tools20022.repository.msg.TransportDetails3.mmShipmentDate,
						com.tools20022.repository.msg.TransportDetails3.mmFreightCharges, com.tools20022.repository.msg.TransportDetails3.mmIncoterms);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportDetails3";
				definition = "Information on the shipment date, the charges, the routing and the goods described in the transport document.";
				nextVersions_lazy = () -> Arrays.asList(TransportDetails4.mmObject());
				previousVersion_lazy = () -> TransportDetails2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<DocumentIdentification7> getTransportDocumentReference() {
		return transportDocumentReference == null ? transportDocumentReference = new ArrayList<>() : transportDocumentReference;
	}

	public TransportDetails3 setTransportDocumentReference(List<DocumentIdentification7> transportDocumentReference) {
		this.transportDocumentReference = Objects.requireNonNull(transportDocumentReference);
		return this;
	}

	public List<TransportedGoods1> getTransportedGoods() {
		return transportedGoods == null ? transportedGoods = new ArrayList<>() : transportedGoods;
	}

	public TransportDetails3 setTransportedGoods(List<TransportedGoods1> transportedGoods) {
		this.transportedGoods = Objects.requireNonNull(transportedGoods);
		return this;
	}

	public Optional<Consignment3> getConsignment() {
		return consignment == null ? Optional.empty() : Optional.of(consignment);
	}

	public TransportDetails3 setConsignment(Consignment3 consignment) {
		this.consignment = consignment;
		return this;
	}

	public TransportMeans4 getRoutingSummary() {
		return routingSummary;
	}

	public TransportDetails3 setRoutingSummary(TransportMeans4 routingSummary) {
		this.routingSummary = Objects.requireNonNull(routingSummary);
		return this;
	}

	public ShipmentDate1Choice getShipmentDate() {
		return shipmentDate;
	}

	public TransportDetails3 setShipmentDate(ShipmentDate1Choice shipmentDate) {
		this.shipmentDate = Objects.requireNonNull(shipmentDate);
		return this;
	}

	public Optional<Charge25> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public TransportDetails3 setFreightCharges(Charge25 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public TransportDetails3 setIncoterms(Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}
}