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
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.choice.CashAccountType2Choice;
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.codeset.AccountStatus3Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import com.tools20022.repository.msg.OrganisationIdentification8;
import com.tools20022.repository.msg.Restriction1;
import com.tools20022.repository.msg.StatementFrequencyAndForm1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account owned by a customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmIdentification
 * CustomerAccount7.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmName
 * CustomerAccount7.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmStatus
 * CustomerAccount7.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmType
 * CustomerAccount7.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmCurrency
 * CustomerAccount7.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyPaymentValue
 * CustomerAccount7.mmMinimumMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyPaymentValue
 * CustomerAccount7.mmMaximumMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyReceivedValue
 * CustomerAccount7.mmMinimumMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyReceivedValue
 * CustomerAccount7.mmMaximumMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyTransactionNumber
 * CustomerAccount7.mmMinimumMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyTransactionNumber
 * CustomerAccount7.mmMaximumMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumAverageBalance
 * CustomerAccount7.mmMinimumAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumAverageBalance
 * CustomerAccount7.mmMaximumAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmAccountPurpose
 * CustomerAccount7.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumFloorNotificationAmount
 * CustomerAccount7.mmMinimumFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumFloorNotificationAmount
 * CustomerAccount7.mmMaximumFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumCeilingNotificationAmount
 * CustomerAccount7.mmMinimumCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumCeilingNotificationAmount
 * CustomerAccount7.mmMaximumCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmStatementFrequencyAndFormat
 * CustomerAccount7.mmStatementFrequencyAndFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmRestriction
 * CustomerAccount7.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmClosingDate
 * CustomerAccount7.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmOpeningDate
 * CustomerAccount7.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmReferenceAccountIdentification
 * CustomerAccount7.mmReferenceAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmProprietary
 * CustomerAccount7.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmAccountOwner
 * CustomerAccount7.mmAccountOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccount7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2 CustomerAccount2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccount7", propOrder = {"identification", "name", "status", "type", "currency", "minimumMonthlyPaymentValue", "maximumMonthlyPaymentValue", "minimumMonthlyReceivedValue", "maximumMonthlyReceivedValue",
		"minimumMonthlyTransactionNumber", "maximumMonthlyTransactionNumber", "minimumAverageBalance", "maximumAverageBalance", "accountPurpose", "minimumFloorNotificationAmount", "maximumFloorNotificationAmount",
		"minimumCeilingNotificationAmount", "maximumCeilingNotificationAmount", "statementFrequencyAndFormat", "restriction", "closingDate", "openingDate", "referenceAccountIdentification", "proprietary", "accountOwner"})
public class CustomerAccount7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id")
	protected AccountIdentification4Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
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
	 * definition} = "Identification of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmIdentification
	 * CustomerAccount2.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<AccountIdentification4Choice>> mmIdentification = new MMMessageAttribute<CustomerAccount7, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			previousVersion_lazy = () -> CustomerAccount2.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(CustomerAccount7 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<AccountIdentification4Choice> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm")
	protected Max70Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmName
	 * CustomerAccount2.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<Max70Text>> mmName = new MMMessageAttribute<CustomerAccount7, Optional<Max70Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			previousVersion_lazy = () -> CustomerAccount2.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(CustomerAccount7 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<Max70Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected AccountStatus3Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatus3Code
	 * AccountStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the current state of an account, eg, enabled or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmStatus
	 * CustomerAccount2.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<AccountStatus3Code>> mmStatus = new MMMessageAttribute<CustomerAccount7, Optional<AccountStatus3Code>>() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			previousVersion_lazy = () -> CustomerAccount2.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountStatus3Code.mmObject();
		}

		@Override
		public Optional<AccountStatus3Code> getValue(CustomerAccount7 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<AccountStatus3Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountType2Choice
	 * CashAccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmType
	 * CustomerAccount2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<CashAccountType2Choice>> mmType = new MMMessageAttribute<CustomerAccount7, Optional<CashAccountType2Choice>>() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			previousVersion_lazy = () -> CustomerAccount2.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccountType2Choice.mmObject();
		}

		@Override
		public Optional<CashAccountType2Choice> getValue(CustomerAccount7 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<CashAccountType2Choice> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "Ccy")
	protected ActiveCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmBaseCurrency
	 * Account.mmBaseCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Medium of exchange of value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmCurrency
	 * CustomerAccount2.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ActiveCurrencyCode>> mmCurrency = new MMMessageAttribute<CustomerAccount7, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			previousVersion_lazy = () -> CustomerAccount2.mmCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(CustomerAccount7 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ActiveCurrencyCode> value) {
			obj.setCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMnthlyPmtVal")
	protected ImpliedCurrencyAndAmount minimumMonthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyPaymentValue
	 * AccountReportedMovement.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMnthlyPmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyPaymentValue
	 * CustomerAccount2.mmMinimumMonthlyPaymentValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMinimumMonthlyPaymentValue = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyPaymentValue";
			definition = "Minimum monthly average of the payment amounts (that is, payments going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumMonthlyPaymentValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMinimumMonthlyPaymentValue();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumMonthlyPaymentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxMnthlyPmtVal")
	protected ImpliedCurrencyAndAmount maximumMonthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyPaymentValue
	 * AccountReportedMovement.mmMonthlyPaymentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxMnthlyPmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumMonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyPaymentValue
	 * CustomerAccount2.mmMaximumMonthlyPaymentValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMaximumMonthlyPaymentValue = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyPaymentValue";
			definition = "Maximum monthly average of the payment amounts (that is, payments going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumMonthlyPaymentValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMaximumMonthlyPaymentValue();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumMonthlyPaymentValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMnthlyRcvdVal")
	protected ImpliedCurrencyAndAmount minimumMonthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyReceivedValue
	 * AccountReportedMovement.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMnthlyRcvdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyReceivedValue
	 * CustomerAccount2.mmMinimumMonthlyReceivedValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMinimumMonthlyReceivedValue = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyReceivedValue";
			definition = "Minimum monthly average of the received amounts over a year (that is, payments coming in).";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumMonthlyReceivedValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMinimumMonthlyReceivedValue();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumMonthlyReceivedValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxMnthlyRcvdVal")
	protected ImpliedCurrencyAndAmount maximumMonthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyReceivedValue
	 * AccountReportedMovement.mmMonthlyReceivedValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxMnthlyRcvdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumMonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyReceivedValue
	 * CustomerAccount2.mmMaximumMonthlyReceivedValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMaximumMonthlyReceivedValue = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyReceivedValue";
			definition = "Maximum monthly average of the received amounts over a year (that is, payments coming in).";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumMonthlyReceivedValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMaximumMonthlyReceivedValue();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumMonthlyReceivedValue(value.orElse(null));
		}
	};
	@XmlElement(name = "MinMnthlyTxNb")
	protected Max5NumericText minimumMonthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyTransactionNumber
	 * AccountReportedMovement.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinMnthlyTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyTransactionNumber
	 * CustomerAccount2.mmMinimumMonthlyTransactionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<Max5NumericText>> mmMinimumMonthlyTransactionNumber = new MMMessageAttribute<CustomerAccount7, Optional<Max5NumericText>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyTransactionNumber";
			definition = "Minimum monthly average of the number of payments (coming in and going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumMonthlyTransactionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(CustomerAccount7 obj) {
			return obj.getMinimumMonthlyTransactionNumber();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<Max5NumericText> value) {
			obj.setMinimumMonthlyTransactionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxMnthlyTxNb")
	protected Max5NumericText maximumMonthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5NumericText
	 * Max5NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmMonthlyTransactionNumber
	 * AccountReportedMovement.mmMonthlyTransactionNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxMnthlyTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumMonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyTransactionNumber
	 * CustomerAccount2.mmMaximumMonthlyTransactionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<Max5NumericText>> mmMaximumMonthlyTransactionNumber = new MMMessageAttribute<CustomerAccount7, Optional<Max5NumericText>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyTransactionNumber";
			definition = "Maximum monthly average of the number of payments (coming in and going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumMonthlyTransactionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}

		@Override
		public Optional<Max5NumericText> getValue(CustomerAccount7 obj) {
			return obj.getMaximumMonthlyTransactionNumber();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<Max5NumericText> value) {
			obj.setMaximumMonthlyTransactionNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "MinAvrgBal")
	protected ImpliedCurrencyAndAmount minimumAverageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmAverageBalance
	 * AccountReportedMovement.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinAvrgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumAverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumAverageBalance
	 * CustomerAccount2.mmMinimumAverageBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMinimumAverageBalance = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAverageBalance";
			definition = "Minimum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumAverageBalance;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMinimumAverageBalance();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumAverageBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxAvrgBal")
	protected ImpliedCurrencyAndAmount maximumAverageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountReportedMovement#mmAverageBalance
	 * AccountReportedMovement.mmAverageBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAvrgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumAverageBalance
	 * CustomerAccount2.mmMaximumAverageBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMaximumAverageBalance = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAverageBalance";
			definition = "Maximum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumAverageBalance;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMaximumAverageBalance();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumAverageBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctPurp")
	protected Max140Text accountPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmPurpose
	 * Account.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the purpose of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmAccountPurpose
	 * CustomerAccount2.mmAccountPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<Max140Text>> mmAccountPurpose = new MMMessageAttribute<CustomerAccount7, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			previousVersion_lazy = () -> CustomerAccount2.mmAccountPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CustomerAccount7 obj) {
			return obj.getAccountPurpose();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<Max140Text> value) {
			obj.setAccountPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "MinFlrNtfctnAmt")
	protected ImpliedCurrencyAndAmount minimumFloorNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
	 * ReportingService.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinFlrNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumFloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumFloorNotificationAmount
	 * CustomerAccount2.mmMinimumFloorNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMinimumFloorNotificationAmount = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumFloorNotificationAmount";
			definition = "Minimum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumFloorNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMinimumFloorNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumFloorNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxFlrNtfctnAmt")
	protected ImpliedCurrencyAndAmount maximumFloorNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
	 * ReportingService.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxFlrNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumFloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumFloorNotificationAmount
	 * CustomerAccount2.mmMaximumFloorNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMaximumFloorNotificationAmount = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumFloorNotificationAmount";
			definition = "Maximum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumFloorNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMaximumFloorNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumFloorNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MinClngNtfctnAmt")
	protected ImpliedCurrencyAndAmount minimumCeilingNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
	 * ReportingService.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinClngNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumCeilingNotificationAmount
	 * CustomerAccount2.mmMinimumCeilingNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMinimumCeilingNotificationAmount = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MinClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCeilingNotificationAmount";
			definition = "Minimum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount2.mmMinimumCeilingNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMinimumCeilingNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMinimumCeilingNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxClngNtfctnAmt")
	protected ImpliedCurrencyAndAmount maximumCeilingNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
	 * ReportingService.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxClngNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumCeilingNotificationAmount
	 * CustomerAccount2.mmMaximumCeilingNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>> mmMaximumCeilingNotificationAmount = new MMMessageAttribute<CustomerAccount7, Optional<ImpliedCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "MaxClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCeilingNotificationAmount";
			definition = "Maximum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount2.mmMaximumCeilingNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ImpliedCurrencyAndAmount> getValue(CustomerAccount7 obj) {
			return obj.getMaximumCeilingNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<ImpliedCurrencyAndAmount> value) {
			obj.setMaximumCeilingNotificationAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "StmtFrqcyAndFrmt")
	protected List<StatementFrequencyAndForm1> statementFrequencyAndFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
	 * StatementFrequencyAndForm1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtFrqcyAndFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequencyAndFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how often statements (for audit purposes) will be sent, in which format, to which address."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, List<StatementFrequencyAndForm1>> mmStatementFrequencyAndFormat = new MMMessageAttribute<CustomerAccount7, List<StatementFrequencyAndForm1>>() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcyAndFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequencyAndFormat";
			definition = "Specifies how often statements (for audit purposes) will be sent, in which format, to which address.";
			minOccurs = 0;
			complexType_lazy = () -> StatementFrequencyAndForm1.mmObject();
		}

		@Override
		public List<StatementFrequencyAndForm1> getValue(CustomerAccount7 obj) {
			return obj.getStatementFrequencyAndFormat();
		}

		@Override
		public void setValue(CustomerAccount7 obj, List<StatementFrequencyAndForm1> value) {
			obj.setStatementFrequencyAndFormat(value);
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<Restriction1> restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Restriction1
	 * Restriction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmAccountRestriction
	 * Account.mmAccountRestriction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Restriction on capability or operations allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmRestriction
	 * CustomerAccount2.mmRestriction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount7, List<Restriction1>> mmRestriction = new MMMessageAssociationEnd<CustomerAccount7, List<Restriction1>>() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			previousVersion_lazy = () -> CustomerAccount2.mmRestriction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Restriction1.mmObject();
		}

		@Override
		public List<Restriction1> getValue(CustomerAccount7 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(CustomerAccount7 obj, List<Restriction1> value) {
			obj.setRestriction(value);
		}
	};
	@XmlElement(name = "ClsgDt")
	protected DateSearchChoice closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the account will be or was closed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmClosingDate
	 * CustomerAccount2.mmClosingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount7, Optional<DateSearchChoice>> mmClosingDate = new MMMessageAssociationEnd<CustomerAccount7, Optional<DateSearchChoice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			previousVersion_lazy = () -> CustomerAccount2.mmClosingDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(CustomerAccount7 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<DateSearchChoice> value) {
			obj.setClosingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OpngDt")
	protected DateSearchChoice openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateSearchChoice
	 * DateSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
	 * Account.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date when the account was opened."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmOpeningDate
	 * CustomerAccount2.mmOpeningDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount7, Optional<DateSearchChoice>> mmOpeningDate = new MMMessageAssociationEnd<CustomerAccount7, Optional<DateSearchChoice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date when the account was opened.";
			previousVersion_lazy = () -> CustomerAccount2.mmOpeningDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
		}

		@Override
		public Optional<DateSearchChoice> getValue(CustomerAccount7 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<DateSearchChoice> value) {
			obj.setOpeningDate(value.orElse(null));
		}
	};
	@XmlElement(name = "RefAcctId")
	protected AccountIdentification4Choice referenceAccountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefAcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account used as a reference for the opening of another account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmReferenceAccountIdentification
	 * CustomerAccount2.mmReferenceAccountIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccount7, Optional<AccountIdentification4Choice>> mmReferenceAccountIdentification = new MMMessageAttribute<CustomerAccount7, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "RefAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccountIdentification";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			previousVersion_lazy = () -> CustomerAccount2.mmReferenceAccountIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(CustomerAccount7 obj) {
			return obj.getReferenceAccountIdentification();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<AccountIdentification4Choice> value) {
			obj.setReferenceAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Prtry")
	protected List<GenericIdentification1> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmProprietaryIdentification
	 * AccountIdentification.mmProprietaryIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary characteristics of the account."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmProprietary
	 * CustomerAccount2.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount7, List<GenericIdentification1>> mmProprietary = new MMMessageAssociationEnd<CustomerAccount7, List<GenericIdentification1>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary characteristics of the account.";
			previousVersion_lazy = () -> CustomerAccount2.mmProprietary;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public List<GenericIdentification1> getValue(CustomerAccount7 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CustomerAccount7 obj, List<GenericIdentification1> value) {
			obj.setProprietary(value);
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected OrganisationIdentification8 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7
	 * CustomerAccount7}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmAccountOwner
	 * CustomerAccount2.mmAccountOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccount7, Optional<OrganisationIdentification8>> mmAccountOwner = new MMMessageAssociationEnd<CustomerAccount7, Optional<OrganisationIdentification8>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount7.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			previousVersion_lazy = () -> CustomerAccount2.mmAccountOwner;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationIdentification8.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification8> getValue(CustomerAccount7 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CustomerAccount7 obj, Optional<OrganisationIdentification8> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount7.mmIdentification, com.tools20022.repository.msg.CustomerAccount7.mmName, com.tools20022.repository.msg.CustomerAccount7.mmStatus,
						com.tools20022.repository.msg.CustomerAccount7.mmType, com.tools20022.repository.msg.CustomerAccount7.mmCurrency, com.tools20022.repository.msg.CustomerAccount7.mmMinimumMonthlyPaymentValue,
						com.tools20022.repository.msg.CustomerAccount7.mmMaximumMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccount7.mmMinimumMonthlyReceivedValue,
						com.tools20022.repository.msg.CustomerAccount7.mmMaximumMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount7.mmMinimumMonthlyTransactionNumber,
						com.tools20022.repository.msg.CustomerAccount7.mmMaximumMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount7.mmMinimumAverageBalance,
						com.tools20022.repository.msg.CustomerAccount7.mmMaximumAverageBalance, com.tools20022.repository.msg.CustomerAccount7.mmAccountPurpose,
						com.tools20022.repository.msg.CustomerAccount7.mmMinimumFloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount7.mmMaximumFloorNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount7.mmMinimumCeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccount7.mmMaximumCeilingNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount7.mmStatementFrequencyAndFormat, com.tools20022.repository.msg.CustomerAccount7.mmRestriction, com.tools20022.repository.msg.CustomerAccount7.mmClosingDate,
						com.tools20022.repository.msg.CustomerAccount7.mmOpeningDate, com.tools20022.repository.msg.CustomerAccount7.mmReferenceAccountIdentification, com.tools20022.repository.msg.CustomerAccount7.mmProprietary,
						com.tools20022.repository.msg.CustomerAccount7.mmAccountOwner);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccount7";
				definition = "Account owned by a customer.";
				previousVersion_lazy = () -> CustomerAccount2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification4Choice> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public CustomerAccount7 setIdentification(AccountIdentification4Choice identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CustomerAccount7 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<AccountStatus3Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CustomerAccount7 setStatus(AccountStatus3Code status) {
		this.status = status;
		return this;
	}

	public Optional<CashAccountType2Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CustomerAccount7 setType(CashAccountType2Choice type) {
		this.type = type;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CustomerAccount7 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumMonthlyPaymentValue() {
		return minimumMonthlyPaymentValue == null ? Optional.empty() : Optional.of(minimumMonthlyPaymentValue);
	}

	public CustomerAccount7 setMinimumMonthlyPaymentValue(ImpliedCurrencyAndAmount minimumMonthlyPaymentValue) {
		this.minimumMonthlyPaymentValue = minimumMonthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumMonthlyPaymentValue() {
		return maximumMonthlyPaymentValue == null ? Optional.empty() : Optional.of(maximumMonthlyPaymentValue);
	}

	public CustomerAccount7 setMaximumMonthlyPaymentValue(ImpliedCurrencyAndAmount maximumMonthlyPaymentValue) {
		this.maximumMonthlyPaymentValue = maximumMonthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumMonthlyReceivedValue() {
		return minimumMonthlyReceivedValue == null ? Optional.empty() : Optional.of(minimumMonthlyReceivedValue);
	}

	public CustomerAccount7 setMinimumMonthlyReceivedValue(ImpliedCurrencyAndAmount minimumMonthlyReceivedValue) {
		this.minimumMonthlyReceivedValue = minimumMonthlyReceivedValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumMonthlyReceivedValue() {
		return maximumMonthlyReceivedValue == null ? Optional.empty() : Optional.of(maximumMonthlyReceivedValue);
	}

	public CustomerAccount7 setMaximumMonthlyReceivedValue(ImpliedCurrencyAndAmount maximumMonthlyReceivedValue) {
		this.maximumMonthlyReceivedValue = maximumMonthlyReceivedValue;
		return this;
	}

	public Optional<Max5NumericText> getMinimumMonthlyTransactionNumber() {
		return minimumMonthlyTransactionNumber == null ? Optional.empty() : Optional.of(minimumMonthlyTransactionNumber);
	}

	public CustomerAccount7 setMinimumMonthlyTransactionNumber(Max5NumericText minimumMonthlyTransactionNumber) {
		this.minimumMonthlyTransactionNumber = minimumMonthlyTransactionNumber;
		return this;
	}

	public Optional<Max5NumericText> getMaximumMonthlyTransactionNumber() {
		return maximumMonthlyTransactionNumber == null ? Optional.empty() : Optional.of(maximumMonthlyTransactionNumber);
	}

	public CustomerAccount7 setMaximumMonthlyTransactionNumber(Max5NumericText maximumMonthlyTransactionNumber) {
		this.maximumMonthlyTransactionNumber = maximumMonthlyTransactionNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumAverageBalance() {
		return minimumAverageBalance == null ? Optional.empty() : Optional.of(minimumAverageBalance);
	}

	public CustomerAccount7 setMinimumAverageBalance(ImpliedCurrencyAndAmount minimumAverageBalance) {
		this.minimumAverageBalance = minimumAverageBalance;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumAverageBalance() {
		return maximumAverageBalance == null ? Optional.empty() : Optional.of(maximumAverageBalance);
	}

	public CustomerAccount7 setMaximumAverageBalance(ImpliedCurrencyAndAmount maximumAverageBalance) {
		this.maximumAverageBalance = maximumAverageBalance;
		return this;
	}

	public Optional<Max140Text> getAccountPurpose() {
		return accountPurpose == null ? Optional.empty() : Optional.of(accountPurpose);
	}

	public CustomerAccount7 setAccountPurpose(Max140Text accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumFloorNotificationAmount() {
		return minimumFloorNotificationAmount == null ? Optional.empty() : Optional.of(minimumFloorNotificationAmount);
	}

	public CustomerAccount7 setMinimumFloorNotificationAmount(ImpliedCurrencyAndAmount minimumFloorNotificationAmount) {
		this.minimumFloorNotificationAmount = minimumFloorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumFloorNotificationAmount() {
		return maximumFloorNotificationAmount == null ? Optional.empty() : Optional.of(maximumFloorNotificationAmount);
	}

	public CustomerAccount7 setMaximumFloorNotificationAmount(ImpliedCurrencyAndAmount maximumFloorNotificationAmount) {
		this.maximumFloorNotificationAmount = maximumFloorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumCeilingNotificationAmount() {
		return minimumCeilingNotificationAmount == null ? Optional.empty() : Optional.of(minimumCeilingNotificationAmount);
	}

	public CustomerAccount7 setMinimumCeilingNotificationAmount(ImpliedCurrencyAndAmount minimumCeilingNotificationAmount) {
		this.minimumCeilingNotificationAmount = minimumCeilingNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumCeilingNotificationAmount() {
		return maximumCeilingNotificationAmount == null ? Optional.empty() : Optional.of(maximumCeilingNotificationAmount);
	}

	public CustomerAccount7 setMaximumCeilingNotificationAmount(ImpliedCurrencyAndAmount maximumCeilingNotificationAmount) {
		this.maximumCeilingNotificationAmount = maximumCeilingNotificationAmount;
		return this;
	}

	public List<StatementFrequencyAndForm1> getStatementFrequencyAndFormat() {
		return statementFrequencyAndFormat == null ? statementFrequencyAndFormat = new ArrayList<>() : statementFrequencyAndFormat;
	}

	public CustomerAccount7 setStatementFrequencyAndFormat(List<StatementFrequencyAndForm1> statementFrequencyAndFormat) {
		this.statementFrequencyAndFormat = Objects.requireNonNull(statementFrequencyAndFormat);
		return this;
	}

	public List<Restriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CustomerAccount7 setRestriction(List<Restriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<DateSearchChoice> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public CustomerAccount7 setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<DateSearchChoice> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public CustomerAccount7 setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<AccountIdentification4Choice> getReferenceAccountIdentification() {
		return referenceAccountIdentification == null ? Optional.empty() : Optional.of(referenceAccountIdentification);
	}

	public CustomerAccount7 setReferenceAccountIdentification(AccountIdentification4Choice referenceAccountIdentification) {
		this.referenceAccountIdentification = referenceAccountIdentification;
		return this;
	}

	public List<GenericIdentification1> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public CustomerAccount7 setProprietary(List<GenericIdentification1> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}

	public Optional<OrganisationIdentification8> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CustomerAccount7 setAccountOwner(OrganisationIdentification8 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}
}