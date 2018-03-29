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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max16Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a payment instruction by its relative position in a queue
 * of payment transactions managed by the clearing agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails#mmQueueIdentification
 * QueueTransactionIdentificationDetails.mmQueueIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails#mmPositionInQueue
 * QueueTransactionIdentificationDetails.mmPositionInQueue}</li>
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
 * "QueueTransactionIdentificationDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a payment instruction by its relative position in a queue of payment transactions managed by the clearing agent."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentification1
 * QueueTransactionIdentification1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QueueTransactionIdentificationDetails", propOrder = {"queueIdentification", "positionInQueue"})
public class QueueTransactionIdentificationDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QId", required = true)
	protected Max16Text queueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails
	 * QueueTransactionIdentificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment queue where the payment instruction resides."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentification1#mmQueueIdentification
	 * QueueTransactionIdentification1.mmQueueIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QueueTransactionIdentificationDetails, Max16Text> mmQueueIdentification = new MMMessageAttribute<QueueTransactionIdentificationDetails, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueueTransactionIdentificationDetails.mmObject();
			isDerived = false;
			xmlTag = "QId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueIdentification";
			definition = "Identification of the payment queue where the payment instruction resides.";
			nextVersions_lazy = () -> Arrays.asList(QueueTransactionIdentification1.mmQueueIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(QueueTransactionIdentificationDetails obj) {
			return obj.getQueueIdentification();
		}

		@Override
		public void setValue(QueueTransactionIdentificationDetails obj, Max16Text value) {
			obj.setQueueIdentification(value);
		}
	};
	@XmlElement(name = "PosInQ", required = true)
	protected Max16Text positionInQueue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max16Text
	 * Max16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails
	 * QueueTransactionIdentificationDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PosInQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionInQueue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Position of the payment instruction within the identified queue."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentification1#mmPositionInQueue
	 * QueueTransactionIdentification1.mmPositionInQueue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QueueTransactionIdentificationDetails, Max16Text> mmPositionInQueue = new MMMessageAttribute<QueueTransactionIdentificationDetails, Max16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.QueueTransactionIdentificationDetails.mmObject();
			isDerived = false;
			xmlTag = "PosInQ";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionInQueue";
			definition = "Position of the payment instruction within the identified queue.";
			nextVersions_lazy = () -> Arrays.asList(QueueTransactionIdentification1.mmPositionInQueue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max16Text.mmObject();
		}

		@Override
		public Max16Text getValue(QueueTransactionIdentificationDetails obj) {
			return obj.getPositionInQueue();
		}

		@Override
		public void setValue(QueueTransactionIdentificationDetails obj, Max16Text value) {
			obj.setPositionInQueue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QueueTransactionIdentificationDetails.mmQueueIdentification, com.tools20022.repository.msg.QueueTransactionIdentificationDetails.mmPositionInQueue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QueueTransactionIdentificationDetails";
				definition = "Identification of a payment instruction by its relative position in a queue of payment transactions managed by the clearing agent.";
				nextVersions_lazy = () -> Arrays.asList(QueueTransactionIdentification1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max16Text getQueueIdentification() {
		return queueIdentification;
	}

	public QueueTransactionIdentificationDetails setQueueIdentification(Max16Text queueIdentification) {
		this.queueIdentification = Objects.requireNonNull(queueIdentification);
		return this;
	}

	public Max16Text getPositionInQueue() {
		return positionInQueue;
	}

	public QueueTransactionIdentificationDetails setPositionInQueue(Max16Text positionInQueue) {
		this.positionInQueue = Objects.requireNonNull(positionInQueue);
		return this;
	}
}