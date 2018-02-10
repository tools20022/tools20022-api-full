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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ATMSecurityScheme2Code;
import com.tools20022.repository.codeset.ATMStatus1Code;
import com.tools20022.repository.codeset.MessageFunction8Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommandParameters1;
import com.tools20022.repository.msg.ATMConfigurationParameter1;
import com.tools20022.repository.msg.ATMConfigurationParameter2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specific parameters attached to an ATM command.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmATMRequiredGlobalStatus
 * ATMCommandParameters2Choice.mmATMRequiredGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmExpectedMessageFunction
 * ATMCommandParameters2Choice.mmExpectedMessageFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmRequiredConfigurationParameter
 * ATMCommandParameters2Choice.mmRequiredConfigurationParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmRequiredSecurityScheme
 * ATMCommandParameters2Choice.mmRequiredSecurityScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmSecurityDevice
 * ATMCommandParameters2Choice.mmSecurityDevice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmKey
 * ATMCommandParameters2Choice.mmKey}</li>
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
 * "ATMCommandParameters2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specific parameters attached to an ATM command."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice
 * ATMCommandParameters3Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
 * ATMCommandParameters1Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCommandParameters2Choice", propOrder = {"aTMRequiredGlobalStatus", "expectedMessageFunction", "requiredConfigurationParameter", "requiredSecurityScheme", "securityDevice", "key"})
public class ATMCommandParameters2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ATMReqrdGblSts", required = true)
	protected ATMStatus1Code aTMRequiredGlobalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus1Code
	 * ATMStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMReqrdGblSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMRequiredGlobalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Required status of the ATM, parameters of the status update command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmATMRequiredGlobalStatus
	 * ATMCommandParameters3Choice.mmATMRequiredGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmATMRequiredGlobalStatus
	 * ATMCommandParameters1Choice.mmATMRequiredGlobalStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMRequiredGlobalStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "ATMReqrdGblSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequiredGlobalStatus";
			definition = "Required status of the ATM, parameters of the status update command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmATMRequiredGlobalStatus);
			previousVersion_lazy = () -> ATMCommandParameters1Choice.mmATMRequiredGlobalStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "XpctdMsgFctn", required = true)
	protected MessageFunction8Code expectedMessageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdMsgFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedMessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message to send for the send message command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmExpectedMessageFunction
	 * ATMCommandParameters3Choice.mmExpectedMessageFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmExpectedMessageFunction
	 * ATMCommandParameters1Choice.mmExpectedMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "XpctdMsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedMessageFunction";
			definition = "Message to send for the send message command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmExpectedMessageFunction);
			previousVersion_lazy = () -> ATMCommandParameters1Choice.mmExpectedMessageFunction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction8Code.mmObject();
		}
	};
	@XmlElement(name = "ReqrdCfgtnParam", required = true)
	protected ATMConfigurationParameter1 requiredConfigurationParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter1
	 * ATMConfigurationParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdCfgtnParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredConfigurationParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to be used by the configuration update command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmRequiredConfigurationParameter
	 * ATMCommandParameters3Choice.mmRequiredConfigurationParameter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmRequiredConfigurationParameter
	 * ATMCommandParameters1Choice.mmRequiredConfigurationParameter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequiredConfigurationParameter = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "ReqrdCfgtnParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredConfigurationParameter";
			definition = "Parameters to be used by the configuration update command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmRequiredConfigurationParameter);
			previousVersion_lazy = () -> ATMCommandParameters1Choice.mmRequiredConfigurationParameter;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMConfigurationParameter1.mmObject();
		}
	};
	@XmlElement(name = "ReqrdSctySchme", required = true)
	protected ATMSecurityScheme2Code requiredSecurityScheme;
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
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSctySchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSecurityScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to be used by the security scheme update command."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmRequiredSecurityScheme
	 * ATMCommandParameters3Choice.mmRequiredSecurityScheme}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredSecurityScheme = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSctySchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSecurityScheme";
			definition = "Parameters to be used by the security scheme update command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmRequiredSecurityScheme);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMSecurityScheme2Code.mmObject();
		}
	};
	@XmlElement(name = "SctyDvc", required = true)
	protected ATMCommandParameters1 securityDevice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommandParameters1
	 * ATMCommandParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
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
	 * definition} =
	 * "Parameters to be used to update the configuration or the status security device."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmSecurityDevice
	 * ATMCommandParameters3Choice.mmSecurityDevice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDevice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "SctyDvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDevice";
			definition = "Parameters to be used to update the configuration or the status security device.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmSecurityDevice);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMCommandParameters1.mmObject();
		}
	};
	@XmlElement(name = "Key", required = true)
	protected ATMConfigurationParameter2 key;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2
	 * ATMConfigurationParameter2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
	 * ATMCommandParameters2Choice}</li>
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
	 * "Parameters to be used by the various cryptographic key commands."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice#mmKey
	 * ATMCommandParameters3Choice.mmKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKey = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ATMCommandParameters2Choice.mmObject();
			isDerived = false;
			xmlTag = "Key";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Key";
			definition = "Parameters to be used by the various cryptographic key commands.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmKey);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMConfigurationParameter2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ATMCommandParameters2Choice.mmATMRequiredGlobalStatus, com.tools20022.repository.choice.ATMCommandParameters2Choice.mmExpectedMessageFunction,
						com.tools20022.repository.choice.ATMCommandParameters2Choice.mmRequiredConfigurationParameter, com.tools20022.repository.choice.ATMCommandParameters2Choice.mmRequiredSecurityScheme,
						com.tools20022.repository.choice.ATMCommandParameters2Choice.mmSecurityDevice, com.tools20022.repository.choice.ATMCommandParameters2Choice.mmKey);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandParameters2Choice";
				definition = "Specific parameters attached to an ATM command.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters3Choice.mmObject());
				previousVersion_lazy = () -> ATMCommandParameters1Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMStatus1Code getATMRequiredGlobalStatus() {
		return aTMRequiredGlobalStatus;
	}

	public ATMCommandParameters2Choice setATMRequiredGlobalStatus(ATMStatus1Code aTMRequiredGlobalStatus) {
		this.aTMRequiredGlobalStatus = Objects.requireNonNull(aTMRequiredGlobalStatus);
		return this;
	}

	public MessageFunction8Code getExpectedMessageFunction() {
		return expectedMessageFunction;
	}

	public ATMCommandParameters2Choice setExpectedMessageFunction(MessageFunction8Code expectedMessageFunction) {
		this.expectedMessageFunction = Objects.requireNonNull(expectedMessageFunction);
		return this;
	}

	public ATMConfigurationParameter1 getRequiredConfigurationParameter() {
		return requiredConfigurationParameter;
	}

	public ATMCommandParameters2Choice setRequiredConfigurationParameter(ATMConfigurationParameter1 requiredConfigurationParameter) {
		this.requiredConfigurationParameter = Objects.requireNonNull(requiredConfigurationParameter);
		return this;
	}

	public ATMSecurityScheme2Code getRequiredSecurityScheme() {
		return requiredSecurityScheme;
	}

	public ATMCommandParameters2Choice setRequiredSecurityScheme(ATMSecurityScheme2Code requiredSecurityScheme) {
		this.requiredSecurityScheme = Objects.requireNonNull(requiredSecurityScheme);
		return this;
	}

	public ATMCommandParameters1 getSecurityDevice() {
		return securityDevice;
	}

	public ATMCommandParameters2Choice setSecurityDevice(ATMCommandParameters1 securityDevice) {
		this.securityDevice = Objects.requireNonNull(securityDevice);
		return this;
	}

	public ATMConfigurationParameter2 getKey() {
		return key;
	}

	public ATMCommandParameters2Choice setKey(ATMConfigurationParameter2 key) {
		this.key = Objects.requireNonNull(key);
		return this;
	}
}