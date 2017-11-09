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

/**
 * Environment of the inquiry.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmAcquirer
 * ATMEnvironment4.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmATMManagerIdentification
 * ATMEnvironment4.mmATMManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmHostingEntity
 * ATMEnvironment4.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmATM
 * ATMEnvironment4.mmATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmCustomer
 * ATMEnvironment4.mmCustomer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmCard
 * ATMEnvironment4.mmCard}</li>
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
 * "ATMEnvironment4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the inquiry."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ATMEnvironment1
 * ATMEnvironment1}</li>
 * </ul>
 */
public class ATMEnvironment4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Acquirer7 acquirer;
	/**
	 * Acquirer of the withdrawal transaction, in charge of the funds settlement
	 * with the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Acquirer7 Acquirer7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	public static final MMMessageAssociationEnd mmAcquirer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer.";
			previousVersion_lazy = () -> ATMEnvironment1.mmAcquirer;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATMManagerIdentification
	 * ATMEnvironment1.mmATMManagerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmATMManagerIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			previousVersion_lazy = () -> ATMEnvironment1.mmATMManagerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	public static final MMMessageAssociationEnd mmHostingEntity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			previousVersion_lazy = () -> ATMEnvironment1.mmHostingEntity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TerminalHosting1.mmObject();
		}
	};
	protected AutomatedTellerMachine4 aTM;
	/**
	 * ATM information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4
	 * AutomatedTellerMachine4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATM
	 * ATMEnvironment1.mmATM}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATM = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			previousVersion_lazy = () -> ATMEnvironment1.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AutomatedTellerMachine4.mmObject();
		}
	};
	protected ATMCustomer1 customer;
	/**
	 * Customer involved in the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer1
	 * ATMCustomer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCustomer
	 * ATMEnvironment1.mmCustomer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustomer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			previousVersion_lazy = () -> ATMEnvironment1.mmCustomer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCustomer1.mmObject();
		}
	};
	protected PaymentCard16 card;
	/**
	 * Card performing the withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard16
	 * PaymentCard16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4
	 * ATMEnvironment4}</li>
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
	 * definition} = "Card performing the withdrawal transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCard
	 * ATMEnvironment1.mmCard}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCard = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the withdrawal transaction.";
			previousVersion_lazy = () -> ATMEnvironment1.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCard16.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMEnvironment4.mmAcquirer, ATMEnvironment4.mmATMManagerIdentification, ATMEnvironment4.mmHostingEntity, ATMEnvironment4.mmATM, ATMEnvironment4.mmCustomer, ATMEnvironment4.mmCard);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment4";
				definition = "Environment of the inquiry.";
				previousVersion_lazy = () -> ATMEnvironment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Acquirer7 getAcquirer() {
		return acquirer;
	}

	public void setAcquirer(com.tools20022.repository.msg.Acquirer7 acquirer) {
		this.acquirer = acquirer;
	}

	public Max35Text getATMManagerIdentification() {
		return aTMManagerIdentification;
	}

	public void setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
	}

	public TerminalHosting1 getHostingEntity() {
		return hostingEntity;
	}

	public void setHostingEntity(com.tools20022.repository.msg.TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
	}

	public AutomatedTellerMachine4 getATM() {
		return aTM;
	}

	public void setATM(com.tools20022.repository.msg.AutomatedTellerMachine4 aTM) {
		this.aTM = aTM;
	}

	public ATMCustomer1 getCustomer() {
		return customer;
	}

	public void setCustomer(com.tools20022.repository.msg.ATMCustomer1 customer) {
		this.customer = customer;
	}

	public PaymentCard16 getCard() {
		return card;
	}

	public void setCard(com.tools20022.repository.msg.PaymentCard16 card) {
		this.card = card;
	}
}