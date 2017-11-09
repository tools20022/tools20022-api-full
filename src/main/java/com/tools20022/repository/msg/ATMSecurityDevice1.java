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
import com.tools20022.repository.codeset.ATMStatus2Code;
import com.tools20022.repository.codeset.FailureReason5Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Hardware security module of the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmDeviceProperty
 * ATMSecurityDevice1.mmDeviceProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentConfiguration
 * ATMSecurityDevice1.mmCurrentConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmSupportedConfiguration
 * ATMSecurityDevice1.mmSupportedConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentStatus
 * ATMSecurityDevice1.mmCurrentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmIncident
 * ATMSecurityDevice1.mmIncident}</li>
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
 * "ATMSecurityDevice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Hardware security module of the ATM."</li>
 * </ul>
 */
public class ATMSecurityDevice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMEquipment2 deviceProperty;
	/**
	 * Hardware security module information, so called EPP for Encrypted PIN
	 * Pad.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment2
	 * ATMEquipment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
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
			componentContext_lazy = () -> ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "DvcPrprty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviceProperty";
			definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEquipment2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
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
			componentContext_lazy = () -> ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "CurCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentConfiguration";
			definition = "Configuration parameters in use by the security device.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration1.mmObject();
		}
	};
	protected ATMSecurityConfiguration1 supportedConfiguration;
	/**
	 * Configuration parameters supported by the security device.
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdCfgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters supported by the security device."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupportedConfiguration = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "SpprtdCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedConfiguration";
			definition = "Configuration parameters supported by the security device.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration1.mmObject();
		}
	};
	protected ATMStatus2Code currentStatus;
	/**
	 * Current status of the security device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus2Code
	 * ATMStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the security device."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrentStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Current status of the security device.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus2Code.mmObject();
		}
	};
	protected FailureReason5Code incident;
	/**
	 * Incident occurring on the device.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason5Code
	 * FailureReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
	 * ATMSecurityDevice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incdnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incident occurring on the device."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncident = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityDevice1.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring on the device.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason5Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityDevice1.mmDeviceProperty, ATMSecurityDevice1.mmCurrentConfiguration, ATMSecurityDevice1.mmSupportedConfiguration, ATMSecurityDevice1.mmCurrentStatus,
						ATMSecurityDevice1.mmIncident);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityDevice1";
				definition = "Hardware security module of the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEquipment2 getDeviceProperty() {
		return deviceProperty;
	}

	public void setDeviceProperty(com.tools20022.repository.msg.ATMEquipment2 deviceProperty) {
		this.deviceProperty = deviceProperty;
	}

	public ATMSecurityConfiguration1 getCurrentConfiguration() {
		return currentConfiguration;
	}

	public void setCurrentConfiguration(com.tools20022.repository.msg.ATMSecurityConfiguration1 currentConfiguration) {
		this.currentConfiguration = currentConfiguration;
	}

	public ATMSecurityConfiguration1 getSupportedConfiguration() {
		return supportedConfiguration;
	}

	public void setSupportedConfiguration(com.tools20022.repository.msg.ATMSecurityConfiguration1 supportedConfiguration) {
		this.supportedConfiguration = supportedConfiguration;
	}

	public ATMStatus2Code getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(ATMStatus2Code currentStatus) {
		this.currentStatus = currentStatus;
	}

	public FailureReason5Code getIncident() {
		return incident;
	}

	public void setIncident(FailureReason5Code incident) {
		this.incident = incident;
	}
}