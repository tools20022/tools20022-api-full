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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.ReconciliationTransaction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Transfer information for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransactionIdentification
 * ATMTransaction24.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmReconciliationIdentification
 * ATMTransaction24.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmCreditorLabel
 * ATMTransaction24.mmCreditorLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmDebtorLabel
 * ATMTransaction24.mmDebtorLabel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransferIdentifier
 * ATMTransaction24.mmTransferIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmPaymentReference
 * ATMTransaction24.mmPaymentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransactionResponse
 * ATMTransaction24.mmTransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAction
 * ATMTransaction24.mmAction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAccountFrom
 * ATMTransaction24.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmProtectedAccountFrom
 * ATMTransaction24.mmProtectedAccountFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAccountTo
 * ATMTransaction24.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmProtectedAccountTo
 * ATMTransaction24.mmProtectedAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTotalAuthorisedAmount
 * ATMTransaction24.mmTotalAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTotalRequestedAmount
 * ATMTransaction24.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmDetailedRequestedAmount
 * ATMTransaction24.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAdditionalCharge
 * ATMTransaction24.mmAdditionalCharge}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmLimits
 * ATMTransaction24.mmLimits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmRequestedExecutionDate
 * ATMTransaction24.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmProposedExecutionDate
 * ATMTransaction24.mmProposedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmInstantTransferProgram
 * ATMTransaction24.mmInstantTransferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmRecurringTransfer
 * ATMTransaction24.mmRecurringTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAuthorisationResult
 * ATMTransaction24.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmICCRelatedData
 * ATMTransaction24.mmICCRelatedData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24#mmCommand
 * ATMTransaction24.mmCommand}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransaction24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transfer information for the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23 ATMTransaction23}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction24", propOrder = {"transactionIdentification", "reconciliationIdentification", "creditorLabel", "debtorLabel", "transferIdentifier", "paymentReference", "transactionResponse", "action", "accountFrom",
		"protectedAccountFrom", "accountTo", "protectedAccountTo", "totalAuthorisedAmount", "totalRequestedAmount", "detailedRequestedAmount", "additionalCharge", "limits", "requestedExecutionDate", "proposedExecutionDate",
		"instantTransferProgram", "recurringTransfer", "authorisationResult", "iCCRelatedData", "command"})
public class ATMTransaction24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
	 * ATMTransaction23.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction24, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			previousVersion_lazy = () -> ATMTransaction23.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction24 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction24 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "RcncltnId")
	protected Max35Text reconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
	 * ATMTransaction23.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			previousVersion_lazy = () -> ATMTransaction23.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction24 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max35Text> value) {
			obj.setReconciliationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrLabl")
	protected Max35Text creditorLabel;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrLabl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the transfer for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmCreditorLabel
	 * ATMTransaction23.mmCreditorLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max35Text>> mmCreditorLabel = new MMMessageAttribute<ATMTransaction24, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "CdtrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorLabel";
			definition = "Description of the transfer for the creditor.";
			previousVersion_lazy = () -> ATMTransaction23.mmCreditorLabel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction24 obj) {
			return obj.getCreditorLabel();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max35Text> value) {
			obj.setCreditorLabel(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrLabl")
	protected Max35Text debtorLabel;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrLabl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the transfer for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDebtorLabel
	 * ATMTransaction23.mmDebtorLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max35Text>> mmDebtorLabel = new MMMessageAttribute<ATMTransaction24, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "DbtrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorLabel";
			definition = "Description of the transfer for the debtor.";
			previousVersion_lazy = () -> ATMTransaction23.mmDebtorLabel;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction24 obj) {
			return obj.getDebtorLabel();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max35Text> value) {
			obj.setDebtorLabel(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfIdr")
	protected Max70Text transferIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the approved transfer transaction for the bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max70Text>> mmTransferIdentifier = new MMMessageAttribute<ATMTransaction24, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TrfIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentifier";
			definition = "Identifier of the approved transfer transaction for the bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(ATMTransaction24 obj) {
			return obj.getTransferIdentifier();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max70Text> value) {
			obj.setTransferIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtRef")
	protected Max35Text paymentReference;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmPaymentReference
	 * ATMTransaction23.mmPaymentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max35Text>> mmPaymentReference = new MMMessageAttribute<ATMTransaction24, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Reference of the payment.";
			previousVersion_lazy = () -> ATMTransaction23.mmPaymentReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction24 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max35Text> value) {
			obj.setPaymentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected ResponseType7 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType7
	 * ResponseType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the fund transfer request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, ResponseType7> mmTransactionResponse = new MMMessageAssociationEnd<ATMTransaction24, ResponseType7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the fund transfer request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType7.mmObject();
		}

		@Override
		public ResponseType7 getValue(ATMTransaction24 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(ATMTransaction24 obj, ResponseType7 value) {
			obj.setTransactionResponse(value);
		}
	};
	@XmlElement(name = "Actn")
	protected List<Action7> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action7 Action7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of actions to be performed by the ATM to complete the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, List<Action7>> mmAction = new MMMessageAssociationEnd<ATMTransaction24, List<Action7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Action7.mmObject();
		}

		@Override
		public List<Action7> getValue(ATMTransaction24 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(ATMTransaction24 obj, List<Action7> value) {
			obj.setAction(value);
		}
	};
	@XmlElement(name = "AcctFr")
	protected CardAccount13 accountFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount13
	 * CardAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the source account of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountFrom
	 * ATMTransaction23.mmAccountFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<CardAccount13>> mmAccountFrom = new MMMessageAssociationEnd<ATMTransaction24, Optional<CardAccount13>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFrom";
			definition = "Information about the source account of the transfer.";
			previousVersion_lazy = () -> ATMTransaction23.mmAccountFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount13.mmObject();
		}

		@Override
		public Optional<CardAccount13> getValue(ATMTransaction24 obj) {
			return obj.getAccountFrom();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<CardAccount13> value) {
			obj.setAccountFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdAcctFr")
	protected ContentInformationType10 protectedAccountFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAcctFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the source account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountFrom
	 * ATMTransaction23.mmProtectedAccountFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<ContentInformationType10>> mmProtectedAccountFrom = new MMMessageAssociationEnd<ATMTransaction24, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountFrom";
			definition = "Encryption of the source account information.";
			previousVersion_lazy = () -> ATMTransaction23.mmProtectedAccountFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction24 obj) {
			return obj.getProtectedAccountFrom();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTo")
	protected List<CardAccount13> accountTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount13
	 * CardAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the destination account of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountTo
	 * ATMTransaction23.mmAccountTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, List<CardAccount13>> mmAccountTo = new MMMessageAssociationEnd<ATMTransaction24, List<CardAccount13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTo";
			definition = "Information about the destination account of the transfer.";
			previousVersion_lazy = () -> ATMTransaction23.mmAccountTo;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount13.mmObject();
		}

		@Override
		public List<CardAccount13> getValue(ATMTransaction24 obj) {
			return obj.getAccountTo();
		}

		@Override
		public void setValue(ATMTransaction24 obj, List<CardAccount13> value) {
			obj.setAccountTo(value);
		}
	};
	@XmlElement(name = "PrtctdAcctTo")
	protected ContentInformationType10 protectedAccountTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAcctTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the destination account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountTo
	 * ATMTransaction23.mmProtectedAccountTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<ContentInformationType10>> mmProtectedAccountTo = new MMMessageAssociationEnd<ATMTransaction24, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountTo";
			definition = "Encryption of the destination account information.";
			previousVersion_lazy = () -> ATMTransaction23.mmProtectedAccountTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction24 obj) {
			return obj.getProtectedAccountTo();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountTo(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAuthrsdAmt", required = true)
	protected AmountAndCurrency1 totalAuthorisedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndCurrency1
	 * AmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAuthrsdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total authorised amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, AmountAndCurrency1> mmTotalAuthorisedAmount = new MMMessageAssociationEnd<ATMTransaction24, AmountAndCurrency1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndCurrency1.mmObject();
		}

		@Override
		public AmountAndCurrency1 getValue(ATMTransaction24 obj) {
			return obj.getTotalAuthorisedAmount();
		}

		@Override
		public void setValue(ATMTransaction24 obj, AmountAndCurrency1 value) {
			obj.setTotalAuthorisedAmount(value);
		}
	};
	@XmlElement(name = "TtlReqdAmt")
	protected ImpliedCurrencyAndAmount totalRequestedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlReqdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total requested amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTotalRequestedAmount
	 * ATMTransaction23.mmTotalRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<ImpliedCurrencyAndAmount>> mmTotalRequestedAmount = new MMMessageAttribute<ATMTransaction24, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Total requested amount.";
			previousVersion_lazy = () -> ATMTransaction23.mmTotalRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransaction24 obj) {
			return obj.getTotalRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setTotalRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "DtldReqdAmt")
	protected DetailedAmount17 detailedRequestedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount17
	 * DetailedAmount17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtldReqdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer transaction amounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDetailedRequestedAmount
	 * ATMTransaction23.mmDetailedRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<DetailedAmount17>> mmDetailedRequestedAmount = new MMMessageAssociationEnd<ATMTransaction24, Optional<DetailedAmount17>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Details of the transfer transaction amounts.";
			previousVersion_lazy = () -> ATMTransaction23.mmDetailedRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount17.mmObject();
		}

		@Override
		public Optional<DetailedAmount17> getValue(ATMTransaction24 obj) {
			return obj.getDetailedRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<DetailedAmount17> value) {
			obj.setDetailedRequestedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlChrg")
	protected List<DetailedAmount18> additionalCharge;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount18
	 * DetailedAmount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlChrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional charge (for instance tax or fee)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, List<DetailedAmount18>> mmAdditionalCharge = new MMMessageAssociationEnd<ATMTransaction24, List<DetailedAmount18>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount18.mmObject();
		}

		@Override
		public List<DetailedAmount18> getValue(ATMTransaction24 obj) {
			return obj.getAdditionalCharge();
		}

		@Override
		public void setValue(ATMTransaction24 obj, List<DetailedAmount18> value) {
			obj.setAdditionalCharge(value);
		}
	};
	@XmlElement(name = "Lmts")
	protected ATMTransactionAmounts6 limits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTransactionAmounts6
	 * ATMTransactionAmounts6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit of amounts for the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<ATMTransactionAmounts6>> mmLimits = new MMMessageAssociationEnd<ATMTransaction24, Optional<ATMTransactionAmounts6>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limit of amounts for the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMTransactionAmounts6.mmObject();
		}

		@Override
		public Optional<ATMTransactionAmounts6> getValue(ATMTransaction24 obj) {
			return obj.getLimits();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ATMTransactionAmounts6> value) {
			obj.setLimits(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdExctnDt")
	protected ISODate requestedExecutionDate;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested date of the execution of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRequestedExecutionDate
	 * ATMTransaction23.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<ISODate>> mmRequestedExecutionDate = new MMMessageAttribute<ATMTransaction24, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Requested date of the execution of the transfer.";
			previousVersion_lazy = () -> ATMTransaction23.mmRequestedExecutionDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ATMTransaction24 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ISODate> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PropsdExctnDt")
	protected ISODate proposedExecutionDate;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdExctnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposed date of the execution of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<ISODate>> mmProposedExecutionDate = new MMMessageAttribute<ATMTransaction24, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PropsdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedExecutionDate";
			definition = "Proposed date of the execution of the transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ATMTransaction24 obj) {
			return obj.getProposedExecutionDate();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<ISODate> value) {
			obj.setProposedExecutionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "InstntTrfPrgm")
	protected Max35Text instantTransferProgram;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstntTrfPrgm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstantTransferProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the instant transfer program."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmInstantTransferProgram
	 * ATMTransaction23.mmInstantTransferProgram}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max35Text>> mmInstantTransferProgram = new MMMessageAttribute<ATMTransaction24, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "InstntTrfPrgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstantTransferProgram";
			definition = "Identifies the instant transfer program.";
			previousVersion_lazy = () -> ATMTransaction23.mmInstantTransferProgram;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction24 obj) {
			return obj.getInstantTransferProgram();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max35Text> value) {
			obj.setInstantTransferProgram(value.orElse(null));
		}
	};
	@XmlElement(name = "RcrngTrf")
	protected RecurringTransaction3 recurringTransfer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecurringTransaction3
	 * RecurringTransaction3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrngTrf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information for reccurring transfer or standing orders."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRecurringTransfer
	 * ATMTransaction23.mmRecurringTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<RecurringTransaction3>> mmRecurringTransfer = new MMMessageAssociationEnd<ATMTransaction24, Optional<RecurringTransaction3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "RcrngTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringTransfer";
			definition = "Information for reccurring transfer or standing orders.";
			previousVersion_lazy = () -> ATMTransaction23.mmRecurringTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecurringTransaction3.mmObject();
		}

		@Override
		public Optional<RecurringTransaction3> getValue(ATMTransaction24 obj) {
			return obj.getRecurringTransfer();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<RecurringTransaction3> value) {
			obj.setRecurringTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthstnRslt")
	protected AuthorisationResult13 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the transfer authorisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, Optional<AuthorisationResult13>> mmAuthorisationResult = new MMMessageAssociationEnd<ATMTransaction24, Optional<AuthorisationResult13>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the transfer authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthorisationResult13.mmObject();
		}

		@Override
		public Optional<AuthorisationResult13> getValue(ATMTransaction24 obj) {
			return obj.getAuthorisationResult();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<AuthorisationResult13> value) {
			obj.setAuthorisationResult(value.orElse(null));
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmICCRelatedData
	 * ATMTransaction23.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction24, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<ATMTransaction24, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			previousVersion_lazy = () -> ATMTransaction23.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(ATMTransaction24 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(ATMTransaction24 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand7> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction24, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMTransaction24, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMTransaction24 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMTransaction24 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction24.mmReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction24.mmCreditorLabel, com.tools20022.repository.msg.ATMTransaction24.mmDebtorLabel, com.tools20022.repository.msg.ATMTransaction24.mmTransferIdentifier,
						com.tools20022.repository.msg.ATMTransaction24.mmPaymentReference, com.tools20022.repository.msg.ATMTransaction24.mmTransactionResponse, com.tools20022.repository.msg.ATMTransaction24.mmAction,
						com.tools20022.repository.msg.ATMTransaction24.mmAccountFrom, com.tools20022.repository.msg.ATMTransaction24.mmProtectedAccountFrom, com.tools20022.repository.msg.ATMTransaction24.mmAccountTo,
						com.tools20022.repository.msg.ATMTransaction24.mmProtectedAccountTo, com.tools20022.repository.msg.ATMTransaction24.mmTotalAuthorisedAmount, com.tools20022.repository.msg.ATMTransaction24.mmTotalRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction24.mmDetailedRequestedAmount, com.tools20022.repository.msg.ATMTransaction24.mmAdditionalCharge, com.tools20022.repository.msg.ATMTransaction24.mmLimits,
						com.tools20022.repository.msg.ATMTransaction24.mmRequestedExecutionDate, com.tools20022.repository.msg.ATMTransaction24.mmProposedExecutionDate,
						com.tools20022.repository.msg.ATMTransaction24.mmInstantTransferProgram, com.tools20022.repository.msg.ATMTransaction24.mmRecurringTransfer, com.tools20022.repository.msg.ATMTransaction24.mmAuthorisationResult,
						com.tools20022.repository.msg.ATMTransaction24.mmICCRelatedData, com.tools20022.repository.msg.ATMTransaction24.mmCommand);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction24";
				definition = "Transfer information for the transaction.";
				previousVersion_lazy = () -> ATMTransaction23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction24 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public ATMTransaction24 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getCreditorLabel() {
		return creditorLabel == null ? Optional.empty() : Optional.of(creditorLabel);
	}

	public ATMTransaction24 setCreditorLabel(Max35Text creditorLabel) {
		this.creditorLabel = creditorLabel;
		return this;
	}

	public Optional<Max35Text> getDebtorLabel() {
		return debtorLabel == null ? Optional.empty() : Optional.of(debtorLabel);
	}

	public ATMTransaction24 setDebtorLabel(Max35Text debtorLabel) {
		this.debtorLabel = debtorLabel;
		return this;
	}

	public Optional<Max70Text> getTransferIdentifier() {
		return transferIdentifier == null ? Optional.empty() : Optional.of(transferIdentifier);
	}

	public ATMTransaction24 setTransferIdentifier(Max70Text transferIdentifier) {
		this.transferIdentifier = transferIdentifier;
		return this;
	}

	public Optional<Max35Text> getPaymentReference() {
		return paymentReference == null ? Optional.empty() : Optional.of(paymentReference);
	}

	public ATMTransaction24 setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
		return this;
	}

	public ResponseType7 getTransactionResponse() {
		return transactionResponse;
	}

	public ATMTransaction24 setTransactionResponse(ResponseType7 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}

	public List<Action7> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public ATMTransaction24 setAction(List<Action7> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}

	public Optional<CardAccount13> getAccountFrom() {
		return accountFrom == null ? Optional.empty() : Optional.of(accountFrom);
	}

	public ATMTransaction24 setAccountFrom(CardAccount13 accountFrom) {
		this.accountFrom = accountFrom;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountFrom() {
		return protectedAccountFrom == null ? Optional.empty() : Optional.of(protectedAccountFrom);
	}

	public ATMTransaction24 setProtectedAccountFrom(ContentInformationType10 protectedAccountFrom) {
		this.protectedAccountFrom = protectedAccountFrom;
		return this;
	}

	public List<CardAccount13> getAccountTo() {
		return accountTo == null ? accountTo = new ArrayList<>() : accountTo;
	}

	public ATMTransaction24 setAccountTo(List<CardAccount13> accountTo) {
		this.accountTo = Objects.requireNonNull(accountTo);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountTo() {
		return protectedAccountTo == null ? Optional.empty() : Optional.of(protectedAccountTo);
	}

	public ATMTransaction24 setProtectedAccountTo(ContentInformationType10 protectedAccountTo) {
		this.protectedAccountTo = protectedAccountTo;
		return this;
	}

	public AmountAndCurrency1 getTotalAuthorisedAmount() {
		return totalAuthorisedAmount;
	}

	public ATMTransaction24 setTotalAuthorisedAmount(AmountAndCurrency1 totalAuthorisedAmount) {
		this.totalAuthorisedAmount = Objects.requireNonNull(totalAuthorisedAmount);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getTotalRequestedAmount() {
		return totalRequestedAmount == null ? Optional.empty() : Optional.of(totalRequestedAmount);
	}

	public ATMTransaction24 setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
		return this;
	}

	public Optional<DetailedAmount17> getDetailedRequestedAmount() {
		return detailedRequestedAmount == null ? Optional.empty() : Optional.of(detailedRequestedAmount);
	}

	public ATMTransaction24 setDetailedRequestedAmount(DetailedAmount17 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
		return this;
	}

	public List<DetailedAmount18> getAdditionalCharge() {
		return additionalCharge == null ? additionalCharge = new ArrayList<>() : additionalCharge;
	}

	public ATMTransaction24 setAdditionalCharge(List<DetailedAmount18> additionalCharge) {
		this.additionalCharge = Objects.requireNonNull(additionalCharge);
		return this;
	}

	public Optional<ATMTransactionAmounts6> getLimits() {
		return limits == null ? Optional.empty() : Optional.of(limits);
	}

	public ATMTransaction24 setLimits(ATMTransactionAmounts6 limits) {
		this.limits = limits;
		return this;
	}

	public Optional<ISODate> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public ATMTransaction24 setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public Optional<ISODate> getProposedExecutionDate() {
		return proposedExecutionDate == null ? Optional.empty() : Optional.of(proposedExecutionDate);
	}

	public ATMTransaction24 setProposedExecutionDate(ISODate proposedExecutionDate) {
		this.proposedExecutionDate = proposedExecutionDate;
		return this;
	}

	public Optional<Max35Text> getInstantTransferProgram() {
		return instantTransferProgram == null ? Optional.empty() : Optional.of(instantTransferProgram);
	}

	public ATMTransaction24 setInstantTransferProgram(Max35Text instantTransferProgram) {
		this.instantTransferProgram = instantTransferProgram;
		return this;
	}

	public Optional<RecurringTransaction3> getRecurringTransfer() {
		return recurringTransfer == null ? Optional.empty() : Optional.of(recurringTransfer);
	}

	public ATMTransaction24 setRecurringTransfer(RecurringTransaction3 recurringTransfer) {
		this.recurringTransfer = recurringTransfer;
		return this;
	}

	public Optional<AuthorisationResult13> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public ATMTransaction24 setAuthorisationResult(AuthorisationResult13 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public ATMTransaction24 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMTransaction24 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}