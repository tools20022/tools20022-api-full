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
import com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod3Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics that apply to the debit side of the payment
 * transactions included in the credit transfer transaction initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPaymentInformationIdentification
 * PaymentInstructionInformation1.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPaymentMethod
 * PaymentInstructionInformation1.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPaymentTypeInformation
 * PaymentInstructionInformation1.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmRequestedExecutionDate
 * PaymentInstructionInformation1.mmRequestedExecutionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmPoolingAdjustmentDate
 * PaymentInstructionInformation1.mmPoolingAdjustmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmDebtor
 * PaymentInstructionInformation1.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmDebtorAccount
 * PaymentInstructionInformation1.mmDebtorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmDebtorAgent
 * PaymentInstructionInformation1.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmDebtorAgentAccount
 * PaymentInstructionInformation1.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmUltimateDebtor
 * PaymentInstructionInformation1.mmUltimateDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmChargeBearer
 * PaymentInstructionInformation1.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmChargesAccount
 * PaymentInstructionInformation1.mmChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmChargesAccountAgent
 * PaymentInstructionInformation1.mmChargesAccountAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1#mmCreditTransferTransactionInformation
 * PaymentInstructionInformation1.mmCreditTransferTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerCreditTransferInitiationV02#mmPaymentInformation
 * CustomerCreditTransferInitiationV02.mmPaymentInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forPaymentInstructionInformation1
 * ConstraintPaymentTypeInformationRule.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionRule#forPaymentInstructionInformation1
 * ConstraintChequeInstructionRule.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesAccountRule#forPaymentInstructionInformation1
 * ConstraintChargesAccountRule.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesAccountAgentRule#forPaymentInstructionInformation1
 * ConstraintChargesAccountAgentRule.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAccountRule#forPaymentInstructionInformation1
 * ConstraintCreditorAndOrCreditorAccountRule.forPaymentInstructionInformation1}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorAgentRule#forPaymentInstructionInformation1
 * ConstraintCreditorAgentRule.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline#forPaymentInstructionInformation1
 * ConstraintUltimateDebtorGuideline.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline#forPaymentInstructionInformation1
 * ConstraintChequeInstructionDeliverToDebtorGuideline.
 * forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline#forPaymentInstructionInformation1
 * ConstraintChequeInstructionDeliverToCreditorGuideline.
 * forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline#forPaymentInstructionInformation1
 * ConstraintChequeInstructionDeliverToCreditorAgentGuideline.
 * forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChequeFromGuideline#forPaymentInstructionInformation1
 * ConstraintChequeFromGuideline.forPaymentInstructionInformation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstructionInformation1
 * ConstraintChargeBearerRule.forPaymentInstructionInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstructionInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of characteristics that apply to the debit side of the payment transactions included in the credit transfer transaction initiation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstructionInformation1", propOrder = {"paymentInformationIdentification", "paymentMethod", "paymentTypeInformation", "requestedExecutionDate", "poolingAdjustmentDate", "debtor", "debtorAccount", "debtorAgent",
		"debtorAgentAccount", "ultimateDebtor", "chargeBearer", "chargesAccount", "chargesAccountAgent", "creditTransferTransactionInformation"})
public class PaymentInstructionInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInfId")
	protected Max35Text paymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a sending party to unambiguously identify the payment information block within the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionInformation1, Optional<Max35Text>> mmPaymentInformationIdentification = new MMMessageAttribute<PaymentInstructionInformation1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Reference assigned by a sending party to unambiguously identify the payment information block within the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(PaymentInstructionInformation1 obj) {
			return obj.getPaymentInformationIdentification();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<Max35Text> value) {
			obj.setPaymentInformationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtMtd", required = true)
	protected PaymentMethod3Code paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod3Code
	 * PaymentMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	 * "Specifies the means of payment that will be used to move the amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionInformation1, PaymentMethod3Code> mmPaymentMethod = new MMMessageAttribute<PaymentInstructionInformation1, PaymentMethod3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod3Code.mmObject();
		}

		@Override
		public PaymentMethod3Code getValue(PaymentInstructionInformation1 obj) {
			return obj.getPaymentMethod();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, PaymentMethod3Code value) {
			obj.setPaymentMethod(value);
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation1 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation1
	 * PaymentTypeInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<PaymentTypeInformation1>> mmPaymentTypeInformation = new MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<PaymentTypeInformation1>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTypeInformation1.mmObject();
		}

		@Override
		public Optional<PaymentTypeInformation1> getValue(PaymentInstructionInformation1 obj) {
			return obj.getPaymentTypeInformation();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<PaymentTypeInformation1> value) {
			obj.setPaymentTypeInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	 * "Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.\n\nUsage: This is the date on which the debtor's account(s) is (are) to be debited."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionInformation1, ISODate> mmRequestedExecutionDate = new MMMessageAttribute<PaymentInstructionInformation1, ISODate>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ReqdExctnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedExecutionDate";
			definition = "Date at which the initiating party requests the clearing agent to process the payment. If payment by cheque, the date when the cheque must be generated by the bank.\n\nUsage: This is the date on which the debtor's account(s) is (are) to be debited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PaymentInstructionInformation1 obj) {
			return obj.getRequestedExecutionDate();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, ISODate value) {
			obj.setRequestedExecutionDate(value);
		}
	};
	@XmlElement(name = "PoolgAdjstmntDt")
	protected ISODate poolingAdjustmentDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPoolingAdjustmentDate
	 * Payment.mmPoolingAdjustmentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolgAdjstmntDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolingAdjustmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PaymentInstructionInformation1, Optional<ISODate>> mmPoolingAdjustmentDate = new MMMessageAttribute<PaymentInstructionInformation1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPoolingAdjustmentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "PoolgAdjstmntDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolingAdjustmentDate";
			definition = "Date used for the correction of the value date of a cash pool movement that has been posted with a different value date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(PaymentInstructionInformation1 obj) {
			return obj.getPoolingAdjustmentDate();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<ISODate> value) {
			obj.setPoolingAdjustmentDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr", required = true)
	protected PartyIdentification8 debtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, PartyIdentification8> mmDebtor = new MMMessageAssociationEnd<PaymentInstructionInformation1, PartyIdentification8>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public PartyIdentification8 getValue(PaymentInstructionInformation1 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, PartyIdentification8 value) {
			obj.setDebtor(value);
		}
	};
	@XmlElement(name = "DbtrAcct", required = true)
	protected CashAccount7 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, CashAccount7> mmDebtorAccount = new MMMessageAssociationEnd<PaymentInstructionInformation1, CashAccount7>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public CashAccount7 getValue(PaymentInstructionInformation1 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, CashAccount7 value) {
			obj.setDebtorAccount(value);
		}
	};
	@XmlElement(name = "DbtrAgt", required = true)
	protected BranchAndFinancialInstitutionIdentification3 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, BranchAndFinancialInstitutionIdentification3> mmDebtorAgent = new MMMessageAssociationEnd<PaymentInstructionInformation1, BranchAndFinancialInstitutionIdentification3>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification3 getValue(PaymentInstructionInformation1 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, BranchAndFinancialInstitutionIdentification3 value) {
			obj.setDebtorAgent(value);
		}
	};
	@XmlElement(name = "DbtrAgtAcct")
	protected CashAccount7 debtorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<CashAccount7>> mmDebtorAgentAccount = new MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Unambiguous identification of the account of the debtor agent at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(PaymentInstructionInformation1 obj) {
			return obj.getDebtorAgentAccount();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<CashAccount7> value) {
			obj.setDebtorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "UltmtDbtr")
	protected PartyIdentification8 ultimateDebtor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification8
	 * PartyIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<PartyIdentification8>> mmUltimateDebtor = new MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<PartyIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "UltmtDbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateDebtor";
			definition = "Ultimate party that owes an amount of money to the (ultimate) creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification8.mmObject();
		}

		@Override
		public Optional<PartyIdentification8> getValue(PaymentInstructionInformation1 obj) {
			return obj.getUltimateDebtor();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<PartyIdentification8> value) {
			obj.setUltimateDebtor(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
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
	public static final MMMessageAttribute<PaymentInstructionInformation1, Optional<ChargeBearerType1Code>> mmChargeBearer = new MMMessageAttribute<PaymentInstructionInformation1, Optional<ChargeBearerType1Code>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}

		@Override
		public Optional<ChargeBearerType1Code> getValue(PaymentInstructionInformation1 obj) {
			return obj.getChargeBearer();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<ChargeBearerType1Code> value) {
			obj.setChargeBearer(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsAcct")
	protected CashAccount7 chargesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount7
	 * CashAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
	 * Charges.mmChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account used to process charges associated with a transaction.\n\nUsage: charges account should be used when charges have to be booked to an account different from the account identified in debtor's account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<CashAccount7>> mmChargesAccount = new MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<CashAccount7>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargesDebitAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account used to process charges associated with a transaction.\n\nUsage: charges account should be used when charges have to be booked to an account different from the account identified in debtor's account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount7.mmObject();
		}

		@Override
		public Optional<CashAccount7> getValue(PaymentInstructionInformation1 obj) {
			return obj.getChargesAccount();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<CashAccount7> value) {
			obj.setChargesAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgsAcctAgt")
	protected BranchAndFinancialInstitutionIdentification3 chargesAccountAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification3
	 * BranchAndFinancialInstitutionIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgsAcctAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAccountAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent that services a charges account. \n\nUsage: charges account agent should only be used when the charges account agent is different from the debtor agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<BranchAndFinancialInstitutionIdentification3>> mmChargesAccountAgent = new MMMessageAssociationEnd<PaymentInstructionInformation1, Optional<BranchAndFinancialInstitutionIdentification3>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcctAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccountAgent";
			definition = "Agent that services a charges account. \n\nUsage: charges account agent should only be used when the charges account agent is different from the debtor agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BranchAndFinancialInstitutionIdentification3.mmObject();
		}

		@Override
		public Optional<BranchAndFinancialInstitutionIdentification3> getValue(PaymentInstructionInformation1 obj) {
			return obj.getChargesAccountAgent();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, Optional<BranchAndFinancialInstitutionIdentification3> value) {
			obj.setChargesAccountAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtTrfTxInf", required = true)
	protected List<CreditTransferTransactionInformation1> creditTransferTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransactionInformation1
	 * CreditTransferTransactionInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditTransfer
	 * CreditTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstructionInformation1
	 * PaymentInstructionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtTrfTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditTransferTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements providing information specific to the individual transaction(s) included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentInstructionInformation1, List<CreditTransferTransactionInformation1>> mmCreditTransferTransactionInformation = new MMMessageAssociationEnd<PaymentInstructionInformation1, List<CreditTransferTransactionInformation1>>() {
		{
			businessComponentTrace_lazy = () -> CreditTransfer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstructionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CdtTrfTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditTransferTransactionInformation";
			definition = "Set of elements providing information specific to the individual transaction(s) included in the message.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CreditTransferTransactionInformation1.mmObject();
		}

		@Override
		public List<CreditTransferTransactionInformation1> getValue(PaymentInstructionInformation1 obj) {
			return obj.getCreditTransferTransactionInformation();
		}

		@Override
		public void setValue(PaymentInstructionInformation1 obj, List<CreditTransferTransactionInformation1> value) {
			obj.setCreditTransferTransactionInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstructionInformation1.mmPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstructionInformation1.mmPaymentMethod,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstructionInformation1.mmRequestedExecutionDate,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmPoolingAdjustmentDate, com.tools20022.repository.msg.PaymentInstructionInformation1.mmDebtor,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmDebtorAccount, com.tools20022.repository.msg.PaymentInstructionInformation1.mmDebtorAgent,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmDebtorAgentAccount, com.tools20022.repository.msg.PaymentInstructionInformation1.mmUltimateDebtor,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmChargeBearer, com.tools20022.repository.msg.PaymentInstructionInformation1.mmChargesAccount,
						com.tools20022.repository.msg.PaymentInstructionInformation1.mmChargesAccountAgent, com.tools20022.repository.msg.PaymentInstructionInformation1.mmCreditTransferTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerCreditTransferInitiationV02.mmPaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChequeInstructionRule.forPaymentInstructionInformation1, com.tools20022.repository.constraints.ConstraintChargesAccountRule.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChargesAccountAgentRule.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintCreditorAndOrCreditorAccountRule.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintCreditorAgentRule.forPaymentInstructionInformation1, com.tools20022.repository.constraints.ConstraintUltimateDebtorGuideline.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToDebtorGuideline.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorGuideline.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChequeInstructionDeliverToCreditorAgentGuideline.forPaymentInstructionInformation1,
						com.tools20022.repository.constraints.ConstraintChequeFromGuideline.forPaymentInstructionInformation1, com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstructionInformation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstructionInformation1";
				definition = "Set of characteristics that apply to the debit side of the payment transactions included in the credit transfer transaction initiation.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPaymentInformationIdentification() {
		return paymentInformationIdentification == null ? Optional.empty() : Optional.of(paymentInformationIdentification);
	}

	public PaymentInstructionInformation1 setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = paymentInformationIdentification;
		return this;
	}

	public PaymentMethod3Code getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentInstructionInformation1 setPaymentMethod(PaymentMethod3Code paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public Optional<PaymentTypeInformation1> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public PaymentInstructionInformation1 setPaymentTypeInformation(PaymentTypeInformation1 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public ISODate getRequestedExecutionDate() {
		return requestedExecutionDate;
	}

	public PaymentInstructionInformation1 setRequestedExecutionDate(ISODate requestedExecutionDate) {
		this.requestedExecutionDate = Objects.requireNonNull(requestedExecutionDate);
		return this;
	}

	public Optional<ISODate> getPoolingAdjustmentDate() {
		return poolingAdjustmentDate == null ? Optional.empty() : Optional.of(poolingAdjustmentDate);
	}

	public PaymentInstructionInformation1 setPoolingAdjustmentDate(ISODate poolingAdjustmentDate) {
		this.poolingAdjustmentDate = poolingAdjustmentDate;
		return this;
	}

	public PartyIdentification8 getDebtor() {
		return debtor;
	}

	public PaymentInstructionInformation1 setDebtor(PartyIdentification8 debtor) {
		this.debtor = Objects.requireNonNull(debtor);
		return this;
	}

	public CashAccount7 getDebtorAccount() {
		return debtorAccount;
	}

	public PaymentInstructionInformation1 setDebtorAccount(CashAccount7 debtorAccount) {
		this.debtorAccount = Objects.requireNonNull(debtorAccount);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification3 getDebtorAgent() {
		return debtorAgent;
	}

	public PaymentInstructionInformation1 setDebtorAgent(BranchAndFinancialInstitutionIdentification3 debtorAgent) {
		this.debtorAgent = Objects.requireNonNull(debtorAgent);
		return this;
	}

	public Optional<CashAccount7> getDebtorAgentAccount() {
		return debtorAgentAccount == null ? Optional.empty() : Optional.of(debtorAgentAccount);
	}

	public PaymentInstructionInformation1 setDebtorAgentAccount(CashAccount7 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification8> getUltimateDebtor() {
		return ultimateDebtor == null ? Optional.empty() : Optional.of(ultimateDebtor);
	}

	public PaymentInstructionInformation1 setUltimateDebtor(PartyIdentification8 ultimateDebtor) {
		this.ultimateDebtor = ultimateDebtor;
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentInstructionInformation1 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public Optional<CashAccount7> getChargesAccount() {
		return chargesAccount == null ? Optional.empty() : Optional.of(chargesAccount);
	}

	public PaymentInstructionInformation1 setChargesAccount(CashAccount7 chargesAccount) {
		this.chargesAccount = chargesAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification3> getChargesAccountAgent() {
		return chargesAccountAgent == null ? Optional.empty() : Optional.of(chargesAccountAgent);
	}

	public PaymentInstructionInformation1 setChargesAccountAgent(BranchAndFinancialInstitutionIdentification3 chargesAccountAgent) {
		this.chargesAccountAgent = chargesAccountAgent;
		return this;
	}

	public List<CreditTransferTransactionInformation1> getCreditTransferTransactionInformation() {
		return creditTransferTransactionInformation == null ? creditTransferTransactionInformation = new ArrayList<>() : creditTransferTransactionInformation;
	}

	public PaymentInstructionInformation1 setCreditTransferTransactionInformation(List<CreditTransferTransactionInformation1> creditTransferTransactionInformation) {
		this.creditTransferTransactionInformation = Objects.requireNonNull(creditTransferTransactionInformation);
		return this;
	}
}