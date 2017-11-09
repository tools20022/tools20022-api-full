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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.016.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "setr.016.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmOrderDetailsOrIndividualOrderDetailsRule
 * OrderInstructionStatusReportV02.mmOrderDetailsOrIndividualOrderDetailsRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02#mmRelatedReferenceOrOtherReferenceRule
 * OrderInstructionStatusReportV02.mmRelatedReferenceOrOtherReferenceRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderInstructionStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderInstructionStatusReport is sent by an executing party, eg, a transfer agent, to an instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message reports the status of an order from the time the executing party receives the order until the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is sent by an executing party to the instructing party to report on the status of a subscription, redemption or a switch order.\r\nThe message can be used to report one of the following:\r\n- a received status, or\r\n- an accepted status, or\r\n- a sent to next party status, or\r\n- an already executed status, or\r\n- a cancelled status, or\r\n- a conditionally accepted status, or\r\n- a rejected status, or\r\n- a suspended status, or\r\n- an in-repair status (at the individual order level only), or\r\n- repaired conditions (at the individual order level only).\r\nFor subscription and redemption orders, the OrderInstructionStatusReport message covers both bulk and multiple categories of orders, and this message may provide the status either at the bulk or at the individual level.\r\nFor a switch order, this message provides the status of the whole order, ie, it is not possible to accept one leg and to reject the other leg, the entire switch order has to be rejected. In order to identify which leg within the switch is causing a problem, the redemption or subscription leg identification is used."
 * </li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDetailsOrIndividualOrderDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OrderDetailsReport is present, then no occurrence of IndividualOrderDetailsReport is allowed. If OrderDetailsReport is not present, then at least one occurrence of IndividualOrderDetailsReport must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmOrderDetailsOrIndividualOrderDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsOrIndividualOrderDetailsRule";
			definition = "If OrderDetailsReport is present, then no occurrence of IndividualOrderDetailsReport is allowed. If OrderDetailsReport is not present, then at least one occurrence of IndividualOrderDetailsReport must be present.";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV02.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmOrderDetailsReport, OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport);
		}
	};
	/**
	 * At least one occurrence of either RelatedReference or OtherReference must
	 * be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV02
	 * OrderInstructionStatusReportV02}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReferenceOrOtherReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "At least one occurrence of either RelatedReference or OtherReference must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmRelatedReferenceOrOtherReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "At least one occurrence of either RelatedReference or OtherReference must be present, but not both.";
			messageDefinition_lazy = () -> OrderInstructionStatusReportV02.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmOtherReference, OrderInstructionStatusReportV02.mmRelatedReference);
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked message sent in a proprietary way or reference of a system.";
			maxOccurs = 2;
			minOccurs = 1;
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 1;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected AdditionalReference3 masterReference;
	/**
	 * Reference to a multiple order or bulk order that represents the common
	 * reference of several individual orders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a multiple order or bulk order that represents the common reference of several individual orders."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMasterReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference to a multiple order or bulk order that represents the common reference of several individual orders.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}
	};
	protected OrderStatusAndReason3 orderDetailsReport;
	/**
	 * Status report details of a bulk or multiple or switch order that was
	 * previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason3
	 * OrderStatusAndReason3}</li>
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
	 * "Status report details of a bulk or multiple or switch order that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDetailsReport";
			definition = "Status report details of a bulk or multiple or switch order that was previously received.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason3.mmObject();
		}
	};
	protected List<IndividualOrderStatusAndReason1> individualOrderDetailsReport;
	/**
	 * Status report details of the individual orders of a bulk or multiple
	 * order that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason1
	 * IndividualOrderStatusAndReason1}</li>
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
	 * definition} =
	 * "Status report details of the individual orders of a bulk or multiple order that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualOrderDetailsReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvOrdrDtlsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrderDetailsReport";
			definition = "Status report details of the individual orders of a bulk or multiple order that was previously received.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderStatusAndReason1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderInstructionStatusReportV02";
				definition = "Scope\r\nThe OrderInstructionStatusReport is sent by an executing party, eg, a transfer agent, to an instructing party, eg, an investment manager or its authorised representative. There may be one or more intermediary parties between the executing party and the instructing party. The intermediary party is, for example, an intermediary or a concentrator.\r\nThis message reports the status of an order from the time the executing party receives the order until the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is sent by an executing party to the instructing party to report on the status of a subscription, redemption or a switch order.\r\nThe message can be used to report one of the following:\r\n- a received status, or\r\n- an accepted status, or\r\n- a sent to next party status, or\r\n- an already executed status, or\r\n- a cancelled status, or\r\n- a conditionally accepted status, or\r\n- a rejected status, or\r\n- a suspended status, or\r\n- an in-repair status (at the individual order level only), or\r\n- repaired conditions (at the individual order level only).\r\nFor subscription and redemption orders, the OrderInstructionStatusReport message covers both bulk and multiple categories of orders, and this message may provide the status either at the bulk or at the individual level.\r\nFor a switch order, this message provides the status of the whole order, ie, it is not possible to accept one leg and to reject the other leg, the entire switch order has to be rejected. In order to identify which leg within the switch is causing a problem, the redemption or subscription leg identification is used.";
				nextVersions_lazy = () -> Arrays.asList(OrderInstructionStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmOrderDetailsOrIndividualOrderDetailsRule, OrderInstructionStatusReportV02.mmRelatedReferenceOrOtherReferenceRule);
				rootElement = "Document";
				xmlTag = "setr.016.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.016.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderInstructionStatusReportV02.mmOtherReference, OrderInstructionStatusReportV02.mmRelatedReference, OrderInstructionStatusReportV02.mmMasterReference,
						OrderInstructionStatusReportV02.mmOrderDetailsReport, OrderInstructionStatusReportV02.mmIndividualOrderDetailsReport);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "016";
						version = "02";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
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

	public AdditionalReference3 getMasterReference() {
		return masterReference;
	}

	public void setMasterReference(AdditionalReference3 masterReference) {
		this.masterReference = masterReference;
	}

	public OrderStatusAndReason3 getOrderDetailsReport() {
		return orderDetailsReport;
	}

	public void setOrderDetailsReport(OrderStatusAndReason3 orderDetailsReport) {
		this.orderDetailsReport = orderDetailsReport;
	}

	public List<IndividualOrderStatusAndReason1> getIndividualOrderDetailsReport() {
		return individualOrderDetailsReport;
	}

	public void setIndividualOrderDetailsReport(List<IndividualOrderStatusAndReason1> individualOrderDetailsReport) {
		this.individualOrderDetailsReport = individualOrderDetailsReport;
	}
}