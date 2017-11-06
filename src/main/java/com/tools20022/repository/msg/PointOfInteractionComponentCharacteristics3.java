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
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmMemory
 * PointOfInteractionComponentCharacteristics3.mmMemory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmCommunication
 * PointOfInteractionComponentCharacteristics3.mmCommunication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmSecurityAccessModules
 * PointOfInteractionComponentCharacteristics3.mmSecurityAccessModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmSubscriberIdentityModules
 * PointOfInteractionComponentCharacteristics3.mmSubscriberIdentityModules}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmKeyCheckValue
 * PointOfInteractionComponentCharacteristics3.mmKeyCheckValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmKeyCharacteristic
 * PointOfInteractionComponentCharacteristics3.mmKeyCharacteristic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3#mmEncryptedKey
 * PointOfInteractionComponentCharacteristics3.mmEncryptedKey}</li>
 * </ul>
 * </li>
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
 * "PointOfInteractionComponentCharacteristics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical and logical characteristics of a POI component (Point of Interaction)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2
 * PointOfInteractionComponentCharacteristics2}</li>
 * </ul>
 */
public class PointOfInteractionComponentCharacteristics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.MemoryCharacteristics1> memory;
	/**
	 * Memory characteristics of the component.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmMemory
	 * PointOfInteractionComponentCharacteristics2.mmMemory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMemory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "Mmry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Memory";
			definition = "Memory characteristics of the component.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmMemory;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MemoryCharacteristics1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CommunicationCharacteristics3> communication;
	/**
	 * Low level communication of the hardware or software component toward
	 * another component or an external entity.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmCommunication
	 * PointOfInteractionComponentCharacteristics2.mmCommunication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommunication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "Com";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Communication";
			definition = "Low level communication of the hardware or software component toward another component or an external entity.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmCommunication;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CommunicationCharacteristics3.mmObject();
		}
	};
	protected Number securityAccessModules;
	/**
	 * Number of security access modules (SAM).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmSecurityAccessModules
	 * PointOfInteractionComponentCharacteristics2.mmSecurityAccessModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecurityAccessModules = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SctyAccsMdls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityAccessModules";
			definition = "Number of security access modules (SAM).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmSecurityAccessModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number subscriberIdentityModules;
	/**
	 * Number of subscriber identity modules (SIM).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmSubscriberIdentityModules
	 * PointOfInteractionComponentCharacteristics2.mmSubscriberIdentityModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubscriberIdentityModules = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SbcbrIdntyMdls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberIdentityModules";
			definition = "Number of subscriber identity modules (SIM).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmSubscriberIdentityModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Max35Binary keyCheckValue;
	/**
	 * Value for checking a cryptographic key security parameter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyChckVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCheckValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value for checking a cryptographic key security parameter."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmKeyCheckValue
	 * PointOfInteractionComponentCharacteristics2.mmKeyCheckValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyCheckValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "KeyChckVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCheckValue";
			definition = "Value for checking a cryptographic key security parameter.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2.mmKeyCheckValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};
	protected KEKIdentifier5 keyCharacteristic;
	/**
	 * Sufficient characteristic information to identify the Key Encryption Key
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier5
	 * KEKIdentifier5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyChrtc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCharacteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sufficient characteristic information to identify the Key Encryption Key"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyCharacteristic = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "KeyChrtc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCharacteristic";
			definition = "Sufficient characteristic information to identify the Key Encryption Key";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier5.mmObject();
		}
	};
	protected Max5000Binary encryptedKey;
	/**
	 * Use in DUKPT Key to carry last 5 bytes of derivation value
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptdKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use in DUKPT Key to carry last 5 bytes of derivation value"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEncryptedKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Use in DUKPT Key to carry last 5 bytes of derivation value";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmMemory, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmCommunication,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmSecurityAccessModules, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmSubscriberIdentityModules,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmKeyCheckValue, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmKeyCharacteristic,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmEncryptedKey);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponentCharacteristics3";
				definition = "Physical and logical characteristics of a POI component (Point of Interaction).";
				previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemoryCharacteristics1> getMemory() {
		return memory;
	}

	public void setMemory(List<com.tools20022.repository.msg.MemoryCharacteristics1> memory) {
		this.memory = memory;
	}

	public List<CommunicationCharacteristics3> getCommunication() {
		return communication;
	}

	public void setCommunication(List<com.tools20022.repository.msg.CommunicationCharacteristics3> communication) {
		this.communication = communication;
	}

	public Number getSecurityAccessModules() {
		return securityAccessModules;
	}

	public void setSecurityAccessModules(Number securityAccessModules) {
		this.securityAccessModules = securityAccessModules;
	}

	public Number getSubscriberIdentityModules() {
		return subscriberIdentityModules;
	}

	public void setSubscriberIdentityModules(Number subscriberIdentityModules) {
		this.subscriberIdentityModules = subscriberIdentityModules;
	}

	public Max35Binary getKeyCheckValue() {
		return keyCheckValue;
	}

	public void setKeyCheckValue(Max35Binary keyCheckValue) {
		this.keyCheckValue = keyCheckValue;
	}

	public KEKIdentifier5 getKeyCharacteristic() {
		return keyCharacteristic;
	}

	public void setKeyCharacteristic(com.tools20022.repository.msg.KEKIdentifier5 keyCharacteristic) {
		this.keyCharacteristic = keyCharacteristic;
	}

	public Max5000Binary getEncryptedKey() {
		return encryptedKey;
	}

	public void setEncryptedKey(Max5000Binary encryptedKey) {
		this.encryptedKey = encryptedKey;
	}
}