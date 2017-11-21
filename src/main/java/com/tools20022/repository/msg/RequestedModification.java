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
import com.tools20022.repository.area.camt.RequestToModifyPayment;
import com.tools20022.repository.choice.PaymentSchemeChoice;
import com.tools20022.repository.choice.PurposeChoice;
import com.tools20022.repository.choice.RemittanceInformation3Choice;
import com.tools20022.repository.codeset.ChargeBearer1Code;
import com.tools20022.repository.codeset.Instruction1Code;
import com.tools20022.repository.codeset.SWIFTServiceLevel2Code;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the requested modifications.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRelatedReference
 * RequestedModification.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBankOperationCode
 * RequestedModification.mmBankOperationCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionCode
 * RequestedModification.mmInstructionCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRequestedExecutionDate
 * RequestedModification.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmValueDate
 * RequestedModification.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInterbankSettledAmount
 * RequestedModification.mmInterbankSettledAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RequestedModification#mmDebtor
 * RequestedModification.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmDebtorAccount
 * RequestedModification.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmIntermediarySettlementAgent
 * RequestedModification.mmIntermediarySettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmLastSettlementAgent
 * RequestedModification.mmLastSettlementAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPaymentScheme
 * RequestedModification.mmPaymentScheme}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmBeneficiaryInstitutionAccount
 * RequestedModification.mmBeneficiaryInstitutionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmCreditor
 * RequestedModification.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmCreditorAccount
 * RequestedModification.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmRemittanceInformation
 * RequestedModification.mmRemittanceInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmPurpose
 * RequestedModification.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmInstructionForFinalAgent
 * RequestedModification.mmInstructionForFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmDetailsOfCharges
 * RequestedModification.mmDetailsOfCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestedModification#mmSenderToReceiverInformation
 * RequestedModification.mmSenderToReceiverInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.RequestToModifyPayment#mmModification
 * RequestToModifyPayment.mmModification}</li>
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
 * "RequestedModification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains the requested modifications."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RequestedModification", propOrder = {"relatedReference", "bankOperationCode", "instructionCode", "requestedExecutionDate", "valueDate", "interbankSettledAmount", "debtor", "debtorAccount", "intermediarySettlementAgent",
		"lastSettlementAgent", "paymentScheme", "beneficiaryInstitutionAccount", "creditor", "creditorAccount", "remittanceInformation", "purpose", "instructionForFinalAgent", "detailsOfCharges", "senderToReceiverInformation"})
public class RequestedModification {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text relatedReference;
	/**
	 * Reference relating to a linked payment instruction or agreement which is
	 * meaningful to both parties (eg, the content of field 21 in a cover
	 * instruction).
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * "Reference relating to a linked payment instruction or agreement which is meaningful to both parties (eg, the content of field 21 in a cover instruction)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference relating to a linked payment instruction or agreement which is meaningful to both parties (eg, the content of field 21 in a cover instruction).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected SWIFTServiceLevel2Code bankOperationCode;
	/**
	 * SWIFT defined service level applies to the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code
	 * SWIFTServiceLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ServiceLevel#mmOther
	 * ServiceLevel.mmOther}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkOprCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOperationCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "SWIFT defined service level applies to the payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBankOperationCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ServiceLevel.mmOther;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "BkOprCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankOperationCode";
			definition = "SWIFT defined service level applies to the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> SWIFTServiceLevel2Code.mmObject();
		}
	};
	protected Instruction1Code instructionCode;
	/**
	 * Further information related to the processing of the payment instruction.
	 * The instruction can relate to a level of service between the bank and the
	 * customer, or give instructions to and for specific parties in the payment
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Instruction1Code
	 * Instruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmInstructionForNextAgent
	 * PaymentInstruction.mmInstructionForNextAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmInstructionForNextAgent;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "InstrCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCode";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Instruction1Code.mmObject();
		}
	};
	protected ISODate requestedExecutionDate;
	/**
	 * Date and time the debtor requests the clearing agent to process the
	 * payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdExctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time the debtor requests the clearing agent to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date and time the debtor requests the clearing agent to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate valueDate;
	/**
	 * Date on which the amount of money ceases to be available to the agent
	 * that owes it and when the amount of money becomes available to the agent
	 * to which it is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected CurrencyAndAmount interbankSettledAmount;
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettledAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettledAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
			componentContext_lazy = () -> RequestedModification.mmObject();
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
	 * Account to or from which a cash entry is made.
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDebtorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification intermediarySettlementAgent;
	/**
	 * Party that executes a cash transfer received via a clearing agent or on
	 * request of an agreement party.
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} =
	 * "Party that executes a cash transfer received via a clearing agent or on request of an agreement party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediarySettlementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "IntrmySttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediarySettlementAgent";
			definition = "Party that executes a cash transfer received via a clearing agent or on request of an agreement party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification lastSettlementAgent;
	/**
	 * Party that executes a cash transfer received via a clearing agent or on
	 * request of an agreement party.
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} =
	 * "Party that executes a cash transfer received via a clearing agent or on request of an agreement party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLastSettlementAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "LastSttlmAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastSettlementAgent";
			definition = "Party that executes a cash transfer received via a clearing agent or on request of an agreement party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification.mmObject();
		}
	};
	protected PaymentSchemeChoice paymentScheme;
	/**
	 * Specification of a pre-agreed offering between clearing agents, or the
	 * channel through which the payment instruction is to be processed. This
	 * payment scheme can point to a specific rulebook governing the rules of
	 * clearing and settlement between two parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PaymentSchemeChoice
	 * PaymentSchemeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystem
	 * CashClearingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtSchme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentScheme"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specification of a pre-agreed offering between clearing agents, or the channel through which the payment instruction is to be processed. This payment scheme can point to a specific rulebook governing the rules of clearing and settlement between two parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentScheme = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashClearingSystem.mmObject();
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "PmtSchme";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentScheme";
			definition = "Specification of a pre-agreed offering between clearing agents, or the channel through which the payment instruction is to be processed. This payment scheme can point to a specific rulebook governing the rules of clearing and settlement between two parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentSchemeChoice.mmObject();
		}
	};
	protected CashAccount3 beneficiaryInstitutionAccount;
	/**
	 * Account to or from which a cash entry is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount3
	 * CashAccount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryInstnAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitutionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiaryInstitutionAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "BnfcryInstnAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitutionAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected PartyIdentification1 creditor;
	/**
	 * Entity involved in an activity.
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} = "Entity involved in an activity."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Entity involved in an activity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification1.mmObject();
		}
	};
	protected CashAccount3 creditorAccount;
	/**
	 * Account to or from which a cash entry is made.
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount3.mmObject();
		}
	};
	protected RemittanceInformation3Choice remittanceInformation;
	/**
	 * Structured information that enables the matching, ie, reconciliation, of
	 * a payment with the items that the payment is intended to settle, such as
	 * commercial invoices in an account receivable system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RemittanceInformation3Choice
	 * RemittanceInformation3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Document.mmObject();
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "RmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceInformation";
			definition = "Structured information that enables the matching, ie, reconciliation, of a payment with the items that the payment is intended to settle, such as commercial invoices in an account receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RemittanceInformation3Choice.mmObject();
		}
	};
	protected PurposeChoice purpose;
	/**
	 * Underlying reason for the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PurposeChoice
	 * PurposeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPurpose
	 * PaymentObligation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
	 * definition} = "Underlying reason for the payment transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPurpose = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPurpose;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Underlying reason for the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PurposeChoice.mmObject();
		}
	};
	protected InstructionForFinalAgent instructionForFinalAgent;
	/**
	 * Further information related to the processing of the payment instruction.
	 * The instruction can relate to a level of service between the bank and the
	 * customer, or give instructions to and for specific parties in the payment
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InstructionForFinalAgent
	 * InstructionForFinalAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructionForCreditorAgent
	 * Payment.mmInstructionForCreditorAgent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrForFnlAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionForFinalAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionForFinalAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructionForCreditorAgent;
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "InstrForFnlAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionForFinalAgent";
			definition = "Further information related to the processing of the payment instruction. The instruction can relate to a level of service between the bank and the customer, or give instructions to and for specific parties in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InstructionForFinalAgent.mmObject();
		}
	};
	protected ChargeBearer1Code detailsOfCharges;
	/**
	 * Party(ies) liable for a charge associated with the transfer of cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeBearer1Code
	 * ChargeBearer1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtlsOfChrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DetailsOfCharges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party(ies) liable for a charge associated with the transfer of cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDetailsOfCharges = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RequestedModification.mmObject();
			isDerived = false;
			xmlTag = "DtlsOfChrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DetailsOfCharges";
			definition = "Party(ies) liable for a charge associated with the transfer of cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearer1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RequestedModification
	 * RequestedModification}</li>
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
			componentContext_lazy = () -> RequestedModification.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(RequestedModification.mmRelatedReference, RequestedModification.mmBankOperationCode, RequestedModification.mmInstructionCode, RequestedModification.mmRequestedExecutionDate,
						RequestedModification.mmValueDate, RequestedModification.mmInterbankSettledAmount, RequestedModification.mmDebtor, RequestedModification.mmDebtorAccount, RequestedModification.mmIntermediarySettlementAgent,
						RequestedModification.mmLastSettlementAgent, RequestedModification.mmPaymentScheme, RequestedModification.mmBeneficiaryInstitutionAccount, RequestedModification.mmCreditor, RequestedModification.mmCreditorAccount,
						RequestedModification.mmRemittanceInformation, RequestedModification.mmPurpose, RequestedModification.mmInstructionForFinalAgent, RequestedModification.mmDetailsOfCharges,
						RequestedModification.mmSenderToReceiverInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(RequestToModifyPayment.mmModification);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RequestedModification";
				definition = "Contains the requested modifications.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RltdRef")
	public Max35Text getRelatedReference() {
		return relatedReference;
	}

	public void setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
	}

	@XmlElement(name = "BkOprCd")
	public SWIFTServiceLevel2Code getBankOperationCode() {
		return bankOperationCode;
	}

	public void setBankOperationCode(SWIFTServiceLevel2Code bankOperationCode) {
		this.bankOperationCode = bankOperationCode;
	}

	@XmlElement(name = "InstrCd")
	public Instruction1Code getInstructionCode() {
		return instructionCode;
	}

	public void setInstructionCode(Instruction1Code instructionCode) {
		this.instructionCode = instructionCode;
	}

	@XmlElement(name = "ReqdExctnDt")
	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public void setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = requestedExecutionDate;
	}

	@XmlElement(name = "ValDt")
	public ISODate getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
	}

	@XmlElement(name = "IntrBkSttldAmt")
	public CurrencyAndAmount getInterbankSettledAmount() {
		return interbankSettledAmount;
	}

	public void setInterbankSettledAmount(CurrencyAndAmount interbankSettledAmount) {
		this.interbankSettledAmount = interbankSettledAmount;
	}

	@XmlElement(name = "Dbtr")
	public PartyIdentification1 getDebtor() {
		return debtor;
	}

	public void setDebtor(com.tools20022.repository.msg.PartyIdentification1 debtor) {
		this.debtor = debtor;
	}

	@XmlElement(name = "DbtrAcct")
	public CashAccount3 getDebtorAccount() {
		return debtorAccount;
	}

	public void setDebtorAccount(com.tools20022.repository.msg.CashAccount3 debtorAccount) {
		this.debtorAccount = debtorAccount;
	}

	@XmlElement(name = "IntrmySttlmAgt")
	public BranchAndFinancialInstitutionIdentification getIntermediarySettlementAgent() {
		return intermediarySettlementAgent;
	}

	public void setIntermediarySettlementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification intermediarySettlementAgent) {
		this.intermediarySettlementAgent = intermediarySettlementAgent;
	}

	@XmlElement(name = "LastSttlmAgt")
	public BranchAndFinancialInstitutionIdentification getLastSettlementAgent() {
		return lastSettlementAgent;
	}

	public void setLastSettlementAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification lastSettlementAgent) {
		this.lastSettlementAgent = lastSettlementAgent;
	}

	@XmlElement(name = "PmtSchme")
	public PaymentSchemeChoice getPaymentScheme() {
		return paymentScheme;
	}

	public void setPaymentScheme(PaymentSchemeChoice paymentScheme) {
		this.paymentScheme = paymentScheme;
	}

	@XmlElement(name = "BnfcryInstnAcct")
	public CashAccount3 getBeneficiaryInstitutionAccount() {
		return beneficiaryInstitutionAccount;
	}

	public void setBeneficiaryInstitutionAccount(com.tools20022.repository.msg.CashAccount3 beneficiaryInstitutionAccount) {
		this.beneficiaryInstitutionAccount = beneficiaryInstitutionAccount;
	}

	@XmlElement(name = "Cdtr")
	public PartyIdentification1 getCreditor() {
		return creditor;
	}

	public void setCreditor(com.tools20022.repository.msg.PartyIdentification1 creditor) {
		this.creditor = creditor;
	}

	@XmlElement(name = "CdtrAcct")
	public CashAccount3 getCreditorAccount() {
		return creditorAccount;
	}

	public void setCreditorAccount(com.tools20022.repository.msg.CashAccount3 creditorAccount) {
		this.creditorAccount = creditorAccount;
	}

	@XmlElement(name = "RmtInf")
	public RemittanceInformation3Choice getRemittanceInformation() {
		return remittanceInformation;
	}

	public void setRemittanceInformation(RemittanceInformation3Choice remittanceInformation) {
		this.remittanceInformation = remittanceInformation;
	}

	@XmlElement(name = "Purp")
	public PurposeChoice getPurpose() {
		return purpose;
	}

	public void setPurpose(PurposeChoice purpose) {
		this.purpose = purpose;
	}

	@XmlElement(name = "InstrForFnlAgt")
	public InstructionForFinalAgent getInstructionForFinalAgent() {
		return instructionForFinalAgent;
	}

	public void setInstructionForFinalAgent(com.tools20022.repository.msg.InstructionForFinalAgent instructionForFinalAgent) {
		this.instructionForFinalAgent = instructionForFinalAgent;
	}

	@XmlElement(name = "DtlsOfChrgs")
	public ChargeBearer1Code getDetailsOfCharges() {
		return detailsOfCharges;
	}

	public void setDetailsOfCharges(ChargeBearer1Code detailsOfCharges) {
		this.detailsOfCharges = detailsOfCharges;
	}

	@XmlElement(name = "SndrToRcvrInf")
	public List<Max35Text> getSenderToReceiverInformation() {
		return senderToReceiverInformation;
	}

	public void setSenderToReceiverInformation(List<Max35Text> senderToReceiverInformation) {
		this.senderToReceiverInformation = senderToReceiverInformation;
	}
}