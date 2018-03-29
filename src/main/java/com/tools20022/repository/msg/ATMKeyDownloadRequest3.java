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
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmEnvironment
 * ATMKeyDownloadRequest3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmCommandResult
 * ATMKeyDownloadRequest3.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmCommandContext
 * ATMKeyDownloadRequest3.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmATMSecurityContext
 * ATMKeyDownloadRequest3.mmATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmATMSecurityParameters
 * ATMKeyDownloadRequest3.mmATMSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3#mmHostChallenge
 * ATMKeyDownloadRequest3.mmHostChallenge}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMKeyDownloadRequest3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a key download from an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4
 * ATMKeyDownloadRequest4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2
 * ATMKeyDownloadRequest2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadRequest3", propOrder = {"environment", "commandResult", "commandContext", "aTMSecurityContext", "aTMSecurityParameters", "hostChallenge"})
public class ATMKeyDownloadRequest3 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmEnvironment
	 * ATMKeyDownloadRequest4.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmEnvironment
	 * ATMKeyDownloadRequest2.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest3, ATMEnvironment15> mmEnvironment = new MMMessageAssociationEnd<ATMKeyDownloadRequest3, ATMEnvironment15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmEnvironment);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment15.mmObject();
		}

		@Override
		public ATMEnvironment15 getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, ATMEnvironment15 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "CmdRslt")
	protected List<ATMCommand11> commandResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand11
	 * ATMCommand11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmCommandResult
	 * ATMKeyDownloadRequest4.mmCommandResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmCommandResult
	 * ATMKeyDownloadRequest2.mmCommandResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest3, List<ATMCommand11>> mmCommandResult = new MMMessageAssociationEnd<ATMKeyDownloadRequest3, List<ATMCommand11>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Result of a maintenance command performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmCommandResult);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmCommandResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand11.mmObject();
		}

		@Override
		public List<ATMCommand11> getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, List<ATMCommand11> value) {
			obj.setCommandResult(value);
		}
	};
	@XmlElement(name = "CmdCntxt")
	protected ATMCommand12 commandContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand12
	 * ATMCommand12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmCommandContext
	 * ATMKeyDownloadRequest4.mmCommandContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmCommandContext
	 * ATMKeyDownloadRequest2.mmCommandContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest3, Optional<ATMCommand12>> mmCommandContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest3, Optional<ATMCommand12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Security command in progress inside which the key download is requested.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmCommandContext);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmCommandContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand12.mmObject();
		}

		@Override
		public Optional<ATMCommand12> getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, Optional<ATMCommand12> value) {
			obj.setCommandContext(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMSctyCntxt", required = true)
	protected ATMSecurityContext3 aTMSecurityContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityContext3
	 * ATMSecurityContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmATMSecurityContext
	 * ATMKeyDownloadRequest4.mmATMSecurityContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmATMSecurityContext
	 * ATMKeyDownloadRequest2.mmATMSecurityContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest3, ATMSecurityContext3> mmATMSecurityContext = new MMMessageAssociationEnd<ATMKeyDownloadRequest3, ATMSecurityContext3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmATMSecurityContext);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmATMSecurityContext;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityContext3.mmObject();
		}

		@Override
		public ATMSecurityContext3 getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, ATMSecurityContext3 value) {
			obj.setATMSecurityContext(value);
		}
	};
	@XmlElement(name = "ATMSctyParams", required = true)
	protected SecurityParameters7 aTMSecurityParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityParameters7
	 * SecurityParameters7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmATMSecurityParameters
	 * ATMKeyDownloadRequest4.mmATMSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmATMSecurityParameters
	 * ATMKeyDownloadRequest2.mmATMSecurityParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadRequest3, SecurityParameters7> mmATMSecurityParameters = new MMMessageAssociationEnd<ATMKeyDownloadRequest3, SecurityParameters7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityParameters";
			definition = "Security parameters of the ATM for the initiated key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmATMSecurityParameters);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmATMSecurityParameters;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityParameters7.mmObject();
		}

		@Override
		public SecurityParameters7 getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getATMSecurityParameters();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, SecurityParameters7 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest3
	 * ATMKeyDownloadRequest3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest4#mmHostChallenge
	 * ATMKeyDownloadRequest4.mmHostChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadRequest2#mmHostChallenge
	 * ATMKeyDownloadRequest2.mmHostChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMKeyDownloadRequest3, Optional<Max140Binary>> mmHostChallenge = new MMMessageAttribute<ATMKeyDownloadRequest3, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmHostChallenge);
			previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmHostChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMKeyDownloadRequest3 obj) {
			return obj.getHostChallenge();
		}

		@Override
		public void setValue(ATMKeyDownloadRequest3 obj, Optional<Max140Binary> value) {
			obj.setHostChallenge(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmEnvironment, com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmCommandResult,
						com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmCommandContext, com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmATMSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadRequest3.mmHostChallenge);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATMKeyDownloadRequest3";
				definition = "Information related to the request of a key download from an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadRequest4.mmObject());
				previousVersion_lazy = () -> ATMKeyDownloadRequest2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment15 getEnvironment() {
		return environment;
	}

	public ATMKeyDownloadRequest3 setEnvironment(ATMEnvironment15 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public List<ATMCommand11> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMKeyDownloadRequest3 setCommandResult(List<ATMCommand11> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand12> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMKeyDownloadRequest3 setCommandContext(ATMCommand12 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public ATMSecurityContext3 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public ATMKeyDownloadRequest3 setATMSecurityContext(ATMSecurityContext3 aTMSecurityContext) {
		this.aTMSecurityContext = Objects.requireNonNull(aTMSecurityContext);
		return this;
	}

	public SecurityParameters7 getATMSecurityParameters() {
		return aTMSecurityParameters;
	}

	public ATMKeyDownloadRequest3 setATMSecurityParameters(SecurityParameters7 aTMSecurityParameters) {
		this.aTMSecurityParameters = Objects.requireNonNull(aTMSecurityParameters);
		return this;
	}

	public Optional<Max140Binary> getHostChallenge() {
		return hostChallenge == null ? Optional.empty() : Optional.of(hostChallenge);
	}

	public ATMKeyDownloadRequest3 setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
		return this;
	}
}