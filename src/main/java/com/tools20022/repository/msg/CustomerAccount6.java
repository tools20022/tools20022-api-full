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
import com.tools20022.repository.codeset.AccountStatus3Code;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmIdentification
 * CustomerAccount6.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmName
 * CustomerAccount6.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmStatus
 * CustomerAccount6.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmType
 * CustomerAccount6.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCurrency
 * CustomerAccount6.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyPaymentValue
 * CustomerAccount6.mmMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyReceivedValue
 * CustomerAccount6.mmMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmMonthlyTransactionNumber
 * CustomerAccount6.mmMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAverageBalance
 * CustomerAccount6.mmAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmAccountPurpose
 * CustomerAccount6.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmFloorNotificationAmount
 * CustomerAccount6.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmCeilingNotificationAmount
 * CustomerAccount6.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccount6#mmStatementFrequencyAndFormat
 * CustomerAccount6.mmStatementFrequencyAndFormat}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmClosingDate
 * CustomerAccount6.mmClosingDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmRestriction
 * CustomerAccount6.mmRestriction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount6#mmOpeningDate
 * CustomerAccount6.mmOpeningDate}</li>
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
 * "CustomerAccount6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CustomerAccount3 CustomerAccount3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccount6", propOrder = {"identification", "name", "status", "type", "currency", "monthlyPaymentValue", "monthlyReceivedValue", "monthlyTransactionNumber", "averageBalance", "accountPurpose",
		"floorNotificationAmount", "ceilingNotificationAmount", "statementFrequencyAndFormat", "closingDate", "restriction", "openingDate"})
public class CustomerAccount6 {

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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmIdentification
	 * CustomerAccount3.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			previousVersion_lazy = () -> CustomerAccount3.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmName
	 * CustomerAccount3.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			previousVersion_lazy = () -> CustomerAccount3.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmStatus
	 * CustomerAccount3.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			previousVersion_lazy = () -> CustomerAccount3.mmStatus;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountStatus3Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmType
	 * CustomerAccount3.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			previousVersion_lazy = () -> CustomerAccount3.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccountType2Choice.mmObject();
		}
	};
	@XmlElement(name = "Ccy", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCurrency
	 * CustomerAccount3.mmCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			previousVersion_lazy = () -> CustomerAccount3.mmCurrency;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "MnthlyPmtVal")
	protected ImpliedCurrencyAndAmount monthlyPaymentValue;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyPmtVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the payment amounts (that is, payments going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyPaymentValue
	 * CustomerAccount3.mmMonthlyPaymentValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "MnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Monthly average of the payment amounts (that is, payments going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount3.mmMonthlyPaymentValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MnthlyRcvdVal")
	protected ImpliedCurrencyAndAmount monthlyReceivedValue;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyRcvdVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the received amounts over a year (that is, payments coming in)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyReceivedValue
	 * CustomerAccount3.mmMonthlyReceivedValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "MnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Monthly average of the received amounts over a year (that is, payments coming in).";
			previousVersion_lazy = () -> CustomerAccount3.mmMonthlyReceivedValue;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "MnthlyTxNb")
	protected Max5NumericText monthlyTransactionNumber;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyTxNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monthly average of the number of payments (coming in and going out) over a year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmMonthlyTransactionNumber
	 * CustomerAccount3.mmMonthlyTransactionNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "MnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Monthly average of the number of payments (coming in and going out) over a year.";
			previousVersion_lazy = () -> CustomerAccount3.mmMonthlyTransactionNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
		}
	};
	@XmlElement(name = "AvrgBal")
	protected ImpliedCurrencyAndAmount averageBalance;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sum of the end of day balances over a month divided by the number of business days in the month."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAverageBalance
	 * CustomerAccount3.mmAverageBalance}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "AvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageBalance";
			definition = "Sum of the end of day balances over a month divided by the number of business days in the month.";
			previousVersion_lazy = () -> CustomerAccount3.mmAverageBalance;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmAccountPurpose
	 * CustomerAccount3.mmAccountPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			previousVersion_lazy = () -> CustomerAccount3.mmAccountPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "FlrNtfctnAmt")
	protected ImpliedCurrencyAndAmount floorNotificationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlrNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance under which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmFloorNotificationAmount
	 * CustomerAccount3.mmFloorNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "FlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the value of the balance under which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount3.mmFloorNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ClngNtfctnAmt")
	protected ImpliedCurrencyAndAmount ceilingNotificationAmount;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClngNtfctnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the value of the balance above which a notification will be sent to the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmCeilingNotificationAmount
	 * CustomerAccount3.mmCeilingNotificationAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "ClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the value of the balance above which a notification will be sent to the account owner.";
			previousVersion_lazy = () -> CustomerAccount3.mmCeilingNotificationAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "StmtFrqcyAndFrmt")
	protected List<com.tools20022.repository.msg.StatementFrequencyAndForm1> statementFrequencyAndFormat;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	public static final MMMessageAttribute mmStatementFrequencyAndFormat = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcyAndFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequencyAndFormat";
			definition = "Specifies how often statements (for audit purposes) will be sent, in which format, to which address.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.StatementFrequencyAndForm1.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected ISODate closingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmClosingDate
	 * CustomerAccount3.mmClosingDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			previousVersion_lazy = () -> CustomerAccount3.mmClosingDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "Rstrctn")
	protected List<com.tools20022.repository.msg.Restriction1> restriction;
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmRestriction
	 * CustomerAccount3.mmRestriction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			previousVersion_lazy = () -> CustomerAccount3.mmRestriction;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Restriction1.mmObject();
		}
	};
	@XmlElement(name = "OpngDt")
	protected ISODate openingDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
	 * Account.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount6
	 * CustomerAccount6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#mmOpeningDate
	 * CustomerAccount3.mmOpeningDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount6.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date when the account was opened.";
			previousVersion_lazy = () -> CustomerAccount3.mmOpeningDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount6.mmIdentification, com.tools20022.repository.msg.CustomerAccount6.mmName, com.tools20022.repository.msg.CustomerAccount6.mmStatus,
						com.tools20022.repository.msg.CustomerAccount6.mmType, com.tools20022.repository.msg.CustomerAccount6.mmCurrency, com.tools20022.repository.msg.CustomerAccount6.mmMonthlyPaymentValue,
						com.tools20022.repository.msg.CustomerAccount6.mmMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount6.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount6.mmAverageBalance,
						com.tools20022.repository.msg.CustomerAccount6.mmAccountPurpose, com.tools20022.repository.msg.CustomerAccount6.mmFloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount6.mmCeilingNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount6.mmStatementFrequencyAndFormat, com.tools20022.repository.msg.CustomerAccount6.mmClosingDate, com.tools20022.repository.msg.CustomerAccount6.mmRestriction,
						com.tools20022.repository.msg.CustomerAccount6.mmOpeningDate);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccount6";
				definition = "Account owned by a customer.";
				previousVersion_lazy = () -> CustomerAccount3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification4Choice> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public CustomerAccount6 setIdentification(AccountIdentification4Choice identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CustomerAccount6 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<AccountStatus3Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CustomerAccount6 setStatus(AccountStatus3Code status) {
		this.status = status;
		return this;
	}

	public Optional<CashAccountType2Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CustomerAccount6 setType(CashAccountType2Choice type) {
		this.type = type;
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public CustomerAccount6 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMonthlyPaymentValue() {
		return monthlyPaymentValue == null ? Optional.empty() : Optional.of(monthlyPaymentValue);
	}

	public CustomerAccount6 setMonthlyPaymentValue(ImpliedCurrencyAndAmount monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMonthlyReceivedValue() {
		return monthlyReceivedValue == null ? Optional.empty() : Optional.of(monthlyReceivedValue);
	}

	public CustomerAccount6 setMonthlyReceivedValue(ImpliedCurrencyAndAmount monthlyReceivedValue) {
		this.monthlyReceivedValue = monthlyReceivedValue;
		return this;
	}

	public Optional<Max5NumericText> getMonthlyTransactionNumber() {
		return monthlyTransactionNumber == null ? Optional.empty() : Optional.of(monthlyTransactionNumber);
	}

	public CustomerAccount6 setMonthlyTransactionNumber(Max5NumericText monthlyTransactionNumber) {
		this.monthlyTransactionNumber = monthlyTransactionNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getAverageBalance() {
		return averageBalance == null ? Optional.empty() : Optional.of(averageBalance);
	}

	public CustomerAccount6 setAverageBalance(ImpliedCurrencyAndAmount averageBalance) {
		this.averageBalance = averageBalance;
		return this;
	}

	public Optional<Max140Text> getAccountPurpose() {
		return accountPurpose == null ? Optional.empty() : Optional.of(accountPurpose);
	}

	public CustomerAccount6 setAccountPurpose(Max140Text accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getFloorNotificationAmount() {
		return floorNotificationAmount == null ? Optional.empty() : Optional.of(floorNotificationAmount);
	}

	public CustomerAccount6 setFloorNotificationAmount(ImpliedCurrencyAndAmount floorNotificationAmount) {
		this.floorNotificationAmount = floorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getCeilingNotificationAmount() {
		return ceilingNotificationAmount == null ? Optional.empty() : Optional.of(ceilingNotificationAmount);
	}

	public CustomerAccount6 setCeilingNotificationAmount(ImpliedCurrencyAndAmount ceilingNotificationAmount) {
		this.ceilingNotificationAmount = ceilingNotificationAmount;
		return this;
	}

	public List<StatementFrequencyAndForm1> getStatementFrequencyAndFormat() {
		return statementFrequencyAndFormat == null ? statementFrequencyAndFormat = new ArrayList<>() : statementFrequencyAndFormat;
	}

	public CustomerAccount6 setStatementFrequencyAndFormat(List<com.tools20022.repository.msg.StatementFrequencyAndForm1> statementFrequencyAndFormat) {
		this.statementFrequencyAndFormat = Objects.requireNonNull(statementFrequencyAndFormat);
		return this;
	}

	public Optional<ISODate> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public CustomerAccount6 setClosingDate(ISODate closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public List<Restriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CustomerAccount6 setRestriction(List<com.tools20022.repository.msg.Restriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<ISODate> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public CustomerAccount6 setOpeningDate(ISODate openingDate) {
		this.openingDate = openingDate;
		return this;
	}
}