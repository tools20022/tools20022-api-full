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
import java.lang.reflect.Method;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.034.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\n The ForeignExchangeTradeConfirmationRequest message is sent from a market participant to a Central matching utility (CMU) to request a foreign exchange(spot/forward/swap) trade confirmation.\r\n\r\nUsage\r\nThe confirmation request is sent by the market participants to the CMU after they receiving the capture reports.\r\nNote that a confirmation request could be cancelled or amended."
 * </li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * definition} = "Identifies the confirm request messge."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestIdentification";
			definition = "Identifies the confirm request messge.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getRequestIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the treasury trade confirmed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetail = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetail";
			definition = "Details of the treasury trade confirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Trade2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getTradeDetail", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of confirmation message being sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationType = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Identifies the type of confirmation message being sent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ConfirmationRequest1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getConfirmationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
			minOccurs = 1;
			complexType_lazy = () -> Period4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getQueryPeriod", new Class[]{});
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
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getQueryStartNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueryTradeStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the inquiry status of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmQueryTradeStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "QryTradSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueryTradeStatus";
			definition = "Specifies the inquiry status of the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> QueryTradeStatus1Code.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getQueryTradeStatus", new Class[]{});
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
				return ForeignExchangeTradeConfirmationRequestV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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