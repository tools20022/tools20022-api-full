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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.TransportBySea;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfLoading
 * TransportBySea6.mmPortOfLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmPortOfDischarge
 * TransportBySea6.mmPortOfDischarge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea6#mmVesselName
 * TransportBySea6.mmVesselName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierName
 * TransportBySea6.mmSeaCarrierName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmSeaCarrierCountry
 * TransportBySea6.mmSeaCarrierCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentName
 * TransportBySea6.mmCarrierAgentName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea6#mmCarrierAgentCountry
 * TransportBySea6.mmCarrierAgentCountry}</li>
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
 * "TransportBySea6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related for the transportation of goods by sea."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TransportBySea5
 * TransportBySea5}</li>
 * </ul>
 */
public class TransportBySea6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> portOfLoading;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfLoading
	 * TransportBySea5.mmPortOfLoading}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfLoading = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmPortOfLoading;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<Max35Text> portOfDischarge;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmPortOfDischarge
	 * TransportBySea5.mmPortOfDischarge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortOfDischarge = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmPortOfDischarge;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	public static final MMMessageAttribute mmVesselName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TransportBySea.mmVesselName;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "VsslNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmSeaCarrierName
	 * TransportBySea5.mmSeaCarrierName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeaCarrierName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.mmName;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierName";
			definition = "Identifies the party that is responsible for the conveyance of the goods from one place to another.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmSeaCarrierName;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmSeaCarrierCountry
	 * TransportBySea5.mmSeaCarrierCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSeaCarrierCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "SeaCrrierCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeaCarrierCountry";
			definition = "Country in which the carrier of the goods, for example, shipping company, is located or registered.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmSeaCarrierCountry;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentName
	 * TransportBySea5.mmCarrierAgentName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.mmName;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentName";
			definition = "Name of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmCarrierAgentName;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea6
	 * TransportBySea6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea5#mmCarrierAgentCountry
	 * TransportBySea5.mmCarrierAgentCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCarrierAgentCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Country.mmCode;
			componentContext_lazy = () -> TransportBySea6.mmObject();
			isDerived = false;
			xmlTag = "CrrierAgtCtry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CarrierAgentCountry";
			definition = "Country of registration of the carrier's (for example, shipping company's) agent that acts on behalf of the carrier and may be the issuer of transport documents relating to the underlying shipment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.TransportBySea5.mmCarrierAgentCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea6.mmPortOfLoading, com.tools20022.repository.msg.TransportBySea6.mmPortOfDischarge,
						com.tools20022.repository.msg.TransportBySea6.mmVesselName, com.tools20022.repository.msg.TransportBySea6.mmSeaCarrierName, com.tools20022.repository.msg.TransportBySea6.mmSeaCarrierCountry,
						com.tools20022.repository.msg.TransportBySea6.mmCarrierAgentName, com.tools20022.repository.msg.TransportBySea6.mmCarrierAgentCountry);
				trace_lazy = () -> TransportBySea.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TransportBySea6";
				definition = "Information related for the transportation of goods by sea.";
				previousVersion_lazy = () -> TransportBySea5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getPortOfLoading() {
		return portOfLoading;
	}

	public void setPortOfLoading(List<Max35Text> portOfLoading) {
		this.portOfLoading = portOfLoading;
	}

	public List<Max35Text> getPortOfDischarge() {
		return portOfDischarge;
	}

	public void setPortOfDischarge(List<Max35Text> portOfDischarge) {
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
}