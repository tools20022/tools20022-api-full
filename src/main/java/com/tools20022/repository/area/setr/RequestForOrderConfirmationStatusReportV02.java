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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The RequestForOrderConfirmationStatusReport message is ent by an executing
 * party, for example, a transfer agent, to the instructing party, for example,
 * an investment manager or its authorised representative, to request the status
 * of one or more order confirmations.<br>
 * <b>Usage</b><br>
 * The RequestForOrderConfirmationStatusReport message is used to request the
 * status of either:<br>
 * - one or several individual order confirmations, or,<br>
 * - one or several order confirmation messages.<br>
 * The response to a RequestForOrderConfirmationStatusReport message is the
 * OrderConfirmationStatusReport message.<br>
 * When the RequestForOrderConfirmationStatusReport message is used to request
 * the status of several individual order confirmations or one or more order
 * confirmation messages, the executing party may receive several
 * OrderConfirmationStatusReport messages from the instructing party.<br>
 * When the RequestForOrderConfirmationStatusReport is used to request the
 * status of one or more individual order confirmations, each individual order
 * confirmation is identified with its order reference. The message
 * identification of the message in which the individual order confirmation was
 * conveyed may also be quoted in PreviousReference.<br>
 * When the RequestForOrderConfirmationStatusReport is used to request the
 * status of an order confirmation message, then the message identification of
 * the order confirmation message is identified in PreviousReference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmMessageIdentification
 * RequestForOrderConfirmationStatusReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmRequestDetails
 * RequestForOrderConfirmationStatusReportV02.mmRequestDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02#mmExtension
 * RequestForOrderConfirmationStatusReportV02.mmExtension}</li>
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
 * xmlTag} = "ReqForOrdrConfStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradeLatestVersion
 * SecuritiesTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.058.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline#forRequestForOrderConfirmationStatusReportV02
 * ConstraintOtherReferenceGuideline.
 * forRequestForOrderConfirmationStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline#forRequestForOrderConfirmationStatusReportV02
 * ConstraintPreviousReferenceGuideline.
 * forRequestForOrderConfirmationStatusReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RequestForOrderConfirmationStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe RequestForOrderConfirmationStatusReport message is ent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to request the status of one or more order confirmations.\r\nUsage\r\nThe RequestForOrderConfirmationStatusReport message is used to request the status of either:\r\n- one or several individual order confirmations, or,\r\n- one or several order confirmation messages.\r\nThe response to a RequestForOrderConfirmationStatusReport message is the OrderConfirmationStatusReport message.\r\nWhen the RequestForOrderConfirmationStatusReport message is used to request the status of several individual order confirmations or one or more order confirmation messages, the executing party may receive several OrderConfirmationStatusReport messages from the instructing party.\r\nWhen the RequestForOrderConfirmationStatusReport is used to request the status of one or more individual order confirmations, each individual order confirmation is identified with its order reference. The message identification of the message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderConfirmationStatusReport is used to request the status of an order confirmation message, then the message identification of the order confirmation message is identified in PreviousReference."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01
 * RequestForOrderConfirmationStatusReportV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RequestForOrderConfirmationStatusReportV02", propOrder = {"messageIdentification", "requestDetails", "extension"})
public class RequestForOrderConfirmationStatusReportV02 {

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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#mmMessageIdentification
	 * RequestForOrderConfirmationStatusReportV01.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint. ";
			previousVersion_lazy = () -> RequestForOrderConfirmationStatusReportV01.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderConfirmationStatusReportV02.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ReqDtls", required = true)
	protected List<MessageAndBusinessReference10> requestDetails;
	/**
	 * 
	 <p>
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
	 * "Information to identify the order confirmation for which the status is requested."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#mmRequestDetails
	 * RequestForOrderConfirmationStatusReportV01.mmRequestDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRequestDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ReqDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestDetails";
			definition = "Information to identify the order confirmation for which the status is requested.";
			previousVersion_lazy = () -> RequestForOrderConfirmationStatusReportV01.mmRequestDetails;
			minOccurs = 1;
			complexType_lazy = () -> MessageAndBusinessReference10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderConfirmationStatusReportV02.class.getMethod("getRequestDetails", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV01#mmExtension
	 * RequestForOrderConfirmationStatusReportV01.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> RequestForOrderConfirmationStatusReportV01.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RequestForOrderConfirmationStatusReportV02.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOtherReferenceGuideline.forRequestForOrderConfirmationStatusReportV02,
						com.tools20022.repository.constraints.ConstraintPreviousReferenceGuideline.forRequestForOrderConfirmationStatusReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestForOrderConfirmationStatusReportV02";
				definition = "Scope\r\nThe RequestForOrderConfirmationStatusReport message is ent by an executing party, for example, a transfer agent, to the instructing party, for example, an investment manager or its authorised representative, to request the status of one or more order confirmations.\r\nUsage\r\nThe RequestForOrderConfirmationStatusReport message is used to request the status of either:\r\n- one or several individual order confirmations, or,\r\n- one or several order confirmation messages.\r\nThe response to a RequestForOrderConfirmationStatusReport message is the OrderConfirmationStatusReport message.\r\nWhen the RequestForOrderConfirmationStatusReport message is used to request the status of several individual order confirmations or one or more order confirmation messages, the executing party may receive several OrderConfirmationStatusReport messages from the instructing party.\r\nWhen the RequestForOrderConfirmationStatusReport is used to request the status of one or more individual order confirmations, each individual order confirmation is identified with its order reference. The message identification of the message in which the individual order confirmation was conveyed may also be quoted in PreviousReference.\r\nWhen the RequestForOrderConfirmationStatusReport is used to request the status of an order confirmation message, then the message identification of the order confirmation message is identified in PreviousReference.";
				previousVersion_lazy = () -> RequestForOrderConfirmationStatusReportV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ReqForOrdrConfStsRpt";
				businessArea_lazy = () -> SecuritiesTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.mmMessageIdentification,
						com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.mmRequestDetails, com.tools20022.repository.area.setr.RequestForOrderConfirmationStatusReportV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "058";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RequestForOrderConfirmationStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public RequestForOrderConfirmationStatusReportV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<MessageAndBusinessReference10> getRequestDetails() {
		return requestDetails == null ? requestDetails = new ArrayList<>() : requestDetails;
	}

	public RequestForOrderConfirmationStatusReportV02 setRequestDetails(List<MessageAndBusinessReference10> requestDetails) {
		this.requestDetails = Objects.requireNonNull(requestDetails);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public RequestForOrderConfirmationStatusReportV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.058.001.02")
	static public class Document {
		@XmlElement(name = "ReqForOrdrConfStsRpt", required = true)
		public RequestForOrderConfirmationStatusReportV02 messageBody;
	}
}