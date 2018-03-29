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
import com.tools20022.repository.area.catp.ATMPINManagementResponseV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext17;
import com.tools20022.repository.msg.ATMEnvironment12;
import com.tools20022.repository.msg.ATMTransaction22;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response of an ATM PIN Management from an ATM
 * manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2#mmEnvironment
 * ATMPINManagementResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2#mmContext
 * ATMPINManagementResponse2.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2#mmTransaction
 * ATMPINManagementResponse2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#mmATMPINManagementResponse
 * ATMPINManagementResponseV02.mmATMPINManagementResponse}</li>
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
 * "ATMPINManagementResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM PIN Management from an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMPINManagementResponse2", propOrder = {"environment", "context", "transaction"})
public class ATMPINManagementResponse2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment12 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment12
	 * ATMEnvironment12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2
	 * ATMPINManagementResponse2}</li>
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
	 * definition} = "Environment of the PIN management transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementResponse2, ATMEnvironment12> mmEnvironment = new MMMessageAssociationEnd<ATMPINManagementResponse2, ATMEnvironment12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementResponse2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the PIN management transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment12.mmObject();
		}

		@Override
		public ATMEnvironment12 getValue(ATMPINManagementResponse2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMPINManagementResponse2 obj, ATMEnvironment12 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext17 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext17
	 * ATMContext17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2
	 * ATMPINManagementResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cntxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Context"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Context in which the transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementResponse2, ATMContext17> mmContext = new MMMessageAssociationEnd<ATMPINManagementResponse2, ATMContext17>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementResponse2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext17.mmObject();
		}

		@Override
		public ATMContext17 getValue(ATMPINManagementResponse2 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMPINManagementResponse2 obj, ATMContext17 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction22 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction22
	 * ATMTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementResponse2
	 * ATMPINManagementResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the PIN management transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementResponse2, ATMTransaction22> mmTransaction = new MMMessageAssociationEnd<ATMPINManagementResponse2, ATMTransaction22>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementResponse2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Response to the PIN management transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction22.mmObject();
		}

		@Override
		public ATMTransaction22 getValue(ATMPINManagementResponse2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMPINManagementResponse2 obj, ATMTransaction22 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMPINManagementResponse2.mmEnvironment, com.tools20022.repository.msg.ATMPINManagementResponse2.mmContext,
						com.tools20022.repository.msg.ATMPINManagementResponse2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMPINManagementResponseV02.mmATMPINManagementResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMPINManagementResponse2";
				definition = "Information related to the response of an ATM PIN Management from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment12 getEnvironment() {
		return environment;
	}

	public ATMPINManagementResponse2 setEnvironment(ATMEnvironment12 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext17 getContext() {
		return context;
	}

	public ATMPINManagementResponse2 setContext(ATMContext17 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction22 getTransaction() {
		return transaction;
	}

	public ATMPINManagementResponse2 setTransaction(ATMTransaction22 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}