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
import com.tools20022.repository.codeset.TR34Status1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMEquipment2;
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
 * Hardware security module of the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmDeviceProperty
 * ATMSecurityDevice2.mmDeviceProperty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmCurrentConfiguration
 * ATMSecurityDevice2.mmCurrentConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmSupportedConfiguration
 * ATMSecurityDevice2.mmSupportedConfiguration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmCurrentStatus
 * ATMSecurityDevice2.mmCurrentStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmIncident
 * ATMSecurityDevice2.mmIncident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2#mmBindingState
 * ATMSecurityDevice2.mmBindingState}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityDevice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Hardware security module of the ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1
 * ATMSecurityDevice1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMSecurityDevice2", propOrder = {"deviceProperty", "currentConfiguration", "supportedConfiguration", "currentStatus", "incident", "bindingState"})
public class ATMSecurityDevice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DvcPrprty")
	protected ATMEquipment2 deviceProperty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEquipment2
	 * ATMEquipment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvcPrprty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeviceProperty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Hardware security module information, so called EPP for Encrypted PIN Pad."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmDeviceProperty
	 * ATMSecurityDevice1.mmDeviceProperty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice2, Optional<ATMEquipment2>> mmDeviceProperty = new MMMessageAssociationEnd<ATMSecurityDevice2, Optional<ATMEquipment2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "DvcPrprty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeviceProperty";
			definition = "Hardware security module information, so called EPP for Encrypted PIN Pad.";
			previousVersion_lazy = () -> ATMSecurityDevice1.mmDeviceProperty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMEquipment2.mmObject();
		}

		@Override
		public Optional<ATMEquipment2> getValue(ATMSecurityDevice2 obj) {
			return obj.getDeviceProperty();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, Optional<ATMEquipment2> value) {
			obj.setDeviceProperty(value.orElse(null));
		}
	};
	@XmlElement(name = "CurCfgtn", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurCfgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters in use by the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentConfiguration
	 * ATMSecurityDevice1.mmCurrentConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice2, ATMSecurityConfiguration1> mmCurrentConfiguration = new MMMessageAssociationEnd<ATMSecurityDevice2, ATMSecurityConfiguration1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "CurCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentConfiguration";
			definition = "Configuration parameters in use by the security device.";
			previousVersion_lazy = () -> ATMSecurityDevice1.mmCurrentConfiguration;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public ATMSecurityConfiguration1 getValue(ATMSecurityDevice2 obj) {
			return obj.getCurrentConfiguration();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, ATMSecurityConfiguration1 value) {
			obj.setCurrentConfiguration(value);
		}
	};
	@XmlElement(name = "SpprtdCfgtn")
	protected ATMSecurityConfiguration1 supportedConfiguration;
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpprtdCfgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupportedConfiguration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters supported by the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmSupportedConfiguration
	 * ATMSecurityDevice1.mmSupportedConfiguration}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMSecurityDevice2, Optional<ATMSecurityConfiguration1>> mmSupportedConfiguration = new MMMessageAssociationEnd<ATMSecurityDevice2, Optional<ATMSecurityConfiguration1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "SpprtdCfgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupportedConfiguration";
			definition = "Configuration parameters supported by the security device.";
			previousVersion_lazy = () -> ATMSecurityDevice1.mmSupportedConfiguration;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSecurityConfiguration1.mmObject();
		}

		@Override
		public Optional<ATMSecurityConfiguration1> getValue(ATMSecurityDevice2 obj) {
			return obj.getSupportedConfiguration();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, Optional<ATMSecurityConfiguration1> value) {
			obj.setSupportedConfiguration(value.orElse(null));
		}
	};
	@XmlElement(name = "CurSts", required = true)
	protected ATMStatus2Code currentStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmCurrentStatus
	 * ATMSecurityDevice1.mmCurrentStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityDevice2, ATMStatus2Code> mmCurrentStatus = new MMMessageAttribute<ATMSecurityDevice2, ATMStatus2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "CurSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentStatus";
			definition = "Current status of the security device.";
			previousVersion_lazy = () -> ATMSecurityDevice1.mmCurrentStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus2Code.mmObject();
		}

		@Override
		public ATMStatus2Code getValue(ATMSecurityDevice2 obj) {
			return obj.getCurrentStatus();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, ATMStatus2Code value) {
			obj.setCurrentStatus(value);
		}
	};
	@XmlElement(name = "Incdnt")
	protected FailureReason5Code incident;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incdnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Incident occurring on the device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice1#mmIncident
	 * ATMSecurityDevice1.mmIncident}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityDevice2, Optional<FailureReason5Code>> mmIncident = new MMMessageAttribute<ATMSecurityDevice2, Optional<FailureReason5Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring on the device.";
			previousVersion_lazy = () -> ATMSecurityDevice1.mmIncident;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason5Code.mmObject();
		}

		@Override
		public Optional<FailureReason5Code> getValue(ATMSecurityDevice2 obj) {
			return obj.getIncident();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, Optional<FailureReason5Code> value) {
			obj.setIncident(value.orElse(null));
		}
	};
	@XmlElement(name = "BndgStat")
	protected TR34Status1Code bindingState;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TR34Status1Code
	 * TR34Status1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityDevice2
	 * ATMSecurityDevice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BndgStat"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BindingState"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Binding state of the security device."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMSecurityDevice2, Optional<TR34Status1Code>> mmBindingState = new MMMessageAttribute<ATMSecurityDevice2, Optional<TR34Status1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMSecurityDevice2.mmObject();
			isDerived = false;
			xmlTag = "BndgStat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BindingState";
			definition = "Binding state of the security device.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TR34Status1Code.mmObject();
		}

		@Override
		public Optional<TR34Status1Code> getValue(ATMSecurityDevice2 obj) {
			return obj.getBindingState();
		}

		@Override
		public void setValue(ATMSecurityDevice2 obj, Optional<TR34Status1Code> value) {
			obj.setBindingState(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityDevice2.mmDeviceProperty, com.tools20022.repository.msg.ATMSecurityDevice2.mmCurrentConfiguration,
						com.tools20022.repository.msg.ATMSecurityDevice2.mmSupportedConfiguration, com.tools20022.repository.msg.ATMSecurityDevice2.mmCurrentStatus, com.tools20022.repository.msg.ATMSecurityDevice2.mmIncident,
						com.tools20022.repository.msg.ATMSecurityDevice2.mmBindingState);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityDevice2";
				definition = "Hardware security module of the ATM.";
				previousVersion_lazy = () -> ATMSecurityDevice1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ATMEquipment2> getDeviceProperty() {
		return deviceProperty == null ? Optional.empty() : Optional.of(deviceProperty);
	}

	public ATMSecurityDevice2 setDeviceProperty(ATMEquipment2 deviceProperty) {
		this.deviceProperty = deviceProperty;
		return this;
	}

	public ATMSecurityConfiguration1 getCurrentConfiguration() {
		return currentConfiguration;
	}

	public ATMSecurityDevice2 setCurrentConfiguration(ATMSecurityConfiguration1 currentConfiguration) {
		this.currentConfiguration = Objects.requireNonNull(currentConfiguration);
		return this;
	}

	public Optional<ATMSecurityConfiguration1> getSupportedConfiguration() {
		return supportedConfiguration == null ? Optional.empty() : Optional.of(supportedConfiguration);
	}

	public ATMSecurityDevice2 setSupportedConfiguration(ATMSecurityConfiguration1 supportedConfiguration) {
		this.supportedConfiguration = supportedConfiguration;
		return this;
	}

	public ATMStatus2Code getCurrentStatus() {
		return currentStatus;
	}

	public ATMSecurityDevice2 setCurrentStatus(ATMStatus2Code currentStatus) {
		this.currentStatus = Objects.requireNonNull(currentStatus);
		return this;
	}

	public Optional<FailureReason5Code> getIncident() {
		return incident == null ? Optional.empty() : Optional.of(incident);
	}

	public ATMSecurityDevice2 setIncident(FailureReason5Code incident) {
		this.incident = incident;
		return this;
	}

	public Optional<TR34Status1Code> getBindingState() {
		return bindingState == null ? Optional.empty() : Optional.of(bindingState);
	}

	public ATMSecurityDevice2 setBindingState(TR34Status1Code bindingState) {
		this.bindingState = bindingState;
		return this;
	}
}