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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ClearingSystemIdentification1Choice;
import com.tools20022.repository.codeset.SettlementMethod1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Further information required for the settlement the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementMethod
 * SettlementInformation3.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmSettlementAccount
 * SettlementInformation3.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmClearingSystem
 * SettlementInformation3.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructingReimbursementAgent
 * SettlementInformation3.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructingReimbursementAgentAccount
 * SettlementInformation3.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructedReimbursementAgent
 * SettlementInformation3.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmInstructedReimbursementAgentAccount
 * SettlementInformation3.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmThirdReimbursementAgent
 * SettlementInformation3.mmThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation3#mmThirdReimbursementAgentAccount
 * SettlementInformation3.mmThirdReimbursementAgentAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information required for the settlement the transaction."</li>
 * </ul>
 */
public class SettlementInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementMethod1Code settlementMethod;
	/**
	 * Method used to settle the (batch of) payment instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementMethod1Code
	 * SettlementMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementMethod
	 * CashSettlement.mmSettlementMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementMethod;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethod1Code.mmObject();
		}
	};
	protected CashAccount7 settlementAccount;
	/**
	 * A specific purpose account used to post debit and credit entries as a
	 * result of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected ClearingSystemIdentification1Choice clearingSystem;
	/**
	 * Specification of a pre-agreed offering between clearing agents or the
	 * channel through which the payment instruction is processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification1Choice
	 * ClearingSystemIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingSystem = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystem.mmObject();
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification1Choice.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 instructingReimbursementAgent;
	/**
	 * Specifies the agent through which the instructing agent will reimburse
	 * the instructed agent.
	 * 
	 * Usage: If the instructing and instructed agents have the same
	 * reimbursement agent, then only InstructingReimbursementAgent must be
	 * used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If the instructing and instructed agents have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Specifies the agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If the instructing and instructed agents have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 instructingReimbursementAgentAccount;
	/**
	 * Unambiguous identification of the account of the instructing
	 * reimbursement agent account at its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 instructedReimbursementAgent;
	/**
	 * Agent at which the instructed agent will be reimbursed.
	 * 
	 * Usage: If InstructedReimbursementAgent contains a branch of the
	 * InstructedAgent, then the instructed agent will claim reimbursement from
	 * that branch/will be paid by that branch.
	 * 
	 * Usage: If InstructingAgent and InstructedAgent have the same
	 * reimbursement agent, then only InstructingReimbursementAgent must be
	 * used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent at which the instructed agent will be reimbursed.\n\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\n\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 instructedReimbursementAgentAccount;
	/**
	 * Unambiguous identification of the account of the instructed reimbursement
	 * agent account at its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification3 thirdReimbursementAgent;
	/**
	 * Specifies the branch of the instructed agent where the amount of money
	 * will be made available when different from the instructed reimbursement
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the branch of the instructed agent where the amount of money will be made available when different from the instructed reimbursement agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgent";
			definition = "Specifies the branch of the instructed agent where the amount of money will be made available when different from the instructed reimbursement agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3.mmObject();
		}
	};
	protected CashAccount7 thirdReimbursementAgentAccount;
	/**
	 * Unambiguous identification of the account of the third reimbursement
	 * agent account at its servicing agent in the payment chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
	 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation3
	 * SettlementInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdReimbursementAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlementInstructionPartyRole.mmCashAccount;
			componentContext_lazy = () -> SettlementInformation3.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementInformation3.mmSettlementMethod, SettlementInformation3.mmSettlementAccount, SettlementInformation3.mmClearingSystem,
						SettlementInformation3.mmInstructingReimbursementAgent, SettlementInformation3.mmInstructingReimbursementAgentAccount, SettlementInformation3.mmInstructedReimbursementAgent,
						SettlementInformation3.mmInstructedReimbursementAgentAccount, SettlementInformation3.mmThirdReimbursementAgent, SettlementInformation3.mmThirdReimbursementAgentAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInformation3";
				definition = "Further information required for the settlement the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementMethod1Code getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(SettlementMethod1Code settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public CashAccount7 getSettlementAccount() {
		return settlementAccount;
	}

	public void setSettlementAccount(com.tools20022.repository.msg.CashAccount7 settlementAccount) {
		this.settlementAccount = settlementAccount;
	}

	public ClearingSystemIdentification1Choice getClearingSystem() {
		return clearingSystem;
	}

	public void setClearingSystem(ClearingSystemIdentification1Choice clearingSystem) {
		this.clearingSystem = clearingSystem;
	}

	public BranchAndFinancialInstitutionIdentification3 getInstructingReimbursementAgent() {
		return instructingReimbursementAgent;
	}

	public void setInstructingReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 instructingReimbursementAgent) {
		this.instructingReimbursementAgent = instructingReimbursementAgent;
	}

	public CashAccount7 getInstructingReimbursementAgentAccount() {
		return instructingReimbursementAgentAccount;
	}

	public void setInstructingReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount7 instructingReimbursementAgentAccount) {
		this.instructingReimbursementAgentAccount = instructingReimbursementAgentAccount;
	}

	public BranchAndFinancialInstitutionIdentification3 getInstructedReimbursementAgent() {
		return instructedReimbursementAgent;
	}

	public void setInstructedReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 instructedReimbursementAgent) {
		this.instructedReimbursementAgent = instructedReimbursementAgent;
	}

	public CashAccount7 getInstructedReimbursementAgentAccount() {
		return instructedReimbursementAgentAccount;
	}

	public void setInstructedReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount7 instructedReimbursementAgentAccount) {
		this.instructedReimbursementAgentAccount = instructedReimbursementAgentAccount;
	}

	public BranchAndFinancialInstitutionIdentification3 getThirdReimbursementAgent() {
		return thirdReimbursementAgent;
	}

	public void setThirdReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3 thirdReimbursementAgent) {
		this.thirdReimbursementAgent = thirdReimbursementAgent;
	}

	public CashAccount7 getThirdReimbursementAgentAccount() {
		return thirdReimbursementAgentAccount;
	}

	public void setThirdReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount7 thirdReimbursementAgentAccount) {
		this.thirdReimbursementAgentAccount = thirdReimbursementAgentAccount;
	}
}