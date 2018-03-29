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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BasisPriceType1Choice;
import com.tools20022.repository.codeset.TradeType2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LiquidityAndStatistics1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStrikeTime#forBid1
 * ConstraintStrikeTime.forBid1}</li>
 * </ul>
 * </li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Bid1", propOrder = {"clientBidIdentification", "listName", "bidIdentification", "totalNumberSecurities", "exchangeForPhysicalIndicator", "foreignExchangeExecutionRequestedIndicator", "tradeType", "totalNumberTickets",
		"progressReportIndicator", "progressPeriodInterval", "totalNumberOfBidders", "tradeDate", "strikeTime", "basisPriceType", "liquidityAndStatistics"})
public class Bid1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ClntBidId", required = true)
	protected Max35Text clientBidIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntBidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 391</li>
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
	public static final MMMessageAttribute<Bid1, Max35Text> mmClientBidIdentification = new MMMessageAttribute<Bid1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "ClntBidId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "391"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientBidIdentification";
			definition = "Unique identifier for a Bid Request as assigned by institution. Uniqueness must be guaranteed within a single trading day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Bid1 obj) {
			return obj.getClientBidIdentification();
		}

		@Override
		public void setValue(Bid1 obj, Max35Text value) {
			obj.setClientBidIdentification(value);
		}
	};
	@XmlElement(name = "ListNm")
	protected Max128Text listName;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 392</li>
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
	public static final MMMessageAttribute<Bid1, Optional<Max128Text>> mmListName = new MMMessageAttribute<Bid1, Optional<Max128Text>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmListName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "ListNm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "392"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ListName";
			definition = "Provides the name of the order list.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max128Text.mmObject();
		}

		@Override
		public Optional<Max128Text> getValue(Bid1 obj) {
			return obj.getListName();
		}

		@Override
		public void setValue(Bid1 obj, Optional<Max128Text> value) {
			obj.setListName(value.orElse(null));
		}
	};
	@XmlElement(name = "BidId")
	protected Max35Text bidIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BidId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 390</li>
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
	public static final MMMessageAttribute<Bid1, Optional<Max35Text>> mmBidIdentification = new MMMessageAttribute<Bid1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "BidId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "390"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidIdentification";
			definition = "Unique and unambiguous identification of the bid.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Bid1 obj) {
			return obj.getBidIdentification();
		}

		@Override
		public void setValue(Bid1 obj, Optional<Max35Text> value) {
			obj.setBidIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbScties", required = true)
	protected Number totalNumberSecurities;
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 393</li>
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
	public static final MMMessageAttribute<Bid1, Number> mmTotalNumberSecurities = new MMMessageAttribute<Bid1, Number>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbScties";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "393"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberSecurities";
			definition = "Total number of distinct financial instruments for which the bid is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(Bid1 obj) {
			return obj.getTotalNumberSecurities();
		}

		@Override
		public void setValue(Bid1 obj, Number value) {
			obj.setTotalNumberSecurities(value);
		}
	};
	@XmlElement(name = "XchgForPhysInd", required = true)
	protected YesNoIndicator exchangeForPhysicalIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 411</li>
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
	public static final MMMessageAttribute<Bid1, YesNoIndicator> mmExchangeForPhysicalIndicator = new MMMessageAttribute<Bid1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmExchangeForPhysicalTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "XchgForPhysInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "411"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForPhysicalIndicator";
			definition = "Indicates whether or not to exchange for physical.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Bid1 obj) {
			return obj.getExchangeForPhysicalIndicator();
		}

		@Override
		public void setValue(Bid1 obj, YesNoIndicator value) {
			obj.setExchangeForPhysicalIndicator(value);
		}
	};
	@XmlElement(name = "FrgnXchgExctnReqdInd", required = true)
	protected YesNoIndicator foreignExchangeExecutionRequestedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 121</li>
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
	public static final MMMessageAttribute<Bid1, YesNoIndicator> mmForeignExchangeExecutionRequestedIndicator = new MMMessageAttribute<Bid1, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmForeignExchangeExecutionRequested;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgExctnReqdInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "121"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeExecutionRequestedIndicator";
			definition = "Indicates a request for a foreign exchange accommodation trade to be executed along with security transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Bid1 obj) {
			return obj.getForeignExchangeExecutionRequestedIndicator();
		}

		@Override
		public void setValue(Bid1 obj, YesNoIndicator value) {
			obj.setForeignExchangeExecutionRequestedIndicator(value);
		}
	};
	@XmlElement(name = "TradTp", required = true)
	protected TradeType2Code tradeType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
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
	public static final MMMessageAttribute<Bid1, TradeType2Code> mmTradeType = new MMMessageAttribute<Bid1, TradeType2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "TradTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeType";
			definition = "Indicates the type of transaction of which the order is a component.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeType2Code.mmObject();
		}

		@Override
		public TradeType2Code getValue(Bid1 obj) {
			return obj.getTradeType();
		}

		@Override
		public void setValue(Bid1 obj, TradeType2Code value) {
			obj.setTradeType(value);
		}
	};
	@XmlElement(name = "TtlNbTckts")
	protected Number totalNumberTickets;
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 395</li>
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
	public static final MMMessageAttribute<Bid1, Optional<Number>> mmTotalNumberTickets = new MMMessageAttribute<Bid1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSecuritiesOrderAllocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbTckts";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "395"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberTickets";
			definition = "Expected total number of tickets/allocations to be fully executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Bid1 obj) {
			return obj.getTotalNumberTickets();
		}

		@Override
		public void setValue(Bid1 obj, Optional<Number> value) {
			obj.setTotalNumberTickets(value.orElse(null));
		}
	};
	@XmlElement(name = "PrgrsRptInd")
	protected YesNoIndicator progressReportIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 414</li>
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
	public static final MMMessageAttribute<Bid1, Optional<YesNoIndicator>> mmProgressReportIndicator = new MMMessageAttribute<Bid1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsRptInd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "414"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressReportIndicator";
			definition = "Identifies the request to receive a report on the progress of the order or not.\n\nA 'Yes' value means a request for regular status messages to be sent.\nA 'No' value means no request to receive regular status messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Bid1 obj) {
			return obj.getProgressReportIndicator();
		}

		@Override
		public void setValue(Bid1 obj, Optional<YesNoIndicator> value) {
			obj.setProgressReportIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "PrgrsPrdIntrvl")
	protected ISOTime progressPeriodInterval;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 415</li>
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
	public static final MMMessageAttribute<Bid1, Optional<ISOTime>> mmProgressPeriodInterval = new MMMessageAttribute<Bid1, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "PrgrsPrdIntrvl";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "415"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressPeriodInterval";
			definition = "Identifies the interval period in minutes between each ListStatus you wish to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(Bid1 obj) {
			return obj.getProgressPeriodInterval();
		}

		@Override
		public void setValue(Bid1 obj, Optional<ISOTime> value) {
			obj.setProgressPeriodInterval(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbOfBddrs")
	protected Number totalNumberOfBidders;
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
	public static final MMMessageAttribute<Bid1, Optional<Number>> mmTotalNumberOfBidders = new MMMessageAttribute<Bid1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> NonDisclosedListTrading.mmNumberOfBidders;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfBddrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfBidders";
			definition = "Indicates the total number of bidders participating to a list trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Bid1 obj) {
			return obj.getTotalNumberOfBidders();
		}

		@Override
		public void setValue(Bid1 obj, Optional<Number> value) {
			obj.setTotalNumberOfBidders(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDt")
	protected ISODateTime tradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 75</li>
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
	public static final MMMessageAttribute<Bid1, Optional<ISODateTime>> mmTradeDate = new MMMessageAttribute<Bid1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "75"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Bid1 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(Bid1 obj, Optional<ISODateTime> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StrkTm")
	protected ISODateTime strikeTime;
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
	 * {@linkplain com.tools20022.repository.entity.ListTrading#mmStrikeTime
	 * ListTrading.mmStrikeTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Bid1 Bid1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StrkTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 443</li>
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
	public static final MMMessageAttribute<Bid1, Optional<ISODateTime>> mmStrikeTime = new MMMessageAttribute<Bid1, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmStrikeTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "StrkTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "443"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StrikeTime";
			definition = "Time at which current market prices are used to determine the value of a basket.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Bid1 obj) {
			return obj.getStrikeTime();
		}

		@Override
		public void setValue(Bid1 obj, Optional<ISODateTime> value) {
			obj.setStrikeTime(value.orElse(null));
		}
	};
	@XmlElement(name = "BsisPricTp", required = true)
	protected BasisPriceType1Choice basisPriceType;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Bid1, BasisPriceType1Choice> mmBasisPriceType = new MMMessageAssociationEnd<Bid1, BasisPriceType1Choice>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmBasisPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "BsisPricTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPriceType";
			definition = "Represents the basis price type in a bid order (list trading).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BasisPriceType1Choice.mmObject();
		}

		@Override
		public BasisPriceType1Choice getValue(Bid1 obj) {
			return obj.getBasisPriceType();
		}

		@Override
		public void setValue(Bid1 obj, BasisPriceType1Choice value) {
			obj.setBasisPriceType(value);
		}
	};
	@XmlElement(name = "LqdtyAndSttstcs", required = true)
	protected LiquidityAndStatistics1 liquidityAndStatistics;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<Bid1, LiquidityAndStatistics1> mmLiquidityAndStatistics = new MMMessageAssociationEnd<Bid1, LiquidityAndStatistics1>() {
		{
			businessElementTrace_lazy = () -> ListTrading.mmLiquidity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Bid1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyAndSttstcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityAndStatistics";
			definition = "General details about the liquidity of the financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LiquidityAndStatistics1.mmObject();
		}

		@Override
		public LiquidityAndStatistics1 getValue(Bid1 obj) {
			return obj.getLiquidityAndStatistics();
		}

		@Override
		public void setValue(Bid1 obj, LiquidityAndStatistics1 value) {
			obj.setLiquidityAndStatistics(value);
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStrikeTime.forBid1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Bid1";
				definition = "Attempt to buy or sell a large number of financial instruments contained in or comprising a portfolio.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getClientBidIdentification() {
		return clientBidIdentification;
	}

	public Bid1 setClientBidIdentification(Max35Text clientBidIdentification) {
		this.clientBidIdentification = Objects.requireNonNull(clientBidIdentification);
		return this;
	}

	public Optional<Max128Text> getListName() {
		return listName == null ? Optional.empty() : Optional.of(listName);
	}

	public Bid1 setListName(Max128Text listName) {
		this.listName = listName;
		return this;
	}

	public Optional<Max35Text> getBidIdentification() {
		return bidIdentification == null ? Optional.empty() : Optional.of(bidIdentification);
	}

	public Bid1 setBidIdentification(Max35Text bidIdentification) {
		this.bidIdentification = bidIdentification;
		return this;
	}

	public Number getTotalNumberSecurities() {
		return totalNumberSecurities;
	}

	public Bid1 setTotalNumberSecurities(Number totalNumberSecurities) {
		this.totalNumberSecurities = Objects.requireNonNull(totalNumberSecurities);
		return this;
	}

	public YesNoIndicator getExchangeForPhysicalIndicator() {
		return exchangeForPhysicalIndicator;
	}

	public Bid1 setExchangeForPhysicalIndicator(YesNoIndicator exchangeForPhysicalIndicator) {
		this.exchangeForPhysicalIndicator = Objects.requireNonNull(exchangeForPhysicalIndicator);
		return this;
	}

	public YesNoIndicator getForeignExchangeExecutionRequestedIndicator() {
		return foreignExchangeExecutionRequestedIndicator;
	}

	public Bid1 setForeignExchangeExecutionRequestedIndicator(YesNoIndicator foreignExchangeExecutionRequestedIndicator) {
		this.foreignExchangeExecutionRequestedIndicator = Objects.requireNonNull(foreignExchangeExecutionRequestedIndicator);
		return this;
	}

	public TradeType2Code getTradeType() {
		return tradeType;
	}

	public Bid1 setTradeType(TradeType2Code tradeType) {
		this.tradeType = Objects.requireNonNull(tradeType);
		return this;
	}

	public Optional<Number> getTotalNumberTickets() {
		return totalNumberTickets == null ? Optional.empty() : Optional.of(totalNumberTickets);
	}

	public Bid1 setTotalNumberTickets(Number totalNumberTickets) {
		this.totalNumberTickets = totalNumberTickets;
		return this;
	}

	public Optional<YesNoIndicator> getProgressReportIndicator() {
		return progressReportIndicator == null ? Optional.empty() : Optional.of(progressReportIndicator);
	}

	public Bid1 setProgressReportIndicator(YesNoIndicator progressReportIndicator) {
		this.progressReportIndicator = progressReportIndicator;
		return this;
	}

	public Optional<ISOTime> getProgressPeriodInterval() {
		return progressPeriodInterval == null ? Optional.empty() : Optional.of(progressPeriodInterval);
	}

	public Bid1 setProgressPeriodInterval(ISOTime progressPeriodInterval) {
		this.progressPeriodInterval = progressPeriodInterval;
		return this;
	}

	public Optional<Number> getTotalNumberOfBidders() {
		return totalNumberOfBidders == null ? Optional.empty() : Optional.of(totalNumberOfBidders);
	}

	public Bid1 setTotalNumberOfBidders(Number totalNumberOfBidders) {
		this.totalNumberOfBidders = totalNumberOfBidders;
		return this;
	}

	public Optional<ISODateTime> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public Bid1 setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ISODateTime> getStrikeTime() {
		return strikeTime == null ? Optional.empty() : Optional.of(strikeTime);
	}

	public Bid1 setStrikeTime(ISODateTime strikeTime) {
		this.strikeTime = strikeTime;
		return this;
	}

	public BasisPriceType1Choice getBasisPriceType() {
		return basisPriceType;
	}

	public Bid1 setBasisPriceType(BasisPriceType1Choice basisPriceType) {
		this.basisPriceType = Objects.requireNonNull(basisPriceType);
		return this;
	}

	public LiquidityAndStatistics1 getLiquidityAndStatistics() {
		return liquidityAndStatistics;
	}

	public Bid1 setLiquidityAndStatistics(LiquidityAndStatistics1 liquidityAndStatistics) {
		this.liquidityAndStatistics = Objects.requireNonNull(liquidityAndStatistics);
		return this;
	}
}