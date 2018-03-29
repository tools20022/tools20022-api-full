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
import com.tools20022.repository.codeset.ATMSecurityScheme3Code;
import com.tools20022.repository.codeset.ATMSecurityScheme4Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMSecurityDevice2;
import com.tools20022.repository.msg.CryptographicKey11;
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
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5#mmCurrentSecurityScheme
 * ATMSecurityContext5.mmCurrentSecurityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5#mmSecuritySchemeCapabilities
 * ATMSecurityContext5.mmSecuritySchemeCapabilities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5#mmSecurityDevice
 * ATMSecurityContext5.mmSecurityDevice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityContext5#mmKey
 * ATMSecurityContext5.mmKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5#mmHostChallenge
 * ATMSecurityContext5.mmHostChallenge}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityContext5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to security commands."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4
 * ATMSecurityContext4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityContext5", propOrder = {"currentSecurityScheme", "securitySchemeCapabilities", "securityDevice", "key", "hostChallenge"})
public class ATMSecurityContext5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurSctySchme", required = true)
	protected ATMSecurityScheme3Code currentSecurityScheme;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme3Code
	 * ATMSecurityScheme3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5
	 * ATMSecurityContext5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmCurrentSecurityScheme
	 * ATMSecurityContext4.mmCurrentSecurityScheme}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext5, ATMSecurityScheme3Code> mmCurrentSecurityScheme = new MMMessageAttribute<ATMSecurityContext5, ATMSecurityScheme3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext5.mmObject();
			isDerived = false;
			xmlTag = "CurSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSecurityScheme";
			definition = "Key exchange security scheme in activation on the ATM for the host manager.";
			previousVersion_lazy = () -> ATMSecurityContext4.mmCurrentSecurityScheme;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme3Code.mmObject();
		}

		@Override
		public ATMSecurityScheme3Code getValue(ATMSecurityContext5 obj) {
			return obj.getCurrentSecurityScheme();
		}

		@Override
		public void setValue(ATMSecurityContext5 obj, ATMSecurityScheme3Code value) {
			obj.setCurrentSecurityScheme(value);
		}
	};
	@XmlElement(name = "SctySchmeCpblties")
	protected List<ATMSecurityScheme4Code> securitySchemeCapabilities;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMSecurityScheme4Code
	 * ATMSecurityScheme4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5
	 * ATMSecurityContext5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmSecuritySchemeCapabilities
	 * ATMSecurityContext4.mmSecuritySchemeCapabilities}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext5, List<ATMSecurityScheme4Code>> mmSecuritySchemeCapabilities = new MMMessageAttribute<ATMSecurityContext5, List<ATMSecurityScheme4Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext5.mmObject();
			isDerived = false;
			xmlTag = "SctySchmeCpblties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritySchemeCapabilities";
			definition = "Key exchange security schemes implemented in the hardware security module of the ATM.";
			previousVersion_lazy = () -> ATMSecurityContext4.mmSecuritySchemeCapabilities;
			minOccurs = 0;
			simpleType_lazy = () -> ATMSecurityScheme4Code.mmObject();
		}

		@Override
		public List<ATMSecurityScheme4Code> getValue(ATMSecurityContext5 obj) {
			return obj.getSecuritySchemeCapabilities();
		}

		@Override
		public void setValue(ATMSecurityContext5 obj, List<ATMSecurityScheme4Code> value) {
			obj.setSecuritySchemeCapabilities(value);
		}
	};
	@XmlElement(name = "SctyDvc", required = true)
	protected ATMSecurityDevice2 securityDevice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5
	 * ATMSecurityContext5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmSecurityDevice
	 * ATMSecurityContext4.mmSecurityDevice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext5, ATMSecurityDevice2> mmSecurityDevice = new MMMessageAssociationEnd<ATMSecurityContext5, ATMSecurityDevice2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext5.mmObject();
			isDerived = false;
			xmlTag = "SctyDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDevice";
			definition = "Hardware security module of the ATM.";
			previousVersion_lazy = () -> ATMSecurityContext4.mmSecurityDevice;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityDevice2.mmObject();
		}

		@Override
		public ATMSecurityDevice2 getValue(ATMSecurityContext5 obj) {
			return obj.getSecurityDevice();
		}

		@Override
		public void setValue(ATMSecurityContext5 obj, ATMSecurityDevice2 value) {
			obj.setSecurityDevice(value);
		}
	};
	@XmlElement(name = "Key")
	protected List<CryptographicKey11> key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CryptographicKey11
	 * CryptographicKey11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5
	 * ATMSecurityContext5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmKey
	 * ATMSecurityContext4.mmKey}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext5, List<CryptographicKey11>> mmKey = new MMMessageAssociationEnd<ATMSecurityContext5, List<CryptographicKey11>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext5.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Cryptographic keys stored in the hardware security module of the ATM.";
			previousVersion_lazy = () -> ATMSecurityContext4.mmKey;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CryptographicKey11.mmObject();
		}

		@Override
		public List<CryptographicKey11> getValue(ATMSecurityContext5 obj) {
			return obj.getKey();
		}

		@Override
		public void setValue(ATMSecurityContext5 obj, List<CryptographicKey11> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext5
	 * ATMSecurityContext5}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext4#mmHostChallenge
	 * ATMSecurityContext4.mmHostChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext5, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<ATMSecurityContext5, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext5.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			previousVersion_lazy = () -> ATMSecurityContext4.mmHostChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMSecurityContext5 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(ATMSecurityContext5 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityContext5.mmCurrentSecurityScheme, com.tools20022.repository.msg.ATMSecurityContext5.mmSecuritySchemeCapabilities,
						com.tools20022.repository.msg.ATMSecurityContext5.mmSecurityDevice, com.tools20022.repository.msg.ATMSecurityContext5.mmKey, com.tools20022.repository.msg.ATMSecurityContext5.mmHostChallenge);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityContext5";
				definition = "Information related to security commands.";
				previousVersion_lazy = () -> ATMSecurityContext4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMSecurityScheme3Code getCurrentSecurityScheme() {
		return currentSecurityScheme;
	}

	public ATMSecurityContext5 setCurrentSecurityScheme(ATMSecurityScheme3Code currentSecurityScheme) {
		this.currentSecurityScheme = Objects.requireNonNull(currentSecurityScheme);
		return this;
	}

	public List<ATMSecurityScheme4Code> getSecuritySchemeCapabilities() {
		return securitySchemeCapabilities == null ? securitySchemeCapabilities = new ArrayList<>() : securitySchemeCapabilities;
	}

	public ATMSecurityContext5 setSecuritySchemeCapabilities(List<ATMSecurityScheme4Code> securitySchemeCapabilities) {
		this.securitySchemeCapabilities = Objects.requireNonNull(securitySchemeCapabilities);
		return this;
	}

	public ATMSecurityDevice2 getSecurityDevice() {
		return securityDevice;
	}

	public ATMSecurityContext5 setSecurityDevice(ATMSecurityDevice2 securityDevice) {
		this.securityDevice = Objects.requireNonNull(securityDevice);
		return this;
	}

	public List<CryptographicKey11> getKey() {
		return key == null ? key = new ArrayList<>() : key;
	}

	public ATMSecurityContext5 setKey(List<CryptographicKey11> key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public ATMSecurityContext5 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}
}