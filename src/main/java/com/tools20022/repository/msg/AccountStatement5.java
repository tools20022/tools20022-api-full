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
import com.tools20022.repository.area.camt.BankToCustomerStatementV05;
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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmIdentification
 * AccountStatement5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmStatementPagination
 * AccountStatement5.mmStatementPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmElectronicSequenceNumber
 * AccountStatement5.mmElectronicSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmLegalSequenceNumber
 * AccountStatement5.mmLegalSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmCreationDateTime
 * AccountStatement5.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmFromToDate
 * AccountStatement5.mmFromToDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmCopyDuplicateIndicator
 * AccountStatement5.mmCopyDuplicateIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmReportingSource
 * AccountStatement5.mmReportingSource}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmAccount
 * AccountStatement5.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmRelatedAccount
 * AccountStatement5.mmRelatedAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmInterest
 * AccountStatement5.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmBalance
 * AccountStatement5.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmTransactionsSummary
 * AccountStatement5.mmTransactionsSummary}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmEntry
 * AccountStatement5.mmEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmAdditionalStatementInformation
 * AccountStatement5.mmAdditionalStatementInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.BankToCustomerStatementV05#mmStatement
 * BankToCustomerStatementV05.mmStatement}</li>
 * </ul>
 * </li>
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
 * "AccountStatement5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides further details of the account statement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6
 * AccountStatement6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountStatement4
 * AccountStatement4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountStatement5", propOrder = {"identification", "statementPagination", "electronicSequenceNumber", "legalSequenceNumber", "creationDateTime", "fromToDate", "copyDuplicateIndicator", "reportingSource", "account",
		"relatedAccount", "interest", "balance", "transactionsSummary", "entry", "additionalStatementInformation"})
public class AccountStatement5 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmIdentification
	 * AccountStatement6.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmIdentification
	 * AccountStatement4.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique identification, as assigned by the account servicer, to unambiguously identify the account statement.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmIdentification);
			previousVersion_lazy = () -> AccountStatement4.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "StmtPgntn")
	protected Pagination statementPagination;
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmStatementPagination
	 * AccountStatement6.mmStatementPagination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmStatementPagination
	 * AccountStatement4.mmStatementPagination}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementPagination = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "StmtPgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPagination";
			definition = "Provides details on the page number of the statement.\r\n\r\nUsage: The pagination of the statement is only allowed when agreed between the parties.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmStatementPagination);
			previousVersion_lazy = () -> AccountStatement4.mmStatementPagination;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Pagination.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmElectronicSequenceNumber
	 * AccountStatement6.mmElectronicSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmElectronicSequenceNumber
	 * AccountStatement4.mmElectronicSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "ElctrncSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicSequenceNumber";
			definition = "Sequential number of the statement, as assigned by the account servicer.\nUsage: The sequential number is increased incrementally for each statement sent electronically.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmElectronicSequenceNumber);
			previousVersion_lazy = () -> AccountStatement4.mmElectronicSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmLegalSequenceNumber
	 * AccountStatement6.mmLegalSequenceNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmLegalSequenceNumber
	 * AccountStatement4.mmLegalSequenceNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalSequenceNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "LglSeqNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalSequenceNumber";
			definition = "Legal sequential number of the statement, as assigned by the account servicer. It is increased incrementally for each statement sent.\n\nUsage: Where a paper statement is a legal requirement, it may have a number different from the electronic sequential number. Paper statements could for instance only be sent if movement on the account has taken place, whereas electronic statements could be sent at the end of each reporting period, regardless of whether movements have taken place or not.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmLegalSequenceNumber);
			previousVersion_lazy = () -> AccountStatement4.mmLegalSequenceNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmCreationDateTime
	 * AccountStatement6.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmCreationDateTime
	 * AccountStatement4.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmCreationDateTime);
			previousVersion_lazy = () -> AccountStatement4.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmFromToDate
	 * AccountStatement6.mmFromToDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmFromToDate
	 * AccountStatement4.mmFromToDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFromToDate = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "FrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromToDate";
			definition = "Range of time between a start date and an end date for which the account statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmFromToDate);
			previousVersion_lazy = () -> AccountStatement4.mmFromToDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateTimePeriodDetails.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmCopyDuplicateIndicator
	 * AccountStatement6.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmCopyDuplicateIndicator
	 * AccountStatement4.mmCopyDuplicateIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCopyDuplicateIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "CpyDplctInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDuplicateIndicator";
			definition = "Indicates whether the document is a copy, a duplicate, or a duplicate of a copy.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmCopyDuplicateIndicator);
			previousVersion_lazy = () -> AccountStatement4.mmCopyDuplicateIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CopyDuplicate1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmReportingSource
	 * AccountStatement6.mmReportingSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmReportingSource
	 * AccountStatement4.mmReportingSource}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReportingSource = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "RptgSrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingSource";
			definition = "Specifies the application used to generate the reporting.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmReportingSource);
			previousVersion_lazy = () -> AccountStatement4.mmReportingSource;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReportingSource1Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmAccount
	 * AccountStatement6.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmAccount
	 * AccountStatement4.mmAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unambiguous identification of the account to which credit and debit entries are made.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmAccount);
			previousVersion_lazy = () -> AccountStatement4.mmAccount;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount25.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmRelatedAccount
	 * AccountStatement6.mmRelatedAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmRelatedAccount
	 * AccountStatement4.mmRelatedAccount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRelatedAccount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "RltdAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedAccount";
			definition = "Identifies the parent account of the account for which the statement has been issued.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmRelatedAccount);
			previousVersion_lazy = () -> AccountStatement4.mmRelatedAccount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount24.mmObject();
		}
	};
	@XmlElement(name = "Intrst")
	protected List<com.tools20022.repository.msg.AccountInterest3> interest;
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmInterest
	 * AccountStatement6.mmInterest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmInterest
	 * AccountStatement4.mmInterest}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInterest = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestCalculation;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "Intrst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interest";
			definition = "Provides general interest information that applies to the account at a particular moment in time.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmInterest);
			previousVersion_lazy = () -> AccountStatement4.mmInterest;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountInterest3.mmObject();
		}
	};
	@XmlElement(name = "Bal", required = true)
	protected List<com.tools20022.repository.msg.CashBalance3> balance;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmBalance
	 * AccountStatement6.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmBalance
	 * AccountStatement4.mmBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBalance = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CashBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account at a specific point in time.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmBalance);
			previousVersion_lazy = () -> AccountStatement4.mmBalance;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashBalance3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmTransactionsSummary
	 * AccountStatement6.mmTransactionsSummary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmTransactionsSummary
	 * AccountStatement4.mmTransactionsSummary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionsSummary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "TxsSummry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsSummary";
			definition = "Provides summary information on entries.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmTransactionsSummary);
			previousVersion_lazy = () -> AccountStatement4.mmTransactionsSummary;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TotalTransactions4.mmObject();
		}
	};
	@XmlElement(name = "Ntry")
	protected List<com.tools20022.repository.msg.ReportEntry7> entry;
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * "Specify an entry in the statement.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n"
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#mmEntry
	 * AccountStatement6.mmEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmEntry
	 * AccountStatement4.mmEntry}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEntry = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmCashBalanceEntry;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "Ntry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entry";
			definition = "Specify an entry in the statement.\r\nUsage: At least one reference must be provided to identify the entry and its underlying transaction(s).\r\n\r\n\r\nUsage Rule:  In case of a Payments R-transaction the creditor / debtor referenced of the original payment initiation messages is also used for reporting of the R-transaction. The original debtor/creditor in the reporting of R-Transactions is not inverted. \r\nFollowing elements all defined in the TransactionDetails in RelatedParties or RelatedAgents are impacted by this usage rule:\r\nCreditor, UltimateCreditor, CreditorAccount, CreditorAgent, Debtor, UltimateDebtor, DebtorAccount and DebtorAgent.\r\n";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmEntry);
			previousVersion_lazy = () -> AccountStatement4.mmEntry;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportEntry7.mmObject();
		}
	};
	@XmlElement(name = "AddtlStmtInf")
	protected Max500Text additionalStatementInformation;
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5
	 * AccountStatement5}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmAdditionalStatementInformation
	 * AccountStatement6.mmAdditionalStatementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmAdditionalStatementInformation
	 * AccountStatement4.mmAdditionalStatementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalStatementInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountStatement5.mmObject();
			isDerived = false;
			xmlTag = "AddtlStmtInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalStatementInformation";
			definition = "Further details of the account statement.";
			nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmAdditionalStatementInformation);
			previousVersion_lazy = () -> AccountStatement4.mmAdditionalStatementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountStatement5.mmIdentification, com.tools20022.repository.msg.AccountStatement5.mmStatementPagination,
						com.tools20022.repository.msg.AccountStatement5.mmElectronicSequenceNumber, com.tools20022.repository.msg.AccountStatement5.mmLegalSequenceNumber, com.tools20022.repository.msg.AccountStatement5.mmCreationDateTime,
						com.tools20022.repository.msg.AccountStatement5.mmFromToDate, com.tools20022.repository.msg.AccountStatement5.mmCopyDuplicateIndicator, com.tools20022.repository.msg.AccountStatement5.mmReportingSource,
						com.tools20022.repository.msg.AccountStatement5.mmAccount, com.tools20022.repository.msg.AccountStatement5.mmRelatedAccount, com.tools20022.repository.msg.AccountStatement5.mmInterest,
						com.tools20022.repository.msg.AccountStatement5.mmBalance, com.tools20022.repository.msg.AccountStatement5.mmTransactionsSummary, com.tools20022.repository.msg.AccountStatement5.mmEntry,
						com.tools20022.repository.msg.AccountStatement5.mmAdditionalStatementInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(BankToCustomerStatementV05.mmStatement);
				trace_lazy = () -> CashBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountStatement5";
				definition = "Provides further details of the account statement.";
				nextVersions_lazy = () -> Arrays.asList(AccountStatement6.mmObject());
				previousVersion_lazy = () -> AccountStatement4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public AccountStatement5 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Pagination> getStatementPagination() {
		return statementPagination == null ? Optional.empty() : Optional.of(statementPagination);
	}

	public AccountStatement5 setStatementPagination(com.tools20022.repository.msg.Pagination statementPagination) {
		this.statementPagination = statementPagination;
		return this;
	}

	public Optional<Number> getElectronicSequenceNumber() {
		return electronicSequenceNumber == null ? Optional.empty() : Optional.of(electronicSequenceNumber);
	}

	public AccountStatement5 setElectronicSequenceNumber(Number electronicSequenceNumber) {
		this.electronicSequenceNumber = electronicSequenceNumber;
		return this;
	}

	public Optional<Number> getLegalSequenceNumber() {
		return legalSequenceNumber == null ? Optional.empty() : Optional.of(legalSequenceNumber);
	}

	public AccountStatement5 setLegalSequenceNumber(Number legalSequenceNumber) {
		this.legalSequenceNumber = legalSequenceNumber;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public AccountStatement5 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<DateTimePeriodDetails> getFromToDate() {
		return fromToDate == null ? Optional.empty() : Optional.of(fromToDate);
	}

	public AccountStatement5 setFromToDate(com.tools20022.repository.msg.DateTimePeriodDetails fromToDate) {
		this.fromToDate = fromToDate;
		return this;
	}

	public Optional<CopyDuplicate1Code> getCopyDuplicateIndicator() {
		return copyDuplicateIndicator == null ? Optional.empty() : Optional.of(copyDuplicateIndicator);
	}

	public AccountStatement5 setCopyDuplicateIndicator(CopyDuplicate1Code copyDuplicateIndicator) {
		this.copyDuplicateIndicator = copyDuplicateIndicator;
		return this;
	}

	public Optional<ReportingSource1Choice> getReportingSource() {
		return reportingSource == null ? Optional.empty() : Optional.of(reportingSource);
	}

	public AccountStatement5 setReportingSource(ReportingSource1Choice reportingSource) {
		this.reportingSource = reportingSource;
		return this;
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public AccountStatement5 setAccount(com.tools20022.repository.msg.CashAccount25 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Optional<CashAccount24> getRelatedAccount() {
		return relatedAccount == null ? Optional.empty() : Optional.of(relatedAccount);
	}

	public AccountStatement5 setRelatedAccount(com.tools20022.repository.msg.CashAccount24 relatedAccount) {
		this.relatedAccount = relatedAccount;
		return this;
	}

	public List<AccountInterest3> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public AccountStatement5 setInterest(List<com.tools20022.repository.msg.AccountInterest3> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public List<CashBalance3> getBalance() {
		return balance == null ? balance = new ArrayList<>() : balance;
	}

	public AccountStatement5 setBalance(List<com.tools20022.repository.msg.CashBalance3> balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public Optional<TotalTransactions4> getTransactionsSummary() {
		return transactionsSummary == null ? Optional.empty() : Optional.of(transactionsSummary);
	}

	public AccountStatement5 setTransactionsSummary(com.tools20022.repository.msg.TotalTransactions4 transactionsSummary) {
		this.transactionsSummary = transactionsSummary;
		return this;
	}

	public List<ReportEntry7> getEntry() {
		return entry == null ? entry = new ArrayList<>() : entry;
	}

	public AccountStatement5 setEntry(List<com.tools20022.repository.msg.ReportEntry7> entry) {
		this.entry = Objects.requireNonNull(entry);
		return this;
	}

	public Optional<Max500Text> getAdditionalStatementInformation() {
		return additionalStatementInformation == null ? Optional.empty() : Optional.of(additionalStatementInformation);
	}

	public AccountStatement5 setAdditionalStatementInformation(Max500Text additionalStatementInformation) {
		this.additionalStatementInformation = additionalStatementInformation;
		return this;
	}
}