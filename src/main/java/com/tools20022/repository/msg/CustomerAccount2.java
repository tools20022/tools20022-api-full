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
import com.tools20022.repository.choice.DateSearchChoice;
import com.tools20022.repository.codeset.AccountStatus3Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.Frequency3Code;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max5NumericText;
import com.tools20022.repository.datatype.Max70Text;
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
 * Account owned by a customer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmIdentification
 * CustomerAccount2.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmName
 * CustomerAccount2.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmStatus
 * CustomerAccount2.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmType
 * CustomerAccount2.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmCurrency
 * CustomerAccount2.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyPaymentValue
 * CustomerAccount2.mmMinimumMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyPaymentValue
 * CustomerAccount2.mmMaximumMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyReceivedValue
 * CustomerAccount2.mmMinimumMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyReceivedValue
 * CustomerAccount2.mmMaximumMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumMonthlyTransactionNumber
 * CustomerAccount2.mmMinimumMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumMonthlyTransactionNumber
 * CustomerAccount2.mmMaximumMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumAverageBalance
 * CustomerAccount2.mmMinimumAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumAverageBalance
 * CustomerAccount2.mmMaximumAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmAccountPurpose
 * CustomerAccount2.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumFloorNotificationAmount
 * CustomerAccount2.mmMinimumFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumFloorNotificationAmount
 * CustomerAccount2.mmMaximumFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMinimumCeilingNotificationAmount
 * CustomerAccount2.mmMinimumCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmMaximumCeilingNotificationAmount
 * CustomerAccount2.mmMaximumCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmStatementCycle
 * CustomerAccount2.mmStatementCycle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmRestriction
 * CustomerAccount2.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmClosingDate
 * CustomerAccount2.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmOpeningDate
 * CustomerAccount2.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmReferenceAccountIdentification
 * CustomerAccount2.mmReferenceAccountIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount2#mmProprietary
 * CustomerAccount2.mmProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#mmAccountOwner
 * CustomerAccount2.mmAccountOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustomerAccount2", propOrder = {"identification", "name", "status", "type", "currency", "minimumMonthlyPaymentValue", "maximumMonthlyPaymentValue", "minimumMonthlyReceivedValue", "maximumMonthlyReceivedValue",
		"minimumMonthlyTransactionNumber", "maximumMonthlyTransactionNumber", "minimumAverageBalance", "maximumAverageBalance", "accountPurpose", "minimumFloorNotificationAmount", "maximumFloorNotificationAmount",
		"minimumCeilingNotificationAmount", "maximumCeilingNotificationAmount", "statementCycle", "restriction", "closingDate", "openingDate", "referenceAccountIdentification", "proprietary", "accountOwner"})
public class CustomerAccount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountIdentification4Choice identification;
	/**
	 * Identification of the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected Max70Text name;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected AccountStatus3Code status;
	/**
	 * Specifies the current state of an account, eg, enabled or deleted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountStatus3Code.mmObject();
		}
	};
	protected CashAccountType2 type;
	/**
	 * Type of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CashAccountType2
	 * CashAccountType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CashAccountType2.mmObject();
		}
	};
	protected ActiveCurrencyCode currency;
	/**
	 * Medium of exchange of value.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumMonthlyPaymentValue;
	/**
	 * Minimum monthly average of the payment amounts (that is, payments going
	 * out) over a year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyPaymentValue";
			definition = "Minimum monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumMonthlyPaymentValue;
	/**
	 * Maximum monthly average of the payment amounts (that is, payments going
	 * out) over a year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyPaymentValue";
			definition = "Maximum monthly average of the payment amounts (that is, payments going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumMonthlyReceivedValue;
	/**
	 * Minimum monthly average of the received amounts over a year (that is,
	 * payments coming in).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyReceivedValue";
			definition = "Minimum monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumMonthlyReceivedValue;
	/**
	 * Maximum monthly average of the received amounts over a year (that is,
	 * payments coming in).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyReceivedValue";
			definition = "Maximum monthly average of the received amounts over a year (that is, payments coming in).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Max5NumericText minimumMonthlyTransactionNumber;
	/**
	 * Minimum monthly average of the number of payments (coming in and going
	 * out) over a year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyTransactionNumber";
			definition = "Minimum monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	protected Max5NumericText maximumMonthlyTransactionNumber;
	/**
	 * Maximum monthly average of the number of payments (coming in and going
	 * out) over a year.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyTransactionNumber";
			definition = "Maximum monthly average of the number of payments (coming in and going out) over a year.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumAverageBalance;
	/**
	 * Minimum average balance, that is, sum of the end of day balances over a
	 * month divided by the number of business days in the month.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAverageBalance";
			definition = "Minimum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumAverageBalance;
	/**
	 * Maximum average balance, that is, sum of the end of day balances over a
	 * month divided by the number of business days in the month.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAverageBalance";
			definition = "Maximum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Max140Text accountPurpose;
	/**
	 * Specifies the purpose of the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumFloorNotificationAmount;
	/**
	 * Minimum floor notification amount, that is, the value of the balance
	 * under which a notification will be sent to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumFloorNotificationAmount";
			definition = "Minimum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumFloorNotificationAmount;
	/**
	 * Maximum floor notification amount, that is, the value of the balance
	 * under which a notification will be sent to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumFloorNotificationAmount";
			definition = "Maximum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount minimumCeilingNotificationAmount;
	/**
	 * Minimum ceiling notification amount, that is, the value of the balance
	 * above which a notification will be sent to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCeilingNotificationAmount";
			definition = "Minimum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount maximumCeilingNotificationAmount;
	/**
	 * Maximum ceiling notification amount, that is, the value of the balance
	 * above which a notification will be sent to the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCeilingNotificationAmount";
			definition = "Maximum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected Frequency3Code statementCycle;
	/**
	 * Specifies how often statements (for audit purposes) will be sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency3Code
	 * Frequency3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtCycl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how often statements (for audit purposes)  will be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "StmtCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementCycle";
			definition = "Specifies how often statements (for audit purposes)  will be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Restriction1> restriction;
	/**
	 * Restriction on capability or operations allowed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Restriction1.mmObject();
		}
	};
	protected DateSearchChoice closingDate;
	/**
	 * Date when the account will be or was closed.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected DateSearchChoice openingDate;
	/**
	 * Date when the account was opened.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date when the account was opened.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
		}
	};
	protected AccountIdentification4Choice referenceAccountIdentification;
	/**
	 * Unique and unambiguous identification of the account used as a reference
	 * for the opening of another account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "RefAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccountIdentification";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification1> proprietary;
	/**
	 * Proprietary characteristics of the account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary characteristics of the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification1.mmObject();
		}
	};
	protected OrganisationIdentification6 accountOwner;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6
	 * OrganisationIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2
	 * CustomerAccount2}</li>
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
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CustomerAccount2.mmIdentification, CustomerAccount2.mmName, CustomerAccount2.mmStatus, CustomerAccount2.mmType, CustomerAccount2.mmCurrency,
						CustomerAccount2.mmMinimumMonthlyPaymentValue, CustomerAccount2.mmMaximumMonthlyPaymentValue, CustomerAccount2.mmMinimumMonthlyReceivedValue, CustomerAccount2.mmMaximumMonthlyReceivedValue,
						CustomerAccount2.mmMinimumMonthlyTransactionNumber, CustomerAccount2.mmMaximumMonthlyTransactionNumber, CustomerAccount2.mmMinimumAverageBalance, CustomerAccount2.mmMaximumAverageBalance,
						CustomerAccount2.mmAccountPurpose, CustomerAccount2.mmMinimumFloorNotificationAmount, CustomerAccount2.mmMaximumFloorNotificationAmount, CustomerAccount2.mmMinimumCeilingNotificationAmount,
						CustomerAccount2.mmMaximumCeilingNotificationAmount, CustomerAccount2.mmStatementCycle, CustomerAccount2.mmRestriction, CustomerAccount2.mmClosingDate, CustomerAccount2.mmOpeningDate,
						CustomerAccount2.mmReferenceAccountIdentification, CustomerAccount2.mmProprietary, CustomerAccount2.mmAccountOwner);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccount2";
				definition = "Account owned by a customer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id")
	public AccountIdentification4Choice getIdentification() {
		return identification;
	}

	public void setIdentification(AccountIdentification4Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Nm")
	public Max70Text getName() {
		return name;
	}

	public void setName(Max70Text name) {
		this.name = name;
	}

	@XmlElement(name = "Sts")
	public AccountStatus3Code getStatus() {
		return status;
	}

	public void setStatus(AccountStatus3Code status) {
		this.status = status;
	}

	@XmlElement(name = "Tp")
	public CashAccountType2 getType() {
		return type;
	}

	public void setType(com.tools20022.repository.msg.CashAccountType2 type) {
		this.type = type;
	}

	@XmlElement(name = "Ccy")
	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "MinMnthlyPmtVal")
	public ImpliedCurrencyAndAmount getMinimumMonthlyPaymentValue() {
		return minimumMonthlyPaymentValue;
	}

	public void setMinimumMonthlyPaymentValue(ImpliedCurrencyAndAmount minimumMonthlyPaymentValue) {
		this.minimumMonthlyPaymentValue = minimumMonthlyPaymentValue;
	}

	@XmlElement(name = "MaxMnthlyPmtVal")
	public ImpliedCurrencyAndAmount getMaximumMonthlyPaymentValue() {
		return maximumMonthlyPaymentValue;
	}

	public void setMaximumMonthlyPaymentValue(ImpliedCurrencyAndAmount maximumMonthlyPaymentValue) {
		this.maximumMonthlyPaymentValue = maximumMonthlyPaymentValue;
	}

	@XmlElement(name = "MinMnthlyRcvdVal")
	public ImpliedCurrencyAndAmount getMinimumMonthlyReceivedValue() {
		return minimumMonthlyReceivedValue;
	}

	public void setMinimumMonthlyReceivedValue(ImpliedCurrencyAndAmount minimumMonthlyReceivedValue) {
		this.minimumMonthlyReceivedValue = minimumMonthlyReceivedValue;
	}

	@XmlElement(name = "MaxMnthlyRcvdVal")
	public ImpliedCurrencyAndAmount getMaximumMonthlyReceivedValue() {
		return maximumMonthlyReceivedValue;
	}

	public void setMaximumMonthlyReceivedValue(ImpliedCurrencyAndAmount maximumMonthlyReceivedValue) {
		this.maximumMonthlyReceivedValue = maximumMonthlyReceivedValue;
	}

	@XmlElement(name = "MinMnthlyTxNb")
	public Max5NumericText getMinimumMonthlyTransactionNumber() {
		return minimumMonthlyTransactionNumber;
	}

	public void setMinimumMonthlyTransactionNumber(Max5NumericText minimumMonthlyTransactionNumber) {
		this.minimumMonthlyTransactionNumber = minimumMonthlyTransactionNumber;
	}

	@XmlElement(name = "MaxMnthlyTxNb")
	public Max5NumericText getMaximumMonthlyTransactionNumber() {
		return maximumMonthlyTransactionNumber;
	}

	public void setMaximumMonthlyTransactionNumber(Max5NumericText maximumMonthlyTransactionNumber) {
		this.maximumMonthlyTransactionNumber = maximumMonthlyTransactionNumber;
	}

	@XmlElement(name = "MinAvrgBal")
	public ImpliedCurrencyAndAmount getMinimumAverageBalance() {
		return minimumAverageBalance;
	}

	public void setMinimumAverageBalance(ImpliedCurrencyAndAmount minimumAverageBalance) {
		this.minimumAverageBalance = minimumAverageBalance;
	}

	@XmlElement(name = "MaxAvrgBal")
	public ImpliedCurrencyAndAmount getMaximumAverageBalance() {
		return maximumAverageBalance;
	}

	public void setMaximumAverageBalance(ImpliedCurrencyAndAmount maximumAverageBalance) {
		this.maximumAverageBalance = maximumAverageBalance;
	}

	@XmlElement(name = "AcctPurp")
	public Max140Text getAccountPurpose() {
		return accountPurpose;
	}

	public void setAccountPurpose(Max140Text accountPurpose) {
		this.accountPurpose = accountPurpose;
	}

	@XmlElement(name = "MinFlrNtfctnAmt")
	public ImpliedCurrencyAndAmount getMinimumFloorNotificationAmount() {
		return minimumFloorNotificationAmount;
	}

	public void setMinimumFloorNotificationAmount(ImpliedCurrencyAndAmount minimumFloorNotificationAmount) {
		this.minimumFloorNotificationAmount = minimumFloorNotificationAmount;
	}

	@XmlElement(name = "MaxFlrNtfctnAmt")
	public ImpliedCurrencyAndAmount getMaximumFloorNotificationAmount() {
		return maximumFloorNotificationAmount;
	}

	public void setMaximumFloorNotificationAmount(ImpliedCurrencyAndAmount maximumFloorNotificationAmount) {
		this.maximumFloorNotificationAmount = maximumFloorNotificationAmount;
	}

	@XmlElement(name = "MinClngNtfctnAmt")
	public ImpliedCurrencyAndAmount getMinimumCeilingNotificationAmount() {
		return minimumCeilingNotificationAmount;
	}

	public void setMinimumCeilingNotificationAmount(ImpliedCurrencyAndAmount minimumCeilingNotificationAmount) {
		this.minimumCeilingNotificationAmount = minimumCeilingNotificationAmount;
	}

	@XmlElement(name = "MaxClngNtfctnAmt")
	public ImpliedCurrencyAndAmount getMaximumCeilingNotificationAmount() {
		return maximumCeilingNotificationAmount;
	}

	public void setMaximumCeilingNotificationAmount(ImpliedCurrencyAndAmount maximumCeilingNotificationAmount) {
		this.maximumCeilingNotificationAmount = maximumCeilingNotificationAmount;
	}

	@XmlElement(name = "StmtCycl")
	public Frequency3Code getStatementCycle() {
		return statementCycle;
	}

	public void setStatementCycle(Frequency3Code statementCycle) {
		this.statementCycle = statementCycle;
	}

	@XmlElement(name = "Rstrctn")
	public List<Restriction1> getRestriction() {
		return restriction;
	}

	public void setRestriction(List<com.tools20022.repository.msg.Restriction1> restriction) {
		this.restriction = restriction;
	}

	@XmlElement(name = "ClsgDt")
	public DateSearchChoice getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "OpngDt")
	public DateSearchChoice getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "RefAcctId")
	public AccountIdentification4Choice getReferenceAccountIdentification() {
		return referenceAccountIdentification;
	}

	public void setReferenceAccountIdentification(AccountIdentification4Choice referenceAccountIdentification) {
		this.referenceAccountIdentification = referenceAccountIdentification;
	}

	@XmlElement(name = "Prtry")
	public List<GenericIdentification1> getProprietary() {
		return proprietary;
	}

	public void setProprietary(List<com.tools20022.repository.msg.GenericIdentification1> proprietary) {
		this.proprietary = proprietary;
	}

	@XmlElement(name = "AcctOwnr")
	public OrganisationIdentification6 getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(com.tools20022.repository.msg.OrganisationIdentification6 accountOwner) {
		this.accountOwner = accountOwner;
	}
}