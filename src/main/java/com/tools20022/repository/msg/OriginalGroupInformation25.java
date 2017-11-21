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
import com.tools20022.repository.area.pain.*;
import com.tools20022.repository.codeset.TransactionGroupStatus3Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the original group, to which
 * the message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalMessageIdentification
 * OriginalGroupInformation25.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalMessageNameIdentification
 * OriginalGroupInformation25.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalCreationDateTime
 * OriginalGroupInformation25.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalNumberOfTransactions
 * OriginalGroupInformation25.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmOriginalControlSum
 * OriginalGroupInformation25.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmGroupStatus
 * OriginalGroupInformation25.mmGroupStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmStatusReasonInformation
 * OriginalGroupInformation25.mmStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25#mmNumberOfTransactionsPerStatus
 * OriginalGroupInformation25.mmNumberOfTransactionsPerStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV01#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV01.
 * mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV02#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV02.
 * mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV03#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV03.
 * mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV04#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV04.
 * mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CreditorPaymentActivationRequestStatusReportV05#mmOriginalGroupInformationAndStatus
 * CreditorPaymentActivationRequestStatusReportV05.
 * mmOriginalGroupInformationAndStatus}</li>
 * </ul>
 * </li>
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
 * "OriginalGroupInformation25"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the original group, to which the message refers."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupInformation28
 * OriginalGroupInformation28}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OriginalGroupInformation25", propOrder = {"originalMessageIdentification", "originalMessageNameIdentification", "originalCreationDateTime", "originalNumberOfTransactions", "originalControlSum", "groupStatus",
		"statusReasonInformation", "numberOfTransactionsPerStatus"})
public class OriginalGroupInformation25 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text originalMessageIdentification;
	/**
	 * Point to point reference, as assigned by the original instructing party,
	 * to unambiguously identify the original message.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageIdentification
	 * OriginalGroupInformation28.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmOriginalMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalMessageNameIdentification;
	/**
	 * Specifies the original message name identifier to which the message
	 * refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
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
	 * "Specifies the original message name identifier to which the message refers."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalMessageNameIdentification
	 * OriginalGroupInformation28.mmOriginalMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmOriginalMessageNameIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime originalCreationDateTime;
	/**
	 * Date and time at which the original message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalCreationDateTime
	 * OriginalGroupInformation28.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmOriginalCreationDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max15NumericText originalNumberOfTransactions;
	/**
	 * Number of individual transactions contained in the original message.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
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
	 * "Number of individual transactions contained in the original message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalNumberOfTransactions
	 * OriginalGroupInformation28.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmOriginalNumberOfTransactions);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber originalControlSum;
	/**
	 * Total of all individual amounts included in the original message,
	 * irrespective of currencies.
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
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
	 * "Total of all individual amounts included in the original message, irrespective of currencies."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmOriginalControlSum
	 * OriginalGroupInformation28.mmOriginalControlSum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original message, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmOriginalControlSum);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected TransactionGroupStatus3Code groupStatus;
	/**
	 * Specifies the status of a group of transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus3Code
	 * TransactionGroupStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a group of transactions."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmGroupStatus
	 * OriginalGroupInformation28.mmGroupStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "GrpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Specifies the status of a group of transactions.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmGroupStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionGroupStatus3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.StatusReasonInformation9> statusReasonInformation;
	/**
	 * Set of elements used to provide detailed information on the status
	 * reason.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the status reason."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmStatusReasonInformation
	 * OriginalGroupInformation28.mmStatusReasonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Set of elements used to provide detailed information on the status reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmStatusReasonInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReasonInformation9.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.NumberOfTransactionsPerStatus3> numberOfTransactionsPerStatus;
	/**
	 * Detailed information on the number of transactions for each identical
	 * transaction status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation25
	 * OriginalGroupInformation25}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxsPerSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information on the number of transactions for each identical transaction status."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation28#mmNumberOfTransactionsPerStatus
	 * OriginalGroupInformation28.mmNumberOfTransactionsPerStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNumberOfTransactionsPerStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> OriginalGroupInformation25.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerStatus";
			definition = "Detailed information on the number of transactions for each identical transaction status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmNumberOfTransactionsPerStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OriginalGroupInformation25.mmOriginalMessageIdentification, OriginalGroupInformation25.mmOriginalMessageNameIdentification, OriginalGroupInformation25.mmOriginalCreationDateTime,
						OriginalGroupInformation25.mmOriginalNumberOfTransactions, OriginalGroupInformation25.mmOriginalControlSum, OriginalGroupInformation25.mmGroupStatus, OriginalGroupInformation25.mmStatusReasonInformation,
						OriginalGroupInformation25.mmNumberOfTransactionsPerStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreditorPaymentActivationRequestStatusReportV01.mmOriginalGroupInformationAndStatus, CreditorPaymentActivationRequestStatusReportV02.mmOriginalGroupInformationAndStatus,
						CreditorPaymentActivationRequestStatusReportV03.mmOriginalGroupInformationAndStatus, CreditorPaymentActivationRequestStatusReportV04.mmOriginalGroupInformationAndStatus,
						CreditorPaymentActivationRequestStatusReportV05.mmOriginalGroupInformationAndStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalGroupInformation25";
				definition = "Set of elements used to provide information on the original group, to which the message refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalGroupInformation28.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OrgnlMsgId", required = true)
	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public void setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = originalMessageIdentification;
	}

	@XmlElement(name = "OrgnlMsgNmId", required = true)
	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public void setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
	}

	@XmlElement(name = "OrgnlCreDtTm")
	public ISODateTime getOriginalCreationDateTime() {
		return originalCreationDateTime;
	}

	public void setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
	}

	@XmlElement(name = "OrgnlNbOfTxs")
	public Max15NumericText getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions;
	}

	public void setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
	}

	@XmlElement(name = "OrgnlCtrlSum")
	public DecimalNumber getOriginalControlSum() {
		return originalControlSum;
	}

	public void setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
	}

	@XmlElement(name = "GrpSts")
	public TransactionGroupStatus3Code getGroupStatus() {
		return groupStatus;
	}

	public void setGroupStatus(TransactionGroupStatus3Code groupStatus) {
		this.groupStatus = groupStatus;
	}

	@XmlElement(name = "StsRsnInf")
	public List<StatusReasonInformation9> getStatusReasonInformation() {
		return statusReasonInformation;
	}

	public void setStatusReasonInformation(List<com.tools20022.repository.msg.StatusReasonInformation9> statusReasonInformation) {
		this.statusReasonInformation = statusReasonInformation;
	}

	@XmlElement(name = "NbOfTxsPerSts")
	public List<NumberOfTransactionsPerStatus3> getNumberOfTransactionsPerStatus() {
		return numberOfTransactionsPerStatus;
	}

	public void setNumberOfTransactionsPerStatus(List<com.tools20022.repository.msg.NumberOfTransactionsPerStatus3> numberOfTransactionsPerStatus) {
		this.numberOfTransactionsPerStatus = numberOfTransactionsPerStatus;
	}
}