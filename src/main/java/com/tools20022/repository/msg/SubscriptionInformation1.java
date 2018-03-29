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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
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
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmDateOfFirstSubscription
 * SubscriptionInformation1.mmDateOfFirstSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmEquityComponent
 * SubscriptionInformation1.mmEquityComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmCashComponent
 * SubscriptionInformation1.mmCashComponent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1#mmTotalAmountYearToDate
 * SubscriptionInformation1.mmTotalAmountYearToDate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalAmountYearToDateRule#forSubscriptionInformation1
 * ConstraintTotalAmountYearToDateRule.forSubscriptionInformation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a subscription order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionInformation1", propOrder = {"dateOfFirstSubscription", "equityComponent", "cashComponent", "totalAmountYearToDate"})
public class SubscriptionInformation1 {

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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
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
	public static final MMMessageAttribute<SubscriptionInformation1, ISODate> mmDateOfFirstSubscription = new MMMessageAttribute<SubscriptionInformation1, ISODate>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
			isDerived = false;
			xmlTag = "DtOfFrstSbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateOfFirstSubscription";
			definition = "Date the investment plan starts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SubscriptionInformation1 obj) {
			return obj.getDateOfFirstSubscription();
		}

		@Override
		public void setValue(SubscriptionInformation1 obj, ISODate value) {
			obj.setDateOfFirstSubscription(value);
		}
	};
	@XmlElement(name = "EqtyCmpnt")
	protected ActiveCurrencyAndAmount equityComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmEquityComponent
	 * SubscriptionExecution.mmEquityComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
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
	public static final MMMessageAttribute<SubscriptionInformation1, Optional<ActiveCurrencyAndAmount>> mmEquityComponent = new MMMessageAttribute<SubscriptionInformation1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmEquityComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
			isDerived = false;
			xmlTag = "EqtyCmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityComponent";
			definition = "Amount subscribed in the current tax year into equity (not including dividends).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionInformation1 obj) {
			return obj.getEquityComponent();
		}

		@Override
		public void setValue(SubscriptionInformation1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setEquityComponent(value.orElse(null));
		}
	};
	@XmlElement(name = "CshCmpnt")
	protected ActiveCurrencyAndAmount cashComponent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SubscriptionExecution#mmCashComponent
	 * SubscriptionExecution.mmCashComponent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
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
	public static final MMMessageAttribute<SubscriptionInformation1, Optional<ActiveCurrencyAndAmount>> mmCashComponent = new MMMessageAttribute<SubscriptionInformation1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SubscriptionExecution.mmCashComponent;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
			isDerived = false;
			xmlTag = "CshCmpnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashComponent";
			definition = "Amount subscribed in the current tax year into cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(SubscriptionInformation1 obj) {
			return obj.getCashComponent();
		}

		@Override
		public void setValue(SubscriptionInformation1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashComponent(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlAmtYrToDt", required = true)
	protected ActiveCurrencyAndAmount totalAmountYearToDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmTotalAmount
	 * InvestmentFundOrder.mmTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionInformation1
	 * SubscriptionInformation1}</li>
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
	public static final MMMessageAttribute<SubscriptionInformation1, ActiveCurrencyAndAmount> mmTotalAmountYearToDate = new MMMessageAttribute<SubscriptionInformation1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmTotalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionInformation1.mmObject();
			isDerived = false;
			xmlTag = "TtlAmtYrToDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalAmountYearToDate";
			definition = "Total amount subscribed in the current tax year.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(SubscriptionInformation1 obj) {
			return obj.getTotalAmountYearToDate();
		}

		@Override
		public void setValue(SubscriptionInformation1 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalAmountYearToDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionInformation1.mmDateOfFirstSubscription, com.tools20022.repository.msg.SubscriptionInformation1.mmEquityComponent,
						com.tools20022.repository.msg.SubscriptionInformation1.mmCashComponent, com.tools20022.repository.msg.SubscriptionInformation1.mmTotalAmountYearToDate);
				trace_lazy = () -> SubscriptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalAmountYearToDateRule.forSubscriptionInformation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionInformation1";
				definition = "Execution of a subscription order.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getDateOfFirstSubscription() {
		return dateOfFirstSubscription;
	}

	public SubscriptionInformation1 setDateOfFirstSubscription(ISODate dateOfFirstSubscription) {
		this.dateOfFirstSubscription = Objects.requireNonNull(dateOfFirstSubscription);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getEquityComponent() {
		return equityComponent == null ? Optional.empty() : Optional.of(equityComponent);
	}

	public SubscriptionInformation1 setEquityComponent(ActiveCurrencyAndAmount equityComponent) {
		this.equityComponent = equityComponent;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashComponent() {
		return cashComponent == null ? Optional.empty() : Optional.of(cashComponent);
	}

	public SubscriptionInformation1 setCashComponent(ActiveCurrencyAndAmount cashComponent) {
		this.cashComponent = cashComponent;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalAmountYearToDate() {
		return totalAmountYearToDate;
	}

	public SubscriptionInformation1 setTotalAmountYearToDate(ActiveCurrencyAndAmount totalAmountYearToDate) {
		this.totalAmountYearToDate = Objects.requireNonNull(totalAmountYearToDate);
		return this;
	}
}