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
import com.tools20022.repository.msg.DirectDebitTransactionInformation2;
import com.tools20022.repository.msg.GroupHeader3;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is
 * sent by the creditor agent to the debtor agent, directly or through other
 * agents and/or a payment clearing and settlement system.<br>
 * It is used to collect funds from a debtor account for a creditor.<br>
 * <b>Usage</b><br>
 * The FItoFICustomerDirectDebit message can contain one or more customer direct
 * debit instructions.<br>
 * The FIToFICustomerDirectDebit message does not allow for grouping: the
 * PaymentInformation block must be present once per occurrence of a
 * DirectDebitTransactionInformation block.<br>
 * The FItoFICustomerDirectDebit message may or may not contain mandate related
 * information, i.e. extracts from a mandate, such as the MandateIdentification
 * or DateOfSignature. The FIToFICustomerDirectDebit message must not be
 * considered as a mandate.<br>
 * The FItoFICustomerDirectDebit message can be used in domestic and
 * cross-border scenarios.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01#mmGroupHeader
 * FIToFICustomerDirectDebitV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01#mmDirectDebitTransactionInformation
 * FIToFICustomerDirectDebitV01.mmDirectDebitTransactionInformation}</li>
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
 * xmlTag} = "pacs.003.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pacs.003.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.003.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintInstructedAgentRule.for_pacs_FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintInstructingAgentRule.for_pacs_FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount1Rule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintTotalInterbankSettlementAmount1Rule.
 * for_pacs_FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount2Rule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintTotalInterbankSettlementAmount2Rule.
 * for_pacs_FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintInterbankSettlementDateRule.for_pacs_FIToFICustomerDirectDebitV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#for_pacs_FIToFICustomerDirectDebitV01
 * ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerDirectDebitV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerDirectDebitV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping: the PaymentInformation block must be present once per occurrence of a DirectDebitTransactionInformation block.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios.\r\n"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02
 * FIToFICustomerDirectDebitV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pacs.003.001.01", propOrder = {"groupHeader", "directDebitTransactionInformation"})
public class FIToFICustomerDirectDebitV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader3 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader3
	 * GroupHeader3}</li>
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
	public static final MMMessageBuildingBlock<FIToFICustomerDirectDebitV01, GroupHeader3> mmGroupHeader = new MMMessageBuildingBlock<FIToFICustomerDirectDebitV01, GroupHeader3>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader3.mmObject();
		}

		@Override
		public GroupHeader3 getValue(FIToFICustomerDirectDebitV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(FIToFICustomerDirectDebitV01 obj, GroupHeader3 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "DrctDbtTxInf", required = true)
	protected List<DirectDebitTransactionInformation2> directDebitTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2
	 * DirectDebitTransactionInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual direct debit(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FIToFICustomerDirectDebitV01, List<DirectDebitTransactionInformation2>> mmDirectDebitTransactionInformation = new MMMessageBuildingBlock<FIToFICustomerDirectDebitV01, List<DirectDebitTransactionInformation2>>() {
		{
			xmlTag = "DrctDbtTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransactionInformation";
			definition = "Set of elements providing information specific to the individual direct debit(s).";
			minOccurs = 1;
			complexType_lazy = () -> DirectDebitTransactionInformation2.mmObject();
		}

		@Override
		public List<DirectDebitTransactionInformation2> getValue(FIToFICustomerDirectDebitV01 obj) {
			return obj.getDirectDebitTransactionInformation();
		}

		@Override
		public void setValue(FIToFICustomerDirectDebitV01 obj, List<DirectDebitTransactionInformation2> value) {
			obj.setDirectDebitTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_FIToFICustomerDirectDebitV01,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_FIToFICustomerDirectDebitV01,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount1Rule.for_pacs_FIToFICustomerDirectDebitV01,
						com.tools20022.repository.constraints.ConstraintTotalInterbankSettlementAmount2Rule.for_pacs_FIToFICustomerDirectDebitV01,
						com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule.for_pacs_FIToFICustomerDirectDebitV01,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.for_pacs_FIToFICustomerDirectDebitV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerDirectDebitV01";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping: the PaymentInformation block must be present once per occurrence of a DirectDebitTransactionInformation block.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios.\r\n";
				nextVersions_lazy = () -> Arrays.asList(FIToFICustomerDirectDebitV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pacs.003.001.01";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				xmlName = "pacs.003.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01.mmDirectDebitTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "003";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerDirectDebitV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader3 getGroupHeader() {
		return groupHeader;
	}

	public FIToFICustomerDirectDebitV01 setGroupHeader(GroupHeader3 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<DirectDebitTransactionInformation2> getDirectDebitTransactionInformation() {
		return directDebitTransactionInformation == null ? directDebitTransactionInformation = new ArrayList<>() : directDebitTransactionInformation;
	}

	public FIToFICustomerDirectDebitV01 setDirectDebitTransactionInformation(List<DirectDebitTransactionInformation2> directDebitTransactionInformation) {
		this.directDebitTransactionInformation = Objects.requireNonNull(directDebitTransactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.01")
	static public class Document {
		@XmlElement(name = "pacs.003.001.01", required = true)
		public FIToFICustomerDirectDebitV01 messageBody;
	}
}