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
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A report provider, such as a transfer agent, sends the
 * FundEstimatedCashForecastReport message to the report user, such as an
 * investment manager or pricing agent, to report the estimated cash incomings
 * and outgoings of one or more share classes of an investment fund on one or
 * more trade dates.<br>
 * The cash movements may result from, for example, redemption, subscription,
 * switch transactions or reinvestment of dividends.<br>
 * <b>Usage</b><br>
 * The FundEstimatedCashForecastReport is used to report estimated cash
 * movements, that is, it is sent prior to the cut-off time and/or the price
 * valuation of the fund.<br>
 * The message contains incoming and outgoing cash flows that are estimated,
 * that is, the price has not been applied. If the price is definitive, then the
 * FundConfirmedCashForecastReport message must be used.<br>
 * The message structure allows for the following uses:<br>
 * - to provide cash in and cash out amounts for a fund/sub fund
 * (FundOrSubFundDetails sequence is used),<br>
 * - to provide cash in and cash out amounts for a fund/sub fund and one or more
 * share classes (a FundOrSubFundDetails sequence and one or more
 * EstimatedFundCashForecastDetails sequences are used),<br>
 * - to provide cash in and cash out amounts for one or more share classes (one
 * or more EstimatedFundCashForecastDetails sequences are used).<br>
 * - to provide cash in and cash out amounts for more than one fund/sub fund,
 * and more than one share classes (two or more FundOrSubFundDetails sequences
 * and two or more EstimatedFundCashForecastDetails sequences and used);
 * however, it should be noted that, in this usage, there is no way to determine
 * which share class belongs to which fund/sub fund from the message content
 * itself, which may not be desirable and the use of this kind of combination
 * should be bilaterally agreed.<br>
 * This message allows the report provider to report estimated cash movements in
 * or out of a fund, but does not allow the Sender to categorise these
 * movements, for example by country, or to give details of the underlying
 * orders, commission or charges. If the report provider wishes to give detailed
 * information related to estimated cash movements, then the
 * FundDetailedEstimatedCashForecastReport message must be used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessageIdentification
 * FundEstimatedCashForecastReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPoolReference
 * FundEstimatedCashForecastReportV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmPreviousReference
 * FundEstimatedCashForecastReportV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmRelatedReference
 * FundEstimatedCashForecastReportV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmMessagePagination
 * FundEstimatedCashForecastReportV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmFundOrSubFundDetails
 * FundEstimatedCashForecastReportV04.mmFundOrSubFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmEstimatedFundCashForecastDetails
 * FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmConsolidatedNetCashForecast
 * FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmExtension
 * FundEstimatedCashForecastReportV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FndEstmtdCshFcstRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.040.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDate1Rule#forFundEstimatedCashForecastReportV04
 * ConstraintTradeDate1Rule.forFundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousTradeDateRule#forFundEstimatedCashForecastReportV04
 * ConstraintPreviousTradeDateRule.forFundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDate2Rule#forFundEstimatedCashForecastReportV04
 * ConstraintTradeDate2Rule.forFundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintConsolidatedNetCashRule#forFundEstimatedCashForecastReportV04
 * ConstraintConsolidatedNetCashRule.forFundEstimatedCashForecastReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundOrSubFundAndShareClassGuideline#forFundEstimatedCashForecastReportV04
 * ConstraintFundOrSubFundAndShareClassGuideline.
 * forFundEstimatedCashForecastReportV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundEstimatedCashForecastReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA report provider, such as a transfer agent, sends the FundEstimatedCashForecastReport message to the report user, such as an investment manager or pricing agent, to report the estimated cash incomings and outgoings of one or more share classes of an investment fund on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundEstimatedCashForecastReport is used to report estimated cash movements, that is, it is sent prior to the cut-off time and/or the price valuation of the fund.\r\nThe message contains incoming and outgoing cash flows that are estimated, that is, the price has not been applied. If the price is definitive, then the FundConfirmedCashForecastReport message must be used.\r\nThe message structure allows for the following uses:\r\n-\tto provide cash in and cash out amounts for a fund/sub fund (FundOrSubFundDetails sequence is used),\r\n-\tto provide cash in and cash out amounts for a fund/sub fund and one or more share classes (a FundOrSubFundDetails sequence and one or more EstimatedFundCashForecastDetails sequences are used),\r\n-\tto provide cash in and cash out amounts for one or more share classes (one or more EstimatedFundCashForecastDetails sequences are used).\r\n-\tto provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes (two or more FundOrSubFundDetails sequences and two or more EstimatedFundCashForecastDetails sequences and used); however, it should be noted that, in this usage, there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and the use of this kind of combination should be bilaterally agreed.\r\nThis message allows the report provider to report estimated cash movements in or out of a fund, but does not allow the Sender to categorise these movements, for example by country, or to give details of the underlying orders, commission or charges. If the report provider wishes to give detailed information related to estimated cash movements, then the FundDetailedEstimatedCashForecastReport message must be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03
 * FundEstimatedCashForecastReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundEstimatedCashForecastReportV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "messagePagination", "fundOrSubFundDetails", "estimatedFundCashForecastDetails",
		"consolidatedNetCashForecast", "extension"})
public class FundEstimatedCashForecastReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessageIdentification
	 * FundEstimatedCashForecastReportV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPoolReference
	 * FundEstimatedCashForecastReportV03.mmPoolReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmPoolReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
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
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmPreviousReference
	 * FundEstimatedCashForecastReportV03.mmPreviousReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmPreviousReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<AdditionalReference3> relatedReference;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmRelatedReference
	 * FundEstimatedCashForecastReportV03.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmRelatedReference;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmMessagePagination
	 * FundEstimatedCashForecastReportV03.mmMessagePagination}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmMessagePagination;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FndOrSubFndDtls")
	protected List<Fund1> fundOrSubFundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Fund1 Fund1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndOrSubFndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrSubFundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFundOrSubFundDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "FndOrSubFndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOrSubFundDetails";
			definition = "Information about the fund/sub fund when the report either specifies cash flow for the fund/sub fund or for a share class of the fund/sub fund.";
			minOccurs = 0;
			complexType_lazy = () -> Fund1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getFundOrSubFundDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "EstmtdFndCshFcstDtls")
	protected List<EstimatedFundCashForecast6> estimatedFundCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
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
	 * "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmEstimatedFundCashForecastDetails
	 * FundEstimatedCashForecastReportV03.mmEstimatedFundCashForecastDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmEstimatedFundCashForecastDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "EstmtdFndCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedFundCashForecastDetails";
			definition = "Information related to the estimated cash-in and cash-out flows for a specific trade date as a result of transactions in shares in an investment fund, for example, subscriptions, redemptions or switches.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmEstimatedFundCashForecastDetails;
			minOccurs = 0;
			complexType_lazy = () -> EstimatedFundCashForecast6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getEstimatedFundCashForecastDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CnsltdNetCshFcst")
	protected NetCashForecast3 consolidatedNetCashForecast;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmConsolidatedNetCashForecast
	 * FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConsolidatedNetCashForecast = new MMMessageBuildingBlock() {
		{
			xmlTag = "CnsltdNetCshFcst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsolidatedNetCashForecast";
			definition = "Estimated net cash as a result of the cash-in and cash-out flows.";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmConsolidatedNetCashForecast;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NetCashForecast3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getConsolidatedNetCashForecast", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV03#mmExtension
	 * FundEstimatedCashForecastReportV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FundEstimatedCashForecastReportV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDate1Rule.forFundEstimatedCashForecastReportV04,
						com.tools20022.repository.constraints.ConstraintPreviousTradeDateRule.forFundEstimatedCashForecastReportV04, com.tools20022.repository.constraints.ConstraintTradeDate2Rule.forFundEstimatedCashForecastReportV04,
						com.tools20022.repository.constraints.ConstraintConsolidatedNetCashRule.forFundEstimatedCashForecastReportV04,
						com.tools20022.repository.constraints.ConstraintFundOrSubFundAndShareClassGuideline.forFundEstimatedCashForecastReportV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundEstimatedCashForecastReportV04";
				definition = "Scope\r\nA report provider, such as a transfer agent, sends the FundEstimatedCashForecastReport message to the report user, such as an investment manager or pricing agent, to report the estimated cash incomings and outgoings of one or more share classes of an investment fund on one or more trade dates.\r\nThe cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.\r\nUsage\r\nThe FundEstimatedCashForecastReport is used to report estimated cash movements, that is, it is sent prior to the cut-off time and/or the price valuation of the fund.\r\nThe message contains incoming and outgoing cash flows that are estimated, that is, the price has not been applied. If the price is definitive, then the FundConfirmedCashForecastReport message must be used.\r\nThe message structure allows for the following uses:\r\n-\tto provide cash in and cash out amounts for a fund/sub fund (FundOrSubFundDetails sequence is used),\r\n-\tto provide cash in and cash out amounts for a fund/sub fund and one or more share classes (a FundOrSubFundDetails sequence and one or more EstimatedFundCashForecastDetails sequences are used),\r\n-\tto provide cash in and cash out amounts for one or more share classes (one or more EstimatedFundCashForecastDetails sequences are used).\r\n-\tto provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes (two or more FundOrSubFundDetails sequences and two or more EstimatedFundCashForecastDetails sequences and used); however, it should be noted that, in this usage, there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and the use of this kind of combination should be bilaterally agreed.\r\nThis message allows the report provider to report estimated cash movements in or out of a fund, but does not allow the Sender to categorise these movements, for example by country, or to give details of the underlying orders, commission or charges. If the report provider wishes to give detailed information related to estimated cash movements, then the FundDetailedEstimatedCashForecastReport message must be used.";
				previousVersion_lazy = () -> FundEstimatedCashForecastReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "FndEstmtdCshFcstRpt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmMessageIdentification,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmPoolReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmPreviousReference,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmRelatedReference, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmMessagePagination,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmFundOrSubFundDetails, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails,
						com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmConsolidatedNetCashForecast, com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "040";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FundEstimatedCashForecastReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public FundEstimatedCashForecastReportV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public FundEstimatedCashForecastReportV04 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public FundEstimatedCashForecastReportV04 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public FundEstimatedCashForecastReportV04 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public FundEstimatedCashForecastReportV04 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public List<Fund1> getFundOrSubFundDetails() {
		return fundOrSubFundDetails == null ? fundOrSubFundDetails = new ArrayList<>() : fundOrSubFundDetails;
	}

	public FundEstimatedCashForecastReportV04 setFundOrSubFundDetails(List<Fund1> fundOrSubFundDetails) {
		this.fundOrSubFundDetails = Objects.requireNonNull(fundOrSubFundDetails);
		return this;
	}

	public List<EstimatedFundCashForecast6> getEstimatedFundCashForecastDetails() {
		return estimatedFundCashForecastDetails == null ? estimatedFundCashForecastDetails = new ArrayList<>() : estimatedFundCashForecastDetails;
	}

	public FundEstimatedCashForecastReportV04 setEstimatedFundCashForecastDetails(List<EstimatedFundCashForecast6> estimatedFundCashForecastDetails) {
		this.estimatedFundCashForecastDetails = Objects.requireNonNull(estimatedFundCashForecastDetails);
		return this;
	}

	public Optional<NetCashForecast3> getConsolidatedNetCashForecast() {
		return consolidatedNetCashForecast == null ? Optional.empty() : Optional.of(consolidatedNetCashForecast);
	}

	public FundEstimatedCashForecastReportV04 setConsolidatedNetCashForecast(NetCashForecast3 consolidatedNetCashForecast) {
		this.consolidatedNetCashForecast = consolidatedNetCashForecast;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public FundEstimatedCashForecastReportV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.040.001.04")
	static public class Document {
		@XmlElement(name = "FndEstmtdCshFcstRpt", required = true)
		public FundEstimatedCashForecastReportV04 messageBody;
	}
}