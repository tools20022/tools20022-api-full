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
import com.tools20022.repository.datatype.RequestedIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InstructionStatusReturnCriteria1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to report on the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmMessageIdentificationIndicator
 * PaymentReturnCriteria4.mmMessageIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmRequestedExecutionDateIndicator
 * PaymentReturnCriteria4.mmRequestedExecutionDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructionIndicator
 * PaymentReturnCriteria4.mmInstructionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructionStatusReturnCriteria
 * PaymentReturnCriteria4.mmInstructionStatusReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructedAmountIndicator
 * PaymentReturnCriteria4.mmInstructedAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmCreditDebitIndicator
 * PaymentReturnCriteria4.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInterbankSettlementAmountIndicator
 * PaymentReturnCriteria4.mmInterbankSettlementAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmPriorityIndicator
 * PaymentReturnCriteria4.mmPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmProcessingValidityTimeIndicator
 * PaymentReturnCriteria4.mmProcessingValidityTimeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmPurposeIndicator
 * PaymentReturnCriteria4.mmPurposeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructionCopyIndicator
 * PaymentReturnCriteria4.mmInstructionCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmPaymentMessageTypeIndicator
 * PaymentReturnCriteria4.mmPaymentMessageTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmPaymentTypeIndicator
 * PaymentReturnCriteria4.mmPaymentTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmTransactionIdentificationIndicator
 * PaymentReturnCriteria4.mmTransactionIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInterbankSettlementDateIndicator
 * PaymentReturnCriteria4.mmInterbankSettlementDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmEndToEndIdentificationIndicator
 * PaymentReturnCriteria4.mmEndToEndIdentificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmPaymentMethodIndicator
 * PaymentReturnCriteria4.mmPaymentMethodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmDebtorIndicator
 * PaymentReturnCriteria4.mmDebtorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmDebtorAgentIndicator
 * PaymentReturnCriteria4.mmDebtorAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructingReimbursementAgentIndicator
 * PaymentReturnCriteria4.mmInstructingReimbursementAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmInstructedReimbursementAgentIndicator
 * PaymentReturnCriteria4.mmInstructedReimbursementAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmIntermediaryIndicator
 * PaymentReturnCriteria4.mmIntermediaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmCreditorAgentIndicator
 * PaymentReturnCriteria4.mmCreditorAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4#mmCreditorIndicator
 * PaymentReturnCriteria4.mmCreditorIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnCriteria4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the payment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3
 * PaymentReturnCriteria3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnCriteria4", propOrder = {"messageIdentificationIndicator", "requestedExecutionDateIndicator", "instructionIndicator", "instructionStatusReturnCriteria", "instructedAmountIndicator", "creditDebitIndicator",
		"interbankSettlementAmountIndicator", "priorityIndicator", "processingValidityTimeIndicator", "purposeIndicator", "instructionCopyIndicator", "paymentMessageTypeIndicator", "paymentTypeIndicator",
		"transactionIdentificationIndicator", "interbankSettlementDateIndicator", "endToEndIdentificationIndicator", "paymentMethodIndicator", "debtorIndicator", "debtorAgentIndicator", "instructingReimbursementAgentIndicator",
		"instructedReimbursementAgentIndicator", "intermediaryIndicator", "creditorAgentIndicator", "creditorIndicator"})
public class PaymentReturnCriteria4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgIdInd")
	protected RequestedIndicator messageIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgIdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the original payment transaction message identification is requested.\nUsage: this is the former TransactionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmMessageIdentificationIndicator
	 * PaymentReturnCriteria3.mmMessageIdentificationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmMessageIdentificationIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "MsgIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentificationIndicator";
			definition = "Indicates whether the original payment transaction message identification is requested.\nUsage: this is the former TransactionReference.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmMessageIdentificationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getMessageIdentificationIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setMessageIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDtInd")
	protected RequestedIndicator requestedExecutionDateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the requested execution date is requested.\nUsage: this is the former TransferValueDate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmRequestedExecutionDateIndicator
	 * PaymentReturnCriteria3.mmRequestedExecutionDateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmRequestedExecutionDateIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDateIndicator";
			definition = "Indicates whether the requested execution date is requested.\nUsage: this is the former TransferValueDate.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmRequestedExecutionDateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getRequestedExecutionDateIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setRequestedExecutionDateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrInd")
	protected RequestedIndicator instructionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionIndicator
	 * PaymentReturnCriteria3.mmInstructionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInstructionIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIndicator";
			definition = "Indicates whether the instruction is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructionIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInstructionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrStsRtrCrit")
	protected InstructionStatusReturnCriteria1 instructionStatusReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria1
	 * InstructionStatusReturnCriteria1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrStsRtrCrit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatusReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction status is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionStatusReturnCriteria
	 * PaymentReturnCriteria3.mmInstructionStatusReturnCriteria}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<InstructionStatusReturnCriteria1>> mmInstructionStatusReturnCriteria = new MMMessageAttribute<PaymentReturnCriteria4, Optional<InstructionStatusReturnCriteria1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstrStsRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatusReturnCriteria";
			definition = "Indicates whether the instruction status is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructionStatusReturnCriteria;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InstructionStatusReturnCriteria1.mmObject();
		}

		@Override
		public Optional<InstructionStatusReturnCriteria1> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructionStatusReturnCriteria();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<InstructionStatusReturnCriteria1> value) {
			obj.setInstructionStatusReturnCriteria(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAmtInd")
	protected RequestedIndicator instructedAmountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instructed amount is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructedAmountIndicator
	 * PaymentReturnCriteria3.mmInstructedAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInstructedAmountIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountIndicator";
			definition = "Indicates whether the instructed amount is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructedAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructedAmountIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInstructedAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtDbtInd")
	protected RequestedIndicator creditDebitIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the credit debit indicator is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditDebitIndicator
	 * PaymentReturnCriteria3.mmCreditDebitIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmCreditDebitIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the credit debit indicator is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmCreditDebitIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setCreditDebitIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmAmtInd")
	protected RequestedIndicator interbankSettlementAmountIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interbank settlement amount is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInterbankSettlementAmountIndicator
	 * PaymentReturnCriteria3.mmInterbankSettlementAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInterbankSettlementAmountIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountIndicator";
			definition = "Indicates whether the interbank settlement amount is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInterbankSettlementAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInterbankSettlementAmountIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInterbankSettlementAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtyInd")
	protected RequestedIndicator priorityIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment priority is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPriorityIndicator
	 * PaymentReturnCriteria3.mmPriorityIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmPriorityIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PrtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates whether the payment priority is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmPriorityIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getPriorityIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setPriorityIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgVldtyTmInd")
	protected RequestedIndicator processingValidityTimeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTmInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTimeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the processing validity time is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmProcessingValidityTimeIndicator
	 * PaymentReturnCriteria3.mmProcessingValidityTimeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmProcessingValidityTimeIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTimeIndicator";
			definition = "Indicates whether the processing validity time is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmProcessingValidityTimeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getProcessingValidityTimeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setProcessingValidityTimeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PurpInd")
	protected RequestedIndicator purposeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurpInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurposeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transfer reason is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPurposeIndicator
	 * PaymentReturnCriteria3.mmPurposeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmPurposeIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PurpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeIndicator";
			definition = "Indicates whether the transfer reason is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmPurposeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getPurposeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setPurposeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrCpyInd")
	protected RequestedIndicator instructionCopyIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCpyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction copy is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructionCopyIndicator
	 * PaymentReturnCriteria3.mmInstructionCopyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInstructionCopyIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstrCpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopyIndicator";
			definition = "Indicates whether the instruction copy is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructionCopyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructionCopyIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInstructionCopyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMTInd")
	protected RequestedIndicator paymentMessageTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMTInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment message type is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentMessageTypeIndicator
	 * PaymentReturnCriteria3.mmPaymentMessageTypeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmPaymentMessageTypeIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtMTInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeIndicator";
			definition = "Indicates whether the payment message type is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmPaymentMessageTypeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getPaymentMessageTypeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setPaymentMessageTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtTpInd")
	protected RequestedIndicator paymentTypeIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment type is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentTypeIndicator
	 * PaymentReturnCriteria3.mmPaymentTypeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmPaymentTypeIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeIndicator";
			definition = "Indicates whether the payment type is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmPaymentTypeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getPaymentTypeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setPaymentTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TxIdInd")
	protected RequestedIndicator transactionIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxIdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transaction identification is requested.\nUsage: this is the former PaymentInstructionReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmTransactionIdentificationIndicator
	 * PaymentReturnCriteria3.mmTransactionIdentificationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmTransactionIdentificationIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "TxIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationIndicator";
			definition = "Indicates whether the transaction identification is requested.\nUsage: this is the former PaymentInstructionReference.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmTransactionIdentificationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getTransactionIdentificationIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setTransactionIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkSttlmDtInd")
	protected RequestedIndicator interbankSettlementDateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interbank settlement date is requested.\nUsage: this is the former InterbankValueDate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInterbankSettlementDateIndicator
	 * PaymentReturnCriteria3.mmInterbankSettlementDateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInterbankSettlementDateIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDateIndicator";
			definition = "Indicates whether the interbank settlement date is requested.\nUsage: this is the former InterbankValueDate.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInterbankSettlementDateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInterbankSettlementDateIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInterbankSettlementDateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "EndToEndIdInd")
	protected RequestedIndicator endToEndIdentificationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndToEndIdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndToEndIdentificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the end-to-end identification is requested.\nUsage: this is the former RelatedReference."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmEndToEndIdentificationIndicator
	 * PaymentReturnCriteria3.mmEndToEndIdentificationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmEndToEndIdentificationIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "EndToEndIdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndToEndIdentificationIndicator";
			definition = "Indicates whether the end-to-end identification is requested.\nUsage: this is the former RelatedReference.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmEndToEndIdentificationIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getEndToEndIdentificationIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setEndToEndIdentificationIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtdInd")
	protected RequestedIndicator paymentMethodIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment method is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmPaymentMethodIndicator
	 * PaymentReturnCriteria3.mmPaymentMethodIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmPaymentMethodIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "PmtMtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethodIndicator";
			definition = "Indicates whether the payment method is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmPaymentMethodIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getPaymentMethodIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setPaymentMethodIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrInd")
	protected RequestedIndicator debtorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the debtor is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmDebtorIndicator
	 * PaymentReturnCriteria3.mmDebtorIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmDebtorIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "DbtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIndicator";
			definition = "Indicates whether the debtor is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmDebtorIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getDebtorIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setDebtorIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgtInd")
	protected RequestedIndicator debtorAgentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the debtor agent is requested.\nUsage: this is the former FirstAgent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmDebtorAgentIndicator
	 * PaymentReturnCriteria3.mmDebtorAgentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmDebtorAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentIndicator";
			definition = "Indicates whether the debtor agent is requested.\nUsage: this is the former FirstAgent.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmDebtorAgentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getDebtorAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setDebtorAgentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgtInd")
	protected RequestedIndicator instructingReimbursementAgentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instructing reimbursement agent is requested.\r\nUsage: this is the former InstructingAgentCorrespondent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructingReimbursementAgentIndicator
	 * PaymentReturnCriteria3.mmInstructingReimbursementAgentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInstructingReimbursementAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentIndicator";
			definition = "Indicates whether the instructing reimbursement agent is requested.\r\nUsage: this is the former InstructingAgentCorrespondent.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructingReimbursementAgentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructingReimbursementAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInstructingReimbursementAgentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgtInd")
	protected RequestedIndicator instructedReimbursementAgentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the instructed reimbursement agent is requested.\r\nUsage: this is the former InstructedAgentCorrespondent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmInstructedReimbursementAgentIndicator
	 * PaymentReturnCriteria3.mmInstructedReimbursementAgentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmInstructedReimbursementAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentIndicator";
			definition = "Indicates whether the instructed reimbursement agent is requested.\r\nUsage: this is the former InstructedAgentCorrespondent.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmInstructedReimbursementAgentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getInstructedReimbursementAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setInstructedReimbursementAgentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyInd")
	protected RequestedIndicator intermediaryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the intermediary is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmIntermediaryIndicator
	 * PaymentReturnCriteria3.mmIntermediaryIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmIntermediaryIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryIndicator";
			definition = "Indicates whether the intermediary is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmIntermediaryIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getIntermediaryIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setIntermediaryIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgtInd")
	protected RequestedIndicator creditorAgentIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the creditor agent is requested.\nUsage: this is the former FinalAgent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditorAgentIndicator
	 * PaymentReturnCriteria3.mmCreditorAgentIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmCreditorAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentIndicator";
			definition = "Indicates whether the creditor agent is requested.\nUsage: this is the former FinalAgent.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmCreditorAgentIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getCreditorAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setCreditorAgentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrInd")
	protected RequestedIndicator creditorIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RequestedIndicator
	 * RequestedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria4
	 * PaymentReturnCriteria4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the creditor is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria3#mmCreditorIndicator
	 * PaymentReturnCriteria3.mmCreditorIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>> mmCreditorIndicator = new MMMessageAttribute<PaymentReturnCriteria4, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria4.mmObject();
			isDerived = false;
			xmlTag = "CdtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIndicator";
			definition = "Indicates whether the creditor is requested.";
			previousVersion_lazy = () -> PaymentReturnCriteria3.mmCreditorIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria4 obj) {
			return obj.getCreditorIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria4 obj, Optional<RequestedIndicator> value) {
			obj.setCreditorIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReturnCriteria4.mmMessageIdentificationIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmRequestedExecutionDateIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructionIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructionStatusReturnCriteria,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructedAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmCreditDebitIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInterbankSettlementAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmPriorityIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmProcessingValidityTimeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmPurposeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructionCopyIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmPaymentMessageTypeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmPaymentTypeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmTransactionIdentificationIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInterbankSettlementDateIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmEndToEndIdentificationIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmPaymentMethodIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmDebtorIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmDebtorAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructingReimbursementAgentIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmInstructedReimbursementAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmIntermediaryIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria4.mmCreditorAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria4.mmCreditorIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnCriteria4";
				definition = "Defines the criteria used to report on the payment.";
				previousVersion_lazy = () -> PaymentReturnCriteria3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getMessageIdentificationIndicator() {
		return messageIdentificationIndicator == null ? Optional.empty() : Optional.of(messageIdentificationIndicator);
	}

	public PaymentReturnCriteria4 setMessageIdentificationIndicator(RequestedIndicator messageIdentificationIndicator) {
		this.messageIdentificationIndicator = messageIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getRequestedExecutionDateIndicator() {
		return requestedExecutionDateIndicator == null ? Optional.empty() : Optional.of(requestedExecutionDateIndicator);
	}

	public PaymentReturnCriteria4 setRequestedExecutionDateIndicator(RequestedIndicator requestedExecutionDateIndicator) {
		this.requestedExecutionDateIndicator = requestedExecutionDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructionIndicator() {
		return instructionIndicator == null ? Optional.empty() : Optional.of(instructionIndicator);
	}

	public PaymentReturnCriteria4 setInstructionIndicator(RequestedIndicator instructionIndicator) {
		this.instructionIndicator = instructionIndicator;
		return this;
	}

	public Optional<InstructionStatusReturnCriteria1> getInstructionStatusReturnCriteria() {
		return instructionStatusReturnCriteria == null ? Optional.empty() : Optional.of(instructionStatusReturnCriteria);
	}

	public PaymentReturnCriteria4 setInstructionStatusReturnCriteria(InstructionStatusReturnCriteria1 instructionStatusReturnCriteria) {
		this.instructionStatusReturnCriteria = instructionStatusReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getInstructedAmountIndicator() {
		return instructedAmountIndicator == null ? Optional.empty() : Optional.of(instructedAmountIndicator);
	}

	public PaymentReturnCriteria4 setInstructedAmountIndicator(RequestedIndicator instructedAmountIndicator) {
		this.instructedAmountIndicator = instructedAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentReturnCriteria4 setCreditDebitIndicator(RequestedIndicator creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInterbankSettlementAmountIndicator() {
		return interbankSettlementAmountIndicator == null ? Optional.empty() : Optional.of(interbankSettlementAmountIndicator);
	}

	public PaymentReturnCriteria4 setInterbankSettlementAmountIndicator(RequestedIndicator interbankSettlementAmountIndicator) {
		this.interbankSettlementAmountIndicator = interbankSettlementAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPriorityIndicator() {
		return priorityIndicator == null ? Optional.empty() : Optional.of(priorityIndicator);
	}

	public PaymentReturnCriteria4 setPriorityIndicator(RequestedIndicator priorityIndicator) {
		this.priorityIndicator = priorityIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getProcessingValidityTimeIndicator() {
		return processingValidityTimeIndicator == null ? Optional.empty() : Optional.of(processingValidityTimeIndicator);
	}

	public PaymentReturnCriteria4 setProcessingValidityTimeIndicator(RequestedIndicator processingValidityTimeIndicator) {
		this.processingValidityTimeIndicator = processingValidityTimeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPurposeIndicator() {
		return purposeIndicator == null ? Optional.empty() : Optional.of(purposeIndicator);
	}

	public PaymentReturnCriteria4 setPurposeIndicator(RequestedIndicator purposeIndicator) {
		this.purposeIndicator = purposeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructionCopyIndicator() {
		return instructionCopyIndicator == null ? Optional.empty() : Optional.of(instructionCopyIndicator);
	}

	public PaymentReturnCriteria4 setInstructionCopyIndicator(RequestedIndicator instructionCopyIndicator) {
		this.instructionCopyIndicator = instructionCopyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentMessageTypeIndicator() {
		return paymentMessageTypeIndicator == null ? Optional.empty() : Optional.of(paymentMessageTypeIndicator);
	}

	public PaymentReturnCriteria4 setPaymentMessageTypeIndicator(RequestedIndicator paymentMessageTypeIndicator) {
		this.paymentMessageTypeIndicator = paymentMessageTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentTypeIndicator() {
		return paymentTypeIndicator == null ? Optional.empty() : Optional.of(paymentTypeIndicator);
	}

	public PaymentReturnCriteria4 setPaymentTypeIndicator(RequestedIndicator paymentTypeIndicator) {
		this.paymentTypeIndicator = paymentTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTransactionIdentificationIndicator() {
		return transactionIdentificationIndicator == null ? Optional.empty() : Optional.of(transactionIdentificationIndicator);
	}

	public PaymentReturnCriteria4 setTransactionIdentificationIndicator(RequestedIndicator transactionIdentificationIndicator) {
		this.transactionIdentificationIndicator = transactionIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInterbankSettlementDateIndicator() {
		return interbankSettlementDateIndicator == null ? Optional.empty() : Optional.of(interbankSettlementDateIndicator);
	}

	public PaymentReturnCriteria4 setInterbankSettlementDateIndicator(RequestedIndicator interbankSettlementDateIndicator) {
		this.interbankSettlementDateIndicator = interbankSettlementDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getEndToEndIdentificationIndicator() {
		return endToEndIdentificationIndicator == null ? Optional.empty() : Optional.of(endToEndIdentificationIndicator);
	}

	public PaymentReturnCriteria4 setEndToEndIdentificationIndicator(RequestedIndicator endToEndIdentificationIndicator) {
		this.endToEndIdentificationIndicator = endToEndIdentificationIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentMethodIndicator() {
		return paymentMethodIndicator == null ? Optional.empty() : Optional.of(paymentMethodIndicator);
	}

	public PaymentReturnCriteria4 setPaymentMethodIndicator(RequestedIndicator paymentMethodIndicator) {
		this.paymentMethodIndicator = paymentMethodIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getDebtorIndicator() {
		return debtorIndicator == null ? Optional.empty() : Optional.of(debtorIndicator);
	}

	public PaymentReturnCriteria4 setDebtorIndicator(RequestedIndicator debtorIndicator) {
		this.debtorIndicator = debtorIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getDebtorAgentIndicator() {
		return debtorAgentIndicator == null ? Optional.empty() : Optional.of(debtorAgentIndicator);
	}

	public PaymentReturnCriteria4 setDebtorAgentIndicator(RequestedIndicator debtorAgentIndicator) {
		this.debtorAgentIndicator = debtorAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructingReimbursementAgentIndicator() {
		return instructingReimbursementAgentIndicator == null ? Optional.empty() : Optional.of(instructingReimbursementAgentIndicator);
	}

	public PaymentReturnCriteria4 setInstructingReimbursementAgentIndicator(RequestedIndicator instructingReimbursementAgentIndicator) {
		this.instructingReimbursementAgentIndicator = instructingReimbursementAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructedReimbursementAgentIndicator() {
		return instructedReimbursementAgentIndicator == null ? Optional.empty() : Optional.of(instructedReimbursementAgentIndicator);
	}

	public PaymentReturnCriteria4 setInstructedReimbursementAgentIndicator(RequestedIndicator instructedReimbursementAgentIndicator) {
		this.instructedReimbursementAgentIndicator = instructedReimbursementAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getIntermediaryIndicator() {
		return intermediaryIndicator == null ? Optional.empty() : Optional.of(intermediaryIndicator);
	}

	public PaymentReturnCriteria4 setIntermediaryIndicator(RequestedIndicator intermediaryIndicator) {
		this.intermediaryIndicator = intermediaryIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditorAgentIndicator() {
		return creditorAgentIndicator == null ? Optional.empty() : Optional.of(creditorAgentIndicator);
	}

	public PaymentReturnCriteria4 setCreditorAgentIndicator(RequestedIndicator creditorAgentIndicator) {
		this.creditorAgentIndicator = creditorAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditorIndicator() {
		return creditorIndicator == null ? Optional.empty() : Optional.of(creditorIndicator);
	}

	public PaymentReturnCriteria4 setCreditorIndicator(RequestedIndicator creditorIndicator) {
		this.creditorIndicator = creditorIndicator;
		return this;
	}
}