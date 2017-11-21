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
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentSearch3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentSearch3", propOrder = {"transactionReference", "transferValueDate", "instructionReference", "instructionStatus", "instructedAmount", "instructedAmountCurrency", "creditDebitIndicator", "interbankSettlementAmount",
		"interbankSettlementAmountCurrency", "paymentMethod", "priority", "processingValidityTime", "instruction", "paymentType", "paymentInstructionReference", "interbankValueDate", "relatedReference", "paymentTransactionParty"})
public class PaymentSearch3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Max35Text> transactionReference;
	/**
	 * Unique and unambiguous identifier for a payment transaction, as assigned
	 * by the originator. The payment transaction reference is used for
	 * reconciliation or to link tasks relating to the payment transaction.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "TxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReference";
			definition = "Unique and unambiguous identifier for a payment transaction, as assigned by the originator. The payment transaction reference is used for reconciliation or to link tasks relating to the payment transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<DateAndDateTimeSearchChoice> transferValueDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
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
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "TrfValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearchChoice.mmObject();
		}
	};
	protected List<PaymentIdentification3Choice> instructionReference;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing agent or the initiating party.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionReference = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentIdentification3Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructionStatusSearch3> instructionStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information about the status of a transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatus";
			definition = "Detailed information about the status of a transfer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionStatusSearch3.mmObject();
		}
	};
	protected List<AmountRangeChoice> instructedAmount;
	/**
	 * Specifies the instructed amount(s) on which the query is performed.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Specifies the instructed amount(s) on which the query is performed.";
			minOccurs = 0;
			complexType_lazy = () -> AmountRangeChoice.mmObject();
		}
	};
	protected List<CurrencyCode> instructedAmountCurrency;
	/**
	 * The Currency in which the instructed amount is expressed.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The Currency in which the instructed amount is expressed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmountCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountCurrency";
			definition = "The Currency in which the instructed amount is expressed.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
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
			businessElementTrace_lazy = () -> PaymentExecution.mmCreditDebitIndicator;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
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
	protected List<AmountRangeChoice> interbankSettlementAmount;
	/**
	 * Specifies the interbank settlement amount(s) on which the query is
	 * performed.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Specifies the interbank settlement amount(s) on which the query is performed.";
			minOccurs = 0;
			complexType_lazy = () -> AmountRangeChoice.mmObject();
		}
	};
	protected List<CurrencyCode> interbankSettlementAmountCurrency;
	/**
	 * Currency in which the interbank settlement amount is expressed.
	 * <p>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmountCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountCurrency";
			definition = "Currency in which the interbank settlement amount is expressed.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
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
			businessElementTrace_lazy = () -> Payment.mmCreditMethod;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}
	};
	protected List<PriorityCodeChoice> priority;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriority = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.";
			minOccurs = 0;
			complexType_lazy = () -> PriorityCodeChoice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
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
	 * "Date and time range within which the payment instruction must be processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingValidityTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.";
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
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
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstruction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}
	};
	protected List<PaymentType2Choice> paymentType;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentType";
			definition = "Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentType2Choice.mmObject();
		}
	};
	protected List<Max35Text> paymentInstructionReference;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing agent or the initiating party.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentSearch3 PaymentSearch3}</li>
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
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<ISODate> interbankValueDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankValueDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<Max35Text> relatedReference;
	/**
	 * The related reference as stipulated in the payment instruction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The related reference as stipulated in the payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "The related reference as stipulated in the payment instruction.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PaymentTransactionParty paymentTransactionParty;
	/**
	 * Defines the party fields used to search for a payment.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTransactionParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the party fields used to search for a payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTransactionParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PaymentSearch3.mmObject();
			isDerived = false;
			xmlTag = "PmtTxPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTransactionParty";
			definition = "Defines the party fields used to search for a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransactionParty.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentSearch3.mmTransactionReference, PaymentSearch3.mmTransferValueDate, PaymentSearch3.mmInstructionReference, PaymentSearch3.mmInstructionStatus,
						PaymentSearch3.mmInstructedAmount, PaymentSearch3.mmInstructedAmountCurrency, PaymentSearch3.mmCreditDebitIndicator, PaymentSearch3.mmInterbankSettlementAmount, PaymentSearch3.mmInterbankSettlementAmountCurrency,
						PaymentSearch3.mmPaymentMethod, PaymentSearch3.mmPriority, PaymentSearch3.mmProcessingValidityTime, PaymentSearch3.mmInstruction, PaymentSearch3.mmPaymentType, PaymentSearch3.mmPaymentInstructionReference,
						PaymentSearch3.mmInterbankValueDate, PaymentSearch3.mmRelatedReference, PaymentSearch3.mmPaymentTransactionParty);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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

	@XmlElement(name = "TxRef")
	public List<Max35Text> getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(List<Max35Text> transactionReference) {
		this.transactionReference = transactionReference;
	}

	@XmlElement(name = "TrfValDt")
	public List<DateAndDateTimeSearchChoice> getTransferValueDate() {
		return transferValueDate;
	}

	public void setTransferValueDate(List<DateAndDateTimeSearchChoice> transferValueDate) {
		this.transferValueDate = transferValueDate;
	}

	@XmlElement(name = "InstrRef")
	public List<PaymentIdentification3Choice> getInstructionReference() {
		return instructionReference;
	}

	public void setInstructionReference(List<PaymentIdentification3Choice> instructionReference) {
		this.instructionReference = instructionReference;
	}

	@XmlElement(name = "InstrSts")
	public List<InstructionStatusSearch3> getInstructionStatus() {
		return instructionStatus;
	}

	public void setInstructionStatus(List<com.tools20022.repository.msg.InstructionStatusSearch3> instructionStatus) {
		this.instructionStatus = instructionStatus;
	}

	@XmlElement(name = "InstdAmt")
	public List<AmountRangeChoice> getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(List<AmountRangeChoice> instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	@XmlElement(name = "InstdAmtCcy")
	public List<CurrencyCode> getInstructedAmountCurrency() {
		return instructedAmountCurrency;
	}

	public void setInstructedAmountCurrency(List<CurrencyCode> instructedAmountCurrency) {
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
	public List<AmountRangeChoice> getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(List<AmountRangeChoice> interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	@XmlElement(name = "IntrBkSttlmAmtCcy")
	public List<CurrencyCode> getInterbankSettlementAmountCurrency() {
		return interbankSettlementAmountCurrency;
	}

	public void setInterbankSettlementAmountCurrency(List<CurrencyCode> interbankSettlementAmountCurrency) {
		this.interbankSettlementAmountCurrency = interbankSettlementAmountCurrency;
	}

	@XmlElement(name = "PmtMtd")
	public List<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(List<PaymentOrigin1Choice> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@XmlElement(name = "Prty")
	public List<PriorityCodeChoice> getPriority() {
		return priority;
	}

	public void setPriority(List<PriorityCodeChoice> priority) {
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

	@XmlElement(name = "PmtTp")
	public List<PaymentType2Choice> getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(List<PaymentType2Choice> paymentType) {
		this.paymentType = paymentType;
	}

	@XmlElement(name = "PmtInstrRef")
	public List<Max35Text> getPaymentInstructionReference() {
		return paymentInstructionReference;
	}

	public void setPaymentInstructionReference(List<Max35Text> paymentInstructionReference) {
		this.paymentInstructionReference = paymentInstructionReference;
	}

	@XmlElement(name = "IntrBkValDt")
	public List<ISODate> getInterbankValueDate() {
		return interbankValueDate;
	}

	public void setInterbankValueDate(List<ISODate> interbankValueDate) {
		this.interbankValueDate = interbankValueDate;
	}

	@XmlElement(name = "RltdRef")
	public List<Max35Text> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<Max35Text> relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "PmtTxPty")
	public PaymentTransactionParty getPaymentTransactionParty() {
		return paymentTransactionParty;
	}

	public void setPaymentTransactionParty(com.tools20022.repository.msg.PaymentTransactionParty paymentTransactionParty) {
		this.paymentTransactionParty = paymentTransactionParty;
	}
}