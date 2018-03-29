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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Environment of the withdrawal transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmAcquirer
 * ATMEnvironment2.mmAcquirer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmATMManager
 * ATMEnvironment2.mmATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmHostingEntity
 * ATMEnvironment2.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmATM
 * ATMEnvironment2.mmATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmCustomer
 * ATMEnvironment2.mmCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmProtectedCardData
 * ATMEnvironment2.mmProtectedCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmPlainCardData
 * ATMEnvironment2.mmPlainCardData}</li>
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
 * "ATMEnvironment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the withdrawal transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment5
 * ATMEnvironment5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEnvironment1
 * ATMEnvironment1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment2", propOrder = {"acquirer", "aTMManager", "hostingEntity", "aTM", "customer", "protectedCardData", "plainCardData"})
public class ATMEnvironment2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
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
	 * "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmAcquirer
	 * ATMEnvironment1.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, Optional<Acquirer7>> mmAcquirer = new MMMessageAssociationEnd<ATMEnvironment2, Optional<Acquirer7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer.";
			previousVersion_lazy = () -> ATMEnvironment1.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer7.mmObject();
		}

		@Override
		public Optional<Acquirer7> getValue(ATMEnvironment2 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, Optional<Acquirer7> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATMManagerIdentification
	 * ATMEnvironment1.mmATMManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, Optional<Acquirer8>> mmATMManager = new MMMessageAssociationEnd<ATMEnvironment2, Optional<Acquirer8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "ATMMgr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManager";
			definition = "Institution in charge of managing the ATM.";
			previousVersion_lazy = () -> ATMEnvironment1.mmATMManagerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer8.mmObject();
		}

		@Override
		public Optional<Acquirer8> getValue(ATMEnvironment2 obj) {
			return obj.getATMManager();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, Optional<Acquirer8> value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmHostingEntity
	 * ATMEnvironment1.mmHostingEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, Optional<TerminalHosting1>> mmHostingEntity = new MMMessageAssociationEnd<ATMEnvironment2, Optional<TerminalHosting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			previousVersion_lazy = () -> ATMEnvironment1.mmHostingEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalHosting1.mmObject();
		}

		@Override
		public Optional<TerminalHosting1> getValue(ATMEnvironment2 obj) {
			return obj.getHostingEntity();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, Optional<TerminalHosting1> value) {
			obj.setHostingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine2 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine2
	 * AutomatedTellerMachine2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmATM
	 * ATMEnvironment5.mmATM}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATM
	 * ATMEnvironment1.mmATM}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, AutomatedTellerMachine2> mmATM = new MMMessageAssociationEnd<ATMEnvironment2, AutomatedTellerMachine2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment5.mmATM);
			previousVersion_lazy = () -> ATMEnvironment1.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine2.mmObject();
		}

		@Override
		public AutomatedTellerMachine2 getValue(ATMEnvironment2 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, AutomatedTellerMachine2 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cstmr", required = true)
	protected ATMCustomer2 customer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer2
	 * ATMCustomer2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cstmr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Customer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer involved in the withdrawal transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmCustomer
	 * ATMEnvironment5.mmCustomer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCustomer
	 * ATMEnvironment1.mmCustomer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, ATMCustomer2> mmCustomer = new MMMessageAssociationEnd<ATMEnvironment2, ATMCustomer2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment5.mmCustomer);
			previousVersion_lazy = () -> ATMEnvironment1.mmCustomer;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMCustomer2.mmObject();
		}

		@Override
		public ATMCustomer2 getValue(ATMEnvironment2 obj) {
			return obj.getCustomer();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, ATMCustomer2 value) {
			obj.setCustomer(value);
		}
	};
	@XmlElement(name = "PrtctdCardData")
	protected ContentInformationType10 protectedCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the sensitive card data."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmProtectedCardData
	 * ATMEnvironment5.mmProtectedCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, Optional<ContentInformationType10>> mmProtectedCardData = new MMMessageAssociationEnd<ATMEnvironment2, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "PrtctdCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedCardData";
			definition = "Encryption of the sensitive card data.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment5.mmProtectedCardData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMEnvironment2 obj) {
			return obj.getProtectedCardData();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedCardData(value.orElse(null));
		}
	};
	@XmlElement(name = "PlainCardData")
	protected PlainCardData14 plainCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PlainCardData14
	 * PlainCardData14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlainCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sensitive data associated with the card performing the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment5#mmPlainCardData
	 * ATMEnvironment5.mmPlainCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCard
	 * ATMEnvironment1.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment2, Optional<PlainCardData14>> mmPlainCardData = new MMMessageAssociationEnd<ATMEnvironment2, Optional<PlainCardData14>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment2.mmObject();
			isDerived = false;
			xmlTag = "PlainCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlainCardData";
			definition = "Sensitive data associated with the card performing the transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment5.mmPlainCardData);
			previousVersion_lazy = () -> ATMEnvironment1.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlainCardData14.mmObject();
		}

		@Override
		public Optional<PlainCardData14> getValue(ATMEnvironment2 obj) {
			return obj.getPlainCardData();
		}

		@Override
		public void setValue(ATMEnvironment2 obj, Optional<PlainCardData14> value) {
			obj.setPlainCardData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment2.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment2.mmATMManager, com.tools20022.repository.msg.ATMEnvironment2.mmHostingEntity,
						com.tools20022.repository.msg.ATMEnvironment2.mmATM, com.tools20022.repository.msg.ATMEnvironment2.mmCustomer, com.tools20022.repository.msg.ATMEnvironment2.mmProtectedCardData,
						com.tools20022.repository.msg.ATMEnvironment2.mmPlainCardData);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment2";
				definition = "Environment of the withdrawal transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMEnvironment5.mmObject());
				previousVersion_lazy = () -> ATMEnvironment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment2 setAcquirer(Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Acquirer8> getATMManager() {
		return aTMManager == null ? Optional.empty() : Optional.of(aTMManager);
	}

	public ATMEnvironment2 setATMManager(Acquirer8 aTMManager) {
		this.aTMManager = aTMManager;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment2 setHostingEntity(TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine2 getATM() {
		return aTM;
	}

	public ATMEnvironment2 setATM(AutomatedTellerMachine2 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMCustomer2 getCustomer() {
		return customer;
	}

	public ATMEnvironment2 setCustomer(ATMCustomer2 customer) {
		this.customer = Objects.requireNonNull(customer);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedCardData() {
		return protectedCardData == null ? Optional.empty() : Optional.of(protectedCardData);
	}

	public ATMEnvironment2 setProtectedCardData(ContentInformationType10 protectedCardData) {
		this.protectedCardData = protectedCardData;
		return this;
	}

	public Optional<PlainCardData14> getPlainCardData() {
		return plainCardData == null ? Optional.empty() : Optional.of(plainCardData);
	}

	public ATMEnvironment2 setPlainCardData(PlainCardData14 plainCardData) {
		this.plainCardData = plainCardData;
		return this;
	}
}