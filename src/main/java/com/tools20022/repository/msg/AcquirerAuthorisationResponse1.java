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
import com.tools20022.repository.area.cain.AcquirerAuthorisationResponse;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardTransaction4;
import com.tools20022.repository.msg.CardTransactionContext3;
import com.tools20022.repository.msg.CardTransactionEnvironment2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the response of an authorisation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1#mmEnvironment
 * AcquirerAuthorisationResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1#mmContext
 * AcquirerAuthorisationResponse1.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1#mmTransaction
 * AcquirerAuthorisationResponse1.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationResponse#mmAuthorisationResponse
 * AcquirerAuthorisationResponse.mmAuthorisationResponse}</li>
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
 * "AcquirerAuthorisationResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the response of an authorisation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerAuthorisationResponse1", propOrder = {"environment", "context", "transaction"})
public class AcquirerAuthorisationResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardTransactionEnvironment2 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionEnvironment2
	 * CardTransactionEnvironment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1
	 * AcquirerAuthorisationResponse1}</li>
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
	public static final MMMessageAssociationEnd<AcquirerAuthorisationResponse1, CardTransactionEnvironment2> mmEnvironment = new MMMessageAssociationEnd<AcquirerAuthorisationResponse1, CardTransactionEnvironment2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardTransactionEnvironment2.mmObject();
		}

		@Override
		public CardTransactionEnvironment2 getValue(AcquirerAuthorisationResponse1 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(AcquirerAuthorisationResponse1 obj, CardTransactionEnvironment2 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected CardTransactionContext3 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionContext3
	 * CardTransactionContext3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1
	 * AcquirerAuthorisationResponse1}</li>
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
	 * definition} = "Context in which the card transaction is performed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerAuthorisationResponse1, Optional<CardTransactionContext3>> mmContext = new MMMessageAssociationEnd<AcquirerAuthorisationResponse1, Optional<CardTransactionContext3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the card transaction is performed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardTransactionContext3.mmObject();
		}

		@Override
		public Optional<CardTransactionContext3> getValue(AcquirerAuthorisationResponse1 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(AcquirerAuthorisationResponse1 obj, Optional<CardTransactionContext3> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx")
	protected CardTransaction4 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerAuthorisationResponse1
	 * AcquirerAuthorisationResponse1}</li>
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
	 * "Card transaction for which the authorisation has been requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcquirerAuthorisationResponse1, Optional<CardTransaction4>> mmTransaction = new MMMessageAssociationEnd<AcquirerAuthorisationResponse1, Optional<CardTransaction4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card transaction for which the authorisation has been requested.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardTransaction4.mmObject();
		}

		@Override
		public Optional<CardTransaction4> getValue(AcquirerAuthorisationResponse1 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(AcquirerAuthorisationResponse1 obj, Optional<CardTransaction4> value) {
			obj.setTransaction(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmEnvironment, com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmContext,
						com.tools20022.repository.msg.AcquirerAuthorisationResponse1.mmTransaction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerAuthorisationResponse.mmAuthorisationResponse);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerAuthorisationResponse1";
				definition = "Information related to the response of an authorisation.";
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionEnvironment2 getEnvironment() {
		return environment;
	}

	public AcquirerAuthorisationResponse1 setEnvironment(CardTransactionEnvironment2 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<CardTransactionContext3> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public AcquirerAuthorisationResponse1 setContext(CardTransactionContext3 context) {
		this.context = context;
		return this;
	}

	public Optional<CardTransaction4> getTransaction() {
		return transaction == null ? Optional.empty() : Optional.of(transaction);
	}

	public AcquirerAuthorisationResponse1 setTransaction(CardTransaction4 transaction) {
		this.transaction = transaction;
		return this;
	}
}