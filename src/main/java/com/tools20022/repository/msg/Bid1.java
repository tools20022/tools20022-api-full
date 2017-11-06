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
import com.tools20022.repository.choice.BasisPriceType1Choice;
import com.tools20022.repository.codeset.TradeType2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.SecuritiesOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Attempt to buy or sell a large number of financial instruments contained in
 * or comprising a portfolio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmClientBidIdentification
 * Bid1.mmClientBidIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmListName
 * Bid1.mmListName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmBidIdentification
 * Bid1.mmBidIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberSecurities
 * Bid1.mmTotalNumberSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Bid1#mmExchangeForPhysicalIndicator
 * Bid1.mmExchangeForPhysicalIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Bid1#mmForeignExchangeExecutionRequestedIndicator
 * Bid1.mmForeignExchangeExecutionRequestedIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTradeType
 * Bid1.mmTradeType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberTickets
 * Bid1.mmTotalNumberTickets}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmProgressReportIndicator
 * Bid1.mmProgressReportIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmProgressPeriodInterval
 * Bid1.mmProgressPeriodInterval}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTotalNumberOfBidders
 * Bid1.mmTotalNumberOfBidders}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmTradeDate
 * Bid1.mmTradeDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmStrikeTime
 * Bid1.mmStrikeTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmBasisPriceType
 * Bid1.mmBasisPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Bid1#mmLiquidityAndStatistics
 * Bid1.mmLiquidityAndStatistics}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
 * SecuritiesOrder}</li>
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
 * "Bid1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio."
 * </li>
 * </ul>
 */
public class Bid1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text clientBidIdentification;
	/**
	 * Unique identifier for a Bid Request as assigned by institution.
	 * Uniqueness must be guaranteed within a single trading day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntBidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientBidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for a Bid Request as assigned by institution. Uniqueness must be guaranteed within a single trading day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "ClntBidId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientBidIdentification";
			definition = "Unique identifier for a Bid Request as assigned by institution. Uniqueness must be guaranteed within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max128Text listName;
	/**
	 * Provides the name of the order list.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max128Text
	 * Max128Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmListName
	 * ListTrading.mmListName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ListNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ListName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the name of the order list."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmListName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmListName;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "ListNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}
	};
	protected Max35Text bidIdentification;
	/**
	 * Unique and unambiguous identification of the bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the bid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBidIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "BidId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidIdentification";
			definition = "Unique and unambiguous identification of the bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Number totalNumberSecurities;
	/**
	 * Total number of distinct financial instruments for which the bid is
	 * applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedQuantity
	 * SecuritiesOrder.mmOrderedQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of distinct financial instruments for which the bid is applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbScties";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberSecurities";
			definition = "Total number of distinct financial instruments for which the bid is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator exchangeForPhysicalIndicator;
	/**
	 * Indicates whether or not to exchange for physical.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmExchangeForPhysicalTrade
	 * SecuritiesOrder.mmExchangeForPhysicalTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgForPhysInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForPhysicalIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not to exchange for physical."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeForPhysicalIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmExchangeForPhysicalTrade;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "XchgForPhysInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalIndicator";
			definition = "Indicates whether or not to exchange for physical.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator foreignExchangeExecutionRequestedIndicator;
	/**
	 * Indicates a request for a foreign exchange accommodation trade to be
	 * executed along with security transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmForeignExchangeExecutionRequested
	 * SecuritiesOrder.mmForeignExchangeExecutionRequested}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnXchgExctnReqdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeExecutionRequestedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignExchangeExecutionRequestedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmForeignExchangeExecutionRequested;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgExctnReqdInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeExecutionRequestedIndicator";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected TradeType2Code tradeType;
	/**
	 * Indicates the type of transaction of which the order is a component.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType2Code
	 * TradeType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the type of transaction of which the order is a component."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "TradTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeType2Code.mmObject();
		}
	};
	protected Number totalNumberTickets;
	/**
	 * Expected total number of tickets/allocations to be fully executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSecuritiesOrderAllocation
	 * SecuritiesOrder.mmSecuritiesOrderAllocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbTckts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberTickets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Expected total number of tickets/allocations to be fully executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberTickets = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmSecuritiesOrderAllocation;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbTckts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberTickets";
			definition = "Expected total number of tickets/allocations to be fully executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected YesNoIndicator progressReportIndicator;
	/**
	 * Identifies the request to receive a report on the progress of the order
	 * or not.
	 * 
	 * A 'Yes' value means a request for regular status messages to be sent. A
	 * 'No' value means no request to receive regular status messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrgrsRptInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressReportIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the request to receive a report on the progress of the order or not.\n\nA 'Yes' value means a request for regular status messages to be sent.\nA 'No' value means no request to receive regular status messages."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProgressReportIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsRptInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressReportIndicator";
			definition = "Identifies the request to receive a report on the progress of the order or not.\n\nA 'Yes' value means a request for regular status messages to be sent.\nA 'No' value means no request to receive regular status messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected ISOTime progressPeriodInterval;
	/**
	 * Identifies the interval period in minutes between each ListStatus you
	 * wish to receive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrgrsPrdIntrvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressPeriodInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the interval period in minutes between each ListStatus you wish to receive."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProgressPeriodInterval = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsPrdIntrvl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressPeriodInterval";
			definition = "Identifies the interval period in minutes between each ListStatus you wish to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}
	};
	protected Number totalNumberOfBidders;
	/**
	 * Indicates the total number of bidders participating to a list trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NonDisclosedListTrading#mmNumberOfBidders
	 * NonDisclosedListTrading.mmNumberOfBidders}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfBddrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfBidders"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the total number of bidders participating to a list trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfBidders = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.NonDisclosedListTrading.mmNumberOfBidders;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfBddrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfBidders";
			definition = "Indicates the total number of bidders participating to a list trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISODateTime tradeDate;
	/**
	 * Specifies the date/time on which the trade was executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
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
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeDateTime;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime strikeTime;
	/**
	 * Time at which current market prices are used to determine the value of a
	 * basket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmStrikeTime
	 * ListTrading.mmStrikeTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StrikeTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Time at which current market prices are used to determine the value of a basket."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStrikeTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmStrikeTime;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "StrkTm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected BasisPriceType1Choice basisPriceType;
	/**
	 * Represents the basis price type in a bid order (list trading).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BasisPriceType1Choice
	 * BasisPriceType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmBasisPriceType
	 * ListTrading.mmBasisPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the basis price type in a bid order (list trading)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBasisPriceType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmBasisPriceType;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "BsisPricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BasisPriceType1Choice.mmObject();
		}
	};
	protected LiquidityAndStatistics1 liquidityAndStatistics;
	/**
	 * General details about the liquidity of the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.LiquidityAndStatistics1
	 * LiquidityAndStatistics1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmLiquidity
	 * ListTrading.mmLiquidity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyAndSttstcs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityAndStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General details about the liquidity of the financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiquidityAndStatistics = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ListTrading.mmLiquidity;
			componentContext_lazy = () -> Bid1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyAndSttstcs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityAndStatistics";
			definition = "General details about the liquidity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LiquidityAndStatistics1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Bid1.mmClientBidIdentification, com.tools20022.repository.msg.Bid1.mmListName, com.tools20022.repository.msg.Bid1.mmBidIdentification,
						com.tools20022.repository.msg.Bid1.mmTotalNumberSecurities, com.tools20022.repository.msg.Bid1.mmExchangeForPhysicalIndicator, com.tools20022.repository.msg.Bid1.mmForeignExchangeExecutionRequestedIndicator,
						com.tools20022.repository.msg.Bid1.mmTradeType, com.tools20022.repository.msg.Bid1.mmTotalNumberTickets, com.tools20022.repository.msg.Bid1.mmProgressReportIndicator,
						com.tools20022.repository.msg.Bid1.mmProgressPeriodInterval, com.tools20022.repository.msg.Bid1.mmTotalNumberOfBidders, com.tools20022.repository.msg.Bid1.mmTradeDate,
						com.tools20022.repository.msg.Bid1.mmStrikeTime, com.tools20022.repository.msg.Bid1.mmBasisPriceType, com.tools20022.repository.msg.Bid1.mmLiquidityAndStatistics);
				trace_lazy = () -> SecuritiesOrder.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bid1";
				definition = "Attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClientBidIdentification() {
		return clientBidIdentification;
	}

	public void setClientBidIdentification(Max35Text clientBidIdentification) {
		this.clientBidIdentification = clientBidIdentification;
	}

	public Max128Text getListName() {
		return listName;
	}

	public void setListName(Max128Text listName) {
		this.listName = listName;
	}

	public Max35Text getBidIdentification() {
		return bidIdentification;
	}

	public void setBidIdentification(Max35Text bidIdentification) {
		this.bidIdentification = bidIdentification;
	}

	public Number getTotalNumberSecurities() {
		return totalNumberSecurities;
	}

	public void setTotalNumberSecurities(Number totalNumberSecurities) {
		this.totalNumberSecurities = totalNumberSecurities;
	}

	public YesNoIndicator getExchangeForPhysicalIndicator() {
		return exchangeForPhysicalIndicator;
	}

	public void setExchangeForPhysicalIndicator(YesNoIndicator exchangeForPhysicalIndicator) {
		this.exchangeForPhysicalIndicator = exchangeForPhysicalIndicator;
	}

	public YesNoIndicator getForeignExchangeExecutionRequestedIndicator() {
		return foreignExchangeExecutionRequestedIndicator;
	}

	public void setForeignExchangeExecutionRequestedIndicator(YesNoIndicator foreignExchangeExecutionRequestedIndicator) {
		this.foreignExchangeExecutionRequestedIndicator = foreignExchangeExecutionRequestedIndicator;
	}

	public TradeType2Code getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeType2Code tradeType) {
		this.tradeType = tradeType;
	}

	public Number getTotalNumberTickets() {
		return totalNumberTickets;
	}

	public void setTotalNumberTickets(Number totalNumberTickets) {
		this.totalNumberTickets = totalNumberTickets;
	}

	public YesNoIndicator getProgressReportIndicator() {
		return progressReportIndicator;
	}

	public void setProgressReportIndicator(YesNoIndicator progressReportIndicator) {
		this.progressReportIndicator = progressReportIndicator;
	}

	public ISOTime getProgressPeriodInterval() {
		return progressPeriodInterval;
	}

	public void setProgressPeriodInterval(ISOTime progressPeriodInterval) {
		this.progressPeriodInterval = progressPeriodInterval;
	}

	public Number getTotalNumberOfBidders() {
		return totalNumberOfBidders;
	}

	public void setTotalNumberOfBidders(Number totalNumberOfBidders) {
		this.totalNumberOfBidders = totalNumberOfBidders;
	}

	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = tradeDate;
	}

	public ISODateTime getStrikeTime() {
		return strikeTime;
	}

	public void setStrikeTime(ISODateTime strikeTime) {
		this.strikeTime = strikeTime;
	}

	public BasisPriceType1Choice getBasisPriceType() {
		return basisPriceType;
	}

	public void setBasisPriceType(BasisPriceType1Choice basisPriceType) {
		this.basisPriceType = basisPriceType;
	}

	public LiquidityAndStatistics1 getLiquidityAndStatistics() {
		return liquidityAndStatistics;
	}

	public void setLiquidityAndStatistics(com.tools20022.repository.msg.LiquidityAndStatistics1 liquidityAndStatistics) {
		this.liquidityAndStatistics = liquidityAndStatistics;
	}
}