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
import com.tools20022.repository.msg.CreditTransferTransaction23;
import com.tools20022.repository.msg.GroupHeader70;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOPreviousversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionCreditTransfer message is sent by a debtor financial
 * institution to a creditor financial institution, directly or through other
 * agents and/or a payment clearing and settlement system.<br>
 * It is used to move funds from a debtor account to a creditor, where both
 * debtor and creditor are financial institutions.<br>
 * <b>Usage</b><br>
 * The FinancialInstitutionCreditTransfer message is exchanged between agents
 * and can contain one or more credit transfer instructions where debtor and
 * creditor are both financial institutions.<br>
 * The FinancialInstitutionCreditTransfer message does not allow for grouping: a
 * CreditTransferTransactionInformation block must be present for each credit
 * transfer transaction.<br>
 * The FinancialInstitutionCreditTransfer message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmGroupHeader
 * FinancialInstitutionCreditTransferV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmCreditTransferTransactionInformation
 * FinancialInstitutionCreditTransferV06.mmCreditTransferTransactionInformation}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06#mmSupplementaryData
 * FinancialInstitutionCreditTransferV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOPreviousversion
 * PaymentsClearingandSettlementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FICdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementPreviousVersion
 * PaymentsClearingandSettlementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.009.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintInstructedAgentRule.for_pacs_FinancialInstitutionCreditTransferV06}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintInstructingAgentRule.for_pacs_FinancialInstitutionCreditTransferV06
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintTransactionInterbankSettlementDateRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintPaymentTypeInformationRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#for_pacs_FinancialInstitutionCreditTransferV06
 * ConstraintSupplementaryDataRule.
 * for_pacs_FinancialInstitutionCreditTransferV06}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitutionCreditTransferV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07
 * FinancialInstitutionCreditTransferV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05
 * FinancialInstitutionCreditTransferV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionCreditTransferV06", propOrder = {"groupHeader", "creditTransferTransactionInformation", "supplementaryData"})
public class FinancialInstitutionCreditTransferV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader70 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader70
	 * GroupHeader70}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07#mmGroupHeader
	 * FinancialInstitutionCreditTransferV07.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmGroupHeader
	 * FinancialInstitutionCreditTransferV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, GroupHeader70> mmGroupHeader = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, GroupHeader70>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV07.mmGroupHeader);
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader70.mmObject();
		}

		@Override
		public GroupHeader70 getValue(FinancialInstitutionCreditTransferV06 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV06 obj, GroupHeader70 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransaction23> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction23
	 * CreditTransferTransaction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual credit transfer(s)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07#mmCreditTransferTransactionInformation
	 * FinancialInstitutionCreditTransferV07.
	 * mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmCreditTransferTransactionInformation
	 * FinancialInstitutionCreditTransferV05.
	 * mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, List<CreditTransferTransaction23>> mmCreditTransferTransactionInformation = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, List<CreditTransferTransaction23>>() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV07.mmCreditTransferTransactionInformation);
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmCreditTransferTransactionInformation;
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction23.mmObject();
		}

		@Override
		public List<CreditTransferTransaction23> getValue(FinancialInstitutionCreditTransferV06 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV06 obj, List<CreditTransferTransaction23> value) {
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
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV07#mmSupplementaryData
	 * FinancialInstitutionCreditTransferV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmSupplementaryData
	 * FinancialInstitutionCreditTransferV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV06, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV07.mmSupplementaryData);
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(FinancialInstitutionCreditTransferV06 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV06 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.for_pacs_FinancialInstitutionCreditTransferV06,
						com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.for_pacs_FinancialInstitutionCreditTransferV06);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionCreditTransferV06";
				definition = "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV07.mmObject());
				previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOPreviousversion.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FICdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmGroupHeader,
						com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmCreditTransferTransactionInformation, com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "009";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitutionCreditTransferV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader70 getGroupHeader() {
		return groupHeader;
	}

	public FinancialInstitutionCreditTransferV06 setGroupHeader(GroupHeader70 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransaction23> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FinancialInstitutionCreditTransferV06 setCreditTransferTransactionInformation(List<CreditTransferTransaction23> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public FinancialInstitutionCreditTransferV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.06")
	static public class Document {
		@XmlElement(name = "FICdtTrf", required = true)
		public FinancialInstitutionCreditTransferV06 messageBody;
	}
}