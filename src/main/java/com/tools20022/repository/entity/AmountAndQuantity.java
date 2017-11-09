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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#mmAmountToQuantity
 * RatioFormat4Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#mmQuantityToAmount
 * RatioFormat4Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#mmAmountToQuantity
 * RatioFormat8Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#mmQuantityToAmount
 * RatioFormat8Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmQuantityToAmount
 * RatioFormat15Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#mmQuantityToAmount
 * RatioFormat16Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat1Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#mmAmountToQuantity
 * RatioFormat6Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#mmQuantityToAmount
 * RatioFormat6Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat2Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#mmAmountToQuantity
 * RatioFormat10Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#mmQuantityToAmount
 * RatioFormat10Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#mmAmountToQuantity
 * RatioFormat12Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#mmQuantityToAmount
 * RatioFormat12Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat3Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#mmAmountToQuantity
 * RatioFormat14Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#mmQuantityToAmount
 * RatioFormat14Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat4Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat5Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat6Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmAmountToQuantity
 * RatioFormat2Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmQuantityToAmount
 * RatioFormat2Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmAmountToQuantity
 * RatioFormat19Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmQuantityToAmount
 * RatioFormat19Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat7Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#mmAmountToQuantity
 * RatioFormat18Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#mmQuantityToAmount
 * RatioFormat18Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat8Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#mmAmountToQuantity
 * RatioFormat22Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#mmQuantityToAmount
 * RatioFormat22Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat10Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToQuantity
 * RatioFormat24Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToAmount
 * RatioFormat24Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#mmAmountToQuantity
 * SolicitationFeeRateFormat9Choice.mmAmountToQuantity}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
 * AmountAndQuantity.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmAmount
 * AmountAndQuantity.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmQuantity
 * AmountAndQuantity.mmQuantity}</li>
 * </ul>
 * </li>
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
 * "AmountAndQuantity"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Value expressed as an amount or a quantity. For example, the value of a financial instrument."
 * </li>
 * </ul>
 */
public class AmountAndQuantity {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing securitiesPricing;
	/**
	 * Pricing which uses the amount and quantity as format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses the amount and quantity as format.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2#mmAmount
	 * AmountAndQuantityRatio2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3#mmAmount
	 * AmountAndQuantityRatio3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1#mmAmount
	 * AmountAndQuantityRatio1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4#mmAmount
	 * AmountAndQuantityRatio4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5#mmAmount
	 * AmountAndQuantityRatio5.mmAmount}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndQuantityRatio2.mmAmount, AmountAndQuantityRatio3.mmAmount, AmountAndQuantityRatio1.mmAmount, AmountAndQuantityRatio4.mmAmount, AmountAndQuantityRatio5.mmAmount);
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "A number of monetary units specified in a currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected DecimalNumber quantity;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2#mmQuantity
	 * AmountAndQuantityRatio2.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio3#mmQuantity
	 * AmountAndQuantityRatio3.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1#mmQuantity
	 * AmountAndQuantityRatio1.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio4#mmQuantity
	 * AmountAndQuantityRatio4.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5#mmQuantity
	 * AmountAndQuantityRatio5.mmQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmQuantity = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndQuantityRatio2.mmQuantity, AmountAndQuantityRatio3.mmQuantity, AmountAndQuantityRatio1.mmQuantity, AmountAndQuantityRatio4.mmQuantity, AmountAndQuantityRatio5.mmQuantity);
			elementContext_lazy = () -> AmountAndQuantity.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "A number of non-monetary units.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountAndQuantity";
				definition = "Value expressed as an amount or a quantity. For example, the value of a financial instrument.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity);
				derivationElement_lazy = () -> Arrays.asList(RatioFormat4Choice.mmAmountToQuantity, RatioFormat4Choice.mmQuantityToAmount, RatioFormat8Choice.mmAmountToQuantity, RatioFormat8Choice.mmQuantityToAmount,
						RatioFormat15Choice.mmQuantityToAmount, RatioFormat16Choice.mmQuantityToAmount, SolicitationFeeRateFormat1Choice.mmAmountToQuantity, RatioFormat6Choice.mmAmountToQuantity, RatioFormat6Choice.mmQuantityToAmount,
						SolicitationFeeRateFormat2Choice.mmAmountToQuantity, RatioFormat10Choice.mmAmountToQuantity, RatioFormat10Choice.mmQuantityToAmount, RatioFormat12Choice.mmAmountToQuantity, RatioFormat12Choice.mmQuantityToAmount,
						SolicitationFeeRateFormat3Choice.mmAmountToQuantity, RatioFormat14Choice.mmAmountToQuantity, RatioFormat14Choice.mmQuantityToAmount, SolicitationFeeRateFormat4Choice.mmAmountToQuantity,
						SolicitationFeeRateFormat5Choice.mmAmountToQuantity, SolicitationFeeRateFormat6Choice.mmAmountToQuantity, RatioFormat2Choice.mmAmountToQuantity, RatioFormat2Choice.mmQuantityToAmount,
						RatioFormat19Choice.mmAmountToQuantity, RatioFormat19Choice.mmQuantityToAmount, SolicitationFeeRateFormat7Choice.mmAmountToQuantity, RatioFormat18Choice.mmAmountToQuantity, RatioFormat18Choice.mmQuantityToAmount,
						SolicitationFeeRateFormat8Choice.mmAmountToQuantity, RatioFormat22Choice.mmAmountToQuantity, RatioFormat22Choice.mmQuantityToAmount, SolicitationFeeRateFormat10Choice.mmAmountToQuantity,
						RatioFormat24Choice.mmAmountToQuantity, RatioFormat24Choice.mmQuantityToAmount, SolicitationFeeRateFormat9Choice.mmAmountToQuantity);
				element_lazy = () -> Arrays.asList(AmountAndQuantity.mmSecuritiesPricing, AmountAndQuantity.mmAmount, AmountAndQuantity.mmQuantity);
				derivationComponent_lazy = () -> Arrays.asList(AmountAndQuantityRatio2.mmObject(), AmountAndQuantityRatio3.mmObject(), AmountAndQuantityRatio1.mmObject(), AmountAndQuantityRatio4.mmObject(),
						AmountAndQuantityRatio5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public void setSecuritiesPricing(com.tools20022.repository.entity.SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = securitiesPricing;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public DecimalNumber getQuantity() {
		return quantity;
	}

	public void setQuantity(DecimalNumber quantity) {
		this.quantity = quantity;
	}
}