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
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.TransportBySea2#mmPortOfLoading
 * TransportBySea2.mmPortOfLoading}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportBySea2#mmPortOfDischarge
 * TransportBySea2.mmPortOfDischarge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransportBySea2#mmVesselName
 * TransportBySea2.mmVesselName}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransportBySea2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related for the transportation of goods by sea."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportBySea2", propOrder = {"portOfLoading", "portOfDischarge", "vesselName"})
public class TransportBySea2 {

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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2
	 * TransportBySea2}</li>
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
	public static final MMMessageAttribute<TransportBySea2, Max35Text> mmPortOfLoading = new MMMessageAttribute<TransportBySea2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDeparture;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea2.mmObject();
			isDerived = false;
			xmlTag = "PortOfLoadng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfLoading";
			definition = "Identifies the port where the goods are loaded on board the ship.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransportBySea2 obj) {
			return obj.getPortOfLoading();
		}

		@Override
		public void setValue(TransportBySea2 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2
	 * TransportBySea2}</li>
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
	public static final MMMessageAttribute<TransportBySea2, Max35Text> mmPortOfDischarge = new MMMessageAttribute<TransportBySea2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Transport.mmPlaceOfDestination;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea2.mmObject();
			isDerived = false;
			xmlTag = "PortOfDschrge";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortOfDischarge";
			definition = "Identifies the port where the goods are discharged.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TransportBySea2 obj) {
			return obj.getPortOfDischarge();
		}

		@Override
		public void setValue(TransportBySea2 obj, Max35Text value) {
			obj.setPortOfDischarge(value);
		}
	};
	@XmlElement(name = "VsslNm")
	protected Max35Text vesselName;
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
	 * {@linkplain com.tools20022.repository.msg.TransportBySea2
	 * TransportBySea2}</li>
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
	public static final MMMessageAttribute<TransportBySea2, Optional<Max35Text>> mmVesselName = new MMMessageAttribute<TransportBySea2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TransportBySea.mmVesselName;
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportBySea2.mmObject();
			isDerived = false;
			xmlTag = "VsslNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VesselName";
			definition = "Name of a vessel.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TransportBySea2 obj) {
			return obj.getVesselName();
		}

		@Override
		public void setValue(TransportBySea2 obj, Optional<Max35Text> value) {
			obj.setVesselName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportBySea2.mmPortOfLoading, com.tools20022.repository.msg.TransportBySea2.mmPortOfDischarge,
						com.tools20022.repository.msg.TransportBySea2.mmVesselName);
				trace_lazy = () -> TransportBySea.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransportBySea2";
				definition = "Information related for the transportation of goods by sea.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPortOfLoading() {
		return portOfLoading;
	}

	public TransportBySea2 setPortOfLoading(Max35Text portOfLoading) {
		this.portOfLoading = Objects.requireNonNull(portOfLoading);
		return this;
	}

	public Max35Text getPortOfDischarge() {
		return portOfDischarge;
	}

	public TransportBySea2 setPortOfDischarge(Max35Text portOfDischarge) {
		this.portOfDischarge = Objects.requireNonNull(portOfDischarge);
		return this;
	}

	public Optional<Max35Text> getVesselName() {
		return vesselName == null ? Optional.empty() : Optional.of(vesselName);
	}

	public TransportBySea2 setVesselName(Max35Text vesselName) {
		this.vesselName = vesselName;
		return this;
	}
}