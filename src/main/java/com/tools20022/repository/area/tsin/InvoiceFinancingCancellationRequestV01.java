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

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.CancellationRequestInformation1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The InvoiceFinancingCancellationRequest message is sent by the Financing
 * Requestor to the Intermediary Agent (relay scenario) or First Agent (direct
 * scenario). It is used to request the cancellation of a previously sent
 * financing request.<br>
 * <b>Usage</b><br>
 * The InvoiceFinancingCancellationRequest message is used by the Financing
 * Requestor to request the cancellation of a previously sent financing request.<br>
 * It is not possible to send a cancellation request for a single invoice
 * contained in a bulk invoice financing request.<br>
 * The InvoiceFinancingCancellationRequest message contains references (original
 * group identification and original creation date and time) of the original
 * financing request message to which is referred.<br>
 * As for InvoiceFinancingRequest, the message can be used in a direct or a
 * relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the First Agent. The
 * First Agent is the account servicer of the Financing Requestor.<br>
 * - In a relay scenario, the message is sent to an Intermediary Agent. The
 * Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to
 * the First Agent.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion
 * InvoiceFinancingRequestISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcFincgCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#CancellationRequestIdentification
 * InvoiceFinancingCancellationRequestV01.CancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#CancellationRequestInformation
 * InvoiceFinancingCancellationRequestV01.CancellationRequestInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#identifier
 * InvoiceFinancingCancellationRequestV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceFinancingCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InvoiceFinancingCancellationRequest message is sent by the Financing Requestor to the Intermediary Agent (relay scenario) or First Agent (direct scenario). It is used to request the cancellation of a previously sent financing request.\r\nUsage\r\nThe InvoiceFinancingCancellationRequest message is used by the Financing Requestor to request the cancellation of a previously sent financing request.\r\nIt is not possible to send a cancellation request for a single invoice contained in a bulk invoice financing request.\r\nThe InvoiceFinancingCancellationRequest message contains references (original group identification and original creation date and time) of the original financing request message to which is referred.\r\nAs for InvoiceFinancingRequest, the message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor.\r\n- In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to the First Agent."
 * </li>
 * </ul>
 */
public class InvoiceFinancingCancellationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identification of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationRequestIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlReqId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unique and unambiguous identification of the message.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}
	};
	/**
	 * Set of information related to the cancellation request, such as actors
	 * involved and identification of the original invoice financing request to
	 * which the cancellation request refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CancellationRequestInformation1
	 * CancellationRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of information related to the cancellation request, such as actors involved and identification of the original invoice financing request to which the cancellation request refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock CancellationRequestInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlReqInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestInformation";
			definition = "Set of information related to the cancellation request, such as actors involved and identification of the original invoice financing request to which the cancellation request refers.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> CancellationRequestInformation1.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "tsin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "003"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "tsin";
			messageFunctionality = "003";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingCancellationRequestV01";
				definition = "Scope\r\nThe InvoiceFinancingCancellationRequest message is sent by the Financing Requestor to the Intermediary Agent (relay scenario) or First Agent (direct scenario). It is used to request the cancellation of a previously sent financing request.\r\nUsage\r\nThe InvoiceFinancingCancellationRequest message is used by the Financing Requestor to request the cancellation of a previously sent financing request.\r\nIt is not possible to send a cancellation request for a single invoice contained in a bulk invoice financing request.\r\nThe InvoiceFinancingCancellationRequest message contains references (original group identification and original creation date and time) of the original financing request message to which is referred.\r\nAs for InvoiceFinancingRequest, the message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor.\r\n- In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to the First Agent.";
				messageSet_lazy = () -> Arrays.asList(InvoiceFinancingRequestISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcFincgCxlReq";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.CancellationRequestIdentification,
						com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.CancellationRequestInformation);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}