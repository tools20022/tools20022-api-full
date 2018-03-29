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
import com.tools20022.repository.msg.TradeParty4;
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
 * <li>{@linkplain com.tools20022.repository.msg.Consignment5#mmConsignor
 * Consignment5.mmConsignor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment5#mmConsignee
 * Consignment5.mmConsignee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Consignment5#mmTransportMeans
 * Consignment5.mmTransportMeans}</li>
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
 * "Consignment5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the arrangement of the transport of goods and services and the parties involved in this process."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Consignment4
 * Consignment4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Consignment5", propOrder = {"consignor", "consignee", "transportMeans"})
public class Consignment5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Consgnr")
	protected TradeParty4 consignor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Consignor Consignor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment5 Consignment5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment4#mmConsignor
	 * Consignment4.mmConsignor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment5, Optional<TradeParty4>> mmConsignor = new MMMessageAssociationEnd<Consignment5, Optional<TradeParty4>>() {
		{
			businessComponentTrace_lazy = () -> Consignor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment5.mmObject();
			isDerived = false;
			xmlTag = "Consgnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignor";
			definition = "Party consigning goods as stipulated in the transport contract by the party ordering transport.";
			previousVersion_lazy = () -> Consignment4.mmConsignor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty4.mmObject();
		}

		@Override
		public Optional<TradeParty4> getValue(Consignment5 obj) {
			return obj.getConsignor();
		}

		@Override
		public void setValue(Consignment5 obj, Optional<TradeParty4> value) {
			obj.setConsignor(value.orElse(null));
		}
	};
	@XmlElement(name = "Consgn")
	protected TradeParty4 consignee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeParty4
	 * TradeParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Consignee Consignee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Consignment5 Consignment5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment4#mmConsignee
	 * Consignment4.mmConsignee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment5, Optional<TradeParty4>> mmConsignee = new MMMessageAssociationEnd<Consignment5, Optional<TradeParty4>>() {
		{
			businessComponentTrace_lazy = () -> Consignee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment5.mmObject();
			isDerived = false;
			xmlTag = "Consgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consignee";
			definition = "Party to which goods are consigned.";
			previousVersion_lazy = () -> Consignment4.mmConsignee;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeParty4.mmObject();
		}

		@Override
		public Optional<TradeParty4> getValue(Consignment5 obj) {
			return obj.getConsignee();
		}

		@Override
		public void setValue(Consignment5 obj, Optional<TradeParty4> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Consignment5 Consignment5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Consignment4#mmTransportMeans
	 * Consignment4.mmTransportMeans}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Consignment5, List<TransportMeans3>> mmTransportMeans = new MMMessageAssociationEnd<Consignment5, List<TransportMeans3>>() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Consignment5.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtMeans";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportMeans";
			definition = "Particular aircraft, vehicle, vessel or other device used for the transport of a consignment.";
			previousVersion_lazy = () -> Consignment4.mmTransportMeans;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransportMeans3.mmObject();
		}

		@Override
		public List<TransportMeans3> getValue(Consignment5 obj) {
			return obj.getTransportMeans();
		}

		@Override
		public void setValue(Consignment5 obj, List<TransportMeans3> value) {
			obj.setTransportMeans(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Consignment5.mmConsignor, com.tools20022.repository.msg.Consignment5.mmConsignee, com.tools20022.repository.msg.Consignment5.mmTransportMeans);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Consignment5";
				definition = "Specifies the arrangement of the transport of goods and services and the parties involved in this process.";
				previousVersion_lazy = () -> Consignment4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<TradeParty4> getConsignor() {
		return consignor == null ? Optional.empty() : Optional.of(consignor);
	}

	public Consignment5 setConsignor(TradeParty4 consignor) {
		this.consignor = consignor;
		return this;
	}

	public Optional<TradeParty4> getConsignee() {
		return consignee == null ? Optional.empty() : Optional.of(consignee);
	}

	public Consignment5 setConsignee(TradeParty4 consignee) {
		this.consignee = consignee;
		return this;
	}

	public List<TransportMeans3> getTransportMeans() {
		return transportMeans == null ? transportMeans = new ArrayList<>() : transportMeans;
	}

	public Consignment5 setTransportMeans(List<TransportMeans3> transportMeans) {
		this.transportMeans = Objects.requireNonNull(transportMeans);
		return this;
	}
}