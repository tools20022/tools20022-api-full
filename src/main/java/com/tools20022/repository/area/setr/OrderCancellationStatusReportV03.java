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
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * OrderCancellationStatusReport to the instructing party, for example, an
 * investment manager or its authorised representative, to report the status of
 * an order cancellation request that was previously received.<br>
 * <b>Usage</b><br>
 * The OrderCancellationStatusReport message is used to provide the status of:<br>
 * - one or more individual order cancellation requests by using
 * IndividualCancellationStatusReport, or,<br>
 * - an order cancellation request message by using CancellationStatusReport.<br>
 * If the OrderCancellationStatusReport message is used to report the status of
 * an individual order cancellation request, then the repetitive
 * IndividualCancellationStatusReport sequence is used and the order reference
 * of the individual order is quoted in OrderReference. The message
 * identification of the message in which the individual order was conveyed may
 * also be quoted in RelatedReference.<br>
 * If the OrderCancellationStatusReport message is used to report the status of
 * an entire order cancellation request message, for example, the
 * SubscriptionBulkOrderCancellationRequest, or a
 * SubscriptionOrderCancellationRequest containing several orders, then the
 * CancellationStatusReport sequence. is used and the message identification of
 * the order cancellation request message is quoted in RelatedReference. All the
 * order cancellation requests within the message must have the same status.<br>
 * One of the following statuses can be reported:<br>
 * - the order cancellation is pending, or,<br>
 * - the order cancellation request is rejected, or,<br>
 * - the order is cancelled.<br>
 * When the cancellation is rejected, the reason for the rejection must be
 * specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#RelatedReferenceOrOtherReferenceRule
 * OrderCancellationStatusReportV03.RelatedReferenceOrOtherReferenceRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#CancellationOrIndividualCancellationStatusReportRule
 * OrderCancellationStatusReportV03.
 * CancellationOrIndividualCancellationStatusReportRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmMessageIdentification
 * OrderCancellationStatusReportV03.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmRelatedReference
 * OrderCancellationStatusReportV03.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmOtherReference
 * OrderCancellationStatusReportV03.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmCancellationStatusReport
 * OrderCancellationStatusReportV03.mmCancellationStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmIndividualCancellationStatusReport
 * OrderCancellationStatusReportV03.mmIndividualCancellationStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmExtension
 * OrderCancellationStatusReportV03.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "OrdrCxlStsRptV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.017.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#forOrderCancellationStatusReportV03
 * ConstraintMessageNameAndReferenceGuideline.
 * forOrderCancellationStatusReportV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forOrderCancellationStatusReportV03
 * ConstraintOtherReferenceGuideline.forOrderCancellationStatusReportV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderCancellationStatusReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the OrderCancellationStatusReport to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to provide the status of:\r\n- one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,\r\n- an order cancellation request message by using CancellationStatusReport.\r\nIf the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence. is used and the message identification of the order cancellation request message is quoted in RelatedReference. All the order cancellation requests within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- the order cancellation is pending, or,\r\n- the order cancellation request is rejected, or,\r\n- the order is cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04
 * OrderCancellationStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV02
 * OrderCancellationStatusReportV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderCancellationStatusReportV03", propOrder = {"messageIdentification", "relatedReference", "otherReference", "cancellationStatusReport", "individualCancellationStatusReport", "extension"})
public class OrderCancellationStatusReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Occurrences of either RelatedReference or OtherReference may be present,
	 * but not occurrences of both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
	 * OrderCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmRelatedReference
	 * OrderCancellationStatusReportV03.mmRelatedReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmOtherReference
	 * OrderCancellationStatusReportV03.mmOtherReference}</li>
	 * </ul>
	 * </li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReferenceOrOtherReferenceRule";
			definition = "Occurrences of either RelatedReference or OtherReference may be present, but not occurrences of both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmRelatedReference,
					com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmOtherReference);
		}
	};
	/**
	 * Either CancellationStatusReport or at least one occurrence of
	 * IndividualCancellationStatusReport must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
	 * OrderCancellationStatusReportV03}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmCancellationStatusReport
	 * OrderCancellationStatusReportV03.mmCancellationStatusReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmIndividualCancellationStatusReport
	 * OrderCancellationStatusReportV03.mmIndividualCancellationStatusReport}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationOrIndividualCancellationStatusReportRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationStatusReport or at least one occurrence of IndividualCancellationStatusReport must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationOrIndividualCancellationStatusReportRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationOrIndividualCancellationStatusReportRule";
			definition = "Either CancellationStatusReport or at least one occurrence of IndividualCancellationStatusReport must be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmCancellationStatusReport,
					com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmIndividualCancellationStatusReport);
		}
	};
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
	 * "Reference that uniquely identifies a message from a business application standpoint. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmMessageIdentification
	 * OrderCancellationStatusReportV04.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint. ";
			nextVersions_lazy = () -> Arrays.asList(OrderCancellationStatusReportV04.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getMessageIdentification", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OthrRef")
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
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getOtherReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CxlStsRpt", required = true)
	protected OrderStatusAndReason8 cancellationStatusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrderStatusAndReason8
	 * OrderStatusAndReason8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlStsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of a bulk or multiple or switch order cancellation message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlStsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationStatusReport";
			definition = "Status report details of a bulk or multiple or switch order cancellation message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderStatusAndReason8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getCancellationStatusReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IndvCxlStsRpt", required = true)
	protected List<IndividualOrderStatusAndReason4> individualCancellationStatusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderStatusAndReason4
	 * IndividualOrderStatusAndReason4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvCxlStsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualCancellationStatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status report details of one or more individual orders from a bulk or multiple or switch order cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualCancellationStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvCxlStsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualCancellationStatusReport";
			definition = "Status report details of one or more individual orders from a bulk or multiple or switch order cancellation request.";
			minOccurs = 1;
			complexType_lazy = () -> IndividualOrderStatusAndReason4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getIndividualCancellationStatusReport", new Class[]{});
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmExtension
	 * OrderCancellationStatusReportV04.mmExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(OrderCancellationStatusReportV04.mmExtension);
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV03.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.forOrderCancellationStatusReportV03,
						com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forOrderCancellationStatusReportV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatusReportV03";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the OrderCancellationStatusReport to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to provide the status of:\r\n- one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,\r\n- an order cancellation request message by using CancellationStatusReport.\r\nIf the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference.\r\nIf the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence. is used and the message identification of the order cancellation request message is quoted in RelatedReference. All the order cancellation requests within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- the order cancellation is pending, or,\r\n- the order cancellation request is rejected, or,\r\n- the order is cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified.";
				nextVersions_lazy = () -> Arrays.asList(OrderCancellationStatusReportV04.mmObject());
				previousVersion_lazy = () -> OrderCancellationStatusReportV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.RelatedReferenceOrOtherReferenceRule,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.CancellationOrIndividualCancellationStatusReportRule);
				rootElement = "Document";
				xmlTag = "OrdrCxlStsRptV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmMessageIdentification,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmRelatedReference, com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmOtherReference,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmCancellationStatusReport, com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmIndividualCancellationStatusReport,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV03.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "017";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderCancellationStatusReportV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public OrderCancellationStatusReportV03 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public OrderCancellationStatusReportV03 setRelatedReference(List<AdditionalReference3> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public List<AdditionalReference3> getOtherReference() {
		return otherReference == null ? otherReference = new ArrayList<>() : otherReference;
	}

	public OrderCancellationStatusReportV03 setOtherReference(List<AdditionalReference3> otherReference) {
		this.otherReference = Objects.requireNonNull(otherReference);
		return this;
	}

	public OrderStatusAndReason8 getCancellationStatusReport() {
		return cancellationStatusReport;
	}

	public OrderCancellationStatusReportV03 setCancellationStatusReport(OrderStatusAndReason8 cancellationStatusReport) {
		this.cancellationStatusReport = Objects.requireNonNull(cancellationStatusReport);
		return this;
	}

	public List<IndividualOrderStatusAndReason4> getIndividualCancellationStatusReport() {
		return individualCancellationStatusReport == null ? individualCancellationStatusReport = new ArrayList<>() : individualCancellationStatusReport;
	}

	public OrderCancellationStatusReportV03 setIndividualCancellationStatusReport(List<IndividualOrderStatusAndReason4> individualCancellationStatusReport) {
		this.individualCancellationStatusReport = Objects.requireNonNull(individualCancellationStatusReport);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public OrderCancellationStatusReportV03 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.017.001.03")
	static public class Document {
		@XmlElement(name = "OrdrCxlStsRptV03", required = true)
		public OrderCancellationStatusReportV03 messageBody;
	}
}