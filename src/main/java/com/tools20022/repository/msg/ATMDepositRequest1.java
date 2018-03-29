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
import com.tools20022.repository.area.catp.ATMDepositRequestV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext10;
import com.tools20022.repository.msg.ATMEnvironment11;
import com.tools20022.repository.msg.ATMTransaction15;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a deposit transaction from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1#mmEnvironment
 * ATMDepositRequest1.mmEnvironment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMDepositRequest1#mmContext
 * ATMDepositRequest1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1#mmTransaction
 * ATMDepositRequest1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmATMDepositRequest
 * ATMDepositRequestV01.mmATMDepositRequest}</li>
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
 * "ATMDepositRequest1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a deposit transaction from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositRequest1", propOrder = {"environment", "context", "transaction"})
public class ATMDepositRequest1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment11 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment11
	 * ATMEnvironment11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1
	 * ATMDepositRequest1}</li>
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
	public static final MMMessageAssociationEnd<ATMDepositRequest1, ATMEnvironment11> mmEnvironment = new MMMessageAssociationEnd<ATMDepositRequest1, ATMEnvironment11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositRequest1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment11.mmObject();
		}

		@Override
		public ATMEnvironment11 getValue(ATMDepositRequest1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMDepositRequest1 obj, ATMEnvironment11 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext10 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext10
	 * ATMContext10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1
	 * ATMDepositRequest1}</li>
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
	 * definition} = "Context in which the deposit transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositRequest1, ATMContext10> mmContext = new MMMessageAssociationEnd<ATMDepositRequest1, ATMContext10>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositRequest1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the deposit transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext10.mmObject();
		}

		@Override
		public ATMContext10 getValue(ATMDepositRequest1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMDepositRequest1 obj, ATMContext10 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction15 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction15
	 * ATMTransaction15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1
	 * ATMDepositRequest1}</li>
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
	 * definition} = "Deposit transaction for which the service is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositRequest1, ATMTransaction15> mmTransaction = new MMMessageAssociationEnd<ATMDepositRequest1, ATMTransaction15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositRequest1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Deposit transaction for which the service is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction15.mmObject();
		}

		@Override
		public ATMTransaction15 getValue(ATMDepositRequest1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMDepositRequest1 obj, ATMTransaction15 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositRequest1.mmEnvironment, com.tools20022.repository.msg.ATMDepositRequest1.mmContext,
						com.tools20022.repository.msg.ATMDepositRequest1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDepositRequestV01.mmATMDepositRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositRequest1";
				definition = "Information related to the request of a deposit transaction from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment11 getEnvironment() {
		return environment;
	}

	public ATMDepositRequest1 setEnvironment(ATMEnvironment11 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext10 getContext() {
		return context;
	}

	public ATMDepositRequest1 setContext(ATMContext10 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction15 getTransaction() {
		return transaction;
	}

	public ATMDepositRequest1 setTransaction(ATMTransaction15 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}