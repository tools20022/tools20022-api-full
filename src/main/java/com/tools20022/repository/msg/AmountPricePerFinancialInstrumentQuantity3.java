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
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.codeset.AmountPriceType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#AmountPriceType
 * AmountPricePerFinancialInstrumentQuantity3.AmountPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#PriceValue
 * AmountPricePerFinancialInstrumentQuantity3.PriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3#FinancialInstrumentQuantity
 * AmountPricePerFinancialInstrumentQuantity3.FinancialInstrumentQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountPricePerFinancialInstrumentQuantity3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a ratio: amount price per financial instrument quantity."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6
 * AmountPricePerFinancialInstrumentQuantity6}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AmountPricePerFinancialInstrumentQuantity3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Type of amount price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceType1Code
	 * AmountPriceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#TypeOfAmount
	 * SecuritiesPricing.TypeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#AmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity6.AmountPriceType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute AmountPriceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.TypeOfAmount;
			isDerived = false;
			xmlTag = "AmtPricTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPriceType";
			definition = "Type of amount price.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.AmountPriceType);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AmountPriceType1Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Price
	 * SecuritiesPricing.Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#PriceValue
	 * AmountPricePerFinancialInstrumentQuantity6.PriceValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute PriceValue = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Price;
			isDerived = false;
			xmlTag = "PricVal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceValue";
			definition = "Value of the price.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.PriceValue);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	/**
	 * Quantity of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#SecuritiesQuantity
	 * Security.SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#FinancialInstrumentQuantity
	 * AmountPricePerFinancialInstrumentQuantity6.FinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd FinancialInstrumentQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Security.SecuritiesQuantity;
			isDerived = false;
			xmlTag = "FinInstrmQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			definition = "Quantity of financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6.FinancialInstrumentQuantity);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.AmountPriceType, com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.PriceValue,
						com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3.FinancialInstrumentQuantity);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AmountPricePerFinancialInstrumentQuantity3";
				definition = "Specifies a ratio: amount price per financial instrument quantity.";
				nextVersions_lazy = () -> Arrays.asList(AmountPricePerFinancialInstrumentQuantity6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}