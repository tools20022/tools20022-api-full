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
import com.tools20022.repository.choice.AmountPriceType1FormatChoice;
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a ratio: amount price per financial instrument quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmAmountPriceType
 * AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmPriceValue
 * AmountPricePerFinancialInstrumentQuantity1.mmPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmFinancialInstrumentQuantity
 * AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "AmountPricePerFinancialInstrumentQuantity1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a ratio: amount price per financial instrument quantity."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AmountPricePerFinancialInstrumentQuantity1", propOrder = {"amountPriceType", "priceValue", "financialInstrumentQuantity"})
public class AmountPricePerFinancialInstrumentQuantity1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountPriceType1FormatChoice amountPriceType;
	/**
	 * Type of amount price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice
	 * AmountPriceType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
	 * SecuritiesPricing.mmTypeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1
	 * AmountPricePerFinancialInstrumentQuantity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of amount price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountPriceType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmTypeOfAmount;
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity1.mmObject();
			isDerived = false;
			xmlTag = "AmtPricTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPriceType";
			definition = "Type of amount price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountPriceType1FormatChoice.mmObject();
		}
	};
	protected ActiveCurrencyAnd13DecimalAmount priceValue;
	/**
	 * Value of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1
	 * AmountPricePerFinancialInstrumentQuantity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity1.mmObject();
			isDerived = false;
			xmlTag = "PricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceValue";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice financialInstrumentQuantity;
	/**
	 * Quantity of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmSecuritiesQuantity
	 * Security.mmSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1
	 * AmountPricePerFinancialInstrumentQuantity1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmSecuritiesQuantity;
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity1.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity1.mmPriceValue,
						AmountPricePerFinancialInstrumentQuantity1.mmFinancialInstrumentQuantity);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountPricePerFinancialInstrumentQuantity1";
				definition = "Specifies a ratio: amount price per financial instrument quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AmtPricTp", required = true)
	public AmountPriceType1FormatChoice getAmountPriceType() {
		return amountPriceType;
	}

	public void setAmountPriceType(AmountPriceType1FormatChoice amountPriceType) {
		this.amountPriceType = amountPriceType;
	}

	@XmlElement(name = "PricVal", required = true)
	public ActiveCurrencyAnd13DecimalAmount getPriceValue() {
		return priceValue;
	}

	public void setPriceValue(ActiveCurrencyAnd13DecimalAmount priceValue) {
		this.priceValue = priceValue;
	}

	@XmlElement(name = "FinInstrmQty", required = true)
	public UnitOrFaceAmount1Choice getFinancialInstrumentQuantity() {
		return financialInstrumentQuantity;
	}

	public void setFinancialInstrumentQuantity(UnitOrFaceAmount1Choice financialInstrumentQuantity) {
		this.financialInstrumentQuantity = financialInstrumentQuantity;
	}
}