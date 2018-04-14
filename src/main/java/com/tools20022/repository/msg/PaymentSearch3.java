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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.Instruction1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructionStatusSearch3;
import com.tools20022.repository.msg.PaymentTransactionParty;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmTransactionReference
 * PaymentSearch3.mmTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmTransferValueDate
 * PaymentSearch3.mmTransferValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructionReference
 * PaymentSearch3.mmInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructionStatus
 * PaymentSearch3.mmInstructionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructedAmount
 * PaymentSearch3.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstructedAmountCurrency
 * PaymentSearch3.mmInstructedAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmCreditDebitIndicator
 * PaymentSearch3.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInterbankSettlementAmount
 * PaymentSearch3.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInterbankSettlementAmountCurrency
 * PaymentSearch3.mmInterbankSettlementAmountCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentMethod
 * PaymentSearch3.mmPaymentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPriority
 * PaymentSearch3.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmProcessingValidityTime
 * PaymentSearch3.mmProcessingValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInstruction
 * PaymentSearch3.mmInstruction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentType
 * PaymentSearch3.mmPaymentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentInstructionReference
 * PaymentSearch3.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmInterbankValueDate
 * PaymentSearch3.mmInterbankValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmRelatedReference
 * PaymentSearch3.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch3#mmPaymentTransactionParty
 * PaymentSearch3.mmPaymentTransactionParty}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentSearch3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch3
 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch3
 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator1Rule#forPaymentSearch3
 * ConstraintInstructedAmountCreditDebitIndicator1Rule.forPaymentSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule#forPaymentSearch3
 * ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator1Rule#forPaymentSearch3
 * ConstraintSettlementAmountCreditDebitIndicator1Rule.forPaymentSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator2Rule#forPaymentSearch3
 * ConstraintSettlementAmountCreditDebitIndicator2Rule.forPaymentSearch3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentSearch3", propOrder = {"transactionReference", "transferValueDate", "instructionReference", "instructionStatus", "instructedAmount", "instructedAmountCurrency", "creditDebitIndicator", "interbankSettlementAmount",
		"interbankSettlementAmountCurrency", "paymentMethod", "priority", "processingValidityTime", "instruction", "paymentType", "paymentInstructionReference", "interbankValueDate", "relatedReference", "paymentTransactionParty"})
public class PaymentSearch3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxRef")
	protected List<Max35Text> transactionReference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmEndToEndIdentification
	 * PaymentIdentification.mmEndToEndIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<Max35Text>> mmTransactionReference = new MMMessageAttribute<PaymentSearch3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch3 obj) {
			return obj.getTransactionReference();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<Max35Text> value) {
			obj.setTransactionReference(value);
		}
	};
	@XmlElement(name = "TrfValDt")
	protected List<DateAndDateTimeSearchChoice> transferValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearchChoice
	 * DateAndDateTimeSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<DateAndDateTimeSearchChoice>> mmTransferValueDate = new MMMessageAttribute<PaymentSearch3, List<DateAndDateTimeSearchChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "TrfValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}

		@Override
		public List<DateAndDateTimeSearchChoice> getValue(PaymentSearch3 obj) {
			return obj.getTransferValueDate();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<DateAndDateTimeSearchChoice> value) {
			obj.setTransferValueDate(value);
		}
	};
	@XmlElement(name = "InstrRef")
	protected List<PaymentIdentification3Choice> instructionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification3Choice
	 * PaymentIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch3, List<PaymentIdentification3Choice>> mmInstructionReference = new MMMessageAssociationEnd<PaymentSearch3, List<PaymentIdentification3Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification3Choice.mmObject();
		}

		@Override
		public List<PaymentIdentification3Choice> getValue(PaymentSearch3 obj) {
			return obj.getInstructionReference();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<PaymentIdentification3Choice> value) {
			obj.setInstructionReference(value);
		}
	};
	@XmlElement(name = "InstrSts")
	protected List<InstructionStatusSearch3> instructionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusSearch3
	 * InstructionStatusSearch3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status of a transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch3, List<InstructionStatusSearch3>> mmInstructionStatus = new MMMessageAssociationEnd<PaymentSearch3, List<InstructionStatusSearch3>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Detailed information about the status of a transfer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructionStatusSearch3.mmObject();
		}

		@Override
		public List<InstructionStatusSearch3> getValue(PaymentSearch3 obj) {
			return obj.getInstructionStatus();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<InstructionStatusSearch3> value) {
			obj.setInstructionStatus(value);
		}
	};
	@XmlElement(name = "InstdAmt")
	protected List<AmountRangeChoice> instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice
	 * AmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instructed amount(s) on which the query is performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<AmountRangeChoice>> mmInstructedAmount = new MMMessageAttribute<PaymentSearch3, List<AmountRangeChoice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Specifies the instructed amount(s) on which the query is performed.";
			minOccurs = 0;
			complexType_lazy = () -> AmountRangeChoice.mmObject();
		}

		@Override
		public List<AmountRangeChoice> getValue(PaymentSearch3 obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<AmountRangeChoice> value) {
			obj.setInstructedAmount(value);
		}
	};
	@XmlElement(name = "InstdAmtCcy")
	protected List<CurrencyCode> instructedAmountCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The Currency in which the instructed amount is expressed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<CurrencyCode>> mmInstructedAmountCurrency = new MMMessageAttribute<PaymentSearch3, List<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrency";
			definition = "The Currency in which the instructed amount is expressed.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public List<CurrencyCode> getValue(PaymentSearch3 obj) {
			return obj.getInstructedAmountCurrency();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<CurrencyCode> value) {
			obj.setInstructedAmountCurrency(value);
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreditDebitIndicator
	 * PaymentExecution.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment instruction is a debit or a credit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<PaymentSearch3, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment instruction is a debit or a credit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(PaymentSearch3 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentSearch3 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt")
	protected List<AmountRangeChoice> interbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountRangeChoice
	 * AmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interbank settlement amount(s) on which the query is performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<AmountRangeChoice>> mmInterbankSettlementAmount = new MMMessageAttribute<PaymentSearch3, List<AmountRangeChoice>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Specifies the interbank settlement amount(s) on which the query is performed.";
			minOccurs = 0;
			complexType_lazy = () -> AmountRangeChoice.mmObject();
		}

		@Override
		public List<AmountRangeChoice> getValue(PaymentSearch3 obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<AmountRangeChoice> value) {
			obj.setInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "IntrBkSttlmAmtCcy")
	protected List<CurrencyCode> interbankSettlementAmountCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the interbank settlement amount is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<CurrencyCode>> mmInterbankSettlementAmountCurrency = new MMMessageAttribute<PaymentSearch3, List<CurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountCurrency";
			definition = "Currency in which the interbank settlement amount is expressed.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public List<CurrencyCode> getValue(PaymentSearch3 obj) {
			return obj.getInterbankSettlementAmountCurrency();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<CurrencyCode> value) {
			obj.setInterbankSettlementAmountCurrency(value);
		}
	};
	@XmlElement(name = "PmtMtd")
	protected List<PaymentOrigin1Choice> paymentMethod;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCreditMethod
	 * Payment.mmCreditMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the message or event from which an instruction has been initiated."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch3, List<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<PaymentSearch3, List<PaymentOrigin1Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCreditMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public List<PaymentOrigin1Choice> getValue(PaymentSearch3 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value);
		}
	};
	@XmlElement(name = "Prty")
	protected List<PriorityCodeChoice> priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityCodeChoice
	 * PriorityCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPriority
	 * Payment.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<PriorityCodeChoice>> mmPriority = new MMMessageAttribute<PaymentSearch3, List<PriorityCodeChoice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			minOccurs = 0;
			complexType_lazy = () -> PriorityCodeChoice.mmObject();
		}

		@Override
		public List<PriorityCodeChoice> getValue(PaymentSearch3 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<PriorityCodeChoice> value) {
			obj.setPriority(value);
		}
	};
	@XmlElement(name = "PrcgVldtyTm")
	protected List<DateTimePeriodChoice> processingValidityTime;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
	 * PaymentInstruction.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<DateTimePeriodChoice>> mmProcessingValidityTime = new MMMessageAttribute<PaymentSearch3, List<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public List<DateTimePeriodChoice> getValue(PaymentSearch3 obj) {
			return obj.getProcessingValidityTime();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<DateTimePeriodChoice> value) {
			obj.setProcessingValidityTime(value);
		}
	};
	@XmlElement(name = "Instr")
	protected List<Instruction1Code> instruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<Instruction1Code>> mmInstruction = new MMMessageAttribute<PaymentSearch3, List<Instruction1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}

		@Override
		public List<Instruction1Code> getValue(PaymentSearch3 obj) {
			return obj.getInstruction();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<Instruction1Code> value) {
			obj.setInstruction(value);
		}
	};
	@XmlElement(name = "PmtTp")
	protected List<PaymentType2Choice> paymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentType2Choice
	 * PaymentType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<PaymentType2Choice>> mmPaymentType = new MMMessageAttribute<PaymentSearch3, List<PaymentType2Choice>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentType2Choice.mmObject();
		}

		@Override
		public List<PaymentType2Choice> getValue(PaymentSearch3 obj) {
			return obj.getPaymentType();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<PaymentType2Choice> value) {
			obj.setPaymentType(value);
		}
	};
	@XmlElement(name = "PmtInstrRef")
	protected List<Max35Text> paymentInstructionReference;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<Max35Text>> mmPaymentInstructionReference = new MMMessageAttribute<PaymentSearch3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch3 obj) {
			return obj.getPaymentInstructionReference();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<Max35Text> value) {
			obj.setPaymentInstructionReference(value);
		}
	};
	@XmlElement(name = "IntrBkValDt")
	protected List<ISODate> interbankValueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<ISODate>> mmInterbankValueDate = new MMMessageAttribute<PaymentSearch3, List<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public List<ISODate> getValue(PaymentSearch3 obj) {
			return obj.getInterbankValueDate();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<ISODate> value) {
			obj.setInterbankValueDate(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<Max35Text> relatedReference;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The related reference as stipulated in the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch3, List<Max35Text>> mmRelatedReference = new MMMessageAttribute<PaymentSearch3, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "The related reference as stipulated in the payment instruction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch3 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PaymentSearch3 obj, List<Max35Text> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "PmtTxPty")
	protected PaymentTransactionParty paymentTransactionParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty
	 * PaymentTransactionParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTxPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTransactionParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the party fields used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch3, Optional<PaymentTransactionParty>> mmPaymentTransactionParty = new MMMessageAssociationEnd<PaymentSearch3, Optional<PaymentTransactionParty>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtTxPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTransactionParty";
			definition = "Defines the party fields used to search for a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransactionParty.mmObject();
		}

		@Override
		public Optional<PaymentTransactionParty> getValue(PaymentSearch3 obj) {
			return obj.getPaymentTransactionParty();
		}

		@Override
		public void setValue(PaymentSearch3 obj, Optional<PaymentTransactionParty> value) {
			obj.setPaymentTransactionParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch3.mmTransactionReference, com.tools20022.repository.msg.PaymentSearch3.mmTransferValueDate,
						com.tools20022.repository.msg.PaymentSearch3.mmInstructionReference, com.tools20022.repository.msg.PaymentSearch3.mmInstructionStatus, com.tools20022.repository.msg.PaymentSearch3.mmInstructedAmount,
						com.tools20022.repository.msg.PaymentSearch3.mmInstructedAmountCurrency, com.tools20022.repository.msg.PaymentSearch3.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch3.mmInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentSearch3.mmInterbankSettlementAmountCurrency, com.tools20022.repository.msg.PaymentSearch3.mmPaymentMethod, com.tools20022.repository.msg.PaymentSearch3.mmPriority,
						com.tools20022.repository.msg.PaymentSearch3.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentSearch3.mmInstruction, com.tools20022.repository.msg.PaymentSearch3.mmPaymentType,
						com.tools20022.repository.msg.PaymentSearch3.mmPaymentInstructionReference, com.tools20022.repository.msg.PaymentSearch3.mmInterbankValueDate, com.tools20022.repository.msg.PaymentSearch3.mmRelatedReference,
						com.tools20022.repository.msg.PaymentSearch3.mmPaymentTransactionParty);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch3,
						com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch3, com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator1Rule.forPaymentSearch3,
						com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch3,
						com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator1Rule.forPaymentSearch3,
						com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator2Rule.forPaymentSearch3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentSearch3";
				definition = "Defines the criteria used to search for a payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getTransactionReference() {
		return transactionReference == null ? transactionReference = new ArrayList<>() : transactionReference;
	}

	public PaymentSearch3 setTransactionReference(List<Max35Text> transactionReference) {
		this.transactionReference = Objects.requireNonNull(transactionReference);
		return this;
	}

	public List<DateAndDateTimeSearchChoice> getTransferValueDate() {
		return transferValueDate == null ? transferValueDate = new ArrayList<>() : transferValueDate;
	}

	public PaymentSearch3 setTransferValueDate(List<DateAndDateTimeSearchChoice> transferValueDate) {
		this.transferValueDate = Objects.requireNonNull(transferValueDate);
		return this;
	}

	public List<PaymentIdentification3Choice> getInstructionReference() {
		return instructionReference == null ? instructionReference = new ArrayList<>() : instructionReference;
	}

	public PaymentSearch3 setInstructionReference(List<PaymentIdentification3Choice> instructionReference) {
		this.instructionReference = Objects.requireNonNull(instructionReference);
		return this;
	}

	public List<InstructionStatusSearch3> getInstructionStatus() {
		return instructionStatus == null ? instructionStatus = new ArrayList<>() : instructionStatus;
	}

	public PaymentSearch3 setInstructionStatus(List<InstructionStatusSearch3> instructionStatus) {
		this.instructionStatus = Objects.requireNonNull(instructionStatus);
		return this;
	}

	public List<AmountRangeChoice> getInstructedAmount() {
		return instructedAmount == null ? instructedAmount = new ArrayList<>() : instructedAmount;
	}

	public PaymentSearch3 setInstructedAmount(List<AmountRangeChoice> instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public List<CurrencyCode> getInstructedAmountCurrency() {
		return instructedAmountCurrency == null ? instructedAmountCurrency = new ArrayList<>() : instructedAmountCurrency;
	}

	public PaymentSearch3 setInstructedAmountCurrency(List<CurrencyCode> instructedAmountCurrency) {
		this.instructedAmountCurrency = Objects.requireNonNull(instructedAmountCurrency);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentSearch3 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public List<AmountRangeChoice> getInterbankSettlementAmount() {
		return interbankSettlementAmount == null ? interbankSettlementAmount = new ArrayList<>() : interbankSettlementAmount;
	}

	public PaymentSearch3 setInterbankSettlementAmount(List<AmountRangeChoice> interbankSettlementAmount) {
		this.interbankSettlementAmount = Objects.requireNonNull(interbankSettlementAmount);
		return this;
	}

	public List<CurrencyCode> getInterbankSettlementAmountCurrency() {
		return interbankSettlementAmountCurrency == null ? interbankSettlementAmountCurrency = new ArrayList<>() : interbankSettlementAmountCurrency;
	}

	public PaymentSearch3 setInterbankSettlementAmountCurrency(List<CurrencyCode> interbankSettlementAmountCurrency) {
		this.interbankSettlementAmountCurrency = Objects.requireNonNull(interbankSettlementAmountCurrency);
		return this;
	}

	public List<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? paymentMethod = new ArrayList<>() : paymentMethod;
	}

	public PaymentSearch3 setPaymentMethod(List<PaymentOrigin1Choice> paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public List<PriorityCodeChoice> getPriority() {
		return priority == null ? priority = new ArrayList<>() : priority;
	}

	public PaymentSearch3 setPriority(List<PriorityCodeChoice> priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public List<DateTimePeriodChoice> getProcessingValidityTime() {
		return processingValidityTime == null ? processingValidityTime = new ArrayList<>() : processingValidityTime;
	}

	public PaymentSearch3 setProcessingValidityTime(List<DateTimePeriodChoice> processingValidityTime) {
		this.processingValidityTime = Objects.requireNonNull(processingValidityTime);
		return this;
	}

	public List<Instruction1Code> getInstruction() {
		return instruction == null ? instruction = new ArrayList<>() : instruction;
	}

	public PaymentSearch3 setInstruction(List<Instruction1Code> instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public List<PaymentType2Choice> getPaymentType() {
		return paymentType == null ? paymentType = new ArrayList<>() : paymentType;
	}

	public PaymentSearch3 setPaymentType(List<PaymentType2Choice> paymentType) {
		this.paymentType = Objects.requireNonNull(paymentType);
		return this;
	}

	public List<Max35Text> getPaymentInstructionReference() {
		return paymentInstructionReference == null ? paymentInstructionReference = new ArrayList<>() : paymentInstructionReference;
	}

	public PaymentSearch3 setPaymentInstructionReference(List<Max35Text> paymentInstructionReference) {
		this.paymentInstructionReference = Objects.requireNonNull(paymentInstructionReference);
		return this;
	}

	public List<ISODate> getInterbankValueDate() {
		return interbankValueDate == null ? interbankValueDate = new ArrayList<>() : interbankValueDate;
	}

	public PaymentSearch3 setInterbankValueDate(List<ISODate> interbankValueDate) {
		this.interbankValueDate = Objects.requireNonNull(interbankValueDate);
		return this;
	}

	public List<Max35Text> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public PaymentSearch3 setRelatedReference(List<Max35Text> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Optional<PaymentTransactionParty> getPaymentTransactionParty() {
		return paymentTransactionParty == null ? Optional.empty() : Optional.of(paymentTransactionParty);
	}

	public PaymentSearch3 setPaymentTransactionParty(PaymentTransactionParty paymentTransactionParty) {
		this.paymentTransactionParty = paymentTransactionParty;
		return this;
	}
}