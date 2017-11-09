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
import com.tools20022.repository.choice.TimeUnit2Choice;
import com.tools20022.repository.choice.UnitOfMeasure2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Derivative;
import com.tools20022.repository.entity.Future;
import com.tools20022.repository.entity.FutureRule;
import com.tools20022.repository.entity.SecuritiesConversion;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmContractSize
 * Future2.mmContractSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmExercisePrice
 * Future2.mmExercisePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmFutureDate
 * Future2.mmFutureDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmMinimumSize
 * Future2.mmMinimumSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmUnitOfMeasure
 * Future2.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Future2#mmTimeUnit
 * Future2.mmTimeUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Future2#mmAdditionalUnderlyingAttributes
 * Future2.mmAdditionalUnderlyingAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Future Future}</li>
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
 * "Future2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price."
 * </li>
 * </ul>
 */
public class Future2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BaseOneRate contractSize;
	/**
	 * Ratio or multiplying factor used to convert one contract into a quantity.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
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
	public static final MMMessageAttribute mmContractSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesConversion.mmContractSize;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "CtrctSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractSize";
			definition = "Ratio or multiplying factor used to convert one contract into a quantity.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected Price1 exercisePrice;
	/**
	 * Predetermined price at which the holder of a Future will have to buy or
	 * sell the underlying instrument.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
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
	 * "Predetermined price at which the holder of a Future will have  to buy or sell the underlying instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExercisePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Derivative.mmExercisePrice;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "ExrcPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExercisePrice";
			definition = "Predetermined price at which the holder of a Future will have  to buy or sell the underlying instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Price1.mmObject();
		}
	};
	protected ISODateTime futureDate;
	/**
	 * Date on which future contracts settle.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
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
	public static final MMMessageAttribute mmFutureDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmFutureDate;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "FutrDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureDate";
			definition = "Date on which future contracts settle.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount minimumSize;
	/**
	 * Specifies the minimum ratio or multiply factor used to convert from
	 * contracts to shares.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
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
	public static final MMMessageAttribute mmMinimumSize = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmMinimumSize;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "MinSz";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSize";
			definition = "Specifies the minimum ratio or multiply factor used to convert from contracts to shares.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected UnitOfMeasure2Choice unitOfMeasure;
	/**
	 * Used to indicate the measurement unit of the underlying commodity on
	 * which the contract is based (for example, 2500 lbs of lean cattle, 1000
	 * barrels of crude oil, 1000 bushels of corn, etc.)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOfMeasure2Choice
	 * UnitOfMeasure2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Future#mmUnitOfMeasure
	 * Future.mmUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitOfMeasr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Used to indicate the measurement unit of the underlying commodity on which the contract is based (for example, 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitOfMeasure = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Future.mmUnitOfMeasure;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "UnitOfMeasr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitOfMeasure";
			definition = "Used to indicate the measurement unit of the underlying commodity on which the contract is based (for example, 2500 lbs of lean cattle, 1000 barrels of crude oil, 1000 bushels of corn, etc.)";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnitOfMeasure2Choice.mmObject();
		}
	};
	protected TimeUnit2Choice timeUnit;
	/**
	 * Used to indicate a time unit for the contract (for example days, weeks,
	 * months, etc.).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TimeUnit2Choice
	 * TimeUnit2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FutureRule#mmTimeType
	 * FutureRule.mmTimeType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TmUnit"</li>
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
	public static final MMMessageAttribute mmTimeUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FutureRule.mmTimeType;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "TmUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeUnit";
			definition = "Used to indicate a time unit for the contract (for example days, weeks, months, etc.).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TimeUnit2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnderlyingAttributes2> additionalUnderlyingAttributes;
	/**
	 * Provides more information about the underlying instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnderlyingAttributes2
	 * UnderlyingAttributes2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmUnderlyingAsset
	 * Derivative.mmUnderlyingAsset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Future2
	 * Future2}</li>
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
	public static final MMMessageAssociationEnd mmAdditionalUnderlyingAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Derivative.mmUnderlyingAsset;
			componentContext_lazy = () -> Future2.mmObject();
			isDerived = false;
			xmlTag = "AddtlUndrlygAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalUnderlyingAttributes";
			definition = "Provides more information about the underlying instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnderlyingAttributes2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Future2.mmContractSize, Future2.mmExercisePrice, Future2.mmFutureDate, Future2.mmMinimumSize, Future2.mmUnitOfMeasure, Future2.mmTimeUnit, Future2.mmAdditionalUnderlyingAttributes);
				trace_lazy = () -> Future.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Future2";
				definition = "Parameters for contracts which obligate the buyer to receive and the seller to deliver in the future the assets specified at an agreed price.";
			}
		});
		return mmObject_lazy.get();
	}

	public BaseOneRate getContractSize() {
		return contractSize;
	}

	public void setContractSize(BaseOneRate contractSize) {
		this.contractSize = contractSize;
	}

	public Price1 getExercisePrice() {
		return exercisePrice;
	}

	public void setExercisePrice(com.tools20022.repository.msg.Price1 exercisePrice) {
		this.exercisePrice = exercisePrice;
	}

	public ISODateTime getFutureDate() {
		return futureDate;
	}

	public void setFutureDate(ISODateTime futureDate) {
		this.futureDate = futureDate;
	}

	public ActiveCurrencyAndAmount getMinimumSize() {
		return minimumSize;
	}

	public void setMinimumSize(ActiveCurrencyAndAmount minimumSize) {
		this.minimumSize = minimumSize;
	}

	public UnitOfMeasure2Choice getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasure2Choice unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public TimeUnit2Choice getTimeUnit() {
		return timeUnit;
	}

	public void setTimeUnit(TimeUnit2Choice timeUnit) {
		this.timeUnit = timeUnit;
	}

	public List<UnderlyingAttributes2> getAdditionalUnderlyingAttributes() {
		return additionalUnderlyingAttributes;
	}

	public void setAdditionalUnderlyingAttributes(List<com.tools20022.repository.msg.UnderlyingAttributes2> additionalUnderlyingAttributes) {
		this.additionalUnderlyingAttributes = additionalUnderlyingAttributes;
	}
}