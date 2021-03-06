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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaymentStatus2;
import com.tools20022.repository.msg.PaymentTransactionParty2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmMessageIdentification
 * PaymentInstruction14.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmRequestedExecutionDate
 * PaymentInstruction14.mmRequestedExecutionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmStatus
 * PaymentInstruction14.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInstructedAmount
 * PaymentInstruction14.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementAmount
 * PaymentInstruction14.mmInterbankSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPurpose
 * PaymentInstruction14.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPaymentMethod
 * PaymentInstruction14.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmPriority
 * PaymentInstruction14.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmProcessingValidityTime
 * PaymentInstruction14.mmProcessingValidityTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInstructionCopy
 * PaymentInstruction14.mmInstructionCopy}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmType
 * PaymentInstruction14.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmGeneratedOrder
 * PaymentInstruction14.mmGeneratedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmTransactionIdentification
 * PaymentInstruction14.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmInterbankSettlementDate
 * PaymentInstruction14.mmInterbankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmEndToEndIdentification
 * PaymentInstruction14.mmEndToEndIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction14#mmParties
 * PaymentInstruction14.mmParties}</li>
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
 * "PaymentInstruction14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the payment instruction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction26
 * PaymentInstruction26}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1
 * PaymentInstruction1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstruction14", propOrder = {"messageIdentification", "requestedExecutionDate", "status", "instructedAmount", "interbankSettlementAmount", "purpose", "paymentMethod", "priority", "processingValidityTime",
		"instructionCopy", "type", "generatedOrder", "transactionIdentification", "interbankSettlementDate", "endToEndIdentification", "parties"})
public class PaymentInstruction14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId")
	protected Max35Text messageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message\nUsage: this is the former TransactionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmMessageIdentification
	 * PaymentInstruction26.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmMessageIdentification
	 * PaymentInstruction1.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>> mmMessageIdentification = new MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Point to point reference, as assigned by the original initiating party, to unambiguously identify the original payment transaction message\nUsage: this is the former TransactionReference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmMessageIdentification);
			previousVersion_lazy = () -> PaymentInstruction1.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstruction14 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Max35Text> value) {
			obj.setMessageIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected DateAndDateTimeChoice requestedExecutionDate;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmRequestedExecutionDate
	 * PaymentInstruction26.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmRequestedExecutionDate
	 * PaymentInstruction1.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<DateAndDateTimeChoice>> mmRequestedExecutionDate = new MMMessageAttribute<PaymentInstruction14, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time at which the cash is at the disposal of the credit account owner, or ceases to be at the disposal of the debit account owner.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmRequestedExecutionDate);
			previousVersion_lazy = () -> PaymentInstruction1.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(PaymentInstruction14 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected List<PaymentStatus2> status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentStatus2
	 * PaymentStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentStatus
	 * Payment.mmPaymentStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmStatus
	 * PaymentInstruction26.mmStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmStatus
	 * PaymentInstruction1.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction14, List<PaymentStatus2>> mmStatus = new MMMessageAssociationEnd<PaymentInstruction14, List<PaymentStatus2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Detailed information about the status of a transfer.\n\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmStatus);
			previousVersion_lazy = () -> PaymentInstruction1.mmStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentStatus2.mmObject();
		}

		@Override
		public List<PaymentStatus2> getValue(PaymentInstruction14 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, List<PaymentStatus2> value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "InstdAmt")
	protected Amount3Choice instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount3Choice Amount3Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmInstructedAmount
	 * PaymentInstruction26.mmInstructedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInstructedAmount
	 * PaymentInstruction1.mmInstructedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Amount3Choice>> mmInstructedAmount = new MMMessageAttribute<PaymentInstruction14, Optional<Amount3Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmInstructedAmount);
			previousVersion_lazy = () -> PaymentInstruction1.mmInstructedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount3Choice.mmObject();
		}

		@Override
		public Optional<Amount3Choice> getValue(PaymentInstruction14 obj) {
			return obj.getInstructedAmount();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Amount3Choice> value) {
			obj.setInstructedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt")
	protected Amount2Choice interbankSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Amount2Choice Amount2Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmInterbankSettlementAmount
	 * PaymentInstruction26.mmInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementAmount
	 * PaymentInstruction1.mmInterbankSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Amount2Choice>> mmInterbankSettlementAmount = new MMMessageAttribute<PaymentInstruction14, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmInterbankSettlementAmount);
			previousVersion_lazy = () -> PaymentInstruction1.mmInterbankSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(PaymentInstruction14 obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Amount2Choice> value) {
			obj.setInterbankSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Max10Text purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying reason for the payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmPurpose
	 * PaymentInstruction26.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPurpose
	 * PaymentInstruction1.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Max10Text>> mmPurpose = new MMMessageAttribute<PaymentInstruction14, Optional<Max10Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmPurpose);
			previousVersion_lazy = () -> PaymentInstruction1.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}

		@Override
		public Optional<Max10Text> getValue(PaymentInstruction14 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Max10Text> value) {
			obj.setPurpose(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
	 * CreditInstrument.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmPaymentMethod
	 * PaymentInstruction26.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPaymentMethod
	 * PaymentInstruction1.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentOrigin1Choice>>() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Indicates the message or event from which an instruction has been initiated.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentInstruction1.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public Optional<PaymentOrigin1Choice> getValue(PaymentInstruction14 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityCode3Choice priority;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmPriority
	 * PaymentInstruction26.mmPriority}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmPriority
	 * PaymentInstruction1.mmPriority}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<PriorityCode3Choice>> mmPriority = new MMMessageAttribute<PaymentInstruction14, Optional<PriorityCode3Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPriority;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Urgency or order of importance that the originator would like the recipient of the payment instruction to apply to the processing of the payment instruction.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmPriority);
			previousVersion_lazy = () -> PaymentInstruction1.mmPriority;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriorityCode3Choice.mmObject();
		}

		@Override
		public Optional<PriorityCode3Choice> getValue(PaymentInstruction14 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<PriorityCode3Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgVldtyTm")
	protected DateTimePeriodChoice processingValidityTime;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmProcessingValidityTime
	 * PaymentInstruction26.mmProcessingValidityTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmProcessingValidityTime
	 * PaymentInstruction1.mmProcessingValidityTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<DateTimePeriodChoice>> mmProcessingValidityTime = new MMMessageAttribute<PaymentInstruction14, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmProcessingValidityTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTime";
			definition = "Date and time range within which the payment instruction must be processed.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmProcessingValidityTime);
			previousVersion_lazy = () -> PaymentInstruction1.mmProcessingValidityTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(PaymentInstruction14 obj) {
			return obj.getProcessingValidityTime();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<DateTimePeriodChoice> value) {
			obj.setProcessingValidityTime(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCpy")
	protected Max20000Text instructionCopy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCpy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCopy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Copy of the original instruction, in free form text."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmInstructionCopy
	 * PaymentInstruction26.mmInstructionCopy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInstructionCopy
	 * PaymentInstruction1.mmInstructionCopy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Max20000Text>> mmInstructionCopy = new MMMessageAttribute<PaymentInstruction14, Optional<Max20000Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "InstrCpy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopy";
			definition = "Copy of the original instruction, in free form text.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmInstructionCopy);
			previousVersion_lazy = () -> PaymentInstruction1.mmInstructionCopy;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Optional<Max20000Text> getValue(PaymentInstruction14 obj) {
			return obj.getInstructionCopy();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Max20000Text> value) {
			obj.setInstructionCopy(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected PaymentType4Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PaymentType4Choice
	 * PaymentType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmType
	 * Payment.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type, or nature, of the payment, such as express payment.\n."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmType
	 * PaymentInstruction26.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmType
	 * PaymentInstruction1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentType4Choice>> mmType = new MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentType4Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type, or nature, of the payment, such as express payment.\n.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmType);
			previousVersion_lazy = () -> PaymentInstruction1.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentType4Choice.mmObject();
		}

		@Override
		public Optional<PaymentType4Choice> getValue(PaymentInstruction14 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<PaymentType4Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "GnrtdOrdr")
	protected TrueFalseIndicator generatedOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnrtdOrdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment is a liquidity transfer order that has been executed automatically following a predefined or standing order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmGeneratedOrder
	 * PaymentInstruction26.mmGeneratedOrder}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmGeneratedOrder
	 * PaymentInstruction1.mmGeneratedOrder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<TrueFalseIndicator>> mmGeneratedOrder = new MMMessageAttribute<PaymentInstruction14, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "GnrtdOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedOrder";
			definition = "Payment is a liquidity transfer order that has been executed automatically following a predefined or standing order.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmGeneratedOrder);
			previousVersion_lazy = () -> PaymentInstruction1.mmGeneratedOrder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(PaymentInstruction14 obj) {
			return obj.getGeneratedOrder();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<TrueFalseIndicator> value) {
			obj.setGeneratedOrder(value.orElse(null));
		}
	};
	@XmlElement(name = "TxId")
	protected Max35Text transactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmTransactionIdentification
	 * PaymentIdentification.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\r\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\r\nUsage: This is the former PaymentInstructionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmTransactionIdentification
	 * PaymentInstruction26.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmTransactionIdentification
	 * PaymentInstruction1.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>> mmTransactionIdentification = new MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\r\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\r\nUsage: This is the former PaymentInstructionReference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmTransactionIdentification);
			previousVersion_lazy = () -> PaymentInstruction1.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstruction14 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Max35Text> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmDt")
	protected ISODate interbankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmInterbankSettlementDate
	 * PaymentInstruction26.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmInterbankSettlementDate
	 * PaymentInstruction1.mmInterbankSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<ISODate>> mmInterbankSettlementDate = new MMMessageAttribute<PaymentInstruction14, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmInterbankSettlementDate);
			previousVersion_lazy = () -> PaymentInstruction1.mmInterbankSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentInstruction14 obj) {
			return obj.getInterbankSettlementDate();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<ISODate> value) {
			obj.setInterbankSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "EndToEndId")
	protected Max35Text endToEndIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\r\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\r\nIt can be included in several messages related to the transaction.\r\nUsage: This is the former related reference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmEndToEndIdentification
	 * PaymentInstruction26.mmEndToEndIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmEndToEndIdentification
	 * PaymentInstruction1.mmEndToEndIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>> mmEndToEndIdentification = new MMMessageAttribute<PaymentInstruction14, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmEndToEndIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "EndToEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain.\r\nUsage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction.\r\nIt can be included in several messages related to the transaction.\r\nUsage: This is the former related reference.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmEndToEndIdentification);
			previousVersion_lazy = () -> PaymentInstruction1.mmEndToEndIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstruction14 obj) {
			return obj.getEndToEndIdentification();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<Max35Text> value) {
			obj.setEndToEndIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction14
	 * PaymentInstruction14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction26#mmParties
	 * PaymentInstruction26.mmParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction1#mmParties
	 * PaymentInstruction1.mmParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentTransactionParty2>> mmParties = new MMMessageAssociationEnd<PaymentInstruction14, Optional<PaymentTransactionParty2>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction14.mmObject();
			isDerived = false;
			xmlTag = "Pties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parties";
			definition = "Defines the party fields used to search for a payment.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmParties);
			previousVersion_lazy = () -> PaymentInstruction1.mmParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransactionParty2.mmObject();
		}

		@Override
		public Optional<PaymentTransactionParty2> getValue(PaymentInstruction14 obj) {
			return obj.getParties();
		}

		@Override
		public void setValue(PaymentInstruction14 obj, Optional<PaymentTransactionParty2> value) {
			obj.setParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.PaymentInstruction14.mmMessageIdentification, com.tools20022.repository.msg.PaymentInstruction14.mmRequestedExecutionDate,
								com.tools20022.repository.msg.PaymentInstruction14.mmStatus, com.tools20022.repository.msg.PaymentInstruction14.mmInstructedAmount,
								com.tools20022.repository.msg.PaymentInstruction14.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstruction14.mmPurpose,
								com.tools20022.repository.msg.PaymentInstruction14.mmPaymentMethod, com.tools20022.repository.msg.PaymentInstruction14.mmPriority, com.tools20022.repository.msg.PaymentInstruction14.mmProcessingValidityTime,
								com.tools20022.repository.msg.PaymentInstruction14.mmInstructionCopy, com.tools20022.repository.msg.PaymentInstruction14.mmType, com.tools20022.repository.msg.PaymentInstruction14.mmGeneratedOrder,
								com.tools20022.repository.msg.PaymentInstruction14.mmTransactionIdentification, com.tools20022.repository.msg.PaymentInstruction14.mmInterbankSettlementDate,
								com.tools20022.repository.msg.PaymentInstruction14.mmEndToEndIdentification, com.tools20022.repository.msg.PaymentInstruction14.mmParties);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction14";
				definition = "Provides details on the payment instruction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstruction26.mmObject());
				previousVersion_lazy = () -> PaymentInstruction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMessageIdentification() {
		return messageIdentification == null ? Optional.empty() : Optional.of(messageIdentification);
	}

	public PaymentInstruction14 setMessageIdentification(Max35Text messageIdentification) {
		this.messageIdentification = messageIdentification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public PaymentInstruction14 setRequestedExecutionDate(DateAndDateTimeChoice requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public List<PaymentStatus2> getStatus() {
		return status == null ? status = new ArrayList<>() : status;
	}

	public PaymentInstruction14 setStatus(List<PaymentStatus2> status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<Amount3Choice> getInstructedAmount() {
		return instructedAmount == null ? Optional.empty() : Optional.of(instructedAmount);
	}

	public PaymentInstruction14 setInstructedAmount(Amount3Choice instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}

	public Optional<Amount2Choice> getInterbankSettlementAmount() {
		return interbankSettlementAmount == null ? Optional.empty() : Optional.of(interbankSettlementAmount);
	}

	public PaymentInstruction14 setInterbankSettlementAmount(Amount2Choice interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
		return this;
	}

	public Optional<Max10Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public PaymentInstruction14 setPurpose(Max10Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public PaymentInstruction14 setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	public Optional<PriorityCode3Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public PaymentInstruction14 setPriority(PriorityCode3Choice priority) {
		this.priority = priority;
		return this;
	}

	public Optional<DateTimePeriodChoice> getProcessingValidityTime() {
		return processingValidityTime == null ? Optional.empty() : Optional.of(processingValidityTime);
	}

	public PaymentInstruction14 setProcessingValidityTime(DateTimePeriodChoice processingValidityTime) {
		this.processingValidityTime = processingValidityTime;
		return this;
	}

	public Optional<Max20000Text> getInstructionCopy() {
		return instructionCopy == null ? Optional.empty() : Optional.of(instructionCopy);
	}

	public PaymentInstruction14 setInstructionCopy(Max20000Text instructionCopy) {
		this.instructionCopy = instructionCopy;
		return this;
	}

	public Optional<PaymentType4Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public PaymentInstruction14 setType(PaymentType4Choice type) {
		this.type = type;
		return this;
	}

	public Optional<TrueFalseIndicator> getGeneratedOrder() {
		return generatedOrder == null ? Optional.empty() : Optional.of(generatedOrder);
	}

	public PaymentInstruction14 setGeneratedOrder(TrueFalseIndicator generatedOrder) {
		this.generatedOrder = generatedOrder;
		return this;
	}

	public Optional<Max35Text> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public PaymentInstruction14 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public Optional<ISODate> getInterbankSettlementDate() {
		return interbankSettlementDate == null ? Optional.empty() : Optional.of(interbankSettlementDate);
	}

	public PaymentInstruction14 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = interbankSettlementDate;
		return this;
	}

	public Optional<Max35Text> getEndToEndIdentification() {
		return endToEndIdentification == null ? Optional.empty() : Optional.of(endToEndIdentification);
	}

	public PaymentInstruction14 setEndToEndIdentification(Max35Text endToEndIdentification) {
		this.endToEndIdentification = endToEndIdentification;
		return this;
	}

	public Optional<PaymentTransactionParty2> getParties() {
		return parties == null ? Optional.empty() : Optional.of(parties);
	}

	public PaymentInstruction14 setParties(PaymentTransactionParty2 parties) {
		this.parties = parties;
		return this;
	}
}