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
import com.tools20022.repository.area.PaymentsInitiationPreviousVersion;
import com.tools20022.repository.msg.GroupHeader55;
import com.tools20022.repository.msg.PaymentInstruction18;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.PaymentsInitiationISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationPreviousVersion
 * PaymentsInitiationPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PaymentsInitiationISOPreviousversion
 * PaymentsInitiationISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CstmrDrctDbtInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmGroupHeader
 * CustomerDirectDebitInitiationV06.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmPaymentInformation
 * CustomerDirectDebitInitiationV06.mmPaymentInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06#mmSupplementaryData
 * CustomerDirectDebitInitiationV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.008.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerDirectDebitInitiationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07
 * CustomerDirectDebitInitiationV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05
 * CustomerDirectDebitInitiationV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustomerDirectDebitInitiationV06", propOrder = {"groupHeader", "paymentInformation", "supplementaryData"})
public class CustomerDirectDebitInitiationV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader55 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#mmGroupHeader
	 * CustomerDirectDebitInitiationV07.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmGroupHeader
	 * CustomerDirectDebitInitiationV05.mmGroupHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics shared by all individual transactions included in the message.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV07.mmGroupHeader);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV05.mmGroupHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader55.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV06.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PaymentInstruction18> paymentInformation;
	/**
	 * Set of characteristics that apply to the credit side of the payment
	 * transactions included in the direct debit transaction initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18
	 * PaymentInstruction18}</li>
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
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#mmPaymentInformation
	 * CustomerDirectDebitInitiationV07.mmPaymentInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmPaymentInformation
	 * CustomerDirectDebitInitiationV05.mmPaymentInformation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV07.mmPaymentInformation);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV05.mmPaymentInformation;
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstruction18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV06.class.getMethod("getPaymentInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV07#mmSupplementaryData
	 * CustomerDirectDebitInitiationV07.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmSupplementaryData
	 * CustomerDirectDebitInitiationV05.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV07.mmSupplementaryData);
			previousVersion_lazy = () -> CustomerDirectDebitInitiationV05.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerDirectDebitInitiationV06";
				definition = "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.";
				nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV07.mmObject());
				previousVersion_lazy = () -> CustomerDirectDebitInitiationV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(PaymentsInitiationISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrDrctDbtInitn";
				businessArea_lazy = () -> PaymentsInitiationPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06.mmGroupHeader, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06.mmPaymentInformation,
						com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "008";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerDirectDebitInitiationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader55 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader55 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "PmtInf", required = true)
	public List<PaymentInstruction18> getPaymentInformation() {
		return paymentInformation;
	}

	public void setPaymentInformation(List<PaymentInstruction18> paymentInformation) {
		this.paymentInformation = paymentInformation;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.06.06")
	static public class Document {
		@XmlElement(name = "CstmrDrctDbtInitn", required = true)
		public CustomerDirectDebitInitiationV06 messageBody;
	}
}