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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentSearch5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a payment."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PaymentSearch4
 * PaymentSearch4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentSearch5", propOrder = {"messageIdentification", "requestedExecutionDate", "paymentIdentification", "status", "instructedAmount", "instructedAmountCurrency", "creditDebitIndicator", "interbankSettlementAmount",
		"interbankSettlementAmountCurrency", "paymentMethod", "paymentType", "priority", "processingValidityTime", "instruction", "transactionIdentification", "interbankSettlementDate", "endToEndIdentification", "parties"})
public class PaymentSearch5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> messageIdentification;
	/**
	 * Point to point reference, as assigned by the original initiating party,
	 * to unambiguously identify the original payment transaction message.
	 * Usage: this is the former transaction reference.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message. \nUsage: this is the former transaction reference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmMessageIdentification
	 * PaymentSearch4.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message. \nUsage: this is the former transaction reference.";
			previousVersion_lazy = () -> PaymentSearch4.mmMessageIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<DateAndDateTimeSearchChoice> requestedExecutionDate;
	/**
	 * Date and time at which the cash is at the disposal of the credit account
	 * owner, or ceases to be at the disposal of the debit account owner.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmRequestedExecutionDate
	 * PaymentSearch4.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			previousVersion_lazy = () -> PaymentSearch4.mmRequestedExecutionDate;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}
	};
	protected List<PaymentIdentification4Choice> paymentIdentification;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing agent or the initiating party.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentIdentification
	 * PaymentSearch4.mmPaymentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification4Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructionStatusSearch3> status;
	/**
	 * Detailed information about the status of a transfer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status of a transfer.\n\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmStatus
	 * PaymentSearch4.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentStatus.mmObject();
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Detailed information about the status of a transfer.\n\n";
			previousVersion_lazy = () -> PaymentSearch4.mmStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionStatusSearch3.mmObject();
		}
	};
	protected List<AmountRange2Choice> instructedAmount;
	/**
	 * Specifies the instructed amount(s) on which the query is performed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instructed amount(s) on which the query is performed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstructedAmount
	 * PaymentSearch4.mmInstructedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Specifies the instructed amount(s) on which the query is performed.";
			previousVersion_lazy = () -> PaymentSearch4.mmInstructedAmount;
			minOccurs = 0;
			complexType_lazy = () -> AmountRange2Choice.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyCode> instructedAmountCurrency;
	/**
	 * Currency in which the instructed amount is expressed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the instructed amount is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstructedAmountCurrency
	 * PaymentSearch4.mmInstructedAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmountCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrency";
			definition = "Currency in which the instructed amount is expressed.";
			previousVersion_lazy = () -> PaymentSearch4.mmInstructedAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected CreditDebitCode creditDebitIndicator;
	/**
	 * Indicates whether the payment instruction is a debit or a credit.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the payment instruction is a debit or a credit.\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmCreditDebitIndicator
	 * PaymentSearch4.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the payment instruction is a debit or a credit.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	protected List<ActiveAmountRange1Choice> interbankSettlementAmount;
	/**
	 * Specifies the interbank settlement amount(s) on which the query is
	 * performed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the interbank settlement amount(s) on which the query is performed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmount
	 * PaymentSearch4.mmInterbankSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Specifies the interbank settlement amount(s) on which the query is performed.";
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementAmount;
			minOccurs = 0;
			complexType_lazy = () -> ActiveAmountRange1Choice.mmObject();
		}
	};
	protected List<ActiveCurrencyCode> interbankSettlementAmountCurrency;
	/**
	 * Currency in which the interbank settlement amount is expressed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the interbank settlement amount is expressed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementAmountCurrency
	 * PaymentSearch4.mmInterbankSettlementAmountCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmountCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountCurrency";
			definition = "Currency in which the interbank settlement amount is expressed.";
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementAmountCurrency;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected List<PaymentOrigin1Choice> paymentMethod;
	/**
	 * Indicates the message or event from which an instruction has been
	 * initiated.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentMethod
	 * PaymentSearch4.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentMethod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentMethod;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}
	};
	protected List<PaymentType4Choice> paymentType;
	/**
	 * Instruction to pay an amount of money to an ultimate beneficiary, on
	 * behalf of an originator. This instruction may have to be forwarded
	 * several times to complete the settlement chain.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPaymentType
	 * PaymentSearch4.mmPaymentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmPaymentType;
			minOccurs = 0;
			complexType_lazy = () -> PaymentType4Choice.mmObject();
		}
	};
	protected List<PriorityCode3Choice> priority;
	/**
	 * Urgency or order of importance that the originator would like the
	 * recipient of the payment instruction to apply to the processing of the
	 * payment instruction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmPriority
	 * PaymentSearch4.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmPriority;
			minOccurs = 0;
			complexType_lazy = () -> PriorityCode3Choice.mmObject();
		}
	};
	protected List<DateTimePeriodChoice> processingValidityTime;
	/**
	 * Date and time range within which the payment instruction must be
	 * processed.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmProcessingValidityTime
	 * PaymentInstruction.mmProcessingValidityTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch5 PaymentSearch5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time range within which the payment instruction must be processed.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmProcessingValidityTime
	 * PaymentSearch4.mmProcessingValidityTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingValidityTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmProcessingValidityTime;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}
	};
	protected List<Instruction1Code> instruction;
	/**
	 * Further information related to the processing of the payment instruction.
	 * The instruction can relate to a level of service between the bank and the
	 * customer, or give instructions to and for specific parties in the payment
	 * chain.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInstruction
	 * PaymentSearch4.mmInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstruction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.\n";
			previousVersion_lazy = () -> PaymentSearch4.mmInstruction;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}
	};
	protected List<Max35Text> transactionIdentification;
	/**
	 * Unique identification, as assigned by the first instructing agent, to
	 * unambiguously identify the transaction that is passed on, unchanged,
	 * throughout the entire interbank chain. Usage: The transaction
	 * identification can be used for reconciliation, tracking or to link tasks
	 * relating to the transaction on the interbank level. The instructing agent
	 * has to make sure that the transaction identification is unique for a
	 * pre-agreed period. Usage: this is the former PaymentInstructionReference.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmTransactionIdentification
	 * PaymentSearch4.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference.";
			previousVersion_lazy = () -> PaymentSearch4.mmTransactionIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<ISODate> interbankSettlementDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due. Usage: this is the former InterbankValueDate.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\nUsage: this is the former InterbankValueDate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmInterbankSettlementDate
	 * PaymentSearch4.mmInterbankSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.\nUsage: this is the former InterbankValueDate.";
			previousVersion_lazy = () -> PaymentSearch4.mmInterbankSettlementDate;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<Max35Text> endToEndIdentification;
	/**
	 * Unique identification, as assigned by the initiating party, to
	 * unambiguously identify the transaction. This identification is passed on,
	 * unchanged, throughout the entire end-to-end chain. Usage: The end-to-end
	 * identification can be used for reconciliation or to link tasks relating
	 * to the transaction. It can be included in several messages related to the
	 * transaction. Usage: this is the former RelatedReference.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\nIt can be included in several messages related to the transaction.\nUsage: this is the former RelatedReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmEndToEndIdentification
	 * PaymentSearch4.mmEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndToEndIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\nIt can be included in several messages related to the transaction.\nUsage: this is the former RelatedReference.";
			previousVersion_lazy = () -> PaymentSearch4.mmEndToEndIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PaymentTransactionParty2 parties;
	/**
	 * Defines the party fields used to search for a payment.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the party fields used to search for a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch4#mmParties
	 * PaymentSearch4.mmParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentPartyRole.mmObject();
			componentContext_lazy = () -> PaymentSearch5.mmObject();
			isDerived = false;
			xmlTag = "Pties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parties";
			definition = "Defines the party fields used to search for a payment.";
			previousVersion_lazy = () -> PaymentSearch4.mmParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransactionParty2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentSearch5.mmMessageIdentification, PaymentSearch5.mmRequestedExecutionDate, PaymentSearch5.mmPaymentIdentification, PaymentSearch5.mmStatus, PaymentSearch5.mmInstructedAmount,
						PaymentSearch5.mmInstructedAmountCurrency, PaymentSearch5.mmCreditDebitIndicator, PaymentSearch5.mmInterbankSettlementAmount, PaymentSearch5.mmInterbankSettlementAmountCurrency, PaymentSearch5.mmPaymentMethod,
						PaymentSearch5.mmPaymentType, PaymentSearch5.mmPriority, PaymentSearch5.mmProcessingValidityTime, PaymentSearch5.mmInstruction, PaymentSearch5.mmTransactionIdentification, PaymentSearch5.mmInterbankSettlementDate,
						PaymentSearch5.mmEndToEndIdentification, PaymentSearch5.mmParties);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentSearch5";
				definition = "Defines the criteria used to search for a payment.";
				previousVersion_lazy = () -> PaymentSearch4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId")
	public List<Max35Text> getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(List<Max35Text> messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "ReqdExctnDt")
	public List<DateAndDateTimeSearchChoice> getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(List<DateAndDateTimeSearchChoice> requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	@XmlElement(name = "PmtId")
	public List<PaymentIdentification4Choice> getPaymentIdentification() {
		return paymentIdentification;
	}

	public void setPaymentIdentification(List<PaymentIdentification4Choice> paymentIdentification) {
		this.paymentIdentification = paymentIdentification;
	}

	@XmlElement(name = "Sts")
	public List<InstructionStatusSearch3> getStatus() {
		return status;
	}

	public void setStatus(List<com.tools20022.repository.msg.InstructionStatusSearch3> status) {
		this.status = status;
	}

	@XmlElement(name = "InstdAmt")
	public List<AmountRange2Choice> getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(List<AmountRange2Choice> instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	@XmlElement(name = "InstdAmtCcy")
	public List<ActiveOrHistoricCurrencyCode> getInstructedAmountCurrency() {
		return instructedAmountCurrency;
	}

	public void setInstructedAmountCurrency(List<ActiveOrHistoricCurrencyCode> instructedAmountCurrency) {
		this.instructedAmountCurrency = instructedAmountCurrency;
	}

	@XmlElement(name = "CdtDbtInd")
	public CreditDebitCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(CreditDebitCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	@XmlElement(name = "IntrBkSttlmAmt")
	public List<ActiveAmountRange1Choice> getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(List<ActiveAmountRange1Choice> interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	@XmlElement(name = "IntrBkSttlmAmtCcy")
	public List<ActiveCurrencyCode> getInterbankSettlementAmountCurrency() {
		return interbankSettlementAmountCurrency;
	}

	public void setInterbankSettlementAmountCurrency(List<ActiveCurrencyCode> interbankSettlementAmountCurrency) {
		this.interbankSettlementAmountCurrency = interbankSettlementAmountCurrency;
	}

	@XmlElement(name = "PmtMtd")
	public List<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(List<PaymentOrigin1Choice> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@XmlElement(name = "PmtTp")
	public List<PaymentType4Choice> getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(List<PaymentType4Choice> paymentType) {
		this.paymentType = paymentType;
	}

	@XmlElement(name = "Prty")
	public List<PriorityCode3Choice> getPriority() {
		return priority;
	}

	public void setPriority(List<PriorityCode3Choice> priority) {
		this.priority = priority;
	}

	@XmlElement(name = "PrcgVldtyTm")
	public List<DateTimePeriodChoice> getProcessingValidityTime() {
		return processingValidityTime;
	}

	public void setProcessingValidityTime(List<DateTimePeriodChoice> processingValidityTime) {
		this.processingValidityTime = processingValidityTime;
	}

	@XmlElement(name = "Instr")
	public List<Instruction1Code> getInstruction() {
		return instruction;
	}

	public void setInstruction(List<Instruction1Code> instruction) {
		this.instruction = instruction;
	}

	@XmlElement(name = "TxId")
	public List<Max35Text> getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(List<Max35Text> transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "IntrBkSttlmDt")
	public List<ISODate> getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public void setInterbankSettlementDate(List<ISODate> interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
	}

	@XmlElement(name = "EndToEndId")
	public List<Max35Text> getEndToEndIdentification() {
		return endToEndIdentification;
	}

	public void setEndToEndIdentification(List<Max35Text> endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
	}

	@XmlElement(name = "Pties")
	public PaymentTransactionParty2 getParties() {
		return parties;
	}

	public void setParties(com.tools20022.repository.msg.PaymentTransactionParty2 parties) {
		this.parties = parties;
	}
}