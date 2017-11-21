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
import com.tools20022.repository.msg.AccountStatement2;
import com.tools20022.repository.msg.GroupHeader42;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The BankToCustomerStatement message is sent by the account servicer to an
 * account owner or to a party authorised by the account owner to receive the
 * message. It is used to inform the account owner, or authorised party, of the
 * entries booked to the account, and to provide the owner with balance
 * information on the account at a given point in time.<br>
 * <b>Usage</b><br>
 * The BankToCustomerStatement message can contain reports for more than one
 * account. It provides information for cash management and/or reconciliation.<br>
 * It contains information on booked entries only.<br>
 * It can include underlying details of transactions that have been included in
 * the entry.<br>
 * The message is exchanged as defined between the account servicer and the
 * account owner. It provides information on items that have been booked to the
 * account and also balance information. Depending on services and schedule
 * agreed between banks and their customers, statements may be generated and
 * exchanged accordingly, for example for intraday or prior day periods.<br>
 * It is possible that the receiver of the message is not the account owner, but
 * a party entitled through arrangement with the account owner to receive the
 * account information (also known as recipient).
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
 * xmlTag} = "BkToCstmrStmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV02#mmGroupHeader
 * BankToCustomerStatementV02.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV02#mmStatement
 * BankToCustomerStatementV02.mmStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.053.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BankToCustomerStatementV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe BankToCustomerStatement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerStatement message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\r\nIt contains information on booked entries only.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nThe message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account and also balance information. Depending on services and schedule agreed between banks and their customers, statements may be generated and exchanged accordingly, for example for intraday or prior day periods.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV03
 * BankToCustomerStatementV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV01
 * BankToCustomerStatementV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BankToCustomerStatementV02", propOrder = {"groupHeader", "statement"})
public class BankToCustomerStatementV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader42 groupHeader;
	/**
	 * Common information for the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader42
	 * GroupHeader42}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Common information for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader42.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankToCustomerStatementV02.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AccountStatement2> statement;
	/**
	 * Reports on booked entries and balances for a cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement2
	 * AccountStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Stmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Statement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reports on booked entries and balances for a cash account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Stmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Statement";
			definition = "Reports on booked entries and balances for a cash account.";
			minOccurs = 1;
			complexType_lazy = () -> AccountStatement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BankToCustomerStatementV02.class.getMethod("getStatement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BankToCustomerStatementV02";
				definition = "Scope\r\nThe BankToCustomerStatement message is sent by the account servicer to an account owner or to a party authorised by the account owner to receive the message. It is used to inform the account owner, or authorised party, of the entries booked to the account, and to provide the owner with balance information on the account at a given point in time.\r\nUsage\r\nThe BankToCustomerStatement message can contain reports for more than one account. It provides information for cash management and/or reconciliation.\r\nIt contains information on booked entries only.\r\nIt can include underlying details of transactions that have been included in the entry.\r\nThe message is exchanged as defined between the account servicer and the account owner. It provides information on items that have been booked to the account and also balance information. Depending on services and schedule agreed between banks and their customers, statements may be generated and exchanged accordingly, for example for intraday or prior day periods.\r\nIt is possible that the receiver of the message is not the account owner, but a party entitled through arrangement with the account owner to receive the account information (also known as recipient).";
				nextVersions_lazy = () -> Arrays.asList(BankToCustomerStatementV03.mmObject());
				previousVersion_lazy = () -> BankToCustomerStatementV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "BkToCstmrStmt";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.BankToCustomerStatementV02.mmGroupHeader, com.tools20022.repository.area.camt.BankToCustomerStatementV02.mmStatement);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "053";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BankToCustomerStatementV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader42 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader42 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "Stmt", required = true)
	public List<AccountStatement2> getStatement() {
		return statement;
	}

	public void setStatement(List<AccountStatement2> statement) {
		this.statement = statement;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.053.02.02")
	static public class Document {
		@XmlElement(name = "BkToCstmrStmt", required = true)
		public BankToCustomerStatementV02 messageBody;
	}
}