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
import com.tools20022.repository.msg.CashAccount7;
import com.tools20022.repository.msg.FinancialInstitution2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementMethod
 * SettlementInformation6.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmSettlementAccount
 * SettlementInformation6.mmSettlementAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmClearingSystem
 * SettlementInformation6.mmClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructingReimbursementAgent
 * SettlementInformation6.mmInstructingReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructingReimbursementAgentAccount
 * SettlementInformation6.mmInstructingReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructedReimbursementAgent
 * SettlementInformation6.mmInstructedReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmInstructedReimbursementAgentAccount
 * SettlementInformation6.mmInstructedReimbursementAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmThirdReimbursementAgent
 * SettlementInformation6.mmThirdReimbursementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementInformation6#mmThirdReimbursementAgentAccount
 * SettlementInformation6.mmThirdReimbursementAgentAccount}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementInformation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further information required for the settlement the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethod1Rule#forSettlementInformation6
 * ConstraintSettlementMethod1Rule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethod2Part1Rule#forSettlementInformation6
 * ConstraintSettlementMethod2Part1Rule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethod2Part2Rule#forSettlementInformation6
 * ConstraintSettlementMethod2Part2Rule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementMethod3Rule#forSettlementInformation6
 * ConstraintSettlementMethod3Rule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule#forSettlementInformation6
 * ConstraintInstructingReimbursementAgentAccountRule.forSettlementInformation6}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule#forSettlementInformation6
 * ConstraintInstructedReimbursementAgentAccountRule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentRule#forSettlementInformation6
 * ConstraintThirdReimbursementAgentRule.forSettlementInformation6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentAccountRule#forSettlementInformation6
 * ConstraintThirdReimbursementAgentAccountRule.forSettlementInformation6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementInformation6", propOrder = {"settlementMethod", "settlementAccount", "clearingSystem", "instructingReimbursementAgent", "instructingReimbursementAgentAccount", "instructedReimbursementAgent",
		"instructedReimbursementAgentAccount", "thirdReimbursementAgent", "thirdReimbursementAgentAccount"})
public class SettlementInformation6 {

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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to settle the (batch of) payment instructions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementInformation6, SettlementMethod1Code> mmSettlementMethod = new MMMessageAttribute<SettlementInformation6, SettlementMethod1Code>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method used to settle the (batch of) payment instructions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementMethod1Code.mmObject();
		}

		@Override
		public SettlementMethod1Code getValue(SettlementInformation6 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(SettlementInformation6 obj, SettlementMethod1Code value) {
			obj.setSettlementMethod(value);
		}
	};
	@XmlElement(name = "SttlmAcct")
	protected CashAccount7 settlementAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A specific purpose account used to post debit and credit entries as a result of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>> mmSettlementAccount = new MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "SttlmAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAccount";
			definition = "A specific purpose account used to post debit and credit entries as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(SettlementInformation6 obj) {
			return obj.getSettlementAccount();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<CashAccount7> value) {
			obj.setSettlementAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrSys")
	protected ClearingSystemIdentification1Choice clearingSystem;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSys"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is processed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<ClearingSystemIdentification1Choice>> mmClearingSystem = new MMMessageAssociationEnd<SettlementInformation6, Optional<ClearingSystemIdentification1Choice>>() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
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

		@Override
		public Optional<ClearingSystemIdentification1Choice> getValue(SettlementInformation6 obj) {
			return obj.getClearingSystem();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<ClearingSystemIdentification1Choice> value) {
			obj.setClearingSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgt")
	protected FinancialInstitution2 instructingReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>> mmInstructingReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgent";
			definition = "Agent through which the instructing agent will reimburse the instructed agent.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitution2.mmObject();
		}

		@Override
		public Optional<FinancialInstitution2> getValue(SettlementInformation6 obj) {
			return obj.getInstructingReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<FinancialInstitution2> value) {
			obj.setInstructingReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgRmbrsmntAgtAcct")
	protected CashAccount7 instructingReimbursementAgentAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgRmbrsmntAgtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>> mmInstructingReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "InstgRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructing reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(SettlementInformation6 obj) {
			return obj.getInstructingReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<CashAccount7> value) {
			obj.setInstructingReimbursementAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgt")
	protected FinancialInstitution2 instructedReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent at which the instructed agent will be reimbursed.\n\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>> mmInstructedReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgent";
			definition = "Agent at which the instructed agent will be reimbursed.\n\nUsage: If InstructedReimbursementAgent contains a branch of the InstructedAgent, then the instructed agent will claim reimbursement from that branch/will be paid by that branch.\n\nUsage: If InstructingAgent and InstructedAgent have the same reimbursement agent, then only InstructingReimbursementAgent must be used.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitution2.mmObject();
		}

		@Override
		public Optional<FinancialInstitution2> getValue(SettlementInformation6 obj) {
			return obj.getInstructedReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<FinancialInstitution2> value) {
			obj.setInstructedReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "InstdRmbrsmntAgtAcct")
	protected CashAccount7 instructedReimbursementAgentAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdRmbrsmntAgtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>> mmInstructedReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "InstdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the instructed reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(SettlementInformation6 obj) {
			return obj.getInstructedReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<CashAccount7> value) {
			obj.setInstructedReimbursementAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgt")
	protected FinancialInstitution2 thirdReimbursementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstitution2
	 * FinancialInstitution2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instructed agent's branch where the amount of money will be made available when different from the instructed reimbursement agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>> mmThirdReimbursementAgent = new MMMessageAssociationEnd<SettlementInformation6, Optional<FinancialInstitution2>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgent";
			definition = "Instructed agent's branch where the amount of money will be made available when different from the instructed reimbursement agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstitution2.mmObject();
		}

		@Override
		public Optional<FinancialInstitution2> getValue(SettlementInformation6 obj) {
			return obj.getThirdReimbursementAgent();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<FinancialInstitution2> value) {
			obj.setThirdReimbursementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "ThrdRmbrsmntAgtAcct")
	protected CashAccount7 thirdReimbursementAgentAccount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementInformation6
	 * SettlementInformation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdRmbrsmntAgtAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdReimbursementAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>> mmThirdReimbursementAgentAccount = new MMMessageAssociationEnd<SettlementInformation6, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> CashSettlementInstructionPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementInformation6.mmObject();
			isDerived = false;
			xmlTag = "ThrdRmbrsmntAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdReimbursementAgentAccount";
			definition = "Unambiguous identification of the account of the third reimbursement agent account at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(SettlementInformation6 obj) {
			return obj.getThirdReimbursementAgentAccount();
		}

		@Override
		public void setValue(SettlementInformation6 obj, Optional<CashAccount7> value) {
			obj.setThirdReimbursementAgentAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementInformation6.mmSettlementMethod, com.tools20022.repository.msg.SettlementInformation6.mmSettlementAccount,
						com.tools20022.repository.msg.SettlementInformation6.mmClearingSystem, com.tools20022.repository.msg.SettlementInformation6.mmInstructingReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation6.mmInstructingReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation6.mmInstructedReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation6.mmInstructedReimbursementAgentAccount, com.tools20022.repository.msg.SettlementInformation6.mmThirdReimbursementAgent,
						com.tools20022.repository.msg.SettlementInformation6.mmThirdReimbursementAgentAccount);
				trace_lazy = () -> CashSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementMethod1Rule.forSettlementInformation6,
						com.tools20022.repository.constraints.ConstraintSettlementMethod2Part1Rule.forSettlementInformation6, com.tools20022.repository.constraints.ConstraintSettlementMethod2Part2Rule.forSettlementInformation6,
						com.tools20022.repository.constraints.ConstraintSettlementMethod3Rule.forSettlementInformation6, com.tools20022.repository.constraints.ConstraintInstructingReimbursementAgentAccountRule.forSettlementInformation6,
						com.tools20022.repository.constraints.ConstraintInstructedReimbursementAgentAccountRule.forSettlementInformation6,
						com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentRule.forSettlementInformation6, com.tools20022.repository.constraints.ConstraintThirdReimbursementAgentAccountRule.forSettlementInformation6);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementInformation6";
				definition = "Further information required for the settlement the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementMethod1Code getSettlementMethod() {
		return settlementMethod;
	}

	public SettlementInformation6 setSettlementMethod(SettlementMethod1Code settlementMethod) {
		this.settlementMethod = Objects.requireNonNull(settlementMethod);
		return this;
	}

	public Optional<CashAccount7> getSettlementAccount() {
		return settlementAccount == null ? Optional.empty() : Optional.of(settlementAccount);
	}

	public SettlementInformation6 setSettlementAccount(CashAccount7 settlementAccount) {
		this.settlementAccount = settlementAccount;
		return this;
	}

	public Optional<ClearingSystemIdentification1Choice> getClearingSystem() {
		return clearingSystem == null ? Optional.empty() : Optional.of(clearingSystem);
	}

	public SettlementInformation6 setClearingSystem(ClearingSystemIdentification1Choice clearingSystem) {
		this.clearingSystem = clearingSystem;
		return this;
	}

	public Optional<FinancialInstitution2> getInstructingReimbursementAgent() {
		return instructingReimbursementAgent == null ? Optional.empty() : Optional.of(instructingReimbursementAgent);
	}

	public SettlementInformation6 setInstructingReimbursementAgent(FinancialInstitution2 instructingReimbursementAgent) {
		this.instructingReimbursementAgent = instructingReimbursementAgent;
		return this;
	}

	public Optional<CashAccount7> getInstructingReimbursementAgentAccount() {
		return instructingReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructingReimbursementAgentAccount);
	}

	public SettlementInformation6 setInstructingReimbursementAgentAccount(CashAccount7 instructingReimbursementAgentAccount) {
		this.instructingReimbursementAgentAccount = instructingReimbursementAgentAccount;
		return this;
	}

	public Optional<FinancialInstitution2> getInstructedReimbursementAgent() {
		return instructedReimbursementAgent == null ? Optional.empty() : Optional.of(instructedReimbursementAgent);
	}

	public SettlementInformation6 setInstructedReimbursementAgent(FinancialInstitution2 instructedReimbursementAgent) {
		this.instructedReimbursementAgent = instructedReimbursementAgent;
		return this;
	}

	public Optional<CashAccount7> getInstructedReimbursementAgentAccount() {
		return instructedReimbursementAgentAccount == null ? Optional.empty() : Optional.of(instructedReimbursementAgentAccount);
	}

	public SettlementInformation6 setInstructedReimbursementAgentAccount(CashAccount7 instructedReimbursementAgentAccount) {
		this.instructedReimbursementAgentAccount = instructedReimbursementAgentAccount;
		return this;
	}

	public Optional<FinancialInstitution2> getThirdReimbursementAgent() {
		return thirdReimbursementAgent == null ? Optional.empty() : Optional.of(thirdReimbursementAgent);
	}

	public SettlementInformation6 setThirdReimbursementAgent(FinancialInstitution2 thirdReimbursementAgent) {
		this.thirdReimbursementAgent = thirdReimbursementAgent;
		return this;
	}

	public Optional<CashAccount7> getThirdReimbursementAgentAccount() {
		return thirdReimbursementAgentAccount == null ? Optional.empty() : Optional.of(thirdReimbursementAgentAccount);
	}

	public SettlementInformation6 setThirdReimbursementAgentAccount(CashAccount7 thirdReimbursementAgentAccount) {
		this.thirdReimbursementAgentAccount = thirdReimbursementAgentAccount;
		return this;
	}
}