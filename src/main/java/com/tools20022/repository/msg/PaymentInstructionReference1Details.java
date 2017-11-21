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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PaymentOrigin1Choice;
import com.tools20022.repository.datatype.BICIdentifier;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a payment instruction by a simple set of characteristics which
 * provides an unambiguous indentification of the instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmPaymentInstructionReference
 * PaymentInstructionReference1Details.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankSettlementAmount
 * PaymentInstructionReference1Details.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInterbankValueDate
 * PaymentInstructionReference1Details.mmInterbankValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmPaymentMethod
 * PaymentInstructionReference1Details.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInstructingAgentIdentification
 * PaymentInstructionReference1Details.mmInstructingAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details#mmInstructedAgentIdentification
 * PaymentInstructionReference1Details.mmInstructedAgentIdentification}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstructionReference1Details"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a payment instruction by a simple set of characteristics which provides an unambiguous indentification of the instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstructionReference1Details", propOrder = {"paymentInstructionReference", "interbankSettlementAmount", "interbankValueDate", "paymentMethod", "instructingAgentIdentification", "instructedAgentIdentification"})
public class PaymentInstructionReference1Details {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text paymentInstructionReference;
	/**
	 * Unique and unambiguous identifier for a payment instruction, as assigned
	 * by the clearing agent or the initiating party.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInstructionReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount interbankSettlementAmount;
	/**
	 * Amount of money moved between the instructing agent and the instructed
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementAmount
	 * CashSettlement.mmInterbankSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate interbankValueDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankValueDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected PaymentOrigin1Choice paymentMethod;
	/**
	 * Message type with which the instruction has been initiated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentOrigin1Choice
	 * PaymentOrigin1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmPayment
	 * PaymentExecution.mmPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message type with which the instruction has been initiated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmPayment;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Message type with which the instruction has been initiated.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PaymentOrigin1Choice.mmObject();
		}
	};
	protected BICIdentifier instructingAgentIdentification;
	/**
	 * Identification of the instructing agent that transmitted the payment
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the instructing agent that transmitted the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructingAgentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "InstgAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentIdentification";
			definition = "Identification of the instructing agent that transmitted the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};
	protected BICIdentifier instructedAgentIdentification;
	/**
	 * Identification of the instructed agent in the payment instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICIdentifier
	 * BICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReference1Details
	 * PaymentInstructionReference1Details}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the instructed agent in the payment instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructedAgentIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> PaymentInstructionReference1Details.mmObject();
			isDerived = false;
			xmlTag = "InstdAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentIdentification";
			definition = "Identification of the instructed agent in the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstructionReference1Details.mmPaymentInstructionReference, PaymentInstructionReference1Details.mmInterbankSettlementAmount,
						PaymentInstructionReference1Details.mmInterbankValueDate, PaymentInstructionReference1Details.mmPaymentMethod, PaymentInstructionReference1Details.mmInstructingAgentIdentification,
						PaymentInstructionReference1Details.mmInstructedAgentIdentification);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentInstructionReference1Details";
				definition = "Identifies a payment instruction by a simple set of characteristics which provides an unambiguous indentification of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtInstrRef", required = true)
	public Max35Text getPaymentInstructionReference() {
		return paymentInstructionReference;
	}

	public void setPaymentInstructionReference(Max35Text paymentInstructionReference) {
		this.paymentInstructionReference = paymentInstructionReference;
	}

	@XmlElement(name = "IntrBkSttlmAmt", required = true)
	public ImpliedCurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public void setInterbankSettlementAmount(ImpliedCurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = interbankSettlementAmount;
	}

	@XmlElement(name = "IntrBkValDt", required = true)
	public ISODate getInterbankValueDate() {
		return interbankValueDate;
	}

	public void setInterbankValueDate(ISODate interbankValueDate) {
		this.interbankValueDate = interbankValueDate;
	}

	@XmlElement(name = "PmtMtd", required = true)
	public PaymentOrigin1Choice getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@XmlElement(name = "InstgAgtId", required = true)
	public BICIdentifier getInstructingAgentIdentification() {
		return instructingAgentIdentification;
	}

	public void setInstructingAgentIdentification(BICIdentifier instructingAgentIdentification) {
		this.instructingAgentIdentification = instructingAgentIdentification;
	}

	@XmlElement(name = "InstdAgtId", required = true)
	public BICIdentifier getInstructedAgentIdentification() {
		return instructedAgentIdentification;
	}

	public void setInstructedAgentIdentification(BICIdentifier instructedAgentIdentification) {
		this.instructedAgentIdentification = instructedAgentIdentification;
	}
}