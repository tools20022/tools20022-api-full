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
import com.tools20022.repository.area.caam.HostToATMRequestV01;
import com.tools20022.repository.codeset.MessageFunction8Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request to an ATM to contact the ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmEnvironment
 * HostToATMRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmCommandIdentification
 * HostToATMRequest1.mmCommandIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1#mmExpectedMessageFunction
 * HostToATMRequest1.mmExpectedMessageFunction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmHostToATMRequest
 * HostToATMRequestV01.mmHostToATMRequest}</li>
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
 * "HostToATMRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request to an ATM to contact the ATM manager."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "HostToATMRequest1", propOrder = {"environment", "commandIdentification", "expectedMessageFunction"})
public class HostToATMRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMEnvironment9 environment;
	/**
	 * Environment of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment9
	 * ATMEnvironment9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEnvironment9.mmObject();
		}
	};
	protected ATMCommandIdentification1 commandIdentification;
	/**
	 * Identification of the entity issuing the command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1
	 * ATMCommandIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity issuing the command."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommandIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommandIdentification1.mmObject();
		}
	};
	protected MessageFunction8Code expectedMessageFunction;
	/**
	 * Message that have to be sent by the ATM.
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
	 * {@linkplain com.tools20022.repository.msg.HostToATMRequest1
	 * HostToATMRequest1}</li>
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
	 * definition} = "Message that have to be sent by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> HostToATMRequest1.mmObject();
			isDerived = false;
			xmlTag = "XpctdMsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedMessageFunction";
			definition = "Message that have to be sent by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction8Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(HostToATMRequest1.mmEnvironment, HostToATMRequest1.mmCommandIdentification, HostToATMRequest1.mmExpectedMessageFunction);
				messageBuildingBlock_lazy = () -> Arrays.asList(HostToATMRequestV01.mmHostToATMRequest);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HostToATMRequest1";
				definition = "Information related to the request to an ATM to contact the ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public ATMEnvironment9 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.ATMEnvironment9 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "CmdId")
	public ATMCommandIdentification1 getCommandIdentification() {
		return commandIdentification;
	}

	public void setCommandIdentification(com.tools20022.repository.msg.ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
	}

	@XmlElement(name = "XpctdMsgFctn", required = true)
	public MessageFunction8Code getExpectedMessageFunction() {
		return expectedMessageFunction;
	}

	public void setExpectedMessageFunction(MessageFunction8Code expectedMessageFunction) {
		this.expectedMessageFunction = expectedMessageFunction;
	}
}