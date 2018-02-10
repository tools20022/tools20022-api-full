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
import com.tools20022.repository.area.SecuritiesTradeArchive;
import com.tools20022.repository.msg.MessageAndBusinessReference2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RequestForOrderStatusReport is sent by an instructing party, eg, an
 * investment manager or its authorised representative, to the executing party,
 * eg, a transfer agent. There may be one or more intermediary parties between
 * the instructing party and the executing party.<br>
 * This message requests the status of one or several order instruction or order
 * cancellation messages.<br>
 * <b>Usage</b><br>
 * The RequestForOrderStatusReport message is used to request the status of:<br>
 * - one or several order messages,<br>
 * - one or several cancellation messages,<br>
 * - one or several individual orders within a bulk or multiple order message.<br>
 * If the RequestForOrderStatusReport message is used to request the status of
 * several messages, then the instructing party will receive several reply
 * messages from the executing party, ie, several OrderInstructionStatusReport
 * messages and/or OrderCancellationStatusReport messages. The number of reply
 * messages will match the number of references stated in the
 * RequestForOrderStatusReport message.<br>
 * The RequestForOrderStatusReport message may not be used to request the status
 * of an investment account, a transfer or the status of a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV02#mmRequestDetails
 * RequestForOrderStatusReportV02.mmRequestDetails}</li>
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
 * xmlTag} = "setr.018.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeArchive
 * SecuritiesTradeArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "setr.018.001.02"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.018.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestForOrderStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RequestForOrderStatusReport is sent by an instructing party, eg, an investment manager or its authorised representative, to the executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party.\r\nThis message requests the status of one or several order instruction or order cancellation messages.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several order messages,\r\n- one or several cancellation messages,\r\n- one or several individual orders within a bulk or multiple order message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several messages, then the instructing party will receive several reply messages from the executing party, ie, several OrderInstructionStatusReport messages and/or OrderCancellationStatusReport messages. The number of reply messages will match the number of references stated in the RequestForOrderStatusReport message.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderStatusReportV03
 * RequestForOrderStatusReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "setr.018.001.02", propOrder = "requestDetails")
public class RequestForOrderStatusReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ReqDtls", required = true)
	protected List<MessageAndBusinessReference2> requestDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2
	 * MessageAndBusinessReference2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Information to identify the order(s) for which the status is requested.";
			minOccurs = 1;
			complexType_lazy = () -> MessageAndBusinessReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderStatusReportV02.class.getMethod("getRequestDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestForOrderStatusReportV02";
				definition = "Scope\r\nThe RequestForOrderStatusReport is sent by an instructing party, eg, an investment manager or its authorised representative, to the executing party, eg, a transfer agent. There may be one or more intermediary parties between the instructing party and the executing party.\r\nThis message requests the status of one or several order instruction or order cancellation messages.\r\nUsage\r\nThe RequestForOrderStatusReport message is used to request the status of:\r\n- one or several order messages,\r\n- one or several cancellation messages,\r\n- one or several individual orders within a bulk or multiple order message.\r\nIf the RequestForOrderStatusReport message is used to request the status of several messages, then the instructing party will receive several reply messages from the executing party, ie, several OrderInstructionStatusReport messages and/or OrderCancellationStatusReport messages. The number of reply messages will match the number of references stated in the RequestForOrderStatusReport message.\r\nThe RequestForOrderStatusReport message may not be used to request the status of an investment account, a transfer or the status of a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(RequestForOrderStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "setr.018.001.02";
				businessArea_lazy = () -> SecuritiesTradeArchive.mmObject();
				xmlName = "setr.018.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderStatusReportV02.mmRequestDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "018";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestForOrderStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<MessageAndBusinessReference2> getRequestDetails() {
		return requestDetails == null ? requestDetails = new ArrayList<>() : requestDetails;
	}

	public RequestForOrderStatusReportV02 setRequestDetails(List<MessageAndBusinessReference2> requestDetails) {
		this.requestDetails = Objects.requireNonNull(requestDetails);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.018.001.02")
	static public class Document {
		@XmlElement(name = "setr.018.001.02", required = true)
		public RequestForOrderStatusReportV02 messageBody;
	}
}