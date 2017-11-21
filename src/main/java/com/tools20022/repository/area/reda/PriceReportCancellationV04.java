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

package com.tools20022.repository.area.reda;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ReferenceDataLatestVersion;
import com.tools20022.repository.choice.DateAndDateTime1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * SCOPE<br>
 * A report provider, for example, a transfer agent, fund accountant or market
 * data provider, sends the PriceReportCancellation message to the report
 * recipient, for example, a fund management company, transfer agent, market
 * data provider, regulator or any other interested party to cancel previously
 * sent prices. <br>
 * USAGE<br>
 * The PriceReportCancellation message is used to either: - cancel an entire
 * PriceReport that was previously sent (by quoting the business reference of
 * the original price report in the PriceReportIdentification element), or, -
 * cancel one or more individual prices from a previously sent price report (by
 * using the PriceDetailsToBeCancelled sequence). Technically, it is possible to
 * cancel all the prices individually by using the PriceDetailsToBeCancelled
 * sequence, but this is not recommended. The cancellation should not contain
 * the cancellation of prices for more than one NAV date. <br>
 * <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PricRptCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessageIdentification
 * PriceReportCancellationV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPoolReference
 * PriceReportCancellationV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPreviousReference
 * PriceReportCancellationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmMessagePagination
 * PriceReportCancellationV04.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmPriceReportIdentification
 * PriceReportCancellationV04.mmPriceReportIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmCancellationIdentification
 * PriceReportCancellationV04.mmCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmCancellationReason
 * PriceReportCancellationV04.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmExpectedPriceCorrectionDate
 * PriceReportCancellationV04.mmExpectedPriceCorrectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmCompletePriceCancellation
 * PriceReportCancellationV04.mmCompletePriceCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmCancelledPriceValuationDetails
 * PriceReportCancellationV04.mmCancelledPriceValuationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV04#mmExtension
 * PriceReportCancellationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.002.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceReportCancellationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\nA report provider, for example, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, for example, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel previously sent prices.\n\r\nUSAGE\r\nThe PriceReportCancellation message is used to either:\n- cancel an entire PriceReport that was previously sent (by quoting the business reference of the original price report in the PriceReportIdentification element), or,\n- cancel one or more individual prices from a previously sent price report (by using the PriceDetailsToBeCancelled sequence).\nTechnically, it is possible to cancel all the prices individually by using the PriceDetailsToBeCancelled sequence, but this is not recommended.\nThe cancellation should not contain the cancellation of prices for more than one NAV date. \r\n\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03
 * PriceReportCancellationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceReportCancellationV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "messagePagination", "priceReportIdentification", "cancellationIdentification", "cancellationReason",
		"expectedPriceCorrectionDate", "completePriceCancellation", "cancelledPriceValuationDetails", "extension"})
public class PriceReportCancellationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies a message from a business application
	 * standpoint.
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
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 poolReference;
	/**
	 * Collective reference identifying a set of messages.
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
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPoolReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getPoolReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference3 previousReference;
	/**
	 * Reference to a linked message that was previously sent.
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
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getPreviousReference", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text priceReportIdentification;
	/**
	 * Unique and unambiguous identifier for the price report, as assigned by
	 * the reporting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricRptId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceReportIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the price report, as assigned by the reporting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPriceReportIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "PricRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReportIdentification";
			definition = "Unique and unambiguous identifier for the price report, as assigned by the reporting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getPriceReportIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cancellationIdentification;
	/**
	 * Unique and unambiguous identifier for the cancellation of the previous
	 * price report, as assigned by the reporting party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the cancellation of the previous price report, as assigned by the reporting party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationIdentification";
			definition = "Unique and unambiguous identifier for the cancellation of the previous price report, as assigned by the reporting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getCancellationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max350Text cancellationReason;
	/**
	 * Reason for the cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationReason = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getCancellationReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateAndDateTime1Choice expectedPriceCorrectionDate;
	/**
	 * Date or date and time the price will be corrected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdPricCrrctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedPriceCorrectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date or date and time the price will be corrected."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExpectedPriceCorrectionDate = new MMMessageBuildingBlock() {
		{
			xmlTag = "XpctdPricCrrctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedPriceCorrectionDate";
			definition = "Date or date and time the price will be corrected.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getExpectedPriceCorrectionDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator completePriceCancellation;
	/**
	 * Indicates whether or not all the prices of the referenced price report
	 * are cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltPricCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletePriceCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not all the prices of the referenced price report are cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCompletePriceCancellation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CmpltPricCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletePriceCancellation";
			definition = "Indicates whether or not all the prices of the referenced price report are cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getCompletePriceCancellation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PriceReport3> cancelledPriceValuationDetails;
	/**
	 * Details of prices to be cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceReport3
	 * PriceReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CancPricValtnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledPriceValuationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of prices to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancelledPriceValuationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CancPricValtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledPriceValuationDetails";
			definition = "Details of prices to be cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> PriceReport3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getCancelledPriceValuationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PriceReportCancellationV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceReportCancellationV04";
				definition = "SCOPE\r\nA report provider, for example, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, for example, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel previously sent prices.\n\r\nUSAGE\r\nThe PriceReportCancellation message is used to either:\n- cancel an entire PriceReport that was previously sent (by quoting the business reference of the original price report in the PriceReportIdentification element), or,\n- cancel one or more individual prices from a previously sent price report (by using the PriceDetailsToBeCancelled sequence).\nTechnically, it is possible to cancel all the prices individually by using the PriceDetailsToBeCancelled sequence, but this is not recommended.\nThe cancellation should not contain the cancellation of prices for more than one NAV date. \r\n\r\n";
				previousVersion_lazy = () -> PriceReportCancellationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "PricRptCxl";
				businessArea_lazy = () -> ReferenceDataLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.PriceReportCancellationV04.mmMessageIdentification, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmPoolReference,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.mmPreviousReference, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmMessagePagination,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.mmPriceReportIdentification, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmCancellationIdentification,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.mmCancellationReason, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmExpectedPriceCorrectionDate,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.mmCompletePriceCancellation, com.tools20022.repository.area.reda.PriceReportCancellationV04.mmCancelledPriceValuationDetails,
						com.tools20022.repository.area.reda.PriceReportCancellationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "reda";
						messageFunctionality = "002";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PriceReportCancellationV04.class;
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
	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public void setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
	}

	@XmlElement(name = "MsgPgntn", required = true)
	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public void setMessagePagination(Pagination messagePagination) {
		this.messagePagination = messagePagination;
	}

	@XmlElement(name = "PricRptId", required = true)
	public Max35Text getPriceReportIdentification() {
		return priceReportIdentification;
	}

	public void setPriceReportIdentification(Max35Text priceReportIdentification) {
		this.priceReportIdentification = priceReportIdentification;
	}

	@XmlElement(name = "CxlId", required = true)
	public Max35Text getCancellationIdentification() {
		return cancellationIdentification;
	}

	public void setCancellationIdentification(Max35Text cancellationIdentification) {
		this.cancellationIdentification = cancellationIdentification;
	}

	@XmlElement(name = "CxlRsn")
	public Max350Text getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(Max350Text cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "XpctdPricCrrctnDt")
	public DateAndDateTime1Choice getExpectedPriceCorrectionDate() {
		return expectedPriceCorrectionDate;
	}

	public void setExpectedPriceCorrectionDate(DateAndDateTime1Choice expectedPriceCorrectionDate) {
		this.expectedPriceCorrectionDate = expectedPriceCorrectionDate;
	}

	@XmlElement(name = "CmpltPricCxl", required = true)
	public YesNoIndicator getCompletePriceCancellation() {
		return completePriceCancellation;
	}

	public void setCompletePriceCancellation(YesNoIndicator completePriceCancellation) {
		this.completePriceCancellation = completePriceCancellation;
	}

	@XmlElement(name = "CancPricValtnDtls")
	public List<PriceReport3> getCancelledPriceValuationDetails() {
		return cancelledPriceValuationDetails;
	}

	public void setCancelledPriceValuationDetails(List<PriceReport3> cancelledPriceValuationDetails) {
		this.cancelledPriceValuationDetails = cancelledPriceValuationDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:reda.002.04.04")
	static public class Document {
		@XmlElement(name = "PricRptCxl", required = true)
		public PriceReportCancellationV04 messageBody;
	}
}