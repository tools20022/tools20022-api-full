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
import com.tools20022.repository.choice.AmountType3Choice;
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPaymentIdentification
 * CreditTransferTransactionInformation14.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPaymentTypeInformation
 * CreditTransferTransactionInformation14.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmAmount
 * CreditTransferTransactionInformation14.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmChargeBearer
 * CreditTransferTransactionInformation14.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmChequeInstruction
 * CreditTransferTransactionInformation14.mmChequeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmUltimateDebtor
 * CreditTransferTransactionInformation14.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmIntermediaryAgent1
 * CreditTransferTransactionInformation14.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmIntermediaryAgent2
 * CreditTransferTransactionInformation14.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmIntermediaryAgent3
 * CreditTransferTransactionInformation14.mmIntermediaryAgent3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmCreditorAgent
 * CreditTransferTransactionInformation14.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmCreditor
 * CreditTransferTransactionInformation14.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmCreditorAccount
 * CreditTransferTransactionInformation14.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmUltimateCreditor
 * CreditTransferTransactionInformation14.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmInstructionForCreditorAgent
 * CreditTransferTransactionInformation14.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmPurpose
 * CreditTransferTransactionInformation14.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRegulatoryReporting
 * CreditTransferTransactionInformation14.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmTax
 * CreditTransferTransactionInformation14.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRelatedRemittanceInformation
 * CreditTransferTransactionInformation14.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14#mmRemittanceInformation
 * CreditTransferTransactionInformation14.mmRemittanceInformation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forCreditTransferTransactionInformation14
 * ConstraintUltimateCreditorGuideline.forCreditTransferTransactionInformation14
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forCreditTransferTransactionInformation14
 * ConstraintUltimateDebtorGuideline.forCreditTransferTransactionInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule#forCreditTransferTransactionInformation14
 * ConstraintIntermediaryAgent2Rule.forCreditTransferTransactionInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule#forCreditTransferTransactionInformation14
 * ConstraintIntermediaryAgent3Rule.forCreditTransferTransactionInformation14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructionForCreditorAgentRule#forCreditTransferTransactionInformation14
 * ConstraintInstructionForCreditorAgentRule.
 * forCreditTransferTransactionInformation14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreditTransferTransactionInformation14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information specific to the individual transaction(s) included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditTransferTransactionInformation14", propOrder = {"paymentIdentification", "paymentTypeInformation", "amount", "chargeBearer", "chequeInstruction", "ultimateDebtor", "intermediaryAgent1", "intermediaryAgent2",
		"intermediaryAgent3", "creditorAgent", "creditor", "creditorAccount", "ultimateCreditor", "instructionForCreditorAgent", "purpose", "regulatoryReporting", "tax", "relatedRemittanceInformation", "remittanceInformation"})
public class CreditTransferTransactionInformation14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtId", required = true)
	protected PaymentIdentification1 paymentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentIdentification1
	 * PaymentIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentRelatedIdentifications
	 * Payment.mmPaymentRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to reference a payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Set of elements used to reference a payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentIdentification1.mmObject();
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation19 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation19
	 * PaymentTypeInformation19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtTpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentTypeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to further specify the type of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation19.mmObject();
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected AmountType3Choice amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.AmountType3Choice
	 * AmountType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
	 * definition} =
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountType3Choice.mmObject();
		}
	};
	@XmlElement(name = "ChrgBr", required = true)
	protected ChargeBearerType1Code chargeBearer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearerType1Code
	 * ChargeBearerType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmBearerType
	 * Charges.mmBearerType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgBr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeBearer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies which party/parties will bear the charges associated with the processing of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	@XmlElement(name = "ChqInstr")
	protected Cheque6 chequeInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Cheque6 Cheque6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ChequeIssue ChequeIssue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChqInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChequeInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements needed to issue a cheque."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChequeInstruction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ChequeIssue.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "ChqInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChequeInstruction";
			definition = "Set of elements needed to issue a cheque.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Cheque6.mmObject();
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification43 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than one intermediary agent is present, then IntermediaryAgent1 identifies the agent between the DebtorAgent and the IntermediaryAgent2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If more than two intermediary agents are present, then IntermediaryAgent2 identifies the agent between the IntermediaryAgent1 and the IntermediaryAgent3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "IntrmyAgt3")
	protected BranchAndFinancialInstitutionIdentification5 intermediaryAgent3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent3";
			definition = "Agent between the debtor's agent and the creditor's agent.\n\nUsage: If IntermediaryAgent3 is present, then it identifies the agent between the IntermediaryAgent 2 and the CreditorAgent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification5 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "Cdtr", required = true)
	protected PartyIdentification43 creditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
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
	protected PartyIdentification43 ultimateCreditor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "InstrForCdtrAgt")
	protected List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForCreditorAgent1
	 * InstructionForCreditorAgent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForCdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForCreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionForCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information related to the processing of the payment instruction, provided by the initiating party, and intended for the creditor agent.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionForCreditorAgent1.mmObject();
		}
	};
	@XmlElement(name = "Purp")
	protected Purpose2Choice purpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Purpose2Choice
	 * Purpose2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.\nUsage: Purpose is used by the end-customers, that is initiating party, (ultimate) debtor, (ultimate) creditor to provide information concerning the nature of the payment. Purpose is a content element, which is not used for processing by any of the agents involved in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Purpose2Choice.mmObject();
		}
	};
	@XmlElement(name = "RgltryRptg")
	protected List<com.tools20022.repository.msg.RegulatoryReporting3> regulatoryReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RegulatoryReporting3
	 * RegulatoryReporting3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#mmRegulatoryReport
	 * FinancialTransaction.mmRegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed due to regulatory and statutory requirements."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegulatoryReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> FinancialTransaction.mmRegulatoryReport;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information needed due to regulatory and statutory requirements.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting3.mmObject();
		}
	};
	@XmlElement(name = "Tax")
	protected TaxInformation3 tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxInformation3
	 * TaxInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to provide details on the tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTax = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmTaxOnPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "Tax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tax";
			definition = "Set of elements used to provide details on the tax.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxInformation3.mmObject();
		}
	};
	@XmlElement(name = "RltdRmtInf")
	protected List<com.tools20022.repository.msg.RemittanceLocation2> relatedRemittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceLocation
	 * PaymentObligation.mmRemittanceLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRemittanceInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information related to the handling of the remittance information by any of the agents in the transaction processing chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmRemittanceLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "RltdRmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedRemittanceInformation";
			definition = "Set of elements used to provide information related to the handling of the remittance information by any of the agents in the transaction processing chain.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceLocation2.mmObject();
		}
	};
	@XmlElement(name = "RmtInf")
	protected RemittanceInformation6 remittanceInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RemittanceInformation6
	 * RemittanceInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmAssociatedDocument
	 * PaymentObligation.mmAssociatedDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation14
	 * CreditTransferTransactionInformation14}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RemittanceInformation6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmPaymentIdentification,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmPaymentTypeInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmAmount,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmChargeBearer, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmChequeInstruction,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmUltimateDebtor, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmIntermediaryAgent1,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmIntermediaryAgent2, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmIntermediaryAgent3,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmCreditor,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmCreditorAccount, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmUltimateCreditor,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmInstructionForCreditorAgent, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmPurpose,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmRegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmTax,
						com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmRelatedRemittanceInformation, com.tools20022.repository.msg.CreditTransferTransactionInformation14.mmRemittanceInformation);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forCreditTransferTransactionInformation14,
						com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forCreditTransferTransactionInformation14,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent2Rule.forCreditTransferTransactionInformation14,
						com.tools20022.repository.constraints.ConstraintIntermediaryAgent3Rule.forCreditTransferTransactionInformation14,
						com.tools20022.repository.constraints.ConstraintInstructionForCreditorAgentRule.forCreditTransferTransactionInformation14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransferTransactionInformation14";
				definition = "Set of elements used to provide information specific to the individual transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentIdentification1 getPaymentIdentification() {
		return paymentIdentification;
	}

	public CreditTransferTransactionInformation14 setPaymentIdentification(com.tools20022.repository.msg.PaymentIdentification1 paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}

	public Optional<PaymentTypeInformation19> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public CreditTransferTransactionInformation14 setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation19 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public AmountType3Choice getAmount() {
		return amount;
	}

	public CreditTransferTransactionInformation14 setAmount(AmountType3Choice amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public ChargeBearerType1Code getChargeBearer() {
		return chargeBearer;
	}

	public CreditTransferTransactionInformation14 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = Objects.requireNonNull(chargeBearer);
		return this;
	}

	public Optional<Cheque6> getChequeInstruction() {
		return chequeInstruction == null ? Optional.empty() : Optional.of(chequeInstruction);
	}

	public CreditTransferTransactionInformation14 setChequeInstruction(com.tools20022.repository.msg.Cheque6 chequeInstruction) {
		this.chequeInstruction = chequeInstruction;
		return this;
	}

	public Optional<PartyIdentification43> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public CreditTransferTransactionInformation14 setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification43 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public CreditTransferTransactionInformation14 setIntermediaryAgent1(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public CreditTransferTransactionInformation14 setIntermediaryAgent2(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getIntermediaryAgent3() {
		return intermediaryAgent3 == null ? Optional.empty() : Optional.of(intermediaryAgent3);
	}

	public CreditTransferTransactionInformation14 setIntermediaryAgent3(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 intermediaryAgent3) {
		this.intermediaryAgent3 = intermediaryAgent3;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getCreditorAgent() {
		return creditorAgent;
	}

	public CreditTransferTransactionInformation14 setCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public PartyIdentification43 getCreditor() {
		return creditor;
	}

	public CreditTransferTransactionInformation14 setCreditor(com.tools20022.repository.msg.PartyIdentification43 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public Optional<CashAccount16> getCreditorAccount() {
		return creditorAccount == null ? Optional.empty() : Optional.of(creditorAccount);
	}

	public CreditTransferTransactionInformation14 setCreditorAccount(com.tools20022.repository.msg.CashAccount16 creditorAccount) {
		this.creditorAccount = creditorAccount;
		return this;
	}

	public Optional<PartyIdentification43> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public CreditTransferTransactionInformation14 setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification43 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public List<InstructionForCreditorAgent1> getInstructionForCreditorAgent() {
		return instructionForCreditorAgent == null ? instructionForCreditorAgent = new ArrayList<>() : instructionForCreditorAgent;
	}

	public CreditTransferTransactionInformation14 setInstructionForCreditorAgent(List<com.tools20022.repository.msg.InstructionForCreditorAgent1> instructionForCreditorAgent) {
		this.instructionForCreditorAgent = Objects.requireNonNull(instructionForCreditorAgent);
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public CreditTransferTransactionInformation14 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RegulatoryReporting3> getRegulatoryReporting() {
		return regulatoryReporting == null ? regulatoryReporting = new ArrayList<>() : regulatoryReporting;
	}

	public CreditTransferTransactionInformation14 setRegulatoryReporting(List<com.tools20022.repository.msg.RegulatoryReporting3> regulatoryReporting) {
		this.regulatoryReporting = Objects.requireNonNull(regulatoryReporting);
		return this;
	}

	public Optional<TaxInformation3> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public CreditTransferTransactionInformation14 setTax(com.tools20022.repository.msg.TaxInformation3 tax) {
		this.tax = tax;
		return this;
	}

	public List<RemittanceLocation2> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public CreditTransferTransactionInformation14 setRelatedRemittanceInformation(List<com.tools20022.repository.msg.RemittanceLocation2> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation6> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public CreditTransferTransactionInformation14 setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation6 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}
}