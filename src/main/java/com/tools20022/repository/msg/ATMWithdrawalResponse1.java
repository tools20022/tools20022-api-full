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
import com.tools20022.repository.area.catp.ATMWithdrawalResponseV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext2;
import com.tools20022.repository.msg.ATMEnvironment2;
import com.tools20022.repository.msg.ATMTransaction2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response of an ATM withdrawal from an ATM manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1#mmEnvironment
 * ATMWithdrawalResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1#mmContext
 * ATMWithdrawalResponse1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1#mmTransaction
 * ATMWithdrawalResponse1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmATMWithdrawalResponse
 * ATMWithdrawalResponseV01.mmATMWithdrawalResponse}</li>
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
 * "ATMWithdrawalResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM withdrawal from an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalResponse1", propOrder = {"environment", "context", "transaction"})
public class ATMWithdrawalResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment2 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment2
	 * ATMEnvironment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1
	 * ATMWithdrawalResponse1}</li>
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
	 * definition} = "Environment of the withdrawal transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMEnvironment2> mmEnvironment = new MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMEnvironment2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the withdrawal transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment2.mmObject();
		}

		@Override
		public ATMEnvironment2 getValue(ATMWithdrawalResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMWithdrawalResponse1 obj, ATMEnvironment2 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext2 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext2
	 * ATMContext2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1
	 * ATMWithdrawalResponse1}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMContext2> mmContext = new MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext2.mmObject();
		}

		@Override
		public ATMContext2 getValue(ATMWithdrawalResponse1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMWithdrawalResponse1 obj, ATMContext2 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction2 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction2
	 * ATMTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1
	 * ATMWithdrawalResponse1}</li>
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
	 * definition} = "Response to the withdrawal transaction request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMTransaction2> mmTransaction = new MMMessageAssociationEnd<ATMWithdrawalResponse1, ATMTransaction2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Response to the withdrawal transaction request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction2.mmObject();
		}

		@Override
		public ATMTransaction2 getValue(ATMWithdrawalResponse1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMWithdrawalResponse1 obj, ATMTransaction2 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalResponse1.mmEnvironment, com.tools20022.repository.msg.ATMWithdrawalResponse1.mmContext,
						com.tools20022.repository.msg.ATMWithdrawalResponse1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMWithdrawalResponseV01.mmATMWithdrawalResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalResponse1";
				definition = "Information related to the response of an ATM withdrawal from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment2 getEnvironment() {
		return environment;
	}

	public ATMWithdrawalResponse1 setEnvironment(ATMEnvironment2 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext2 getContext() {
		return context;
	}

	public ATMWithdrawalResponse1 setContext(ATMContext2 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction2 getTransaction() {
		return transaction;
	}

	public ATMWithdrawalResponse1 setTransaction(ATMTransaction2 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}