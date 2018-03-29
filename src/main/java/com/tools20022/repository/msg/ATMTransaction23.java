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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction23", propOrder = {"transactionIdentification", "reconciliationIdentification", "creditorLabel", "debtorLabel", "paymentReference", "accountFrom", "protectedAccountFrom", "accountTo", "protectedAccountTo",
		"totalRequestedAmount", "detailedRequestedAmount", "requestedExecutionDate", "instantTransferProgram", "recurringTransfer", "requestedReceipt", "iCCRelatedData"})
public class ATMTransaction23 {

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
	public static final MMMessageAssociationEnd<ATMTransaction23, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction23, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmTransactionIdentification);
			previousVersion_lazy = () -> ATMTransaction19.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction23 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction23 obj, TransactionIdentifier1 value) {
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max35Text>> mmReconciliationIdentification = new MMMessageAttribute<ATMTransaction23, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmReconciliationIdentification);
			previousVersion_lazy = () -> ATMTransaction19.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction23 obj) {
			return obj.getReconciliationIdentification();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max35Text> value) {
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max35Text>> mmCreditorLabel = new MMMessageAttribute<ATMTransaction23, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "CdtrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorLabel";
			definition = "Description of the transfer for the creditor.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmCreditorLabel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction23 obj) {
			return obj.getCreditorLabel();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max35Text> value) {
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max35Text>> mmDebtorLabel = new MMMessageAttribute<ATMTransaction23, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "DbtrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorLabel";
			definition = "Description of the transfer for the debtor.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmDebtorLabel);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction23 obj) {
			return obj.getDebtorLabel();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max35Text> value) {
			obj.setDebtorLabel(value.orElse(null));
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max35Text>> mmPaymentReference = new MMMessageAttribute<ATMTransaction23, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PmtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentReference";
			definition = "Reference of the payment.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmPaymentReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction23 obj) {
			return obj.getPaymentReference();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max35Text> value) {
			obj.setPaymentReference(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctFr")
	protected CardAccount7 accountFrom;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ATMTransaction23, Optional<CardAccount7>> mmAccountFrom = new MMMessageAssociationEnd<ATMTransaction23, Optional<CardAccount7>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "AcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFrom";
			definition = "Information about the source account of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmAccountFrom);
			previousVersion_lazy = () -> ATMTransaction19.mmAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount7.mmObject();
		}

		@Override
		public Optional<CardAccount7> getValue(ATMTransaction23 obj) {
			return obj.getAccountFrom();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<CardAccount7> value) {
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
	public static final MMMessageAssociationEnd<ATMTransaction23, Optional<ContentInformationType10>> mmProtectedAccountFrom = new MMMessageAssociationEnd<ATMTransaction23, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountFrom";
			definition = "Encryption of the source account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmProtectedAccountFrom);
			previousVersion_lazy = () -> ATMTransaction19.mmProtectedAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction23 obj) {
			return obj.getProtectedAccountFrom();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctTo")
	protected List<CardAccount7> accountTo;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<ATMTransaction23, List<CardAccount7>> mmAccountTo = new MMMessageAssociationEnd<ATMTransaction23, List<CardAccount7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "AcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTo";
			definition = "Information about the destination account of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmAccountTo);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount7.mmObject();
		}

		@Override
		public List<CardAccount7> getValue(ATMTransaction23 obj) {
			return obj.getAccountTo();
		}

		@Override
		public void setValue(ATMTransaction23 obj, List<CardAccount7> value) {
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
	public static final MMMessageAssociationEnd<ATMTransaction23, Optional<ContentInformationType10>> mmProtectedAccountTo = new MMMessageAssociationEnd<ATMTransaction23, Optional<ContentInformationType10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountTo";
			definition = "Encryption of the destination account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmProtectedAccountTo);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMTransaction23 obj) {
			return obj.getProtectedAccountTo();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedAccountTo(value.orElse(null));
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<ImpliedCurrencyAndAmount>> mmTotalRequestedAmount = new MMMessageAttribute<ATMTransaction23, Optional<ImpliedCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Amount of the transaction to be authorised.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmTotalRequestedAmount);
			previousVersion_lazy = () -> ATMTransaction19.mmTotalRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(ATMTransaction23 obj) {
			return obj.getTotalRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<ImpliedCurrencyAndAmount> value) {
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
	public static final MMMessageAssociationEnd<ATMTransaction23, Optional<DetailedAmount17>> mmDetailedRequestedAmount = new MMMessageAssociationEnd<ATMTransaction23, Optional<DetailedAmount17>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Details of the transfer transaction amounts.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmDetailedRequestedAmount);
			previousVersion_lazy = () -> ATMTransaction19.mmDetailedRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedAmount17.mmObject();
		}

		@Override
		public Optional<DetailedAmount17> getValue(ATMTransaction23 obj) {
			return obj.getDetailedRequestedAmount();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<DetailedAmount17> value) {
			obj.setDetailedRequestedAmount(value.orElse(null));
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<ISODate>> mmRequestedExecutionDate = new MMMessageAttribute<ATMTransaction23, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Requested date of the execution of the transfer.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmRequestedExecutionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(ATMTransaction23 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<ISODate> value) {
			obj.setRequestedExecutionDate(value.orElse(null));
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max35Text>> mmInstantTransferProgram = new MMMessageAttribute<ATMTransaction23, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "InstntTrfPrgm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstantTransferProgram";
			definition = "Identifies the instant transfer program.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmInstantTransferProgram);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ATMTransaction23 obj) {
			return obj.getInstantTransferProgram();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max35Text> value) {
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
	public static final MMMessageAssociationEnd<ATMTransaction23, Optional<RecurringTransaction3>> mmRecurringTransfer = new MMMessageAssociationEnd<ATMTransaction23, Optional<RecurringTransaction3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "RcrngTrf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringTransfer";
			definition = "Information for reccurring transfer or standing orders.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmRecurringTransfer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RecurringTransaction3.mmObject();
		}

		@Override
		public Optional<RecurringTransaction3> getValue(ATMTransaction23 obj) {
			return obj.getRecurringTransfer();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<RecurringTransaction3> value) {
			obj.setRecurringTransfer(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdRct")
	protected TrueFalseIndicator requestedReceipt;
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<TrueFalseIndicator>> mmRequestedReceipt = new MMMessageAttribute<ATMTransaction23, Optional<TrueFalseIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if the customer has requested a receipt.";
			previousVersion_lazy = () -> ATMTransaction19.mmRequestedReceipt;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public Optional<TrueFalseIndicator> getValue(ATMTransaction23 obj) {
			return obj.getRequestedReceipt();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<TrueFalseIndicator> value) {
			obj.setRequestedReceipt(value.orElse(null));
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
	public static final MMMessageAttribute<ATMTransaction23, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<ATMTransaction23, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction23.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction24.mmICCRelatedData);
			previousVersion_lazy = () -> ATMTransaction19.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(ATMTransaction23 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(ATMTransaction23 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
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

	public ATMTransaction23 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Max35Text> getReconciliationIdentification() {
		return reconciliationIdentification == null ? Optional.empty() : Optional.of(reconciliationIdentification);
	}

	public ATMTransaction23 setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
		return this;
	}

	public Optional<Max35Text> getCreditorLabel() {
		return creditorLabel == null ? Optional.empty() : Optional.of(creditorLabel);
	}

	public ATMTransaction23 setCreditorLabel(Max35Text creditorLabel) {
		this.creditorLabel = creditorLabel;
		return this;
	}

	public Optional<Max35Text> getDebtorLabel() {
		return debtorLabel == null ? Optional.empty() : Optional.of(debtorLabel);
	}

	public ATMTransaction23 setDebtorLabel(Max35Text debtorLabel) {
		this.debtorLabel = debtorLabel;
		return this;
	}

	public Optional<Max35Text> getPaymentReference() {
		return paymentReference == null ? Optional.empty() : Optional.of(paymentReference);
	}

	public ATMTransaction23 setPaymentReference(Max35Text paymentReference) {
		this.paymentReference = paymentReference;
		return this;
	}

	public Optional<CardAccount7> getAccountFrom() {
		return accountFrom == null ? Optional.empty() : Optional.of(accountFrom);
	}

	public ATMTransaction23 setAccountFrom(CardAccount7 accountFrom) {
		this.accountFrom = accountFrom;
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountFrom() {
		return protectedAccountFrom == null ? Optional.empty() : Optional.of(protectedAccountFrom);
	}

	public ATMTransaction23 setProtectedAccountFrom(ContentInformationType10 protectedAccountFrom) {
		this.protectedAccountFrom = protectedAccountFrom;
		return this;
	}

	public List<CardAccount7> getAccountTo() {
		return accountTo == null ? accountTo = new ArrayList<>() : accountTo;
	}

	public ATMTransaction23 setAccountTo(List<CardAccount7> accountTo) {
		this.accountTo = Objects.requireNonNull(accountTo);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedAccountTo() {
		return protectedAccountTo == null ? Optional.empty() : Optional.of(protectedAccountTo);
	}

	public ATMTransaction23 setProtectedAccountTo(ContentInformationType10 protectedAccountTo) {
		this.protectedAccountTo = protectedAccountTo;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getTotalRequestedAmount() {
		return totalRequestedAmount == null ? Optional.empty() : Optional.of(totalRequestedAmount);
	}

	public ATMTransaction23 setTotalRequestedAmount(ImpliedCurrencyAndAmount totalRequestedAmount) {
		this.totalRequestedAmount = totalRequestedAmount;
		return this;
	}

	public Optional<DetailedAmount17> getDetailedRequestedAmount() {
		return detailedRequestedAmount == null ? Optional.empty() : Optional.of(detailedRequestedAmount);
	}

	public ATMTransaction23 setDetailedRequestedAmount(DetailedAmount17 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
		return this;
	}

	public Optional<ISODate> getRequestedExecutionDate() {
		return requestedExecutionDate == null ? Optional.empty() : Optional.of(requestedExecutionDate);
	}

	public ATMTransaction23 setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
		return this;
	}

	public Optional<Max35Text> getInstantTransferProgram() {
		return instantTransferProgram == null ? Optional.empty() : Optional.of(instantTransferProgram);
	}

	public ATMTransaction23 setInstantTransferProgram(Max35Text instantTransferProgram) {
		this.instantTransferProgram = instantTransferProgram;
		return this;
	}

	public Optional<RecurringTransaction3> getRecurringTransfer() {
		return recurringTransfer == null ? Optional.empty() : Optional.of(recurringTransfer);
	}

	public ATMTransaction23 setRecurringTransfer(RecurringTransaction3 recurringTransfer) {
		this.recurringTransfer = recurringTransfer;
		return this;
	}

	public Optional<TrueFalseIndicator> getRequestedReceipt() {
		return requestedReceipt == null ? Optional.empty() : Optional.of(requestedReceipt);
	}

	public ATMTransaction23 setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public ATMTransaction23 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}