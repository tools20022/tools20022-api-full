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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Context of the ATM for the key download.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentSecurityScheme
 * ATMSecurityContext2.mmCurrentSecurityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmDeviceProperty
 * ATMSecurityContext2.mmDeviceProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentConfiguration
 * ATMSecurityContext2.mmCurrentConfiguration}</li>
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
 * "ATMSecurityContext2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Context of the ATM for the key download."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1
 * ATMSecurityContext1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMSecurityContext2", propOrder = {"currentSecurityScheme", "deviceProperty", "currentConfiguration"})
public class ATMSecurityContext2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
	 * ATMSecurityContext2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext1#mmCurrentSecurityScheme
	 * ATMSecurityContext1.mmCurrentSecurityScheme}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentSecurityScheme = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityContext2.mmObject();
			isDerived = false;
			xmlTag = "CurSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSecurityScheme";
			definition = "Key exchange security scheme in activation on the ATM for the host manager.";
			previousVersion_lazy = () -> ATMSecurityContext1.mmCurrentSecurityScheme;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme1Code.mmObject();
		}
	};
	protected ATMEquipment3 deviceProperty;
	/**
	 * Hardware security module information, so called EPP for Encrypted PIN
	 * Pad.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment3
	 * ATMEquipment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
	 * ATMSecurityContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvcPrprty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviceProperty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hardware security module information, so called EPP for Encrypted PIN Pad."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeviceProperty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityContext2.mmObject();
			isDerived = false;
			xmlTag = "DvcPrprty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviceProperty";
			definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEquipment3.mmObject();
		}
	};
	protected ATMSecurityConfiguration1 currentConfiguration;
	/**
	 * Configuration parameters in use by the security device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
	 * ATMSecurityContext2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters in use by the security device."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentConfiguration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityContext2.mmObject();
			isDerived = false;
			xmlTag = "CurCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentConfiguration";
			definition = "Configuration parameters in use by the security device.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityContext2.mmCurrentSecurityScheme, ATMSecurityContext2.mmDeviceProperty, ATMSecurityContext2.mmCurrentConfiguration);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityContext2";
				definition = "Context of the ATM for the key download.";
				previousVersion_lazy = () -> ATMSecurityContext1.mmObject();
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

	@XmlElement(name = "DvcPrprty")
	public ATMEquipment3 getDeviceProperty() {
		return deviceProperty;
	}

	public void setDeviceProperty(com.tools20022.repository.msg.ATMEquipment3 deviceProperty) {
		this.deviceProperty = deviceProperty;
	}

	@XmlElement(name = "CurCfgtn")
	public ATMSecurityConfiguration1 getCurrentConfiguration() {
		return currentConfiguration;
	}

	public void setCurrentConfiguration(com.tools20022.repository.msg.ATMSecurityConfiguration1 currentConfiguration) {
		this.currentConfiguration = currentConfiguration;
	}
}