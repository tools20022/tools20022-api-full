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
import com.tools20022.repository.area.camt.BankToCustomerStatementV04;
import com.tools20022.repository.choice.ReportingSource1Choice;
import com.tools20022.repository.codeset.CopyDuplicate1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides further details of the account statement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmIdentification
 * AccountStatement4.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmStatementPagination
 * AccountStatement4.mmStatementPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmElectronicSequenceNumber
 * AccountStatement4.mmElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmLegalSequenceNumber
 * AccountStatement4.mmLegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmCreationDateTime
 * AccountStatement4.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmFromToDate
 * AccountStatement4.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmCopyDuplicateIndicator
 * AccountStatement4.mmCopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmReportingSource
 * AccountStatement4.mmReportingSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmAccount
 * AccountStatement4.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmRelatedAccount
 * AccountStatement4.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmInterest
 * AccountStatement4.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmBalance
 * AccountStatement4.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmTransactionsSummary
 * AccountStatement4.mmTransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmEntry
 * AccountStatement4.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmAdditionalStatementInformation
 * AccountStatement4.mmAdditionalStatementInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV04#mmStatement
 * BankToCustomerStatementV04.mmStatement}</li>
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
 * "AccountStatement4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details of the account statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5
 * AccountStatement5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountStatement3
 * AccountStatement3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountStatement4", propOrder = {"identification", "statementPagination", "electronicSequenceNumber", "legalSequenceNumber", "creationDateTime", "fromToDate", "copyDuplicateIndicator", "reportingSource", "account",
		"relatedAccount", "interest", "balance", "transactionsSummary", "entry", "additionalStatementInformation"})
public class AccountStatement4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text identification;
	/**
	 * Unique identification, as assigned by the account servicer, to
	 * unambiguously identify the account statement.
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Unique identification, as assigned by the account servicer, to unambiguously identify the account statement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmIdentification
	 * AccountStatement5.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account statement.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Pagination statementPagination;
	/**
	 * Provides details on the page number of the statement.<br>
	 * <br>
	 * Usage: The pagination of the statement is only allowed when agreed
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtPgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementPagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the page number of the statement.\r\n\r\nUsage: The pagination of the statement is only allowed when agreed between the parties."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmStatementPagination
	 * AccountStatement5.mmStatementPagination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementPagination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "StmtPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPagination";
			definition = "Provides details on the page number of the statement.\r\n\r\nUsage: The pagination of the statement is only allowed when agreed between the parties.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmStatementPagination);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
		}
	};
	protected Number electronicSequenceNumber;
	/**
	 * Sequential number of the statement, as assigned by the account servicer.
	 * Usage: The sequential number is increased incrementally for each
	 * statement sent electronically.
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Sequential number of the statement, as assigned by the account servicer.\nUsage: The sequential number is increased incrementally for each statement sent electronically."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmElectronicSequenceNumber
	 * AccountStatement5.mmElectronicSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the statement, as assigned by the account servicer.\nUsage: The sequential number is increased incrementally for each statement sent electronically.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmElectronicSequenceNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number legalSequenceNumber;
	/**
	 * Legal sequential number of the statement, as assigned by the account
	 * servicer. It is increased incrementally for each statement sent.
	 * 
	 * Usage: Where a paper statement is a legal requirement, it may have a
	 * number different from the electronic sequential number. Paper statements
	 * could for instance only be sent if movement on the account has taken
	 * place, whereas electronic statements could be sent at the end of each
	 * reporting period, regardless of whether movements have taken place or
	 * not.
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Legal sequential number of the statement, as assigned by the account servicer. It is increased incrementally for each statement sent.\n\nUsage: Where a paper statement is a legal requirement, it may have a number different from the electronic sequential number. Paper statements could for instance only be sent if movement on the account has taken place, whereas electronic statements could be sent at the end of each reporting period, regardless of whether movements have taken place or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmLegalSequenceNumber
	 * AccountStatement5.mmLegalSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the statement, as assigned by the account servicer. It is increased incrementally for each statement sent.\n\nUsage: Where a paper statement is a legal requirement, it may have a number different from the electronic sequential number. Paper statements could for instance only be sent if movement on the account has taken place, whereas electronic statements could be sent at the end of each reporting period, regardless of whether movements have taken place or not.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmLegalSequenceNumber);
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmCreationDateTime
	 * AccountStatement5.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriodDetails fromToDate;
	/**
	 * Range of time between a start date and an end date for which the account
	 * statement is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateTimePeriodDetails
	 * DateTimePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Range of time between a start date and an end date for which the account statement is issued."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmFromToDate
	 * AccountStatement5.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromToDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmFromToDate);
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmCopyDuplicateIndicator
	 * AccountStatement5.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyDuplicateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmCopyDuplicateIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmReportingSource
	 * AccountStatement5.mmReportingSource}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingSource = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmReportingSource);
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmAccount
	 * AccountStatement5.mmAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmAccount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount25.mmObject();
		}
	};
	protected CashAccount24 relatedAccount;
	/**
	 * Identifies the parent account of the account for which the statement has
	 * been issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount24
	 * CashAccount24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Identifies the parent account of the account for which the statement has been issued."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmRelatedAccount
	 * AccountStatement5.mmRelatedAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the statement has been issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmRelatedAccount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountInterest2> interest;
	/**
	 * Provides general interest information that applies to the account at a
	 * particular moment in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountInterest2
	 * AccountInterest2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestCalculation
	 * Interest.mmInterestCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmInterest
	 * AccountStatement5.mmInterest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides general interest information that applies to the account at a particular moment in time.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmInterest);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountInterest2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashBalance3> balance;
	/**
	 * Set of elements used to define the balance as a numerical representation
	 * of the net increases and decreases in an account at a specific point in
	 * time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashBalance3
	 * CashBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account at a specific point in time."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmBalance
	 * AccountStatement5.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashBalance.mmObject();
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account at a specific point in time.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmBalance);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalance3.mmObject();
		}
	};
	protected TotalTransactions4 transactionsSummary;
	/**
	 * Provides summary information on entries.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalTransactions4
	 * TotalTransactions4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmTransactionsSummary
	 * AccountStatement5.mmTransactionsSummary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Provides summary information on entries.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmTransactionsSummary);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalTransactions4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReportEntry4> entry;
	/**
	 * Set of elements used to specify an entry in the statement. Usage: At
	 * least one reference must be provided to identify the entry and its
	 * underlying transaction(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportEntry4
	 * ReportEntry4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
	 * CashBalance.mmCashBalanceEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
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
	 * "Set of elements used to specify an entry in the statement.\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmEntry
	 * AccountStatement5.mmEntry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashBalanceEntry;
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Set of elements used to specify an entry in the statement.\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmEntry);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportEntry4.mmObject();
		}
	};
	protected Max500Text additionalStatementInformation;
	/**
	 * Further details of the account statement.
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4
	 * AccountStatement4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlStmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalStatementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the account statement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmAdditionalStatementInformation
	 * AccountStatement5.mmAdditionalStatementInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatementInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountStatement4.mmObject();
			isDerived = false;
			xmlTag = "AddtlStmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatementInformation";
			definition = "Further details of the account statement.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmAdditionalStatementInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountStatement4.mmIdentification, AccountStatement4.mmStatementPagination, AccountStatement4.mmElectronicSequenceNumber, AccountStatement4.mmLegalSequenceNumber,
						AccountStatement4.mmCreationDateTime, AccountStatement4.mmFromToDate, AccountStatement4.mmCopyDuplicateIndicator, AccountStatement4.mmReportingSource, AccountStatement4.mmAccount, AccountStatement4.mmRelatedAccount,
						AccountStatement4.mmInterest, AccountStatement4.mmBalance, AccountStatement4.mmTransactionsSummary, AccountStatement4.mmEntry, AccountStatement4.mmAdditionalStatementInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankToCustomerStatementV04.mmStatement);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatement4";
				definition = "Provides further details of the account statement.";
				nextVersions_lazy = () -> Arrays.asList(AccountStatement5.mmObject());
				previousVersion_lazy = () -> AccountStatement3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	@XmlElement(name = "StmtPgntn")
	public Pagination getStatementPagination() {
		return statementPagination;
	}

	public void setStatementPagination(com.tools20022.repository.msg.Pagination statementPagination) {
		this.statementPagination = statementPagination;
	}

	@XmlElement(name = "ElctrncSeqNb")
	public Number getElectronicSequenceNumber() {
		return electronicSequenceNumber;
	}

	public void setElectronicSequenceNumber(Number electronicSequenceNumber) {
		this.electronicSequenceNumber = electronicSequenceNumber;
	}

	@XmlElement(name = "LglSeqNb")
	public Number getLegalSequenceNumber() {
		return legalSequenceNumber;
	}

	public void setLegalSequenceNumber(Number legalSequenceNumber) {
		this.legalSequenceNumber = legalSequenceNumber;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "FrToDt")
	public DateTimePeriodDetails getFromToDate() {
		return fromToDate;
	}

	public void setFromToDate(com.tools20022.repository.msg.DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
	}

	@XmlElement(name = "CpyDplctInd")
	public CopyDuplicate1Code getCopyDuplicateIndicator() {
		return copyDuplicateIndicator;
	}

	public void setCopyDuplicateIndicator(CopyDuplicate1Code copyDuplicateIndicator) {
		this.copyDuplicateIndicator = copyDuplicateIndicator;
	}

	@XmlElement(name = "RptgSrc")
	public ReportingSource1Choice getReportingSource() {
		return reportingSource;
	}

	public void setReportingSource(ReportingSource1Choice reportingSource) {
		this.reportingSource = reportingSource;
	}

	@XmlElement(name = "Acct", required = true)
	public CashAccount25 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.CashAccount25 account) {
		this.account = account;
	}

	@XmlElement(name = "RltdAcct")
	public CashAccount24 getRelatedAccount() {
		return relatedAccount;
	}

	public void setRelatedAccount(com.tools20022.repository.msg.CashAccount24 relatedAccount) {
		this.relatedAccount = relatedAccount;
	}

	@XmlElement(name = "Intrst")
	public List<AccountInterest2> getInterest() {
		return interest;
	}

	public void setInterest(List<com.tools20022.repository.msg.AccountInterest2> interest) {
		this.interest = interest;
	}

	@XmlElement(name = "Bal", required = true)
	public List<CashBalance3> getBalance() {
		return balance;
	}

	public void setBalance(List<com.tools20022.repository.msg.CashBalance3> balance) {
		this.balance = balance;
	}

	@XmlElement(name = "TxsSummry")
	public TotalTransactions4 getTransactionsSummary() {
		return transactionsSummary;
	}

	public void setTransactionsSummary(com.tools20022.repository.msg.TotalTransactions4 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
	}

	@XmlElement(name = "Ntry")
	public List<ReportEntry4> getEntry() {
		return entry;
	}

	public void setEntry(List<com.tools20022.repository.msg.ReportEntry4> entry) {
		this.entry = entry;
	}

	@XmlElement(name = "AddtlStmtInf")
	public Max500Text getAdditionalStatementInformation() {
		return additionalStatementInformation;
	}

	public void setAdditionalStatementInformation(Max500Text additionalStatementInformation) {
		this.additionalStatementInformation = additionalStatementInformation;
	}
}