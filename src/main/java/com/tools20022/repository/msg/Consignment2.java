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
import com.tools20022.repository.entity.Consignee;
import com.tools20022.repository.entity.Consignor;
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TradeParty1;
import com.tools20022.repository.msg.TransportMeans3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the arrangement of the transport of goods and services and the
 * parties involved in this process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#mmConsignor
 * Consignment2.mmConsignor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#mmConsignee
 * Consignment2.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment2#mmTransportMeans
 * Consignment2.mmTransportMeans}</li>
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
 * "Consignment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the arrangement of the transport of goods and services and the parties involved in this process."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment4 Consignment4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Consignment2", propOrder = {"consignor", "consignee", "transportMeans"})
public class Consignment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Consgnr")
	protected TradeParty1 consignor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Consignor Consignor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment2 Consignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party consigning goods as stipulated in the transport contract by the party ordering transport."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Consignment4#mmConsignor
	 * Consignment4.mmConsignor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment2, Optional<TradeParty1>> mmConsignor = new MMMessageAssociationEnd<Consignment2, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> Consignor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment2.mmObject();
			isDerived = false;
			xmlTag = "Consgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignor";
			definition = "Party consigning goods as stipulated in the transport contract by the party ordering transport.";
			nextVersions_lazy = () -> Arrays.asList(Consignment4.mmConsignor);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(Consignment2 obj) {
			return obj.getConsignor();
		}

		@Override
		public void setValue(Consignment2 obj, Optional<TradeParty1> value) {
			obj.setConsignor(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgn")
	protected TradeParty1 consignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty1
	 * TradeParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Consignee Consignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment2 Consignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Consgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consignee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which goods are consigned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Consignment4#mmConsignee
	 * Consignment4.mmConsignee}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment2, Optional<TradeParty1>> mmConsignee = new MMMessageAssociationEnd<Consignment2, Optional<TradeParty1>>() {
		{
			businessComponentTrace_lazy = () -> Consignee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment2.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to which goods are consigned.";
			nextVersions_lazy = () -> Arrays.asList(Consignment4.mmConsignee);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty1.mmObject();
		}

		@Override
		public Optional<TradeParty1> getValue(Consignment2 obj) {
			return obj.getConsignee();
		}

		@Override
		public void setValue(Consignment2 obj, Optional<TradeParty1> value) {
			obj.setConsignee(value.orElse(null));
		}
	};
	@XmlElement(name = "TrnsprtMeans")
	protected List<TransportMeans3> transportMeans;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportMeans3
	 * TransportMeans3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment2 Consignment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportMeans"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Particular aircraft, vehicle, vessel or other device used for the transport of a consignment."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Consignment4#mmTransportMeans
	 * Consignment4.mmTransportMeans}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment2, List<TransportMeans3>> mmTransportMeans = new MMMessageAssociationEnd<Consignment2, List<TransportMeans3>>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment2.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportMeans";
			definition = "Particular aircraft, vehicle, vessel or other device used for the transport of a consignment.";
			nextVersions_lazy = () -> Arrays.asList(Consignment4.mmTransportMeans);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportMeans3.mmObject();
		}

		@Override
		public List<TransportMeans3> getValue(Consignment2 obj) {
			return obj.getTransportMeans();
		}

		@Override
		public void setValue(Consignment2 obj, List<TransportMeans3> value) {
			obj.setTransportMeans(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Consignment2.mmConsignor, com.tools20022.repository.msg.Consignment2.mmConsignee, com.tools20022.repository.msg.Consignment2.mmTransportMeans);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Consignment2";
				definition = "Specifies the arrangement of the transport of goods and services and the parties involved in this process.";
				nextVersions_lazy = () -> Arrays.asList(Consignment4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TradeParty1> getConsignor() {
		return consignor == null ? Optional.empty() : Optional.of(consignor);
	}

	public Consignment2 setConsignor(TradeParty1 consignor) {
		this.consignor = consignor;
		return this;
	}

	public Optional<TradeParty1> getConsignee() {
		return consignee == null ? Optional.empty() : Optional.of(consignee);
	}

	public Consignment2 setConsignee(TradeParty1 consignee) {
		this.consignee = consignee;
		return this;
	}

	public List<TransportMeans3> getTransportMeans() {
		return transportMeans == null ? transportMeans = new ArrayList<>() : transportMeans;
	}

	public Consignment2 setTransportMeans(List<TransportMeans3> transportMeans) {
		this.transportMeans = Objects.requireNonNull(transportMeans);
		return this;
	}
}