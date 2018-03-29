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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.TimeUnit3Choice;
import com.tools20022.repository.choice.UnitOfMeasure4Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Future;
import com.tools20022.repository.entity.FutureRule;
import com.tools20022.repository.entity.SecuritiesConversion;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Price1;
import com.tools20022.repository.msg.UnderlyingAttributes3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters for contracts which obligate the buyer to receive and the seller
 * to deliver in the future the assets specified at an agreed price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmContractSize
 * Future3.mmContractSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmExercisePrice
 * Future3.mmExercisePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmFutureDate
 * Future3.mmFutureDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmMinimumSize
 * Future3.mmMinimumSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmUnitOfMeasure
 * Future3.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future3#mmTimeUnit
 * Future3.mmTimeUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Future3#mmAdditionalUnderlyingAttributes
 * Future3.mmAdditionalUnderlyingAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Future Future}</li>
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
 * "Future3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Future3", propOrder = {"contractSize", "exercisePrice", "futureDate", "minimumSize", "unitOfMeasure", "timeUnit", "additionalUnderlyingAttributes"})
public class Future3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctSz")
	protected BaseOneRate contractSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmContractSize
	 * SecuritiesConversion.mmContractSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ratio or multiplying factor used to convert one contract into a quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<BaseOneRate>> mmContractSize = new MMMessageAttribute<Future3, Optional<BaseOneRate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public Optional<BaseOneRate> getValue(Future3 obj) {
			return obj.getContractSize();
		}

		@Override
		public void setValue(Future3 obj, Optional<BaseOneRate> value) {
			obj.setContractSize(value.orElse(null));
		}
	};
	@XmlElement(name = "ExrcPric")
	protected Price1 exercisePrice;
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
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExrcPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined price at which the holder of a Future will have to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<Price1>> mmExercisePrice = new MMMessageAttribute<Future3, Optional<Price1>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a Future will have to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Price1.mmObject();
		}

		@Override
		public Optional<Price1> getValue(Future3 obj) {
			return obj.getExercisePrice();
		}

		@Override
		public void setValue(Future3 obj, Optional<Price1> value) {
			obj.setExercisePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "FutrDt")
	protected ISODateTime futureDate;
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
	 * {@linkplain com.tools20022.repository.entity.Future#mmFutureDate
	 * Future.mmFutureDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FutrDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which future contracts settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<ISODateTime>> mmFutureDate = new MMMessageAttribute<Future3, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Future.mmFutureDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "FutrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(Future3 obj) {
			return obj.getFutureDate();
		}

		@Override
		public void setValue(Future3 obj, Optional<ISODateTime> value) {
			obj.setFutureDate(value.orElse(null));
		}
	};
	@XmlElement(name = "MinSz")
	protected ActiveCurrencyAndAmount minimumSize;
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
	 * {@linkplain com.tools20022.repository.entity.Future#mmMinimumSize
	 * Future.mmMinimumSize}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinSz"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the minimum ratio or multiply factor used to convert from contracts to shares."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<ActiveCurrencyAndAmount>> mmMinimumSize = new MMMessageAttribute<Future3, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Future.mmMinimumSize;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "MinSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Future3 obj) {
			return obj.getMinimumSize();
		}

		@Override
		public void setValue(Future3 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMinimumSize(value.orElse(null));
		}
	};
	@XmlElement(name = "UnitOfMeasr")
	protected UnitOfMeasure4Choice unitOfMeasure;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure4Choice
	 * UnitOfMeasure4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmUnitOfMeasure
	 * Future.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 996</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate the measurement unit of the underlying commodity on which the contract is based (for example, 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<UnitOfMeasure4Choice>> mmUnitOfMeasure = new MMMessageAttribute<Future3, Optional<UnitOfMeasure4Choice>>() {
		{
			businessElementTrace_lazy = () -> Future.mmUnitOfMeasure;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "996"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the measurement unit of the underlying commodity on which the contract is based (for example, 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOfMeasure4Choice.mmObject();
		}

		@Override
		public Optional<UnitOfMeasure4Choice> getValue(Future3 obj) {
			return obj.getUnitOfMeasure();
		}

		@Override
		public void setValue(Future3 obj, Optional<UnitOfMeasure4Choice> value) {
			obj.setUnitOfMeasure(value.orElse(null));
		}
	};
	@XmlElement(name = "TmUnit")
	protected TimeUnit3Choice timeUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TimeUnit3Choice
	 * TimeUnit3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule#mmTimeType
	 * FutureRule.mmTimeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 997</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate a time unit for the contract (for example days, weeks, months, etc.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Future3, Optional<TimeUnit3Choice>> mmTimeUnit = new MMMessageAttribute<Future3, Optional<TimeUnit3Choice>>() {
		{
			businessElementTrace_lazy = () -> FutureRule.mmTimeType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "TmUnit";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "997"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeUnit";
			definition = "Used to indicate a time unit for the contract (for example days, weeks, months, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TimeUnit3Choice.mmObject();
		}

		@Override
		public Optional<TimeUnit3Choice> getValue(Future3 obj) {
			return obj.getTimeUnit();
		}

		@Override
		public void setValue(Future3 obj, Optional<TimeUnit3Choice> value) {
			obj.setTimeUnit(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlUndrlygAttrbts")
	protected List<UnderlyingAttributes3> additionalUnderlyingAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnderlyingAttributes3
	 * UnderlyingAttributes3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future3
	 * Future3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlUndrlygAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalUnderlyingAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides more information about the underlying instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Future3, List<UnderlyingAttributes3>> mmAdditionalUnderlyingAttributes = new MMMessageAssociationEnd<Future3, List<UnderlyingAttributes3>>() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> com.tools20022.repository.msg.Future3.mmObject();
			isDerived = false;
			xmlTag = "AddtlUndrlygAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalUnderlyingAttributes";
			definition = "Provides more information about the underlying instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnderlyingAttributes3.mmObject();
		}

		@Override
		public List<UnderlyingAttributes3> getValue(Future3 obj) {
			return obj.getAdditionalUnderlyingAttributes();
		}

		@Override
		public void setValue(Future3 obj, List<UnderlyingAttributes3> value) {
			obj.setAdditionalUnderlyingAttributes(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Future3.mmContractSize, com.tools20022.repository.msg.Future3.mmExercisePrice, com.tools20022.repository.msg.Future3.mmFutureDate,
						com.tools20022.repository.msg.Future3.mmMinimumSize, com.tools20022.repository.msg.Future3.mmUnitOfMeasure, com.tools20022.repository.msg.Future3.mmTimeUnit,
						com.tools20022.repository.msg.Future3.mmAdditionalUnderlyingAttributes);
				trace_lazy = () -> Future.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Future3";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<BaseOneRate> getContractSize() {
		return contractSize == null ? Optional.empty() : Optional.of(contractSize);
	}

	public Future3 setContractSize(BaseOneRate contractSize) {
		this.contractSize = contractSize;
		return this;
	}

	public Optional<Price1> getExercisePrice() {
		return exercisePrice == null ? Optional.empty() : Optional.of(exercisePrice);
	}

	public Future3 setExercisePrice(Price1 exercisePrice) {
		this.exercisePrice = exercisePrice;
		return this;
	}

	public Optional<ISODateTime> getFutureDate() {
		return futureDate == null ? Optional.empty() : Optional.of(futureDate);
	}

	public Future3 setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumSize() {
		return minimumSize == null ? Optional.empty() : Optional.of(minimumSize);
	}

	public Future3 setMinimumSize(ActiveCurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
		return this;
	}

	public Optional<UnitOfMeasure4Choice> getUnitOfMeasure() {
		return unitOfMeasure == null ? Optional.empty() : Optional.of(unitOfMeasure);
	}

	public Future3 setUnitOfMeasure(UnitOfMeasure4Choice unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
		return this;
	}

	public Optional<TimeUnit3Choice> getTimeUnit() {
		return timeUnit == null ? Optional.empty() : Optional.of(timeUnit);
	}

	public Future3 setTimeUnit(TimeUnit3Choice timeUnit) {
		this.timeUnit = timeUnit;
		return this;
	}

	public List<UnderlyingAttributes3> getAdditionalUnderlyingAttributes() {
		return additionalUnderlyingAttributes == null ? additionalUnderlyingAttributes = new ArrayList<>() : additionalUnderlyingAttributes;
	}

	public Future3 setAdditionalUnderlyingAttributes(List<UnderlyingAttributes3> additionalUnderlyingAttributes) {
		this.additionalUnderlyingAttributes = Objects.requireNonNull(additionalUnderlyingAttributes);
		return this;
	}
}