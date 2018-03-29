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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMEquipment3;
import com.tools20022.repository.msg.ATMSecurityConfiguration1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3#mmCurrentSecurityScheme
 * ATMSecurityContext3.mmCurrentSecurityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3#mmDeviceProperty
 * ATMSecurityContext3.mmDeviceProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3#mmCurrentConfiguration
 * ATMSecurityContext3.mmCurrentConfiguration}</li>
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
 * "ATMSecurityContext3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Context of the ATM for the key download."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
 * ATMSecurityContext2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityContext3", propOrder = {"currentSecurityScheme", "deviceProperty", "currentConfiguration"})
public class ATMSecurityContext3 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3
	 * ATMSecurityContext3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentSecurityScheme
	 * ATMSecurityContext2.mmCurrentSecurityScheme}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityContext3, ATMSecurityScheme3Code> mmCurrentSecurityScheme = new MMMessageAttribute<ATMSecurityContext3, ATMSecurityScheme3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext3.mmObject();
			isDerived = false;
			xmlTag = "CurSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentSecurityScheme";
			definition = "Key exchange security scheme in activation on the ATM for the host manager.";
			previousVersion_lazy = () -> ATMSecurityContext2.mmCurrentSecurityScheme;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme3Code.mmObject();
		}

		@Override
		public ATMSecurityScheme3Code getValue(ATMSecurityContext3 obj) {
			return obj.getCurrentSecurityScheme();
		}

		@Override
		public void setValue(ATMSecurityContext3 obj, ATMSecurityScheme3Code value) {
			obj.setCurrentSecurityScheme(value);
		}
	};
	@XmlElement(name = "DvcPrprty")
	protected ATMEquipment3 deviceProperty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment3
	 * ATMEquipment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3
	 * ATMSecurityContext3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmDeviceProperty
	 * ATMSecurityContext2.mmDeviceProperty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext3, Optional<ATMEquipment3>> mmDeviceProperty = new MMMessageAssociationEnd<ATMSecurityContext3, Optional<ATMEquipment3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext3.mmObject();
			isDerived = false;
			xmlTag = "DvcPrprty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviceProperty";
			definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
			previousVersion_lazy = () -> ATMSecurityContext2.mmDeviceProperty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMEquipment3.mmObject();
		}

		@Override
		public Optional<ATMEquipment3> getValue(ATMSecurityContext3 obj) {
			return obj.getDeviceProperty();
		}

		@Override
		public void setValue(ATMSecurityContext3 obj, Optional<ATMEquipment3> value) {
			obj.setDeviceProperty(value.orElse(null));
		}
	};
	@XmlElement(name = "CurCfgtn")
	protected ATMSecurityConfiguration1 currentConfiguration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext3
	 * ATMSecurityContext3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityContext2#mmCurrentConfiguration
	 * ATMSecurityContext2.mmCurrentConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityContext3, Optional<ATMSecurityConfiguration1>> mmCurrentConfiguration = new MMMessageAssociationEnd<ATMSecurityContext3, Optional<ATMSecurityConfiguration1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext3.mmObject();
			isDerived = false;
			xmlTag = "CurCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentConfiguration";
			definition = "Configuration parameters in use by the security device.";
			previousVersion_lazy = () -> ATMSecurityContext2.mmCurrentConfiguration;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public Optional<ATMSecurityConfiguration1> getValue(ATMSecurityContext3 obj) {
			return obj.getCurrentConfiguration();
		}

		@Override
		public void setValue(ATMSecurityContext3 obj, Optional<ATMSecurityConfiguration1> value) {
			obj.setCurrentConfiguration(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityContext3.mmCurrentSecurityScheme, com.tools20022.repository.msg.ATMSecurityContext3.mmDeviceProperty,
						com.tools20022.repository.msg.ATMSecurityContext3.mmCurrentConfiguration);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityContext3";
				definition = "Context of the ATM for the key download.";
				previousVersion_lazy = () -> ATMSecurityContext2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMSecurityScheme3Code getCurrentSecurityScheme() {
		return currentSecurityScheme;
	}

	public ATMSecurityContext3 setCurrentSecurityScheme(ATMSecurityScheme3Code currentSecurityScheme) {
		this.currentSecurityScheme = Objects.requireNonNull(currentSecurityScheme);
		return this;
	}

	public Optional<ATMEquipment3> getDeviceProperty() {
		return deviceProperty == null ? Optional.empty() : Optional.of(deviceProperty);
	}

	public ATMSecurityContext3 setDeviceProperty(ATMEquipment3 deviceProperty) {
		this.deviceProperty = deviceProperty;
		return this;
	}

	public Optional<ATMSecurityConfiguration1> getCurrentConfiguration() {
		return currentConfiguration == null ? Optional.empty() : Optional.of(currentConfiguration);
	}

	public ATMSecurityContext3 setCurrentConfiguration(ATMSecurityConfiguration1 currentConfiguration) {
		this.currentConfiguration = currentConfiguration;
		return this;
	}
}