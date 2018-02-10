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
import com.tools20022.repository.choice.CounterpartyIdentification3Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the details of each individual secured market transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmReportedTransactionStatus
 * SecuredMarketTransaction4.mmReportedTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmNovationStatus
 * SecuredMarketTransaction4.mmNovationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmBranchIdentification
 * SecuredMarketTransaction4.mmBranchIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmUniqueTransactionIdentifier
 * SecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmProprietaryTransactionIdentification
 * SecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRelatedProprietaryTransactionIdentification
 * SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
 * SecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCounterpartyIdentification
 * SecuredMarketTransaction4.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTripartyAgentIdentification
 * SecuredMarketTransaction4.mmTripartyAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTradeDate
 * SecuredMarketTransaction4.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmSettlementDate
 * SecuredMarketTransaction4.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmMaturityDate
 * SecuredMarketTransaction4.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionType
 * SecuredMarketTransaction4.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmTransactionNominalAmount
 * SecuredMarketTransaction4.mmTransactionNominalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmRateType
 * SecuredMarketTransaction4.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmDealRate
 * SecuredMarketTransaction4.mmDealRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmFloatingRateRepurchaseAgreement
 * SecuredMarketTransaction4.mmFloatingRateRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmBrokeredDeal
 * SecuredMarketTransaction4.mmBrokeredDeal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmCollateral
 * SecuredMarketTransaction4.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4#mmSupplementaryData
 * SecuredMarketTransaction4.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule#forSecuredMarketTransaction4
 * ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDealRatePresenceRule#forSecuredMarketTransaction4
 * ConstraintDealRatePresenceRule.forSecuredMarketTransaction4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuredMarketTransaction4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual secured market transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3
 * SecuredMarketTransaction3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuredMarketTransaction4", propOrder = {"reportedTransactionStatus", "novationStatus", "branchIdentification", "uniqueTransactionIdentifier", "proprietaryTransactionIdentification",
		"relatedProprietaryTransactionIdentification", "counterpartyProprietaryTransactionIdentification", "counterpartyIdentification", "tripartyAgentIdentification", "tradeDate", "settlementDate", "maturityDate", "transactionType",
		"transactionNominalAmount", "rateType", "dealRate", "floatingRateRepurchaseAgreement", "brokeredDeal", "collateral", "supplementaryData"})
public class SecuredMarketTransaction4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptdTxSts", required = true)
	protected TransactionOperationType1Code reportedTransactionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionOperationType1Code
	 * TransactionOperationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptdTxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedTransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmReportedTransactionStatus
	 * SecuredMarketTransaction3.mmReportedTransactionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RptdTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedTransactionStatus";
			definition = "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmReportedTransactionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionOperationType1Code.mmObject();
		}
	};
	@XmlElement(name = "NvtnSts")
	protected NovationStatus1Code novationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NovationStatus1Code
	 * NovationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Novation#mmNovationStatus
	 * Novation.mmNovationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NvtnSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NovationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the novation status for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNovationStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Novation.mmNovationStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "NvtnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NovationStatus";
			definition = "Provides the novation status for the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NovationStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "BrnchId")
	protected LEIIdentifier branchIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrnchId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BranchIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous legal entity identification of the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmBranchIdentification
	 * SecuredMarketTransaction3.mmBranchIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBranchIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Unique and unambiguous legal entity identification of the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmBranchIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "UnqTxIdr")
	protected Max105Text uniqueTransactionIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction3.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmUniqueTransactionIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	@XmlElement(name = "PrtryTxId", required = true)
	protected Max105Text proprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal unique transaction identifier used by the reporting agent for each transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "PrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryTransactionIdentification";
			definition = "Internal unique transaction identifier used by the reporting agent for each transaction.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	@XmlElement(name = "RltdPrtryTxId")
	protected Max105Text relatedProprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original proprietary transaction identifier used by the reporting agent to indicate the proprietary transaction identification of the transaction which is novated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RltdPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedProprietaryTransactionIdentification";
			definition = "Original proprietary transaction identifier used by the reporting agent to indicate the proprietary transaction identification of the transaction which is novated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyPrtryTxId")
	protected Max105Text counterpartyProprietaryTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyPrtryTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyProprietaryTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyProprietaryTransactionIdentification";
			definition = "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmCounterpartyProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyId", required = true)
	protected CounterpartyIdentification3Choice counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification3Choice
	 * CounterpartyIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the counterparty of the reporting agent for the reported transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCounterpartyIdentification
	 * SecuredMarketTransaction3.mmCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identification of the counterparty of the reporting agent for the reported transaction.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmCounterpartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyIdentification3Choice.mmObject();
		}
	};
	@XmlElement(name = "TrptyAgtId")
	protected LEIIdentifier tripartyAgentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the tri-party agent, when the transaction has been performed via tri-party agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTripartyAgentIdentification
	 * SecuredMarketTransaction3.mmTripartyAgentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentification";
			definition = "Identification of the tri-party agent, when the transaction has been performed via tri-party agent.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmTripartyAgentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTradeDate
	 * SecuredMarketTransaction3.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money is initially exchanged versus the asset as contractually agreed.\r\n\r\nUsage:\r\nIn the case of open basis repurchase transactions, this is the date on which the rollover settles (even if no exchange of an amount of money takes place).\r\nIn the case of a settlement failure in which settlement takes place on a date different than initially agreed, no transactional amendment needs to be reported."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmSettlementDate
	 * SecuredMarketTransaction3.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money is initially exchanged versus the asset as contractually agreed.\r\n\r\nUsage:\r\nIn the case of open basis repurchase transactions, this is the date on which the rollover settles (even if no exchange of an amount of money takes place).\r\nIn the case of a settlement failure in which settlement takes place on a date different than initially agreed, no transactional amendment needs to be reported.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDt", required = true)
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the repurchase will be executed, that is the date on which the amount of money is due to be returned or received versus the asset pledged or received as collateral."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmMaturityDate
	 * SecuredMarketTransaction3.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which the repurchase will be executed, that is the date on which the amount of money is due to be returned or received versus the asset pledged or received as collateral.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TxTp", required = true)
	protected MoneyMarketTransactionType1Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyMarketTransactionType1Code
	 * MoneyMarketTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
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
	 * "Defines whether the transaction is a cash borrowing or cash lending transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionType
	 * SecuredMarketTransaction3.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Defines whether the transaction is a cash borrowing or cash lending transaction.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyMarketTransactionType1Code.mmObject();
		}
	};
	@XmlElement(name = "TxNmnlAmt", required = true)
	protected ActiveCurrencyAndAmount transactionNominalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAmount
	 * PaymentObligation.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxNmnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money initially borrowed or lent to be reported as an absolute value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionNominalAmount
	 * SecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "TxNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNominalAmount";
			definition = "Amount of money initially borrowed or lent to be reported as an absolute value.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmTransactionNominalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RateTp", required = true)
	protected InterestRateType1Code rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRateType1Code
	 * InterestRateType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmTypeOfInterest
	 * Interest.mmTypeOfInterest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction interest rate of the repurchase agreements is either fixed or floating (variable rate)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmRateType
	 * SecuredMarketTransaction3.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the transaction interest rate of the repurchase agreements is either fixed or floating (variable rate).";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmRateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateType1Code.mmObject();
		}
	};
	@XmlElement(name = "DealRate")
	protected PercentageRate dealRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest rate expressed in accordance with the local money market convention at which the repurchase agreement has been concluded and at which the cash lent is remunerated.\r\n\r\nUsage:\r\nWhen the remuneration for securities lending transactions is represented by a fee amount, the fee amount will be translated into a deal rate per annum based on the ratio between the fee amount and the transaction nominal amount times number of days based on relevant money market convention divided by the number of days between the settlement date and the maturity of the transaction. \r\n\r\nOnly actual values, as opposed to estimated or default values, will be reported for this variable.\r\n\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of the transaction sign (that whether the transaction type is reported as borrowed or lent)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmDealRate
	 * SecuredMarketTransaction3.mmDealRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "DealRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealRate";
			definition = "Interest rate expressed in accordance with the local money market convention at which the repurchase agreement has been concluded and at which the cash lent is remunerated.\r\n\r\nUsage:\r\nWhen the remuneration for securities lending transactions is represented by a fee amount, the fee amount will be translated into a deal rate per annum based on the ratio between the fee amount and the transaction nominal amount times number of days based on relevant money market convention divided by the number of days between the settlement date and the maturity of the transaction. \r\n\r\nOnly actual values, as opposed to estimated or default values, will be reported for this variable.\r\n\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of the transaction sign (that whether the transaction type is reported as borrowed or lent).";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmDealRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "FltgRateRpAgrmt")
	protected FloatingRateNote2 floatingRateRepurchaseAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingRateNote2
	 * FloatingRateNote2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateRpAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase agreement in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmFloatingRateRepurchaseAgreement
	 * SecuredMarketTransaction3.mmFloatingRateRepurchaseAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFloatingRateRepurchaseAgreement = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RepurchaseAgreement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "FltgRateRpAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateRepurchaseAgreement";
			definition = "Repurchase agreement in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmFloatingRateRepurchaseAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FloatingRateNote2.mmObject();
		}
	};
	@XmlElement(name = "BrkrdDeal")
	protected BrokeredDeal1Code brokeredDeal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BrokeredDeal1Code
	 * BrokeredDeal1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkrdDeal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokeredDeal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is arranged via a third party broker or not."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmBrokeredDeal
	 * SecuredMarketTransaction3.mmBrokeredDeal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBrokeredDeal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "BrkrdDeal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeredDeal";
			definition = "Specifies whether the transaction is arranged via a third party broker or not.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmBrokeredDeal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BrokeredDeal1Code.mmObject();
		}
	};
	@XmlElement(name = "Coll", required = true)
	protected Collateral18 collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral18
	 * Collateral18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
	 * CollateralManagement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the asset class pledged as collateral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCollateral
	 * SecuredMarketTransaction3.mmCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Identifies the asset class pledged as collateral.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmCollateral;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Collateral18.mmObject();
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction4
	 * SecuredMarketTransaction4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmSupplementaryData
	 * SecuredMarketTransaction3.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuredMarketTransaction4.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			previousVersion_lazy = () -> SecuredMarketTransaction3.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuredMarketTransaction4.mmReportedTransactionStatus, com.tools20022.repository.msg.SecuredMarketTransaction4.mmNovationStatus,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmBranchIdentification, com.tools20022.repository.msg.SecuredMarketTransaction4.mmUniqueTransactionIdentifier,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction4.mmRelatedProprietaryTransactionIdentification,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.SecuredMarketTransaction4.mmCounterpartyIdentification,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmTripartyAgentIdentification, com.tools20022.repository.msg.SecuredMarketTransaction4.mmTradeDate,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmSettlementDate, com.tools20022.repository.msg.SecuredMarketTransaction4.mmMaturityDate,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmTransactionType, com.tools20022.repository.msg.SecuredMarketTransaction4.mmTransactionNominalAmount,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmRateType, com.tools20022.repository.msg.SecuredMarketTransaction4.mmDealRate,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmFloatingRateRepurchaseAgreement, com.tools20022.repository.msg.SecuredMarketTransaction4.mmBrokeredDeal,
						com.tools20022.repository.msg.SecuredMarketTransaction4.mmCollateral, com.tools20022.repository.msg.SecuredMarketTransaction4.mmSupplementaryData);
				trace_lazy = () -> RepurchaseAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTripartyAgentIdentificationRule.forSecuredMarketTransaction4,
						com.tools20022.repository.constraints.ConstraintDealRatePresenceRule.forSecuredMarketTransaction4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuredMarketTransaction4";
				definition = "Provides the details of each individual secured market transaction.";
				previousVersion_lazy = () -> SecuredMarketTransaction3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionOperationType1Code getReportedTransactionStatus() {
		return reportedTransactionStatus;
	}

	public SecuredMarketTransaction4 setReportedTransactionStatus(TransactionOperationType1Code reportedTransactionStatus) {
		this.reportedTransactionStatus = Objects.requireNonNull(reportedTransactionStatus);
		return this;
	}

	public Optional<NovationStatus1Code> getNovationStatus() {
		return novationStatus == null ? Optional.empty() : Optional.of(novationStatus);
	}

	public SecuredMarketTransaction4 setNovationStatus(NovationStatus1Code novationStatus) {
		this.novationStatus = novationStatus;
		return this;
	}

	public Optional<LEIIdentifier> getBranchIdentification() {
		return branchIdentification == null ? Optional.empty() : Optional.of(branchIdentification);
	}

	public SecuredMarketTransaction4 setBranchIdentification(LEIIdentifier branchIdentification) {
		this.branchIdentification = branchIdentification;
		return this;
	}

	public Optional<Max105Text> getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier == null ? Optional.empty() : Optional.of(uniqueTransactionIdentifier);
	}

	public SecuredMarketTransaction4 setUniqueTransactionIdentifier(Max105Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
		return this;
	}

	public Max105Text getProprietaryTransactionIdentification() {
		return proprietaryTransactionIdentification;
	}

	public SecuredMarketTransaction4 setProprietaryTransactionIdentification(Max105Text proprietaryTransactionIdentification) {
		this.proprietaryTransactionIdentification = Objects.requireNonNull(proprietaryTransactionIdentification);
		return this;
	}

	public Optional<Max105Text> getRelatedProprietaryTransactionIdentification() {
		return relatedProprietaryTransactionIdentification == null ? Optional.empty() : Optional.of(relatedProprietaryTransactionIdentification);
	}

	public SecuredMarketTransaction4 setRelatedProprietaryTransactionIdentification(Max105Text relatedProprietaryTransactionIdentification) {
		this.relatedProprietaryTransactionIdentification = relatedProprietaryTransactionIdentification;
		return this;
	}

	public Optional<Max105Text> getCounterpartyProprietaryTransactionIdentification() {
		return counterpartyProprietaryTransactionIdentification == null ? Optional.empty() : Optional.of(counterpartyProprietaryTransactionIdentification);
	}

	public SecuredMarketTransaction4 setCounterpartyProprietaryTransactionIdentification(Max105Text counterpartyProprietaryTransactionIdentification) {
		this.counterpartyProprietaryTransactionIdentification = counterpartyProprietaryTransactionIdentification;
		return this;
	}

	public CounterpartyIdentification3Choice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public SecuredMarketTransaction4 setCounterpartyIdentification(CounterpartyIdentification3Choice counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public Optional<LEIIdentifier> getTripartyAgentIdentification() {
		return tripartyAgentIdentification == null ? Optional.empty() : Optional.of(tripartyAgentIdentification);
	}

	public SecuredMarketTransaction4 setTripartyAgentIdentification(LEIIdentifier tripartyAgentIdentification) {
		this.tripartyAgentIdentification = tripartyAgentIdentification;
		return this;
	}

	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public SecuredMarketTransaction4 setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public SecuredMarketTransaction4 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public SecuredMarketTransaction4 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public MoneyMarketTransactionType1Code getTransactionType() {
		return transactionType;
	}

	public SecuredMarketTransaction4 setTransactionType(MoneyMarketTransactionType1Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public ActiveCurrencyAndAmount getTransactionNominalAmount() {
		return transactionNominalAmount;
	}

	public SecuredMarketTransaction4 setTransactionNominalAmount(ActiveCurrencyAndAmount transactionNominalAmount) {
		this.transactionNominalAmount = Objects.requireNonNull(transactionNominalAmount);
		return this;
	}

	public InterestRateType1Code getRateType() {
		return rateType;
	}

	public SecuredMarketTransaction4 setRateType(InterestRateType1Code rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public Optional<PercentageRate> getDealRate() {
		return dealRate == null ? Optional.empty() : Optional.of(dealRate);
	}

	public SecuredMarketTransaction4 setDealRate(PercentageRate dealRate) {
		this.dealRate = dealRate;
		return this;
	}

	public Optional<FloatingRateNote2> getFloatingRateRepurchaseAgreement() {
		return floatingRateRepurchaseAgreement == null ? Optional.empty() : Optional.of(floatingRateRepurchaseAgreement);
	}

	public SecuredMarketTransaction4 setFloatingRateRepurchaseAgreement(com.tools20022.repository.msg.FloatingRateNote2 floatingRateRepurchaseAgreement) {
		this.floatingRateRepurchaseAgreement = floatingRateRepurchaseAgreement;
		return this;
	}

	public Optional<BrokeredDeal1Code> getBrokeredDeal() {
		return brokeredDeal == null ? Optional.empty() : Optional.of(brokeredDeal);
	}

	public SecuredMarketTransaction4 setBrokeredDeal(BrokeredDeal1Code brokeredDeal) {
		this.brokeredDeal = brokeredDeal;
		return this;
	}

	public Collateral18 getCollateral() {
		return collateral;
	}

	public SecuredMarketTransaction4 setCollateral(com.tools20022.repository.msg.Collateral18 collateral) {
		this.collateral = Objects.requireNonNull(collateral);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuredMarketTransaction4 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}