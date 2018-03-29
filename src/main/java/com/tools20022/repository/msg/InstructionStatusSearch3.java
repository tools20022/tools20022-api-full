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
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice;
import com.tools20022.repository.datatype.Max4AlphaNumericText;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmPaymentInstructionStatus
 * InstructionStatusSearch3.mmPaymentInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmPaymentInstructionStatusDateTime
 * InstructionStatusSearch3.mmPaymentInstructionStatusDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3#mmProprietaryStatusReason
 * InstructionStatusSearch3.mmProprietaryStatusReason}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionStatusSearch3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the criteria which are used to search for the status of the payment."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InstructionStatusSearch4
 * InstructionStatusSearch4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InstructionStatusSearch3", propOrder = {"paymentInstructionStatus", "paymentInstructionStatusDateTime", "proprietaryStatusReason"})
public class InstructionStatusSearch3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInstrSts")
	protected PaymentStatusCodeSearch2Choice paymentInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentStatusCodeSearch2Choice
	 * PaymentStatusCodeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3
	 * InstructionStatusSearch3}</li>
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
	 * definition} = "Status of a transfer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmPaymentInstructionStatus
	 * InstructionStatusSearch4.mmPaymentInstructionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InstructionStatusSearch3, Optional<PaymentStatusCodeSearch2Choice>> mmPaymentInstructionStatus = new MMMessageAssociationEnd<InstructionStatusSearch3, Optional<PaymentStatusCodeSearch2Choice>>() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionStatusSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatus";
			definition = "Status of a transfer.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatusSearch4.mmPaymentInstructionStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatusCodeSearch2Choice.mmObject();
		}

		@Override
		public Optional<PaymentStatusCodeSearch2Choice> getValue(InstructionStatusSearch3 obj) {
			return obj.getPaymentInstructionStatus();
		}

		@Override
		public void setValue(InstructionStatusSearch3 obj, Optional<PaymentStatusCodeSearch2Choice> value) {
			obj.setPaymentInstructionStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInstrStsDtTm")
	protected DateTimePeriodChoice paymentInstructionStatusDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3
	 * InstructionStatusSearch3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmPaymentInstructionStatusDateTime
	 * InstructionStatusSearch4.mmPaymentInstructionStatusDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionStatusSearch3, Optional<DateTimePeriodChoice>> mmPaymentInstructionStatusDateTime = new MMMessageAttribute<InstructionStatusSearch3, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionStatusSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrStsDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionStatusDateTime";
			definition = "Date and time at which the status was assigned to the transfer.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatusSearch4.mmPaymentInstructionStatusDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(InstructionStatusSearch3 obj) {
			return obj.getPaymentInstructionStatusDateTime();
		}

		@Override
		public void setValue(InstructionStatusSearch3 obj, Optional<DateTimePeriodChoice> value) {
			obj.setPaymentInstructionStatusDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtryStsRsn")
	protected Max4AlphaNumericText proprietaryStatusReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3
	 * InstructionStatusSearch3}</li>
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
	 * "Defines the reason that has been used by the Target2 SSP system to reject the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch4#mmProprietaryStatusReason
	 * InstructionStatusSearch4.mmProprietaryStatusReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InstructionStatusSearch3, Optional<Max4AlphaNumericText>> mmProprietaryStatusReason = new MMMessageAttribute<InstructionStatusSearch3, Optional<Max4AlphaNumericText>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.InstructionStatusSearch3.mmObject();
			isDerived = false;
			xmlTag = "PrtryStsRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatusReason";
			definition = "Defines the reason that has been used by the Target2 SSP system to reject the transaction.";
			nextVersions_lazy = () -> Arrays.asList(InstructionStatusSearch4.mmProprietaryStatusReason);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		@Override
		public Optional<Max4AlphaNumericText> getValue(InstructionStatusSearch3 obj) {
			return obj.getProprietaryStatusReason();
		}

		@Override
		public void setValue(InstructionStatusSearch3 obj, Optional<Max4AlphaNumericText> value) {
			obj.setProprietaryStatusReason(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InstructionStatusSearch3.mmPaymentInstructionStatus, com.tools20022.repository.msg.InstructionStatusSearch3.mmPaymentInstructionStatusDateTime,
						com.tools20022.repository.msg.InstructionStatusSearch3.mmProprietaryStatusReason);
				trace_lazy = () -> PaymentStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionStatusSearch3";
				definition = "Defines the criteria which are used to search for the status of the payment.";
				nextVersions_lazy = () -> Arrays.asList(InstructionStatusSearch4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PaymentStatusCodeSearch2Choice> getPaymentInstructionStatus() {
		return paymentInstructionStatus == null ? Optional.empty() : Optional.of(paymentInstructionStatus);
	}

	public InstructionStatusSearch3 setPaymentInstructionStatus(PaymentStatusCodeSearch2Choice paymentInstructionStatus) {
		this.paymentInstructionStatus = paymentInstructionStatus;
		return this;
	}

	public Optional<DateTimePeriodChoice> getPaymentInstructionStatusDateTime() {
		return paymentInstructionStatusDateTime == null ? Optional.empty() : Optional.of(paymentInstructionStatusDateTime);
	}

	public InstructionStatusSearch3 setPaymentInstructionStatusDateTime(DateTimePeriodChoice paymentInstructionStatusDateTime) {
		this.paymentInstructionStatusDateTime = paymentInstructionStatusDateTime;
		return this;
	}

	public Optional<Max4AlphaNumericText> getProprietaryStatusReason() {
		return proprietaryStatusReason == null ? Optional.empty() : Optional.of(proprietaryStatusReason);
	}

	public InstructionStatusSearch3 setProprietaryStatusReason(Max4AlphaNumericText proprietaryStatusReason) {
		this.proprietaryStatusReason = proprietaryStatusReason;
		return this;
	}
}