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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmUnit
 * FinancialInstrumentQuantity25Choice.mmUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmNominalValue
 * FinancialInstrumentQuantity25Choice.mmNominalValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice#mmMonetaryValue
 * FinancialInstrumentQuantity25Choice.mmMonetaryValue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrumentQuantity25Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the format for the quantity of security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrumentQuantity25Choice", propOrder = {"unit", "nominalValue", "monetaryValue"})
public class FinancialInstrumentQuantity25Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected DecimalNumber unit;
	/**
	 * Quantity expressed as a number, such as a number of shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice
	 * FinancialInstrumentQuantity25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity expressed as a number, such as a number of shares."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> FinancialInstrumentQuantity25Choice.mmObject();
			isDerived = false;
			xmlTag = "Unit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unit";
			definition = "Quantity expressed as a number, such as a number of shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount nominalValue;
	/**
	 * TBC
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmFaceAmount
	 * AssetHolding.mmFaceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice
	 * FinancialInstrumentQuantity25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmnlVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TBC"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNominalValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmFaceAmount;
			componentContext_lazy = () -> FinancialInstrumentQuantity25Choice.mmObject();
			isDerived = false;
			xmlTag = "NmnlVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NominalValue";
			definition = "TBC";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount monetaryValue;
	/**
	 * TBC
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmAmortisedFaceValue
	 * AssetHolding.mmAmortisedFaceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity25Choice
	 * FinancialInstrumentQuantity25Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntryVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetaryValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "TBC"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMonetaryValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmAmortisedFaceValue;
			componentContext_lazy = () -> FinancialInstrumentQuantity25Choice.mmObject();
			isDerived = false;
			xmlTag = "MntryVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryValue";
			definition = "TBC";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrumentQuantity25Choice.mmUnit, FinancialInstrumentQuantity25Choice.mmNominalValue, FinancialInstrumentQuantity25Choice.mmMonetaryValue);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrumentQuantity25Choice";
				definition = "Defines the format for the quantity of security.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Unit", required = true)
	public DecimalNumber getUnit() {
		return unit;
	}

	public void setUnit(DecimalNumber unit) {
		this.unit = unit;
	}

	@XmlElement(name = "NmnlVal", required = true)
	public ActiveOrHistoricCurrencyAndAmount getNominalValue() {
		return nominalValue;
	}

	public void setNominalValue(ActiveOrHistoricCurrencyAndAmount nominalValue) {
		this.nominalValue = nominalValue;
	}

	@XmlElement(name = "MntryVal", required = true)
	public ActiveOrHistoricCurrencyAndAmount getMonetaryValue() {
		return monetaryValue;
	}

	public void setMonetaryValue(ActiveOrHistoricCurrencyAndAmount monetaryValue) {
		this.monetaryValue = monetaryValue;
	}
}