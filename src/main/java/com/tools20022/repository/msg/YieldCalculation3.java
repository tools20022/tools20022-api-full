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
import com.tools20022.repository.choice.CalculationType2Choice;
import com.tools20022.repository.choice.DateTimePeriodChoice;
import com.tools20022.repository.datatype.ISODate;
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
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValue
 * YieldCalculation3.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmCalculationType
 * YieldCalculation3.mmCalculationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmRedemptionPrice
 * YieldCalculation3.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValueDate
 * YieldCalculation3.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmValuePeriod
 * YieldCalculation3.mmValuePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.YieldCalculation3#mmCalculationDate
 * YieldCalculation3.mmCalculationDate}</li>
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
 * "YieldCalculation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Return provided by a financial instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation5
 * YieldCalculation5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "YieldCalculation3", propOrder = {"value", "calculationType", "redemptionPrice", "valueDate", "valuePeriod", "calculationDate"})
public class YieldCalculation3 {

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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValue
	 * YieldCalculation5.mmValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, PercentageRate> mmValue = new MMMessageAttribute<YieldCalculation3, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "Val";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "236"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Result of the yield calculation.";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmValue);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(YieldCalculation3 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(YieldCalculation3 obj, PercentageRate value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "ClctnTp")
	protected CalculationType2Choice calculationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CalculationType2Choice
	 * CalculationType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmCalculationType
	 * YieldCalculation.mmCalculationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmCalculationType
	 * YieldCalculation5.mmCalculationType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, Optional<CalculationType2Choice>> mmCalculationType = new MMMessageAttribute<YieldCalculation3, Optional<CalculationType2Choice>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmCalculationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "ClctnTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "235"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationType";
			definition = "Specifies the type of calculation.";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmCalculationType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CalculationType2Choice.mmObject();
		}

		@Override
		public Optional<CalculationType2Choice> getValue(YieldCalculation3 obj) {
			return obj.getCalculationType();
		}

		@Override
		public void setValue(YieldCalculation3 obj, Optional<CalculationType2Choice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmRedemptionPrice
	 * YieldCalculation5.mmRedemptionPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, Optional<Price1>> mmRedemptionPrice = new MMMessageAttribute<YieldCalculation3, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmRedemptionPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "RedPric";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "697"), new FIXSynonym(this, "698"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPrice";
			definition = "Price to which the yield has been calculated.";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmRedemptionPrice);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(YieldCalculation3 obj) {
			return obj.getRedemptionPrice();
		}

		@Override
		public void setValue(YieldCalculation3 obj, Optional<Price1> value) {
			obj.setRedemptionPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "ValDt", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValueDate
	 * YieldCalculation5.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, ISODate> mmValueDate = new MMMessageAttribute<YieldCalculation3, ISODate>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Date/time on which the calculation is based, for example, valuation on October 1 (price date) based on price of September 19 ( value date).";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmValueDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(YieldCalculation3 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(YieldCalculation3 obj, ISODate value) {
			obj.setValueDate(value);
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmValuePeriod
	 * YieldCalculation5.mmValuePeriod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, DateTimePeriodChoice> mmValuePeriod = new MMMessageAttribute<YieldCalculation3, DateTimePeriodChoice>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValuePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "ValPrd";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "696"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuePeriod";
			definition = "Period on which the calculation is based.";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmValuePeriod);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateTimePeriodChoice.mmObject();
		}

		@Override
		public DateTimePeriodChoice getValue(YieldCalculation3 obj) {
			return obj.getValuePeriod();
		}

		@Override
		public void setValue(YieldCalculation3 obj, DateTimePeriodChoice value) {
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
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation3
	 * YieldCalculation3}</li>
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
	 * "Clarifies yield irregularities associated with date, for example when it falls on a non-business day."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.YieldCalculation5#mmCalculationDate
	 * YieldCalculation5.mmCalculationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<YieldCalculation3, ISODateTime> mmCalculationDate = new MMMessageAttribute<YieldCalculation3, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmYieldCalculationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.YieldCalculation3.mmObject();
			isDerived = false;
			xmlTag = "ClctnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "701"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDate";
			definition = "Clarifies yield irregularities associated with date, for example when it falls on a non-business day.";
			nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmCalculationDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(YieldCalculation3 obj) {
			return obj.getCalculationDate();
		}

		@Override
		public void setValue(YieldCalculation3 obj, ISODateTime value) {
			obj.setCalculationDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.YieldCalculation3.mmValue, com.tools20022.repository.msg.YieldCalculation3.mmCalculationType,
						com.tools20022.repository.msg.YieldCalculation3.mmRedemptionPrice, com.tools20022.repository.msg.YieldCalculation3.mmValueDate, com.tools20022.repository.msg.YieldCalculation3.mmValuePeriod,
						com.tools20022.repository.msg.YieldCalculation3.mmCalculationDate);
				trace_lazy = () -> YieldCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "YieldCalculation3";
				definition = "Return provided by a financial instrument.";
				nextVersions_lazy = () -> Arrays.asList(YieldCalculation5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getValue() {
		return value;
	}

	public YieldCalculation3 setValue(PercentageRate value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<CalculationType2Choice> getCalculationType() {
		return calculationType == null ? Optional.empty() : Optional.of(calculationType);
	}

	public YieldCalculation3 setCalculationType(CalculationType2Choice calculationType) {
		this.calculationType = calculationType;
		return this;
	}

	public Optional<Price1> getRedemptionPrice() {
		return redemptionPrice == null ? Optional.empty() : Optional.of(redemptionPrice);
	}

	public YieldCalculation3 setRedemptionPrice(Price1 redemptionPrice) {
		this.redemptionPrice = redemptionPrice;
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public YieldCalculation3 setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public DateTimePeriodChoice getValuePeriod() {
		return valuePeriod;
	}

	public YieldCalculation3 setValuePeriod(DateTimePeriodChoice valuePeriod) {
		this.valuePeriod = Objects.requireNonNull(valuePeriod);
		return this;
	}

	public ISODateTime getCalculationDate() {
		return calculationDate;
	}

	public YieldCalculation3 setCalculationDate(ISODateTime calculationDate) {
		this.calculationDate = Objects.requireNonNull(calculationDate);
		return this;
	}
}