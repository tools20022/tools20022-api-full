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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerAccountReturnCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates which fields must be present in the response."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CustomerAccountReturnCriteria1", propOrder = {"identification", "name", "status", "type", "currency", "monthlyPaymentValue", "monthlyReceivedValue", "monthlyTransactionNumber", "averageBalance", "accountPurpose",
		"floorNotificationAmount", "ceilingNotificationAmount", "statementCycle", "closingDate", "restriction", "openingDate", "accountOwner", "referenceAccount", "proprietary"})
public class CustomerAccountReturnCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected YesNoIndicator identification;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator name;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator status;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator type;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator currency;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator monthlyPaymentValue;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPaymentValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyPaymentValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyPmtVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPaymentValue";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator monthlyReceivedValue;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyReceivedValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyReceivedValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyRcvdVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyReceivedValue";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator monthlyTransactionNumber;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyTransactionNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonthlyTransactionNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MnthlyTxNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyTransactionNumber";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator averageBalance;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageBalance = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AvrgBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageBalance";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accountPurpose;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountPurpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountPurpose";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator floorNotificationAmount;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFloorNotificationAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FlrNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator ceilingNotificationAmount;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCeilingNotificationAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClngNtfctnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator statementCycle;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementCycle = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "StmtCycl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementCycle";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator closingDate;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator restriction;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRestriction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Rstrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator openingDate;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOpeningDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator accountOwner;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwner = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator referenceAccount;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "RefAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Indicates if this field must be present in the response.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification42> proprietary;
	/**
	 * Indicates if this field must be present in the response.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates if this field must be present in the response."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietary = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CustomerAccountReturnCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Indicates if this field must be present in the response.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification42.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CustomerAccountReturnCriteria1.mmIdentification, CustomerAccountReturnCriteria1.mmName, CustomerAccountReturnCriteria1.mmStatus, CustomerAccountReturnCriteria1.mmType,
						CustomerAccountReturnCriteria1.mmCurrency, CustomerAccountReturnCriteria1.mmMonthlyPaymentValue, CustomerAccountReturnCriteria1.mmMonthlyReceivedValue, CustomerAccountReturnCriteria1.mmMonthlyTransactionNumber,
						CustomerAccountReturnCriteria1.mmAverageBalance, CustomerAccountReturnCriteria1.mmAccountPurpose, CustomerAccountReturnCriteria1.mmFloorNotificationAmount, CustomerAccountReturnCriteria1.mmCeilingNotificationAmount,
						CustomerAccountReturnCriteria1.mmStatementCycle, CustomerAccountReturnCriteria1.mmClosingDate, CustomerAccountReturnCriteria1.mmRestriction, CustomerAccountReturnCriteria1.mmOpeningDate,
						CustomerAccountReturnCriteria1.mmAccountOwner, CustomerAccountReturnCriteria1.mmReferenceAccount, CustomerAccountReturnCriteria1.mmProprietary);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CustomerAccountReturnCriteria1";
				definition = "Indicates which fields must be present in the response.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public YesNoIndicator getIdentification() {
		return identification;
	}

	public void setIdentification(YesNoIndicator identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Nm", required = true)
	public YesNoIndicator getName() {
		return name;
	}

	public void setName(YesNoIndicator name) {
		this.name = name;
	}

	@XmlElement(name = "Sts", required = true)
	public YesNoIndicator getStatus() {
		return status;
	}

	public void setStatus(YesNoIndicator status) {
		this.status = status;
	}

	@XmlElement(name = "Tp", required = true)
	public YesNoIndicator getType() {
		return type;
	}

	public void setType(YesNoIndicator type) {
		this.type = type;
	}

	@XmlElement(name = "Ccy", required = true)
	public YesNoIndicator getCurrency() {
		return currency;
	}

	public void setCurrency(YesNoIndicator currency) {
		this.currency = currency;
	}

	@XmlElement(name = "MnthlyPmtVal", required = true)
	public YesNoIndicator getMonthlyPaymentValue() {
		return monthlyPaymentValue;
	}

	public void setMonthlyPaymentValue(YesNoIndicator monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
	}

	@XmlElement(name = "MnthlyRcvdVal", required = true)
	public YesNoIndicator getMonthlyReceivedValue() {
		return monthlyReceivedValue;
	}

	public void setMonthlyReceivedValue(YesNoIndicator monthlyReceivedValue) {
		this.monthlyReceivedValue = monthlyReceivedValue;
	}

	@XmlElement(name = "MnthlyTxNb", required = true)
	public YesNoIndicator getMonthlyTransactionNumber() {
		return monthlyTransactionNumber;
	}

	public void setMonthlyTransactionNumber(YesNoIndicator monthlyTransactionNumber) {
		this.monthlyTransactionNumber = monthlyTransactionNumber;
	}

	@XmlElement(name = "AvrgBal", required = true)
	public YesNoIndicator getAverageBalance() {
		return averageBalance;
	}

	public void setAverageBalance(YesNoIndicator averageBalance) {
		this.averageBalance = averageBalance;
	}

	@XmlElement(name = "AcctPurp", required = true)
	public YesNoIndicator getAccountPurpose() {
		return accountPurpose;
	}

	public void setAccountPurpose(YesNoIndicator accountPurpose) {
		this.accountPurpose = accountPurpose;
	}

	@XmlElement(name = "FlrNtfctnAmt", required = true)
	public YesNoIndicator getFloorNotificationAmount() {
		return floorNotificationAmount;
	}

	public void setFloorNotificationAmount(YesNoIndicator floorNotificationAmount) {
		this.floorNotificationAmount = floorNotificationAmount;
	}

	@XmlElement(name = "ClngNtfctnAmt", required = true)
	public YesNoIndicator getCeilingNotificationAmount() {
		return ceilingNotificationAmount;
	}

	public void setCeilingNotificationAmount(YesNoIndicator ceilingNotificationAmount) {
		this.ceilingNotificationAmount = ceilingNotificationAmount;
	}

	@XmlElement(name = "StmtCycl", required = true)
	public YesNoIndicator getStatementCycle() {
		return statementCycle;
	}

	public void setStatementCycle(YesNoIndicator statementCycle) {
		this.statementCycle = statementCycle;
	}

	@XmlElement(name = "ClsgDt", required = true)
	public YesNoIndicator getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(YesNoIndicator closingDate) {
		this.closingDate = closingDate;
	}

	@XmlElement(name = "Rstrctn", required = true)
	public YesNoIndicator getRestriction() {
		return restriction;
	}

	public void setRestriction(YesNoIndicator restriction) {
		this.restriction = restriction;
	}

	@XmlElement(name = "OpngDt", required = true)
	public YesNoIndicator getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(YesNoIndicator openingDate) {
		this.openingDate = openingDate;
	}

	@XmlElement(name = "AcctOwnr", required = true)
	public YesNoIndicator getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(YesNoIndicator accountOwner) {
		this.accountOwner = accountOwner;
	}

	@XmlElement(name = "RefAcct", required = true)
	public YesNoIndicator getReferenceAccount() {
		return referenceAccount;
	}

	public void setReferenceAccount(YesNoIndicator referenceAccount) {
		this.referenceAccount = referenceAccount;
	}

	@XmlElement(name = "Prtry")
	public List<GenericIdentification42> getProprietary() {
		return proprietary;
	}

	public void setProprietary(List<com.tools20022.repository.msg.GenericIdentification42> proprietary) {
		this.proprietary = proprietary;
	}
}