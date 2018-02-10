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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account owned by a customer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7
 * CustomerAccount7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccount2", propOrder = {"identification", "name", "status", "type", "currency", "minimumMonthlyPaymentValue", "maximumMonthlyPaymentValue", "minimumMonthlyReceivedValue", "maximumMonthlyReceivedValue",
		"minimumMonthlyTransactionNumber", "maximumMonthlyTransactionNumber", "minimumAverageBalance", "maximumAverageBalance", "accountPurpose", "minimumFloorNotificationAmount", "maximumFloorNotificationAmount",
		"minimumCeilingNotificationAmount", "maximumCeilingNotificationAmount", "statementCycle", "restriction", "closingDate", "openingDate", "referenceAccountIdentification", "proprietary", "accountOwner"})
public class CustomerAccount2 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmIdentification
	 * CustomerAccount7.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmIdentification);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmName
	 * CustomerAccount7.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmName);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmStatus
	 * CustomerAccount7.mmStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Specifies the current state of an account, eg, enabled or deleted.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountStatus3Code.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected CashAccountType2 type;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount7#mmType
	 * CustomerAccount7.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CashAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CashAccountType2.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmCurrency
	 * CustomerAccount7.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmBaseCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Medium of exchange of value.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyPaymentValue
	 * CustomerAccount7.mmMinimumMonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyPaymentValue";
			definition = "Minimum monthly average of the payment amounts (that is, payments going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumMonthlyPaymentValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyPaymentValue
	 * CustomerAccount7.mmMaximumMonthlyPaymentValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyPaymentValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyPaymentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyPaymentValue";
			definition = "Maximum monthly average of the payment amounts (that is, payments going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumMonthlyPaymentValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyReceivedValue
	 * CustomerAccount7.mmMinimumMonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyReceivedValue";
			definition = "Minimum monthly average of the received amounts over a year (that is, payments coming in).";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumMonthlyReceivedValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyReceivedValue
	 * CustomerAccount7.mmMaximumMonthlyReceivedValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyReceivedValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyReceivedValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyReceivedValue";
			definition = "Maximum monthly average of the received amounts over a year (that is, payments coming in).";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumMonthlyReceivedValue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumMonthlyTransactionNumber
	 * CustomerAccount7.mmMinimumMonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumMonthlyTransactionNumber";
			definition = "Minimum monthly average of the number of payments (coming in and going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumMonthlyTransactionNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumMonthlyTransactionNumber
	 * CustomerAccount7.mmMaximumMonthlyTransactionNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmMonthlyTransactionNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxMnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumMonthlyTransactionNumber";
			definition = "Maximum monthly average of the number of payments (coming in and going out) over a year.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumMonthlyTransactionNumber);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5NumericText.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumAverageBalance
	 * CustomerAccount7.mmMinimumAverageBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumAverageBalance";
			definition = "Minimum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumAverageBalance);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumAverageBalance
	 * CustomerAccount7.mmMaximumAverageBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAverageBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountReportedMovement.mmAverageBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxAvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAverageBalance";
			definition = "Maximum average balance, that is, sum of the end of day balances over a month divided by the number of business days in the month.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumAverageBalance);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmAccountPurpose
	 * CustomerAccount7.mmAccountPurpose}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountPurpose = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Specifies the purpose of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmAccountPurpose);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumFloorNotificationAmount
	 * CustomerAccount7.mmMinimumFloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumFloorNotificationAmount";
			definition = "Minimum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumFloorNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumFloorNotificationAmount
	 * CustomerAccount7.mmMaximumFloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumFloorNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmFloorNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxFlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumFloorNotificationAmount";
			definition = "Maximum floor notification amount, that is, the value of the balance under which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumFloorNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMinimumCeilingNotificationAmount
	 * CustomerAccount7.mmMinimumCeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMinimumCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MinClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumCeilingNotificationAmount";
			definition = "Minimum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMinimumCeilingNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmMaximumCeilingNotificationAmount
	 * CustomerAccount7.mmMaximumCeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumCeilingNotificationAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmCeilingNotificationAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "MaxClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCeilingNotificationAmount";
			definition = "Maximum ceiling notification amount, that is, the value of the balance above which a notification will be sent to the account owner.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmMaximumCeilingNotificationAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "StmtCycl")
	protected Frequency3Code statementCycle;
	/**
	 * 
	 <p>
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
	 * "Specifies how often statements (for audit purposes) will be sent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementCycle = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "StmtCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementCycle";
			definition = "Specifies how often statements (for audit purposes) will be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency3Code.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmRestriction
	 * CustomerAccount7.mmRestriction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRestriction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmAccountRestriction;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Restriction on capability or operations allowed.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmRestriction);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Restriction1.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmClosingDate
	 * CustomerAccount7.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Date when the account will be or was closed.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmOpeningDate
	 * CustomerAccount7.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Date when the account was opened.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateSearchChoice.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmReferenceAccountIdentification
	 * CustomerAccount7.mmReferenceAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "RefAcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccountIdentification";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmReferenceAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification4Choice.mmObject();
		}
	};
	@XmlElement(name = "Prtry")
	protected List<com.tools20022.repository.msg.GenericIdentification1> proprietary;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmProprietary
	 * CustomerAccount7.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmProprietaryIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary characteristics of the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmProprietary);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification1.mmObject();
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected OrganisationIdentification6 accountOwner;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount7#mmAccountOwner
	 * CustomerAccount7.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountOwner = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccount2.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmAccountOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OrganisationIdentification6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount2.mmIdentification, com.tools20022.repository.msg.CustomerAccount2.mmName, com.tools20022.repository.msg.CustomerAccount2.mmStatus,
						com.tools20022.repository.msg.CustomerAccount2.mmType, com.tools20022.repository.msg.CustomerAccount2.mmCurrency, com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyPaymentValue,
						com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyReceivedValue,
						com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyReceivedValue, com.tools20022.repository.msg.CustomerAccount2.mmMinimumMonthlyTransactionNumber,
						com.tools20022.repository.msg.CustomerAccount2.mmMaximumMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccount2.mmMinimumAverageBalance,
						com.tools20022.repository.msg.CustomerAccount2.mmMaximumAverageBalance, com.tools20022.repository.msg.CustomerAccount2.mmAccountPurpose,
						com.tools20022.repository.msg.CustomerAccount2.mmMinimumFloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount2.mmMaximumFloorNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount2.mmMinimumCeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccount2.mmMaximumCeilingNotificationAmount,
						com.tools20022.repository.msg.CustomerAccount2.mmStatementCycle, com.tools20022.repository.msg.CustomerAccount2.mmRestriction, com.tools20022.repository.msg.CustomerAccount2.mmClosingDate,
						com.tools20022.repository.msg.CustomerAccount2.mmOpeningDate, com.tools20022.repository.msg.CustomerAccount2.mmReferenceAccountIdentification, com.tools20022.repository.msg.CustomerAccount2.mmProprietary,
						com.tools20022.repository.msg.CustomerAccount2.mmAccountOwner);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccount2";
				definition = "Account owned by a customer.";
				nextVersions_lazy = () -> Arrays.asList(CustomerAccount7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification4Choice> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public CustomerAccount2 setIdentification(AccountIdentification4Choice identification) {
		this.identification = identification;
		return this;
	}

	public Optional<Max70Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public CustomerAccount2 setName(Max70Text name) {
		this.name = name;
		return this;
	}

	public Optional<AccountStatus3Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public CustomerAccount2 setStatus(AccountStatus3Code status) {
		this.status = status;
		return this;
	}

	public Optional<CashAccountType2> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public CustomerAccount2 setType(com.tools20022.repository.msg.CashAccountType2 type) {
		this.type = type;
		return this;
	}

	public Optional<ActiveCurrencyCode> getCurrency() {
		return currency == null ? Optional.empty() : Optional.of(currency);
	}

	public CustomerAccount2 setCurrency(ActiveCurrencyCode currency) {
		this.currency = currency;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumMonthlyPaymentValue() {
		return minimumMonthlyPaymentValue == null ? Optional.empty() : Optional.of(minimumMonthlyPaymentValue);
	}

	public CustomerAccount2 setMinimumMonthlyPaymentValue(ImpliedCurrencyAndAmount minimumMonthlyPaymentValue) {
		this.minimumMonthlyPaymentValue = minimumMonthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumMonthlyPaymentValue() {
		return maximumMonthlyPaymentValue == null ? Optional.empty() : Optional.of(maximumMonthlyPaymentValue);
	}

	public CustomerAccount2 setMaximumMonthlyPaymentValue(ImpliedCurrencyAndAmount maximumMonthlyPaymentValue) {
		this.maximumMonthlyPaymentValue = maximumMonthlyPaymentValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumMonthlyReceivedValue() {
		return minimumMonthlyReceivedValue == null ? Optional.empty() : Optional.of(minimumMonthlyReceivedValue);
	}

	public CustomerAccount2 setMinimumMonthlyReceivedValue(ImpliedCurrencyAndAmount minimumMonthlyReceivedValue) {
		this.minimumMonthlyReceivedValue = minimumMonthlyReceivedValue;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumMonthlyReceivedValue() {
		return maximumMonthlyReceivedValue == null ? Optional.empty() : Optional.of(maximumMonthlyReceivedValue);
	}

	public CustomerAccount2 setMaximumMonthlyReceivedValue(ImpliedCurrencyAndAmount maximumMonthlyReceivedValue) {
		this.maximumMonthlyReceivedValue = maximumMonthlyReceivedValue;
		return this;
	}

	public Optional<Max5NumericText> getMinimumMonthlyTransactionNumber() {
		return minimumMonthlyTransactionNumber == null ? Optional.empty() : Optional.of(minimumMonthlyTransactionNumber);
	}

	public CustomerAccount2 setMinimumMonthlyTransactionNumber(Max5NumericText minimumMonthlyTransactionNumber) {
		this.minimumMonthlyTransactionNumber = minimumMonthlyTransactionNumber;
		return this;
	}

	public Optional<Max5NumericText> getMaximumMonthlyTransactionNumber() {
		return maximumMonthlyTransactionNumber == null ? Optional.empty() : Optional.of(maximumMonthlyTransactionNumber);
	}

	public CustomerAccount2 setMaximumMonthlyTransactionNumber(Max5NumericText maximumMonthlyTransactionNumber) {
		this.maximumMonthlyTransactionNumber = maximumMonthlyTransactionNumber;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumAverageBalance() {
		return minimumAverageBalance == null ? Optional.empty() : Optional.of(minimumAverageBalance);
	}

	public CustomerAccount2 setMinimumAverageBalance(ImpliedCurrencyAndAmount minimumAverageBalance) {
		this.minimumAverageBalance = minimumAverageBalance;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumAverageBalance() {
		return maximumAverageBalance == null ? Optional.empty() : Optional.of(maximumAverageBalance);
	}

	public CustomerAccount2 setMaximumAverageBalance(ImpliedCurrencyAndAmount maximumAverageBalance) {
		this.maximumAverageBalance = maximumAverageBalance;
		return this;
	}

	public Optional<Max140Text> getAccountPurpose() {
		return accountPurpose == null ? Optional.empty() : Optional.of(accountPurpose);
	}

	public CustomerAccount2 setAccountPurpose(Max140Text accountPurpose) {
		this.accountPurpose = accountPurpose;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumFloorNotificationAmount() {
		return minimumFloorNotificationAmount == null ? Optional.empty() : Optional.of(minimumFloorNotificationAmount);
	}

	public CustomerAccount2 setMinimumFloorNotificationAmount(ImpliedCurrencyAndAmount minimumFloorNotificationAmount) {
		this.minimumFloorNotificationAmount = minimumFloorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumFloorNotificationAmount() {
		return maximumFloorNotificationAmount == null ? Optional.empty() : Optional.of(maximumFloorNotificationAmount);
	}

	public CustomerAccount2 setMaximumFloorNotificationAmount(ImpliedCurrencyAndAmount maximumFloorNotificationAmount) {
		this.maximumFloorNotificationAmount = maximumFloorNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMinimumCeilingNotificationAmount() {
		return minimumCeilingNotificationAmount == null ? Optional.empty() : Optional.of(minimumCeilingNotificationAmount);
	}

	public CustomerAccount2 setMinimumCeilingNotificationAmount(ImpliedCurrencyAndAmount minimumCeilingNotificationAmount) {
		this.minimumCeilingNotificationAmount = minimumCeilingNotificationAmount;
		return this;
	}

	public Optional<ImpliedCurrencyAndAmount> getMaximumCeilingNotificationAmount() {
		return maximumCeilingNotificationAmount == null ? Optional.empty() : Optional.of(maximumCeilingNotificationAmount);
	}

	public CustomerAccount2 setMaximumCeilingNotificationAmount(ImpliedCurrencyAndAmount maximumCeilingNotificationAmount) {
		this.maximumCeilingNotificationAmount = maximumCeilingNotificationAmount;
		return this;
	}

	public Optional<Frequency3Code> getStatementCycle() {
		return statementCycle == null ? Optional.empty() : Optional.of(statementCycle);
	}

	public CustomerAccount2 setStatementCycle(Frequency3Code statementCycle) {
		this.statementCycle = statementCycle;
		return this;
	}

	public List<Restriction1> getRestriction() {
		return restriction == null ? restriction = new ArrayList<>() : restriction;
	}

	public CustomerAccount2 setRestriction(List<com.tools20022.repository.msg.Restriction1> restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public Optional<DateSearchChoice> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public CustomerAccount2 setClosingDate(DateSearchChoice closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<DateSearchChoice> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public CustomerAccount2 setOpeningDate(DateSearchChoice openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<AccountIdentification4Choice> getReferenceAccountIdentification() {
		return referenceAccountIdentification == null ? Optional.empty() : Optional.of(referenceAccountIdentification);
	}

	public CustomerAccount2 setReferenceAccountIdentification(AccountIdentification4Choice referenceAccountIdentification) {
		this.referenceAccountIdentification = referenceAccountIdentification;
		return this;
	}

	public List<GenericIdentification1> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public CustomerAccount2 setProprietary(List<com.tools20022.repository.msg.GenericIdentification1> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}

	public Optional<OrganisationIdentification6> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public CustomerAccount2 setAccountOwner(com.tools20022.repository.msg.OrganisationIdentification6 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}
}