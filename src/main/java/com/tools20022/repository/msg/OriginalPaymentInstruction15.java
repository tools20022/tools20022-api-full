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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.GroupCancellationIndicator;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Payment;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#PaymentCancellationIdentification
 * OriginalPaymentInstruction15.PaymentCancellationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#Case
 * OriginalPaymentInstruction15.Case}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#OriginalPaymentInformationIdentification
 * OriginalPaymentInstruction15.OriginalPaymentInformationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#OriginalGroupInformation
 * OriginalPaymentInstruction15.OriginalGroupInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#NumberOfTransactions
 * OriginalPaymentInstruction15.NumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#ControlSum
 * OriginalPaymentInstruction15.ControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#PaymentInformationCancellation
 * OriginalPaymentInstruction15.PaymentInformationCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#CancellationReasonInformation
 * OriginalPaymentInstruction15.CancellationReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction15#TransactionInformation
 * OriginalPaymentInstruction15.TransactionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
public class OriginalPaymentInstruction15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique identification, as assigned by the assigner, to unambiguously
	 * identify the cancellation request.
	 * 
	 * Usage: The cancellation request identification can be used for
	 * reconciliation or to link tasks relating to the cancellation request.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#ExecutionIdentification
	 * PaymentIdentification.ExecutionIdentification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#PaymentCancellationIdentification
	 * OriginalPaymentInstruction20.PaymentCancellationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#PaymentCancellationIdentification
	 * OriginalPaymentInstruction13.PaymentCancellationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentCancellationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentIdentification.ExecutionIdentification;
			isDerived = false;
			xmlTag = "PmtCxlId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCancellationIdentification";
			definition = "Unique identification, as assigned by the assigner, to unambiguously identify the cancellation request.\n\nUsage: The cancellation request identification can be used for reconciliation or to link tasks relating to the cancellation request.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.PaymentCancellationIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.PaymentCancellationIdentification);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Identifies the case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestigationCase#Status
	 * InvestigationCase.Status}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#Case
	 * OriginalPaymentInstruction20.Case}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#Case
	 * OriginalPaymentInstruction13.Case}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Case = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestigationCase.Status;
			isDerived = false;
			xmlTag = "Case";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the case.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.Case;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.Case);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Case3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Unique and unambiguous identifier of the original payment information
	 * block, as assigned by the original sending party.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#Identification
	 * TradeIdentification.Identification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.OriginalPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#OriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction13.OriginalPaymentInformationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute OriginalPaymentInformationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.Identification;
			isDerived = false;
			xmlTag = "OrgnlPmtInfId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalPaymentInformationIdentification";
			definition = "Unique and unambiguous identifier of the original payment information block, as assigned by the original sending party.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.OriginalPaymentInformationIdentification;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalPaymentInformationIdentification);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Information concerning the original group of transactions, to which the
	 * message refers.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#OriginalGroupInformation
	 * OriginalPaymentInstruction20.OriginalGroupInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#OriginalGroupInformation
	 * OriginalPaymentInstruction13.OriginalGroupInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalGroupInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessComponentTrace_lazy = () -> Payment.mmObject();
			isDerived = false;
			xmlTag = "OrgnlGrpInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalGroupInformation";
			definition = "Information concerning the original group of transactions, to which the message refers.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.OriginalGroupInformation;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.OriginalGroupInformation);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> OriginalGroupInformation3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Number of individual transactions contained in the cancellation payment
	 * information group.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#NumberOfTransactions
	 * OriginalPaymentInstruction20.NumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#NumberOfTransactions
	 * OriginalPaymentInstruction13.NumberOfTransactions}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the cancellation payment information group.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.NumberOfTransactions;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.NumberOfTransactions);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Total of all individual amounts included in the cancellation payment
	 * information group, irrespective of currencies.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#ControlSum
	 * OriginalPaymentInstruction20.ControlSum}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#ControlSum
	 * OriginalPaymentInstruction13.ControlSum}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the cancellation payment information group, irrespective of currencies.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.ControlSum;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.ControlSum);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	/**
	 * Indicates whether or not the cancellation applies to a whole group of
	 * transactions or to individual transactions within the original group.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#PaymentInformationCancellation
	 * OriginalPaymentInstruction20.PaymentInformationCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#PaymentInformationCancellation
	 * OriginalPaymentInstruction13.PaymentInformationCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute PaymentInformationCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			isDerived = false;
			xmlTag = "PmtInfCxl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationCancellation";
			definition = "Indicates whether or not the cancellation applies to a whole group of transactions or to individual transactions within the original group.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.PaymentInformationCancellation;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.PaymentInformationCancellation);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> GroupCancellationIndicator.mmObject();
		}
	};
	/**
	 * Detailed information on the cancellation reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason2
	 * PaymentCancellationReason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#StatusReason
	 * Status.StatusReason}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#CancellationReasonInformation
	 * OriginalPaymentInstruction20.CancellationReasonInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#CancellationReasonInformation
	 * OriginalPaymentInstruction13.CancellationReasonInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CancellationReasonInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Status.StatusReason;
			isDerived = false;
			xmlTag = "CxlRsnInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonInformation";
			definition = "Detailed information on the cancellation reason.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.CancellationReasonInformation;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.CancellationReasonInformation);
			minOccurs = 0;
			type_lazy = () -> PaymentCancellationReason2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information concerning the original transactions, to which the
	 * cancellation request message refers.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#TransactionInformation
	 * OriginalPaymentInstruction20.TransactionInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction13#TransactionInformation
	 * OriginalPaymentInstruction13.TransactionInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd TransactionInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalPaymentInstruction15.mmObject();
			businessComponentTrace_lazy = () -> Payment.mmObject();
			isDerived = false;
			xmlTag = "TxInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionInformation";
			definition = "Information concerning the original transactions, to which the cancellation request message refers.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.OriginalPaymentInstruction13.TransactionInformation;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction20.TransactionInformation);
			minOccurs = 0;
			type_lazy = () -> PaymentTransaction61.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalPaymentInstruction15.PaymentCancellationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.Case,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.OriginalPaymentInformationIdentification, com.tools20022.repository.msg.OriginalPaymentInstruction15.OriginalGroupInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.NumberOfTransactions, com.tools20022.repository.msg.OriginalPaymentInstruction15.ControlSum,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.PaymentInformationCancellation, com.tools20022.repository.msg.OriginalPaymentInstruction15.CancellationReasonInformation,
						com.tools20022.repository.msg.OriginalPaymentInstruction15.TransactionInformation);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "OriginalPaymentInstruction15";
				definition = "Provides details on the reference and status of the original transactions, included in the original instruction, to which the cancellation request message applies.";
				previousVersion_lazy = () -> OriginalPaymentInstruction13.mmObject();
				nextVersions_lazy = () -> Arrays.asList(OriginalPaymentInstruction20.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}