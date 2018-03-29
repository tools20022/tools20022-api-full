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

package com.tools20022.repository.area.fxtr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ForeignExchangeTradeLatestVersion;
import com.tools20022.repository.codeset.AffirmStatus1Code;
import com.tools20022.repository.codeset.TradeConfirmationStatus1Code;
import com.tools20022.repository.codeset.TradingModeType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.AdditionalInformation5;
import com.tools20022.repository.msg.MarketIdentification88;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FXPostTradeConfirmation;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeConfirmationStatusAdviceAcknowledgement message is
 * sent from a market participant to a Central matching utility (CMU) in
 * response to the FXTradeConfirmationStatusAdvice previously sent by the CMU in
 * the scenario of trades matched by both participants.<br>
 * <br>
 * <b>Usage</b><br>
 * The acknowledgement is sent by the trading member to the CMU after they
 * received the confirmation status advice. <br>
 * Note that one confirmation status advice acknowledgement responds to one
 * confirmation status advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmAdviceAcknowledgementIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmAdviceAcknowledgementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmRequestIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmTradeDate
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmTradeIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmTradingMode
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmTradingMode}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmAffirmationStatus
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmAffirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmConfirmationStatus
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmConfirmationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmMarketIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmAdditionalInformation
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FXPostTradeConfirmation
 * FXPostTradeConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradConfStsAdvcAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.038.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeConfirmationStatusAdviceAcknowledgement message is sent from a market participant to a Central matching utility (CMU) in response to the FXTradeConfirmationStatusAdvice previously sent by the CMU in the scenario of trades matched by both participants.\r\n\r\nUsage\r\nThe acknowledgement is sent by the trading member to the CMU after they received the confirmation status advice. \r\nNote that one confirmation status advice acknowledgement responds to one confirmation status advice."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01", propOrder = {"adviceAcknowledgementIdentification", "requestIdentification", "tradeDate", "tradeIdentification", "tradingMode", "affirmationStatus",
		"confirmationStatus", "marketIdentification", "additionalInformation", "supplementaryData"})
public class ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AdvcAckId")
	protected MessageIdentification1 adviceAcknowledgementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvcAckId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdviceAcknowledgementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the advice acknowledgement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Optional<MessageIdentification1>> mmAdviceAcknowledgementIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Optional<MessageIdentification1>>() {
		{
			xmlTag = "AdvcAckId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdviceAcknowledgementIdentification";
			definition = "Identification of the advice acknowledgement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getAdviceAcknowledgementIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, Optional<MessageIdentification1> value) {
			obj.setAdviceAcknowledgementIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqId", required = true)
	protected MessageIdentification1 requestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, MessageIdentification1> mmRequestIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, MessageIdentification1>() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identification of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getRequestIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, MessageIdentification1 value) {
			obj.setRequestIdentification(value);
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODate tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
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
	 * definition} = "Specifies the date on which the trade was executed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, ISODate> mmTradeDate = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, ISODate>() {
		{
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date on which the trade was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, ISODate value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "TradId", required = true)
	protected Max35Text tradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Max35Text> mmTradeIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Max35Text>() {
		{
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Unique reference identification assigned to the trade by the instructing party. This reference will be used throughout the trade life cycle to identify the particular trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, Max35Text value) {
			obj.setTradeIdentification(value);
		}
	};
	@XmlElement(name = "TradgMd", required = true)
	protected TradingModeType1Code tradingMode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingModeType1Code
	 * TradingModeType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgMd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingMode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of the trade mode."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, TradingModeType1Code> mmTradingMode = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, TradingModeType1Code>() {
		{
			xmlTag = "TradgMd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingMode";
			definition = "Identifies the type of the trade mode.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingModeType1Code.mmObject();
		}

		@Override
		public TradingModeType1Code getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getTradingMode();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, TradingModeType1Code value) {
			obj.setTradingMode(value);
		}
	};
	@XmlElement(name = "AffirmSts", required = true)
	protected AffirmStatus1Code affirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AffirmStatus1Code
	 * AffirmStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AffirmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AffirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the status of the confirmation acknowledgement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, AffirmStatus1Code> mmAffirmationStatus = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, AffirmStatus1Code>() {
		{
			xmlTag = "AffirmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AffirmationStatus";
			definition = "Identifies the status of the confirmation acknowledgement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AffirmStatus1Code.mmObject();
		}

		@Override
		public AffirmStatus1Code getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getAffirmationStatus();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, AffirmStatus1Code value) {
			obj.setAffirmationStatus(value);
		}
	};
	@XmlElement(name = "ConfSts", required = true)
	protected TradeConfirmationStatus1Code confirmationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationStatus1Code
	 * TradeConfirmationStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the status of the confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, TradeConfirmationStatus1Code> mmConfirmationStatus = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, TradeConfirmationStatus1Code>() {
		{
			xmlTag = "ConfSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationStatus";
			definition = "Identifies the status of the confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeConfirmationStatus1Code.mmObject();
		}

		@Override
		public TradeConfirmationStatus1Code getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getConfirmationStatus();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, TradeConfirmationStatus1Code value) {
			obj.setConfirmationStatus(value);
		}
	};
	@XmlElement(name = "MktId", required = true)
	protected MarketIdentification88 marketIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketIdentification88
	 * MarketIdentification88}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Market in which a trade transaction has been executed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, MarketIdentification88> mmMarketIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, MarketIdentification88>() {
		{
			xmlTag = "MktId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketIdentification";
			definition = "Market in which a trade transaction has been executed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MarketIdentification88.mmObject();
		}

		@Override
		public MarketIdentification88 getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getMarketIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, MarketIdentification88 value) {
			obj.setMarketIdentification(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected AdditionalInformation5 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation5
	 * AdditionalInformation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free format text string."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Optional<AdditionalInformation5>> mmAdditionalInformation = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, Optional<AdditionalInformation5>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Free format text string.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalInformation5.mmObject();
		}

		@Override
		public Optional<AdditionalInformation5> getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, Optional<AdditionalInformation5> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01";
				definition = "Scope\r\nThe ForeignExchangeTradeConfirmationStatusAdviceAcknowledgement message is sent from a market participant to a Central matching utility (CMU) in response to the FXTradeConfirmationStatusAdvice previously sent by the CMU in the scenario of trades matched by both participants.\r\n\r\nUsage\r\nThe acknowledgement is sent by the trading member to the CMU after they received the confirmation status advice. \r\nNote that one confirmation status advice acknowledgement responds to one confirmation status advice.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeConfirmation.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradConfStsAdvcAck";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmAdviceAcknowledgementIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmRequestIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmTradeDate,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmTradeIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmTradingMode,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmAffirmationStatus,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmConfirmationStatus,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmMarketIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmAdditionalInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "038";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MessageIdentification1> getAdviceAcknowledgementIdentification() {
		return adviceAcknowledgementIdentification == null ? Optional.empty() : Optional.of(adviceAcknowledgementIdentification);
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAdviceAcknowledgementIdentification(MessageIdentification1 adviceAcknowledgementIdentification) {
		this.adviceAcknowledgementIdentification = adviceAcknowledgementIdentification;
		return this;
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = Objects.requireNonNull(requestIdentification);
		return this;
	}

	public ISODate getTradeDate() {
		return tradeDate;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradeDate(ISODate tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public TradingModeType1Code getTradingMode() {
		return tradingMode;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setTradingMode(TradingModeType1Code tradingMode) {
		this.tradingMode = Objects.requireNonNull(tradingMode);
		return this;
	}

	public AffirmStatus1Code getAffirmationStatus() {
		return affirmationStatus;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAffirmationStatus(AffirmStatus1Code affirmationStatus) {
		this.affirmationStatus = Objects.requireNonNull(affirmationStatus);
		return this;
	}

	public TradeConfirmationStatus1Code getConfirmationStatus() {
		return confirmationStatus;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setConfirmationStatus(TradeConfirmationStatus1Code confirmationStatus) {
		this.confirmationStatus = Objects.requireNonNull(confirmationStatus);
		return this;
	}

	public MarketIdentification88 getMarketIdentification() {
		return marketIdentification;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setMarketIdentification(MarketIdentification88 marketIdentification) {
		this.marketIdentification = Objects.requireNonNull(marketIdentification);
		return this;
	}

	public Optional<AdditionalInformation5> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setAdditionalInformation(AdditionalInformation5 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01")
	static public class Document {
		@XmlElement(name = "FXTradConfStsAdvcAck", required = true)
		public ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 messageBody;
	}
}