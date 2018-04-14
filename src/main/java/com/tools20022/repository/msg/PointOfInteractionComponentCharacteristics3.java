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
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CommunicationCharacteristics3;
import com.tools20022.repository.msg.KEKIdentifier5;
import com.tools20022.repository.msg.MemoryCharacteristics1;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PointOfInteractionComponentCharacteristics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Physical and logical characteristics of a POI component (Point of Interaction)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4
 * PointOfInteractionComponentCharacteristics4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2
 * PointOfInteractionComponentCharacteristics2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PointOfInteractionComponentCharacteristics3", propOrder = {"memory", "communication", "securityAccessModules", "subscriberIdentityModules", "keyCheckValue", "keyCharacteristic", "encryptedKey"})
public class PointOfInteractionComponentCharacteristics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mmry")
	protected List<MemoryCharacteristics1> memory;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mmry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Memory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Memory characteristics of the component."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmMemory
	 * PointOfInteractionComponentCharacteristics4.mmMemory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmMemory
	 * PointOfInteractionComponentCharacteristics2.mmMemory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, List<MemoryCharacteristics1>> mmMemory = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, List<MemoryCharacteristics1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "Mmry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Memory";
			definition = "Memory characteristics of the component.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentCharacteristics4.mmMemory);
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmMemory;
			minOccurs = 0;
			complexType_lazy = () -> MemoryCharacteristics1.mmObject();
		}

		@Override
		public List<MemoryCharacteristics1> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getMemory();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, List<MemoryCharacteristics1> value) {
			obj.setMemory(value);
		}
	};
	@XmlElement(name = "Com")
	protected List<CommunicationCharacteristics3> communication;
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Com"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Communication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Low level communication of the hardware or software component toward another component or an external entity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmCommunication
	 * PointOfInteractionComponentCharacteristics4.mmCommunication}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmCommunication
	 * PointOfInteractionComponentCharacteristics2.mmCommunication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, List<CommunicationCharacteristics3>> mmCommunication = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, List<CommunicationCharacteristics3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "Com";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Communication";
			definition = "Low level communication of the hardware or software component toward another component or an external entity.";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentCharacteristics4.mmCommunication);
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmCommunication;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationCharacteristics3.mmObject();
		}

		@Override
		public List<CommunicationCharacteristics3> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getCommunication();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, List<CommunicationCharacteristics3> value) {
			obj.setCommunication(value);
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyAccsMdls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityAccessModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of security access modules (SAM)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSecurityAccessModules
	 * PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmSecurityAccessModules
	 * PointOfInteractionComponentCharacteristics2.mmSecurityAccessModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Number>> mmSecurityAccessModules = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SctyAccsMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityAccessModules";
			definition = "Number of security access modules (SAM).";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentCharacteristics4.mmSecurityAccessModules);
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmSecurityAccessModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getSecurityAccessModules();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, Optional<Number> value) {
			obj.setSecurityAccessModules(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3
	 * PointOfInteractionComponentCharacteristics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcbrIdntyMdls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriberIdentityModules"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of subscriber identity modules (SIM)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics4#mmSubscriberIdentityModules
	 * PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmSubscriberIdentityModules
	 * PointOfInteractionComponentCharacteristics2.mmSubscriberIdentityModules}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Number>> mmSubscriberIdentityModules = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "SbcbrIdntyMdls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriberIdentityModules";
			definition = "Number of subscriber identity modules (SIM).";
			nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentCharacteristics4.mmSubscriberIdentityModules);
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmSubscriberIdentityModules;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getSubscriberIdentityModules();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, Optional<Number> value) {
			obj.setSubscriberIdentityModules(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyChckVal")
	protected Max35Binary keyCheckValue;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCheckValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value for checking a cryptographic key security parameter."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics2#mmKeyCheckValue
	 * PointOfInteractionComponentCharacteristics2.mmKeyCheckValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Max35Binary>> mmKeyCheckValue = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Max35Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "KeyChckVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCheckValue";
			definition = "Value for checking a cryptographic key security parameter.";
			previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmKeyCheckValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}

		@Override
		public Optional<Max35Binary> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getKeyCheckValue();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, Optional<Max35Binary> value) {
			obj.setKeyCheckValue(value.orElse(null));
		}
	};
	@XmlElement(name = "KeyChrtc")
	protected KEKIdentifier5 keyCharacteristic;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCharacteristic"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sufficient characteristic information to identify the Key Encryption Key."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PointOfInteractionComponentCharacteristics3, Optional<KEKIdentifier5>> mmKeyCharacteristic = new MMMessageAssociationEnd<PointOfInteractionComponentCharacteristics3, Optional<KEKIdentifier5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "KeyChrtc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCharacteristic";
			definition = "Sufficient characteristic information to identify the Key Encryption Key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> KEKIdentifier5.mmObject();
		}

		@Override
		public Optional<KEKIdentifier5> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getKeyCharacteristic();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, Optional<KEKIdentifier5> value) {
			obj.setKeyCharacteristic(value.orElse(null));
		}
	};
	@XmlElement(name = "NcrptdKey")
	protected Max5000Binary encryptedKey;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Use in DUKPT Key to carry last 5 bytes of derivation value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Max5000Binary>> mmEncryptedKey = new MMMessageAttribute<PointOfInteractionComponentCharacteristics3, Optional<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmObject();
			isDerived = false;
			xmlTag = "NcrptdKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptedKey";
			definition = "Use in DUKPT Key to carry last 5 bytes of derivation value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(PointOfInteractionComponentCharacteristics3 obj) {
			return obj.getEncryptedKey();
		}

		@Override
		public void setValue(PointOfInteractionComponentCharacteristics3 obj, Optional<Max5000Binary> value) {
			obj.setEncryptedKey(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmMemory, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmCommunication,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmSecurityAccessModules, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmSubscriberIdentityModules,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmKeyCheckValue, com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmKeyCharacteristic,
						com.tools20022.repository.msg.PointOfInteractionComponentCharacteristics3.mmEncryptedKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PointOfInteractionComponentCharacteristics3";
				definition = "Physical and logical characteristics of a POI component (Point of Interaction).";
				nextVersions_lazy = () -> Arrays.asList(PointOfInteractionComponentCharacteristics4.mmObject());
				previousVersion_lazy = () -> PointOfInteractionComponentCharacteristics2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<MemoryCharacteristics1> getMemory() {
		return memory == null ? memory = new ArrayList<>() : memory;
	}

	public PointOfInteractionComponentCharacteristics3 setMemory(List<MemoryCharacteristics1> memory) {
		this.memory = Objects.requireNonNull(memory);
		return this;
	}

	public List<CommunicationCharacteristics3> getCommunication() {
		return communication == null ? communication = new ArrayList<>() : communication;
	}

	public PointOfInteractionComponentCharacteristics3 setCommunication(List<CommunicationCharacteristics3> communication) {
		this.communication = Objects.requireNonNull(communication);
		return this;
	}

	public Optional<Number> getSecurityAccessModules() {
		return securityAccessModules == null ? Optional.empty() : Optional.of(securityAccessModules);
	}

	public PointOfInteractionComponentCharacteristics3 setSecurityAccessModules(Number securityAccessModules) {
		this.securityAccessModules = securityAccessModules;
		return this;
	}

	public Optional<Number> getSubscriberIdentityModules() {
		return subscriberIdentityModules == null ? Optional.empty() : Optional.of(subscriberIdentityModules);
	}

	public PointOfInteractionComponentCharacteristics3 setSubscriberIdentityModules(Number subscriberIdentityModules) {
		this.subscriberIdentityModules = subscriberIdentityModules;
		return this;
	}

	public Optional<Max35Binary> getKeyCheckValue() {
		return keyCheckValue == null ? Optional.empty() : Optional.of(keyCheckValue);
	}

	public PointOfInteractionComponentCharacteristics3 setKeyCheckValue(Max35Binary keyCheckValue) {
		this.keyCheckValue = keyCheckValue;
		return this;
	}

	public Optional<KEKIdentifier5> getKeyCharacteristic() {
		return keyCharacteristic == null ? Optional.empty() : Optional.of(keyCharacteristic);
	}

	public PointOfInteractionComponentCharacteristics3 setKeyCharacteristic(KEKIdentifier5 keyCharacteristic) {
		this.keyCharacteristic = keyCharacteristic;
		return this;
	}

	public Optional<Max5000Binary> getEncryptedKey() {
		return encryptedKey == null ? Optional.empty() : Optional.of(encryptedKey);
	}

	public PointOfInteractionComponentCharacteristics3 setEncryptedKey(Max5000Binary encryptedKey) {
		this.encryptedKey = encryptedKey;
		return this;
	}
}