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
import com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a key download from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmEnvironment
 * ATMKeyDownloadRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmCommandResult
 * ATMKeyDownloadRequest1.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmCommandContext
 * ATMKeyDownloadRequest1.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmATMSecurityContext
 * ATMKeyDownloadRequest1.mmATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmATMSecurityParameters
 * ATMKeyDownloadRequest1.mmATMSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1#mmHostChallenge
 * ATMKeyDownloadRequest1.mmHostChallenge}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01#mmATMKeyDownloadRequest
 * ATMKeyDownloadRequestV01.mmATMKeyDownloadRequest}</li>
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
 * "ATMKeyDownloadRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a key download from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadRequest1", propOrder = {"environment", "commandResult", "commandContext", "aTMSecurityContext", "aTMSecurityParameters", "hostChallenge"})
public class ATMKeyDownloadRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment8 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment8
	 * ATMEnvironment8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
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
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest1, ATMEnvironment8> mmEnvironment = new MMMessageAssociationEnd<ATMKeyDownloadRequest1, ATMEnvironment8>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment8.mmObject();
		}

		@Override
		public ATMEnvironment8 getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, ATMEnvironment8 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "CmdRslt")
	protected List<ATMCommand2> commandResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand2
	 * ATMCommand2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of a maintenance command performed by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest1, List<ATMCommand2>> mmCommandResult = new MMMessageAssociationEnd<ATMKeyDownloadRequest1, List<ATMCommand2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Result of a maintenance command performed by the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand2.mmObject();
		}

		@Override
		public List<ATMCommand2> getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, List<ATMCommand2> value) {
			obj.setCommandResult(value);
		}
	};
	@XmlElement(name = "CmdCntxt")
	protected ATMCommand3 commandContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand3
	 * ATMCommand3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdCntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandContext"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security command in progress inside which the key download is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest1, Optional<ATMCommand3>> mmCommandContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest1, Optional<ATMCommand3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Security command in progress inside which the key download is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand3.mmObject();
		}

		@Override
		public Optional<ATMCommand3> getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, Optional<ATMCommand3> value) {
			obj.setCommandContext(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
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
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest1, ATMSecurityContext2> mmATMSecurityContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest1, ATMSecurityContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
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
		public ATMSecurityContext2 getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, ATMSecurityContext2 value) {
			obj.setATMSecurityContext(value);
		}
	};
	@XmlElement(name = "ATMSctyParams", required = true)
	protected SecurityParameters4 aTMSecurityParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityParameters4
	 * SecurityParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMSctyParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMSecurityParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security parameters of the ATM for the initiated key download."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest1, SecurityParameters4> mmATMSecurityParameters = new MMMessageAssociationEnd<ATMKeyDownloadRequest1, SecurityParameters4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityParameters";
			definition = "Security parameters of the ATM for the initiated key download.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityParameters4.mmObject();
		}

		@Override
		public SecurityParameters4 getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getATMSecurityParameters();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, SecurityParameters4 value) {
			obj.setATMSecurityParameters(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest1
	 * ATMKeyDownloadRequest1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMKeyDownloadRequest1, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<ATMKeyDownloadRequest1, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMKeyDownloadRequest1 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest1 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmEnvironment, com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmCommandResult,
						com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmCommandContext, com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmATMSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadRequest1.mmHostChallenge);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMKeyDownloadRequestV01.mmATMKeyDownloadRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadRequest1";
				definition = "Information related to the request of a key download from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment8 getEnvironment() {
		return environment;
	}

	public ATMKeyDownloadRequest1 setEnvironment(ATMEnvironment8 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand2> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMKeyDownloadRequest1 setCommandResult(List<ATMCommand2> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand3> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMKeyDownloadRequest1 setCommandContext(ATMCommand3 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public ATMSecurityContext2 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public ATMKeyDownloadRequest1 setATMSecurityContext(ATMSecurityContext2 aTMSecurityContext) {
		this.aTMSecurityContext = Objects.requireNonNull(aTMSecurityContext);
		return this;
	}

	public SecurityParameters4 getATMSecurityParameters() {
		return aTMSecurityParameters;
	}

	public ATMKeyDownloadRequest1 setATMSecurityParameters(SecurityParameters4 aTMSecurityParameters) {
		this.aTMSecurityParameters = Objects.requireNonNull(aTMSecurityParameters);
		return this;
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public ATMKeyDownloadRequest1 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}
}