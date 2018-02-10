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
import com.tools20022.repository.choice.CounterpartyIdentification2Choice;
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
 * Provides the details of each individual un<br>
 * secured market transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmReportedTransactionStatus
 * UnsecuredMarketTransaction3.mmReportedTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmBranchIdentification
 * UnsecuredMarketTransaction3.mmBranchIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmUniqueTransactionIdentifier
 * UnsecuredMarketTransaction3.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmProprietaryTransactionIdentification
 * UnsecuredMarketTransaction3.mmProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmCounterpartyProprietaryTransactionIdentification
 * UnsecuredMarketTransaction3.
 * mmCounterpartyProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmCounterpartyIdentification
 * UnsecuredMarketTransaction3.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTradeDate
 * UnsecuredMarketTransaction3.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmSettlementDate
 * UnsecuredMarketTransaction3.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmMaturityDate
 * UnsecuredMarketTransaction3.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTransactionType
 * UnsecuredMarketTransaction3.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmInstrumentType
 * UnsecuredMarketTransaction3.mmInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmTransactionNominalAmount
 * UnsecuredMarketTransaction3.mmTransactionNominalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmDealPrice
 * UnsecuredMarketTransaction3.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmRateType
 * UnsecuredMarketTransaction3.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmDealRate
 * UnsecuredMarketTransaction3.mmDealRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmFloatingRateNote
 * UnsecuredMarketTransaction3.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmBrokeredDeal
 * UnsecuredMarketTransaction3.mmBrokeredDeal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmCallPutOption
 * UnsecuredMarketTransaction3.mmCallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3#mmSupplementaryData
 * UnsecuredMarketTransaction3.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFloatingRateNotePresenceRule#forUnsecuredMarketTransaction3
 * ConstraintFloatingRateNotePresenceRule.forUnsecuredMarketTransaction3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDealRatePresenceRule#forUnsecuredMarketTransaction3
 * ConstraintDealRatePresenceRule.forUnsecuredMarketTransaction3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnsecuredMarketTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual un\r\nsecured market transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4
 * UnsecuredMarketTransaction4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2
 * UnsecuredMarketTransaction2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnsecuredMarketTransaction3", propOrder = {"reportedTransactionStatus", "branchIdentification", "uniqueTransactionIdentifier", "proprietaryTransactionIdentification", "counterpartyProprietaryTransactionIdentification",
		"counterpartyIdentification", "tradeDate", "settlementDate", "maturityDate", "transactionType", "instrumentType", "transactionNominalAmount", "dealPrice", "rateType", "dealRate", "floatingRateNote", "brokeredDeal", "callPutOption",
		"supplementaryData"})
public class UnsecuredMarketTransaction3 {

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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmReportedTransactionStatus
	 * UnsecuredMarketTransaction4.mmReportedTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmReportedTransactionStatus
	 * UnsecuredMarketTransaction2.mmReportedTransactionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RptdTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedTransactionStatus";
			definition = "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmReportedTransactionStatus);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmReportedTransactionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionOperationType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmBranchIdentification
	 * UnsecuredMarketTransaction4.mmBranchIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmBranchIdentification
	 * UnsecuredMarketTransaction2.mmBranchIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBranchIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Unique and unambiguous legal entity identification of the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmBranchIdentification);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmBranchIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmUniqueTransactionIdentifier);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryTransactionIdentification";
			definition = "Internal unique transaction identifier used by the reporting agent for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmProprietaryTransactionIdentification);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction4.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyProprietaryTransactionIdentification";
			definition = "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmCounterpartyProprietaryTransactionIdentification);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyId", required = true)
	protected CounterpartyIdentification2Choice counterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice
	 * CounterpartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
	 * CounterpartyRisk.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCounterpartyIdentification
	 * UnsecuredMarketTransaction4.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCounterpartyIdentification
	 * UnsecuredMarketTransaction2.mmCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CounterpartyRisk.mmParty;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identification of the counterparty of the reporting agent for the reported transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmCounterpartyIdentification);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmCounterpartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyIdentification2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTradeDate
	 * UnsecuredMarketTransaction4.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTradeDate
	 * UnsecuredMarketTransaction2.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmTradeDate);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmTradeDate;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * "Date on which the amount of money is exchanged by counterparties or on which the purchase or sale of a debt instrument settles. \r\nWith regard to call accounts and other unsecured borrowing/lending redeemable at notice, it is the date on which the deposit is rolled over, that is on which it would have been paid back if it had been called/not rolled over. In the case of a settlement failure in which settlement takes place on a different date than initially agreed, no transactional amendment needs to be reported."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmSettlementDate
	 * UnsecuredMarketTransaction4.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmSettlementDate
	 * UnsecuredMarketTransaction2.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money is exchanged by counterparties or on which the purchase or sale of a debt instrument settles. \r\nWith regard to call accounts and other unsecured borrowing/lending redeemable at notice, it is the date on which the deposit is rolled over, that is on which it would have been paid back if it had been called/not rolled over. In the case of a settlement failure in which settlement takes place on a different date than initially agreed, no transactional amendment needs to be reported.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmSettlementDate);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * "Date on which the amount of money is due to be repaid by the borrower to the lender or on which a debt instrument matures and is due to be paid back. In regards to callable and puttable instruments, the final maturity date must be provided. For call accounts and other unsecured borrowing/lending redeemable upon notice, the first date on which the instrument may be redeemed must be provided."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmMaturityDate
	 * UnsecuredMarketTransaction4.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmMaturityDate
	 * UnsecuredMarketTransaction2.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which the amount of money is due to be repaid by the borrower to the lender or on which a debt instrument matures and is due to be paid back. In regards to callable and puttable instruments, the final maturity date must be provided. For call accounts and other unsecured borrowing/lending redeemable upon notice, the first date on which the instrument may be redeemed must be provided.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmMaturityDate);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmMaturityDate;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionType
	 * UnsecuredMarketTransaction4.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionType
	 * UnsecuredMarketTransaction2.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Defines whether the transaction is a cash borrowing or cash lending transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmTransactionType);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyMarketTransactionType1Code.mmObject();
		}
	};
	@XmlElement(name = "InstrmTp", required = true)
	protected FinancialInstrumentProductType1Code instrumentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialInstrumentProductType1Code
	 * FinancialInstrumentProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetClassification#mmProductType
	 * AssetClassification.mmProductType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrmTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstrumentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines the instrument via which the borrowing or lending transaction takes place."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmInstrumentType
	 * UnsecuredMarketTransaction4.mmInstrumentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmInstrumentType
	 * UnsecuredMarketTransaction2.mmInstrumentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstrumentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "InstrmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentType";
			definition = "Defines the instrument via which the borrowing or lending transaction takes place.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmInstrumentType);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmInstrumentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * "Amount of money initially borrowed or lent on deposits. In the case of debt securities, it is the nominal amount of the security issued or purchased."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction4.mmTransactionNominalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNominalAmount";
			definition = "Amount of money initially borrowed or lent on deposits. In the case of debt securities, it is the nominal amount of the security issued or purchased.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmTransactionNominalAmount);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmTransactionNominalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "DealPric", required = true)
	protected PercentageRate dealPrice;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dirty price at which the security is issued or traded in percentage points, and which is to be reported as 100 for unsecured deposits."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealPrice
	 * UnsecuredMarketTransaction4.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealPrice
	 * UnsecuredMarketTransaction2.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Dirty price at which the security is issued or traded in percentage points, and which is to be reported as 100 for unsecured deposits.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmDealPrice);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmDealPrice;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * "Fixed rate for deposits and debt instruments with fixed coupons or variable rate for debt instruments for which the pay out at maturity or period depends on observed value of some underlying reference rate as well as for unsecured deposits paying interest at regular intervals. \r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmRateType
	 * UnsecuredMarketTransaction4.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmRateType
	 * UnsecuredMarketTransaction2.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Fixed rate for deposits and debt instruments with fixed coupons or variable rate for debt instruments for which the pay out at maturity or period depends on observed value of some underlying reference rate as well as for unsecured deposits paying interest at regular intervals. \r\n";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmRateType);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmRateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateType1Code.mmObject();
		}
	};
	@XmlElement(name = "DealRate")
	protected Rate2 dealRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmDealRate
	 * UnsecuredMarketTransaction4.mmDealRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealRate
	 * UnsecuredMarketTransaction2.mmDealRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "DealRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealRate";
			definition = "Interest rate expressed in accordance with the local money market convention at which the repurchase agreement has been concluded and at which the cash lent is remunerated.\r\n\r\nUsage:\r\nWhen the remuneration for securities lending transactions is represented by a fee amount, the fee amount will be translated into a deal rate per annum based on the ratio between the fee amount and the transaction nominal amount times number of days based on relevant money market convention divided by the number of days between the settlement date and the maturity of the transaction. \r\n\r\nOnly actual values, as opposed to estimated or default values, will be reported for this variable.\r\n\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of the transaction sign (that whether the transaction type is reported as borrowed or lent).";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmDealRate);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmDealRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	@XmlElement(name = "FltgRateNote")
	protected FloatingRateNote2 floatingRateNote;
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
	 * {@linkplain com.tools20022.repository.entity.Future Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FltgRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloatingRateNote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Debt instrument in which the periodic interest payments are calculated on the basis of the value (that is fixing of an underlying reference rate such as EURIBOR) on predefined dates (that is fixing) dates and which has a maturity of no more than one year."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmFloatingRateNote
	 * UnsecuredMarketTransaction4.mmFloatingRateNote}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmFloatingRateNote
	 * UnsecuredMarketTransaction2.mmFloatingRateNote}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFloatingRateNote = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Future.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "FltgRateNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Debt instrument in which the periodic interest payments are calculated on the basis of the value (that is fixing of an underlying reference rate such as EURIBOR) on predefined dates (that is fixing) dates and which has a maturity of no more than one year.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmFloatingRateNote);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmFloatingRateNote;
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmBrokeredDeal
	 * UnsecuredMarketTransaction4.mmBrokeredDeal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmBrokeredDeal
	 * UnsecuredMarketTransaction2.mmBrokeredDeal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBrokeredDeal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "BrkrdDeal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeredDeal";
			definition = "Specifies whether the transaction is arranged via a third party broker or not.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmBrokeredDeal);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmBrokeredDeal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BrokeredDeal1Code.mmObject();
		}
	};
	@XmlElement(name = "CallPutOptn")
	protected List<com.tools20022.repository.msg.Option12> callPutOption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Option12 Option12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CallPutOptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallPutOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the option details, when the transaction reported is a call/put option."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmCallPutOption
	 * UnsecuredMarketTransaction4.mmCallPutOption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCallPutOption
	 * UnsecuredMarketTransaction2.mmCallPutOption}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCallPutOption = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CallPutOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallPutOption";
			definition = "Provides the option details, when the transaction reported is a call/put option.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmCallPutOption);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmCallPutOption;
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Option12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction3
	 * UnsecuredMarketTransaction3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction4#mmSupplementaryData
	 * UnsecuredMarketTransaction4.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmSupplementaryData
	 * UnsecuredMarketTransaction2.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmSupplementaryData);
			previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmReportedTransactionStatus, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmBranchIdentification,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmUniqueTransactionIdentifier, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmProprietaryTransactionIdentification,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmCounterpartyProprietaryTransactionIdentification, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmCounterpartyIdentification,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmTradeDate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmSettlementDate,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmMaturityDate, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmTransactionType,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmInstrumentType, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmTransactionNominalAmount,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmDealPrice, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmRateType, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmDealRate,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmFloatingRateNote, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmBrokeredDeal,
						com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmCallPutOption, com.tools20022.repository.msg.UnsecuredMarketTransaction3.mmSupplementaryData);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFloatingRateNotePresenceRule.forUnsecuredMarketTransaction3,
						com.tools20022.repository.constraints.ConstraintDealRatePresenceRule.forUnsecuredMarketTransaction3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnsecuredMarketTransaction3";
				definition = "Provides the details of each individual un\r\nsecured market transaction.";
				nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction4.mmObject());
				previousVersion_lazy = () -> UnsecuredMarketTransaction2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionOperationType1Code getReportedTransactionStatus() {
		return reportedTransactionStatus;
	}

	public UnsecuredMarketTransaction3 setReportedTransactionStatus(TransactionOperationType1Code reportedTransactionStatus) {
		this.reportedTransactionStatus = Objects.requireNonNull(reportedTransactionStatus);
		return this;
	}

	public Optional<LEIIdentifier> getBranchIdentification() {
		return branchIdentification == null ? Optional.empty() : Optional.of(branchIdentification);
	}

	public UnsecuredMarketTransaction3 setBranchIdentification(LEIIdentifier branchIdentification) {
		this.branchIdentification = branchIdentification;
		return this;
	}

	public Optional<Max105Text> getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier == null ? Optional.empty() : Optional.of(uniqueTransactionIdentifier);
	}

	public UnsecuredMarketTransaction3 setUniqueTransactionIdentifier(Max105Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
		return this;
	}

	public Max105Text getProprietaryTransactionIdentification() {
		return proprietaryTransactionIdentification;
	}

	public UnsecuredMarketTransaction3 setProprietaryTransactionIdentification(Max105Text proprietaryTransactionIdentification) {
		this.proprietaryTransactionIdentification = Objects.requireNonNull(proprietaryTransactionIdentification);
		return this;
	}

	public Optional<Max105Text> getCounterpartyProprietaryTransactionIdentification() {
		return counterpartyProprietaryTransactionIdentification == null ? Optional.empty() : Optional.of(counterpartyProprietaryTransactionIdentification);
	}

	public UnsecuredMarketTransaction3 setCounterpartyProprietaryTransactionIdentification(Max105Text counterpartyProprietaryTransactionIdentification) {
		this.counterpartyProprietaryTransactionIdentification = counterpartyProprietaryTransactionIdentification;
		return this;
	}

	public CounterpartyIdentification2Choice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public UnsecuredMarketTransaction3 setCounterpartyIdentification(CounterpartyIdentification2Choice counterpartyIdentification) {
		this.counterpartyIdentification = Objects.requireNonNull(counterpartyIdentification);
		return this;
	}

	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public UnsecuredMarketTransaction3 setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public UnsecuredMarketTransaction3 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public UnsecuredMarketTransaction3 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = Objects.requireNonNull(maturityDate);
		return this;
	}

	public MoneyMarketTransactionType1Code getTransactionType() {
		return transactionType;
	}

	public UnsecuredMarketTransaction3 setTransactionType(MoneyMarketTransactionType1Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public FinancialInstrumentProductType1Code getInstrumentType() {
		return instrumentType;
	}

	public UnsecuredMarketTransaction3 setInstrumentType(FinancialInstrumentProductType1Code instrumentType) {
		this.instrumentType = Objects.requireNonNull(instrumentType);
		return this;
	}

	public ActiveCurrencyAndAmount getTransactionNominalAmount() {
		return transactionNominalAmount;
	}

	public UnsecuredMarketTransaction3 setTransactionNominalAmount(ActiveCurrencyAndAmount transactionNominalAmount) {
		this.transactionNominalAmount = Objects.requireNonNull(transactionNominalAmount);
		return this;
	}

	public PercentageRate getDealPrice() {
		return dealPrice;
	}

	public UnsecuredMarketTransaction3 setDealPrice(PercentageRate dealPrice) {
		this.dealPrice = Objects.requireNonNull(dealPrice);
		return this;
	}

	public InterestRateType1Code getRateType() {
		return rateType;
	}

	public UnsecuredMarketTransaction3 setRateType(InterestRateType1Code rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public Optional<Rate2> getDealRate() {
		return dealRate == null ? Optional.empty() : Optional.of(dealRate);
	}

	public UnsecuredMarketTransaction3 setDealRate(com.tools20022.repository.msg.Rate2 dealRate) {
		this.dealRate = dealRate;
		return this;
	}

	public Optional<FloatingRateNote2> getFloatingRateNote() {
		return floatingRateNote == null ? Optional.empty() : Optional.of(floatingRateNote);
	}

	public UnsecuredMarketTransaction3 setFloatingRateNote(com.tools20022.repository.msg.FloatingRateNote2 floatingRateNote) {
		this.floatingRateNote = floatingRateNote;
		return this;
	}

	public Optional<BrokeredDeal1Code> getBrokeredDeal() {
		return brokeredDeal == null ? Optional.empty() : Optional.of(brokeredDeal);
	}

	public UnsecuredMarketTransaction3 setBrokeredDeal(BrokeredDeal1Code brokeredDeal) {
		this.brokeredDeal = brokeredDeal;
		return this;
	}

	public List<Option12> getCallPutOption() {
		return callPutOption == null ? callPutOption = new ArrayList<>() : callPutOption;
	}

	public UnsecuredMarketTransaction3 setCallPutOption(List<com.tools20022.repository.msg.Option12> callPutOption) {
		this.callPutOption = Objects.requireNonNull(callPutOption);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public UnsecuredMarketTransaction3 setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}