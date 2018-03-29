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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.CancellationRequestInformation1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#mmCancellationRequestIdentification
 * InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01#mmCancellationRequestInformation
 * InvoiceFinancingCancellationRequestV01.mmCancellationRequestInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion
 * InvoiceFinancingRequestISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InvcFincgCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.003.001.01}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceFinancingCancellationRequestV01", propOrder = {"cancellationRequestIdentification", "cancellationRequestInformation"})
public class InvoiceFinancingCancellationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlReqId", required = true)
	protected MessageIdentification1 cancellationRequestIdentification;
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
	public static final MMMessageBuildingBlock<InvoiceFinancingCancellationRequestV01, MessageIdentification1> mmCancellationRequestIdentification = new MMMessageBuildingBlock<InvoiceFinancingCancellationRequestV01, MessageIdentification1>() {
		{
			xmlTag = "CxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unique and unambiguous identification of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(InvoiceFinancingCancellationRequestV01 obj) {
			return obj.getCancellationRequestIdentification();
		}

		@Override
		public void setValue(InvoiceFinancingCancellationRequestV01 obj, MessageIdentification1 value) {
			obj.setCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "CxlReqInf", required = true)
	protected CancellationRequestInformation1 cancellationRequestInformation;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<InvoiceFinancingCancellationRequestV01, CancellationRequestInformation1> mmCancellationRequestInformation = new MMMessageBuildingBlock<InvoiceFinancingCancellationRequestV01, CancellationRequestInformation1>() {
		{
			xmlTag = "CxlReqInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestInformation";
			definition = "Set of information related to the cancellation request, such as actors involved and identification of the original invoice financing request to which the cancellation request refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CancellationRequestInformation1.mmObject();
		}

		@Override
		public CancellationRequestInformation1 getValue(InvoiceFinancingCancellationRequestV01 obj) {
			return obj.getCancellationRequestInformation();
		}

		@Override
		public void setValue(InvoiceFinancingCancellationRequestV01 obj, CancellationRequestInformation1 value) {
			obj.setCancellationRequestInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingCancellationRequestV01";
				definition = "Scope\r\nThe InvoiceFinancingCancellationRequest message is sent by the Financing Requestor to the Intermediary Agent (relay scenario) or First Agent (direct scenario). It is used to request the cancellation of a previously sent financing request.\r\nUsage\r\nThe InvoiceFinancingCancellationRequest message is used by the Financing Requestor to request the cancellation of a previously sent financing request.\r\nIt is not possible to send a cancellation request for a single invoice contained in a bulk invoice financing request.\r\nThe InvoiceFinancingCancellationRequest message contains references (original group identification and original creation date and time) of the original financing request message to which is referred.\r\nAs for InvoiceFinancingRequest, the message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the First Agent. The First Agent is the account servicer of the Financing Requestor.\r\n- In a relay scenario, the message is sent to an Intermediary Agent. The Intermediary Agent forwards the InvoiceFinancingCancellingRequest message to the First Agent.";
				messageSet_lazy = () -> Arrays.asList(InvoiceFinancingRequestISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcFincgCxlReq";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.mmCancellationRequestIdentification,
						com.tools20022.repository.area.tsin.InvoiceFinancingCancellationRequestV01.mmCancellationRequestInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "003";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingCancellationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public InvoiceFinancingCancellationRequestV01 setCancellationRequestIdentification(MessageIdentification1 cancellationRequestIdentification) {
		this.cancellationRequestIdentification = Objects.requireNonNull(cancellationRequestIdentification);
		return this;
	}

	public CancellationRequestInformation1 getCancellationRequestInformation() {
		return cancellationRequestInformation;
	}

	public InvoiceFinancingCancellationRequestV01 setCancellationRequestInformation(CancellationRequestInformation1 cancellationRequestInformation) {
		this.cancellationRequestInformation = Objects.requireNonNull(cancellationRequestInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01")
	static public class Document {
		@XmlElement(name = "InvcFincgCxlReq", required = true)
		public InvoiceFinancingCancellationRequestV01 messageBody;
	}
}