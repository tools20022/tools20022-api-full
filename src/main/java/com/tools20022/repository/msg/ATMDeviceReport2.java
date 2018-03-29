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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the report from an ATM device.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDeviceReport2#mmEnvironment
 * ATMDeviceReport2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2#mmATMGlobalStatus
 * ATMDeviceReport2.mmATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2#mmCommandResult
 * ATMDeviceReport2.mmCommandResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2#mmCommandContext
 * ATMDeviceReport2.mmCommandContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2#mmATMSecurityContext
 * ATMDeviceReport2.mmATMSecurityContext}</li>
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
 * "ATMDeviceReport2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the report from an ATM device."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDeviceReport3
 * ATMDeviceReport3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1 ATMDeviceReport1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDeviceReport2", propOrder = {"environment", "aTMGlobalStatus", "commandResult", "commandContext", "aTMSecurityContext"})
public class ATMDeviceReport2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment6 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment6
	 * ATMEnvironment6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2
	 * ATMDeviceReport2}</li>
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
	 * definition} = "Environment of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport3#mmEnvironment
	 * ATMDeviceReport3.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1#mmEnvironment
	 * ATMDeviceReport1.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceReport2, ATMEnvironment6> mmEnvironment = new MMMessageAssociationEnd<ATMDeviceReport2, ATMEnvironment6>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceReport2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmEnvironment);
			previousVersion_lazy = () -> ATMDeviceReport1.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment6.mmObject();
		}

		@Override
		public ATMEnvironment6 getValue(ATMDeviceReport2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMDeviceReport2 obj, ATMEnvironment6 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "ATMGblSts", required = true)
	protected ATMStatus1 aTMGlobalStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMStatus1 ATMStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2
	 * ATMDeviceReport2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMGblSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMGlobalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global status of the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport3#mmATMGlobalStatus
	 * ATMDeviceReport3.mmATMGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1#mmATMGlobalStatus
	 * ATMDeviceReport1.mmATMGlobalStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceReport2, ATMStatus1> mmATMGlobalStatus = new MMMessageAssociationEnd<ATMDeviceReport2, ATMStatus1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceReport2.mmObject();
			isDerived = false;
			xmlTag = "ATMGblSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			definition = "Global status of the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmATMGlobalStatus);
			previousVersion_lazy = () -> ATMDeviceReport1.mmATMGlobalStatus;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMStatus1.mmObject();
		}

		@Override
		public ATMStatus1 getValue(ATMDeviceReport2 obj) {
			return obj.getATMGlobalStatus();
		}

		@Override
		public void setValue(ATMDeviceReport2 obj, ATMStatus1 value) {
			obj.setATMGlobalStatus(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2
	 * ATMDeviceReport2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport3#mmCommandResult
	 * ATMDeviceReport3.mmCommandResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1#mmCommandResult
	 * ATMDeviceReport1.mmCommandResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceReport2, List<ATMCommand11>> mmCommandResult = new MMMessageAssociationEnd<ATMDeviceReport2, List<ATMCommand11>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceReport2.mmObject();
			isDerived = false;
			xmlTag = "CmdRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandResult";
			definition = "Result of a maintenance command performed by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmCommandResult);
			previousVersion_lazy = () -> ATMDeviceReport1.mmCommandResult;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand11.mmObject();
		}

		@Override
		public List<ATMCommand11> getValue(ATMDeviceReport2 obj) {
			return obj.getCommandResult();
		}

		@Override
		public void setValue(ATMDeviceReport2 obj, List<ATMCommand11> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2
	 * ATMDeviceReport2}</li>
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
	 * "Maintenance command which has requested the device report."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport3#mmCommandContext
	 * ATMDeviceReport3.mmCommandContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1#mmCommandContext
	 * ATMDeviceReport1.mmCommandContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceReport2, Optional<ATMCommand12>> mmCommandContext = new MMMessageAssociationEnd<ATMDeviceReport2, Optional<ATMCommand12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceReport2.mmObject();
			isDerived = false;
			xmlTag = "CmdCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandContext";
			definition = "Maintenance command which has requested the device report.";
			nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmCommandContext);
			previousVersion_lazy = () -> ATMDeviceReport1.mmCommandContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand12.mmObject();
		}

		@Override
		public Optional<ATMCommand12> getValue(ATMDeviceReport2 obj) {
			return obj.getCommandContext();
		}

		@Override
		public void setValue(ATMDeviceReport2 obj, Optional<ATMCommand12> value) {
			obj.setCommandContext(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMSctyCntxt")
	protected ATMSecurityContext4 aTMSecurityContext;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMSecurityContext4
	 * ATMSecurityContext4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport2
	 * ATMDeviceReport2}</li>
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
	 * definition} = "Information related to security commands."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport3#mmATMSecurityContext
	 * ATMDeviceReport3.mmATMSecurityContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMDeviceReport1#mmATMSecurityContext
	 * ATMDeviceReport1.mmATMSecurityContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDeviceReport2, Optional<ATMSecurityContext4>> mmATMSecurityContext = new MMMessageAssociationEnd<ATMDeviceReport2, Optional<ATMSecurityContext4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDeviceReport2.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Information related to security commands.";
			nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmATMSecurityContext);
			previousVersion_lazy = () -> ATMDeviceReport1.mmATMSecurityContext;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMSecurityContext4.mmObject();
		}

		@Override
		public Optional<ATMSecurityContext4> getValue(ATMDeviceReport2 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMDeviceReport2 obj, Optional<ATMSecurityContext4> value) {
			obj.setATMSecurityContext(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDeviceReport2.mmEnvironment, com.tools20022.repository.msg.ATMDeviceReport2.mmATMGlobalStatus,
						com.tools20022.repository.msg.ATMDeviceReport2.mmCommandResult, com.tools20022.repository.msg.ATMDeviceReport2.mmCommandContext, com.tools20022.repository.msg.ATMDeviceReport2.mmATMSecurityContext);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATMDeviceReport2";
				definition = "Information related to the report from an ATM device.";
				nextVersions_lazy = () -> Arrays.asList(ATMDeviceReport3.mmObject());
				previousVersion_lazy = () -> ATMDeviceReport1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment6 getEnvironment() {
		return environment;
	}

	public ATMDeviceReport2 setEnvironment(ATMEnvironment6 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMStatus1 getATMGlobalStatus() {
		return aTMGlobalStatus;
	}

	public ATMDeviceReport2 setATMGlobalStatus(ATMStatus1 aTMGlobalStatus) {
		this.aTMGlobalStatus = Objects.requireNonNull(aTMGlobalStatus);
		return this;
	}

	public List<ATMCommand11> getCommandResult() {
		return commandResult == null ? commandResult = new ArrayList<>() : commandResult;
	}

	public ATMDeviceReport2 setCommandResult(List<ATMCommand11> commandResult) {
		this.commandResult = Objects.requireNonNull(commandResult);
		return this;
	}

	public Optional<ATMCommand12> getCommandContext() {
		return commandContext == null ? Optional.empty() : Optional.of(commandContext);
	}

	public ATMDeviceReport2 setCommandContext(ATMCommand12 commandContext) {
		this.commandContext = commandContext;
		return this;
	}

	public Optional<ATMSecurityContext4> getATMSecurityContext() {
		return aTMSecurityContext == null ? Optional.empty() : Optional.of(aTMSecurityContext);
	}

	public ATMDeviceReport2 setATMSecurityContext(ATMSecurityContext4 aTMSecurityContext) {
		this.aTMSecurityContext = aTMSecurityContext;
		return this;
	}
}