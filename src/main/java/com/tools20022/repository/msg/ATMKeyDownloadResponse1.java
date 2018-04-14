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
import com.tools20022.repository.msg.ATMCommand1;
import com.tools20022.repository.msg.ATMEnvironment7;
import com.tools20022.repository.msg.ATMSecurityContext2;
import com.tools20022.repository.msg.SecurityParameters5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMKeyDownloadResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM key download from an ATM manager."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadResponse1", propOrder = {"environment", "aTMSecurityContext", "aTMChallenge", "hostSecurityParameters", "command"})
public class ATMKeyDownloadResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment7 environment;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the key download."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse1, ATMEnvironment7> mmEnvironment = new MMMessageAssociationEnd<ATMKeyDownloadResponse1, ATMEnvironment7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment7.mmObject();
		}

		@Override
		public ATMEnvironment7 getValue(ATMKeyDownloadResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse1 obj, ATMEnvironment7 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "ATMSctyCntxt", required = true)
	protected ATMSecurityContext2 aTMSecurityContext;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMSecurityContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context of the ATM for the key download."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse1, ATMSecurityContext2> mmATMSecurityContext = new MMMessageAssociationEnd<ATMKeyDownloadResponse1, ATMSecurityContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityContext2.mmObject();
		}

		@Override
		public ATMSecurityContext2 getValue(ATMKeyDownloadResponse1 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse1 obj, ATMSecurityContext2 value) {
			obj.setATMSecurityContext(value);
		}
	};
	@XmlElement(name = "ATMChllng")
	protected Max140Binary aTMChallenge;
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse1
	 * ATMKeyDownloadResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMChllng"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the ATM provided during a previous exchange."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMKeyDownloadResponse1, Optional<Max140Binary>> mmATMChallenge = new MMMessageAttribute<ATMKeyDownloadResponse1, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM provided during a previous exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMKeyDownloadResponse1 obj) {
			return obj.getATMChallenge();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse1 obj, Optional<Max140Binary> value) {
			obj.setATMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "HstSctyParams", required = true)
	protected SecurityParameters5 hostSecurityParameters;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostSecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security parameters of the host downloading the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse1, SecurityParameters5> mmHostSecurityParameters = new MMMessageAssociationEnd<ATMKeyDownloadResponse1, SecurityParameters5>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "HstSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostSecurityParameters";
			definition = "Security parameters of the host downloading the key.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityParameters5.mmObject();
		}

		@Override
		public SecurityParameters5 getValue(ATMKeyDownloadResponse1 obj) {
			return obj.getHostSecurityParameters();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse1 obj, SecurityParameters5 value) {
			obj.setHostSecurityParameters(value);
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand1> command;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse1, List<ATMCommand1>> mmCommand = new MMMessageAssociationEnd<ATMKeyDownloadResponse1, List<ATMCommand1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand1.mmObject();
		}

		@Override
		public List<ATMCommand1> getValue(ATMKeyDownloadResponse1 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse1 obj, List<ATMCommand1> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmEnvironment, com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmATMChallenge, com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmHostSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadResponse1.mmCommand);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMKeyDownloadResponseV01.mmATMKeyDownloadResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadResponse1";
				definition = "Information related to the response of an ATM key download from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment7 getEnvironment() {
		return environment;
	}

	public ATMKeyDownloadResponse1 setEnvironment(ATMEnvironment7 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMSecurityContext2 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public ATMKeyDownloadResponse1 setATMSecurityContext(ATMSecurityContext2 aTMSecurityContext) {
		this.aTMSecurityContext = Objects.requireNonNull(aTMSecurityContext);
		return this;
	}

	public Optional<Max140Binary> getATMChallenge() {
		return aTMChallenge == null ? Optional.empty() : Optional.of(aTMChallenge);
	}

	public ATMKeyDownloadResponse1 setATMChallenge(Max140Binary aTMChallenge) {
		this.aTMChallenge = aTMChallenge;
		return this;
	}

	public SecurityParameters5 getHostSecurityParameters() {
		return hostSecurityParameters;
	}

	public ATMKeyDownloadResponse1 setHostSecurityParameters(SecurityParameters5 hostSecurityParameters) {
		this.hostSecurityParameters = Objects.requireNonNull(hostSecurityParameters);
		return this;
	}

	public List<ATMCommand1> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMKeyDownloadResponse1 setCommand(List<ATMCommand1> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}