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
import com.tools20022.repository.area.catp.ATMWithdrawalRequestV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext8;
import com.tools20022.repository.msg.ATMEnvironment11;
import com.tools20022.repository.msg.ATMTransaction13;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the request of a withdrawal from an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2#mmEnvironment
 * ATMWithdrawalRequest2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2#mmContext
 * ATMWithdrawalRequest2.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2#mmTransaction
 * ATMWithdrawalRequest2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#mmATMWithdrawalRequest
 * ATMWithdrawalRequestV02.mmATMWithdrawalRequest}</li>
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
 * "ATMWithdrawalRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the request of a withdrawal from an ATM."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalRequest2", propOrder = {"environment", "context", "transaction"})
public class ATMWithdrawalRequest2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2
	 * ATMWithdrawalRequest2}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMEnvironment11> mmEnvironment = new MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMEnvironment11>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalRequest2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the withdrawal transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment11.mmObject();
		}

		@Override
		public ATMEnvironment11 getValue(ATMWithdrawalRequest2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMWithdrawalRequest2 obj, ATMEnvironment11 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext8 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext8
	 * ATMContext8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2
	 * ATMWithdrawalRequest2}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMContext8> mmContext = new MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMContext8>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalRequest2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext8.mmObject();
		}

		@Override
		public ATMContext8 getValue(ATMWithdrawalRequest2 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMWithdrawalRequest2 obj, ATMContext8 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction13 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction13
	 * ATMTransaction13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalRequest2
	 * ATMWithdrawalRequest2}</li>
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
	 * definition} =
	 * "Withdrawal transaction for which the authorisation is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMTransaction13> mmTransaction = new MMMessageAssociationEnd<ATMWithdrawalRequest2, ATMTransaction13>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalRequest2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Withdrawal transaction for which the authorisation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction13.mmObject();
		}

		@Override
		public ATMTransaction13 getValue(ATMWithdrawalRequest2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMWithdrawalRequest2 obj, ATMTransaction13 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalRequest2.mmEnvironment, com.tools20022.repository.msg.ATMWithdrawalRequest2.mmContext,
						com.tools20022.repository.msg.ATMWithdrawalRequest2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMWithdrawalRequestV02.mmATMWithdrawalRequest);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalRequest2";
				definition = "Information related to the request of a withdrawal from an ATM.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment11 getEnvironment() {
		return environment;
	}

	public ATMWithdrawalRequest2 setEnvironment(ATMEnvironment11 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext8 getContext() {
		return context;
	}

	public ATMWithdrawalRequest2 setContext(ATMContext8 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction13 getTransaction() {
		return transaction;
	}

	public ATMWithdrawalRequest2 setTransaction(ATMTransaction13 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}