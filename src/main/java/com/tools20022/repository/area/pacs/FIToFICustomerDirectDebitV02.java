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
import com.tools20022.repository.msg.DirectDebitTransactionInformation10;
import com.tools20022.repository.msg.GroupHeader34;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsClearingandSettlementArchive
 * PaymentsClearingandSettlementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FIToFICstmrDrctDbt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02#mmGroupHeader
 * FIToFICustomerDirectDebitV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02#mmDirectDebitTransactionInformation
 * FIToFICustomerDirectDebitV02.mmDirectDebitTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pacs.003.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FIToFICustomerDirectDebitV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping: the PaymentInformation block must be present once per occurrence of a DirectDebitTransactionInformation block.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV03
 * FIToFICustomerDirectDebitV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV01
 * FIToFICustomerDirectDebitV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FIToFICustomerDirectDebitV02", propOrder = {"groupHeader", "directDebitTransactionInformation"})
public class FIToFICustomerDirectDebitV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader34 groupHeader;
	/**
	 * Set of characteristics shared by all individual transactions included in
	 * the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader34
	 * GroupHeader34}</li>
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
			complexType_lazy = () -> GroupHeader34.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFICustomerDirectDebitV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DirectDebitTransactionInformation10> directDebitTransactionInformation;
	/**
	 * Set of elements providing information specific to the individual direct
	 * debit(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10
	 * DirectDebitTransactionInformation10}</li>
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
	public static final MMMessageBuildingBlock mmDirectDebitTransactionInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "DrctDbtTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransactionInformation";
			definition = "Set of elements providing information specific to the individual direct debit(s).";
			minOccurs = 1;
			complexType_lazy = () -> DirectDebitTransactionInformation10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return FIToFICustomerDirectDebitV02.class.getMethod("getDirectDebitTransactionInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FIToFICustomerDirectDebitV02";
				definition = "Scope\r\nThe FinancialInstitutionToFinancialInstitutionCustomerDirectDebit message is sent by the creditor agent to the debtor agent, directly or through other agents and/or a payment clearing and settlement system.\r\nIt is used to collect funds from a debtor account for a creditor.\r\nUsage\r\nThe FItoFICustomerDirectDebit message can contain one or more customer direct debit instructions.\r\nThe FIToFICustomerDirectDebit message does not allow for grouping: the PaymentInformation block must be present once per occurrence of a DirectDebitTransactionInformation block.\r\nThe FItoFICustomerDirectDebit message may or may not contain mandate related information, i.e. extracts from a mandate, such as the MandateIdentification or DateOfSignature. The FIToFICustomerDirectDebit message must not be considered as a mandate.\r\nThe FItoFICustomerDirectDebit message can be used in domestic and cross-border scenarios.";
				nextVersions_lazy = () -> Arrays.asList(FIToFICustomerDirectDebitV03.mmObject());
				previousVersion_lazy = () -> FIToFICustomerDirectDebitV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FIToFICstmrDrctDbt";
				businessArea_lazy = () -> PaymentsClearingandSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02.mmGroupHeader,
						com.tools20022.repository.area.pacs.FIToFICustomerDirectDebitV02.mmDirectDebitTransactionInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pacs";
						messageFunctionality = "003";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FIToFICustomerDirectDebitV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader34 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader34 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "DrctDbtTxInf", required = true)
	public List<DirectDebitTransactionInformation10> getDirectDebitTransactionInformation() {
		return directDebitTransactionInformation;
	}

	public void setDirectDebitTransactionInformation(List<DirectDebitTransactionInformation10> directDebitTransactionInformation) {
		this.directDebitTransactionInformation = directDebitTransactionInformation;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.02.02")
	static public class Document {
		@XmlElement(name = "FIToFICstmrDrctDbt", required = true)
		public FIToFICustomerDirectDebitV02 messageBody;
	}
}