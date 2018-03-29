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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.codeset.CalculationType1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.YieldCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Return provided by a financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValue
 * YieldCalculation2.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmCalculationType
 * YieldCalculation2.mmCalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmRedemptionPrice
 * YieldCalculation2.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValueDate
 * YieldCalculation2.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmValuePeriod
 * YieldCalculation2.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation2#mmCalculationDate
 * YieldCalculation2.mmCalculationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.YieldCalculation
 * YieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "YieldCalculation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Return provided by a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "YieldCalculation2", propOrder = {"value", "calculationType", "redemptionPrice", "valueDate", "valuePeriod", "calculationDate"})
public class YieldCalculation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Val", required = true)
	protected PercentageRate value;
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValue
	 * YieldCalculation.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 236</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the yield calculation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, PercentageRate> mmValue = new MMMessageAttribute<YieldCalculation2, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "Val";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "236"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Result of the yield calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(YieldCalculation2 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(YieldCalculation2 obj, PercentageRate value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "ClctnTp", required = true)
	protected CalculationType1Code calculationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationType1Code
	 * CalculationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmCalculationType
	 * YieldCalculation.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 235</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of calculation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, CalculationType1Code> mmCalculationType = new MMMessageAttribute<YieldCalculation2, CalculationType1Code>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "ClctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "235"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CalculationType1Code.mmObject();
		}

		@Override
		public CalculationType1Code getValue(YieldCalculation2 obj) {
			return obj.getCalculationType();
		}

		@Override
		public void setValue(YieldCalculation2 obj, CalculationType1Code value) {
			obj.setCalculationType(value);
		}
	};
	@XmlElement(name = "RedPric")
	protected Price4 redemptionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
	 * YieldCalculation.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 697, FIXSynonym: 698</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price to which the yield has been calculated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, Optional<Price4>> mmRedemptionPrice = new MMMessageAttribute<YieldCalculation2, Optional<Price4>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmRedemptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "RedPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "697"), new FIXSynonym(this, "698"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPrice";
			definition = "Price to which the yield has been calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price4.mmObject();
		}

		@Override
		public Optional<Price4> getValue(YieldCalculation2 obj) {
			return obj.getRedemptionPrice();
		}

		@Override
		public void setValue(YieldCalculation2 obj, Optional<Price4> value) {
			obj.setRedemptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt")
	protected ISODate valueDate;
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValueDate
	 * YieldCalculation.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 696</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, Optional<ISODate>> mmValueDate = new MMMessageAttribute<YieldCalculation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(YieldCalculation2 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(YieldCalculation2 obj, Optional<ISODate> value) {
			obj.setValueDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValPrd")
	protected DateTimePeriodChoice valuePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateTimePeriodChoice
	 * DateTimePeriodChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValuePeriod
	 * YieldCalculation.mmValuePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 696</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period on which the calculation is based."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, Optional<DateTimePeriodChoice>> mmValuePeriod = new MMMessageAttribute<YieldCalculation2, Optional<DateTimePeriodChoice>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValuePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "ValPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public Optional<DateTimePeriodChoice> getValue(YieldCalculation2 obj) {
			return obj.getValuePeriod();
		}

		@Override
		public void setValue(YieldCalculation2 obj, Optional<DateTimePeriodChoice> value) {
			obj.setValuePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnDt")
	protected ISODate calculationDate;
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldCalculationDate
	 * YieldCalculation.mmYieldCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation2
	 * YieldCalculation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 701</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Included as needed to clarify yield irregularities associated with date, e.g. when it falls on a non-business day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation2, Optional<ISODate>> mmCalculationDate = new MMMessageAttribute<YieldCalculation2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmYieldCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation2.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "701"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Included as needed to clarify yield irregularities associated with date, e.g. when it falls on a non-business day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(YieldCalculation2 obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(YieldCalculation2 obj, Optional<ISODate> value) {
			obj.setCalculationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation2.mmValue, com.tools20022.repository.msg.YieldCalculation2.mmCalculationType,
						com.tools20022.repository.msg.YieldCalculation2.mmRedemptionPrice, com.tools20022.repository.msg.YieldCalculation2.mmValueDate, com.tools20022.repository.msg.YieldCalculation2.mmValuePeriod,
						com.tools20022.repository.msg.YieldCalculation2.mmCalculationDate);
				trace_lazy = () -> YieldCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "YieldCalculation2";
				definition = "Return provided by a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getValue() {
		return value;
	}

	public YieldCalculation2 setValue(PercentageRate value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public CalculationType1Code getCalculationType() {
		return calculationType;
	}

	public YieldCalculation2 setCalculationType(CalculationType1Code calculationType) {
		this.calculationType = Objects.requireNonNull(calculationType);
		return this;
	}

	public Optional<Price4> getRedemptionPrice() {
		return redemptionPrice == null ? Optional.empty() : Optional.of(redemptionPrice);
	}

	public YieldCalculation2 setRedemptionPrice(Price4 redemptionPrice) {
		this.redemptionPrice = redemptionPrice;
		return this;
	}

	public Optional<ISODate> getValueDate() {
		return valueDate == null ? Optional.empty() : Optional.of(valueDate);
	}

	public YieldCalculation2 setValueDate(ISODate valueDate) {
		this.valueDate = valueDate;
		return this;
	}

	public Optional<DateTimePeriodChoice> getValuePeriod() {
		return valuePeriod == null ? Optional.empty() : Optional.of(valuePeriod);
	}

	public YieldCalculation2 setValuePeriod(DateTimePeriodChoice valuePeriod) {
		this.valuePeriod = valuePeriod;
		return this;
	}

	public Optional<ISODate> getCalculationDate() {
		return calculationDate == null ? Optional.empty() : Optional.of(calculationDate);
	}

	public YieldCalculation2 setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
		return this;
	}
}