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
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#RelatedReferenceOrOtherReferenceRule
 * OrderInstructionStatusReportV03.RelatedReferenceOrOtherReferenceRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OrderDetailsOrIndividualOrSwitchOrderDetailsRule
 * OrderInstructionStatusReportV03.
 * OrderDetailsOrIndividualOrSwitchOrderDetailsRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#MessageIdentification
 * OrderInstructionStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OtherReference
 * OrderInstructionStatusReportV03.OtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#RelatedReference
 * OrderInstructionStatusReportV03.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OrderDetailsReport
 * OrderInstructionStatusReportV03.OrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#IndividualOrderDetailsReport
 * OrderInstructionStatusReportV03.IndividualOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#SwitchOrderDetailsReport
 * OrderInstructionStatusReportV03.SwitchOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#Extension
 * OrderInstructionStatusReportV03.Extension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#identifier
 * OrderInstructionStatusReportV03.identifier}</li>
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
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OtherReference
	 * OrderInstructionStatusReportV03.OtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#RelatedReference
	 * OrderInstructionStatusReportV03.RelatedReference}</li>
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
	public static final MMXor RelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both.";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OtherReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.RelatedReference);
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
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#OrderDetailsReport
	 * OrderInstructionStatusReportV03.OrderDetailsReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#IndividualOrderDetailsReport
	 * OrderInstructionStatusReportV03.IndividualOrderDetailsReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#SwitchOrderDetailsReport
	 * OrderInstructionStatusReportV03.SwitchOrderDetailsReport}</li>
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
	public static final MMXor OrderDetailsOrIndividualOrSwitchOrderDetailsRule = new MMXor() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsOrIndividualOrSwitchOrderDetailsRule";
			definition = "Either OrderDetailsReport or occurrences of IndividualOrderDetailsReport or occurrences of SwitchOrderDetailsReport must be present.\n\n";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OrderDetailsReport,
					com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.IndividualOrderDetailsReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.SwitchOrderDetailsReport);
		}
	};
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
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#MessageIdentification
	 * OrderInstructionStatusReportV04.MessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock MessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.MessageIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
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
	public static final MMMessageBuildingBlock OtherReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OthrRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			minOccurs = 0;
			maxOccurs = 2;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
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
	public static final MMMessageBuildingBlock RelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			maxOccurs = 2;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
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
	public static final MMMessageBuildingBlock OrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsReport";
			definition = "Status report details of all the individual orders conveyed in a bulk or multiple order message. Can be used if all the individual orders conveyed in a bulk or multiple order message have the same status.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason7.mmObject();
		}
	};
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
	public static final MMMessageBuildingBlock IndividualOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvOrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetailsReport";
			definition = "Status report details of an individual order.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderStatusAndReason2.mmObject();
		}
	};
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
	public static final MMMessageBuildingBlock SwitchOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "SwtchOrdrDtlsRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchOrderDetailsReport";
			definition = "Status report details of a switch order.";
			minOccurs = 1;
			complexType_lazy = () -> SwitchOrderStatusAndReason1.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#Extension
	 * OrderInstructionStatusReportV04.Extension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock Extension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.Extension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "03"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "setr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "016"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "setr";
			messageFunctionality = "016";
			version = "03";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OrderInstructionStatusReportV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the OrderInstructionStatusReport to the instructing party, for example, an investment manager or its authorised representative to report the status of an order from the time the executing party receives the order until the time the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.\r\nThe OrderInstructionStatusReport message may be used to give the status of:\r\n- one order message by using OrderDetailsReport or,\r\n- one or more individual order instructions by using IndividualOrderDetailsReport, or\r\n- one or more switch orders by using SwitchOrderDetailsReport.\r\nIf the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- an accepted status , or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a received status, or,\r\n- a settled status, or,\r\n- a communication problem with next party status, or,\r\n- a confirmation amendment status, or,\r\n- a done for the day status, or,\r\n- a partially done status, or,\r\n- an open status, or,\r\n- a cancelled status, or\r\n- a conditionally accepted status, or,\r\n- a rejected status, or,\r\n- a suspended status, or,\r\n- a partially settled status, or,\r\n- an in-repair status (only for an individual or switch order).\r\nFor a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.\r\nWhen the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:\r\n- repaired conditions (for a switch, this is at the level of a leg),\r\n- information related to the order, for example, settlement amount, number of units, expected trade date, etc.";
				previousVersion_lazy = () -> OrderInstructionStatusReportV02.mmObject();
				nextVersions_lazy = () -> Arrays.asList(OrderInstructionStatusReportV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.RelatedReferenceOrOtherReferenceRule,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OrderDetailsOrIndividualOrSwitchOrderDetailsRule);
				rootElement = "Document";
				xmlTag = "OrdrInstrStsRptV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.MessageIdentification, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OtherReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.RelatedReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.OrderDetailsReport,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.IndividualOrderDetailsReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.SwitchOrderDetailsReport,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.Extension);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.setr.OrderInstructionStatusReportV03.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}