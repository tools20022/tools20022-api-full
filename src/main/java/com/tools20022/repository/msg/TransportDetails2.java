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

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ShipmentDateRange;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Information on the shipment date, the charges, the routing and the goods
 * described in the transport document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmProposedShipmentOrActualShipmentDateRule
 * TransportDetails2.mmProposedShipmentOrActualShipmentDateRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmTransportDocumentReference
 * TransportDetails2.mmTransportDocumentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmTransportedGoods
 * TransportDetails2.mmTransportedGoods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmConsignment
 * TransportDetails2.mmConsignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmRoutingSummary
 * TransportDetails2.mmRoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmProposedShipmentDate
 * TransportDetails2.mmProposedShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmActualShipmentDate
 * TransportDetails2.mmActualShipmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails2#mmIncoterms
 * TransportDetails2.mmIncoterms}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmFreightCharges
 * TransportDetails2.mmFreightCharges}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransportDetails2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the shipment date, the charges, the routing and the goods described in the transport document."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails3
 * TransportDetails3}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TransportDetails2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.DocumentIdentification7> transportDocumentReference;
	/**
	 * Reference to the identification of the underlying transport document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification7
	 * DocumentIdentification7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportDocumentReference
	 * TransportDetails3.mmTransportDocumentReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportDocumentReference = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtDocRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportDocumentReference";
			definition = "Reference to the identification of  the underlying transport document.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmTransportDocumentReference);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DocumentIdentification7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TransportedGoods1> transportedGoods;
	/**
	 * Goods that are transported.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmTransportedGoods
	 * TransportDetails3.mmTransportedGoods}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportedGoods = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportedGoods;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtdGoods";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmTransportedGoods);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportedGoods1.mmObject();
		}
	};
	protected Consignment1 consignment;
	/**
	 * Physical packaging of goods for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Consignment1
	 * Consignment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPackaging
	 * Transport.mmPackaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmConsignment
	 * TransportDetails3.mmConsignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmConsignment = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmPackaging;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "Consgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignment";
			definition = "Physical packaging of goods for transport.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmConsignment);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Consignment1.mmObject();
		}
	};
	protected TransportMeans2 routingSummary;
	/**
	 * Information related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans2
	 * TransportMeans2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmRoutingSummary
	 * TransportDetails3.mmRoutingSummary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoutingSummary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "RtgSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoutingSummary";
			definition = "Information related to the conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmRoutingSummary);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportMeans2.mmObject();
		}
	};
	protected ISODate proposedShipmentDate;
	/**
	 * Proposed date on which the goods should be shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
	 * ShipmentDateRange.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposed date on which the goods should be shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProposedShipmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmShipmentDate;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "PropsdShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedShipmentDate";
			definition = "Proposed date on which the goods should be shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate actualShipmentDate;
	/**
	 * Actual date whereby the goods were shipped.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#mmShipmentDate
	 * ShipmentDateRange.mmShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlShipmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Actual date whereby the goods were shipped."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActualShipmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ShipmentDateRange.mmShipmentDate;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "ActlShipmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualShipmentDate";
			definition = "Actual date whereby the goods were shipped.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Incoterms2 incoterms;
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Incoterms2 Incoterms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmIncoterms
	 * Transport.mmIncoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmIncoterms
	 * TransportDetails3.mmIncoterms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIncoterms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmIncoterms;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "Incotrms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmIncoterms);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Incoterms2.mmObject();
		}
	};
	protected Charge13 freightCharges;
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge13 Charge13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport#mmTransportCharges
	 * Transport.mmTransportCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#mmFreightCharges
	 * TransportDetails3.mmFreightCharges}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFreightCharges = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Transport.mmTransportCharges;
			componentContext_lazy = () -> TransportDetails2.mmObject();
			isDerived = false;
			xmlTag = "FrghtChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FreightCharges";
			definition = "Charges related to the conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmFreightCharges);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge13.mmObject();
		}
	};
	/**
	 * If ActualShipmentDate is present, then ProposedShipmentDate is not
	 * allowed. If ActualShipmentDate is not present, then ProposedShipmentDate
	 * is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2
	 * TransportDetails2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmProposedShipmentDate
	 * TransportDetails2.mmProposedShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#mmActualShipmentDate
	 * TransportDetails2.mmActualShipmentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedShipmentOrActualShipmentDateRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If ActualShipmentDate is present, then ProposedShipmentDate is not allowed. If ActualShipmentDate is not present, then ProposedShipmentDate is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmProposedShipmentOrActualShipmentDateRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedShipmentOrActualShipmentDateRule";
			definition = "If ActualShipmentDate is present, then ProposedShipmentDate is not allowed. If ActualShipmentDate is not present, then ProposedShipmentDate is mandatory.";
			messageComponent_lazy = () -> TransportDetails2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TransportDetails2.mmProposedShipmentDate, TransportDetails2.mmActualShipmentDate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransportDetails2.mmTransportDocumentReference, TransportDetails2.mmTransportedGoods, TransportDetails2.mmConsignment, TransportDetails2.mmRoutingSummary,
						TransportDetails2.mmProposedShipmentDate, TransportDetails2.mmActualShipmentDate, TransportDetails2.mmIncoterms, TransportDetails2.mmFreightCharges);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TransportDetails2";
				definition = "Information on the shipment date, the charges, the routing and the goods described in the transport document.";
				nextVersions_lazy = () -> Arrays.asList(TransportDetails3.mmObject());
				xors_lazy = () -> Arrays.asList(TransportDetails2.mmProposedShipmentOrActualShipmentDateRule);
			}
		});
		return mmObject_lazy.get();
	}

	public List<DocumentIdentification7> getTransportDocumentReference() {
		return transportDocumentReference;
	}

	public void setTransportDocumentReference(List<com.tools20022.repository.msg.DocumentIdentification7> transportDocumentReference) {
		this.transportDocumentReference = transportDocumentReference;
	}

	public List<TransportedGoods1> getTransportedGoods() {
		return transportedGoods;
	}

	public void setTransportedGoods(List<com.tools20022.repository.msg.TransportedGoods1> transportedGoods) {
		this.transportedGoods = transportedGoods;
	}

	public Consignment1 getConsignment() {
		return consignment;
	}

	public void setConsignment(com.tools20022.repository.msg.Consignment1 consignment) {
		this.consignment = consignment;
	}

	public TransportMeans2 getRoutingSummary() {
		return routingSummary;
	}

	public void setRoutingSummary(com.tools20022.repository.msg.TransportMeans2 routingSummary) {
		this.routingSummary = routingSummary;
	}

	public ISODate getProposedShipmentDate() {
		return proposedShipmentDate;
	}

	public void setProposedShipmentDate(ISODate proposedShipmentDate) {
		this.proposedShipmentDate = proposedShipmentDate;
	}

	public ISODate getActualShipmentDate() {
		return actualShipmentDate;
	}

	public void setActualShipmentDate(ISODate actualShipmentDate) {
		this.actualShipmentDate = actualShipmentDate;
	}

	public Incoterms2 getIncoterms() {
		return incoterms;
	}

	public void setIncoterms(com.tools20022.repository.msg.Incoterms2 incoterms) {
		this.incoterms = incoterms;
	}

	public Charge13 getFreightCharges() {
		return freightCharges;
	}

	public void setFreightCharges(com.tools20022.repository.msg.Charge13 freightCharges) {
		this.freightCharges = freightCharges;
	}
}