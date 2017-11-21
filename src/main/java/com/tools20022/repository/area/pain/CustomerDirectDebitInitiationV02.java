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
import com.tools20022.repository.msg.GroupHeader39;
import com.tools20022.repository.msg.PaymentInstructionInformation4;
import com.tools20022.repository.msgset.ISOArchive;
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
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationArchive
 * PaymentsInitiationArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02#mmGroupHeader
 * CustomerDirectDebitInitiationV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02#mmPaymentInformation
 * CustomerDirectDebitInitiationV02.mmPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.008.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerDirectDebitInitiationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV03
 * CustomerDirectDebitInitiationV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV01
 * CustomerDirectDebitInitiationV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustomerDirectDebitInitiationV02", propOrder = {"groupHeader", "paymentInformation"})
public class CustomerDirectDebitInitiationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader39 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader39
	 * GroupHeader39}</li>
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
			complexType_lazy = () -> GroupHeader39.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<PaymentInstructionInformation4> paymentInformation;
	/**
	 * Set of characteristics that apply to the credit side of the payment
	 * transactions included in the direct debit transaction initiation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation4
	 * PaymentInstructionInformation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPaymentInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "PmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformation";
			definition = "Set of characteristics that apply to the credit side of the payment transactions included in the direct debit transaction initiation.";
			minOccurs = 1;
			complexType_lazy = () -> PaymentInstructionInformation4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustomerDirectDebitInitiationV02.class.getMethod("getPaymentInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerDirectDebitInitiationV02";
				definition = "Scope\r\nThe CustomerDirectDebitInitiation message is sent by the initiating party to the forwarding agent or creditor agent. It is used to request single or bulk collection(s) of funds from one or various debtor's account(s) for a creditor.\r\nUsage\r\nThe CustomerDirectDebitInitiation message can contain one or more direct debit instructions.\r\nThe message can be used in a direct or a relay scenario:\r\n- In a direct scenario, the message is sent directly to the creditor agent. The creditor agent is the account servicer of the creditor.\r\n- In a relay scenario, the message is sent to a forwarding agent. The forwarding agent acts as a concentrating financial institution. It will forward the CustomerDirectDebitInitiation message to the creditor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor. This caters for example for the scenario of a payments factory initiating all payments on behalf of a large corporate.\r\nThe CustomerDirectDebitInitiation message can be used in domestic and cross-border scenarios.\r\nThe CustomerDirectDebitInitiation may or may not contain mandate related information, i.e. extracts from a mandate, such as MandateIdentification or DateOfSignature. The CustomerDirectDebitInitiation message must not be considered as a mandate.\r\nThe CustomerDirectDebitInitiation message must not be used by the creditor agent to execute the direct debit instruction(s). The FIToFICustomerDirectDebit message must be used instead.";
				nextVersions_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV03.mmObject());
				previousVersion_lazy = () -> CustomerDirectDebitInitiationV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CstmrDrctDbtInitn";
				businessArea_lazy = () -> PaymentsInitiationArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02.mmGroupHeader, com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV02.mmPaymentInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustomerDirectDebitInitiationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader39 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader39 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "PmtInf", required = true)
	public List<PaymentInstructionInformation4> getPaymentInformation() {
		return paymentInformation;
	}

	public void setPaymentInformation(List<PaymentInstructionInformation4> paymentInformation) {
		this.paymentInformation = paymentInformation;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.02.02")
	static public class Document {
		@XmlElement(name = "CstmrDrctDbtInitn", required = true)
		public CustomerDirectDebitInitiationV02 messageBody;
	}
}