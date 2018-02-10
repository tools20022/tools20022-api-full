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

package com.tools20022.repository.area.pacs;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
import com.tools20022.repository.msg.GroupHeader5;
import com.tools20022.repository.msg.OriginalGroupInformation1;
import com.tools20022.repository.msg.PaymentTransactionInformation1;
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
 * The PaymentStatusReport message is sent by an instructed agent to the
 * previous party in the payment chain. It is used to inform this party about
 * the positive or negative status of an instruction (either single or file). It
 * is also used to report on a pending instruction.<br>
 * <b>Usage</b><br>
 * The PaymentStatusReport message is exchanged between agents to provide status
 * information about instructions previously sent. Its usage will always be
 * governed by a bilateral agreement between the agents.<br>
 * The PaymentStatusReport message can be used to provide information about the
 * status (e.g. rejection, acceptance) of a credit transfer instruction, a
 * direct debit instruction, as well as other intra-agent instructions (e.g.
 * PaymentCancellationRequest).<br>
 * The PaymentStatusReport message refers to the original instruction(s) by
 * means of references only or by means of references and a set of elements from
 * the original instruction.<br>
 * The PaymentStatusReport message can be used in domestic and cross-border
 * scenarios.<br>
 * The PaymentStatusReport message exchanged between agents is identified in the
 * schema as follows: urn:iso:std:iso:20022:tech:xsd:pacs.002.001.02
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02#mmGroupHeader
 * PaymentStatusReportV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02#mmOriginalGroupInformationAndStatus
 * PaymentStatusReportV02.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentStatusReportV02#mmTransactionInformationAndStatus
 * PaymentStatusReportV02.mmTransactionInformationAndStatus}</li>
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
 * xmlTag} = "pacs.002.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pacs.002.001.02"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.002.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus1Rule#forPaymentStatusReportV02
 * ConstraintGroupAndTransactionStatus1Rule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus2Rule#forPaymentStatusReportV02
 * ConstraintGroupAndTransactionStatus2Rule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus3Rule#forPaymentStatusReportV02
 * ConstraintGroupAndTransactionStatus3Rule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule#forPaymentStatusReportV02
 * ConstraintGroupAndTransactionStatus4Rule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forPaymentStatusReportV02
 * ConstraintInstructedAgentRule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forPaymentStatusReportV02
 * ConstraintInstructingAgentRule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardingAgentRule#forPaymentStatusReportV02
 * ConstraintForwardingAgentRule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInitiatingPartyRule#forPaymentStatusReportV02
 * ConstraintInitiatingPartyRule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentStatusReportV02
 * ConstraintCreditorAgentRule.forPaymentStatusReportV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#forPaymentStatusReportV02
 * ConstraintDebtorAgentRule.forPaymentStatusReportV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentStatusReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe PaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe PaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (e.g. PaymentCancellationRequest).\r\nThe PaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe PaymentStatusReport message can be used in domestic and cross-border scenarios.\r\nThe PaymentStatusReport message exchanged between agents is identified in the schema as follows: \nurn:iso:std:iso:20022:tech:xsd:pacs.002.001.02\r"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV03
 * FIToFIPaymentStatusReportV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pacs.002.001.02", propOrder = {"groupHeader", "originalGroupInformationAndStatus", "transactionInformationAndStatus"})
public class PaymentStatusReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader5 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader5
	 * GroupHeader5}</li>
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
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatusReportV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInfAndSts", required = true)
	protected OriginalGroupInformation1 originalGroupInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation1
	 * OriginalGroupInformation1}</li>
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
	 * "Original group information concerning the group of transactions, to which the message refers to."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the message refers to.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatusReportV02.class.getMethod("getOriginalGroupInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransactionInformation1> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation1
	 * PaymentTransactionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transactions, to which the status report message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Information concerning the original transactions, to which the status report message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransactionInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentStatusReportV02.class.getMethod("getTransactionInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus1Rule.forPaymentStatusReportV02,
						com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus2Rule.forPaymentStatusReportV02, com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus3Rule.forPaymentStatusReportV02,
						com.tools20022.repository.constraints.ConstraintGroupAndTransactionStatus4Rule.forPaymentStatusReportV02, com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forPaymentStatusReportV02,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forPaymentStatusReportV02, com.tools20022.repository.constraints.ConstraintForwardingAgentRule.forPaymentStatusReportV02,
						com.tools20022.repository.constraints.ConstraintInitiatingPartyRule.forPaymentStatusReportV02, com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentStatusReportV02,
						com.tools20022.repository.constraints.ConstraintDebtorAgentRule.forPaymentStatusReportV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentStatusReportV02";
				definition = "Scope\r\nThe PaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe PaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe PaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (e.g. PaymentCancellationRequest).\r\nThe PaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe PaymentStatusReport message can be used in domestic and cross-border scenarios.\r\nThe PaymentStatusReport message exchanged between agents is identified in the schema as follows: \nurn:iso:std:iso:20022:tech:xsd:pacs.002.001.02\r";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pacs.002.001.02";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				xmlName = "pacs.002.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentStatusReportV02.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentStatusReportV02.mmOriginalGroupInformationAndStatus,
						com.tools20022.repository.area.pacs.PaymentStatusReportV02.mmTransactionInformationAndStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "002";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentStatusReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader5 getGroupHeader() {
		return groupHeader;
	}

	public PaymentStatusReportV02 setGroupHeader(GroupHeader5 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupInformation1 getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus;
	}

	public PaymentStatusReportV02 setOriginalGroupInformationAndStatus(OriginalGroupInformation1 originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = Objects.requireNonNull(originalGroupInformationAndStatus);
		return this;
	}

	public List<PaymentTransactionInformation1> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public PaymentStatusReportV02 setTransactionInformationAndStatus(List<PaymentTransactionInformation1> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.02")
	static public class Document {
		@XmlElement(name = "pacs.002.001.02", required = true)
		public PaymentStatusReportV02 messageBody;
	}
}