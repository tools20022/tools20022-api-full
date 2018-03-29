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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.YieldCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
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
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValue
 * YieldCalculation1.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmCalculationType
 * YieldCalculation1.mmCalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmRedemptionPrice
 * YieldCalculation1.mmRedemptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValueDateTime
 * YieldCalculation1.mmValueDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmValuePeriod
 * YieldCalculation1.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation1#mmCalculationDate
 * YieldCalculation1.mmCalculationDate}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "YieldCalculation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Return provided by a financial instrument."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "YieldCalculation1", propOrder = {"value", "calculationType", "redemptionPrice", "valueDateTime", "valuePeriod", "calculationDate"})
public class YieldCalculation1 {

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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
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
	public static final MMMessageAttribute<YieldCalculation1, PercentageRate> mmValue = new MMMessageAttribute<YieldCalculation1, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
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
		public PercentageRate getValue(YieldCalculation1 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(YieldCalculation1 obj, PercentageRate value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "ClctnTp")
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
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
	public static final MMMessageAttribute<YieldCalculation1, Optional<CalculationType1Code>> mmCalculationType = new MMMessageAttribute<YieldCalculation1, Optional<CalculationType1Code>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
			isDerived = false;
			xmlTag = "ClctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "235"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CalculationType1Code.mmObject();
		}

		@Override
		public Optional<CalculationType1Code> getValue(YieldCalculation1 obj) {
			return obj.getCalculationType();
		}

		@Override
		public void setValue(YieldCalculation1 obj, Optional<CalculationType1Code> value) {
			obj.setCalculationType(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPric")
	protected Price1 redemptionPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Price1 Price1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
	 * YieldCalculation.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
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
	public static final MMMessageAttribute<YieldCalculation1, Optional<Price1>> mmRedemptionPrice = new MMMessageAttribute<YieldCalculation1, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmRedemptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
			isDerived = false;
			xmlTag = "RedPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "697"), new FIXSynonym(this, "698"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPrice";
			definition = "Price to which the yield has been calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(YieldCalculation1 obj) {
			return obj.getRedemptionPrice();
		}

		@Override
		public void setValue(YieldCalculation1 obj, Optional<Price1> value) {
			obj.setRedemptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDtTm", required = true)
	protected ISODateTime valueDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValueDate
	 * YieldCalculation.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 696</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation1, ISODateTime> mmValueDateTime = new MMMessageAttribute<YieldCalculation1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
			isDerived = false;
			xmlTag = "ValDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateTime";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(YieldCalculation1 obj) {
			return obj.getValueDateTime();
		}

		@Override
		public void setValue(YieldCalculation1 obj, ISODateTime value) {
			obj.setValueDateTime(value);
		}
	};
	@XmlElement(name = "ValPrd", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
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
	public static final MMMessageAttribute<YieldCalculation1, DateTimePeriodChoice> mmValuePeriod = new MMMessageAttribute<YieldCalculation1, DateTimePeriodChoice>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValuePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
			isDerived = false;
			xmlTag = "ValPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public DateTimePeriodChoice getValue(YieldCalculation1 obj) {
			return obj.getValuePeriod();
		}

		@Override
		public void setValue(YieldCalculation1 obj, DateTimePeriodChoice value) {
			obj.setValuePeriod(value);
		}
	};
	@XmlElement(name = "ClctnDt", required = true)
	protected ISODateTime calculationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmYieldCalculationDate
	 * YieldCalculation.mmYieldCalculationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation1
	 * YieldCalculation1}</li>
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
	public static final MMMessageAttribute<YieldCalculation1, ISODateTime> mmCalculationDate = new MMMessageAttribute<YieldCalculation1, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmYieldCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation1.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "701"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Included as needed to clarify yield irregularities associated with date, e.g. when it falls on a non-business day.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(YieldCalculation1 obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(YieldCalculation1 obj, ISODateTime value) {
			obj.setCalculationDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation1.mmValue, com.tools20022.repository.msg.YieldCalculation1.mmCalculationType,
						com.tools20022.repository.msg.YieldCalculation1.mmRedemptionPrice, com.tools20022.repository.msg.YieldCalculation1.mmValueDateTime, com.tools20022.repository.msg.YieldCalculation1.mmValuePeriod,
						com.tools20022.repository.msg.YieldCalculation1.mmCalculationDate);
				trace_lazy = () -> YieldCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "YieldCalculation1";
				definition = "Return provided by a financial instrument.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getValue() {
		return value;
	}

	public YieldCalculation1 setValue(PercentageRate value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<CalculationType1Code> getCalculationType() {
		return calculationType == null ? Optional.empty() : Optional.of(calculationType);
	}

	public YieldCalculation1 setCalculationType(CalculationType1Code calculationType) {
		this.calculationType = calculationType;
		return this;
	}

	public Optional<Price1> getRedemptionPrice() {
		return redemptionPrice == null ? Optional.empty() : Optional.of(redemptionPrice);
	}

	public YieldCalculation1 setRedemptionPrice(Price1 redemptionPrice) {
		this.redemptionPrice = redemptionPrice;
		return this;
	}

	public ISODateTime getValueDateTime() {
		return valueDateTime;
	}

	public YieldCalculation1 setValueDateTime(ISODateTime valueDateTime) {
		this.valueDateTime = Objects.requireNonNull(valueDateTime);
		return this;
	}

	public DateTimePeriodChoice getValuePeriod() {
		return valuePeriod;
	}

	public YieldCalculation1 setValuePeriod(DateTimePeriodChoice valuePeriod) {
		this.valuePeriod = Objects.requireNonNull(valuePeriod);
		return this;
	}

	public ISODateTime getCalculationDate() {
		return calculationDate;
	}

	public YieldCalculation1 setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}
}