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
import com.tools20022.repository.choice.BalanceQuantity1Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormatChoice;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalBalanceInformation;
import com.tools20022.repository.msg.ForeignExchangeTerms3;
import com.tools20022.repository.msg.PriceInformation1;
import com.tools20022.repository.msg.SubBalanceInformation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Net position of a segregated holding, in a single security, within the
 * overall position held in a securities account at a specified place of
 * safekeeping.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAggregateQuantity
 * AggregateBalancePerSafekeepingPlace1.mmAggregateQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAvailableQuantity
 * AggregateBalancePerSafekeepingPlace1.mmAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmNotAvailableQuantity
 * AggregateBalancePerSafekeepingPlace1.mmNotAvailableQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmDaysAccrued
 * AggregateBalancePerSafekeepingPlace1.mmDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmHoldingValue
 * AggregateBalancePerSafekeepingPlace1.mmHoldingValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAccruedInterestAmount
 * AggregateBalancePerSafekeepingPlace1.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmBookValue
 * AggregateBalancePerSafekeepingPlace1.mmBookValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace1.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmPriceDetails
 * AggregateBalancePerSafekeepingPlace1.mmPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmForeignExchangeDetails
 * AggregateBalancePerSafekeepingPlace1.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmBalanceBreakdownDetails
 * AggregateBalancePerSafekeepingPlace1.mmBalanceBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmAdditionalBalanceBreakdownDetails
 * AggregateBalancePerSafekeepingPlace1.mmAdditionalBalanceBreakdownDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
 * SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AggregateBalancePerSafekeepingPlace1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAggregateQuantityGuideline#forAggregateBalancePerSafekeepingPlace1
 * ConstraintAggregateQuantityGuideline.forAggregateBalancePerSafekeepingPlace1}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AggregateBalancePerSafekeepingPlace1", propOrder = {"aggregateQuantity", "availableQuantity", "notAvailableQuantity", "daysAccrued", "holdingValue", "accruedInterestAmount", "bookValue", "safekeepingPlace", "priceDetails",
		"foreignExchangeDetails", "balanceBreakdownDetails", "additionalBalanceBreakdownDetails"})
public class AggregateBalancePerSafekeepingPlace1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AggtQty", required = true)
	protected BalanceQuantity1Choice aggregateQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice
	 * BalanceQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AggtQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregateQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instrument for the referenced holding."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, BalanceQuantity1Choice> mmAggregateQuantity = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, BalanceQuantity1Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "AggtQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregateQuantity";
			definition = "Total quantity of financial instrument for the referenced holding.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BalanceQuantity1Choice.mmObject();
		}

		@Override
		public BalanceQuantity1Choice getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getAggregateQuantity();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, BalanceQuantity1Choice value) {
			obj.setAggregateQuantity(value);
		}
	};
	@XmlElement(name = "AvlblQty")
	protected BalanceQuantity1Choice availableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice
	 * BalanceQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmAvailableQuantity
	 * SecuritiesBalance.mmAvailableQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instrument for the referenced holding that is available."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<BalanceQuantity1Choice>> mmAvailableQuantity = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<BalanceQuantity1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmAvailableQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "AvlblQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableQuantity";
			definition = "Total quantity of financial instrument for the referenced holding that is available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceQuantity1Choice.mmObject();
		}

		@Override
		public Optional<BalanceQuantity1Choice> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getAvailableQuantity();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<BalanceQuantity1Choice> value) {
			obj.setAvailableQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "NotAvlblQty")
	protected BalanceQuantity1Choice notAvailableQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BalanceQuantity1Choice
	 * BalanceQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotAvlblQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailableQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instrument for the referenced holding that is not available."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<BalanceQuantity1Choice>> mmNotAvailableQuantity = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<BalanceQuantity1Choice>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "NotAvlblQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailableQuantity";
			definition = "Total quantity of financial instrument for the referenced holding that is not available.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BalanceQuantity1Choice.mmObject();
		}

		@Override
		public Optional<BalanceQuantity1Choice> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getNotAvailableQuantity();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<BalanceQuantity1Choice> value) {
			obj.setNotAvailableQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "DaysAcrd")
	protected Number daysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DaysAcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for calculating the accrued interest amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<Number>> mmDaysAccrued = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "DaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaysAccrued";
			definition = "Specifies the number of days used for calculating the accrued interest amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getDaysAccrued();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<Number> value) {
			obj.setDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgVal")
	protected List<ActiveOrHistoricCurrencyAndAmount> holdingValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of a balance of the securities account for a specific financial instrument, expressed in one or more currencies."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, List<ActiveOrHistoricCurrencyAndAmount>> mmHoldingValue = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "HldgVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingValue";
			definition = "Total value of a balance of the securities account for a specific financial instrument, expressed in one or more currencies.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getHoldingValue();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setHoldingValue(value);
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected ActiveOrHistoricCurrencyAndAmount accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmAccruedInterestAmount = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BookVal")
	protected ActiveOrHistoricCurrencyAndAmount bookValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<ActiveOrHistoricCurrencyAndAmount>> mmBookValue = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "BookVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookValue";
			definition = "Value of a security, as booked in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getBookValue();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setBookValue(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc", required = true)
	protected SafekeepingPlaceFormatChoice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
	 * SafekeepingPlaceFormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, SafekeepingPlaceFormatChoice> mmSafekeepingPlace = new MMMessageAttribute<AggregateBalancePerSafekeepingPlace1, SafekeepingPlaceFormatChoice>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SafekeepingPlaceFormatChoice.mmObject();
		}

		@Override
		public SafekeepingPlaceFormatChoice getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, SafekeepingPlaceFormatChoice value) {
			obj.setSafekeepingPlace(value);
		}
	};
	@XmlElement(name = "PricDtls")
	protected List<PriceInformation1> priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PriceInformation1
	 * PriceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price of the financial instrument in one or more currencies."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<PriceInformation1>> mmPriceDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<PriceInformation1>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price of the financial instrument in one or more currencies.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PriceInformation1.mmObject();
		}

		@Override
		public List<PriceInformation1> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, List<PriceInformation1> value) {
			obj.setPriceDetails(value);
		}
	};
	@XmlElement(name = "FrgnXchgDtls")
	protected ForeignExchangeTerms3 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3
	 * ForeignExchangeTerms3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnXchgDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange related to a securities order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, Optional<ForeignExchangeTerms3>> mmForeignExchangeDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, Optional<ForeignExchangeTerms3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "FrgnXchgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Currency exchange related to a securities order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms3.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms3> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, Optional<ForeignExchangeTerms3> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "BalBrkdwnDtls")
	protected List<SubBalanceInformation1> balanceBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubBalanceInformation1
	 * SubBalanceInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalBrkdwnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<SubBalanceInformation1>> mmBalanceBreakdownDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<SubBalanceInformation1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "BalBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceBreakdownDetails";
			definition = "Net position of a segregated holding of a single security within the overall position held in a securities account, eg, sub-balance per status.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubBalanceInformation1.mmObject();
		}

		@Override
		public List<SubBalanceInformation1> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getBalanceBreakdownDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, List<SubBalanceInformation1> value) {
			obj.setBalanceBreakdownDetails(value);
		}
	};
	@XmlElement(name = "AddtlBalBrkdwnDtls")
	protected List<AdditionalBalanceInformation> additionalBalanceBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalBalanceInformation
	 * AdditionalBalanceInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1
	 * AggregateBalancePerSafekeepingPlace1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBalBrkdwnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalanceBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities account."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<AdditionalBalanceInformation>> mmAdditionalBalanceBreakdownDetails = new MMMessageAssociationEnd<AggregateBalancePerSafekeepingPlace1, List<AdditionalBalanceInformation>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmObject();
			isDerived = false;
			xmlTag = "AddtlBalBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalanceBreakdownDetails";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBalanceInformation.mmObject();
		}

		@Override
		public List<AdditionalBalanceInformation> getValue(AggregateBalancePerSafekeepingPlace1 obj) {
			return obj.getAdditionalBalanceBreakdownDetails();
		}

		@Override
		public void setValue(AggregateBalancePerSafekeepingPlace1 obj, List<AdditionalBalanceInformation> value) {
			obj.setAdditionalBalanceBreakdownDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmAggregateQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmAvailableQuantity,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmNotAvailableQuantity, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmDaysAccrued,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmHoldingValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmAccruedInterestAmount,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmBookValue, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmSafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmPriceDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmForeignExchangeDetails,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmBalanceBreakdownDetails, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.mmAdditionalBalanceBreakdownDetails);
				trace_lazy = () -> SecuritiesBalance.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAggregateQuantityGuideline.forAggregateBalancePerSafekeepingPlace1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AggregateBalancePerSafekeepingPlace1";
				definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities account at a specified place of safekeeping.";
			}
		});
		return mmObject_lazy.get();
	}

	public BalanceQuantity1Choice getAggregateQuantity() {
		return aggregateQuantity;
	}

	public AggregateBalancePerSafekeepingPlace1 setAggregateQuantity(BalanceQuantity1Choice aggregateQuantity) {
		this.aggregateQuantity = Objects.requireNonNull(aggregateQuantity);
		return this;
	}

	public Optional<BalanceQuantity1Choice> getAvailableQuantity() {
		return availableQuantity == null ? Optional.empty() : Optional.of(availableQuantity);
	}

	public AggregateBalancePerSafekeepingPlace1 setAvailableQuantity(BalanceQuantity1Choice availableQuantity) {
		this.availableQuantity = availableQuantity;
		return this;
	}

	public Optional<BalanceQuantity1Choice> getNotAvailableQuantity() {
		return notAvailableQuantity == null ? Optional.empty() : Optional.of(notAvailableQuantity);
	}

	public AggregateBalancePerSafekeepingPlace1 setNotAvailableQuantity(BalanceQuantity1Choice notAvailableQuantity) {
		this.notAvailableQuantity = notAvailableQuantity;
		return this;
	}

	public Optional<Number> getDaysAccrued() {
		return daysAccrued == null ? Optional.empty() : Optional.of(daysAccrued);
	}

	public AggregateBalancePerSafekeepingPlace1 setDaysAccrued(Number daysAccrued) {
		this.daysAccrued = daysAccrued;
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getHoldingValue() {
		return holdingValue == null ? holdingValue = new ArrayList<>() : holdingValue;
	}

	public AggregateBalancePerSafekeepingPlace1 setHoldingValue(List<ActiveOrHistoricCurrencyAndAmount> holdingValue) {
		this.holdingValue = Objects.requireNonNull(holdingValue);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public AggregateBalancePerSafekeepingPlace1 setAccruedInterestAmount(ActiveOrHistoricCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getBookValue() {
		return bookValue == null ? Optional.empty() : Optional.of(bookValue);
	}

	public AggregateBalancePerSafekeepingPlace1 setBookValue(ActiveOrHistoricCurrencyAndAmount bookValue) {
		this.bookValue = bookValue;
		return this;
	}

	public SafekeepingPlaceFormatChoice getSafekeepingPlace() {
		return safekeepingPlace;
	}

	public AggregateBalancePerSafekeepingPlace1 setSafekeepingPlace(SafekeepingPlaceFormatChoice safekeepingPlace) {
		this.safekeepingPlace = Objects.requireNonNull(safekeepingPlace);
		return this;
	}

	public List<PriceInformation1> getPriceDetails() {
		return priceDetails == null ? priceDetails = new ArrayList<>() : priceDetails;
	}

	public AggregateBalancePerSafekeepingPlace1 setPriceDetails(List<PriceInformation1> priceDetails) {
		this.priceDetails = Objects.requireNonNull(priceDetails);
		return this;
	}

	public Optional<ForeignExchangeTerms3> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public AggregateBalancePerSafekeepingPlace1 setForeignExchangeDetails(ForeignExchangeTerms3 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public List<SubBalanceInformation1> getBalanceBreakdownDetails() {
		return balanceBreakdownDetails == null ? balanceBreakdownDetails = new ArrayList<>() : balanceBreakdownDetails;
	}

	public AggregateBalancePerSafekeepingPlace1 setBalanceBreakdownDetails(List<SubBalanceInformation1> balanceBreakdownDetails) {
		this.balanceBreakdownDetails = Objects.requireNonNull(balanceBreakdownDetails);
		return this;
	}

	public List<AdditionalBalanceInformation> getAdditionalBalanceBreakdownDetails() {
		return additionalBalanceBreakdownDetails == null ? additionalBalanceBreakdownDetails = new ArrayList<>() : additionalBalanceBreakdownDetails;
	}

	public AggregateBalancePerSafekeepingPlace1 setAdditionalBalanceBreakdownDetails(List<AdditionalBalanceInformation> additionalBalanceBreakdownDetails) {
		this.additionalBalanceBreakdownDetails = Objects.requireNonNull(additionalBalanceBreakdownDetails);
		return this;
	}
}