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
import com.tools20022.repository.codeset.ATMSecurityScheme1Code;
import com.tools20022.repository.codeset.ATMSecurityScheme2Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMSecurityDevice1;
import com.tools20022.repository.msg.CryptographicKey7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to security commands.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmCurrentSecurityScheme
 * ATMSecurityContext1.mmCurrentSecurityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmSecuritySchemeCapabilities
 * ATMSecurityContext1.mmSecuritySchemeCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmSecurityDevice
 * ATMSecurityContext1.mmSecurityDevice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmKey
 * ATMSecurityContext1.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmHostChallenge
 * ATMSecurityContext1.mmHostChallenge}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityContext1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to security commands."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext2
 * ATMSecurityContext2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext4
 * ATMSecurityContext4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityContext1", propOrder = {"currentSecurityScheme", "securitySchemeCapabilities", "securityDevice", "key", "hostChallenge"})
public class ATMSecurityContext1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurSctySchme", required = true)
	protected ATMSecurityScheme1Code currentSecurityScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme1Code
	 * ATMSecurityScheme1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
	 * ATMSecurityContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSctySchme"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentSecurityScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key exchange security scheme in activation on the ATM for the host manager."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentSecurityScheme
	 * ATMSecurityContext2.mmCurrentSecurityScheme}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmCurrentSecurityScheme
	 * ATMSecurityContext4.mmCurrentSecurityScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext1, ATMSecurityScheme1Code> mmCurrentSecurityScheme = new MMMessageAttribute<ATMSecurityContext1, ATMSecurityScheme1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "CurSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSecurityScheme";
			definition = "Key exchange security scheme in activation on the ATM for the host manager.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext2.mmCurrentSecurityScheme, ATMSecurityContext4.mmCurrentSecurityScheme);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme1Code.mmObject();
		}

		@Override
		public ATMSecurityScheme1Code getValue(ATMSecurityContext1 obj) {
			return obj.getCurrentSecurityScheme();
		}

		@Override
		public void setValue(ATMSecurityContext1 obj, ATMSecurityScheme1Code value) {
			obj.setCurrentSecurityScheme(value);
		}
	};
	@XmlElement(name = "SctySchmeCpblties")
	protected List<ATMSecurityScheme2Code> securitySchemeCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme2Code
	 * ATMSecurityScheme2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
	 * ATMSecurityContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctySchmeCpblties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritySchemeCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key exchange security schemes implemented in the hardware security module of the ATM."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmSecuritySchemeCapabilities
	 * ATMSecurityContext4.mmSecuritySchemeCapabilities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext1, List<ATMSecurityScheme2Code>> mmSecuritySchemeCapabilities = new MMMessageAttribute<ATMSecurityContext1, List<ATMSecurityScheme2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "SctySchmeCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySchemeCapabilities";
			definition = "Key exchange security schemes implemented in the hardware security module of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext4.mmSecuritySchemeCapabilities);
			minOccurs = 0;
			simpleType_lazy = () -> ATMSecurityScheme2Code.mmObject();
		}

		@Override
		public List<ATMSecurityScheme2Code> getValue(ATMSecurityContext1 obj) {
			return obj.getSecuritySchemeCapabilities();
		}

		@Override
		public void setValue(ATMSecurityContext1 obj, List<ATMSecurityScheme2Code> value) {
			obj.setSecuritySchemeCapabilities(value);
		}
	};
	@XmlElement(name = "SctyDvc", required = true)
	protected ATMSecurityDevice1 securityDevice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
	 * ATMSecurityContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDvc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hardware security module of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmSecurityDevice
	 * ATMSecurityContext4.mmSecurityDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext1, ATMSecurityDevice1> mmSecurityDevice = new MMMessageAssociationEnd<ATMSecurityContext1, ATMSecurityDevice1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "SctyDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDevice";
			definition = "Hardware security module of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext4.mmSecurityDevice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityDevice1.mmObject();
		}

		@Override
		public ATMSecurityDevice1 getValue(ATMSecurityContext1 obj) {
			return obj.getSecurityDevice();
		}

		@Override
		public void setValue(ATMSecurityContext1 obj, ATMSecurityDevice1 value) {
			obj.setSecurityDevice(value);
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey7> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey7
	 * CryptographicKey7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
	 * ATMSecurityContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Key"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cryptographic keys stored in the hardware security module of the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmKey
	 * ATMSecurityContext4.mmKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext1, List<CryptographicKey7>> mmKey = new MMMessageAssociationEnd<ATMSecurityContext1, List<CryptographicKey7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic keys stored in the hardware security module of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext4.mmKey);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey7.mmObject();
		}

		@Override
		public List<CryptographicKey7> getValue(ATMSecurityContext1 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(ATMSecurityContext1 obj, List<CryptographicKey7> value) {
			obj.setKey(value);
		}
	};
	@XmlElement(name = "HstChllng")
	protected Max140Binary hostChallenge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
	 * ATMSecurityContext1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the host provided during a previous exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmHostChallenge
	 * ATMSecurityContext4.mmHostChallenge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext1, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<ATMSecurityContext1, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext4.mmHostChallenge);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMSecurityContext1 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(ATMSecurityContext1 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityContext1.mmCurrentSecurityScheme, com.tools20022.repository.msg.ATMSecurityContext1.mmSecuritySchemeCapabilities,
						com.tools20022.repository.msg.ATMSecurityContext1.mmSecurityDevice, com.tools20022.repository.msg.ATMSecurityContext1.mmKey, com.tools20022.repository.msg.ATMSecurityContext1.mmHostChallenge);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityContext1";
				definition = "Information related to security commands.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext2.mmObject(), ATMSecurityContext4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMSecurityScheme1Code getCurrentSecurityScheme() {
		return currentSecurityScheme;
	}

	public ATMSecurityContext1 setCurrentSecurityScheme(ATMSecurityScheme1Code currentSecurityScheme) {
		this.currentSecurityScheme = Objects.requireNonNull(currentSecurityScheme);
		return this;
	}

	public List<ATMSecurityScheme2Code> getSecuritySchemeCapabilities() {
		return securitySchemeCapabilities == null ? securitySchemeCapabilities = new ArrayList<>() : securitySchemeCapabilities;
	}

	public ATMSecurityContext1 setSecuritySchemeCapabilities(List<ATMSecurityScheme2Code> securitySchemeCapabilities) {
		this.securitySchemeCapabilities = Objects.requireNonNull(securitySchemeCapabilities);
		return this;
	}

	public ATMSecurityDevice1 getSecurityDevice() {
		return securityDevice;
	}

	public ATMSecurityContext1 setSecurityDevice(ATMSecurityDevice1 securityDevice) {
		this.securityDevice = Objects.requireNonNull(securityDevice);
		return this;
	}

	public List<CryptographicKey7> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public ATMSecurityContext1 setKey(List<CryptographicKey7> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public ATMSecurityContext1 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}
}