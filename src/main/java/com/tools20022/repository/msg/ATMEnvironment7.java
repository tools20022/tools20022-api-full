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
import com.tools20022.repository.msg.Acquirer7;
import com.tools20022.repository.msg.Acquirer8;
import com.tools20022.repository.msg.AutomatedTellerMachine3;
import com.tools20022.repository.msg.TerminalHosting1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmAcquirer
 * ATMEnvironment7.mmAcquirer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmATMManager
 * ATMEnvironment7.mmATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmHostingEntity
 * ATMEnvironment7.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment7#mmATM
 * ATMEnvironment7.mmATM}</li>
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
 * "ATMEnvironment7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment8
 * ATMEnvironment8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEnvironment6
 * ATMEnvironment6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment7", propOrder = {"acquirer", "aTMManager", "hostingEntity", "aTM"})
public class ATMEnvironment7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Acqrr")
	protected Acquirer7 acquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Acquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer of the ATM transaction, in charge of the funds settlement with the issuer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment8#mmAcquirer
	 * ATMEnvironment8.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmAcquirer
	 * ATMEnvironment6.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment7, Optional<Acquirer7>> mmAcquirer = new MMMessageAssociationEnd<ATMEnvironment7, Optional<Acquirer7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment7.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the ATM transaction, in charge of the funds settlement with the issuer.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment8.mmAcquirer);
			previousVersion_lazy = () -> ATMEnvironment6.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer7.mmObject();
		}

		@Override
		public Optional<Acquirer7> getValue(ATMEnvironment7 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(ATMEnvironment7 obj, Optional<Acquirer7> value) {
			obj.setAcquirer(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMMgr")
	protected Acquirer8 aTMManager;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer8 Acquirer8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMMgr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Institution in charge of managing the ATM."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment8#mmATMManagerIdentification
	 * ATMEnvironment8.mmATMManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATMManagerIdentification
	 * ATMEnvironment6.mmATMManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment7, Optional<Acquirer8>> mmATMManager = new MMMessageAssociationEnd<ATMEnvironment7, Optional<Acquirer8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment7.mmObject();
			isDerived = false;
			xmlTag = "ATMMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Institution in charge of managing the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment8.mmATMManagerIdentification);
			previousVersion_lazy = () -> ATMEnvironment6.mmATMManagerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer8.mmObject();
		}

		@Override
		public Optional<Acquirer8> getValue(ATMEnvironment7 obj) {
			return obj.getATMManager();
		}

		@Override
		public void setValue(ATMEnvironment7 obj, Optional<Acquirer8> value) {
			obj.setATMManager(value.orElse(null));
		}
	};
	@XmlElement(name = "HstgNtty")
	protected TerminalHosting1 hostingEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TerminalHosting1
	 * TerminalHosting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstgNtty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostingEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entity hosting the ATM terminal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment8#mmHostingEntity
	 * ATMEnvironment8.mmHostingEntity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmHostingEntity
	 * ATMEnvironment6.mmHostingEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment7, Optional<TerminalHosting1>> mmHostingEntity = new MMMessageAssociationEnd<ATMEnvironment7, Optional<TerminalHosting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment7.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment8.mmHostingEntity);
			previousVersion_lazy = () -> ATMEnvironment6.mmHostingEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalHosting1.mmObject();
		}

		@Override
		public Optional<TerminalHosting1> getValue(ATMEnvironment7 obj) {
			return obj.getHostingEntity();
		}

		@Override
		public void setValue(ATMEnvironment7 obj, Optional<TerminalHosting1> value) {
			obj.setHostingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine3 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3
	 * AutomatedTellerMachine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment7
	 * ATMEnvironment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "ATM information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment8#mmATM
	 * ATMEnvironment8.mmATM}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATM
	 * ATMEnvironment6.mmATM}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment7, AutomatedTellerMachine3> mmATM = new MMMessageAssociationEnd<ATMEnvironment7, AutomatedTellerMachine3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment7.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment8.mmATM);
			previousVersion_lazy = () -> ATMEnvironment6.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine3.mmObject();
		}

		@Override
		public AutomatedTellerMachine3 getValue(ATMEnvironment7 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment7 obj, AutomatedTellerMachine3 value) {
			obj.setATM(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment7.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment7.mmATMManager, com.tools20022.repository.msg.ATMEnvironment7.mmHostingEntity,
						com.tools20022.repository.msg.ATMEnvironment7.mmATM);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment7";
				definition = "Environment of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMEnvironment8.mmObject());
				previousVersion_lazy = () -> ATMEnvironment6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment7 setAcquirer(Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Acquirer8> getATMManager() {
		return aTMManager == null ? Optional.empty() : Optional.of(aTMManager);
	}

	public ATMEnvironment7 setATMManager(Acquirer8 aTMManager) {
		this.aTMManager = aTMManager;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment7 setHostingEntity(TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine3 getATM() {
		return aTM;
	}

	public ATMEnvironment7 setATM(AutomatedTellerMachine3 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}
}