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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.CardPayment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
 * ATMTransaction23.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
 * ATMTransaction23.mmReconciliationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmCreditorLabel
 * ATMTransaction23.mmCreditorLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDebtorLabel
 * ATMTransaction23.mmDebtorLabel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmPaymentReference
 * ATMTransaction23.mmPaymentReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountFrom
 * ATMTransaction23.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountFrom
 * ATMTransaction23.mmProtectedAccountFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountTo
 * ATMTransaction23.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountTo
 * ATMTransaction23.mmProtectedAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTotalRequestedAmount
 * ATMTransaction23.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDetailedRequestedAmount
 * ATMTransaction23.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRequestedExecutionDate
 * ATMTransaction23.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmInstantTransferProgram
 * ATMTransaction23.mmInstantTransferProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRecurringTransfer
 * ATMTransaction23.mmRecurringTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRequestedReceipt
 * ATMTransaction23.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmICCRelatedData
 * ATMTransaction23.mmICCRelatedData}</li>
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
 * "ATMTransaction23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Transfer information for the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction24
 * ATMTransaction24}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19 ATMTransaction19}</li>
 * </ul>
 */
public class ATMTransaction23 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTransactionIdentification
	 * ATMTransaction24.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTransactionIdentification
	 * ATMTransaction19.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmTransactionIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmReconciliationIdentification
	 * ATMTransaction24.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmReconciliationIdentification
	 * ATMTransaction19.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmReconciliationIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmReconciliationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmCreditorLabel
	 * ATMTransaction24.mmCreditorLabel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditorLabel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "CdtrLabl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorLabel";
			definition = "Description of the transfer for the creditor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmCreditorLabel);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmDebtorLabel
	 * ATMTransaction24.mmDebtorLabel}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorLabel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "DbtrLabl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorLabel";
			definition = "Description of the transfer for the debtor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmDebtorLabel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmPaymentReference
	 * ATMTransaction24.mmPaymentReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Reference of the payment.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmPaymentReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CardAccount7 accountFrom;
	/**
	 * Information about the source account of the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount7
	 * CardAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAccountFrom
	 * ATMTransaction24.mmAccountFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmAccountData
	 * ATMTransaction19.mmAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "AcctFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFrom";
			definition = "Information about the source account of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmAccountFrom);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmProtectedAccountFrom
	 * ATMTransaction24.mmProtectedAccountFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmProtectedAccountData
	 * ATMTransaction19.mmProtectedAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountFrom = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctFr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountFrom";
			definition = "Encryption of the source account information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmProtectedAccountFrom);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmProtectedAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardAccount7> accountTo;
	/**
	 * Information about the destination account of the transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount7
	 * CardAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmAccountTo
	 * ATMTransaction24.mmAccountTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "AcctTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTo";
			definition = "Information about the destination account of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmAccountTo);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmProtectedAccountTo
	 * ATMTransaction24.mmProtectedAccountTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountTo = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctTo";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountTo";
			definition = "Encryption of the destination account information.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmProtectedAccountTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalRequestedAmount;
	/**
	 * Amount of the transaction to be authorised.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * definition} = "Amount of the transaction to be authorised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmTotalRequestedAmount
	 * ATMTransaction24.mmTotalRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTotalRequestedAmount
	 * ATMTransaction19.mmTotalRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalRequestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Amount of the transaction to be authorised.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmTotalRequestedAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmTotalRequestedAmount;
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmDetailedRequestedAmount
	 * ATMTransaction24.mmDetailedRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmDetailedRequestedAmount
	 * ATMTransaction19.mmDetailedRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Details of the transfer transaction amounts.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmDetailedRequestedAmount);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmDetailedRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount17.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmRequestedExecutionDate
	 * ATMTransaction24.mmRequestedExecutionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Requested date of the execution of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmRequestedExecutionDate);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmInstantTransferProgram
	 * ATMTransaction24.mmInstantTransferProgram}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstantTransferProgram = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "InstntTrfPrgm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstantTransferProgram";
			definition = "Identifies the instant transfer program.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmInstantTransferProgram);
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmRecurringTransfer
	 * ATMTransaction24.mmRecurringTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecurringTransfer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "RcrngTrf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringTransfer";
			definition = "Information for reccurring transfer or standing orders.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmRecurringTransfer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecurringTransaction3.mmObject();
		}
	};
	protected TrueFalseIndicator requestedReceipt;
	/**
	 * True if the customer has requested a receipt.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdRct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "True if the customer has requested a receipt."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmRequestedReceipt
	 * ATMTransaction19.mmRequestedReceipt}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedReceipt = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if the customer has requested a receipt.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmRequestedReceipt;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23
	 * ATMTransaction23}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction24#mmICCRelatedData
	 * ATMTransaction24.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmICCRelatedData
	 * ATMTransaction19.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction24.mmICCRelatedData);
			previousVersion_lazy = () -> com.tools20022.repository.msg.ATMTransaction19.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction23.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction23.mmReconciliationIdentification,
						com.tools20022.repository.msg.ATMTransaction23.mmCreditorLabel, com.tools20022.repository.msg.ATMTransaction23.mmDebtorLabel, com.tools20022.repository.msg.ATMTransaction23.mmPaymentReference,
						com.tools20022.repository.msg.ATMTransaction23.mmAccountFrom, com.tools20022.repository.msg.ATMTransaction23.mmProtectedAccountFrom, com.tools20022.repository.msg.ATMTransaction23.mmAccountTo,
						com.tools20022.repository.msg.ATMTransaction23.mmProtectedAccountTo, com.tools20022.repository.msg.ATMTransaction23.mmTotalRequestedAmount, com.tools20022.repository.msg.ATMTransaction23.mmDetailedRequestedAmount,
						com.tools20022.repository.msg.ATMTransaction23.mmRequestedExecutionDate, com.tools20022.repository.msg.ATMTransaction23.mmInstantTransferProgram, com.tools20022.repository.msg.ATMTransaction23.mmRecurringTransfer,
						com.tools20022.repository.msg.ATMTransaction23.mmRequestedReceipt, com.tools20022.repository.msg.ATMTransaction23.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction23";
				definition = "Transfer information for the transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmObject());
				previousVersion_lazy = () -> ATMTransaction19.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	public Max35Text getCreditorLabel() {
		return creditorLabel;
	}

	public void setCreditorLabel(Max35Text creditorLabel) {
		this.creditorLabel = creditorLabel;
	}

	public Max35Text getDebtorLabel() {
		return debtorLabel;
	}

	public void setDebtorLabel(Max35Text debtorLabel) {
		this.debtorLabel = debtorLabel;
	}

	public Max35Text getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
	}

	public CardAccount7 getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(com.tools20022.repository.msg.CardAccount7 accountFrom) {
		this.accountFrom = accountFrom;
	}

	public ContentInformationType10 getProtectedAccountFrom() {
		return protectedAccountFrom;
	}

	public void setProtectedAccountFrom(com.tools20022.repository.msg.ContentInformationType10 protectedAccountFrom) {
		this.protectedAccountFrom = protectedAccountFrom;
	}

	public List<CardAccount7> getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(List<com.tools20022.repository.msg.CardAccount7> accountTo) {
		this.accountTo = accountTo;
	}

	public ContentInformationType10 getProtectedAccountTo() {
		return protectedAccountTo;
	}

	public void setProtectedAccountTo(com.tools20022.repository.msg.ContentInformationType10 protectedAccountTo) {
		this.protectedAccountTo = protectedAccountTo;
	}

	public ImpliedCurrencyAndAmount getTotalRequestedAmount() {
		return totalRequestedAmount;
	}

	public void setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
	}

	public DetailedAmount17 getDetailedRequestedAmount() {
		return detailedRequestedAmount;
	}

	public void setDetailedRequestedAmount(com.tools20022.repository.msg.DetailedAmount17 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
	}

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	public Max35Text getInstantTransferProgram() {
		return instantTransferProgram;
	}

	public void setInstantTransferProgram(Max35Text instantTransferProgram) {
		this.instantTransferProgram = instantTransferProgram;
	}

	public RecurringTransaction3 getRecurringTransfer() {
		return recurringTransfer;
	}

	public void setRecurringTransfer(com.tools20022.repository.msg.RecurringTransaction3 recurringTransfer) {
		this.recurringTransfer = recurringTransfer;
	}

	public TrueFalseIndicator getRequestedReceipt() {
		return requestedReceipt;
	}

	public void setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
	}

	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}