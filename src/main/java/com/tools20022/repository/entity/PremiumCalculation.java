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
import com.tools20022.repository.choice.PremiumQuote1Choice;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.PremiumAmount1;
import com.tools20022.repository.msg.PremiumAmount2;
import com.tools20022.repository.msg.PremiumAmount3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the amount of a premium on a currency option together with its
 * calculation method.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="PremiumCalculation" src="doc-files/PremiumCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.PremiumCalculation#mmOption
 * PremiumCalculation.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPercentageOfCallAmount
 * PremiumCalculation.mmPercentageOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPercentageOfPutAmount
 * PremiumCalculation.mmPercentageOfPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPointsOfCallAmount
 * PremiumCalculation.mmPointsOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPointsOfPutAmount
 * PremiumCalculation.mmPointsOfPutAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumCalculation
 * CurrencyOption.mmPremiumCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount1#mmPremiumQuote
 * PremiumAmount1.mmPremiumQuote}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount2#mmPremiumQuote
 * PremiumAmount2.mmPremiumQuote}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
 * PremiumQuote1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount1 PremiumAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount2 PremiumAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
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
 * "PremiumCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the amount of a premium on a currency option together with its calculation method."
 * </li>
 * </ul>
 */
public class PremiumCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyOption option;
	/**
	 * Option for which a premium is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyOption#mmPremiumCalculation
	 * CurrencyOption.mmPremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyOption
	 * CurrencyOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which a premium is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a premium is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmPremiumCalculation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyOption.mmObject();
		}
	};
	protected PercentageRate percentageOfCallAmount;
	/**
	 * Premium calculation is based on a percentage of the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPercentageOfCallAmount
	 * PremiumQuote1Choice.mmPercentageOfCallAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the call amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfCallAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PremiumQuote1Choice.mmPercentageOfCallAmount);
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfCallAmount";
			definition = "Premium calculation is based on a percentage of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate percentageOfPutAmount;
	/**
	 * Premium calculation is based on a percentage of the put amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPercentageOfPutAmount
	 * PremiumQuote1Choice.mmPercentageOfPutAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the put amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPercentageOfPutAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PremiumQuote1Choice.mmPercentageOfPutAmount);
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageOfPutAmount";
			definition = "Premium calculation is based on a percentage of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected BaseOneRate pointsOfCallAmount;
	/**
	 * Premium calculation is based on points of the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPointsOfCallAmount
	 * PremiumQuote1Choice.mmPointsOfCallAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on points of the call amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPointsOfCallAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PremiumQuote1Choice.mmPointsOfCallAmount);
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfCallAmount";
			definition = "Premium calculation is based on points of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected BaseOneRate pointsOfPutAmount;
	/**
	 * Premium calculation is based on points of the put amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation
	 * PremiumCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPointsOfPutAmount
	 * PremiumQuote1Choice.mmPointsOfPutAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium calculation is based on points of the put amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPointsOfPutAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PremiumQuote1Choice.mmPointsOfPutAmount);
			elementContext_lazy = () -> PremiumCalculation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PointsOfPutAmount";
			definition = "Premium calculation is based on points of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PremiumCalculation";
				definition = "Specifies the amount of a premium on a currency option together with its calculation method.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyOption.mmPremiumCalculation);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PremiumAmount1.mmPremiumQuote, com.tools20022.repository.msg.PremiumAmount2.mmPremiumQuote);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.PremiumCalculation.mmOption, com.tools20022.repository.entity.PremiumCalculation.mmPercentageOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.mmPercentageOfPutAmount, com.tools20022.repository.entity.PremiumCalculation.mmPointsOfCallAmount,
						com.tools20022.repository.entity.PremiumCalculation.mmPointsOfPutAmount);
				derivationComponent_lazy = () -> Arrays.asList(PremiumQuote1Choice.mmObject(), PremiumAmount1.mmObject(), PremiumAmount2.mmObject(), PremiumAmount3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyOption getOption() {
		return option;
	}

	public void setOption(com.tools20022.repository.entity.CurrencyOption option) {
		this.option = option;
	}

	public PercentageRate getPercentageOfCallAmount() {
		return percentageOfCallAmount;
	}

	public void setPercentageOfCallAmount(PercentageRate percentageOfCallAmount) {
		this.percentageOfCallAmount = percentageOfCallAmount;
	}

	public PercentageRate getPercentageOfPutAmount() {
		return percentageOfPutAmount;
	}

	public void setPercentageOfPutAmount(PercentageRate percentageOfPutAmount) {
		this.percentageOfPutAmount = percentageOfPutAmount;
	}

	public BaseOneRate getPointsOfCallAmount() {
		return pointsOfCallAmount;
	}

	public void setPointsOfCallAmount(BaseOneRate pointsOfCallAmount) {
		this.pointsOfCallAmount = pointsOfCallAmount;
	}

	public BaseOneRate getPointsOfPutAmount() {
		return pointsOfPutAmount;
	}

	public void setPointsOfPutAmount(BaseOneRate pointsOfPutAmount) {
		this.pointsOfPutAmount = pointsOfPutAmount;
	}
}