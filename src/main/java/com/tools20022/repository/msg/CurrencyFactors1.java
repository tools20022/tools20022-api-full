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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Limit;
import com.tools20022.repository.entity.LiquidityManagementLimit;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AgreedRate2;
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
 * Currency specific Factors.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmCurrency
 * CurrencyFactors1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmShortPositionLimit
 * CurrencyFactors1.mmShortPositionLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmMinimumPayInAmount
 * CurrencyFactors1.mmMinimumPayInAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmVolatilityMargin
 * CurrencyFactors1.mmVolatilityMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyFactors1#mmRate
 * CurrencyFactors1.mmRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
 * LiquidityManagementLimit}</li>
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
 * "CurrencyFactors1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Currency specific Factors."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyFactors1", propOrder = {"currency", "shortPositionLimit", "minimumPayInAmount", "volatilityMargin", "rate"})
public class CurrencyFactors1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy", required = true)
	protected CurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCurrency
	 * Limit.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
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
	 * definition} =
	 * "Currency of the underlying currency specific amounts and ratios used in the pay-in schedule calculation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyFactors1, CurrencyCode> mmCurrency = new MMMessageAttribute<CurrencyFactors1, CurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the underlying currency specific amounts and ratios used in the pay-in schedule calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CurrencyFactors1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(CurrencyFactors1 obj, CurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "ShrtPosLmt", required = true)
	protected ImpliedCurrencyAndAmount shortPositionLimit;
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
	 * {@linkplain com.tools20022.repository.entity.Limit#mmAmount
	 * Limit.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtPosLmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortPositionLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum allowed short position in the currency during settlement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyFactors1, ImpliedCurrencyAndAmount> mmShortPositionLimit = new MMMessageAttribute<CurrencyFactors1, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Limit.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
			isDerived = false;
			xmlTag = "ShrtPosLmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortPositionLimit";
			definition = "Maximum allowed short position in the currency during settlement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CurrencyFactors1 obj) {
			return obj.getShortPositionLimit();
		}

		@Override
		public void setValue(CurrencyFactors1 obj, ImpliedCurrencyAndAmount value) {
			obj.setShortPositionLimit(value);
		}
	};
	@XmlElement(name = "MinPayInAmt", required = true)
	protected ImpliedCurrencyAndAmount minimumPayInAmount;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinPayInAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPayInAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum amount paid in one payment unless the short position is less than the minimum."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyFactors1, ImpliedCurrencyAndAmount> mmMinimumPayInAmount = new MMMessageAttribute<CurrencyFactors1, ImpliedCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
			isDerived = false;
			xmlTag = "MinPayInAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumPayInAmount";
			definition = "Minimum amount paid in one payment unless the short position is less than the minimum.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(CurrencyFactors1 obj) {
			return obj.getMinimumPayInAmount();
		}

		@Override
		public void setValue(CurrencyFactors1 obj, ImpliedCurrencyAndAmount value) {
			obj.setMinimumPayInAmount(value);
		}
	};
	@XmlElement(name = "VoltlyMrgn", required = true)
	protected PercentageRate volatilityMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmVolatilityMargin
	 * LiquidityManagementLimit.mmVolatilityMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoltlyMrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin used to decrease long positions and increase short positions during the risk calculation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyFactors1, PercentageRate> mmVolatilityMargin = new MMMessageAttribute<CurrencyFactors1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> LiquidityManagementLimit.mmVolatilityMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
			isDerived = false;
			xmlTag = "VoltlyMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityMargin";
			definition = "Margin used to decrease long positions and increase short positions during the risk calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(CurrencyFactors1 obj) {
			return obj.getVolatilityMargin();
		}

		@Override
		public void setValue(CurrencyFactors1 obj, PercentageRate value) {
			obj.setVolatilityMargin(value);
		}
	};
	@XmlElement(name = "Rate")
	protected AgreedRate2 rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate2
	 * AgreedRate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
	 * LiquidityManagementLimit.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyFactors1
	 * CurrencyFactors1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate used in the calculation of the pay-in schedule."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CurrencyFactors1, Optional<AgreedRate2>> mmRate = new MMMessageAttribute<CurrencyFactors1, Optional<AgreedRate2>>() {
		{
			businessElementTrace_lazy = () -> LiquidityManagementLimit.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrencyFactors1.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Exchange rate used in the calculation of the pay-in schedule.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedRate2.mmObject();
		}

		@Override
		public Optional<AgreedRate2> getValue(CurrencyFactors1 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(CurrencyFactors1 obj, Optional<AgreedRate2> value) {
			obj.setRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyFactors1.mmCurrency, com.tools20022.repository.msg.CurrencyFactors1.mmShortPositionLimit,
						com.tools20022.repository.msg.CurrencyFactors1.mmMinimumPayInAmount, com.tools20022.repository.msg.CurrencyFactors1.mmVolatilityMargin, com.tools20022.repository.msg.CurrencyFactors1.mmRate);
				trace_lazy = () -> LiquidityManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CurrencyFactors1";
				definition = "Currency specific Factors.";
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public CurrencyFactors1 setCurrency(CurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public ImpliedCurrencyAndAmount getShortPositionLimit() {
		return shortPositionLimit;
	}

	public CurrencyFactors1 setShortPositionLimit(ImpliedCurrencyAndAmount shortPositionLimit) {
		this.shortPositionLimit = Objects.requireNonNull(shortPositionLimit);
		return this;
	}

	public ImpliedCurrencyAndAmount getMinimumPayInAmount() {
		return minimumPayInAmount;
	}

	public CurrencyFactors1 setMinimumPayInAmount(ImpliedCurrencyAndAmount minimumPayInAmount) {
		this.minimumPayInAmount = Objects.requireNonNull(minimumPayInAmount);
		return this;
	}

	public PercentageRate getVolatilityMargin() {
		return volatilityMargin;
	}

	public CurrencyFactors1 setVolatilityMargin(PercentageRate volatilityMargin) {
		this.volatilityMargin = Objects.requireNonNull(volatilityMargin);
		return this;
	}

	public Optional<AgreedRate2> getRate() {
		return rate == null ? Optional.empty() : Optional.of(rate);
	}

	public CurrencyFactors1 setRate(AgreedRate2 rate) {
		this.rate = rate;
		return this;
	}
}