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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
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
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmAcquirer
 * ATMEnvironment10.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmATMManagerIdentification
 * ATMEnvironment10.mmATMManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmHostingEntity
 * ATMEnvironment10.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment10#mmATM
 * ATMEnvironment10.mmATM}</li>
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
 * "ATMEnvironment10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEnvironment6
 * ATMEnvironment6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment10", propOrder = {"acquirer", "aTMManagerIdentification", "hostingEntity", "aTM"})
public class ATMEnvironment10 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmAcquirer
	 * ATMEnvironment6.mmAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment10.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the ATM transaction, in charge of the funds settlement with the issuer.";
			previousVersion_lazy = () -> ATMEnvironment6.mmAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer7.mmObject();
		}
	};
	@XmlElement(name = "ATMMgrId")
	protected Max35Text aTMManagerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMMgrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMManagerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the ATM manager."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATMManagerIdentification
	 * ATMEnvironment6.mmATMManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMManagerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment10.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			previousVersion_lazy = () -> ATMEnvironment6.mmATMManagerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmHostingEntity
	 * ATMEnvironment6.mmHostingEntity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostingEntity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment10.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			previousVersion_lazy = () -> ATMEnvironment6.mmHostingEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalHosting1.mmObject();
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine8 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine8
	 * AutomatedTellerMachine8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment10
	 * ATMEnvironment10}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment6#mmATM
	 * ATMEnvironment6.mmATM}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment10.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			previousVersion_lazy = () -> ATMEnvironment6.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment10.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment10.mmATMManagerIdentification,
						com.tools20022.repository.msg.ATMEnvironment10.mmHostingEntity, com.tools20022.repository.msg.ATMEnvironment10.mmATM);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment10";
				definition = "Environment of the transaction.";
				previousVersion_lazy = () -> ATMEnvironment6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment10 setAcquirer(com.tools20022.repository.msg.Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Max35Text> getATMManagerIdentification() {
		return aTMManagerIdentification == null ? Optional.empty() : Optional.of(aTMManagerIdentification);
	}

	public ATMEnvironment10 setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment10 setHostingEntity(com.tools20022.repository.msg.TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine8 getATM() {
		return aTM;
	}

	public ATMEnvironment10 setATM(com.tools20022.repository.msg.AutomatedTellerMachine8 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}
}