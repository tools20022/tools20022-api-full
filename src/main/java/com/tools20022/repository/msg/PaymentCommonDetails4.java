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
import com.tools20022.repository.choice.PaymentOrigin1Choice;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.entity.Entry;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Common detailed payment instruction information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmPaymentFrom
 * PaymentCommonDetails4.mmPaymentFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmPaymentTo
 * PaymentCommonDetails4.mmPaymentTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmCommonInstructionStatus
 * PaymentCommonDetails4.mmCommonInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmTransferValueDate
 * PaymentCommonDetails4.mmTransferValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmEntryDate
 * PaymentCommonDetails4.mmEntryDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmCreditDebitIndicator
 * PaymentCommonDetails4.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4#mmPaymentMethod
 * PaymentCommonDetails4.mmPaymentMethod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
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
 * "PaymentCommonDetails4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Common detailed payment instruction information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentCommonDetails4", propOrder = {"paymentFrom", "paymentTo", "commonInstructionStatus", "transferValueDate", "entryDate", "creditDebitIndicator", "paymentMethod"})
public class PaymentCommonDetails4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtFr")
	protected SystemDetails2 paymentFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemDetails2
	 * SystemDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Origin of the payment (be it a member or a system or both)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "PmtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentFrom";
			definition = "Origin of the payment (be it a member or a system or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemDetails2.mmObject();
		}
	};
	@XmlElement(name = "PmtTo")
	protected SystemDetails2 paymentTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SystemDetails2
	 * SystemDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Destination of the payment (be it a member or a system or both)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "PmtTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTo";
			definition = "Destination of the payment (be it a member or a system or both).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemDetails2.mmObject();
		}
	};
	@XmlElement(name = "CmonInstrSts")
	protected PaymentStatusDetails4 commonInstructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentStatusDetails4
	 * PaymentStatusDetails4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonInstrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonInstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of a transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommonInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "CmonInstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonInstructionStatus";
			definition = "Status of a transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentStatusDetails4.mmObject();
		}
	};
	@XmlElement(name = "TrfValDt")
	protected DateAndDateTimeChoice transferValueDate;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmValueDate
	 * Entry.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "TrfValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "NtryDt")
	protected DateAndDateTimeChoice entryDate;
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
	 * {@linkplain com.tools20022.repository.entity.Entry#mmEntryDate
	 * Entry.mmEntryDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtryDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which an entry is posted to an account on the account servicer's books."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEntryDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmEntryDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "NtryDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDate";
			definition = "Date and time at which an entry is posted to an account on the account servicer's books.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmCreditDebitIndicator
	 * Entry.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment instruction is a debit or a credit."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment instruction is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	@XmlElement(name = "PmtMtd")
	protected PaymentOrigin1Choice paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCommonDetails4
	 * PaymentCommonDetails4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the message or event from which an instruction has been initiated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentMethod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentCommonDetails4.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentCommonDetails4.mmPaymentFrom, com.tools20022.repository.msg.PaymentCommonDetails4.mmPaymentTo,
						com.tools20022.repository.msg.PaymentCommonDetails4.mmCommonInstructionStatus, com.tools20022.repository.msg.PaymentCommonDetails4.mmTransferValueDate,
						com.tools20022.repository.msg.PaymentCommonDetails4.mmEntryDate, com.tools20022.repository.msg.PaymentCommonDetails4.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentCommonDetails4.mmPaymentMethod);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentCommonDetails4";
				definition = "Common detailed payment instruction information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SystemDetails2> getPaymentFrom() {
		return paymentFrom == null ? Optional.empty() : Optional.of(paymentFrom);
	}

	public PaymentCommonDetails4 setPaymentFrom(com.tools20022.repository.msg.SystemDetails2 paymentFrom) {
		this.paymentFrom = paymentFrom;
		return this;
	}

	public Optional<SystemDetails2> getPaymentTo() {
		return paymentTo == null ? Optional.empty() : Optional.of(paymentTo);
	}

	public PaymentCommonDetails4 setPaymentTo(com.tools20022.repository.msg.SystemDetails2 paymentTo) {
		this.paymentTo = paymentTo;
		return this;
	}

	public Optional<PaymentStatusDetails4> getCommonInstructionStatus() {
		return commonInstructionStatus == null ? Optional.empty() : Optional.of(commonInstructionStatus);
	}

	public PaymentCommonDetails4 setCommonInstructionStatus(com.tools20022.repository.msg.PaymentStatusDetails4 commonInstructionStatus) {
		this.commonInstructionStatus = commonInstructionStatus;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getTransferValueDate() {
		return transferValueDate == null ? Optional.empty() : Optional.of(transferValueDate);
	}

	public PaymentCommonDetails4 setTransferValueDate(DateAndDateTimeChoice transferValueDate) {
		this.transferValueDate = transferValueDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEntryDate() {
		return entryDate == null ? Optional.empty() : Optional.of(entryDate);
	}

	public PaymentCommonDetails4 setEntryDate(DateAndDateTimeChoice entryDate) {
		this.entryDate = entryDate;
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentCommonDetails4 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public PaymentCommonDetails4 setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}
}