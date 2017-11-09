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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.StatementType1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.InvestmentAccount;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Account, financial instrument and statement parameters for which a statement
 * is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementTypeOrExtendedStatementType
 * StatementAndFinancialInstrumentDetails.mmStatementTypeOrExtendedStatementType
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementDateOrPeriod
 * StatementAndFinancialInstrumentDetails.mmStatementDateOrPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmAccountIdentification
 * StatementAndFinancialInstrumentDetails.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmSubAccountIdentification
 * StatementAndFinancialInstrumentDetails.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmFinancialInstrumentDetails
 * StatementAndFinancialInstrumentDetails.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmAccountOwner
 * StatementAndFinancialInstrumentDetails.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementType
 * StatementAndFinancialInstrumentDetails.mmStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmExtendedStatementType
 * StatementAndFinancialInstrumentDetails.mmExtendedStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementDate
 * StatementAndFinancialInstrumentDetails.mmStatementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementPeriod
 * StatementAndFinancialInstrumentDetails.mmStatementPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmFrequency
 * StatementAndFinancialInstrumentDetails.mmFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmUpdateType
 * StatementAndFinancialInstrumentDetails.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementBasis
 * StatementAndFinancialInstrumentDetails.mmStatementBasis}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementAndFinancialInstrumentDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account, financial instrument and statement parameters for which a statement is requested."
 * </li>
 * </ul>
 */
public class StatementAndFinancialInstrumentDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentificationFormatChoice accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	protected AccountIdentificationFormatChoice subAccountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationFormatChoice
	 * AccountIdentificationFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}
	};
	protected FinancialInstrument17 financialInstrumentDetails;
	/**
	 * Financial instrument for which the statement is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument17
	 * FinancialInstrument17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument for which the statement is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument for which the statement is requested.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument17.mmObject();
		}
	};
	protected PartyIdentification2Choice accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected StatementType1Code statementType;
	/**
	 * Specifes the statement message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StatementType1Code
	 * StatementType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifes the statement message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Specifes the statement message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatementType1Code.mmObject();
		}
	};
	protected Extended350Code extendedStatementType;
	/**
	 * Specifes the statement message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedStmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedStatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifes the statement message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedStatementType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "XtndedStmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedStatementType";
			definition = "Specifes the statement message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected ISODate statementDate;
	/**
	 * Date of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDate";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected DatePeriodDetails statementPeriod;
	/**
	 * Period on which the statement is reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmReportedPeriod
	 * Account.mmReportedPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the statement is reporting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmReportedPeriod;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPeriod";
			definition = "Period on which the statement is reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.DatePeriodDetails.mmObject();
		}
	};
	protected FrequencyCodeAndDSSCode1Choice frequency;
	/**
	 * Frequency of the statement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FrequencyCodeAndDSSCode1Choice
	 * FrequencyCodeAndDSSCode1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the statement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FrequencyCodeAndDSSCode1Choice.mmObject();
		}
	};
	protected StatementUpdateTypeCodeAndDSSCodeChoice updateType;
	/**
	 * Indicates whether the report is complete or contains changes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementUpdateTypeCodeAndDSSCodeChoice
	 * StatementUpdateTypeCodeAndDSSCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the report is complete or contains changes only."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
		}
	};
	protected StatementBasisCodeAndDSSCodeChoice statementBasis;
	/**
	 * Type of balance on which the statement is prepared.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementBasisCodeAndDSSCodeChoice
	 * StatementBasisCodeAndDSSCodeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of balance on which the statement is prepared."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementBasis = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasisCodeAndDSSCodeChoice.mmObject();
		}
	};
	/**
	 * Either StatementType or ExtendedStatementType must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementType
	 * StatementAndFinancialInstrumentDetails.mmStatementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmExtendedStatementType
	 * StatementAndFinancialInstrumentDetails.mmExtendedStatementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementTypeOrExtendedStatementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either StatementType or ExtendedStatementType must be present."</li>
	 * </ul>
	 */
	public static final MMXor mmStatementTypeOrExtendedStatementType = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementTypeOrExtendedStatementType";
			definition = "Either StatementType or ExtendedStatementType must be present.";
			messageComponent_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			impactedElements_lazy = () -> Arrays.asList(StatementAndFinancialInstrumentDetails.mmStatementType, StatementAndFinancialInstrumentDetails.mmExtendedStatementType);
		}
	};
	/**
	 * Either StatementDate or StatementPeriod may be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails
	 * StatementAndFinancialInstrumentDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementDate
	 * StatementAndFinancialInstrumentDetails.mmStatementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#mmStatementPeriod
	 * StatementAndFinancialInstrumentDetails.mmStatementPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementDateOrPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either StatementDate or StatementPeriod may be present."</li>
	 * </ul>
	 */
	public static final MMXor mmStatementDateOrPeriod = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateOrPeriod";
			definition = "Either StatementDate or StatementPeriod may be present.";
			messageComponent_lazy = () -> StatementAndFinancialInstrumentDetails.mmObject();
			impactedElements_lazy = () -> Arrays.asList(StatementAndFinancialInstrumentDetails.mmStatementDate, StatementAndFinancialInstrumentDetails.mmStatementPeriod);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(StatementAndFinancialInstrumentDetails.mmAccountIdentification, StatementAndFinancialInstrumentDetails.mmSubAccountIdentification,
						StatementAndFinancialInstrumentDetails.mmFinancialInstrumentDetails, StatementAndFinancialInstrumentDetails.mmAccountOwner, StatementAndFinancialInstrumentDetails.mmStatementType,
						StatementAndFinancialInstrumentDetails.mmExtendedStatementType, StatementAndFinancialInstrumentDetails.mmStatementDate, StatementAndFinancialInstrumentDetails.mmStatementPeriod,
						StatementAndFinancialInstrumentDetails.mmFrequency, StatementAndFinancialInstrumentDetails.mmUpdateType, StatementAndFinancialInstrumentDetails.mmStatementBasis);
				trace_lazy = () -> Account.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "StatementAndFinancialInstrumentDetails";
				definition = "Account, financial instrument and statement parameters for which a statement is requested.";
				xors_lazy = () -> Arrays.asList(StatementAndFinancialInstrumentDetails.mmStatementTypeOrExtendedStatementType, StatementAndFinancialInstrumentDetails.mmStatementDateOrPeriod);
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationFormatChoice getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(AccountIdentificationFormatChoice accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	public AccountIdentificationFormatChoice getSubAccountIdentification() {
		return subAccountIdentification;
	}

	public void setSubAccountIdentification(AccountIdentificationFormatChoice subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
	}

	public FinancialInstrument17 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument17 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	public PartyIdentification2Choice getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(PartyIdentification2Choice accountOwner) {
		this.accountOwner = accountOwner;
	}

	public StatementType1Code getStatementType() {
		return statementType;
	}

	public void setStatementType(StatementType1Code statementType) {
		this.statementType = statementType;
	}

	public Extended350Code getExtendedStatementType() {
		return extendedStatementType;
	}

	public void setExtendedStatementType(Extended350Code extendedStatementType) {
		this.extendedStatementType = extendedStatementType;
	}

	public ISODate getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(ISODate statementDate) {
		this.statementDate = statementDate;
	}

	public DatePeriodDetails getStatementPeriod() {
		return statementPeriod;
	}

	public void setStatementPeriod(com.tools20022.repository.msg.DatePeriodDetails statementPeriod) {
		this.statementPeriod = statementPeriod;
	}

	public FrequencyCodeAndDSSCode1Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(FrequencyCodeAndDSSCode1Choice frequency) {
		this.frequency = frequency;
	}

	public StatementUpdateTypeCodeAndDSSCodeChoice getUpdateType() {
		return updateType;
	}

	public void setUpdateType(StatementUpdateTypeCodeAndDSSCodeChoice updateType) {
		this.updateType = updateType;
	}

	public StatementBasisCodeAndDSSCodeChoice getStatementBasis() {
		return statementBasis;
	}

	public void setStatementBasis(StatementBasisCodeAndDSSCodeChoice statementBasis) {
		this.statementBasis = statementBasis;
	}
}