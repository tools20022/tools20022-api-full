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
import com.tools20022.repository.choice.PaymentStatusCode4Choice;
import com.tools20022.repository.choice.PaymentStatusReasonCode4Choice;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#mmPaymentInstructionStatus
 * PaymentStatusDetails4.mmPaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#mmPaymentInstructionStatusDateTime
 * PaymentStatusDetails4.mmPaymentInstructionStatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4#mmPaymentInstructionStatusReason
 * PaymentStatusDetails4.mmPaymentInstructionStatusReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentStatus
 * PaymentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatusDetails4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to the payment status details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentStatusDetails4", propOrder = {"paymentInstructionStatus", "paymentInstructionStatusDateTime", "paymentInstructionStatusReason"})
public class PaymentStatusDetails4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentStatusCode4Choice paymentInstructionStatus;
	/**
	 * Status of a transfer, in coded form, as assigned by the transaction
	 * administrator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCode4Choice
	 * PaymentStatusCode4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4
	 * PaymentStatusDetails4}</li>
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
	 * "Status of a transfer, in coded form, as  assigned by the transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentInstructionStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentStatusDetails4.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatus";
			definition = "Status of a transfer, in coded form, as  assigned by the transaction administrator.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatusCode4Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice paymentInstructionStatusDateTime;
	/**
	 * Date and time at which the status was assigned to the transfer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4
	 * PaymentStatusDetails4}</li>
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
			componentContext_lazy = () -> PaymentStatusDetails4.mmObject();
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
	protected List<PaymentStatusReasonCode4Choice> paymentInstructionStatusReason;
	/**
	 * Reason provided for the status of a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusReasonCode4Choice
	 * PaymentStatusReasonCode4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4
	 * PaymentStatusDetails4}</li>
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
	public static final MMMessageAssociationEnd mmPaymentInstructionStatusReason = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentStatusDetails4.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusReason";
			definition = "Reason provided for the status of a transfer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatusReasonCode4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentStatusDetails4.mmPaymentInstructionStatus, PaymentStatusDetails4.mmPaymentInstructionStatusDateTime, PaymentStatusDetails4.mmPaymentInstructionStatusReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentStatusDetails4";
				definition = "Information related to the payment status details.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtInstrSts")
	public PaymentStatusCode4Choice getPaymentInstructionStatus() {
		return paymentInstructionStatus;
	}

	public void setPaymentInstructionStatus(PaymentStatusCode4Choice paymentInstructionStatus) {
		this.paymentInstructionStatus = paymentInstructionStatus;
	}

	@XmlElement(name = "PmtInstrStsDtTm")
	public DateAndDateTimeChoice getPaymentInstructionStatusDateTime() {
		return paymentInstructionStatusDateTime;
	}

	public void setPaymentInstructionStatusDateTime(DateAndDateTimeChoice paymentInstructionStatusDateTime) {
		this.paymentInstructionStatusDateTime = paymentInstructionStatusDateTime;
	}

	@XmlElement(name = "PmtInstrStsRsn")
	public List<PaymentStatusReasonCode4Choice> getPaymentInstructionStatusReason() {
		return paymentInstructionStatusReason;
	}

	public void setPaymentInstructionStatusReason(List<PaymentStatusReasonCode4Choice> paymentInstructionStatusReason) {
		this.paymentInstructionStatusReason = paymentInstructionStatusReason;
	}
}