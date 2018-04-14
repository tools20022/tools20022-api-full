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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ImpliedCurrencyAnd20Amount;
import com.tools20022.repository.datatype.LongDecimalNumberFraction21;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the format for the quantity of security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice#mmUnit
 * FinancialInstrumentQuantity30Choice.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice#mmNominalValue
 * FinancialInstrumentQuantity30Choice.mmNominalValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice#mmMonetaryValue
 * FinancialInstrumentQuantity30Choice.mmMonetaryValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantity30Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the format for the quantity of security."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrumentQuantity30Choice", propOrder = {"unit", "nominalValue", "monetaryValue"})
public class FinancialInstrumentQuantity30Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Unit", required = true)
	protected LongDecimalNumberFraction21 unit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LongDecimalNumberFraction21
	 * LongDecimalNumberFraction21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice
	 * FinancialInstrumentQuantity30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a number, such as a number of shares."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity30Choice, LongDecimalNumberFraction21> mmUnit = new MMMessageAttribute<FinancialInstrumentQuantity30Choice, LongDecimalNumberFraction21>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Quantity expressed as a number, such as a number of shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> LongDecimalNumberFraction21.mmObject();
		}

		@Override
		public LongDecimalNumberFraction21 getValue(FinancialInstrumentQuantity30Choice obj) {
			return obj.getUnit();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity30Choice obj, LongDecimalNumberFraction21 value) {
			obj.setUnit(value);
		}
	};
	@XmlElement(name = "NmnlVal", required = true)
	protected ImpliedCurrencyAnd20Amount nominalValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAnd20Amount
	 * ImpliedCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice
	 * FinancialInstrumentQuantity30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmnlVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that quantity is expressed as a nominal value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity30Choice, ImpliedCurrencyAnd20Amount> mmNominalValue = new MMMessageAttribute<FinancialInstrumentQuantity30Choice, ImpliedCurrencyAnd20Amount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmObject();
			isDerived = false;
			xmlTag = "NmnlVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NominalValue";
			definition = "Indicates that quantity is expressed as a nominal value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAnd20Amount.mmObject();
		}

		@Override
		public ImpliedCurrencyAnd20Amount getValue(FinancialInstrumentQuantity30Choice obj) {
			return obj.getNominalValue();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity30Choice obj, ImpliedCurrencyAnd20Amount value) {
			obj.setNominalValue(value);
		}
	};
	@XmlElement(name = "MntryVal", required = true)
	protected ImpliedCurrencyAnd20Amount monetaryValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAnd20Amount
	 * ImpliedCurrencyAnd20Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice
	 * FinancialInstrumentQuantity30Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntryVal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetaryValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that quantity is expressed as a monetary value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstrumentQuantity30Choice, ImpliedCurrencyAnd20Amount> mmMonetaryValue = new MMMessageAttribute<FinancialInstrumentQuantity30Choice, ImpliedCurrencyAnd20Amount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmObject();
			isDerived = false;
			xmlTag = "MntryVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryValue";
			definition = "Indicates that quantity is expressed as a monetary value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAnd20Amount.mmObject();
		}

		@Override
		public ImpliedCurrencyAnd20Amount getValue(FinancialInstrumentQuantity30Choice obj) {
			return obj.getMonetaryValue();
		}

		@Override
		public void setValue(FinancialInstrumentQuantity30Choice obj, ImpliedCurrencyAnd20Amount value) {
			obj.setMonetaryValue(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmUnit, com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmNominalValue,
						com.tools20022.repository.choice.FinancialInstrumentQuantity30Choice.mmMonetaryValue);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FinancialInstrumentQuantity30Choice";
				definition = "Defines the format for the quantity of security.";
			}
		});
		return mmObject_lazy.get();
	}

	public LongDecimalNumberFraction21 getUnit() {
		return unit;
	}

	public FinancialInstrumentQuantity30Choice setUnit(LongDecimalNumberFraction21 unit) {
		this.unit = Objects.requireNonNull(unit);
		return this;
	}

	public ImpliedCurrencyAnd20Amount getNominalValue() {
		return nominalValue;
	}

	public FinancialInstrumentQuantity30Choice setNominalValue(ImpliedCurrencyAnd20Amount nominalValue) {
		this.nominalValue = Objects.requireNonNull(nominalValue);
		return this;
	}

	public ImpliedCurrencyAnd20Amount getMonetaryValue() {
		return monetaryValue;
	}

	public FinancialInstrumentQuantity30Choice setMonetaryValue(ImpliedCurrencyAnd20Amount monetaryValue) {
		this.monetaryValue = Objects.requireNonNull(monetaryValue);
		return this;
	}
}