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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Exact7NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.Country;
import com.tools20022.repository.entity.PartyName;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.entity.TransportBySea;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportBySea5", propOrder = {"portOfLoading", "portOfDischarge", "vesselName", "seaCarrierName", "seaCarrierCountry", "carrierAgentName", "carrierAgentCountry", "masterName", "chartererName", "ownerName", "iMONumber",
		"voyageNumber"})
public class TransportBySea5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PortOfLoadng", required = true)
	protected Max35Text portOfLoading;
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
	public static final MMMessageAttribute<TransportBySea5, Max35Text> mmPortOfLoading = new MMMessageAttribute<TransportBySea5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmPortOfLoading);
			previousVersion_lazy = () -> TransportBySea4.mmPortOfLoading;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransportBySea5 obj) {
			return obj.getPortOfLoading();
		}

		@Override
		public void setValue(TransportBySea5 obj, Max35Text value) {
			obj.setPortOfLoading(value);
		}
	};
	@XmlElement(name = "PortOfDschrge", required = true)
	protected Max35Text portOfDischarge;
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
	public static final MMMessageAttribute<TransportBySea5, Max35Text> mmPortOfDischarge = new MMMessageAttribute<TransportBySea5, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmPortOfDischarge);
			previousVersion_lazy = () -> TransportBySea4.mmPortOfDischarge;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransportBySea5 obj) {
			return obj.getPortOfDischarge();
		}

		@Override
		public void setValue(TransportBySea5 obj, Max35Text value) {
			obj.setPortOfDischarge(value);
		}
	};
	@XmlElement(name = "VsslNm")
	protected Max70Text vesselName;
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmVesselName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmVesselName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "VsslNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			previousVersion_lazy = () -> TransportBySea4.mmVesselName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getVesselName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setVesselName(value.orElse(null));
		}
	};
	@XmlElement(name = "SeaCrrierNm")
	protected Max70Text seaCarrierName;
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmSeaCarrierName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmSeaCarrierName);
			previousVersion_lazy = () -> TransportBySea4.mmSeaCarrierName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getSeaCarrierName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setSeaCarrierName(value.orElse(null));
		}
	};
	@XmlElement(name = "SeaCrrierCtry")
	protected CountryCode seaCarrierCountry;
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
	public static final MMMessageAttribute<TransportBySea5, Optional<CountryCode>> mmSeaCarrierCountry = new MMMessageAttribute<TransportBySea5, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierCountry";
			definition = "Country in which the carrier of the goods, for example, shipping company, is located or registered.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmSeaCarrierCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(TransportBySea5 obj) {
			return obj.getSeaCarrierCountry();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<CountryCode> value) {
			obj.setSeaCarrierCountry(value.orElse(null));
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmCarrierAgentName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentName";
			definition = "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmCarrierAgentName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getCarrierAgentName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setCarrierAgentName(value.orElse(null));
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
	public static final MMMessageAttribute<TransportBySea5, Optional<CountryCode>> mmCarrierAgentCountry = new MMMessageAttribute<TransportBySea5, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentCountry";
			definition = "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			nextVersions_lazy = () -> Arrays.asList(TransportBySea6.mmCarrierAgentCountry);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(TransportBySea5 obj) {
			return obj.getCarrierAgentCountry();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<CountryCode> value) {
			obj.setCarrierAgentCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "MstrNm")
	protected Max70Text masterName;
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
	 * "Name of the master or captain of a vessel that signs the document for example, bill of lading, charter party bill of lading, non-negotiable sea waybill or multimodal transport document that evidences shipment of the goods from a port of loading to a port of discharge."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmMasterName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmMasterName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "MstrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterName";
			definition = "Name of the master or captain of a vessel that signs the document for example, bill of lading, charter party bill of lading, non-negotiable sea waybill or multimodal transport document that evidences shipment of the goods from a port of loading to a port of discharge.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getMasterName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setMasterName(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrtrrNm")
	protected Max70Text chartererName;
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmChartererName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmChartererName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "ChrtrrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChartererName";
			definition = "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of charterer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getChartererName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setChartererName(value.orElse(null));
		}
	};
	@XmlElement(name = "OwnrNm")
	protected Max70Text ownerName;
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
	 * "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of owner;."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TransportBySea5, Optional<Max70Text>> mmOwnerName = new MMMessageAttribute<TransportBySea5, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmOwnerName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "OwnrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerName";
			definition = "Name of the company or individual that signs a charter party bill of lading that evidences shipment of the goods from a port of loading to a port of discharge and acts in the capacity of owner;.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(TransportBySea5 obj) {
			return obj.getOwnerName();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max70Text> value) {
			obj.setOwnerName(value.orElse(null));
		}
	};
	@XmlElement(name = "IMONb")
	protected Exact7NumericText iMONumber;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Exact7NumericText>> mmIMONumber = new MMMessageAttribute<TransportBySea5, Optional<Exact7NumericText>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmIMONumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "IMONb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IMONumber";
			definition = "International Maritime Organisation identification of a ship. The IMO identification number scheme was introduced in 1987 as a measure aimed at enhancing maritime safety and pollution prevention and to facilitate the prevention of maritime fraud. It assigns a permanent number to each vessel for identification purposes. This number remains unchanged upon transfer of the vessel to other flag(s) and is inserted in all vessel certificates. The IMO identification number is made up of the three letters \"IMO\" followed by a seven-digit number assigned to all vessels by IHS FairPlay (formerly known as Lloyd's Register-Fairplay). This is a unique seven digit number that is assigned to vessels and aids banks in determining whether a vessel is subject to an order that would not permit a bank to handle a certain transaction under local or international laws.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact7NumericText.mmObject();
		}

		@Override
		public Optional<Exact7NumericText> getValue(TransportBySea5 obj) {
			return obj.getIMONumber();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Exact7NumericText> value) {
			obj.setIMONumber(value.orElse(null));
		}
	};
	@XmlElement(name = "VygNb")
	protected Max35Text voyageNumber;
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
	public static final MMMessageAttribute<TransportBySea5, Optional<Max35Text>> mmVoyageNumber = new MMMessageAttribute<TransportBySea5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmVoyageNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmObject();
			isDerived = false;
			xmlTag = "VygNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoyageNumber";
			definition = "Identifies the voyage by sea.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransportBySea5 obj) {
			return obj.getVoyageNumber();
		}

		@Override
		public void setValue(TransportBySea5 obj, Optional<Max35Text> value) {
			obj.setVoyageNumber(value.orElse(null));
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	public TransportBySea5 setPortOfLoading(Max35Text portOfLoading) {
		this.portOfLoading = Objects.requireNonNull(portOfLoading);
		return this;
	}

	public Max35Text getPortOfDischarge() {
		return portOfDischarge;
	}

	public TransportBySea5 setPortOfDischarge(Max35Text portOfDischarge) {
		this.portOfDischarge = Objects.requireNonNull(portOfDischarge);
		return this;
	}

	public Optional<Max70Text> getVesselName() {
		return vesselName == null ? Optional.empty() : Optional.of(vesselName);
	}

	public TransportBySea5 setVesselName(Max70Text vesselName) {
		this.vesselName = vesselName;
		return this;
	}

	public Optional<Max70Text> getSeaCarrierName() {
		return seaCarrierName == null ? Optional.empty() : Optional.of(seaCarrierName);
	}

	public TransportBySea5 setSeaCarrierName(Max70Text seaCarrierName) {
		this.seaCarrierName = seaCarrierName;
		return this;
	}

	public Optional<CountryCode> getSeaCarrierCountry() {
		return seaCarrierCountry == null ? Optional.empty() : Optional.of(seaCarrierCountry);
	}

	public TransportBySea5 setSeaCarrierCountry(CountryCode seaCarrierCountry) {
		this.seaCarrierCountry = seaCarrierCountry;
		return this;
	}

	public Optional<Max70Text> getCarrierAgentName() {
		return carrierAgentName == null ? Optional.empty() : Optional.of(carrierAgentName);
	}

	public TransportBySea5 setCarrierAgentName(Max70Text carrierAgentName) {
		this.carrierAgentName = carrierAgentName;
		return this;
	}

	public Optional<CountryCode> getCarrierAgentCountry() {
		return carrierAgentCountry == null ? Optional.empty() : Optional.of(carrierAgentCountry);
	}

	public TransportBySea5 setCarrierAgentCountry(CountryCode carrierAgentCountry) {
		this.carrierAgentCountry = carrierAgentCountry;
		return this;
	}

	public Optional<Max70Text> getMasterName() {
		return masterName == null ? Optional.empty() : Optional.of(masterName);
	}

	public TransportBySea5 setMasterName(Max70Text masterName) {
		this.masterName = masterName;
		return this;
	}

	public Optional<Max70Text> getChartererName() {
		return chartererName == null ? Optional.empty() : Optional.of(chartererName);
	}

	public TransportBySea5 setChartererName(Max70Text chartererName) {
		this.chartererName = chartererName;
		return this;
	}

	public Optional<Max70Text> getOwnerName() {
		return ownerName == null ? Optional.empty() : Optional.of(ownerName);
	}

	public TransportBySea5 setOwnerName(Max70Text ownerName) {
		this.ownerName = ownerName;
		return this;
	}

	public Optional<Exact7NumericText> getIMONumber() {
		return iMONumber == null ? Optional.empty() : Optional.of(iMONumber);
	}

	public TransportBySea5 setIMONumber(Exact7NumericText iMONumber) {
		this.iMONumber = iMONumber;
		return this;
	}

	public Optional<Max35Text> getVoyageNumber() {
		return voyageNumber == null ? Optional.empty() : Optional.of(voyageNumber);
	}

	public TransportBySea5 setVoyageNumber(Max35Text voyageNumber) {
		this.voyageNumber = voyageNumber;
		return this;
	}
}