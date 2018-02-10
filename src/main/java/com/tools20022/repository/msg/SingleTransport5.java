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
import com.tools20022.repository.entity.*;
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
 * Specifies individually each leg of a transport of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportByAir
 * SingleTransport5.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportBySea
 * SingleTransport5.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportByRoad
 * SingleTransport5.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport5#mmTransportByRail
 * SingleTransport5.mmTransportByRail}</li>
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
 * "SingleTransport5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies individually each leg of a transport of goods."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SingleTransport6
 * SingleTransport6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleTransport5", propOrder = {"transportByAir", "transportBySea", "transportByRoad", "transportByRail"})
public class SingleTransport5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtByAir")
	protected List<com.tools20022.repository.msg.TransportByAir2> transportByAir;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByAir2
	 * TransportByAir2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport5
	 * SingleTransport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by air."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByAir
	 * SingleTransport6.mmTransportByAir}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByAir = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByAir.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByAir";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByAir";
			definition = "Information related to the transportation of goods by air.";
			nextVersions_lazy = () -> Arrays.asList(SingleTransport6.mmTransportByAir);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByAir2.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtBySea")
	protected List<com.tools20022.repository.msg.TransportBySea4> transportBySea;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportBySea4
	 * TransportBySea4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport5
	 * SingleTransport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related for the transportation of goods by sea."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportBySea
	 * SingleTransport6.mmTransportBySea}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportBySea = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportBySea.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtBySea";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportBySea";
			definition = "Information related for the transportation of goods by sea.";
			nextVersions_lazy = () -> Arrays.asList(SingleTransport6.mmTransportBySea);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportBySea4.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtByRoad")
	protected List<com.tools20022.repository.msg.TransportByRoad2> transportByRoad;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRoad2
	 * TransportByRoad2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRoad
	 * TransportByRoad}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport5
	 * SingleTransport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Moving of goods or people from one place to another by vehicle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRoad
	 * SingleTransport6.mmTransportByRoad}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRoad = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRoad.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRoad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRoad";
			definition = "Moving of goods or people from one place to another by vehicle.";
			nextVersions_lazy = () -> Arrays.asList(SingleTransport6.mmTransportByRoad);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRoad2.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtByRail")
	protected List<com.tools20022.repository.msg.TransportByRail2> transportByRail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRail2
	 * TransportByRail2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRail
	 * TransportByRail}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport5
	 * SingleTransport5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by rail."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRail
	 * SingleTransport6.mmTransportByRail}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRail = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRail.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRail";
			definition = "Information related to the transportation of goods by rail.";
			nextVersions_lazy = () -> Arrays.asList(SingleTransport6.mmTransportByRail);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRail2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport5.mmTransportByAir, com.tools20022.repository.msg.SingleTransport5.mmTransportBySea,
						com.tools20022.repository.msg.SingleTransport5.mmTransportByRoad, com.tools20022.repository.msg.SingleTransport5.mmTransportByRail);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SingleTransport5";
				definition = "Specifies individually each leg of a transport of goods.";
				nextVersions_lazy = () -> Arrays.asList(SingleTransport6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransportByAir2> getTransportByAir() {
		return transportByAir == null ? transportByAir = new ArrayList<>() : transportByAir;
	}

	public SingleTransport5 setTransportByAir(List<com.tools20022.repository.msg.TransportByAir2> transportByAir) {
		this.transportByAir = Objects.requireNonNull(transportByAir);
		return this;
	}

	public List<TransportBySea4> getTransportBySea() {
		return transportBySea == null ? transportBySea = new ArrayList<>() : transportBySea;
	}

	public SingleTransport5 setTransportBySea(List<com.tools20022.repository.msg.TransportBySea4> transportBySea) {
		this.transportBySea = Objects.requireNonNull(transportBySea);
		return this;
	}

	public List<TransportByRoad2> getTransportByRoad() {
		return transportByRoad == null ? transportByRoad = new ArrayList<>() : transportByRoad;
	}

	public SingleTransport5 setTransportByRoad(List<com.tools20022.repository.msg.TransportByRoad2> transportByRoad) {
		this.transportByRoad = Objects.requireNonNull(transportByRoad);
		return this;
	}

	public List<TransportByRail2> getTransportByRail() {
		return transportByRail == null ? transportByRail = new ArrayList<>() : transportByRail;
	}

	public SingleTransport5 setTransportByRail(List<com.tools20022.repository.msg.TransportByRail2> transportByRail) {
		this.transportByRail = Objects.requireNonNull(transportByRail);
		return this;
	}
}