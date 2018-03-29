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
import com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext12;
import com.tools20022.repository.msg.ATMEnvironment13;
import com.tools20022.repository.msg.ATMTransaction19;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the completion of a deposit transaction on the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1#mmEnvironment
 * ATMDepositCompletionAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1#mmContext
 * ATMDepositCompletionAdvice1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1#mmTransaction
 * ATMDepositCompletionAdvice1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmATMDepositCompletionAdvice
 * ATMDepositCompletionAdviceV01.mmATMDepositCompletionAdvice}</li>
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
 * "ATMDepositCompletionAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the completion of a deposit transaction on the ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositCompletionAdvice1", propOrder = {"environment", "context", "transaction"})
public class ATMDepositCompletionAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment13 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment13
	 * ATMEnvironment13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1
	 * ATMDepositCompletionAdvice1}</li>
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
	 * definition} = "Environment of the deposit transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMEnvironment13> mmEnvironment = new MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMEnvironment13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the deposit transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment13.mmObject();
		}

		@Override
		public ATMEnvironment13 getValue(ATMDepositCompletionAdvice1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMDepositCompletionAdvice1 obj, ATMEnvironment13 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext12 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext12
	 * ATMContext12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1
	 * ATMDepositCompletionAdvice1}</li>
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
	public static final MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMContext12> mmContext = new MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMContext12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext12.mmObject();
		}

		@Override
		public ATMContext12 getValue(ATMDepositCompletionAdvice1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMDepositCompletionAdvice1 obj, ATMContext12 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction19 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1
	 * ATMDepositCompletionAdvice1}</li>
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
	 * definition} = "Deposit transaction for which the completion is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMTransaction19> mmTransaction = new MMMessageAssociationEnd<ATMDepositCompletionAdvice1, ATMTransaction19>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Deposit transaction for which the completion is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction19.mmObject();
		}

		@Override
		public ATMTransaction19 getValue(ATMDepositCompletionAdvice1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMDepositCompletionAdvice1 obj, ATMTransaction19 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmEnvironment, com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmContext,
						com.tools20022.repository.msg.ATMDepositCompletionAdvice1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMDepositCompletionAdviceV01.mmATMDepositCompletionAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositCompletionAdvice1";
				definition = "Information related to the completion of a deposit transaction on the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment13 getEnvironment() {
		return environment;
	}

	public ATMDepositCompletionAdvice1 setEnvironment(ATMEnvironment13 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext12 getContext() {
		return context;
	}

	public ATMDepositCompletionAdvice1 setContext(ATMContext12 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction19 getTransaction() {
		return transaction;
	}

	public ATMDepositCompletionAdvice1 setTransaction(ATMTransaction19 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}