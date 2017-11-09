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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountToAmountRatio1;
import com.tools20022.repository.msg.AmountToAmountRatio2;
import com.tools20022.repository.msg.AmountToAmountRatio3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Ratio expressed as a quotient of amounts.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AmountRatio" src="doc-files/AmountRatio.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AmountToAmountRatio2
 * AmountToAmountRatio2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountToAmountRatio3
 * AmountToAmountRatio3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountToAmountRatio1
 * AmountToAmountRatio1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
 * SecuritiesPricing.mmAmountPricePerAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice#mmAmountToAmount
 * RatioFormat3Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#mmAmountToAmount
 * RatioFormat4Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice#mmAmountToAmount
 * RatioFormat7Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#mmAmountToAmount
 * RatioFormat8Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmAmountToAmount
 * RatioFormat15Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#mmAmountToAmount
 * RatioFormat16Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice#mmAmountToAmount
 * RatioFormat5Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#mmAmountToAmount
 * RatioFormat6Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice#mmAmountToAmount
 * RatioFormat9Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#mmAmountToAmount
 * RatioFormat10Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice#mmAmountToAmount
 * RatioFormat11Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#mmAmountToAmount
 * RatioFormat12Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice#mmAmountToAmount
 * RatioFormat13Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#mmAmountToAmount
 * RatioFormat14Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmAmountToAmount
 * RatioFormat2Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice#mmAmountToAmount
 * RatioFormat1Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmAmountToAmount
 * RatioFormat19Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#mmAmountToAmount
 * RatioFormat17Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#mmAmountToAmount
 * RatioFormat18Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat20Choice#mmAmountToAmount
 * RatioFormat20Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#mmAmountToAmount
 * RatioFormat22Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToAmount
 * RatioFormat24Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat23Choice#mmAmountToAmount
 * RatioFormat23Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat21Choice#mmAmountToAmount
 * RatioFormat21Choice.mmAmountToAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
 * AmountRatio.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRatio#mmAmount1
 * AmountRatio.mmAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRatio#mmAmount2
 * AmountRatio.mmAmount2}</li>
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
 * "AmountRatio"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Ratio expressed as a quotient of amounts."</li>
 * </ul>
 */
public class AmountRatio {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesPricing securitiesPricing;
	/**
	 * Pricing which uses the ratio as format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
	 * SecuritiesPricing.mmAmountPricePerAmount}</li>
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
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing which uses the ratio as format."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses the ratio as format.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerAmount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount1;
	/**
	 * Numerator of the quotient of amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#mmAmount1
	 * AmountToAmountRatio2.mmAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3#mmAmount1
	 * AmountToAmountRatio3.mmAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio1#mmAmount1
	 * AmountToAmountRatio1.mmAmount1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Numerator of the quotient of amounts."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount1 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountToAmountRatio2.mmAmount1, AmountToAmountRatio3.mmAmount1, AmountToAmountRatio1.mmAmount1);
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount1";
			definition = "Numerator of the quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount2;
	/**
	 * Denominator of the quotient of amounts
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#mmAmount2
	 * AmountToAmountRatio2.mmAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3#mmAmount2
	 * AmountToAmountRatio3.mmAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio1#mmAmount2
	 * AmountToAmountRatio1.mmAmount2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denominator of the quotient of amounts"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount2 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountToAmountRatio2.mmAmount2, AmountToAmountRatio3.mmAmount2, AmountToAmountRatio1.mmAmount2);
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount2";
			definition = "Denominator of the quotient of amounts";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountRatio";
				definition = "Ratio expressed as a quotient of amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerAmount);
				derivationElement_lazy = () -> Arrays.asList(RatioFormat3Choice.mmAmountToAmount, RatioFormat4Choice.mmAmountToAmount, RatioFormat7Choice.mmAmountToAmount, RatioFormat8Choice.mmAmountToAmount,
						RatioFormat15Choice.mmAmountToAmount, RatioFormat16Choice.mmAmountToAmount, RatioFormat5Choice.mmAmountToAmount, RatioFormat6Choice.mmAmountToAmount, RatioFormat9Choice.mmAmountToAmount,
						RatioFormat10Choice.mmAmountToAmount, RatioFormat11Choice.mmAmountToAmount, RatioFormat12Choice.mmAmountToAmount, RatioFormat13Choice.mmAmountToAmount, RatioFormat14Choice.mmAmountToAmount,
						RatioFormat2Choice.mmAmountToAmount, RatioFormat1Choice.mmAmountToAmount, RatioFormat19Choice.mmAmountToAmount, RatioFormat17Choice.mmAmountToAmount, RatioFormat18Choice.mmAmountToAmount,
						RatioFormat20Choice.mmAmountToAmount, RatioFormat22Choice.mmAmountToAmount, RatioFormat24Choice.mmAmountToAmount, RatioFormat23Choice.mmAmountToAmount, RatioFormat21Choice.mmAmountToAmount);
				element_lazy = () -> Arrays.asList(AmountRatio.mmSecuritiesPricing, AmountRatio.mmAmount1, AmountRatio.mmAmount2);
				derivationComponent_lazy = () -> Arrays.asList(AmountToAmountRatio2.mmObject(), AmountToAmountRatio3.mmObject(), AmountToAmountRatio1.mmObject());
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

	public ActiveCurrencyAndAmount getAmount1() {
		return amount1;
	}

	public void setAmount1(ActiveCurrencyAndAmount amount1) {
		this.amount1 = amount1;
	}

	public ActiveCurrencyAndAmount getAmount2() {
		return amount2;
	}

	public void setAmount2(ActiveCurrencyAndAmount amount2) {
		this.amount2 = amount2;
	}
}