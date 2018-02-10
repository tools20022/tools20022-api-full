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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.TransparencyOfHoldingsMaintenance20162017;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The SecuritiesBalanceTransparencyReport message is sent by an account
 * servicer, such as a custodian, central securities depository or international
 * central securities depository, to the account owner to provide holdings
 * information for the accounts that it services, to disclose underlying details
 * of holdings on an omnibus account that the sender owns or operates at the
 * receiver. The receiver may also be a custodian, central securities
 * depository, international central securities depository, and the ultimate
 * receiver may be a registrar, transfer agent, fund company, official agent of
 * the reported instrument(s) and/or other parties.<br>
 * The SecuritiesBalanceTransparencyReport message provides transparency of
 * holdings through layers of custody chains in a consolidated statement, to
 * allow for an efficient gathering of investor data, which, in turn, may be
 * used to measure marketing effectiveness, validation of compliance with
 * prospectuses and regulatory requirements, and the calculation of trailer fees
 * and other retrocessions.<br>
 * <b>Usage</b><br>
 * The SecuritiesBalanceTransparencyReport message is used to provide aggregated
 * holdings information and a breakdown of holdings information.<br>
 * A sender of the SecuritiesBalanceTransparencyReport message will identify its
 * own safekeeping account (for example, an omnibus account in the ledger of the
 * receiver) and holdings information at the level of account(s) for which the
 * sender is the account servicer (that is, in the ledger of the sender). When
 * relevant, the sender will aggregate its holdings information with holdings
 * information of one or more sub levels and sub-sub levels of accounts, that
 * is, with holdings information the sender has received from the owner(s) of
 * the account(s) for which the sender is the account servicer.<br>
 * A sender of the SecuritiesBalanceTransparencyReport message may also use it
 * to send statements to its account owning customers, and these can be
 * enrichments of statements that the respective account owners have previously
 * provided to the sender.<br>
 * Ultimately, the statement reaches the relevant fund company, for example, the
 * transfer agent, that may use it for obtaining information about the
 * custodians, distributors and commercial agreement references associated with
 * holdings on an omnibus account at the ultimate place of safekeeping, for
 * example, a central securities depository (CSD) or a register of shareholders.<br>
 * When the message is sent by the owner of the account specified in
 * SafekeepingAccountAndHoldings/AccountIdentification, the message will
 * disclose holding details of the underlying owner(s) of the sender’s holdings
 * with the receiver. This direction is commonly referred to as ‘downstream’. <br>
 * When the sender is the account servicer of an account owned by the receiver,
 * for example, the account in AccountSubLevel1/AccountIdentification or
 * AccountSubLevel2/AccountIdentification, the message is providing a statement
 * of the receiver’s holdings with sender. This direction is commonly referred
 * to as ‘upstream’, and the safekeeping account should identify the ultimate
 * place of safekeeping (for example, an account in a transfer agent's register
 * of shareholders).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmSenderIdentification
 * SecuritiesBalanceTransparencyReportV02.mmSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmReceiverIdentification
 * SecuritiesBalanceTransparencyReportV02.mmReceiverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmPagination
 * SecuritiesBalanceTransparencyReportV02.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmStatementGeneralDetails
 * SecuritiesBalanceTransparencyReportV02.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmSafekeepingAccountAndHoldings
 * SecuritiesBalanceTransparencyReportV02.mmSafekeepingAccountAndHoldings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02#mmSupplementaryData
 * SecuritiesBalanceTransparencyReportV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransparencyOfHoldingsMaintenance20162017
 * TransparencyOfHoldingsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalTrnsprncyRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.041.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTransparencyReportV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe SecuritiesBalanceTransparencyReport message is sent by an account servicer, such as a custodian, central securities depository or international central securities depository, to the account owner to provide holdings information for the accounts that it services, to disclose underlying details of holdings on an omnibus account that the sender owns or operates at the receiver. The receiver may also be a custodian, central securities depository, international central securities depository, and the ultimate receiver may be a registrar, transfer agent, fund company, official agent of the reported instrument(s) and/or other parties.\r\nThe SecuritiesBalanceTransparencyReport message provides transparency of holdings through layers of custody chains in a consolidated statement, to allow for an efficient gathering of investor data, which, in turn, may be used to measure marketing effectiveness, validation of compliance with prospectuses and regulatory requirements, and the calculation of trailer fees and other retrocessions.\r\nUsage\r\nThe SecuritiesBalanceTransparencyReport message is used to provide aggregated holdings information and a breakdown of holdings information.\r\nA sender of the SecuritiesBalanceTransparencyReport message will identify its own safekeeping account (for example, an omnibus account in the ledger of the receiver) and holdings information at the level of account(s) for which the sender is the account servicer (that is, in the ledger of the sender). When relevant, the sender will aggregate its holdings information with holdings information of one or more sub levels and sub-sub levels of accounts, that is, with holdings information the sender has received from the owner(s) of the account(s) for which the sender is the account servicer.\r\nA sender of the SecuritiesBalanceTransparencyReport message may also use it to send statements to its account owning customers, and these can be enrichments of statements that the respective account owners have previously provided to the sender.\r\nUltimately, the statement reaches the relevant fund company, for example, the transfer agent, that may use it for obtaining information about the custodians, distributors and commercial agreement references associated with holdings on an omnibus account at the ultimate place of safekeeping, for example, a central securities depository (CSD) or a register of shareholders.\r\nWhen the message is sent by the owner of the account specified in SafekeepingAccountAndHoldings/AccountIdentification, the message will disclose holding details of the underlying owner(s) of the sender’s holdings with the receiver. This direction is commonly referred to as ‘downstream’. \r\nWhen the sender is the account servicer of an account owned by the receiver, for example, the account in AccountSubLevel1/AccountIdentification or AccountSubLevel2/AccountIdentification, the message is providing a statement of the receiver’s holdings with sender. This direction is commonly referred to as ‘upstream’, and the safekeeping account should identify the ultimate place of safekeeping (for example, an account in a transfer agent's register of shareholders)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesBalanceTransparencyReportV02", propOrder = {"messageIdentification", "senderIdentification", "receiverIdentification", "pagination", "statementGeneralDetails", "safekeepingAccountAndHoldings", "supplementaryData"})
public class SecuritiesBalanceTransparencyReportV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the message. When the report has multiple pages, one message equals one page. Therefore, the MessageIdentification uniquely identifies the page."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identification of the message. When the report has multiple pages, one message equals one page. Therefore, the MessageIdentification uniquely identifies the page.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SndrId", required = true)
	protected PartyIdentification100 senderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the sender of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSenderIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "SndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderIdentification";
			definition = "Identification of the party that is the sender of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getSenderIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RcvrId")
	protected PartyIdentification100 receiverIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the receiver of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReceiverIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcvrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIdentification";
			definition = "Identification of the party that is the receiver of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getReceiverIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Page number of the message (within a statement) and continuation indicator to indicate that the statement is to continue or that the message is the last page of the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement59 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement59
	 * Statement59}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtGnlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementGeneralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides general information on the statement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatementGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "Provides general information on the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement59.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getStatementGeneralDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SfkpgAcctAndHldgs")
	protected List<SafekeepingAccount7> safekeepingAccountAndHoldings;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount7
	 * SafekeepingAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcctAndHldgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountAndHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details of the account, account sub-levels and the holdings."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSafekeepingAccountAndHoldings = new MMMessageBuildingBlock() {
		{
			xmlTag = "SfkpgAcctAndHldgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountAndHoldings";
			definition = "Details of the account, account sub-levels and the holdings.";
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingAccount7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getSafekeepingAccountAndHoldings", new Class[]{});
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesBalanceTransparencyReportV02.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTransparencyReportV02";
				definition = "Scope\r\nThe SecuritiesBalanceTransparencyReport message is sent by an account servicer, such as a custodian, central securities depository or international central securities depository, to the account owner to provide holdings information for the accounts that it services, to disclose underlying details of holdings on an omnibus account that the sender owns or operates at the receiver. The receiver may also be a custodian, central securities depository, international central securities depository, and the ultimate receiver may be a registrar, transfer agent, fund company, official agent of the reported instrument(s) and/or other parties.\r\nThe SecuritiesBalanceTransparencyReport message provides transparency of holdings through layers of custody chains in a consolidated statement, to allow for an efficient gathering of investor data, which, in turn, may be used to measure marketing effectiveness, validation of compliance with prospectuses and regulatory requirements, and the calculation of trailer fees and other retrocessions.\r\nUsage\r\nThe SecuritiesBalanceTransparencyReport message is used to provide aggregated holdings information and a breakdown of holdings information.\r\nA sender of the SecuritiesBalanceTransparencyReport message will identify its own safekeeping account (for example, an omnibus account in the ledger of the receiver) and holdings information at the level of account(s) for which the sender is the account servicer (that is, in the ledger of the sender). When relevant, the sender will aggregate its holdings information with holdings information of one or more sub levels and sub-sub levels of accounts, that is, with holdings information the sender has received from the owner(s) of the account(s) for which the sender is the account servicer.\r\nA sender of the SecuritiesBalanceTransparencyReport message may also use it to send statements to its account owning customers, and these can be enrichments of statements that the respective account owners have previously provided to the sender.\r\nUltimately, the statement reaches the relevant fund company, for example, the transfer agent, that may use it for obtaining information about the custodians, distributors and commercial agreement references associated with holdings on an omnibus account at the ultimate place of safekeeping, for example, a central securities depository (CSD) or a register of shareholders.\r\nWhen the message is sent by the owner of the account specified in SafekeepingAccountAndHoldings/AccountIdentification, the message will disclose holding details of the underlying owner(s) of the sender’s holdings with the receiver. This direction is commonly referred to as ‘downstream’. \r\nWhen the sender is the account servicer of an account owned by the receiver, for example, the account in AccountSubLevel1/AccountIdentification or AccountSubLevel2/AccountIdentification, the message is providing a statement of the receiver’s holdings with sender. This direction is commonly referred to as ‘upstream’, and the safekeeping account should identify the ultimate place of safekeeping (for example, an account in a transfer agent's register of shareholders).";
				messageSet_lazy = () -> Arrays.asList(TransparencyOfHoldingsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesBalTrnsprncyRpt";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmMessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmSenderIdentification, com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmReceiverIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmPagination, com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmStatementGeneralDetails,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmSafekeepingAccountAndHoldings, com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "041";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalanceTransparencyReportV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SecuritiesBalanceTransparencyReportV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public PartyIdentification100 getSenderIdentification() {
		return senderIdentification;
	}

	public SecuritiesBalanceTransparencyReportV02 setSenderIdentification(PartyIdentification100 senderIdentification) {
		this.senderIdentification = Objects.requireNonNull(senderIdentification);
		return this;
	}

	public Optional<PartyIdentification100> getReceiverIdentification() {
		return receiverIdentification == null ? Optional.empty() : Optional.of(receiverIdentification);
	}

	public SecuritiesBalanceTransparencyReportV02 setReceiverIdentification(PartyIdentification100 receiverIdentification) {
		this.receiverIdentification = receiverIdentification;
		return this;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public SecuritiesBalanceTransparencyReportV02 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public Statement59 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public SecuritiesBalanceTransparencyReportV02 setStatementGeneralDetails(Statement59 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public List<SafekeepingAccount7> getSafekeepingAccountAndHoldings() {
		return safekeepingAccountAndHoldings == null ? safekeepingAccountAndHoldings = new ArrayList<>() : safekeepingAccountAndHoldings;
	}

	public SecuritiesBalanceTransparencyReportV02 setSafekeepingAccountAndHoldings(List<SafekeepingAccount7> safekeepingAccountAndHoldings) {
		this.safekeepingAccountAndHoldings = Objects.requireNonNull(safekeepingAccountAndHoldings);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesBalanceTransparencyReportV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.041.001.02")
	static public class Document {
		@XmlElement(name = "SctiesBalTrnsprncyRpt", required = true)
		public SecuritiesBalanceTransparencyReportV02 messageBody;
	}
}