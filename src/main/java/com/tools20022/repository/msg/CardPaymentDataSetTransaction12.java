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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max9NumericText;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentContext12;
import com.tools20022.repository.msg.CardPaymentEnvironment32;
import com.tools20022.repository.msg.CardPaymentTransaction47;
import com.tools20022.repository.msg.Traceability2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment transaction to be authorised in a batch.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmTransactionSequenceCounter
 * CardPaymentDataSetTransaction12.mmTransactionSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmTraceability
 * CardPaymentDataSetTransaction12.mmTraceability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmEnvironment
 * CardPaymentDataSetTransaction12.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmContext
 * CardPaymentDataSetTransaction12.mmContext}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12#mmTransaction
 * CardPaymentDataSetTransaction12.mmTransaction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardPaymentDataSetTransaction12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Card payment transaction to be authorised in a batch."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16
 * CardPaymentDataSetTransaction16}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8
 * CardPaymentDataSetTransaction8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentDataSetTransaction12", propOrder = {"transactionSequenceCounter", "traceability", "environment", "context", "transaction"})
public class CardPaymentDataSetTransaction12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxSeqCntr", required = true)
	protected Max9NumericText transactionSequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max9NumericText
	 * Max9NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
	 * CardPaymentDataSetTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSeqCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequential counter of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction16.mmTransactionSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmTransactionSequenceCounter
	 * CardPaymentDataSetTransaction8.mmTransactionSequenceCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction12, Max9NumericText> mmTransactionSequenceCounter = new MMMessageAttribute<CardPaymentDataSetTransaction12, Max9NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmObject();
			isDerived = false;
			xmlTag = "TxSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceCounter";
			definition = "Sequential counter of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmTransactionSequenceCounter);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmTransactionSequenceCounter;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max9NumericText.mmObject();
		}

		@Override
		public Max9NumericText getValue(CardPaymentDataSetTransaction12 obj) {
			return obj.getTransactionSequenceCounter();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction12 obj, Max9NumericText value) {
			obj.setTransactionSequenceCounter(value);
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<Traceability2> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Traceability2
	 * Traceability2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
	 * CardPaymentDataSetTransaction12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTraceability
	 * CardPaymentDataSetTransaction16.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmTraceability
	 * CardPaymentDataSetTransaction8.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction12, List<Traceability2>> mmTraceability = new MMMessageAssociationEnd<CardPaymentDataSetTransaction12, List<Traceability2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in the exchange from the merchant to the issuer, with the corresponding timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmTraceability);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmTraceability;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Traceability2.mmObject();
		}

		@Override
		public List<Traceability2> getValue(CardPaymentDataSetTransaction12 obj) {
			return obj.getTraceability();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction12 obj, List<Traceability2> value) {
			obj.setTraceability(value);
		}
	};
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment32 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment32
	 * CardPaymentEnvironment32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
	 * CardPaymentDataSetTransaction12}</li>
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
	 * definition} =
	 * "Data related to the environment of the card payment transaction to authorise."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmEnvironment
	 * CardPaymentDataSetTransaction16.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmEnvironment
	 * CardPaymentDataSetTransaction8.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction12, CardPaymentEnvironment32> mmEnvironment = new MMMessageAssociationEnd<CardPaymentDataSetTransaction12, CardPaymentEnvironment32>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Data related to the environment of the card payment transaction to authorise.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmEnvironment);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentEnvironment32.mmObject();
		}

		@Override
		public CardPaymentEnvironment32 getValue(CardPaymentDataSetTransaction12 obj) {
			return obj.getEnvironment();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction12 obj, CardPaymentEnvironment32 value) {
			obj.setEnvironment(value);
		}
	};
	@XmlElement(name = "Cntxt")
	protected CardPaymentContext12 context;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentContext12
	 * CardPaymentContext12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
	 * CardPaymentDataSetTransaction12}</li>
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
	 * definition} =
	 * "Context in which the transaction is performed (payment and sale)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmContext
	 * CardPaymentDataSetTransaction16.mmContext}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmContext
	 * CardPaymentDataSetTransaction8.mmContext}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentDataSetTransaction12, Optional<CardPaymentContext12>> mmContext = new MMMessageAttribute<CardPaymentDataSetTransaction12, Optional<CardPaymentContext12>>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmObject();
			isDerived = false;
			xmlTag = "Cntxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Context";
			definition = "Context in which the transaction is performed (payment and sale).";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmContext);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmContext;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentContext12.mmObject();
		}

		@Override
		public Optional<CardPaymentContext12> getValue(CardPaymentDataSetTransaction12 obj) {
			return obj.getContext();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction12 obj, Optional<CardPaymentContext12> value) {
			obj.setContext(value.orElse(null));
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransaction47 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction47
	 * CardPaymentTransaction47}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction12
	 * CardPaymentDataSetTransaction12}</li>
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
	 * definition} = "Card payment transaction to authorise."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction16#mmTransaction
	 * CardPaymentDataSetTransaction16.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSetTransaction8#mmTransaction
	 * CardPaymentDataSetTransaction8.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentDataSetTransaction12, CardPaymentTransaction47> mmTransaction = new MMMessageAssociationEnd<CardPaymentDataSetTransaction12, CardPaymentTransaction47>() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Card payment transaction to authorise.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmTransaction);
			previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CardPaymentTransaction47.mmObject();
		}

		@Override
		public CardPaymentTransaction47 getValue(CardPaymentDataSetTransaction12 obj) {
			return obj.getTransaction();
		}

		@Override
		public void setValue(CardPaymentDataSetTransaction12 obj, CardPaymentTransaction47 value) {
			obj.setTransaction(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmTransactionSequenceCounter, com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmTraceability,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmEnvironment, com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmContext,
						com.tools20022.repository.msg.CardPaymentDataSetTransaction12.mmTransaction);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentDataSetTransaction12";
				definition = "Card payment transaction to be authorised in a batch.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentDataSetTransaction16.mmObject());
				previousVersion_lazy = () -> CardPaymentDataSetTransaction8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max9NumericText getTransactionSequenceCounter() {
		return transactionSequenceCounter;
	}

	public CardPaymentDataSetTransaction12 setTransactionSequenceCounter(Max9NumericText transactionSequenceCounter) {
		this.transactionSequenceCounter = Objects.requireNonNull(transactionSequenceCounter);
		return this;
	}

	public List<Traceability2> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public CardPaymentDataSetTransaction12 setTraceability(List<Traceability2> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}

	public CardPaymentEnvironment32 getEnvironment() {
		return environment;
	}

	public CardPaymentDataSetTransaction12 setEnvironment(CardPaymentEnvironment32 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public Optional<CardPaymentContext12> getContext() {
		return context == null ? Optional.empty() : Optional.of(context);
	}

	public CardPaymentDataSetTransaction12 setContext(CardPaymentContext12 context) {
		this.context = context;
		return this;
	}

	public CardPaymentTransaction47 getTransaction() {
		return transaction;
	}

	public CardPaymentDataSetTransaction12 setTransaction(CardPaymentTransaction47 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}
}