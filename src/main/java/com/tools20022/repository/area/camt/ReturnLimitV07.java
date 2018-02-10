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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.LimitReportOrError3Choice;
import com.tools20022.repository.msg.MessageHeader7;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ReturnLimit message is sent by the transaction administrator to a member
 * of the system.<br>
 * It is used to provide information on the details of one or more limits set by
 * the member (or on behalf of the member) and managed by the transaction
 * administrator.<br>
 * The ReturnLimit message can be sent as a response to a related GetLimit
 * message (pull mode) or initiated by the transaction administrator (push
 * mode). The push of information can take place either at prearranged times or
 * as a warning or alarm when a problem has occurred.<br>
 * <b>Usage</b><br>
 * At any time during the operating hours of the system, the member can query
 * the transaction administrator to get information about the limit(s) that the
 * transaction administrator manages for the member.<br>
 * The transaction administrator may also send a ReturnLimit message with
 * pre-defined information at times previously agreed with the member or to warn
 * the member about a particular problem that may have arisen and which needs
 * attention.<br>
 * The message from the transaction administrator can contain information on the
 * following elements:<br>
 * - type of risk and/or liquidity limit<br>
 * - value of the limit(s) (default and/or current limit(s) for risk and/or
 * liquidity management)<br>
 * - identification of the system<br>
 * - status of the limit(s) (default and/or current limit(s) for risk and/or
 * liquidity management)<br>
 * - point in time when the limit becomes effective<br>
 * - identification of the counterparty<br>
 * Additional information on the generic design of the Get/Return messages can
 * be found in the section How to Use the Cash Management Messages.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnLimitV07#mmMessageHeader
 * ReturnLimitV07.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnLimitV07#mmReportOrError
 * ReturnLimitV07.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnLimitV07#mmSupplementaryData
 * ReturnLimitV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance
 * _SR2018_MX_CashManagement_Maintenance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RtrLmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.010.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnLimitV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ReturnLimit message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on the details of one or more limits set by the member (or on behalf of the member) and managed by the transaction administrator.\r\nThe ReturnLimit message can be sent as a response to a related GetLimit message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the limit(s) that the transaction administrator manages for the member.\r\nThe transaction administrator may also send a ReturnLimit message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.\r\nThe message from the transaction administrator can contain information on the following elements:\r\n- type of risk and/or liquidity limit\r\n- value of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)\r\n- identification of the system\r\n- status of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)\r\n- point in time when the limit becomes effective\r\n- identification of the counterparty\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnLimitV07", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnLimitV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader7 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader7
	 * MessageHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReturnLimitV07.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected LimitReportOrError3Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LimitReportOrError3Choice
	 * LimitReportOrError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on limits."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportOrError = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on limits.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LimitReportOrError3Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReturnLimitV07.class.getMethod("getReportOrError", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReturnLimitV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReturnLimitV07";
				definition = "Scope\r\nThe ReturnLimit message is sent by the transaction administrator to a member of the system.\r\nIt is used to provide information on the details of one or more limits set by the member (or on behalf of the member) and managed by the transaction administrator.\r\nThe ReturnLimit message can be sent as a response to a related GetLimit message (pull mode) or initiated by the transaction administrator (push mode). The push of information can take place either at prearranged times or as a warning or alarm when a problem has occurred.\r\nUsage\r\nAt any time during the operating hours of the system, the member can query the transaction administrator to get information about the limit(s) that the transaction administrator manages for the member.\r\nThe transaction administrator may also send a ReturnLimit message with pre-defined information at times previously agreed with the member or to warn the member about a particular problem that may have arisen and which needs attention.\r\nThe message from the transaction administrator can contain information on the following elements:\r\n- type of risk and/or liquidity limit\r\n- value of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)\r\n- identification of the system\r\n- status of the limit(s) (default and/or current limit(s) for risk and/or liquidity management)\r\n- point in time when the limit becomes effective\r\n- identification of the counterparty\r\nAdditional information on the generic design of the Get/Return messages can be found in the section How to Use the Cash Management Messages.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrLmt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnLimitV07.mmMessageHeader, com.tools20022.repository.area.camt.ReturnLimitV07.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnLimitV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "010";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnLimitV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader7 getMessageHeader() {
		return messageHeader;
	}

	public ReturnLimitV07 setMessageHeader(MessageHeader7 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public LimitReportOrError3Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnLimitV07 setReportOrError(LimitReportOrError3Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnLimitV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.010.001.07")
	static public class Document {
		@XmlElement(name = "RtrLmt", required = true)
		public ReturnLimitV07 messageBody;
	}
}