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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#SecuritiesPricing
 * AmountRatio.SecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRatio#Amount1
 * AmountRatio.Amount1}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AmountRatio#Amount2
 * AmountRatio.Amount2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerAmount
 * SecuritiesPricing.AmountPricePerAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat3Choice#AmountToAmount
 * RatioFormat3Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice#AmountToAmount
 * RatioFormat4Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat7Choice#AmountToAmount
 * RatioFormat7Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat8Choice#AmountToAmount
 * RatioFormat8Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#AmountToAmount
 * RatioFormat15Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat16Choice#AmountToAmount
 * RatioFormat16Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat5Choice#AmountToAmount
 * RatioFormat5Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat6Choice#AmountToAmount
 * RatioFormat6Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat9Choice#AmountToAmount
 * RatioFormat9Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat10Choice#AmountToAmount
 * RatioFormat10Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat11Choice#AmountToAmount
 * RatioFormat11Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat12Choice#AmountToAmount
 * RatioFormat12Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat13Choice#AmountToAmount
 * RatioFormat13Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat14Choice#AmountToAmount
 * RatioFormat14Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#AmountToAmount
 * RatioFormat2Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice#AmountToAmount
 * RatioFormat1Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#AmountToAmount
 * RatioFormat19Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#AmountToAmount
 * RatioFormat17Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat18Choice#AmountToAmount
 * RatioFormat18Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat20Choice#AmountToAmount
 * RatioFormat20Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat22Choice#AmountToAmount
 * RatioFormat22Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#AmountToAmount
 * RatioFormat24Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat23Choice#AmountToAmount
 * RatioFormat23Choice.AmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat21Choice#AmountToAmount
 * RatioFormat21Choice.AmountToAmount}</li>
 * </ul>
 * </li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	/**
	 * Pricing which uses the ratio as format.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerAmount
	 * SecuritiesPricing.AmountPricePerAmount}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing which uses the ratio as format.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#Amount1
	 * AmountToAmountRatio2.Amount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3#Amount1
	 * AmountToAmountRatio3.Amount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio1#Amount1
	 * AmountToAmountRatio1.Amount1}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
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
	public static final MMBusinessAttribute Amount1 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountToAmountRatio2.Amount1, com.tools20022.repository.msg.AmountToAmountRatio3.Amount1, com.tools20022.repository.msg.AmountToAmountRatio1.Amount1);
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount1";
			definition = "Numerator of the quotient of amounts.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2#Amount2
	 * AmountToAmountRatio2.Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3#Amount2
	 * AmountToAmountRatio3.Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio1#Amount2
	 * AmountToAmountRatio1.Amount2}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
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
	public static final MMBusinessAttribute Amount2 = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountToAmountRatio2.Amount2, com.tools20022.repository.msg.AmountToAmountRatio3.Amount2, com.tools20022.repository.msg.AmountToAmountRatio1.Amount2);
			elementContext_lazy = () -> AmountRatio.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount2";
			definition = "Denominator of the quotient of amounts";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AmountRatio";
				definition = "Ratio expressed as a quotient of amounts.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RatioFormat3Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat4Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat7Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat8Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat15Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat16Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat5Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat6Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat9Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat10Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat11Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat12Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat13Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat14Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat2Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat1Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat19Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat17Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat18Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat20Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat22Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat24Choice.AmountToAmount, com.tools20022.repository.choice.RatioFormat23Choice.AmountToAmount,
						com.tools20022.repository.choice.RatioFormat21Choice.AmountToAmount);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AmountRatio.SecuritiesPricing, com.tools20022.repository.entity.AmountRatio.Amount1, com.tools20022.repository.entity.AmountRatio.Amount2);
				derivationComponent_lazy = () -> Arrays.asList(AmountToAmountRatio2.mmObject(), AmountToAmountRatio3.mmObject(), AmountToAmountRatio1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}