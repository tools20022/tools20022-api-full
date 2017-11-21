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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.InstructingAgentRole;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a payment instruction by a simple set of characteristics which
 * provides an unambiguous identification of the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmTransactionIdentification
 * ShortPaymentIdentification1.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmInterBankSettlementDate
 * ShortPaymentIdentification1.mmInterBankSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1#mmInstructingAgent
 * ShortPaymentIdentification1.mmInstructingAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
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
 * "ShortPaymentIdentification1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a payment instruction by a simple set of characteristics which provides an unambiguous identification of the instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ShortPaymentIdentification1", propOrder = {"transactionIdentification", "interBankSettlementDate", "instructingAgent"})
public class ShortPaymentIdentification1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unique identification, as assigned by the first instructing agent, to
	 * unambiguously identify the transaction that is passed on, unchanged,
	 * throughout the entire interbank chain. Usage: The transaction
	 * identification can be used for reconciliation, tracking or to link tasks
	 * relating to the transaction on the interbank level. The instructing agent
	 * has to make sure that the transaction identification is unique for a
	 * pre-agreed period. Usage: this is the former PaymentInstructionReference
	 * element.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1
	 * ShortPaymentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference element."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> ShortPaymentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unique identification, as assigned by the first instructing agent, to unambiguously identify the transaction that is passed on, unchanged, throughout the entire interbank chain.\nUsage: The transaction identification can be used for reconciliation, tracking or to link tasks relating to the transaction on the interbank level. The instructing agent has to make sure that the transaction identification is unique for a pre-agreed period.\nUsage: this is the former PaymentInstructionReference element.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODate interBankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1
	 * ShortPaymentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterBankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterBankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> ShortPaymentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterBankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected BranchAndFinancialInstitutionIdentification5 instructingAgent;
	/**
	 * Agent that instructs the next party in the chain to carry out the (set
	 * of) instruction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InstructingAgentRole
	 * InstructingAgentRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ShortPaymentIdentification1
	 * ShortPaymentIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that instructs the next party in the chain to carry out the (set of) instruction(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructingAgent = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InstructingAgentRole.mmObject();
			componentContext_lazy = () -> ShortPaymentIdentification1.mmObject();
			isDerived = false;
			xmlTag = "InstgAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgent";
			definition = "Agent that instructs the next party in the chain to carry out the (set of) instruction(s).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ShortPaymentIdentification1.mmTransactionIdentification, ShortPaymentIdentification1.mmInterBankSettlementDate, ShortPaymentIdentification1.mmInstructingAgent);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShortPaymentIdentification1";
				definition = "Identifies a payment instruction by a simple set of characteristics which provides an unambiguous identification of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "IntrBkSttlmDt", required = true)
	public ISODate getInterBankSettlementDate() {
		return interBankSettlementDate;
	}

	public void setInterBankSettlementDate(ISODate interBankSettlementDate) {
		this.interBankSettlementDate = interBankSettlementDate;
	}

	@XmlElement(name = "InstgAgt", required = true)
	public BranchAndFinancialInstitutionIdentification5 getInstructingAgent() {
		return instructingAgent;
	}

	public void setInstructingAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 instructingAgent) {
		this.instructingAgent = instructingAgent;
	}
}