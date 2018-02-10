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
import com.tools20022.repository.msg.GroupHeader6;
import com.tools20022.repository.msg.OriginalGroupInformation2;
import com.tools20022.repository.msg.PaymentTransactionInformation2;
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
 * about a debit or a credit on their account(s) through an Advice of
 * Credit/Debit message and/or Statement message.<br>
 * The PaymentReturn message can be used to return single instructions or
 * multiple instructions from one or different files.<br>
 * The PaymentReturn message can be used in domestic and cross-border scenarios.<br>
 * The PaymentReturn message refers to the original instruction(s) by means of
 * references only or by means of references and a set of elements from the
 * original instruction. .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01#mmGroupHeader
 * PaymentReturnV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01#mmOriginalGroupInformation
 * PaymentReturnV01.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentReturnV01#mmTransactionInformation
 * PaymentReturnV01.mmTransactionInformation}</li>
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
 * xmlTag} = "pacs.004.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pacs.004.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.004.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationRule#forPaymentReturnV01
 * ConstraintGroupReturnAndTransactionInformationRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#forPaymentReturnV01
 * ConstraintInstructedAgentRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#forPaymentReturnV01
 * ConstraintInstructingAgentRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule#forPaymentReturnV01
 * ConstraintInterbankSettlementDateRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule#forPaymentReturnV01
 * ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule#forPaymentReturnV01
 * ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmount1Rule#forPaymentReturnV01
 * ConstraintTotalReturnedInterbankSettlementAmount1Rule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmount2Rule#forPaymentReturnV01
 * ConstraintTotalReturnedInterbankSettlementAmount2Rule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule#forPaymentReturnV01
 * ConstraintOriginalGroupInformationRule.forPaymentReturnV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethodRule#forPaymentReturnV01
 * ConstraintSettlementMethodRule.forPaymentReturnV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentReturnV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through an Advice of Credit/Debit message and/or Statement message.\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.pacs.PaymentReturnV02
 * PaymentReturnV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pacs.004.001.01", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation"})
public class PaymentReturnV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader6 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader6
	 * GroupHeader6}</li>
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
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV01.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation2 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation2
	 * OriginalGroupInformation2}</li>
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
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV01.class.getMethod("getOriginalGroupInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransactionInformation2> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2
	 * PaymentTransactionInformation2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the return message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransactionInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return PaymentReturnV01.class.getMethod("getTransactionInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGroupReturnAndTransactionInformationRule.forPaymentReturnV01,
						com.tools20022.repository.constraints.ConstraintInstructedAgentRule.forPaymentReturnV01, com.tools20022.repository.constraints.ConstraintInstructingAgentRule.forPaymentReturnV01,
						com.tools20022.repository.constraints.ConstraintInterbankSettlementDateRule.forPaymentReturnV01, com.tools20022.repository.constraints.ConstraintGroupReturnAndNumberOfTransactionsRule.forPaymentReturnV01,
						com.tools20022.repository.constraints.ConstraintGroupReturnAndReturnReasonRule.forPaymentReturnV01, com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmount1Rule.forPaymentReturnV01,
						com.tools20022.repository.constraints.ConstraintTotalReturnedInterbankSettlementAmount2Rule.forPaymentReturnV01, com.tools20022.repository.constraints.ConstraintOriginalGroupInformationRule.forPaymentReturnV01,
						com.tools20022.repository.constraints.ConstraintSettlementMethodRule.forPaymentReturnV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentReturnV01";
				definition = "Scope\r\nThe PaymentReturn message is sent by an agent to the previous agent in the payment chain to undo a payment previously settled.\r\nUsage\r\nThe PaymentReturn message is exchanged between agents to return funds after settlement of credit transfer instructions (i.e. FIToFICustomerCreditTransfer message and FinancialInstitutionCreditTransfer message) or direct debit instructions (FIToFICustomerDirectDebit message).\r\nThe PaymentReturn message should not be used between agents and non-financial institution customers. Non-financial institution customers will be informed about a debit or a credit on their account(s) through an Advice of Credit/Debit message and/or Statement message.\r\nThe PaymentReturn message can be used to return single instructions or multiple instructions from one or different files.\r\nThe PaymentReturn message can be used in domestic and cross-border scenarios.\r\nThe PaymentReturn message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r.";
				nextVersions_lazy = () -> Arrays.asList(PaymentReturnV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pacs.004.001.01";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				xmlName = "pacs.004.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentReturnV01.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentReturnV01.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.PaymentReturnV01.mmTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "004";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentReturnV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader6 getGroupHeader() {
		return groupHeader;
	}

	public PaymentReturnV01 setGroupHeader(GroupHeader6 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public Optional<OriginalGroupInformation2> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public PaymentReturnV01 setOriginalGroupInformation(OriginalGroupInformation2 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public List<PaymentTransactionInformation2> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public PaymentReturnV01 setTransactionInformation(List<PaymentTransactionInformation2> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.004.001.01")
	static public class Document {
		@XmlElement(name = "pacs.004.001.01", required = true)
		public PaymentReturnV01 messageBody;
	}
}