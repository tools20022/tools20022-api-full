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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesTradeLatestVersion;
import com.tools20022.repository.choice.References61Choice;
import com.tools20022.repository.choice.Status24Choice;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The OrderInstructionStatusReport message is sent by an executing party, for
 * example, a transfer agent, to the instructing party, for example, an
 * investment manager or its authorised representative, to report the status of
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
 * also be quoted in RelatedReference but this is not recommended.<br>
 * If the OrderInstructionStatusReport message is used to report the status of a
 * switch order, then SwitchOrderDetailsReport is used and the order reference
 * of the switch order is quoted in OrderReference. The message identification
 * of the message in which the switch order was conveyed may also be quoted in
 * RelatedReference but this is not recommended.<br>
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
 * units, expected trade date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmMessageIdentification
 * OrderInstructionStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmReference
 * OrderInstructionStatusReportV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmStatusReport
 * OrderInstructionStatusReportV04.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmExtension
 * OrderInstructionStatusReportV04.mmExtension}</li>
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
 * xmlTag} = "OrdrInstrStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.016.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#forOrderInstructionStatusReportV04
 * ConstraintMessageNameAndReferenceGuideline.forOrderInstructionStatusReportV04
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forOrderInstructionStatusReportV04
 * ConstraintOtherReferenceGuideline.forOrderInstructionStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderInstructionStatusReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderInstructionStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order from the time the executing party receives the order until the time the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.\r\nThe OrderInstructionStatusReport message may be used to give the status of:\r\n- one order message by using OrderDetailsReport or,\r\n- one or more individual order instructions by using IndividualOrderDetailsReport, or\r\n- one or more switch orders by using SwitchOrderDetailsReport.\r\nIf the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- an accepted status , or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a received status, or,\r\n- a settled status, or,\r\n- a communication problem with next party status, or,\r\n- a confirmation amendment status, or,\r\n- a done for the day status, or,\r\n- a partially done status, or,\r\n- an open status, or,\r\n- a cancelled status, or\r\n- a conditionally accepted status, or,\r\n- a rejected status, or,\r\n- a suspended status, or,\r\n- a partially settled status, or,\r\n- an in-repair status (only for an individual or switch order).\r\nFor a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.\r\nWhen the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:\r\n- repaired conditions (for a switch, this is at the level of a leg),\r\n- information related to the order, for example, settlement amount, number of units, expected trade date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03
 * OrderInstructionStatusReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderInstructionStatusReportV04", propOrder = {"messageIdentification", "reference", "statusReport", "extension"})
public class OrderInstructionStatusReportV04 {

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
	 * "Reference that uniquely identifies the message from a business application standpoint. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmMessageIdentification
	 * OrderInstructionStatusReportV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> OrderInstructionStatusReportV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderInstructionStatusReportV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Ref")
	protected References61Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References61Choice
	 * References61Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the message or communication that was previously received."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the message or communication that was previously received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> References61Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderInstructionStatusReportV04.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected Status24Choice statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status24Choice
	 * Status24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the order.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Status24Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderInstructionStatusReportV04.class.getMethod("getStatusReport", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV03#mmExtension
	 * OrderInstructionStatusReportV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> OrderInstructionStatusReportV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderInstructionStatusReportV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.forOrderInstructionStatusReportV04,
						com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forOrderInstructionStatusReportV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderInstructionStatusReportV04";
				definition = "Scope\r\nThe OrderInstructionStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order from the time the executing party receives the order until the time the order is executed.\r\nUsage\r\nThe OrderInstructionStatusReport message is used to report on the status of a subscription, redemption or a switch order.\r\nThe OrderInstructionStatusReport message may be used to give the status of:\r\n- one order message by using OrderDetailsReport or,\r\n- one or more individual order instructions by using IndividualOrderDetailsReport, or\r\n- one or more switch orders by using SwitchOrderDetailsReport.\r\nIf the OrderInstructionStatusReport message is used to report the status of an individual order, then IndividualOrderDetailsReport is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderInstructionStatusReport message is used to report the status of a switch order, then SwitchOrderDetailsReport is used and the order reference of the switch order is quoted in OrderReference. The message identification of the message in which the switch order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderInstructionStatusReport message is used to report the status of an entire order message, for example, the SubscriptionBulkOrder, or a SubscriptionOrder containing several orders, then OrderDetailsReport is used and the message identification of the order message is quoted in RelatedReference. All the orders within the message must have the same status.\r\nOne of the following statuses can be reported:\r\n- an accepted status , or,\r\n- an already executed status, or,\r\n- a sent to next party status, or,\r\n- a received status, or,\r\n- a settled status, or,\r\n- a communication problem with next party status, or,\r\n- a confirmation amendment status, or,\r\n- a done for the day status, or,\r\n- a partially done status, or,\r\n- an open status, or,\r\n- a cancelled status, or\r\n- a conditionally accepted status, or,\r\n- a rejected status, or,\r\n- a suspended status, or,\r\n- a partially settled status, or,\r\n- an in-repair status (only for an individual or switch order).\r\nFor a switch order, the OrderInstructionStatusReport message provides the status of the whole switch order, that is, it is not possible to accept one leg and to reject the other leg: the entire switch order has to be rejected. In order to identify the legs within the switch that are causing the problem, the leg is identified in either the RedemptionLegIdentification or SubscriptionLegIdentification elements.\r\nWhen the OrderInstructionStatusReport is used to give the status of an individual or a switch order, the following can be specified:\r\n- repaired conditions (for a switch, this is at the level of a leg),\r\n- information related to the order, for example, settlement amount, number of units, expected trade date.";
				previousVersion_lazy = () -> OrderInstructionStatusReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "OrdrInstrStsRpt";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmMessageIdentification, com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmReference,
						com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmStatusReport, com.tools20022.repository.area.setr.OrderInstructionStatusReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "016";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderInstructionStatusReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public OrderInstructionStatusReportV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<References61Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public OrderInstructionStatusReportV04 setReference(References61Choice reference) {
		this.reference = reference;
		return this;
	}

	public Status24Choice getStatusReport() {
		return statusReport;
	}

	public OrderInstructionStatusReportV04 setStatusReport(Status24Choice statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public OrderInstructionStatusReportV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.016.001.04")
	static public class Document {
		@XmlElement(name = "OrdrInstrStsRpt", required = true)
		public OrderInstructionStatusReportV04 messageBody;
	}
}