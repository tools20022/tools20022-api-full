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
import com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02;
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
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmEnvironment
 * ATMKeyDownloadRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmCommandResult
 * ATMKeyDownloadRequest2.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmCommandContext
 * ATMKeyDownloadRequest2.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmATMSecurityContext
 * ATMKeyDownloadRequest2.mmATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmATMSecurityParameters
 * ATMKeyDownloadRequest2.mmATMSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmHostChallenge
 * ATMKeyDownloadRequest2.mmHostChallenge}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV02#mmATMKeyDownloadRequest
 * ATMKeyDownloadRequestV02.mmATMKeyDownloadRequest}</li>
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
 * "ATMKeyDownloadRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a key download from an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
 * ATMKeyDownloadRequest3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadRequest2", propOrder = {"environment", "commandResult", "commandContext", "aTMSecurityContext", "aTMSecurityParameters", "hostChallenge"})
public class ATMKeyDownloadRequest2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment15 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment15
	 * ATMEnvironment15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmEnvironment
	 * ATMKeyDownloadRequest3.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest2, ATMEnvironment15> mmEnvironment = new MMMessageAssociationEnd<ATMKeyDownloadRequest2, ATMEnvironment15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmEnvironment);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment15.mmObject();
		}

		@Override
		public ATMEnvironment15 getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, ATMEnvironment15 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmCommandResult
	 * ATMKeyDownloadRequest3.mmCommandResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest2, List<ATMCommand2>> mmCommandResult = new MMMessageAssociationEnd<ATMKeyDownloadRequest2, List<ATMCommand2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Result of a maintenance command performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmCommandResult);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand2.mmObject();
		}

		@Override
		public List<ATMCommand2> getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, List<ATMCommand2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmCommandContext
	 * ATMKeyDownloadRequest3.mmCommandContext}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest2, Optional<ATMCommand3>> mmCommandContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest2, Optional<ATMCommand3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Security command in progress inside which the key download is requested.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmCommandContext);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand3.mmObject();
		}

		@Override
		public Optional<ATMCommand3> getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, Optional<ATMCommand3> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmATMSecurityContext
	 * ATMKeyDownloadRequest3.mmATMSecurityContext}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest2, ATMSecurityContext2> mmATMSecurityContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest2, ATMSecurityContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmATMSecurityContext);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityContext2.mmObject();
		}

		@Override
		public ATMSecurityContext2 getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, ATMSecurityContext2 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmATMSecurityParameters
	 * ATMKeyDownloadRequest3.mmATMSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest2, SecurityParameters4> mmATMSecurityParameters = new MMMessageAssociationEnd<ATMKeyDownloadRequest2, SecurityParameters4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityParameters";
			definition = "Security parameters of the ATM for the initiated key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmATMSecurityParameters);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityParameters4.mmObject();
		}

		@Override
		public SecurityParameters4 getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getATMSecurityParameters();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, SecurityParameters4 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
	 * ATMKeyDownloadRequest2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmHostChallenge
	 * ATMKeyDownloadRequest3.mmHostChallenge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMKeyDownloadRequest2, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<ATMKeyDownloadRequest2, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmHostChallenge);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMKeyDownloadRequest2 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest2 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmEnvironment, com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmCommandResult,
						com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmCommandContext, com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmATMSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadRequest2.mmHostChallenge);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMKeyDownloadRequestV02.mmATMKeyDownloadRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMKeyDownloadRequest2";
				definition = "Information related to the request of a key download from an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment15 getEnvironment() {
		return environment;
	}

	public ATMKeyDownloadRequest2 setEnvironment(ATMEnvironment15 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand2> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMKeyDownloadRequest2 setCommandResult(List<ATMCommand2> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand3> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMKeyDownloadRequest2 setCommandContext(ATMCommand3 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public ATMSecurityContext2 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public ATMKeyDownloadRequest2 setATMSecurityContext(ATMSecurityContext2 aTMSecurityContext) {
		this.aTMSecurityContext = Objects.requireNonNull(aTMSecurityContext);
		return this;
	}

	public SecurityParameters4 getATMSecurityParameters() {
		return aTMSecurityParameters;
	}

	public ATMKeyDownloadRequest2 setATMSecurityParameters(SecurityParameters4 aTMSecurityParameters) {
		this.aTMSecurityParameters = Objects.requireNonNull(aTMSecurityParameters);
		return this;
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public ATMKeyDownloadRequest2 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}
}