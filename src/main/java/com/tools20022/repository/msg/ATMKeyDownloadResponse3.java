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
import com.tools20022.repository.msg.ATMCommand7;
import com.tools20022.repository.msg.ATMEnvironment7;
import com.tools20022.repository.msg.ATMSecurityContext3;
import com.tools20022.repository.msg.SecurityParameters8;
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
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3#mmEnvironment
 * ATMKeyDownloadResponse3.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3#mmATMSecurityContext
 * ATMKeyDownloadResponse3.mmATMSecurityContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3#mmATMChallenge
 * ATMKeyDownloadResponse3.mmATMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3#mmHostSecurityParameters
 * ATMKeyDownloadResponse3.mmHostSecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3#mmCommand
 * ATMKeyDownloadResponse3.mmCommand}</li>
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
 * "ATMKeyDownloadResponse3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM key download from an ATM manager."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4
 * ATMKeyDownloadResponse4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2
 * ATMKeyDownloadResponse2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMKeyDownloadResponse3", propOrder = {"environment", "aTMSecurityContext", "aTMChallenge", "hostSecurityParameters", "command"})
public class ATMKeyDownloadResponse3 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3
	 * ATMKeyDownloadResponse3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4#mmEnvironment
	 * ATMKeyDownloadResponse4.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#mmEnvironment
	 * ATMKeyDownloadResponse2.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse3, ATMEnvironment7> mmEnvironment = new MMMessageAssociationEnd<ATMKeyDownloadResponse3, ATMEnvironment7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmEnvironment);
			previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment7.mmObject();
		}

		@Override
		public ATMEnvironment7 getValue(ATMKeyDownloadResponse3 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse3 obj, ATMEnvironment7 value) {
			obj.setEnvironment(value);
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3
	 * ATMKeyDownloadResponse3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4#mmATMSecurityContext
	 * ATMKeyDownloadResponse4.mmATMSecurityContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#mmATMSecurityContext
	 * ATMKeyDownloadResponse2.mmATMSecurityContext}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse3, ATMSecurityContext3> mmATMSecurityContext = new MMMessageAssociationEnd<ATMKeyDownloadResponse3, ATMSecurityContext3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmObject();
			isDerived = false;
			xmlTag = "ATMSctyCntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMSecurityContext";
			definition = "Context of the ATM for the key download.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmATMSecurityContext);
			previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmATMSecurityContext;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMSecurityContext3.mmObject();
		}

		@Override
		public ATMSecurityContext3 getValue(ATMKeyDownloadResponse3 obj) {
			return obj.getATMSecurityContext();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse3 obj, ATMSecurityContext3 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3
	 * ATMKeyDownloadResponse3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4#mmATMChallenge
	 * ATMKeyDownloadResponse4.mmATMChallenge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#mmATMChallenge
	 * ATMKeyDownloadResponse2.mmATMChallenge}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMKeyDownloadResponse3, Optional<Max140Binary>> mmATMChallenge = new MMMessageAttribute<ATMKeyDownloadResponse3, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmObject();
			isDerived = false;
			xmlTag = "ATMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMChallenge";
			definition = "Random value from the ATM provided during a previous exchange.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmATMChallenge);
			previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmATMChallenge;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ATMKeyDownloadResponse3 obj) {
			return obj.getATMChallenge();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse3 obj, Optional<Max140Binary> value) {
			obj.setATMChallenge(value.orElse(null));
		}
	};
	@XmlElement(name = "HstSctyParams", required = true)
	protected SecurityParameters8 hostSecurityParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityParameters8
	 * SecurityParameters8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3
	 * ATMKeyDownloadResponse3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4#mmHostSecurityParameters
	 * ATMKeyDownloadResponse4.mmHostSecurityParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#mmHostSecurityParameters
	 * ATMKeyDownloadResponse2.mmHostSecurityParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse3, SecurityParameters8> mmHostSecurityParameters = new MMMessageAssociationEnd<ATMKeyDownloadResponse3, SecurityParameters8>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmObject();
			isDerived = false;
			xmlTag = "HstSctyParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostSecurityParameters";
			definition = "Security parameters of the host downloading the key.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmHostSecurityParameters);
			previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmHostSecurityParameters;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityParameters8.mmObject();
		}

		@Override
		public SecurityParameters8 getValue(ATMKeyDownloadResponse3 obj) {
			return obj.getHostSecurityParameters();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse3 obj, SecurityParameters8 value) {
			obj.setHostSecurityParameters(value);
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand7> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse3
	 * ATMKeyDownloadResponse3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse4#mmCommand
	 * ATMKeyDownloadResponse4.mmCommand}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMKeyDownloadResponse2#mmCommand
	 * ATMKeyDownloadResponse2.mmCommand}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMKeyDownloadResponse3, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMKeyDownloadResponse3, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmCommand);
			previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmCommand;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMKeyDownloadResponse3 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMKeyDownloadResponse3 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmEnvironment, com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmATMSecurityContext,
						com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmATMChallenge, com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmHostSecurityParameters, com.tools20022.repository.msg.ATMKeyDownloadResponse3.mmCommand);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATMKeyDownloadResponse3";
				definition = "Information related to the response of an ATM key download from an ATM manager.";
				nextVersions_lazy = () -> Arrays.asList(ATMKeyDownloadResponse4.mmObject());
				previousVersion_lazy = () -> ATMKeyDownloadResponse2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment7 getEnvironment() {
		return environment;
	}

	public ATMKeyDownloadResponse3 setEnvironment(ATMEnvironment7 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMSecurityContext3 getATMSecurityContext() {
		return aTMSecurityContext;
	}

	public ATMKeyDownloadResponse3 setATMSecurityContext(ATMSecurityContext3 aTMSecurityContext) {
		this.aTMSecurityContext = Objects.requireNonNull(aTMSecurityContext);
		return this;
	}

	public Optional<Max140Binary> getATMChallenge() {
		return aTMChallenge == null ? Optional.empty() : Optional.of(aTMChallenge);
	}

	public ATMKeyDownloadResponse3 setATMChallenge(Max140Binary aTMChallenge) {
		this.aTMChallenge = aTMChallenge;
		return this;
	}

	public SecurityParameters8 getHostSecurityParameters() {
		return hostSecurityParameters;
	}

	public ATMKeyDownloadResponse3 setHostSecurityParameters(SecurityParameters8 hostSecurityParameters) {
		this.hostSecurityParameters = Objects.requireNonNull(hostSecurityParameters);
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMKeyDownloadResponse3 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}