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
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08;
import com.tools20022.repository.codeset.ExternalPaymentGroupStatus1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NumberOfTransactionsPerStatus5;
import com.tools20022.repository.msg.PaymentTransaction82;
import com.tools20022.repository.msg.StatusReasonInformation9;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details information on the original transactions, to which the
 * status report message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmOriginalPaymentInformationIdentification
 * OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmOriginalNumberOfTransactions
 * OriginalPaymentInstruction23.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmOriginalControlSum
 * OriginalPaymentInstruction23.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmPaymentInformationStatus
 * OriginalPaymentInstruction23.mmPaymentInformationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmStatusReasonInformation
 * OriginalPaymentInstruction23.mmStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmNumberOfTransactionsPerStatus
 * OriginalPaymentInstruction23.mmNumberOfTransactionsPerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmTransactionInformationAndStatus
 * OriginalPaymentInstruction23.mmTransactionInformationAndStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV08#mmOriginalPaymentInformationAndStatus
 * CustomerPaymentStatusReportV08.mmOriginalPaymentInformationAndStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalPaymentInstruction23"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details information on the original transactions, to which the status report message refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusAcceptedRule#forOriginalPaymentInstruction23
 * ConstraintPaymentInformationStatusAcceptedRule.
 * forOriginalPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusPendingRule#forOriginalPaymentInstruction23
 * ConstraintPaymentInformationStatusPendingRule.forOriginalPaymentInstruction23
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusRejectedRule#forOriginalPaymentInstruction23
 * ConstraintPaymentInformationStatusRejectedRule.
 * forOriginalPaymentInstruction23}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule#forOriginalPaymentInstruction23
 * ConstraintPaymentInformationStatusReceivedRule.
 * forOriginalPaymentInstruction23}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27
 * OriginalPaymentInstruction27}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18
 * OriginalPaymentInstruction18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalPaymentInstruction23", propOrder = {"originalPaymentInformationIdentification", "originalNumberOfTransactions", "originalControlSum", "paymentInformationStatus", "statusReasonInformation",
		"numberOfTransactionsPerStatus", "transactionInformationAndStatus"})
public class OriginalPaymentInstruction23 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlPmtInfId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalPaymentInformationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction27.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction18.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction23, Max35Text> mmOriginalPaymentInformationIdentification = new MMMessageAttribute<OriginalPaymentInstruction23, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique identification, as assigned by the original sending party, to unambiguously identify the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmOriginalPaymentInformationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmOriginalPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalPaymentInstruction23 obj) {
			return obj.getOriginalPaymentInformationIdentification();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, Max35Text value) {
			obj.setOriginalPaymentInformationIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNbOfTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the original payment information group."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction27.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmOriginalNumberOfTransactions
	 * OriginalPaymentInstruction18.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction23, Optional<Max15NumericText>> mmOriginalNumberOfTransactions = new MMMessageAttribute<OriginalPaymentInstruction23, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmOriginalNumberOfTransactions);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmOriginalNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getOriginalNumberOfTransactions();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, Optional<Max15NumericText> value) {
			obj.setOriginalNumberOfTransactions(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCtrlSum"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the original payment information group, irrespective of currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmOriginalControlSum
	 * OriginalPaymentInstruction27.mmOriginalControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmOriginalControlSum
	 * OriginalPaymentInstruction18.mmOriginalControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction23, Optional<DecimalNumber>> mmOriginalControlSum = new MMMessageAttribute<OriginalPaymentInstruction23, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original payment information group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmOriginalControlSum);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmOriginalControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getOriginalControlSum();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, Optional<DecimalNumber> value) {
			obj.setOriginalControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInfSts")
	protected ExternalPaymentGroupStatus1Code paymentInformationStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalPaymentGroupStatus1Code
	 * ExternalPaymentGroupStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the payment information group."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmPaymentInformationStatus
	 * OriginalPaymentInstruction27.mmPaymentInformationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmPaymentInformationStatus
	 * OriginalPaymentInstruction18.mmPaymentInformationStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction23, Optional<ExternalPaymentGroupStatus1Code>> mmPaymentInformationStatus = new MMMessageAttribute<OriginalPaymentInstruction23, Optional<ExternalPaymentGroupStatus1Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "PmtInfSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatus";
			definition = "Specifies the status of the payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmPaymentInformationStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmPaymentInformationStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ExternalPaymentGroupStatus1Code.mmObject();
		}

		@Override
		public Optional<ExternalPaymentGroupStatus1Code> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getPaymentInformationStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, Optional<ExternalPaymentGroupStatus1Code> value) {
			obj.setPaymentInformationStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRsnInf")
	protected List<StatusReasonInformation9> statusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation9
	 * StatusReasonInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmStatusReasonInformation
	 * OriginalPaymentInstruction27.mmStatusReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmStatusReasonInformation
	 * OriginalPaymentInstruction18.mmStatusReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction23, List<StatusReasonInformation9>> mmStatusReasonInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction23, List<StatusReasonInformation9>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Provides detailed information on the status reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmStatusReasonInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmStatusReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReasonInformation9.mmObject();
		}

		@Override
		public List<StatusReasonInformation9> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getStatusReasonInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, List<StatusReasonInformation9> value) {
			obj.setStatusReasonInformation(value);
		}
	};
	@XmlElement(name = "NbOfTxsPerSts")
	protected List<NumberOfTransactionsPerStatus5> numberOfTransactionsPerStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus5
	 * NumberOfTransactionsPerStatus5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxsPerSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information on the number of transactions for each identical transaction status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmNumberOfTransactionsPerStatus
	 * OriginalPaymentInstruction27.mmNumberOfTransactionsPerStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmNumberOfTransactionsPerStatus
	 * OriginalPaymentInstruction18.mmNumberOfTransactionsPerStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction23, List<NumberOfTransactionsPerStatus5>> mmNumberOfTransactionsPerStatus = new MMMessageAssociationEnd<OriginalPaymentInstruction23, List<NumberOfTransactionsPerStatus5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerStatus";
			definition = "Detailed information on the number of transactions for each identical transaction status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmNumberOfTransactionsPerStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmNumberOfTransactionsPerStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberOfTransactionsPerStatus5.mmObject();
		}

		@Override
		public List<NumberOfTransactionsPerStatus5> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getNumberOfTransactionsPerStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, List<NumberOfTransactionsPerStatus5> value) {
			obj.setNumberOfTransactionsPerStatus(value);
		}
	};
	@XmlElement(name = "TxInfAndSts")
	protected List<PaymentTransaction82> transactionInformationAndStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction82
	 * PaymentTransaction82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxInfAndSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionInformationAndStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the original transactions to which the status report message refers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction27#mmTransactionInformationAndStatus
	 * OriginalPaymentInstruction27.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction18#mmTransactionInformationAndStatus
	 * OriginalPaymentInstruction18.mmTransactionInformationAndStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction23, List<PaymentTransaction82>> mmTransactionInformationAndStatus = new MMMessageAssociationEnd<OriginalPaymentInstruction23, List<PaymentTransaction82>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction23.mmObject();
			isDerived = false;
			xmlTag = "TxInfAndSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformationAndStatus";
			definition = "Provides information on the original transactions to which the status report message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmTransactionInformationAndStatus);
			previousVersion_lazy = () -> OriginalPaymentInstruction18.mmTransactionInformationAndStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction82.mmObject();
		}

		@Override
		public List<PaymentTransaction82> getValue(OriginalPaymentInstruction23 obj) {
			return obj.getTransactionInformationAndStatus();
		}

		@Override
		public void setValue(OriginalPaymentInstruction23 obj, List<PaymentTransaction82> value) {
			obj.setTransactionInformationAndStatus(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.mmOriginalNumberOfTransactions, com.tools20022.repository.msg.OriginalPaymentInstruction23.mmOriginalControlSum,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.mmPaymentInformationStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.mmStatusReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction23.mmNumberOfTransactionsPerStatus, com.tools20022.repository.msg.OriginalPaymentInstruction23.mmTransactionInformationAndStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV08.mmOriginalPaymentInformationAndStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationStatusAcceptedRule.forOriginalPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintPaymentInformationStatusPendingRule.forOriginalPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintPaymentInformationStatusRejectedRule.forOriginalPaymentInstruction23,
						com.tools20022.repository.constraints.ConstraintPaymentInformationStatusReceivedRule.forOriginalPaymentInstruction23);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction23";
				definition = "Provides details information on the original transactions, to which the status report message refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction27.mmObject());
				previousVersion_lazy = () -> OriginalPaymentInstruction18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification;
	}

	public OriginalPaymentInstruction23 setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = Objects.requireNonNull(originalPaymentInformationIdentification);
		return this;
	}

	public Optional<Max15NumericText> getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions == null ? Optional.empty() : Optional.of(originalNumberOfTransactions);
	}

	public OriginalPaymentInstruction23 setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getOriginalControlSum() {
		return originalControlSum == null ? Optional.empty() : Optional.of(originalControlSum);
	}

	public OriginalPaymentInstruction23 setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
		return this;
	}

	public Optional<ExternalPaymentGroupStatus1Code> getPaymentInformationStatus() {
		return paymentInformationStatus == null ? Optional.empty() : Optional.of(paymentInformationStatus);
	}

	public OriginalPaymentInstruction23 setPaymentInformationStatus(ExternalPaymentGroupStatus1Code paymentInformationStatus) {
		this.paymentInformationStatus = paymentInformationStatus;
		return this;
	}

	public List<StatusReasonInformation9> getStatusReasonInformation() {
		return statusReasonInformation == null ? statusReasonInformation = new ArrayList<>() : statusReasonInformation;
	}

	public OriginalPaymentInstruction23 setStatusReasonInformation(List<StatusReasonInformation9> statusReasonInformation) {
		this.statusReasonInformation = Objects.requireNonNull(statusReasonInformation);
		return this;
	}

	public List<NumberOfTransactionsPerStatus5> getNumberOfTransactionsPerStatus() {
		return numberOfTransactionsPerStatus == null ? numberOfTransactionsPerStatus = new ArrayList<>() : numberOfTransactionsPerStatus;
	}

	public OriginalPaymentInstruction23 setNumberOfTransactionsPerStatus(List<NumberOfTransactionsPerStatus5> numberOfTransactionsPerStatus) {
		this.numberOfTransactionsPerStatus = Objects.requireNonNull(numberOfTransactionsPerStatus);
		return this;
	}

	public List<PaymentTransaction82> getTransactionInformationAndStatus() {
		return transactionInformationAndStatus == null ? transactionInformationAndStatus = new ArrayList<>() : transactionInformationAndStatus;
	}

	public OriginalPaymentInstruction23 setTransactionInformationAndStatus(List<PaymentTransaction82> transactionInformationAndStatus) {
		this.transactionInformationAndStatus = Objects.requireNonNull(transactionInformationAndStatus);
		return this;
	}
}