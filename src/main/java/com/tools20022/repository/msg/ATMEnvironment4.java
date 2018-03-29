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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMEnvironment4", propOrder = {"acquirer", "aTMManagerIdentification", "hostingEntity", "aTM", "customer", "card"})
public class ATMEnvironment4 {

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
	public static final MMMessageAssociationEnd<ATMEnvironment4, Optional<Acquirer7>> mmAcquirer = new MMMessageAssociationEnd<ATMEnvironment4, Optional<Acquirer7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
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
		public Optional<Acquirer7> getValue(ATMEnvironment4 obj) {
			return obj.getAcquirer();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, Optional<Acquirer7> value) {
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
	public static final MMMessageAttribute<ATMEnvironment4, Optional<Max35Text>> mmATMManagerIdentification = new MMMessageAttribute<ATMEnvironment4, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
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

		@Override
		public Optional<Max35Text> getValue(ATMEnvironment4 obj) {
			return obj.getATMManagerIdentification();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, Optional<Max35Text> value) {
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
	public static final MMMessageAssociationEnd<ATMEnvironment4, Optional<TerminalHosting1>> mmHostingEntity = new MMMessageAssociationEnd<ATMEnvironment4, Optional<TerminalHosting1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
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
		public Optional<TerminalHosting1> getValue(ATMEnvironment4 obj) {
			return obj.getHostingEntity();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, Optional<TerminalHosting1> value) {
			obj.setHostingEntity(value.orElse(null));
		}
	};
	@XmlElement(name = "ATM", required = true)
	protected AutomatedTellerMachine4 aTM;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ATMEnvironment4, AutomatedTellerMachine4> mmATM = new MMMessageAssociationEnd<ATMEnvironment4, AutomatedTellerMachine4>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "ATM";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATM";
			definition = "ATM information.";
			previousVersion_lazy = () -> ATMEnvironment1.mmATM;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AutomatedTellerMachine4.mmObject();
		}

		@Override
		public AutomatedTellerMachine4 getValue(ATMEnvironment4 obj) {
			return obj.getATM();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, AutomatedTellerMachine4 value) {
			obj.setATM(value);
		}
	};
	@XmlElement(name = "Cstmr")
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
	public static final MMMessageAssociationEnd<ATMEnvironment4, Optional<ATMCustomer1>> mmCustomer = new MMMessageAssociationEnd<ATMEnvironment4, Optional<ATMCustomer1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "Cstmr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Customer";
			definition = "Customer involved in the withdrawal transaction.";
			previousVersion_lazy = () -> ATMEnvironment1.mmCustomer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCustomer1.mmObject();
		}

		@Override
		public Optional<ATMCustomer1> getValue(ATMEnvironment4 obj) {
			return obj.getCustomer();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, Optional<ATMCustomer1> value) {
			obj.setCustomer(value.orElse(null));
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
	public static final MMMessageAssociationEnd<ATMEnvironment4, Optional<PaymentCard16>> mmCard = new MMMessageAssociationEnd<ATMEnvironment4, Optional<PaymentCard16>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMEnvironment4.mmObject();
			isDerived = false;
			xmlTag = "Card";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Card";
			definition = "Card performing the withdrawal transaction.";
			previousVersion_lazy = () -> ATMEnvironment1.mmCard;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentCard16.mmObject();
		}

		@Override
		public Optional<PaymentCard16> getValue(ATMEnvironment4 obj) {
			return obj.getCard();
		}

		@Override
		public void setValue(ATMEnvironment4 obj, Optional<PaymentCard16> value) {
			obj.setCard(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMEnvironment4.mmAcquirer, com.tools20022.repository.msg.ATMEnvironment4.mmATMManagerIdentification,
						com.tools20022.repository.msg.ATMEnvironment4.mmHostingEntity, com.tools20022.repository.msg.ATMEnvironment4.mmATM, com.tools20022.repository.msg.ATMEnvironment4.mmCustomer,
						com.tools20022.repository.msg.ATMEnvironment4.mmCard);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMEnvironment4";
				definition = "Environment of the inquiry.";
				previousVersion_lazy = () -> ATMEnvironment1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Acquirer7> getAcquirer() {
		return acquirer == null ? Optional.empty() : Optional.of(acquirer);
	}

	public ATMEnvironment4 setAcquirer(Acquirer7 acquirer) {
		this.acquirer = acquirer;
		return this;
	}

	public Optional<Max35Text> getATMManagerIdentification() {
		return aTMManagerIdentification == null ? Optional.empty() : Optional.of(aTMManagerIdentification);
	}

	public ATMEnvironment4 setATMManagerIdentification(Max35Text aTMManagerIdentification) {
		this.aTMManagerIdentification = aTMManagerIdentification;
		return this;
	}

	public Optional<TerminalHosting1> getHostingEntity() {
		return hostingEntity == null ? Optional.empty() : Optional.of(hostingEntity);
	}

	public ATMEnvironment4 setHostingEntity(TerminalHosting1 hostingEntity) {
		this.hostingEntity = hostingEntity;
		return this;
	}

	public AutomatedTellerMachine4 getATM() {
		return aTM;
	}

	public ATMEnvironment4 setATM(AutomatedTellerMachine4 aTM) {
		this.aTM = Objects.requireNonNull(aTM);
		return this;
	}

	public Optional<ATMCustomer1> getCustomer() {
		return customer == null ? Optional.empty() : Optional.of(customer);
	}

	public ATMEnvironment4 setCustomer(ATMCustomer1 customer) {
		this.customer = customer;
		return this;
	}

	public Optional<PaymentCard16> getCard() {
		return card == null ? Optional.empty() : Optional.of(card);
	}

	public ATMEnvironment4 setCard(PaymentCard16 card) {
		this.card = card;
		return this;
	}
}