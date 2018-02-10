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
import com.tools20022.repository.area.pain.CustomerPaymentReversalV06;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the original transactions, to which the status report
 * message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalPaymentInformationIdentification
 * OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmOriginalPaymentInformationIdentification
 * OriginalPaymentInstruction16.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmOriginalNumberOfTransactions
 * OriginalPaymentInstruction16.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmOriginalControlSum
 * OriginalPaymentInstruction16.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmBatchBooking
 * OriginalPaymentInstruction16.mmBatchBooking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmPaymentInformationReversal
 * OriginalPaymentInstruction16.mmPaymentInformationReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmReversalReasonInformation
 * OriginalPaymentInstruction16.mmReversalReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16#mmTransactionInformation
 * OriginalPaymentInstruction16.mmTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentReversalV06#mmOriginalPaymentInformationAndReversal
 * CustomerPaymentReversalV06.mmOriginalPaymentInformationAndReversal}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndTransactionInformationNotPresentRule#forOriginalPaymentInstruction16
 * ConstraintPaymentInformationReversalAndTransactionInformationNotPresentRule.
 * forOriginalPaymentInstruction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndTransactionInformationPresentRule#forOriginalPaymentInstruction16
 * ConstraintPaymentInformationReversalAndTransactionInformationPresentRule.
 * forOriginalPaymentInstruction16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndReasonRule#forOriginalPaymentInstruction16
 * ConstraintPaymentInformationReversalAndReasonRule.
 * forOriginalPaymentInstruction16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalPaymentInstruction16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the original transactions, to which the status report message refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21
 * OriginalPaymentInstruction21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11
 * OriginalPaymentInstruction11}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalPaymentInstruction16", propOrder = {"reversalPaymentInformationIdentification", "originalPaymentInformationIdentification", "originalNumberOfTransactions", "originalControlSum", "batchBooking",
		"paymentInformationReversal", "reversalReasonInformation", "transactionInformation"})
public class OriginalPaymentInstruction16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RvslPmtInfId")
	protected Max35Text reversalPaymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmInstructionIdentification
	 * PaymentIdentification.mmInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslPmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed payment information group.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmInstructionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "RvslPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by an instructing party for an instructed party, to unambiguously identify the reversed payment information group.\nUsage: The instructing party is the party sending the reversal message and not the party that sent the original instruction that is being reversed.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmReversalPaymentInformationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmReversalPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlPmtInfId", required = true)
	protected Max35Text originalPaymentInformationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction11.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmOriginalPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlNbOfTxs")
	protected Max15NumericText originalNumberOfTransactions;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the original payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction21.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction11.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmOriginalNumberOfTransactions);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmOriginalNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	@XmlElement(name = "OrgnlCtrlSum")
	protected DecimalNumber originalControlSum;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the original payment information group, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmOriginalControlSum
	 * OriginalPaymentInstruction21.mmOriginalControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmOriginalControlSum
	 * OriginalPaymentInstruction11.mmOriginalControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original payment information group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmOriginalControlSum);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmOriginalControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmBatchBooking
	 * OriginalPaymentInstruction21.mmBatchBooking}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmBatchBooking
	 * OriginalPaymentInstruction11.mmBatchBooking}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchBooking = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "BtchBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchBooking";
			definition = "Identifies whether a single entry per individual transaction or a batch entry for the sum of the amounts of all transactions within the group of a message is requested.\nUsage: Batch booking is used to request and not order a possible batch booking.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmBatchBooking);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmBatchBooking;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BatchBookingIndicator.mmObject();
		}
	};
	@XmlElement(name = "PmtInfRvsl")
	protected TrueFalseIndicator paymentInformationReversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfRvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the reversal applies to the complete original payment information group or to individual transactions within that group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmPaymentInformationReversal
	 * OriginalPaymentInstruction21.mmPaymentInformationReversal}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmPaymentInformationReversal
	 * OriginalPaymentInstruction11.mmPaymentInformationReversal}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPaymentInformationReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "PmtInfRvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationReversal";
			definition = "Indicates whether or not the reversal applies to the complete original payment information group or to individual transactions within that group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmPaymentInformationReversal);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmPaymentInformationReversal;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "RvslRsnInf")
	protected List<com.tools20022.repository.msg.PaymentReversalReason7> reversalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentReversalReason7
	 * PaymentReversalReason7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the reversal reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmReversalReasonInformation
	 * OriginalPaymentInstruction21.mmReversalReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmReversalReasonInformation
	 * OriginalPaymentInstruction11.mmReversalReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReversalReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "RvslRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalReasonInformation";
			definition = "Provides detailed information on the reversal reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmReversalReasonInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmReversalReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentReversalReason7.mmObject();
		}
	};
	@XmlElement(name = "TxInf")
	protected List<com.tools20022.repository.msg.PaymentTransaction64> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction64
	 * PaymentTransaction64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction16
	 * OriginalPaymentInstruction16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original transactions to which the reversal message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmTransactionInformation
	 * OriginalPaymentInstruction21.mmTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction11#mmTransactionInformation
	 * OriginalPaymentInstruction11.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionInformation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction16.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Provides information on the original transactions to which the reversal message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmTransactionInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction11.mmTransactionInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction64.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction16.mmReversalPaymentInformationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction16.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction16.mmOriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalPaymentInstruction16.mmOriginalControlSum, com.tools20022.repository.msg.OriginalPaymentInstruction16.mmBatchBooking,
						com.tools20022.repository.msg.OriginalPaymentInstruction16.mmPaymentInformationReversal, com.tools20022.repository.msg.OriginalPaymentInstruction16.mmReversalReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction16.mmTransactionInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentReversalV06.mmOriginalPaymentInformationAndReversal);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndTransactionInformationNotPresentRule.forOriginalPaymentInstruction16,
						com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndTransactionInformationPresentRule.forOriginalPaymentInstruction16,
						com.tools20022.repository.constraints.ConstraintPaymentInformationReversalAndReasonRule.forOriginalPaymentInstruction16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction16";
				definition = "Provides details on the original transactions, to which the status report message refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction21.mmObject());
				previousVersion_lazy = () -> OriginalPaymentInstruction11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReversalPaymentInformationIdentification() {
		return reversalPaymentInformationIdentification == null ? Optional.empty() : Optional.of(reversalPaymentInformationIdentification);
	}

	public OriginalPaymentInstruction16 setReversalPaymentInformationIdentification(Max35Text reversalPaymentInformationIdentification) {
		this.reversalPaymentInformationIdentification = reversalPaymentInformationIdentification;
		return this;
	}

	public Max35Text getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification;
	}

	public OriginalPaymentInstruction16 setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = Objects.requireNonNull(originalPaymentInformationIdentification);
		return this;
	}

	public Optional<Max15NumericText> getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions == null ? Optional.empty() : Optional.of(originalNumberOfTransactions);
	}

	public OriginalPaymentInstruction16 setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getOriginalControlSum() {
		return originalControlSum == null ? Optional.empty() : Optional.of(originalControlSum);
	}

	public OriginalPaymentInstruction16 setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
		return this;
	}

	public Optional<BatchBookingIndicator> getBatchBooking() {
		return batchBooking == null ? Optional.empty() : Optional.of(batchBooking);
	}

	public OriginalPaymentInstruction16 setBatchBooking(BatchBookingIndicator batchBooking) {
		this.batchBooking = batchBooking;
		return this;
	}

	public Optional<TrueFalseIndicator> getPaymentInformationReversal() {
		return paymentInformationReversal == null ? Optional.empty() : Optional.of(paymentInformationReversal);
	}

	public OriginalPaymentInstruction16 setPaymentInformationReversal(TrueFalseIndicator paymentInformationReversal) {
		this.paymentInformationReversal = paymentInformationReversal;
		return this;
	}

	public List<PaymentReversalReason7> getReversalReasonInformation() {
		return reversalReasonInformation == null ? reversalReasonInformation = new ArrayList<>() : reversalReasonInformation;
	}

	public OriginalPaymentInstruction16 setReversalReasonInformation(List<com.tools20022.repository.msg.PaymentReversalReason7> reversalReasonInformation) {
		this.reversalReasonInformation = Objects.requireNonNull(reversalReasonInformation);
		return this;
	}

	public List<PaymentTransaction64> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public OriginalPaymentInstruction16 setTransactionInformation(List<com.tools20022.repository.msg.PaymentTransaction64> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}
}