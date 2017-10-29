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
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the conditions under which securities can be acquired as part of a
 * corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BiddingConditions" src="doc-files/BiddingConditions.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProposedRate
 * BiddingConditions.ProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#OversubscriptionRate
 * BiddingConditions.OversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#InformationToComplyWith
 * BiddingConditions.InformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#SubscriptionCostDebitDate
 * BiddingConditions.SubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
 * BiddingConditions.MaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProrationRate
 * BiddingConditions.ProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
 * BiddingConditions.ApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#FrontEndOddLotQuantity
 * BiddingConditions.FrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BackEndOddLotQuantity
 * BiddingConditions.BackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#TransformationRate
 * BiddingConditions.TransformationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ProrationDate
 * BiddingConditions.ProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CompulsoryPurchasePeriod
 * BiddingConditions.CompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#PercentageSought
 * BiddingConditions.PercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BidInterval
 * BiddingConditions.BidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumPrice
 * BiddingConditions.MaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumPrice
 * BiddingConditions.MinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumQuantity
 * BiddingConditions.MaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MinimumQuantitySought
 * BiddingConditions.MinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#BaseDenomination
 * BiddingConditions.BaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#CalculationMethod
 * BiddingConditions.CalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#AdditionalSubscriptionCost
 * BiddingConditions.AdditionalSubscriptionCost}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#Event
 * BiddingConditions.Event}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BiddingConditions
 * DateTimePeriod.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
 * SecuritiesQuantity.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
 * CorporateActionEvent.BiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
 * RateAndAmount.RateBiddingConditions}</li>
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
 * "BiddingConditions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
 * </li>
 * </ul>
 */
public class BiddingConditions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate proposed in a remarketing of variable rate notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#ProposedRate
	 * CorporateActionRate8.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#ProposedRate
	 * CorporateActionRate9.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#ProposedRate
	 * CorporateActionElection3.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#ProposedRate
	 * CorporateActionRate47.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#ProposedRate
	 * CorporateActionRate59.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#ProposedRate
	 * CorporateActionRate71.ProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#ProposedRate
	 * CorporateActionRate73.ProposedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProposedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate proposed in a remarketing of variable rate notes."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProposedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate8.ProposedRate, com.tools20022.repository.msg.CorporateActionRate9.ProposedRate,
					com.tools20022.repository.msg.CorporateActionElection3.ProposedRate, com.tools20022.repository.msg.CorporateActionRate47.ProposedRate, com.tools20022.repository.msg.CorporateActionRate59.ProposedRate,
					com.tools20022.repository.msg.CorporateActionRate71.ProposedRate, com.tools20022.repository.msg.CorporateActionRate73.ProposedRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate of allowed over-subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#OversubscriptionRate
	 * CorporateActionRate8.OversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#OversubscriptionRate
	 * CorporateActionRate9.OversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#OversubscriptionRate
	 * CorporateActionRate47.OversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#OversubscriptionRate
	 * CorporateActionRate59.OversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#OversubscriptionRate
	 * CorporateActionRate71.OversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#OversubscriptionRate
	 * CorporateActionRate73.OversubscriptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of allowed over-subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OversubscriptionRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate8.OversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate9.OversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate47.OversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate59.OversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate71.OversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate73.OversubscriptionRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Provides information conditions to the account owner that are to be
	 * complied with, eg, not open to US/Canadian residents, QIB or SIL to be
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#InformationToComplyWith
	 * CorporateActionNarrative8.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#InformationToComplyWith
	 * CorporateActionNarrative13.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#InformationToComplyWith
	 * CorporateActionNarrative4.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#InformationToComplyWith
	 * CorporateActionNarrative14.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#InformationToComplyWith
	 * CorporateActionNarrative5.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#InformationToComplyWith
	 * CorporateActionNarrative6.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#InformationToComplyWith
	 * CorporateActionNarrative15.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#InformationToComplyWith
	 * CorporateActionNarrative16.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#InformationToComplyWith
	 * CorporateActionNarrative20.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#InformationToComplyWith
	 * CorporateActionNarrative22.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#InformationToComplyWith
	 * CorporateActionNarrative11.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#InformationToComplyWith
	 * CorporateActionNarrative17.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#InformationToComplyWith
	 * CorporateActionNarrative1.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#InformationToComplyWith
	 * CorporateActionNarrative2.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#InformationToComplyWith
	 * CorporateActionNarrative9.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#InformationToComplyWith
	 * CorporateActionNarrative27.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#InformationToComplyWith
	 * CorporateActionNarrative28.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#InformationToComplyWith
	 * CorporateActionNarrative29.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#InformationToComplyWith
	 * CorporateActionNarrative32.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#InformationToComplyWith
	 * CorporateActionNarrative37.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#InformationToComplyWith
	 * CorporateActionNarrative41.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#InformationToComplyWith
	 * CorporateActionNarrative33.InformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#InformationToComplyWith
	 * CorporateActionNarrative36.InformationToComplyWith}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationToComplyWith"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute InformationToComplyWith = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative8.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative13.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative4.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative14.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative5.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative6.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative15.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative16.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative20.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative22.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative11.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative17.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative1.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative2.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative9.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative27.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative28.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative29.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative32.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative37.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative41.InformationToComplyWith, com.tools20022.repository.msg.CorporateActionNarrative33.InformationToComplyWith,
					com.tools20022.repository.msg.CorporateActionNarrative36.InformationToComplyWith);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Date by which cash must be in place in order to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#SubscriptionCostDebitDate
	 * CorporateActionDate6.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#SubscriptionCostDebitDate
	 * CorporateActionDate10.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#SubscriptionCostDebitDate
	 * CorporateActionDate18.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#SubscriptionCostDebitDate
	 * CorporateActionDate19.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#SubscriptionCostDebitDate
	 * CorporateActionDate8.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#SubscriptionCostDebitDate
	 * CorporateActionDate11.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#SubscriptionCostDebitDate
	 * CorporateActionDate15.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#SubscriptionCostDebitDate
	 * CorporateActionDate16.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#SubscriptionCostDebitDate
	 * CorporateActionDate4.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#SubscriptionCostDebitDate
	 * CorporateActionDate29.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#SubscriptionCostDebitDate
	 * CorporateActionDate33.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#SubscriptionCostDebitDate
	 * CorporateActionDate46.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#SubscriptionCostDebitDate
	 * CorporateActionDate48.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#SubscriptionCostDebitDate
	 * CorporateActionDate52.SubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#SubscriptionCostDebitDate
	 * CorporateActionDate55.SubscriptionCostDebitDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionCostDebitDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date by which cash must be in place in order to take part in the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SubscriptionCostDebitDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate6.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate10.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate18.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate19.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate8.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate11.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate15.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate16.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate4.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate29.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate33.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate46.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate48.SubscriptionCostDebitDate, com.tools20022.repository.msg.CorporateActionDate52.SubscriptionCostDebitDate,
					com.tools20022.repository.msg.CorporateActionDate55.SubscriptionCostDebitDate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * A maximum percentage of shares available through the over subscription
	 * privilege, usually a percentage of the basic subscription shares, eg, an
	 * account owner subscribing to 100 shares may over subscribe to a maximum
	 * of 50 additional shares when the over subscription maximum is 50%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
	 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate4.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate10.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate20.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate22.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate26.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate31.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate38.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate39.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate5.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate12.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate15.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate18.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate25.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate30.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate37.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate40.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate36.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate42.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#MaximumAllowedOversubscription
	 * CorporateActionRate2.MaximumAllowedOversubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate46.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate45.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate44.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate60.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate64.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate57.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate68.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate70.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate67.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate74.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate79.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate76.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate82.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate80.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate81.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate83.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate84.MaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#MaximumAllowedOversubscriptionRate
	 * CorporateActionRate85.MaximumAllowedOversubscriptionRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedOverSubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumAllowedOverSubscription = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate10.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate20.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate22.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate26.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate31.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate38.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate39.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate5.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate12.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate15.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate18.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate25.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate30.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate37.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate40.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate36.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate42.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate2.MaximumAllowedOversubscription, com.tools20022.repository.msg.CorporateActionRate46.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate45.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate44.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate60.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate64.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate57.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate68.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate70.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate67.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate74.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate79.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate76.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate82.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate80.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate81.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate83.MaximumAllowedOversubscriptionRate, com.tools20022.repository.msg.CorporateActionRate84.MaximumAllowedOversubscriptionRate,
					com.tools20022.repository.msg.CorporateActionRate85.MaximumAllowedOversubscriptionRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedOverSubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Proportionate allocation used for the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#ProrationRate
	 * CorporateActionRate4.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#ProrationRate
	 * CorporateActionRate10.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#ProrationRate
	 * CorporateActionRate20.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#ProrationRate
	 * CorporateActionRate22.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#ProrationRate
	 * CorporateActionRate26.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#ProrationRate
	 * CorporateActionRate31.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#ProrationRate
	 * CorporateActionRate38.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#ProrationRate
	 * CorporateActionRate39.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#ProrationRate
	 * CorporateActionRate5.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#ProrationRate
	 * CorporateActionRate12.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#ProrationRate
	 * CorporateActionRate15.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#ProrationRate
	 * CorporateActionRate18.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#ProrationRate
	 * CorporateActionRate25.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#ProrationRate
	 * CorporateActionRate30.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#ProrationRate
	 * CorporateActionRate37.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#ProrationRate
	 * CorporateActionRate40.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#ProrationRate
	 * CorporateActionRate36.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#ProrationRate
	 * CorporateActionRate42.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#Proration
	 * CorporateActionRate2.Proration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#ProrationRate
	 * CorporateActionRate46.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#ProrationRate
	 * CorporateActionRate45.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#ProrationRate
	 * CorporateActionRate44.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#ProrationRate
	 * CorporateActionRate60.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#ProrationRate
	 * CorporateActionRate64.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#ProrationRate
	 * CorporateActionRate57.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#ProrationRate
	 * CorporateActionRate68.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#ProrationRate
	 * CorporateActionRate70.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#ProrationRate
	 * CorporateActionRate67.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#ProrationRate
	 * CorporateActionRate74.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#ProrationRate
	 * CorporateActionRate79.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#ProrationRate
	 * CorporateActionRate76.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#ProrationRate
	 * CorporateActionRate82.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#ProrationRate
	 * CorporateActionRate80.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#ProrationRate
	 * CorporateActionRate81.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#ProrationRate
	 * CorporateActionRate83.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#ProrationRate
	 * CorporateActionRate84.ProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#ProrationRate
	 * CorporateActionRate85.ProrationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proportionate allocation used for the offer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProrationRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.ProrationRate, com.tools20022.repository.msg.CorporateActionRate10.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate20.ProrationRate, com.tools20022.repository.msg.CorporateActionRate22.ProrationRate, com.tools20022.repository.msg.CorporateActionRate26.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate31.ProrationRate, com.tools20022.repository.msg.CorporateActionRate38.ProrationRate, com.tools20022.repository.msg.CorporateActionRate39.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate5.ProrationRate, com.tools20022.repository.msg.CorporateActionRate12.ProrationRate, com.tools20022.repository.msg.CorporateActionRate15.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate18.ProrationRate, com.tools20022.repository.msg.CorporateActionRate25.ProrationRate, com.tools20022.repository.msg.CorporateActionRate30.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate37.ProrationRate, com.tools20022.repository.msg.CorporateActionRate40.ProrationRate, com.tools20022.repository.msg.CorporateActionRate36.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate42.ProrationRate, com.tools20022.repository.msg.CorporateActionRate2.Proration, com.tools20022.repository.msg.CorporateActionRate46.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate45.ProrationRate, com.tools20022.repository.msg.CorporateActionRate44.ProrationRate, com.tools20022.repository.msg.CorporateActionRate60.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate64.ProrationRate, com.tools20022.repository.msg.CorporateActionRate57.ProrationRate, com.tools20022.repository.msg.CorporateActionRate68.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate70.ProrationRate, com.tools20022.repository.msg.CorporateActionRate67.ProrationRate, com.tools20022.repository.msg.CorporateActionRate74.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate79.ProrationRate, com.tools20022.repository.msg.CorporateActionRate76.ProrationRate, com.tools20022.repository.msg.CorporateActionRate82.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate80.ProrationRate, com.tools20022.repository.msg.CorporateActionRate81.ProrationRate, com.tools20022.repository.msg.CorporateActionRate83.ProrationRate,
					com.tools20022.repository.msg.CorporateActionRate84.ProrationRate, com.tools20022.repository.msg.CorporateActionRate85.ProrationRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
	 * RateAndAmount.RateBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#ApplicableRate
	 * CorporateActionRate4.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#ApplicableRate
	 * CorporateActionRate10.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#ApplicableRate
	 * RateDetails2.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#ApplicableRate
	 * RateDetails4.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#ApplicableRate
	 * CorporateActionRate29.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#ApplicableRate
	 * RateDetails7.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#ApplicableRate
	 * CorporateActionRate34.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#ApplicableRate
	 * RateDetails9.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#ApplicableRate
	 * RateDetails11.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#ApplicableRate
	 * RateDetails12.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#ApplicableRate
	 * CorporateActionRate5.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#ApplicableRate
	 * CorporateActionRate12.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#ApplicableRate
	 * RateDetails3.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#ApplicableRate
	 * RateDetails5.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#ApplicableRate
	 * CorporateActionRate28.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#ApplicableRate
	 * CorporateActionRate33.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#ApplicableRate
	 * RateDetails10.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#ApplicableRate
	 * RateDetails13.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#ApplicableRate
	 * CorporateActionRate2.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#ApplicableRate
	 * RateDetails15.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#ApplicableRate
	 * CorporateActionRate48.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#ApplicableRate
	 * CorporateActionRate49.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#ApplicableRate
	 * RateDetails14.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#ApplicableRate
	 * CorporateActionRate58.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#ApplicableRate
	 * RateDetails18.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#ApplicableRate
	 * RateDetails21.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#ApplicableRate
	 * CorporateActionRate65.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#ApplicableRate
	 * RateDetails23.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#ApplicableRate
	 * CorporateActionRate69.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#ApplicableRate
	 * RateDetails22.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#ApplicableRate
	 * CorporateActionRate72.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#ApplicableRate
	 * RateDetails24.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#ApplicableRate
	 * RateDetails25.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#ApplicableRate
	 * CorporateActionRate77.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#ApplicableRate
	 * CorporateActionRate75.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#ApplicableRate
	 * RateDetails26.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#ApplicableRate
	 * RateDetails27.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#ApplicableRate
	 * RateDetails28.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#ApplicableRate
	 * RateDetails30.ApplicableRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applicable to the event announced, eg, redemption rate for a redemption event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ApplicableRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate10.ApplicableRate,
					com.tools20022.repository.msg.RateDetails2.ApplicableRate, com.tools20022.repository.msg.RateDetails4.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate29.ApplicableRate,
					com.tools20022.repository.msg.RateDetails7.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate34.ApplicableRate, com.tools20022.repository.msg.RateDetails9.ApplicableRate,
					com.tools20022.repository.msg.RateDetails11.ApplicableRate, com.tools20022.repository.msg.RateDetails12.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate5.ApplicableRate,
					com.tools20022.repository.msg.CorporateActionRate12.ApplicableRate, com.tools20022.repository.msg.RateDetails3.ApplicableRate, com.tools20022.repository.msg.RateDetails5.ApplicableRate,
					com.tools20022.repository.msg.CorporateActionRate28.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate33.ApplicableRate, com.tools20022.repository.msg.RateDetails10.ApplicableRate,
					com.tools20022.repository.msg.RateDetails13.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate2.ApplicableRate, com.tools20022.repository.msg.RateDetails15.ApplicableRate,
					com.tools20022.repository.msg.CorporateActionRate48.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate49.ApplicableRate, com.tools20022.repository.msg.RateDetails14.ApplicableRate,
					com.tools20022.repository.msg.CorporateActionRate58.ApplicableRate, com.tools20022.repository.msg.RateDetails18.ApplicableRate, com.tools20022.repository.msg.RateDetails21.ApplicableRate,
					com.tools20022.repository.msg.CorporateActionRate65.ApplicableRate, com.tools20022.repository.msg.RateDetails23.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate69.ApplicableRate,
					com.tools20022.repository.msg.RateDetails22.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate72.ApplicableRate, com.tools20022.repository.msg.RateDetails24.ApplicableRate,
					com.tools20022.repository.msg.RateDetails25.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate77.ApplicableRate, com.tools20022.repository.msg.CorporateActionRate75.ApplicableRate,
					com.tools20022.repository.msg.RateDetails26.ApplicableRate, com.tools20022.repository.msg.RateDetails27.ApplicableRate, com.tools20022.repository.msg.RateDetails28.ApplicableRate,
					com.tools20022.repository.msg.RateDetails30.ApplicableRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies that if an order is prorated holders of odd lots who tender
	 * their full position will not have tendered position prorated but rather
	 * accepted in full.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#FrontEndOddLotBiddingConditions
	 * SecuritiesQuantity.FrontEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#FrontEndOddLotQuantity
	 * SecuritiesOption1.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#FrontEndOddLotQuantity
	 * SecuritiesOption9.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#FrontEndOddLotQuantity
	 * SecuritiesOption15.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#FrontEndOddLotQuantity
	 * SecuritiesOption16.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#FrontEndOddLotQuantity
	 * SecuritiesOption23.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#FrontEndOddLotQuantity
	 * SecuritiesOption28.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#FrontEndOddLotSecuritiesQuantity
	 * CorporateAction2.FrontEndOddLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#FrontEndOddLotQuantity
	 * SecuritiesOption51.FrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#FrontEndOddLotQuantity
	 * SecuritiesOption56.FrontEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrontEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FrontEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption1.FrontEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption9.FrontEndOddLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.FrontEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption16.FrontEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption23.FrontEndOddLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption28.FrontEndOddLotQuantity, com.tools20022.repository.msg.CorporateAction2.FrontEndOddLotSecuritiesQuantity,
					com.tools20022.repository.msg.SecuritiesOption51.FrontEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption56.FrontEndOddLotQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BackEndOddLotBiddingConditions
	 * SecuritiesQuantity.BackEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#BackEndOddLotQuantity
	 * SecuritiesOption1.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#BackEndOddLotQuantity
	 * SecuritiesOption9.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#BackEndOddLotQuantity
	 * SecuritiesOption15.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#BackEndOddLotQuantity
	 * SecuritiesOption16.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#BackEndOddLotQuantity
	 * SecuritiesOption23.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#BackEndOddLotQuantity
	 * SecuritiesOption28.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#BackEndOddLotSecuritiesQuantity
	 * CorporateAction2.BackEndOddLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#BackEndOddLotQuantity
	 * SecuritiesOption51.BackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#BackEndOddLotQuantity
	 * SecuritiesOption56.BackEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BackEndOddLotQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BackEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesOption1.BackEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption9.BackEndOddLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption15.BackEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption16.BackEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption23.BackEndOddLotQuantity,
					com.tools20022.repository.msg.SecuritiesOption28.BackEndOddLotQuantity, com.tools20022.repository.msg.CorporateAction2.BackEndOddLotSecuritiesQuantity,
					com.tools20022.repository.msg.SecuritiesOption51.BackEndOddLotQuantity, com.tools20022.repository.msg.SecuritiesOption56.BackEndOddLotQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate used to determine the cash consideration split across outturn
	 * settlement transactions that are the result of a transformation of the
	 * parent transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#TransformationRate
	 * CorporateActionRate7.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#TransformationRate
	 * CorporateActionRate13.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#TransformationRate
	 * CorporateActionRate17.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#TransformationRate
	 * CorporateActionRate19.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#TransformationRate
	 * CorporateActionRate28.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#TransformationRate
	 * CorporateActionRate33.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#TransformationRate
	 * CorporateActionRate48.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#TransformationRate
	 * CorporateActionRate58.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#TransformationRate
	 * CorporateActionRate69.TransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#TransformationRate
	 * CorporateActionRate77.TransformationRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransformationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TransformationRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate7.TransformationRate, com.tools20022.repository.msg.CorporateActionRate13.TransformationRate,
					com.tools20022.repository.msg.CorporateActionRate17.TransformationRate, com.tools20022.repository.msg.CorporateActionRate19.TransformationRate, com.tools20022.repository.msg.CorporateActionRate28.TransformationRate,
					com.tools20022.repository.msg.CorporateActionRate33.TransformationRate, com.tools20022.repository.msg.CorporateActionRate48.TransformationRate, com.tools20022.repository.msg.CorporateActionRate58.TransformationRate,
					com.tools20022.repository.msg.CorporateActionRate69.TransformationRate, com.tools20022.repository.msg.CorporateActionRate77.TransformationRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date (and time) at which an issuer will determine the proration
	 * amount/quantity of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#ProrationDate
	 * CorporateActionDate1.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#ProrationDate
	 * CorporateActionDate13.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#ProrationDate
	 * CorporateActionDate14.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#ProrationDate
	 * CorporateActionDate21.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#ProrationDate
	 * CorporateActionDate22.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#ProrationDate
	 * CorporateActionDate25.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#ProrationDate
	 * CorporateActionDate27.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#ProrationDate
	 * CorporateActionDate28.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#ProrationDate
	 * CorporateActionDate2.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ProrationDate
	 * CorporateActionDate44.ProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ProrationDate
	 * CorporateActionDate58.ProrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date (and time) at which an issuer will determine the proration amount/quantity of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.ProrationDate, com.tools20022.repository.msg.CorporateActionDate13.ProrationDate,
					com.tools20022.repository.msg.CorporateActionDate14.ProrationDate, com.tools20022.repository.msg.CorporateActionDate21.ProrationDate, com.tools20022.repository.msg.CorporateActionDate22.ProrationDate,
					com.tools20022.repository.msg.CorporateActionDate25.ProrationDate, com.tools20022.repository.msg.CorporateActionDate27.ProrationDate, com.tools20022.repository.msg.CorporateActionDate28.ProrationDate,
					com.tools20022.repository.msg.CorporateActionDate2.ProrationDate, com.tools20022.repository.msg.CorporateActionDate44.ProrationDate, com.tools20022.repository.msg.CorporateActionDate58.ProrationDate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#BiddingConditions
	 * DateTimePeriod.BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#CompulsoryPurchasePeriod
	 * CorporateActionPeriod3.CompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#CompulsoryPurchasePeriod
	 * CorporateActionPeriod6.CompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#CompulsoryPurchasePeriod
	 * CorporateActionPeriod8.CompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#CompulsoryPurchasePeriod
	 * CorporateActionPeriod1.CompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#CompulsoryPurchasePeriod
	 * CorporateActionPeriod10.CompulsoryPurchasePeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompulsoryPurchasePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during a take-over where any outstanding equity must be purchased by the take-over company."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CompulsoryPurchasePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPeriod3.CompulsoryPurchasePeriod, com.tools20022.repository.msg.CorporateActionPeriod6.CompulsoryPurchasePeriod,
					com.tools20022.repository.msg.CorporateActionPeriod8.CompulsoryPurchasePeriod, com.tools20022.repository.msg.CorporateActionPeriod1.CompulsoryPurchasePeriod,
					com.tools20022.repository.msg.CorporateActionPeriod10.CompulsoryPurchasePeriod);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> DateTimePeriod.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Percentage of securities the offeror/issuer will purchase or redeem under
	 * the terms of the event. This can be a number or the term "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#PercentageSought
	 * CorporateActionRate3.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#PercentageSought
	 * CorporateActionRate14.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#PercentageSought
	 * CorporateActionRate16.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#PercentageSought
	 * CorporateActionRate24.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#PercentageSought
	 * CorporateActionRate27.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#PercentageSought
	 * CorporateActionRate32.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#PercentageSought
	 * CorporateActionRate35.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#PercentageSought
	 * CorporateActionRate41.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#PercentageSought
	 * CorporateActionRate1.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#PercentageSought
	 * CorporateActionRate43.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#PercentageSought
	 * CorporateActionRate56.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#PercentageSought
	 * CorporateActionRate66.PercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#PercentageSought
	 * CorporateActionRate78.PercentageSought}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageSought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PercentageSought = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.PercentageSought, com.tools20022.repository.msg.CorporateActionRate14.PercentageSought,
					com.tools20022.repository.msg.CorporateActionRate16.PercentageSought, com.tools20022.repository.msg.CorporateActionRate24.PercentageSought, com.tools20022.repository.msg.CorporateActionRate27.PercentageSought,
					com.tools20022.repository.msg.CorporateActionRate32.PercentageSought, com.tools20022.repository.msg.CorporateActionRate35.PercentageSought, com.tools20022.repository.msg.CorporateActionRate41.PercentageSought,
					com.tools20022.repository.msg.CorporateActionRate1.PercentageSought, com.tools20022.repository.msg.CorporateActionRate43.PercentageSought, com.tools20022.repository.msg.CorporateActionRate56.PercentageSought,
					com.tools20022.repository.msg.CorporateActionRate66.PercentageSought, com.tools20022.repository.msg.CorporateActionRate78.PercentageSought);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Acceptable price increment used for submitting a bid.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#BidInterval
	 * CorporateActionRate3.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#BidInterval
	 * CorporateActionRate14.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#BidInterval
	 * CorporateActionRate16.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#BidInterval
	 * CorporateActionRate24.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#BidInterval
	 * CorporateActionRate27.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#BidInterval
	 * CorporateActionRate32.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#BidInterval
	 * CorporateActionRate35.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#BidInterval
	 * CorporateActionRate41.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#BidInterval
	 * CorporateActionRate1.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#BidInterval
	 * CorporateActionRate43.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#BidInterval
	 * CorporateActionRate56.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#BidInterval
	 * CorporateActionRate66.BidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#BidInterval
	 * CorporateActionRate78.BidInterval}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptable price increment used for submitting a bid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BidInterval = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate3.BidInterval, com.tools20022.repository.msg.CorporateActionRate14.BidInterval,
					com.tools20022.repository.msg.CorporateActionRate16.BidInterval, com.tools20022.repository.msg.CorporateActionRate24.BidInterval, com.tools20022.repository.msg.CorporateActionRate27.BidInterval,
					com.tools20022.repository.msg.CorporateActionRate32.BidInterval, com.tools20022.repository.msg.CorporateActionRate35.BidInterval, com.tools20022.repository.msg.CorporateActionRate41.BidInterval,
					com.tools20022.repository.msg.CorporateActionRate1.BidInterval, com.tools20022.repository.msg.CorporateActionRate43.BidInterval, com.tools20022.repository.msg.CorporateActionRate56.BidInterval,
					com.tools20022.repository.msg.CorporateActionRate66.BidInterval, com.tools20022.repository.msg.CorporateActionRate78.BidInterval);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MaximumPriceBiddingConditions
	 * SecuritiesPricing.MaximumPriceBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice3#MaximumPrice
	 * CorporateActionPrice3.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice15#MaximumPrice
	 * CorporateActionPrice15.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#MaximumPrice
	 * CorporateActionPrice17.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice25#MaximumPrice
	 * CorporateActionPrice25.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#MaximumPrice
	 * CorporateActionPrice2.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#MaximumPrice
	 * CorporateActionPrice42.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice50#MaximumPrice
	 * CorporateActionPrice50.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice57#MaximumPrice
	 * CorporateActionPrice57.MaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice67#MaximumPrice
	 * CorporateActionPrice67.MaximumPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice3.MaximumPrice, com.tools20022.repository.msg.CorporateActionPrice15.MaximumPrice,
					com.tools20022.repository.msg.CorporateActionPrice17.MaximumPrice, com.tools20022.repository.msg.CorporateActionPrice25.MaximumPrice, com.tools20022.repository.msg.CorporateActionPrice2.MaximumPrice,
					com.tools20022.repository.msg.CorporateActionPrice42.MaximumPrice, com.tools20022.repository.msg.CorporateActionPrice50.MaximumPrice, com.tools20022.repository.msg.CorporateActionPrice57.MaximumPrice,
					com.tools20022.repository.msg.CorporateActionPrice67.MaximumPrice);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#MinimumPriceBiddingConditions
	 * SecuritiesPricing.MinimumPriceBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice3#MinimumPrice
	 * CorporateActionPrice3.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice15#MinimumPrice
	 * CorporateActionPrice15.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#MinimumPrice
	 * CorporateActionPrice17.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice25#MinimumPrice
	 * CorporateActionPrice25.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#MinimumPrice
	 * CorporateActionPrice2.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#MinimumPrice
	 * CorporateActionPrice42.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice50#MinimumPrice
	 * CorporateActionPrice50.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice57#MinimumPrice
	 * CorporateActionPrice57.MinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice67#MinimumPrice
	 * CorporateActionPrice67.MinimumPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice3.MinimumPrice, com.tools20022.repository.msg.CorporateActionPrice15.MinimumPrice,
					com.tools20022.repository.msg.CorporateActionPrice17.MinimumPrice, com.tools20022.repository.msg.CorporateActionPrice25.MinimumPrice, com.tools20022.repository.msg.CorporateActionPrice2.MinimumPrice,
					com.tools20022.repository.msg.CorporateActionPrice42.MinimumPrice, com.tools20022.repository.msg.CorporateActionPrice50.MinimumPrice, com.tools20022.repository.msg.CorporateActionPrice57.MinimumPrice,
					com.tools20022.repository.msg.CorporateActionPrice67.MinimumPrice);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Maximum number of securities the offeror is requesting to complete the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MaximumQuantityBiddingConditions
	 * SecuritiesQuantity.MaximumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#MaximumQuantity
	 * CorporateActionQuantity1.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#MaximumQuantity
	 * CorporateActionQuantity2.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#MaximumQuantity
	 * CorporateActionQuantity3.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#MaximumQuantity
	 * CorporateActionQuantity4.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#MaximumQuantity
	 * CorporateActionQuantity5.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#MaximumQuantity
	 * CorporateActionQuantity6.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#MaximumQuantity
	 * CorporateActionQuantity7.MaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#MaximumQuantity
	 * CorporateActionQuantity8.MaximumQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of securities the offeror is requesting to complete the event."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity1.MaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity2.MaximumQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity3.MaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity4.MaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity5.MaximumQuantity,
					com.tools20022.repository.msg.CorporateActionQuantity6.MaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity7.MaximumQuantity, com.tools20022.repository.msg.CorporateActionQuantity8.MaximumQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Maximum number of securities the offeror is requesting to complete the event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Minimum quantity of securities the offeror/issuer will purchase or redeem
	 * under the terms of the event. This can be a number or the term
	 * "any and all".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#MinimumQuantityBiddingConditions
	 * SecuritiesQuantity.MinimumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#MinimumQuantitySought
	 * CorporateActionQuantity1.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#MinimumQuantitySought
	 * CorporateActionQuantity2.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#MinimumQuantitySought
	 * CorporateActionQuantity3.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#MinimumQuantitySought
	 * CorporateActionQuantity4.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#MinimumQuantitySought
	 * CorporateActionQuantity5.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#MinimumQuantitySought
	 * CorporateActionQuantity6.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#MinimumQuantitySought
	 * CorporateActionQuantity7.MinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#MinimumQuantitySought
	 * CorporateActionQuantity8.MinimumQuantitySought}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumQuantitySought"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\"."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MinimumQuantitySought = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity1.MinimumQuantitySought, com.tools20022.repository.msg.CorporateActionQuantity2.MinimumQuantitySought,
					com.tools20022.repository.msg.CorporateActionQuantity3.MinimumQuantitySought, com.tools20022.repository.msg.CorporateActionQuantity4.MinimumQuantitySought,
					com.tools20022.repository.msg.CorporateActionQuantity5.MinimumQuantitySought, com.tools20022.repository.msg.CorporateActionQuantity6.MinimumQuantitySought,
					com.tools20022.repository.msg.CorporateActionQuantity7.MinimumQuantitySought, com.tools20022.repository.msg.CorporateActionQuantity8.MinimumQuantitySought);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#BiddingConditions
	 * SecuritiesQuantity.BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#BaseDenomination
	 * CorporateActionQuantity1.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#BaseDenomination
	 * CorporateActionQuantity2.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#BaseDenomination
	 * CorporateActionQuantity3.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#BaseDenomination
	 * CorporateActionQuantity4.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#BaseDenomination
	 * CorporateActionQuantity5.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#BaseDenomination
	 * CorporateActionQuantity6.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#BaseDenomination
	 * CorporateAction2.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#BaseDenomination
	 * CorporateActionQuantity7.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#BaseDenomination
	 * CorporateActionQuantity8.BaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantitySD2#BaseDenomination
	 * CorporateActionQuantitySD2.BaseDenomination}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BaseDenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BaseDenomination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionQuantity1.BaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity2.BaseDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity3.BaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity4.BaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity5.BaseDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity6.BaseDenomination, com.tools20022.repository.msg.CorporateAction2.BaseDenomination, com.tools20022.repository.msg.CorporateActionQuantity7.BaseDenomination,
					com.tools20022.repository.msg.CorporateActionQuantity8.BaseDenomination, com.tools20022.repository.msg.CorporateActionQuantitySD2.BaseDenomination);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesQuantity.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * The method of calculation of drawings and partial redemptions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCalculationMethodCode
	 * CorporateActionCalculationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#CalculationMethod
	 * CorporateAction2.CalculationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The method of calculation of drawings and partial redemptions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction2.CalculationMethod);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
		}
	};
	/**
	 * Additional costs - coming on top of the subscription costs - which the
	 * subscriber should pay as per the subscription process.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#AdditionalSubscriptionCost
	 * CorporateActionAmounts1.AdditionalSubscriptionCost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalSubscriptionCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AdditionalSubscriptionCost = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts1.AdditionalSubscriptionCost);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdditionalSubscriptionCost";
			definition = "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Event to which the bidding conditions apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#BiddingConditions
	 * CorporateActionEvent.BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event to which the bidding conditions apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Event = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Event to which the bidding conditions apply.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BiddingConditions";
				definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.MaximumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.MinimumPriceBiddingConditions,
						com.tools20022.repository.entity.DateTimePeriod.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.BackEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.BiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MaximumQuantityBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.FrontEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.MinimumQuantityBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.BiddingConditions, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BiddingConditions.ProposedRate, com.tools20022.repository.entity.BiddingConditions.OversubscriptionRate,
						com.tools20022.repository.entity.BiddingConditions.InformationToComplyWith, com.tools20022.repository.entity.BiddingConditions.SubscriptionCostDebitDate,
						com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ProrationRate, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.BiddingConditions.FrontEndOddLotQuantity, com.tools20022.repository.entity.BiddingConditions.BackEndOddLotQuantity,
						com.tools20022.repository.entity.BiddingConditions.TransformationRate, com.tools20022.repository.entity.BiddingConditions.ProrationDate, com.tools20022.repository.entity.BiddingConditions.CompulsoryPurchasePeriod,
						com.tools20022.repository.entity.BiddingConditions.PercentageSought, com.tools20022.repository.entity.BiddingConditions.BidInterval, com.tools20022.repository.entity.BiddingConditions.MaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.MinimumPrice, com.tools20022.repository.entity.BiddingConditions.MaximumQuantity, com.tools20022.repository.entity.BiddingConditions.MinimumQuantitySought,
						com.tools20022.repository.entity.BiddingConditions.BaseDenomination, com.tools20022.repository.entity.BiddingConditions.CalculationMethod,
						com.tools20022.repository.entity.BiddingConditions.AdditionalSubscriptionCost, com.tools20022.repository.entity.BiddingConditions.Event);
			}
		});
		return mmObject_lazy.get();
	}
}