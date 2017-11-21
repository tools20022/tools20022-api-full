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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.msg.AccountReport16;
import com.tools20022.repository.msg.GroupHeader58;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BankToCustomerAccountReport message is sent by the account servicer to an
 * account owner or to a party authorised by the account owner to receive the
 * message. It can be used to inform the account owner, or authorised party, of
 * the entries reported to the account, and/or to provide the owner with balance
 * information on the account at a given point in time.<br>
 * <b>Usage</b><br>
 * The BankToCustomerAccountReport message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.
 * It can be used to:<br>
 * - report pending and booked items;<br>
 * - provide balance information.<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled by the account owner to receive the account information
 * (also known as recipient).<br>
 * For a statement, the Bank-to-Customer Account Statement message should be
 * used.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BkToCstmrAcctRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04#mmGroupHeader
 * BankToCustomerAccountReportV04.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04#mmReport
 * BankToCustomerAccountReportV04.mmReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV04#mmSupplementaryData
 * BankToCustomerAccountReportV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.052.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerAccountReportV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerAccountReport message can contain reports for more than one account. It provides information for cash management and/or reconciliation. It can be used to:\r\n- report pending and booked items;\r\n- provide balance information.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nFor a statement, the Bank-to-Customer Account Statement message should be used."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05
 * BankToCustomerAccountReportV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV03
 * BankToCustomerAccountReportV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BankToCustomerAccountReportV04", propOrder = {"groupHeader", "report", "supplementaryData"})
public class BankToCustomerAccountReportV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader58 groupHeader;
	/**
	 * Common information for the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader58
	 * GroupHeader58}</li>
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
	 * definition} = "Common information for the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05#mmGroupHeader
	 * BankToCustomerAccountReportV05.mmGroupHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerAccountReportV05.mmGroupHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader58.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankToCustomerAccountReportV04.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AccountReport16> report;
	/**
	 * Reports on a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountReport16
	 * AccountReport16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Report"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on a cash account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05#mmReport
	 * BankToCustomerAccountReportV05.mmReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "Rpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Report";
			definition = "Reports on a cash account.";
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerAccountReportV05.mmReport);
			minOccurs = 1;
			complexType_lazy = () -> AccountReport16.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankToCustomerAccountReportV04.class.getMethod("getReport", new Class[]{});
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
	 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerAccountReportV05#mmSupplementaryData
	 * BankToCustomerAccountReportV05.mmSupplementaryData}</li>
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
			nextVersions_lazy = () -> Arrays.asList(BankToCustomerAccountReportV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankToCustomerAccountReportV04.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerAccountReportV04";
				definition = "Scope\r\nThe BankToCustomerAccountReport message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It can be used to inform the account owner, or authorised party, of the entries reported to the account, and/or to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerAccountReport message can contain reports for more than one account. It provides information for cash management and/or reconciliation. It can be used to:\r\n- report pending and booked items;\r\n- provide balance information.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled by the account owner to receive the account information (also known as recipient).\r\nFor a statement, the Bank-to-Customer Account Statement message should be used.";
				nextVersions_lazy = () -> Arrays.asList(BankToCustomerAccountReportV05.mmObject());
				previousVersion_lazy = () -> BankToCustomerAccountReportV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BkToCstmrAcctRpt";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerAccountReportV04.mmGroupHeader, com.tools20022.repository.area.camt.BankToCustomerAccountReportV04.mmReport,
						com.tools20022.repository.area.camt.BankToCustomerAccountReportV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "052";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankToCustomerAccountReportV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader58 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader58 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "Rpt", required = true)
	public List<AccountReport16> getReport() {
		return report;
	}

	public void setReport(List<AccountReport16> report) {
		this.report = report;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.052.04.04")
	static public class Document {
		@XmlElement(name = "BkToCstmrAcctRpt", required = true)
		public BankToCustomerAccountReportV04 messageBody;
	}
}