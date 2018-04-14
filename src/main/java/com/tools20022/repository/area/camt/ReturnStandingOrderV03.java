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
import com.tools20022.repository.choice.StandingOrderOrError3Choice;
import com.tools20022.repository.msg.MessageHeader6;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * Scope The ReturnStandingOrder message is sent by a transaction administrator
 * to a member. It is used to provide information on the details of one or more
 * standing orders, based on specific request and return criteria. in response
 * to a request a on information on standing and predefined orders. Usage The
 * ReturnStandingOrder message lists the standing order based on the following
 * possible return criteria: - Generic standing order details, - Details of a
 * specific predefined or standing liquidity transfer orders, - Details on the
 * set to which the standing order belongs to, - List of all predefined and
 * standing liquidity transfer standing orders and/or per set, - Total amount of
 * predefined and standing liquidity transfer orders defined in the system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.070.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03#mmMessageHeader
 * ReturnStandingOrderV03.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03#mmReportOrError
 * ReturnStandingOrderV03.mmReportOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ReturnStandingOrderV03#mmSupplementaryData
 * ReturnStandingOrderV03.mmSupplementaryData}</li>
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
 * xmlTag} = "RtrStgOrdr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReturnStandingOrderV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe ReturnStandingOrder message is sent by a transaction administrator to a member.\nIt is used to provide information on the details of one or more standing orders, based on specific request and return criteria.\nin response to a request a on information on standing and predefined orders.\nUsage\nThe ReturnStandingOrder message lists the standing order based on the following possible return criteria: \n- Generic standing order details,\n- Details of a specific predefined or standing liquidity transfer orders,\n- Details on the set to which the standing order belongs to,\n- List of all predefined and standing liquidity transfer standing orders and/or per set,\n- Total amount of predefined and standing liquidity transfer orders defined in the system."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReturnStandingOrderV03", propOrder = {"messageHeader", "reportOrError", "supplementaryData"})
public class ReturnStandingOrderV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader6 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader6
	 * MessageHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnStandingOrderV03, MessageHeader6> mmMessageHeader = new MMMessageBuildingBlock<ReturnStandingOrderV03, MessageHeader6>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader6.mmObject();
		}

		@Override
		public MessageHeader6 getValue(ReturnStandingOrderV03 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ReturnStandingOrderV03 obj, MessageHeader6 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RptOrErr", required = true)
	protected StandingOrderOrError3Choice reportOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StandingOrderOrError3Choice
	 * StandingOrderOrError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on standing orders."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnStandingOrderV03, StandingOrderOrError3Choice> mmReportOrError = new MMMessageBuildingBlock<ReturnStandingOrderV03, StandingOrderOrError3Choice>() {
		{
			xmlTag = "RptOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportOrError";
			definition = "Reports on standing orders.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StandingOrderOrError3Choice.mmObject();
		}

		@Override
		public StandingOrderOrError3Choice getValue(ReturnStandingOrderV03 obj) {
			return obj.getReportOrError();
		}

		@Override
		public void setValue(ReturnStandingOrderV03 obj, StandingOrderOrError3Choice value) {
			obj.setReportOrError(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ReturnStandingOrderV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ReturnStandingOrderV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ReturnStandingOrderV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ReturnStandingOrderV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReturnStandingOrderV03";
				definition = "Scope\nThe ReturnStandingOrder message is sent by a transaction administrator to a member.\nIt is used to provide information on the details of one or more standing orders, based on specific request and return criteria.\nin response to a request a on information on standing and predefined orders.\nUsage\nThe ReturnStandingOrder message lists the standing order based on the following possible return criteria: \n- Generic standing order details,\n- Details of a specific predefined or standing liquidity transfer orders,\n- Details on the set to which the standing order belongs to,\n- List of all predefined and standing liquidity transfer standing orders and/or per set,\n- Total amount of predefined and standing liquidity transfer orders defined in the system.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "RtrStgOrdr";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ReturnStandingOrderV03.mmMessageHeader, com.tools20022.repository.area.camt.ReturnStandingOrderV03.mmReportOrError,
						com.tools20022.repository.area.camt.ReturnStandingOrderV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "070";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReturnStandingOrderV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader6 getMessageHeader() {
		return messageHeader;
	}

	public ReturnStandingOrderV03 setMessageHeader(MessageHeader6 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public StandingOrderOrError3Choice getReportOrError() {
		return reportOrError;
	}

	public ReturnStandingOrderV03 setReportOrError(StandingOrderOrError3Choice reportOrError) {
		this.reportOrError = Objects.requireNonNull(reportOrError);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ReturnStandingOrderV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.070.001.03")
	static public class Document {
		@XmlElement(name = "RtrStgOrdr", required = true)
		public ReturnStandingOrderV03 messageBody;
	}
}