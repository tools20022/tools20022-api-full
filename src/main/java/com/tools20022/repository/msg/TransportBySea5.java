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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact7NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.TransportBySea;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information related for the transportation of goods by sea.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfLoading
 * TransportBySea5.mmPortOfLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfDischarge
 * TransportBySea5.mmPortOfDischarge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#mmVesselName
 * TransportBySea5.mmVesselName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmSeaCarrierName
 * TransportBySea5.mmSeaCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmSeaCarrierCountry
 * TransportBySea5.mmSeaCarrierCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentName
 * TransportBySea5.mmCarrierAgentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentCountry
 * TransportBySea5.mmCarrierAgentCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#mmMasterName
 * TransportBySea5.mmMasterName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmChartererName
 * TransportBySea5.mmChartererName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#mmOwnerName
 * TransportBySea5.mmOwnerName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#mmIMONumber
 * TransportBySea5.mmIMONumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea5#mmVoyageNumber
 * TransportBySea5.mmVoyageNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TransportBySea
 * TransportBySea}</li>
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
 * "TransportBySea5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related for the transportation of goods by sea."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea6
 * TransportBySea6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TransportBySea4
 * TransportBySea4}</li>
 * </ul>
 */
public class TransportBySea5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text portOfLoading;
	/**
	 * Identifies the port where the goods are loaded on board the ship.
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
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDeparture
	 * Transport.mmPlaceOfDeparture}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfLoading
	 * TransportBySea6.mmPortOfLoading}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfLoading
	 * TransportBySea4.mmPortOfLoading}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfLoading = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmPortOfLoading);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea4.mmPortOfLoading;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text portOfDischarge;
	/**
	 * Identifies the port where the goods are discharged.
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
	 * {@linkplain com.tools20022.repository.entity.Transport#mmPlaceOfDestination
	 * Transport.mmPlaceOfDestination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfDischarge
	 * TransportBySea6.mmPortOfDischarge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmPortOfDischarge
	 * TransportBySea4.mmPortOfDischarge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfDischarge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmPortOfDischarge);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea4.mmPortOfDischarge;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max70Text vesselName;
	/**
	 * Name of a vessel.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmVesselName
	 * TransportBySea.mmVesselName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmVesselName
	 * TransportBySea4.mmVesselName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVesselName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmVesselName;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "VsslNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea4.mmVesselName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text seaCarrierName;
	/**
	 * Identifies the party that is responsible for the conveyance of the goods
	 * from one place to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeaCrrierNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeaCarrierName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for the conveyance of the goods from one place to another."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierName
	 * TransportBySea6.mmSeaCarrierName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea4#mmSeaCarrierName
	 * TransportBySea4.mmSeaCarrierName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeaCarrierName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmSeaCarrierName);
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea4.mmSeaCarrierName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode seaCarrierCountry;
	/**
	 * Country in which the carrier of the goods, for example, shipping company,
	 * is located or registered.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SeaCrrierCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeaCarrierCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country in which the carrier of the goods, for example, shipping company, is located or registered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierCountry
	 * TransportBySea6.mmSeaCarrierCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeaCarrierCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierCountry";
			definition = "Country in which the carrier of the goods, for example, shipping company, is located or registered.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmSeaCarrierCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max70Text carrierAgentName;
	/**
	 * Name of the carrier's (for example, shipping company's) agent that acts
	 * on behalf of the carrier and may be the issuer of transport documents
	 * relating to the underlying shipment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentName
	 * TransportBySea6.mmCarrierAgentName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.mmName;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentName";
			definition = "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmCarrierAgentName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CountryCode carrierAgentCountry;
	/**
	 * Country of registration of the carrier's (for example, shipping
	 * company's) agent that acts on behalf of the carrier and may be the issuer
	 * of transport documents relating to the underlying shipment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentCountry
	 * TransportBySea6.mmCarrierAgentCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentCountry";
			definition = "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmCarrierAgentCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected Max70Text masterName;
	/**
	 * Name of the master or captain of a vessel that signs the document for
	 * example, bill of lading, charter party bill of lading, non-negotiable sea
	 * waybill or multimodal transport document that evidences shipment of the
	 * goods from a port of loading to a port of discharge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmMasterName
	 * TransportBySea.mmMasterName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the master or captain of a vessel that signs the document for example, bill of lading, charter party bill of lading, non-negotiable sea waybill or multimodal transport document that evidences shipment of the goods from a port of loading to a port of discharge. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmMasterName;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "MstrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterName";
			definition = "Name of the master or captain of a vessel that signs the document for example, bill of lading, charter party bill of lading, non-negotiable sea waybill or multimodal transport document that evidences shipment of the goods from a port of loading to a port of discharge. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text chartererName;
	/**
	 * Name of the company or individual that signs a charter party bill of
	 * lading that evidences shipment of the goods from a port of loading to a
	 * port of discharge and acts in the capacity of charterer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmChartererName
	 * TransportBySea.mmChartererName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrtrrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChartererName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of charterer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChartererName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmChartererName;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "ChrtrrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChartererName";
			definition = "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of charterer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max70Text ownerName;
	/**
	 * Name of the company or individual that signs a charter party bill of
	 * lading that evidences shipment of the goods from a port of loading to a
	 * port of discharge and acts in the capacity of owner;
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmOwnerName
	 * TransportBySea.mmOwnerName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of owner;"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnerName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmOwnerName;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "OwnrNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerName";
			definition = "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of owner;";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Exact7NumericText iMONumber;
	/**
	 * International Maritime Organisation identification of a ship. The IMO
	 * identification number scheme was introduced in 1987 as a measure aimed at
	 * enhancing maritime safety and pollution prevention and to facilitate the
	 * prevention of maritime fraud. It assigns a permanent number to each
	 * vessel for identification purposes. This number remains unchanged upon
	 * transfer of the vessel to other flag(s) and is inserted in all vessel
	 * certificates. The IMO identification number is made up of the three
	 * letters "IMO" followed by a seven-digit number assigned to all vessels by
	 * IHS FairPlay (formerly known as Lloyd's Register-Fairplay). This is a
	 * unique seven digit number that is assigned to vessels and aids banks in
	 * determining whether a vessel is subject to an order that would not permit
	 * a bank to handle a certain transaction under local or international laws.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact7NumericText
	 * Exact7NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmIMONumber
	 * TransportBySea.mmIMONumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IMONb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IMONumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Maritime Organisation identification of a ship. The IMO identification number scheme was introduced in 1987 as a measure aimed at enhancing maritime safety and pollution prevention and to facilitate the prevention of maritime fraud. It assigns a permanent number to each vessel for identification purposes. This number remains unchanged upon transfer of the vessel to other flag(s) and is inserted in all vessel certificates. The IMO identification number is made up of the three letters \"IMO\" followed by a seven-digit number assigned to all vessels by IHS FairPlay (formerly known as Lloyd's Register-Fairplay). This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIMONumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmIMONumber;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "IMONb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMONumber";
			definition = "International Maritime Organisation identification of a ship. The IMO identification number scheme was introduced in 1987 as a measure aimed at enhancing maritime safety and pollution prevention and to facilitate the prevention of maritime fraud. It assigns a permanent number to each vessel for identification purposes. This number remains unchanged upon transfer of the vessel to other flag(s) and is inserted in all vessel certificates. The IMO identification number is made up of the three letters \"IMO\" followed by a seven-digit number assigned to all vessels by IHS FairPlay (formerly known as Lloyd's Register-Fairplay). This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact7NumericText.mmObject();
		}
	};
	protected Max35Text voyageNumber;
	/**
	 * Identifies the voyage by sea.
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
	 * {@linkplain com.tools20022.repository.entity.TransportBySea#mmVoyageNumber
	 * TransportBySea.mmVoyageNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VygNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoyageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the voyage by sea."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVoyageNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmVoyageNumber;
			componentContext_lazy = () -> TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "VygNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoyageNumber";
			definition = "Identifies the voyage by sea.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea5.mmPortOfLoading, com.tools20022.repository.msg.TransportBySea5.mmPortOfDischarge,
						com.tools20022.repository.msg.TransportBySea5.mmVesselName, com.tools20022.repository.msg.TransportBySea5.mmSeaCarrierName, com.tools20022.repository.msg.TransportBySea5.mmSeaCarrierCountry,
						com.tools20022.repository.msg.TransportBySea5.mmCarrierAgentName, com.tools20022.repository.msg.TransportBySea5.mmCarrierAgentCountry, com.tools20022.repository.msg.TransportBySea5.mmMasterName,
						com.tools20022.repository.msg.TransportBySea5.mmChartererName, com.tools20022.repository.msg.TransportBySea5.mmOwnerName, com.tools20022.repository.msg.TransportBySea5.mmIMONumber,
						com.tools20022.repository.msg.TransportBySea5.mmVoyageNumber);
				trace_lazy = () -> TransportBySea.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransportBySea5";
				definition = "Information related for the transportation of goods by sea.";
				nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmObject());
				previousVersion_lazy = () -> TransportBySea4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPortOfLoading() {
		return portOfLoading;
	}

	public void setPortOfLoading(Max35Text portOfLoading) {
		this.portOfLoading = portOfLoading;
	}

	public Max35Text getPortOfDischarge() {
		return portOfDischarge;
	}

	public void setPortOfDischarge(Max35Text portOfDischarge) {
		this.portOfDischarge = portOfDischarge;
	}

	public Max70Text getVesselName() {
		return vesselName;
	}

	public void setVesselName(Max70Text vesselName) {
		this.vesselName = vesselName;
	}

	public Max70Text getSeaCarrierName() {
		return seaCarrierName;
	}

	public void setSeaCarrierName(Max70Text seaCarrierName) {
		this.seaCarrierName = seaCarrierName;
	}

	public CountryCode getSeaCarrierCountry() {
		return seaCarrierCountry;
	}

	public void setSeaCarrierCountry(CountryCode seaCarrierCountry) {
		this.seaCarrierCountry = seaCarrierCountry;
	}

	public Max70Text getCarrierAgentName() {
		return carrierAgentName;
	}

	public void setCarrierAgentName(Max70Text carrierAgentName) {
		this.carrierAgentName = carrierAgentName;
	}

	public CountryCode getCarrierAgentCountry() {
		return carrierAgentCountry;
	}

	public void setCarrierAgentCountry(CountryCode carrierAgentCountry) {
		this.carrierAgentCountry = carrierAgentCountry;
	}

	public Max70Text getMasterName() {
		return masterName;
	}

	public void setMasterName(Max70Text masterName) {
		this.masterName = masterName;
	}

	public Max70Text getChartererName() {
		return chartererName;
	}

	public void setChartererName(Max70Text chartererName) {
		this.chartererName = chartererName;
	}

	public Max70Text getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(Max70Text ownerName) {
		this.ownerName = ownerName;
	}

	public Exact7NumericText getIMONumber() {
		return iMONumber;
	}

	public void setIMONumber(Exact7NumericText iMONumber) {
		this.iMONumber = iMONumber;
	}

	public Max35Text getVoyageNumber() {
		return voyageNumber;
	}

	public void setVoyageNumber(Max35Text voyageNumber) {
		this.voyageNumber = voyageNumber;
	}
}