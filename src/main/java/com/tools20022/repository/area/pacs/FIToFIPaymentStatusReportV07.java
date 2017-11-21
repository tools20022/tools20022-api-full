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
import com.tools20022.repository.area.PaymentsClearingandSettlementPreviousVersion;
import com.tools20022.repository.msg.GroupHeader53;
import com.tools20022.repository.msg.OriginalGroupHeader1;
import com.tools20022.repository.msg.PaymentTransaction63;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is
 * sent by an instructed agent to the previous party in the payment chain. It is
 * used to inform this party about the positive or negative status of an
 * instruction (either single or file). It is also used to report on a pending
 * instruction.<br>
 * <b>Usage</b><br>
 * The FIToFIPaymentStatusReport message is exchanged between agents to provide
 * status information about instructions previously sent. Its usage will always
 * be governed by a bilateral agreement between the agents.<br>
 * The FIToFIPaymentStatusReport message can be used to provide information
 * about the status (e.g. rejection, acceptance) of a credit transfer
 * instruction, a direct debit instruction, as well as other intra-agent
 * instructions (for example FIToFIPaymentCancellationRequest).<br>
 * The FIToFIPaymentStatusReport message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The FIToFIPaymentStatusReport message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementPreviousVersion
 * PaymentsClearingandSettlementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOPreviousversion
 * PaymentsClearingandSettlementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtStsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmGroupHeader
 * FIToFIPaymentStatusReportV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmTransactionInformationAndStatus
 * FIToFIPaymentStatusReportV07.mmTransactionInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmSupplementaryData
 * FIToFIPaymentStatusReportV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.002.001.07}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentStatusReportV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe FIToFIPaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusReport message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08
 * FIToFIPaymentStatusReportV08}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06
 * FIToFIPaymentStatusReportV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FIToFIPaymentStatusReportV07", propOrder = {"groupHeader", "originalGroupInformationAndStatus", "transactionInformationAndStatus", "supplementaryData"})
public class FIToFIPaymentStatusReportV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader53 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the status report message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader53
	 * GroupHeader53}</li>
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#mmGroupHeader
	 * FIToFIPaymentStatusReportV08.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmGroupHeader
	 * FIToFIPaymentStatusReportV06.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the status report message.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV08.mmGroupHeader);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV06.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader53.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusReportV07.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<OriginalGroupHeader1> originalGroupInformationAndStatus;
	/**
	 * Original group information concerning the group of transactions, to which
	 * the status report message refers to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#mmOriginalGroupInformationAndStatus
	 * FIToFIPaymentStatusReportV08.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmOriginalGroupInformationAndStatus
	 * FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformationAndStatus";
			definition = "Original group information concerning the group of transactions, to which the status report message refers to.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV08.mmOriginalGroupInformationAndStatus);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusReportV07.class.getMethod("getOriginalGroupInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PaymentTransaction63> transactionInformationAndStatus;
	/**
	 * Information concerning the original transactions, to which the status
	 * report message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction63
	 * PaymentTransaction63}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#mmTransactionInformationAndStatus
	 * FIToFIPaymentStatusReportV08.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmTransactionInformationAndStatus
	 * FIToFIPaymentStatusReportV06.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformationAndStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Information concerning the original transactions, to which the status report message refers.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV08.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV06.mmTransactionInformationAndStatus;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction63.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusReportV07.class.getMethod("getTransactionInformationAndStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV08#mmSupplementaryData
	 * FIToFIPaymentStatusReportV08.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmSupplementaryData
	 * FIToFIPaymentStatusReportV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV08.mmSupplementaryData);
			previousVersion_lazy = () -> FIToFIPaymentStatusReportV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFIPaymentStatusReportV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentStatusReportV07";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentStatusReport message is sent by an instructed agent to the previous party in the payment chain. It is used to inform this party about the positive or negative status of an instruction (either single or file). It is also used to report on a pending instruction.\r\nUsage\r\nThe FIToFIPaymentStatusReport message is exchanged between agents to provide status information about instructions previously sent. Its usage will always be governed by a bilateral agreement between the agents.\r\nThe FIToFIPaymentStatusReport message can be used to provide information about the status (e.g. rejection, acceptance) of a credit transfer instruction, a direct debit instruction, as well as other intra-agent instructions (for example FIToFIPaymentCancellationRequest).\r\nThe FIToFIPaymentStatusReport message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentStatusReport message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentStatusReportV08.mmObject());
				previousVersion_lazy = () -> FIToFIPaymentStatusReportV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtStsRpt";
				businessArea_lazy = () -> PaymentsClearingandSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus, com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07.mmTransactionInformationAndStatus,
						com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "002";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentStatusReportV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader53 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader53 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "OrgnlGrpInfAndSts")
	public List<OriginalGroupHeader1> getOriginalGroupInformationAndStatus() {
		return originalGroupInformationAndStatus;
	}

	public void setOriginalGroupInformationAndStatus(List<OriginalGroupHeader1> originalGroupInformationAndStatus) {
		this.originalGroupInformationAndStatus = originalGroupInformationAndStatus;
	}

	@XmlElement(name = "TxInfAndSts")
	public List<PaymentTransaction63> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus;
	}

	public void setTransactionInformationAndStatus(List<PaymentTransaction63> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = transactionInformationAndStatus;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.07.07")
	static public class Document {
		@XmlElement(name = "FIToFIPmtStsRpt", required = true)
		public FIToFIPaymentStatusReportV07 messageBody;
	}
}