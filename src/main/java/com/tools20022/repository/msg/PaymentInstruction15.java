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
import com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05;
import com.tools20022.repository.codeset.ChargeBearerType1Code;
import com.tools20022.repository.codeset.PaymentMethod2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics that apply to the credit side of the payment transactions
 * included in the direct debit initiation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentInformationIdentification
 * PaymentInstruction15.mmPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentMethod
 * PaymentInstruction15.mmPaymentMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmBatchBooking
 * PaymentInstruction15.mmBatchBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmNumberOfTransactions
 * PaymentInstruction15.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmControlSum
 * PaymentInstruction15.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmPaymentTypeInformation
 * PaymentInstruction15.mmPaymentTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmRequestedCollectionDate
 * PaymentInstruction15.mmRequestedCollectionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmCreditor
 * PaymentInstruction15.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmCreditorAccount
 * PaymentInstruction15.mmCreditorAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmCreditorAgent
 * PaymentInstruction15.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmCreditorAgentAccount
 * PaymentInstruction15.mmCreditorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmUltimateCreditor
 * PaymentInstruction15.mmUltimateCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmChargeBearer
 * PaymentInstruction15.mmChargeBearer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmChargesAccount
 * PaymentInstruction15.mmChargesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmChargesAccountAgent
 * PaymentInstruction15.mmChargesAccountAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmCreditorSchemeIdentification
 * PaymentInstruction15.mmCreditorSchemeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15#mmDirectDebitTransactionInformation
 * PaymentInstruction15.mmDirectDebitTransactionInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.pain.CustomerDirectDebitInitiationV05#mmPaymentInformation
 * CustomerDirectDebitInitiationV05.mmPaymentInformation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargeBearerRule#forPaymentInstruction15
 * ConstraintChargeBearerRule.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline#forPaymentInstruction15
 * ConstraintUltimateCreditorGuideline.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesAccountRule#forPaymentInstruction15
 * ConstraintChargesAccountRule.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule#forPaymentInstruction15
 * ConstraintPaymentTypeInformationRule.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCreditorSchemeIdentificationRule#forPaymentInstruction15
 * ConstraintCreditorSchemeIdentificationRule.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUltimateCreditorRule#forPaymentInstruction15
 * ConstraintUltimateCreditorRule.forPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintChargesAccountAgentRule#forPaymentInstruction15
 * ConstraintChargesAccountAgentRule.forPaymentInstruction15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstruction15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Characteristics that apply to the credit side of the payment transactions included in the direct debit initiation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PaymentInstruction18
 * PaymentInstruction18}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10
 * PaymentInstruction10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstruction15", propOrder = {"paymentInformationIdentification", "paymentMethod", "batchBooking", "numberOfTransactions", "controlSum", "paymentTypeInformation", "requestedCollectionDate", "creditor",
		"creditorAccount", "creditorAgent", "creditorAgentAccount", "ultimateCreditor", "chargeBearer", "chargesAccount", "chargesAccountAgent", "creditorSchemeIdentification", "directDebitTransactionInformation"})
public class PaymentInstruction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtInfId", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentInformationIdentification
	 * PaymentInstruction18.mmPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentInformationIdentification
	 * PaymentInstruction10.mmPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationIdentification";
			definition = "Unique identification, as assigned by a sending party, to unambiguously identify the payment information group within the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmPaymentInformationIdentification);
			previousVersion_lazy = () -> PaymentInstruction10.mmPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PmtMtd", required = true)
	protected PaymentMethod2Code paymentMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentMethod2Code
	 * PaymentMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CreditInstrument#mmMethod
	 * CreditInstrument.mmMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentMethod
	 * PaymentInstruction18.mmPaymentMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentMethod
	 * PaymentInstruction10.mmPaymentMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CreditInstrument.mmMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentMethod";
			definition = "Specifies the means of payment that will be used to move the amount of money.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmPaymentMethod);
			previousVersion_lazy = () -> PaymentInstruction10.mmPaymentMethod;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentMethod2Code.mmObject();
		}
	};
	@XmlElement(name = "BtchBookg")
	protected BatchBookingIndicator batchBooking;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BatchBookingIndicator
	 * BatchBookingIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchBookg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmBatchBooking
	 * PaymentInstruction18.mmBatchBooking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmBatchBooking
	 * PaymentInstruction10.mmBatchBooking}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmBatchBooking);
			previousVersion_lazy = () -> PaymentInstruction10.mmBatchBooking;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	@XmlElement(name = "NbOfTxs")
	protected Max15NumericText numberOfTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmNumberOfTransactions
	 * PaymentInstruction18.mmNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmNumberOfTransactions
	 * PaymentInstruction10.mmNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the payment information group.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmNumberOfTransactions);
			previousVersion_lazy = () -> PaymentInstruction10.mmNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "CtrlSum")
	protected DecimalNumber controlSum;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the group, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmControlSum
	 * PaymentInstruction18.mmControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmControlSum
	 * PaymentInstruction10.mmControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmControlSum);
			previousVersion_lazy = () -> PaymentInstruction10.mmControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "PmtTpInf")
	protected PaymentTypeInformation24 paymentTypeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTypeInformation24
	 * PaymentTypeInformation24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmProcessingInstructions
	 * PaymentExecution.mmProcessingInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmPaymentTypeInformation
	 * PaymentInstruction18.mmPaymentTypeInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmPaymentTypeInformation
	 * PaymentInstruction10.mmPaymentTypeInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentTypeInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmProcessingInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtTpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentTypeInformation";
			definition = "Set of elements used to further specify the type of transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmPaymentTypeInformation);
			previousVersion_lazy = () -> PaymentInstruction10.mmPaymentTypeInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTypeInformation24.mmObject();
		}
	};
	@XmlElement(name = "ReqdColltnDt", required = true)
	protected ISODate requestedCollectionDate;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdColltnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedCollectionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the creditor requests that the amount of money is to be collected from the debtor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmRequestedCollectionDate
	 * PaymentInstruction18.mmRequestedCollectionDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmRequestedCollectionDate
	 * PaymentInstruction10.mmRequestedCollectionDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedCollectionDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRequestedExecutionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "ReqdColltnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedCollectionDate";
			definition = "Date and time at which the creditor requests that the amount of money is to be collected from the debtor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmRequestedCollectionDate);
			previousVersion_lazy = () -> PaymentInstruction10.mmRequestedCollectionDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmCreditor
	 * PaymentInstruction18.mmCreditor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmCreditor
	 * PaymentInstruction10.mmCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party to which an amount of money is due.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmCreditor);
			previousVersion_lazy = () -> PaymentInstruction10.mmCreditor;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "CdtrAcct", required = true)
	protected CashAccount24 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmCreditorAccount
	 * PaymentInstruction18.mmCreditorAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmCreditorAccount
	 * PaymentInstruction10.mmCreditorAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmCreditorAccount);
			previousVersion_lazy = () -> PaymentInstruction10.mmCreditorAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmCreditorAgent
	 * PaymentInstruction18.mmCreditorAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmCreditorAgent
	 * PaymentInstruction10.mmCreditorAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmCreditorAgent);
			previousVersion_lazy = () -> PaymentInstruction10.mmCreditorAgent;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "CdtrAgtAcct")
	protected CashAccount24 creditorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent in the payment chain."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmCreditorAgentAccount
	 * PaymentInstruction18.mmCreditorAgentAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmCreditorAgentAccount
	 * PaymentInstruction10.mmCreditorAgentAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorAgentAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent in the payment chain.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmCreditorAgentAccount);
			previousVersion_lazy = () -> PaymentInstruction10.mmCreditorAgentAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmUltimateCreditor
	 * PaymentInstruction18.mmUltimateCreditor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmUltimateCreditor
	 * PaymentInstruction10.mmUltimateCreditor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUltimateCreditor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "UltmtCdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UltimateCreditor";
			definition = "Ultimate party to which an amount of money is due.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmUltimateCreditor);
			previousVersion_lazy = () -> PaymentInstruction10.mmUltimateCreditor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmChargeBearer
	 * PaymentInstruction18.mmChargeBearer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmChargeBearer
	 * PaymentInstruction10.mmChargeBearer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeBearer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Charges.mmBearerType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "ChrgBr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeBearer";
			definition = "Specifies which party/parties will bear the charges associated with the processing of the payment transaction.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmChargeBearer);
			previousVersion_lazy = () -> PaymentInstruction10.mmChargeBearer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ChargeBearerType1Code.mmObject();
		}
	};
	@XmlElement(name = "ChrgsAcct")
	protected CashAccount24 chargesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargesDebitAccount
	 * Charges.mmChargesDebitAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmChargesAccount
	 * PaymentInstruction18.mmChargesAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmChargesAccount
	 * PaymentInstruction10.mmChargesAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargesDebitAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccount";
			definition = "Account used to process charges associated with a transaction.\n\nUsage: Charges account should be used when charges have to be booked to an account different from the account identified in debtor's account.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmChargesAccount);
			previousVersion_lazy = () -> PaymentInstruction10.mmChargesAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "ChrgsAcctAgt")
	protected BranchAndFinancialInstitutionIdentification5 chargesAccountAgent;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
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
	 * "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the creditor agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmChargesAccountAgent
	 * PaymentInstruction18.mmChargesAccountAgent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmChargesAccountAgent
	 * PaymentInstruction10.mmChargesAccountAgent}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargesAccountAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "ChrgsAcctAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAccountAgent";
			definition = "Agent that services a charges account.\n\nUsage: Charges account agent should only be used when the charges account agent is different from the creditor agent.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmChargesAccountAgent);
			previousVersion_lazy = () -> PaymentInstruction10.mmChargesAccountAgent;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5.mmObject();
		}
	};
	@XmlElement(name = "CdtrSchmeId")
	protected PartyIdentification43 creditorSchemeIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrSchmeId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorSchemeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit party that signs the mandate."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmCreditorSchemeIdentification
	 * PaymentInstruction18.mmCreditorSchemeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmCreditorSchemeIdentification
	 * PaymentInstruction10.mmCreditorSchemeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCreditorSchemeIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CdtrSchmeId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorSchemeIdentification";
			definition = "Credit party that signs the mandate.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmCreditorSchemeIdentification);
			previousVersion_lazy = () -> PaymentInstruction10.mmCreditorSchemeIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyIdentification43.mmObject();
		}
	};
	@XmlElement(name = "DrctDbtTxInf", required = true)
	protected List<com.tools20022.repository.msg.DirectDebitTransactionInformation18> directDebitTransactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation18
	 * DirectDebitTransactionInformation18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebit DirectDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction15
	 * PaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DrctDbtTxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectDebitTransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the individual transaction(s) included in the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction18#mmDirectDebitTransactionInformation
	 * PaymentInstruction18.mmDirectDebitTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction10#mmDirectDebitTransactionInformation
	 * PaymentInstruction10.mmDirectDebitTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDirectDebitTransactionInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DirectDebit.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "DrctDbtTxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectDebitTransactionInformation";
			definition = "Provides information on the individual transaction(s) included in the message.";
			nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmDirectDebitTransactionInformation);
			previousVersion_lazy = () -> PaymentInstruction10.mmDirectDebitTransactionInformation;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DirectDebitTransactionInformation18.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstruction15.mmPaymentInformationIdentification, com.tools20022.repository.msg.PaymentInstruction15.mmPaymentMethod,
						com.tools20022.repository.msg.PaymentInstruction15.mmBatchBooking, com.tools20022.repository.msg.PaymentInstruction15.mmNumberOfTransactions, com.tools20022.repository.msg.PaymentInstruction15.mmControlSum,
						com.tools20022.repository.msg.PaymentInstruction15.mmPaymentTypeInformation, com.tools20022.repository.msg.PaymentInstruction15.mmRequestedCollectionDate,
						com.tools20022.repository.msg.PaymentInstruction15.mmCreditor, com.tools20022.repository.msg.PaymentInstruction15.mmCreditorAccount, com.tools20022.repository.msg.PaymentInstruction15.mmCreditorAgent,
						com.tools20022.repository.msg.PaymentInstruction15.mmCreditorAgentAccount, com.tools20022.repository.msg.PaymentInstruction15.mmUltimateCreditor, com.tools20022.repository.msg.PaymentInstruction15.mmChargeBearer,
						com.tools20022.repository.msg.PaymentInstruction15.mmChargesAccount, com.tools20022.repository.msg.PaymentInstruction15.mmChargesAccountAgent,
						com.tools20022.repository.msg.PaymentInstruction15.mmCreditorSchemeIdentification, com.tools20022.repository.msg.PaymentInstruction15.mmDirectDebitTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerDirectDebitInitiationV05.mmPaymentInformation);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintChargeBearerRule.forPaymentInstruction15,
						com.tools20022.repository.constraints.ConstraintUltimateCreditorGuideline.forPaymentInstruction15, com.tools20022.repository.constraints.ConstraintChargesAccountRule.forPaymentInstruction15,
						com.tools20022.repository.constraints.ConstraintPaymentTypeInformationRule.forPaymentInstruction15, com.tools20022.repository.constraints.ConstraintCreditorSchemeIdentificationRule.forPaymentInstruction15,
						com.tools20022.repository.constraints.ConstraintUltimateCreditorRule.forPaymentInstruction15, com.tools20022.repository.constraints.ConstraintChargesAccountAgentRule.forPaymentInstruction15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstruction15";
				definition = "Characteristics that apply to the credit side of the payment transactions included in the direct debit initiation.";
				nextVersions_lazy = () -> Arrays.asList(PaymentInstruction18.mmObject());
				previousVersion_lazy = () -> PaymentInstruction10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getPaymentInformationIdentification() {
		return paymentInformationIdentification;
	}

	public PaymentInstruction15 setPaymentInformationIdentification(Max35Text paymentInformationIdentification) {
		this.paymentInformationIdentification = Objects.requireNonNull(paymentInformationIdentification);
		return this;
	}

	public PaymentMethod2Code getPaymentMethod() {
		return paymentMethod;
	}

	public PaymentInstruction15 setPaymentMethod(PaymentMethod2Code paymentMethod) {
		this.paymentMethod = Objects.requireNonNull(paymentMethod);
		return this;
	}

	public Optional<BatchBookingIndicator> getBatchBooking() {
		return batchBooking == null ? Optional.empty() : Optional.of(batchBooking);
	}

	public PaymentInstruction15 setBatchBooking(BatchBookingIndicator batchBooking) {
		this.batchBooking = batchBooking;
		return this;
	}

	public Optional<Max15NumericText> getNumberOfTransactions() {
		return numberOfTransactions == null ? Optional.empty() : Optional.of(numberOfTransactions);
	}

	public PaymentInstruction15 setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public PaymentInstruction15 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public Optional<PaymentTypeInformation24> getPaymentTypeInformation() {
		return paymentTypeInformation == null ? Optional.empty() : Optional.of(paymentTypeInformation);
	}

	public PaymentInstruction15 setPaymentTypeInformation(com.tools20022.repository.msg.PaymentTypeInformation24 paymentTypeInformation) {
		this.paymentTypeInformation = paymentTypeInformation;
		return this;
	}

	public ISODate getRequestedCollectionDate() {
		return requestedCollectionDate;
	}

	public PaymentInstruction15 setRequestedCollectionDate(ISODate requestedCollectionDate) {
		this.requestedCollectionDate = Objects.requireNonNull(requestedCollectionDate);
		return this;
	}

	public PartyIdentification43 getCreditor() {
		return creditor;
	}

	public PaymentInstruction15 setCreditor(com.tools20022.repository.msg.PartyIdentification43 creditor) {
		this.creditor = Objects.requireNonNull(creditor);
		return this;
	}

	public CashAccount24 getCreditorAccount() {
		return creditorAccount;
	}

	public PaymentInstruction15 setCreditorAccount(com.tools20022.repository.msg.CashAccount24 creditorAccount) {
		this.creditorAccount = Objects.requireNonNull(creditorAccount);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getCreditorAgent() {
		return creditorAgent;
	}

	public PaymentInstruction15 setCreditorAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public Optional<CashAccount24> getCreditorAgentAccount() {
		return creditorAgentAccount == null ? Optional.empty() : Optional.of(creditorAgentAccount);
	}

	public PaymentInstruction15 setCreditorAgentAccount(com.tools20022.repository.msg.CashAccount24 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification43> getUltimateCreditor() {
		return ultimateCreditor == null ? Optional.empty() : Optional.of(ultimateCreditor);
	}

	public PaymentInstruction15 setUltimateCreditor(com.tools20022.repository.msg.PartyIdentification43 ultimateCreditor) {
		this.ultimateCreditor = ultimateCreditor;
		return this;
	}

	public Optional<ChargeBearerType1Code> getChargeBearer() {
		return chargeBearer == null ? Optional.empty() : Optional.of(chargeBearer);
	}

	public PaymentInstruction15 setChargeBearer(ChargeBearerType1Code chargeBearer) {
		this.chargeBearer = chargeBearer;
		return this;
	}

	public Optional<CashAccount24> getChargesAccount() {
		return chargesAccount == null ? Optional.empty() : Optional.of(chargesAccount);
	}

	public PaymentInstruction15 setChargesAccount(com.tools20022.repository.msg.CashAccount24 chargesAccount) {
		this.chargesAccount = chargesAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification5> getChargesAccountAgent() {
		return chargesAccountAgent == null ? Optional.empty() : Optional.of(chargesAccountAgent);
	}

	public PaymentInstruction15 setChargesAccountAgent(com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5 chargesAccountAgent) {
		this.chargesAccountAgent = chargesAccountAgent;
		return this;
	}

	public Optional<PartyIdentification43> getCreditorSchemeIdentification() {
		return creditorSchemeIdentification == null ? Optional.empty() : Optional.of(creditorSchemeIdentification);
	}

	public PaymentInstruction15 setCreditorSchemeIdentification(com.tools20022.repository.msg.PartyIdentification43 creditorSchemeIdentification) {
		this.creditorSchemeIdentification = creditorSchemeIdentification;
		return this;
	}

	public List<DirectDebitTransactionInformation18> getDirectDebitTransactionInformation() {
		return directDebitTransactionInformation == null ? directDebitTransactionInformation = new ArrayList<>() : directDebitTransactionInformation;
	}

	public PaymentInstruction15 setDirectDebitTransactionInformation(List<com.tools20022.repository.msg.DirectDebitTransactionInformation18> directDebitTransactionInformation) {
		this.directDebitTransactionInformation = Objects.requireNonNull(directDebitTransactionInformation);
		return this;
	}
}