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
import com.tools20022.repository.choice.Purpose1Choice;
import com.tools20022.repository.codeset.ChargeBearerType2Code;
import com.tools20022.repository.datatype.*;
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
 * Set of elements providing information specific to the individual
 * transaction(s) included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPaymentIdentification
 * CreditTransferTransactionInformation9.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPaymentTypeInformation
 * CreditTransferTransactionInformation9.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInterbankSettlementAmount
 * CreditTransferTransactionInformation9.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmSettlementTimeIndication
 * CreditTransferTransactionInformation9.mmSettlementTimeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmSettlementTimeRequest
 * CreditTransferTransactionInformation9.mmSettlementTimeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmAcceptanceDateTime
 * CreditTransferTransactionInformation9.mmAcceptanceDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPoolingAdjustmentDate
 * CreditTransferTransactionInformation9.mmPoolingAdjustmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructedAmount
 * CreditTransferTransactionInformation9.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmExchangeRate
 * CreditTransferTransactionInformation9.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmChargeBearer
 * CreditTransferTransactionInformation9.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmChargesInformation
 * CreditTransferTransactionInformation9.mmChargesInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPreviousInstructingAgent
 * CreditTransferTransactionInformation9.mmPreviousInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPreviousInstructingAgentAccount
 * CreditTransferTransactionInformation9.mmPreviousInstructingAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructingAgent
 * CreditTransferTransactionInformation9.mmInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructedAgent
 * CreditTransferTransactionInformation9.mmInstructedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent1
 * CreditTransferTransactionInformation9.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent1Account
 * CreditTransferTransactionInformation9.mmIntermediaryAgent1Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent2
 * CreditTransferTransactionInformation9.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent2Account
 * CreditTransferTransactionInformation9.mmIntermediaryAgent2Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent3
 * CreditTransferTransactionInformation9.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmIntermediaryAgent3Account
 * CreditTransferTransactionInformation9.mmIntermediaryAgent3Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmUltimateDebtor
 * CreditTransferTransactionInformation9.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInitiatingParty
 * CreditTransferTransactionInformation9.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmDebtor
 * CreditTransferTransactionInformation9.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmDebtorAccount
 * CreditTransferTransactionInformation9.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmDebtorAgent
 * CreditTransferTransactionInformation9.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmDebtorAgentAccount
 * CreditTransferTransactionInformation9.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmCreditorAgent
 * CreditTransferTransactionInformation9.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmCreditorAgentAccount
 * CreditTransferTransactionInformation9.mmCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmCreditor
 * CreditTransferTransactionInformation9.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmCreditorAccount
 * CreditTransferTransactionInformation9.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmUltimateCreditor
 * CreditTransferTransactionInformation9.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructionForCreditorAgent
 * CreditTransferTransactionInformation9.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmInstructionForNextAgent
 * CreditTransferTransactionInformation9.mmInstructionForNextAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmPurpose
 * CreditTransferTransactionInformation9.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRegulatoryReporting
 * CreditTransferTransactionInformation9.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRelatedRemittanceInformation
 * CreditTransferTransactionInformation9.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9#mmRemittanceInformation
 * CreditTransferTransactionInformation9.mmRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
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
 * "CreditTransferTransactionInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements providing information specific to the individual transaction(s) included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreditTransferTransactionInformation9", propOrder = {"paymentIdentification", "paymentTypeInformation", "interbankSettlementAmount", "settlementTimeIndication", "settlementTimeRequest", "acceptanceDateTime",
		"poolingAdjustmentDate", "instructedAmount", "exchangeRate", "chargeBearer", "chargesInformation", "previousInstructingAgent", "previousInstructingAgentAccount", "instructingAgent", "instructedAgent", "intermediaryAgent1",
		"intermediaryAgent1Account", "intermediaryAgent2", "intermediaryAgent2Account", "intermediaryAgent3", "intermediaryAgent3Account", "ultimateDebtor", "initiatingParty", "debtor", "debtorAccount", "debtorAgent", "debtorAgentAccount",
		"creditorAgent", "creditorAgentAccount", "creditor", "creditorAccount", "ultimateCreditor", "instructionForCreditorAgent", "instructionForNextAgent", "purpose", "regulatoryReporting", "relatedRemittanceInformation",
		"remittanceInformation"})
public class CreditTransferTransactionInformation9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentIdentification2 paymentIdentification;
	/**
	 * Set of elements to reference a payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification2
	 * PaymentIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
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
	 * definition} = "Set of elements to reference a payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements to reference a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentIdentification2.mmObject();
		}
	};
	protected PaymentTypeInformation16 paymentTypeInformation;
	/**
	 * Set of elements used to further specify the type of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation16
	 * PaymentTypeInformation16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation16.mmObject();
		}
	};
	protected EuroMax9Amount interbankSettlementAmount;
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.EuroMax9Amount
	 * EuroMax9Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
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
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EuroMax9Amount.mmObject();
		}
	};
	protected SettlementDateTimeIndication1 settlementTimeIndication;
	/**
	 * Provides information on the occurred settlement time(s) of the payment
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementDateTimeIndication1
	 * SettlementDateTimeIndication1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTmIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the occurred settlement time(s) of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTimeIndication = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeIndication";
			definition = "Provides information on the occurred settlement time(s) of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDateTimeIndication1.mmObject();
		}
	};
	protected SettlementTimeRequest1 settlementTimeRequest;
	/**
	 * Provides information on the requested settlement time of the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTimeRequest1
	 * SettlementTimeRequest1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmSettlementTimeRequest
	 * Payment.mmSettlementTimeRequest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTmReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTimeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the requested settlement time of the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTimeRequest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmSettlementTimeRequest;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "SttlmTmReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTimeRequest";
			definition = "Provides information on the requested settlement time of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTimeRequest1.mmObject();
		}
	};
	protected ISODateTime acceptanceDateTime;
	/**
	 * Point in time when the payment order from the initiating party meets the
	 * processing conditions of the account servicing agent (debtor's agent in
	 * case of a credit transfer, creditor's agent in case of a direct debit).
	 * This means - amongst others - that the account servicing agent has
	 * received the payment order and has applied checks as eg, authorisation,
	 * availability of funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmAcceptanceDateTime
	 * PaymentExecution.mmAcceptanceDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptncDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent (debtor's agent in case of a credit transfer, creditor's agent in case of a direct debit). This means - amongst others - that the account servicing agent has received the payment order and has applied checks as eg, authorisation, availability of funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptanceDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmAcceptanceDateTime;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "AccptncDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceDateTime";
			definition = "Point in time when the payment order from the initiating party meets the processing conditions of the account servicing agent (debtor's agent in case of a credit transfer, creditor's agent in case of a direct debit). This means - amongst others - that the account servicing agent has received the payment order and has applied checks as eg, authorisation, availability of funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODate poolingAdjustmentDate;
	/**
	 * Date used for the correction of the value date of a cash pool movement
	 * that has been posted with a different value date.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
	 * Payment.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolgAdjstmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolingAdjustmentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmPoolingAdjustmentDate;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PoolgAdjstmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CurrencyAndAmount instructedAmount;
	/**
	 * Amount of money to be moved between the debtor and creditor, before
	 * deduction of charges, expressed in the currency as ordered by the
	 * initiating party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
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
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * The factor used for conversion of an amount from one currency to another.
	 * This reflects the price at which one currency was bought with another
	 * currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "The factor used for conversion of an amount from one currency to another. This reflects the price at which one currency was bought with another currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected ChargeBearerType2Code chargeBearer;
	/**
	 * Specifies which party/parties will bear the charges associated with the
	 * processing of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType2Code
	 * ChargeBearerType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerType2Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ChargesInformation4> chargesInformation;
	/**
	 * Provides information on the charges related to the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ChargesInformation4
	 * ChargesInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges Charges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the charges related to the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Charges.mmObject();
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "ChrgsInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesInformation";
			definition = "Provides information on the charges related to the payment transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ChargesInformation4.mmObject();
		}
	};
	protected FinancialInstitution2 previousInstructingAgent;
	/**
	 * Agent immediately prior to the instructing agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent immediately prior to the instructing agent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PrvsInstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent";
			definition = "Agent immediately prior to the instructing agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 previousInstructingAgentAccount;
	/**
	 * Unambiguous identification of the account of the previous instructing
	 * agent at its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstgAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the previous instructing agent at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousInstructingAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PrvsInstgAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccount";
			definition = "Unambiguous identification of the account of the previous instructing agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected FinancialInstitution2 instructingAgent;
	/**
	 * Agent that instructs the next party in the chain to carry out the (set
	 * of) instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected FinancialInstitution2 instructedAgent;
	/**
	 * Agent that is instructed by the previous party in the chain to carry out
	 * the (set of) instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstdAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgent";
			definition = "Agent that is instructed by the previous party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected FinancialInstitution2 intermediaryAgent1;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If more than one intermediary agent is present, then
	 * IntermediaryAgent1 identifies the agent between the debtor agent and the
	 * intermediary agent 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the debtor agent and the intermediary agent 2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent1Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 1 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Account";
			definition = "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected FinancialInstitution2 intermediaryAgent2;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If more than two intermediary agents are present, then
	 * IntermediaryAgent2 identifies the agent between the intermediary agent 1
	 * and the intermediary agent 3.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the intermediary agent 1 and the intermediary agent 3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent2Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 2 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2Account";
			definition = "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected FinancialInstitution2 intermediaryAgent3;
	/**
	 * Agent between the debtor agent and creditor agent.
	 * 
	 * Usage: If IntermediaryAgent3 is present, then it identifies the agent
	 * between the intermediary agent 2 and the creditor agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor agent and creditor agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the intermediary agent 2 and the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 intermediaryAgent3Account;
	/**
	 * Unambiguous identification of the account of the intermediary agent 3 at
	 * its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Account";
			definition = "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected PartyIdentification31 ultimateDebtor;
	/**
	 * Ultimate party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification31
	 * PartyIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification31.mmObject();
		}
	};
	protected PartyIdentification20 initiatingParty;
	/**
	 * Party that initiates the payment. In the payment context, this can either
	 * be the debtor (in a credit transfer), the creditor (in a direct debit),
	 * or a party that initiates the payment on behalf of the debtor or
	 * creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification20
	 * PartyIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initiates the payment. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiates the payment. In the payment context, this can either be the debtor (in a credit transfer), the creditor (in a direct debit), or a party that initiates the payment on behalf of the debtor or creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification20.mmObject();
		}
	};
	protected PartyIdentification20 debtor;
	/**
	 * Party that owes an amount of money to the (ultimate) creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification20
	 * PartyIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification20.mmObject();
		}
	};
	protected CashAccount8 debtorAccount;
	/**
	 * Unambiguous identification of the account of the debtor to which a debit
	 * entry will be made as a result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount8
	 * CashAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount8.mmObject();
		}
	};
	protected FinancialInstitution2 debtorAgent;
	/**
	 * Financial institution servicing an account for the debtor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 debtorAgentAccount;
	/**
	 * Unambiguous identification of the account of the debtor agent at its
	 * servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected FinancialInstitution2 creditorAgent;
	/**
	 * Financial institution servicing an account for the creditor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstitution2.mmObject();
		}
	};
	protected CashAccount7 creditorAgentAccount;
	/**
	 * Unambiguous identification of the account of the creditor agent at its
	 * servicing agent to which a credit entry will be made as a result of the
	 * payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected PartyIdentification20 creditor;
	/**
	 * Party to which an amount of money is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification20
	 * PartyIdentification20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification20.mmObject();
		}
	};
	protected CashAccount8 creditorAccount;
	/**
	 * Unambiguous identification of the account of the creditor to which a
	 * credit entry will be posted as a result of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount8
	 * CashAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount8.mmObject();
		}
	};
	protected PartyIdentification31 ultimateCreditor;
	/**
	 * Ultimate party to which an amount of money is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification31
	 * PartyIdentification31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification31.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent;
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the creditor agent.
	 * 
	 * Usage: The instruction can relate to a level of service, can be an
	 * instruction to be executed by the creditor's agent, or can be information
	 * required by the creditor's agent to process the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \n\nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionForCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the creditor agent. \n\nUsage: The instruction can relate to a level of service, can be an instruction to be executed by the creditor's agent, or can be information required by the creditor's agent to process the instruction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionForCreditorAgent1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InstructionForNextAgent1> instructionForNextAgent;
	/**
	 * Further information related to the processing of the payment instruction
	 * that may need to be acted upon by the next agent.
	 * 
	 * Usage: The next agent may not be the creditor agent. The instruction can
	 * relate to a level of service, can be an instruction that has to be
	 * executed by the agent, or can be information required by the next agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForNextAgent1
	 * InstructionForNextAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
	 * PaymentInstruction.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForNxtAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForNextAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \n\nUsage: The next agent may not be the creditor agent.\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionForNextAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstrForNxtAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForNextAgent";
			definition = "Further information related to the processing of the payment instruction that may need to be acted upon by the next agent. \n\nUsage: The next agent may not be the creditor agent.\nThe instruction can relate to a level of service, can be an instruction that has to be executed by the agent, or can be information required by the next agent.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionForNextAgent1.mmObject();
		}
	};
	protected Purpose1Choice purpose;
	/**
	 * Underlying reason for the payment transaction.
	 * 
	 * Usage: Purpose is used by the end-customers, i.e. initiating party,
	 * (ultimate) debtor, (ultimate) creditor to provide information concerning
	 * the nature of the payment. Purpose is a content element, which is not
	 * used for processing by any of the agents involved in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose1Choice
	 * Purpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\n\nUsage: Purpose is used by the end-customers, i.e. initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\n\nUsage: Purpose is used by the end-customers, i.e. initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RegulatoryReporting2> regulatoryReporting;
	/**
	 * Information needed due to regulatory and statutory requirements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryReporting2
	 * RegulatoryReporting2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
	 * FinancialTransaction.mmRegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed due to regulatory and statutory requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulatoryReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> FinancialTransaction.mmRegulatoryReport;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information needed due to regulatory and statutory requirements.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RemittanceLocation1> relatedRemittanceInformation;
	/**
	 * Information related to the handling of the remittance information by any
	 * of the agents in the transaction processing chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
	 * PaymentObligation.mmRemittanceLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmRemittanceLocation;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceLocation1.mmObject();
		}
	};
	protected RemittanceInformation4 remittanceInformation;
	/**
	 * Information supplied to enable the matching of an entry with the items
	 * that the transfer is intended to settle, such as commercial invoices in
	 * an accounts' receivable system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation4
	 * RemittanceInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation9
	 * CreditTransferTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> CreditTransferTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceInformation4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CreditTransferTransactionInformation9.mmPaymentIdentification, CreditTransferTransactionInformation9.mmPaymentTypeInformation,
						CreditTransferTransactionInformation9.mmInterbankSettlementAmount, CreditTransferTransactionInformation9.mmSettlementTimeIndication, CreditTransferTransactionInformation9.mmSettlementTimeRequest,
						CreditTransferTransactionInformation9.mmAcceptanceDateTime, CreditTransferTransactionInformation9.mmPoolingAdjustmentDate, CreditTransferTransactionInformation9.mmInstructedAmount,
						CreditTransferTransactionInformation9.mmExchangeRate, CreditTransferTransactionInformation9.mmChargeBearer, CreditTransferTransactionInformation9.mmChargesInformation,
						CreditTransferTransactionInformation9.mmPreviousInstructingAgent, CreditTransferTransactionInformation9.mmPreviousInstructingAgentAccount, CreditTransferTransactionInformation9.mmInstructingAgent,
						CreditTransferTransactionInformation9.mmInstructedAgent, CreditTransferTransactionInformation9.mmIntermediaryAgent1, CreditTransferTransactionInformation9.mmIntermediaryAgent1Account,
						CreditTransferTransactionInformation9.mmIntermediaryAgent2, CreditTransferTransactionInformation9.mmIntermediaryAgent2Account, CreditTransferTransactionInformation9.mmIntermediaryAgent3,
						CreditTransferTransactionInformation9.mmIntermediaryAgent3Account, CreditTransferTransactionInformation9.mmUltimateDebtor, CreditTransferTransactionInformation9.mmInitiatingParty,
						CreditTransferTransactionInformation9.mmDebtor, CreditTransferTransactionInformation9.mmDebtorAccount, CreditTransferTransactionInformation9.mmDebtorAgent, CreditTransferTransactionInformation9.mmDebtorAgentAccount,
						CreditTransferTransactionInformation9.mmCreditorAgent, CreditTransferTransactionInformation9.mmCreditorAgentAccount, CreditTransferTransactionInformation9.mmCreditor,
						CreditTransferTransactionInformation9.mmCreditorAccount, CreditTransferTransactionInformation9.mmUltimateCreditor, CreditTransferTransactionInformation9.mmInstructionForCreditorAgent,
						CreditTransferTransactionInformation9.mmInstructionForNextAgent, CreditTransferTransactionInformation9.mmPurpose, CreditTransferTransactionInformation9.mmRegulatoryReporting,
						CreditTransferTransactionInformation9.mmRelatedRemittanceInformation, CreditTransferTransactionInformation9.mmRemittanceInformation);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CreditTransferTransactionInformation9";
				definition = "Set of elements providing information specific to the individual transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtId", required = true)
	public PaymentIdentification2 getPaymentIdentification() {
		return paymentIdentification;
	}

	public void setPaymentIdentification(com.tools20022.repository.msg.PaymentIdentification2 paymentIdentification) {
		this.paymentIdentification = paymentIdentification;
	}

	@XmlElement(name = "PmtTpInf")
	public PaymentTypeInformation16 getPaymentTypeInformation() {
		return paymentTypeInformation;
	}

	public void setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation16 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
	}

	@XmlElement(name = "IntrBkSttlmAmt", required = true)
	public EuroMax9Amount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(EuroMax9Amount interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	@XmlElement(name = "SttlmTmIndctn")
	public SettlementDateTimeIndication1 getSettlementTimeIndication() {
		return settlementTimeIndication;
	}

	public void setSettlementTimeIndication(com.tools20022.repository.msg.SettlementDateTimeIndication1 settlementTimeIndication) {
		this.settlementTimeIndication = settlementTimeIndication;
	}

	@XmlElement(name = "SttlmTmReq")
	public SettlementTimeRequest1 getSettlementTimeRequest() {
		return settlementTimeRequest;
	}

	public void setSettlementTimeRequest(com.tools20022.repository.msg.SettlementTimeRequest1 settlementTimeRequest) {
		this.settlementTimeRequest = settlementTimeRequest;
	}

	@XmlElement(name = "AccptncDtTm")
	public ISODateTime getAcceptanceDateTime() {
		return acceptanceDateTime;
	}

	public void setAcceptanceDateTime(ISODateTime acceptanceDateTime) {
		this.acceptanceDateTime = acceptanceDateTime;
	}

	@XmlElement(name = "PoolgAdjstmntDt")
	public ISODate getPoolingAdjustmentDate() {
		return poolingAdjustmentDate;
	}

	public void setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = poolingAdjustmentDate;
	}

	@XmlElement(name = "InstdAmt")
	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	@XmlElement(name = "XchgRate")
	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@XmlElement(name = "ChrgBr", required = true)
	public ChargeBearerType2Code getChargeBearer() {
		return chargeBearer;
	}

	public void setChargeBearer(ChargeBearerType2Code chargeBearer) {
		this.chargeBearer = chargeBearer;
	}

	@XmlElement(name = "ChrgsInf")
	public List<ChargesInformation4> getChargesInformation() {
		return chargesInformation;
	}

	public void setChargesInformation(List<com.tools20022.repository.msg.ChargesInformation4> chargesInformation) {
		this.chargesInformation = chargesInformation;
	}

	@XmlElement(name = "PrvsInstgAgt")
	public FinancialInstitution2 getPreviousInstructingAgent() {
		return previousInstructingAgent;
	}

	public void setPreviousInstructingAgent(com.tools20022.repository.msg.FinancialInstitution2 previousInstructingAgent) {
		this.previousInstructingAgent = previousInstructingAgent;
	}

	@XmlElement(name = "PrvsInstgAgtAcct")
	public CashAccount7 getPreviousInstructingAgentAccount() {
		return previousInstructingAgentAccount;
	}

	public void setPreviousInstructingAgentAccount(com.tools20022.repository.msg.CashAccount7 previousInstructingAgentAccount) {
		this.previousInstructingAgentAccount = previousInstructingAgentAccount;
	}

	@XmlElement(name = "InstgAgt")
	public FinancialInstitution2 getInstructingAgent() {
		return instructingAgent;
	}

	public void setInstructingAgent(com.tools20022.repository.msg.FinancialInstitution2 instructingAgent) {
		this.instructingAgent = instructingAgent;
	}

	@XmlElement(name = "InstdAgt")
	public FinancialInstitution2 getInstructedAgent() {
		return instructedAgent;
	}

	public void setInstructedAgent(com.tools20022.repository.msg.FinancialInstitution2 instructedAgent) {
		this.instructedAgent = instructedAgent;
	}

	@XmlElement(name = "IntrmyAgt1")
	public FinancialInstitution2 getIntermediaryAgent1() {
		return intermediaryAgent1;
	}

	public void setIntermediaryAgent1(com.tools20022.repository.msg.FinancialInstitution2 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
	}

	@XmlElement(name = "IntrmyAgt1Acct")
	public CashAccount7 getIntermediaryAgent1Account() {
		return intermediaryAgent1Account;
	}

	public void setIntermediaryAgent1Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent1Account) {
		this.intermediaryAgent1Account = intermediaryAgent1Account;
	}

	@XmlElement(name = "IntrmyAgt2")
	public FinancialInstitution2 getIntermediaryAgent2() {
		return intermediaryAgent2;
	}

	public void setIntermediaryAgent2(com.tools20022.repository.msg.FinancialInstitution2 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
	}

	@XmlElement(name = "IntrmyAgt2Acct")
	public CashAccount7 getIntermediaryAgent2Account() {
		return intermediaryAgent2Account;
	}

	public void setIntermediaryAgent2Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent2Account) {
		this.intermediaryAgent2Account = intermediaryAgent2Account;
	}

	@XmlElement(name = "IntrmyAgt3")
	public FinancialInstitution2 getIntermediaryAgent3() {
		return intermediaryAgent3;
	}

	public void setIntermediaryAgent3(com.tools20022.repository.msg.FinancialInstitution2 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
	}

	@XmlElement(name = "IntrmyAgt3Acct")
	public CashAccount7 getIntermediaryAgent3Account() {
		return intermediaryAgent3Account;
	}

	public void setIntermediaryAgent3Account(com.tools20022.repository.msg.CashAccount7 intermediaryAgent3Account) {
		this.intermediaryAgent3Account = intermediaryAgent3Account;
	}

	@XmlElement(name = "UltmtDbtr")
	public PartyIdentification31 getUltimateDebtor() {
		return ultimateDebtor;
	}

	public void setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification31 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
	}

	@XmlElement(name = "InitgPty")
	public PartyIdentification20 getInitiatingParty() {
		return initiatingParty;
	}

	public void setInitiatingParty(com.tools20022.repository.msg.PartyIdentification20 initiatingParty) {
		this.initiatingParty = initiatingParty;
	}

	@XmlElement(name = "Dbtr", required = true)
	public PartyIdentification20 getDebtor() {
		return debtor;
	}

	public void setDebtor(com.tools20022.repository.msg.PartyIdentification20 debtor) {
		this.debtor = debtor;
	}

	@XmlElement(name = "DbtrAcct", required = true)
	public CashAccount8 getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(com.tools20022.repository.msg.CashAccount8 debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	@XmlElement(name = "DbtrAgt", required = true)
	public FinancialInstitution2 getDebtorAgent() {
		return debtorAgent;
	}

	public void setDebtorAgent(com.tools20022.repository.msg.FinancialInstitution2 debtorAgent) {
		this.debtorAgent = debtorAgent;
	}

	@XmlElement(name = "DbtrAgtAcct")
	public CashAccount7 getDebtorAgentAccount() {
		return debtorAgentAccount;
	}

	public void setDebtorAgentAccount(com.tools20022.repository.msg.CashAccount7 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
	}

	@XmlElement(name = "CdtrAgt", required = true)
	public FinancialInstitution2 getCreditorAgent() {
		return creditorAgent;
	}

	public void setCreditorAgent(com.tools20022.repository.msg.FinancialInstitution2 creditorAgent) {
		this.creditorAgent = creditorAgent;
	}

	@XmlElement(name = "CdtrAgtAcct")
	public CashAccount7 getCreditorAgentAccount() {
		return creditorAgentAccount;
	}

	public void setCreditorAgentAccount(com.tools20022.repository.msg.CashAccount7 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
	}

	@XmlElement(name = "Cdtr", required = true)
	public PartyIdentification20 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.PartyIdentification20 creditor) {
		this.creditor = creditor;
	}

	@XmlElement(name = "CdtrAcct", required = true)
	public CashAccount8 getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(com.tools20022.repository.msg.CashAccount8 creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	@XmlElement(name = "UltmtCdtr")
	public PartyIdentification31 getUltimateCreditor() {
		return ultimateCreditor;
	}

	public void setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification31 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
	}

	@XmlElement(name = "InstrForCdtrAgt")
	public List<InstructionForCreditorAgent1> getInstructionForCreditorAgent() {
		return instructionForCreditorAgent;
	}

	public void setInstructionForCreditorAgent(List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent) {
		this.instructionForCreditorAgent = instructionForCreditorAgent;
	}

	@XmlElement(name = "InstrForNxtAgt")
	public List<InstructionForNextAgent1> getInstructionForNextAgent() {
		return instructionForNextAgent;
	}

	public void setInstructionForNextAgent(List<com.tools20022.repository.msg.InstructionForNextAgent1> instructionForNextAgent) {
		this.instructionForNextAgent = instructionForNextAgent;
	}

	@XmlElement(name = "Purp")
	public Purpose1Choice getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose1Choice purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "RgltryRptg")
	public List<RegulatoryReporting2> getRegulatoryReporting() {
		return regulatoryReporting;
	}

	public void setRegulatoryReporting(List<com.tools20022.repository.msg.RegulatoryReporting2> regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
	}

	@XmlElement(name = "RltdRmtInf")
	public List<RemittanceLocation1> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation;
	}

	public void setRelatedRemittanceInformation(List<com.tools20022.repository.msg.RemittanceLocation1> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = relatedRemittanceInformation;
	}

	@XmlElement(name = "RmtInf")
	public RemittanceInformation4 getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation4 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}
}