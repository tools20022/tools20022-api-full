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
import com.tools20022.repository.msg.GroupHeader55;
import com.tools20022.repository.msg.PaymentInstruction15;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustomerDirectDebitInitiation message is sent by the initiating party to
 * the forwarding agent or creditor agent. It is used to request single or bulk
 * collection(s) of funds from one or various debtor's account(s) for a
 * creditor.<br>
 * <b>Usage</b><br>
 * The CustomerDirectDebitInitiation message can contain one or more direct
 * debit instructions.<br>
 * The message can be used in a direct or a relay scenario:<br>
 * - In a direct scenario, the message is sent directly to the creditor agent.
 * The creditor agent is the account servicer of the creditor.<br>
 * - In a relay scenario, the message is sent to a forwarding agent. The
 * forwarding agent acts as a concentrating financial institution. It will
 * forward the CustomerDirectDebitInitiation message to the creditor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor. This caters for example for the
 * scenario of a payments factory initiating all payments on behalf of a large
 * corporate.<br>
 * The CustomerDirectDebitInitiation message can be used in domestic and
 * cross-border scenarios.<br>
 * The CustomerDirectDebitInitiation may or may not contain mandate related
 * information, i.e. extracts from a mandate, such as MandateIdentification or
 * DateOfSignature. The CustomerDirectDebitInitiation message must not be
 * considered as a mandate.<br>
 * The CustomerDirectDebitInitiation message must not be used by the creditor
 * agent to execute the direct debit instruction(s). The
 * FIToFICustomerDirectDebit message must be used instead.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmGroupHeader
 * CustomerDirectDebitInitiationV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmPaymentInformation
 * CustomerDirectDebitInitiationV05.mmPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmSupplementaryData
 * CustomerDirectDebitInitiationV05.mmSupplementaryData}</li>
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
 * xmlTag} = "CstmrDrctDbtInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.008.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSupplementaryDataRule#forCustomerDirectDebitInitiationV05
 * ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerDirectDebitInitiationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06
 * CustomerDirectDebitInitiationV06}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04
 * CustomerDirectDebitInitiationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerDirectDebitInitiationV05", propOrder = {"groupHeader", "paymentInformation", "supplementaryData"})
public class CustomerDirectDebitInitiationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected GroupHeader55 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader55
	 * GroupHeader55}</li>
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
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmGroupHeader
	 * CustomerDirectDebitInitiationV06.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04#mmGroupHeader
	 * CustomerDirectDebitInitiationV04.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV06.mmGroupHeader);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV04.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader55.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV05.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PmtInf", required = true)
	protected List<PaymentInstruction15> paymentInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmPaymentInformation
	 * CustomerDirectDebitInitiationV06.mmPaymentInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04#mmPaymentInformation
	 * CustomerDirectDebitInitiationV04.mmPaymentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV06.mmPaymentInformation);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV04.mmPaymentInformation;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstruction15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV05.class.getMethod("getPaymentInformation", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmSupplementaryData
	 * CustomerDirectDebitInitiationV06.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV04#mmSupplementaryData
	 * CustomerDirectDebitInitiationV04.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV06.mmSupplementaryData);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV05.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSupplementaryDataRule.forCustomerDirectDebitInitiationV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerDirectDebitInitiationV05";
				definition = "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.";
				nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV06.mmObject());
				previousVersion_lazy = () -> CustomerDirectDebitInitiationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrDrctDbtInitn";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05.mmGroupHeader, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05.mmPaymentInformation,
						com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "008";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerDirectDebitInitiationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public GroupHeader55 getGroupHeader() {
		return groupHeader;
	}

	public CustomerDirectDebitInitiationV05 setGroupHeader(GroupHeader55 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<PaymentInstruction15> getPaymentInformation() {
		return paymentInformation == null ? paymentInformation = new ArrayList<>() : paymentInformation;
	}

	public CustomerDirectDebitInitiationV05 setPaymentInformation(List<PaymentInstruction15> paymentInformation) {
		this.paymentInformation = Objects.requireNonNull(paymentInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CustomerDirectDebitInitiationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.001.05")
	static public class Document {
		@XmlElement(name = "CstmrDrctDbtInitn", required = true)
		public CustomerDirectDebitInitiationV05 messageBody;
	}
}