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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * OrderInstructionStatusReport to the instructing party, for example, an
 * investment manager or its authorised representative to report the status of
 * an order from the time the executing party receives the order until the time
 * the order is executed.<br>
 * <b>Usage</b><br>
 * The OrderInstructionStatusReport message is used to report on the status of a
 * subscription, redemption or a switch order.<br>
 * The OrderInstructionStatusReport message may be used to give the status of:<br>
 * - one order message by using OrderDetailsReport or,<br>
 * - one or more individual order instructions by using
 * IndividualOrderDetailsReport, or<br>
 * - one or more switch orders by using SwitchOrderDetailsReport.<br>
 * If the OrderInstructionStatusReport message is used to report the status of
 * an individual order, then IndividualOrderDetailsReport is used and the order
 * reference of the individual order is quoted in OrderReference. The message
 * identification of the message in which the individual order was conveyed may
 * also be quoted in RelatedReference.<br>
 * If the OrderInstructionStatusReport message is used to report the status of a
 * switch order, then SwitchOrderDetailsReport is used and the order reference
 * of the switch order is quoted in OrderReference. The message identification
 * of the message in which the switch order was conveyed may also be quoted in
 * RelatedReference.<br>
 * If the OrderInstructionStatusReport message is used to report the status of
 * an entire order message, for example, the SubscriptionBulkOrder, or a
 * SubscriptionOrder containing several orders, then OrderDetailsReport is used
 * and the message identification of the order message is quoted in
 * RelatedReference. All the orders within the message must have the same
 * status.<br>
 * One of the following statuses can be reported:<br>
 * - an accepted status , or,<br>
 * - an already executed status, or,<br>
 * - a sent to next party status, or,<br>
 * - a received status, or,<br>
 * - a settled status, or,<br>
 * - a communication problem with next party status, or,<br>
 * - a confirmation amendment status, or,<br>
 * - a done for the day status, or,<br>
 * - a partially done status, or,<br>
 * - an open status, or,<br>
 * - a cancelled status, or<br>
 * - a conditionally accepted status, or,<br>
 * - a rejected status, or,<br>
 * - a suspended status, or,<br>
 * - a partially settled status, or,<br>
 * - an in-repair status (only for an individual or switch order).<br>
 * For a switch order, the OrderInstructionStatusReport message provides the
 * status of the whole switch order, that is, it is not possible to accept one
 * leg and to reject the other leg: the entire switch order has to be rejected.
 * In order to identify the legs within the switch that are causing the problem,
 * the leg is identified in either the RedemptionLegIdentification or
 * SubscriptionLegIdentification elements.<br>
 * When the OrderInstructionStatusReport is used to give the status of an
 * individual or a switch order, the following can be specified:<br>
 * - repaired conditions (for a switch, this is at the level of a leg),<br>
 * - information related to the order, for example, settlement amount, number of
 * units, expected trade date, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "OrdrInstrStsRptV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmRelatedReferenceOrOtherReferenceRule
 * OrderInstructionStatusReportV03.mmRelatedReferenceOrOtherReferenceRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOrderDetailsOrIndividualOrSwitchOrderDetailsRule
 * OrderInstructionStatusReportV03.
 * mmOrderDetailsOrIndividualOrSwitchOrderDetailsRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmMessageIdentification
 * OrderInstructionStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOtherReference
 * OrderInstructionStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmRelatedReference
 * OrderInstructionStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOrderDetailsReport
 * OrderInstructionStatusReportV03.mmOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmIndividualOrderDetailsReport
 * OrderInstructionStatusReportV03.mmIndividualOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmSwitchOrderDetailsReport
 * OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmExtension
 * OrderInstructionStatusReportV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.016.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderInstructionStatusReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the OrderInstructionStatusReport to the instructing party, for example, an investment manager or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.\r\nThe OrderInstructionStatusReport message may be used to give the status of:\r\n- one order message by using OrderDetailsReport or,\r\n- one or more individual order instructions by using IndividualOrderDetailsReport, or\r\n- one or more switch orders by using SwitchOrderDetailsReport.\r\nIf the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- an accepted status , or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a received status, or,\r\n- a settled status, or,\r\n- a communication problem with next party status, or,\r\n- a confirmation amendment status, or,\r\n- a done for the day status, or,\r\n- a partially done status, or,\r\n- an open status, or,\r\n- a cancelled status, or\r\n- a conditionally accepted status, or,\r\n- a rejected status, or,\r\n- a suspended status, or,\r\n- a partially settled status, or,\r\n- an in-repair status (only for an individual or switch order).\r\nFor a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.\r\nWhen the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:\r\n- repaired conditions (for a switch, this is at the level of a leg),\r\n- information related to the order, for example, settlement amount, number of units, expected trade date, etc."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04
 * OrderInstructionStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
 * OrderInstructionStatusReportV02}</li>
 * </ul>
 */
public class OrderInstructionStatusReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrences of either RelatedReference or OtherReference may be present,
	 * but not occurrences of both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOtherReference
	 * OrderInstructionStatusReportV03.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmRelatedReference
	 * OrderInstructionStatusReportV03.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
	 * OrderInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both.";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmOtherReference,
					com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmRelatedReference);
		}
	};
	/**
	 * Either OrderDetailsReport or occurrences of IndividualOrderDetailsReport
	 * or occurrences of SwitchOrderDetailsReport must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmOrderDetailsReport
	 * OrderInstructionStatusReportV03.mmOrderDetailsReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmIndividualOrderDetailsReport
	 * OrderInstructionStatusReportV03.mmIndividualOrderDetailsReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmSwitchOrderDetailsReport
	 * OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
	 * OrderInstructionStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsOrIndividualOrSwitchOrderDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OrderDetailsReport or occurrences of IndividualOrderDetailsReport or occurrences of SwitchOrderDetailsReport must be present.\n\n"
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmOrderDetailsOrIndividualOrSwitchOrderDetailsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsOrIndividualOrSwitchOrderDetailsRule";
			definition = "Either OrderDetailsReport or occurrences of IndividualOrderDetailsReport or occurrences of SwitchOrderDetailsReport must be present.\n\n";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmOrderDetailsReport,
					com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmIndividualOrderDetailsReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport);
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmMessageIdentification
	 * OrderInstructionStatusReportV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	protected List<AdditionalReference3> otherReference;
	/**
	 * Reference to a linked message sent in a proprietary way or reference of a
	 * system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message sent in a proprietary way or reference of a system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOtherReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected OrderStatusAndReason7 orderDetailsReport;
	/**
	 * Status report details of all the individual orders conveyed in a bulk or
	 * multiple order message. Can be used if all the individual orders conveyed
	 * in a bulk or multiple order message have the same status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason7
	 * OrderStatusAndReason7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of all the individual orders conveyed in a bulk or multiple order message. Can be used if all the individual orders conveyed in a bulk or multiple order message have the same status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsReport";
			definition = "Status report details of all the individual orders conveyed in a bulk or multiple order message. Can be used if all the individual orders conveyed in a bulk or multiple order message have the same status.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason7.mmObject();
		}
	};
	protected List<IndividualOrderStatusAndReason2> individualOrderDetailsReport;
	/**
	 * Status report details of an individual order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason2
	 * IndividualOrderStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status report details of an individual order."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvOrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetailsReport";
			definition = "Status report details of an individual order.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderStatusAndReason2.mmObject();
		}
	};
	protected List<SwitchOrderStatusAndReason1> switchOrderDetailsReport;
	/**
	 * Status report details of a switch order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderStatusAndReason1
	 * SwitchOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SwtchOrdrDtlsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchOrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status report details of a switch order."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSwitchOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "SwtchOrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderDetailsReport";
			definition = "Status report details of a switch order.";
			minOccurs = 1;
			complexType_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmExtension
	 * OrderInstructionStatusReportV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderInstructionStatusReportV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the OrderInstructionStatusReport to the instructing party, for example, an investment manager or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.\r\nThe OrderInstructionStatusReport message may be used to give the status of:\r\n- one order message by using OrderDetailsReport or,\r\n- one or more individual order instructions by using IndividualOrderDetailsReport, or\r\n- one or more switch orders by using SwitchOrderDetailsReport.\r\nIf the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- an accepted status , or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a received status, or,\r\n- a settled status, or,\r\n- a communication problem with next party status, or,\r\n- a confirmation amendment status, or,\r\n- a done for the day status, or,\r\n- a partially done status, or,\r\n- an open status, or,\r\n- a cancelled status, or\r\n- a conditionally accepted status, or,\r\n- a rejected status, or,\r\n- a suspended status, or,\r\n- a partially settled status, or,\r\n- an in-repair status (only for an individual or switch order).\r\nFor a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.\r\nWhen the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:\r\n- repaired conditions (for a switch, this is at the level of a leg),\r\n- information related to the order, for example, settlement amount, number of units, expected trade date, etc.";
				nextVersions_lazy = () -> Arrays.asList(OrderInstructionStatusReportV04.mmObject());
				previousVersion_lazy = () -> OrderInstructionStatusReportV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmRelatedReferenceOrOtherReferenceRule,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmOrderDetailsOrIndividualOrSwitchOrderDetailsRule);
				rootElement = "Document";
				xmlTag = "OrdrInstrStsRptV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmMessageIdentification,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmOtherReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmRelatedReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmOrderDetailsReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmIndividualOrderDetailsReport,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmSwitchOrderDetailsReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "016";
						version = "03";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	public List<AdditionalReference3> getOtherReference() {
		return otherReference;
	}

	public void setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = otherReference;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = relatedReference;
	}

	public OrderStatusAndReason7 getOrderDetailsReport() {
		return orderDetailsReport;
	}

	public void setOrderDetailsReport(OrderStatusAndReason7 orderDetailsReport) {
		this.orderDetailsReport = orderDetailsReport;
	}

	public List<IndividualOrderStatusAndReason2> getIndividualOrderDetailsReport() {
		return individualOrderDetailsReport;
	}

	public void setIndividualOrderDetailsReport(List<IndividualOrderStatusAndReason2> individualOrderDetailsReport) {
		this.individualOrderDetailsReport = individualOrderDetailsReport;
	}

	public List<SwitchOrderStatusAndReason1> getSwitchOrderDetailsReport() {
		return switchOrderDetailsReport;
	}

	public void setSwitchOrderDetailsReport(List<SwitchOrderStatusAndReason1> switchOrderDetailsReport) {
		this.switchOrderDetailsReport = switchOrderDetailsReport;
	}

	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}
}