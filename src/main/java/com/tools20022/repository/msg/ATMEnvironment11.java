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
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmAcquirer
 * ATMEnvironment11.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmATMManagerIdentification
 * ATMEnvironment11.mmATMManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmHostingEntity
 * ATMEnvironment11.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmATM
 * ATMEnvironment11.mmATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmCustomer
 * ATMEnvironment11.mmCustomer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment11#mmCard
 * ATMEnvironment11.mmCard}</li>
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
 * "ATMEnvironment11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the withdrawal transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMEnvironment11", propOrder = {"acquirer", "ATMManagerIdentification", "hostingEntity", "ATM", "customer", "card"})
public class ATMEnvironment11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Acquirer7 acquirer;
	/**
	 * Acquirer of the transaction, in charge of the funds settlement with the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
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
	 * "Acquirer of the transaction, in charge of the funds settlement with the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the transaction, in charge of the funds settlement with the issuer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Acquirer7.mmObject();
		}
	};
	protected Max35Text aTMManagerIdentification;
	/**
	 * Identification of the ATM manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMManagerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TerminalHosting1 hostingEntity;
	/**
	 * Entity hosting the ATM terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TerminalHosting1
	 * TerminalHosting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHostingEntity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalHosting1.mmObject();
		}
	};
	protected AutomatedTellerMachine9 aTM;
	/**
	 * ATM information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine9
	 * AutomatedTellerMachine9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine9.mmObject();
		}
	};
	protected ATMCustomer4 customer;
	/**
	 * Customer involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer4
	 * ATMCustomer4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
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
	 * definition} = "Customer involved in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCustomer4.mmObject();
		}
	};
	protected PaymentCard22 card;
	/**
	 * Card performing the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard22
	 * PaymentCard22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Card"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card performing the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment11.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard22.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMEnvironment11.mmAcquirer, ATMEnvironment11.mmATMManagerIdentification, ATMEnvironment11.mmHostingEntity, ATMEnvironment11.mmATM, ATMEnvironment11.mmCustomer,
						ATMEnvironment11.mmCard);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment11";
				definition = "Environment of the withdrawal transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Acqrr")
	public Acquirer7 getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(com.tools20022.repository.msg.Acquirer7 acquirer) {
		this.acquirer = acquirer;
	}

	@XmlElement(name = "ATMMgrId")
	public Max35Text getATMManagerIdentification() {
		return aTMManagerIdentification;
	}

	public void setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
	}

	@XmlElement(name = "HstgNtty")
	public TerminalHosting1 getHostingEntity() {
		return hostingEntity;
	}

	public void setHostingEntity(com.tools20022.repository.msg.TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
	}

	@XmlElement(name = "ATM", required = true)
	public AutomatedTellerMachine9 getATM() {
		return aTM;
	}

	public void setATM(com.tools20022.repository.msg.AutomatedTellerMachine9 aTM) {
		this.aTM = aTM;
	}

	@XmlElement(name = "Cstmr", required = true)
	public ATMCustomer4 getCustomer() {
		return customer;
	}

	public void setCustomer(com.tools20022.repository.msg.ATMCustomer4 customer) {
		this.customer = customer;
	}

	@XmlElement(name = "Card")
	public PaymentCard22 getCard() {
		return card;
	}

	public void setCard(com.tools20022.repository.msg.PaymentCard22 card) {
		this.card = card;
	}
}