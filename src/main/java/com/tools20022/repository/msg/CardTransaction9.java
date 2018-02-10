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
import com.tools20022.repository.codeset.CardServiceType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card transaction for which the authorisation has been requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmReconciliationType
 * CardTransaction9.mmReconciliationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmReconciliation
 * CardTransaction9.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInterBankSettlementDate
 * CardTransaction9.mmInterBankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInitiatorTransactionDateTime
 * CardTransaction9.mmInitiatorTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmInitiatorTransactionIdentification
 * CardTransaction9.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmTransactionLifeCycleIdentification
 * CardTransaction9.mmTransactionLifeCycleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmReconciliationTotals
 * CardTransaction9.mmReconciliationTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmAmountNetReconciliation
 * CardTransaction9.mmAmountNetReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction9#mmTransactionResponse
 * CardTransaction9.mmTransactionResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.ReconciliationTransaction
 * ReconciliationTransaction}</li>
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
 * "CardTransaction9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card transaction for which the authorisation has been requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction10
 * CardTransaction10}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransaction8 CardTransaction8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction9", propOrder = {"reconciliationType", "reconciliation", "interBankSettlementDate", "initiatorTransactionDateTime", "initiatorTransactionIdentification", "transactionLifeCycleIdentification",
		"reconciliationTotals", "amountNetReconciliation", "transactionResponse"})
public class CardTransaction9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcncltnTp")
	protected CardServiceType1Code reconciliationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardServiceType1Code
	 * CardServiceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of reconciliation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "RcncltnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationType";
			definition = "Type of reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CardServiceType1Code.mmObject();
		}
	};
	@XmlElement(name = "Rcncltn")
	protected TransactionIdentifier2 reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier2
	 * TransactionIdentifier2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcncltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reconciliation period between the acquirer and the issuer or their respective agents."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmReconciliation
	 * CardTransaction10.mmReconciliation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmReconciliation
	 * CardTransaction8.mmReconciliation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "Rcncltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Identification of the reconciliation period between the acquirer and the issuer or their respective agents.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmReconciliation);
			previousVersion_lazy = () -> CardTransaction8.mmReconciliation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier2.mmObject();
		}
	};
	@XmlElement(name = "IntrBkSttlmDt")
	protected ISODate interBankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterBankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the settlement is expected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInterBankSettlementDate
	 * CardTransaction10.mmInterBankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterBankSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBankSettlementDate";
			definition = "Date when the settlement is expected.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmInterBankSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "InitrTxDtTm", required = true)
	protected ISODateTime initiatorTransactionDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrTxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInitiatorTransactionDateTime
	 * CardTransaction10.mmInitiatorTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatorTransactionDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "InitrTxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionDateTime";
			definition = "Date and time of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmInitiatorTransactionDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "InitrTxId", required = true)
	protected Max35Text initiatorTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmInitiatorTransactionIdentifier
	 * CardPaymentAcquiring.mmInitiatorTransactionIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmInitiatorTransactionIdentification
	 * CardTransaction10.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmInitiatorTransactionIdentification
	 * CardTransaction8.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmInitiatorTransactionIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmInitiatorTransactionIdentification);
			previousVersion_lazy = () -> CardTransaction8.mmInitiatorTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxLifeCyclId")
	protected Max35Text transactionLifeCycleIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583:2003 field number 21."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmTransactionLifeCycleIdentification
	 * CardTransaction10.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionLifeCycleIdentification
	 * CardTransaction8.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionLifeCycleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleIdentification";
			definition = "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583:2003 field number 21.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmTransactionLifeCycleIdentification);
			previousVersion_lazy = () -> CardTransaction8.mmTransactionLifeCycleIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RcncltnTtls")
	protected TransactionTotals4 reconciliationTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionTotals4
	 * TransactionTotals4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Totals of the reconciliation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmReconciliationTotals
	 * CardTransaction10.mmReconciliationTotals}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationTotals = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "RcncltnTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationTotals";
			definition = "Totals of the reconciliation.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmReconciliationTotals);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionTotals4.mmObject();
		}
	};
	@XmlElement(name = "AmtNetRcncltn")
	protected AmountAndDirection41 amountNetReconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection41
	 * AmountAndDirection41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtNetRcncltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNetReconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net value of all gross amounts."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction10#mmAmountNetReconciliation
	 * CardTransaction10.mmAmountNetReconciliation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountNetReconciliation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "AmtNetRcncltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNetReconciliation";
			definition = "Net value of all gross amounts.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmAmountNetReconciliation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection41.mmObject();
		}
	};
	@XmlElement(name = "TxRspn")
	protected ResponseType2 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType2
	 * ResponseType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction9
	 * CardTransaction9}</li>
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
	 * definition} = "Response to the reconciliation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction9.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Response to the reconciliation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction9.mmReconciliationType, com.tools20022.repository.msg.CardTransaction9.mmReconciliation,
						com.tools20022.repository.msg.CardTransaction9.mmInterBankSettlementDate, com.tools20022.repository.msg.CardTransaction9.mmInitiatorTransactionDateTime,
						com.tools20022.repository.msg.CardTransaction9.mmInitiatorTransactionIdentification, com.tools20022.repository.msg.CardTransaction9.mmTransactionLifeCycleIdentification,
						com.tools20022.repository.msg.CardTransaction9.mmReconciliationTotals, com.tools20022.repository.msg.CardTransaction9.mmAmountNetReconciliation, com.tools20022.repository.msg.CardTransaction9.mmTransactionResponse);
				trace_lazy = () -> ReconciliationTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction9";
				definition = "Card transaction for which the authorisation has been requested.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction10.mmObject());
				previousVersion_lazy = () -> CardTransaction8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardServiceType1Code> getReconciliationType() {
		return reconciliationType == null ? Optional.empty() : Optional.of(reconciliationType);
	}

	public CardTransaction9 setReconciliationType(CardServiceType1Code reconciliationType) {
		this.reconciliationType = reconciliationType;
		return this;
	}

	public Optional<TransactionIdentifier2> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardTransaction9 setReconciliation(com.tools20022.repository.msg.TransactionIdentifier2 reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public Optional<ISODate> getInterBankSettlementDate() {
		return interBankSettlementDate == null ? Optional.empty() : Optional.of(interBankSettlementDate);
	}

	public CardTransaction9 setInterBankSettlementDate(ISODate interBankSettlementDate) {
		this.interBankSettlementDate = interBankSettlementDate;
		return this;
	}

	public ISODateTime getInitiatorTransactionDateTime() {
		return initiatorTransactionDateTime;
	}

	public CardTransaction9 setInitiatorTransactionDateTime(ISODateTime initiatorTransactionDateTime) {
		this.initiatorTransactionDateTime = Objects.requireNonNull(initiatorTransactionDateTime);
		return this;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public CardTransaction9 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = Objects.requireNonNull(initiatorTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getTransactionLifeCycleIdentification() {
		return transactionLifeCycleIdentification == null ? Optional.empty() : Optional.of(transactionLifeCycleIdentification);
	}

	public CardTransaction9 setTransactionLifeCycleIdentification(Max35Text transactionLifeCycleIdentification) {
		this.transactionLifeCycleIdentification = transactionLifeCycleIdentification;
		return this;
	}

	public Optional<TransactionTotals4> getReconciliationTotals() {
		return reconciliationTotals == null ? Optional.empty() : Optional.of(reconciliationTotals);
	}

	public CardTransaction9 setReconciliationTotals(com.tools20022.repository.msg.TransactionTotals4 reconciliationTotals) {
		this.reconciliationTotals = reconciliationTotals;
		return this;
	}

	public Optional<AmountAndDirection41> getAmountNetReconciliation() {
		return amountNetReconciliation == null ? Optional.empty() : Optional.of(amountNetReconciliation);
	}

	public CardTransaction9 setAmountNetReconciliation(com.tools20022.repository.msg.AmountAndDirection41 amountNetReconciliation) {
		this.amountNetReconciliation = amountNetReconciliation;
		return this;
	}

	public Optional<ResponseType2> getTransactionResponse() {
		return transactionResponse == null ? Optional.empty() : Optional.of(transactionResponse);
	}

	public CardTransaction9 setTransactionResponse(com.tools20022.repository.msg.ResponseType2 transactionResponse) {
		this.transactionResponse = transactionResponse;
		return this;
	}
}