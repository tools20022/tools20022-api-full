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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.GroupCancellationIndicator;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.OriginalGroupInformation3;
import com.tools20022.repository.msg.PaymentCancellationReason2;
import com.tools20022.repository.msg.PaymentTransaction61;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the reference and status of the original transactions,
 * included in the original instruction, to which the cancellation request
 * message applies.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmPaymentCancellationIdentification
 * OriginalPaymentInstruction15.mmPaymentCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmCase
 * OriginalPaymentInstruction15.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmOriginalPaymentInformationIdentification
 * OriginalPaymentInstruction15.mmOriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmOriginalGroupInformation
 * OriginalPaymentInstruction15.mmOriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmNumberOfTransactions
 * OriginalPaymentInstruction15.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmControlSum
 * OriginalPaymentInstruction15.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmPaymentInformationCancellation
 * OriginalPaymentInstruction15.mmPaymentInformationCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmCancellationReasonInformation
 * OriginalPaymentInstruction15.mmCancellationReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#mmTransactionInformation
 * OriginalPaymentInstruction15.mmTransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationCancellationTrueAndTransactionInformationRule#forOriginalPaymentInstruction15
 * ConstraintPaymentInformationCancellationTrueAndTransactionInformationRule.
 * forOriginalPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationCancellationFalseAndTransactionInformationRule#forOriginalPaymentInstruction15
 * ConstraintPaymentInformationCancellationFalseAndTransactionInformationRule.
 * forOriginalPaymentInstruction15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPaymentInformationOrTransactionCaseRule#forOriginalPaymentInstruction15
 * ConstraintPaymentInformationOrTransactionCaseRule.
 * forOriginalPaymentInstruction15}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalPaymentInstruction15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the reference and status of the original transactions, included in the original instruction, to which the cancellation request message applies."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20
 * OriginalPaymentInstruction20}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13
 * OriginalPaymentInstruction13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalPaymentInstruction15", propOrder = {"paymentCancellationIdentification", "case_", "originalPaymentInformationIdentification", "originalGroupInformation", "numberOfTransactions", "controlSum",
		"paymentInformationCancellation", "cancellationReasonInformation", "transactionInformation"})
public class OriginalPaymentInstruction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmtCxlId")
	protected Max35Text paymentCancellationIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the assigner, to unambiguously identify the cancellation request.\n\nUsage: The cancellation request identification can be used for reconciliation or to link tasks relating to the cancellation request."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction20.mmPaymentCancellationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmPaymentCancellationIdentification
	 * OriginalPaymentInstruction13.mmPaymentCancellationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction15, Optional<Max35Text>> mmPaymentCancellationIdentification = new MMMessageAttribute<OriginalPaymentInstruction15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCancellationIdentification";
			definition = "Unique identification, as assigned by the assigner, to unambiguously identify the cancellation request.\n\nUsage: The cancellation request identification can be used for reconciliation or to link tasks relating to the cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmPaymentCancellationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmPaymentCancellationIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getPaymentCancellationIdentification();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<Max35Text> value) {
			obj.setPaymentCancellationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Case")
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#mmStatus
	 * InvestigationCase.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the case."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmCase
	 * OriginalPaymentInstruction20.mmCase}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmCase
	 * OriginalPaymentInstruction13.mmCase}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction15, Optional<Case3>> mmCase = new MMMessageAssociationEnd<OriginalPaymentInstruction15, Optional<Case3>>() {
		{
			businessElementTrace_lazy = () -> InvestigationCase.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmCase);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmCase;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Case3.mmObject();
		}

		@Override
		public Optional<Case3> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<Case3> value) {
			obj.setCase(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
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
	 * "Unique and unambiguous identifier of the original payment information block, as assigned by the original sending party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction13.mmOriginalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction15, Max35Text> mmOriginalPaymentInformationIdentification = new MMMessageAttribute<OriginalPaymentInstruction15, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique and unambiguous identifier of the original payment information block, as assigned by the original sending party.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmOriginalPaymentInformationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalPaymentInstruction15 obj) {
			return obj.getOriginalPaymentInformationIdentification();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Max35Text value) {
			obj.setOriginalPaymentInformationIdentification(value);
		}
	};
	@XmlElement(name = "OrgnlGrpInf")
	protected OriginalGroupInformation3 originalGroupInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation3
	 * OriginalGroupInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlGrpInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalGroupInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information concerning the original group of transactions, to which the message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmOriginalGroupInformation
	 * OriginalPaymentInstruction20.mmOriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmOriginalGroupInformation
	 * OriginalPaymentInstruction13.mmOriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction15, Optional<OriginalGroupInformation3>> mmOriginalGroupInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction15, Optional<OriginalGroupInformation3>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmOriginalGroupInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmOriginalGroupInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalGroupInformation3.mmObject();
		}

		@Override
		public Optional<OriginalGroupInformation3> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getOriginalGroupInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<OriginalGroupInformation3> value) {
			obj.setOriginalGroupInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
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
	 * "Number of individual transactions contained in the cancellation payment information group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmNumberOfTransactions
	 * OriginalPaymentInstruction20.mmNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmNumberOfTransactions
	 * OriginalPaymentInstruction13.mmNumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction15, Optional<Max15NumericText>> mmNumberOfTransactions = new MMMessageAttribute<OriginalPaymentInstruction15, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the cancellation payment information group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmNumberOfTransactions);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmNumberOfTransactions;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getNumberOfTransactions();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<Max15NumericText> value) {
			obj.setNumberOfTransactions(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
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
	 * "Total of all individual amounts included in the cancellation payment information group, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmControlSum
	 * OriginalPaymentInstruction20.mmControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmControlSum
	 * OriginalPaymentInstruction13.mmControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction15, Optional<DecimalNumber>> mmControlSum = new MMMessageAttribute<OriginalPaymentInstruction15, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the cancellation payment information group, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmControlSum);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmControlSum;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getControlSum();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<DecimalNumber> value) {
			obj.setControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "PmtInfCxl")
	protected GroupCancellationIndicator paymentInformationCancellation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GroupCancellationIndicator
	 * GroupCancellationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtInfCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether or not the cancellation applies to a whole group of transactions or to individual transactions within the original group."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmPaymentInformationCancellation
	 * OriginalPaymentInstruction20.mmPaymentInformationCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmPaymentInformationCancellation
	 * OriginalPaymentInstruction13.mmPaymentInformationCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalPaymentInstruction15, Optional<GroupCancellationIndicator>> mmPaymentInformationCancellation = new MMMessageAttribute<OriginalPaymentInstruction15, Optional<GroupCancellationIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtInfCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationCancellation";
			definition = "Indicates whether or not the cancellation applies to a whole group of transactions or to individual transactions within the original group.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmPaymentInformationCancellation);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmPaymentInformationCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GroupCancellationIndicator.mmObject();
		}

		@Override
		public Optional<GroupCancellationIndicator> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getPaymentInformationCancellation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, Optional<GroupCancellationIndicator> value) {
			obj.setPaymentInformationCancellation(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRsnInf")
	protected List<PaymentCancellationReason2> cancellationReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason2
	 * PaymentCancellationReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information on the cancellation reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmCancellationReasonInformation
	 * OriginalPaymentInstruction20.mmCancellationReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmCancellationReasonInformation
	 * OriginalPaymentInstruction13.mmCancellationReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction15, List<PaymentCancellationReason2>> mmCancellationReasonInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction15, List<PaymentCancellationReason2>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonInformation";
			definition = "Detailed information on the cancellation reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmCancellationReasonInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmCancellationReasonInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentCancellationReason2.mmObject();
		}

		@Override
		public List<PaymentCancellationReason2> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getCancellationReasonInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, List<PaymentCancellationReason2> value) {
			obj.setCancellationReasonInformation(value);
		}
	};
	@XmlElement(name = "TxInf")
	protected List<PaymentTransaction61> transactionInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction61
	 * PaymentTransaction61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15
	 * OriginalPaymentInstruction15}</li>
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
	 * "Information concerning the original transactions, to which the cancellation request message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmTransactionInformation
	 * OriginalPaymentInstruction20.mmTransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#mmTransactionInformation
	 * OriginalPaymentInstruction13.mmTransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalPaymentInstruction15, List<PaymentTransaction61>> mmTransactionInformation = new MMMessageAssociationEnd<OriginalPaymentInstruction15, List<PaymentTransaction61>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the cancellation request message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmTransactionInformation);
			previousVersion_lazy = () -> OriginalPaymentInstruction13.mmTransactionInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction61.mmObject();
		}

		@Override
		public List<PaymentTransaction61> getValue(OriginalPaymentInstruction15 obj) {
			return obj.getTransactionInformation();
		}

		@Override
		public void setValue(OriginalPaymentInstruction15 obj, List<PaymentTransaction61> value) {
			obj.setTransactionInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction15.mmPaymentCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.mmCase,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.mmOriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.mmOriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.mmNumberOfTransactions, com.tools20022.repository.msg.OriginalPaymentInstruction15.mmControlSum,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.mmPaymentInformationCancellation, com.tools20022.repository.msg.OriginalPaymentInstruction15.mmCancellationReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.mmTransactionInformation);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPaymentInformationCancellationTrueAndTransactionInformationRule.forOriginalPaymentInstruction15,
						com.tools20022.repository.constraints.ConstraintPaymentInformationCancellationFalseAndTransactionInformationRule.forOriginalPaymentInstruction15,
						com.tools20022.repository.constraints.ConstraintPaymentInformationOrTransactionCaseRule.forOriginalPaymentInstruction15);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction15";
				definition = "Provides details on the reference and status of the original transactions, included in the original instruction, to which the cancellation request message applies.";
				nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmObject());
				previousVersion_lazy = () -> OriginalPaymentInstruction13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getPaymentCancellationIdentification() {
		return paymentCancellationIdentification == null ? Optional.empty() : Optional.of(paymentCancellationIdentification);
	}

	public OriginalPaymentInstruction15 setPaymentCancellationIdentification(Max35Text paymentCancellationIdentification) {
		this.paymentCancellationIdentification = paymentCancellationIdentification;
		return this;
	}

	public Optional<Case3> getCase() {
		return case_ == null ? Optional.empty() : Optional.of(case_);
	}

	public OriginalPaymentInstruction15 setCase(Case3 case_) {
		this.case_ = case_;
		return this;
	}

	public Max35Text getOriginalPaymentInformationIdentification() {
		return originalPaymentInformationIdentification;
	}

	public OriginalPaymentInstruction15 setOriginalPaymentInformationIdentification(Max35Text originalPaymentInformationIdentification) {
		this.originalPaymentInformationIdentification = Objects.requireNonNull(originalPaymentInformationIdentification);
		return this;
	}

	public Optional<OriginalGroupInformation3> getOriginalGroupInformation() {
		return originalGroupInformation == null ? Optional.empty() : Optional.of(originalGroupInformation);
	}

	public OriginalPaymentInstruction15 setOriginalGroupInformation(OriginalGroupInformation3 originalGroupInformation) {
		this.originalGroupInformation = originalGroupInformation;
		return this;
	}

	public Optional<Max15NumericText> getNumberOfTransactions() {
		return numberOfTransactions == null ? Optional.empty() : Optional.of(numberOfTransactions);
	}

	public OriginalPaymentInstruction15 setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getControlSum() {
		return controlSum == null ? Optional.empty() : Optional.of(controlSum);
	}

	public OriginalPaymentInstruction15 setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
		return this;
	}

	public Optional<GroupCancellationIndicator> getPaymentInformationCancellation() {
		return paymentInformationCancellation == null ? Optional.empty() : Optional.of(paymentInformationCancellation);
	}

	public OriginalPaymentInstruction15 setPaymentInformationCancellation(GroupCancellationIndicator paymentInformationCancellation) {
		this.paymentInformationCancellation = paymentInformationCancellation;
		return this;
	}

	public List<PaymentCancellationReason2> getCancellationReasonInformation() {
		return cancellationReasonInformation == null ? cancellationReasonInformation = new ArrayList<>() : cancellationReasonInformation;
	}

	public OriginalPaymentInstruction15 setCancellationReasonInformation(List<PaymentCancellationReason2> cancellationReasonInformation) {
		this.cancellationReasonInformation = Objects.requireNonNull(cancellationReasonInformation);
		return this;
	}

	public List<PaymentTransaction61> getTransactionInformation() {
		return transactionInformation == null ? transactionInformation = new ArrayList<>() : transactionInformation;
	}

	public OriginalPaymentInstruction15 setTransactionInformation(List<PaymentTransaction61> transactionInformation) {
		this.transactionInformation = Objects.requireNonNull(transactionInformation);
		return this;
	}
}