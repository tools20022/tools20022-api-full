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
import com.tools20022.repository.entity.Transport;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the multimodal or the individual transport of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#mmIndividualTransport
 * TransportMeans1.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans1#mmMultimodalTransport
 * TransportMeans1.mmMultimodalTransport}</li>
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
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TransportMeans1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the multimodal or the individual transport of goods."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransportMeans5
 * TransportMeans5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransportMeans1", propOrder = {"individualTransport", "multimodalTransport"})
public class TransportMeans1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SingleTransport4 individualTransport;
	/**
	 * Moving of goods or people from one place to another by vehicle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleTransport4
	 * SingleTransport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans1
	 * TransportMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Moving of goods or people from one place to another by vehicle."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmIndividualTransport
	 * TransportMeans5.mmIndividualTransport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualTransport = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> TransportMeans1.mmObject();
			isDerived = false;
			xmlTag = "IndvTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransport";
			definition = "Moving of goods or people from one place to another by vehicle.";
			nextVersions_lazy = () -> Arrays.asList(TransportMeans5.mmIndividualTransport);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SingleTransport4.mmObject();
		}
	};
	protected MultimodalTransport3 multimodalTransport;
	/**
	 * Specifies the different movements and places and their role in a
	 * multimodal conveyance of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MultimodalTransport3
	 * MultimodalTransport3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans1
	 * TransportMeans1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MltmdlTrnsprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultimodalTransport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different movements and places and their role in a multimodal conveyance of goods."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransportMeans5#mmMultimodalTransport
	 * TransportMeans5.mmMultimodalTransport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultimodalTransport = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> TransportMeans1.mmObject();
			isDerived = false;
			xmlTag = "MltmdlTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultimodalTransport";
			definition = "Specifies the different movements and places and their role in a multimodal conveyance of goods.";
			nextVersions_lazy = () -> Arrays.asList(TransportMeans5.mmMultimodalTransport);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MultimodalTransport3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransportMeans1.mmIndividualTransport, TransportMeans1.mmMultimodalTransport);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportMeans1";
				definition = "Describes the multimodal or the individual transport of goods.";
				nextVersions_lazy = () -> Arrays.asList(TransportMeans5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "IndvTrnsprt", required = true)
	public SingleTransport4 getIndividualTransport() {
		return individualTransport;
	}

	public void setIndividualTransport(com.tools20022.repository.msg.SingleTransport4 individualTransport) {
		this.individualTransport = individualTransport;
	}

	@XmlElement(name = "MltmdlTrnsprt")
	public MultimodalTransport3 getMultimodalTransport() {
		return multimodalTransport;
	}

	public void setMultimodalTransport(com.tools20022.repository.msg.MultimodalTransport3 multimodalTransport) {
		this.multimodalTransport = multimodalTransport;
	}
}