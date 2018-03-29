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
import com.tools20022.repository.msg.TransportByAir4;
import com.tools20022.repository.msg.TransportByRail4;
import com.tools20022.repository.msg.TransportByRoad4;
import com.tools20022.repository.msg.TransportBySea5;
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
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByAir
 * SingleTransport8.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportBySea
 * SingleTransport8.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByRoad
 * SingleTransport8.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport8#mmTransportByRail
 * SingleTransport8.mmTransportByRail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCarrierNameBPORule#forSingleTransport8
 * ConstraintCarrierNameBPORule.forSingleTransport8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintVesselNameBPORule#forSingleTransport8
 * ConstraintVesselNameBPORule.forSingleTransport8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SingleTransport8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies individually each leg of a transport of goods."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SingleTransport6 SingleTransport6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleTransport8", propOrder = {"transportByAir", "transportBySea", "transportByRoad", "transportByRail"})
public class SingleTransport8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtByAir")
	protected List<TransportByAir4> transportByAir;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByAir4
	 * TransportByAir4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport8
	 * SingleTransport8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByAir
	 * SingleTransport6.mmTransportByAir}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleTransport8, List<TransportByAir4>> mmTransportByAir = new MMMessageAssociationEnd<SingleTransport8, List<TransportByAir4>>() {
		{
			businessComponentTrace_lazy = () -> TransportByAir.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport8.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByAir";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByAir";
			definition = "Information related to the transportation of goods by air.";
			previousVersion_lazy = () -> SingleTransport6.mmTransportByAir;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportByAir4.mmObject();
		}

		@Override
		public List<TransportByAir4> getValue(SingleTransport8 obj) {
			return obj.getTransportByAir();
		}

		@Override
		public void setValue(SingleTransport8 obj, List<TransportByAir4> value) {
			obj.setTransportByAir(value);
		}
	};
	@XmlElement(name = "TrnsprtBySea")
	protected List<TransportBySea5> transportBySea;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportBySea5
	 * TransportBySea5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport8
	 * SingleTransport8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportBySea
	 * SingleTransport6.mmTransportBySea}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleTransport8, List<TransportBySea5>> mmTransportBySea = new MMMessageAssociationEnd<SingleTransport8, List<TransportBySea5>>() {
		{
			businessComponentTrace_lazy = () -> TransportBySea.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport8.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtBySea";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportBySea";
			definition = "Information related for the transportation of goods by sea.";
			previousVersion_lazy = () -> SingleTransport6.mmTransportBySea;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportBySea5.mmObject();
		}

		@Override
		public List<TransportBySea5> getValue(SingleTransport8 obj) {
			return obj.getTransportBySea();
		}

		@Override
		public void setValue(SingleTransport8 obj, List<TransportBySea5> value) {
			obj.setTransportBySea(value);
		}
	};
	@XmlElement(name = "TrnsprtByRoad")
	protected List<TransportByRoad4> transportByRoad;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRoad4
	 * TransportByRoad4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRoad
	 * TransportByRoad}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport8
	 * SingleTransport8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRoad
	 * SingleTransport6.mmTransportByRoad}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleTransport8, List<TransportByRoad4>> mmTransportByRoad = new MMMessageAssociationEnd<SingleTransport8, List<TransportByRoad4>>() {
		{
			businessComponentTrace_lazy = () -> TransportByRoad.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport8.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRoad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRoad";
			definition = "Moving of goods or people from one place to another by vehicle.";
			previousVersion_lazy = () -> SingleTransport6.mmTransportByRoad;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportByRoad4.mmObject();
		}

		@Override
		public List<TransportByRoad4> getValue(SingleTransport8 obj) {
			return obj.getTransportByRoad();
		}

		@Override
		public void setValue(SingleTransport8 obj, List<TransportByRoad4> value) {
			obj.setTransportByRoad(value);
		}
	};
	@XmlElement(name = "TrnsprtByRail")
	protected List<TransportByRail4> transportByRail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRail4
	 * TransportByRail4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRail
	 * TransportByRail}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport8
	 * SingleTransport8}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport6#mmTransportByRail
	 * SingleTransport6.mmTransportByRail}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SingleTransport8, List<TransportByRail4>> mmTransportByRail = new MMMessageAssociationEnd<SingleTransport8, List<TransportByRail4>>() {
		{
			businessComponentTrace_lazy = () -> TransportByRail.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport8.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRail";
			definition = "Information related to the transportation of goods by rail.";
			previousVersion_lazy = () -> SingleTransport6.mmTransportByRail;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportByRail4.mmObject();
		}

		@Override
		public List<TransportByRail4> getValue(SingleTransport8 obj) {
			return obj.getTransportByRail();
		}

		@Override
		public void setValue(SingleTransport8 obj, List<TransportByRail4> value) {
			obj.setTransportByRail(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport8.mmTransportByAir, com.tools20022.repository.msg.SingleTransport8.mmTransportBySea,
						com.tools20022.repository.msg.SingleTransport8.mmTransportByRoad, com.tools20022.repository.msg.SingleTransport8.mmTransportByRail);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCarrierNameBPORule.forSingleTransport8, com.tools20022.repository.constraints.ConstraintVesselNameBPORule.forSingleTransport8);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SingleTransport8";
				definition = "Specifies individually each leg of a transport of goods.";
				previousVersion_lazy = () -> SingleTransport6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransportByAir4> getTransportByAir() {
		return transportByAir == null ? transportByAir = new ArrayList<>() : transportByAir;
	}

	public SingleTransport8 setTransportByAir(List<TransportByAir4> transportByAir) {
		this.transportByAir = Objects.requireNonNull(transportByAir);
		return this;
	}

	public List<TransportBySea5> getTransportBySea() {
		return transportBySea == null ? transportBySea = new ArrayList<>() : transportBySea;
	}

	public SingleTransport8 setTransportBySea(List<TransportBySea5> transportBySea) {
		this.transportBySea = Objects.requireNonNull(transportBySea);
		return this;
	}

	public List<TransportByRoad4> getTransportByRoad() {
		return transportByRoad == null ? transportByRoad = new ArrayList<>() : transportByRoad;
	}

	public SingleTransport8 setTransportByRoad(List<TransportByRoad4> transportByRoad) {
		this.transportByRoad = Objects.requireNonNull(transportByRoad);
		return this;
	}

	public List<TransportByRail4> getTransportByRail() {
		return transportByRail == null ? transportByRail = new ArrayList<>() : transportByRail;
	}

	public SingleTransport8 setTransportByRail(List<TransportByRail4> transportByRail) {
		this.transportByRail = Objects.requireNonNull(transportByRail);
		return this;
	}
}