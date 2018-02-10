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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmIndividualTransport
 * TransportMeans6.mmIndividualTransport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransportMeans6#mmMultimodalTransport
 * TransportMeans6.mmMultimodalTransport}</li>
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
 * "TransportMeans6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the multimodal or the individual transport of goods."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.TransportMeans4
 * TransportMeans4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TransportMeans6", propOrder = {"individualTransport", "multimodalTransport"})
public class TransportMeans6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IndvTrnsprt", required = true)
	protected SingleTransport8 individualTransport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SingleTransport8
	 * SingleTransport8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans6
	 * TransportMeans6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans4#mmIndividualTransport
	 * TransportMeans4.mmIndividualTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualTransport = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportMeans6.mmObject();
			isDerived = false;
			xmlTag = "IndvTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransport";
			definition = "Moving of goods or people from one place to another by vehicle.";
			previousVersion_lazy = () -> TransportMeans4.mmIndividualTransport;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SingleTransport8.mmObject();
		}
	};
	@XmlElement(name = "MltmdlTrnsprt")
	protected MultimodalTransport3 multimodalTransport;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.TransportMeans6
	 * TransportMeans6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.TransportMeans4#mmMultimodalTransport
	 * TransportMeans4.mmMultimodalTransport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMultimodalTransport = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Transport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TransportMeans6.mmObject();
			isDerived = false;
			xmlTag = "MltmdlTrnsprt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultimodalTransport";
			definition = "Specifies the different movements and places and their role in a multimodal conveyance of goods.";
			previousVersion_lazy = () -> TransportMeans4.mmMultimodalTransport;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MultimodalTransport3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransportMeans6.mmIndividualTransport, com.tools20022.repository.msg.TransportMeans6.mmMultimodalTransport);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransportMeans6";
				definition = "Describes the multimodal or the individual transport of goods.";
				previousVersion_lazy = () -> TransportMeans4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SingleTransport8 getIndividualTransport() {
		return individualTransport;
	}

	public TransportMeans6 setIndividualTransport(com.tools20022.repository.msg.SingleTransport8 individualTransport) {
		this.individualTransport = Objects.requireNonNull(individualTransport);
		return this;
	}

	public Optional<MultimodalTransport3> getMultimodalTransport() {
		return multimodalTransport == null ? Optional.empty() : Optional.of(multimodalTransport);
	}

	public TransportMeans6 setMultimodalTransport(com.tools20022.repository.msg.MultimodalTransport3 multimodalTransport) {
		this.multimodalTransport = multimodalTransport;
		return this;
	}
}