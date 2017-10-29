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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Value expressed as an amount or a quantity. For example, the value of a
 * financial instrument.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmountAndQuantity" src="doc-files/AmountAndQuantity.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#SecuritiesPricing
 * AmountAndQuantity.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndQuantity#Amount
 * AmountAndQuantity.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndQuantity#Quantity
 * AmountAndQuantity.Quantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#AmountToQuantity
 * RatioFormat4Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#QuantityToAmount
 * RatioFormat4Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#AmountToQuantity
 * RatioFormat8Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#QuantityToAmount
 * RatioFormat8Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#QuantityToAmount
 * RatioFormat15Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#QuantityToAmount
 * RatioFormat16Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice#AmountToQuantity
 * SolicitationFeeRateFormat1Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#AmountToQuantity
 * RatioFormat6Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#QuantityToAmount
 * RatioFormat6Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice#AmountToQuantity
 * SolicitationFeeRateFormat2Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#AmountToQuantity
 * RatioFormat10Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#QuantityToAmount
 * RatioFormat10Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#AmountToQuantity
 * RatioFormat12Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#QuantityToAmount
 * RatioFormat12Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice#AmountToQuantity
 * SolicitationFeeRateFormat3Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#AmountToQuantity
 * RatioFormat14Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#QuantityToAmount
 * RatioFormat14Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice#AmountToQuantity
 * SolicitationFeeRateFormat4Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#AmountToQuantity
 * SolicitationFeeRateFormat5Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#AmountToQuantity
 * SolicitationFeeRateFormat6Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#AmountToQuantity
 * RatioFormat2Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#QuantityToAmount
 * RatioFormat2Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#AmountToQuantity
 * RatioFormat19Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#QuantityToAmount
 * RatioFormat19Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#AmountToQuantity
 * SolicitationFeeRateFormat7Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#AmountToQuantity
 * RatioFormat18Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#QuantityToAmount
 * RatioFormat18Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#AmountToQuantity
 * SolicitationFeeRateFormat8Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#AmountToQuantity
 * RatioFormat22Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#QuantityToAmount
 * RatioFormat22Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#AmountToQuantity
 * SolicitationFeeRateFormat10Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#AmountToQuantity
 * RatioFormat24Choice.AmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#QuantityToAmount
 * RatioFormat24Choice.QuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#AmountToQuantity
 * SolicitationFeeRateFormat9Choice.AmountToQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2
 * AmountAndQuantityRatio2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3
 * AmountAndQuantityRatio3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1
 * AmountAndQuantityRatio1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4
 * AmountAndQuantityRatio4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5
 * AmountAndQuantityRatio5}</li>
 * </ul>
 * </li>
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
 * "AmountAndQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Value expressed as an amount or a quantity. For example, the value of a financial instrument."
 * </li>
 * </ul>
 */
public class AmountAndQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Pricing which uses the amount and quantity as format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing which uses the amount and quantity as format."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses the amount and quantity as format.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * A number of monetary units specified in a currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2#Amount
	 * AmountAndQuantityRatio2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3#Amount
	 * AmountAndQuantityRatio3.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1#Amount
	 * AmountAndQuantityRatio1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4#Amount
	 * AmountAndQuantityRatio4.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5#Amount
	 * AmountAndQuantityRatio5.Amount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A number of monetary units specified in a currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndQuantityRatio2.Amount, com.tools20022.repository.msg.AmountAndQuantityRatio3.Amount, com.tools20022.repository.msg.AmountAndQuantityRatio1.Amount,
					com.tools20022.repository.msg.AmountAndQuantityRatio4.Amount, com.tools20022.repository.msg.AmountAndQuantityRatio5.Amount);
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "A number of monetary units specified in a currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * A number of non-monetary units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2#Quantity
	 * AmountAndQuantityRatio2.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3#Quantity
	 * AmountAndQuantityRatio3.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1#Quantity
	 * AmountAndQuantityRatio1.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4#Quantity
	 * AmountAndQuantityRatio4.Quantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5#Quantity
	 * AmountAndQuantityRatio5.Quantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A number of non-monetary units."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Quantity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndQuantityRatio2.Quantity, com.tools20022.repository.msg.AmountAndQuantityRatio3.Quantity,
					com.tools20022.repository.msg.AmountAndQuantityRatio1.Quantity, com.tools20022.repository.msg.AmountAndQuantityRatio4.Quantity, com.tools20022.repository.msg.AmountAndQuantityRatio5.Quantity);
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "A number of non-monetary units.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountAndQuantity";
				definition = "Value expressed as an amount or a quantity. For example, the value of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RatioFormat4Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat4Choice.QuantityToAmount,
						com.tools20022.repository.choice.RatioFormat8Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat8Choice.QuantityToAmount, com.tools20022.repository.choice.RatioFormat15Choice.QuantityToAmount,
						com.tools20022.repository.choice.RatioFormat16Choice.QuantityToAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat6Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat6Choice.QuantityToAmount,
						com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat10Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat10Choice.QuantityToAmount, com.tools20022.repository.choice.RatioFormat12Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat12Choice.QuantityToAmount,
						com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat14Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat14Choice.QuantityToAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice.AmountToQuantity,
						com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice.AmountToQuantity, com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat2Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat2Choice.QuantityToAmount, com.tools20022.repository.choice.RatioFormat19Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat19Choice.QuantityToAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat18Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat18Choice.QuantityToAmount,
						com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat22Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat22Choice.QuantityToAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice.AmountToQuantity,
						com.tools20022.repository.choice.RatioFormat24Choice.AmountToQuantity, com.tools20022.repository.choice.RatioFormat24Choice.QuantityToAmount,
						com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice.AmountToQuantity);
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.AmountAndQuantity.SecuritiesPricing, com.tools20022.repository.entity.AmountAndQuantity.Amount, com.tools20022.repository.entity.AmountAndQuantity.Quantity);
				derivationComponent_lazy = () -> Arrays.asList(AmountAndQuantityRatio2.mmObject(), AmountAndQuantityRatio3.mmObject(), AmountAndQuantityRatio1.mmObject(), AmountAndQuantityRatio4.mmObject(),
						AmountAndQuantityRatio5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}