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
import com.tools20022.repository.codeset.CorporateActionCalculationMethodCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
 * DateTimePeriod.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
 * SecuritiesQuantity.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
 * CorporateActionEvent.mmBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
 * RateAndAmount.mmRateBiddingConditions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProposedRate
 * BiddingConditions.mmProposedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmOversubscriptionRate
 * BiddingConditions.mmOversubscriptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmInformationToComplyWith
 * BiddingConditions.mmInformationToComplyWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmSubscriptionCostDebitDate
 * BiddingConditions.mmSubscriptionCostDebitDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
 * BiddingConditions.mmProrationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
 * BiddingConditions.mmApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmFrontEndOddLotQuantity
 * BiddingConditions.mmFrontEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBackEndOddLotQuantity
 * BiddingConditions.mmBackEndOddLotQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmTransformationRate
 * BiddingConditions.mmTransformationRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationDate
 * BiddingConditions.mmProrationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCompulsoryPurchasePeriod
 * BiddingConditions.mmCompulsoryPurchasePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmPercentageSought
 * BiddingConditions.mmPercentageSought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBidInterval
 * BiddingConditions.mmBidInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
 * BiddingConditions.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
 * BiddingConditions.mmMinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumQuantity
 * BiddingConditions.mmMaximumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumQuantitySought
 * BiddingConditions.mmMinimumQuantitySought}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmBaseDenomination
 * BiddingConditions.mmBaseDenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmCalculationMethod
 * BiddingConditions.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmAdditionalSubscriptionCost
 * BiddingConditions.mmAdditionalSubscriptionCost}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BiddingConditions#mmEvent
 * BiddingConditions.mmEvent}</li>
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
 * "BiddingConditions"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which securities can be acquired as part of a corporate action."
 * </li>
 * </ul>
 */
public class BiddingConditions {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentageRate proposedRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmProposedRate
	 * CorporateActionRate8.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#mmProposedRate
	 * CorporateActionRate9.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionElection3#mmProposedRate
	 * CorporateActionElection3.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmProposedRate
	 * CorporateActionRate47.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#mmProposedRate
	 * CorporateActionRate59.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmProposedRate
	 * CorporateActionRate71.mmProposedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmProposedRate
	 * CorporateActionRate73.mmProposedRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProposedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate8.mmProposedRate, CorporateActionRate9.mmProposedRate, CorporateActionElection3.mmProposedRate, CorporateActionRate47.mmProposedRate,
					CorporateActionRate59.mmProposedRate, CorporateActionRate71.mmProposedRate, CorporateActionRate73.mmProposedRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProposedRate";
			definition = "Rate proposed in a remarketing of variable rate notes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate oversubscriptionRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate8#mmOversubscriptionRate
	 * CorporateActionRate8.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate9#mmOversubscriptionRate
	 * CorporateActionRate9.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate47#mmOversubscriptionRate
	 * CorporateActionRate47.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate59#mmOversubscriptionRate
	 * CorporateActionRate59.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate71#mmOversubscriptionRate
	 * CorporateActionRate71.mmOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate73#mmOversubscriptionRate
	 * CorporateActionRate73.mmOversubscriptionRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmOversubscriptionRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate8.mmOversubscriptionRate, CorporateActionRate9.mmOversubscriptionRate, CorporateActionRate47.mmOversubscriptionRate, CorporateActionRate59.mmOversubscriptionRate,
					CorporateActionRate71.mmOversubscriptionRate, CorporateActionRate73.mmOversubscriptionRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OversubscriptionRate";
			definition = "Rate of allowed over-subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Max350Text informationToComplyWith;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative8#mmInformationToComplyWith
	 * CorporateActionNarrative8.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative13#mmInformationToComplyWith
	 * CorporateActionNarrative13.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmInformationToComplyWith
	 * CorporateActionNarrative4.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmInformationToComplyWith
	 * CorporateActionNarrative14.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmInformationToComplyWith
	 * CorporateActionNarrative5.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmInformationToComplyWith
	 * CorporateActionNarrative6.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#mmInformationToComplyWith
	 * CorporateActionNarrative15.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmInformationToComplyWith
	 * CorporateActionNarrative16.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#mmInformationToComplyWith
	 * CorporateActionNarrative20.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#mmInformationToComplyWith
	 * CorporateActionNarrative22.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmInformationToComplyWith
	 * CorporateActionNarrative11.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmInformationToComplyWith
	 * CorporateActionNarrative17.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmInformationToComplyWith
	 * CorporateActionNarrative1.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmInformationToComplyWith
	 * CorporateActionNarrative2.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative9#mmInformationToComplyWith
	 * CorporateActionNarrative9.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmInformationToComplyWith
	 * CorporateActionNarrative27.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmInformationToComplyWith
	 * CorporateActionNarrative28.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmInformationToComplyWith
	 * CorporateActionNarrative29.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative32#mmInformationToComplyWith
	 * CorporateActionNarrative32.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmInformationToComplyWith
	 * CorporateActionNarrative37.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmInformationToComplyWith
	 * CorporateActionNarrative41.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative33#mmInformationToComplyWith
	 * CorporateActionNarrative33.mmInformationToComplyWith}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#mmInformationToComplyWith
	 * CorporateActionNarrative36.mmInformationToComplyWith}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmInformationToComplyWith = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionNarrative8.mmInformationToComplyWith, CorporateActionNarrative13.mmInformationToComplyWith, CorporateActionNarrative4.mmInformationToComplyWith,
					CorporateActionNarrative14.mmInformationToComplyWith, CorporateActionNarrative5.mmInformationToComplyWith, CorporateActionNarrative6.mmInformationToComplyWith, CorporateActionNarrative15.mmInformationToComplyWith,
					CorporateActionNarrative16.mmInformationToComplyWith, CorporateActionNarrative20.mmInformationToComplyWith, CorporateActionNarrative22.mmInformationToComplyWith, CorporateActionNarrative11.mmInformationToComplyWith,
					CorporateActionNarrative17.mmInformationToComplyWith, CorporateActionNarrative1.mmInformationToComplyWith, CorporateActionNarrative2.mmInformationToComplyWith, CorporateActionNarrative9.mmInformationToComplyWith,
					CorporateActionNarrative27.mmInformationToComplyWith, CorporateActionNarrative28.mmInformationToComplyWith, CorporateActionNarrative29.mmInformationToComplyWith, CorporateActionNarrative32.mmInformationToComplyWith,
					CorporateActionNarrative37.mmInformationToComplyWith, CorporateActionNarrative41.mmInformationToComplyWith, CorporateActionNarrative33.mmInformationToComplyWith, CorporateActionNarrative36.mmInformationToComplyWith);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationToComplyWith";
			definition = "Provides information conditions to the account owner that are to be complied with, eg, not open to US/Canadian residents, QIB or SIL to be provided.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected ISODateTime subscriptionCostDebitDate;
	/**
	 * Date by which cash must be in place in order to take part in the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate6#mmSubscriptionCostDebitDate
	 * CorporateActionDate6.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate10#mmSubscriptionCostDebitDate
	 * CorporateActionDate10.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate18#mmSubscriptionCostDebitDate
	 * CorporateActionDate18.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate19#mmSubscriptionCostDebitDate
	 * CorporateActionDate19.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate8#mmSubscriptionCostDebitDate
	 * CorporateActionDate8.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate11#mmSubscriptionCostDebitDate
	 * CorporateActionDate11.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate15#mmSubscriptionCostDebitDate
	 * CorporateActionDate15.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate16#mmSubscriptionCostDebitDate
	 * CorporateActionDate16.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmSubscriptionCostDebitDate
	 * CorporateActionDate4.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate29#mmSubscriptionCostDebitDate
	 * CorporateActionDate29.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate33#mmSubscriptionCostDebitDate
	 * CorporateActionDate33.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate46#mmSubscriptionCostDebitDate
	 * CorporateActionDate46.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate48#mmSubscriptionCostDebitDate
	 * CorporateActionDate48.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate52#mmSubscriptionCostDebitDate
	 * CorporateActionDate52.mmSubscriptionCostDebitDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate55#mmSubscriptionCostDebitDate
	 * CorporateActionDate55.mmSubscriptionCostDebitDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmSubscriptionCostDebitDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate6.mmSubscriptionCostDebitDate, CorporateActionDate10.mmSubscriptionCostDebitDate, CorporateActionDate18.mmSubscriptionCostDebitDate,
					CorporateActionDate19.mmSubscriptionCostDebitDate, CorporateActionDate8.mmSubscriptionCostDebitDate, CorporateActionDate11.mmSubscriptionCostDebitDate, CorporateActionDate15.mmSubscriptionCostDebitDate,
					CorporateActionDate16.mmSubscriptionCostDebitDate, CorporateActionDate4.mmSubscriptionCostDebitDate, CorporateActionDate29.mmSubscriptionCostDebitDate, CorporateActionDate33.mmSubscriptionCostDebitDate,
					CorporateActionDate46.mmSubscriptionCostDebitDate, CorporateActionDate48.mmSubscriptionCostDebitDate, CorporateActionDate52.mmSubscriptionCostDebitDate, CorporateActionDate55.mmSubscriptionCostDebitDate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SubscriptionCostDebitDate";
			definition = "Date by which cash must be in place in order to take part in the event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected RateAndAmount maximumAllowedOverSubscription;
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
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmMaximumAllowedBiddingConditions
	 * RateAndAmount.mmMaximumAllowedBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate4.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate10.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate20.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate22.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate26.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate31.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate38.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate39.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate5.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate12.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate15.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate18.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate25.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate30.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate37.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate40.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate36.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate42.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmMaximumAllowedOversubscription
	 * CorporateActionRate2.mmMaximumAllowedOversubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate46.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate45.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate44.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate60.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate64.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate57.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate68.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate70.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate67.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate74.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate79.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate76.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate82.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate80.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate81.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate83.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate84.mmMaximumAllowedOversubscriptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmMaximumAllowedOversubscriptionRate
	 * CorporateActionRate85.mmMaximumAllowedOversubscriptionRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMaximumAllowedOverSubscription = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmMaximumAllowedOversubscriptionRate, CorporateActionRate10.mmMaximumAllowedOversubscriptionRate, CorporateActionRate20.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate22.mmMaximumAllowedOversubscriptionRate, CorporateActionRate26.mmMaximumAllowedOversubscriptionRate, CorporateActionRate31.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate38.mmMaximumAllowedOversubscriptionRate, CorporateActionRate39.mmMaximumAllowedOversubscriptionRate, CorporateActionRate5.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate12.mmMaximumAllowedOversubscriptionRate, CorporateActionRate15.mmMaximumAllowedOversubscriptionRate, CorporateActionRate18.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate25.mmMaximumAllowedOversubscriptionRate, CorporateActionRate30.mmMaximumAllowedOversubscriptionRate, CorporateActionRate37.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate40.mmMaximumAllowedOversubscriptionRate, CorporateActionRate36.mmMaximumAllowedOversubscriptionRate, CorporateActionRate42.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate2.mmMaximumAllowedOversubscription, CorporateActionRate46.mmMaximumAllowedOversubscriptionRate, CorporateActionRate45.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate44.mmMaximumAllowedOversubscriptionRate, CorporateActionRate60.mmMaximumAllowedOversubscriptionRate, CorporateActionRate64.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate57.mmMaximumAllowedOversubscriptionRate, CorporateActionRate68.mmMaximumAllowedOversubscriptionRate, CorporateActionRate70.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate67.mmMaximumAllowedOversubscriptionRate, CorporateActionRate74.mmMaximumAllowedOversubscriptionRate, CorporateActionRate79.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate76.mmMaximumAllowedOversubscriptionRate, CorporateActionRate82.mmMaximumAllowedOversubscriptionRate, CorporateActionRate80.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate81.mmMaximumAllowedOversubscriptionRate, CorporateActionRate83.mmMaximumAllowedOversubscriptionRate, CorporateActionRate84.mmMaximumAllowedOversubscriptionRate,
					CorporateActionRate85.mmMaximumAllowedOversubscriptionRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedOverSubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected PercentageRate prorationRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmProrationRate
	 * CorporateActionRate4.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmProrationRate
	 * CorporateActionRate10.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmProrationRate
	 * CorporateActionRate20.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmProrationRate
	 * CorporateActionRate22.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmProrationRate
	 * CorporateActionRate26.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmProrationRate
	 * CorporateActionRate31.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmProrationRate
	 * CorporateActionRate38.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmProrationRate
	 * CorporateActionRate39.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmProrationRate
	 * CorporateActionRate5.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmProrationRate
	 * CorporateActionRate12.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmProrationRate
	 * CorporateActionRate15.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmProrationRate
	 * CorporateActionRate18.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmProrationRate
	 * CorporateActionRate25.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmProrationRate
	 * CorporateActionRate30.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmProrationRate
	 * CorporateActionRate37.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmProrationRate
	 * CorporateActionRate40.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmProrationRate
	 * CorporateActionRate36.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmProrationRate
	 * CorporateActionRate42.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmProration
	 * CorporateActionRate2.mmProration}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmProrationRate
	 * CorporateActionRate46.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmProrationRate
	 * CorporateActionRate45.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmProrationRate
	 * CorporateActionRate44.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmProrationRate
	 * CorporateActionRate60.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmProrationRate
	 * CorporateActionRate64.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmProrationRate
	 * CorporateActionRate57.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmProrationRate
	 * CorporateActionRate68.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmProrationRate
	 * CorporateActionRate70.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmProrationRate
	 * CorporateActionRate67.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmProrationRate
	 * CorporateActionRate74.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmProrationRate
	 * CorporateActionRate79.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmProrationRate
	 * CorporateActionRate76.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmProrationRate
	 * CorporateActionRate82.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmProrationRate
	 * CorporateActionRate80.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmProrationRate
	 * CorporateActionRate81.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmProrationRate
	 * CorporateActionRate83.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmProrationRate
	 * CorporateActionRate84.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmProrationRate
	 * CorporateActionRate85.mmProrationRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProrationRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmProrationRate, CorporateActionRate10.mmProrationRate, CorporateActionRate20.mmProrationRate, CorporateActionRate22.mmProrationRate,
					CorporateActionRate26.mmProrationRate, CorporateActionRate31.mmProrationRate, CorporateActionRate38.mmProrationRate, CorporateActionRate39.mmProrationRate, CorporateActionRate5.mmProrationRate,
					CorporateActionRate12.mmProrationRate, CorporateActionRate15.mmProrationRate, CorporateActionRate18.mmProrationRate, CorporateActionRate25.mmProrationRate, CorporateActionRate30.mmProrationRate,
					CorporateActionRate37.mmProrationRate, CorporateActionRate40.mmProrationRate, CorporateActionRate36.mmProrationRate, CorporateActionRate42.mmProrationRate, CorporateActionRate2.mmProration,
					CorporateActionRate46.mmProrationRate, CorporateActionRate45.mmProrationRate, CorporateActionRate44.mmProrationRate, CorporateActionRate60.mmProrationRate, CorporateActionRate64.mmProrationRate,
					CorporateActionRate57.mmProrationRate, CorporateActionRate68.mmProrationRate, CorporateActionRate70.mmProrationRate, CorporateActionRate67.mmProrationRate, CorporateActionRate74.mmProrationRate,
					CorporateActionRate79.mmProrationRate, CorporateActionRate76.mmProrationRate, CorporateActionRate82.mmProrationRate, CorporateActionRate80.mmProrationRate, CorporateActionRate81.mmProrationRate,
					CorporateActionRate83.mmProrationRate, CorporateActionRate84.mmProrationRate, CorporateActionRate85.mmProrationRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProrationRate";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected RateAndAmount applicableRate;
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmRateBiddingConditions
	 * RateAndAmount.mmRateBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RateAndAmount
	 * RateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmApplicableRate
	 * CorporateActionRate4.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmApplicableRate
	 * CorporateActionRate10.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmApplicableRate
	 * RateDetails2.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmApplicableRate
	 * RateDetails4.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmApplicableRate
	 * CorporateActionRate29.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmApplicableRate
	 * RateDetails7.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmApplicableRate
	 * CorporateActionRate34.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmApplicableRate
	 * RateDetails9.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmApplicableRate
	 * RateDetails11.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmApplicableRate
	 * RateDetails12.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmApplicableRate
	 * CorporateActionRate5.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmApplicableRate
	 * CorporateActionRate12.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmApplicableRate
	 * RateDetails3.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmApplicableRate
	 * RateDetails5.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmApplicableRate
	 * CorporateActionRate28.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmApplicableRate
	 * CorporateActionRate33.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmApplicableRate
	 * RateDetails10.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmApplicableRate
	 * RateDetails13.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmApplicableRate
	 * CorporateActionRate2.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmApplicableRate
	 * RateDetails15.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmApplicableRate
	 * CorporateActionRate48.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmApplicableRate
	 * CorporateActionRate49.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmApplicableRate
	 * RateDetails14.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmApplicableRate
	 * CorporateActionRate58.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmApplicableRate
	 * RateDetails18.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmApplicableRate
	 * RateDetails21.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmApplicableRate
	 * CorporateActionRate65.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmApplicableRate
	 * RateDetails23.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmApplicableRate
	 * CorporateActionRate69.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmApplicableRate
	 * RateDetails22.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmApplicableRate
	 * CorporateActionRate72.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmApplicableRate
	 * RateDetails24.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmApplicableRate
	 * RateDetails25.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmApplicableRate
	 * CorporateActionRate77.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmApplicableRate
	 * CorporateActionRate75.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmApplicableRate
	 * RateDetails26.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmApplicableRate
	 * RateDetails27.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmApplicableRate
	 * RateDetails28.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmApplicableRate
	 * RateDetails30.mmApplicableRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmApplicableRate = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmApplicableRate, CorporateActionRate10.mmApplicableRate, RateDetails2.mmApplicableRate, RateDetails4.mmApplicableRate, CorporateActionRate29.mmApplicableRate,
					RateDetails7.mmApplicableRate, CorporateActionRate34.mmApplicableRate, RateDetails9.mmApplicableRate, RateDetails11.mmApplicableRate, RateDetails12.mmApplicableRate, CorporateActionRate5.mmApplicableRate,
					CorporateActionRate12.mmApplicableRate, RateDetails3.mmApplicableRate, RateDetails5.mmApplicableRate, CorporateActionRate28.mmApplicableRate, CorporateActionRate33.mmApplicableRate, RateDetails10.mmApplicableRate,
					RateDetails13.mmApplicableRate, CorporateActionRate2.mmApplicableRate, RateDetails15.mmApplicableRate, CorporateActionRate48.mmApplicableRate, CorporateActionRate49.mmApplicableRate, RateDetails14.mmApplicableRate,
					CorporateActionRate58.mmApplicableRate, RateDetails18.mmApplicableRate, RateDetails21.mmApplicableRate, CorporateActionRate65.mmApplicableRate, RateDetails23.mmApplicableRate, CorporateActionRate69.mmApplicableRate,
					RateDetails22.mmApplicableRate, CorporateActionRate72.mmApplicableRate, RateDetails24.mmApplicableRate, RateDetails25.mmApplicableRate, CorporateActionRate77.mmApplicableRate, CorporateActionRate75.mmApplicableRate,
					RateDetails26.mmApplicableRate, RateDetails27.mmApplicableRate, RateDetails28.mmApplicableRate, RateDetails30.mmApplicableRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected SecuritiesQuantity frontEndOddLotQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmFrontEndOddLotBiddingConditions
	 * SecuritiesQuantity.mmFrontEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmFrontEndOddLotQuantity
	 * SecuritiesOption1.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmFrontEndOddLotQuantity
	 * SecuritiesOption9.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmFrontEndOddLotQuantity
	 * SecuritiesOption15.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmFrontEndOddLotQuantity
	 * SecuritiesOption16.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmFrontEndOddLotQuantity
	 * SecuritiesOption23.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmFrontEndOddLotQuantity
	 * SecuritiesOption28.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmFrontEndOddLotSecuritiesQuantity
	 * CorporateAction2.mmFrontEndOddLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmFrontEndOddLotQuantity
	 * SecuritiesOption51.mmFrontEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmFrontEndOddLotQuantity
	 * SecuritiesOption56.mmFrontEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmFrontEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption1.mmFrontEndOddLotQuantity, SecuritiesOption9.mmFrontEndOddLotQuantity, SecuritiesOption15.mmFrontEndOddLotQuantity, SecuritiesOption16.mmFrontEndOddLotQuantity,
					SecuritiesOption23.mmFrontEndOddLotQuantity, SecuritiesOption28.mmFrontEndOddLotQuantity, CorporateAction2.mmFrontEndOddLotSecuritiesQuantity, SecuritiesOption51.mmFrontEndOddLotQuantity,
					SecuritiesOption56.mmFrontEndOddLotQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrontEndOddLotQuantity";
			definition = "Specifies that if an order is prorated holders of odd lots who tender their full position will not have tendered position prorated but rather accepted in full.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmFrontEndOddLotBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity backEndOddLotQuantity;
	/**
	 * Represents the presence of a back end odd lot provision and the quantity
	 * of equity required after proration to be eligible for this privilege.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBackEndOddLotBiddingConditions
	 * SecuritiesQuantity.mmBackEndOddLotBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption1#mmBackEndOddLotQuantity
	 * SecuritiesOption1.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption9#mmBackEndOddLotQuantity
	 * SecuritiesOption9.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption15#mmBackEndOddLotQuantity
	 * SecuritiesOption15.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption16#mmBackEndOddLotQuantity
	 * SecuritiesOption16.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption23#mmBackEndOddLotQuantity
	 * SecuritiesOption23.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption28#mmBackEndOddLotQuantity
	 * SecuritiesOption28.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmBackEndOddLotSecuritiesQuantity
	 * CorporateAction2.mmBackEndOddLotSecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption51#mmBackEndOddLotQuantity
	 * SecuritiesOption51.mmBackEndOddLotQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption56#mmBackEndOddLotQuantity
	 * SecuritiesOption56.mmBackEndOddLotQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmBackEndOddLotQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesOption1.mmBackEndOddLotQuantity, SecuritiesOption9.mmBackEndOddLotQuantity, SecuritiesOption15.mmBackEndOddLotQuantity, SecuritiesOption16.mmBackEndOddLotQuantity,
					SecuritiesOption23.mmBackEndOddLotQuantity, SecuritiesOption28.mmBackEndOddLotQuantity, CorporateAction2.mmBackEndOddLotSecuritiesQuantity, SecuritiesOption51.mmBackEndOddLotQuantity,
					SecuritiesOption56.mmBackEndOddLotQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BackEndOddLotQuantity";
			definition = "Represents the presence of a back end odd lot provision and the quantity of equity required after proration to be eligible for this privilege.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmBackEndOddLotBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected PercentageRate transformationRate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate7#mmTransformationRate
	 * CorporateActionRate7.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate13#mmTransformationRate
	 * CorporateActionRate13.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate17#mmTransformationRate
	 * CorporateActionRate17.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate19#mmTransformationRate
	 * CorporateActionRate19.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmTransformationRate
	 * CorporateActionRate28.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmTransformationRate
	 * CorporateActionRate33.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmTransformationRate
	 * CorporateActionRate48.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmTransformationRate
	 * CorporateActionRate58.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmTransformationRate
	 * CorporateActionRate69.mmTransformationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmTransformationRate
	 * CorporateActionRate77.mmTransformationRate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmTransformationRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate7.mmTransformationRate, CorporateActionRate13.mmTransformationRate, CorporateActionRate17.mmTransformationRate, CorporateActionRate19.mmTransformationRate,
					CorporateActionRate28.mmTransformationRate, CorporateActionRate33.mmTransformationRate, CorporateActionRate48.mmTransformationRate, CorporateActionRate58.mmTransformationRate, CorporateActionRate69.mmTransformationRate,
					CorporateActionRate77.mmTransformationRate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransformationRate";
			definition = "Rate used to determine the cash consideration split across outturn settlement transactions that are the result of a transformation of the parent transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ISODateTime prorationDate;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmProrationDate
	 * CorporateActionDate1.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmProrationDate
	 * CorporateActionDate13.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmProrationDate
	 * CorporateActionDate14.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmProrationDate
	 * CorporateActionDate21.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmProrationDate
	 * CorporateActionDate22.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmProrationDate
	 * CorporateActionDate25.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmProrationDate
	 * CorporateActionDate27.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmProrationDate
	 * CorporateActionDate28.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmProrationDate
	 * CorporateActionDate2.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmProrationDate
	 * CorporateActionDate44.mmProrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmProrationDate
	 * CorporateActionDate58.mmProrationDate}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmProrationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmProrationDate, CorporateActionDate13.mmProrationDate, CorporateActionDate14.mmProrationDate, CorporateActionDate21.mmProrationDate,
					CorporateActionDate22.mmProrationDate, CorporateActionDate25.mmProrationDate, CorporateActionDate27.mmProrationDate, CorporateActionDate28.mmProrationDate, CorporateActionDate2.mmProrationDate,
					CorporateActionDate44.mmProrationDate, CorporateActionDate58.mmProrationDate);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProrationDate";
			definition = "Date (and time) at which an issuer will determine the proration amount/quantity of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected DateTimePeriod compulsoryPurchasePeriod;
	/**
	 * Period during a take-over where any outstanding equity must be purchased
	 * by the take-over company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmBiddingConditions
	 * DateTimePeriod.mmBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod3#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod3.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod6#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod6.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod8#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod8.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod1.mmCompulsoryPurchasePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmCompulsoryPurchasePeriod
	 * CorporateActionPeriod10.mmCompulsoryPurchasePeriod}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmCompulsoryPurchasePeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod3.mmCompulsoryPurchasePeriod, CorporateActionPeriod6.mmCompulsoryPurchasePeriod, CorporateActionPeriod8.mmCompulsoryPurchasePeriod,
					CorporateActionPeriod1.mmCompulsoryPurchasePeriod, CorporateActionPeriod10.mmCompulsoryPurchasePeriod);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompulsoryPurchasePeriod";
			definition = "Period during a take-over where any outstanding equity must be purchased by the take-over company.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected PercentageRate percentageSought;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmPercentageSought
	 * CorporateActionRate3.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmPercentageSought
	 * CorporateActionRate14.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmPercentageSought
	 * CorporateActionRate16.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmPercentageSought
	 * CorporateActionRate24.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmPercentageSought
	 * CorporateActionRate27.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmPercentageSought
	 * CorporateActionRate32.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmPercentageSought
	 * CorporateActionRate35.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmPercentageSought
	 * CorporateActionRate41.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmPercentageSought
	 * CorporateActionRate1.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmPercentageSought
	 * CorporateActionRate43.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmPercentageSought
	 * CorporateActionRate56.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmPercentageSought
	 * CorporateActionRate66.mmPercentageSought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmPercentageSought
	 * CorporateActionRate78.mmPercentageSought}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmPercentageSought = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmPercentageSought, CorporateActionRate14.mmPercentageSought, CorporateActionRate16.mmPercentageSought, CorporateActionRate24.mmPercentageSought,
					CorporateActionRate27.mmPercentageSought, CorporateActionRate32.mmPercentageSought, CorporateActionRate35.mmPercentageSought, CorporateActionRate41.mmPercentageSought, CorporateActionRate1.mmPercentageSought,
					CorporateActionRate43.mmPercentageSought, CorporateActionRate56.mmPercentageSought, CorporateActionRate66.mmPercentageSought, CorporateActionRate78.mmPercentageSought);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PercentageSought";
			definition = "Percentage of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected CurrencyAndAmount bidInterval;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate3#mmBidInterval
	 * CorporateActionRate3.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate14#mmBidInterval
	 * CorporateActionRate14.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate16#mmBidInterval
	 * CorporateActionRate16.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate24#mmBidInterval
	 * CorporateActionRate24.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate27#mmBidInterval
	 * CorporateActionRate27.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate32#mmBidInterval
	 * CorporateActionRate32.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate35#mmBidInterval
	 * CorporateActionRate35.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate41#mmBidInterval
	 * CorporateActionRate41.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate1#mmBidInterval
	 * CorporateActionRate1.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate43#mmBidInterval
	 * CorporateActionRate43.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate56#mmBidInterval
	 * CorporateActionRate56.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate66#mmBidInterval
	 * CorporateActionRate66.mmBidInterval}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate78#mmBidInterval
	 * CorporateActionRate78.mmBidInterval}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmBidInterval = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate3.mmBidInterval, CorporateActionRate14.mmBidInterval, CorporateActionRate16.mmBidInterval, CorporateActionRate24.mmBidInterval, CorporateActionRate27.mmBidInterval,
					CorporateActionRate32.mmBidInterval, CorporateActionRate35.mmBidInterval, CorporateActionRate41.mmBidInterval, CorporateActionRate1.mmBidInterval, CorporateActionRate43.mmBidInterval,
					CorporateActionRate56.mmBidInterval, CorporateActionRate66.mmBidInterval, CorporateActionRate78.mmBidInterval);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BidInterval";
			definition = "Acceptable price increment used for submitting a bid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected SecuritiesPricing maximumPrice;
	/**
	 * Maximum or cap price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
	 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice3#mmMaximumPrice
	 * CorporateActionPrice3.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice15#mmMaximumPrice
	 * CorporateActionPrice15.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#mmMaximumPrice
	 * CorporateActionPrice17.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice25#mmMaximumPrice
	 * CorporateActionPrice25.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#mmMaximumPrice
	 * CorporateActionPrice2.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#mmMaximumPrice
	 * CorporateActionPrice42.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice50#mmMaximumPrice
	 * CorporateActionPrice50.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice57#mmMaximumPrice
	 * CorporateActionPrice57.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice67#mmMaximumPrice
	 * CorporateActionPrice67.mmMaximumPrice}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMaximumPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice3.mmMaximumPrice, CorporateActionPrice15.mmMaximumPrice, CorporateActionPrice17.mmMaximumPrice, CorporateActionPrice25.mmMaximumPrice,
					CorporateActionPrice2.mmMaximumPrice, CorporateActionPrice42.mmMaximumPrice, CorporateActionPrice50.mmMaximumPrice, CorporateActionPrice57.mmMaximumPrice, CorporateActionPrice67.mmMaximumPrice);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumPrice";
			definition = "Maximum or cap price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing minimumPrice;
	/**
	 * Minimum or floor price at which a holder can bid, e.g. on a Dutch auction
	 * offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
	 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
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
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice3#mmMinimumPrice
	 * CorporateActionPrice3.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice15#mmMinimumPrice
	 * CorporateActionPrice15.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice17#mmMinimumPrice
	 * CorporateActionPrice17.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice25#mmMinimumPrice
	 * CorporateActionPrice25.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice2#mmMinimumPrice
	 * CorporateActionPrice2.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice42#mmMinimumPrice
	 * CorporateActionPrice42.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice50#mmMinimumPrice
	 * CorporateActionPrice50.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice57#mmMinimumPrice
	 * CorporateActionPrice57.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice67#mmMinimumPrice
	 * CorporateActionPrice67.mmMinimumPrice}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMinimumPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice3.mmMinimumPrice, CorporateActionPrice15.mmMinimumPrice, CorporateActionPrice17.mmMinimumPrice, CorporateActionPrice25.mmMinimumPrice,
					CorporateActionPrice2.mmMinimumPrice, CorporateActionPrice42.mmMinimumPrice, CorporateActionPrice50.mmMinimumPrice, CorporateActionPrice57.mmMinimumPrice, CorporateActionPrice67.mmMinimumPrice);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumPrice";
			definition = "Minimum or floor price at which a holder can bid, e.g. on a Dutch auction offer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesQuantity maximumQuantity;
	/**
	 * Maximum number of securities the offeror is requesting to complete the
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMaximumQuantityBiddingConditions
	 * SecuritiesQuantity.mmMaximumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmMaximumQuantity
	 * CorporateActionQuantity1.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmMaximumQuantity
	 * CorporateActionQuantity2.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmMaximumQuantity
	 * CorporateActionQuantity3.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmMaximumQuantity
	 * CorporateActionQuantity4.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMaximumQuantity
	 * CorporateActionQuantity5.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMaximumQuantity
	 * CorporateActionQuantity6.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmMaximumQuantity
	 * CorporateActionQuantity7.mmMaximumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmMaximumQuantity
	 * CorporateActionQuantity8.mmMaximumQuantity}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMaximumQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionQuantity1.mmMaximumQuantity, CorporateActionQuantity2.mmMaximumQuantity, CorporateActionQuantity3.mmMaximumQuantity, CorporateActionQuantity4.mmMaximumQuantity,
					CorporateActionQuantity5.mmMaximumQuantity, CorporateActionQuantity6.mmMaximumQuantity, CorporateActionQuantity7.mmMaximumQuantity, CorporateActionQuantity8.mmMaximumQuantity);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumQuantity";
			definition = "Maximum number of securities the offeror is requesting to complete the event.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity minimumQuantitySought;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmMinimumQuantityBiddingConditions
	 * SecuritiesQuantity.mmMinimumQuantityBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmMinimumQuantitySought
	 * CorporateActionQuantity1.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmMinimumQuantitySought
	 * CorporateActionQuantity2.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmMinimumQuantitySought
	 * CorporateActionQuantity3.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmMinimumQuantitySought
	 * CorporateActionQuantity4.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmMinimumQuantitySought
	 * CorporateActionQuantity5.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmMinimumQuantitySought
	 * CorporateActionQuantity6.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmMinimumQuantitySought
	 * CorporateActionQuantity7.mmMinimumQuantitySought}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmMinimumQuantitySought
	 * CorporateActionQuantity8.mmMinimumQuantitySought}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmMinimumQuantitySought = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionQuantity1.mmMinimumQuantitySought, CorporateActionQuantity2.mmMinimumQuantitySought, CorporateActionQuantity3.mmMinimumQuantitySought,
					CorporateActionQuantity4.mmMinimumQuantitySought, CorporateActionQuantity5.mmMinimumQuantitySought, CorporateActionQuantity6.mmMinimumQuantitySought, CorporateActionQuantity7.mmMinimumQuantitySought,
					CorporateActionQuantity8.mmMinimumQuantitySought);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumQuantitySought";
			definition = "Minimum quantity of securities the offeror/issuer will purchase or redeem under the terms of the event. This can be a number or the term \"any and all\".";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected SecuritiesQuantity baseDenomination;
	/**
	 * The minimum integral amount of securities that each account owner must
	 * have remaining after the called amounts are applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmBiddingConditions
	 * SecuritiesQuantity.mmBiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity1#mmBaseDenomination
	 * CorporateActionQuantity1.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity2#mmBaseDenomination
	 * CorporateActionQuantity2.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity3#mmBaseDenomination
	 * CorporateActionQuantity3.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity4#mmBaseDenomination
	 * CorporateActionQuantity4.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity5#mmBaseDenomination
	 * CorporateActionQuantity5.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity6#mmBaseDenomination
	 * CorporateActionQuantity6.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmBaseDenomination
	 * CorporateAction2.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity7#mmBaseDenomination
	 * CorporateActionQuantity7.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantity8#mmBaseDenomination
	 * CorporateActionQuantity8.mmBaseDenomination}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionQuantitySD2#mmBaseDenomination
	 * CorporateActionQuantitySD2.mmBaseDenomination}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAssociationEnd mmBaseDenomination = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionQuantity1.mmBaseDenomination, CorporateActionQuantity2.mmBaseDenomination, CorporateActionQuantity3.mmBaseDenomination, CorporateActionQuantity4.mmBaseDenomination,
					CorporateActionQuantity5.mmBaseDenomination, CorporateActionQuantity6.mmBaseDenomination, CorporateAction2.mmBaseDenomination, CorporateActionQuantity7.mmBaseDenomination, CorporateActionQuantity8.mmBaseDenomination,
					CorporateActionQuantitySD2.mmBaseDenomination);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BaseDenomination";
			definition = "The minimum integral amount of securities that each account owner must have remaining after the called amounts are applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected CorporateActionCalculationMethodCode calculationMethod;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCalculationMethod
	 * CorporateAction2.mmCalculationMethod}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmCalculationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateAction2.mmCalculationMethod);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationMethod";
			definition = "The method of calculation of drawings and partial redemptions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCalculationMethodCode.mmObject();
		}
	};
	protected CurrencyAndAmount additionalSubscriptionCost;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmAdditionalSubscriptionCost
	 * CorporateActionAmounts1.mmAdditionalSubscriptionCost}</li>
	 * </ul>
	 * </li>
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
	public static final MMBusinessAttribute mmAdditionalSubscriptionCost = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts1.mmAdditionalSubscriptionCost);
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdditionalSubscriptionCost";
			definition = "Additional costs - coming on top of the subscription costs - which the subscriber should pay as per the subscription process.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected CorporateActionEvent event;
	/**
	 * Event to which the bidding conditions apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmBiddingConditions
	 * CorporateActionEvent.mmBiddingConditions}</li>
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
	public static final MMBusinessAssociationEnd mmEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> BiddingConditions.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Event to which the bidding conditions apply.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BiddingConditions";
				definition = "Specifies the conditions under which securities can be acquired as part of a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions,
						com.tools20022.repository.entity.DateTimePeriod.mmBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmBackEndOddLotBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.mmBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmMaximumQuantityBiddingConditions,
						com.tools20022.repository.entity.SecuritiesQuantity.mmFrontEndOddLotBiddingConditions, com.tools20022.repository.entity.SecuritiesQuantity.mmMinimumQuantityBiddingConditions,
						com.tools20022.repository.entity.CorporateActionEvent.mmBiddingConditions, com.tools20022.repository.entity.RateAndAmount.mmMaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.mmRateBiddingConditions);
				element_lazy = () -> Arrays.asList(BiddingConditions.mmProposedRate, BiddingConditions.mmOversubscriptionRate, BiddingConditions.mmInformationToComplyWith, BiddingConditions.mmSubscriptionCostDebitDate,
						BiddingConditions.mmMaximumAllowedOverSubscription, BiddingConditions.mmProrationRate, BiddingConditions.mmApplicableRate, BiddingConditions.mmFrontEndOddLotQuantity, BiddingConditions.mmBackEndOddLotQuantity,
						BiddingConditions.mmTransformationRate, BiddingConditions.mmProrationDate, BiddingConditions.mmCompulsoryPurchasePeriod, BiddingConditions.mmPercentageSought, BiddingConditions.mmBidInterval,
						BiddingConditions.mmMaximumPrice, BiddingConditions.mmMinimumPrice, BiddingConditions.mmMaximumQuantity, BiddingConditions.mmMinimumQuantitySought, BiddingConditions.mmBaseDenomination,
						BiddingConditions.mmCalculationMethod, BiddingConditions.mmAdditionalSubscriptionCost, BiddingConditions.mmEvent);
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getProposedRate() {
		return proposedRate;
	}

	public void setProposedRate(PercentageRate proposedRate) {
		this.proposedRate = proposedRate;
	}

	public PercentageRate getOversubscriptionRate() {
		return oversubscriptionRate;
	}

	public void setOversubscriptionRate(PercentageRate oversubscriptionRate) {
		this.oversubscriptionRate = oversubscriptionRate;
	}

	public Max350Text getInformationToComplyWith() {
		return informationToComplyWith;
	}

	public void setInformationToComplyWith(Max350Text informationToComplyWith) {
		this.informationToComplyWith = informationToComplyWith;
	}

	public ISODateTime getSubscriptionCostDebitDate() {
		return subscriptionCostDebitDate;
	}

	public void setSubscriptionCostDebitDate(ISODateTime subscriptionCostDebitDate) {
		this.subscriptionCostDebitDate = subscriptionCostDebitDate;
	}

	public RateAndAmount getMaximumAllowedOverSubscription() {
		return maximumAllowedOverSubscription;
	}

	public void setMaximumAllowedOverSubscription(com.tools20022.repository.entity.RateAndAmount maximumAllowedOverSubscription) {
		this.maximumAllowedOverSubscription = maximumAllowedOverSubscription;
	}

	public PercentageRate getProrationRate() {
		return prorationRate;
	}

	public void setProrationRate(PercentageRate prorationRate) {
		this.prorationRate = prorationRate;
	}

	public RateAndAmount getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(com.tools20022.repository.entity.RateAndAmount applicableRate) {
		this.applicableRate = applicableRate;
	}

	public SecuritiesQuantity getFrontEndOddLotQuantity() {
		return frontEndOddLotQuantity;
	}

	public void setFrontEndOddLotQuantity(com.tools20022.repository.entity.SecuritiesQuantity frontEndOddLotQuantity) {
		this.frontEndOddLotQuantity = frontEndOddLotQuantity;
	}

	public SecuritiesQuantity getBackEndOddLotQuantity() {
		return backEndOddLotQuantity;
	}

	public void setBackEndOddLotQuantity(com.tools20022.repository.entity.SecuritiesQuantity backEndOddLotQuantity) {
		this.backEndOddLotQuantity = backEndOddLotQuantity;
	}

	public PercentageRate getTransformationRate() {
		return transformationRate;
	}

	public void setTransformationRate(PercentageRate transformationRate) {
		this.transformationRate = transformationRate;
	}

	public ISODateTime getProrationDate() {
		return prorationDate;
	}

	public void setProrationDate(ISODateTime prorationDate) {
		this.prorationDate = prorationDate;
	}

	public DateTimePeriod getCompulsoryPurchasePeriod() {
		return compulsoryPurchasePeriod;
	}

	public void setCompulsoryPurchasePeriod(com.tools20022.repository.entity.DateTimePeriod compulsoryPurchasePeriod) {
		this.compulsoryPurchasePeriod = compulsoryPurchasePeriod;
	}

	public PercentageRate getPercentageSought() {
		return percentageSought;
	}

	public void setPercentageSought(PercentageRate percentageSought) {
		this.percentageSought = percentageSought;
	}

	public CurrencyAndAmount getBidInterval() {
		return bidInterval;
	}

	public void setBidInterval(CurrencyAndAmount bidInterval) {
		this.bidInterval = bidInterval;
	}

	public SecuritiesPricing getMaximumPrice() {
		return maximumPrice;
	}

	public void setMaximumPrice(com.tools20022.repository.entity.SecuritiesPricing maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public SecuritiesPricing getMinimumPrice() {
		return minimumPrice;
	}

	public void setMinimumPrice(com.tools20022.repository.entity.SecuritiesPricing minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public SecuritiesQuantity getMaximumQuantity() {
		return maximumQuantity;
	}

	public void setMaximumQuantity(com.tools20022.repository.entity.SecuritiesQuantity maximumQuantity) {
		this.maximumQuantity = maximumQuantity;
	}

	public SecuritiesQuantity getMinimumQuantitySought() {
		return minimumQuantitySought;
	}

	public void setMinimumQuantitySought(com.tools20022.repository.entity.SecuritiesQuantity minimumQuantitySought) {
		this.minimumQuantitySought = minimumQuantitySought;
	}

	public SecuritiesQuantity getBaseDenomination() {
		return baseDenomination;
	}

	public void setBaseDenomination(com.tools20022.repository.entity.SecuritiesQuantity baseDenomination) {
		this.baseDenomination = baseDenomination;
	}

	public CorporateActionCalculationMethodCode getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(CorporateActionCalculationMethodCode calculationMethod) {
		this.calculationMethod = calculationMethod;
	}

	public CurrencyAndAmount getAdditionalSubscriptionCost() {
		return additionalSubscriptionCost;
	}

	public void setAdditionalSubscriptionCost(CurrencyAndAmount additionalSubscriptionCost) {
		this.additionalSubscriptionCost = additionalSubscriptionCost;
	}

	public CorporateActionEvent getEvent() {
		return event;
	}

	public void setEvent(com.tools20022.repository.entity.CorporateActionEvent event) {
		this.event = event;
	}
}