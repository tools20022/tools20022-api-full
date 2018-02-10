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
import com.tools20022.repository.choice.Status26Choice;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The OrderCancellationStatusReport message is sent by an executing party, for
 * example, a transfer agent, to the instructing party, for example, an
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
 * also be quoted in RelatedReference but this is not recommended.<br>
 * If the OrderCancellationStatusReport message is used to report the status of
 * an entire order cancellation request message, for example, the
 * SubscriptionBulkOrderCancellationRequest, or a
 * SubscriptionOrderCancellationRequest containing several orders, then the
 * CancellationStatusReport sequence is used. The message identification of the
 * order cancellation request message may also be quoted in RelatedReference but
 * this is not recommended. All the order cancellation requests within the
 * message must have the same status.<br>
 * One of the following statuses can be reported: <br>
 * - the order cancellation is pending, or,<br>
 * - the order cancellation request is rejected, or,<br>
 * - the order is cancelled.<br>
 * When the cancellation is rejected, the reason for the rejection must be
 * specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmMessageIdentification
 * OrderCancellationStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmReference
 * OrderCancellationStatusReportV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmStatusReport
 * OrderCancellationStatusReportV04.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmExtension
 * OrderCancellationStatusReportV04.mmExtension}</li>
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
 * xmlTag} = "OrdrCxlStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.017.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline#forOrderCancellationStatusReportV04
 * ConstraintMessageNameAndReferenceGuideline.
 * forOrderCancellationStatusReportV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forOrderCancellationStatusReportV04
 * ConstraintOtherReferenceGuideline.forOrderCancellationStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderCancellationStatusReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe OrderCancellationStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to provide the status of:\r\n- one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,\r\n- an order cancellation request message by using CancellationStatusReport.\r\nIf the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence is used. The message identification of the order cancellation request message may also be quoted in RelatedReference but this is not recommended. All the order cancellation requests within the message must have the same status.\r\nOne of the following statuses can be reported: \r\n- the order cancellation is pending, or,\r\n- the order cancellation request is rejected, or,\r\n- the order is cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03
 * OrderCancellationStatusReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OrderCancellationStatusReportV04", propOrder = {"messageIdentification", "reference", "statusReport", "extension"})
public class OrderCancellationStatusReportV04 {

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
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmMessageIdentification
	 * OrderCancellationStatusReportV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> OrderCancellationStatusReportV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV04.class.getMethod("getMessageIdentification", new Class[]{});
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
				return OrderCancellationStatusReportV04.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StsRpt", required = true)
	protected Status26Choice statusReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Status26Choice
	 * Status26Choice}</li>
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
	 * definition} = "Status of the order cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the order cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Status26Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV04.class.getMethod("getStatusReport", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV03#mmExtension
	 * OrderCancellationStatusReportV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> OrderCancellationStatusReportV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return OrderCancellationStatusReportV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintMessageNameAndReferenceGuideline.forOrderCancellationStatusReportV04,
						com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forOrderCancellationStatusReportV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderCancellationStatusReportV04";
				definition = "Scope\r\nThe OrderCancellationStatusReport message is sent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to report the status of an order cancellation request that was previously received.\r\nUsage\r\nThe OrderCancellationStatusReport message is used to provide the status of:\r\n- one or more individual order cancellation requests by using IndividualCancellationStatusReport, or,\r\n- an order cancellation request message by using CancellationStatusReport.\r\nIf the OrderCancellationStatusReport message is used to report the status of an individual order cancellation request, then the repetitive IndividualCancellationStatusReport sequence is used and the order reference of the individual order is quoted in OrderReference. The message identification of the message in which the individual order was conveyed may also be quoted in RelatedReference but this is not recommended.\r\nIf the OrderCancellationStatusReport message is used to report the status of an entire order cancellation request message, for example, the SubscriptionBulkOrderCancellationRequest, or a SubscriptionOrderCancellationRequest containing several orders, then the CancellationStatusReport sequence is used. The message identification of the order cancellation request message may also be quoted in RelatedReference but this is not recommended. All the order cancellation requests within the message must have the same status.\r\nOne of the following statuses can be reported: \r\n- the order cancellation is pending, or,\r\n- the order cancellation request is rejected, or,\r\n- the order is cancelled.\r\nWhen the cancellation is rejected, the reason for the rejection must be specified.";
				previousVersion_lazy = () -> OrderCancellationStatusReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "OrdrCxlStsRpt";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmMessageIdentification, com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmReference,
						com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmStatusReport, com.tools20022.repository.area.setr.OrderCancellationStatusReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "017";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return OrderCancellationStatusReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public OrderCancellationStatusReportV04 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<References61Choice> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public OrderCancellationStatusReportV04 setReference(References61Choice reference) {
		this.reference = reference;
		return this;
	}

	public Status26Choice getStatusReport() {
		return statusReport;
	}

	public OrderCancellationStatusReportV04 setStatusReport(Status26Choice statusReport) {
		this.statusReport = Objects.requireNonNull(statusReport);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public OrderCancellationStatusReportV04 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.017.001.04")
	static public class Document {
		@XmlElement(name = "OrdrCxlStsRpt", required = true)
		public OrderCancellationStatusReportV04 messageBody;
	}
}