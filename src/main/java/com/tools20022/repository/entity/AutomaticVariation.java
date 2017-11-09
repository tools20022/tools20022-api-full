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
import com.tools20022.repository.codeset.VariationTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndTrigger1;
import com.tools20022.repository.msg.AutomaticVariation1;
import com.tools20022.repository.msg.Trigger1;
import com.tools20022.repository.msg.UndertakingAmount4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Predefined variations that may be attributable to an undertaking such as a
 * guarantee or standby letter of credit.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AutomaticVariation" src="doc-files/AutomaticVariation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Trigger1 Trigger1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndTrigger1
 * AmountAndTrigger1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AutomaticVariation1
 * AutomaticVariation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
 * Undertaking.mmPredefinedVariation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trigger#mmAutomaticVariation
 * Trigger.mmAutomaticVariation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AutomaticVariation1#mmAmountAndTrigger
 * AutomaticVariation1.mmAmountAndTrigger}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmUndertaking
 * AutomaticVariation.mmUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AutomaticVariation#mmType
 * AutomaticVariation.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmVariationAmount
 * AutomaticVariation.mmVariationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AutomaticVariation#mmTrigger
 * AutomaticVariation.mmTrigger}</li>
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
 * "AutomaticVariation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Predefined variations that may be attributable to an undertaking such as a guarantee or standby letter of credit."
 * </li>
 * </ul>
 */
public class AutomaticVariation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Undertaking undertaking;
	/**
	 * Undertaking for which a predefined variation is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmPredefinedVariation
	 * Undertaking.mmPredefinedVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Undertaking for which a predefined variation is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a predefined variation is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.mmPredefinedVariation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
		}
	};
	protected VariationTypeCode type;
	/**
	 * Type of predefined variation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VariationTypeCode
	 * VariationTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AutomaticVariation1#mmType
	 * AutomaticVariation1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of predefined variation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AutomaticVariation1.mmType);
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of predefined variation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> VariationTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount variationAmount;
	/**
	 * Variation specified as a monetary amount increase or decrease to the
	 * undertaking amount.
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
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmount4#mmVariationAmount
	 * UndertakingAmount4.mmVariationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndTrigger1#mmAmountDetailsChoice
	 * AmountAndTrigger1.mmAmountDetailsChoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Variation specified as a monetary amount increase or decrease to the undertaking amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmVariationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UndertakingAmount4.mmVariationAmount, AmountAndTrigger1.mmAmountDetailsChoice);
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VariationAmount";
			definition = "Variation specified as a monetary amount increase or decrease to the undertaking amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Trigger trigger;
	/**
	 * Trigger that causes the variation to come into effect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trigger#mmAutomaticVariation
	 * Trigger.mmAutomaticVariation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trigger Trigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AutomaticVariation
	 * AutomaticVariation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndTrigger1#mmTrigger
	 * AmountAndTrigger1.mmTrigger}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger that causes the variation to come into effect."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrigger = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndTrigger1.mmTrigger);
			elementContext_lazy = () -> AutomaticVariation.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trigger";
			definition = "Trigger that causes the variation to come into effect.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trigger.mmAutomaticVariation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trigger.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AutomaticVariation";
				definition = "Predefined variations that may be attributable to an undertaking such as a guarantee or standby letter of credit.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.mmPredefinedVariation, com.tools20022.repository.entity.Trigger.mmAutomaticVariation);
				derivationElement_lazy = () -> Arrays.asList(AutomaticVariation1.mmAmountAndTrigger);
				element_lazy = () -> Arrays.asList(AutomaticVariation.mmUndertaking, AutomaticVariation.mmType, AutomaticVariation.mmVariationAmount, AutomaticVariation.mmTrigger);
				derivationComponent_lazy = () -> Arrays.asList(Trigger1.mmObject(), AmountAndTrigger1.mmObject(), AutomaticVariation1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Undertaking getUndertaking() {
		return undertaking;
	}

	public void setUndertaking(com.tools20022.repository.entity.Undertaking undertaking) {
		this.undertaking = undertaking;
	}

	public VariationTypeCode getType() {
		return type;
	}

	public void setType(VariationTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getVariationAmount() {
		return variationAmount;
	}

	public void setVariationAmount(CurrencyAndAmount variationAmount) {
		this.variationAmount = variationAmount;
	}

	public Trigger getTrigger() {
		return trigger;
	}

	public void setTrigger(com.tools20022.repository.entity.Trigger trigger) {
		this.trigger = trigger;
	}
}