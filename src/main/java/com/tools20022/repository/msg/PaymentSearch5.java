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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CreditDebitCode;
import com.tools20022.repository.codeset.Instruction1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructionStatusSearch3;
import com.tools20022.repository.msg.PaymentTransactionParty2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmMessageIdentification
 * PaymentSearch5.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmRequestedExecutionDate
 * PaymentSearch5.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentIdentification
 * PaymentSearch5.mmPaymentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmStatus
 * PaymentSearch5.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInstructedAmount
 * PaymentSearch5.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInstructedAmountCurrency
 * PaymentSearch5.mmInstructedAmountCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmCreditDebitIndicator
 * PaymentSearch5.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementAmount
 * PaymentSearch5.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementAmountCurrency
 * PaymentSearch5.mmInterbankSettlementAmountCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentMethod
 * PaymentSearch5.mmPaymentMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPaymentType
 * PaymentSearch5.mmPaymentType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmPriority
 * PaymentSearch5.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmProcessingValidityTime
 * PaymentSearch5.mmProcessingValidityTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInstruction
 * PaymentSearch5.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmTransactionIdentification
 * PaymentSearch5.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmInterbankSettlementDate
 * PaymentSearch5.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentSearch5#mmEndToEndIdentification
 * PaymentSearch5.mmEndToEndIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch5#mmParties
 * PaymentSearch5.mmParties}</li>
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
 * "PaymentSearch5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule#forPaymentSearch5
 * ConstraintSettlementAmountCurrencyRule.forPaymentSearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule#forPaymentSearch5
 * ConstraintInstructedAmountCurrencyRule.forPaymentSearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator1Rule#forPaymentSearch5
 * ConstraintInstructedAmountCreditDebitIndicator1Rule.forPaymentSearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule#forPaymentSearch5
 * ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator1Rule#forPaymentSearch5
 * ConstraintSettlementAmountCreditDebitIndicator1Rule.forPaymentSearch5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator2Rule#forPaymentSearch5
 * ConstraintSettlementAmountCreditDebitIndicator2Rule.forPaymentSearch5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch6 PaymentSearch6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentSearch4
 * PaymentSearch4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentSearch5", propOrder = {"messageIdentification", "requestedExecutionDate", "paymentIdentification", "status", "instructedAmount", "instructedAmountCurrency", "creditDebitIndicator", "interbankSettlementAmount",
		"interbankSettlementAmountCurrency", "paymentMethod", "paymentType", "priority", "processingValidityTime", "instruction", "transactionIdentification", "interbankSettlementDate", "endToEndIdentification", "parties"})
public class PaymentSearch5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId")
	protected List<Max35Text> messageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message. \nUsage: this is the former transaction reference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmMessageIdentification
	 * PaymentSearch6.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmMessageIdentification
	 * PaymentSearch4.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<Max35Text>> mmMessageIdentification = new MMMessageAttribute<PaymentSearch5, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message. \nUsage: this is the former transaction reference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmMessageIdentification);
			previousVersion_lazy = () -> PaymentSearch4.mmMessageIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch5 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<Max35Text> value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected List<DateAndDateTimeSearchChoice> requestedExecutionDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmRequestedExecutionDate
	 * PaymentSearch6.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmRequestedExecutionDate
	 * PaymentSearch4.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<DateAndDateTimeSearchChoice>> mmRequestedExecutionDate = new MMMessageAttribute<PaymentSearch5, List<DateAndDateTimeSearchChoice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmRequestedExecutionDate);
			previousVersion_lazy = () -> PaymentSearch4.mmRequestedExecutionDate;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}

		@Override
		public List<DateAndDateTimeSearchChoice> getValue(PaymentSearch5 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<DateAndDateTimeSearchChoice> value) {
			obj.setRequestedExecutionDate(value);
		}
	};
	@XmlElement(name = "PmtId")
	protected List<PaymentIdentification4Choice> paymentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice
	 * PaymentIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmPaymentIdentification
	 * PaymentSearch6.mmPaymentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentIdentification
	 * PaymentSearch4.mmPaymentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch5, List<PaymentIdentification4Choice>> mmPaymentIdentification = new MMMessageAssociationEnd<PaymentSearch5, List<PaymentIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmPaymentIdentification);
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification4Choice.mmObject();
		}

		@Override
		public List<PaymentIdentification4Choice> getValue(PaymentSearch5 obj) {
			return obj.getPaymentIdentification();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<PaymentIdentification4Choice> value) {
			obj.setPaymentIdentification(value);
		}
	};
	@XmlElement(name = "Sts")
	protected List<InstructionStatusSearch3> status;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus PaymentStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status of a transfer.\n\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch6#mmStatus
	 * PaymentSearch6.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmStatus
	 * PaymentSearch4.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch5, List<InstructionStatusSearch3>> mmStatus = new MMMessageAssociationEnd<PaymentSearch5, List<InstructionStatusSearch3>>() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Detailed information about the status of a transfer.\n\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmStatus);
			previousVersion_lazy = () -> PaymentSearch4.mmStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InstructionStatusSearch3.mmObject();
		}

		@Override
		public List<InstructionStatusSearch3> getValue(PaymentSearch5 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<InstructionStatusSearch3> value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "InstdAmt")
	protected List<AmountRange2Choice> instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountRange2Choice
	 * AmountRange2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInstructedAmount
	 * PaymentSearch6.mmInstructedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstructedAmount
	 * PaymentSearch4.mmInstructedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<AmountRange2Choice>> mmInstructedAmount = new MMMessageAttribute<PaymentSearch5, List<AmountRange2Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Specifies the instructed amount(s) on which the query is performed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInstructedAmount);
			previousVersion_lazy = () -> PaymentSearch4.mmInstructedAmount;
			minOccurs = 0;
			complexType_lazy = () -> AmountRange2Choice.mmObject();
		}

		@Override
		public List<AmountRange2Choice> getValue(PaymentSearch5 obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<AmountRange2Choice> value) {
			obj.setInstructedAmount(value);
		}
	};
	@XmlElement(name = "InstdAmtCcy")
	protected List<ActiveOrHistoricCurrencyCode> instructedAmountCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmtCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the instructed amount is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInstructedAmountCurrency
	 * PaymentSearch6.mmInstructedAmountCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstructedAmountCurrency
	 * PaymentSearch4.mmInstructedAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<ActiveOrHistoricCurrencyCode>> mmInstructedAmountCurrency = new MMMessageAttribute<PaymentSearch5, List<ActiveOrHistoricCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrency";
			definition = "Currency in which the instructed amount is expressed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInstructedAmountCurrency);
			previousVersion_lazy = () -> PaymentSearch4.mmInstructedAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(PaymentSearch5 obj) {
			return obj.getInstructedAmountCurrency();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<ActiveOrHistoricCurrencyCode> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment instruction is a debit or a credit.\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmCreditDebitIndicator
	 * PaymentSearch6.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmCreditDebitIndicator
	 * PaymentSearch4.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, Optional<CreditDebitCode>> mmCreditDebitIndicator = new MMMessageAttribute<PaymentSearch5, Optional<CreditDebitCode>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment instruction is a debit or a credit.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmCreditDebitIndicator);
			previousVersion_lazy = () -> PaymentSearch4.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}

		@Override
		public Optional<CreditDebitCode> getValue(PaymentSearch5 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentSearch5 obj, Optional<CreditDebitCode> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt")
	protected List<ActiveAmountRange1Choice> interbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ActiveAmountRange1Choice
	 * ActiveAmountRange1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInterbankSettlementAmount
	 * PaymentSearch6.mmInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmount
	 * PaymentSearch4.mmInterbankSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<ActiveAmountRange1Choice>> mmInterbankSettlementAmount = new MMMessageAttribute<PaymentSearch5, List<ActiveAmountRange1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Specifies the interbank settlement amount(s) on which the query is performed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInterbankSettlementAmount);
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementAmount;
			minOccurs = 0;
			complexType_lazy = () -> ActiveAmountRange1Choice.mmObject();
		}

		@Override
		public List<ActiveAmountRange1Choice> getValue(PaymentSearch5 obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<ActiveAmountRange1Choice> value) {
			obj.setInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "IntrBkSttlmAmtCcy")
	protected List<ActiveCurrencyCode> interbankSettlementAmountCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInterbankSettlementAmountCurrency
	 * PaymentSearch6.mmInterbankSettlementAmountCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmountCurrency
	 * PaymentSearch4.mmInterbankSettlementAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<ActiveCurrencyCode>> mmInterbankSettlementAmountCurrency = new MMMessageAttribute<PaymentSearch5, List<ActiveCurrencyCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountCurrency";
			definition = "Currency in which the interbank settlement amount is expressed.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInterbankSettlementAmountCurrency);
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveCurrencyCode> getValue(PaymentSearch5 obj) {
			return obj.getInterbankSettlementAmountCurrency();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<ActiveCurrencyCode> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmPaymentMethod
	 * PaymentSearch6.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentMethod
	 * PaymentSearch4.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch5, List<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<PaymentSearch5, List<PaymentOrigin1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentMethod;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public List<PaymentOrigin1Choice> getValue(PaymentSearch5 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value);
		}
	};
	@XmlElement(name = "PmtTp")
	protected List<PaymentType4Choice> paymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentType4Choice
	 * PaymentType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmPaymentType
	 * PaymentSearch6.mmPaymentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentType
	 * PaymentSearch4.mmPaymentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<PaymentType4Choice>> mmPaymentType = new MMMessageAttribute<PaymentSearch5, List<PaymentType4Choice>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmPaymentType);
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentType;
			minOccurs = 0;
			complexType_lazy = () -> PaymentType4Choice.mmObject();
		}

		@Override
		public List<PaymentType4Choice> getValue(PaymentSearch5 obj) {
			return obj.getPaymentType();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<PaymentType4Choice> value) {
			obj.setPaymentType(value);
		}
	};
	@XmlElement(name = "Prty")
	protected List<PriorityCode3Choice> priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityCode3Choice
	 * PriorityCode3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPriority
	 * Payment.mmPriority}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch6#mmPriority
	 * PaymentSearch6.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPriority
	 * PaymentSearch4.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<PriorityCode3Choice>> mmPriority = new MMMessageAttribute<PaymentSearch5, List<PriorityCode3Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmPriority);
			previousVersion_lazy = () -> PaymentSearch4.mmPriority;
			minOccurs = 0;
			complexType_lazy = () -> PriorityCode3Choice.mmObject();
		}

		@Override
		public List<PriorityCode3Choice> getValue(PaymentSearch5 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<PriorityCode3Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmProcessingValidityTime
	 * PaymentSearch6.mmProcessingValidityTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmProcessingValidityTime
	 * PaymentSearch4.mmProcessingValidityTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<DateTimePeriodChoice>> mmProcessingValidityTime = new MMMessageAttribute<PaymentSearch5, List<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmProcessingValidityTime);
			previousVersion_lazy = () -> PaymentSearch4.mmProcessingValidityTime;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public List<DateTimePeriodChoice> getValue(PaymentSearch5 obj) {
			return obj.getProcessingValidityTime();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<DateTimePeriodChoice> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
	 * PaymentInstruction.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInstruction
	 * PaymentSearch6.mmInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstruction
	 * PaymentSearch4.mmInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<Instruction1Code>> mmInstruction = new MMMessageAttribute<PaymentSearch5, List<Instruction1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInstruction);
			previousVersion_lazy = () -> PaymentSearch4.mmInstruction;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}

		@Override
		public List<Instruction1Code> getValue(PaymentSearch5 obj) {
			return obj.getInstruction();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<Instruction1Code> value) {
			obj.setInstruction(value);
		}
	};
	@XmlElement(name = "TxId")
	protected List<Max35Text> transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmTransactionIdentification
	 * PaymentSearch6.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmTransactionIdentification
	 * PaymentSearch4.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<Max35Text>> mmTransactionIdentification = new MMMessageAttribute<PaymentSearch5, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmTransactionIdentification);
			previousVersion_lazy = () -> PaymentSearch4.mmTransactionIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch5 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<Max35Text> value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "IntrBkSttlmDt")
	protected List<ISODate> interbankSettlementDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\nUsage: this is the former InterbankValueDate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmInterbankSettlementDate
	 * PaymentSearch6.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementDate
	 * PaymentSearch4.mmInterbankSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<ISODate>> mmInterbankSettlementDate = new MMMessageAttribute<PaymentSearch5, List<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\nUsage: this is the former InterbankValueDate.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmInterbankSettlementDate);
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementDate;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public List<ISODate> getValue(PaymentSearch5 obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<ISODate> value) {
			obj.setInterbankSettlementDate(value);
		}
	};
	@XmlElement(name = "EndToEndId")
	protected List<Max35Text> endToEndIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\nIt can be included in several messages related to the transaction.\nUsage: this is the former RelatedReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch6#mmEndToEndIdentification
	 * PaymentSearch6.mmEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmEndToEndIdentification
	 * PaymentSearch4.mmEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentSearch5, List<Max35Text>> mmEndToEndIdentification = new MMMessageAttribute<PaymentSearch5, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\nIt can be included in several messages related to the transaction.\nUsage: this is the former RelatedReference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmEndToEndIdentification);
			previousVersion_lazy = () -> PaymentSearch4.mmEndToEndIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentSearch5 obj) {
			return obj.getEndToEndIdentification();
		}

		@Override
		public void setValue(PaymentSearch5 obj, List<Max35Text> value) {
			obj.setEndToEndIdentification(value);
		}
	};
	@XmlElement(name = "Pties")
	protected PaymentTransactionParty2 parties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionParty2
	 * PaymentTransactionParty2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole
	 * PaymentPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the party fields used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PaymentSearch6#mmParties
	 * PaymentSearch6.mmParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmParties
	 * PaymentSearch4.mmParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentSearch5, Optional<PaymentTransactionParty2>> mmParties = new MMMessageAssociationEnd<PaymentSearch5, Optional<PaymentTransactionParty2>>() {
		{
			businessComponentTrace_lazy = () -> PaymentPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Pties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parties";
			definition = "Defines the party fields used to search for a payment.";
			nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmParties);
			previousVersion_lazy = () -> PaymentSearch4.mmParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransactionParty2.mmObject();
		}

		@Override
		public Optional<PaymentTransactionParty2> getValue(PaymentSearch5 obj) {
			return obj.getParties();
		}

		@Override
		public void setValue(PaymentSearch5 obj, Optional<PaymentTransactionParty2> value) {
			obj.setParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentSearch5.mmMessageIdentification, com.tools20022.repository.msg.PaymentSearch5.mmRequestedExecutionDate,
						com.tools20022.repository.msg.PaymentSearch5.mmPaymentIdentification, com.tools20022.repository.msg.PaymentSearch5.mmStatus, com.tools20022.repository.msg.PaymentSearch5.mmInstructedAmount,
						com.tools20022.repository.msg.PaymentSearch5.mmInstructedAmountCurrency, com.tools20022.repository.msg.PaymentSearch5.mmCreditDebitIndicator, com.tools20022.repository.msg.PaymentSearch5.mmInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentSearch5.mmInterbankSettlementAmountCurrency, com.tools20022.repository.msg.PaymentSearch5.mmPaymentMethod, com.tools20022.repository.msg.PaymentSearch5.mmPaymentType,
						com.tools20022.repository.msg.PaymentSearch5.mmPriority, com.tools20022.repository.msg.PaymentSearch5.mmProcessingValidityTime, com.tools20022.repository.msg.PaymentSearch5.mmInstruction,
						com.tools20022.repository.msg.PaymentSearch5.mmTransactionIdentification, com.tools20022.repository.msg.PaymentSearch5.mmInterbankSettlementDate,
						com.tools20022.repository.msg.PaymentSearch5.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentSearch5.mmParties);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementAmountCurrencyRule.forPaymentSearch5,
						com.tools20022.repository.constraints.ConstraintInstructedAmountCurrencyRule.forPaymentSearch5, com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator1Rule.forPaymentSearch5,
						com.tools20022.repository.constraints.ConstraintInstructedAmountCreditDebitIndicator2Rule.forPaymentSearch5,
						com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator1Rule.forPaymentSearch5,
						com.tools20022.repository.constraints.ConstraintSettlementAmountCreditDebitIndicator2Rule.forPaymentSearch5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentSearch5";
				definition = "Defines the criteria used to search for a payment.";
				nextVersions_lazy = () -> Arrays.asList(PaymentSearch6.mmObject());
				previousVersion_lazy = () -> PaymentSearch4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getMessageIdentification() {
		return messageIdentification == null ? messageIdentification = new ArrayList<>() : messageIdentification;
	}

	public PaymentSearch5 setMessageIdentification(List<Max35Text> messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<DateAndDateTimeSearchChoice> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? requestedExecutionDate = new ArrayList<>() : requestedExecutionDate;
	}

	public PaymentSearch5 setRequestedExecutionDate(List<DateAndDateTimeSearchChoice> requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public List<PaymentIdentification4Choice> getPaymentIdentification() {
		return paymentIdentification == null ? paymentIdentification = new ArrayList<>() : paymentIdentification;
	}

	public PaymentSearch5 setPaymentIdentification(List<PaymentIdentification4Choice> paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}

	public List<InstructionStatusSearch3> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public PaymentSearch5 setStatus(List<InstructionStatusSearch3> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<AmountRange2Choice> getInstructedAmount() {
		return instructedAmount == null ? instructedAmount = new ArrayList<>() : instructedAmount;
	}

	public PaymentSearch5 setInstructedAmount(List<AmountRange2Choice> instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getInstructedAmountCurrency() {
		return instructedAmountCurrency == null ? instructedAmountCurrency = new ArrayList<>() : instructedAmountCurrency;
	}

	public PaymentSearch5 setInstructedAmountCurrency(List<ActiveOrHistoricCurrencyCode> instructedAmountCurrency) {
		this.instructedAmountCurrency = Objects.requireNonNull(instructedAmountCurrency);
		return this;
	}

	public Optional<CreditDebitCode> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentSearch5 setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public List<ActiveAmountRange1Choice> getInterbankSettlementAmount() {
		return interbankSettlementAmount == null ? interbankSettlementAmount = new ArrayList<>() : interbankSettlementAmount;
	}

	public PaymentSearch5 setInterbankSettlementAmount(List<ActiveAmountRange1Choice> interbankSettlementAmount) {
		this.interbankSettlementAmount = Objects.requireNonNull(interbankSettlementAmount);
		return this;
	}

	public List<ActiveCurrencyCode> getInterbankSettlementAmountCurrency() {
		return interbankSettlementAmountCurrency == null ? interbankSettlementAmountCurrency = new ArrayList<>() : interbankSettlementAmountCurrency;
	}

	public PaymentSearch5 setInterbankSettlementAmountCurrency(List<ActiveCurrencyCode> interbankSettlementAmountCurrency) {
		this.interbankSettlementAmountCurrency = Objects.requireNonNull(interbankSettlementAmountCurrency);
		return this;
	}

	public List<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? paymentMethod = new ArrayList<>() : paymentMethod;
	}

	public PaymentSearch5 setPaymentMethod(List<PaymentOrigin1Choice> paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public List<PaymentType4Choice> getPaymentType() {
		return paymentType == null ? paymentType = new ArrayList<>() : paymentType;
	}

	public PaymentSearch5 setPaymentType(List<PaymentType4Choice> paymentType) {
		this.paymentType = Objects.requireNonNull(paymentType);
		return this;
	}

	public List<PriorityCode3Choice> getPriority() {
		return priority == null ? priority = new ArrayList<>() : priority;
	}

	public PaymentSearch5 setPriority(List<PriorityCode3Choice> priority) {
		this.priority = Objects.requireNonNull(priority);
		return this;
	}

	public List<DateTimePeriodChoice> getProcessingValidityTime() {
		return processingValidityTime == null ? processingValidityTime = new ArrayList<>() : processingValidityTime;
	}

	public PaymentSearch5 setProcessingValidityTime(List<DateTimePeriodChoice> processingValidityTime) {
		this.processingValidityTime = Objects.requireNonNull(processingValidityTime);
		return this;
	}

	public List<Instruction1Code> getInstruction() {
		return instruction == null ? instruction = new ArrayList<>() : instruction;
	}

	public PaymentSearch5 setInstruction(List<Instruction1Code> instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public List<Max35Text> getTransactionIdentification() {
		return transactionIdentification == null ? transactionIdentification = new ArrayList<>() : transactionIdentification;
	}

	public PaymentSearch5 setTransactionIdentification(List<Max35Text> transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public List<ISODate> getInterbankSettlementDate() {
		return interbankSettlementDate == null ? interbankSettlementDate = new ArrayList<>() : interbankSettlementDate;
	}

	public PaymentSearch5 setInterbankSettlementDate(List<ISODate> interbankSettlementDate) {
		this.interbankSettlementDate = Objects.requireNonNull(interbankSettlementDate);
		return this;
	}

	public List<Max35Text> getEndToEndIdentification() {
		return endToEndIdentification == null ? endToEndIdentification = new ArrayList<>() : endToEndIdentification;
	}

	public PaymentSearch5 setEndToEndIdentification(List<Max35Text> endToEndIdentification) {
		this.endToEndIdentification = Objects.requireNonNull(endToEndIdentification);
		return this;
	}

	public Optional<PaymentTransactionParty2> getParties() {
		return parties == null ? Optional.empty() : Optional.of(parties);
	}

	public PaymentSearch5 setParties(PaymentTransactionParty2 parties) {
		this.parties = parties;
		return this;
	}
}