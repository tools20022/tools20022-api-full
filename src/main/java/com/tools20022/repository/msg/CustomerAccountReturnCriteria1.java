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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification42;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Indicates which fields must be present in the response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmIdentification
 * CustomerAccountReturnCriteria1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmName
 * CustomerAccountReturnCriteria1.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmStatus
 * CustomerAccountReturnCriteria1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmType
 * CustomerAccountReturnCriteria1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmCurrency
 * CustomerAccountReturnCriteria1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmMonthlyPaymentValue
 * CustomerAccountReturnCriteria1.mmMonthlyPaymentValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmMonthlyReceivedValue
 * CustomerAccountReturnCriteria1.mmMonthlyReceivedValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmMonthlyTransactionNumber
 * CustomerAccountReturnCriteria1.mmMonthlyTransactionNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmAverageBalance
 * CustomerAccountReturnCriteria1.mmAverageBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmAccountPurpose
 * CustomerAccountReturnCriteria1.mmAccountPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmFloorNotificationAmount
 * CustomerAccountReturnCriteria1.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmCeilingNotificationAmount
 * CustomerAccountReturnCriteria1.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmStatementCycle
 * CustomerAccountReturnCriteria1.mmStatementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmClosingDate
 * CustomerAccountReturnCriteria1.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmRestriction
 * CustomerAccountReturnCriteria1.mmRestriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmOpeningDate
 * CustomerAccountReturnCriteria1.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmAccountOwner
 * CustomerAccountReturnCriteria1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmReferenceAccount
 * CustomerAccountReturnCriteria1.mmReferenceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1#mmProprietary
 * CustomerAccountReturnCriteria1.mmProprietary}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccountReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates which fields must be present in the response."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CustomerAccountReturnCriteria1", propOrder = {"identification", "name", "status", "type", "currency", "monthlyPaymentValue", "monthlyReceivedValue", "monthlyTransactionNumber", "averageBalance", "accountPurpose",
		"floorNotificationAmount", "ceilingNotificationAmount", "statementCycle", "closingDate", "restriction", "openingDate", "accountOwner", "referenceAccount", "proprietary"})
public class CustomerAccountReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected YesNoIndicator identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmIdentification = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected YesNoIndicator name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmName = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected YesNoIndicator status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmStatus = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected YesNoIndicator type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmType = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected YesNoIndicator currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmCurrency = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "MnthlyPmtVal", required = true)
	protected YesNoIndicator monthlyPaymentValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyPmtVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmMonthlyPaymentValue = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getMonthlyPaymentValue();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setMonthlyPaymentValue(value);
		}
	};
	@XmlElement(name = "MnthlyRcvdVal", required = true)
	protected YesNoIndicator monthlyReceivedValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyRcvdVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmMonthlyReceivedValue = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getMonthlyReceivedValue();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setMonthlyReceivedValue(value);
		}
	};
	@XmlElement(name = "MnthlyTxNb", required = true)
	protected YesNoIndicator monthlyTransactionNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnthlyTxNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmMonthlyTransactionNumber = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getMonthlyTransactionNumber();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setMonthlyTransactionNumber(value);
		}
	};
	@XmlElement(name = "AvrgBal", required = true)
	protected YesNoIndicator averageBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgBal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmAverageBalance = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageBalance";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getAverageBalance();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setAverageBalance(value);
		}
	};
	@XmlElement(name = "AcctPurp", required = true)
	protected YesNoIndicator accountPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctPurp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmAccountPurpose = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getAccountPurpose();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setAccountPurpose(value);
		}
	};
	@XmlElement(name = "FlrNtfctnAmt", required = true)
	protected YesNoIndicator floorNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlrNtfctnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmFloorNotificationAmount = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getFloorNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setFloorNotificationAmount(value);
		}
	};
	@XmlElement(name = "ClngNtfctnAmt", required = true)
	protected YesNoIndicator ceilingNotificationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClngNtfctnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmCeilingNotificationAmount = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getCeilingNotificationAmount();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setCeilingNotificationAmount(value);
		}
	};
	@XmlElement(name = "StmtCycl", required = true)
	protected YesNoIndicator statementCycle;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtCycl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmStatementCycle = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StmtCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementCycle";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getStatementCycle();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setStatementCycle(value);
		}
	};
	@XmlElement(name = "ClsgDt", required = true)
	protected YesNoIndicator closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmClosingDate = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getClosingDate();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setClosingDate(value);
		}
	};
	@XmlElement(name = "Rstrctn", required = true)
	protected YesNoIndicator restriction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rstrctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmRestriction = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getRestriction();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setRestriction(value);
		}
	};
	@XmlElement(name = "OpngDt", required = true)
	protected YesNoIndicator openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmOpeningDate = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getOpeningDate();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setOpeningDate(value);
		}
	};
	@XmlElement(name = "AcctOwnr", required = true)
	protected YesNoIndicator accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmAccountOwner = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "RefAcct", required = true)
	protected YesNoIndicator referenceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefAcct"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator> mmReferenceAccount = new MMMessageAttribute<CustomerAccountReturnCriteria1, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RefAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getReferenceAccount();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, YesNoIndicator value) {
			obj.setReferenceAccount(value);
		}
	};
	@XmlElement(name = "Prtry")
	protected List<GenericIdentification42> proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification42
	 * GenericIdentification42}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountReturnCriteria1
	 * CustomerAccountReturnCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CustomerAccountReturnCriteria1, List<GenericIdentification42>> mmProprietary = new MMMessageAssociationEnd<CustomerAccountReturnCriteria1, List<GenericIdentification42>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Indicates if this field must be present in the response.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification42.mmObject();
		}

		@Override
		public List<GenericIdentification42> getValue(CustomerAccountReturnCriteria1 obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CustomerAccountReturnCriteria1 obj, List<GenericIdentification42> value) {
			obj.setProprietary(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmIdentification, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmName,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmStatus, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmType, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmCurrency,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmMonthlyPaymentValue, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmMonthlyReceivedValue,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmMonthlyTransactionNumber, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmAverageBalance,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmAccountPurpose, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmFloorNotificationAmount,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmCeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmStatementCycle,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmClosingDate, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmRestriction,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmOpeningDate, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmAccountOwner,
						com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmReferenceAccount, com.tools20022.repository.msg.CustomerAccountReturnCriteria1.mmProprietary);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccountReturnCriteria1";
				definition = "Indicates which fields must be present in the response.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getIdentification() {
		return identification;
	}

	public CustomerAccountReturnCriteria1 setIdentification(YesNoIndicator identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public YesNoIndicator getName() {
		return name;
	}

	public CustomerAccountReturnCriteria1 setName(YesNoIndicator name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public YesNoIndicator getStatus() {
		return status;
	}

	public CustomerAccountReturnCriteria1 setStatus(YesNoIndicator status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public YesNoIndicator getType() {
		return type;
	}

	public CustomerAccountReturnCriteria1 setType(YesNoIndicator type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YesNoIndicator getCurrency() {
		return currency;
	}

	public CustomerAccountReturnCriteria1 setCurrency(YesNoIndicator currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public YesNoIndicator getMonthlyPaymentValue() {
		return monthlyPaymentValue;
	}

	public CustomerAccountReturnCriteria1 setMonthlyPaymentValue(YesNoIndicator monthlyPaymentValue) {
		this.monthlyPaymentValue = Objects.requireNonNull(monthlyPaymentValue);
		return this;
	}

	public YesNoIndicator getMonthlyReceivedValue() {
		return monthlyReceivedValue;
	}

	public CustomerAccountReturnCriteria1 setMonthlyReceivedValue(YesNoIndicator monthlyReceivedValue) {
		this.monthlyReceivedValue = Objects.requireNonNull(monthlyReceivedValue);
		return this;
	}

	public YesNoIndicator getMonthlyTransactionNumber() {
		return monthlyTransactionNumber;
	}

	public CustomerAccountReturnCriteria1 setMonthlyTransactionNumber(YesNoIndicator monthlyTransactionNumber) {
		this.monthlyTransactionNumber = Objects.requireNonNull(monthlyTransactionNumber);
		return this;
	}

	public YesNoIndicator getAverageBalance() {
		return averageBalance;
	}

	public CustomerAccountReturnCriteria1 setAverageBalance(YesNoIndicator averageBalance) {
		this.averageBalance = Objects.requireNonNull(averageBalance);
		return this;
	}

	public YesNoIndicator getAccountPurpose() {
		return accountPurpose;
	}

	public CustomerAccountReturnCriteria1 setAccountPurpose(YesNoIndicator accountPurpose) {
		this.accountPurpose = Objects.requireNonNull(accountPurpose);
		return this;
	}

	public YesNoIndicator getFloorNotificationAmount() {
		return floorNotificationAmount;
	}

	public CustomerAccountReturnCriteria1 setFloorNotificationAmount(YesNoIndicator floorNotificationAmount) {
		this.floorNotificationAmount = Objects.requireNonNull(floorNotificationAmount);
		return this;
	}

	public YesNoIndicator getCeilingNotificationAmount() {
		return ceilingNotificationAmount;
	}

	public CustomerAccountReturnCriteria1 setCeilingNotificationAmount(YesNoIndicator ceilingNotificationAmount) {
		this.ceilingNotificationAmount = Objects.requireNonNull(ceilingNotificationAmount);
		return this;
	}

	public YesNoIndicator getStatementCycle() {
		return statementCycle;
	}

	public CustomerAccountReturnCriteria1 setStatementCycle(YesNoIndicator statementCycle) {
		this.statementCycle = Objects.requireNonNull(statementCycle);
		return this;
	}

	public YesNoIndicator getClosingDate() {
		return closingDate;
	}

	public CustomerAccountReturnCriteria1 setClosingDate(YesNoIndicator closingDate) {
		this.closingDate = Objects.requireNonNull(closingDate);
		return this;
	}

	public YesNoIndicator getRestriction() {
		return restriction;
	}

	public CustomerAccountReturnCriteria1 setRestriction(YesNoIndicator restriction) {
		this.restriction = Objects.requireNonNull(restriction);
		return this;
	}

	public YesNoIndicator getOpeningDate() {
		return openingDate;
	}

	public CustomerAccountReturnCriteria1 setOpeningDate(YesNoIndicator openingDate) {
		this.openingDate = Objects.requireNonNull(openingDate);
		return this;
	}

	public YesNoIndicator getAccountOwner() {
		return accountOwner;
	}

	public CustomerAccountReturnCriteria1 setAccountOwner(YesNoIndicator accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public YesNoIndicator getReferenceAccount() {
		return referenceAccount;
	}

	public CustomerAccountReturnCriteria1 setReferenceAccount(YesNoIndicator referenceAccount) {
		this.referenceAccount = Objects.requireNonNull(referenceAccount);
		return this;
	}

	public List<GenericIdentification42> getProprietary() {
		return proprietary == null ? proprietary = new ArrayList<>() : proprietary;
	}

	public CustomerAccountReturnCriteria1 setProprietary(List<GenericIdentification42> proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}