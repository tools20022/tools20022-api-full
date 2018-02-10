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
import com.tools20022.repository.area.AccountManagementArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer, eg, a registrar, transfer agent or custodian bank sends
 * the AccountDetailsConfirmation message to an account owner, eg, an investor
 * to confirm the opening of an investment fund account, execution of an
 * AccountModificationInstruction or to return information requested in a
 * GetAccountDetails message.<br>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmMessageIdentification
 * AccountDetailsConfirmationV02.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmOrderReference
 * AccountDetailsConfirmationV02.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmRelatedReference
 * AccountDetailsConfirmationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmConfirmationDetails
 * AccountDetailsConfirmationV02.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmInvestmentAccount
 * AccountDetailsConfirmationV02.mmInvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmAccountParties
 * AccountDetailsConfirmationV02.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmIntermediaries
 * AccountDetailsConfirmationV02.mmIntermediaries}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmPlacement
 * AccountDetailsConfirmationV02.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmNewIssueAllocation
 * AccountDetailsConfirmationV02.mmNewIssueAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV02.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV02.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmCashSettlement
 * AccountDetailsConfirmationV02.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmServiceLevelAgreement
 * AccountDetailsConfirmationV02.mmServiceLevelAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02#mmExtension
 * AccountDetailsConfirmationV02.mmExtension}</li>
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
 * xmlTag} = "AcctDtlsConfV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementArchive
 * AccountManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.002.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInvestmentAccountRule#forAccountDetailsConfirmationV02
 * ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountDetailsConfirmationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to an account owner, eg, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03
 * AccountDetailsConfirmationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountDetailsConfirmationV02", propOrder = {"messageIdentification", "orderReference", "relatedReference", "confirmationDetails", "investmentAccount", "accountParties", "intermediaries", "placement", "newIssueAllocation",
		"savingsInvestmentPlan", "withdrawalInvestmentPlan", "cashSettlement", "serviceLevelAgreement", "extension"})
public class AccountDetailsConfirmationV02 {

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
	 * definition} = "Identifies the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Identifies the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getMessageIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrdrRef")
	protected InvestmentFundOrder4 orderReference;
	/**
	 * 
	 <p>
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
	 * definition} = "Identifies a related order."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrderReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Identifies a related order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrder4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getOrderReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
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
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getRelatedReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ConfDtls", required = true)
	protected AccountManagementConfirmation1 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountManagementConfirmation1
	 * AccountManagementConfirmation1}</li>
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
	 * "Provide detailed information about the request or instruction which triggered this confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Provide detailed information about the request or instruction which triggered this confirmation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountManagementConfirmation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getConfirmationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "InvstmtAcct")
	protected InvestmentAccount27 investmentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27
	 * InvestmentAccount27}</li>
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
	 * "Confirmation of the information related to a selected investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInvestmentAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvstmtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccount";
			definition = "Confirmation of the information related to a selected investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentAccount27.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getInvestmentAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctPties")
	protected AccountParties5 accountParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AccountParties5
	 * AccountParties5}</li>
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
	 * "Confirmation of information related to parties who are related to a selected investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountParties = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountParties";
			definition = "Confirmation of information related to parties who are related to a selected investment account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getAccountParties", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Intrmies")
	protected List<Intermediary12> intermediaries;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Intermediary12
	 * Intermediary12}</li>
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
	 * "Confirmation of information related to intermediaries who are related to a selected investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIntermediaries = new MMMessageBuildingBlock() {
		{
			xmlTag = "Intrmies";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediaries";
			definition = "Confirmation of information related to intermediaries who are related to a selected investment account.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> Intermediary12.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getIntermediaries", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Plcmnt")
	protected ReferredAgent1 placement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ReferredAgent1
	 * ReferredAgent1}</li>
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
	 * definition} = "Placement agent for the hedge fund industry."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPlacement = new MMMessageBuildingBlock() {
		{
			xmlTag = "Plcmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Placement agent for the hedge fund industry.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReferredAgent1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getPlacement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NewIsseAllcn")
	protected NewIssueAllocation1 newIssueAllocation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NewIssueAllocation1
	 * NewIssueAllocation1}</li>
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
	 * "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNewIssueAllocation = new MMMessageBuildingBlock() {
		{
			xmlTag = "NewIsseAllcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssueAllocation";
			definition = "Eligibility conditions applicable when there is an allocation of new issues for hedge fund account opening.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NewIssueAllocation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getNewIssueAllocation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SvgsInvstmtPlan")
	protected List<InvestmentPlan4> savingsInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan4
	 * InvestmentPlan4}</li>
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
	 * "Confirmation of the information related to a savings plan that is related to a selected investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSavingsInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvgsInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsInvestmentPlan";
			definition = "Confirmation of the information related to a savings plan that is related to a selected investment account.";
			maxOccurs = 50;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getSavingsInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "WdrwlInvstmtPlan")
	protected List<InvestmentPlan4> withdrawalInvestmentPlan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvestmentPlan4
	 * InvestmentPlan4}</li>
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
	 * "Confirmation of the information related to a withrawal plan that is related to a selected investment account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmWithdrawalInvestmentPlan = new MMMessageBuildingBlock() {
		{
			xmlTag = "WdrwlInvstmtPlan";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalInvestmentPlan";
			definition = "Confirmation of the information related to a withrawal plan that is related to a selected investment account.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentPlan4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getWithdrawalInvestmentPlan", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CshSttlm")
	protected InvestmentFundCashSettlementInformation3 cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation3
	 * InvestmentFundCashSettlementInformation3}</li>
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
	 * "Confirmation of the cash settlement standing instruction associated to the investment fund transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCashSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Confirmation of the cash settlement standing instruction associated to the investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundCashSettlementInformation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getCashSettlement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SvcLvlAgrmt")
	protected List<DocumentToSend1> serviceLevelAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.DocumentToSend1
	 * DocumentToSend1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmServiceLevelAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "SvcLvlAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceLevelAgreement";
			definition = "Identifies documents to be provided for the account opening.";
			maxOccurs = 30;
			minOccurs = 0;
			complexType_lazy = () -> DocumentToSend1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountDetailsConfirmationV02.class.getMethod("getServiceLevelAgreement", new Class[]{});
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
				return AccountDetailsConfirmationV02.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInvestmentAccountRule.forAccountDetailsConfirmationV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountDetailsConfirmationV02";
				definition = "Scope\r\nAn account servicer, eg, a registrar, transfer agent or custodian bank sends the AccountDetailsConfirmation message to an account owner, eg, an investor to confirm the opening of an investment fund account, execution of an AccountModificationInstruction or to return information requested in a GetAccountDetails message.\r\nUsage\r\nThe AccountDetailsConfirmation message is used to confirm the opening of an account, modification of an account or the provision of information requested in a previously sent GetAccountDetails message. The message contains detailed information relevant to the opened account.\r\nWhen the AccountDetailsConfirmation is used to confirm execution of an AccountModificationInstruction message, it contains the modified subsets of account details that were specified in the AccountModificationInstruction.\r\nWhen the AccountDetailsConfirmation is used to reply to a GetAccountDetails message, it returns the selected subsets of account details that were specified in the GetAccountDetails message.";
				nextVersions_lazy = () -> Arrays.asList(AccountDetailsConfirmationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctDtlsConfV02";
				businessArea_lazy = () -> AccountManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmMessageIdentification, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmOrderReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmRelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmConfirmationDetails,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmInvestmentAccount, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmAccountParties,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmIntermediaries, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmPlacement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmNewIssueAllocation, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmSavingsInvestmentPlan,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmWithdrawalInvestmentPlan, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmCashSettlement,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmServiceLevelAgreement, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV02.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "002";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountDetailsConfirmationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public AccountDetailsConfirmationV02 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<InvestmentFundOrder4> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public AccountDetailsConfirmationV02 setOrderReference(InvestmentFundOrder4 orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public AccountDetailsConfirmationV02 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public AccountManagementConfirmation1 getConfirmationDetails() {
		return confirmationDetails;
	}

	public AccountDetailsConfirmationV02 setConfirmationDetails(AccountManagementConfirmation1 confirmationDetails) {
		this.confirmationDetails = Objects.requireNonNull(confirmationDetails);
		return this;
	}

	public Optional<InvestmentAccount27> getInvestmentAccount() {
		return investmentAccount == null ? Optional.empty() : Optional.of(investmentAccount);
	}

	public AccountDetailsConfirmationV02 setInvestmentAccount(InvestmentAccount27 investmentAccount) {
		this.investmentAccount = investmentAccount;
		return this;
	}

	public Optional<AccountParties5> getAccountParties() {
		return accountParties == null ? Optional.empty() : Optional.of(accountParties);
	}

	public AccountDetailsConfirmationV02 setAccountParties(AccountParties5 accountParties) {
		this.accountParties = accountParties;
		return this;
	}

	public List<Intermediary12> getIntermediaries() {
		return intermediaries == null ? intermediaries = new ArrayList<>() : intermediaries;
	}

	public AccountDetailsConfirmationV02 setIntermediaries(List<Intermediary12> intermediaries) {
		this.intermediaries = Objects.requireNonNull(intermediaries);
		return this;
	}

	public Optional<ReferredAgent1> getPlacement() {
		return placement == null ? Optional.empty() : Optional.of(placement);
	}

	public AccountDetailsConfirmationV02 setPlacement(ReferredAgent1 placement) {
		this.placement = placement;
		return this;
	}

	public Optional<NewIssueAllocation1> getNewIssueAllocation() {
		return newIssueAllocation == null ? Optional.empty() : Optional.of(newIssueAllocation);
	}

	public AccountDetailsConfirmationV02 setNewIssueAllocation(NewIssueAllocation1 newIssueAllocation) {
		this.newIssueAllocation = newIssueAllocation;
		return this;
	}

	public List<InvestmentPlan4> getSavingsInvestmentPlan() {
		return savingsInvestmentPlan == null ? savingsInvestmentPlan = new ArrayList<>() : savingsInvestmentPlan;
	}

	public AccountDetailsConfirmationV02 setSavingsInvestmentPlan(List<InvestmentPlan4> savingsInvestmentPlan) {
		this.savingsInvestmentPlan = Objects.requireNonNull(savingsInvestmentPlan);
		return this;
	}

	public List<InvestmentPlan4> getWithdrawalInvestmentPlan() {
		return withdrawalInvestmentPlan == null ? withdrawalInvestmentPlan = new ArrayList<>() : withdrawalInvestmentPlan;
	}

	public AccountDetailsConfirmationV02 setWithdrawalInvestmentPlan(List<InvestmentPlan4> withdrawalInvestmentPlan) {
		this.withdrawalInvestmentPlan = Objects.requireNonNull(withdrawalInvestmentPlan);
		return this;
	}

	public Optional<InvestmentFundCashSettlementInformation3> getCashSettlement() {
		return cashSettlement == null ? Optional.empty() : Optional.of(cashSettlement);
	}

	public AccountDetailsConfirmationV02 setCashSettlement(InvestmentFundCashSettlementInformation3 cashSettlement) {
		this.cashSettlement = cashSettlement;
		return this;
	}

	public List<DocumentToSend1> getServiceLevelAgreement() {
		return serviceLevelAgreement == null ? serviceLevelAgreement = new ArrayList<>() : serviceLevelAgreement;
	}

	public AccountDetailsConfirmationV02 setServiceLevelAgreement(List<DocumentToSend1> serviceLevelAgreement) {
		this.serviceLevelAgreement = Objects.requireNonNull(serviceLevelAgreement);
		return this;
	}

	public List<Extension1> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public AccountDetailsConfirmationV02 setExtension(List<Extension1> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.002.001.02")
	static public class Document {
		@XmlElement(name = "AcctDtlsConfV02", required = true)
		public AccountDetailsConfirmationV02 messageBody;
	}
}