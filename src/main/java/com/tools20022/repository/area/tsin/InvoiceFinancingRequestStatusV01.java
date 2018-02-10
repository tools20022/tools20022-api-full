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
import com.tools20022.repository.msg.FinancingInformationAndStatus1;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.OriginalRequestInformation1;
import com.tools20022.repository.msgset.InvoiceFinancingRequestISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The InvoiceFinancingRequestStatus message is sent by the First Agent to the
 * Financing Requestor, alternatively through an Intermediary Agent (relay
 * scenario). It is used to inform the Financing Requestor about the positive or
 * negative status of a financing request or a financing cancellation request.<br>
 * <b>Usage</b><br>
 * The InvoiceFinancingRequestStatus message flows from the First Agent to the
 * Financing Requestor (alternatively through an Intermediary Agent) to provide
 * status information about a request previously sent.<br>
 * Its usage will always be governed by a bilateral agreement between the First
 * Agent and the Financing Requestor.<br>
 * The InvoiceFinancingRequestStatus message can be used two fold:<br>
 * - to provide information about the reception status (eg rejection,
 * acceptance) of a request message. In this case the status message is the
 * result of a technical validation performed by the First Agent on the request
 * message received;<br>
 * - to inform the Financing Requestor about the business status of the
 * financing process initiated. In this case the First Agent can:<br>
 * communicate that a single financing request has been granted, is pending or
 * has not been granted at all;<br>
 * inform that a financing cancellation request has been allowed or denied.<br>
 * Note.<br>
 * If the Financing Requestor requests financing for more than one instalment
 * related to the same invoice, the First Agent can decide to finance only some
 * of the instalments. In such case the status message contains details and
 * status of every single instalment (financed, not financed).<br>
 * The message can be used in a direct or in a relay scenario:<br>
 * - In a direct scenario, the message is sent directly by the First Agent to
 * the Financing Requestor;<br>
 * - In a relay scenario, the message is sent first by the First Agent to the
 * Intermediary Agent, who forwards it to the Financing Requestor.<br>
 * The InvoiceFinancingRequestStatus message refers to the original request(s)
 * by means of references and a set of data elements included into the original
 * request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmStatusIdentification
 * InvoiceFinancingRequestStatusV01.mmStatusIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmOriginalRequestInformationAndStatus
 * InvoiceFinancingRequestStatusV01.mmOriginalRequestInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01#mmFinancingInformationAndStatus
 * InvoiceFinancingRequestStatusV01.mmFinancingInformationAndStatus}</li>
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
 * xmlTag} = "InvcFincgReqSts"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.002.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequest1Rule#forInvoiceFinancingRequestStatusV01
 * ConstraintRequest1Rule.forInvoiceFinancingRequestStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation1Rule#forInvoiceFinancingRequestStatusV01
 * ConstraintCancellation1Rule.forInvoiceFinancingRequestStatusV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMultiplicity1Rule#forInvoiceFinancingRequestStatusV01
 * ConstraintMultiplicity1Rule.forInvoiceFinancingRequestStatusV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvoiceFinancingRequestStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InvoiceFinancingRequestStatus message is sent by the First Agent to the Financing Requestor, alternatively through an Intermediary Agent (relay scenario). It is used to inform the Financing Requestor about the positive or negative status of a financing request or a financing cancellation request.\r\nUsage\r\nThe InvoiceFinancingRequestStatus message flows from the First Agent to the Financing Requestor (alternatively through an Intermediary Agent) to provide status information about a request previously sent.\r\nIts usage will always be governed by a bilateral agreement between the First Agent and the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message can be used two fold:\r\n- to provide information about the reception status (eg rejection, acceptance) of a request message. In this case the status message is the result of a technical validation performed by the First Agent on the request message received;\r\n- to inform the Financing Requestor about the business status of the financing process initiated. In this case the First Agent can:\r\n* communicate that a single financing request has been granted, is pending or has not been granted at all;\r\n* inform that a financing cancellation request has been allowed or denied.\r\nNote.\r\nIf the Financing Requestor requests financing for more than one instalment related to the same invoice, the First Agent can decide to finance only some of the instalments. In such case the status message contains details and status of every single instalment (financed, not financed).\r\nThe message can be used in a direct or in a relay scenario:\r\n- In a direct scenario, the message is sent directly by the First Agent to the Financing Requestor;\r\n- In a relay scenario, the message is sent first by the First Agent to the Intermediary Agent, who forwards it to the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message refers to the original request(s) by means of references and a set of data elements included into the original request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvoiceFinancingRequestStatusV01", propOrder = {"statusIdentification", "originalRequestInformationAndStatus", "financingInformationAndStatus"})
public class InvoiceFinancingRequestStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "StsId", required = true)
	protected MessageIdentification1 statusIdentification;
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
	 * xmlTag} = "StsId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information that unambiguously identify the invoice financing status report, such as status identification, creation date time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusIdentification";
			definition = "General information that unambiguously identify the invoice financing status report, such as status identification, creation date time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingRequestStatusV01.class.getMethod("getStatusIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlReqInfAndSts", required = true)
	protected OriginalRequestInformation1 originalRequestInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalRequestInformation1
	 * OriginalRequestInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlReqInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalRequestInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of summary information that unambiguously identifies the original invoice financing (or cancellation) request to which the status is referred. The status of the original request is also given in this block.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalRequestInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlReqInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalRequestInformationAndStatus";
			definition = "Set of summary information that unambiguously identifies the original invoice financing (or cancellation) request to which the status is referred. The status of the original request is also given in this block.\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalRequestInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingRequestStatusV01.class.getMethod("getOriginalRequestInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "FincgInfAndSts")
	protected FinancingInformationAndStatus1 financingInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancingInformationAndStatus1
	 * FinancingInformationAndStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FincgInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the business status of a financing request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmFinancingInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "FincgInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingInformationAndStatus";
			definition = "Information concerning the business status of a financing request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancingInformationAndStatus1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return InvoiceFinancingRequestStatusV01.class.getMethod("getFinancingInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRequest1Rule.forInvoiceFinancingRequestStatusV01,
						com.tools20022.repository.constraints.ConstraintCancellation1Rule.forInvoiceFinancingRequestStatusV01, com.tools20022.repository.constraints.ConstraintMultiplicity1Rule.forInvoiceFinancingRequestStatusV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvoiceFinancingRequestStatusV01";
				definition = "Scope\r\nThe InvoiceFinancingRequestStatus message is sent by the First Agent to the Financing Requestor, alternatively through an Intermediary Agent (relay scenario). It is used to inform the Financing Requestor about the positive or negative status of a financing request or a financing cancellation request.\r\nUsage\r\nThe InvoiceFinancingRequestStatus message flows from the First Agent to the Financing Requestor (alternatively through an Intermediary Agent) to provide status information about a request previously sent.\r\nIts usage will always be governed by a bilateral agreement between the First Agent and the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message can be used two fold:\r\n- to provide information about the reception status (eg rejection, acceptance) of a request message. In this case the status message is the result of a technical validation performed by the First Agent on the request message received;\r\n- to inform the Financing Requestor about the business status of the financing process initiated. In this case the First Agent can:\r\n* communicate that a single financing request has been granted, is pending or has not been granted at all;\r\n* inform that a financing cancellation request has been allowed or denied.\r\nNote.\r\nIf the Financing Requestor requests financing for more than one instalment related to the same invoice, the First Agent can decide to finance only some of the instalments. In such case the status message contains details and status of every single instalment (financed, not financed).\r\nThe message can be used in a direct or in a relay scenario:\r\n- In a direct scenario, the message is sent directly by the First Agent to the Financing Requestor;\r\n- In a relay scenario, the message is sent first by the First Agent to the Intermediary Agent, who forwards it to the Financing Requestor.\r\nThe InvoiceFinancingRequestStatus message refers to the original request(s) by means of references and a set of data elements included into the original request.";
				messageSet_lazy = () -> Arrays.asList(InvoiceFinancingRequestISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "InvcFincgReqSts";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.mmStatusIdentification,
						com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.mmOriginalRequestInformationAndStatus, com.tools20022.repository.area.tsin.InvoiceFinancingRequestStatusV01.mmFinancingInformationAndStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InvoiceFinancingRequestStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getStatusIdentification() {
		return statusIdentification;
	}

	public InvoiceFinancingRequestStatusV01 setStatusIdentification(MessageIdentification1 statusIdentification) {
		this.statusIdentification = Objects.requireNonNull(statusIdentification);
		return this;
	}

	public OriginalRequestInformation1 getOriginalRequestInformationAndStatus() {
		return originalRequestInformationAndStatus;
	}

	public InvoiceFinancingRequestStatusV01 setOriginalRequestInformationAndStatus(OriginalRequestInformation1 originalRequestInformationAndStatus) {
		this.originalRequestInformationAndStatus = Objects.requireNonNull(originalRequestInformationAndStatus);
		return this;
	}

	public Optional<FinancingInformationAndStatus1> getFinancingInformationAndStatus() {
		return financingInformationAndStatus == null ? Optional.empty() : Optional.of(financingInformationAndStatus);
	}

	public InvoiceFinancingRequestStatusV01 setFinancingInformationAndStatus(FinancingInformationAndStatus1 financingInformationAndStatus) {
		this.financingInformationAndStatus = financingInformationAndStatus;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01")
	static public class Document {
		@XmlElement(name = "InvcFincgReqSts", required = true)
		public InvoiceFinancingRequestStatusV01 messageBody;
	}
}