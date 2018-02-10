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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Physical and logical characteristics of a POI component (Point of
 * Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmMemory
 * PointOfInteractionComponentCharacteristics4.mmMemory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmCommunication
 * PointOfInteractionComponentCharacteristics4.mmCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSecurityAccessModules
 * PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSubscriberIdentityModules
 * PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSecurityElement
 * PointOfInteractionComponentCharacteristics4.mmSecurityElement}</li>
 * </ul>
 * </li>
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
 * "PointOfInteractionComponentCharacteristics4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical and logical characteristics of a POI component (Point of Interaction)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
 * PointOfInteractionComponentCharacteristics3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponentCharacteristics4", propOrder = {"memory", "communication", "securityAccessModules", "subscriberIdentityModules", "securityElement"})
public class PointOfInteractionComponentCharacteristics4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mmry")
	protected List<com.tools20022.repository.msg.MemoryCharacteristics1> memory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MemoryCharacteristics1
	 * MemoryCharacteristics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mmry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Memory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Memory characteristics of the component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmMemory
	 * PointOfInteractionComponentCharacteristics3.mmMemory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMemory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "Mmry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Memory";
			definition = "Memory characteristics of the component.";
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics3.mmMemory;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MemoryCharacteristics1.mmObject();
		}
	};
	@XmlElement(name = "Com")
	protected List<com.tools20022.repository.msg.CommunicationCharacteristics3> communication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationCharacteristics3
	 * CommunicationCharacteristics3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Com"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Communication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Low level communication of the hardware or software component toward another component or an external entity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmCommunication
	 * PointOfInteractionComponentCharacteristics3.mmCommunication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommunication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "Com";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Communication";
			definition = "Low level communication of the hardware or software component toward another component or an external entity.";
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics3.mmCommunication;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics3.mmObject();
		}
	};
	@XmlElement(name = "SctyAccsMdls")
	protected Number securityAccessModules;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyAccsMdls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityAccessModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of security access modules (SAM)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmSecurityAccessModules
	 * PointOfInteractionComponentCharacteristics3.mmSecurityAccessModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityAccessModules = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SctyAccsMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityAccessModules";
			definition = "Number of security access modules (SAM).";
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics3.mmSecurityAccessModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "SbcbrIdntyMdls")
	protected Number subscriberIdentityModules;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcbrIdntyMdls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberIdentityModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of subscriber identity modules (SIM)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmSubscriberIdentityModules
	 * PointOfInteractionComponentCharacteristics3.mmSubscriberIdentityModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriberIdentityModules = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SbcbrIdntyMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberIdentityModules";
			definition = "Number of subscriber identity modules (SIM).";
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics3.mmSubscriberIdentityModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "SctyElmt")
	protected List<com.tools20022.repository.msg.CryptographicKey13> securityElement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey13
	 * CryptographicKey13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
	 * PointOfInteractionComponentCharacteristics4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyElmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityElement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security characteristics of the component."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityElement = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmObject();
			isDerived = false;
			xmlTag = "SctyElmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityElement";
			definition = "Security characteristics of the component.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CryptographicKey13.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmMemory, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmCommunication,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4.mmSecurityElement);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PointOfInteractionComponentCharacteristics4";
				definition = "Physical and logical characteristics of a POI component (Point of Interaction).";
				previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemoryCharacteristics1> getMemory() {
		return memory == null ? memory = new ArrayList<>() : memory;
	}

	public PointOfInteractionComponentCharacteristics4 setMemory(List<com.tools20022.repository.msg.MemoryCharacteristics1> memory) {
		this.memory = Objects.requireNonNull(memory);
		return this;
	}

	public List<CommunicationCharacteristics3> getCommunication() {
		return communication == null ? communication = new ArrayList<>() : communication;
	}

	public PointOfInteractionComponentCharacteristics4 setCommunication(List<com.tools20022.repository.msg.CommunicationCharacteristics3> communication) {
		this.communication = Objects.requireNonNull(communication);
		return this;
	}

	public Optional<Number> getSecurityAccessModules() {
		return securityAccessModules == null ? Optional.empty() : Optional.of(securityAccessModules);
	}

	public PointOfInteractionComponentCharacteristics4 setSecurityAccessModules(Number securityAccessModules) {
		this.securityAccessModules = securityAccessModules;
		return this;
	}

	public Optional<Number> getSubscriberIdentityModules() {
		return subscriberIdentityModules == null ? Optional.empty() : Optional.of(subscriberIdentityModules);
	}

	public PointOfInteractionComponentCharacteristics4 setSubscriberIdentityModules(Number subscriberIdentityModules) {
		this.subscriberIdentityModules = subscriberIdentityModules;
		return this;
	}

	public List<CryptographicKey13> getSecurityElement() {
		return securityElement == null ? securityElement = new ArrayList<>() : securityElement;
	}

	public PointOfInteractionComponentCharacteristics4 setSecurityElement(List<com.tools20022.repository.msg.CryptographicKey13> securityElement) {
		this.securityElement = Objects.requireNonNull(securityElement);
		return this;
	}
}