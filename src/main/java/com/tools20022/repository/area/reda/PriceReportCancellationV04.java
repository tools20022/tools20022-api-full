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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "PricRptCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ReferenceDataLatestVersion
 * ReferenceDataLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code reda.002.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCompletePriceCancellation1Rule#for_reda_PriceReportCancellationV04
 * ConstraintCompletePriceCancellation1Rule.for_reda_PriceReportCancellationV04}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCompletePriceCancellation2Rule#for_reda_PriceReportCancellationV04
 * ConstraintCompletePriceCancellation2Rule.for_reda_PriceReportCancellationV04}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceReportCancellationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\nA report provider, for example, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, for example, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel previously sent prices.\n\r\nUSAGE\r\nThe PriceReportCancellation message is used to either: \n- cancel an entire PriceReport that was previously sent (by quoting the business reference of the original price report in the PriceReportIdentification element), or,\n- cancel one or more individual prices from a previously sent price report (by using the PriceDetailsToBeCancelled sequence).\nTechnically, it is possible to cancel all the prices individually by using the PriceDetailsToBeCancelled sequence, but this is not recommended.\nThe cancellation should not contain the cancellation of prices for more than one NAV date. \r\n\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.reda.PriceReportCancellationV03
 * PriceReportCancellationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceReportCancellationV04", propOrder = {"messageIdentification", "poolReference", "previousReference", "messagePagination", "priceReportIdentification", "cancellationIdentification", "cancellationReason",
		"expectedPriceCorrectionDate", "completePriceCancellation", "cancelledPriceValuationDetails", "extension"})
public class PriceReportCancellationV04 {

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
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<PriceReportCancellationV04, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(PriceReportCancellationV04 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
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
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<PriceReportCancellationV04, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PriceReportCancellationV04 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected AdditionalReference3 previousReference;
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Optional<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<PriceReportCancellationV04, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(PriceReportCancellationV04 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Optional<AdditionalReference3> value) {
			obj.setPreviousReference(value.orElse(null));
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Pagination> mmMessagePagination = new MMMessageBuildingBlock<PriceReportCancellationV04, Pagination>() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(PriceReportCancellationV04 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "PricRptId", required = true)
	protected Max35Text priceReportIdentification;
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Max35Text> mmPriceReportIdentification = new MMMessageBuildingBlock<PriceReportCancellationV04, Max35Text>() {
		{
			xmlTag = "PricRptId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceReportIdentification";
			definition = "Unique and unambiguous identifier for the price report, as assigned by the reporting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PriceReportCancellationV04 obj) {
			return obj.getPriceReportIdentification();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Max35Text value) {
			obj.setPriceReportIdentification(value);
		}
	};
	@XmlElement(name = "CxlId", required = true)
	protected Max35Text cancellationIdentification;
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Max35Text> mmCancellationIdentification = new MMMessageBuildingBlock<PriceReportCancellationV04, Max35Text>() {
		{
			xmlTag = "CxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationIdentification";
			definition = "Unique and unambiguous identifier for the cancellation of the previous price report, as assigned by the reporting party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PriceReportCancellationV04 obj) {
			return obj.getCancellationIdentification();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Max35Text value) {
			obj.setCancellationIdentification(value);
		}
	};
	@XmlElement(name = "CxlRsn")
	protected Max350Text cancellationReason;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Optional<Max350Text>> mmCancellationReason = new MMMessageBuildingBlock<PriceReportCancellationV04, Optional<Max350Text>>() {
		{
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Reason for the cancellation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(PriceReportCancellationV04 obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Optional<Max350Text> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "XpctdPricCrrctnDt")
	protected DateAndDateTime1Choice expectedPriceCorrectionDate;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, Optional<DateAndDateTime1Choice>> mmExpectedPriceCorrectionDate = new MMMessageBuildingBlock<PriceReportCancellationV04, Optional<DateAndDateTime1Choice>>() {
		{
			xmlTag = "XpctdPricCrrctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedPriceCorrectionDate";
			definition = "Date or date and time the price will be corrected.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime1Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime1Choice> getValue(PriceReportCancellationV04 obj) {
			return obj.getExpectedPriceCorrectionDate();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, Optional<DateAndDateTime1Choice> value) {
			obj.setExpectedPriceCorrectionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CmpltPricCxl", required = true)
	protected YesNoIndicator completePriceCancellation;
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, YesNoIndicator> mmCompletePriceCancellation = new MMMessageBuildingBlock<PriceReportCancellationV04, YesNoIndicator>() {
		{
			xmlTag = "CmpltPricCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletePriceCancellation";
			definition = "Indicates whether or not all the prices of the referenced price report are cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PriceReportCancellationV04 obj) {
			return obj.getCompletePriceCancellation();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, YesNoIndicator value) {
			obj.setCompletePriceCancellation(value);
		}
	};
	@XmlElement(name = "CancPricValtnDtls")
	protected List<PriceReport3> cancelledPriceValuationDetails;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, List<PriceReport3>> mmCancelledPriceValuationDetails = new MMMessageBuildingBlock<PriceReportCancellationV04, List<PriceReport3>>() {
		{
			xmlTag = "CancPricValtnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledPriceValuationDetails";
			definition = "Details of prices to be cancelled.";
			minOccurs = 0;
			complexType_lazy = () -> PriceReport3.mmObject();
		}

		@Override
		public List<PriceReport3> getValue(PriceReportCancellationV04 obj) {
			return obj.getCancelledPriceValuationDetails();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, List<PriceReport3> value) {
			obj.setCancelledPriceValuationDetails(value);
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PriceReportCancellationV04, List<Extension1>> mmExtension = new MMMessageBuildingBlock<PriceReportCancellationV04, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(PriceReportCancellationV04 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(PriceReportCancellationV04 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCompletePriceCancellation1Rule.for_reda_PriceReportCancellationV04,
						com.tools20022.repository.constraints.ConstraintCompletePriceCancellation2Rule.for_reda_PriceReportCancellationV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceReportCancellationV04";
				definition = "SCOPE\r\nA report provider, for example, a transfer agent, fund accountant or market data provider, sends the PriceReportCancellation message to the report recipient, for example, a fund management company, transfer agent, market data provider, regulator or any other interested party to cancel previously sent prices.\n\r\nUSAGE\r\nThe PriceReportCancellation message is used to either: \n- cancel an entire PriceReport that was previously sent (by quoting the business reference of the original price report in the PriceReportIdentification element), or,\n- cancel one or more individual prices from a previously sent price report (by using the PriceDetailsToBeCancelled sequence).\nTechnically, it is possible to cancel all the prices individually by using the PriceDetailsToBeCancelled sequence, but this is not recommended.\nThe cancellation should not contain the cancellation of prices for more than one NAV date. \r\n\r\n";
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

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public PriceReportCancellationV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public PriceReportCancellationV04 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public Optional<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? Optional.empty() : Optional.of(previousReference);
	}

	public PriceReportCancellationV04 setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = previousReference;
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public PriceReportCancellationV04 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Max35Text getPriceReportIdentification() {
		return priceReportIdentification;
	}

	public PriceReportCancellationV04 setPriceReportIdentification(Max35Text priceReportIdentification) {
		this.priceReportIdentification = Objects.requireNonNull(priceReportIdentification);
		return this;
	}

	public Max35Text getCancellationIdentification() {
		return cancellationIdentification;
	}

	public PriceReportCancellationV04 setCancellationIdentification(Max35Text cancellationIdentification) {
		this.cancellationIdentification = Objects.requireNonNull(cancellationIdentification);
		return this;
	}

	public Optional<Max350Text> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public PriceReportCancellationV04 setCancellationReason(Max350Text cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public Optional<DateAndDateTime1Choice> getExpectedPriceCorrectionDate() {
		return expectedPriceCorrectionDate == null ? Optional.empty() : Optional.of(expectedPriceCorrectionDate);
	}

	public PriceReportCancellationV04 setExpectedPriceCorrectionDate(DateAndDateTime1Choice expectedPriceCorrectionDate) {
		this.expectedPriceCorrectionDate = expectedPriceCorrectionDate;
		return this;
	}

	public YesNoIndicator getCompletePriceCancellation() {
		return completePriceCancellation;
	}

	public PriceReportCancellationV04 setCompletePriceCancellation(YesNoIndicator completePriceCancellation) {
		this.completePriceCancellation = Objects.requireNonNull(completePriceCancellation);
		return this;
	}

	public List<PriceReport3> getCancelledPriceValuationDetails() {
		return cancelledPriceValuationDetails == null ? cancelledPriceValuationDetails = new ArrayList<>() : cancelledPriceValuationDetails;
	}

	public PriceReportCancellationV04 setCancelledPriceValuationDetails(List<PriceReport3> cancelledPriceValuationDetails) {
		this.cancelledPriceValuationDetails = Objects.requireNonNull(cancelledPriceValuationDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public PriceReportCancellationV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.002.001.04")
	static public class Document {
		@XmlElement(name = "PricRptCxl", required = true)
		public PriceReportCancellationV04 messageBody;
	}
}