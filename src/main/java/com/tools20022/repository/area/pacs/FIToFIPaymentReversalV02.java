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
import com.tools20022.repository.msg.GroupHeader41;
import com.tools20022.repository.msg.OriginalGroupInformation22;
import com.tools20022.repository.msg.PaymentTransactionInformation29;
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
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02#mmGroupHeader
 * FIToFIPaymentReversalV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02#mmOriginalGroupInformation
 * FIToFIPaymentReversalV02.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02#mmTransactionInformation
 * FIToFIPaymentReversalV02.mmTransactionInformation}</li>
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
 * messageDefinitionIdentifier} = {@code pacs.007.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule#forFIToFIPaymentReversalV02
 * ConstraintGroupReversalAndTransactionInformationNotPresentRule.
 * forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule#forFIToFIPaymentReversalV02
 * ConstraintGroupReversalAndTransactionInformationPresentRule.
 * forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule#forFIToFIPaymentReversalV02
 * ConstraintGroupReversalAndReasonRule.forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFIToFIPaymentReversalV02
 * ConstraintInstructedAgentRule.forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFIToFIPaymentReversalV02
 * ConstraintInstructingAgentRule.forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFIToFIPaymentReversalV02
 * ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV02}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forFIToFIPaymentReversalV02
 * ConstraintTransactionInterbankSettlementDateRule.forFIToFIPaymentReversalV02}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule#forFIToFIPaymentReversalV02
 * ConstraintGroupReversalAndNumberOfTransactionsRule.
 * forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule#forFIToFIPaymentReversalV02
 * ConstraintTotalReversedInterbankSettlementAmountRule.
 * forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule#forFIToFIPaymentReversalV02
 * ConstraintTotalReversedInterbankSettlementAmountAndSumRule.
 * forFIToFIPaymentReversalV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forFIToFIPaymentReversalV02
 * ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentReversalV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a FIToFICustomerDirectDebit message that has been settled. The result will be a credit on the debtor account.\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a CustomerDirectDebitInitiation message.\r\nThe FIToFIPaymentReversal message refers to the original FIToFICustomerDirectDebit message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV03
 * FIToFIPaymentReversalV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV01
 * FIToFIPaymentReversalV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFIPaymentReversalV02", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation"})
public class FIToFIPaymentReversalV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader41 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader41
	 * GroupHeader41}</li>
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
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV02, GroupHeader41> mmGroupHeader = new MMMessageBuildingBlock<FIToFIPaymentReversalV02, GroupHeader41>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader41.mmObject();
		}

		@Override
		public GroupHeader41 getValue(FIToFIPaymentReversalV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV02 obj, GroupHeader41 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupInformation22 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation22
	 * OriginalGroupInformation22}</li>
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
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV02, OriginalGroupInformation22> mmOriginalGroupInformation = new MMMessageBuildingBlock<FIToFIPaymentReversalV02, OriginalGroupInformation22>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupInformation22.mmObject();
		}

		@Override
		public OriginalGroupInformation22 getValue(FIToFIPaymentReversalV02 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV02 obj, OriginalGroupInformation22 value) {
			obj.setOriginalGroupInformation(value);
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransactionInformation29> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29
	 * PaymentTransactionInformation29}</li>
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
	public static final MMMessageBuildingBlock<FIToFIPaymentReversalV02, List<PaymentTransactionInformation29>> mmTransactionInformation = new MMMessageBuildingBlock<FIToFIPaymentReversalV02, List<PaymentTransactionInformation29>>() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the reversal message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransactionInformation29.mmObject();
		}

		@Override
		public List<PaymentTransactionInformation29> getValue(FIToFIPaymentReversalV02 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(FIToFIPaymentReversalV02 obj, List<PaymentTransactionInformation29> value) {
			obj.setTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationNotPresentRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndTransactionInformationPresentRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndReasonRule.forFIToFIPaymentReversalV02, com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFIToFIPaymentReversalV02, com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintGroupReversalAndNumberOfTransactionsRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintTotalReversedInterbankSettlementAmountAndSumRule.forFIToFIPaymentReversalV02,
						com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forFIToFIPaymentReversalV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentReversalV02";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a FIToFICustomerDirectDebit message that has been settled. The result will be a credit on the debtor account.\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a CustomerDirectDebitInitiation message.\r\nThe FIToFIPaymentReversal message refers to the original FIToFICustomerDirectDebit message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentReversalV03.mmObject());
				previousVersion_lazy = () -> FIToFIPaymentReversalV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtRvsl";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02.mmGroupHeader, com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.FIToFIPaymentReversalV02.mmTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "007";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFIPaymentReversalV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader41 getGroupHeader() {
		return groupHeader;
	}

	public FIToFIPaymentReversalV02 setGroupHeader(GroupHeader41 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupInformation22 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public FIToFIPaymentReversalV02 setOriginalGroupInformation(OriginalGroupInformation22 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<PaymentTransactionInformation29> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public FIToFIPaymentReversalV02 setTransactionInformation(List<PaymentTransactionInformation29> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.007.001.02")
	static public class Document {
		@XmlElement(name = "FIToFIPmtRvsl", required = true)
		public FIToFIPaymentReversalV02 messageBody;
	}
}