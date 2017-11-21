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
import com.tools20022.repository.choice.CounterpartyIdentification1Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.FinancialInstrumentProductType1Code;
import com.tools20022.repository.codeset.InterestRateType1Code;
import com.tools20022.repository.codeset.MoneyMarketTransactionType1Code;
import com.tools20022.repository.codeset.TransactionOperationType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmReportedTransactionStatus
 * UnsecuredMarketTransaction1.mmReportedTransactionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmUniqueTransactionIdentifier
 * UnsecuredMarketTransaction1.mmUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmProprietaryTransactionIdentification
 * UnsecuredMarketTransaction1.mmProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmCounterpartyProprietaryTransactionIdentification
 * UnsecuredMarketTransaction1.
 * mmCounterpartyProprietaryTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmCounterpartyIdentification
 * UnsecuredMarketTransaction1.mmCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTradeDate
 * UnsecuredMarketTransaction1.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmSettlementDate
 * UnsecuredMarketTransaction1.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmMaturityDate
 * UnsecuredMarketTransaction1.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTransactionType
 * UnsecuredMarketTransaction1.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmInstrumentType
 * UnsecuredMarketTransaction1.mmInstrumentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmTransactionNominalAmount
 * UnsecuredMarketTransaction1.mmTransactionNominalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmDealPrice
 * UnsecuredMarketTransaction1.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmRateType
 * UnsecuredMarketTransaction1.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmDealRate
 * UnsecuredMarketTransaction1.mmDealRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmFloatingRateNote
 * UnsecuredMarketTransaction1.mmFloatingRateNote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmCallPutOption
 * UnsecuredMarketTransaction1.mmCallPutOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1#mmSupplementaryData
 * UnsecuredMarketTransaction1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Derivative Derivative}</li>
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
 * "UnsecuredMarketTransaction1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of each individual un\r\nsecured market transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2
 * UnsecuredMarketTransaction2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UnsecuredMarketTransaction1", propOrder = {"reportedTransactionStatus", "uniqueTransactionIdentifier", "proprietaryTransactionIdentification", "counterpartyProprietaryTransactionIdentification",
		"counterpartyIdentification", "tradeDate", "settlementDate", "maturityDate", "transactionType", "instrumentType", "transactionNominalAmount", "dealPrice", "rateType", "dealRate", "floatingRateNote", "callPutOption",
		"supplementaryData"})
public class UnsecuredMarketTransaction1 {

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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmReportedTransactionStatus
	 * UnsecuredMarketTransaction2.mmReportedTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportedTransactionStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RptdTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedTransactionStatus";
			definition = "Defines the status of the reported transaction, that is details on whether the transaction is a new transaction, an amendment of a previously reported transaction, a cancellation of a previously reported transaction or a correction to a previously reported and rejected transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmReportedTransactionStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionOperationType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmUniqueTransactionIdentifier
	 * UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "UnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UniqueTransactionIdentifier";
			definition = "Unique transaction identifier will be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction during its lifetime.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmUniqueTransactionIdentifier);
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "PrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryTransactionIdentification";
			definition = "Internal unique transaction identifier used by the reporting agent for each transaction. ";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmProprietaryTransactionIdentification);
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCounterpartyProprietaryTransactionIdentification
	 * UnsecuredMarketTransaction2.
	 * mmCounterpartyProprietaryTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyProprietaryTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyPrtryTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyProprietaryTransactionIdentification";
			definition = "Internal unique proprietary transaction identifier as assigned by the counterparty of the reporting agent for each transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmCounterpartyProprietaryTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected CounterpartyIdentification1Choice counterpartyIdentification;
	/**
	 * Identification of the counterparty of the reporting agent for the
	 * reported transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CounterpartyIdentification1Choice
	 * CounterpartyIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CounterpartyRisk#mmParty
	 * CounterpartyRisk.mmParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCounterpartyIdentification
	 * UnsecuredMarketTransaction2.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CounterpartyRisk.mmParty;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyIdentification";
			definition = "Identification of the counterparty of the reporting agent for the reported transaction. ";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmCounterpartyIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CounterpartyIdentification1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTradeDate
	 * UnsecuredMarketTransaction2.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time on which the parties entered into the reported transaction.\r\n\r\nUsage: when time is available, it must be reported.\r\n\r\nIt is to be reported with only the date when the time of the transaction is not available. \r\n\r\nThe reported time is the execution time when available or otherwise the time at which the transaction entered the trading system of the reporting agent. ";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmTradeDate);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected ISODate settlementDate;
	/**
	 * Date on which the amount of money is exchanged by counterparties or on
	 * which the purchase or sale of a debt instrument settles. <br>
	 * With regard to call accounts and other unsecured borrowing/lending
	 * redeemable at notice, it is the date on which the deposit is rolled over,
	 * that is on which it would have been paid back if it had been called/not
	 * rolled over. In the case of a settlement failure in which settlement
	 * takes place on a different date than initially agreed, no transactional
	 * amendment needs to be reported.
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmSettlementDate
	 * UnsecuredMarketTransaction2.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the amount of money is exchanged by counterparties or on which the purchase or sale of a debt instrument settles. \r\nWith regard to call accounts and other unsecured borrowing/lending redeemable at notice, it is the date on which the deposit is rolled over, that is on which it would have been paid back if it had been called/not rolled over. In the case of a settlement failure in which settlement takes place on a different date than initially agreed, no transactional amendment needs to be reported.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate maturityDate;
	/**
	 * Date on which the amount of money is due to be repaid by the borrower to
	 * the lender or on which a debt instrument matures and is due to be paid
	 * back. In regards to callable and puttable instruments, the final maturity
	 * date must be provided. For call accounts and other unsecured
	 * borrowing/lending redeemable upon notice, the first date on which the
	 * instrument may be redeemed must be provided.
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmMaturityDate
	 * UnsecuredMarketTransaction2.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Date on which the amount of money is due to be repaid by the borrower to the lender or on which a debt instrument matures and is due to be paid back. In regards to callable and puttable instruments, the final maturity date must be provided. For call accounts and other unsecured borrowing/lending redeemable upon notice, the first date on which the instrument may be redeemed must be provided.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmMaturityDate);
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionType
	 * UnsecuredMarketTransaction2.mmTransactionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Defines whether the transaction is a cash borrowing or cash lending transaction.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmTransactionType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoneyMarketTransactionType1Code.mmObject();
		}
	};
	protected FinancialInstrumentProductType1Code instrumentType;
	/**
	 * Defines the instrument via which the borrowing or lending transaction
	 * takes place.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmInstrumentType
	 * UnsecuredMarketTransaction2.mmInstrumentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstrumentType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetClassification.mmProductType;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "InstrmTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstrumentType";
			definition = "Defines the instrument via which the borrowing or lending transaction takes place.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmInstrumentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialInstrumentProductType1Code.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount transactionNominalAmount;
	/**
	 * Amount of money initially borrowed or lent on deposits. In the case of
	 * debt securities, it is the nominal amount of the security issued or
	 * purchased.
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmTransactionNominalAmount
	 * UnsecuredMarketTransaction2.mmTransactionNominalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionNominalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAmount;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "TxNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNominalAmount";
			definition = "Amount of money initially borrowed or lent on deposits. In the case of debt securities, it is the nominal amount of the security issued or purchased.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmTransactionNominalAmount);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate dealPrice;
	/**
	 * Dirty price at which the security is issued or traded in percentage
	 * points, and which is to be reported as 100 for unsecured deposits.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealPrice
	 * UnsecuredMarketTransaction2.mmDealPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealPrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Dirty price at which the security is issued or traded in percentage points, and which is to be reported as 100 for unsecured deposits.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmDealPrice);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected InterestRateType1Code rateType;
	/**
	 * Fixed rate for deposits and debt instruments with fixed coupons or
	 * variable rate for debt instruments for which the pay out at maturity or
	 * period depends on observed value of some underlying reference rate as
	 * well as for unsecured deposits paying interest at regular intervals. <br>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmRateType
	 * UnsecuredMarketTransaction2.mmRateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRateType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmTypeOfInterest;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Fixed rate for deposits and debt instruments with fixed coupons or variable rate for debt instruments for which the pay out at maturity or period depends on observed value of some underlying reference rate as well as for unsecured deposits paying interest at regular intervals. \r\n";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmRateType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRateType1Code.mmObject();
		}
	};
	protected Rate2 dealRate;
	/**
	 * Rate, expressed in accordance with the ACT/360 money market convention,
	 * at which the deposit was concluded and at which the cash amount lent is
	 * remunerated. In the case of debt instruments, this is the effective
	 * interest rate, expressed in accordance with the ACT/360 money market
	 * convention, or the discount margin for floating rate notes at which the
	 * instrument was issued or purchased.<br>
	 * This value can be either positive or negative irrespective of whether the
	 * cash is borrowed or lent. It represents the contractually agreed
	 * remuneration rate on the transaction nominal amount regardless of whether
	 * the transaction type is reported as borrowed or lent.<br>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * "Rate, expressed in accordance with the ACT/360 money market convention, at which the deposit was concluded and at which the cash amount lent is remunerated. In the case of debt instruments, this is the effective interest rate, expressed in accordance with the ACT/360 money market convention, or the discount margin for floating rate notes at which the instrument was issued or purchased.\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of whether the transaction type is reported as borrowed or lent.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmDealRate
	 * UnsecuredMarketTransaction2.mmDealRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDealRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "DealRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealRate";
			definition = "Rate, expressed in accordance with the ACT/360 money market convention, at which the deposit was concluded and at which the cash amount lent is remunerated. In the case of debt instruments, this is the effective interest rate, expressed in accordance with the ACT/360 money market convention, or the discount margin for floating rate notes at which the instrument was issued or purchased.\r\nThis value can be either positive or negative irrespective of whether the cash is borrowed or lent. It represents the contractually agreed remuneration rate on the transaction nominal amount regardless of whether the transaction type is reported as borrowed or lent.\r\n";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmDealRate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	protected FloatingRateNote1 floatingRateNote;
	/**
	 * Debt instrument in which the periodic interest payments are calculated on
	 * the basis of the value (that is fixing of an underlying reference rate
	 * such as EURIBOR) on predefined dates (that is fixing) dates and which has
	 * a maturity of no more than one year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FloatingRateNote1
	 * FloatingRateNote1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future Future}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmFloatingRateNote
	 * UnsecuredMarketTransaction2.mmFloatingRateNote}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFloatingRateNote = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Future.mmObject();
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "FltgRateNote";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloatingRateNote";
			definition = "Debt instrument in which the periodic interest payments are calculated on the basis of the value (that is fixing of an underlying reference rate such as EURIBOR) on predefined dates (that is fixing) dates and which has a maturity of no more than one year.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmFloatingRateNote);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FloatingRateNote1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Option12> callPutOption;
	/**
	 * Provides the option details, when the transaction reported is a call/put
	 * option.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmCallPutOption
	 * UnsecuredMarketTransaction2.mmCallPutOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCallPutOption = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Option.mmObject();
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "CallPutOptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallPutOption";
			definition = "Provides the option details, when the transaction reported is a call/put option.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmCallPutOption);
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Option12.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction1
	 * UnsecuredMarketTransaction1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.UnsecuredMarketTransaction2#mmSupplementaryData
	 * UnsecuredMarketTransaction2.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UnsecuredMarketTransaction1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmSupplementaryData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UnsecuredMarketTransaction1.mmReportedTransactionStatus, UnsecuredMarketTransaction1.mmUniqueTransactionIdentifier,
						UnsecuredMarketTransaction1.mmProprietaryTransactionIdentification, UnsecuredMarketTransaction1.mmCounterpartyProprietaryTransactionIdentification, UnsecuredMarketTransaction1.mmCounterpartyIdentification,
						UnsecuredMarketTransaction1.mmTradeDate, UnsecuredMarketTransaction1.mmSettlementDate, UnsecuredMarketTransaction1.mmMaturityDate, UnsecuredMarketTransaction1.mmTransactionType,
						UnsecuredMarketTransaction1.mmInstrumentType, UnsecuredMarketTransaction1.mmTransactionNominalAmount, UnsecuredMarketTransaction1.mmDealPrice, UnsecuredMarketTransaction1.mmRateType,
						UnsecuredMarketTransaction1.mmDealRate, UnsecuredMarketTransaction1.mmFloatingRateNote, UnsecuredMarketTransaction1.mmCallPutOption, UnsecuredMarketTransaction1.mmSupplementaryData);
				trace_lazy = () -> Derivative.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UnsecuredMarketTransaction1";
				definition = "Provides the details of each individual un\r\nsecured market transaction.";
				nextVersions_lazy = () -> Arrays.asList(UnsecuredMarketTransaction2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RptdTxSts", required = true)
	public TransactionOperationType1Code getReportedTransactionStatus() {
		return reportedTransactionStatus;
	}

	public void setReportedTransactionStatus(TransactionOperationType1Code reportedTransactionStatus) {
		this.reportedTransactionStatus = reportedTransactionStatus;
	}

	@XmlElement(name = "UnqTxIdr")
	public Max105Text getUniqueTransactionIdentifier() {
		return uniqueTransactionIdentifier;
	}

	public void setUniqueTransactionIdentifier(Max105Text uniqueTransactionIdentifier) {
		this.uniqueTransactionIdentifier = uniqueTransactionIdentifier;
	}

	@XmlElement(name = "PrtryTxId", required = true)
	public Max105Text getProprietaryTransactionIdentification() {
		return proprietaryTransactionIdentification;
	}

	public void setProprietaryTransactionIdentification(Max105Text proprietaryTransactionIdentification) {
		this.proprietaryTransactionIdentification = proprietaryTransactionIdentification;
	}

	@XmlElement(name = "CtrPtyPrtryTxId")
	public Max105Text getCounterpartyProprietaryTransactionIdentification() {
		return counterpartyProprietaryTransactionIdentification;
	}

	public void setCounterpartyProprietaryTransactionIdentification(Max105Text counterpartyProprietaryTransactionIdentification) {
		this.counterpartyProprietaryTransactionIdentification = counterpartyProprietaryTransactionIdentification;
	}

	@XmlElement(name = "CtrPtyId", required = true)
	public CounterpartyIdentification1Choice getCounterpartyIdentification() {
		return counterpartyIdentification;
	}

	public void setCounterpartyIdentification(CounterpartyIdentification1Choice counterpartyIdentification) {
		this.counterpartyIdentification = counterpartyIdentification;
	}

	@XmlElement(name = "TradDt", required = true)
	public DateAndDateTimeChoice getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = tradeDate;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "MtrtyDt", required = true)
	public ISODate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
	}

	@XmlElement(name = "TxTp", required = true)
	public MoneyMarketTransactionType1Code getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(MoneyMarketTransactionType1Code transactionType) {
		this.transactionType = transactionType;
	}

	@XmlElement(name = "InstrmTp", required = true)
	public FinancialInstrumentProductType1Code getInstrumentType() {
		return instrumentType;
	}

	public void setInstrumentType(FinancialInstrumentProductType1Code instrumentType) {
		this.instrumentType = instrumentType;
	}

	@XmlElement(name = "TxNmnlAmt", required = true)
	public ActiveCurrencyAndAmount getTransactionNominalAmount() {
		return transactionNominalAmount;
	}

	public void setTransactionNominalAmount(ActiveCurrencyAndAmount transactionNominalAmount) {
		this.transactionNominalAmount = transactionNominalAmount;
	}

	@XmlElement(name = "DealPric", required = true)
	public PercentageRate getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(PercentageRate dealPrice) {
		this.dealPrice = dealPrice;
	}

	@XmlElement(name = "RateTp", required = true)
	public InterestRateType1Code getRateType() {
		return rateType;
	}

	public void setRateType(InterestRateType1Code rateType) {
		this.rateType = rateType;
	}

	@XmlElement(name = "DealRate")
	public Rate2 getDealRate() {
		return dealRate;
	}

	public void setDealRate(com.tools20022.repository.msg.Rate2 dealRate) {
		this.dealRate = dealRate;
	}

	@XmlElement(name = "FltgRateNote")
	public FloatingRateNote1 getFloatingRateNote() {
		return floatingRateNote;
	}

	public void setFloatingRateNote(com.tools20022.repository.msg.FloatingRateNote1 floatingRateNote) {
		this.floatingRateNote = floatingRateNote;
	}

	@XmlElement(name = "CallPutOptn")
	public List<Option12> getCallPutOption() {
		return callPutOption;
	}

	public void setCallPutOption(List<com.tools20022.repository.msg.Option12> callPutOption) {
		this.callPutOption = callPutOption;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}