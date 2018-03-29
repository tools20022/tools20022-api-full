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
import com.tools20022.repository.area.catp.ATMWithdrawalResponseV02;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMContext9;
import com.tools20022.repository.msg.ATMEnvironment12;
import com.tools20022.repository.msg.ATMTransaction14;
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
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2#mmEnvironment
 * ATMWithdrawalResponse2.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2#mmContext
 * ATMWithdrawalResponse2.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2#mmTransaction
 * ATMWithdrawalResponse2.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#mmATMWithdrawalResponse
 * ATMWithdrawalResponseV02.mmATMWithdrawalResponse}</li>
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
 * "ATMWithdrawalResponse2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the response of an ATM withdrawal from an ATM manager."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalResponse2", propOrder = {"environment", "context", "transaction"})
public class ATMWithdrawalResponse2 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2
	 * ATMWithdrawalResponse2}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMEnvironment12> mmEnvironment = new MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMEnvironment12>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse2.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the withdrawal transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMEnvironment12.mmObject();
		}

		@Override
		public ATMEnvironment12 getValue(ATMWithdrawalResponse2 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(ATMWithdrawalResponse2 obj, ATMEnvironment12 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected ATMContext9 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMContext9
	 * ATMContext9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2
	 * ATMWithdrawalResponse2}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMContext9> mmContext = new MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMContext9>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse2.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMContext9.mmObject();
		}

		@Override
		public ATMContext9 getValue(ATMWithdrawalResponse2 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(ATMWithdrawalResponse2 obj, ATMContext9 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected ATMTransaction14 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransaction14
	 * ATMTransaction14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse2
	 * ATMWithdrawalResponse2}</li>
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
	public static final MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMTransaction14> mmTransaction = new MMMessageAssociationEnd<ATMWithdrawalResponse2, ATMTransaction14>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMWithdrawalResponse2.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Response to the withdrawal transaction request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ATMTransaction14.mmObject();
		}

		@Override
		public ATMTransaction14 getValue(ATMWithdrawalResponse2 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(ATMWithdrawalResponse2 obj, ATMTransaction14 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMWithdrawalResponse2.mmEnvironment, com.tools20022.repository.msg.ATMWithdrawalResponse2.mmContext,
						com.tools20022.repository.msg.ATMWithdrawalResponse2.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMWithdrawalResponseV02.mmATMWithdrawalResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalResponse2";
				definition = "Information related to the response of an ATM withdrawal from an ATM manager.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMEnvironment12 getEnvironment() {
		return environment;
	}

	public ATMWithdrawalResponse2 setEnvironment(ATMEnvironment12 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public ATMContext9 getContext() {
		return context;
	}

	public ATMWithdrawalResponse2 setContext(ATMContext9 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public ATMTransaction14 getTransaction() {
		return transaction;
	}

	public ATMWithdrawalResponse2 setTransaction(ATMTransaction14 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}