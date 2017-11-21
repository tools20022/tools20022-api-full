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
import com.tools20022.repository.codeset.ATMTransactionStatus1Code;
import com.tools20022.repository.codeset.FailureReason7Code;
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
 * Response to the deposit request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTransactionIdentification
 * ATMTransaction19.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTransactionStatus
 * ATMTransaction19.mmTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmReconciliationIdentification
 * ATMTransaction19.mmReconciliationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19#mmIncident
 * ATMTransaction19.mmIncident}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmIncidentDetail
 * ATMTransaction19.mmIncidentDetail}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19#mmAccountData
 * ATMTransaction19.mmAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmProtectedAccountData
 * ATMTransaction19.mmProtectedAccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTotalDepositedAmount
 * ATMTransaction19.mmTotalDepositedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTotalAuthorisedAmount
 * ATMTransaction19.mmTotalAuthorisedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmTotalRequestedAmount
 * ATMTransaction19.mmTotalRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmDetailedRequestedAmount
 * ATMTransaction19.mmDetailedRequestedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmAdditionalCharge
 * ATMTransaction19.mmAdditionalCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmRequestedReceipt
 * ATMTransaction19.mmRequestedReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmReceiptPrinted
 * ATMTransaction19.mmReceiptPrinted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmAuthorisationResult
 * ATMTransaction19.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmDepositedMedia
 * ATMTransaction19.mmDepositedMedia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmToBeReconciledMediaCounters
 * ATMTransaction19.mmToBeReconciledMediaCounters}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19#mmATMTotals
 * ATMTransaction19.mmATMTotals}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction19#mmCassette
 * ATMTransaction19.mmCassette}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction19#mmICCRelatedData
 * ATMTransaction19.mmICCRelatedData}</li>
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
 * "ATMTransaction19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Response to the deposit request."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction23
 * ATMTransaction23}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMTransaction16 ATMTransaction16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransaction19", propOrder = {"transactionIdentification", "transactionStatus", "reconciliationIdentification", "incident", "incidentDetail", "accountData", "protectedAccountData", "totalDepositedAmount",
		"totalAuthorisedAmount", "totalRequestedAmount", "detailedRequestedAmount", "additionalCharge", "requestedReceipt", "receiptPrinted", "authorisationResult", "depositedMedia", "toBeReconciledMediaCounters", "ATMTotals", "cassette",
		"ICCRelatedData"})
public class ATMTransaction19 {

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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTransactionIdentification
	 * ATMTransaction23.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTransactionIdentification
	 * ATMTransaction16.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmTransactionIdentification);
			previousVersion_lazy = () -> ATMTransaction16.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected ATMTransactionStatus1Code transactionStatus;
	/**
	 * Outcome of the financial transaction for the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMTransactionStatus1Code
	 * ATMTransactionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the financial transaction for the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "TxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionStatus";
			definition = "Outcome of the financial transaction for the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMTransactionStatus1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmReconciliationIdentification
	 * ATMTransaction23.mmReconciliationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmReconciliationIdentification
	 * ATMTransaction16.mmReconciliationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReconciliationTransaction.mmReconciliationIdentification;
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "RcncltnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationIdentification";
			definition = "Identification of the reconciliation period assigned by the ATM.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmReconciliationIdentification);
			previousVersion_lazy = () -> ATMTransaction16.mmReconciliationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<FailureReason7Code> incident;
	/**
	 * Incident occurring during the processing of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason7Code
	 * FailureReason7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Incdnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incident"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Incident occurring during the processing of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncident = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "Incdnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incident";
			definition = "Incident occurring during the processing of the transaction.";
			minOccurs = 0;
			simpleType_lazy = () -> FailureReason7Code.mmObject();
		}
	};
	protected List<Max70Text> incidentDetail;
	/**
	 * Explanation of the incident.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncdntDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncidentDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Explanation of the incident."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncidentDetail = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "IncdntDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncidentDetail";
			definition = "Explanation of the incident.";
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected CardAccount8 accountData;
	/**
	 * Unprotected account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount8
	 * CardAccount8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unprotected account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmAccountFrom
	 * ATMTransaction23.mmAccountFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmAccountData
	 * ATMTransaction16.mmAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountData = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "AcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			definition = "Unprotected account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmAccountFrom);
			previousVersion_lazy = () -> ATMTransaction16.mmAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount8.mmObject();
		}
	};
	protected ContentInformationType10 protectedAccountData;
	/**
	 * Encryption of account information.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAcctData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encryption of account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmProtectedAccountFrom
	 * ATMTransaction23.mmProtectedAccountFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmProtectedAccountData
	 * ATMTransaction16.mmProtectedAccountData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAccountData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAcctData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAccountData";
			definition = "Encryption of account information.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmProtectedAccountFrom);
			previousVersion_lazy = () -> ATMTransaction16.mmProtectedAccountData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected AmountAndCurrency1 totalDepositedAmount;
	/**
	 * Total amount deposed by the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndCurrency1
	 * AmountAndCurrency1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDpstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDepositedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount deposed by the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTotalDepositedAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "TtlDpstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDepositedAmount";
			definition = "Total amount deposed by the customer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndCurrency1.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount totalAuthorisedAmount;
	/**
	 * Total authorised amount of the deposit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * definition} = "Total authorised amount of the deposit transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTotalAuthorisedAmount
	 * ATMTransaction16.mmTotalAuthorisedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAuthorisedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "TtlAuthrsdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAuthorisedAmount";
			definition = "Total authorised amount of the deposit transaction.";
			previousVersion_lazy = () -> ATMTransaction16.mmTotalAuthorisedAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmTotalRequestedAmount
	 * ATMTransaction23.mmTotalRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmTotalRequestedAmount
	 * ATMTransaction16.mmTotalRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalRequestedAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "TtlReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRequestedAmount";
			definition = "Total requested amount.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmTotalRequestedAmount);
			previousVersion_lazy = () -> ATMTransaction16.mmTotalRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected DetailedAmount16 detailedRequestedAmount;
	/**
	 * Amounts of the deposit transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount16
	 * DetailedAmount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * definition} = "Amounts of the deposit transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmDetailedRequestedAmount
	 * ATMTransaction23.mmDetailedRequestedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmDetailedRequestedAmount
	 * ATMTransaction16.mmDetailedRequestedAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDetailedRequestedAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "DtldReqdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailedRequestedAmount";
			definition = "Amounts of the deposit transaction.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmDetailedRequestedAmount);
			previousVersion_lazy = () -> ATMTransaction16.mmDetailedRequestedAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount16.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedAmount13> additionalCharge;
	/**
	 * Additional charge (for instance tax or fee).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount13
	 * DetailedAmount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmAdditionalCharge
	 * ATMTransaction16.mmAdditionalCharge}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalCharge = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "AddtlChrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalCharge";
			definition = "Additional charge (for instance tax or fee).";
			previousVersion_lazy = () -> ATMTransaction16.mmAdditionalCharge;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount13.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmRequestedReceipt
	 * ATMTransaction23.mmRequestedReceipt}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedReceipt = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "ReqdRct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedReceipt";
			definition = "True if the customer has requested a receipt.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmRequestedReceipt);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator receiptPrinted;
	/**
	 * True if a receipt has been printed and presented to the customer.
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RctPrtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiptPrinted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if a receipt has been printed and presented to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiptPrinted = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "RctPrtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiptPrinted";
			definition = "True if a receipt has been printed and presented to the customer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected AuthorisationResult13 authorisationResult;
	/**
	 * Outcome of the deposit authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult13
	 * AuthorisationResult13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * definition} = "Outcome of the deposit authorisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmAuthorisationResult
	 * ATMTransaction16.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the deposit authorisation.";
			previousVersion_lazy = () -> ATMTransaction16.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult13.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMDepositedMedia1> depositedMedia;
	/**
	 * Deposited media put in the safe.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMDepositedMedia1
	 * ATMDepositedMedia1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DpstdMdia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositedMedia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deposited media put in the safe."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDepositedMedia = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "DpstdMdia";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositedMedia";
			definition = "Deposited media put in the safe.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMDepositedMedia3> toBeReconciledMediaCounters;
	/**
	 * Media unit not put in the safe. These deposits have to be reconciliated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMDepositedMedia3
	 * ATMDepositedMedia3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ToBeRcncldMdiaCntrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeReconciledMediaCounters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Media unit not put in the safe. These deposits have to be reconciliated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmToBeReconciledMediaCounters = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "ToBeRcncldMdiaCntrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToBeReconciledMediaCounters";
			definition = "Media unit not put in the safe. These deposits have to be reconciliated.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMDepositedMedia3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMTotals1> aTMTotals;
	/**
	 * Current totals of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMTotals1 ATMTotals1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current totals of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmATMTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "ATMTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTotals";
			definition = "Current totals of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMTotals1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCassette2> cassette;
	/**
	 * Information on the cassettes of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCassette2
	 * ATMCassette2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Csstt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cassette"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information on the cassettes of the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCassette = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "Csstt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cassette";
			definition = "Information on the cassettes of the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCassette2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction19
	 * ATMTransaction19}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction23#mmICCRelatedData
	 * ATMTransaction23.mmICCRelatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction16#mmICCRelatedData
	 * ATMTransaction16.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction19.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmICCRelatedData);
			previousVersion_lazy = () -> ATMTransaction16.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(ATMTransaction19.mmTransactionIdentification, ATMTransaction19.mmTransactionStatus, ATMTransaction19.mmReconciliationIdentification, ATMTransaction19.mmIncident, ATMTransaction19.mmIncidentDetail,
								ATMTransaction19.mmAccountData, ATMTransaction19.mmProtectedAccountData, ATMTransaction19.mmTotalDepositedAmount, ATMTransaction19.mmTotalAuthorisedAmount, ATMTransaction19.mmTotalRequestedAmount,
								ATMTransaction19.mmDetailedRequestedAmount, ATMTransaction19.mmAdditionalCharge, ATMTransaction19.mmRequestedReceipt, ATMTransaction19.mmReceiptPrinted, ATMTransaction19.mmAuthorisationResult,
								ATMTransaction19.mmDepositedMedia, ATMTransaction19.mmToBeReconciledMediaCounters, ATMTransaction19.mmATMTotals, ATMTransaction19.mmCassette, ATMTransaction19.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction19";
				definition = "Response to the deposit request.";
				nextVersions_lazy = () -> Arrays.asList(ATMTransaction23.mmObject());
				previousVersion_lazy = () -> ATMTransaction16.mmObject();
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

	@XmlElement(name = "TxSts", required = true)
	public ATMTransactionStatus1Code getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(ATMTransactionStatus1Code transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	@XmlElement(name = "RcncltnId")
	public Max35Text getReconciliationIdentification() {
		return reconciliationIdentification;
	}

	public void setReconciliationIdentification(Max35Text reconciliationIdentification) {
		this.reconciliationIdentification = reconciliationIdentification;
	}

	@XmlElement(name = "Incdnt")
	public List<FailureReason7Code> getIncident() {
		return incident;
	}

	public void setIncident(List<FailureReason7Code> incident) {
		this.incident = incident;
	}

	@XmlElement(name = "IncdntDtl")
	public List<Max70Text> getIncidentDetail() {
		return incidentDetail;
	}

	public void setIncidentDetail(List<Max70Text> incidentDetail) {
		this.incidentDetail = incidentDetail;
	}

	@XmlElement(name = "AcctData")
	public CardAccount8 getAccountData() {
		return accountData;
	}

	public void setAccountData(com.tools20022.repository.msg.CardAccount8 accountData) {
		this.accountData = accountData;
	}

	@XmlElement(name = "PrtctdAcctData")
	public ContentInformationType10 getProtectedAccountData() {
		return protectedAccountData;
	}

	public void setProtectedAccountData(com.tools20022.repository.msg.ContentInformationType10 protectedAccountData) {
		this.protectedAccountData = protectedAccountData;
	}

	@XmlElement(name = "TtlDpstdAmt", required = true)
	public AmountAndCurrency1 getTotalDepositedAmount() {
		return totalDepositedAmount;
	}

	public void setTotalDepositedAmount(com.tools20022.repository.msg.AmountAndCurrency1 totalDepositedAmount) {
		this.totalDepositedAmount = totalDepositedAmount;
	}

	@XmlElement(name = "TtlAuthrsdAmt", required = true)
	public ImpliedCurrencyAndAmount getTotalAuthorisedAmount() {
		return totalAuthorisedAmount;
	}

	public void setTotalAuthorisedAmount(ImpliedCurrencyAndAmount totalAuthorisedAmount) {
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
	public DetailedAmount16 getDetailedRequestedAmount() {
		return detailedRequestedAmount;
	}

	public void setDetailedRequestedAmount(com.tools20022.repository.msg.DetailedAmount16 detailedRequestedAmount) {
		this.detailedRequestedAmount = detailedRequestedAmount;
	}

	@XmlElement(name = "AddtlChrg")
	public List<DetailedAmount13> getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(List<com.tools20022.repository.msg.DetailedAmount13> additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@XmlElement(name = "ReqdRct")
	public TrueFalseIndicator getRequestedReceipt() {
		return requestedReceipt;
	}

	public void setRequestedReceipt(TrueFalseIndicator requestedReceipt) {
		this.requestedReceipt = requestedReceipt;
	}

	@XmlElement(name = "RctPrtd")
	public TrueFalseIndicator getReceiptPrinted() {
		return receiptPrinted;
	}

	public void setReceiptPrinted(TrueFalseIndicator receiptPrinted) {
		this.receiptPrinted = receiptPrinted;
	}

	@XmlElement(name = "AuthstnRslt")
	public AuthorisationResult13 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult13 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}

	@XmlElement(name = "DpstdMdia")
	public List<ATMDepositedMedia1> getDepositedMedia() {
		return depositedMedia;
	}

	public void setDepositedMedia(List<com.tools20022.repository.msg.ATMDepositedMedia1> depositedMedia) {
		this.depositedMedia = depositedMedia;
	}

	@XmlElement(name = "ToBeRcncldMdiaCntrs")
	public List<ATMDepositedMedia3> getToBeReconciledMediaCounters() {
		return toBeReconciledMediaCounters;
	}

	public void setToBeReconciledMediaCounters(List<com.tools20022.repository.msg.ATMDepositedMedia3> toBeReconciledMediaCounters) {
		this.toBeReconciledMediaCounters = toBeReconciledMediaCounters;
	}

	@XmlElement(name = "ATMTtls")
	public List<ATMTotals1> getATMTotals() {
		return aTMTotals;
	}

	public void setATMTotals(List<com.tools20022.repository.msg.ATMTotals1> aTMTotals) {
		this.aTMTotals = aTMTotals;
	}

	@XmlElement(name = "Csstt")
	public List<ATMCassette2> getCassette() {
		return cassette;
	}

	public void setCassette(List<com.tools20022.repository.msg.ATMCassette2> cassette) {
		this.cassette = cassette;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}
}