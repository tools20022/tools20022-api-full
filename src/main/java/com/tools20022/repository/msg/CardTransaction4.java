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
import com.tools20022.repository.codeset.CardPaymentServiceType7Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CardPaymentValidation;
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
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionType
 * CardTransaction4.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmReconciliation
 * CardTransaction4.mmReconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAcceptorTransactionDateTime
 * CardTransaction4.mmAcceptorTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmInitiatorTransactionIdentification
 * CardTransaction4.mmInitiatorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionLifeCycleIdentification
 * CardTransaction4.mmTransactionLifeCycleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionLifeCycleSequenceNumber
 * CardTransaction4.mmTransactionLifeCycleSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionLifeCycleSequenceCounter
 * CardTransaction4.mmTransactionLifeCycleSequenceCounter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmCardIssuerReferenceData
 * CardTransaction4.mmCardIssuerReferenceData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmTransactionDetails
 * CardTransaction4.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransaction4#mmAuthorisationResult
 * CardTransaction4.mmAuthorisationResult}</li>
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
 * "CardTransaction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card transaction for which the authorisation has been requested."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction6
 * CardTransaction6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardTransaction8
 * CardTransaction8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransaction15
 * CardTransaction15}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransaction4", propOrder = {"transactionType", "reconciliation", "acceptorTransactionDateTime", "initiatorTransactionIdentification", "transactionLifeCycleIdentification", "transactionLifeCycleSequenceNumber",
		"transactionLifeCycleSequenceCounter", "cardIssuerReferenceData", "transactionDetails", "authorisationResult"})
public class CardTransaction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTp", required = true)
	protected CardPaymentServiceType7Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType7Code
	 * CardPaymentServiceType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmCardPaymentService
	 * CardPaymentAcquiring.mmCardPaymentService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583, field number 3."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionType
	 * CardTransaction6.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionType
	 * CardTransaction8.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionType
	 * CardTransaction15.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmCardPaymentService;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of transaction being undertaken for the main service. \r\nIt correspond partially to the ISO 8583, field number 3.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmTransactionType, CardTransaction8.mmTransactionType);
			previousVersion_lazy = () -> CardTransaction15.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CardPaymentServiceType7Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmReconciliation
	 * CardTransaction6.mmReconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmReconciliation
	 * CardTransaction8.mmReconciliation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmReconciliation
	 * CardTransaction15.mmReconciliation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "Rcncltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Identification of the reconciliation period between the acquirer and the issuer or their respective agents.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmReconciliation, CardTransaction8.mmReconciliation);
			previousVersion_lazy = () -> CardTransaction15.mmReconciliation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier2.mmObject();
		}
	};
	@XmlElement(name = "AccptrTxDtTm", required = true)
	protected ISODateTime acceptorTransactionDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionDateTime
	 * CardPaymentAcquiring.mmTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptrTxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583, field number 12."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmAcceptorTransactionDateTime
	 * CardTransaction6.mmAcceptorTransactionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmAcceptorTransactionDateTime
	 * CardTransaction8.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAcceptorTransactionDateTime
	 * CardTransaction15.mmAcceptorTransactionDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAcceptorTransactionDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "AccptrTxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorTransactionDateTime";
			definition = "Date and time of the transaction transported unchanged by the acquirer from the card acceptor to the issuer. Corresponds to the CAPE data element TransactionIdentification/ TransactionDateTime.\r\nIt correspond to the ISO 8583, field number 12.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmAcceptorTransactionDateTime, CardTransaction8.mmAcceptorTransactionDateTime);
			previousVersion_lazy = () -> CardTransaction15.mmAcceptorTransactionDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTransactionIdentification
	 * CardPaymentAcquiring.mmTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmInitiatorTransactionIdentification
	 * CardTransaction6.mmInitiatorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmInitiatorTransactionIdentification
	 * CardTransaction8.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmInitiatorTransactionIdentification
	 * CardTransaction15.mmInitiatorTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "InitrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatorTransactionIdentification";
			definition = "Number generated by the transaction Initiator to assist in identifying a transaction uniquely. This value remains unchanged for all messages within a message pair exchange, for instance an initiation/response. It corresponds to the ISO 8583 field number 11.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmInitiatorTransactionIdentification, CardTransaction8.mmInitiatorTransactionIdentification);
			previousVersion_lazy = () -> CardTransaction15.mmInitiatorTransactionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionLifeCycleIdentification
	 * CardTransaction6.mmTransactionLifeCycleIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionLifeCycleIdentification
	 * CardTransaction8.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleIdentification
	 * CardTransaction15.mmTransactionLifeCycleIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionLifeCycleIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleIdentification";
			definition = "Unique identification to match transactions throughout their life cycle (for example, authorisation to financial presentment, financial presentment to chargeback). It shall contain the same value in all messages throughout a transaction’s life cycle. It corresponds partially to ISO 8583:2003 field number 21.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmTransactionLifeCycleIdentification, CardTransaction8.mmTransactionLifeCycleIdentification);
			previousVersion_lazy = () -> CardTransaction15.mmTransactionLifeCycleIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TxLifeCyclSeqNb")
	protected Number transactionLifeCycleSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583:2003, field number 21."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction6.mmTransactionLifeCycleSequenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction8.mmTransactionLifeCycleSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionLifeCycleSequenceNumber
	 * CardTransaction15.mmTransactionLifeCycleSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionLifeCycleSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceNumber";
			definition = "Life cycle transaction sequence number when multiple authorisations are performed for the same presentment.\r\nIt corresponds partially to ISO 8583:2003, field number 21.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmTransactionLifeCycleSequenceNumber, CardTransaction8.mmTransactionLifeCycleSequenceNumber);
			previousVersion_lazy = () -> CardTransaction15.mmTransactionLifeCycleSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "TxLifeCyclSeqCntr")
	protected Number transactionLifeCycleSequenceCounter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxLifeCyclSeqCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionLifeCycleSequenceCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of transactions under the same life cycle transaction sequence number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionLifeCycleSequenceCounter
	 * CardTransaction6.mmTransactionLifeCycleSequenceCounter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionLifeCycleSequenceCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxLifeCyclSeqCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionLifeCycleSequenceCounter";
			definition = "Total number of transactions under the same life cycle transaction sequence number.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmTransactionLifeCycleSequenceCounter);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "CardIssrRefData")
	protected Max140Text cardIssuerReferenceData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardIssrRefData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardIssuerReferenceData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data supplied by a card issuer in response messages or in issuer generated messages, that the acquirer may be required to be provided in subsequent messages. It corresponds to ISO 8583:93 and 2003 field number 95."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardIssuerReferenceData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CardIssrRefData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardIssuerReferenceData";
			definition = "Data supplied by a card issuer in response messages or in issuer generated messages, that the acquirer may be required to be provided in subsequent messages. It corresponds to ISO 8583:93 and 2003 field number 95.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "TxDtls", required = true)
	protected CardTransactionDetail2 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionDetail2
	 * CardTransactionDetail2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the card transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmTransactionDetails
	 * CardTransaction6.mmTransactionDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction8#mmTransactionDetails
	 * CardTransaction8.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmTransactionDetails
	 * CardTransaction15.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Details of the card transaction.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmTransactionDetails, CardTransaction8.mmTransactionDetails);
			previousVersion_lazy = () -> CardTransaction15.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail2.mmObject();
		}
	};
	@XmlElement(name = "AuthstnRslt")
	protected AuthorisationResult8 authorisationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult8
	 * AuthorisationResult8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction4
	 * CardTransaction4}</li>
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
	 * definition} = "Outcome of the authorisation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardTransaction6#mmAuthorisationResult
	 * CardTransaction6.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransaction15#mmAuthorisationResult
	 * CardTransaction15.mmAuthorisationResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransaction4.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmAuthorisationResult);
			previousVersion_lazy = () -> CardTransaction15.mmAuthorisationResult;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult8.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransaction4.mmTransactionType, com.tools20022.repository.msg.CardTransaction4.mmReconciliation,
						com.tools20022.repository.msg.CardTransaction4.mmAcceptorTransactionDateTime, com.tools20022.repository.msg.CardTransaction4.mmInitiatorTransactionIdentification,
						com.tools20022.repository.msg.CardTransaction4.mmTransactionLifeCycleIdentification, com.tools20022.repository.msg.CardTransaction4.mmTransactionLifeCycleSequenceNumber,
						com.tools20022.repository.msg.CardTransaction4.mmTransactionLifeCycleSequenceCounter, com.tools20022.repository.msg.CardTransaction4.mmCardIssuerReferenceData,
						com.tools20022.repository.msg.CardTransaction4.mmTransactionDetails, com.tools20022.repository.msg.CardTransaction4.mmAuthorisationResult);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransaction4";
				definition = "Card transaction for which the authorisation has been requested.";
				nextVersions_lazy = () -> Arrays.asList(CardTransaction6.mmObject(), CardTransaction8.mmObject());
				previousVersion_lazy = () -> CardTransaction15.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentServiceType7Code getTransactionType() {
		return transactionType;
	}

	public CardTransaction4 setTransactionType(CardPaymentServiceType7Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public Optional<TransactionIdentifier2> getReconciliation() {
		return reconciliation == null ? Optional.empty() : Optional.of(reconciliation);
	}

	public CardTransaction4 setReconciliation(com.tools20022.repository.msg.TransactionIdentifier2 reconciliation) {
		this.reconciliation = reconciliation;
		return this;
	}

	public ISODateTime getAcceptorTransactionDateTime() {
		return acceptorTransactionDateTime;
	}

	public CardTransaction4 setAcceptorTransactionDateTime(ISODateTime acceptorTransactionDateTime) {
		this.acceptorTransactionDateTime = Objects.requireNonNull(acceptorTransactionDateTime);
		return this;
	}

	public Max35Text getInitiatorTransactionIdentification() {
		return initiatorTransactionIdentification;
	}

	public CardTransaction4 setInitiatorTransactionIdentification(Max35Text initiatorTransactionIdentification) {
		this.initiatorTransactionIdentification = Objects.requireNonNull(initiatorTransactionIdentification);
		return this;
	}

	public Optional<Max35Text> getTransactionLifeCycleIdentification() {
		return transactionLifeCycleIdentification == null ? Optional.empty() : Optional.of(transactionLifeCycleIdentification);
	}

	public CardTransaction4 setTransactionLifeCycleIdentification(Max35Text transactionLifeCycleIdentification) {
		this.transactionLifeCycleIdentification = transactionLifeCycleIdentification;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceNumber() {
		return transactionLifeCycleSequenceNumber == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceNumber);
	}

	public CardTransaction4 setTransactionLifeCycleSequenceNumber(Number transactionLifeCycleSequenceNumber) {
		this.transactionLifeCycleSequenceNumber = transactionLifeCycleSequenceNumber;
		return this;
	}

	public Optional<Number> getTransactionLifeCycleSequenceCounter() {
		return transactionLifeCycleSequenceCounter == null ? Optional.empty() : Optional.of(transactionLifeCycleSequenceCounter);
	}

	public CardTransaction4 setTransactionLifeCycleSequenceCounter(Number transactionLifeCycleSequenceCounter) {
		this.transactionLifeCycleSequenceCounter = transactionLifeCycleSequenceCounter;
		return this;
	}

	public Optional<Max140Text> getCardIssuerReferenceData() {
		return cardIssuerReferenceData == null ? Optional.empty() : Optional.of(cardIssuerReferenceData);
	}

	public CardTransaction4 setCardIssuerReferenceData(Max140Text cardIssuerReferenceData) {
		this.cardIssuerReferenceData = cardIssuerReferenceData;
		return this;
	}

	public CardTransactionDetail2 getTransactionDetails() {
		return transactionDetails;
	}

	public CardTransaction4 setTransactionDetails(com.tools20022.repository.msg.CardTransactionDetail2 transactionDetails) {
		this.transactionDetails = Objects.requireNonNull(transactionDetails);
		return this;
	}

	public Optional<AuthorisationResult8> getAuthorisationResult() {
		return authorisationResult == null ? Optional.empty() : Optional.of(authorisationResult);
	}

	public CardTransaction4 setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult8 authorisationResult) {
		this.authorisationResult = authorisationResult;
		return this;
	}
}