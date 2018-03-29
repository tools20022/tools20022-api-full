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
import com.tools20022.repository.area.catp.ATMPINManagementRequestV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext7;
import com.tools20022.repository.msg.ATMEnvironment1;
import com.tools20022.repository.msg.ATMTransaction9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a PIN management from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1#mmEnvironment
 * ATMPINManagementRequest1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1#mmContext
 * ATMPINManagementRequest1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1#mmTransaction
 * ATMPINManagementRequest1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#mmATMPINManagementRequest
 * ATMPINManagementRequestV01.mmATMPINManagementRequest}</li>
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
 * "ATMPINManagementRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a PIN management from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMPINManagementRequest1", propOrder = {"environment", "context", "transaction"})
public class ATMPINManagementRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment1 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment1
	 * ATMEnvironment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1
	 * ATMPINManagementRequest1}</li>
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
	 * definition} = "Environment in which the transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementRequest1, ATMEnvironment1> mmEnvironment = new MMMessageAssociationEnd<ATMPINManagementRequest1, ATMEnvironment1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment1.mmObject();
		}

		@Override
		public ATMEnvironment1 getValue(ATMPINManagementRequest1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMPINManagementRequest1 obj, ATMEnvironment1 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext7 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext7
	 * ATMContext7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1
	 * ATMPINManagementRequest1}</li>
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
	public static final MMMessageAssociationEnd<ATMPINManagementRequest1, ATMContext7> mmContext = new MMMessageAssociationEnd<ATMPINManagementRequest1, ATMContext7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext7.mmObject();
		}

		@Override
		public ATMContext7 getValue(ATMPINManagementRequest1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMPINManagementRequest1 obj, ATMContext7 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction9 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction9
	 * ATMTransaction9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMPINManagementRequest1
	 * ATMPINManagementRequest1}</li>
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
	 * definition} = "Transaction for which the service is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMPINManagementRequest1, ATMTransaction9> mmTransaction = new MMMessageAssociationEnd<ATMPINManagementRequest1, ATMTransaction9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMPINManagementRequest1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Transaction for which the service is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction9.mmObject();
		}

		@Override
		public ATMTransaction9 getValue(ATMPINManagementRequest1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMPINManagementRequest1 obj, ATMTransaction9 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMPINManagementRequest1.mmEnvironment, com.tools20022.repository.msg.ATMPINManagementRequest1.mmContext,
						com.tools20022.repository.msg.ATMPINManagementRequest1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMPINManagementRequestV01.mmATMPINManagementRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMPINManagementRequest1";
				definition = "Information related to the request of a PIN management from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment1 getEnvironment() {
		return environment;
	}

	public ATMPINManagementRequest1 setEnvironment(ATMEnvironment1 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext7 getContext() {
		return context;
	}

	public ATMPINManagementRequest1 setContext(ATMContext7 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction9 getTransaction() {
		return transaction;
	}

	public ATMPINManagementRequest1 setTransaction(ATMTransaction9 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}