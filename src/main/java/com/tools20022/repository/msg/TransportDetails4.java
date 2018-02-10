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
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportDocumentReference
 * TransportDetails4.mmTransportDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmTransportedGoods
 * TransportDetails4.mmTransportedGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmConsignment
 * TransportDetails4.mmConsignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmRoutingSummary
 * TransportDetails4.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmShipmentDate
 * TransportDetails4.mmShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#mmFreightCharges
 * TransportDetails4.mmFreightCharges}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails4#mmIncoterms
 * TransportDetails4.mmIncoterms}</li>
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
 * "TransportDetails4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the shipment date, the charges, the routing and the goods described in the transport document."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.TransportDetails3
 * TransportDetails3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportDetails4", propOrder = {"transportDocumentReference", "transportedGoods", "consignment", "routingSummary", "shipmentDate", "freightCharges", "incoterms"})
public class TransportDetails4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtDocRef", required = true)
	protected List<com.tools20022.repository.msg.DocumentIdentification7> transportDocumentReference;
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * "Reference to the identification of  the underlying transport document."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportDocumentReference
	 * TransportDetails3.mmTransportDocumentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportDocumentReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDocumentReference";
			definition = "Reference to the identification of  the underlying transport document.";
			previousVersion_lazy = () -> TransportDetails3.mmTransportDocumentReference;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtdGoods", required = true)
	protected List<com.tools20022.repository.msg.TransportedGoods1> transportedGoods;
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportedGoods
	 * TransportDetails3.mmTransportedGoods}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportedGoods = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportedGoods;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtdGoods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			previousVersion_lazy = () -> TransportDetails3.mmTransportedGoods;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportedGoods1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmConsignment
	 * TransportDetails3.mmConsignment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPackaging;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "Consgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignment";
			definition = "Physical packaging of goods for transport.";
			previousVersion_lazy = () -> TransportDetails3.mmConsignment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Consignment3.mmObject();
		}
	};
	@XmlElement(name = "RtgSummry", required = true)
	protected TransportMeans6 routingSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans6
	 * TransportMeans6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmRoutingSummary
	 * TransportDetails3.mmRoutingSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoutingSummary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			previousVersion_lazy = () -> TransportDetails3.mmRoutingSummary;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportMeans6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmShipmentDate
	 * TransportDetails3.mmShipmentDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmShipmentDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmShipmentDates;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "ShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShipmentDate";
			definition = "Shipment date, actual or proposed.";
			previousVersion_lazy = () -> TransportDetails3.mmShipmentDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ShipmentDate1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmFreightCharges
	 * TransportDetails3.mmFreightCharges}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFreightCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			previousVersion_lazy = () -> TransportDetails3.mmFreightCharges;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge25.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4
	 * TransportDetails4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmIncoterms
	 * TransportDetails3.mmIncoterms}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncoterms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportDetails4.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			previousVersion_lazy = () -> TransportDetails3.mmIncoterms;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Incoterms4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails4.mmTransportDocumentReference, com.tools20022.repository.msg.TransportDetails4.mmTransportedGoods,
						com.tools20022.repository.msg.TransportDetails4.mmConsignment, com.tools20022.repository.msg.TransportDetails4.mmRoutingSummary, com.tools20022.repository.msg.TransportDetails4.mmShipmentDate,
						com.tools20022.repository.msg.TransportDetails4.mmFreightCharges, com.tools20022.repository.msg.TransportDetails4.mmIncoterms);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportDetails4";
				definition = "Information on the shipment date, the charges, the routing and the goods described in the transport document.";
				previousVersion_lazy = () -> TransportDetails3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<DocumentIdentification7> getTransportDocumentReference() {
		return transportDocumentReference == null ? transportDocumentReference = new ArrayList<>() : transportDocumentReference;
	}

	public TransportDetails4 setTransportDocumentReference(List<com.tools20022.repository.msg.DocumentIdentification7> transportDocumentReference) {
		this.transportDocumentReference = Objects.requireNonNull(transportDocumentReference);
		return this;
	}

	public List<TransportedGoods1> getTransportedGoods() {
		return transportedGoods == null ? transportedGoods = new ArrayList<>() : transportedGoods;
	}

	public TransportDetails4 setTransportedGoods(List<com.tools20022.repository.msg.TransportedGoods1> transportedGoods) {
		this.transportedGoods = Objects.requireNonNull(transportedGoods);
		return this;
	}

	public Optional<Consignment3> getConsignment() {
		return consignment == null ? Optional.empty() : Optional.of(consignment);
	}

	public TransportDetails4 setConsignment(com.tools20022.repository.msg.Consignment3 consignment) {
		this.consignment = consignment;
		return this;
	}

	public TransportMeans6 getRoutingSummary() {
		return routingSummary;
	}

	public TransportDetails4 setRoutingSummary(com.tools20022.repository.msg.TransportMeans6 routingSummary) {
		this.routingSummary = Objects.requireNonNull(routingSummary);
		return this;
	}

	public ShipmentDate1Choice getShipmentDate() {
		return shipmentDate;
	}

	public TransportDetails4 setShipmentDate(ShipmentDate1Choice shipmentDate) {
		this.shipmentDate = Objects.requireNonNull(shipmentDate);
		return this;
	}

	public Optional<Charge25> getFreightCharges() {
		return freightCharges == null ? Optional.empty() : Optional.of(freightCharges);
	}

	public TransportDetails4 setFreightCharges(com.tools20022.repository.msg.Charge25 freightCharges) {
		this.freightCharges = freightCharges;
		return this;
	}

	public Optional<Incoterms4> getIncoterms() {
		return incoterms == null ? Optional.empty() : Optional.of(incoterms);
	}

	public TransportDetails4 setIncoterms(com.tools20022.repository.msg.Incoterms4 incoterms) {
		this.incoterms = incoterms;
		return this;
	}
}