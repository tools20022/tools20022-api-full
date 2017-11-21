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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransaction24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transfer information for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23 ATMTransaction23}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransaction24", propOrder = {"transactionIdentification", "reconciliationIdentification", "creditorLabel", "debtorLabel", "transferIdentifier", "paymentReference", "transactionResponse", "action", "accountFrom",
		"protectedAccountFrom", "accountTo", "protectedAccountTo", "totalAuthorisedAmount", "totalRequestedAmount", "detailedRequestedAmount", "additionalCharge", "limits", "requestedExecutionDate", "proposedExecutionDate",
		"instantTransferProgram", "recurringTransfer", "authorisationResult", "ICCRelatedData", "command"})
public class ATMTransaction24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Identification of the transaction assigned by the ATM.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
	 * ATMTransaction23.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			previousVersion_lazy = () -> ATMTransaction23.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected Max35Text reconciliationIdentification;
	/**
	 * Identification of the reconciliation period assigned by the ATM.
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
	 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction#mmReconciliationIdentification
	 * ReconciliationTransaction.mmReconciliationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period assigned by the ATM."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
	 * ATMTransaction23.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected Max35Text creditorLabel;
	/**
	 * Description of the transfer for the creditor.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the transfer for the creditor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmCreditorLabel
	 * ATMTransaction23.mmCreditorLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorLabel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected Max35Text debtorLabel;
	/**
	 * Description of the transfer for the debtor.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Description of the transfer for the debtor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDebtorLabel
	 * ATMTransaction23.mmDebtorLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorLabel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected Max70Text transferIdentifier;
	/**
	 * Identifier of the approved transfer transaction for the bank.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the approved transfer transaction for the bank."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferIdentifier = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TrfIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferIdentifier";
			definition = "Identifier of the approved transfer transaction for the bank.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected Max35Text paymentReference;
	/**
	 * Reference of the payment.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmPaymentReference
	 * ATMTransaction23.mmPaymentReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected ResponseType7 transactionResponse;
	/**
	 * Result of the fund transfer request.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the fund transfer request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the fund transfer request.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Action7> action;
	/**
	 * Sequence of actions to be performed by the ATM to complete the
	 * transaction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of actions to be performed by the ATM to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Action7.mmObject();
		}
	};
	protected CardAccount13 accountFrom;
	/**
	 * Information about the source account of the transfer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the source account of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountFrom
	 * ATMTransaction23.mmAccountFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFrom";
			definition = "Information about the source account of the transfer.";
			previousVersion_lazy = () -> ATMTransaction23.mmAccountFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount13.mmObject();
		}
	};
	protected ContentInformationType10 protectedAccountFrom;
	/**
	 * Encryption of the source account information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the source account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountFrom
	 * ATMTransaction23.mmProtectedAccountFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountFrom";
			definition = "Encryption of the source account information.";
			previousVersion_lazy = () -> ATMTransaction23.mmProtectedAccountFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardAccount13> accountTo;
	/**
	 * Information about the destination account of the transfer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the destination account of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountTo
	 * ATMTransaction23.mmAccountTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTo";
			definition = "Information about the destination account of the transfer.";
			previousVersion_lazy = () -> ATMTransaction23.mmAccountTo;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount13.mmObject();
		}
	};
	protected ContentInformationType10 protectedAccountTo;
	/**
	 * Encryption of the destination account information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of the destination account information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountTo
	 * ATMTransaction23.mmProtectedAccountTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountTo";
			definition = "Encryption of the destination account information.";
			previousVersion_lazy = () -> ATMTransaction23.mmProtectedAccountTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected AmountAndCurrency1 totalAuthorisedAmount;
	/**
	 * Total authorised amount.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAuthorisedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total authorised amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalAuthorisedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrency1.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalRequestedAmount;
	/**
	 * Total requested amount.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total requested amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTotalRequestedAmount
	 * ATMTransaction23.mmTotalRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalRequestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected DetailedAmount17 detailedRequestedAmount;
	/**
	 * Details of the transfer transaction amounts.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailedRequestedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the transfer transaction amounts."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDetailedRequestedAmount
	 * ATMTransaction23.mmDetailedRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Details of the transfer transaction amounts.";
			previousVersion_lazy = () -> ATMTransaction23.mmDetailedRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount17.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount18> additionalCharge;
	/**
	 * Additional charge (for instance tax or fee).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional charge (for instance tax or fee)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalCharge = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount18.mmObject();
		}
	};
	protected ATMTransactionAmounts6 limits;
	/**
	 * Limit of amounts for the customer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit of amounts for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLimits = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Lmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limits";
			definition = "Limit of amounts for the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTransactionAmounts6.mmObject();
		}
	};
	protected ISODate requestedExecutionDate;
	/**
	 * Requested date of the execution of the transfer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
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
	 * definition} = "Requested date of the execution of the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRequestedExecutionDate
	 * ATMTransaction23.mmRequestedExecutionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected ISODate proposedExecutionDate;
	/**
	 * Proposed date of the execution of the transfer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PropsdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposed date of the execution of the transfer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProposedExecutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "PropsdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProposedExecutionDate";
			definition = "Proposed date of the execution of the transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text instantTransferProgram;
	/**
	 * Identifies the instant transfer program.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24
	 * ATMTransaction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstntTrfPrgm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstantTransferProgram"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the instant transfer program."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmInstantTransferProgram
	 * ATMTransaction23.mmInstantTransferProgram}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstantTransferProgram = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected RecurringTransaction3 recurringTransfer;
	/**
	 * Information for reccurring transfer or standing orders.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information for reccurring transfer or standing orders."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRecurringTransfer
	 * ATMTransaction23.mmRecurringTransfer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecurringTransfer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "RcrngTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringTransfer";
			definition = "Information for reccurring transfer or standing orders.";
			previousVersion_lazy = () -> ATMTransaction23.mmRecurringTransfer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
		}
	};
	protected AuthorisationResult13 authorisationResult;
	/**
	 * Outcome of the transfer authorisation.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the transfer authorisation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the transfer authorisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * Sequence of one or more TLV data elements from the ATM application, in
	 * accordance with ISO 7816-6, not in a specific order. Present if the
	 * transaction is performed with an EMV chip card application.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmICCRelatedData
	 * ATMTransaction23.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
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
	};
	protected List<com.tools20022.repository.msg.ATMCommand7> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction24.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTransaction24.mmTransactionIdentification, ATMTransaction24.mmReconciliationIdentification, ATMTransaction24.mmCreditorLabel, ATMTransaction24.mmDebtorLabel,
						ATMTransaction24.mmTransferIdentifier, ATMTransaction24.mmPaymentReference, ATMTransaction24.mmTransactionResponse, ATMTransaction24.mmAction, ATMTransaction24.mmAccountFrom, ATMTransaction24.mmProtectedAccountFrom,
						ATMTransaction24.mmAccountTo, ATMTransaction24.mmProtectedAccountTo, ATMTransaction24.mmTotalAuthorisedAmount, ATMTransaction24.mmTotalRequestedAmount, ATMTransaction24.mmDetailedRequestedAmount,
						ATMTransaction24.mmAdditionalCharge, ATMTransaction24.mmLimits, ATMTransaction24.mmRequestedExecutionDate, ATMTransaction24.mmProposedExecutionDate, ATMTransaction24.mmInstantTransferProgram,
						ATMTransaction24.mmRecurringTransfer, ATMTransaction24.mmAuthorisationResult, ATMTransaction24.mmICCRelatedData, ATMTransaction24.mmCommand);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction24";
				definition = "Transfer information for the transaction.";
				previousVersion_lazy = () -> ATMTransaction23.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "RcncltnId")
	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	@XmlElement(name = "CdtrLabl")
	public Max35Text getCreditorLabel() {
		return creditorLabel;
	}

	public void setCreditorLabel(Max35Text creditorLabel) {
		this.creditorLabel = creditorLabel;
	}

	@XmlElement(name = "DbtrLabl")
	public Max35Text getDebtorLabel() {
		return debtorLabel;
	}

	public void setDebtorLabel(Max35Text debtorLabel) {
		this.debtorLabel = debtorLabel;
	}

	@XmlElement(name = "TrfIdr")
	public Max70Text getTransferIdentifier() {
		return transferIdentifier;
	}

	public void setTransferIdentifier(Max70Text transferIdentifier) {
		this.transferIdentifier = transferIdentifier;
	}

	@XmlElement(name = "PmtRef")
	public Max35Text getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
	}

	@XmlElement(name = "TxRspn", required = true)
	public ResponseType7 getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(com.tools20022.repository.msg.ResponseType7 transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

	@XmlElement(name = "Actn")
	public List<Action7> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.Action7> action) {
		this.action = action;
	}

	@XmlElement(name = "AcctFr")
	public CardAccount13 getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(com.tools20022.repository.msg.CardAccount13 accountFrom) {
		this.accountFrom = accountFrom;
	}

	@XmlElement(name = "PrtctdAcctFr")
	public ContentInformationType10 getProtectedAccountFrom() {
		return protectedAccountFrom;
	}

	public void setProtectedAccountFrom(com.tools20022.repository.msg.ContentInformationType10 protectedAccountFrom) {
		this.protectedAccountFrom = protectedAccountFrom;
	}

	@XmlElement(name = "AcctTo")
	public List<CardAccount13> getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(List<com.tools20022.repository.msg.CardAccount13> accountTo) {
		this.accountTo = accountTo;
	}

	@XmlElement(name = "PrtctdAcctTo")
	public ContentInformationType10 getProtectedAccountTo() {
		return protectedAccountTo;
	}

	public void setProtectedAccountTo(com.tools20022.repository.msg.ContentInformationType10 protectedAccountTo) {
		this.protectedAccountTo = protectedAccountTo;
	}

	@XmlElement(name = "TtlAuthrsdAmt", required = true)
	public AmountAndCurrency1 getTotalAuthorisedAmount() {
		return totalAuthorisedAmount;
	}

	public void setTotalAuthorisedAmount(com.tools20022.repository.msg.AmountAndCurrency1 totalAuthorisedAmount) {
		this.totalAuthorisedAmount = totalAuthorisedAmount;
	}

	@XmlElement(name = "TtlReqdAmt")
	public ImpliedCurrencyAndAmount getTotalRequestedAmount() {
		return totalRequestedAmount;
	}

	public void setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
	}

	@XmlElement(name = "DtldReqdAmt")
	public DetailedAmount17 getDetailedRequestedAmount() {
		return detailedRequestedAmount;
	}

	public void setDetailedRequestedAmount(com.tools20022.repository.msg.DetailedAmount17 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
	}

	@XmlElement(name = "AddtlChrg")
	public List<DetailedAmount18> getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(List<com.tools20022.repository.msg.DetailedAmount18> additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@XmlElement(name = "Lmts")
	public ATMTransactionAmounts6 getLimits() {
		return limits;
	}

	public void setLimits(com.tools20022.repository.msg.ATMTransactionAmounts6 limits) {
		this.limits = limits;
	}

	@XmlElement(name = "ReqdExctnDt")
	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	@XmlElement(name = "PropsdExctnDt")
	public ISODate getProposedExecutionDate() {
		return proposedExecutionDate;
	}

	public void setProposedExecutionDate(ISODate proposedExecutionDate) {
		this.proposedExecutionDate = proposedExecutionDate;
	}

	@XmlElement(name = "InstntTrfPrgm")
	public Max35Text getInstantTransferProgram() {
		return instantTransferProgram;
	}

	public void setInstantTransferProgram(Max35Text instantTransferProgram) {
		this.instantTransferProgram = instantTransferProgram;
	}

	@XmlElement(name = "RcrngTrf")
	public RecurringTransaction3 getRecurringTransfer() {
		return recurringTransfer;
	}

	public void setRecurringTransfer(com.tools20022.repository.msg.RecurringTransaction3 recurringTransfer) {
		this.recurringTransfer = recurringTransfer;
	}

	@XmlElement(name = "AuthstnRslt")
	public AuthorisationResult13 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult13 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}

	@XmlElement(name = "Cmd")
	public List<ATMCommand7> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand7> command) {
		this.command = command;
	}
}