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
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV04;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06;
import com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV04;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06;
import com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07;
import com.tools20022.repository.codeset.TransactionGroupStatus3Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the original group, to which the message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalMessageIdentification
 * OriginalGroupHeader1.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalMessageNameIdentification
 * OriginalGroupHeader1.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalCreationDateTime
 * OriginalGroupHeader1.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalNumberOfTransactions
 * OriginalGroupHeader1.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmOriginalControlSum
 * OriginalGroupHeader1.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmGroupStatus
 * OriginalGroupHeader1.mmGroupStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmStatusReasonInformation
 * OriginalGroupHeader1.mmStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1#mmNumberOfTransactionsPerStatus
 * OriginalGroupHeader1.mmNumberOfTransactionsPerStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV04#mmOriginalGroupInformationAndStatus
 * CustomerPaymentStatusReportV04.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV05#mmOriginalGroupInformationAndStatus
 * CustomerPaymentStatusReportV05.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV04#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV04.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV05#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV05.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV06#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV06#mmOriginalGroupInformationAndStatus
 * CustomerPaymentStatusReportV06.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pacs.FIToFIPaymentStatusReportV07#mmOriginalGroupInformationAndStatus
 * FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.CustomerPaymentStatusReportV07#mmOriginalGroupInformationAndStatus
 * CustomerPaymentStatusReportV07.mmOriginalGroupInformationAndStatus}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupHeader1
 * ConstraintStatusReasonInformationRule.forOriginalGroupHeader1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupHeader1
 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalGroupHeader1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the original group, to which the message refers."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader7
 * OriginalGroupHeader7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalGroupHeader1", propOrder = {"originalMessageIdentification", "originalMessageNameIdentification", "originalCreationDateTime", "originalNumberOfTransactions", "originalControlSum", "groupStatus",
		"statusReasonInformation", "numberOfTransactionsPerStatus"})
public class OriginalGroupHeader1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgId", required = true)
	protected Max35Text originalMessageIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalMessageIdentification
	 * OriginalGroupHeader7.mmOriginalMessageIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmOriginalMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMsgNmId", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalMessageNameIdentification
	 * OriginalGroupHeader7.mmOriginalMessageNameIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmOriginalMessageNameIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrgnlCreDtTm")
	protected ISODateTime originalCreationDateTime;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalCreationDateTime
	 * OriginalGroupHeader7.mmOriginalCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmOriginalCreationDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalNumberOfTransactions
	 * OriginalGroupHeader7.mmOriginalNumberOfTransactions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original message.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmOriginalNumberOfTransactions);
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmOriginalControlSum
	 * OriginalGroupHeader7.mmOriginalControlSum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original message, irrespective of currencies.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmOriginalControlSum);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "GrpSts")
	protected TransactionGroupStatus3Code groupStatus;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmGroupStatus
	 * OriginalGroupHeader7.mmGroupStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "GrpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Specifies the status of a group of transactions.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmGroupStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionGroupStatus3Code.mmObject();
		}
	};
	@XmlElement(name = "StsRsnInf")
	protected List<com.tools20022.repository.msg.StatusReasonInformation9> statusReasonInformation;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * definition} = "Provides detailed information on the status reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmStatusReasonInformation
	 * OriginalGroupHeader7.mmStatusReasonInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Provides detailed information on the status reason.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmStatusReasonInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatusReasonInformation9.mmObject();
		}
	};
	@XmlElement(name = "NbOfTxsPerSts")
	protected List<com.tools20022.repository.msg.NumberOfTransactionsPerStatus3> numberOfTransactionsPerStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus3
	 * NumberOfTransactionsPerStatus3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader1
	 * OriginalGroupHeader1}</li>
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader7#mmNumberOfTransactionsPerStatus
	 * OriginalGroupHeader7.mmNumberOfTransactionsPerStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNumberOfTransactionsPerStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupHeader1.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerStatus";
			definition = "Detailed information on the number of transactions for each identical transaction status.";
			nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmNumberOfTransactionsPerStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NumberOfTransactionsPerStatus3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalMessageNameIdentification,
						com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalCreationDateTime, com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalGroupHeader1.mmOriginalControlSum, com.tools20022.repository.msg.OriginalGroupHeader1.mmGroupStatus,
						com.tools20022.repository.msg.OriginalGroupHeader1.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalGroupHeader1.mmNumberOfTransactionsPerStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CustomerPaymentStatusReportV04.mmOriginalGroupInformationAndStatus, CustomerPaymentStatusReportV05.mmOriginalGroupInformationAndStatus,
						FIToFIPaymentStatusReportV04.mmOriginalGroupInformationAndStatus, FIToFIPaymentStatusReportV05.mmOriginalGroupInformationAndStatus, FIToFIPaymentStatusReportV06.mmOriginalGroupInformationAndStatus,
						CustomerPaymentStatusReportV06.mmOriginalGroupInformationAndStatus, FIToFIPaymentStatusReportV07.mmOriginalGroupInformationAndStatus, CustomerPaymentStatusReportV07.mmOriginalGroupInformationAndStatus);
				trace_lazy = () -> PaymentExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupHeader1,
						com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupHeader1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalGroupHeader1";
				definition = "Provides details on the original group, to which the message refers.";
				nextVersions_lazy = () -> Arrays.asList(OriginalGroupHeader7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalGroupHeader1 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public OriginalGroupHeader1 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = Objects.requireNonNull(originalMessageNameIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalCreationDateTime() {
		return originalCreationDateTime == null ? Optional.empty() : Optional.of(originalCreationDateTime);
	}

	public OriginalGroupHeader1 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
		return this;
	}

	public Optional<Max15NumericText> getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions == null ? Optional.empty() : Optional.of(originalNumberOfTransactions);
	}

	public OriginalGroupHeader1 setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getOriginalControlSum() {
		return originalControlSum == null ? Optional.empty() : Optional.of(originalControlSum);
	}

	public OriginalGroupHeader1 setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
		return this;
	}

	public Optional<TransactionGroupStatus3Code> getGroupStatus() {
		return groupStatus == null ? Optional.empty() : Optional.of(groupStatus);
	}

	public OriginalGroupHeader1 setGroupStatus(TransactionGroupStatus3Code groupStatus) {
		this.groupStatus = groupStatus;
		return this;
	}

	public List<StatusReasonInformation9> getStatusReasonInformation() {
		return statusReasonInformation == null ? statusReasonInformation = new ArrayList<>() : statusReasonInformation;
	}

	public OriginalGroupHeader1 setStatusReasonInformation(List<com.tools20022.repository.msg.StatusReasonInformation9> statusReasonInformation) {
		this.statusReasonInformation = Objects.requireNonNull(statusReasonInformation);
		return this;
	}

	public List<NumberOfTransactionsPerStatus3> getNumberOfTransactionsPerStatus() {
		return numberOfTransactionsPerStatus == null ? numberOfTransactionsPerStatus = new ArrayList<>() : numberOfTransactionsPerStatus;
	}

	public OriginalGroupHeader1 setNumberOfTransactionsPerStatus(List<com.tools20022.repository.msg.NumberOfTransactionsPerStatus3> numberOfTransactionsPerStatus) {
		this.numberOfTransactionsPerStatus = Objects.requireNonNull(numberOfTransactionsPerStatus);
		return this;
	}
}