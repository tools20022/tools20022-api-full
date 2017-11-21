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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityContext1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to security commands."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext2
 * ATMSecurityContext2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMSecurityContext1", propOrder = {"currentSecurityScheme", "securitySchemeCapabilities", "securityDevice", "key", "hostChallenge"})
public class ATMSecurityContext1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMSecurityScheme1Code currentSecurityScheme;
	/**
	 * Key exchange security scheme in activation on the ATM for the host
	 * manager.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentSecurityScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key exchange security scheme in activation on the ATM for the host manager."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentSecurityScheme
	 * ATMSecurityContext2.mmCurrentSecurityScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentSecurityScheme = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "CurSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSecurityScheme";
			definition = "Key exchange security scheme in activation on the ATM for the host manager.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext2.mmCurrentSecurityScheme);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme1Code.mmObject();
		}
	};
	protected List<ATMSecurityScheme2Code> securitySchemeCapabilities;
	/**
	 * Key exchange security schemes implemented in the hardware security module
	 * of the ATM.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritySchemeCapabilities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key exchange security schemes implemented in the hardware security module of the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritySchemeCapabilities = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "SctySchmeCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySchemeCapabilities";
			definition = "Key exchange security schemes implemented in the hardware security module of the ATM.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMSecurityScheme2Code.mmObject();
		}
	};
	protected ATMSecurityDevice1 securityDevice;
	/**
	 * Hardware security module of the ATM.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDevice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Hardware security module of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "SctyDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDevice";
			definition = "Hardware security module of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CryptographicKey7> key;
	/**
	 * Cryptographic keys stored in the hardware security module of the ATM.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Key"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cryptographic keys stored in the hardware security module of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic keys stored in the hardware security module of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CryptographicKey7.mmObject();
		}
	};
	protected Max140Binary hostChallenge;
	/**
	 * Random value from the host provided during a previous exchange.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the host provided during a previous exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityContext1.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityContext1.mmCurrentSecurityScheme, ATMSecurityContext1.mmSecuritySchemeCapabilities, ATMSecurityContext1.mmSecurityDevice, ATMSecurityContext1.mmKey,
						ATMSecurityContext1.mmHostChallenge);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityContext1";
				definition = "Information related to security commands.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityContext2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CurSctySchme", required = true)
	public ATMSecurityScheme1Code getCurrentSecurityScheme() {
		return currentSecurityScheme;
	}

	public void setCurrentSecurityScheme(ATMSecurityScheme1Code currentSecurityScheme) {
		this.currentSecurityScheme = currentSecurityScheme;
	}

	@XmlElement(name = "SctySchmeCpblties")
	public List<ATMSecurityScheme2Code> getSecuritySchemeCapabilities() {
		return securitySchemeCapabilities;
	}

	public void setSecuritySchemeCapabilities(List<ATMSecurityScheme2Code> securitySchemeCapabilities) {
		this.securitySchemeCapabilities = securitySchemeCapabilities;
	}

	@XmlElement(name = "SctyDvc", required = true)
	public ATMSecurityDevice1 getSecurityDevice() {
		return securityDevice;
	}

	public void setSecurityDevice(com.tools20022.repository.msg.ATMSecurityDevice1 securityDevice) {
		this.securityDevice = securityDevice;
	}

	@XmlElement(name = "Key")
	public List<CryptographicKey7> getKey() {
		return key;
	}

	public void setKey(List<com.tools20022.repository.msg.CryptographicKey7> key) {
		this.key = key;
	}

	@XmlElement(name = "HstChllng")
	public Max140Binary getHostChallenge() {
		return hostChallenge;
	}

	public void setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
	}
}