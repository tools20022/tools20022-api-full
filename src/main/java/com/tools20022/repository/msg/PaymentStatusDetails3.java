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
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PaymentStatusCode3Choice;
import com.tools20022.repository.choice.PaymentStatusReasonCode3Choice;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the payment status details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#mmPaymentInstructionStatus
 * PaymentStatusDetails3.mmPaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#mmPaymentInstructionStatusDateTime
 * PaymentStatusDetails3.mmPaymentInstructionStatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3#mmPaymentInstructionStatusReason
 * PaymentStatusDetails3.mmPaymentInstructionStatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
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
 * "PaymentStatusDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the payment status details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentStatusDetails3", propOrder = {"paymentInstructionStatus", "paymentInstructionStatusDateTime", "paymentInstructionStatusReason"})
public class PaymentStatusDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInstrSts")
	protected PaymentStatusCode3Choice paymentInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode3Choice
	 * PaymentStatusCode3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3
	 * PaymentStatusDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of a transfer, in coded form, as assigned by the transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentInstructionStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentStatusDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatus";
			definition = "Status of a transfer, in coded form, as assigned by the transaction administrator.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatusCode3Choice.mmObject();
		}
	};
	@XmlElement(name = "PmtInstrStsDtTm")
	protected DateAndDateTimeChoice paymentInstructionStatusDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3
	 * PaymentStatusDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrStsDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatusDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the status was assigned to the transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentStatusDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusDateTime";
			definition = "Date and time at which the status was assigned to the transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "PmtInstrStsRsn")
	protected List<PaymentStatusReasonCode3Choice> paymentInstructionStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode3Choice
	 * PaymentStatusReasonCode3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails3
	 * PaymentStatusDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason provided for the status of a transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentStatusDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusReason";
			definition = "Reason provided for the status of a transfer.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentStatusReasonCode3Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentStatusDetails3.mmPaymentInstructionStatus, com.tools20022.repository.msg.PaymentStatusDetails3.mmPaymentInstructionStatusDateTime,
						com.tools20022.repository.msg.PaymentStatusDetails3.mmPaymentInstructionStatusReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusDetails3";
				definition = "Information related to the payment status details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentStatusCode3Choice> getPaymentInstructionStatus() {
		return paymentInstructionStatus == null ? Optional.empty() : Optional.of(paymentInstructionStatus);
	}

	public PaymentStatusDetails3 setPaymentInstructionStatus(PaymentStatusCode3Choice paymentInstructionStatus) {
		this.paymentInstructionStatus = paymentInstructionStatus;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPaymentInstructionStatusDateTime() {
		return paymentInstructionStatusDateTime == null ? Optional.empty() : Optional.of(paymentInstructionStatusDateTime);
	}

	public PaymentStatusDetails3 setPaymentInstructionStatusDateTime(DateAndDateTimeChoice paymentInstructionStatusDateTime) {
		this.paymentInstructionStatusDateTime = paymentInstructionStatusDateTime;
		return this;
	}

	public List<PaymentStatusReasonCode3Choice> getPaymentInstructionStatusReason() {
		return paymentInstructionStatusReason == null ? paymentInstructionStatusReason = new ArrayList<>() : paymentInstructionStatusReason;
	}

	public PaymentStatusDetails3 setPaymentInstructionStatusReason(List<PaymentStatusReasonCode3Choice> paymentInstructionStatusReason) {
		this.paymentInstructionStatusReason = Objects.requireNonNull(paymentInstructionStatusReason);
		return this;
	}
}