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
import com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06;
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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmIdentification
 * AccountNotification12.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmNotificationPagination
 * AccountNotification12.mmNotificationPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmElectronicSequenceNumber
 * AccountNotification12.mmElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmLegalSequenceNumber
 * AccountNotification12.mmLegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmCreationDateTime
 * AccountNotification12.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmFromToDate
 * AccountNotification12.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmCopyDuplicateIndicator
 * AccountNotification12.mmCopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmReportingSource
 * AccountNotification12.mmReportingSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmAccount
 * AccountNotification12.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmRelatedAccount
 * AccountNotification12.mmRelatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmInterest
 * AccountNotification12.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmTransactionsSummary
 * AccountNotification12.mmTransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12#mmEntry
 * AccountNotification12.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmAdditionalNotificationInformation
 * AccountNotification12.mmAdditionalNotificationInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerDebitCreditNotificationV06#mmNotification
 * BankToCustomerDebitCreditNotificationV06.mmNotification}</li>
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
 * "AccountNotification12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details of the account notification."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountNotification11
 * AccountNotification11}</li>
 * </ul>
 */
public class AccountNotification12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique identification, as assigned by the account servicer, to
	 * unambiguously identify the account notification.
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmIdentification
	 * AccountNotification11.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account notification.";
			previousVersion_lazy = () -> AccountNotification11.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination notificationPagination;
	/**
	 * Provides details on the page number of the notification.<br>
	 * <br>
	 * Usage: The pagination of the notification is only allowed when agreed
	 * between the parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmNotificationPagination
	 * AccountNotification11.mmNotificationPagination}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationPagination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "NtfctnPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationPagination";
			definition = "Provides details on the page number of the notification.\r\n\r\nUsage: The pagination of the notification is only allowed when agreed between the parties.";
			previousVersion_lazy = () -> AccountNotification11.mmNotificationPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};
	protected Number electronicSequenceNumber;
	/**
	 * Sequential number of the notification, as assigned by the account
	 * servicer. Usage: The sequential number is increased incrementally for
	 * each notification sent electronically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmElectronicSequenceNumber
	 * AccountNotification11.mmElectronicSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the notification, as assigned by the account servicer. \nUsage: The sequential number is increased incrementally for each notification sent electronically.";
			previousVersion_lazy = () -> AccountNotification11.mmElectronicSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number legalSequenceNumber;
	/**
	 * Legal sequential number of the notification, as assigned by the account
	 * servicer. It is increased incrementally for each notification sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglSeqNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmLegalSequenceNumber
	 * AccountNotification11.mmLegalSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the notification, as assigned by the account servicer. It is increased incrementally for each notification sent.";
			previousVersion_lazy = () -> AccountNotification11.mmLegalSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmCreationDateTime
	 * AccountNotification11.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			previousVersion_lazy = () -> AccountNotification11.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriodDetails fromToDate;
	/**
	 * Range of time between a start date and an end date for which the account
	 * notification is issued.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Range of time between a start date and an end date for which the account notification is issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmFromToDate
	 * AccountNotification11.mmFromToDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromToDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmReportedPeriod;
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account notification is issued.";
			previousVersion_lazy = () -> AccountNotification11.mmFromToDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails.mmObject();
		}
	};
	protected CopyDuplicate1Code copyDuplicateIndicator;
	/**
	 * Indicates whether the document is a copy, a duplicate, or a duplicate of
	 * a copy.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDplctInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDuplicateIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmCopyDuplicateIndicator
	 * AccountNotification11.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyDuplicateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			previousVersion_lazy = () -> AccountNotification11.mmCopyDuplicateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
		}
	};
	protected ReportingSource1Choice reportingSource;
	/**
	 * Specifies the application used to generate the reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReportingSource1Choice
	 * ReportingSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgSrc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the application used to generate the reporting."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmReportingSource
	 * AccountNotification11.mmReportingSource}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingSource = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			previousVersion_lazy = () -> AccountNotification11.mmReportingSource;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingSource1Choice.mmObject();
		}
	};
	protected CashAccount25 account;
	/**
	 * Unambiguous identification of the account to which credit and debit
	 * entries are made.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account to which credit and debit entries are made."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmAccount
	 * AccountNotification11.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			previousVersion_lazy = () -> AccountNotification11.mmAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount25.mmObject();
		}
	};
	protected CashAccount24 relatedAccount;
	/**
	 * Identifies the parent account of the account for which the notification
	 * has been issued.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the parent account of the account for which the notification has been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmRelatedAccount
	 * AccountNotification11.mmRelatedAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the notification has been issued.";
			previousVersion_lazy = () -> AccountNotification11.mmRelatedAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountInterest3> interest;
	/**
	 * Provides general interest information that applies to the account at a
	 * particular moment in time.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides general interest information that applies to the account at a particular moment in time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmInterest
	 * AccountNotification11.mmInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides general interest information that applies to the account at a particular moment in time.";
			previousVersion_lazy = () -> AccountNotification11.mmInterest;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
		}
	};
	protected TotalTransactions5 transactionsSummary;
	/**
	 * Provides summary information on entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTransactions5
	 * TotalTransactions5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsSummry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsSummary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides summary information on entries."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmTransactionsSummary
	 * AccountNotification11.mmTransactionsSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Provides summary information on entries.";
			previousVersion_lazy = () -> AccountNotification11.mmTransactionsSummary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalTransactions5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReportEntry8> entry;
	/**
	 * Specifies an entry in the debit credit notification.<br>
	 * Usage: At least one reference must be provided to identify the entry and
	 * its underlying transaction(s).<br>
	 * <br>
	 * Usage Rule: In case of a Payments R-transaction the creditor / debtor
	 * referenced of the original payment initiation messages is also used for
	 * reporting of the R-transaction. The original debtor/creditor in the
	 * reporting of R-Transactions is not inverted. <br>
	 * Following elements all defined in the TransactionDetails in
	 * RelatedParties or RelatedAgents are impacted by this usage rule:<br>
	 * Creditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor,
	 * UltimateDebtor, DebtorAccount and DebtorAgent.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportEntry8
	 * ReportEntry8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmEntry
	 * AccountNotification11.mmEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashBalanceEntry;
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Specifies an entry in the debit credit notification.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n";
			previousVersion_lazy = () -> AccountNotification11.mmEntry;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportEntry8.mmObject();
		}
	};
	protected Max500Text additionalNotificationInformation;
	/**
	 * Further details of the account notification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12
	 * AccountNotification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlNtfctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalNotificationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the account notification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmAdditionalNotificationInformation
	 * AccountNotification11.mmAdditionalNotificationInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalNotificationInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountNotification12.mmObject();
			isDerived = false;
			xmlTag = "AddtlNtfctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalNotificationInformation";
			definition = "Further details of the account notification.";
			previousVersion_lazy = () -> AccountNotification11.mmAdditionalNotificationInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountNotification12.mmIdentification, AccountNotification12.mmNotificationPagination, AccountNotification12.mmElectronicSequenceNumber,
						AccountNotification12.mmLegalSequenceNumber, AccountNotification12.mmCreationDateTime, AccountNotification12.mmFromToDate, AccountNotification12.mmCopyDuplicateIndicator, AccountNotification12.mmReportingSource,
						AccountNotification12.mmAccount, AccountNotification12.mmRelatedAccount, AccountNotification12.mmInterest, AccountNotification12.mmTransactionsSummary, AccountNotification12.mmEntry,
						AccountNotification12.mmAdditionalNotificationInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankToCustomerDebitCreditNotificationV06.mmNotification);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountNotification12";
				definition = "Provides further details of the account notification.";
				previousVersion_lazy = () -> AccountNotification11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Pagination getNotificationPagination() {
		return notificationPagination;
	}

	public void setNotificationPagination(com.tools20022.repository.msg.Pagination notificationPagination) {
		this.notificationPagination = notificationPagination;
	}

	public Number getElectronicSequenceNumber() {
		return electronicSequenceNumber;
	}

	public void setElectronicSequenceNumber(Number electronicSequenceNumber) {
		this.electronicSequenceNumber = electronicSequenceNumber;
	}

	public Number getLegalSequenceNumber() {
		return legalSequenceNumber;
	}

	public void setLegalSequenceNumber(Number legalSequenceNumber) {
		this.legalSequenceNumber = legalSequenceNumber;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public DateTimePeriodDetails getFromToDate() {
		return fromToDate;
	}

	public void setFromToDate(com.tools20022.repository.msg.DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
	}

	public CopyDuplicate1Code getCopyDuplicateIndicator() {
		return copyDuplicateIndicator;
	}

	public void setCopyDuplicateIndicator(CopyDuplicate1Code copyDuplicateIndicator) {
		this.copyDuplicateIndicator = copyDuplicateIndicator;
	}

	public ReportingSource1Choice getReportingSource() {
		return reportingSource;
	}

	public void setReportingSource(ReportingSource1Choice reportingSource) {
		this.reportingSource = reportingSource;
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.CashAccount25 account) {
		this.account = account;
	}

	public CashAccount24 getRelatedAccount() {
		return relatedAccount;
	}

	public void setRelatedAccount(com.tools20022.repository.msg.CashAccount24 relatedAccount) {
		this.relatedAccount = relatedAccount;
	}

	public List<AccountInterest3> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.msg.AccountInterest3> interest) {
		this.interest = interest;
	}

	public TotalTransactions5 getTransactionsSummary() {
		return transactionsSummary;
	}

	public void setTransactionsSummary(com.tools20022.repository.msg.TotalTransactions5 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
	}

	public List<ReportEntry8> getEntry() {
		return entry;
	}

	public void setEntry(List<com.tools20022.repository.msg.ReportEntry8> entry) {
		this.entry = entry;
	}

	public Max500Text getAdditionalNotificationInformation() {
		return additionalNotificationInformation;
	}

	public void setAdditionalNotificationInformation(Max500Text additionalNotificationInformation) {
		this.additionalNotificationInformation = additionalNotificationInformation;
	}
}