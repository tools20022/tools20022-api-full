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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.QueueTransaction1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment funds transfer instructions from intraday queue.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1#mmQueueType
 * QueuedTransactionsReport1.mmQueueType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1#mmNumberOfTransactions
 * QueuedTransactionsReport1.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1#mmTotalAmount
 * QueuedTransactionsReport1.mmTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1#mmBreakdownByCounterparty
 * QueuedTransactionsReport1.mmBreakdownByCounterparty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QueuedTransactionsReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Payment funds transfer instructions from intraday queue."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QueuedTransactionsReport1", propOrder = {"queueType", "numberOfTransactions", "totalAmount", "breakdownByCounterparty"})
public class QueuedTransactionsReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QTp", required = true)
	protected Max35Text queueType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of queue names/ identifiers."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QueuedTransactionsReport1, Max35Text> mmQueueType = new MMMessageAttribute<QueuedTransactionsReport1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
			isDerived = false;
			xmlTag = "QTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueType";
			definition = "List of queue names/ identifiers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(QueuedTransactionsReport1 obj) {
			return obj.getQueueType();
		}

		@Override
		public void setValue(QueuedTransactionsReport1 obj, Max35Text value) {
			obj.setQueueType(value);
		}
	};
	@XmlElement(name = "NbOfTxs")
	protected Number numberOfTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of transactions in the queue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QueuedTransactionsReport1, Optional<Number>> mmNumberOfTransactions = new MMMessageAttribute<QueuedTransactionsReport1, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of transactions in the queue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(QueuedTransactionsReport1 obj) {
			return obj.getNumberOfTransactions();
		}

		@Override
		public void setValue(QueuedTransactionsReport1 obj, Optional<Number> value) {
			obj.setNumberOfTransactions(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmt", required = true)
	protected ActiveCurrencyAndAmount totalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of transactions in a given queue."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QueuedTransactionsReport1, ActiveCurrencyAndAmount> mmTotalAmount = new MMMessageAttribute<QueuedTransactionsReport1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmount";
			definition = "Total amount of transactions in a given queue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(QueuedTransactionsReport1 obj) {
			return obj.getTotalAmount();
		}

		@Override
		public void setValue(QueuedTransactionsReport1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalAmount(value);
		}
	};
	@XmlElement(name = "BrkdwnByCtrPty")
	protected List<QueueTransaction1> breakdownByCounterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QueueTransaction1
	 * QueueTransaction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByCtrPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction details sorted by counterparty account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QueuedTransactionsReport1, List<QueueTransaction1>> mmBreakdownByCounterparty = new MMMessageAssociationEnd<QueuedTransactionsReport1, List<QueueTransaction1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByCtrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByCounterparty";
			definition = "Transaction details sorted by counterparty account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QueueTransaction1.mmObject();
		}

		@Override
		public List<QueueTransaction1> getValue(QueuedTransactionsReport1 obj) {
			return obj.getBreakdownByCounterparty();
		}

		@Override
		public void setValue(QueuedTransactionsReport1 obj, List<QueueTransaction1> value) {
			obj.setBreakdownByCounterparty(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QueuedTransactionsReport1.mmQueueType, com.tools20022.repository.msg.QueuedTransactionsReport1.mmNumberOfTransactions,
						com.tools20022.repository.msg.QueuedTransactionsReport1.mmTotalAmount, com.tools20022.repository.msg.QueuedTransactionsReport1.mmBreakdownByCounterparty);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "QueuedTransactionsReport1";
				definition = "Payment funds transfer instructions from intraday queue.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getQueueType() {
		return queueType;
	}

	public QueuedTransactionsReport1 setQueueType(Max35Text queueType) {
		this.queueType = Objects.requireNonNull(queueType);
		return this;
	}

	public Optional<Number> getNumberOfTransactions() {
		return numberOfTransactions == null ? Optional.empty() : Optional.of(numberOfTransactions);
	}

	public QueuedTransactionsReport1 setNumberOfTransactions(Number numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalAmount() {
		return totalAmount;
	}

	public QueuedTransactionsReport1 setTotalAmount(ActiveCurrencyAndAmount totalAmount) {
		this.totalAmount = Objects.requireNonNull(totalAmount);
		return this;
	}

	public List<QueueTransaction1> getBreakdownByCounterparty() {
		return breakdownByCounterparty == null ? breakdownByCounterparty = new ArrayList<>() : breakdownByCounterparty;
	}

	public QueuedTransactionsReport1 setBreakdownByCounterparty(List<QueueTransaction1> breakdownByCounterparty) {
		this.breakdownByCounterparty = Objects.requireNonNull(breakdownByCounterparty);
		return this;
	}
}