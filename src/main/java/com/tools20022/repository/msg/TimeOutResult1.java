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
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.TimeOutEvent1;
import com.tools20022.repository.msg.TransactionStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the time-out consequences.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TimeOutResult1#mmTransactionFutureStatus
 * TimeOutResult1.mmTransactionFutureStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TimeOutResult1#mmTimeOutEvent
 * TimeOutResult1.mmTimeOutEvent}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeOutResult1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Describes the time-out consequences."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TimeOutResult1", propOrder = {"transactionFutureStatus", "timeOutEvent"})
public class TimeOutResult1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxFutrSts", required = true)
	protected TransactionStatus2 transactionFutureStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionStatus2
	 * TransactionStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TimeOutResult1 TimeOutResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxFutrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionFutureStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the transaction if no action is taken by the user."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TimeOutResult1, TransactionStatus2> mmTransactionFutureStatus = new MMMessageAssociationEnd<TimeOutResult1, TransactionStatus2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeOutResult1.mmObject();
			isDerived = false;
			xmlTag = "TxFutrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionFutureStatus";
			definition = "Specifies the status of the transaction if no action is taken by the user.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionStatus2.mmObject();
		}

		@Override
		public TransactionStatus2 getValue(TimeOutResult1 obj) {
			return obj.getTransactionFutureStatus();
		}

		@Override
		public void setValue(TimeOutResult1 obj, TransactionStatus2 value) {
			obj.setTransactionFutureStatus(value);
		}
	};
	@XmlElement(name = "TmOutEvt")
	protected TimeOutEvent1 timeOutEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TimeOutEvent1
	 * TimeOutEvent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TimeOutResult1 TimeOutResult1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmOutEvt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOutEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the time-out reason."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TimeOutResult1, Optional<TimeOutEvent1>> mmTimeOutEvent = new MMMessageAssociationEnd<TimeOutResult1, Optional<TimeOutEvent1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TimeOutResult1.mmObject();
			isDerived = false;
			xmlTag = "TmOutEvt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOutEvent";
			definition = "Describes the time-out reason.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TimeOutEvent1.mmObject();
		}

		@Override
		public Optional<TimeOutEvent1> getValue(TimeOutResult1 obj) {
			return obj.getTimeOutEvent();
		}

		@Override
		public void setValue(TimeOutResult1 obj, Optional<TimeOutEvent1> value) {
			obj.setTimeOutEvent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TimeOutResult1.mmTransactionFutureStatus, com.tools20022.repository.msg.TimeOutResult1.mmTimeOutEvent);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TimeOutResult1";
				definition = "Describes the time-out consequences.";
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionStatus2 getTransactionFutureStatus() {
		return transactionFutureStatus;
	}

	public TimeOutResult1 setTransactionFutureStatus(TransactionStatus2 transactionFutureStatus) {
		this.transactionFutureStatus = Objects.requireNonNull(transactionFutureStatus);
		return this;
	}

	public Optional<TimeOutEvent1> getTimeOutEvent() {
		return timeOutEvent == null ? Optional.empty() : Optional.of(timeOutEvent);
	}

	public TimeOutResult1 setTimeOutEvent(TimeOutEvent1 timeOutEvent) {
		this.timeOutEvent = timeOutEvent;
		return this;
	}
}