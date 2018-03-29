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
import com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardTransaction15;
import com.tools20022.repository.msg.CardTransactionContext1;
import com.tools20022.repository.msg.CardTransactionEnvironment1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the authorisation initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1#mmEnvironment
 * AcquirerAuthorisationInitiation1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1#mmContext
 * AcquirerAuthorisationInitiation1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1#mmTransaction
 * AcquirerAuthorisationInitiation1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmAuthorisationInitiation
 * AcquirerAuthorisationInitiation.mmAuthorisationInitiation}</li>
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
 * "AcquirerAuthorisationInitiation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the authorisation initiation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerAuthorisationInitiation1", propOrder = {"environment", "context", "transaction"})
public class AcquirerAuthorisationInitiation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardTransactionEnvironment1 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment1
	 * CardTransactionEnvironment1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1
	 * AcquirerAuthorisationInitiation1}</li>
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
	 * definition} = "Environment of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransactionEnvironment1> mmEnvironment = new MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransactionEnvironment1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionEnvironment1.mmObject();
		}

		@Override
		public CardTransactionEnvironment1 getValue(AcquirerAuthorisationInitiation1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation1 obj, CardTransactionEnvironment1 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt", required = true)
	protected CardTransactionContext1 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext1
	 * CardTransactionContext1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1
	 * AcquirerAuthorisationInitiation1}</li>
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
	public static final MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransactionContext1> mmContext = new MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransactionContext1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionContext1.mmObject();
		}

		@Override
		public CardTransactionContext1 getValue(AcquirerAuthorisationInitiation1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation1 obj, CardTransactionContext1 value) {
			obj.setContext(value);
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardTransaction15 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction15
	 * CardTransaction15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationInitiation1
	 * AcquirerAuthorisationInitiation1}</li>
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
	 * "Card transaction for which the authorisation is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransaction15> mmTransaction = new MMMessageAssociationEnd<AcquirerAuthorisationInitiation1, CardTransaction15>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card transaction for which the authorisation is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransaction15.mmObject();
		}

		@Override
		public CardTransaction15 getValue(AcquirerAuthorisationInitiation1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcquirerAuthorisationInitiation1 obj, CardTransaction15 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmEnvironment, com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmContext,
						com.tools20022.repository.msg.AcquirerAuthorisationInitiation1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerAuthorisationInitiation.mmAuthorisationInitiation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerAuthorisationInitiation1";
				definition = "Information related to the authorisation initiation.";
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionEnvironment1 getEnvironment() {
		return environment;
	}

	public AcquirerAuthorisationInitiation1 setEnvironment(CardTransactionEnvironment1 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardTransactionContext1 getContext() {
		return context;
	}

	public AcquirerAuthorisationInitiation1 setContext(CardTransactionContext1 context) {
		this.context = Objects.requireNonNull(context);
		return this;
	}

	public CardTransaction15 getTransaction() {
		return transaction;
	}

	public AcquirerAuthorisationInitiation1 setTransaction(CardTransaction15 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}