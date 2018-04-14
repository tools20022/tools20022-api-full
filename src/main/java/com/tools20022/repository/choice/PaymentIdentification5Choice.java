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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.camt.CancelTransactionV07;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LongPaymentIdentification1;
import com.tools20022.repository.msg.QueueTransactionIdentification1;
import com.tools20022.repository.msg.ShortPaymentIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between ways of identifying a payment instruction by its references
 * and business identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmTransactionIdentification
 * PaymentIdentification5Choice.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmQueueIdentification
 * PaymentIdentification5Choice.mmQueueIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmLongBusinessIdentification
 * PaymentIdentification5Choice.mmLongBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmShortBusinessIdentification
 * PaymentIdentification5Choice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice#mmProprietaryIdentification
 * PaymentIdentification5Choice.mmProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.CancelTransactionV07#mmPaymentIdentification
 * CancelTransactionV07.mmPaymentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentIdentification5Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ways of identifying a payment instruction by its references and business identification."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice
 * PaymentIdentification4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentIdentification5Choice", propOrder = {"transactionIdentification", "queueIdentification", "longBusinessIdentification", "shortBusinessIdentification", "proprietaryIdentification"})
public class PaymentIdentification5Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference element."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmTransactionIdentification
	 * PaymentIdentification4Choice.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification5Choice, Max35Text> mmTransactionIdentification = new MMMessageAttribute<PaymentIdentification5Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification5Choice.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference element.";
			previousVersion_lazy = () -> PaymentIdentification4Choice.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentIdentification5Choice obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(PaymentIdentification5Choice obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "QId", required = true)
	protected QueueTransactionIdentification1 queueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentification1
	 * QueueTransactionIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment instruction by its position in a queue managed by the clearing agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmQueueIdentification
	 * PaymentIdentification4Choice.mmQueueIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentIdentification5Choice, QueueTransactionIdentification1> mmQueueIdentification = new MMMessageAssociationEnd<PaymentIdentification5Choice, QueueTransactionIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification5Choice.mmObject();
			isDerived = false;
			xmlTag = "QId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueIdentification";
			definition = "Identification of the payment instruction by its position in a queue managed by the clearing agent.";
			previousVersion_lazy = () -> PaymentIdentification4Choice.mmQueueIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QueueTransactionIdentification1.mmObject();
		}

		@Override
		public QueueTransactionIdentification1 getValue(PaymentIdentification5Choice obj) {
			return obj.getQueueIdentification();
		}

		@Override
		public void setValue(PaymentIdentification5Choice obj, QueueTransactionIdentification1 value) {
			obj.setQueueIdentification(value);
		}
	};
	@XmlElement(name = "LngBizId", required = true)
	protected LongPaymentIdentification1 longBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LongPaymentIdentification1
	 * LongPaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngBizId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmLongBusinessIdentification
	 * PaymentIdentification4Choice.mmLongBusinessIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentIdentification5Choice, LongPaymentIdentification1> mmLongBusinessIdentification = new MMMessageAssociationEnd<PaymentIdentification5Choice, LongPaymentIdentification1>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification5Choice.mmObject();
			isDerived = false;
			xmlTag = "LngBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			previousVersion_lazy = () -> PaymentIdentification4Choice.mmLongBusinessIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LongPaymentIdentification1.mmObject();
		}

		@Override
		public LongPaymentIdentification1 getValue(PaymentIdentification5Choice obj) {
			return obj.getLongBusinessIdentification();
		}

		@Override
		public void setValue(PaymentIdentification5Choice obj, LongPaymentIdentification1 value) {
			obj.setLongBusinessIdentification(value);
		}
	};
	@XmlElement(name = "ShrtBizId", required = true)
	protected ShortPaymentIdentification1 shortBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1
	 * ShortPaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtBizId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmShortBusinessIdentification
	 * PaymentIdentification4Choice.mmShortBusinessIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentIdentification5Choice, ShortPaymentIdentification1> mmShortBusinessIdentification = new MMMessageAssociationEnd<PaymentIdentification5Choice, ShortPaymentIdentification1>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification5Choice.mmObject();
			isDerived = false;
			xmlTag = "ShrtBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			previousVersion_lazy = () -> PaymentIdentification4Choice.mmShortBusinessIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ShortPaymentIdentification1.mmObject();
		}

		@Override
		public ShortPaymentIdentification1 getValue(PaymentIdentification5Choice obj) {
			return obj.getShortBusinessIdentification();
		}

		@Override
		public void setValue(PaymentIdentification5Choice obj, ShortPaymentIdentification1 value) {
			obj.setShortBusinessIdentification(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected Max70Text proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification5Choice
	 * PaymentIdentification5Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference of the underlying payment instruction assigned by Target2 SSP."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice#mmProprietaryIdentification
	 * PaymentIdentification4Choice.mmProprietaryIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentIdentification5Choice, Max70Text> mmProprietaryIdentification = new MMMessageAttribute<PaymentIdentification5Choice, Max70Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentification5Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique reference of the underlying payment instruction assigned by Target2 SSP.";
			previousVersion_lazy = () -> PaymentIdentification4Choice.mmProprietaryIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(PaymentIdentification5Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(PaymentIdentification5Choice obj, Max70Text value) {
			obj.setProprietaryIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentification5Choice.mmTransactionIdentification, com.tools20022.repository.choice.PaymentIdentification5Choice.mmQueueIdentification,
						com.tools20022.repository.choice.PaymentIdentification5Choice.mmLongBusinessIdentification, com.tools20022.repository.choice.PaymentIdentification5Choice.mmShortBusinessIdentification,
						com.tools20022.repository.choice.PaymentIdentification5Choice.mmProprietaryIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(CancelTransactionV07.mmPaymentIdentification);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentIdentification5Choice";
				definition = "Choice between ways of identifying a payment instruction by its references and business identification.";
				previousVersion_lazy = () -> PaymentIdentification4Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public PaymentIdentification5Choice setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public QueueTransactionIdentification1 getQueueIdentification() {
		return queueIdentification;
	}

	public PaymentIdentification5Choice setQueueIdentification(QueueTransactionIdentification1 queueIdentification) {
		this.queueIdentification = Objects.requireNonNull(queueIdentification);
		return this;
	}

	public LongPaymentIdentification1 getLongBusinessIdentification() {
		return longBusinessIdentification;
	}

	public PaymentIdentification5Choice setLongBusinessIdentification(LongPaymentIdentification1 longBusinessIdentification) {
		this.longBusinessIdentification = Objects.requireNonNull(longBusinessIdentification);
		return this;
	}

	public ShortPaymentIdentification1 getShortBusinessIdentification() {
		return shortBusinessIdentification;
	}

	public PaymentIdentification5Choice setShortBusinessIdentification(ShortPaymentIdentification1 shortBusinessIdentification) {
		this.shortBusinessIdentification = Objects.requireNonNull(shortBusinessIdentification);
		return this;
	}

	public Max70Text getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public PaymentIdentification5Choice setProprietaryIdentification(Max70Text proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}
}