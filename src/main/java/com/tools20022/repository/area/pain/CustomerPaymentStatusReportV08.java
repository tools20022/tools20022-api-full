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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationPreviousVersion;
import com.tools20022.repository.msg.GroupHeader52;
import com.tools20022.repository.msg.OriginalGroupHeader7;
import com.tools20022.repository.msg.OriginalPaymentInstruction23;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import com.tools20022.repository.msgset.PaymentsInitiationISOPreviousversion;
import com.tools20022.repository.msgset.PaymentsInitiationMaintenance20162017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerPaymentStatusReport message is sent by an instructed agent to the
 * previous party in the payment chain. It is used to inform this party about
 * the positive or negative status of an instruction (either single or file). It
 * is also used to report on a pending instruction.<br>
 * <b>Usage</b><br>
 * The CustomerPaymentStatusReport message is exchanged between an agent and a
 * non-financial institution customer to provide status information on
 * instructions previously sent. Its usage will always be governed by a
 * bilateral agreement between the agent and the non-financial institution
 * customer.<br>
 * The CustomerPaymentStatusReport message can be used to provide information
 * about the status (e.g. rejection, acceptance) of the initiation of a credit
 * transfer, a direct debit, as well as on the initiation of other customer
 * instructions.<br>
 * The CustomerPaymentStatusReport message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The CustomerPaymentStatusReport message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerPaymentStatusReport may also be sent to the receiver of the
 * payment in a real time payment scenario, as both sides of the transactions
 * must be informed of the status of the transaction (e.g. either the
 * beneficiary is credited, or the transaction is rejected).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmGroupHeader
 * CustomerPaymentStatusReportV08.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmOriginalGroupInformationAndStatus
 * CustomerPaymentStatusReportV08.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmOriginalPaymentInformationAndStatus
 * CustomerPaymentStatusReportV08.mmOriginalPaymentInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmSupplementaryData
 * CustomerPaymentStatusReportV08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationISOPreviousversion
 * PaymentsInitiationISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationMaintenance20162017
 * PaymentsInitiationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CstmrPmtStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationPreviousVersion
 * PaymentsInitiationPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.002.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusAcceptedRule#for_pain_CustomerPaymentStatusReportV08
 * ConstraintGroupStatusAcceptedRule.for_pain_CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusPendingRule#for_pain_CustomerPaymentStatusReportV08
 * ConstraintGroupStatusPendingRule.for_pain_CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule#for_pain_CustomerPaymentStatusReportV08
 * ConstraintGroupStatusRejectedRule.for_pain_CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupStatusReceivedRule#for_pain_CustomerPaymentStatusReportV08
 * ConstraintGroupStatusReceivedRule.for_pain_CustomerPaymentStatusReportV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pain_CustomerPaymentStatusReportV08
 * ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerPaymentStatusReportV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe CustomerPaymentStatusReport message is exchanged between an agent and a non-financial institution customer to provide status information on instructions previously sent. Its usage will always be governed by a bilateral agreement between the agent and the non-financial institution customer.\r\nThe CustomerPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of the initiation of a credit transfer, a direct debit, as well as on the initiation of other customer instructions.\r\nThe CustomerPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentStatusReport message can be used in domestic and cross-border scenarios.\r\nThe CustomerPaymentStatusReport may also be sent to the receiver of the payment in a real time payment scenario, as both sides of the transactions must be informed of the status of the transaction (e.g. either the beneficiary is credited, or the transaction is rejected)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09
 * CustomerPaymentStatusReportV09}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07
 * CustomerPaymentStatusReportV07}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerPaymentStatusReportV08", propOrder = {"groupHeader", "originalGroupInformationAndStatus", "originalPaymentInformationAndStatus", "supplementaryData"})
public class CustomerPaymentStatusReportV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader52 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader52
	 * GroupHeader52}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the status report message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09#mmGroupHeader
	 * CustomerPaymentStatusReportV09.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07#mmGroupHeader
	 * CustomerPaymentStatusReportV07.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentStatusReportV08, GroupHeader52> mmGroupHeader = new MMMessageBuildingBlock<CustomerPaymentStatusReportV08, GroupHeader52>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status report message.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV09.mmGroupHeader);
			previousVersion_lazy = () -> CustomerPaymentStatusReportV07.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader52.mmObject();
		}

		@Override
		public GroupHeader52 getValue(CustomerPaymentStatusReportV08 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerPaymentStatusReportV08 obj, GroupHeader52 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInfAndSts", required = true)
	protected OriginalGroupHeader7 originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
	 * OriginalGroupHeader7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original group information concerning the group of transactions, to which the status report message refers to."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09#mmOriginalGroupInformationAndStatus
	 * CustomerPaymentStatusReportV09.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07#mmOriginalGroupInformationAndStatus
	 * CustomerPaymentStatusReportV07.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentStatusReportV08, OriginalGroupHeader7> mmOriginalGroupInformationAndStatus = new MMMessageBuildingBlock<CustomerPaymentStatusReportV08, OriginalGroupHeader7>() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the status report message refers to.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV09.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> CustomerPaymentStatusReportV07.mmOriginalGroupInformationAndStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupHeader7.mmObject();
		}

		@Override
		public OriginalGroupHeader7 getValue(CustomerPaymentStatusReportV08 obj) {
			return obj.getOriginalGroupInformationAndStatus();
		}

		@Override
		public void setValue(CustomerPaymentStatusReportV08 obj, OriginalGroupHeader7 value) {
			obj.setOriginalGroupInformationAndStatus(value);
		}
	};
	@XmlElement(name = "OrgnlPmtInfAndSts")
	protected List<OriginalPaymentInstruction23> originalPaymentInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original payment information, to which the status report message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09#mmOriginalPaymentInformationAndStatus
	 * CustomerPaymentStatusReportV09.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07#mmOriginalPaymentInformationAndStatus
	 * CustomerPaymentStatusReportV07.mmOriginalPaymentInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentStatusReportV08, List<OriginalPaymentInstruction23>> mmOriginalPaymentInformationAndStatus = new MMMessageBuildingBlock<CustomerPaymentStatusReportV08, List<OriginalPaymentInstruction23>>() {
		{
			xmlTag = "OrgnlPmtInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationAndStatus";
			definition = "Information concerning the original payment information, to which the status report message refers.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV09.mmOriginalPaymentInformationAndStatus);
			previousVersion_lazy = () -> CustomerPaymentStatusReportV07.mmOriginalPaymentInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> OriginalPaymentInstruction23.mmObject();
		}

		@Override
		public List<OriginalPaymentInstruction23> getValue(CustomerPaymentStatusReportV08 obj) {
			return obj.getOriginalPaymentInformationAndStatus();
		}

		@Override
		public void setValue(CustomerPaymentStatusReportV08 obj, List<OriginalPaymentInstruction23> value) {
			obj.setOriginalPaymentInformationAndStatus(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV09#mmSupplementaryData
	 * CustomerPaymentStatusReportV09.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07#mmSupplementaryData
	 * CustomerPaymentStatusReportV07.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerPaymentStatusReportV08, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CustomerPaymentStatusReportV08, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV09.mmSupplementaryData);
			previousVersion_lazy = () -> CustomerPaymentStatusReportV07.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CustomerPaymentStatusReportV08 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CustomerPaymentStatusReportV08 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupStatusAcceptedRule.for_pain_CustomerPaymentStatusReportV08,
						com.tools20022.repository.constraints.ConstraintGroupStatusPendingRule.for_pain_CustomerPaymentStatusReportV08,
						com.tools20022.repository.constraints.ConstraintGroupStatusRejectedRule.for_pain_CustomerPaymentStatusReportV08,
						com.tools20022.repository.constraints.ConstraintGroupStatusReceivedRule.for_pain_CustomerPaymentStatusReportV08,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pain_CustomerPaymentStatusReportV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerPaymentStatusReportV08";
				definition = "Scope\r\nThe CustomerPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe CustomerPaymentStatusReport message is exchanged between an agent and a non-financial institution customer to provide status information on instructions previously sent. Its usage will always be governed by a bilateral agreement between the agent and the non-financial institution customer.\r\nThe CustomerPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of the initiation of a credit transfer, a direct debit, as well as on the initiation of other customer instructions.\r\nThe CustomerPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe CustomerPaymentStatusReport message can be used in domestic and cross-border scenarios.\r\nThe CustomerPaymentStatusReport may also be sent to the receiver of the payment in a real time payment scenario, as both sides of the transactions must be informed of the status of the transaction (e.g. either the beneficiary is credited, or the transaction is rejected).";
				nextVersions_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV09.mmObject());
				previousVersion_lazy = () -> CustomerPaymentStatusReportV07.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsInitiationISOPreviousversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), PaymentsInitiationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrPmtStsRpt";
				businessArea_lazy = () -> PaymentsInitiationPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.mmGroupHeader,
						com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.mmOriginalGroupInformationAndStatus, com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.mmOriginalPaymentInformationAndStatus,
						com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "002";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerPaymentStatusReportV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader52 getGroupHeader() {
		return groupHeader;
	}

	public CustomerPaymentStatusReportV08 setGroupHeader(GroupHeader52 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupHeader7 getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus;
	}

	public CustomerPaymentStatusReportV08 setOriginalGroupInformationAndStatus(OriginalGroupHeader7 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = Objects.requireNonNull(originalGroupInformationAndStatus);
		return this;
	}

	public List<OriginalPaymentInstruction23> getOriginalPaymentInformationAndStatus() {
		return originalPaymentInformationAndStatus == null ? originalPaymentInformationAndStatus = new ArrayList<>() : originalPaymentInformationAndStatus;
	}

	public CustomerPaymentStatusReportV08 setOriginalPaymentInformationAndStatus(List<OriginalPaymentInstruction23> originalPaymentInformationAndStatus) {
		this.originalPaymentInformationAndStatus = Objects.requireNonNull(originalPaymentInformationAndStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerPaymentStatusReportV08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.002.001.08")
	static public class Document {
		@XmlElement(name = "CstmrPmtStsRpt", required = true)
		public CustomerPaymentStatusReportV08 messageBody;
	}
}