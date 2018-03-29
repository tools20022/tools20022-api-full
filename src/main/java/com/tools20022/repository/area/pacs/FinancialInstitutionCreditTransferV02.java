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
import com.tools20022.repository.msg.CreditTransferTransactionInformation13;
import com.tools20022.repository.msg.GroupHeader35;
import com.tools20022.repository.msgset.ISOArchive;
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
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02#mmGroupHeader
 * FinancialInstitutionCreditTransferV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02#mmCreditTransferTransactionInformation
 * FinancialInstitutionCreditTransferV02.mmCreditTransferTransactionInformation}
 * </li>
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
 * xmlTag} = "FinInstnCdtTrf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.009.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFinancialInstitutionCreditTransferV02
 * ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFinancialInstitutionCreditTransferV02
 * ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule#forFinancialInstitutionCreditTransferV02
 * ConstraintTotalInterbankSettlementAmountRule.
 * forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule#forFinancialInstitutionCreditTransferV02
 * ConstraintTotalInterbankSettlementAmountAndSumRule.
 * forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV02
 * ConstraintGroupHeaderInterbankSettlementDateRule.
 * forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV02
 * ConstraintTransactionInterbankSettlementDateRule.
 * forFinancialInstitutionCreditTransferV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forFinancialInstitutionCreditTransferV02
 * ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV02
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitutionCreditTransferV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV03
 * FinancialInstitutionCreditTransferV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01
 * FinancialInstitutionCreditTransferV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionCreditTransferV02", propOrder = {"groupHeader", "creditTransferTransactionInformation"})
public class FinancialInstitutionCreditTransferV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader35 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader35
	 * GroupHeader35}</li>
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
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV02, GroupHeader35> mmGroupHeader = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV02, GroupHeader35>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader35.mmObject();
		}

		@Override
		public GroupHeader35 getValue(FinancialInstitutionCreditTransferV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV02 obj, GroupHeader35 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransactionInformation13> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation13
	 * CreditTransferTransactionInformation13}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV02, List<CreditTransferTransactionInformation13>> mmCreditTransferTransactionInformation = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV02, List<CreditTransferTransactionInformation13>>() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransactionInformation13.mmObject();
		}

		@Override
		public List<CreditTransferTransactionInformation13> getValue(FinancialInstitutionCreditTransferV02 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV02 obj, List<CreditTransferTransactionInformation13> value) {
			obj.setCreditTransferTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmountAndSumRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV02,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionCreditTransferV02";
				definition = "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV03.mmObject());
				previousVersion_lazy = () -> FinancialInstitutionCreditTransferV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FinInstnCdtTrf";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02.mmGroupHeader,
						com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02.mmCreditTransferTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "009";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitutionCreditTransferV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader35 getGroupHeader() {
		return groupHeader;
	}

	public FinancialInstitutionCreditTransferV02 setGroupHeader(GroupHeader35 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransactionInformation13> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FinancialInstitutionCreditTransferV02 setCreditTransferTransactionInformation(List<CreditTransferTransactionInformation13> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.02")
	static public class Document {
		@XmlElement(name = "FinInstnCdtTrf", required = true)
		public FinancialInstitutionCreditTransferV02 messageBody;
	}
}