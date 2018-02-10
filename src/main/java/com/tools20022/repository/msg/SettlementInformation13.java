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
import com.tools20022.repository.choice.ClearingSystemIdentification3Choice;
import com.tools20022.repository.codeset.SettlementMethod1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the settlement of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementMethod
 * SettlementInformation13.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmSettlementAccount
 * SettlementInformation13.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmClearingSystem
 * SettlementInformation13.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructingReimbursementAgent
 * SettlementInformation13.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructingReimbursementAgentAccount
 * SettlementInformation13.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructedReimbursementAgent
 * SettlementInformation13.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmInstructedReimbursementAgentAccount
 * SettlementInformation13.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmThirdReimbursementAgent
 * SettlementInformation13.mmThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation13#mmThirdReimbursementAgentAccount
 * SettlementInformation13.mmThirdReimbursementAgentAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashSettlement
 * CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentRule#forSettlementInformation13
 * ConstraintThirdReimbursementAgentRule.forSettlementInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethodAgentRule#forSettlementInformation13
 * ConstraintSettlementMethodAgentRule.forSettlementInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethodCoverRule#forSettlementInformation13
 * ConstraintSettlementMethodCoverRule.forSettlementInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethodCoverAgentRule#forSettlementInformation13
 * ConstraintSettlementMethodCoverAgentRule.forSettlementInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethodClearingRule#forSettlementInformation13
 * ConstraintSettlementMethodClearingRule.forSettlementInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule#forSettlementInformation13
 * ConstraintInstructingReimbursementAgentAccountRule.forSettlementInformation13
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule#forSettlementInformation13
 * ConstraintInstructedReimbursementAgentAccountRule.forSettlementInformation13}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentAccountRule#forSettlementInformation13
 * ConstraintThirdReimbursementAgentAccountRule.forSettlementInformation13}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the settlement of the instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInformation13", propOrder = {"settlementMethod", "settlementAccount", "clearingSystem", "instructingReimbursementAgent", "instructingReimbursementAgentAccount", "instructedReimbursementAgent",
		"instructedReimbursementAgentAccount", "thirdReimbursementAgent", "thirdReimbursementAgentAccount"})
public class SettlementInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmMtd", required = true)
	protected SettlementMethod1Code settlementMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
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
	@XmlElement(name = "SttlmAcct")
	protected CashAccount16 settlementAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "ClrSys")
	protected ClearingSystemIdentification3Choice clearingSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemIdentification3Choice
	 * ClearingSystemIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "ClrSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystem";
			definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ClearingSystemIdentification3Choice.mmObject();
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructingReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
	 * "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgtAcct")
	protected CashAccount16 instructingReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 instructedReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
	 * "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructedReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgtAcct")
	protected CashAccount16 instructedReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgt")
	protected BranchAndFinancialInstitutionIdentification4 thirdReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
	 * "Agent at which the instructed agent will be reimbursed.\nUsage: If ThirdReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdReimbursementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\nUsage: If ThirdReimbursementAgent contains a branch of the InstructedAgent, then the party in InstructedAgent will claim reimbursement from that branch/will be paid by that branch.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount16 thirdReimbursementAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlementInstructionPartyRole#mmCashAccount
	 * CashSettlementInstructionPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation13
	 * SettlementInformation13}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation13.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInformation13.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation13.mmSettlementAccount,
						com.tools20022.repository.msg.SettlementInformation13.mmClearingSystem, com.tools20022.repository.msg.SettlementInformation13.mmInstructingReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation13.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation13.mmInstructedReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation13.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation13.mmThirdReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation13.mmThirdReimbursementAgentAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentRule.forSettlementInformation13,
						com.tools20022.repository.constraints.ConstraintSettlementMethodAgentRule.forSettlementInformation13, com.tools20022.repository.constraints.ConstraintSettlementMethodCoverRule.forSettlementInformation13,
						com.tools20022.repository.constraints.ConstraintSettlementMethodCoverAgentRule.forSettlementInformation13, com.tools20022.repository.constraints.ConstraintSettlementMethodClearingRule.forSettlementInformation13,
						com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule.forSettlementInformation13,
						com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule.forSettlementInformation13,
						com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentAccountRule.forSettlementInformation13);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementInformation13";
				definition = "Set of elements used to provide information on the settlement of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementMethod1Code getSettlementMethod() {
		return settlementMethod;
	}

	public SettlementInformation13 setSettlementMethod(SettlementMethod1Code settlementMethod) {
		this.settlementMethod = Objects.requireNonNull(settlementMethod);
		return this;
	}

	public Optional<CashAccount16> getSettlementAccount() {
		return settlementAccount == null ? Optional.empty() : Optional.of(settlementAccount);
	}

	public SettlementInformation13 setSettlementAccount(com.tools20022.repository.msg.CashAccount16 settlementAccount) {
		this.settlementAccount = settlementAccount;
		return this;
	}

	public Optional<ClearingSystemIdentification3Choice> getClearingSystem() {
		return clearingSystem == null ? Optional.empty() : Optional.of(clearingSystem);
	}

	public SettlementInformation13 setClearingSystem(ClearingSystemIdentification3Choice clearingSystem) {
		this.clearingSystem = clearingSystem;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructingReimbursementAgent() {
		return instructingReimbursementAgent == null ? Optional.empty() : Optional.of(instructingReimbursementAgent);
	}

	public SettlementInformation13 setInstructingReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 instructingReimbursementAgent) {
		this.instructingReimbursementAgent = instructingReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getInstructingReimbursementAgentAccount() {
		return instructingReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructingReimbursementAgentAccount);
	}

	public SettlementInformation13 setInstructingReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount16 instructingReimbursementAgentAccount) {
		this.instructingReimbursementAgentAccount = instructingReimbursementAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getInstructedReimbursementAgent() {
		return instructedReimbursementAgent == null ? Optional.empty() : Optional.of(instructedReimbursementAgent);
	}

	public SettlementInformation13 setInstructedReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 instructedReimbursementAgent) {
		this.instructedReimbursementAgent = instructedReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getInstructedReimbursementAgentAccount() {
		return instructedReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructedReimbursementAgentAccount);
	}

	public SettlementInformation13 setInstructedReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount16 instructedReimbursementAgentAccount) {
		this.instructedReimbursementAgentAccount = instructedReimbursementAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getThirdReimbursementAgent() {
		return thirdReimbursementAgent == null ? Optional.empty() : Optional.of(thirdReimbursementAgent);
	}

	public SettlementInformation13 setThirdReimbursementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 thirdReimbursementAgent) {
		this.thirdReimbursementAgent = thirdReimbursementAgent;
		return this;
	}

	public Optional<CashAccount16> getThirdReimbursementAgentAccount() {
		return thirdReimbursementAgentAccount == null ? Optional.empty() : Optional.of(thirdReimbursementAgentAccount);
	}

	public SettlementInformation13 setThirdReimbursementAgentAccount(com.tools20022.repository.msg.CashAccount16 thirdReimbursementAgentAccount) {
		this.thirdReimbursementAgentAccount = thirdReimbursementAgentAccount;
		return this;
	}
}