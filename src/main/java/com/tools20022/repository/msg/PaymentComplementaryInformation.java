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
import com.tools20022.repository.area.camt.AdditionalPaymentInformation;
import com.tools20022.repository.choice.AmountType1Choice;
import com.tools20022.repository.choice.RemittanceInformation3Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification;
import com.tools20022.repository.msg.CashAccount3;
import com.tools20022.repository.msg.Intermediary1;
import com.tools20022.repository.msg.PartyIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information from the underlying payment instruction which cannot
 * be transferred in a regular statement message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmRemittanceChoice
 * PaymentComplementaryInformation.mmRemittanceChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmDebtor
 * PaymentComplementaryInformation.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmDebtorAccount
 * PaymentComplementaryInformation.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmFirstAgent
 * PaymentComplementaryInformation.mmFirstAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmAmount
 * PaymentComplementaryInformation.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmNostroVostroAccount
 * PaymentComplementaryInformation.mmNostroVostroAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmIntermediary
 * PaymentComplementaryInformation.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmFirstSettlementAgent
 * PaymentComplementaryInformation.mmFirstSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmLastSettlementAgent
 * PaymentComplementaryInformation.mmLastSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmIntermediarySettlementAgent
 * PaymentComplementaryInformation.mmIntermediarySettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmCreditor
 * PaymentComplementaryInformation.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmCreditorAccount
 * PaymentComplementaryInformation.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation#mmSenderToReceiverInformation
 * PaymentComplementaryInformation.mmSenderToReceiverInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.AdditionalPaymentInformation#mmInformation
 * AdditionalPaymentInformation.mmInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentComplementaryInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information from the underlying payment instruction which cannot be transferred in a regular statement message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentComplementaryInformation", propOrder = {"remittanceChoice", "debtor", "debtorAccount", "firstAgent", "amount", "nostroVostroAccount", "intermediary", "firstSettlementAgent", "lastSettlementAgent",
		"intermediarySettlementAgent", "creditor", "creditorAccount", "senderToReceiverInformation"})
public class PaymentComplementaryInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RmtChc")
	protected RemittanceInformation3Choice remittanceChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice
	 * RemittanceInformation3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtChc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remittance information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<RemittanceInformation3Choice>> mmRemittanceChoice = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<RemittanceInformation3Choice>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "RmtChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceChoice";
			definition = "Remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation3Choice.mmObject();
		}

		@Override
		public Optional<RemittanceInformation3Choice> getValue(PaymentComplementaryInformation obj) {
			return obj.getRemittanceChoice();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<RemittanceInformation3Choice> value) {
			obj.setRemittanceChoice(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification1 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor or Ordering customer of the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<PartyIdentification1>> mmDebtor = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<PartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Debtor or Ordering customer of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(PaymentComplementaryInformation obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<PartyIdentification1> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected CashAccount3 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor account or Ordering customer account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>> mmDebtorAccount = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Debtor account or Ordering customer account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(PaymentComplementaryInformation obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<CashAccount3> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstAgt")
	protected BranchAndFinancialInstitutionIdentification firstAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First Agent or Field 52 in Fin messages."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>> mmFirstAgent = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "First Agent or Field 52 in Fin messages.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(PaymentComplementaryInformation obj) {
			return obj.getFirstAgent();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setFirstAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Amt")
	protected AmountType1Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountType1Choice
	 * AmountType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructed amount of the payment instruction (Field 33B)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<AmountType1Choice>> mmAmount = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<AmountType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Instructed amount of the payment instruction (Field 33B).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountType1Choice.mmObject();
		}

		@Override
		public Optional<AmountType1Choice> getValue(PaymentComplementaryInformation obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<AmountType1Choice> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NstrVstrAcct")
	protected CashAccount3 nostroVostroAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmSettlementAccount
	 * CashSettlement.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NstrVstrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NostroVostroAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the account used to cover a payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>> mmNostroVostroAccount = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "NstrVstrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NostroVostroAccount";
			definition = "Indicates the account used to cover a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(PaymentComplementaryInformation obj) {
			return obj.getNostroVostroAccount();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<CashAccount3> value) {
			obj.setNostroVostroAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrmy")
	protected Intermediary1 intermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary1
	 * Intermediary1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryAgentRole
	 * IntermediaryAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary bank."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<Intermediary1>> mmIntermediary = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<Intermediary1>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryAgentRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Intermediary bank.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary1.mmObject();
		}

		@Override
		public Optional<Intermediary1> getValue(PaymentComplementaryInformation obj) {
			return obj.getIntermediary();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<Intermediary1> value) {
			obj.setIntermediary(value.orElse(null));
		}
	};
	@XmlElement(name = "FrstSttlmAgt")
	protected BranchAndFinancialInstitutionIdentification firstSettlementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstSttlmAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Correspondent of the first agent (Field 53 in MT202)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>> mmFirstSettlementAgent = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "FrstSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstSettlementAgent";
			definition = "Correspondent of the first agent (Field 53 in MT202).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(PaymentComplementaryInformation obj) {
			return obj.getFirstSettlementAgent();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setFirstSettlementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "LastSttlmAgt")
	protected BranchAndFinancialInstitutionIdentification lastSettlementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LastSttlmAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Correspondent of the Final agent (Field 54 of Mt 202)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>> mmLastSettlementAgent = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "LastSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastSettlementAgent";
			definition = "Correspondent of the Final agent (Field 54 of Mt 202).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(PaymentComplementaryInformation obj) {
			return obj.getLastSettlementAgent();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setLastSettlementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmySttlmAgt")
	protected BranchAndFinancialInstitutionIdentification intermediarySettlementAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification
	 * BranchAndFinancialInstitutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmySttlmAgt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediarySettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equivalent to Field 55 in MT202."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>> mmIntermediarySettlementAgent = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<BranchAndFinancialInstitutionIdentification>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "IntrmySttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediarySettlementAgent";
			definition = "Equivalent to Field 55 in MT202.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification> getValue(PaymentComplementaryInformation obj) {
			return obj.getIntermediarySettlementAgent();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<BranchAndFinancialInstitutionIdentification> value) {
			obj.setIntermediarySettlementAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification1 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification1
	 * PartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor or Beneficiary customer of the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<PartyIdentification1>> mmCreditor = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<PartyIdentification1>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Creditor or Beneficiary customer of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification1.mmObject();
		}

		@Override
		public Optional<PartyIdentification1> getValue(PaymentComplementaryInformation obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<PartyIdentification1> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcct")
	protected CashAccount3 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor account or Beneficiary customer account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>> mmCreditorAccount = new MMMessageAssociationEnd<PaymentComplementaryInformation, Optional<CashAccount3>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Creditor account or Beneficiary customer account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount3.mmObject();
		}

		@Override
		public Optional<CashAccount3> getValue(PaymentComplementaryInformation obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, Optional<CashAccount3> value) {
			obj.setCreditorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "SndrToRcvrInf")
	protected List<Max35Text> senderToReceiverInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentComplementaryInformation
	 * PaymentComplementaryInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrToRcvrInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unformatted information from the sender to the receiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentComplementaryInformation, List<Max35Text>> mmSenderToReceiverInformation = new MMMessageAttribute<PaymentComplementaryInformation, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Unformatted information from the sender to the receiver.";
			maxOccurs = 6;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(PaymentComplementaryInformation obj) {
			return obj.getSenderToReceiverInformation();
		}

		@Override
		public void setValue(PaymentComplementaryInformation obj, List<Max35Text> value) {
			obj.setSenderToReceiverInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentComplementaryInformation.mmRemittanceChoice, com.tools20022.repository.msg.PaymentComplementaryInformation.mmDebtor,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmDebtorAccount, com.tools20022.repository.msg.PaymentComplementaryInformation.mmFirstAgent,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmAmount, com.tools20022.repository.msg.PaymentComplementaryInformation.mmNostroVostroAccount,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmIntermediary, com.tools20022.repository.msg.PaymentComplementaryInformation.mmFirstSettlementAgent,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmLastSettlementAgent, com.tools20022.repository.msg.PaymentComplementaryInformation.mmIntermediarySettlementAgent,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmCreditor, com.tools20022.repository.msg.PaymentComplementaryInformation.mmCreditorAccount,
						com.tools20022.repository.msg.PaymentComplementaryInformation.mmSenderToReceiverInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AdditionalPaymentInformation.mmInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentComplementaryInformation";
				definition = "Additional information from the underlying payment instruction which cannot be transferred in a regular statement message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RemittanceInformation3Choice> getRemittanceChoice() {
		return remittanceChoice == null ? Optional.empty() : Optional.of(remittanceChoice);
	}

	public PaymentComplementaryInformation setRemittanceChoice(RemittanceInformation3Choice remittanceChoice) {
		this.remittanceChoice = remittanceChoice;
		return this;
	}

	public Optional<PartyIdentification1> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public PaymentComplementaryInformation setDebtor(PartyIdentification1 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<CashAccount3> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public PaymentComplementaryInformation setDebtorAccount(CashAccount3 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getFirstAgent() {
		return firstAgent == null ? Optional.empty() : Optional.of(firstAgent);
	}

	public PaymentComplementaryInformation setFirstAgent(BranchAndFinancialInstitutionIdentification firstAgent) {
		this.firstAgent = firstAgent;
		return this;
	}

	public Optional<AmountType1Choice> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public PaymentComplementaryInformation setAmount(AmountType1Choice amount) {
		this.amount = amount;
		return this;
	}

	public Optional<CashAccount3> getNostroVostroAccount() {
		return nostroVostroAccount == null ? Optional.empty() : Optional.of(nostroVostroAccount);
	}

	public PaymentComplementaryInformation setNostroVostroAccount(CashAccount3 nostroVostroAccount) {
		this.nostroVostroAccount = nostroVostroAccount;
		return this;
	}

	public Optional<Intermediary1> getIntermediary() {
		return intermediary == null ? Optional.empty() : Optional.of(intermediary);
	}

	public PaymentComplementaryInformation setIntermediary(Intermediary1 intermediary) {
		this.intermediary = intermediary;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getFirstSettlementAgent() {
		return firstSettlementAgent == null ? Optional.empty() : Optional.of(firstSettlementAgent);
	}

	public PaymentComplementaryInformation setFirstSettlementAgent(BranchAndFinancialInstitutionIdentification firstSettlementAgent) {
		this.firstSettlementAgent = firstSettlementAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getLastSettlementAgent() {
		return lastSettlementAgent == null ? Optional.empty() : Optional.of(lastSettlementAgent);
	}

	public PaymentComplementaryInformation setLastSettlementAgent(BranchAndFinancialInstitutionIdentification lastSettlementAgent) {
		this.lastSettlementAgent = lastSettlementAgent;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification> getIntermediarySettlementAgent() {
		return intermediarySettlementAgent == null ? Optional.empty() : Optional.of(intermediarySettlementAgent);
	}

	public PaymentComplementaryInformation setIntermediarySettlementAgent(BranchAndFinancialInstitutionIdentification intermediarySettlementAgent) {
		this.intermediarySettlementAgent = intermediarySettlementAgent;
		return this;
	}

	public Optional<PartyIdentification1> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public PaymentComplementaryInformation setCreditor(PartyIdentification1 creditor) {
		this.creditor = creditor;
		return this;
	}

	public Optional<CashAccount3> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public PaymentComplementaryInformation setCreditorAccount(CashAccount3 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public List<Max35Text> getSenderToReceiverInformation() {
		return senderToReceiverInformation == null ? senderToReceiverInformation = new ArrayList<>() : senderToReceiverInformation;
	}

	public PaymentComplementaryInformation setSenderToReceiverInformation(List<Max35Text> senderToReceiverInformation) {
		this.senderToReceiverInformation = Objects.requireNonNull(senderToReceiverInformation);
		return this;
	}
}