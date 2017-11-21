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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A report provider, such as a transfer agent, sends the
 * FundEstimatedCashForecastReport message to the report user, such as an
 * investment manager, to report the estimated cash incomings and outgoings of
 * one or more investment funds on one or more trade dates.<br>
 * The cash movements may result from, for example, redemption, subscription,
 * switch transactions or reinvestment of dividends.<br>
 * <b>Usage</b><br>
 * The FundEstimatedCashForecastReport is used to report estimated cash
 * movements, i.e., it is sent prior to the cut-off time and/or the price
 * valuation of the fund.<br>
 * The FundEstimatedCashForecastReport contains incoming and outgoing cash flows
 * that are estimated, i.e., the price has not been applied. If the price is
 * definitive, then the FundConfirmedCashForecastReport message must be used.<br>
 * This message allows the report provider to report estimated cash movements in
 * or out of a fund, but does not allow the Sender to categorise these
 * movements, for example by country, or to give details of the underlying
 * orders, commission or charges. If the report provider wishes to give detailed
 * information related to estimated cash movements, then the
 * FundDetailedEstimatedCashForecastReport message must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementPreviousVersion
 * CashManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndEstmtdCshFcstRptV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessageIdentification
 * FundEstimatedCashForecastReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPoolReference
 * FundEstimatedCashForecastReportV03.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPreviousReference
 * FundEstimatedCashForecastReportV03.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmRelatedReference
 * FundEstimatedCashForecastReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessagePagination
 * FundEstimatedCashForecastReportV03.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmEstimatedFundCashForecastDetails
 * FundEstimatedCashForecastReportV03.mmEstimatedFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmConsolidatedNetCashForecast
 * FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmExtension
 * FundEstimatedCashForecastReportV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.040.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundEstimatedCashForecastReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, such as a transfer agent, sends the FundEstimatedCashForecastReport message to the report user, such as an investment manager, to report the estimated cash incomings and outgoings of one or more investment funds on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundEstimatedCashForecastReport is used to report estimated cash movements, i.e., it is sent prior to the cut-off time and/or the price valuation of the fund.\r\nThe FundEstimatedCashForecastReport contains incoming and outgoing cash flows that are estimated, i.e., the price has not been applied. If the price is definitive, then the FundConfirmedCashForecastReport message must be used.\r\nThis message allows the report provider to report estimated cash movements in or out of a fund, but does not allow the Sender to categorise these movements, for example by country, or to give details of the underlying orders, commission or charges. If the report provider wishes to give detailed information related to estimated cash movements, then the FundDetailedEstimatedCashForecastReport message must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04
 * FundEstimatedCashForecastReportV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV02
 * FundEstimatedCashForecastReportV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FundEstimatedCashForecastReportV03", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "messagePagination", "estimatedFundCashForecastDetails", "consolidatedNetCashForecast",
		"extension"})
public class FundEstimatedCashForecastReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Identifies the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessageIdentification
	 * FundEstimatedCashForecastReportV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 poolReference;
	/**
	 * Collective reference identifying a set of messages
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPoolReference
	 * FundEstimatedCashForecastReportV04.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference3> previousReference;
	/**
	 * Reference to a linked message that was previously sent
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPreviousReference
	 * FundEstimatedCashForecastReportV04.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AdditionalReference3> relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmRelatedReference
	 * FundEstimatedCashForecastReportV04.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmRelatedReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Pagination messagePagination;
	/**
	 * Pagination of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessagePagination
	 * FundEstimatedCashForecastReportV04.mmMessagePagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmMessagePagination);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<EstimatedFundCashForecast3> estimatedFundCashForecastDetails;
	/**
	 * Information related to the estimated cash-in and cash-out flows for a
	 * specific trade date as a result of investment fund transactions, for
	 * example, subscriptions, redemptions or switch to/from a specified
	 * investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3
	 * EstimatedFundCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdFndCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedFundCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example,  subscriptions, redemptions or switch to/from a specified investment fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmEstimatedFundCashForecastDetails
	 * FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstimatedFundCashForecastDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstmtdFndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedFundCashForecastDetails";
			definition = "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of investment fund transactions, for example,  subscriptions, redemptions or switch to/from a specified investment fund.";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails);
			minOccurs = 1;
			complexType_lazy = () -> EstimatedFundCashForecast3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getEstimatedFundCashForecastDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NetCashForecast3 consolidatedNetCashForecast;
	/**
	 * Estimated net cash as a result of the cash-in and cash-out flows.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NetCashForecast3
	 * NetCashForecast3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnsltdNetCshFcst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsolidatedNetCashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated net cash as a result of the cash-in and cash-out flows."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmConsolidatedNetCashForecast
	 * FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConsolidatedNetCashForecast = new MMMessageBuildingBlock() {
		{
			xmlTag = "CnsltdNetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashForecast";
			definition = "Estimated net cash as a result of the cash-in and cash-out flows.";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NetCashForecast3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getConsolidatedNetCashForecast", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that can not be captured in the structured fields
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmExtension
	 * FundEstimatedCashForecastReportV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundEstimatedCashForecastReportV03";
				definition = "Scope\r\nA report provider, such as a transfer agent, sends the FundEstimatedCashForecastReport message to the report user, such as an investment manager, to report the estimated cash incomings and outgoings of one or more investment funds on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundEstimatedCashForecastReport is used to report estimated cash movements, i.e., it is sent prior to the cut-off time and/or the price valuation of the fund.\r\nThe FundEstimatedCashForecastReport contains incoming and outgoing cash flows that are estimated, i.e., the price has not been applied. If the price is definitive, then the FundConfirmedCashForecastReport message must be used.\r\nThis message allows the report provider to report estimated cash movements in or out of a fund, but does not allow the Sender to categorise these movements, for example by country, or to give details of the underlying orders, commission or charges. If the report provider wishes to give detailed information related to estimated cash movements, then the FundDetailedEstimatedCashForecastReport message must be used.";
				nextVersions_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmObject());
				previousVersion_lazy = () -> FundEstimatedCashForecastReportV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FndEstmtdCshFcstRptV03";
				businessArea_lazy = () -> CashManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmMessageIdentification,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmPoolReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmPreviousReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmRelatedReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmMessagePagination,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmEstimatedFundCashForecastDetails, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "040";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundEstimatedCashForecastReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "PoolRef")
	public AdditionalReference3 getPoolReference() {
		return poolReference;
	}

	public void setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
	}

	@XmlElement(name = "PrvsRef")
	public List<AdditionalReference3> getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "RltdRef")
	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "MsgPgntn", required = true)
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}

	@XmlElement(name = "EstmtdFndCshFcstDtls", required = true)
	public List<EstimatedFundCashForecast3> getEstimatedFundCashForecastDetails() {
		return estimatedFundCashForecastDetails;
	}

	public void setEstimatedFundCashForecastDetails(List<EstimatedFundCashForecast3> estimatedFundCashForecastDetails) {
		this.estimatedFundCashForecastDetails = estimatedFundCashForecastDetails;
	}

	@XmlElement(name = "CnsltdNetCshFcst")
	public NetCashForecast3 getConsolidatedNetCashForecast() {
		return consolidatedNetCashForecast;
	}

	public void setConsolidatedNetCashForecast(NetCashForecast3 consolidatedNetCashForecast) {
		this.consolidatedNetCashForecast = consolidatedNetCashForecast;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.040.03.03")
	static public class Document {
		@XmlElement(name = "FndEstmtdCshFcstRptV03", required = true)
		public FundEstimatedCashForecastReportV03 messageBody;
	}
}