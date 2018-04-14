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
import com.tools20022.repository.codeset.ConfirmationRequest1Code;
import com.tools20022.repository.codeset.QueryTradeStatus1Code;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FXPostTradeConfirmation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeConfirmationRequest message is sent from a market
 * participant to a Central matching utility (CMU) to request a foreign
 * exchange(spot/forward/swap) trade confirmation.<br>
 * <br>
 * <b>Usage</b><br>
 * The confirmation request is sent by the market participants to the CMU after
 * they receiving the capture reports.<br>
 * Note that a confirmation request could be cancelled or amended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.034.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmHeader
 * ForeignExchangeTradeConfirmationRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmRequestIdentification
 * ForeignExchangeTradeConfirmationRequestV01.mmRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationRequestV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmConfirmationType
 * ForeignExchangeTradeConfirmationRequestV01.mmConfirmationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmQueryPeriod
 * ForeignExchangeTradeConfirmationRequestV01.mmQueryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmQueryStartNumber
 * ForeignExchangeTradeConfirmationRequestV01.mmQueryStartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmQueryTradeStatus
 * ForeignExchangeTradeConfirmationRequestV01.mmQueryTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestV01.mmSupplementaryData}</li>
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
 * xmlTag} = "FXTradConfReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\n The ForeignExchangeTradeConfirmationRequest message is sent from a market participant to a Central matching utility (CMU) to request a foreign exchange(spot/forward/swap) trade confirmation.\r\n\r\nUsage\r\nThe confirmation request is sent by the market participants to the CMU after they receiving the capture reports.\r\nNote that a confirmation request could be cancelled or amended."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestV01", propOrder = {"header", "requestIdentification", "tradeDetail", "confirmationType", "queryPeriod", "queryStartNumber", "queryTradeStatus", "supplementaryData"})
public class ForeignExchangeTradeConfirmationRequestV01 {

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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Header23> mmHeader = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Header23>() {
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
		public Header23 getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, Header23 value) {
			obj.setHeader(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the confirm request messge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, MessageIdentification1> mmRequestIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, MessageIdentification1>() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the confirm request messge.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getRequestIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, MessageIdentification1 value) {
			obj.setRequestIdentification(value);
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Trade2> mmTradeDetail = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Trade2>() {
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
		public Trade2 getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getTradeDetail();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, Trade2 value) {
			obj.setTradeDetail(value);
		}
	};
	@XmlElement(name = "ConfTp", required = true)
	protected ConfirmationRequest1Code confirmationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ConfirmationRequest1Code
	 * ConfirmationRequest1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of confirmation message being sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, ConfirmationRequest1Code> mmConfirmationType = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, ConfirmationRequest1Code>() {
		{
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Identifies the type of confirmation message being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConfirmationRequest1Code.mmObject();
		}

		@Override
		public ConfirmationRequest1Code getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getConfirmationType();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, ConfirmationRequest1Code value) {
			obj.setConfirmationType(value);
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Period4> mmQueryPeriod = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Period4>() {
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
		public Period4 getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getQueryPeriod();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, Period4 value) {
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
	 * definition} = "Start number in request result."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Max35NumericText> mmQueryStartNumber = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, Max35NumericText>() {
		{
			xmlTag = "QryStartNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryStartNumber";
			definition = "Start number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		@Override
		public Max35NumericText getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getQueryStartNumber();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, Max35NumericText value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, QueryTradeStatus1Code> mmQueryTradeStatus = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, QueryTradeStatus1Code>() {
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
		public QueryTradeStatus1Code getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getQueryTradeStatus();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, QueryTradeStatus1Code value) {
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
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeConfirmationRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeConfirmationRequestV01";
				definition = "Scope\r\n The ForeignExchangeTradeConfirmationRequest message is sent from a market participant to a Central matching utility (CMU) to request a foreign exchange(spot/forward/swap) trade confirmation.\r\n\r\nUsage\r\nThe confirmation request is sent by the market participants to the CMU after they receiving the capture reports.\r\nNote that a confirmation request could be cancelled or amended.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeConfirmation.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradConfReq";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmHeader,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmRequestIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmTradeDetail,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmConfirmationType, com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmQueryPeriod,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmQueryStartNumber, com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmQueryTradeStatus,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "034";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeConfirmationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header23 getHeader() {
		return header;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setHeader(Header23 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public MessageIdentification1 getRequestIdentification() {
		return requestIdentification;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setRequestIdentification(MessageIdentification1 requestIdentification) {
		this.requestIdentification = Objects.requireNonNull(requestIdentification);
		return this;
	}

	public Trade2 getTradeDetail() {
		return tradeDetail;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setTradeDetail(Trade2 tradeDetail) {
		this.tradeDetail = Objects.requireNonNull(tradeDetail);
		return this;
	}

	public ConfirmationRequest1Code getConfirmationType() {
		return confirmationType;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setConfirmationType(ConfirmationRequest1Code confirmationType) {
		this.confirmationType = Objects.requireNonNull(confirmationType);
		return this;
	}

	public Period4 getQueryPeriod() {
		return queryPeriod;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setQueryPeriod(Period4 queryPeriod) {
		this.queryPeriod = Objects.requireNonNull(queryPeriod);
		return this;
	}

	public Max35NumericText getQueryStartNumber() {
		return queryStartNumber;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setQueryStartNumber(Max35NumericText queryStartNumber) {
		this.queryStartNumber = Objects.requireNonNull(queryStartNumber);
		return this;
	}

	public QueryTradeStatus1Code getQueryTradeStatus() {
		return queryTradeStatus;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setQueryTradeStatus(QueryTradeStatus1Code queryTradeStatus) {
		this.queryTradeStatus = Objects.requireNonNull(queryTradeStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeConfirmationRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01")
	static public class Document {
		@XmlElement(name = "FXTradConfReq", required = true)
		public ForeignExchangeTradeConfirmationRequestV01 messageBody;
	}
}