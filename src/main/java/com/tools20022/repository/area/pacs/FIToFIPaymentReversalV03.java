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
import com.tools20022.repository.msg.GroupHeader57;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.PaymentTransaction36;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent
 * by an agent to the next party in the payment chain. It is used to reverse a
 * payment previously executed.<br>
 * <b>Usage</b><br>
 * The FIToFIPaymentReversal message is exchanged between agents to reverse a
 * FIToFICustomerDirectDebit message that has been settled. The result will be a
 * credit on the debtor account.<br>
 * The FIToFIPaymentReversal message may or may not be the follow-up of a
 * CustomerDirectDebitInitiation message.<br>
 * The FIToFIPaymentReversal message refers to the original
 * FIToFICustomerDirectDebit message by means of references only or by means of
 * references and a set of elements from the original instruction.<br>
 * The FIToFIPaymentReversal message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03#mmGroupHeader
 * FIToFIPaymentReversalV03.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03#mmOriginalGroupInformation
 * FIToFIPaymentReversalV03.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03#mmTransactionInformation
 * FIToFIPaymentReversalV03.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03#mmSupplementaryData
 * FIToFIPaymentReversalV03.mmSupplementaryData}</li>
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
 * xmlTag} = "FIToFIPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.007.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintGroupReversalAndTransactionInformationNotPresentRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintGroupReversalAndTransactionInformationPresentRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintGroupReversalAndReasonRule.for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintInstructedAgentRule.for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintInstructingAgentRule.for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintTransactionInterbankSettlementDateRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintGroupReversalAndNumberOfTransactionsRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintTotalReversedInterbankSettlementAmountRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintTotalReversedInterbankSettlementAmountAndSumRule.
 * for_pacs_FIToFIPaymentReversalV03}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#for_pacs_FIToFIPaymentReversalV03
 * ConstraintNoCoverSettlementMethodRule.for_pacs_FIToFIPaymentReversalV03}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentReversalV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a FIToFICustomerDirectDebit message that has been settled. The result will be a credit on the debtor account.\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a CustomerDirectDebitInitiation message.\r\nThe FIToFIPaymentReversal message refers to the original FIToFICustomerDirectDebit message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV04
 * FIToFIPaymentReversalV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02
 * FIToFIPaymentReversalV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIPaymentReversalV03", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class FIToFIPaymentReversalV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader57 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader57
	 * GroupHeader57}</li>
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
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV03, GroupHeader57> mmGroupHeader = new MMMessageBuildingBlock<FIToFIPaymentReversalV03, GroupHeader57>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader57.mmObject();
		}

		@Override
		public GroupHeader57 getValue(FIToFIPaymentReversalV03 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV03 obj, GroupHeader57 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupHeader3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV03, OriginalGroupHeader3> mmOriginalGroupInformation = new MMMessageBuildingBlock<FIToFIPaymentReversalV03, OriginalGroupHeader3>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupHeader3.mmObject();
		}

		@Override
		public OriginalGroupHeader3 getValue(FIToFIPaymentReversalV03 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV03 obj, OriginalGroupHeader3 value) {
			obj.setOriginalGroupInformation(value);
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction36> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36
	 * PaymentTransaction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original transactions, to which the reversal message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV03, List<PaymentTransaction36>> mmTransactionInformation = new MMMessageBuildingBlock<FIToFIPaymentReversalV03, List<PaymentTransaction36>>() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the reversal message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction36.mmObject();
		}

		@Override
		public List<PaymentTransaction36> getValue(FIToFIPaymentReversalV03 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV03 obj, List<PaymentTransaction36> value) {
			obj.setTransactionInformation(value);
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
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FIToFIPaymentReversalV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FIToFIPaymentReversalV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.for_pacs_FIToFIPaymentReversalV03, com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule.for_pacs_FIToFIPaymentReversalV03,
						com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.for_pacs_FIToFIPaymentReversalV03);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentReversalV03";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a FIToFICustomerDirectDebit message that has been settled. The result will be a credit on the debtor account.\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a CustomerDirectDebitInitiation message.\r\nThe FIToFIPaymentReversal message refers to the original FIToFICustomerDirectDebit message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentReversalV04.mmObject());
				previousVersion_lazy = () -> FIToFIPaymentReversalV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtRvsl";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03.mmGroupHeader, com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03.mmTransactionInformation, com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "007";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentReversalV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader57 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIPaymentReversalV03 setGroupHeader(GroupHeader57 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public FIToFIPaymentReversalV03 setOriginalGroupInformation(OriginalGroupHeader3 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<PaymentTransaction36> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public FIToFIPaymentReversalV03 setTransactionInformation(List<PaymentTransaction36> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFIPaymentReversalV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.03")
	static public class Document {
		@XmlElement(name = "FIToFIPmtRvsl", required = true)
		public FIToFIPaymentReversalV03 messageBody;
	}
}