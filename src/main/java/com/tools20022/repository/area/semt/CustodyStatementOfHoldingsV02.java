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
import com.tools20022.repository.area.SecuritiesManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOLatestversion;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a transfer agent sends the
 * CustodyStatementOfHoldings message to the account owner, for example, a fund
 * manager or an account owner's designated agent to provide detailed holdings
 * of the portfolio at a specified moment in time.<br>
 * The message provides, at a moment in time, the quantity and identification of
 * the financial instruments that the account servicer holds for the account
 * owner. The message can also include availability and the location of holdings
 * to facilitate trading and minimise settlement issues.<br>
 * The message reports all information per financial instrument, ie, when a
 * financial instrument is held at multiple places of safekeeping, the total
 * holdings for all locations can be provided.<br>
 * <b>Usage</b><br>
 * The CustodyStatementOfHoldings message is used to provide detailed quantity
 * and availability information for financial instrument holdings of a
 * portfolio. The message should be sent at a frequency agreed bi-laterally
 * between the account servicer and the account owner.<br>
 * This message can be also be used to report where the financial instruments
 * are safe-kept, physically or notionally. If a security is held in more than
 * one safekeeping place, this can also be indicated.<br>
 * This message can reflect all outstanding holding information or may only
 * contain changes since the previously sent statement.<br>
 * The CustodyStatementOfHoldings message can only be used to list the holdings
 * of a single (master) account. However, it is possible to break down these
 * holdings into one or several sub-accounts. Therefore, this message can be
 * used to either specify holdings at<br>
 * - the main account level, or,<br>
 * - the sub-account level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessageIdentification
 * CustodyStatementOfHoldingsV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmPreviousReference
 * CustodyStatementOfHoldingsV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmRelatedReference
 * CustodyStatementOfHoldingsV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmMessagePagination
 * CustodyStatementOfHoldingsV02.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmStatementGeneralDetails
 * CustodyStatementOfHoldingsV02.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmAccountDetails
 * CustodyStatementOfHoldingsV02.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmBalanceForAccount
 * CustodyStatementOfHoldingsV02.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmSubAccountDetails
 * CustodyStatementOfHoldingsV02.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmTotalValues
 * CustodyStatementOfHoldingsV02.mmTotalValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02#mmExtension
 * CustodyStatementOfHoldingsV02.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOLatestversion
 * InvestmentFundsISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CtdyStmtOfHldgsV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.002.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#for_semt_CustodyStatementOfHoldingsV02
 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
 * for_semt_CustodyStatementOfHoldingsV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyStatementOfHoldingsV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a transfer agent sends the CustodyStatementOfHoldings message to the account owner, for example, a fund manager or an account owner's designated agent to provide detailed holdings of the portfolio at a specified moment in time.\r\nThe message provides, at a moment in time, the quantity and identification of the financial instruments that the account servicer holds for the account owner. The message can also include availability and the location of holdings to facilitate trading and minimise settlement issues.\r\nThe message reports all information per financial instrument, ie, when a financial instrument is held at multiple places of safekeeping, the total holdings for all locations can be provided.\r\nUsage\r\nThe CustodyStatementOfHoldings message is used to provide detailed quantity and availability information for financial instrument holdings of a portfolio. The message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\r\nThis message can be also be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated.\r\nThis message can reflect all outstanding holding information or may only contain changes since the previously sent statement.\r\nThe CustodyStatementOfHoldings message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, this message can be used to either specify holdings at\r\n- the main account level, or,\r\n- the sub-account level."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceCustodyReportV03
 * SecuritiesBalanceCustodyReportV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings
 * CustodyStatementOfHoldings}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustodyStatementOfHoldingsV02", propOrder = {"messageIdentification", "previousReference", "relatedReference", "messagePagination", "statementGeneralDetails", "accountDetails", "balanceForAccount", "subAccountDetails",
		"totalValues", "extension"})
public class CustodyStatementOfHoldingsV02 {

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
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference2> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AdditionalReference2>> mmPreviousReference = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AdditionalReference2>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		@Override
		public List<AdditionalReference2> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, List<AdditionalReference2> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected List<AdditionalReference2> relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference2
	 * AdditionalReference2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AdditionalReference2>> mmRelatedReference = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AdditionalReference2>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		@Override
		public List<AdditionalReference2> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, List<AdditionalReference2> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "MsgPgntn", required = true)
	protected Pagination messagePagination;
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
	 * xmlTag} = "MsgPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessagePagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pagination of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Pagination> mmMessagePagination = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Pagination>() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Pagination getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getMessagePagination();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, Pagination value) {
			obj.setMessagePagination(value);
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement7 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement7
	 * Statement7}</li>
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
	 * definition} =
	 * "General information related to the custody statement of holdings."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Statement7> mmStatementGeneralDetails = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Statement7>() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the custody statement of holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement7.mmObject();
		}

		@Override
		public Statement7 getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getStatementGeneralDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, Statement7 value) {
			obj.setStatementGeneralDetails(value);
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected SafekeepingAccount2 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount2
	 * SafekeepingAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The safekeeping or investment account."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, SafekeepingAccount2> mmAccountDetails = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, SafekeepingAccount2>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "The safekeeping or investment account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SafekeepingAccount2.mmObject();
		}

		@Override
		public SafekeepingAccount2 getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, SafekeepingAccount2 value) {
			obj.setAccountDetails(value);
		}
	};
	@XmlElement(name = "BalForAcct")
	protected List<AggregateBalanceInformation4> balanceForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4
	 * AggregateBalanceInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AggregateBalanceInformation4>> mmBalanceForAccount = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<AggregateBalanceInformation4>>() {
		{
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			complexType_lazy = () -> AggregateBalanceInformation4.mmObject();
		}

		@Override
		public List<AggregateBalanceInformation4> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getBalanceForAccount();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, List<AggregateBalanceInformation4> value) {
			obj.setBalanceForAccount(value);
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification5> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification5
	 * SubAccountIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The sub-account of the safekeeping or investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<SubAccountIdentification5>> mmSubAccountDetails = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<SubAccountIdentification5>>() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "The sub-account of the safekeeping or investment account.";
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification5.mmObject();
		}

		@Override
		public List<SubAccountIdentification5> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, List<SubAccountIdentification5> value) {
			obj.setSubAccountDetails(value);
		}
	};
	@XmlElement(name = "TtlVals")
	protected TotalValueInPageAndStatement totalValues;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement
	 * TotalValueInPageAndStatement}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlVals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalValues"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of total holdings reported."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Optional<TotalValueInPageAndStatement>> mmTotalValues = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, Optional<TotalValueInPageAndStatement>>() {
		{
			xmlTag = "TtlVals";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalValues";
			definition = "Value of total holdings reported.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalValueInPageAndStatement.mmObject();
		}

		@Override
		public Optional<TotalValueInPageAndStatement> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getTotalValues();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, Optional<TotalValueInPageAndStatement> value) {
			obj.setTotalValues(value.orElse(null));
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension1> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension1
	 * Extension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<Extension1>> mmExtension = new MMMessageBuildingBlock<CustodyStatementOfHoldingsV02, List<Extension1>>() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		@Override
		public List<Extension1> getValue(CustodyStatementOfHoldingsV02 obj) {
			return obj.getExtension();
		}

		@Override
		public void setValue(CustodyStatementOfHoldingsV02 obj, List<Extension1> value) {
			obj.setExtension(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.for_semt_CustodyStatementOfHoldingsV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodyStatementOfHoldingsV02";
				definition = "Scope\r\nAn account servicer, for example, a transfer agent sends the CustodyStatementOfHoldings message to the account owner, for example, a fund manager or an account owner's designated agent to provide detailed holdings of the portfolio at a specified moment in time.\r\nThe message provides, at a moment in time, the quantity and identification of the financial instruments that the account servicer holds for the account owner. The message can also include availability and the location of holdings to facilitate trading and minimise settlement issues.\r\nThe message reports all information per financial instrument, ie, when a financial instrument is held at multiple places of safekeeping, the total holdings for all locations can be provided.\r\nUsage\r\nThe CustodyStatementOfHoldings message is used to provide detailed quantity and availability information for financial instrument holdings of a portfolio. The message should be sent at a frequency agreed bi-laterally between the account servicer and the account owner.\r\nThis message can be also be used to report where the financial instruments are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated.\r\nThis message can reflect all outstanding holding information or may only contain changes since the previously sent statement.\r\nThe CustodyStatementOfHoldings message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, this message can be used to either specify holdings at\r\n- the main account level, or,\r\n- the sub-account level.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesBalanceCustodyReportV03.mmObject());
				previousVersion_lazy = () -> CustodyStatementOfHoldings.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject(), InvestmentFundsISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "CtdyStmtOfHldgsV02";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmMessageIdentification,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmPreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmRelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmMessagePagination, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmStatementGeneralDetails,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmAccountDetails, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmBalanceForAccount,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmSubAccountDetails, com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmTotalValues,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "002";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustodyStatementOfHoldingsV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public CustodyStatementOfHoldingsV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public List<AdditionalReference2> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public CustodyStatementOfHoldingsV02 setPreviousReference(List<AdditionalReference2> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<AdditionalReference2> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public CustodyStatementOfHoldingsV02 setRelatedReference(List<AdditionalReference2> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public CustodyStatementOfHoldingsV02 setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Statement7 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public CustodyStatementOfHoldingsV02 setStatementGeneralDetails(Statement7 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public SafekeepingAccount2 getAccountDetails() {
		return accountDetails;
	}

	public CustodyStatementOfHoldingsV02 setAccountDetails(SafekeepingAccount2 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public List<AggregateBalanceInformation4> getBalanceForAccount() {
		return balanceForAccount == null ? balanceForAccount = new ArrayList<>() : balanceForAccount;
	}

	public CustodyStatementOfHoldingsV02 setBalanceForAccount(List<AggregateBalanceInformation4> balanceForAccount) {
		this.balanceForAccount = Objects.requireNonNull(balanceForAccount);
		return this;
	}

	public List<SubAccountIdentification5> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public CustodyStatementOfHoldingsV02 setSubAccountDetails(List<SubAccountIdentification5> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public Optional<TotalValueInPageAndStatement> getTotalValues() {
		return totalValues == null ? Optional.empty() : Optional.of(totalValues);
	}

	public CustodyStatementOfHoldingsV02 setTotalValues(TotalValueInPageAndStatement totalValues) {
		this.totalValues = totalValues;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public CustodyStatementOfHoldingsV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.02")
	static public class Document {
		@XmlElement(name = "CtdyStmtOfHldgsV02", required = true)
		public CustodyStatementOfHoldingsV02 messageBody;
	}
}