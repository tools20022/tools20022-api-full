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

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.TransactionGroupStatus2Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NumberOfTransactionsPerStatus2;
import com.tools20022.repository.msg.StatusReasonInformation5;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique and unambiguous identifier of the group of transactions as assigned by
 * the original instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#OriginalMessageIdentificationOrNetworkFileNameRule
 * OriginalGroupInformation15.OriginalMessageIdentificationOrNetworkFileNameRule
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalMessageIdentification
 * OriginalGroupInformation15.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmNetworkFileName
 * OriginalGroupInformation15.mmNetworkFileName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalMessageNameIdentification
 * OriginalGroupInformation15.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalCreationDateTime
 * OriginalGroupInformation15.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmFileOriginator
 * OriginalGroupInformation15.mmFileOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalNumberOfTransactions
 * OriginalGroupInformation15.mmOriginalNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalControlSum
 * OriginalGroupInformation15.mmOriginalControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmGroupStatus
 * OriginalGroupInformation15.mmGroupStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmStatusReasonInformation
 * OriginalGroupInformation15.mmStatusReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmNumberOfTransactionsPerStatus
 * OriginalGroupInformation15.mmNumberOfTransactionsPerStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginalGroupInformation15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule#forOriginalGroupInformation15
 * ConstraintStatusReasonInformationRule.forOriginalGroupInformation15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline#forOriginalGroupInformation15
 * ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupInformation15
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginalGroupInformation15", propOrder = {"originalMessageIdentification", "networkFileName", "originalMessageNameIdentification", "originalCreationDateTime", "fileOriginator", "originalNumberOfTransactions",
		"originalControlSum", "groupStatus", "statusReasonInformation", "numberOfTransactionsPerStatus"})
public class OriginalGroupInformation15 {

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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Max35Text> mmOriginalMessageIdentification = new MMMessageAttribute<OriginalGroupInformation15, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference assigned by the original instructing party to unambiguously identify the original group of individual transactions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation15 obj) {
			return obj.getOriginalMessageIdentification();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Max35Text value) {
			obj.setOriginalMessageIdentification(value);
		}
	};
	@XmlElement(name = "NtwkFileNm", required = true)
	protected Max35Text networkFileName;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtwkFileNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkFileName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name assigned by the sending party to unambiguously identify the file transmitted on the network."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Max35Text> mmNetworkFileName = new MMMessageAttribute<OriginalGroupInformation15, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "NtwkFileNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkFileName";
			definition = "Name assigned by the sending party to unambiguously identify the file transmitted on the network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation15 obj) {
			return obj.getNetworkFileName();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Max35Text value) {
			obj.setNetworkFileName(value);
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Max35Text> mmOriginalMessageNameIdentification = new MMMessageAttribute<OriginalGroupInformation15, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers, eg, pacs.003.001.01 or MT103.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(OriginalGroupInformation15 obj) {
			return obj.getOriginalMessageNameIdentification();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Max35Text value) {
			obj.setOriginalMessageNameIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Optional<ISODateTime>> mmOriginalCreationDateTime = new MMMessageAttribute<OriginalGroupInformation15, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(OriginalGroupInformation15 obj) {
			return obj.getOriginalCreationDateTime();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Optional<ISODateTime> value) {
			obj.setOriginalCreationDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FileOrgtr")
	protected Max35Text fileOriginator;
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sent the file for which the status has been generated.\n\nUsage: this field will only be used when the content of the message could not be decoded at the receiving side."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Optional<Max35Text>> mmFileOriginator = new MMMessageAttribute<OriginalGroupInformation15, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "FileOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileOriginator";
			definition = "Party that sent the file for which the status has been generated.\n\nUsage: this field will only be used when the content of the message could not be decoded at the receiving side.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(OriginalGroupInformation15 obj) {
			return obj.getFileOriginator();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Optional<Max35Text> value) {
			obj.setFileOriginator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlNbOfTxs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalNumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the original message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Optional<Max15NumericText>> mmOriginalNumberOfTransactions = new MMMessageAttribute<OriginalGroupInformation15, Optional<Max15NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlNbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalNumberOfTransactions";
			definition = "Number of individual transactions contained in the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		@Override
		public Optional<Max15NumericText> getValue(OriginalGroupInformation15 obj) {
			return obj.getOriginalNumberOfTransactions();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Optional<Max15NumericText> value) {
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
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCtrlSum"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the original message, irrespective of currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Optional<DecimalNumber>> mmOriginalControlSum = new MMMessageAttribute<OriginalGroupInformation15, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalControlSum";
			definition = "Total of all individual amounts included in the original message, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(OriginalGroupInformation15 obj) {
			return obj.getOriginalControlSum();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Optional<DecimalNumber> value) {
			obj.setOriginalControlSum(value.orElse(null));
		}
	};
	@XmlElement(name = "GrpSts")
	protected TransactionGroupStatus2Code groupStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionGroupStatus2Code
	 * TransactionGroupStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmStatus
	 * PaymentStatus.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of a group of transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginalGroupInformation15, Optional<TransactionGroupStatus2Code>> mmGroupStatus = new MMMessageAttribute<OriginalGroupInformation15, Optional<TransactionGroupStatus2Code>>() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "GrpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Specifies the status of a group of transactions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionGroupStatus2Code.mmObject();
		}

		@Override
		public Optional<TransactionGroupStatus2Code> getValue(OriginalGroupInformation15 obj) {
			return obj.getGroupStatus();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, Optional<TransactionGroupStatus2Code> value) {
			obj.setGroupStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "StsRsnInf")
	protected List<StatusReasonInformation5> statusReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatusReasonInformation5
	 * StatusReasonInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Detailed information on the status reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalGroupInformation15, List<StatusReasonInformation5>> mmStatusReasonInformation = new MMMessageAssociationEnd<OriginalGroupInformation15, List<StatusReasonInformation5>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "StsRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInformation";
			definition = "Detailed information on the status reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> StatusReasonInformation5.mmObject();
		}

		@Override
		public List<StatusReasonInformation5> getValue(OriginalGroupInformation15 obj) {
			return obj.getStatusReasonInformation();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, List<StatusReasonInformation5> value) {
			obj.setStatusReasonInformation(value);
		}
	};
	@XmlElement(name = "NbOfTxsPerSts")
	protected List<NumberOfTransactionsPerStatus2> numberOfTransactionsPerStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfTransactionsPerStatus2
	 * NumberOfTransactionsPerStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxsPerSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactionsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information on the number of transactions for each identical individual transaction status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<OriginalGroupInformation15, List<NumberOfTransactionsPerStatus2>> mmNumberOfTransactionsPerStatus = new MMMessageAssociationEnd<OriginalGroupInformation15, List<NumberOfTransactionsPerStatus2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactionsPerStatus";
			definition = "Detailed information on the number of transactions for each identical individual transaction status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NumberOfTransactionsPerStatus2.mmObject();
		}

		@Override
		public List<NumberOfTransactionsPerStatus2> getValue(OriginalGroupInformation15 obj) {
			return obj.getNumberOfTransactionsPerStatus();
		}

		@Override
		public void setValue(OriginalGroupInformation15 obj, List<NumberOfTransactionsPerStatus2> value) {
			obj.setNumberOfTransactionsPerStatus(value);
		}
	};
	/**
	 * If OriginalMessageIdentification is present, then NetworkFileName is not
	 * allowed. If NetworkFileName is present, then
	 * OriginalMessageIdentification is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15
	 * OriginalGroupInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmOriginalMessageIdentification
	 * OriginalGroupInformation15.mmOriginalMessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupInformation15#mmNetworkFileName
	 * OriginalGroupInformation15.mmNetworkFileName}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentificationOrNetworkFileNameRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalMessageIdentification is present, then NetworkFileName is not allowed.\nIf NetworkFileName is present, then OriginalMessageIdentification is not allowed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor OriginalMessageIdentificationOrNetworkFileNameRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentificationOrNetworkFileNameRule";
			definition = "If OriginalMessageIdentification is present, then NetworkFileName is not allowed.\nIf NetworkFileName is present, then OriginalMessageIdentification is not allowed.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.OriginalGroupInformation15.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation15.mmNetworkFileName);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalMessageIdentification, com.tools20022.repository.msg.OriginalGroupInformation15.mmNetworkFileName,
						com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalMessageNameIdentification, com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalCreationDateTime,
						com.tools20022.repository.msg.OriginalGroupInformation15.mmFileOriginator, com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalNumberOfTransactions,
						com.tools20022.repository.msg.OriginalGroupInformation15.mmOriginalControlSum, com.tools20022.repository.msg.OriginalGroupInformation15.mmGroupStatus,
						com.tools20022.repository.msg.OriginalGroupInformation15.mmStatusReasonInformation, com.tools20022.repository.msg.OriginalGroupInformation15.mmNumberOfTransactionsPerStatus);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusReasonInformationRule.forOriginalGroupInformation15,
						com.tools20022.repository.constraints.ConstraintNumberOfTransactionPerStatusGuideline.forOriginalGroupInformation15);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "OriginalGroupInformation15";
				definition = "Unique and unambiguous identifier of the group of transactions as assigned by the original instructing party.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginalGroupInformation15.OriginalMessageIdentificationOrNetworkFileNameRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public OriginalGroupInformation15 setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = Objects.requireNonNull(originalMessageIdentification);
		return this;
	}

	public Max35Text getNetworkFileName() {
		return networkFileName;
	}

	public OriginalGroupInformation15 setNetworkFileName(Max35Text networkFileName) {
		this.networkFileName = Objects.requireNonNull(networkFileName);
		return this;
	}

	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public OriginalGroupInformation15 setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = Objects.requireNonNull(originalMessageNameIdentification);
		return this;
	}

	public Optional<ISODateTime> getOriginalCreationDateTime() {
		return originalCreationDateTime == null ? Optional.empty() : Optional.of(originalCreationDateTime);
	}

	public OriginalGroupInformation15 setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
		return this;
	}

	public Optional<Max35Text> getFileOriginator() {
		return fileOriginator == null ? Optional.empty() : Optional.of(fileOriginator);
	}

	public OriginalGroupInformation15 setFileOriginator(Max35Text fileOriginator) {
		this.fileOriginator = fileOriginator;
		return this;
	}

	public Optional<Max15NumericText> getOriginalNumberOfTransactions() {
		return originalNumberOfTransactions == null ? Optional.empty() : Optional.of(originalNumberOfTransactions);
	}

	public OriginalGroupInformation15 setOriginalNumberOfTransactions(Max15NumericText originalNumberOfTransactions) {
		this.originalNumberOfTransactions = originalNumberOfTransactions;
		return this;
	}

	public Optional<DecimalNumber> getOriginalControlSum() {
		return originalControlSum == null ? Optional.empty() : Optional.of(originalControlSum);
	}

	public OriginalGroupInformation15 setOriginalControlSum(DecimalNumber originalControlSum) {
		this.originalControlSum = originalControlSum;
		return this;
	}

	public Optional<TransactionGroupStatus2Code> getGroupStatus() {
		return groupStatus == null ? Optional.empty() : Optional.of(groupStatus);
	}

	public OriginalGroupInformation15 setGroupStatus(TransactionGroupStatus2Code groupStatus) {
		this.groupStatus = groupStatus;
		return this;
	}

	public List<StatusReasonInformation5> getStatusReasonInformation() {
		return statusReasonInformation == null ? statusReasonInformation = new ArrayList<>() : statusReasonInformation;
	}

	public OriginalGroupInformation15 setStatusReasonInformation(List<StatusReasonInformation5> statusReasonInformation) {
		this.statusReasonInformation = Objects.requireNonNull(statusReasonInformation);
		return this;
	}

	public List<NumberOfTransactionsPerStatus2> getNumberOfTransactionsPerStatus() {
		return numberOfTransactionsPerStatus == null ? numberOfTransactionsPerStatus = new ArrayList<>() : numberOfTransactionsPerStatus;
	}

	public OriginalGroupInformation15 setNumberOfTransactionsPerStatus(List<NumberOfTransactionsPerStatus2> numberOfTransactionsPerStatus) {
		this.numberOfTransactionsPerStatus = Objects.requireNonNull(numberOfTransactionsPerStatus);
		return this;
	}
}