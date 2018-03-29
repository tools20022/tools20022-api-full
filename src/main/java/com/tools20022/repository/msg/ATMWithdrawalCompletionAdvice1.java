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
import com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext2;
import com.tools20022.repository.msg.ATMEnvironment3;
import com.tools20022.repository.msg.ATMTransaction3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the completion of a withdrawal on the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1#mmEnvironment
 * ATMWithdrawalCompletionAdvice1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1#mmContext
 * ATMWithdrawalCompletionAdvice1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1#mmTransaction
 * ATMWithdrawalCompletionAdvice1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01#mmATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV01.mmATMWithdrawalCompletionAdvice}</li>
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
 * "ATMWithdrawalCompletionAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the completion of a withdrawal on the ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalCompletionAdvice1", propOrder = {"environment", "context", "transaction"})
public class ATMWithdrawalCompletionAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected ATMEnvironment3 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMEnvironment3
	 * ATMEnvironment3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1
	 * ATMWithdrawalCompletionAdvice1}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMEnvironment3> mmEnvironment = new MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMEnvironment3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the withdrawal transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment3.mmObject();
		}

		@Override
		public ATMEnvironment3 getValue(ATMWithdrawalCompletionAdvice1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAdvice1 obj, ATMEnvironment3 value) {
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
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1
	 * ATMWithdrawalCompletionAdvice1}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMContext2> mmContext = new MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMContext2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmObject();
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
		public ATMContext2 getValue(ATMWithdrawalCompletionAdvice1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAdvice1 obj, ATMContext2 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction3 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction3
	 * ATMTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1
	 * ATMWithdrawalCompletionAdvice1}</li>
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
	 * definition} = "Withdrawal transaction for which the completion is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMTransaction3> mmTransaction = new MMMessageAssociationEnd<ATMWithdrawalCompletionAdvice1, ATMTransaction3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Withdrawal transaction for which the completion is sent.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction3.mmObject();
		}

		@Override
		public ATMTransaction3 getValue(ATMWithdrawalCompletionAdvice1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMWithdrawalCompletionAdvice1 obj, ATMTransaction3 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmEnvironment, com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmContext,
						com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMWithdrawalCompletionAdviceV01.mmATMWithdrawalCompletionAdvice);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalCompletionAdvice1";
				definition = "Information related to the completion of a withdrawal on the ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment3 getEnvironment() {
		return environment;
	}

	public ATMWithdrawalCompletionAdvice1 setEnvironment(ATMEnvironment3 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext2 getContext() {
		return context;
	}

	public ATMWithdrawalCompletionAdvice1 setContext(ATMContext2 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction3 getTransaction() {
		return transaction;
	}

	public ATMWithdrawalCompletionAdvice1 setTransaction(ATMTransaction3 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}