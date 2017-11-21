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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentReturnCriteria2", propOrder = {"transactionReferenceIndicator", "transferValueDateIndicator", "instructionIndicator", "instructionStatusReturnCriteria", "instructedAmountIndicator", "creditDebitIndicator",
		"interbankSettlementAmountIndicator", "priorityIndicator", "processingValidityTimeIndicator", "purposeIndicator", "instructionCopyIndicator", "paymentMessageTypeIndicator", "paymentTypeIndicator",
		"paymentInstructionReferenceIndicator", "interbankValueDateIndicator", "relatedReferenceIndicator", "paymentMethodIndicator", "debtorIndicator", "firstAgentIndicator", "instructingAgentCorrespondentIndicator",
		"instructedAgentCorrespondentIndicator", "intermediaryIndicator", "finalAgentIndicator", "creditorIndicator"})
public class PaymentReturnCriteria2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RequestedIndicator transactionReferenceIndicator;
	/**
	 * Indicates whether the transaction reference is requested.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionReferenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TxRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionReferenceIndicator";
			definition = "Indicates whether the transaction reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator transferValueDateIndicator;
	/**
	 * Indicates whether the transfer value date is requested.
	 * <p>
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
	public static final MMMessageAttribute mmTransferValueDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "TrfValDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferValueDateIndicator";
			definition = "Indicates whether the transfer value date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructionIndicator;
	/**
	 * Indicates whether the instruction is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIndicator";
			definition = "Indicates whether the instruction is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected InstructionStatusReturnCriteria instructionStatusReturnCriteria;
	/**
	 * Indicates whether the instruction status is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructionStatusReturnCriteria = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrStsRtrCrit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionStatusReturnCriteria";
			definition = "Indicates whether the instruction status is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.InstructionStatusReturnCriteria.mmObject();
		}
	};
	protected RequestedIndicator instructedAmountIndicator;
	/**
	 * Indicates whether the instructed amount is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructedAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstdAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountIndicator";
			definition = "Indicates whether the instructed amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditDebitIndicator;
	/**
	 * Indicates whether the Payment Instruction Reference is requested.
	 * <p>
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
	public static final MMMessageAttribute mmCreditDebitIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CdtDbtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Indicates whether the Payment Instruction Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator interbankSettlementAmountIndicator;
	/**
	 * Indicates whether the interbank settlement amount is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInterbankSettlementAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmountIndicator";
			definition = "Indicates whether the interbank settlement amount is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator priorityIndicator;
	/**
	 * Indicates whether the payment priority is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPriorityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIndicator";
			definition = "Indicates whether the payment priority is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator processingValidityTimeIndicator;
	/**
	 * Indicates whether the processing validity time is requested.
	 * <p>
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
	public static final MMMessageAttribute mmProcessingValidityTimeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PrcgVldtyTmInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingValidityTimeIndicator";
			definition = "Indicates whether the processing validity time is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator purposeIndicator;
	/**
	 * Indicates whether the transfer reason is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPurposeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PurpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurposeIndicator";
			definition = "Indicates whether the transfer reason is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructionCopyIndicator;
	/**
	 * Indicates whether the instruction copy is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructionCopyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstrCpyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCopyIndicator";
			definition = "Indicates whether the instruction copy is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentMessageTypeIndicator;
	/**
	 * Indicates whether the payment message type is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPaymentMessageTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtMsgTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMessageTypeIndicator";
			definition = "Indicates whether the payment message type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentTypeIndicator;
	/**
	 * Indicates whether the payment type is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPaymentTypeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeIndicator";
			definition = "Indicates whether the payment type is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentInstructionReferenceIndicator;
	/**
	 * Indicates whether the Payment Instruction Reference is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPaymentInstructionReferenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReferenceIndicator";
			definition = "Indicates whether the Payment Instruction Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator interbankValueDateIndicator;
	/**
	 * Indicates whether the Interbank Value Date is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInterbankValueDateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDateIndicator";
			definition = "Indicates whether the Interbank Value Date is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator relatedReferenceIndicator;
	/**
	 * Indicates whether the Related Reference is requested.
	 * <p>
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
	public static final MMMessageAttribute mmRelatedReferenceIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "RltdRefInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceIndicator";
			definition = "Indicates whether the Related Reference is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator paymentMethodIndicator;
	/**
	 * Indicates whether the Payment Method is requested.
	 * <p>
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
	public static final MMMessageAttribute mmPaymentMethodIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "PmtMtdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethodIndicator";
			definition = "Indicates whether the Payment Method is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator debtorIndicator;
	/**
	 * Indicates whether the Debtor is requested.
	 * <p>
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
	public static final MMMessageAttribute mmDebtorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "DbtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorIndicator";
			definition = "Indicates whether the Debtor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator firstAgentIndicator;
	/**
	 * Indicates whether the First Agent is requested.
	 * <p>
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
	public static final MMMessageAttribute mmFirstAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FrstAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgentIndicator";
			definition = "Indicates whether the First Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructingAgentCorrespondentIndicator;
	/**
	 * Indicates whether the correspondent of the Instructing Agent is
	 * requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructingAgentCorrespondentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstgAgtCrspdtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentCorrespondentIndicator";
			definition = "Indicates whether the correspondent of the Instructing Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator instructedAgentCorrespondentIndicator;
	/**
	 * Indicates whether the correspondent of the Instructed Agent is requested.
	 * <p>
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
	public static final MMMessageAttribute mmInstructedAgentCorrespondentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "InstdAgtCrspdtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentCorrespondentIndicator";
			definition = "Indicates whether the correspondent of the Instructed Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator intermediaryIndicator;
	/**
	 * Indicates whether the Intermediary is requested.
	 * <p>
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
	public static final MMMessageAttribute mmIntermediaryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryIndicator";
			definition = "Indicates whether the Intermediary is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator finalAgentIndicator;
	/**
	 * Indicates whether the Final Agent is requested.
	 * <p>
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
	public static final MMMessageAttribute mmFinalAgentIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "FnlAgtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalAgentIndicator";
			definition = "Indicates whether the Final Agent is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};
	protected RequestedIndicator creditorIndicator;
	/**
	 * Indicates whether the Creditor is requested.
	 * <p>
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
	public static final MMMessageAttribute mmCreditorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentReturnCriteria2.mmObject();
			isDerived = false;
			xmlTag = "CdtrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorIndicator";
			definition = "Indicates whether the Creditor is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RequestedIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentReturnCriteria2.mmTransactionReferenceIndicator, PaymentReturnCriteria2.mmTransferValueDateIndicator, PaymentReturnCriteria2.mmInstructionIndicator,
						PaymentReturnCriteria2.mmInstructionStatusReturnCriteria, PaymentReturnCriteria2.mmInstructedAmountIndicator, PaymentReturnCriteria2.mmCreditDebitIndicator,
						PaymentReturnCriteria2.mmInterbankSettlementAmountIndicator, PaymentReturnCriteria2.mmPriorityIndicator, PaymentReturnCriteria2.mmProcessingValidityTimeIndicator, PaymentReturnCriteria2.mmPurposeIndicator,
						PaymentReturnCriteria2.mmInstructionCopyIndicator, PaymentReturnCriteria2.mmPaymentMessageTypeIndicator, PaymentReturnCriteria2.mmPaymentTypeIndicator, PaymentReturnCriteria2.mmPaymentInstructionReferenceIndicator,
						PaymentReturnCriteria2.mmInterbankValueDateIndicator, PaymentReturnCriteria2.mmRelatedReferenceIndicator, PaymentReturnCriteria2.mmPaymentMethodIndicator, PaymentReturnCriteria2.mmDebtorIndicator,
						PaymentReturnCriteria2.mmFirstAgentIndicator, PaymentReturnCriteria2.mmInstructingAgentCorrespondentIndicator, PaymentReturnCriteria2.mmInstructedAgentCorrespondentIndicator,
						PaymentReturnCriteria2.mmIntermediaryIndicator, PaymentReturnCriteria2.mmFinalAgentIndicator, PaymentReturnCriteria2.mmCreditorIndicator);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentReturnCriteria2";
				definition = "Defines the criteria used to report on the payment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxRefInd")
	public RequestedIndicator getTransactionReferenceIndicator() {
		return transactionReferenceIndicator;
	}

	public void setTransactionReferenceIndicator(RequestedIndicator transactionReferenceIndicator) {
		this.transactionReferenceIndicator = transactionReferenceIndicator;
	}

	@XmlElement(name = "TrfValDtInd")
	public RequestedIndicator getTransferValueDateIndicator() {
		return transferValueDateIndicator;
	}

	public void setTransferValueDateIndicator(RequestedIndicator transferValueDateIndicator) {
		this.transferValueDateIndicator = transferValueDateIndicator;
	}

	@XmlElement(name = "InstrInd")
	public RequestedIndicator getInstructionIndicator() {
		return instructionIndicator;
	}

	public void setInstructionIndicator(RequestedIndicator instructionIndicator) {
		this.instructionIndicator = instructionIndicator;
	}

	@XmlElement(name = "InstrStsRtrCrit")
	public InstructionStatusReturnCriteria getInstructionStatusReturnCriteria() {
		return instructionStatusReturnCriteria;
	}

	public void setInstructionStatusReturnCriteria(com.tools20022.repository.msg.InstructionStatusReturnCriteria instructionStatusReturnCriteria) {
		this.instructionStatusReturnCriteria = instructionStatusReturnCriteria;
	}

	@XmlElement(name = "InstdAmtInd")
	public RequestedIndicator getInstructedAmountIndicator() {
		return instructedAmountIndicator;
	}

	public void setInstructedAmountIndicator(RequestedIndicator instructedAmountIndicator) {
		this.instructedAmountIndicator = instructedAmountIndicator;
	}

	@XmlElement(name = "CdtDbtInd")
	public RequestedIndicator getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(RequestedIndicator creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	@XmlElement(name = "IntrBkSttlmAmtInd")
	public RequestedIndicator getInterbankSettlementAmountIndicator() {
		return interbankSettlementAmountIndicator;
	}

	public void setInterbankSettlementAmountIndicator(RequestedIndicator interbankSettlementAmountIndicator) {
		this.interbankSettlementAmountIndicator = interbankSettlementAmountIndicator;
	}

	@XmlElement(name = "PrtyInd")
	public RequestedIndicator getPriorityIndicator() {
		return priorityIndicator;
	}

	public void setPriorityIndicator(RequestedIndicator priorityIndicator) {
		this.priorityIndicator = priorityIndicator;
	}

	@XmlElement(name = "PrcgVldtyTmInd")
	public RequestedIndicator getProcessingValidityTimeIndicator() {
		return processingValidityTimeIndicator;
	}

	public void setProcessingValidityTimeIndicator(RequestedIndicator processingValidityTimeIndicator) {
		this.processingValidityTimeIndicator = processingValidityTimeIndicator;
	}

	@XmlElement(name = "PurpInd")
	public RequestedIndicator getPurposeIndicator() {
		return purposeIndicator;
	}

	public void setPurposeIndicator(RequestedIndicator purposeIndicator) {
		this.purposeIndicator = purposeIndicator;
	}

	@XmlElement(name = "InstrCpyInd")
	public RequestedIndicator getInstructionCopyIndicator() {
		return instructionCopyIndicator;
	}

	public void setInstructionCopyIndicator(RequestedIndicator instructionCopyIndicator) {
		this.instructionCopyIndicator = instructionCopyIndicator;
	}

	@XmlElement(name = "PmtMsgTpInd")
	public RequestedIndicator getPaymentMessageTypeIndicator() {
		return paymentMessageTypeIndicator;
	}

	public void setPaymentMessageTypeIndicator(RequestedIndicator paymentMessageTypeIndicator) {
		this.paymentMessageTypeIndicator = paymentMessageTypeIndicator;
	}

	@XmlElement(name = "PmtTpInd")
	public RequestedIndicator getPaymentTypeIndicator() {
		return paymentTypeIndicator;
	}

	public void setPaymentTypeIndicator(RequestedIndicator paymentTypeIndicator) {
		this.paymentTypeIndicator = paymentTypeIndicator;
	}

	@XmlElement(name = "PmtInstrRefInd")
	public RequestedIndicator getPaymentInstructionReferenceIndicator() {
		return paymentInstructionReferenceIndicator;
	}

	public void setPaymentInstructionReferenceIndicator(RequestedIndicator paymentInstructionReferenceIndicator) {
		this.paymentInstructionReferenceIndicator = paymentInstructionReferenceIndicator;
	}

	@XmlElement(name = "IntrBkValDtInd")
	public RequestedIndicator getInterbankValueDateIndicator() {
		return interbankValueDateIndicator;
	}

	public void setInterbankValueDateIndicator(RequestedIndicator interbankValueDateIndicator) {
		this.interbankValueDateIndicator = interbankValueDateIndicator;
	}

	@XmlElement(name = "RltdRefInd")
	public RequestedIndicator getRelatedReferenceIndicator() {
		return relatedReferenceIndicator;
	}

	public void setRelatedReferenceIndicator(RequestedIndicator relatedReferenceIndicator) {
		this.relatedReferenceIndicator = relatedReferenceIndicator;
	}

	@XmlElement(name = "PmtMtdInd")
	public RequestedIndicator getPaymentMethodIndicator() {
		return paymentMethodIndicator;
	}

	public void setPaymentMethodIndicator(RequestedIndicator paymentMethodIndicator) {
		this.paymentMethodIndicator = paymentMethodIndicator;
	}

	@XmlElement(name = "DbtrInd")
	public RequestedIndicator getDebtorIndicator() {
		return debtorIndicator;
	}

	public void setDebtorIndicator(RequestedIndicator debtorIndicator) {
		this.debtorIndicator = debtorIndicator;
	}

	@XmlElement(name = "FrstAgtInd")
	public RequestedIndicator getFirstAgentIndicator() {
		return firstAgentIndicator;
	}

	public void setFirstAgentIndicator(RequestedIndicator firstAgentIndicator) {
		this.firstAgentIndicator = firstAgentIndicator;
	}

	@XmlElement(name = "InstgAgtCrspdtInd")
	public RequestedIndicator getInstructingAgentCorrespondentIndicator() {
		return instructingAgentCorrespondentIndicator;
	}

	public void setInstructingAgentCorrespondentIndicator(RequestedIndicator instructingAgentCorrespondentIndicator) {
		this.instructingAgentCorrespondentIndicator = instructingAgentCorrespondentIndicator;
	}

	@XmlElement(name = "InstdAgtCrspdtInd")
	public RequestedIndicator getInstructedAgentCorrespondentIndicator() {
		return instructedAgentCorrespondentIndicator;
	}

	public void setInstructedAgentCorrespondentIndicator(RequestedIndicator instructedAgentCorrespondentIndicator) {
		this.instructedAgentCorrespondentIndicator = instructedAgentCorrespondentIndicator;
	}

	@XmlElement(name = "IntrmyInd")
	public RequestedIndicator getIntermediaryIndicator() {
		return intermediaryIndicator;
	}

	public void setIntermediaryIndicator(RequestedIndicator intermediaryIndicator) {
		this.intermediaryIndicator = intermediaryIndicator;
	}

	@XmlElement(name = "FnlAgtInd")
	public RequestedIndicator getFinalAgentIndicator() {
		return finalAgentIndicator;
	}

	public void setFinalAgentIndicator(RequestedIndicator finalAgentIndicator) {
		this.finalAgentIndicator = finalAgentIndicator;
	}

	@XmlElement(name = "CdtrInd")
	public RequestedIndicator getCreditorIndicator() {
		return creditorIndicator;
	}

	public void setCreditorIndicator(RequestedIndicator creditorIndicator) {
		this.creditorIndicator = creditorIndicator;
	}
}