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
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.PaymentStatusCodeSearchChoice;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the criteria which are used to search for the status of the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmPaymentInstructionStatus
 * InstructionStatusSearch2.mmPaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmPaymentInstructionStatusDateTime
 * InstructionStatusSearch2.mmPaymentInstructionStatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2#mmProprietaryStatusReason
 * InstructionStatusSearch2.mmProprietaryStatusReason}</li>
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
 * "InstructionStatusSearch2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for the status of the payment."
 * </li>
 * </ul>
 */
public class InstructionStatusSearch2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentStatusCodeSearchChoice paymentInstructionStatus;
	/**
	 * Status of a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearchChoice
	 * PaymentStatusCodeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2
	 * InstructionStatusSearch2}</li>
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
	 * definition} = "Status of a transfer.\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatus = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> InstructionStatusSearch2.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatus";
			definition = "Status of a transfer.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentStatusCodeSearchChoice.mmObject();
		}
	};
	protected DateTimePeriodChoice paymentInstructionStatusDateTime;
	/**
	 * Date and time at which the status was assigned to the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2
	 * InstructionStatusSearch2}</li>
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
	 * "Date and time at which the status was assigned to the transfer.\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionStatusDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> InstructionStatusSearch2.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusDateTime";
			definition = "Date and time at which the status was assigned to the transfer.\n";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	protected Max4AlphaNumericText proprietaryStatusReason;
	/**
	 * Defines the reason that has been used by the Target2 SSP system to reject
	 * the transaction
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch2
	 * InstructionStatusSearch2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryStsRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatusReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryStatusReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InstructionStatusSearch2.mmObject();
			isDerived = false;
			xmlTag = "PrtryStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatusReason";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionStatusSearch2.mmPaymentInstructionStatus, InstructionStatusSearch2.mmPaymentInstructionStatusDateTime, InstructionStatusSearch2.mmProprietaryStatusReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InstructionStatusSearch2";
				definition = "Defines the criteria which are used to search for the status of the payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentStatusCodeSearchChoice getPaymentInstructionStatus() {
		return paymentInstructionStatus;
	}

	public void setPaymentInstructionStatus(PaymentStatusCodeSearchChoice paymentInstructionStatus) {
		this.paymentInstructionStatus = paymentInstructionStatus;
	}

	public DateTimePeriodChoice getPaymentInstructionStatusDateTime() {
		return paymentInstructionStatusDateTime;
	}

	public void setPaymentInstructionStatusDateTime(DateTimePeriodChoice paymentInstructionStatusDateTime) {
		this.paymentInstructionStatusDateTime = paymentInstructionStatusDateTime;
	}

	public Max4AlphaNumericText getProprietaryStatusReason() {
		return proprietaryStatusReason;
	}

	public void setProprietaryStatusReason(Max4AlphaNumericText proprietaryStatusReason) {
		this.proprietaryStatusReason = proprietaryStatusReason;
	}
}