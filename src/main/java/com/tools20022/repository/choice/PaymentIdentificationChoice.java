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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentInstructionReference1Details;
import com.tools20022.repository.msg.PaymentInstructionReference2Details;
import com.tools20022.repository.msg.QueueTransactionIdentificationDetails;
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
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmPaymentInstructionReference
 * PaymentIdentificationChoice.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmQueueIdentification
 * PaymentIdentificationChoice.mmQueueIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmShortBusinessIdentification
 * PaymentIdentificationChoice.mmShortBusinessIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice#mmLongBusinessIdentification
 * PaymentIdentificationChoice.mmLongBusinessIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
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
 * "PaymentIdentificationChoice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between ways of identifying a payment instruction by its references and business identification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentIdentificationChoice", propOrder = {"paymentInstructionReference", "queueIdentification", "shortBusinessIdentification", "longBusinessIdentification"})
public class PaymentIdentificationChoice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInstrRef", required = true)
	protected Max35Text paymentInstructionReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
	 * PaymentIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "QId", required = true)
	protected QueueTransactionIdentificationDetails queueIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QueueTransactionIdentificationDetails
	 * QueueTransactionIdentificationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
	 * PaymentIdentificationChoice}</li>
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
	 * "Identification of the payment instruction by its position in a queue managed by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQueueIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "QId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueIdentification";
			definition = "Identification of the payment instruction by its position in a queue managed by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QueueTransactionIdentificationDetails.mmObject();
		}
	};
	@XmlElement(name = "ShrtBizId", required = true)
	protected PaymentInstructionReference1Details shortBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
	 * PaymentIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtBizId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortBusinessIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "ShrtBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionReference1Details.mmObject();
		}
	};
	@XmlElement(name = "LngBizId", required = true)
	protected PaymentInstructionReference2Details longBusinessIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference2Details
	 * PaymentInstructionReference2Details}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentificationChoice
	 * PaymentIdentificationChoice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LngBizId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongBusinessIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Business identification of the payment instruction given by the clearing agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLongBusinessIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.PaymentIdentificationChoice.mmObject();
			isDerived = false;
			xmlTag = "LngBizId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongBusinessIdentification";
			definition = "Business identification of the payment instruction given by the clearing agent.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionReference2Details.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PaymentIdentificationChoice.mmPaymentInstructionReference, com.tools20022.repository.choice.PaymentIdentificationChoice.mmQueueIdentification,
						com.tools20022.repository.choice.PaymentIdentificationChoice.mmShortBusinessIdentification, com.tools20022.repository.choice.PaymentIdentificationChoice.mmLongBusinessIdentification);
				trace_lazy = () -> PaymentIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentIdentificationChoice";
				definition = "Choice between ways of identifying a payment instruction by its references and business identification.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPaymentInstructionReference() {
		return paymentInstructionReference;
	}

	public PaymentIdentificationChoice setPaymentInstructionReference(Max35Text paymentInstructionReference) {
		this.paymentInstructionReference = Objects.requireNonNull(paymentInstructionReference);
		return this;
	}

	public QueueTransactionIdentificationDetails getQueueIdentification() {
		return queueIdentification;
	}

	public PaymentIdentificationChoice setQueueIdentification(QueueTransactionIdentificationDetails queueIdentification) {
		this.queueIdentification = Objects.requireNonNull(queueIdentification);
		return this;
	}

	public PaymentInstructionReference1Details getShortBusinessIdentification() {
		return shortBusinessIdentification;
	}

	public PaymentIdentificationChoice setShortBusinessIdentification(PaymentInstructionReference1Details shortBusinessIdentification) {
		this.shortBusinessIdentification = Objects.requireNonNull(shortBusinessIdentification);
		return this;
	}

	public PaymentInstructionReference2Details getLongBusinessIdentification() {
		return longBusinessIdentification;
	}

	public PaymentIdentificationChoice setLongBusinessIdentification(PaymentInstructionReference2Details longBusinessIdentification) {
		this.longBusinessIdentification = Objects.requireNonNull(longBusinessIdentification);
		return this;
	}
}