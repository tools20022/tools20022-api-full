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
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of a payment instruction. The information contained in this component
 * is sufficient to retrieve a payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#InstructedAmountOrInterbankSettlementAmount
 * PaymentInstructionExtract2.InstructedAmountOrInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#RequestedExecutionDateOrInterbankSettlementDate
 * PaymentInstructionExtract2.RequestedExecutionDateOrInterbankSettlementDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmOriginalMessageNameIdentification
 * PaymentInstructionExtract2.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmOriginalInstructionIdentification
 * PaymentInstructionExtract2.mmOriginalInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInstructedAmount
 * PaymentInstructionExtract2.mmInstructedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementAmount
 * PaymentInstructionExtract2.mmInterbankSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmRequestedExecutionDate
 * PaymentInstructionExtract2.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementDate
 * PaymentInstructionExtract2.mmInterbankSettlementDate}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInstructedAmountAndRequestedExecutionDateRule#forPaymentInstructionExtract2
 * ConstraintInstructedAmountAndRequestedExecutionDateRule.
 * forPaymentInstructionExtract2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterbankSettlementAmountAndDateRule#forPaymentInstructionExtract2
 * ConstraintInterbankSettlementAmountAndDateRule.forPaymentInstructionExtract2}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstructionExtract2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of a payment instruction. The information contained in this component is sufficient to retrieve a payment instruction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstructionExtract2", propOrder = {"originalMessageNameIdentification", "originalInstructionIdentification", "instructedAmount", "interbankSettlementAmount", "requestedExecutionDate", "interbankSettlementDate"})
public class PaymentInstructionExtract2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgNmId")
	protected Max35Text originalMessageNameIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlInstrId", required = true)
	protected Max35Text originalInstructionIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalInstructionIdentification";
			definition = "Original unique instruction identification as assigned by an instructing party for an instructed party to unambiguously identify the original instruction.\n\nUsage: the original instruction identification is the original point to point reference used between the instructing party and the instructed party to refer to the original instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "InstdAmt", required = true)
	protected CurrencyAndAmount instructedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "InstdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "IntrBkSttlmAmt", required = true)
	protected CurrencyAndAmount interbankSettlementAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementAmount";
			definition = "Amount of money moved between the instructing agent and the instructed agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ReqdExctnDt", required = true)
	protected ISODate requestedExecutionDate;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRequestedExecutionDate
	 * PaymentExecution.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
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
	 * "Date the debtor requests the clearing agent to process the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedExecutionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date the debtor requests the clearing agent to process the payment instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "IntrBkSttlmDt", required = true)
	protected ISODate interbankSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrBkSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterbankSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			isDerived = false;
			xmlTag = "IntrBkSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterbankSettlementDate";
			definition = "Date on which the amount of money ceases to be available to the agent that owes it and when the amount of money becomes available to the agent to which it is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * If InstructedAmount is present, then InterbankSettlementAmount is not
	 * allowed. If InterbankSettlementAmount is present, then InstructedAmount
	 * is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInstructedAmount
	 * PaymentInstructionExtract2.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementAmount
	 * PaymentInstructionExtract2.mmInterbankSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructedAmountOrInterbankSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If InstructedAmount is present, then InterbankSettlementAmount is not allowed.\nIf InterbankSettlementAmount is present, then InstructedAmount is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMXor InstructedAmountOrInterbankSettlementAmount = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructedAmountOrInterbankSettlementAmount";
			definition = "If InstructedAmount is present, then InterbankSettlementAmount is not allowed.\nIf InterbankSettlementAmount is present, then InstructedAmount is not allowed.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionExtract2.mmInstructedAmount, com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementAmount);
		}
	};
	/**
	 * If RequestedExecutionDate is present, then InterbankSettlementDate is not
	 * allowed. If InterbankSettlementDate is present, then
	 * RequestedExecutionDate is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2
	 * PaymentInstructionExtract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmRequestedExecutionDate
	 * PaymentInstructionExtract2.mmRequestedExecutionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionExtract2#mmInterbankSettlementDate
	 * PaymentInstructionExtract2.mmInterbankSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedExecutionDateOrInterbankSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If RequestedExecutionDate is present, then InterbankSettlementDate is not allowed.\nIf InterbankSettlementDate is present, then RequestedExecutionDate is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMXor RequestedExecutionDateOrInterbankSettlementDate = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDateOrInterbankSettlementDate";
			definition = "If RequestedExecutionDate is present, then InterbankSettlementDate is not allowed.\nIf InterbankSettlementDate is present, then RequestedExecutionDate is not allowed.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.PaymentInstructionExtract2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionExtract2.mmRequestedExecutionDate, com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementDate);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionExtract2.mmOriginalMessageNameIdentification,
						com.tools20022.repository.msg.PaymentInstructionExtract2.mmOriginalInstructionIdentification, com.tools20022.repository.msg.PaymentInstructionExtract2.mmInstructedAmount,
						com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementAmount, com.tools20022.repository.msg.PaymentInstructionExtract2.mmRequestedExecutionDate,
						com.tools20022.repository.msg.PaymentInstructionExtract2.mmInterbankSettlementDate);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInstructedAmountAndRequestedExecutionDateRule.forPaymentInstructionExtract2,
						com.tools20022.repository.constraints.ConstraintInterbankSettlementAmountAndDateRule.forPaymentInstructionExtract2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PaymentInstructionExtract2";
				definition = "Details of a payment instruction. The information contained in this component is sufficient to retrieve a payment instruction.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionExtract2.InstructedAmountOrInterbankSettlementAmount,
						com.tools20022.repository.msg.PaymentInstructionExtract2.RequestedExecutionDateOrInterbankSettlementDate);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification == null ? Optional.empty() : Optional.of(originalMessageNameIdentification);
	}

	public PaymentInstructionExtract2 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
		return this;
	}

	public Max35Text getOriginalInstructionIdentification() {
		return originalInstructionIdentification;
	}

	public PaymentInstructionExtract2 setOriginalInstructionIdentification(Max35Text originalInstructionIdentification) {
		this.originalInstructionIdentification = Objects.requireNonNull(originalInstructionIdentification);
		return this;
	}

	public CurrencyAndAmount getInstructedAmount() {
		return instructedAmount;
	}

	public PaymentInstructionExtract2 setInstructedAmount(CurrencyAndAmount instructedAmount) {
		this.instructedAmount = Objects.requireNonNull(instructedAmount);
		return this;
	}

	public CurrencyAndAmount getInterbankSettlementAmount() {
		return interbankSettlementAmount;
	}

	public PaymentInstructionExtract2 setInterbankSettlementAmount(CurrencyAndAmount interbankSettlementAmount) {
		this.interbankSettlementAmount = Objects.requireNonNull(interbankSettlementAmount);
		return this;
	}

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public PaymentInstructionExtract2 setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public ISODate getInterbankSettlementDate() {
		return interbankSettlementDate;
	}

	public PaymentInstructionExtract2 setInterbankSettlementDate(ISODate interbankSettlementDate) {
		this.interbankSettlementDate = Objects.requireNonNull(interbankSettlementDate);
		return this;
	}
}