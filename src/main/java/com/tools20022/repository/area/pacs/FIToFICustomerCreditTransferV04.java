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
import com.tools20022.repository.msg.CreditTransferTransaction7;
import com.tools20022.repository.msg.GroupHeader49;
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
 * The FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message
 * is sent by the debtor agent to the creditor agent, directly or through other
 * agents and/or a payment clearing and settlement system. It is used to move
 * funds from a debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The FIToFICustomerCreditTransfer message is exchanged between agents and can
 * contain one or more customer credit transfer instructions.<br>
 * The FIToFICustomerCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction.<br>
 * The FIToFICustomerCreditTransfer message can be used in different ways:<br>
 * - If the instructing agent and the instructed agent wish to use their direct
 * account relationship in the currency of the transfer then the message
 * contains both the funds for the customer transfer(s) as well as the payment
 * details;<br>
 * - If the instructing agent and the instructed agent have no direct account
 * relationship in the currency of the transfer, or do not wish to use their
 * account relationship, then other (reimbursement) agents will be involved to
 * cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains
 * only the payment details and the instructing agent must cover the customer
 * transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement
 * agent. This payment method is called the Cover method;<br>
 * - If more than two financial institutions are involved in the payment chain
 * and if the FIToFICustomerCreditTransfer is sent from one financial
 * institution to the next financial institution in the payment chain, then the
 * payment method is called the Serial method.<br>
 * The FIToFICustomerCreditTransfer message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.008.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04#mmGroupHeader
 * FIToFICustomerCreditTransferV04.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04#mmCreditTransferTransactionInformation
 * FIToFICustomerCreditTransferV04.mmCreditTransferTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04#mmSupplementaryData
 * FIToFICustomerCreditTransferV04.mmSupplementaryData}</li>
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
 * xmlTag} = "FIToFICstmrCdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerCreditTransferV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintInstructedAgentRule.for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintInstructingAgentRule.for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintTotalInterbankSettlementAmountRule.
 * for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintTransactionInterbankSettlementDateRule.
 * for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerCreditTransferV04
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionsAndCreditTransfersRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintNumberOfTransactionsAndCreditTransfersRule.
 * for_pacs_FIToFICustomerCreditTransferV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FIToFICustomerCreditTransferV04
 * ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05
 * FIToFICustomerCreditTransferV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV03
 * FIToFICustomerCreditTransferV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FIToFICustomerCreditTransferV04", propOrder = {"groupHeader", "creditTransferTransactionInformation", "supplementaryData"})
public class FIToFICustomerCreditTransferV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader49 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader49
	 * GroupHeader49}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics shared by all individual transactions included in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmGroupHeader
	 * FIToFICustomerCreditTransferV05.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, GroupHeader49> mmGroupHeader = new MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, GroupHeader49>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV05.mmGroupHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader49.mmObject();
		}

		@Override
		public GroupHeader49 getValue(FIToFICustomerCreditTransferV04 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFICustomerCreditTransferV04 obj, GroupHeader49 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransaction7> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction7
	 * CreditTransferTransaction7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmCreditTransferTransactionInformation
	 * FIToFICustomerCreditTransferV05.mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, List<CreditTransferTransaction7>> mmCreditTransferTransactionInformation = new MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, List<CreditTransferTransaction7>>() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			nextVersions_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV05.mmCreditTransferTransactionInformation);
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction7.mmObject();
		}

		@Override
		public List<CreditTransferTransaction7> getValue(FIToFICustomerCreditTransferV04 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(FIToFICustomerCreditTransferV04 obj, List<CreditTransferTransaction7> value) {
			obj.setCreditTransferTransactionInformation(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV05#mmSupplementaryData
	 * FIToFICustomerCreditTransferV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FIToFICustomerCreditTransferV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FIToFICustomerCreditTransferV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FIToFICustomerCreditTransferV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintNumberOfTransactionsAndCreditTransfersRule.for_pacs_FIToFICustomerCreditTransferV04,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FIToFICustomerCreditTransferV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerCreditTransferV04";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerCreditTransfer message is sent by the debtor agent to the creditor agent, directly or through other agents and/or a payment clearing and settlement system. It is used to move funds from a debtor account to a creditor.\r\nUsage\r\nThe FIToFICustomerCreditTransfer message is exchanged between agents and can contain one or more customer credit transfer instructions.\r\nThe FIToFICustomerCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FIToFICustomerCreditTransfer message can be used in different ways:\r\n- If the instructing agent and the instructed agent wish to use their direct account relationship in the currency of the transfer then the message contains both the funds for the customer transfer(s) as well as the payment details;\r\n- If the instructing agent and the instructed agent have no direct account relationship in the currency of the transfer, or do not wish to use their account relationship, then other (reimbursement) agents will be involved to cover for the customer transfer(s). The FIToFICustomerCreditTransfer contains only the payment details and the instructing agent must cover the customer transfer by sending a FinancialInstitutionCreditTransfer to a reimbursement agent. This payment method is called the Cover method;\r\n- If more than two financial institutions are involved in the payment chain and if the FIToFICustomerCreditTransfer is sent from one financial institution to the next financial institution in the payment chain, then the payment method is called the Serial method.\r\nThe FIToFICustomerCreditTransfer message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFICustomerCreditTransferV05.mmObject());
				previousVersion_lazy = () -> FIToFICustomerCreditTransferV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFICstmrCdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04.mmCreditTransferTransactionInformation, com.tools20022.repository.area.pacs.FIToFICustomerCreditTransferV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "008";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerCreditTransferV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader49 getGroupHeader() {
		return groupHeader;
	}

	public FIToFICustomerCreditTransferV04 setGroupHeader(GroupHeader49 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransaction7> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FIToFICustomerCreditTransferV04 setCreditTransferTransactionInformation(List<CreditTransferTransaction7> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FIToFICustomerCreditTransferV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.04")
	static public class Document {
		@XmlElement(name = "FIToFICstmrCdtTrf", required = true)
		public FIToFICustomerCreditTransferV04 messageBody;
	}
}