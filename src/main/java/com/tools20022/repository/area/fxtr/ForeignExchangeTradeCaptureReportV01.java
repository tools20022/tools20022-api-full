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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FXPostTradeTradeCapture;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeCaptureReport message is sent by a trading system to
 * a participant for notification and providing details of a treasury trade.<br>
 * <b>Usage</b><br>
 * The report is sent by the trading system to the two trading parties after
 * their trade has been executed. <br>
 * The report can also be sent by the trading system to a trading parties to
 * respond their inquiry (TradeCaptureRequest). <br>
 * Note that multiple reports can be sent to respond one inquiry message.<br>
 * The message may contains trade details and trading parties' information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.031.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmHeader
 * ForeignExchangeTradeCaptureReportV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmReportIdentification
 * ForeignExchangeTradeCaptureReportV01.mmReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmTradingSideIdentification
 * ForeignExchangeTradeCaptureReportV01.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeCaptureReportV01.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmTradeDetail
 * ForeignExchangeTradeCaptureReportV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmReference
 * ForeignExchangeTradeCaptureReportV01.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmRequestResponder
 * ForeignExchangeTradeCaptureReportV01.mmRequestResponder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmRequestRejected
 * ForeignExchangeTradeCaptureReportV01.mmRequestRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmQueryRejectReason
 * ForeignExchangeTradeCaptureReportV01.mmQueryRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmTotalNumberTrades
 * ForeignExchangeTradeCaptureReportV01.mmTotalNumberTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmLastReportRequested
 * ForeignExchangeTradeCaptureReportV01.mmLastReportRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FXPostTradeTradeCapture
 * FXPostTradeTradeCapture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradCaptrRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeCaptureReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeCaptureReport message is sent by a trading system to a participant for notification and providing details of a treasury trade.\r\nUsage\r\nThe report is sent by the trading system to the two trading parties after their trade has been executed. \r\nThe report can also be sent by the trading system to a trading parties to respond their inquiry (TradeCaptureRequest). \r\nNote that multiple reports can be sent to respond one inquiry message.\r\nThe message may contains trade details and trading parties' information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestRejectedRule#for_fxtr_ForeignExchangeTradeCaptureReportV01
 * ConstraintRequestRejectedRule.for_fxtr_ForeignExchangeTradeCaptureReportV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestResponderRule#for_fxtr_ForeignExchangeTradeCaptureReportV01
 * ConstraintRequestResponderRule.for_fxtr_ForeignExchangeTradeCaptureReportV01}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalNumberTradesRule#for_fxtr_ForeignExchangeTradeCaptureReportV01
 * ConstraintTotalNumberTradesRule.for_fxtr_ForeignExchangeTradeCaptureReportV01
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeCaptureReportV01", propOrder = {"header", "reportIdentification", "tradingSideIdentification", "counterpartySideIdentification", "tradeDetail", "reference", "requestResponder", "requestRejected",
		"queryRejectReason", "totalNumberTrades", "lastReportRequested", "supplementaryData"})
public class ForeignExchangeTradeCaptureReportV01 {

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
	 * definition} = "Capture report message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Header23> mmHeader = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Header23>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Capture report message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header23.mmObject();
		}

		@Override
		public Header23 getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Header23 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "RptId")
	protected MessageIdentification1 reportIdentification;
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
	 * xmlTag} = "RptId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the capture report message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<MessageIdentification1>> mmReportIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<MessageIdentification1>>() {
		{
			xmlTag = "RptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportIdentification";
			definition = "Identifies the capture report message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getReportIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<MessageIdentification1> value) {
			obj.setReportIdentification(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<TradePartyIdentification7>> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<TradePartyIdentification7>>() {
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
		public Optional<TradePartyIdentification7> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<TradePartyIdentification7> value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<TradePartyIdentification7>> mmCounterpartySideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<TradePartyIdentification7>>() {
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
		public Optional<TradePartyIdentification7> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<TradePartyIdentification7> value) {
			obj.setCounterpartySideIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtl")
	protected Trade1 tradeDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Trade1 Trade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the treasury trade captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Trade1>> mmTradeDetail = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Trade1>>() {
		{
			xmlTag = "TradDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetail";
			definition = "Details of the treasury trade captured.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Trade1.mmObject();
		}

		@Override
		public Optional<Trade1> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getTradeDetail();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<Trade1> value) {
			obj.setTradeDetail(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref")
	protected AdditionalReferences reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<AdditionalReferences>> mmReference = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<AdditionalReferences>>() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference of the report.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReferences.mmObject();
		}

		@Override
		public Optional<AdditionalReferences> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<AdditionalReferences> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqRspndr", required = true)
	protected YesNoIndicator requestResponder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRspndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestResponder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if this report is for responding to a capture request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, YesNoIndicator> mmRequestResponder = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, YesNoIndicator>() {
		{
			xmlTag = "ReqRspndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestResponder";
			definition = "Indicates if this report is for responding to a capture request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getRequestResponder();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, YesNoIndicator value) {
			obj.setRequestResponder(value);
		}
	};
	@XmlElement(name = "ReqRjctd")
	protected YesNoIndicator requestRejected;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqRjctd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if this report is a rejection report for responding to a capture request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<YesNoIndicator>> mmRequestRejected = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<YesNoIndicator>>() {
		{
			xmlTag = "ReqRjctd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestRejected";
			definition = "Indicates if this report is a rejection report for responding to a capture request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getRequestRejected();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<YesNoIndicator> value) {
			obj.setRequestRejected(value.orElse(null));
		}
	};
	@XmlElement(name = "QryRjctRsn")
	protected Max35Text queryRejectReason;
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
	 * xmlTag} = "QryRjctRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryRejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of rejection."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Max35Text>> mmQueryRejectReason = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Max35Text>>() {
		{
			xmlTag = "QryRjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryRejectReason";
			definition = "Reason of rejection.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getQueryRejectReason();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<Max35Text> value) {
			obj.setQueryRejectReason(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlNbTrds")
	protected Number totalNumberTrades;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbTrds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the total number of trades."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Number>> mmTotalNumberTrades = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<Number>>() {
		{
			xmlTag = "TtlNbTrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberTrades";
			definition = "Indicates the total number of trades.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getTotalNumberTrades();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<Number> value) {
			obj.setTotalNumberTrades(value.orElse(null));
		}
	};
	@XmlElement(name = "LastRptReqd")
	protected YesNoIndicator lastReportRequested;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastRptReqd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastReportRequested"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if this report is the last report sent for responding to one capture request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<YesNoIndicator>> mmLastReportRequested = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, Optional<YesNoIndicator>>() {
		{
			xmlTag = "LastRptReqd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastReportRequested";
			definition = "Indicates if this report is the last report sent for responding to one capture request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getLastReportRequested();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, Optional<YesNoIndicator> value) {
			obj.setLastReportRequested(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeCaptureReportV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeCaptureReportV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeCaptureReportV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequestRejectedRule.for_fxtr_ForeignExchangeTradeCaptureReportV01,
						com.tools20022.repository.constraints.ConstraintRequestResponderRule.for_fxtr_ForeignExchangeTradeCaptureReportV01,
						com.tools20022.repository.constraints.ConstraintTotalNumberTradesRule.for_fxtr_ForeignExchangeTradeCaptureReportV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeCaptureReportV01";
				definition = "Scope\r\nThe ForeignExchangeTradeCaptureReport message is sent by a trading system to a participant for notification and providing details of a treasury trade.\r\nUsage\r\nThe report is sent by the trading system to the two trading parties after their trade has been executed. \r\nThe report can also be sent by the trading system to a trading parties to respond their inquiry (TradeCaptureRequest). \r\nNote that multiple reports can be sent to respond one inquiry message.\r\nThe message may contains trade details and trading parties' information.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeTradeCapture.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradCaptrRpt";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmHeader,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmReportIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmCounterpartySideIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmTradeDetail,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmReference, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmRequestResponder,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmRequestRejected, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmQueryRejectReason,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmTotalNumberTrades, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmLastReportRequested,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "031";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeCaptureReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header23 getHeader() {
		return header;
	}

	public ForeignExchangeTradeCaptureReportV01 setHeader(Header23 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<MessageIdentification1> getReportIdentification() {
		return reportIdentification == null ? Optional.empty() : Optional.of(reportIdentification);
	}

	public ForeignExchangeTradeCaptureReportV01 setReportIdentification(MessageIdentification1 reportIdentification) {
		this.reportIdentification = reportIdentification;
		return this;
	}

	public Optional<TradePartyIdentification7> getTradingSideIdentification() {
		return tradingSideIdentification == null ? Optional.empty() : Optional.of(tradingSideIdentification);
	}

	public ForeignExchangeTradeCaptureReportV01 setTradingSideIdentification(TradePartyIdentification7 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
		return this;
	}

	public Optional<TradePartyIdentification7> getCounterpartySideIdentification() {
		return counterpartySideIdentification == null ? Optional.empty() : Optional.of(counterpartySideIdentification);
	}

	public ForeignExchangeTradeCaptureReportV01 setCounterpartySideIdentification(TradePartyIdentification7 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
		return this;
	}

	public Optional<Trade1> getTradeDetail() {
		return tradeDetail == null ? Optional.empty() : Optional.of(tradeDetail);
	}

	public ForeignExchangeTradeCaptureReportV01 setTradeDetail(Trade1 tradeDetail) {
		this.tradeDetail = tradeDetail;
		return this;
	}

	public Optional<AdditionalReferences> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public ForeignExchangeTradeCaptureReportV01 setReference(AdditionalReferences reference) {
		this.reference = reference;
		return this;
	}

	public YesNoIndicator getRequestResponder() {
		return requestResponder;
	}

	public ForeignExchangeTradeCaptureReportV01 setRequestResponder(YesNoIndicator requestResponder) {
		this.requestResponder = Objects.requireNonNull(requestResponder);
		return this;
	}

	public Optional<YesNoIndicator> getRequestRejected() {
		return requestRejected == null ? Optional.empty() : Optional.of(requestRejected);
	}

	public ForeignExchangeTradeCaptureReportV01 setRequestRejected(YesNoIndicator requestRejected) {
		this.requestRejected = requestRejected;
		return this;
	}

	public Optional<Max35Text> getQueryRejectReason() {
		return queryRejectReason == null ? Optional.empty() : Optional.of(queryRejectReason);
	}

	public ForeignExchangeTradeCaptureReportV01 setQueryRejectReason(Max35Text queryRejectReason) {
		this.queryRejectReason = queryRejectReason;
		return this;
	}

	public Optional<Number> getTotalNumberTrades() {
		return totalNumberTrades == null ? Optional.empty() : Optional.of(totalNumberTrades);
	}

	public ForeignExchangeTradeCaptureReportV01 setTotalNumberTrades(Number totalNumberTrades) {
		this.totalNumberTrades = totalNumberTrades;
		return this;
	}

	public Optional<YesNoIndicator> getLastReportRequested() {
		return lastReportRequested == null ? Optional.empty() : Optional.of(lastReportRequested);
	}

	public ForeignExchangeTradeCaptureReportV01 setLastReportRequested(YesNoIndicator lastReportRequested) {
		this.lastReportRequested = lastReportRequested;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeCaptureReportV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01")
	static public class Document {
		@XmlElement(name = "FXTradCaptrRpt", required = true)
		public ForeignExchangeTradeCaptureReportV01 messageBody;
	}
}