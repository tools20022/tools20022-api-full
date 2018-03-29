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
import com.tools20022.repository.msg.CreditTransferTransactionInformation3;
import com.tools20022.repository.msg.GroupHeader4;
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
 * cross-border scenarios.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01#mmGroupHeader
 * FinancialInstitutionCreditTransferV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01#mmCreditTransferTransactionInformation
 * FinancialInstitutionCreditTransferV01.mmCreditTransferTransactionInformation}
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
 * xmlTag} = "pacs.009.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pacs.009.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.009.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forFinancialInstitutionCreditTransferV01
 * ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forFinancialInstitutionCreditTransferV01
 * ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount1Rule#forFinancialInstitutionCreditTransferV01
 * ConstraintTotalInterbankSettlementAmount1Rule.
 * forFinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount2Rule#forFinancialInstitutionCreditTransferV01
 * ConstraintTotalInterbankSettlementAmount2Rule.
 * forFinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule#forFinancialInstitutionCreditTransferV01
 * ConstraintInterbankSettlementDateRule.
 * forFinancialInstitutionCreditTransferV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forFinancialInstitutionCreditTransferV01
 * ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV01
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstitutionCreditTransferV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV02
 * FinancialInstitutionCreditTransferV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pacs.009.001.01", propOrder = {"groupHeader", "creditTransferTransactionInformation"})
public class FinancialInstitutionCreditTransferV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader4 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader4
	 * GroupHeader4}</li>
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
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV01, GroupHeader4> mmGroupHeader = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV01, GroupHeader4>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader4.mmObject();
		}

		@Override
		public GroupHeader4 getValue(FinancialInstitutionCreditTransferV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV01 obj, GroupHeader4 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransactionInformation3> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation3
	 * CreditTransferTransactionInformation3}</li>
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
	public static final MMMessageBuildingBlock<FinancialInstitutionCreditTransferV01, List<CreditTransferTransactionInformation3>> mmCreditTransferTransactionInformation = new MMMessageBuildingBlock<FinancialInstitutionCreditTransferV01, List<CreditTransferTransactionInformation3>>() {
		{
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual credit transfer(s).";
			minOccurs = 1;
			complexType_lazy = () -> CreditTransferTransactionInformation3.mmObject();
		}

		@Override
		public List<CreditTransferTransactionInformation3> getValue(FinancialInstitutionCreditTransferV01 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(FinancialInstitutionCreditTransferV01 obj, List<CreditTransferTransactionInformation3> value) {
			obj.setCreditTransferTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forFinancialInstitutionCreditTransferV01,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forFinancialInstitutionCreditTransferV01,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount1Rule.forFinancialInstitutionCreditTransferV01,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount2Rule.forFinancialInstitutionCreditTransferV01,
						com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule.forFinancialInstitutionCreditTransferV01,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forFinancialInstitutionCreditTransferV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionCreditTransferV01";
				definition = "Scope\r\nThe FinancialInstitutionCreditTransfer message is sent by a debtor financial institution to a creditor financial institution, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to move funds from a debtor account to a creditor, where both debtor and creditor are financial institutions.\r\nUsage\r\nThe FinancialInstitutionCreditTransfer message is exchanged between agents and can contain one or more credit transfer instructions where debtor and creditor are both financial institutions.\r\nThe FinancialInstitutionCreditTransfer message does not allow for grouping: a CreditTransferTransactionInformation block must be present for each credit transfer transaction.\r\nThe FinancialInstitutionCreditTransfer message can be used in domestic and cross-border scenarios.\r\n";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionCreditTransferV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pacs.009.001.01";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				xmlName = "pacs.009.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01.mmGroupHeader,
						com.tools20022.repository.area.pacs.FinancialInstitutionCreditTransferV01.mmCreditTransferTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "009";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInstitutionCreditTransferV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader4 getGroupHeader() {
		return groupHeader;
	}

	public FinancialInstitutionCreditTransferV01 setGroupHeader(GroupHeader4 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CreditTransferTransactionInformation3> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public FinancialInstitutionCreditTransferV01 setCreditTransferTransactionInformation(List<CreditTransferTransactionInformation3> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.009.001.01")
	static public class Document {
		@XmlElement(name = "pacs.009.001.01", required = true)
		public FinancialInstitutionCreditTransferV01 messageBody;
	}
}