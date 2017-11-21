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
import com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01;
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
 * Information related to the response of an ATM key download from an ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1#mmEnvironment
 * ATMKeyDownloadResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1#mmATMSecurityContext
 * ATMKeyDownloadResponse1.mmATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1#mmATMChallenge
 * ATMKeyDownloadResponse1.mmATMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1#mmHostSecurityParameters
 * ATMKeyDownloadResponse1.mmHostSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1#mmCommand
 * ATMKeyDownloadResponse1.mmCommand}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01#mmATMKeyDownloadResponse
 * ATMKeyDownloadResponseV01.mmATMKeyDownloadResponse}</li>
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
 * "ATMKeyDownloadResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM key download from an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMKeyDownloadResponse1", propOrder = {"environment", "ATMSecurityContext", "ATMChallenge", "hostSecurityParameters", "command"})
public class ATMKeyDownloadResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMEnvironment7 environment;
	/**
	 * Environment of the key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
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
	 * definition} = "Environment of the key download."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMEnvironment7.mmObject();
		}
	};
	protected ATMSecurityContext2 aTMSecurityContext;
	/**
	 * Context of the ATM for the key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityContext2
	 * ATMSecurityContext2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSctyCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMSecurityContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the ATM for the key download."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATMSecurityContext = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityContext2.mmObject();
		}
	};
	protected Max140Binary aTMChallenge;
	/**
	 * Random value from the ATM provided during a previous exchange.
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the ATM provided during a previous exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM provided during a previous exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected SecurityParameters5 hostSecurityParameters;
	/**
	 * Security parameters of the host downloading the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityParameters5
	 * SecurityParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstSctyParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostSecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security parameters of the host downloading the key."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostSecurityParameters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "HstSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostSecurityParameters";
			definition = "Security parameters of the host downloading the key.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityParameters5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCommand1> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand1
	 * ATMCommand1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMKeyDownloadResponse1.mmEnvironment, ATMKeyDownloadResponse1.mmATMSecurityContext, ATMKeyDownloadResponse1.mmATMChallenge, ATMKeyDownloadResponse1.mmHostSecurityParameters,
						ATMKeyDownloadResponse1.mmCommand);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMKeyDownloadResponseV01.mmATMKeyDownloadResponse);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadResponse1";
				definition = "Information related to the response of an ATM key download from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public ATMEnvironment7 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.ATMEnvironment7 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "ATMSctyCntxt", required = true)
	public ATMSecurityContext2 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public void setATMSecurityContext(com.tools20022.repository.msg.ATMSecurityContext2 aTMSecurityContext) {
		this.aTMSecurityContext = aTMSecurityContext;
	}

	@XmlElement(name = "ATMChllng")
	public Max140Binary getATMChallenge() {
		return aTMChallenge;
	}

	public void setATMChallenge(Max140Binary aTMChallenge) {
		this.aTMChallenge = aTMChallenge;
	}

	@XmlElement(name = "HstSctyParams", required = true)
	public SecurityParameters5 getHostSecurityParameters() {
		return hostSecurityParameters;
	}

	public void setHostSecurityParameters(com.tools20022.repository.msg.SecurityParameters5 hostSecurityParameters) {
		this.hostSecurityParameters = hostSecurityParameters;
	}

	@XmlElement(name = "Cmd")
	public List<ATMCommand1> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand1> command) {
		this.command = command;
	}
}