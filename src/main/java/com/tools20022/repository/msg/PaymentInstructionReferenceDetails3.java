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
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies a payment instruction by a set of characteristics (as per EBA
 * system requirements) which provides an unambiguous identification of the
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmPaymentInstructionReference
 * PaymentInstructionReferenceDetails3.mmPaymentInstructionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankSettlementAmount
 * PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInterbankValueDate
 * PaymentInstructionReferenceDetails3.mmInterbankValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmPaymentMethod
 * PaymentInstructionReferenceDetails3.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInstructingAgentIdentification
 * PaymentInstructionReferenceDetails3.mmInstructingAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmInstructedAgentIdentification
 * PaymentInstructionReferenceDetails3.mmInstructedAgentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3#mmRelatedReference
 * PaymentInstructionReferenceDetails3.mmRelatedReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstructionReferenceDetails3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a payment instruction by a set of characteristics (as per EBA system requirements) which provides an unambiguous identification of the instruction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstructionReferenceDetails3", propOrder = {"paymentInstructionReference", "interbankSettlementAmount", "interbankValueDate", "paymentMethod", "instructingAgentIdentification", "instructedAgentIdentification",
		"relatedReference"})
public class PaymentInstructionReferenceDetails3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInstrRef", required = true)
	protected Max35Text paymentInstructionReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInstrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInstructionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, Max35Text> mmPaymentInstructionReference = new MMMessageAttribute<PaymentInstructionReferenceDetails3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtInstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInstructionReference";
			definition = "Unique and unambiguous identifier for a payment instruction, as assigned by the clearing agent or the initiating party.\n.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getPaymentInstructionReference();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, Max35Text value) {
			obj.setPaymentInstructionReference(value);
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt", required = true)
	protected ImpliedCurrencyAndAmount interbankSettlementAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money moved between the instructing agent and the instructed agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, ImpliedCurrencyAndAmount> mmInterbankSettlementAmount = new MMMessageAttribute<PaymentInstructionReferenceDetails3, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getInterbankSettlementAmount();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, ImpliedCurrencyAndAmount value) {
			obj.setInterbankSettlementAmount(value);
		}
	};
	@XmlElement(name = "IntrBkValDt", required = true)
	protected ISODate interbankValueDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkValDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, ISODate> mmInterbankValueDate = new MMMessageAttribute<PaymentInstructionReferenceDetails3, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "IntrBkValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankValueDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getInterbankValueDate();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, ISODate value) {
			obj.setInterbankValueDate(value);
		}
	};
	@XmlElement(name = "PmtMtd")
	protected PaymentOrigin1Choice paymentMethod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPaymentInstrument
	 * Payment.mmPaymentInstrument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtMtd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The message type with which the instruction has been initiated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, Optional<PaymentOrigin1Choice>> mmPaymentMethod = new MMMessageAttribute<PaymentInstructionReferenceDetails3, Optional<PaymentOrigin1Choice>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPaymentInstrument;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "The message type with which the instruction has been initiated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentOrigin1Choice.mmObject();
		}

		@Override
		public Optional<PaymentOrigin1Choice> getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, Optional<PaymentOrigin1Choice> value) {
			obj.setPaymentMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "InstgAgtId", required = true)
	protected BICIdentifier instructingAgentIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgAgtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The identification of the instructing agent that transmitted the payment instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, BICIdentifier> mmInstructingAgentIdentification = new MMMessageAttribute<PaymentInstructionReferenceDetails3, BICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "InstgAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingAgentIdentification";
			definition = "The identification of the instructing agent that transmitted the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public BICIdentifier getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getInstructingAgentIdentification();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, BICIdentifier value) {
			obj.setInstructingAgentIdentification(value);
		}
	};
	@XmlElement(name = "InstdAgtId", required = true)
	protected BICIdentifier instructedAgentIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstdAgtId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAgentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The identification of the instructed agent in the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, BICIdentifier> mmInstructedAgentIdentification = new MMMessageAttribute<PaymentInstructionReferenceDetails3, BICIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "InstdAgtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAgentIdentification";
			definition = "The identification of the instructed agent in the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICIdentifier.mmObject();
		}

		@Override
		public BICIdentifier getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getInstructedAgentIdentification();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, BICIdentifier value) {
			obj.setInstructedAgentIdentification(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected Max35Text relatedReference;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionReferenceDetails3
	 * PaymentInstructionReferenceDetails3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The related reference as stipulated in the payment instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionReferenceDetails3, Optional<Max35Text>> mmRelatedReference = new MMMessageAttribute<PaymentInstructionReferenceDetails3, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "The related reference as stipulated in the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstructionReferenceDetails3 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(PaymentInstructionReferenceDetails3 obj, Optional<Max35Text> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmPaymentInstructionReference,
						com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInterbankValueDate,
						com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmPaymentMethod, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInstructingAgentIdentification,
						com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmInstructedAgentIdentification, com.tools20022.repository.msg.PaymentInstructionReferenceDetails3.mmRelatedReference);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PaymentInstructionReferenceDetails3";
				definition = "Identifies a payment instruction by a set of characteristics (as per EBA system requirements) which provides an unambiguous identification of the instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPaymentInstructionReference() {
		return paymentInstructionReference;
	}

	public PaymentInstructionReferenceDetails3 setPaymentInstructionReference(Max35Text paymentInstructionReference) {
		this.paymentInstructionReference = Objects.requireNonNull(paymentInstructionReference);
		return this;
	}

	public ImpliedCurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public PaymentInstructionReferenceDetails3 setInterbankSettlementAmount(ImpliedCurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = Objects.requireNonNull(interbankSettlementAmount);
		return this;
	}

	public ISODate getInterbankValueDate() {
		return interbankValueDate;
	}

	public PaymentInstructionReferenceDetails3 setInterbankValueDate(ISODate interbankValueDate) {
		this.interbankValueDate = Objects.requireNonNull(interbankValueDate);
		return this;
	}

	public Optional<PaymentOrigin1Choice> getPaymentMethod() {
		return paymentMethod == null ? Optional.empty() : Optional.of(paymentMethod);
	}

	public PaymentInstructionReferenceDetails3 setPaymentMethod(PaymentOrigin1Choice paymentMethod) {
		this.paymentMethod = paymentMethod;
		return this;
	}

	public BICIdentifier getInstructingAgentIdentification() {
		return instructingAgentIdentification;
	}

	public PaymentInstructionReferenceDetails3 setInstructingAgentIdentification(BICIdentifier instructingAgentIdentification) {
		this.instructingAgentIdentification = Objects.requireNonNull(instructingAgentIdentification);
		return this;
	}

	public BICIdentifier getInstructedAgentIdentification() {
		return instructedAgentIdentification;
	}

	public PaymentInstructionReferenceDetails3 setInstructedAgentIdentification(BICIdentifier instructedAgentIdentification) {
		this.instructedAgentIdentification = Objects.requireNonNull(instructedAgentIdentification);
		return this;
	}

	public Optional<Max35Text> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public PaymentInstructionReferenceDetails3 setRelatedReference(Max35Text relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}
}