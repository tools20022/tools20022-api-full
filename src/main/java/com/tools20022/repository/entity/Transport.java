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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.TransportMeans1Choice;
import com.tools20022.repository.choice.TransportMeans2Choice;
import com.tools20022.repository.codeset.FreightChargesCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Moving of goods or people from one place to another by vehicle.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Transport" src="doc-files/Transport.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Incoterms
 * Transport.Incoterms}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Identification
 * Transport.Identification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#Packaging
 * Transport.Packaging}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ArrivalDateTime
 * Transport.ArrivalDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PartialShipment
 * Transport.PartialShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransShipment
 * Transport.TransShipment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ProductDelivery
 * Transport.ProductDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PlaceOfDeparture
 * Transport.PlaceOfDeparture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#PlaceOfDestination
 * Transport.PlaceOfDestination}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportCharges
 * Transport.TransportCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#FreightChargesPrepaidOrCollect
 * Transport.FreightChargesPrepaidOrCollect}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#ShipmentDates
 * Transport.ShipmentDates}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransportedGoods
 * Transport.TransportedGoods}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#PartyRole
 * Transport.PartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Transport#TransitLocation
 * Transport.TransitLocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Transport#TransportDocuments
 * Transport.TransportDocuments}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DepartureTransportParameters
 * Location.DepartureTransportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Location#DestinationTransportParameters
 * Location.DestinationTransportParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#RelatedTransport
 * Location.RelatedTransport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Transport
 * Document.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Charges#Transport
 * Charges.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Incoterms#Transport
 * Incoterms.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Goods#Transport
 * Goods.Transport}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProductDelivery#Routing
 * ProductDelivery.Routing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Packaging#Transport
 * Packaging.Transport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#Transport
 * TransportPartyRole.Transport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#RelatedTransport
 * ShipmentDateRange.RelatedTransport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans3#ModeCode
 * TransportMeans3.ModeCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#TransportMeans
 * Consignment2.TransportMeans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans1Choice#IndividualTransport
 * TransportMeans1Choice.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans1Choice#MultimodalTransport
 * TransportMeans1Choice.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#IndividualTransport
 * TransportMeans1.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#MultimodalTransport
 * TransportMeans1.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans2Choice#IndividualTransport
 * TransportMeans2Choice.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TransportMeans2Choice#MultimodalTransport
 * TransportMeans2Choice.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails1#RoutingSummary
 * TransportDetails1.RoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet2#TransportInformation
 * TransportDataSet2.TransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans2#IndividualTransport
 * TransportMeans2.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans2#MultimodalTransport
 * TransportMeans2.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails2#RoutingSummary
 * TransportDetails2.RoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet3#TransportInformation
 * TransportDataSet3.TransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet4#TransportInformation
 * TransportDataSet4.TransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails3#RoutingSummary
 * TransportDetails3.RoutingSummary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans4#IndividualTransport
 * TransportMeans4.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans4#MultimodalTransport
 * TransportMeans4.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#IndividualTransport
 * TransportMeans5.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans5#MultimodalTransport
 * TransportMeans5.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDataSet5#TransportInformation
 * TransportDataSet5.TransportInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#IndividualTransport
 * TransportMeans6.IndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#MultimodalTransport
 * TransportMeans6.MultimodalTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportDetails4#RoutingSummary
 * TransportDetails4.RoutingSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4#TransportMeans
 * Consignment4.TransportMeans}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByAir
 * TransportByAir}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportBySea
 * TransportBySea}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRoad
 * TransportByRoad}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TransportByRail
 * TransportByRail}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans3
 * TransportMeans3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2 Consignment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport1
 * SingleTransport1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport1
 * MultimodalTransport1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransportMeans1Choice
 * TransportMeans1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport4
 * SingleTransport4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport3
 * MultimodalTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans1
 * TransportMeans1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport2
 * SingleTransport2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MultimodalTransport2
 * MultimodalTransport2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TransportMeans2Choice
 * TransportMeans2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails1
 * TransportDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet2
 * TransportDataSet2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport5
 * SingleTransport5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans2
 * TransportMeans2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails2
 * TransportDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet3
 * TransportDataSet3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport3
 * SingleTransport3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet4
 * TransportDataSet4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails3
 * TransportDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans4
 * TransportMeans4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport6
 * SingleTransport6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport7
 * SingleTransport7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans5
 * TransportMeans5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDataSet5
 * TransportDataSet5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans6
 * TransportMeans6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport8
 * SingleTransport8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportDetails4
 * TransportDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4 Consignment4}</li>
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
 * "Transport"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Moving of goods or people from one place to another by vehicle."</li>
 * </ul>
 */
public class Transport {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the applicable Incoterm and associated location.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Incoterms#Transport
	 * Incoterms.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Incoterms Incoterms}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement6#Incoterms
	 * TradeAgreement6.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#Incoterms
	 * LineItem10.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails4#Incoterms
	 * LineItemDetails4.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#Incoterms
	 * LineItem5.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemDetails7#Incoterms
	 * LineItemDetails7.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#Incoterms
	 * LineItem7.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#Incoterms
	 * LineItem4.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#Incoterms
	 * TransportDetails1.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#Incoterms
	 * LineItem9.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#Incoterms
	 * TransportDetails2.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#Incoterms
	 * TransportDetails3.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#Incoterms
	 * LineItem11.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#Incoterms
	 * LineItemDetails10.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#Incoterms
	 * LineItem12.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#Incoterms
	 * LineItemDetails13.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#Incoterms
	 * LineItem13.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#Incoterms
	 * LineItem15.Incoterms}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#Incoterms
	 * TransportDetails4.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TradeAgreement13#Incoterms
	 * TradeAgreement13.Incoterms}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#Incoterms
	 * LineItem16.Incoterms}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incoterms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the applicable Incoterm and associated location."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Incoterms = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeAgreement6.Incoterms, com.tools20022.repository.msg.LineItem10.Incoterms, com.tools20022.repository.msg.LineItemDetails4.Incoterms,
					com.tools20022.repository.msg.LineItem5.Incoterms, com.tools20022.repository.msg.LineItemDetails7.Incoterms, com.tools20022.repository.msg.LineItem7.Incoterms, com.tools20022.repository.msg.LineItem4.Incoterms,
					com.tools20022.repository.msg.TransportDetails1.Incoterms, com.tools20022.repository.msg.LineItem9.Incoterms, com.tools20022.repository.msg.TransportDetails2.Incoterms,
					com.tools20022.repository.msg.TransportDetails3.Incoterms, com.tools20022.repository.msg.LineItem11.Incoterms, com.tools20022.repository.msg.LineItemDetails10.Incoterms,
					com.tools20022.repository.msg.LineItem12.Incoterms, com.tools20022.repository.msg.LineItemDetails13.Incoterms, com.tools20022.repository.msg.LineItem13.Incoterms, com.tools20022.repository.msg.LineItem15.Incoterms,
					com.tools20022.repository.msg.TransportDetails4.Incoterms, com.tools20022.repository.msg.TradeAgreement13.Incoterms, com.tools20022.repository.msg.LineItem16.Incoterms);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Incoterms";
			definition = "Specifies the applicable Incoterm and associated location.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Incoterms.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Incoterms.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Unique identification of the means of transport, such as the
	 * International Maritime Organization number of a vessel.
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
	 * {@linkplain com.tools20022.repository.msg.TransportMeans3#Identification
	 * TransportMeans3.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans3.Identification);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Unique identification of the means of transport, such as the International Maritime Organization number of a vessel.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Physical packaging of goods for transport.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Packaging#Transport
	 * Packaging.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Packaging Packaging}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem10#Packaging
	 * LineItem10.Packaging}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#Consignment
	 * TransportDetails2.Consignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#Consignment
	 * TransportDetails3.Consignment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#Consignment
	 * TransportDetails4.Consignment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem16#Packaging
	 * LineItem16.Packaging}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Packaging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Physical packaging of goods for transport."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Packaging = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.Packaging, com.tools20022.repository.msg.TransportDetails2.Consignment, com.tools20022.repository.msg.TransportDetails3.Consignment,
					com.tools20022.repository.msg.TransportDetails4.Consignment, com.tools20022.repository.msg.LineItem16.Packaging);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Packaging";
			definition = "Physical packaging of goods for transport.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Packaging.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Packaging.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time when the goods reach their destination..
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#DeliveryDateTime
	 * LineItem10.DeliveryDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#DeliveryDateTime
	 * LineItem16.DeliveryDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrivalDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time when the goods reach their destination.."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ArrivalDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.DeliveryDateTime, com.tools20022.repository.msg.LineItem16.DeliveryDateTime);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ArrivalDateTime";
			definition = "Date and time when the goods reach their destination..";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Indicates whether or not partial shipments are allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#PartialShipment
	 * LineItem5.PartialShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#PartialShipment
	 * LineItem7.PartialShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#PartialShipment
	 * LineItem11.PartialShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#PartialShipment
	 * LineItem13.PartialShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not partial shipments are allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PartialShipment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.PartialShipment, com.tools20022.repository.msg.LineItem7.PartialShipment, com.tools20022.repository.msg.LineItem11.PartialShipment,
					com.tools20022.repository.msg.LineItem13.PartialShipment);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartialShipment";
			definition = "Indicates whether or not partial shipments are allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Indicates whether or not transshipment of goods is allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#TransShipment
	 * LineItem5.TransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#TransShipment
	 * LineItem7.TransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#TransShipment
	 * LineItem11.TransShipment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#TransShipment
	 * LineItem13.TransShipment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransShipment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not transshipment of goods is allowed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransShipment = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem5.TransShipment, com.tools20022.repository.msg.LineItem7.TransShipment, com.tools20022.repository.msg.LineItem11.TransShipment,
					com.tools20022.repository.msg.LineItem13.TransShipment);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransShipment";
			definition = "Indicates whether or not transshipment of goods is allowed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the delivery parameters of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ProductDelivery#Routing
	 * ProductDelivery.Routing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ProductDelivery
	 * ProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the delivery parameters of a trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProductDelivery = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProductDelivery";
			definition = "Specifies the delivery parameters of a trade.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ProductDelivery.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ProductDelivery.Routing;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place from where the goods must leave.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DepartureTransportParameters
	 * Location.DepartureTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir1#DepartureAirport
	 * TransportByAir1.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea1#PortOfLoading
	 * TransportBySea1.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad1#PlaceOfReceipt
	 * TransportByRoad1.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail1#PlaceOfReceipt
	 * TransportByRail1.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#DepartureAirport
	 * MultimodalTransport1.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#PortOfLoading
	 * MultimodalTransport1.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#PlaceOfReceipt
	 * MultimodalTransport1.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#TakingInCharge
	 * MultimodalTransport1.TakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#DepartureAirport
	 * TransportByAir3.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea3#PortOfLoading
	 * TransportBySea3.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#PlaceOfReceipt
	 * TransportByRoad3.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#TakingInCharge
	 * MultimodalTransport3.TakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#DepartureAirport
	 * TransportByAir2.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2#PortOfLoading
	 * TransportBySea2.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#PlaceOfReceipt
	 * TransportByRoad2.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#PlaceOfReceipt
	 * TransportByRail2.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#DepartureAirport
	 * MultimodalTransport2.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#PortOfLoading
	 * MultimodalTransport2.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#PlaceOfReceipt
	 * MultimodalTransport2.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#TakingInCharge
	 * MultimodalTransport2.TakingInCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#PortOfLoading
	 * TransportBySea4.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#PlaceOfReceipt
	 * TransportByRail4.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#DepartureAirport
	 * TransportByAir4.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#PlaceOfReceipt
	 * TransportByRoad4.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#PortOfLoading
	 * TransportBySea5.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#DepartureAirport
	 * TransportByAir5.DepartureAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#PortOfLoading
	 * TransportBySea6.PortOfLoading}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#PlaceOfReceipt
	 * TransportByRail5.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#PlaceOfReceipt
	 * TransportByRoad5.PlaceOfReceipt}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDeparture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from where the goods must leave."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfDeparture = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir1.DepartureAirport, com.tools20022.repository.msg.TransportBySea1.PortOfLoading, com.tools20022.repository.msg.TransportByRoad1.PlaceOfReceipt,
					com.tools20022.repository.msg.TransportByRail1.PlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport1.DepartureAirport, com.tools20022.repository.msg.MultimodalTransport1.PortOfLoading,
					com.tools20022.repository.msg.MultimodalTransport1.PlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport1.TakingInCharge, com.tools20022.repository.msg.TransportByAir3.DepartureAirport,
					com.tools20022.repository.msg.TransportBySea3.PortOfLoading, com.tools20022.repository.msg.TransportByRoad3.PlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport3.TakingInCharge,
					com.tools20022.repository.msg.TransportByAir2.DepartureAirport, com.tools20022.repository.msg.TransportBySea2.PortOfLoading, com.tools20022.repository.msg.TransportByRoad2.PlaceOfReceipt,
					com.tools20022.repository.msg.TransportByRail2.PlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport2.DepartureAirport, com.tools20022.repository.msg.MultimodalTransport2.PortOfLoading,
					com.tools20022.repository.msg.MultimodalTransport2.PlaceOfReceipt, com.tools20022.repository.msg.MultimodalTransport2.TakingInCharge, com.tools20022.repository.msg.TransportBySea4.PortOfLoading,
					com.tools20022.repository.msg.TransportByRail4.PlaceOfReceipt, com.tools20022.repository.msg.TransportByAir4.DepartureAirport, com.tools20022.repository.msg.TransportByRoad4.PlaceOfReceipt,
					com.tools20022.repository.msg.TransportBySea5.PortOfLoading, com.tools20022.repository.msg.TransportByAir5.DepartureAirport, com.tools20022.repository.msg.TransportBySea6.PortOfLoading,
					com.tools20022.repository.msg.TransportByRail5.PlaceOfReceipt, com.tools20022.repository.msg.TransportByRoad5.PlaceOfReceipt);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDeparture";
			definition = "Place from where the goods must leave.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DepartureTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place where the goods must arrive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#DestinationTransportParameters
	 * Location.DestinationTransportParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir1#DestinationAirport
	 * TransportByAir1.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea1#PortOfDischarge
	 * TransportBySea1.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad1#PlaceOfDelivery
	 * TransportByRoad1.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail1#PlaceOfDelivery
	 * TransportByRail1.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#DestinationAirport
	 * MultimodalTransport1.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#PortOfDischarge
	 * MultimodalTransport1.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#PlaceOfDelivery
	 * MultimodalTransport1.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport1#PlaceOfFinalDestination
	 * MultimodalTransport1.PlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir3#DestinationAirport
	 * TransportByAir3.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea3#PortOfDischarge
	 * TransportBySea3.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad3#PlaceOfDelivery
	 * TransportByRoad3.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#PlaceOfReceipt
	 * TransportByRail3.PlaceOfReceipt}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail3#PlaceOfDelivery
	 * TransportByRail3.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport3#PlaceOfFinalDestination
	 * MultimodalTransport3.PlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir2#DestinationAirport
	 * TransportByAir2.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2#PortOfDischarge
	 * TransportBySea2.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad2#PlaceOfDelivery
	 * TransportByRoad2.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail2#PlaceOfDelivery
	 * TransportByRail2.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#DestinationAirport
	 * MultimodalTransport2.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#PortOfDischarge
	 * MultimodalTransport2.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#PlaceOfDelivery
	 * MultimodalTransport2.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MultimodalTransport2#PlaceOfFinalDestination
	 * MultimodalTransport2.PlaceOfFinalDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#PortOfDischarge
	 * TransportBySea4.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail4#PlaceOfDelivery
	 * TransportByRail4.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir4#DestinationAirport
	 * TransportByAir4.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad4#PlaceOfDelivery
	 * TransportByRoad4.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#PortOfDischarge
	 * TransportBySea5.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByAir5#DestinationAirport
	 * TransportByAir5.DestinationAirport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#PortOfDischarge
	 * TransportBySea6.PortOfDischarge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRail5#PlaceOfDelivery
	 * TransportByRail5.PlaceOfDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportByRoad5#PlaceOfDelivery
	 * TransportByRoad5.PlaceOfDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where the goods must arrive."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PlaceOfDestination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportByAir1.DestinationAirport, com.tools20022.repository.msg.TransportBySea1.PortOfDischarge,
					com.tools20022.repository.msg.TransportByRoad1.PlaceOfDelivery, com.tools20022.repository.msg.TransportByRail1.PlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport1.DestinationAirport,
					com.tools20022.repository.msg.MultimodalTransport1.PortOfDischarge, com.tools20022.repository.msg.MultimodalTransport1.PlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport1.PlaceOfFinalDestination,
					com.tools20022.repository.msg.TransportByAir3.DestinationAirport, com.tools20022.repository.msg.TransportBySea3.PortOfDischarge, com.tools20022.repository.msg.TransportByRoad3.PlaceOfDelivery,
					com.tools20022.repository.msg.TransportByRail3.PlaceOfReceipt, com.tools20022.repository.msg.TransportByRail3.PlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport3.PlaceOfFinalDestination,
					com.tools20022.repository.msg.TransportByAir2.DestinationAirport, com.tools20022.repository.msg.TransportBySea2.PortOfDischarge, com.tools20022.repository.msg.TransportByRoad2.PlaceOfDelivery,
					com.tools20022.repository.msg.TransportByRail2.PlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport2.DestinationAirport, com.tools20022.repository.msg.MultimodalTransport2.PortOfDischarge,
					com.tools20022.repository.msg.MultimodalTransport2.PlaceOfDelivery, com.tools20022.repository.msg.MultimodalTransport2.PlaceOfFinalDestination, com.tools20022.repository.msg.TransportBySea4.PortOfDischarge,
					com.tools20022.repository.msg.TransportByRail4.PlaceOfDelivery, com.tools20022.repository.msg.TransportByAir4.DestinationAirport, com.tools20022.repository.msg.TransportByRoad4.PlaceOfDelivery,
					com.tools20022.repository.msg.TransportBySea5.PortOfDischarge, com.tools20022.repository.msg.TransportByAir5.DestinationAirport, com.tools20022.repository.msg.TransportBySea6.PortOfDischarge,
					com.tools20022.repository.msg.TransportByRail5.PlaceOfDelivery, com.tools20022.repository.msg.TransportByRoad5.PlaceOfDelivery);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PlaceOfDestination";
			definition = "Place where the goods must arrive.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.DestinationTransportParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Charges related to the conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Charges#Transport
	 * Charges.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#FreightCharges
	 * LineItemDetails4.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#FreightCharges
	 * LineItem5.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#FreightCharges
	 * LineItemDetails7.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#FreightCharges
	 * LineItem7.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#FreightCharges
	 * LineItemDetails6.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#FreightCharges
	 * LineItem4.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#FreightCharges
	 * TransportDetails1.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#FreightCharges
	 * LineItemDetails9.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#FreightCharges
	 * LineItem9.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#FreightCharges
	 * TransportDetails2.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#FreightCharges
	 * TransportDetails3.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#FreightCharges
	 * LineItem11.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#FreightCharges
	 * LineItemDetails10.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#FreightCharges
	 * LineItem12.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#FreightCharges
	 * LineItemDetails11.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#FreightCharges
	 * LineItemDetails13.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#FreightCharges
	 * LineItem13.FreightCharges}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#FreightCharges
	 * LineItem15.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#FreightCharges
	 * LineItemDetails14.FreightCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#FreightCharges
	 * TransportDetails4.FreightCharges}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges related to the conveyance of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportCharges = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails4.FreightCharges, com.tools20022.repository.msg.LineItem5.FreightCharges, com.tools20022.repository.msg.LineItemDetails7.FreightCharges,
					com.tools20022.repository.msg.LineItem7.FreightCharges, com.tools20022.repository.msg.LineItemDetails6.FreightCharges, com.tools20022.repository.msg.LineItem4.FreightCharges,
					com.tools20022.repository.msg.TransportDetails1.FreightCharges, com.tools20022.repository.msg.LineItemDetails9.FreightCharges, com.tools20022.repository.msg.LineItem9.FreightCharges,
					com.tools20022.repository.msg.TransportDetails2.FreightCharges, com.tools20022.repository.msg.TransportDetails3.FreightCharges, com.tools20022.repository.msg.LineItem11.FreightCharges,
					com.tools20022.repository.msg.LineItemDetails10.FreightCharges, com.tools20022.repository.msg.LineItem12.FreightCharges, com.tools20022.repository.msg.LineItemDetails11.FreightCharges,
					com.tools20022.repository.msg.LineItemDetails13.FreightCharges, com.tools20022.repository.msg.LineItem13.FreightCharges, com.tools20022.repository.msg.LineItem15.FreightCharges,
					com.tools20022.repository.msg.LineItemDetails14.FreightCharges, com.tools20022.repository.msg.TransportDetails4.FreightCharges);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportCharges";
			definition = "Charges related to the conveyance of goods.";
			minOccurs = 0;
			type_lazy = () -> Charges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Charges.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identifies whether the freight charges associated with the items are
	 * "prepaid" or "collect".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FreightChargesCode
	 * FreightChargesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge12#Type
	 * Charge12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge13#Type
	 * Charge13.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge24#Type
	 * Charge24.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Charge25#Type
	 * Charge25.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FreightChargesPrepaidOrCollect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FreightChargesPrepaidOrCollect = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Charge12.Type, com.tools20022.repository.msg.Charge13.Type, com.tools20022.repository.msg.Charge24.Type, com.tools20022.repository.msg.Charge25.Type);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FreightChargesPrepaidOrCollect";
			definition = "Identifies whether the freight charges associated with the items are \"prepaid\" or \"collect\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FreightChargesCode.mmObject();
		}
	};
	/**
	 * Specifies the shipment date, the earliest shipment date and the latest
	 * shipment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ShipmentDateRange#RelatedTransport
	 * ShipmentDateRange.RelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ShipmentDateRange
	 * ShipmentDateRange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#ShipmentSchedule
	 * LineItemDetails7.ShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem7#ShipmentDateRange
	 * LineItem7.ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#ShipmentDate
	 * TransportDetails3.ShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem11#ShipmentDateRange
	 * LineItem11.ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#ShipmentSchedule
	 * LineItemDetails10.ShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#ShipmentSchedule
	 * LineItemDetails13.ShipmentSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem13#ShipmentDateRange
	 * LineItem13.ShipmentDateRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#ShipmentDate
	 * TransportDetails4.ShipmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SupportingDocumentEntry1#ShipmentAttributes
	 * SupportingDocumentEntry1.ShipmentAttributes}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeContract1#ShipmentSchedule
	 * TradeContract1.ShipmentSchedule}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShipmentDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the shipment date, the earliest shipment date and the latest shipment date."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ShipmentDates = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails7.ShipmentSchedule, com.tools20022.repository.msg.LineItem7.ShipmentDateRange, com.tools20022.repository.msg.TransportDetails3.ShipmentDate,
					com.tools20022.repository.msg.LineItem11.ShipmentDateRange, com.tools20022.repository.msg.LineItemDetails10.ShipmentSchedule, com.tools20022.repository.msg.LineItemDetails13.ShipmentSchedule,
					com.tools20022.repository.msg.LineItem13.ShipmentDateRange, com.tools20022.repository.msg.TransportDetails4.ShipmentDate, com.tools20022.repository.msg.SupportingDocumentEntry1.ShipmentAttributes,
					com.tools20022.repository.msg.TradeContract1.ShipmentSchedule);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ShipmentDates";
			definition = "Specifies the shipment date, the earliest shipment date and the latest shipment date.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ShipmentDateRange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Goods that are transported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Goods#Transport
	 * Goods.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Goods Goods}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails1#TransportedGoods
	 * TransportDetails1.TransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails2#TransportedGoods
	 * TransportDetails2.TransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails3#TransportedGoods
	 * TransportDetails3.TransportedGoods}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportDetails4#TransportedGoods
	 * TransportDetails4.TransportedGoods}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportedGoods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Goods that are transported."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportedGoods = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportDetails1.TransportedGoods, com.tools20022.repository.msg.TransportDetails2.TransportedGoods,
					com.tools20022.repository.msg.TransportDetails3.TransportedGoods, com.tools20022.repository.msg.TransportDetails4.TransportedGoods);
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportedGoods";
			definition = "Goods that are transported.";
			minOccurs = 1;
			type_lazy = () -> Goods.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Goods.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies each role linked to the transport of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransportPartyRole#Transport
	 * TransportPartyRole.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TransportPartyRole
	 * TransportPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to the transport of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to the transport of goods.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> TransportPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransportPartyRole.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Place through which the goods are transiting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#RelatedTransport
	 * Location.RelatedTransport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransitLocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place through which the goods are transiting."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransitLocation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransitLocation";
			definition = "Place through which the goods are transiting.";
			minOccurs = 0;
			type_lazy = () -> Location.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Location.RelatedTransport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Documents which may be required in relation with the transportation of
	 * goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#Transport
	 * Document.Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Transport
	 * Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportDocuments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Documents which may be required in relation with the transportation of goods."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TransportDocuments = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Transport.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransportDocuments";
			definition = "Documents which may be required in relation with the transportation of goods.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Transport;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Transport";
				definition = "Moving of goods or people from one place to another by vehicle.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Location.DepartureTransportParameters, com.tools20022.repository.entity.Location.DestinationTransportParameters,
						com.tools20022.repository.entity.Location.RelatedTransport, com.tools20022.repository.entity.Document.Transport, com.tools20022.repository.entity.Charges.Transport,
						com.tools20022.repository.entity.Incoterms.Transport, com.tools20022.repository.entity.Goods.Transport, com.tools20022.repository.entity.ProductDelivery.Routing, com.tools20022.repository.entity.Packaging.Transport,
						com.tools20022.repository.entity.TransportPartyRole.Transport, com.tools20022.repository.entity.ShipmentDateRange.RelatedTransport);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans3.ModeCode, com.tools20022.repository.msg.Consignment2.TransportMeans,
						com.tools20022.repository.choice.TransportMeans1Choice.IndividualTransport, com.tools20022.repository.choice.TransportMeans1Choice.MultimodalTransport,
						com.tools20022.repository.msg.TransportMeans1.IndividualTransport, com.tools20022.repository.msg.TransportMeans1.MultimodalTransport, com.tools20022.repository.choice.TransportMeans2Choice.IndividualTransport,
						com.tools20022.repository.choice.TransportMeans2Choice.MultimodalTransport, com.tools20022.repository.msg.TransportDetails1.RoutingSummary, com.tools20022.repository.msg.TransportDataSet2.TransportInformation,
						com.tools20022.repository.msg.TransportMeans2.IndividualTransport, com.tools20022.repository.msg.TransportMeans2.MultimodalTransport, com.tools20022.repository.msg.TransportDetails2.RoutingSummary,
						com.tools20022.repository.msg.TransportDataSet3.TransportInformation, com.tools20022.repository.msg.TransportDataSet4.TransportInformation, com.tools20022.repository.msg.TransportDetails3.RoutingSummary,
						com.tools20022.repository.msg.TransportMeans4.IndividualTransport, com.tools20022.repository.msg.TransportMeans4.MultimodalTransport, com.tools20022.repository.msg.TransportMeans5.IndividualTransport,
						com.tools20022.repository.msg.TransportMeans5.MultimodalTransport, com.tools20022.repository.msg.TransportDataSet5.TransportInformation, com.tools20022.repository.msg.TransportMeans6.IndividualTransport,
						com.tools20022.repository.msg.TransportMeans6.MultimodalTransport, com.tools20022.repository.msg.TransportDetails4.RoutingSummary, com.tools20022.repository.msg.Consignment4.TransportMeans);
				subType_lazy = () -> Arrays.asList(TransportByAir.mmObject(), TransportBySea.mmObject(), TransportByRoad.mmObject(), TransportByRail.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Transport.Incoterms, com.tools20022.repository.entity.Transport.Identification, com.tools20022.repository.entity.Transport.Packaging,
						com.tools20022.repository.entity.Transport.ArrivalDateTime, com.tools20022.repository.entity.Transport.PartialShipment, com.tools20022.repository.entity.Transport.TransShipment,
						com.tools20022.repository.entity.Transport.ProductDelivery, com.tools20022.repository.entity.Transport.PlaceOfDeparture, com.tools20022.repository.entity.Transport.PlaceOfDestination,
						com.tools20022.repository.entity.Transport.TransportCharges, com.tools20022.repository.entity.Transport.FreightChargesPrepaidOrCollect, com.tools20022.repository.entity.Transport.ShipmentDates,
						com.tools20022.repository.entity.Transport.TransportedGoods, com.tools20022.repository.entity.Transport.PartyRole, com.tools20022.repository.entity.Transport.TransitLocation,
						com.tools20022.repository.entity.Transport.TransportDocuments);
				derivationComponent_lazy = () -> Arrays.asList(TransportMeans3.mmObject(), Consignment2.mmObject(), SingleTransport1.mmObject(), MultimodalTransport1.mmObject(), TransportMeans1Choice.mmObject(),
						SingleTransport4.mmObject(), MultimodalTransport3.mmObject(), TransportMeans1.mmObject(), SingleTransport2.mmObject(), MultimodalTransport2.mmObject(), TransportMeans2Choice.mmObject(), TransportDetails1.mmObject(),
						TransportDataSet2.mmObject(), SingleTransport5.mmObject(), TransportMeans2.mmObject(), TransportDetails2.mmObject(), TransportDataSet3.mmObject(), SingleTransport3.mmObject(), TransportDataSet4.mmObject(),
						TransportDetails3.mmObject(), TransportMeans4.mmObject(), SingleTransport6.mmObject(), SingleTransport7.mmObject(), TransportMeans5.mmObject(), TransportDataSet5.mmObject(), TransportMeans6.mmObject(),
						SingleTransport8.mmObject(), TransportDetails4.mmObject(), Consignment4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}