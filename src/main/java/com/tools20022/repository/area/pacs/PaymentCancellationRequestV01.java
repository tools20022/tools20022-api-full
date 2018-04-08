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
import com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01;
import com.tools20022.repository.area.PaymentsClearingandSettlementArchive;
import com.tools20022.repository.msg.GroupHeader7;
import com.tools20022.repository.msg.OriginalGroupInformation4;
import com.tools20022.repository.msg.PaymentTransactionInformation3;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The PaymentCancellationRequest message is sent by the initiating party or any
 * agent, to the next party in the payment chain. It is used to request the
 * cancellation of an instruction previously sent.<br>
 * <b>Usage</b><br>
 * The PaymentCancellationRequest message is exchanged between agents to request
 * the cancellation of a payment message previously sent (i.e.
 * FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit, and
 * FinancialInstitutionCreditTransfer).<br>
 * The PaymentCancellationRequest message can be used to request the
 * cancellation of single instructions or multiple instructions, from one or
 * multiple files.<br>
 * The PaymentCancellationRequest message can be used in domestic and
 * cross-border scenarios.<br>
 * The PaymentCancellationRequest message refers to the original instruction(s)
 * by means of references only or by means of references and a set of elements
 * from the original instruction.<br>
 * The PaymentCancellationRequest message exchanged between agents is identified
 * in the schema as follows: urn: iso: std: iso: 20022: tech: xsd:
 * pacs.006.001.01 .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01#mmGroupHeader
 * PaymentCancellationRequestV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01#mmOriginalGroupInformation
 * PaymentCancellationRequestV01.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.PaymentCancellationRequestV01#mmTransactionInformation
 * PaymentCancellationRequestV01.mmTransactionInformation}</li>
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
 * xmlTag} = "pacs.006.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pacs.006.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.006.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAgentRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintInstructedAgentRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingAgentRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintInstructingAgentRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintForwardingAgentRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintForwardingAgentRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInitiatingPartyRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintInitiatingPartyRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintCreditorAgentRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDebtorAgentRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintDebtorAgentRule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellation1Rule#for_pacs_PaymentCancellationRequestV01
 * ConstraintGroupCancellation1Rule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellation2Rule#for_pacs_PaymentCancellationRequestV01
 * ConstraintGroupCancellation2Rule.for_pacs_PaymentCancellationRequestV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGroupCancellationAndTransactionInformationRule#for_pacs_PaymentCancellationRequestV01
 * ConstraintGroupCancellationAndTransactionInformationRule.
 * for_pacs_PaymentCancellationRequestV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe PaymentCancellationRequest message is sent by the initiating party or any agent, to the next party in the payment chain. It is used to request the cancellation of an instruction previously sent.\r\nUsage\r\nThe PaymentCancellationRequest message is exchanged between agents to request the cancellation of a payment message previously sent (i.e. FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit, and FinancialInstitutionCreditTransfer).\r\nThe PaymentCancellationRequest message can be used to request the cancellation of single instructions or multiple instructions, from one or multiple files.\r\nThe PaymentCancellationRequest message can be used in domestic and cross-border scenarios.\r\nThe PaymentCancellationRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe PaymentCancellationRequest message exchanged between agents is identified in the schema as follows: \nurn: iso: std: iso: 20022: tech: xsd: pacs.006.001.01\r."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FIToFIPaymentCancellationRequestV01
 * FIToFIPaymentCancellationRequestV01}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pacs.006.001.01", propOrder = {"groupHeader", "originalGroupInformation", "transactionInformation"})
public class PaymentCancellationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader7 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader7
	 * GroupHeader7}</li>
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
	public static final MMMessageBuildingBlock<PaymentCancellationRequestV01, GroupHeader7> mmGroupHeader = new MMMessageBuildingBlock<PaymentCancellationRequestV01, GroupHeader7>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader7.mmObject();
		}

		@Override
		public GroupHeader7 getValue(PaymentCancellationRequestV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(PaymentCancellationRequestV01 obj, GroupHeader7 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf", required = true)
	protected OriginalGroupInformation4 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation4
	 * OriginalGroupInformation4}</li>
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
	public static final MMMessageBuildingBlock<PaymentCancellationRequestV01, OriginalGroupInformation4> mmOriginalGroupInformation = new MMMessageBuildingBlock<PaymentCancellationRequestV01, OriginalGroupInformation4>() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OriginalGroupInformation4.mmObject();
		}

		@Override
		public OriginalGroupInformation4 getValue(PaymentCancellationRequestV01 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(PaymentCancellationRequestV01 obj, OriginalGroupInformation4 value) {
			obj.setOriginalGroupInformation(value);
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransactionInformation3> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation3
	 * PaymentTransactionInformation3}</li>
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
	 * "Information concerning the original transactions, to which the cancellation request message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<PaymentCancellationRequestV01, List<PaymentTransactionInformation3>> mmTransactionInformation = new MMMessageBuildingBlock<PaymentCancellationRequestV01, List<PaymentTransactionInformation3>>() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the cancellation request message refers.";
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransactionInformation3.mmObject();
		}

		@Override
		public List<PaymentTransactionInformation3> getValue(PaymentCancellationRequestV01 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(PaymentCancellationRequestV01 obj, List<PaymentTransactionInformation3> value) {
			obj.setTransactionInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAgentRule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintInstructingAgentRule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintForwardingAgentRule.for_pacs_PaymentCancellationRequestV01, com.tools20022.repository.constraints.ConstraintInitiatingPartyRule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintCreditorAgentRule.for_pacs_PaymentCancellationRequestV01, com.tools20022.repository.constraints.ConstraintDebtorAgentRule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintGroupCancellation1Rule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintGroupCancellation2Rule.for_pacs_PaymentCancellationRequestV01,
						com.tools20022.repository.constraints.ConstraintGroupCancellationAndTransactionInformationRule.for_pacs_PaymentCancellationRequestV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentCancellationRequestV01";
				definition = "Scope\r\nThe PaymentCancellationRequest message is sent by the initiating party or any agent, to the next party in the payment chain. It is used to request the cancellation of an instruction previously sent.\r\nUsage\r\nThe PaymentCancellationRequest message is exchanged between agents to request the cancellation of a payment message previously sent (i.e. FIToFICustomerCreditTransfer, FIToFICustomerDirectDebit, and FinancialInstitutionCreditTransfer).\r\nThe PaymentCancellationRequest message can be used to request the cancellation of single instructions or multiple instructions, from one or multiple files.\r\nThe PaymentCancellationRequest message can be used in domestic and cross-border scenarios.\r\nThe PaymentCancellationRequest message refers to the original instruction(s) by means of references only or by means of references and a set of elements from the original instruction.\r\nThe PaymentCancellationRequest message exchanged between agents is identified in the schema as follows: \nurn: iso: std: iso: 20022: tech: xsd: pacs.006.001.01\r.";
				nextVersions_lazy = () -> Arrays.asList(FIToFIPaymentCancellationRequestV01.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pacs.006.001.01";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				xmlName = "pacs.006.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.PaymentCancellationRequestV01.mmGroupHeader, com.tools20022.repository.area.pacs.PaymentCancellationRequestV01.mmOriginalGroupInformation,
						com.tools20022.repository.area.pacs.PaymentCancellationRequestV01.mmTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "006";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return PaymentCancellationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader7 getGroupHeader() {
		return groupHeader;
	}

	public PaymentCancellationRequestV01 setGroupHeader(GroupHeader7 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public OriginalGroupInformation4 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public PaymentCancellationRequestV01 setOriginalGroupInformation(OriginalGroupInformation4 originalGroupInformation) {
		this.originalGroupInformation = Objects.requireNonNull(originalGroupInformation);
		return this;
	}

	public List<PaymentTransactionInformation3> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public PaymentCancellationRequestV01 setTransactionInformation(List<PaymentTransactionInformation3> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.006.001.01")
	static public class Document {
		@XmlElement(name = "pacs.006.001.01", required = true)
		public PaymentCancellationRequestV01 messageBody;
	}
}