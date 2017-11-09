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
import com.tools20022.repository.codeset.BrokeredDeal1Code;
import com.tools20022.repository.codeset.InterestRateType1Code;
import com.tools20022.repository.codeset.MoneyMarketTransactionType1Code;
import com.tools20022.repository.codeset.TransactionOperationType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmReportedTransactionStatus
 * SecuredMarketTransaction2.mmReportedTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmBranchIdentification
 * SecuredMarketTransaction2.mmBranchIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmUniqueTransactionIdentifier
 * SecuredMarketTransaction2.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmProprietaryTransactionIdentification
 * SecuredMarketTransaction2.mmProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmCounterpartyProprietaryTransactionIdentification
 * SecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmCounterpartyIdentification
 * SecuredMarketTransaction2.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTripartyAgentIdentification
 * SecuredMarketTransaction2.mmTripartyAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTradeDate
 * SecuredMarketTransaction2.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmSettlementDate
 * SecuredMarketTransaction2.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmMaturityDate
 * SecuredMarketTransaction2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTransactionType
 * SecuredMarketTransaction2.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmTransactionNominalAmount
 * SecuredMarketTransaction2.mmTransactionNominalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmRateType
 * SecuredMarketTransaction2.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmDealRate
 * SecuredMarketTransaction2.mmDealRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmFloatingRateRepurchaseAgreement
 * SecuredMarketTransaction2.mmFloatingRateRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmBrokeredDeal
 * SecuredMarketTransaction2.mmBrokeredDeal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmCollateral
 * SecuredMarketTransaction2.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2#mmSupplementaryData
 * SecuredMarketTransaction2.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
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
 * "SecuredMarketTransaction2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual secured market transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3
 * SecuredMarketTransaction3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1
 * SecuredMarketTransaction1}</li>
 * </ul>
 */
public class SecuredMarketTransaction2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionOperationType1Code reportedTransactionStatus;
	/**
	 * Defines the status of the reported transaction, that is details on
	 * whether the transaction is a new transaction, an amendment of a
	 * previously reported transaction, a cancellation of a previously reported
	 * transaction or a correction to a previously reported and rejected
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmReportedTransactionStatus
	 * SecuredMarketTransaction3.mmReportedTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmReportedTransactionStatus
	 * SecuredMarketTransaction1.mmReportedTransactionStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RptdTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedTransactionStatus";
			definition = "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmReportedTransactionStatus);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmReportedTransactionStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionOperationType1Code.mmObject();
		}
	};
	protected LEIIdentifier branchIdentification;
	/**
	 * Unique and unambiguous legal entity identification of the branch of the
	 * reporting agent in which the transaction has been booked.<br>
	 * <br>
	 * Usage: This field must only be provided if the transaction has been
	 * conducted and booked by a branch of the reporting agent and only if this
	 * branch has its own LEI that the reporting agent can clearly identify. <br>
	 * Where the transaction has been booked by the head office or the reporting
	 * agent cannot be identified by a unique branch-specific LEI, the reporting
	 * agent must provide the LEI of the head office.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * "Unique and unambiguous legal entity identification of  the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmBranchIdentification
	 * SecuredMarketTransaction3.mmBranchIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBranchIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "BrnchId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BranchIdentification";
			definition = "Unique and unambiguous legal entity identification of  the branch of the reporting agent in which the transaction has been booked.\r\n\r\nUsage: This field must only be provided if the transaction has been conducted and booked by a branch of the reporting agent and only if this branch has its own LEI that the reporting agent can clearly identify. \r\nWhere the transaction has been booked by the head office or the reporting agent cannot be identified by a unique branch-specific LEI, the reporting agent must provide the LEI of the head office.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmBranchIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected Max105Text uniqueTransactionIdentifier;
	/**
	 * Unique transaction identifier will be created at the time a transaction
	 * is first executed, shared with all registered entities and counterparties
	 * involved in the transaction, and used to track that particular
	 * transaction during its lifetime.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction3.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmUniqueTransactionIdentifier
	 * SecuredMarketTransaction1.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmUniqueTransactionIdentifier);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmUniqueTransactionIdentifier;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected Max105Text proprietaryTransactionIdentification;
	/**
	 * Internal unique transaction identifier used by the reporting agent for
	 * each transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * "Internal unique transaction identifier used by the reporting agent for each transaction. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "PrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryTransactionIdentification";
			definition = "Internal unique transaction identifier used by the reporting agent for each transaction. ";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmProprietaryTransactionIdentification);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected Max105Text counterpartyProprietaryTransactionIdentification;
	/**
	 * Internal unique proprietary transaction identifier as assigned by the
	 * counterparty of the reporting agent for each transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction3.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmCounterpartyProprietaryTransactionIdentification
	 * SecuredMarketTransaction1.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyProprietaryTransactionIdentification";
			definition = "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmCounterpartyProprietaryTransactionIdentification);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmCounterpartyProprietaryTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected CounterpartyIdentification2Choice counterpartyIdentification;
	/**
	 * Identification of the counterparty of the reporting agent for the
	 * reported transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification2Choice
	 * CounterpartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * "Identification of the counterparty of the reporting agent for the reported transaction. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCounterpartyIdentification
	 * SecuredMarketTransaction3.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmCounterpartyIdentification
	 * SecuredMarketTransaction1.mmCounterpartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identification of the counterparty of the reporting agent for the reported transaction. ";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmCounterpartyIdentification);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmCounterpartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyIdentification2Choice.mmObject();
		}
	};
	protected LEIIdentifier tripartyAgentIdentification;
	/**
	 * Identification of the tri-party agent, when the transaction has been
	 * performed via tri-party agent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTripartyAgentIdentification
	 * SecuredMarketTransaction3.mmTripartyAgentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTripartyAgentIdentification
	 * SecuredMarketTransaction1.mmTripartyAgentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentIdentification";
			definition = "Identification of the tri-party agent, when the transaction has been performed via tri-party agent.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmTripartyAgentIdentification);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmTripartyAgentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}
	};
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * Date and time on which the parties entered into the reported transaction.<br>
	 * <br>
	 * Usage: when time is available, it must be reported.<br>
	 * <br>
	 * It is to be reported with only the date when the time of the transaction
	 * is not available. <br>
	 * <br>
	 * The reported time is the execution time when available or otherwise the
	 * time at which the transaction entered the trading system of the reporting
	 * agent.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTradeDate
	 * SecuredMarketTransaction3.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTradeDate
	 * SecuredMarketTransaction1.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent. ";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmTradeDate);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate settlementDate;
	/**
	 * Date on which the amount of money is initially exchanged versus the asset
	 * as contractually agreed.<br>
	 * <br>
	 * Usage:<br>
	 * In the case of open basis repurchase transactions, this is the date on
	 * which the rollover settles (even if no exchange of an amount of money
	 * takes place).<br>
	 * In the case of a settlement failure in which settlement takes place on a
	 * date different than initially agreed, no transactional amendment needs to
	 * be reported.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmSettlementDate
	 * SecuredMarketTransaction3.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmSettlementDate
	 * SecuredMarketTransaction1.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money is initially exchanged versus the asset as contractually agreed.\r\n\r\nUsage:\r\nIn the case of open basis repurchase transactions, this is the date on which the rollover settles (even if no exchange of an amount of money takes place).\r\nIn the case of a settlement failure in which settlement takes place on a date different than initially agreed, no transactional amendment needs to be reported.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmSettlementDate);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Date on which the repurchase will be executed, that is the date on which
	 * the amount of money is due to be returned or received versus the asset
	 * pledged or received as collateral.
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmMaturityDate
	 * SecuredMarketTransaction3.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmMaturityDate
	 * SecuredMarketTransaction1.mmMaturityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which the repurchase will be executed, that is the date on which the amount of money is due to be returned or received versus the asset pledged or received as collateral.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmMaturityDate);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmMaturityDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected MoneyMarketTransactionType1Code transactionType;
	/**
	 * Defines whether the transaction is a cash borrowing or cash lending
	 * transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionType
	 * SecuredMarketTransaction3.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTransactionType
	 * SecuredMarketTransaction1.mmTransactionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Defines whether the transaction is a cash borrowing or cash lending transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmTransactionType);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmTransactionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyMarketTransactionType1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount transactionNominalAmount;
	/**
	 * Amount of money initially borrowed or lent to be reported as an absolute
	 * value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmTransactionNominalAmount
	 * SecuredMarketTransaction3.mmTransactionNominalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmTransactionNominalAmount
	 * SecuredMarketTransaction1.mmTransactionNominalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "TxNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNominalAmount";
			definition = "Amount of money initially borrowed or lent to be reported as an absolute value.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmTransactionNominalAmount);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmTransactionNominalAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected InterestRateType1Code rateType;
	/**
	 * Specifies whether the transaction interest rate of the repurchase
	 * agreements is either fixed or floating (variable rate).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmRateType
	 * SecuredMarketTransaction3.mmRateType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmRateType
	 * SecuredMarketTransaction1.mmRateType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the transaction interest rate of the repurchase agreements is either fixed or floating (variable rate).";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmRateType);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmRateType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateType1Code.mmObject();
		}
	};
	protected Rate2 dealRate;
	/**
	 * Interest rate expressed in accordance with the local money market
	 * convention at which the repurchase agreement has been concluded and at
	 * which the cash lent is remunerated.<br>
	 * <br>
	 * Usage:<br>
	 * When the remuneration for securities lending transactions is represented
	 * by a fee amount, the fee amount will be translated into a deal rate per
	 * annum based on the ratio between the fee amount and the transaction
	 * nominal amount times number of days based on relevant money market
	 * convention divided by the number of days between the settlement date and
	 * the maturity of the transaction. <br>
	 * <br>
	 * Only actual values, as opposed to estimated or default values, will be
	 * reported for this variable.<br>
	 * <br>
	 * This value can be either positive or negative irrespective of whether the
	 * cash is borrowed or lent. It represents the contractually agreed
	 * remuneration rate on the transaction nominal amount regardless of the
	 * transaction sign (that whether the transaction type is reported as
	 * borrowed or lent).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmDealRate
	 * SecuredMarketTransaction3.mmDealRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmDealRate
	 * SecuredMarketTransaction1.mmDealRate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "DealRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealRate";
			definition = "Interest rate expressed in accordance with the local money market convention at which the repurchase agreement has been concluded and at which the cash lent is remunerated.\r\n\r\nUsage:\r\nWhen the remuneration for securities lending transactions is represented by a fee amount, the fee amount will be translated into a deal rate per annum based on the ratio between the fee amount and the transaction nominal amount times number of days based on relevant money market convention divided by the number of days between the settlement date and the maturity of the transaction. \r\n\r\nOnly actual values, as opposed to estimated or default values, will be reported for this variable.\r\n\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of the transaction sign (that whether the transaction type is reported as borrowed or lent).";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmDealRate);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmDealRate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected FloatingRateNote1 floatingRateRepurchaseAgreement;
	/**
	 * Repurchase agreement in which the periodic interest payments are
	 * calculated on the basis of the value (that is, fixing of an underlying
	 * reference rate such as Euribor) on predefined dates (that is, fixing
	 * dates) and which has a maturity of no more than one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingRateNote1
	 * FloatingRateNote1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
	 * RepurchaseAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmFloatingRateRepurchaseAgreement
	 * SecuredMarketTransaction3.mmFloatingRateRepurchaseAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmFloatingRateRepurchaseAgreement
	 * SecuredMarketTransaction1.mmFloatingRateRepurchaseAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFloatingRateRepurchaseAgreement = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RepurchaseAgreement.mmObject();
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "FltgRateRpAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateRepurchaseAgreement";
			definition = "Repurchase agreement in which the periodic interest payments are calculated on the basis of the value (that is, fixing of an underlying reference rate such as Euribor) on predefined dates (that is, fixing dates) and which has a maturity of no more than one year.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmFloatingRateRepurchaseAgreement);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmFloatingRateRepurchaseAgreement;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FloatingRateNote1.mmObject();
		}
	};
	protected BrokeredDeal1Code brokeredDeal;
	/**
	 * Specifies whether the transaction is arranged via a third party broker or
	 * not.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmBrokeredDeal
	 * SecuredMarketTransaction3.mmBrokeredDeal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBrokeredDeal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "BrkrdDeal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokeredDeal";
			definition = "Specifies whether the transaction is arranged via a third party broker or not.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmBrokeredDeal);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BrokeredDeal1Code.mmObject();
		}
	};
	protected Collateral10 collateral;
	/**
	 * Identifies the asset class pledged as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral10
	 * Collateral10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateral
	 * CollateralManagement.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmCollateral
	 * SecuredMarketTransaction3.mmCollateral}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmCollateral
	 * SecuredMarketTransaction1.mmCollateral}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateral = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralManagement.mmCollateral;
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Identifies the asset class pledged as collateral.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmCollateral);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmCollateral;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Collateral10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction2
	 * SecuredMarketTransaction2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction3#mmSupplementaryData
	 * SecuredMarketTransaction3.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuredMarketTransaction1#mmSupplementaryData
	 * SecuredMarketTransaction1.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuredMarketTransaction2.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmSupplementaryData);
			previousVersion_lazy = () -> SecuredMarketTransaction1.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuredMarketTransaction2.mmReportedTransactionStatus, SecuredMarketTransaction2.mmBranchIdentification, SecuredMarketTransaction2.mmUniqueTransactionIdentifier,
						SecuredMarketTransaction2.mmProprietaryTransactionIdentification, SecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification, SecuredMarketTransaction2.mmCounterpartyIdentification,
						SecuredMarketTransaction2.mmTripartyAgentIdentification, SecuredMarketTransaction2.mmTradeDate, SecuredMarketTransaction2.mmSettlementDate, SecuredMarketTransaction2.mmMaturityDate,
						SecuredMarketTransaction2.mmTransactionType, SecuredMarketTransaction2.mmTransactionNominalAmount, SecuredMarketTransaction2.mmRateType, SecuredMarketTransaction2.mmDealRate,
						SecuredMarketTransaction2.mmFloatingRateRepurchaseAgreement, SecuredMarketTransaction2.mmBrokeredDeal, SecuredMarketTransaction2.mmCollateral, SecuredMarketTransaction2.mmSupplementaryData);
				trace_lazy = () -> RepurchaseAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecuredMarketTransaction2";
				definition = "Provides the details of each individual secured market transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuredMarketTransaction3.mmObject());
				previousVersion_lazy = () -> SecuredMarketTransaction1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionOperationType1Code getReportedTransactionStatus() {
		return reportedTransactionStatus;
	}

	public void setReportedTransactionStatus(TransactionOperationType1Code reportedTransactionStatus) {
		this.reportedTransactionStatus = reportedTransactionStatus;
	}

	public LEIIdentifier getBranchIdentification() {
		return branchIdentification;
	}

	public void setBranchIdentification(LEIIdentifier branchIdentification) {
		this.branchIdentification = branchIdentification;
	}

	public Max105Text getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier;
	}

	public void setUniqueTransactionIdentifier(Max105Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
	}

	public Max105Text getProprietaryTransactionIdentification() {
		return proprietaryTransactionIdentification;
	}

	public void setProprietaryTransactionIdentification(Max105Text proprietaryTransactionIdentification) {
		this.proprietaryTransactionIdentification = proprietaryTransactionIdentification;
	}

	public Max105Text getCounterpartyProprietaryTransactionIdentification() {
		return counterpartyProprietaryTransactionIdentification;
	}

	public void setCounterpartyProprietaryTransactionIdentification(Max105Text counterpartyProprietaryTransactionIdentification) {
		this.counterpartyProprietaryTransactionIdentification = counterpartyProprietaryTransactionIdentification;
	}

	public CounterpartyIdentification2Choice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public void setCounterpartyIdentification(CounterpartyIdentification2Choice counterpartyIdentification) {
		this.counterpartyIdentification = counterpartyIdentification;
	}

	public LEIIdentifier getTripartyAgentIdentification() {
		return tripartyAgentIdentification;
	}

	public void setTripartyAgentIdentification(LEIIdentifier tripartyAgentIdentification) {
		this.tripartyAgentIdentification = tripartyAgentIdentification;
	}

	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = tradeDate;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
	}

	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public MoneyMarketTransactionType1Code getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(MoneyMarketTransactionType1Code transactionType) {
		this.transactionType = transactionType;
	}

	public ActiveCurrencyAndAmount getTransactionNominalAmount() {
		return transactionNominalAmount;
	}

	public void setTransactionNominalAmount(ActiveCurrencyAndAmount transactionNominalAmount) {
		this.transactionNominalAmount = transactionNominalAmount;
	}

	public InterestRateType1Code getRateType() {
		return rateType;
	}

	public void setRateType(InterestRateType1Code rateType) {
		this.rateType = rateType;
	}

	public Rate2 getDealRate() {
		return dealRate;
	}

	public void setDealRate(com.tools20022.repository.msg.Rate2 dealRate) {
		this.dealRate = dealRate;
	}

	public FloatingRateNote1 getFloatingRateRepurchaseAgreement() {
		return floatingRateRepurchaseAgreement;
	}

	public void setFloatingRateRepurchaseAgreement(com.tools20022.repository.msg.FloatingRateNote1 floatingRateRepurchaseAgreement) {
		this.floatingRateRepurchaseAgreement = floatingRateRepurchaseAgreement;
	}

	public BrokeredDeal1Code getBrokeredDeal() {
		return brokeredDeal;
	}

	public void setBrokeredDeal(BrokeredDeal1Code brokeredDeal) {
		this.brokeredDeal = brokeredDeal;
	}

	public Collateral10 getCollateral() {
		return collateral;
	}

	public void setCollateral(com.tools20022.repository.msg.Collateral10 collateral) {
		this.collateral = collateral;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}