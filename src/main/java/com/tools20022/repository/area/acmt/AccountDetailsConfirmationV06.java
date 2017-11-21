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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, for example, a registrar, transfer agent, custodian bank
 * or securities depository sends the AccountDetailsConfirmation message to the
 * account owner, for example, an investor to confirm the opening of an account,
 * execution of an AccountModificationInstruction or to return information
 * requested in a GetAccountDetails message.<br>
 * <b>Usage</b><br>
 * The AccountDetailsConfirmation message is used to confirm the opening of an
 * account, modification of an account or the provision of information requested
 * in a previously sent GetAccountDetails message. The message contains detailed
 * information relevant to the opened account.<br>
 * When the AccountDetailsConfirmation is used to confirm execution of an
 * AccountModificationInstruction message, it contains the modified subsets of
 * account details that were specified in the AccountModificationInstruction.<br>
 * When the AccountDetailsConfirmation is used to reply to a GetAccountDetails
 * message, it returns the selected subsets of account details that were
 * specified in the GetAccountDetails message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctDtlsConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMessageIdentification
 * AccountDetailsConfirmationV06.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmOrderReference
 * AccountDetailsConfirmationV06.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmRelatedReference
 * AccountDetailsConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmConfirmationDetails
 * AccountDetailsConfirmationV06.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmInvestmentAccount
 * AccountDetailsConfirmationV06.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAccountParties
 * AccountDetailsConfirmationV06.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmIntermediaries
 * AccountDetailsConfirmationV06.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmPlacement
 * AccountDetailsConfirmationV06.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmNewIssueAllocation
 * AccountDetailsConfirmationV06.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV06.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmCashSettlement
 * AccountDetailsConfirmationV06.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmServiceLevelAgreement
 * AccountDetailsConfirmationV06.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmAdditionalInformation
 * AccountDetailsConfirmationV06.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmMarketPracticeVersion
 * AccountDetailsConfirmationV06.mmMarketPracticeVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmExtension
 * AccountDetailsConfirmationV06.mmExtension}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository  sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07
 * AccountDetailsConfirmationV07}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05
 * AccountDetailsConfirmationV05}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountDetailsConfirmationV06", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "additionalInformation", "marketPracticeVersion", "extension"})
public class AccountDetailsConfirmationV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 messageIdentification;
	/**
	 * Reference that uniquely identifies the message from a business
	 * application standpoint.
	 * <p>
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
	 * "Reference that uniquely identifies the message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMessageIdentification
	 * AccountDetailsConfirmationV07.mmMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMessageIdentification
	 * AccountDetailsConfirmationV05.mmMessageIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies the message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmMessageIdentification);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmMessageIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundOrder4 orderReference;
	/**
	 * Identifies a related order or settlement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder4
	 * InvestmentFundOrder4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies a related order or settlement transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmOrderReference
	 * AccountDetailsConfirmationV07.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmOrderReference
	 * AccountDetailsConfirmationV05.mmOrderReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order or settlement transaction.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmOrderReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmOrderReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getOrderReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AdditionalReference6 relatedReference;
	/**
	 * Reference to a linked message that was previously received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmRelatedReference
	 * AccountDetailsConfirmationV07.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmRelatedReference
	 * AccountDetailsConfirmationV05.mmRelatedReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRelatedReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmRelatedReference);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmRelatedReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountManagementConfirmation3 confirmationDetails;
	/**
	 * Information about the request or instruction which triggered this
	 * confirmation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation3
	 * AccountManagementConfirmation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the request or instruction which triggered this confirmation. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmConfirmationDetails
	 * AccountDetailsConfirmationV07.mmConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmConfirmationDetails
	 * AccountDetailsConfirmationV05.mmConfirmationDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Information about the request or instruction which triggered this confirmation. ";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmConfirmationDetails);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmConfirmationDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentAccount50 investmentAccount;
	/**
	 * Confirmation of the information related to the investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to the investment account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmInvestmentAccount
	 * AccountDetailsConfirmationV07.mmInvestmentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmInvestmentAccount
	 * AccountDetailsConfirmationV05.mmInvestmentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to the investment account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmInvestmentAccount);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmInvestmentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount50.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AccountParties13 accountParties;
	/**
	 * Confirmation of information related to parties that are related to the
	 * account, for example, primary account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13
	 * AccountParties13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of information related to parties that are related to the account, for example, primary account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAccountParties
	 * AccountDetailsConfirmationV07.mmAccountParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmAccountParties
	 * AccountDetailsConfirmationV05.mmAccountParties}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties that are related to the account, for example, primary account owner.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAccountParties);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmAccountParties;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties13.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getAccountParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Intermediary36> intermediaries;
	/**
	 * Confirmation of an intermediary or other party related to the management
	 * of the account. In some markets, when this intermediary is a party acting
	 * on behalf of the investor for which it has opened an account at, for
	 * example, a central securities depository or international central
	 * securities depository, this party is known by the investor as the
	 * 'account controller'.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary36
	 * Intermediary36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmies"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediaries"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of an intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmIntermediaries
	 * AccountDetailsConfirmationV07.mmIntermediaries}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmIntermediaries
	 * AccountDetailsConfirmationV05.mmIntermediaries}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of an intermediary or other party related to the management of the account. In some markets, when this intermediary is a party acting on behalf of the investor for which it has opened an account at, for example, a central securities depository or international central securities depository, this party is known by the investor as the 'account controller'.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmIntermediaries);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmIntermediaries;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary36.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getIntermediaries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReferredAgent2 placement;
	/**
	 * Confirmation of referral information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent2
	 * ReferredAgent2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Plcmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Confirmation of referral information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmPlacement
	 * AccountDetailsConfirmationV07.mmPlacement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmPlacement
	 * AccountDetailsConfirmationV05.mmPlacement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Confirmation of referral information.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmPlacement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmPlacement;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getPlacement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NewIssueAllocation2 newIssueAllocation;
	/**
	 * Confirmation of eligibility conditions applicable when there is an
	 * allocation of new issues for hedge fund account opening.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation2
	 * NewIssueAllocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewIsseAllcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssueAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmNewIssueAllocation
	 * AccountDetailsConfirmationV07.mmNewIssueAllocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmNewIssueAllocation
	 * AccountDetailsConfirmationV05.mmNewIssueAllocation}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Confirmation of eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmNewIssueAllocation);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmNewIssueAllocation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getNewIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<InvestmentPlan12> savingsInvestmentPlan;
	/**
	 * Confirmation of the information related to a savings plan that is related
	 * to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a savings plan that is related to the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV07.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmSavingsInvestmentPlan
	 * AccountDetailsConfirmationV05.mmSavingsInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmSavingsInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmSavingsInvestmentPlan;
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<InvestmentPlan12> withdrawalInvestmentPlan;
	/**
	 * Confirmation of the information related to a withdrawal plan that is
	 * related to the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WdrwlInvstmtPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalInvestmentPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of the information related to a withdrawal plan that is related to the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmWithdrawalInvestmentPlan
	 * AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withdrawal plan that is related to the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmWithdrawalInvestmentPlan;
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CashSettlement1> cashSettlement;
	/**
	 * Confirmation of a cash settlement standing instruction associated to
	 * transactions on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashSettlement1
	 * CashSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Confirmation of a cash settlement standing instruction associated to  transactions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmCashSettlement
	 * AccountDetailsConfirmationV07.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmCashSettlement
	 * AccountDetailsConfirmationV05.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of a cash settlement standing instruction associated to  transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmCashSettlement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			complexType_lazy = () -> CashSettlement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getCashSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<DocumentToSend3> serviceLevelAgreement;
	/**
	 * Identifies documents to be provided for the account opening.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend3
	 * DocumentToSend3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvcLvlAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceLevelAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies documents to be provided for the account opening."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV07.mmServiceLevelAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmServiceLevelAgreement
	 * AccountDetailsConfirmationV05.mmServiceLevelAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmServiceLevelAgreement);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmServiceLevelAgreement;
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getServiceLevelAgreement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<AccountRestrictions1> additionalInformation;
	/**
	 * Additional information concerning limitations and restrictions on the
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information concerning limitations and restrictions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAdditionalInformation
	 * AccountDetailsConfirmationV07.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAdditionalInformation);
			minOccurs = 0;
			complexType_lazy = () -> AccountRestrictions1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MarketPracticeVersion1 marketPracticeVersion;
	/**
	 * Identifies the market practice to which the message conforms.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MarketPracticeVersion1
	 * MarketPracticeVersion1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktPrctcVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPracticeVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market practice to which the message conforms."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV07.mmMarketPracticeVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmMarketPracticeVersion
	 * AccountDetailsConfirmationV05.mmMarketPracticeVersion}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMarketPracticeVersion = new MMMessageBuildingBlock() {
		{
			xmlTag = "MktPrctcVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPracticeVersion";
			definition = "Identifies the market practice to which the message conforms.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmMarketPracticeVersion);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmMarketPracticeVersion;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MarketPracticeVersion1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getMarketPracticeVersion", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Extension1> extension;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmExtension
	 * AccountDetailsConfirmationV07.mmExtension}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV05#mmExtension
	 * AccountDetailsConfirmationV05.mmExtension}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmExtension);
			previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmExtension;
			minOccurs = 0;
			complexType_lazy = () -> Extension1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV06.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountDetailsConfirmationV06";
				definition = "Scope\r\nAn account servicer, for example, a registrar, transfer agent, custodian bank or securities depository  sends the AccountDetailsConfirmation message to the account owner, for example, an investor to confirm the opening of an account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmObject());
				previousVersion_lazy = () -> AccountDetailsConfirmationV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctDtlsConf";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmAdditionalInformation,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmMarketPracticeVersion, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgId", required = true)
	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public void setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = messageIdentification;
	}

	@XmlElement(name = "OrdrRef")
	public InvestmentFundOrder4 getOrderReference() {
		return orderReference;
	}

	public void setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
	}

	@XmlElement(name = "RltdRef")
	public AdditionalReference6 getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(AdditionalReference6 relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "ConfDtls", required = true)
	public AccountManagementConfirmation3 getConfirmationDetails() {
		return confirmationDetails;
	}

	public void setConfirmationDetails(AccountManagementConfirmation3 confirmationDetails) {
		this.confirmationDetails = confirmationDetails;
	}

	@XmlElement(name = "InvstmtAcct")
	public InvestmentAccount50 getInvestmentAccount() {
		return investmentAccount;
	}

	public void setInvestmentAccount(InvestmentAccount50 investmentAccount) {
		this.investmentAccount = investmentAccount;
	}

	@XmlElement(name = "AcctPties")
	public AccountParties13 getAccountParties() {
		return accountParties;
	}

	public void setAccountParties(AccountParties13 accountParties) {
		this.accountParties = accountParties;
	}

	@XmlElement(name = "Intrmies")
	public List<Intermediary36> getIntermediaries() {
		return intermediaries;
	}

	public void setIntermediaries(List<Intermediary36> intermediaries) {
		this.intermediaries = intermediaries;
	}

	@XmlElement(name = "Plcmnt")
	public ReferredAgent2 getPlacement() {
		return placement;
	}

	public void setPlacement(ReferredAgent2 placement) {
		this.placement = placement;
	}

	@XmlElement(name = "NewIsseAllcn")
	public NewIssueAllocation2 getNewIssueAllocation() {
		return newIssueAllocation;
	}

	public void setNewIssueAllocation(NewIssueAllocation2 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
	}

	@XmlElement(name = "SvgsInvstmtPlan")
	public List<InvestmentPlan12> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan;
	}

	public void setSavingsInvestmentPlan(List<InvestmentPlan12> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = savingsInvestmentPlan;
	}

	@XmlElement(name = "WdrwlInvstmtPlan")
	public List<InvestmentPlan12> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan;
	}

	public void setWithdrawalInvestmentPlan(List<InvestmentPlan12> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = withdrawalInvestmentPlan;
	}

	@XmlElement(name = "CshSttlm")
	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement;
	}

	public void setCashSettlement(List<CashSettlement1> cashSettlement) {
		this.cashSettlement = cashSettlement;
	}

	@XmlElement(name = "SvcLvlAgrmt")
	public List<DocumentToSend3> getServiceLevelAgreement() {
		return serviceLevelAgreement;
	}

	public void setServiceLevelAgreement(List<DocumentToSend3> serviceLevelAgreement) {
		this.serviceLevelAgreement = serviceLevelAgreement;
	}

	@XmlElement(name = "AddtlInf")
	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<AccountRestrictions1> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlElement(name = "MktPrctcVrsn")
	public MarketPracticeVersion1 getMarketPracticeVersion() {
		return marketPracticeVersion;
	}

	public void setMarketPracticeVersion(MarketPracticeVersion1 marketPracticeVersion) {
		this.marketPracticeVersion = marketPracticeVersion;
	}

	@XmlElement(name = "Xtnsn")
	public List<Extension1> getExtension() {
		return extension;
	}

	public void setExtension(List<Extension1> extension) {
		this.extension = extension;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.06.06")
	static public class Document {
		@XmlElement(name = "AcctDtlsConf", required = true)
		public AccountDetailsConfirmationV06 messageBody;
	}
}