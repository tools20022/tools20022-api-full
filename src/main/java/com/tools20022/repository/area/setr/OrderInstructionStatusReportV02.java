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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesTradeArchive;
import com.tools20022.repository.msg.AdditionalReference3;
import com.tools20022.repository.msg.IndividualOrderStatusAndReason1;
import com.tools20022.repository.msg.OrderStatusAndReason3;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The OrderInstructionStatusReport is sent by an executing party, eg, a
 * transfer agent, to an instructing party, eg, an investment manager or its
 * authorised representative. There may be one or more intermediary parties
 * between the executing party and the instructing party. The intermediary party
 * is, for example, an intermediary or a concentrator.<br>
 * This message reports the status of an order from the time the executing party
 * receives the order until the order is executed.<br>
 * <b>Usage</b><br>
 * The OrderInstructionStatusReport message is sent by an executing party to the
 * instructing party to report on the status of a subscription, redemption or a
 * switch order.<br>
 * The message can be used to report one of the following:<br>
 * - a received status, or<br>
 * - an accepted status, or<br>
 * - a sent to next party status, or<br>
 * - an already executed status, or<br>
 * - a cancelled status, or<br>
 * - a conditionally accepted status, or<br>
 * - a rejected status, or<br>
 * - a suspended status, or<br>
 * - an in-repair status (at the individual order level only), or<br>
 * - repaired conditions (at the individual order level only).<br>
 * For subscription and redemption orders, the OrderInstructionStatusReport
 * message covers both bulk and multiple categories of orders, and this message
 * may provide the status either at the bulk or at the individual level.<br>
 * For a switch order, this message provides the status of the whole order, ie,
 * it is not possible to accept one leg and to reject the other leg, the entire
 * switch order has to be rejected. In order to identify which leg within the
 * switch is causing a problem, the redemption or subscription leg
 * identification is used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.016.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#OrderDetailsOrIndividualOrderDetailsRule
 * OrderInstructionStatusReportV02.OrderDetailsOrIndividualOrderDetailsRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#RelatedReferenceOrOtherReferenceRule
 * OrderInstructionStatusReportV02.RelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOtherReference
 * OrderInstructionStatusReportV02.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmRelatedReference
 * OrderInstructionStatusReportV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmMasterReference
 * OrderInstructionStatusReportV02.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOrderDetailsReport
 * OrderInstructionStatusReportV02.mmOrderDetailsReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmIndividualOrderDetailsReport
 * OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "setr.016.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.016.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderInstructionStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderInstructionStatusReport is sent by an executing party, eg, a transfer agent, to an instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message reports the status of an order from the time the executing party receives the order until the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is sent by an executing party to the instructing party to report on the status of a subscription, redemption or a switch order.\r\nThe message can be used to report one of the following:\r\n- a received status, or\r\n- an accepted status, or\r\n- a sent to next party status, or\r\n- an already executed status, or\r\n- a cancelled status, or\r\n- a conditionally accepted status, or\r\n- a rejected status, or\r\n- a suspended status, or\r\n- an in-repair status (at the individual order level only), or\r\n- repaired conditions (at the individual order level only).\r\nFor subscription and redemption orders, the OrderInstructionStatusReport message covers both bulk and multiple categories of orders, and this message may provide the status either at the bulk or at the individual level.\r\nFor a switch order, this message provides the status of the whole order, ie, it is not possible to accept one leg and to reject the other leg, the entire switch order has to be rejected. In order to identify which leg within the switch is causing a problem, the redemption or subscription leg identification is used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameRule#for_setr_OrderInstructionStatusReportV02
 * ConstraintMessageNameRule.for_setr_OrderInstructionStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRelatedReferenceGuideline#for_setr_OrderInstructionStatusReportV02
 * ConstraintRelatedReferenceGuideline.for_setr_OrderInstructionStatusReportV02}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#for_setr_OrderInstructionStatusReportV02
 * ConstraintOtherReferenceGuideline.for_setr_OrderInstructionStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusCancelledGuideline#for_setr_OrderInstructionStatusReportV02
 * ConstraintStatusCancelledGuideline.for_setr_OrderInstructionStatusReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
 * OrderInstructionStatusReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "setr.016.001.02", propOrder = {"otherReference", "relatedReference", "masterReference", "orderDetailsReport", "individualOrderDetailsReport"})
public class OrderInstructionStatusReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * If OrderDetailsReport is present, then no occurrence of
	 * IndividualOrderDetailsReport is allowed. If OrderDetailsReport is not
	 * present, then at least one occurrence of IndividualOrderDetailsReport
	 * must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOrderDetailsReport
	 * OrderInstructionStatusReportV02.mmOrderDetailsReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmIndividualOrderDetailsReport
	 * OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsOrIndividualOrderDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OrderDetailsReport is present, then no occurrence of IndividualOrderDetailsReport is allowed. If OrderDetailsReport is not present, then at least one occurrence of IndividualOrderDetailsReport must be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OrderDetailsOrIndividualOrderDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsOrIndividualOrderDetailsRule";
			definition = "If OrderDetailsReport is present, then no occurrence of IndividualOrderDetailsReport is allowed. If OrderDetailsReport is not present, then at least one occurrence of IndividualOrderDetailsReport must be present.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmOrderDetailsReport,
					com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport);
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmObject();
		}
	};
	/**
	 * At least one occurrence of either RelatedReference or OtherReference must
	 * be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOtherReference
	 * OrderInstructionStatusReportV02.mmOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmRelatedReference
	 * OrderInstructionStatusReportV02.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of either RelatedReference or OtherReference must be present, but not both."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor RelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "At least one occurrence of either RelatedReference or OtherReference must be present, but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmOtherReference,
					com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmRelatedReference);
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmObject();
		}
	};
	@XmlElement(name = "OthrRef", required = true)
	protected List<AdditionalReference3> otherReference;
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
	 * xmlTag} = "OthrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message sent in a proprietary way or reference of a system."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<AdditionalReference3>> mmOtherReference = new MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(OrderInstructionStatusReportV02 obj) {
			return obj.getOtherReference();
		}

		@Override
		public void setValue(OrderInstructionStatusReportV02 obj, List<AdditionalReference3> value) {
			obj.setOtherReference(value);
		}
	};
	@XmlElement(name = "RltdRef", required = true)
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(OrderInstructionStatusReportV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(OrderInstructionStatusReportV02 obj, List<AdditionalReference3> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "MstrRef")
	protected AdditionalReference3 masterReference;
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
	 * xmlTag} = "MstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a multiple order or bulk order that represents the common reference of several individual orders."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderInstructionStatusReportV02, Optional<AdditionalReference3>> mmMasterReference = new MMMessageBuildingBlock<OrderInstructionStatusReportV02, Optional<AdditionalReference3>>() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference to a multiple order or bulk order that represents the common reference of several individual orders.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(OrderInstructionStatusReportV02 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(OrderInstructionStatusReportV02 obj, Optional<AdditionalReference3> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrDtlsRpt", required = true)
	protected OrderStatusAndReason3 orderDetailsReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtlsRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of a bulk or multiple or switch order that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderInstructionStatusReportV02, OrderStatusAndReason3> mmOrderDetailsReport = new MMMessageBuildingBlock<OrderInstructionStatusReportV02, OrderStatusAndReason3>() {
		{
			xmlTag = "OrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsReport";
			definition = "Status report details of a bulk or multiple or switch order that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason3.mmObject();
		}

		@Override
		public OrderStatusAndReason3 getValue(OrderInstructionStatusReportV02 obj) {
			return obj.getOrderDetailsReport();
		}

		@Override
		public void setValue(OrderInstructionStatusReportV02 obj, OrderStatusAndReason3 value) {
			obj.setOrderDetailsReport(value);
		}
	};
	@XmlElement(name = "IndvOrdrDtlsRpt", required = true)
	protected List<IndividualOrderStatusAndReason1> individualOrderDetailsReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOrdrDtlsRpt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrderDetailsReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of the individual orders of a bulk or multiple order that was previously received."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<IndividualOrderStatusAndReason1>> mmIndividualOrderDetailsReport = new MMMessageBuildingBlock<OrderInstructionStatusReportV02, List<IndividualOrderStatusAndReason1>>() {
		{
			xmlTag = "IndvOrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetailsReport";
			definition = "Status report details of the individual orders of a bulk or multiple order that was previously received.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
		}

		@Override
		public List<IndividualOrderStatusAndReason1> getValue(OrderInstructionStatusReportV02 obj) {
			return obj.getIndividualOrderDetailsReport();
		}

		@Override
		public void setValue(OrderInstructionStatusReportV02 obj, List<IndividualOrderStatusAndReason1> value) {
			obj.setIndividualOrderDetailsReport(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameRule.for_setr_OrderInstructionStatusReportV02,
						com.tools20022.repository.constraints.ConstraintRelatedReferenceGuideline.for_setr_OrderInstructionStatusReportV02,
						com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.for_setr_OrderInstructionStatusReportV02,
						com.tools20022.repository.constraints.ConstraintStatusCancelledGuideline.for_setr_OrderInstructionStatusReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderInstructionStatusReportV02";
				definition = "Scope\r\nThe OrderInstructionStatusReport is sent by an executing party, eg, a transfer agent, to an instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message reports the status of an order from the time the executing party receives the order until the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is sent by an executing party to the instructing party to report on the status of a subscription, redemption or a switch order.\r\nThe message can be used to report one of the following:\r\n- a received status, or\r\n- an accepted status, or\r\n- a sent to next party status, or\r\n- an already executed status, or\r\n- a cancelled status, or\r\n- a conditionally accepted status, or\r\n- a rejected status, or\r\n- a suspended status, or\r\n- an in-repair status (at the individual order level only), or\r\n- repaired conditions (at the individual order level only).\r\nFor subscription and redemption orders, the OrderInstructionStatusReport message covers both bulk and multiple categories of orders, and this message may provide the status either at the bulk or at the individual level.\r\nFor a switch order, this message provides the status of the whole order, ie, it is not possible to accept one leg and to reject the other leg, the entire switch order has to be rejected. In order to identify which leg within the switch is causing a problem, the redemption or subscription leg identification is used.";
				nextVersions_lazy = () -> Arrays.asList(OrderInstructionStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.OrderDetailsOrIndividualOrderDetailsRule,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.RelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "setr.016.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.016.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmOtherReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmRelatedReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmMasterReference, com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmOrderDetailsReport,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "016";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderInstructionStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<AdditionalReference3> getOtherReference() {
		return otherReference == null ? otherReference = new ArrayList<>() : otherReference;
	}

	public OrderInstructionStatusReportV02 setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = Objects.requireNonNull(otherReference);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public OrderInstructionStatusReportV02 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Optional<AdditionalReference3> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public OrderInstructionStatusReportV02 setMasterReference(AdditionalReference3 masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public OrderStatusAndReason3 getOrderDetailsReport() {
		return orderDetailsReport;
	}

	public OrderInstructionStatusReportV02 setOrderDetailsReport(OrderStatusAndReason3 orderDetailsReport) {
		this.orderDetailsReport = Objects.requireNonNull(orderDetailsReport);
		return this;
	}

	public List<IndividualOrderStatusAndReason1> getIndividualOrderDetailsReport() {
		return individualOrderDetailsReport == null ? individualOrderDetailsReport = new ArrayList<>() : individualOrderDetailsReport;
	}

	public OrderInstructionStatusReportV02 setIndividualOrderDetailsReport(List<IndividualOrderStatusAndReason1> individualOrderDetailsReport) {
		this.individualOrderDetailsReport = Objects.requireNonNull(individualOrderDetailsReport);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.02")
	static public class Document {
		@XmlElement(name = "setr.016.001.02", required = true)
		public OrderInstructionStatusReportV02 messageBody;
	}
}