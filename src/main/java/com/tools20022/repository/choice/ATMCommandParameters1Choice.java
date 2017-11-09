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
import com.tools20022.repository.codeset.ATMStatus1Code;
import com.tools20022.repository.codeset.MessageFunction8Code;
import com.tools20022.repository.entity.System;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMConfigurationParameter1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmATMRequiredGlobalStatus
 * ATMCommandParameters1Choice.mmATMRequiredGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmExpectedMessageFunction
 * ATMCommandParameters1Choice.mmExpectedMessageFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmRequiredConfigurationParameter
 * ATMCommandParameters1Choice.mmRequiredConfigurationParameter}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
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
 * "ATMCommandParameters1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specific parameters attached to an ATM command."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice
 * ATMCommandParameters2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMCommandParameters1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMStatus1Code aTMRequiredGlobalStatus;
	/**
	 * Required status of the ATM, parameters of the status update command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMStatus1Code
	 * ATMStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.System#mmStatus
	 * System.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
	 * ATMCommandParameters1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmATMRequiredGlobalStatus
	 * ATMCommandParameters2Choice.mmATMRequiredGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMRequiredGlobalStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> System.mmStatus;
			componentContext_lazy = () -> ATMCommandParameters1Choice.mmObject();
			isDerived = false;
			xmlTag = "ATMReqrdGblSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequiredGlobalStatus";
			definition = "Required status of the ATM, parameters of the status update command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters2Choice.mmATMRequiredGlobalStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMStatus1Code.mmObject();
		}
	};
	protected MessageFunction8Code expectedMessageFunction;
	/**
	 * Message to send for the send message command.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
	 * ATMCommandParameters1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmExpectedMessageFunction
	 * ATMCommandParameters2Choice.mmExpectedMessageFunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMCommandParameters1Choice.mmObject();
			isDerived = false;
			xmlTag = "XpctdMsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedMessageFunction";
			definition = "Message to send for the send message command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters2Choice.mmExpectedMessageFunction);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction8Code.mmObject();
		}
	};
	protected ATMConfigurationParameter1 requiredConfigurationParameter;
	/**
	 * Parameters to be used by the configuration update command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter1
	 * ATMConfigurationParameter1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice
	 * ATMCommandParameters1Choice}</li>
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
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters2Choice#mmRequiredConfigurationParameter
	 * ATMCommandParameters2Choice.mmRequiredConfigurationParameter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRequiredConfigurationParameter = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMCommandParameters1Choice.mmObject();
			isDerived = false;
			xmlTag = "ReqrdCfgtnParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredConfigurationParameter";
			definition = "Parameters to be used by the configuration update command.";
			nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters2Choice.mmRequiredConfigurationParameter);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMConfigurationParameter1.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMCommandParameters1Choice.mmATMRequiredGlobalStatus, ATMCommandParameters1Choice.mmExpectedMessageFunction, ATMCommandParameters1Choice.mmRequiredConfigurationParameter);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandParameters1Choice";
				definition = "Specific parameters attached to an ATM command.";
				nextVersions_lazy = () -> Arrays.asList(ATMCommandParameters2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMStatus1Code getATMRequiredGlobalStatus() {
		return aTMRequiredGlobalStatus;
	}

	public void setATMRequiredGlobalStatus(ATMStatus1Code aTMRequiredGlobalStatus) {
		this.aTMRequiredGlobalStatus = aTMRequiredGlobalStatus;
	}

	public MessageFunction8Code getExpectedMessageFunction() {
		return expectedMessageFunction;
	}

	public void setExpectedMessageFunction(MessageFunction8Code expectedMessageFunction) {
		this.expectedMessageFunction = expectedMessageFunction;
	}

	public ATMConfigurationParameter1 getRequiredConfigurationParameter() {
		return requiredConfigurationParameter;
	}

	public void setRequiredConfigurationParameter(ATMConfigurationParameter1 requiredConfigurationParameter) {
		this.requiredConfigurationParameter = requiredConfigurationParameter;
	}
}