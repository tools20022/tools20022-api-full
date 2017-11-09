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
import com.tools20022.repository.msg.GroupHeader71;
import com.tools20022.repository.msg.OriginalGroupHeader3;
import com.tools20022.repository.msg.PaymentTransaction81;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementISOLatestversion;
import com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * The FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent
 * by an agent to the next party in the payment chain. It is used to reverse a
 * payment previously executed.<br>
 * <b>Usage</b><br>
 * The FIToFIPaymentReversal message is exchanged between agents to reverse a
 * payment message that has been settled. The result will be a credit on the
 * debtor account (when the reversed payment was a Direct Debit) or a debit on
 * the creditor account (when the reversed payment was a Credit Transfer).<br>
 * The FIToFIPaymentReversal message may or may not be the follow-up of a
 * payment message.<br>
 * The FIToFIPaymentReversal message refers to the original payment message by
 * means of references only or by means of references and a set of elements from
 * the original instruction.<br>
 * The FIToFIPaymentReversal message can be used in domestic and cross-border
 * scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.007.001.07}</li>
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
 * {@linkplain com.tools20022.repository.msgset.MX_Payment_Maintenance_2016_2017
 * MX_Payment_Maintenance_2016_2017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsClearingandSettlementMaintenance20162017
 * PaymentsClearingandSettlementMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFIPmtRvsl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmGroupHeader
 * FIToFIPaymentReversalV07.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmOriginalGroupInformation
 * FIToFIPaymentReversalV07.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmTransactionInformation
 * FIToFIPaymentReversalV07.mmTransactionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV07#mmSupplementaryData
 * FIToFIPaymentReversalV07.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFIPaymentReversalV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a payment message that has been settled. The result will be a credit on the debtor account (when the reversed payment was a Direct Debit) or a debit on the creditor account (when the reversed payment was a Credit Transfer).\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a payment message.\r\nThe FIToFIPaymentReversal message refers to the original payment message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06
 * FIToFIPaymentReversalV06}</li>
 * </ul>
 */
public class FIToFIPaymentReversalV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader71 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader71
	 * GroupHeader71}</li>
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06#mmGroupHeader
	 * FIToFIPaymentReversalV06.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			previousVersion_lazy = () -> FIToFIPaymentReversalV06.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader71.mmObject();
		}
	};
	protected OriginalGroupHeader3 originalGroupInformation;
	/**
	 * Information concerning the original group of transactions, to which the
	 * message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader3
	 * OriginalGroupHeader3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06#mmOriginalGroupInformation
	 * FIToFIPaymentReversalV06.mmOriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalGroupInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			previousVersion_lazy = () -> FIToFIPaymentReversalV06.mmOriginalGroupInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OriginalGroupHeader3.mmObject();
		}
	};
	protected List<PaymentTransaction81> transactionInformation;
	/**
	 * Information concerning the original transactions, to which the reversal
	 * message refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81
	 * PaymentTransaction81}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06#mmTransactionInformation
	 * FIToFIPaymentReversalV06.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the reversal message refers.";
			previousVersion_lazy = () -> FIToFIPaymentReversalV06.mmTransactionInformation;
			minOccurs = 0;
			complexType_lazy = () -> PaymentTransaction81.mmObject();
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
	 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentReversalV06#mmSupplementaryData
	 * FIToFIPaymentReversalV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> FIToFIPaymentReversalV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFIPaymentReversalV07";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionPaymentReversal message is sent by an agent to the next party in the payment chain. It is used to reverse a payment previously executed.\r\nUsage\r\nThe FIToFIPaymentReversal message is exchanged between agents to reverse a payment message that has been settled. The result will be a credit on the debtor account (when the reversed payment was a Direct Debit) or a debit on the creditor account (when the reversed payment was a Credit Transfer).\r\nThe FIToFIPaymentReversal message may or may not be the follow-up of a payment message.\r\nThe FIToFIPaymentReversal message refers to the original payment message by means of references only or by means of references and a set of elements from the original instruction.\r\nThe FIToFIPaymentReversal message can be used in domestic and cross-border scenarios.";
				previousVersion_lazy = () -> FIToFIPaymentReversalV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsClearingandSettlementISOLatestversion.mmObject(), MX_Payment_Maintenance_2016_2017.mmObject(), PaymentsClearingandSettlementMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFIPmtRvsl";
				businessArea_lazy = () -> PaymentsClearingandSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(FIToFIPaymentReversalV07.mmGroupHeader, FIToFIPaymentReversalV07.mmOriginalGroupInformation, FIToFIPaymentReversalV07.mmTransactionInformation,
						FIToFIPaymentReversalV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "007";
						version = "07";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader71 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader71 groupHeader) {
		this.groupHeader = groupHeader;
	}

	public OriginalGroupHeader3 getOriginalGroupInformation() {
		return originalGroupInformation;
	}

	public void setOriginalGroupInformation(OriginalGroupHeader3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
	}

	public List<PaymentTransaction81> getTransactionInformation() {
		return transactionInformation;
	}

	public void setTransactionInformation(List<PaymentTransaction81> transactionInformation) {
		this.transactionInformation = transactionInformation;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}