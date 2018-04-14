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
import com.tools20022.repository.codeset.QueryTradeStatus1Code;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FXPostTradeConfirmation;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeConfirmationRequestAmendmentRequest message is sent
 * from a market participant to a Central matching utility (CMU) to amend the
 * ForeignExchangeTradeConfirmationRequest previously sent.<br>
 * <br>
 * <b>Usage</b><br>
 * The request is sent by the market participants to the CMU after the
 * confirmation is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.035.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmHeader
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmAmendmentRequestIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmAmendmentRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmQueryPeriod
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmQueryStartNumber
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryStartNumber
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmQueryTradeStatus
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryTradeStatus
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.
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
 * xmlTag} = "FXTradConfReqAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationRequestAmendmentRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeConfirmationRequestAmendmentRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.\r\n\r\nUsage\r\nThe request is sent by the market participants to the CMU after the confirmation is requested."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestAmendmentRequestV01", propOrder = {"header", "amendmentRequestIdentification", "tradingSideIdentification", "counterpartySideIdentification", "tradeDetail", "queryPeriod",
		"queryStartNumber", "queryTradeStatus", "supplementaryData"})
public class ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header23 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header23
	 * Header23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Header23> mmHeader = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Header23>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header23.mmObject();
		}

		@Override
		public Header23 getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Header23 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AmdmntReqId", required = true)
	protected MessageIdentification1 amendmentRequestIdentification;
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
	 * xmlTag} = "AmdmntReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the amendment request messge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, MessageIdentification1> mmAmendmentRequestIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, MessageIdentification1>() {
		{
			xmlTag = "AmdmntReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRequestIdentification";
			definition = "Identifies the amendment request messge.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getAmendmentRequestIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, MessageIdentification1 value) {
			obj.setAmendmentRequestIdentification(value);
		}
	};
	@XmlElement(name = "TradgSdId")
	protected TradePartyIdentification7 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trading side of the treasury trade which is captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Optional<TradePartyIdentification7>> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Optional<TradePartyIdentification7>>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		@Override
		public Optional<TradePartyIdentification7> getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Optional<TradePartyIdentification7> value) {
			obj.setTradingSideIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtySdId")
	protected TradePartyIdentification7 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty side of the treasury trade which is captured."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Optional<TradePartyIdentification7>> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Optional<TradePartyIdentification7>>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		@Override
		public Optional<TradePartyIdentification7> getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Optional<TradePartyIdentification7> value) {
			obj.setCounterpartySideIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtl", required = true)
	protected Trade2 tradeDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Trade2 Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the treasury trade confirmed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Trade2> mmTradeDetail = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Trade2>() {
		{
			xmlTag = "TradDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetail";
			definition = "Details of the treasury trade confirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Trade2.mmObject();
		}

		@Override
		public Trade2 getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getTradeDetail();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Trade2 value) {
			obj.setTradeDetail(value);
		}
	};
	@XmlElement(name = "QryPrd", required = true)
	protected Period4 queryPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Period4 Period4}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the inquiry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Period4> mmQueryPeriod = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Period4>() {
		{
			xmlTag = "QryPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPeriod";
			definition = "Period of the inquiry.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Period4.mmObject();
		}

		@Override
		public Period4 getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getQueryPeriod();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Period4 value) {
			obj.setQueryPeriod(value);
		}
	};
	@XmlElement(name = "QryStartNb", required = true)
	protected Max35NumericText queryStartNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryStartNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryStartNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number which the query results will start from."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Max35NumericText> mmQueryStartNumber = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, Max35NumericText>() {
		{
			xmlTag = "QryStartNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryStartNumber";
			definition = "Number which the query results will start from.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getQueryStartNumber();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, Max35NumericText value) {
			obj.setQueryStartNumber(value);
		}
	};
	@XmlElement(name = "QryTradSts", required = true)
	protected QueryTradeStatus1Code queryTradeStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryTradeStatus1Code
	 * QueryTradeStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTradSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the inquiry status of the trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, QueryTradeStatus1Code> mmQueryTradeStatus = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, QueryTradeStatus1Code>() {
		{
			xmlTag = "QryTradSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryTradeStatus";
			definition = "Specifies the inquiry status of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QueryTradeStatus1Code.mmObject();
		}

		@Override
		public QueryTradeStatus1Code getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getQueryTradeStatus();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, QueryTradeStatus1Code value) {
			obj.setQueryTradeStatus(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestAmendmentRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeConfirmationRequestAmendmentRequestV01";
				definition = "Scope\r\nThe ForeignExchangeTradeConfirmationRequestAmendmentRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.\r\n\r\nUsage\r\nThe request is sent by the market participants to the CMU after the confirmation is requested.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeConfirmation.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradConfReqAmdmntReq";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmHeader,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmAmendmentRequestIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmCounterpartySideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmTradeDetail,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryPeriod,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryStartNumber,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmQueryTradeStatus,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "035";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeConfirmationRequestAmendmentRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header23 getHeader() {
		return header;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setHeader(Header23 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public MessageIdentification1 getAmendmentRequestIdentification() {
		return amendmentRequestIdentification;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setAmendmentRequestIdentification(MessageIdentification1 amendmentRequestIdentification) {
		this.amendmentRequestIdentification = Objects.requireNonNull(amendmentRequestIdentification);
		return this;
	}

	public Optional<TradePartyIdentification7> getTradingSideIdentification() {
		return tradingSideIdentification == null ? Optional.empty() : Optional.of(tradingSideIdentification);
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setTradingSideIdentification(TradePartyIdentification7 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
		return this;
	}

	public Optional<TradePartyIdentification7> getCounterpartySideIdentification() {
		return counterpartySideIdentification == null ? Optional.empty() : Optional.of(counterpartySideIdentification);
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setCounterpartySideIdentification(TradePartyIdentification7 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
		return this;
	}

	public Trade2 getTradeDetail() {
		return tradeDetail;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setTradeDetail(Trade2 tradeDetail) {
		this.tradeDetail = Objects.requireNonNull(tradeDetail);
		return this;
	}

	public Period4 getQueryPeriod() {
		return queryPeriod;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQueryPeriod(Period4 queryPeriod) {
		this.queryPeriod = Objects.requireNonNull(queryPeriod);
		return this;
	}

	public Max35NumericText getQueryStartNumber() {
		return queryStartNumber;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQueryStartNumber(Max35NumericText queryStartNumber) {
		this.queryStartNumber = Objects.requireNonNull(queryStartNumber);
		return this;
	}

	public QueryTradeStatus1Code getQueryTradeStatus() {
		return queryTradeStatus;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setQueryTradeStatus(QueryTradeStatus1Code queryTradeStatus) {
		this.queryTradeStatus = Objects.requireNonNull(queryTradeStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01")
	static public class Document {
		@XmlElement(name = "FXTradConfReqAmdmntReq", required = true)
		public ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 messageBody;
	}
}