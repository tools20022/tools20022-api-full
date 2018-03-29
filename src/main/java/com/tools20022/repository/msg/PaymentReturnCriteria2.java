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
import com.tools20022.repository.msg.InstructionStatusReturnCriteria;
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
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmTransactionReferenceIndicator
 * PaymentReturnCriteria2.mmTransactionReferenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmTransferValueDateIndicator
 * PaymentReturnCriteria2.mmTransferValueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructionIndicator
 * PaymentReturnCriteria2.mmInstructionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructionStatusReturnCriteria
 * PaymentReturnCriteria2.mmInstructionStatusReturnCriteria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructedAmountIndicator
 * PaymentReturnCriteria2.mmInstructedAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmCreditDebitIndicator
 * PaymentReturnCriteria2.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInterbankSettlementAmountIndicator
 * PaymentReturnCriteria2.mmInterbankSettlementAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPriorityIndicator
 * PaymentReturnCriteria2.mmPriorityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmProcessingValidityTimeIndicator
 * PaymentReturnCriteria2.mmProcessingValidityTimeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPurposeIndicator
 * PaymentReturnCriteria2.mmPurposeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructionCopyIndicator
 * PaymentReturnCriteria2.mmInstructionCopyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPaymentMessageTypeIndicator
 * PaymentReturnCriteria2.mmPaymentMessageTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPaymentTypeIndicator
 * PaymentReturnCriteria2.mmPaymentTypeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPaymentInstructionReferenceIndicator
 * PaymentReturnCriteria2.mmPaymentInstructionReferenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInterbankValueDateIndicator
 * PaymentReturnCriteria2.mmInterbankValueDateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmRelatedReferenceIndicator
 * PaymentReturnCriteria2.mmRelatedReferenceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmPaymentMethodIndicator
 * PaymentReturnCriteria2.mmPaymentMethodIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmDebtorIndicator
 * PaymentReturnCriteria2.mmDebtorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmFirstAgentIndicator
 * PaymentReturnCriteria2.mmFirstAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructingAgentCorrespondentIndicator
 * PaymentReturnCriteria2.mmInstructingAgentCorrespondentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmInstructedAgentCorrespondentIndicator
 * PaymentReturnCriteria2.mmInstructedAgentCorrespondentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmIntermediaryIndicator
 * PaymentReturnCriteria2.mmIntermediaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmFinalAgentIndicator
 * PaymentReturnCriteria2.mmFinalAgentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2#mmCreditorIndicator
 * PaymentReturnCriteria2.mmCreditorIndicator}</li>
 * </ul>
 * </li>
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
 * "PaymentReturnCriteria2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to report on the payment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnCriteria2", propOrder = {"transactionReferenceIndicator", "transferValueDateIndicator", "instructionIndicator", "instructionStatusReturnCriteria", "instructedAmountIndicator", "creditDebitIndicator",
		"interbankSettlementAmountIndicator", "priorityIndicator", "processingValidityTimeIndicator", "purposeIndicator", "instructionCopyIndicator", "paymentMessageTypeIndicator", "paymentTypeIndicator",
		"paymentInstructionReferenceIndicator", "interbankValueDateIndicator", "relatedReferenceIndicator", "paymentMethodIndicator", "debtorIndicator", "firstAgentIndicator", "instructingAgentCorrespondentIndicator",
		"instructedAgentCorrespondentIndicator", "intermediaryIndicator", "finalAgentIndicator", "creditorIndicator"})
public class PaymentReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxRefInd")
	protected RequestedIndicator transactionReferenceIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transaction reference is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmTransactionReferenceIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TxRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReferenceIndicator";
			definition = "Indicates whether the transaction reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getTransactionReferenceIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setTransactionReferenceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfValDtInd")
	protected RequestedIndicator transferValueDateIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfValDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferValueDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transfer value date is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmTransferValueDateIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TrfValDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateIndicator";
			definition = "Indicates whether the transfer value date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getTransferValueDateIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setTransferValueDateIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInstructionIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIndicator";
			definition = "Indicates whether the instruction is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructionIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setInstructionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrStsRtrCrit")
	protected InstructionStatusReturnCriteria instructionStatusReturnCriteria;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionStatusReturnCriteria
	 * InstructionStatusReturnCriteria}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrStsRtrCrit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionStatusReturnCriteria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction status is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<InstructionStatusReturnCriteria>> mmInstructionStatusReturnCriteria = new MMMessageAttribute<PaymentReturnCriteria2, Optional<InstructionStatusReturnCriteria>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrStsRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatusReturnCriteria";
			definition = "Indicates whether the instruction status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InstructionStatusReturnCriteria.mmObject();
		}

		@Override
		public Optional<InstructionStatusReturnCriteria> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructionStatusReturnCriteria();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<InstructionStatusReturnCriteria> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instructed amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInstructedAmountIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountIndicator";
			definition = "Indicates whether the instructed amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructedAmountIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
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
	 * "Indicates whether the Payment Instruction Reference is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmCreditDebitIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the Payment Instruction Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getCreditDebitIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interbank settlement amount is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInterbankSettlementAmountIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountIndicator";
			definition = "Indicates whether the interbank settlement amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInterbankSettlementAmountIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment priority is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPriorityIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates whether the payment priority is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPriorityIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgVldtyTmInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingValidityTimeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the processing validity time is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmProcessingValidityTimeIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTimeIndicator";
			definition = "Indicates whether the processing validity time is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getProcessingValidityTimeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PurpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurposeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the transfer reason is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPurposeIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PurpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeIndicator";
			definition = "Indicates whether the transfer reason is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPurposeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCpyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCopyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the instruction copy is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInstructionCopyIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrCpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopyIndicator";
			definition = "Indicates whether the instruction copy is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructionCopyIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setInstructionCopyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMsgTpInd")
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMsgTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMessageTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment message type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPaymentMessageTypeIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtMsgTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeIndicator";
			definition = "Indicates whether the payment message type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPaymentMessageTypeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the payment type is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPaymentTypeIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeIndicator";
			definition = "Indicates whether the payment type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPaymentTypeIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setPaymentTypeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInstrRefInd")
	protected RequestedIndicator paymentInstructionReferenceIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the Payment Instruction Reference is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPaymentInstructionReferenceIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReferenceIndicator";
			definition = "Indicates whether the Payment Instruction Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPaymentInstructionReferenceIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setPaymentInstructionReferenceIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrBkValDtInd")
	protected RequestedIndicator interbankValueDateIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkValDtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Interbank Value Date is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInterbankValueDateIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDateIndicator";
			definition = "Indicates whether the Interbank Value Date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInterbankValueDateIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setInterbankValueDateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdRefInd")
	protected RequestedIndicator relatedReferenceIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRefInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Related Reference is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmRelatedReferenceIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RltdRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceIndicator";
			definition = "Indicates whether the Related Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getRelatedReferenceIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setRelatedReferenceIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethodIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Payment Method is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmPaymentMethodIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtMtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethodIndicator";
			definition = "Indicates whether the Payment Method is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getPaymentMethodIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Debtor is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmDebtorIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DbtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIndicator";
			definition = "Indicates whether the Debtor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getDebtorIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setDebtorIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstAgtInd")
	protected RequestedIndicator firstAgentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the First Agent is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmFirstAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FrstAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgentIndicator";
			definition = "Indicates whether the First Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getFirstAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setFirstAgentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgAgtCrspdtInd")
	protected RequestedIndicator instructingAgentCorrespondentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgtCrspdtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgentCorrespondentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the correspondent of the Instructing Agent is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInstructingAgentCorrespondentIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstgAgtCrspdtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentCorrespondentIndicator";
			definition = "Indicates whether the correspondent of the Instructing Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructingAgentCorrespondentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setInstructingAgentCorrespondentIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdAgtCrspdtInd")
	protected RequestedIndicator instructedAgentCorrespondentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgtCrspdtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgentCorrespondentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the correspondent of the Instructed Agent is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmInstructedAgentCorrespondentIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstdAgtCrspdtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentCorrespondentIndicator";
			definition = "Indicates whether the correspondent of the Instructed Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getInstructedAgentCorrespondentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setInstructedAgentCorrespondentIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Intermediary is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmIntermediaryIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryIndicator";
			definition = "Indicates whether the Intermediary is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getIntermediaryIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setIntermediaryIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlAgtInd")
	protected RequestedIndicator finalAgentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlAgtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalAgentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Final Agent is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmFinalAgentIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FnlAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgentIndicator";
			definition = "Indicates whether the Final Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getFinalAgentIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setFinalAgentIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentReturnCriteria2
	 * PaymentReturnCriteria2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the Creditor is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>> mmCreditorIndicator = new MMMessageAttribute<PaymentReturnCriteria2, Optional<RequestedIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CdtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIndicator";
			definition = "Indicates whether the Creditor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}

		@Override
		public Optional<RequestedIndicator> getValue(PaymentReturnCriteria2 obj) {
			return obj.getCreditorIndicator();
		}

		@Override
		public void setValue(PaymentReturnCriteria2 obj, Optional<RequestedIndicator> value) {
			obj.setCreditorIndicator(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentReturnCriteria2.mmTransactionReferenceIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmTransferValueDateIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructionIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructionStatusReturnCriteria,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructedAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmCreditDebitIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInterbankSettlementAmountIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmPriorityIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmProcessingValidityTimeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmPurposeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructionCopyIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmPaymentMessageTypeIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmPaymentTypeIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmPaymentInstructionReferenceIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInterbankValueDateIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmRelatedReferenceIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmPaymentMethodIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmDebtorIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmFirstAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructingAgentCorrespondentIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmInstructedAgentCorrespondentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmIntermediaryIndicator,
						com.tools20022.repository.msg.PaymentReturnCriteria2.mmFinalAgentIndicator, com.tools20022.repository.msg.PaymentReturnCriteria2.mmCreditorIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentReturnCriteria2";
				definition = "Defines the criteria used to report on the payment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RequestedIndicator> getTransactionReferenceIndicator() {
		return transactionReferenceIndicator == null ? Optional.empty() : Optional.of(transactionReferenceIndicator);
	}

	public PaymentReturnCriteria2 setTransactionReferenceIndicator(RequestedIndicator transactionReferenceIndicator) {
		this.transactionReferenceIndicator = transactionReferenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getTransferValueDateIndicator() {
		return transferValueDateIndicator == null ? Optional.empty() : Optional.of(transferValueDateIndicator);
	}

	public PaymentReturnCriteria2 setTransferValueDateIndicator(RequestedIndicator transferValueDateIndicator) {
		this.transferValueDateIndicator = transferValueDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructionIndicator() {
		return instructionIndicator == null ? Optional.empty() : Optional.of(instructionIndicator);
	}

	public PaymentReturnCriteria2 setInstructionIndicator(RequestedIndicator instructionIndicator) {
		this.instructionIndicator = instructionIndicator;
		return this;
	}

	public Optional<InstructionStatusReturnCriteria> getInstructionStatusReturnCriteria() {
		return instructionStatusReturnCriteria == null ? Optional.empty() : Optional.of(instructionStatusReturnCriteria);
	}

	public PaymentReturnCriteria2 setInstructionStatusReturnCriteria(InstructionStatusReturnCriteria instructionStatusReturnCriteria) {
		this.instructionStatusReturnCriteria = instructionStatusReturnCriteria;
		return this;
	}

	public Optional<RequestedIndicator> getInstructedAmountIndicator() {
		return instructedAmountIndicator == null ? Optional.empty() : Optional.of(instructedAmountIndicator);
	}

	public PaymentReturnCriteria2 setInstructedAmountIndicator(RequestedIndicator instructedAmountIndicator) {
		this.instructedAmountIndicator = instructedAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditDebitIndicator() {
		return creditDebitIndicator == null ? Optional.empty() : Optional.of(creditDebitIndicator);
	}

	public PaymentReturnCriteria2 setCreditDebitIndicator(RequestedIndicator creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInterbankSettlementAmountIndicator() {
		return interbankSettlementAmountIndicator == null ? Optional.empty() : Optional.of(interbankSettlementAmountIndicator);
	}

	public PaymentReturnCriteria2 setInterbankSettlementAmountIndicator(RequestedIndicator interbankSettlementAmountIndicator) {
		this.interbankSettlementAmountIndicator = interbankSettlementAmountIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPriorityIndicator() {
		return priorityIndicator == null ? Optional.empty() : Optional.of(priorityIndicator);
	}

	public PaymentReturnCriteria2 setPriorityIndicator(RequestedIndicator priorityIndicator) {
		this.priorityIndicator = priorityIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getProcessingValidityTimeIndicator() {
		return processingValidityTimeIndicator == null ? Optional.empty() : Optional.of(processingValidityTimeIndicator);
	}

	public PaymentReturnCriteria2 setProcessingValidityTimeIndicator(RequestedIndicator processingValidityTimeIndicator) {
		this.processingValidityTimeIndicator = processingValidityTimeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPurposeIndicator() {
		return purposeIndicator == null ? Optional.empty() : Optional.of(purposeIndicator);
	}

	public PaymentReturnCriteria2 setPurposeIndicator(RequestedIndicator purposeIndicator) {
		this.purposeIndicator = purposeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructionCopyIndicator() {
		return instructionCopyIndicator == null ? Optional.empty() : Optional.of(instructionCopyIndicator);
	}

	public PaymentReturnCriteria2 setInstructionCopyIndicator(RequestedIndicator instructionCopyIndicator) {
		this.instructionCopyIndicator = instructionCopyIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentMessageTypeIndicator() {
		return paymentMessageTypeIndicator == null ? Optional.empty() : Optional.of(paymentMessageTypeIndicator);
	}

	public PaymentReturnCriteria2 setPaymentMessageTypeIndicator(RequestedIndicator paymentMessageTypeIndicator) {
		this.paymentMessageTypeIndicator = paymentMessageTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentTypeIndicator() {
		return paymentTypeIndicator == null ? Optional.empty() : Optional.of(paymentTypeIndicator);
	}

	public PaymentReturnCriteria2 setPaymentTypeIndicator(RequestedIndicator paymentTypeIndicator) {
		this.paymentTypeIndicator = paymentTypeIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentInstructionReferenceIndicator() {
		return paymentInstructionReferenceIndicator == null ? Optional.empty() : Optional.of(paymentInstructionReferenceIndicator);
	}

	public PaymentReturnCriteria2 setPaymentInstructionReferenceIndicator(RequestedIndicator paymentInstructionReferenceIndicator) {
		this.paymentInstructionReferenceIndicator = paymentInstructionReferenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInterbankValueDateIndicator() {
		return interbankValueDateIndicator == null ? Optional.empty() : Optional.of(interbankValueDateIndicator);
	}

	public PaymentReturnCriteria2 setInterbankValueDateIndicator(RequestedIndicator interbankValueDateIndicator) {
		this.interbankValueDateIndicator = interbankValueDateIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getRelatedReferenceIndicator() {
		return relatedReferenceIndicator == null ? Optional.empty() : Optional.of(relatedReferenceIndicator);
	}

	public PaymentReturnCriteria2 setRelatedReferenceIndicator(RequestedIndicator relatedReferenceIndicator) {
		this.relatedReferenceIndicator = relatedReferenceIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getPaymentMethodIndicator() {
		return paymentMethodIndicator == null ? Optional.empty() : Optional.of(paymentMethodIndicator);
	}

	public PaymentReturnCriteria2 setPaymentMethodIndicator(RequestedIndicator paymentMethodIndicator) {
		this.paymentMethodIndicator = paymentMethodIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getDebtorIndicator() {
		return debtorIndicator == null ? Optional.empty() : Optional.of(debtorIndicator);
	}

	public PaymentReturnCriteria2 setDebtorIndicator(RequestedIndicator debtorIndicator) {
		this.debtorIndicator = debtorIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getFirstAgentIndicator() {
		return firstAgentIndicator == null ? Optional.empty() : Optional.of(firstAgentIndicator);
	}

	public PaymentReturnCriteria2 setFirstAgentIndicator(RequestedIndicator firstAgentIndicator) {
		this.firstAgentIndicator = firstAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructingAgentCorrespondentIndicator() {
		return instructingAgentCorrespondentIndicator == null ? Optional.empty() : Optional.of(instructingAgentCorrespondentIndicator);
	}

	public PaymentReturnCriteria2 setInstructingAgentCorrespondentIndicator(RequestedIndicator instructingAgentCorrespondentIndicator) {
		this.instructingAgentCorrespondentIndicator = instructingAgentCorrespondentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getInstructedAgentCorrespondentIndicator() {
		return instructedAgentCorrespondentIndicator == null ? Optional.empty() : Optional.of(instructedAgentCorrespondentIndicator);
	}

	public PaymentReturnCriteria2 setInstructedAgentCorrespondentIndicator(RequestedIndicator instructedAgentCorrespondentIndicator) {
		this.instructedAgentCorrespondentIndicator = instructedAgentCorrespondentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getIntermediaryIndicator() {
		return intermediaryIndicator == null ? Optional.empty() : Optional.of(intermediaryIndicator);
	}

	public PaymentReturnCriteria2 setIntermediaryIndicator(RequestedIndicator intermediaryIndicator) {
		this.intermediaryIndicator = intermediaryIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getFinalAgentIndicator() {
		return finalAgentIndicator == null ? Optional.empty() : Optional.of(finalAgentIndicator);
	}

	public PaymentReturnCriteria2 setFinalAgentIndicator(RequestedIndicator finalAgentIndicator) {
		this.finalAgentIndicator = finalAgentIndicator;
		return this;
	}

	public Optional<RequestedIndicator> getCreditorIndicator() {
		return creditorIndicator == null ? Optional.empty() : Optional.of(creditorIndicator);
	}

	public PaymentReturnCriteria2 setCreditorIndicator(RequestedIndicator creditorIndicator) {
		this.creditorIndicator = creditorIndicator;
		return this;
	}
}