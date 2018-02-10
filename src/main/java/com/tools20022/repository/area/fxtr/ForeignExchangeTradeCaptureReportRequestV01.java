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
import com.tools20022.repository.codeset.QueryDataType1Code;
import com.tools20022.repository.codeset.QueryOrderStatus1Code;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.Period4;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.FXPostTradeTradeCapture;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeCaptureReportRequest message is sent by a trading
 * member to the trading system for inquiry of trade capture report. <br>
 * <b>Usage</b><br>
 * The request is sent by the trading member to the trading system to inquire
 * trade capture report. <br>
 * Note a capture request could be rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryRequestIdentification
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryOrderStatus
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryOrderStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryType
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryStartNumber
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryStartNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryByPeriod
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryByPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryPeriod
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryTradeIdentification
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryEndIdentification
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryEndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmSupplementaryData
 * ForeignExchangeTradeCaptureReportRequestV01.mmSupplementaryData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryPageSize
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryPageSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01#mmQueryParameterValue
 * ForeignExchangeTradeCaptureReportRequestV01.mmQueryParameterValue}</li>
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
 * xmlTag} = "FXTradCaptrRptReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.032.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQueryPeriodandTradeIdentificationRule1#forForeignExchangeTradeCaptureReportRequestV01
 * ConstraintQueryPeriodandTradeIdentificationRule1.
 * forForeignExchangeTradeCaptureReportRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintQueryPeriodandTradeIdentificationRule2#forForeignExchangeTradeCaptureReportRequestV01
 * ConstraintQueryPeriodandTradeIdentificationRule2.
 * forForeignExchangeTradeCaptureReportRequestV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeCaptureReportRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeCaptureReportRequest message is sent by a trading member to the trading system for inquiry of trade capture report. \r\nUsage\r\nThe request is sent by the trading member to the trading system to inquire trade capture report. \r\nNote a capture request could be rejected."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeCaptureReportRequestV01", propOrder = {"queryRequestIdentification", "queryOrderStatus", "queryType", "queryStartNumber", "queryByPeriod", "queryPeriod", "queryTradeIdentification",
		"queryEndIdentification", "supplementaryData", "queryPageSize", "queryParameterValue"})
public class ForeignExchangeTradeCaptureReportRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QryReqId", required = true)
	protected MessageIdentification1 queryRequestIdentification;
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
	 * xmlTag} = "QryReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the capture request message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryRequestIdentification";
			definition = "Identifies the capture request message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryOrdrSts", required = true)
	protected QueryOrderStatus1Code queryOrderStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryOrderStatus1Code
	 * QueryOrderStatus1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryOrdrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryOrderStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Range of the trade for the inquire."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryOrderStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryOrdrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryOrderStatus";
			definition = "Range of the trade for the inquire.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QueryOrderStatus1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryOrderStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryTp")
	protected QueryDataType1Code queryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.QueryDataType1Code
	 * QueryDataType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the inquiry type of the data."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryType = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryType";
			definition = "Specifies the inquiry type of the data.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> QueryDataType1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryStartNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Start number in request result."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryStartNumber = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryStartNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryStartNumber";
			definition = "Start number in request result.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryStartNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryByPrd", required = true)
	protected YesNoIndicator queryByPeriod;
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
	 * xmlTag} = "QryByPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryByPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the request is query trade for a period of time."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryByPeriod = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryByPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryByPeriod";
			definition = "Indicates whether the request is query trade for a period of time.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryByPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryPrd")
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period of the inquiry."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryPeriod = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPeriod";
			definition = "Period of the inquiry.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Period4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryPeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryTradId")
	protected Max35Text queryTradeIdentification;
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
	 * xmlTag} = "QryTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "States the identification of the trade which the trading member inquires."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryTradeIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryTradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryTradeIdentification";
			definition = "States the identification of the trade which the trading member inquires.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryTradeIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryEndId")
	protected Max35Text queryEndIdentification;
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
	 * xmlTag} = "QryEndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryEndIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the end of the request result."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryEndIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryEndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryEndIdentification";
			definition = "Identifies the end of the request result.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryEndIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryPgSz")
	protected Max35NumericText queryPageSize;
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
	 * xmlTag} = "QryPgSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryPageSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Largest number of request result."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryPageSize = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryPgSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryPageSize";
			definition = "Largest number of request result.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryPageSize", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "QryParamVal")
	protected Max35Text queryParameterValue;
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
	 * xmlTag} = "QryParamVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryParameterValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the inquiry value of the parameter."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryParameterValue = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryParamVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryParameterValue";
			definition = "Specifies the inquiry value of the parameter.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeCaptureReportRequestV01.class.getMethod("getQueryParameterValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintQueryPeriodandTradeIdentificationRule1.forForeignExchangeTradeCaptureReportRequestV01,
						com.tools20022.repository.constraints.ConstraintQueryPeriodandTradeIdentificationRule2.forForeignExchangeTradeCaptureReportRequestV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeCaptureReportRequestV01";
				definition = "Scope\r\nThe ForeignExchangeTradeCaptureReportRequest message is sent by a trading member to the trading system for inquiry of trade capture report. \r\nUsage\r\nThe request is sent by the trading member to the trading system to inquire trade capture report. \r\nNote a capture request could be rejected.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeTradeCapture.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradCaptrRptReq";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryRequestIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryOrderStatus, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryType,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryStartNumber, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryByPeriod,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryPeriod, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryTradeIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryEndIdentification, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmSupplementaryData,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryPageSize, com.tools20022.repository.area.fxtr.ForeignExchangeTradeCaptureReportRequestV01.mmQueryParameterValue);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "032";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeCaptureReportRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getQueryRequestIdentification() {
		return queryRequestIdentification;
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryRequestIdentification(MessageIdentification1 queryRequestIdentification) {
		this.queryRequestIdentification = Objects.requireNonNull(queryRequestIdentification);
		return this;
	}

	public QueryOrderStatus1Code getQueryOrderStatus() {
		return queryOrderStatus;
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryOrderStatus(QueryOrderStatus1Code queryOrderStatus) {
		this.queryOrderStatus = Objects.requireNonNull(queryOrderStatus);
		return this;
	}

	public Optional<QueryDataType1Code> getQueryType() {
		return queryType == null ? Optional.empty() : Optional.of(queryType);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryType(QueryDataType1Code queryType) {
		this.queryType = queryType;
		return this;
	}

	public Max35NumericText getQueryStartNumber() {
		return queryStartNumber;
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryStartNumber(Max35NumericText queryStartNumber) {
		this.queryStartNumber = Objects.requireNonNull(queryStartNumber);
		return this;
	}

	public YesNoIndicator getQueryByPeriod() {
		return queryByPeriod;
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryByPeriod(YesNoIndicator queryByPeriod) {
		this.queryByPeriod = Objects.requireNonNull(queryByPeriod);
		return this;
	}

	public Optional<Period4> getQueryPeriod() {
		return queryPeriod == null ? Optional.empty() : Optional.of(queryPeriod);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryPeriod(Period4 queryPeriod) {
		this.queryPeriod = queryPeriod;
		return this;
	}

	public Optional<Max35Text> getQueryTradeIdentification() {
		return queryTradeIdentification == null ? Optional.empty() : Optional.of(queryTradeIdentification);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryTradeIdentification(Max35Text queryTradeIdentification) {
		this.queryTradeIdentification = queryTradeIdentification;
		return this;
	}

	public Optional<Max35Text> getQueryEndIdentification() {
		return queryEndIdentification == null ? Optional.empty() : Optional.of(queryEndIdentification);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryEndIdentification(Max35Text queryEndIdentification) {
		this.queryEndIdentification = queryEndIdentification;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	public Optional<Max35NumericText> getQueryPageSize() {
		return queryPageSize == null ? Optional.empty() : Optional.of(queryPageSize);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryPageSize(Max35NumericText queryPageSize) {
		this.queryPageSize = queryPageSize;
		return this;
	}

	public Optional<Max35Text> getQueryParameterValue() {
		return queryParameterValue == null ? Optional.empty() : Optional.of(queryParameterValue);
	}

	public ForeignExchangeTradeCaptureReportRequestV01 setQueryParameterValue(Max35Text queryParameterValue) {
		this.queryParameterValue = queryParameterValue;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.032.001.01")
	static public class Document {
		@XmlElement(name = "FXTradCaptrRptReq", required = true)
		public ForeignExchangeTradeCaptureReportRequestV01 messageBody;
	}
}