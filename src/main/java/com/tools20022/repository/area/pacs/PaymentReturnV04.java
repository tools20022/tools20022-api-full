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
import com.tools20022.repository.msg.GroupHeader54;
import com.tools20022.repository.msg.OriginalGroupHeader2;
import com.tools20022.repository.msg.PaymentTransaction44;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The PaymentReturn message is sent by an agent to the previous agent in the
 * payment chain to undo a payment previously settled.<br>
 * <b>Usage</b><br>
 * The PaymentReturn message is exchanged between agents to return funds after
 * settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer
 * message and FinancialInstitutionCreditTransfer message) or direct debit
 * instructions (FIToFICustomerDirectDebit message).<br>
 * The PaymentReturn message should not be used between agents and non-financial
 * institution customers. Non-financial institution customers will be informed
 * about a debit or a credit on their account(s) through a
 * BankToCustomerDebitCreditNotification message ('notification') and/or
 * BankToCustomerAccountReport/BankToCustomerStatement message ('statement').<br>
 * The PaymentReturn message can be used to return single instructions or
 * multiple instructions from one or different files.<br>
 * The PaymentReturn message can be used in domestic and cross-border scenarios.<br>
 * The PaymentReturn message refers to the original instruction(s) by means of
 * references only or by means of references and a set of elements from the
 * original instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04#mmGroupHeader
 * PaymentReturnV04.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04#mmOriginalGroupInformation
 * PaymentReturnV04.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04#mmTransactionInformation
 * PaymentReturnV04.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV04#mmSupplementaryData
 * PaymentReturnV04.mmSupplementaryData}</li>
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
 * xmlTag} = "PmtRtr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.004.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forPaymentReturnV04
 * ConstraintInstructedAgentRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forPaymentReturnV04
 * ConstraintInstructingAgentRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule#forPaymentReturnV04
 * ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule#forPaymentReturnV04
 * ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule#forPaymentReturnV04
 * ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule#forPaymentReturnV04
 * ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.
 * forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule#forPaymentReturnV04
 * ConstraintOriginalGroupInformationRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule#forPaymentReturnV04
 * ConstraintNoCoverSettlementMethodRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule#forPaymentReturnV04
 * ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule#forPaymentReturnV04
 * ConstraintTransactionInterbankSettlementDateRule.forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule#forPaymentReturnV04
 * ConstraintGroupReturnAndTransactionInformationNotPresentRule.
 * forPaymentReturnV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule#forPaymentReturnV04
 * ConstraintGroupReturnAndTransactionInformationPresentRule.forPaymentReturnV04
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forPaymentReturnV04
 * ConstraintSupplementaryDataRule.forPaymentReturnV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05
 * PaymentReturnV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV03
 * PaymentReturnV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentReturnV04", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation", "supplementaryData"})
public class PaymentReturnV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader54 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader54
	 * GroupHeader54}</li>
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
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05#mmGroupHeader
	 * PaymentReturnV05.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentReturnV05.mmGroupHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader54.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV04.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupHeader2 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader2
	 * OriginalGroupHeader2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05#mmOriginalGroupInformation
	 * PaymentReturnV05.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(PaymentReturnV05.mmOriginalGroupInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV04.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction44> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44
	 * PaymentTransaction44}</li>
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
	 * "Information concerning the original transactions, to which the return message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05#mmTransactionInformation
	 * PaymentReturnV05.mmTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the return message refers.";
			nextVersions_lazy = () -> Arrays.asList(PaymentReturnV05.mmTransactionInformation);
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction44.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV04.class.getMethod("getTransactionInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV05#mmSupplementaryData
	 * PaymentReturnV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(PaymentReturnV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forPaymentReturnV04, com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV04, com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmountAndSumRule.forPaymentReturnV04, com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintNoCoverSettlementMethodRule.forPaymentReturnV04, com.tools20022.repository.constraints.ConstraintGroupHeaderInterbankSettlementDateRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintTransactionInterbankSettlementDateRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationNotPresentRule.forPaymentReturnV04,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationPresentRule.forPaymentReturnV04, com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forPaymentReturnV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnV04";
				definition = "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through a BankToCustomerDebitCreditNotification message ('notification') and/or BankToCustomerAccountReport/BankToCustomerStatement message ('statement').\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.";
				nextVersions_lazy = () -> Arrays.asList(PaymentReturnV05.mmObject());
				previousVersion_lazy = () -> PaymentReturnV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "PmtRtr";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentReturnV04.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentReturnV04.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.PaymentReturnV04.mmTransactionInformation, com.tools20022.repository.area.pacs.PaymentReturnV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "004";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentReturnV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader54 getGroupHeader() {
		return groupHeader;
	}

	public PaymentReturnV04 setGroupHeader(GroupHeader54 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public Optional<OriginalGroupHeader2> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentReturnV04 setOriginalGroupInformation(OriginalGroupHeader2 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public List<PaymentTransaction44> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public PaymentReturnV04 setTransactionInformation(List<PaymentTransaction44> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public PaymentReturnV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.04")
	static public class Document {
		@XmlElement(name = "PmtRtr", required = true)
		public PaymentReturnV04 messageBody;
	}
}