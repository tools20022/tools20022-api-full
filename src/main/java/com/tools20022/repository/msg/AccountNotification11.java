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
import com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05;
import com.tools20022.repository.choice.ReportingSource1Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details of the account notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmIdentification
 * AccountNotification11.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmNotificationPagination
 * AccountNotification11.mmNotificationPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmElectronicSequenceNumber
 * AccountNotification11.mmElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmLegalSequenceNumber
 * AccountNotification11.mmLegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmCreationDateTime
 * AccountNotification11.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmFromToDate
 * AccountNotification11.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmCopyDuplicateIndicator
 * AccountNotification11.mmCopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmReportingSource
 * AccountNotification11.mmReportingSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmAccount
 * AccountNotification11.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmRelatedAccount
 * AccountNotification11.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmInterest
 * AccountNotification11.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmTransactionsSummary
 * AccountNotification11.mmTransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification11#mmEntry
 * AccountNotification11.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmAdditionalNotificationInformation
 * AccountNotification11.mmAdditionalNotificationInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashBalance
 * CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV05#mmNotification
 * BankToCustomerDebitCreditNotificationV05.mmNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountNotification11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details of the account notification."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12
 * AccountNotification12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountNotification7
 * AccountNotification7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountNotification11", propOrder = {"identification", "notificationPagination", "electronicSequenceNumber", "legalSequenceNumber", "creationDateTime", "fromToDate", "copyDuplicateIndicator", "reportingSource", "account",
		"relatedAccount", "interest", "transactionsSummary", "entry", "additionalNotificationInformation"})
public class AccountNotification11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmIdentification
	 * AccountNotification12.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmIdentification
	 * AccountNotification7.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Max35Text> mmIdentification = new MMMessageAttribute<AccountNotification11, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmIdentification);
			previousVersion_lazy = () -> AccountNotification7.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AccountNotification11 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AccountNotification11 obj, Max35Text value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "NtfctnPgntn")
	protected Pagination notificationPagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnPgntn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmNotificationPagination
	 * AccountNotification12.mmNotificationPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmNotificationPagination
	 * AccountNotification7.mmNotificationPagination}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Optional<Pagination>> mmNotificationPagination = new MMMessageAttribute<AccountNotification11, Optional<Pagination>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "NtfctnPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationPagination";
			definition = "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmNotificationPagination);
			previousVersion_lazy = () -> AccountNotification7.mmNotificationPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Pagination.mmObject();
		}

		@Override
		public Optional<Pagination> getValue(AccountNotification11 obj) {
			return obj.getNotificationPagination();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<Pagination> value) {
			obj.setNotificationPagination(value.orElse(null));
		}
	};
	@XmlElement(name = "ElctrncSeqNb")
	protected Number electronicSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmElectronicSequenceNumber
	 * AccountNotification12.mmElectronicSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmElectronicSequenceNumber
	 * AccountNotification7.mmElectronicSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Optional<Number>> mmElectronicSequenceNumber = new MMMessageAttribute<AccountNotification11, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmElectronicSequenceNumber);
			previousVersion_lazy = () -> AccountNotification7.mmElectronicSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AccountNotification11 obj) {
			return obj.getElectronicSequenceNumber();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<Number> value) {
			obj.setElectronicSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "LglSeqNb")
	protected Number legalSequenceNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglSeqNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmLegalSequenceNumber
	 * AccountNotification12.mmLegalSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmLegalSequenceNumber
	 * AccountNotification7.mmLegalSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Optional<Number>> mmLegalSequenceNumber = new MMMessageAttribute<AccountNotification11, Optional<Number>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmLegalSequenceNumber);
			previousVersion_lazy = () -> AccountNotification7.mmLegalSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AccountNotification11 obj) {
			return obj.getLegalSequenceNumber();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<Number> value) {
			obj.setLegalSequenceNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmCreationDateTime
	 * AccountNotification12.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmCreationDateTime
	 * AccountNotification7.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, ISODateTime> mmCreationDateTime = new MMMessageAttribute<AccountNotification11, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmCreationDateTime);
			previousVersion_lazy = () -> AccountNotification7.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(AccountNotification11 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(AccountNotification11 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "FrToDt")
	protected DateTimePeriodDetails fromToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
	 * Account.mmReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for which the account notification is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmFromToDate
	 * AccountNotification12.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmFromToDate
	 * AccountNotification7.mmFromToDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, Optional<DateTimePeriodDetails>> mmFromToDate = new MMMessageAssociationEnd<AccountNotification11, Optional<DateTimePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> Account.mmReportedPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account notification is issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmFromToDate);
			previousVersion_lazy = () -> AccountNotification7.mmFromToDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateTimePeriodDetails.mmObject();
		}

		@Override
		public Optional<DateTimePeriodDetails> getValue(AccountNotification11 obj) {
			return obj.getFromToDate();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<DateTimePeriodDetails> value) {
			obj.setFromToDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyDplctInd")
	protected CopyDuplicate1Code copyDuplicateIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CopyDuplicate1Code
	 * CopyDuplicate1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplctInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmCopyDuplicateIndicator
	 * AccountNotification12.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmCopyDuplicateIndicator
	 * AccountNotification7.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Optional<CopyDuplicate1Code>> mmCopyDuplicateIndicator = new MMMessageAttribute<AccountNotification11, Optional<CopyDuplicate1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmCopyDuplicateIndicator);
			previousVersion_lazy = () -> AccountNotification7.mmCopyDuplicateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}

		@Override
		public Optional<CopyDuplicate1Code> getValue(AccountNotification11 obj) {
			return obj.getCopyDuplicateIndicator();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<CopyDuplicate1Code> value) {
			obj.setCopyDuplicateIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "RptgSrc")
	protected ReportingSource1Choice reportingSource;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReportingSource1Choice
	 * ReportingSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgSrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the application used to generate the reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmReportingSource
	 * AccountNotification12.mmReportingSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmReportingSource
	 * AccountNotification7.mmReportingSource}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, Optional<ReportingSource1Choice>> mmReportingSource = new MMMessageAssociationEnd<AccountNotification11, Optional<ReportingSource1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmReportingSource);
			previousVersion_lazy = () -> AccountNotification7.mmReportingSource;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingSource1Choice.mmObject();
		}

		@Override
		public Optional<ReportingSource1Choice> getValue(AccountNotification11 obj) {
			return obj.getReportingSource();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<ReportingSource1Choice> value) {
			obj.setReportingSource(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CashAccount25 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
	 * CashBalance.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account to which credit and debit entries are made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmAccount
	 * AccountNotification12.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmAccount
	 * AccountNotification7.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, CashAccount25> mmAccount = new MMMessageAssociationEnd<AccountNotification11, CashAccount25>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmAccount);
			previousVersion_lazy = () -> AccountNotification7.mmAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashAccount25.mmObject();
		}

		@Override
		public CashAccount25 getValue(AccountNotification11 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountNotification11 obj, CashAccount25 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "RltdAcct")
	protected CashAccount24 relatedAccount;
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
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
	 * CashBalance.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the parent account of the account for which the notification has been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmRelatedAccount
	 * AccountNotification12.mmRelatedAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmRelatedAccount
	 * AccountNotification7.mmRelatedAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, Optional<CashAccount24>> mmRelatedAccount = new MMMessageAssociationEnd<AccountNotification11, Optional<CashAccount24>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the notification has been issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmRelatedAccount);
			previousVersion_lazy = () -> AccountNotification7.mmRelatedAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccount24.mmObject();
		}

		@Override
		public Optional<CashAccount24> getValue(AccountNotification11 obj) {
			return obj.getRelatedAccount();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<CashAccount24> value) {
			obj.setRelatedAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Intrst")
	protected List<AccountInterest3> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountInterest3
	 * AccountInterest3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general interest information that applies to the account at a particular moment in time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmInterest
	 * AccountNotification12.mmInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmInterest
	 * AccountNotification7.mmInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, List<AccountInterest3>> mmInterest = new MMMessageAssociationEnd<AccountNotification11, List<AccountInterest3>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides general interest information that applies to the account at a particular moment in time.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmInterest);
			previousVersion_lazy = () -> AccountNotification7.mmInterest;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountInterest3.mmObject();
		}

		@Override
		public List<AccountInterest3> getValue(AccountNotification11 obj) {
			return obj.getInterest();
		}

		@Override
		public void setValue(AccountNotification11 obj, List<AccountInterest3> value) {
			obj.setInterest(value);
		}
	};
	@XmlElement(name = "TxsSummry")
	protected TotalTransactions4 transactionsSummary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides summary information on entries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmTransactionsSummary
	 * AccountNotification12.mmTransactionsSummary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmTransactionsSummary
	 * AccountNotification7.mmTransactionsSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, Optional<TotalTransactions4>> mmTransactionsSummary = new MMMessageAssociationEnd<AccountNotification11, Optional<TotalTransactions4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Provides summary information on entries.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmTransactionsSummary);
			previousVersion_lazy = () -> AccountNotification7.mmTransactionsSummary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalTransactions4.mmObject();
		}

		@Override
		public Optional<TotalTransactions4> getValue(AccountNotification11 obj) {
			return obj.getTransactionsSummary();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<TotalTransactions4> value) {
			obj.setTransactionsSummary(value.orElse(null));
		}
	};
	@XmlElement(name = "Ntry")
	protected List<ReportEntry7> entry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportEntry7
	 * ReportEntry7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule: In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmEntry
	 * AccountNotification12.mmEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmEntry
	 * AccountNotification7.mmEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountNotification11, List<ReportEntry7>> mmEntry = new MMMessageAssociationEnd<AccountNotification11, List<ReportEntry7>>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashBalanceEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule: In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmEntry);
			previousVersion_lazy = () -> AccountNotification7.mmEntry;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportEntry7.mmObject();
		}

		@Override
		public List<ReportEntry7> getValue(AccountNotification11 obj) {
			return obj.getEntry();
		}

		@Override
		public void setValue(AccountNotification11 obj, List<ReportEntry7> value) {
			obj.setEntry(value);
		}
	};
	@XmlElement(name = "AddtlNtfctnInf")
	protected Max500Text additionalNotificationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11
	 * AccountNotification11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtfctnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalNotificationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the account notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmAdditionalNotificationInformation
	 * AccountNotification12.mmAdditionalNotificationInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmAdditionalNotificationInformation
	 * AccountNotification7.mmAdditionalNotificationInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountNotification11, Optional<Max500Text>> mmAdditionalNotificationInformation = new MMMessageAttribute<AccountNotification11, Optional<Max500Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountNotification11.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalNotificationInformation";
			definition = "Further details of the account notification.";
			nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmAdditionalNotificationInformation);
			previousVersion_lazy = () -> AccountNotification7.mmAdditionalNotificationInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(AccountNotification11 obj) {
			return obj.getAdditionalNotificationInformation();
		}

		@Override
		public void setValue(AccountNotification11 obj, Optional<Max500Text> value) {
			obj.setAdditionalNotificationInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountNotification11.mmIdentification, com.tools20022.repository.msg.AccountNotification11.mmNotificationPagination,
						com.tools20022.repository.msg.AccountNotification11.mmElectronicSequenceNumber, com.tools20022.repository.msg.AccountNotification11.mmLegalSequenceNumber,
						com.tools20022.repository.msg.AccountNotification11.mmCreationDateTime, com.tools20022.repository.msg.AccountNotification11.mmFromToDate, com.tools20022.repository.msg.AccountNotification11.mmCopyDuplicateIndicator,
						com.tools20022.repository.msg.AccountNotification11.mmReportingSource, com.tools20022.repository.msg.AccountNotification11.mmAccount, com.tools20022.repository.msg.AccountNotification11.mmRelatedAccount,
						com.tools20022.repository.msg.AccountNotification11.mmInterest, com.tools20022.repository.msg.AccountNotification11.mmTransactionsSummary, com.tools20022.repository.msg.AccountNotification11.mmEntry,
						com.tools20022.repository.msg.AccountNotification11.mmAdditionalNotificationInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV05.mmNotification);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountNotification11";
				definition = "Provides further details of the account notification.";
				nextVersions_lazy = () -> Arrays.asList(AccountNotification12.mmObject());
				previousVersion_lazy = () -> AccountNotification7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AccountNotification11 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Pagination> getNotificationPagination() {
		return notificationPagination == null ? Optional.empty() : Optional.of(notificationPagination);
	}

	public AccountNotification11 setNotificationPagination(Pagination notificationPagination) {
		this.notificationPagination = notificationPagination;
		return this;
	}

	public Optional<Number> getElectronicSequenceNumber() {
		return electronicSequenceNumber == null ? Optional.empty() : Optional.of(electronicSequenceNumber);
	}

	public AccountNotification11 setElectronicSequenceNumber(Number electronicSequenceNumber) {
		this.electronicSequenceNumber = electronicSequenceNumber;
		return this;
	}

	public Optional<Number> getLegalSequenceNumber() {
		return legalSequenceNumber == null ? Optional.empty() : Optional.of(legalSequenceNumber);
	}

	public AccountNotification11 setLegalSequenceNumber(Number legalSequenceNumber) {
		this.legalSequenceNumber = legalSequenceNumber;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public AccountNotification11 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<DateTimePeriodDetails> getFromToDate() {
		return fromToDate == null ? Optional.empty() : Optional.of(fromToDate);
	}

	public AccountNotification11 setFromToDate(DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicateIndicator() {
		return copyDuplicateIndicator == null ? Optional.empty() : Optional.of(copyDuplicateIndicator);
	}

	public AccountNotification11 setCopyDuplicateIndicator(CopyDuplicate1Code copyDuplicateIndicator) {
		this.copyDuplicateIndicator = copyDuplicateIndicator;
		return this;
	}

	public Optional<ReportingSource1Choice> getReportingSource() {
		return reportingSource == null ? Optional.empty() : Optional.of(reportingSource);
	}

	public AccountNotification11 setReportingSource(ReportingSource1Choice reportingSource) {
		this.reportingSource = reportingSource;
		return this;
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public AccountNotification11 setAccount(CashAccount25 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<CashAccount24> getRelatedAccount() {
		return relatedAccount == null ? Optional.empty() : Optional.of(relatedAccount);
	}

	public AccountNotification11 setRelatedAccount(CashAccount24 relatedAccount) {
		this.relatedAccount = relatedAccount;
		return this;
	}

	public List<AccountInterest3> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public AccountNotification11 setInterest(List<AccountInterest3> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Optional<TotalTransactions4> getTransactionsSummary() {
		return transactionsSummary == null ? Optional.empty() : Optional.of(transactionsSummary);
	}

	public AccountNotification11 setTransactionsSummary(TotalTransactions4 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
		return this;
	}

	public List<ReportEntry7> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public AccountNotification11 setEntry(List<ReportEntry7> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public Optional<Max500Text> getAdditionalNotificationInformation() {
		return additionalNotificationInformation == null ? Optional.empty() : Optional.of(additionalNotificationInformation);
	}

	public AccountNotification11 setAdditionalNotificationInformation(Max500Text additionalNotificationInformation) {
		this.additionalNotificationInformation = additionalNotificationInformation;
		return this;
	}
}