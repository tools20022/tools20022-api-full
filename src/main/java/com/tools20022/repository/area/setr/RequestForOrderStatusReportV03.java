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
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.Extension1;
import com.tools20022.repository.msg.MessageAndBusinessReference4;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * An instructing party, for example, an investment manager or its authorised
 * representative, sends the RequestForOrderStatusReport to the executing party,
 * for example, a transfer agent, to request the status of one or more order
 * instruction or order cancellation request messages.<br>
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
 * xmlTag} = "ReqForOrdrStsRptV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#MessageIdentification
 * RequestForOrderStatusReportV03.MessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#RequestDetails
 * RequestForOrderStatusReportV03.RequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#Extension
 * RequestForOrderStatusReportV03.Extension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03#identifier
 * RequestForOrderStatusReportV03.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestForOrderStatusReportV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the RequestForOrderStatusReport to the executing party, for example, a transfer agent, to request the status of one or more order instruction or order cancellation request messages.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several individual order instructions, or,\r\n- one or several order messages, or\r\n- one or several individual order cancellation requests, or,\r\n- one or several order cancellation request messages.\r\nThe response to a RequestForOrderStatusReport message is the OrderInstructionStatusReport message or OrderCancellationStatusReport message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order instructions or one or more order instruction messages, then the instructing party may receive several OrderInstructionStatusReport messages from the executing party.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order cancellation requests or one or more order cancellation messages, then the instructing party may receive several OrderCancellationStatusReport messages from the executing party.\r\nWhen the RequestForOrderStatusReport is used to request the status of one or more individual orders or order cancellations, each individual order is identified with its order reference. The investment account and/or financial instrument related to the order can also be identified. The message identification of the message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderStatusReport is used to request the status of an order message or an order cancellations request message, then the message identification of the order or cancellation message is identified in PreviousReference.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04
 * RequestForOrderStatusReportV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV02
 * RequestForOrderStatusReportV02}</li>
 * </ul>
 */
public class RequestForOrderStatusReportV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#MessageIdentification
	 * RequestForOrderStatusReportV04.MessageIdentification}</li>
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
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.MessageIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Information to identify the order(s) for which the status is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4
	 * MessageAndBusinessReference4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#RequestDetails
	 * RequestForOrderStatusReportV04.RequestDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock RequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Information to identify the order(s) for which the status is requested.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.RequestDetails);
			minOccurs = 1;
			complexType_lazy = () -> MessageAndBusinessReference4.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV04#Extension
	 * RequestForOrderStatusReportV04.Extension}</li>
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
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV04.Extension);
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
	 * messageFunctionality} = "018"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "setr";
			messageFunctionality = "018";
			version = "03";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RequestForOrderStatusReportV03";
				definition = "Scope\r\nAn instructing party, for example, an investment manager or its authorised representative, sends the RequestForOrderStatusReport to the executing party, for example, a transfer agent, to request the status of one or more order instruction or order cancellation request messages.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several individual order instructions, or,\r\n- one or several order messages, or\r\n- one or several individual order cancellation requests, or,\r\n- one or several order cancellation request messages.\r\nThe response to a RequestForOrderStatusReport message is the OrderInstructionStatusReport message or OrderCancellationStatusReport message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order instructions or one or more order instruction messages, then the instructing party may receive several OrderInstructionStatusReport messages from the executing party.\r\nIf the RequestForOrderStatusReport message is used to request the status of several individual order cancellation requests or one or more order cancellation messages, then the instructing party may receive several OrderCancellationStatusReport messages from the executing party.\r\nWhen the RequestForOrderStatusReport is used to request the status of one or more individual orders or order cancellations, each individual order is identified with its order reference. The investment account and/or financial instrument related to the order can also be identified. The message identification of the message in which the individual order was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderStatusReport is used to request the status of an order message or an order cancellations request message, then the message identification of the order or cancellation message is identified in PreviousReference.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument.";
				previousVersion_lazy = () -> RequestForOrderStatusReportV02.mmObject();
				nextVersions_lazy = () -> Arrays.asList(RequestForOrderStatusReportV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "ReqForOrdrStsRptV03";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.MessageIdentification, com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.RequestDetails,
						com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.Extension);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.setr.RequestForOrderStatusReportV03.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}