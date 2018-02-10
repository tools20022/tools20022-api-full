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
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CustodyStatementOfHoldings message is sent by an account servicer to the
 * account owner or the account owner's designated agent. The account servicer
 * may be a local agent acting on behalf of its global custodian customer, a
 * custodian acting on behalf of an investment management institution or a
 * broker/dealer, a fund administrator or fund intermediary, trustee or
 * registrar, etc.<br>
 * This message reports, at a specified moment in time, the quantity and
 * identification of financial instruments that an account servicer holds for
 * the account owner.<br>
 * This message is used to reconcile the books of the account owner and the
 * account servicer for the specified account or sub-account.<br>
 * This message can also report availability and/or the location of security
 * holdings to facilitate trading and minimise settlement issues. The reporting
 * is per financial instrument, ie, when a financial instrument is held at
 * multiple places of safekeeping, the total holding for all locations can be
 * provided.<br>
 * <b>Usage</b><br>
 * The CustodyStatementOfHoldings message can be sent:<br>
 * - At a frequency agreed bi-laterally between the Sender and the Receiver<br>
 * - As a response to a request for statement sent by the account owner.<br>
 * This message can reflect all outstanding holding information or may only
 * contain changes since the previously sent statement.<br>
 * The CustodyStatementOfHoldings message can only be used to list the holdings
 * of a single (master) account. However, it is possible to break down these
 * holdings into one or several sub-accounts. Therefore, this message can be
 * used to either specify holdings at<br>
 * - the main account level, or<br>
 * - the sub-account level.<br>
 * This message can be also be used to report where the securities are
 * safe-kept, physically or notionally. If a security is held in more than one
 * safekeeping place, this can also be indicated.<br>
 * This message must not be used to report audited positions. Audited positions
 * are reported using the AccountingStatementOfHoldings message.<br>
 * Since a SWIFT message as sent is restricted to the maximum input message
 * length, several messages may be needed to accommodate all the information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmPreviousReference
 * CustodyStatementOfHoldings.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmRelatedReference
 * CustodyStatementOfHoldings.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmMessagePagination
 * CustodyStatementOfHoldings.mmMessagePagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmStatementGeneralDetails
 * CustodyStatementOfHoldings.mmStatementGeneralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmAccountDetails
 * CustodyStatementOfHoldings.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmBalanceForAccount
 * CustodyStatementOfHoldings.mmBalanceForAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmSubAccountDetails
 * CustodyStatementOfHoldings.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmTotalValues
 * CustodyStatementOfHoldings.mmTotalValues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldings#mmExtension
 * CustodyStatementOfHoldings.mmExtension}</li>
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
 * xmlTag} = "semt.002.001.01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementArchive
 * SecuritiesManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlName
 * xmlName} = "semt.002.001.01"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.002.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule#forCustodyStatementOfHoldings
 * ConstraintBalanceForAccountOrSubAccountDetailsRule.
 * forCustodyStatementOfHoldings}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodyStatementOfHoldings"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CustodyStatementOfHoldings message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a local agent acting on behalf of its global custodian customer, a custodian acting on behalf of an investment management institution or a broker/dealer, a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message reports, at a specified moment in time, the quantity and identification of financial instruments that an account servicer holds for the account owner.\r\nThis message is used to reconcile the books of the account owner and the account servicer for the specified account or sub-account.\r\nThis message can also report availability and/or the location of security holdings to facilitate trading and minimise settlement issues. The reporting is per financial instrument, ie, when a financial instrument is held at multiple places of safekeeping, the total holding for all locations can be provided.\r\nUsage\r\nThe CustodyStatementOfHoldings message can be sent:\r\n- At a frequency agreed bi-laterally between the Sender and the Receiver\r\n- As a response to a request for statement sent by the account owner.\r\nThis message can reflect all outstanding holding information or may only contain changes since the previously sent statement.\r\nThe CustodyStatementOfHoldings message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, this message can be used to either specify holdings at\r\n- the main account level, or\r\n- the sub-account level.\r\nThis message can be also be used to report where the securities are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated.\r\nThis message must not be used to report audited positions. Audited positions are reported using the AccountingStatementOfHoldings message.\r\nSince a SWIFT message as sent is restricted to the maximum input message length, several messages may be needed to accommodate all the information."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.CustodyStatementOfHoldingsV02
 * CustodyStatementOfHoldingsV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "semt.002.001.01", propOrder = {"previousReference", "relatedReference", "messagePagination", "statementGeneralDetails", "accountDetails", "balanceForAccount", "subAccountDetails", "totalValues", "extension"})
public class CustodyStatementOfHoldings {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	public static final MMMessageBuildingBlock mmPreviousReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getPreviousReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmMessagePagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessagePagination";
			definition = "Pagination of the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getMessagePagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "StmtGnlDtls", required = true)
	protected Statement3 statementGeneralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Statement3
	 * Statement3}</li>
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
	public static final MMMessageBuildingBlock mmStatementGeneralDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "StmtGnlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementGeneralDetails";
			definition = "General information related to the custody statement of holdings.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Statement3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getStatementGeneralDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctDtls", required = true)
	protected SafekeepingAccount1 accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SafekeepingAccount1
	 * SafekeepingAccount1}</li>
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
	public static final MMMessageBuildingBlock mmAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "The safekeeping or investment account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SafekeepingAccount1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BalForAcct")
	protected List<AggregateBalanceInformation1> balanceForAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1
	 * AggregateBalanceInformation1}</li>
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
	public static final MMMessageBuildingBlock mmBalanceForAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalForAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			complexType_lazy = () -> AggregateBalanceInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getBalanceForAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected List<SubAccountIdentification1> subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification1
	 * SubAccountIdentification1}</li>
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
	public static final MMMessageBuildingBlock mmSubAccountDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "The sub-account of the safekeeping or investment account.";
			minOccurs = 0;
			complexType_lazy = () -> SubAccountIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getSubAccountDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmTotalValues = new MMMessageBuildingBlock() {
		{
			xmlTag = "TtlVals";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalValues";
			definition = "Value of total holdings reported.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TotalValueInPageAndStatement.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getTotalValues", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CustodyStatementOfHoldings.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBalanceForAccountOrSubAccountDetailsRule.forCustodyStatementOfHoldings);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodyStatementOfHoldings";
				definition = "Scope\r\nThe CustodyStatementOfHoldings message is sent by an account servicer to the account owner or the account owner's designated agent. The account servicer may be a local agent acting on behalf of its global custodian customer, a custodian acting on behalf of an investment management institution or a broker/dealer, a fund administrator or fund intermediary, trustee or registrar, etc.\r\nThis message reports, at a specified moment in time, the quantity and identification of financial instruments that an account servicer holds for the account owner.\r\nThis message is used to reconcile the books of the account owner and the account servicer for the specified account or sub-account.\r\nThis message can also report availability and/or the location of security holdings to facilitate trading and minimise settlement issues. The reporting is per financial instrument, ie, when a financial instrument is held at multiple places of safekeeping, the total holding for all locations can be provided.\r\nUsage\r\nThe CustodyStatementOfHoldings message can be sent:\r\n- At a frequency agreed bi-laterally between the Sender and the Receiver\r\n- As a response to a request for statement sent by the account owner.\r\nThis message can reflect all outstanding holding information or may only contain changes since the previously sent statement.\r\nThe CustodyStatementOfHoldings message can only be used to list the holdings of a single (master) account. However, it is possible to break down these holdings into one or several sub-accounts. Therefore, this message can be used to either specify holdings at\r\n- the main account level, or\r\n- the sub-account level.\r\nThis message can be also be used to report where the securities are safe-kept, physically or notionally. If a security is held in more than one safekeeping place, this can also be indicated.\r\nThis message must not be used to report audited positions. Audited positions are reported using the AccountingStatementOfHoldings message.\r\nSince a SWIFT message as sent is restricted to the maximum input message length, several messages may be needed to accommodate all the information.";
				nextVersions_lazy = () -> Arrays.asList(CustodyStatementOfHoldingsV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "semt.002.001.01";
				businessArea_lazy = () -> SecuritiesManagementArchive.mmObject();
				xmlName = "semt.002.001.01";
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmPreviousReference, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmRelatedReference,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmMessagePagination, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmStatementGeneralDetails,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmAccountDetails, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmBalanceForAccount,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmSubAccountDetails, com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmTotalValues,
						com.tools20022.repository.area.semt.CustodyStatementOfHoldings.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CustodyStatementOfHoldings.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<AdditionalReference2> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public CustodyStatementOfHoldings setPreviousReference(List<AdditionalReference2> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public List<AdditionalReference2> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public CustodyStatementOfHoldings setRelatedReference(List<AdditionalReference2> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public Pagination getMessagePagination() {
		return messagePagination;
	}

	public CustodyStatementOfHoldings setMessagePagination(Pagination messagePagination) {
		this.messagePagination = Objects.requireNonNull(messagePagination);
		return this;
	}

	public Statement3 getStatementGeneralDetails() {
		return statementGeneralDetails;
	}

	public CustodyStatementOfHoldings setStatementGeneralDetails(Statement3 statementGeneralDetails) {
		this.statementGeneralDetails = Objects.requireNonNull(statementGeneralDetails);
		return this;
	}

	public SafekeepingAccount1 getAccountDetails() {
		return accountDetails;
	}

	public CustodyStatementOfHoldings setAccountDetails(SafekeepingAccount1 accountDetails) {
		this.accountDetails = Objects.requireNonNull(accountDetails);
		return this;
	}

	public List<AggregateBalanceInformation1> getBalanceForAccount() {
		return balanceForAccount == null ? balanceForAccount = new ArrayList<>() : balanceForAccount;
	}

	public CustodyStatementOfHoldings setBalanceForAccount(List<AggregateBalanceInformation1> balanceForAccount) {
		this.balanceForAccount = Objects.requireNonNull(balanceForAccount);
		return this;
	}

	public List<SubAccountIdentification1> getSubAccountDetails() {
		return subAccountDetails == null ? subAccountDetails = new ArrayList<>() : subAccountDetails;
	}

	public CustodyStatementOfHoldings setSubAccountDetails(List<SubAccountIdentification1> subAccountDetails) {
		this.subAccountDetails = Objects.requireNonNull(subAccountDetails);
		return this;
	}

	public Optional<TotalValueInPageAndStatement> getTotalValues() {
		return totalValues == null ? Optional.empty() : Optional.of(totalValues);
	}

	public CustodyStatementOfHoldings setTotalValues(TotalValueInPageAndStatement totalValues) {
		this.totalValues = totalValues;
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public CustodyStatementOfHoldings setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.002.001.01")
	static public class Document {
		@XmlElement(name = "semt.002.001.01", required = true)
		public CustodyStatementOfHoldings messageBody;
	}
}