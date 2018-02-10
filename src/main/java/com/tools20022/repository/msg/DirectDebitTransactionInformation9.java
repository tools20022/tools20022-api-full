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
import com.tools20022.repository.choice.Purpose2Choice;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information specific to the individual direct
 * debit transaction(s) included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPaymentIdentification
 * DirectDebitTransactionInformation9.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPaymentTypeInformation
 * DirectDebitTransactionInformation9.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmInstructedAmount
 * DirectDebitTransactionInformation9.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmChargeBearer
 * DirectDebitTransactionInformation9.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDirectDebitTransaction
 * DirectDebitTransactionInformation9.mmDirectDebitTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmUltimateCreditor
 * DirectDebitTransactionInformation9.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDebtorAgent
 * DirectDebitTransactionInformation9.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDebtorAgentAccount
 * DirectDebitTransactionInformation9.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDebtor
 * DirectDebitTransactionInformation9.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmDebtorAccount
 * DirectDebitTransactionInformation9.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmUltimateDebtor
 * DirectDebitTransactionInformation9.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmInstructionForCreditorAgent
 * DirectDebitTransactionInformation9.mmInstructionForCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmPurpose
 * DirectDebitTransactionInformation9.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRegulatoryReporting
 * DirectDebitTransactionInformation9.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmTax
 * DirectDebitTransactionInformation9.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRelatedRemittanceInformation
 * DirectDebitTransactionInformation9.mmRelatedRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9#mmRemittanceInformation
 * DirectDebitTransactionInformation9.mmRemittanceInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebit
 * DirectDebit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forDirectDebitTransactionInformation9
 * ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forDirectDebitTransactionInformation9
 * ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DirectDebitTransactionInformation9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information specific to the individual direct debit transaction(s) included in the message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DirectDebitTransactionInformation9", propOrder = {"paymentIdentification", "paymentTypeInformation", "instructedAmount", "chargeBearer", "directDebitTransaction", "ultimateCreditor", "debtorAgent", "debtorAgentAccount",
		"debtor", "debtorAccount", "ultimateDebtor", "instructionForCreditorAgent", "purpose", "regulatoryReporting", "tax", "relatedRemittanceInformation", "remittanceInformation"})
public class DirectDebitTransactionInformation9 {

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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	protected PaymentTypeInformation20 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation20
	 * PaymentTypeInformation20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentExecution
	 * Payment.mmPaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			businessElementTrace_lazy = () -> Payment.mmPaymentExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation20.mmObject();
		}
	};
	@XmlElement(name = "InstdAmt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ChrgBr")
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	@XmlElement(name = "DrctDbtTx")
	protected DirectDebitTransaction6 directDebitTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransaction6
	 * DirectDebitTransaction6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the direct debit mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectDebitTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransaction";
			definition = "Set of elements providing information specific to the direct debit mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectDebitTransaction6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	@XmlElement(name = "DbtrAcct", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount16.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	@XmlElement(name = "InstrForCdtrAgt")
	protected Max140Text instructionForCreditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
	 * "Further information, related to the processing of the payment instruction, that may need to be acted upon by the creditor agent, depending on agreement between creditor and the creditor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionForCreditorAgent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
			isDerived = false;
			xmlTag = "InstrForCdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForCreditorAgent";
			definition = "Further information, related to the processing of the payment instruction, that may need to be acted upon by the creditor agent, depending on agreement between creditor and the creditor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.PaymentProcessing#mmCategoryPurpose
	 * PaymentProcessing.mmCategoryPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			businessElementTrace_lazy = () -> PaymentProcessing.mmCategoryPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Document#mmPlaceOfStorage
	 * Document.mmPlaceOfStorage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			businessElementTrace_lazy = () -> Document.mmPlaceOfStorage;
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation9
	 * DirectDebitTransactionInformation9}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmObject();
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

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmPaymentIdentification, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmPaymentTypeInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmInstructedAmount, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmChargeBearer,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmDirectDebitTransaction, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmUltimateCreditor,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmDebtorAgent, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmDebtorAgentAccount,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmDebtor, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmDebtorAccount,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmUltimateDebtor, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmInstructionForCreditorAgent,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmPurpose, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmRegulatoryReporting,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmTax, com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmRelatedRemittanceInformation,
						com.tools20022.repository.msg.DirectDebitTransactionInformation9.mmRemittanceInformation);
				trace_lazy = () -> DirectDebit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forDirectDebitTransactionInformation9,
						com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forDirectDebitTransactionInformation9);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DirectDebitTransactionInformation9";
				definition = "Set of elements used to provide information specific to the individual direct debit transaction(s) included in the message.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaymentIdentification1 getPaymentIdentification() {
		return paymentIdentification;
	}

	public DirectDebitTransactionInformation9 setPaymentIdentification(com.tools20022.repository.msg.PaymentIdentification1 paymentIdentification) {
		this.paymentIdentification = Objects.requireNonNull(paymentIdentification);
		return this;
	}

	public Optional<PaymentTypeInformation20> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public DirectDebitTransactionInformation9 setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation20 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public DirectDebitTransactionInformation9 setInstructedAmount(ActiveOrHistoricCurrencyAndAmount instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public DirectDebitTransactionInformation9 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public Optional<DirectDebitTransaction6> getDirectDebitTransaction() {
		return directDebitTransaction == null ? Optional.empty() : Optional.of(directDebitTransaction);
	}

	public DirectDebitTransactionInformation9 setDirectDebitTransaction(com.tools20022.repository.msg.DirectDebitTransaction6 directDebitTransaction) {
		this.directDebitTransaction = directDebitTransaction;
		return this;
	}

	public Optional<PartyIdentification32> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public DirectDebitTransactionInformation9 setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification32 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getDebtorAgent() {
		return debtorAgent;
	}

	public DirectDebitTransactionInformation9 setDebtorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<CashAccount16> getDebtorAgentAccount() {
		return debtorAgentAccount == null ? Optional.empty() : Optional.of(debtorAgentAccount);
	}

	public DirectDebitTransactionInformation9 setDebtorAgentAccount(com.tools20022.repository.msg.CashAccount16 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
		return this;
	}

	public PartyIdentification32 getDebtor() {
		return debtor;
	}

	public DirectDebitTransactionInformation9 setDebtor(com.tools20022.repository.msg.PartyIdentification32 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public CashAccount16 getDebtorAccount() {
		return debtorAccount;
	}

	public DirectDebitTransactionInformation9 setDebtorAccount(com.tools20022.repository.msg.CashAccount16 debtorAccount) {
		this.debtorAccount = Objects.requireNonNull(debtorAccount);
		return this;
	}

	public Optional<PartyIdentification32> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public DirectDebitTransactionInformation9 setUltimateDebtor(com.tools20022.repository.msg.PartyIdentification32 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<Max140Text> getInstructionForCreditorAgent() {
		return instructionForCreditorAgent == null ? Optional.empty() : Optional.of(instructionForCreditorAgent);
	}

	public DirectDebitTransactionInformation9 setInstructionForCreditorAgent(Max140Text instructionForCreditorAgent) {
		this.instructionForCreditorAgent = instructionForCreditorAgent;
		return this;
	}

	public Optional<Purpose2Choice> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public DirectDebitTransactionInformation9 setPurpose(Purpose2Choice purpose) {
		this.purpose = purpose;
		return this;
	}

	public List<RegulatoryReporting3> getRegulatoryReporting() {
		return regulatoryReporting == null ? regulatoryReporting = new ArrayList<>() : regulatoryReporting;
	}

	public DirectDebitTransactionInformation9 setRegulatoryReporting(List<com.tools20022.repository.msg.RegulatoryReporting3> regulatoryReporting) {
		this.regulatoryReporting = Objects.requireNonNull(regulatoryReporting);
		return this;
	}

	public Optional<TaxInformation3> getTax() {
		return tax == null ? Optional.empty() : Optional.of(tax);
	}

	public DirectDebitTransactionInformation9 setTax(com.tools20022.repository.msg.TaxInformation3 tax) {
		this.tax = tax;
		return this;
	}

	public List<RemittanceLocation2> getRelatedRemittanceInformation() {
		return relatedRemittanceInformation == null ? relatedRemittanceInformation = new ArrayList<>() : relatedRemittanceInformation;
	}

	public DirectDebitTransactionInformation9 setRelatedRemittanceInformation(List<com.tools20022.repository.msg.RemittanceLocation2> relatedRemittanceInformation) {
		this.relatedRemittanceInformation = Objects.requireNonNull(relatedRemittanceInformation);
		return this;
	}

	public Optional<RemittanceInformation5> getRemittanceInformation() {
		return remittanceInformation == null ? Optional.empty() : Optional.of(remittanceInformation);
	}

	public DirectDebitTransactionInformation9 setRemittanceInformation(com.tools20022.repository.msg.RemittanceInformation5 remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
		return this;
	}
}