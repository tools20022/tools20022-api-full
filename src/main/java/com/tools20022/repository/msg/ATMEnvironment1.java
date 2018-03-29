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
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmAcquirer
 * ATMEnvironment1.mmAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATMManagerIdentification
 * ATMEnvironment1.mmATMManagerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmHostingEntity
 * ATMEnvironment1.mmHostingEntity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmATM
 * ATMEnvironment1.mmATM}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCustomer
 * ATMEnvironment1.mmCustomer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment1#mmCard
 * ATMEnvironment1.mmCard}</li>
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
 * "ATMEnvironment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Environment of the withdrawal transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3
 * ATMEnvironment3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2
 * ATMEnvironment2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4
 * ATMEnvironment4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment1", propOrder = {"acquirer", "aTMManagerIdentification", "hostingEntity", "aTM", "customer", "card"})
public class ATMEnvironment1 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmAcquirer
	 * ATMEnvironment3.mmAcquirer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmAcquirer
	 * ATMEnvironment2.mmAcquirer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmAcquirer
	 * ATMEnvironment4.mmAcquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment1, Optional<Acquirer7>> mmAcquirer = new MMMessageAssociationEnd<ATMEnvironment1, Optional<Acquirer7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Acqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Acquirer";
			definition = "Acquirer of the withdrawal transaction, in charge of the funds settlement with the issuer.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmAcquirer, ATMEnvironment2.mmAcquirer, ATMEnvironment4.mmAcquirer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Acquirer7.mmObject();
		}

		@Override
		public Optional<Acquirer7> getValue(ATMEnvironment1 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, Optional<Acquirer7> value) {
			obj.setAcquirer(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmATMManagerIdentification
	 * ATMEnvironment3.mmATMManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmATMManager
	 * ATMEnvironment2.mmATMManager}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmATMManagerIdentification
	 * ATMEnvironment4.mmATMManagerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMEnvironment1, Optional<Max35Text>> mmATMManagerIdentification = new MMMessageAttribute<ATMEnvironment1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "ATMMgrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMManagerIdentification";
			definition = "Identification of the ATM manager.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmATMManagerIdentification, ATMEnvironment2.mmATMManager, ATMEnvironment4.mmATMManagerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMEnvironment1 obj) {
			return obj.getATMManagerIdentification();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, Optional<Max35Text> value) {
			obj.setATMManagerIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmHostingEntity
	 * ATMEnvironment3.mmHostingEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmHostingEntity
	 * ATMEnvironment2.mmHostingEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmHostingEntity
	 * ATMEnvironment4.mmHostingEntity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment1, Optional<TerminalHosting1>> mmHostingEntity = new MMMessageAssociationEnd<ATMEnvironment1, Optional<TerminalHosting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "HstgNtty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostingEntity";
			definition = "Entity hosting the ATM terminal.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmHostingEntity, ATMEnvironment2.mmHostingEntity, ATMEnvironment4.mmHostingEntity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminalHosting1.mmObject();
		}

		@Override
		public Optional<TerminalHosting1> getValue(ATMEnvironment1 obj) {
			return obj.getHostingEntity();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, Optional<TerminalHosting1> value) {
			obj.setHostingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine1 aTM;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine1
	 * AutomatedTellerMachine1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmATM
	 * ATMEnvironment3.mmATM}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmATM
	 * ATMEnvironment2.mmATM}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmATM
	 * ATMEnvironment4.mmATM}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment1, AutomatedTellerMachine1> mmATM = new MMMessageAssociationEnd<ATMEnvironment1, AutomatedTellerMachine1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmATM, ATMEnvironment2.mmATM, ATMEnvironment4.mmATM);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine1.mmObject();
		}

		@Override
		public AutomatedTellerMachine1 getValue(ATMEnvironment1 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, AutomatedTellerMachine1 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cstmr", required = true)
	protected ATMCustomer1 customer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomer1
	 * ATMCustomer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmCustomer
	 * ATMEnvironment3.mmCustomer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmCustomer
	 * ATMEnvironment2.mmCustomer}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmCustomer
	 * ATMEnvironment4.mmCustomer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment1, ATMCustomer1> mmCustomer = new MMMessageAssociationEnd<ATMEnvironment1, ATMCustomer1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmCustomer, ATMEnvironment2.mmCustomer, ATMEnvironment4.mmCustomer);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMCustomer1.mmObject();
		}

		@Override
		public ATMCustomer1 getValue(ATMEnvironment1 obj) {
			return obj.getCustomer();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, ATMCustomer1 value) {
			obj.setCustomer(value);
		}
	};
	@XmlElement(name = "Card")
	protected PaymentCard16 card;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentCard16
	 * PaymentCard16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment3#mmCard
	 * ATMEnvironment3.mmCard}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMEnvironment2#mmPlainCardData
	 * ATMEnvironment2.mmPlainCardData}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ATMEnvironment4#mmCard
	 * ATMEnvironment4.mmCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMEnvironment1, Optional<PaymentCard16>> mmCard = new MMMessageAssociationEnd<ATMEnvironment1, Optional<PaymentCard16>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment1.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the withdrawal transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmCard, ATMEnvironment2.mmPlainCardData, ATMEnvironment4.mmCard);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentCard16.mmObject();
		}

		@Override
		public Optional<PaymentCard16> getValue(ATMEnvironment1 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(ATMEnvironment1 obj, Optional<PaymentCard16> value) {
			obj.setCard(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment1.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment1.mmATMManagerIdentification,
						com.tools20022.repository.msg.ATMEnvironment1.mmHostingEntity, com.tools20022.repository.msg.ATMEnvironment1.mmATM, com.tools20022.repository.msg.ATMEnvironment1.mmCustomer,
						com.tools20022.repository.msg.ATMEnvironment1.mmCard);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment1";
				definition = "Environment of the withdrawal transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMEnvironment3.mmObject(), ATMEnvironment2.mmObject(), ATMEnvironment4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment1 setAcquirer(Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Max35Text> getATMManagerIdentification() {
		return aTMManagerIdentification == null ? Optional.empty() : Optional.of(aTMManagerIdentification);
	}

	public ATMEnvironment1 setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment1 setHostingEntity(TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine1 getATM() {
		return aTM;
	}

	public ATMEnvironment1 setATM(AutomatedTellerMachine1 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public ATMCustomer1 getCustomer() {
		return customer;
	}

	public ATMEnvironment1 setCustomer(ATMCustomer1 customer) {
		this.customer = Objects.requireNonNull(customer);
		return this;
	}

	public Optional<PaymentCard16> getCard() {
		return card == null ? Optional.empty() : Optional.of(card);
	}

	public ATMEnvironment1 setCard(PaymentCard16 card) {
		this.card = card;
		return this;
	}
}