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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.StatementType1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReportingService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DatePeriodDetails;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account and statement parameters for which a statement is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#StatementTypeOrExtendedStatementType
 * StatementDetails.StatementTypeOrExtendedStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#StatementDateOrPeriod
 * StatementDetails.StatementDateOrPeriod}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmAccountIdentification
 * StatementDetails.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmSubAccountIdentification
 * StatementDetails.mmSubAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmAccountOwner
 * StatementDetails.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementType
 * StatementDetails.mmStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmExtendedStatementType
 * StatementDetails.mmExtendedStatementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementDate
 * StatementDetails.mmStatementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementPeriod
 * StatementDetails.mmStatementPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementDetails#mmFrequency
 * StatementDetails.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementDetails#mmUpdateType
 * StatementDetails.mmUpdateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementBasis
 * StatementDetails.mmStatementBasis}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementDetails"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account and statement parameters for which a statement is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "StatementDetails", propOrder = {"accountIdentification", "subAccountIdentification", "accountOwner", "statementType", "extendedStatementType", "statementDate", "statementPeriod", "frequency", "updateType", "statementBasis"})
public class StatementDetails {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected AccountIdentificationFormatChoice accountIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, AccountIdentificationFormatChoice> mmAccountIdentification = new MMMessageAttribute<StatementDetails, AccountIdentificationFormatChoice>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}

		@Override
		public AccountIdentificationFormatChoice getValue(StatementDetails obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(StatementDetails obj, AccountIdentificationFormatChoice value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "SubAcctId")
	protected AccountIdentificationFormatChoice subAccountIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<AccountIdentificationFormatChoice>> mmSubAccountIdentification = new MMMessageAttribute<StatementDetails, Optional<AccountIdentificationFormatChoice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "SubAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationFormatChoice.mmObject();
		}

		@Override
		public Optional<AccountIdentificationFormatChoice> getValue(StatementDetails obj) {
			return obj.getSubAccountIdentification();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<AccountIdentificationFormatChoice> value) {
			obj.setSubAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification2Choice accountOwner;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<PartyIdentification2Choice>> mmAccountOwner = new MMMessageAttribute<StatementDetails, Optional<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification2Choice> getValue(StatementDetails obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<PartyIdentification2Choice> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtTp", required = true)
	protected StatementType1Code statementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, StatementType1Code> mmStatementType = new MMMessageAttribute<StatementDetails, StatementType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementType";
			definition = "Specifes the statement message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StatementType1Code.mmObject();
		}

		@Override
		public StatementType1Code getValue(StatementDetails obj) {
			return obj.getStatementType();
		}

		@Override
		public void setValue(StatementDetails obj, StatementType1Code value) {
			obj.setStatementType(value);
		}
	};
	@XmlElement(name = "XtndedStmtTp", required = true)
	protected Extended350Code extendedStatementType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Extended350Code> mmExtendedStatementType = new MMMessageAttribute<StatementDetails, Extended350Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "XtndedStmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedStatementType";
			definition = "Specifes the statement message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(StatementDetails obj) {
			return obj.getExtendedStatementType();
		}

		@Override
		public void setValue(StatementDetails obj, Extended350Code value) {
			obj.setExtendedStatementType(value);
		}
	};
	@XmlElement(name = "StmtDt")
	protected ISODate statementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<ISODate>> mmStatementDate = new MMMessageAttribute<StatementDetails, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDate";
			definition = "Date of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(StatementDetails obj) {
			return obj.getStatementDate();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<ISODate> value) {
			obj.setStatementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtPrd")
	protected DatePeriodDetails statementPeriod;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<DatePeriodDetails>> mmStatementPeriod = new MMMessageAttribute<StatementDetails, Optional<DatePeriodDetails>>() {
		{
			businessElementTrace_lazy = () -> Account.mmReportedPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementPeriod";
			definition = "Period on which the statement is reporting.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public Optional<DatePeriodDetails> getValue(StatementDetails obj) {
			return obj.getStatementPeriod();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<DatePeriodDetails> value) {
			obj.setStatementPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Frqcy")
	protected FrequencyCodeAndDSSCode1Choice frequency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<FrequencyCodeAndDSSCode1Choice>> mmFrequency = new MMMessageAttribute<StatementDetails, Optional<FrequencyCodeAndDSSCode1Choice>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the statement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FrequencyCodeAndDSSCode1Choice.mmObject();
		}

		@Override
		public Optional<FrequencyCodeAndDSSCode1Choice> getValue(StatementDetails obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<FrequencyCodeAndDSSCode1Choice> value) {
			obj.setFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "UpdTp")
	protected StatementUpdateTypeCodeAndDSSCodeChoice updateType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<StatementUpdateTypeCodeAndDSSCodeChoice>> mmUpdateType = new MMMessageAttribute<StatementDetails, Optional<StatementUpdateTypeCodeAndDSSCodeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "UpdTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateType";
			definition = "Indicates whether the report is complete or contains changes only.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementUpdateTypeCodeAndDSSCodeChoice.mmObject();
		}

		@Override
		public Optional<StatementUpdateTypeCodeAndDSSCodeChoice> getValue(StatementDetails obj) {
			return obj.getUpdateType();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<StatementUpdateTypeCodeAndDSSCodeChoice> value) {
			obj.setUpdateType(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtBsis")
	protected StatementBasisCodeAndDSSCodeChoice statementBasis;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
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
	public static final MMMessageAttribute<StatementDetails, Optional<StatementBasisCodeAndDSSCodeChoice>> mmStatementBasis = new MMMessageAttribute<StatementDetails, Optional<StatementBasisCodeAndDSSCodeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			isDerived = false;
			xmlTag = "StmtBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementBasis";
			definition = "Type of balance on which the statement is prepared.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementBasisCodeAndDSSCodeChoice.mmObject();
		}

		@Override
		public Optional<StatementBasisCodeAndDSSCodeChoice> getValue(StatementDetails obj) {
			return obj.getStatementBasis();
		}

		@Override
		public void setValue(StatementDetails obj, Optional<StatementBasisCodeAndDSSCodeChoice> value) {
			obj.setStatementBasis(value.orElse(null));
		}
	};
	/**
	 * Either StatementType or ExtendedStatementType must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementType
	 * StatementDetails.mmStatementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmExtendedStatementType
	 * StatementDetails.mmExtendedStatementType}</li>
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
	public static final MMXor StatementTypeOrExtendedStatementType = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementTypeOrExtendedStatementType";
			definition = "Either StatementType or ExtendedStatementType must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.mmStatementType, com.tools20022.repository.msg.StatementDetails.mmExtendedStatementType);
		}
	};
	/**
	 * Either StatementDate or StatementPeriod may be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.StatementDetails
	 * StatementDetails}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementDate
	 * StatementDetails.mmStatementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementDetails#mmStatementPeriod
	 * StatementDetails.mmStatementPeriod}</li>
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
	public static final MMXor StatementDateOrPeriod = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementDateOrPeriod";
			definition = "Either StatementDate or StatementPeriod may be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.StatementDetails.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.mmStatementDate, com.tools20022.repository.msg.StatementDetails.mmStatementPeriod);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.mmAccountIdentification, com.tools20022.repository.msg.StatementDetails.mmSubAccountIdentification,
						com.tools20022.repository.msg.StatementDetails.mmAccountOwner, com.tools20022.repository.msg.StatementDetails.mmStatementType, com.tools20022.repository.msg.StatementDetails.mmExtendedStatementType,
						com.tools20022.repository.msg.StatementDetails.mmStatementDate, com.tools20022.repository.msg.StatementDetails.mmStatementPeriod, com.tools20022.repository.msg.StatementDetails.mmFrequency,
						com.tools20022.repository.msg.StatementDetails.mmUpdateType, com.tools20022.repository.msg.StatementDetails.mmStatementBasis);
				trace_lazy = () -> Account.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "StatementDetails";
				definition = "Account and statement parameters for which a statement is requested.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.StatementTypeOrExtendedStatementType, com.tools20022.repository.msg.StatementDetails.StatementDateOrPeriod);
			}
		});
		return mmObject_lazy.get();
	}

	public AccountIdentificationFormatChoice getAccountIdentification() {
		return accountIdentification;
	}

	public StatementDetails setAccountIdentification(AccountIdentificationFormatChoice accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<AccountIdentificationFormatChoice> getSubAccountIdentification() {
		return subAccountIdentification == null ? Optional.empty() : Optional.of(subAccountIdentification);
	}

	public StatementDetails setSubAccountIdentification(AccountIdentificationFormatChoice subAccountIdentification) {
		this.subAccountIdentification = subAccountIdentification;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public StatementDetails setAccountOwner(PartyIdentification2Choice accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public StatementType1Code getStatementType() {
		return statementType;
	}

	public StatementDetails setStatementType(StatementType1Code statementType) {
		this.statementType = Objects.requireNonNull(statementType);
		return this;
	}

	public Extended350Code getExtendedStatementType() {
		return extendedStatementType;
	}

	public StatementDetails setExtendedStatementType(Extended350Code extendedStatementType) {
		this.extendedStatementType = Objects.requireNonNull(extendedStatementType);
		return this;
	}

	public Optional<ISODate> getStatementDate() {
		return statementDate == null ? Optional.empty() : Optional.of(statementDate);
	}

	public StatementDetails setStatementDate(ISODate statementDate) {
		this.statementDate = statementDate;
		return this;
	}

	public Optional<DatePeriodDetails> getStatementPeriod() {
		return statementPeriod == null ? Optional.empty() : Optional.of(statementPeriod);
	}

	public StatementDetails setStatementPeriod(DatePeriodDetails statementPeriod) {
		this.statementPeriod = statementPeriod;
		return this;
	}

	public Optional<FrequencyCodeAndDSSCode1Choice> getFrequency() {
		return frequency == null ? Optional.empty() : Optional.of(frequency);
	}

	public StatementDetails setFrequency(FrequencyCodeAndDSSCode1Choice frequency) {
		this.frequency = frequency;
		return this;
	}

	public Optional<StatementUpdateTypeCodeAndDSSCodeChoice> getUpdateType() {
		return updateType == null ? Optional.empty() : Optional.of(updateType);
	}

	public StatementDetails setUpdateType(StatementUpdateTypeCodeAndDSSCodeChoice updateType) {
		this.updateType = updateType;
		return this;
	}

	public Optional<StatementBasisCodeAndDSSCodeChoice> getStatementBasis() {
		return statementBasis == null ? Optional.empty() : Optional.of(statementBasis);
	}

	public StatementDetails setStatementBasis(StatementBasisCodeAndDSSCodeChoice statementBasis) {
		this.statementBasis = statementBasis;
		return this;
	}
}