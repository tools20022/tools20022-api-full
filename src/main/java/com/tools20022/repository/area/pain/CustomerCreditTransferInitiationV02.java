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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationArchive;
import com.tools20022.repository.msg.GroupHeader1;
import com.tools20022.repository.msg.PaymentInstructionInformation1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerCreditTransferInitiation message is sent by the initiating party
 * to the forwarding agent or debtor agent. It is used to request movement of
 * funds from the debtor account to a creditor.<br>
 * <b>Usage</b><br>
 * The CustomerCreditTransferInitiation message can contain one or more customer
 * credit transfer instructions.<br>
 * The CustomerCreditTransferInitiation message is used to exchange:<br>
 * - One or more instances of a credit transfer initiation;<br>
 * - Payment transactions that result in book transfers at the debtor agent or
 * payments to another financial institution;<br>
 * - Payment transactions that result in an electronic cash transfer to the
 * creditor account or in the emission of a cheque.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the debtor agent. The
 * debtor agent is the account servicer of the debtor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerCreditTransferInitiation message to the debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the debtor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerCreditTransferInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerCreditTransferInitiation message must not be used by the debtor
 * agent to execute the credit transfer instruction(s). The
 * FIToFICustomerCreditTransfer message must be used instead.<br>
 * If it is agreed to include the payment information related to the debit side
 * only once (i.e. Grouped mode), the PaymentInformation block will be present
 * only once.<br>
 * If it is agreed to repeat the payment information related to the debit side
 * (i.e. Single mode), the PaymentInformation block must be present once per
 * occurrence of the CreditTransferTransactionInformation block.<br>
 * The CustomerCreditTransferInitiation message also allows for a Mixed mode
 * where the PaymentInformation block can be repeated and each
 * PaymentInformation block can contain one or several
 * CreditTransferTransactionInformation block(s). Single When grouping is set to
 * Single, information for each individual instruction is included separately.
 * This means the PaymentInformation block is repeated, and present for each
 * occurrence of the CreditTransferTransactionInformation block. Grouped When
 * grouping is set to Grouped, the PaymentInformation block will be present once
 * and the CreditTransferTransactionInformation block will be repeated. Mixed
 * When grouping is set to Mixed, the PaymentInformation block may be present
 * once or may be repeated. Each sequence of the PaymentInformation block may
 * contain one or several CreditTransferTransactionInformation block(s).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.001.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02#mmGroupHeader
 * CustomerCreditTransferInitiationV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02#mmPaymentInformation
 * CustomerCreditTransferInitiationV02.mmPaymentInformation}</li>
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
 * xmlTag} = "pain.001.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "pain.001.001.02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerCreditTransferInitiationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.\r\nUsage\r\nThe CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.\r\nThe CustomerCreditTransferInitiation message is used to exchange:\r\n- One or more instances of a credit transfer initiation;\r\n- Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;\r\n- Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead.\r\nIf it is agreed to include the payment information related to the debit side only once (i.e. Grouped mode), the PaymentInformation block will be present only once.\r\nIf it is agreed to repeat the payment information related to the debit side (i.e. Single mode), the PaymentInformation block must be present once per occurrence of the CreditTransferTransactionInformation block.\r\nThe CustomerCreditTransferInitiation message also allows for a Mixed mode where the PaymentInformation block can be repeated and each PaymentInformation block can contain one or several CreditTransferTransactionInformation block(s).\nSingle\nWhen grouping is set to Single, information for each individual instruction is included separately. This means the\nPaymentInformation block is repeated, and present for each occurrence of the CreditTransferTransactionInformation block.\nGrouped\nWhen grouping is set to Grouped, the PaymentInformation block will be present once and the CreditTransferTransactionInformation block will be repeated.\nMixed\nWhen grouping is set to Mixed, the PaymentInformation block may be present once or may be repeated. Each sequence\nof the PaymentInformation block may contain one or several CreditTransferTransactionInformation block(s)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrouping1Rule#for_pain_CustomerCreditTransferInitiationV02
 * ConstraintGrouping1Rule.for_pain_CustomerCreditTransferInitiationV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintGrouping2Rule#for_pain_CustomerCreditTransferInitiationV02
 * ConstraintGrouping2Rule.for_pain_CustomerCreditTransferInitiationV02}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV03
 * CustomerCreditTransferInitiationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "pain.001.001.02", propOrder = {"groupHeader", "paymentInformation"})
public class CustomerCreditTransferInitiationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader1 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader1
	 * GroupHeader1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerCreditTransferInitiationV02, GroupHeader1> mmGroupHeader = new MMMessageBuildingBlock<CustomerCreditTransferInitiationV02, GroupHeader1>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader1.mmObject();
		}

		@Override
		public GroupHeader1 getValue(CustomerCreditTransferInitiationV02 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CustomerCreditTransferInitiationV02 obj, GroupHeader1 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "PmtInf", required = true)
	protected List<PaymentInstructionInformation1> paymentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that applies to the debit side of the payment transactions included in the credit transfer initiation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustomerCreditTransferInitiationV02, List<PaymentInstructionInformation1>> mmPaymentInformation = new MMMessageBuildingBlock<CustomerCreditTransferInitiationV02, List<PaymentInstructionInformation1>>() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that applies to the debit side of the payment transactions included in the credit transfer initiation.";
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionInformation1.mmObject();
		}

		@Override
		public List<PaymentInstructionInformation1> getValue(CustomerCreditTransferInitiationV02 obj) {
			return obj.getPaymentInformation();
		}

		@Override
		public void setValue(CustomerCreditTransferInitiationV02 obj, List<PaymentInstructionInformation1> value) {
			obj.setPaymentInformation(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintGrouping1Rule.for_pain_CustomerCreditTransferInitiationV02,
						com.tools20022.repository.constraints.ConstraintGrouping2Rule.for_pain_CustomerCreditTransferInitiationV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerCreditTransferInitiationV02";
				definition = "Scope\r\nThe CustomerCreditTransferInitiation message is sent by the initiating party to the forwarding agent or debtor agent. It is used to request movement of funds from the debtor account to a creditor.\r\nUsage\r\nThe CustomerCreditTransferInitiation message can contain one or more customer credit transfer instructions.\r\nThe CustomerCreditTransferInitiation message is used to exchange:\r\n- One or more instances of a credit transfer initiation;\r\n- Payment transactions that result in book transfers at the debtor agent or payments to another financial institution;\r\n- Payment transactions that result in an electronic cash transfer to the creditor account or in the emission of a cheque.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the debtor agent. The debtor agent is the account servicer of the debtor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerCreditTransferInitiation message to the debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the debtor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerCreditTransferInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerCreditTransferInitiation message must not be used by the debtor agent to execute the credit transfer instruction(s). The FIToFICustomerCreditTransfer message must be used instead.\r\nIf it is agreed to include the payment information related to the debit side only once (i.e. Grouped mode), the PaymentInformation block will be present only once.\r\nIf it is agreed to repeat the payment information related to the debit side (i.e. Single mode), the PaymentInformation block must be present once per occurrence of the CreditTransferTransactionInformation block.\r\nThe CustomerCreditTransferInitiation message also allows for a Mixed mode where the PaymentInformation block can be repeated and each PaymentInformation block can contain one or several CreditTransferTransactionInformation block(s).\nSingle\nWhen grouping is set to Single, information for each individual instruction is included separately. This means the\nPaymentInformation block is repeated, and present for each occurrence of the CreditTransferTransactionInformation block.\nGrouped\nWhen grouping is set to Grouped, the PaymentInformation block will be present once and the CreditTransferTransactionInformation block will be repeated.\nMixed\nWhen grouping is set to Mixed, the PaymentInformation block may be present once or may be repeated. Each sequence\nof the PaymentInformation block may contain one or several CreditTransferTransactionInformation block(s).";
				nextVersions_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "pain.001.001.02";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				xmlName = "pain.001.001.02";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02.mmGroupHeader,
						com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02.mmPaymentInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "001";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerCreditTransferInitiationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader1 getGroupHeader() {
		return groupHeader;
	}

	public CustomerCreditTransferInitiationV02 setGroupHeader(GroupHeader1 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<PaymentInstructionInformation1> getPaymentInformation() {
		return paymentInformation == null ? paymentInformation = new ArrayList<>() : paymentInformation;
	}

	public CustomerCreditTransferInitiationV02 setPaymentInformation(List<PaymentInstructionInformation1> paymentInformation) {
		this.paymentInformation = Objects.requireNonNull(paymentInformation);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.02")
	static public class Document {
		@XmlElement(name = "pain.001.001.02", required = true)
		public CustomerCreditTransferInitiationV02 messageBody;
	}
}