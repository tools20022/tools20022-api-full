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
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.MessageAndBusinessReference10;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RequestForOrderStatusReport message is sent by an instructing party, for
 * example, an investment manager or its authorised representative, to the
 * executing party, for example, a transfer agent, to request the status of one
 * or more order instructions or order cancellation requests.<br>
 * <b>Usage</b><br>
 * The RequestForOrderStatusReport message is used to request the status of:<br>
 * - one or several individual order instructions, or,<br>
 * - one or several order messages, or<br>
 * - one or several individual order cancellation requests, or,<br>
 * - one or several order cancellation request messages.<br>
 * The response to a RequestForOrderStatusReport message is the
 * OrderInstructionStatusReport message or OrderCancellationStatusReport
 * message.<br>
 * If the RequestForOrderStatusReport message is used to request the status of
 * several individual order instructions or one or more order instruction
 * messages, then the instructing party may receive several
 * OrderInstructionStatusReport messages from the executing party.<br>
 * If the RequestForOrderStatusReport message is used to request the status of
 * several individual order cancellation requests or one or more order
 * cancellation messages, then the instructing party may receive several
 * OrderCancellationStatusReport messages from the executing party.<br>
 * When the RequestForOrderStatusReport is used to request the status of one or
 * more individual orders or order cancellations, each individual order is
 * identified with its order reference. The investment account and/or financial
 * instrument related to the order can also be identified. The message
 * identification of the message in which the individual order was conveyed may
 * also be quoted in PreviousReference.<br>
 * When the RequestForOrderStatusReport is used to request the status of an
 * order message or an order cancellations request message, then the message
 * identification of the order or cancellation message is identified in
 * PreviousReference.<br>
 * The RequestForOrderStatusReport message may not be used to request the status
 * of an investment account, a transfer or the status of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ReqForOrdrStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmMessageIdentification
 * RequestForOrderStatusReportV04.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmRequestDetails
 * RequestForOrderStatusReportV04.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#mmExtension
 * RequestForOrderStatusReportV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.018.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestForOrderStatusReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RequestForOrderStatusReport message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to request the status of one or more order instructions or order cancellation requests.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several individual order instructions, or,\r\n- one or several order messages, or\r\n- one or several individual order cancellation requests, or,\r\n- one or several order cancellation request messages.\r\nThe response to a RequestForOrderStatusReport message is the OrderInstructionStatusReport message or OrderCancellationStatusReport message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order instructions or one or more order instruction messages, then the instructing party may receive several OrderInstructionStatusReport messages from the executing party.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order cancellation requests or one or more order cancellation messages, then the instructing party may receive several OrderCancellationStatusReport messages from the executing party.\r\nWhen the RequestForOrderStatusReport is used to request the status of one or more individual orders or order cancellations, each individual order is identified with its order reference. The investment account and/or financial instrument related to the order can also be identified. The message identification of the message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderStatusReport is used to request the status of an order message or an order cancellations request message, then the message identification of the order or cancellation message is identified in PreviousReference.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03
 * RequestForOrderStatusReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RequestForOrderStatusReportV04", propOrder = {"messageIdentification", "requestDetails", "extension"})
public class RequestForOrderStatusReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies the message from a business
	 * application standpoint.
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
	 * "Reference that uniquely identifies the message from a business application standpoint. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#mmMessageIdentification
	 * RequestForOrderStatusReportV03.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> RequestForOrderStatusReportV03.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderStatusReportV04.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<MessageAndBusinessReference10> requestDetails;
	/**
	 * Information to identify the order(s) for which the status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10
	 * MessageAndBusinessReference10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information to identify the order(s) for which the status is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#mmRequestDetails
	 * RequestForOrderStatusReportV03.mmRequestDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Information to identify the order(s) for which the status is requested.";
			previousVersion_lazy = () -> RequestForOrderStatusReportV03.mmRequestDetails;
			minOccurs = 1;
			complexType_lazy = () -> MessageAndBusinessReference10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderStatusReportV04.class.getMethod("getRequestDetails", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#mmExtension
	 * RequestForOrderStatusReportV03.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> RequestForOrderStatusReportV03.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderStatusReportV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestForOrderStatusReportV04";
				definition = "Scope\r\nThe RequestForOrderStatusReport message is sent by an instructing party, for example, an investment manager or its authorised representative, to the executing party, for example, a transfer agent, to request the status of one or more order instructions or order cancellation requests.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several individual order instructions, or,\r\n- one or several order messages, or\r\n- one or several individual order cancellation requests, or,\r\n- one or several order cancellation request messages.\r\nThe response to a RequestForOrderStatusReport message is the OrderInstructionStatusReport message or OrderCancellationStatusReport message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order instructions or one or more order instruction messages, then the instructing party may receive several OrderInstructionStatusReport messages from the executing party.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order cancellation requests or one or more order cancellation messages, then the instructing party may receive several OrderCancellationStatusReport messages from the executing party.\r\nWhen the RequestForOrderStatusReport is used to request the status of one or more individual orders or order cancellations, each individual order is identified with its order reference. The investment account and/or financial instrument related to the order can also be identified. The message identification of the message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderStatusReport is used to request the status of an order message or an order cancellations request message, then the message identification of the order or cancellation message is identified in PreviousReference.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument.";
				previousVersion_lazy = () -> RequestForOrderStatusReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ReqForOrdrStsRpt";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.mmMessageIdentification,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.mmRequestDetails, com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "018";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestForOrderStatusReportV04.class;
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

	@XmlElement(name = "ReqDtls", required = true)
	public List<MessageAndBusinessReference10> getRequestDetails() {
		return requestDetails;
	}

	public void setRequestDetails(List<MessageAndBusinessReference10> requestDetails) {
		this.requestDetails = requestDetails;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.018.04.04")
	static public class Document {
		@XmlElement(name = "ReqForOrdrStsRpt", required = true)
		public RequestForOrderStatusReportV04 messageBody;
	}
}