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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentComplementaryInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information from the underlying payment instruction which cannot be transferred in a regular statement message."
 * </li>
 * </ul>
 */
public class PaymentComplementaryInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RemittanceInformation3Choice remittanceChoice;
	/**
	 * Remittance information.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Remittance information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceChoice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmAssociatedDocument;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
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
	};
	protected PartyIdentification1 debtor;
	/**
	 * Debtor or Ordering customer of the payment instruction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor or Ordering customer of the payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Debtor or Ordering customer of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification1.mmObject();
		}
	};
	protected CashAccount3 debtorAccount;
	/**
	 * Debtor account or Ordering customer account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Debtor account or Ordering customer account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Debtor account or Ordering customer account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification firstAgent;
	/**
	 * First Agent or Field 52 in Fin messages.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First Agent or Field 52 in Fin messages."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFirstAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "FrstAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAgent";
			definition = "First Agent or Field 52 in Fin messages.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected AmountType1Choice amount;
	/**
	 * Instructed amount of the payment instruction (Field 33B)
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructed amount of the payment instruction (Field 33B)"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Instructed amount of the payment instruction (Field 33B)";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountType1Choice.mmObject();
		}
	};
	protected CashAccount3 nostroVostroAccount;
	/**
	 * Indicates the account used to cover a payment.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NostroVostroAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the account used to cover a payment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNostroVostroAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmSettlementAccount;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "NstrVstrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NostroVostroAccount";
			definition = "Indicates the account used to cover a payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected Intermediary1 intermediary;
	/**
	 * Intermediary bank.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary bank."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IntermediaryAgentRole.mmObject();
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Intermediary bank.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary1.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification firstSettlementAgent;
	/**
	 * Correspondent of the first agent (Field 53 in MT202).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Correspondent of the first agent (Field 53 in MT202)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFirstSettlementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "FrstSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstSettlementAgent";
			definition = "Correspondent of the first agent (Field 53 in MT202).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification lastSettlementAgent;
	/**
	 * Correspondent of the Final agent (Field 54 of Mt 202)
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastSettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Correspondent of the Final agent (Field 54 of Mt 202)"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLastSettlementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "LastSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastSettlementAgent";
			definition = "Correspondent of the Final agent (Field 54 of Mt 202)";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification intermediarySettlementAgent;
	/**
	 * Equivalent to Field 55 in MT202.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediarySettlementAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Equivalent to Field 55 in MT202."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediarySettlementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "IntrmySttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediarySettlementAgent";
			definition = "Equivalent to Field 55 in MT202.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected PartyIdentification1 creditor;
	/**
	 * Creditor or Beneficiary customer of the payment instruction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Creditor or Beneficiary customer of the payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Creditor or Beneficiary customer of the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification1.mmObject();
		}
	};
	protected CashAccount3 creditorAccount;
	/**
	 * Creditor account or Beneficiary customer account.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Creditor account or Beneficiary customer account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Creditor account or Beneficiary customer account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected List<Max35Text> senderToReceiverInformation;
	/**
	 * Unformatted information from the sender to the receiver.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderToReceiverInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unformatted information from the sender to the receiver."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSenderToReceiverInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PaymentComplementaryInformation.mmObject();
			isDerived = false;
			xmlTag = "SndrToRcvrInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderToReceiverInformation";
			definition = "Unformatted information from the sender to the receiver.";
			maxOccurs = 6;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentComplementaryInformation.mmRemittanceChoice, PaymentComplementaryInformation.mmDebtor, PaymentComplementaryInformation.mmDebtorAccount,
						PaymentComplementaryInformation.mmFirstAgent, PaymentComplementaryInformation.mmAmount, PaymentComplementaryInformation.mmNostroVostroAccount, PaymentComplementaryInformation.mmIntermediary,
						PaymentComplementaryInformation.mmFirstSettlementAgent, PaymentComplementaryInformation.mmLastSettlementAgent, PaymentComplementaryInformation.mmIntermediarySettlementAgent,
						PaymentComplementaryInformation.mmCreditor, PaymentComplementaryInformation.mmCreditorAccount, PaymentComplementaryInformation.mmSenderToReceiverInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(AdditionalPaymentInformation.mmInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentComplementaryInformation";
				definition = "Additional information from the underlying payment instruction which cannot be transferred in a regular statement message.";
			}
		});
		return mmObject_lazy.get();
	}

	public RemittanceInformation3Choice getRemittanceChoice() {
		return remittanceChoice;
	}

	public void setRemittanceChoice(RemittanceInformation3Choice remittanceChoice) {
		this.remittanceChoice = remittanceChoice;
	}

	public PartyIdentification1 getDebtor() {
		return debtor;
	}

	public void setDebtor(com.tools20022.repository.msg.PartyIdentification1 debtor) {
		this.debtor = debtor;
	}

	public CashAccount3 getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(com.tools20022.repository.msg.CashAccount3 debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	public BranchAndFinancialInstitutionIdentification getFirstAgent() {
		return firstAgent;
	}

	public void setFirstAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification firstAgent) {
		this.firstAgent = firstAgent;
	}

	public AmountType1Choice getAmount() {
		return amount;
	}

	public void setAmount(AmountType1Choice amount) {
		this.amount = amount;
	}

	public CashAccount3 getNostroVostroAccount() {
		return nostroVostroAccount;
	}

	public void setNostroVostroAccount(com.tools20022.repository.msg.CashAccount3 nostroVostroAccount) {
		this.nostroVostroAccount = nostroVostroAccount;
	}

	public Intermediary1 getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(com.tools20022.repository.msg.Intermediary1 intermediary) {
		this.intermediary = intermediary;
	}

	public BranchAndFinancialInstitutionIdentification getFirstSettlementAgent() {
		return firstSettlementAgent;
	}

	public void setFirstSettlementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification firstSettlementAgent) {
		this.firstSettlementAgent = firstSettlementAgent;
	}

	public BranchAndFinancialInstitutionIdentification getLastSettlementAgent() {
		return lastSettlementAgent;
	}

	public void setLastSettlementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification lastSettlementAgent) {
		this.lastSettlementAgent = lastSettlementAgent;
	}

	public BranchAndFinancialInstitutionIdentification getIntermediarySettlementAgent() {
		return intermediarySettlementAgent;
	}

	public void setIntermediarySettlementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification intermediarySettlementAgent) {
		this.intermediarySettlementAgent = intermediarySettlementAgent;
	}

	public PartyIdentification1 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.PartyIdentification1 creditor) {
		this.creditor = creditor;
	}

	public CashAccount3 getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(com.tools20022.repository.msg.CashAccount3 creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	public List<Max35Text> getSenderToReceiverInformation() {
		return senderToReceiverInformation;
	}

	public void setSenderToReceiverInformation(List<Max35Text> senderToReceiverInformation) {
		this.senderToReceiverInformation = senderToReceiverInformation;
	}
}