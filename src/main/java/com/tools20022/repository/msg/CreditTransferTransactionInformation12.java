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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
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
 * Set of elements used to provide information specific to the individual
 * transaction(s) included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmUltimateDebtor
 * CreditTransferTransactionInformation12.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmInitiatingParty
 * CreditTransferTransactionInformation12.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmDebtor
 * CreditTransferTransactionInformation12.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmDebtorAccount
 * CreditTransferTransactionInformation12.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmDebtorAgent
 * CreditTransferTransactionInformation12.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmDebtorAgentAccount
 * CreditTransferTransactionInformation12.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmPreviousInstructingAgent
 * CreditTransferTransactionInformation12.mmPreviousInstructingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmPreviousInstructingAgentAccount
 * CreditTransferTransactionInformation12.mmPreviousInstructingAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent1
 * CreditTransferTransactionInformation12.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent1Account
 * CreditTransferTransactionInformation12.mmIntermediaryAgent1Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent2
 * CreditTransferTransactionInformation12.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent2Account
 * CreditTransferTransactionInformation12.mmIntermediaryAgent2Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent3
 * CreditTransferTransactionInformation12.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmIntermediaryAgent3Account
 * CreditTransferTransactionInformation12.mmIntermediaryAgent3Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmCreditorAgent
 * CreditTransferTransactionInformation12.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmCreditorAgentAccount
 * CreditTransferTransactionInformation12.mmCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmCreditor
 * CreditTransferTransactionInformation12.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmCreditorAccount
 * CreditTransferTransactionInformation12.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmUltimateCreditor
 * CreditTransferTransactionInformation12.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmRemittanceInformation
 * CreditTransferTransactionInformation12.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12#mmInstructedAmount
 * CreditTransferTransactionInformation12.mmInstructedAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransactionInformation12
 * ConstraintUltimateDebtorGuideline.forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransactionInformation12
 * ConstraintUltimateCreditorGuideline.forCreditTransferTransactionInformation12
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule#forCreditTransferTransactionInformation12
 * ConstraintIntermediaryAgent2Rule.forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransactionInformation12
 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent1AccountRule#forCreditTransferTransactionInformation12
 * ConstraintIntermediaryAgent1AccountRule.
 * forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent2AccountRule#forCreditTransferTransactionInformation12
 * ConstraintIntermediaryAgent2AccountRule.
 * forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3AccountRule#forCreditTransferTransactionInformation12
 * ConstraintIntermediaryAgent3AccountRule.
 * forCreditTransferTransactionInformation12}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPreviousInstructingAgentAccountRule#forCreditTransferTransactionInformation12
 * ConstraintPreviousInstructingAgentAccountRule.
 * forCreditTransferTransactionInformation12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransferTransactionInformation12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information specific to the individual transaction(s) included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditTransferTransactionInformation12", propOrder = {"ultimateDebtor", "initiatingParty", "debtor", "debtorAccount", "debtorAgent", "debtorAgentAccount", "previousInstructingAgent", "previousInstructingAgentAccount",
		"intermediaryAgent1", "intermediaryAgent1Account", "intermediaryAgent2", "intermediaryAgent2Account", "intermediaryAgent3", "intermediaryAgent3Account", "creditorAgent", "creditorAgentAccount", "creditor", "creditorAccount",
		"ultimateCreditor", "remittanceInformation", "instructedAmount"})
public class CreditTransferTransactionInformation12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification32 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtDbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateDebtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that owes an amount of money to the (ultimate) creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification32.mmObject();
		}
	};
	@XmlElement(name = "InitgPty")
	protected PartyIdentification32 initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initiates the payment.\nUsage: This can be either the debtor or a party that initiates the credit transfer on behalf of the debtor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Party that initiates the payment.\nUsage: This can be either the debtor or a party that initiates the credit transfer on behalf of the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification32.mmObject();
		}
	};
	@XmlElement(name = "Dbtr", required = true)
	protected PartyIdentification32 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification32.mmObject();
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount16 debtorAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification4 debtorAgent;
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "DbtrAgtAcct")
	protected CashAccount16 debtorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "PrvsInstgAgt")
	protected BranchAndFinancialInstitutionIdentification4 previousInstructingAgent;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent immediately prior to the instructing agent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "PrvsInstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgent";
			definition = "Agent immediately prior to the instructing agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "PrvsInstgAgtAcct")
	protected CashAccount16 previousInstructingAgentAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsInstgAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousInstructingAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the previous instructing agent at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviousInstructingAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "PrvsInstgAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousInstructingAgentAccount";
			definition = "Unambiguous identification of the account of the previous instructing agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected BranchAndFinancialInstitutionIdentification4 intermediaryAgent1;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt1Acct")
	protected CashAccount16 intermediaryAgent1Account;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent1Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Account";
			definition = "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected BranchAndFinancialInstitutionIdentification4 intermediaryAgent2;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt2Acct")
	protected CashAccount16 intermediaryAgent2Account;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent2Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2Account";
			definition = "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt3")
	protected BranchAndFinancialInstitutionIdentification4 intermediaryAgent3;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3 = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt3Acct")
	protected CashAccount16 intermediaryAgent3Account;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt3Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent3Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediaryAgent3Account = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3Account";
			definition = "Unambiguous identification of the account of the intermediary agent 3 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification4 creditorAgent;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgtAcct")
	protected CashAccount16 creditorAgentAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentification32 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification32.mmObject();
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount16 creditorAccount;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
	@XmlElement(name = "UltmtCdtr")
	protected PartyIdentification32 ultimateCreditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification32
	 * PartyIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UltmtCdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UltimateCreditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ultimate party to which an amount of money is due."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification32.mmObject();
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation5 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation5
	 * RemittanceInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceInformation5.mmObject();
		}
	};
	@XmlElement(name = "InstdAmt")
	protected ActiveOrHistoricCurrencyAndAmount instructedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation12
	 * CreditTransferTransactionInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmUltimateDebtor, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmInitiatingParty,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmDebtor, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmDebtorAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmDebtorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmDebtorAgentAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmPreviousInstructingAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmPreviousInstructingAgentAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent1, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent1Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent2Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent3, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmIntermediaryAgent3Account,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmCreditorAgentAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmCreditor, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmCreditorAccount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmUltimateCreditor, com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmRemittanceInformation,
						com.tools20022.repository.msg.CreditTransferTransactionInformation12.mmInstructedAmount);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent1AccountRule.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent2AccountRule.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent3AccountRule.forCreditTransferTransactionInformation12,
						com.tools20022.repository.constraints.ConstraintPreviousInstructingAgentAccountRule.forCreditTransferTransactionInformation12);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransferTransactionInformation12";
				definition = "Set of elements used to provide information specific to the individual transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification32> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public CreditTransferTransactionInformation12 setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification32 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<PartyIdentification32> getInitiatingParty() {
		return initiatingParty == null ? Optional.empty() : Optional.of(initiatingParty);
	}

	public CreditTransferTransactionInformation12 setInitiatingParty(com.tools20022.repository.msg.PartyIdentification32 initiatingParty) {
		this.initiatingParty = initiatingParty;
		return this;
	}

	public PartyIdentification32 getDebtor() {
		return debtor;
	}

	public CreditTransferTransactionInformation12 setDebtor(com.tools20022.repository.msg.PartyIdentification32 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public Optional<CashAccount16> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public CreditTransferTransactionInformation12 setDebtorAccount(com.tools20022.repository.msg.CashAccount16 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getDebtorAgent() {
		return debtorAgent;
	}

	public CreditTransferTransactionInformation12 setDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<CashAccount16> getDebtorAgentAccount() {
		return debtorAgentAccount == null ? Optional.empty() : Optional.of(debtorAgentAccount);
	}

	public CreditTransferTransactionInformation12 setDebtorAgentAccount(com.tools20022.repository.msg.CashAccount16 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getPreviousInstructingAgent() {
		return previousInstructingAgent == null ? Optional.empty() : Optional.of(previousInstructingAgent);
	}

	public CreditTransferTransactionInformation12 setPreviousInstructingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 previousInstructingAgent) {
		this.previousInstructingAgent = previousInstructingAgent;
		return this;
	}

	public Optional<CashAccount16> getPreviousInstructingAgentAccount() {
		return previousInstructingAgentAccount == null ? Optional.empty() : Optional.of(previousInstructingAgentAccount);
	}

	public CreditTransferTransactionInformation12 setPreviousInstructingAgentAccount(com.tools20022.repository.msg.CashAccount16 previousInstructingAgentAccount) {
		this.previousInstructingAgentAccount = previousInstructingAgentAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent1(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<CashAccount16> getIntermediaryAgent1Account() {
		return intermediaryAgent1Account == null ? Optional.empty() : Optional.of(intermediaryAgent1Account);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent1Account(com.tools20022.repository.msg.CashAccount16 intermediaryAgent1Account) {
		this.intermediaryAgent1Account = intermediaryAgent1Account;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent2(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<CashAccount16> getIntermediaryAgent2Account() {
		return intermediaryAgent2Account == null ? Optional.empty() : Optional.of(intermediaryAgent2Account);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent2Account(com.tools20022.repository.msg.CashAccount16 intermediaryAgent2Account) {
		this.intermediaryAgent2Account = intermediaryAgent2Account;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getIntermediaryAgent3() {
		return intermediaryAgent3 == null ? Optional.empty() : Optional.of(intermediaryAgent3);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent3(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
		return this;
	}

	public Optional<CashAccount16> getIntermediaryAgent3Account() {
		return intermediaryAgent3Account == null ? Optional.empty() : Optional.of(intermediaryAgent3Account);
	}

	public CreditTransferTransactionInformation12 setIntermediaryAgent3Account(com.tools20022.repository.msg.CashAccount16 intermediaryAgent3Account) {
		this.intermediaryAgent3Account = intermediaryAgent3Account;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getCreditorAgent() {
		return creditorAgent;
	}

	public CreditTransferTransactionInformation12 setCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public Optional<CashAccount16> getCreditorAgentAccount() {
		return creditorAgentAccount == null ? Optional.empty() : Optional.of(creditorAgentAccount);
	}

	public CreditTransferTransactionInformation12 setCreditorAgentAccount(com.tools20022.repository.msg.CashAccount16 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
		return this;
	}

	public PartyIdentification32 getCreditor() {
		return creditor;
	}

	public CreditTransferTransactionInformation12 setCreditor(com.tools20022.repository.msg.PartyIdentification32 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<CashAccount16> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public CreditTransferTransactionInformation12 setCreditorAccount(com.tools20022.repository.msg.CashAccount16 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<PartyIdentification32> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public CreditTransferTransactionInformation12 setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification32 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public Optional<RemittanceInformation5> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public CreditTransferTransactionInformation12 setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation5 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getInstructedAmount() {
		return instructedAmount == null ? Optional.empty() : Optional.of(instructedAmount);
	}

	public CreditTransferTransactionInformation12 setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
		this.instructedAmount = instructedAmount;
		return this;
	}
}