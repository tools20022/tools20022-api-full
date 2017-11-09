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
import com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion;
import com.tools20022.repository.msg.CreditTransferTransaction23;
import com.tools20022.repository.msg.GroupHeader70;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.009.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementLatestVersion
 * PaymentsClearingandSettlementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion
 * PaymentsClearingandSettlementISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FICdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05
 * FinancialInstitutionCreditTransferV05}</li>
 * </ul>
 */
public class FinancialInstitutionCreditTransferV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader70 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmGroupHeader
	 * FinancialInstitutionCreditTransferV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader70.mmObject();
		}
	};
	protected List<CreditTransferTransaction23> creditTransferTransactionInformation;
	/**
	 * Set of elements providing information specific to the individual credit
	 * transfer(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmCreditTransferTransactionInformation
	 * FinancialInstitutionCreditTransferV05.
	 * mmCreditTransferTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCreditTransferTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmCreditTransferTransactionInformation;
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransaction23.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV05#mmSupplementaryData
	 * FinancialInstitutionCreditTransferV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionCreditTransferV06";
				definition = "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.";
				previousVersion_lazy = () -> FinancialInstitutionCreditTransferV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOLatestversion.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FICdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV06.mmGroupHeader, FinancialInstitutionCreditTransferV06.mmCreditTransferTransactionInformation,
						FinancialInstitutionCreditTransferV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "009";
						version = "06";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader70 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader70 groupHeader) {
		this.groupHeader = groupHeader;
	}

	public List<CreditTransferTransaction23> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation;
	}

	public void setCreditTransferTransactionInformation(List<CreditTransferTransaction23> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = creditTransferTransactionInformation;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}