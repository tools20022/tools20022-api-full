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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.DateTimePeriod;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SubscriptionExecution;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Execution of a subscription order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmDateOfFirstSubscription
 * SubscriptionInformation.mmDateOfFirstSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmEquityComponent
 * SubscriptionInformation.mmEquityComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmCashComponent
 * SubscriptionInformation.mmCashComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation#mmTotalAmountYearToDate
 * SubscriptionInformation.mmTotalAmountYearToDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionExecution
 * SubscriptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalAmountYearToDateRule#forSubscriptionInformation
 * ConstraintTotalAmountYearToDateRule.forSubscriptionInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionInformation", propOrder = {"dateOfFirstSubscription", "equityComponent", "cashComponent", "totalAmountYearToDate"})
public class SubscriptionInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtOfFrstSbcpt", required = true)
	protected ISODate dateOfFirstSubscription;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation
	 * SubscriptionInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtOfFrstSbcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateOfFirstSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investment plan starts."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateOfFirstSubscription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation.mmObject();
			isDerived = false;
			xmlTag = "DtOfFrstSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfFirstSubscription";
			definition = "Date the investment plan starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "EqtyCmpnt")
	protected CurrencyAndAmount equityComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmEquityComponent
	 * SubscriptionExecution.mmEquityComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation
	 * SubscriptionInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqtyCmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount subscribed in the current tax year into equity (not including dividends)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEquityComponent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmEquityComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation.mmObject();
			isDerived = false;
			xmlTag = "EqtyCmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityComponent";
			definition = "Amount subscribed in the current tax year into equity (not including dividends).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CshCmpnt")
	protected CurrencyAndAmount cashComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmCashComponent
	 * SubscriptionExecution.mmCashComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation
	 * SubscriptionInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCmpnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashComponent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount subscribed in the current tax year into cash."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashComponent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmCashComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation.mmObject();
			isDerived = false;
			xmlTag = "CshCmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashComponent";
			definition = "Amount subscribed in the current tax year into cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlAmtYrToDt", required = true)
	protected CurrencyAndAmount totalAmountYearToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmTotalAmount
	 * InvestmentFundOrder.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation
	 * SubscriptionInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlAmtYrToDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalAmountYearToDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount subscribed in the current tax year."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalAmountYearToDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtYrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountYearToDate";
			definition = "Total amount subscribed in the current tax year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionInformation.mmDateOfFirstSubscription, com.tools20022.repository.msg.SubscriptionInformation.mmEquityComponent,
						com.tools20022.repository.msg.SubscriptionInformation.mmCashComponent, com.tools20022.repository.msg.SubscriptionInformation.mmTotalAmountYearToDate);
				trace_lazy = () -> SubscriptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalAmountYearToDateRule.forSubscriptionInformation);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SubscriptionInformation";
				definition = "Execution of a subscription order.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDateOfFirstSubscription() {
		return dateOfFirstSubscription;
	}

	public SubscriptionInformation setDateOfFirstSubscription(ISODate dateOfFirstSubscription) {
		this.dateOfFirstSubscription = Objects.requireNonNull(dateOfFirstSubscription);
		return this;
	}

	public Optional<CurrencyAndAmount> getEquityComponent() {
		return equityComponent == null ? Optional.empty() : Optional.of(equityComponent);
	}

	public SubscriptionInformation setEquityComponent(CurrencyAndAmount equityComponent) {
		this.equityComponent = equityComponent;
		return this;
	}

	public Optional<CurrencyAndAmount> getCashComponent() {
		return cashComponent == null ? Optional.empty() : Optional.of(cashComponent);
	}

	public SubscriptionInformation setCashComponent(CurrencyAndAmount cashComponent) {
		this.cashComponent = cashComponent;
		return this;
	}

	public CurrencyAndAmount getTotalAmountYearToDate() {
		return totalAmountYearToDate;
	}

	public SubscriptionInformation setTotalAmountYearToDate(CurrencyAndAmount totalAmountYearToDate) {
		this.totalAmountYearToDate = Objects.requireNonNull(totalAmountYearToDate);
		return this;
	}
}