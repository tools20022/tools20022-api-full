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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Prices related to a corporate action.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionPrice" src="doc-files/CorporateActionPrice.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionEvent
 * CorporateActionPrice.mmCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumMultipleCashToInstruct
 * CorporateActionPrice.mmMinimumMultipleCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMaximumCashToInstruct
 * CorporateActionPrice.mmMaximumCashToInstruct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmMinimumCashToInstruct
 * CorporateActionPrice.mmMinimumCashToInstruct}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumCashToInstructRelatedEvent
 * SecuritiesPricing.mmMinimumCashToInstructRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumCashToInstructRelatedEvent
 * SecuritiesPricing.mmMaximumCashToInstructRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumMultipleCashToInstructRelatedEvent
 * SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
 * CorporateActionEvent.mmCorporateActionPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmIndicativeOrMarketPrice
 * CorporateActionPrice8.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmIndicativeOrMarketPrice
 * CorporateActionPrice11.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmIndicativeOrMarketPrice
 * CorporateActionPrice19.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmIndicativeOrMarketPrice
 * CorporateActionPrice20.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmIndicativeOrMarketPrice
 * CorporateActionPrice29.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmIndicativeOrMarketPrice
 * CorporateActionPrice35.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#mmIndicativeOrMarketPrice
 * CorporateActionPrice9.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#mmIndicativeOrMarketPrice
 * CorporateActionPrice12.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmIndicativeOrMarketPrice
 * CorporateActionPrice27.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmIndicativeOrMarketPrice
 * CorporateActionPrice33.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmIndicativeOrMarketPrice
 * CorporateActionPrice39.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmIndicativeOrMarketPrice
 * CorporateActionPrice40.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#mmIndicativeOrMarketPrice
 * CorporateActionPrice10.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#mmIndicativeOrMarketPrice
 * CorporateActionPrice13.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#mmIndicativeOrMarketPrice
 * CorporateActionPrice18.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#mmIndicativeOrMarketPrice
 * CorporateActionPrice24.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmIndicativeOrMarketPrice
 * CorporateActionPrice26.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmIndicativeOrMarketPrice
 * CorporateActionPrice32.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmIndicativeOrMarketPrice
 * CorporateActionPrice38.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmIndicativeOrMarketPrice
 * CorporateActionPrice41.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmIndicativeOrMarketPrice
 * CorporateActionPrice31.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmIndicativeOrMarketPrice
 * CorporateActionPrice37.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmIndicativePrice
 * CorporateActionPrice4.mmIndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#mmMarketPrice
 * CorporateActionPrice4.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmIndicativeOrMarketPrice
 * CorporateActionPrice43.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmIndicativeOrMarketPrice
 * CorporateActionPrice44.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmIndicativeOrMarketPrice
 * CorporateActionPrice45.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmIndicativeOrMarketPrice
 * CorporateActionPrice52.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmIndicativeOrMarketPrice
 * CorporateActionPrice55.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmIndicativeOrMarketPrice
 * CorporateActionPrice51.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmIndicativeOrMarketPrice
 * CorporateActionPrice59.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmIndicativeOrMarketPrice
 * CorporateActionPrice56.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmIndicativeOrMarketPrice
 * CorporateActionPrice60.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmIndicativeOrMarketPrice
 * CorporateActionPrice62.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmIndicativeOrMarketPrice
 * CorporateActionPrice66.mmIndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmIndicativeOrMarketPrice
 * CorporateActionPrice64.mmIndicativeOrMarketPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice8
 * CorporateActionPrice8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice11
 * CorporateActionPrice11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice19
 * CorporateActionPrice19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice20
 * CorporateActionPrice20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice29
 * CorporateActionPrice29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice35
 * CorporateActionPrice35}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice5
 * CorporateActionPrice5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice9
 * CorporateActionPrice9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice7
 * CorporateActionPrice7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice12
 * CorporateActionPrice12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice21
 * CorporateActionPrice21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice22
 * CorporateActionPrice22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice30
 * CorporateActionPrice30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice27
 * CorporateActionPrice27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice36
 * CorporateActionPrice36}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice33
 * CorporateActionPrice33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice39
 * CorporateActionPrice39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice40
 * CorporateActionPrice40}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice6
 * CorporateActionPrice6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice10
 * CorporateActionPrice10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice14
 * CorporateActionPrice14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice13
 * CorporateActionPrice13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice16
 * CorporateActionPrice16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice18
 * CorporateActionPrice18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice23
 * CorporateActionPrice23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice24
 * CorporateActionPrice24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice28
 * CorporateActionPrice28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice26
 * CorporateActionPrice26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice34
 * CorporateActionPrice34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice32
 * CorporateActionPrice32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice38
 * CorporateActionPrice38}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice41
 * CorporateActionPrice41}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice3
 * CorporateActionPrice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice15
 * CorporateActionPrice15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice17
 * CorporateActionPrice17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice25
 * CorporateActionPrice25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice31
 * CorporateActionPrice31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice37
 * CorporateActionPrice37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice2
 * CorporateActionPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice1
 * CorporateActionPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice4
 * CorporateActionPrice4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice42
 * CorporateActionPrice42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice43
 * CorporateActionPrice43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice44
 * CorporateActionPrice44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice45
 * CorporateActionPrice45}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice50
 * CorporateActionPrice50}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice52
 * CorporateActionPrice52}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice55
 * CorporateActionPrice55}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice51
 * CorporateActionPrice51}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice59
 * CorporateActionPrice59}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice56
 * CorporateActionPrice56}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice60
 * CorporateActionPrice60}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice58
 * CorporateActionPrice58}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice61
 * CorporateActionPrice61}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice57
 * CorporateActionPrice57}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice63
 * CorporateActionPrice63}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice65
 * CorporateActionPrice65}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice62
 * CorporateActionPrice62}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice66
 * CorporateActionPrice66}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice67
 * CorporateActionPrice67}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice64
 * CorporateActionPrice64}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice68
 * CorporateActionPrice68}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionPrice69
 * CorporateActionPrice69}</li>
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
 * "CorporateActionPrice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Prices related to a corporate action."</li>
 * </ul>
 */
public class CorporateActionPrice {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionPrice
	 * CorporateActionEvent.mmCorporateActionPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate event for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesPricing corporateActionExercisePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
	 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmExercisePrice
	 * CorporateActionPrice8.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmExercisePrice
	 * CorporateActionPrice11.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmExercisePrice
	 * CorporateActionPrice19.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmExercisePrice
	 * CorporateActionPrice20.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmExercisePrice
	 * CorporateActionPrice5.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmExercisePrice
	 * CorporateActionPrice7.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmExercisePrice
	 * CorporateActionPrice6.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmExercisePrice
	 * CorporateActionPrice14.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmExercisePrice
	 * CorporateActionPrice1.mmExercisePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionExercisePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice8.mmExercisePrice, CorporateActionPrice11.mmExercisePrice, CorporateActionPrice19.mmExercisePrice, CorporateActionPrice20.mmExercisePrice,
					CorporateActionPrice5.mmExercisePrice, CorporateActionPrice7.mmExercisePrice, CorporateActionPrice6.mmExercisePrice, CorporateActionPrice14.mmExercisePrice, CorporateActionPrice1.mmExercisePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPriceReceivedPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice11.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice19.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice20.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#mmGenericCashPriceReceivedPerProduct
	 * CashOption2.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice7.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#mmGenericCashPriceReceivedPerProduct
	 * CashOption9.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice21.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails2.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice22.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails4.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice27.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails7.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice33.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails9.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice39.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails11.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice40.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails12.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#mmGenericCashPriceReceivedPerProduct
	 * CashOption3.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#mmGenericCashPriceReceivedPerProduct
	 * CashOption6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice16.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails3.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice23.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails5.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice26.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails6.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice32.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice38.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails10.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice41.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails13.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#mmGenericCashPriceReceivedPerProduct
	 * CashOption4.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#mmGenericCashPriceReceivedPerProduct
	 * CashOption8.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice31.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice37.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails14.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice45.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails15.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails18.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails21.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice52.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice55.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice51.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails23.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails22.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails24.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#mmGenericCashPriceReceivedPerProduct
	 * PriceDetails25.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice62.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice64.mmGenericCashPriceReceivedPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice8.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice11.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice19.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice20.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice29.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice35.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice5.mmGenericCashPriceReceivedPerProduct, CashOption2.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice7.mmGenericCashPriceReceivedPerProduct, CashOption9.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice21.mmGenericCashPriceReceivedPerProduct, PriceDetails2.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice22.mmGenericCashPriceReceivedPerProduct,
					PriceDetails4.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice27.mmGenericCashPriceReceivedPerProduct, PriceDetails7.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice33.mmGenericCashPriceReceivedPerProduct, PriceDetails9.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice39.mmGenericCashPriceReceivedPerProduct,
					PriceDetails11.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice40.mmGenericCashPriceReceivedPerProduct, PriceDetails12.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice6.mmGenericCashPriceReceivedPerProduct, CashOption3.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice14.mmGenericCashPriceReceivedPerProduct,
					CashOption6.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice16.mmGenericCashPriceReceivedPerProduct, PriceDetails3.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice23.mmGenericCashPriceReceivedPerProduct, PriceDetails5.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice26.mmGenericCashPriceReceivedPerProduct,
					PriceDetails6.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice32.mmGenericCashPriceReceivedPerProduct, PriceDetails8.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice38.mmGenericCashPriceReceivedPerProduct, PriceDetails10.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice41.mmGenericCashPriceReceivedPerProduct,
					PriceDetails13.mmGenericCashPriceReceivedPerProduct, CashOption4.mmGenericCashPriceReceivedPerProduct, CashOption8.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice31.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice37.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice1.mmGenericCashPriceReceivedPerProduct, PriceDetails14.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice43.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice44.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice45.mmGenericCashPriceReceivedPerProduct,
					PriceDetails15.mmGenericCashPriceReceivedPerProduct, PriceDetails18.mmGenericCashPriceReceivedPerProduct, PriceDetails21.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice52.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice55.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice51.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice59.mmGenericCashPriceReceivedPerProduct,
					PriceDetails23.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice56.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice60.mmGenericCashPriceReceivedPerProduct,
					PriceDetails22.mmGenericCashPriceReceivedPerProduct, PriceDetails24.mmGenericCashPriceReceivedPerProduct, PriceDetails25.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice62.mmGenericCashPriceReceivedPerProduct,
					CorporateActionPrice66.mmGenericCashPriceReceivedPerProduct, CorporateActionPrice64.mmGenericCashPriceReceivedPerProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing genericCashPricePaidPerProduct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
	 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice8.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice11.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice19.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice20.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice29.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice35.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice5.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice7.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#mmGenericCashPricePaidPerProduct
	 * PriceDetails2.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#mmGenericCashPricePaidPerProduct
	 * PriceDetails4.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice27.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#mmGenericCashPricePaidPerProduct
	 * PriceDetails7.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice33.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#mmGenericCashPricePaidPerProduct
	 * PriceDetails9.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice39.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#mmGenericCashPricePaidPerProduct
	 * PriceDetails11.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice40.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#mmGenericCashPricePaidPerProduct
	 * PriceDetails12.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice6.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice14.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#mmGenericCashPricePaidPerProduct
	 * PriceDetails3.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#mmGenericCashPricePaidPerProduct
	 * PriceDetails5.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice26.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#mmGenericCashPricePaidPerProduct
	 * PriceDetails6.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice32.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#mmGenericCashPricePaidPerProduct
	 * PriceDetails8.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice38.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#mmGenericCashPricePaidPerProduct
	 * PriceDetails10.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice41.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#mmGenericCashPricePaidPerProduct
	 * PriceDetails13.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice31.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice37.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice1.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#mmGenericCashPricePaidPerProduct
	 * PriceDetails14.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice43.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice44.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice45.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#mmGenericCashPricePaidPerProduct
	 * PriceDetails15.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#mmGenericCashPricePaidPerProduct
	 * PriceDetails18.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#mmGenericCashPricePaidPerProduct
	 * PriceDetails21.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice52.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice55.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice51.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice59.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#mmGenericCashPricePaidPerProduct
	 * PriceDetails23.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice56.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice60.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#mmGenericCashPricePaidPerProduct
	 * PriceDetails22.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#mmGenericCashPricePaidPerProduct
	 * PriceDetails24.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#mmGenericCashPricePaidPerProduct
	 * PriceDetails25.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice62.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice66.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice64.mmGenericCashPricePaidPerProduct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice8.mmGenericCashPricePaidPerProduct, CorporateActionPrice11.mmGenericCashPricePaidPerProduct, CorporateActionPrice19.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice20.mmGenericCashPricePaidPerProduct, CorporateActionPrice29.mmGenericCashPricePaidPerProduct, CorporateActionPrice35.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice5.mmGenericCashPricePaidPerProduct, CorporateActionPrice7.mmGenericCashPricePaidPerProduct, PriceDetails2.mmGenericCashPricePaidPerProduct, PriceDetails4.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice27.mmGenericCashPricePaidPerProduct, PriceDetails7.mmGenericCashPricePaidPerProduct, CorporateActionPrice33.mmGenericCashPricePaidPerProduct, PriceDetails9.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice39.mmGenericCashPricePaidPerProduct, PriceDetails11.mmGenericCashPricePaidPerProduct, CorporateActionPrice40.mmGenericCashPricePaidPerProduct, PriceDetails12.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice6.mmGenericCashPricePaidPerProduct, CorporateActionPrice14.mmGenericCashPricePaidPerProduct, PriceDetails3.mmGenericCashPricePaidPerProduct, PriceDetails5.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice26.mmGenericCashPricePaidPerProduct, PriceDetails6.mmGenericCashPricePaidPerProduct, CorporateActionPrice32.mmGenericCashPricePaidPerProduct, PriceDetails8.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice38.mmGenericCashPricePaidPerProduct, PriceDetails10.mmGenericCashPricePaidPerProduct, CorporateActionPrice41.mmGenericCashPricePaidPerProduct, PriceDetails13.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice31.mmGenericCashPricePaidPerProduct, CorporateActionPrice37.mmGenericCashPricePaidPerProduct, CorporateActionPrice1.mmGenericCashPricePaidPerProduct, PriceDetails14.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice43.mmGenericCashPricePaidPerProduct, CorporateActionPrice44.mmGenericCashPricePaidPerProduct, CorporateActionPrice45.mmGenericCashPricePaidPerProduct, PriceDetails15.mmGenericCashPricePaidPerProduct,
					PriceDetails18.mmGenericCashPricePaidPerProduct, PriceDetails21.mmGenericCashPricePaidPerProduct, CorporateActionPrice52.mmGenericCashPricePaidPerProduct, CorporateActionPrice55.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice51.mmGenericCashPricePaidPerProduct, CorporateActionPrice59.mmGenericCashPricePaidPerProduct, PriceDetails23.mmGenericCashPricePaidPerProduct, CorporateActionPrice56.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice60.mmGenericCashPricePaidPerProduct, PriceDetails22.mmGenericCashPricePaidPerProduct, PriceDetails24.mmGenericCashPricePaidPerProduct, PriceDetails25.mmGenericCashPricePaidPerProduct,
					CorporateActionPrice62.mmGenericCashPricePaidPerProduct, CorporateActionPrice66.mmGenericCashPricePaidPerProduct, CorporateActionPrice64.mmGenericCashPricePaidPerProduct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashInLieuOfSharePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
	 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmCashInLieuOfSharePrice
	 * CorporateActionPrice5.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#mmCashInLieuOfSharePrice
	 * CorporateActionPrice9.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmCashInLieuOfSharePrice
	 * CorporateActionPrice7.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#mmCashInLieuOfSharePrice
	 * CorporateActionPrice12.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmCashInLieuOfSharePrice
	 * CorporateActionPrice21.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmCashInLieuOfSharePrice
	 * CorporateActionPrice22.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#mmCashInLieuOfSharePrice
	 * CorporateActionPrice30.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmCashInLieuOfSharePrice
	 * CorporateActionPrice27.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#mmCashInLieuOfSharePrice
	 * CorporateActionPrice36.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmCashInLieuOfSharePrice
	 * CorporateActionPrice33.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmCashInLieuOfSharePrice
	 * CorporateActionPrice39.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmCashInLieuOfSharePrice
	 * CorporateActionPrice40.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmCashInLieuOfSharePrice
	 * CorporateActionPrice6.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#mmCashInLieuOfSharePrice
	 * CorporateActionPrice10.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmCashInLieuOfSharePrice
	 * CorporateActionPrice14.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#mmCashInLieuOfSharePrice
	 * CorporateActionPrice13.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmCashInLieuOfSharePrice
	 * CorporateActionPrice16.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#mmCashInLieuOfSharePrice
	 * CorporateActionPrice18.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmCashInLieuOfSharePrice
	 * CorporateActionPrice23.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#mmCashInLieuOfSharePrice
	 * CorporateActionPrice24.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#mmCashInLieuOfSharePrice
	 * CorporateActionPrice28.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmCashInLieuOfSharePrice
	 * CorporateActionPrice26.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmCashInLieuOfSharePrice
	 * CorporateActionPrice34.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmCashInLieuOfSharePrice
	 * CorporateActionPrice32.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmCashInLieuOfSharePrice
	 * CorporateActionPrice38.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmCashInLieuOfSharePrice
	 * CorporateActionPrice41.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmCashInLieuOfSharePrice
	 * CorporateActionPrice31.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmCashInLieuOfSharePrice
	 * CorporateActionPrice37.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmCashInLieuOfSharePrice
	 * CorporateActionPrice1.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashInLieuOfSharePrice
	 * CorporateActionPrice43.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmCashInLieuOfSharePrice
	 * CorporateActionPrice45.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmCashInLieuOfSharePrice
	 * CorporateActionPrice55.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmCashInLieuOfSharePrice
	 * CorporateActionPrice51.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashInLieuOfSharePrice
	 * CorporateActionPrice59.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashInLieuOfSharePrice
	 * CorporateActionPrice56.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmCashInLieuOfSharePrice
	 * CorporateActionPrice58.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmCashInLieuOfSharePrice
	 * CorporateActionPrice61.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#mmCashInLieuOfSharePrice
	 * CorporateActionPrice63.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#mmCashInLieuOfSharePrice
	 * CorporateActionPrice65.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashInLieuOfSharePrice
	 * CorporateActionPrice66.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmCashInLieuOfSharePrice
	 * CorporateActionPrice64.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmCashInLieuOfSharePrice
	 * CorporateActionPrice68.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmCashInLieuOfSharePrice
	 * CorporateActionPrice69.mmCashInLieuOfSharePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice5.mmCashInLieuOfSharePrice, CorporateActionPrice9.mmCashInLieuOfSharePrice, CorporateActionPrice7.mmCashInLieuOfSharePrice,
					CorporateActionPrice12.mmCashInLieuOfSharePrice, CorporateActionPrice21.mmCashInLieuOfSharePrice, CorporateActionPrice22.mmCashInLieuOfSharePrice, CorporateActionPrice30.mmCashInLieuOfSharePrice,
					CorporateActionPrice27.mmCashInLieuOfSharePrice, CorporateActionPrice36.mmCashInLieuOfSharePrice, CorporateActionPrice33.mmCashInLieuOfSharePrice, CorporateActionPrice39.mmCashInLieuOfSharePrice,
					CorporateActionPrice40.mmCashInLieuOfSharePrice, CorporateActionPrice6.mmCashInLieuOfSharePrice, CorporateActionPrice10.mmCashInLieuOfSharePrice, CorporateActionPrice14.mmCashInLieuOfSharePrice,
					CorporateActionPrice13.mmCashInLieuOfSharePrice, CorporateActionPrice16.mmCashInLieuOfSharePrice, CorporateActionPrice18.mmCashInLieuOfSharePrice, CorporateActionPrice23.mmCashInLieuOfSharePrice,
					CorporateActionPrice24.mmCashInLieuOfSharePrice, CorporateActionPrice28.mmCashInLieuOfSharePrice, CorporateActionPrice26.mmCashInLieuOfSharePrice, CorporateActionPrice34.mmCashInLieuOfSharePrice,
					CorporateActionPrice32.mmCashInLieuOfSharePrice, CorporateActionPrice38.mmCashInLieuOfSharePrice, CorporateActionPrice41.mmCashInLieuOfSharePrice, CorporateActionPrice31.mmCashInLieuOfSharePrice,
					CorporateActionPrice37.mmCashInLieuOfSharePrice, CorporateActionPrice1.mmCashInLieuOfSharePrice, CorporateActionPrice43.mmCashInLieuOfSharePrice, CorporateActionPrice45.mmCashInLieuOfSharePrice,
					CorporateActionPrice55.mmCashInLieuOfSharePrice, CorporateActionPrice51.mmCashInLieuOfSharePrice, CorporateActionPrice59.mmCashInLieuOfSharePrice, CorporateActionPrice56.mmCashInLieuOfSharePrice,
					CorporateActionPrice58.mmCashInLieuOfSharePrice, CorporateActionPrice61.mmCashInLieuOfSharePrice, CorporateActionPrice63.mmCashInLieuOfSharePrice, CorporateActionPrice65.mmCashInLieuOfSharePrice,
					CorporateActionPrice66.mmCashInLieuOfSharePrice, CorporateActionPrice64.mmCashInLieuOfSharePrice, CorporateActionPrice68.mmCashInLieuOfSharePrice, CorporateActionPrice69.mmCashInLieuOfSharePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing overSubscriptionDepositPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
	 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice5.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice7.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice21.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice22.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice30.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice36.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice6.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice14.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice16.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice23.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice28.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice34.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice1.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice58.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice61.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice63.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice65.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice68.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice69.mmOverSubscriptionDepositPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money required per over-subscribed equity as defined by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice5.mmOverSubscriptionDepositPrice, CorporateActionPrice7.mmOverSubscriptionDepositPrice, CorporateActionPrice21.mmOverSubscriptionDepositPrice,
					CorporateActionPrice22.mmOverSubscriptionDepositPrice, CorporateActionPrice30.mmOverSubscriptionDepositPrice, CorporateActionPrice36.mmOverSubscriptionDepositPrice, CorporateActionPrice6.mmOverSubscriptionDepositPrice,
					CorporateActionPrice14.mmOverSubscriptionDepositPrice, CorporateActionPrice16.mmOverSubscriptionDepositPrice, CorporateActionPrice23.mmOverSubscriptionDepositPrice, CorporateActionPrice28.mmOverSubscriptionDepositPrice,
					CorporateActionPrice34.mmOverSubscriptionDepositPrice, CorporateActionPrice1.mmOverSubscriptionDepositPrice, CorporateActionPrice58.mmOverSubscriptionDepositPrice, CorporateActionPrice61.mmOverSubscriptionDepositPrice,
					CorporateActionPrice63.mmOverSubscriptionDepositPrice, CorporateActionPrice65.mmOverSubscriptionDepositPrice, CorporateActionPrice68.mmOverSubscriptionDepositPrice, CorporateActionPrice69.mmOverSubscriptionDepositPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing cashValueForTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
	 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#mmCashValueForTax
	 * CorporateActionPrice27.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#mmCashValueForTax
	 * CorporateActionPrice33.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#mmCashValueForTax
	 * CorporateActionPrice39.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#mmCashValueForTax
	 * CorporateActionPrice40.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#mmCashValueForTax
	 * CorporateActionPrice26.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#mmCashValueForTax
	 * CorporateActionPrice32.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#mmCashValueForTax
	 * CorporateActionPrice38.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#mmCashValueForTax
	 * CorporateActionPrice41.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#mmCashValueForTax
	 * CorporateActionPrice31.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#mmCashValueForTax
	 * CorporateActionPrice37.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#mmCashValueForTax
	 * CorporateActionPrice43.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#mmCashValueForTax
	 * CorporateActionPrice45.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#mmCashValueForTax
	 * CorporateActionPrice55.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#mmCashValueForTax
	 * CorporateActionPrice51.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#mmCashValueForTax
	 * CorporateActionPrice59.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#mmCashValueForTax
	 * CorporateActionPrice56.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#mmCashValueForTax
	 * CorporateActionPrice66.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#mmCashValueForTax
	 * CorporateActionPrice64.mmCashValueForTax}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of resulting securities proceeds for tax calculation and/or reporting."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashValueForTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice27.mmCashValueForTax, CorporateActionPrice33.mmCashValueForTax, CorporateActionPrice39.mmCashValueForTax, CorporateActionPrice40.mmCashValueForTax,
					CorporateActionPrice26.mmCashValueForTax, CorporateActionPrice32.mmCashValueForTax, CorporateActionPrice38.mmCashValueForTax, CorporateActionPrice41.mmCashValueForTax, CorporateActionPrice31.mmCashValueForTax,
					CorporateActionPrice37.mmCashValueForTax, CorporateActionPrice43.mmCashValueForTax, CorporateActionPrice45.mmCashValueForTax, CorporateActionPrice55.mmCashValueForTax, CorporateActionPrice51.mmCashValueForTax,
					CorporateActionPrice59.mmCashValueForTax, CorporateActionPrice56.mmCashValueForTax, CorporateActionPrice66.mmCashValueForTax, CorporateActionPrice64.mmCashValueForTax);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing pricingCalculation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
	 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PricingCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters taken into account to calculate the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPricingCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing minimumMultipleCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumMultipleCashToInstructRelatedEvent
	 * SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMinimumMultipleCashToInstruct
	 * CorporateActionPrice68.mmMinimumMultipleCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMinimumMultipleCashToInstruct
	 * CorporateActionPrice69.mmMinimumMultipleCashToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumMultipleCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mimimum multiple of a cash amount that may be instructed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumMultipleCashToInstruct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice68.mmMinimumMultipleCashToInstruct, CorporateActionPrice69.mmMinimumMultipleCashToInstruct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumMultipleCashToInstruct";
			definition = "Mimimum multiple of a cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing maximumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumCashToInstructRelatedEvent
	 * SecuritiesPricing.mmMaximumCashToInstructRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMaximumCashToInstruct
	 * CorporateActionPrice68.mmMaximumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMaximumCashToInstruct
	 * CorporateActionPrice69.mmMaximumCashToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum cash amount that may be instructed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMaximumCashToInstruct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice68.mmMaximumCashToInstruct, CorporateActionPrice69.mmMaximumCashToInstruct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumCashToInstruct";
			definition = "Maximum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMaximumCashToInstructRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected SecuritiesPricing minimumCashToInstruct;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumCashToInstructRelatedEvent
	 * SecuritiesPricing.mmMinimumCashToInstructRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice68#mmMinimumCashToInstruct
	 * CorporateActionPrice68.mmMinimumCashToInstruct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice69#mmMinimumCashToInstruct
	 * CorporateActionPrice69.mmMinimumCashToInstruct}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumCashToInstruct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Minimum cash amount that may be instructed."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumCashToInstruct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice68.mmMinimumCashToInstruct, CorporateActionPrice69.mmMinimumCashToInstruct);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumCashToInstruct";
			definition = "Minimum cash amount that may be instructed.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmMinimumCashToInstructRelatedEvent;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumCashToInstructRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmMaximumCashToInstructRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumMultipleCashToInstructRelatedEvent, com.tools20022.repository.entity.CorporateActionEvent.mmCorporateActionPrice);
				derivationElement_lazy = () -> Arrays.asList(CorporateActionPrice8.mmIndicativeOrMarketPrice, CorporateActionPrice11.mmIndicativeOrMarketPrice, CorporateActionPrice19.mmIndicativeOrMarketPrice,
						CorporateActionPrice20.mmIndicativeOrMarketPrice, CorporateActionPrice29.mmIndicativeOrMarketPrice, CorporateActionPrice35.mmIndicativeOrMarketPrice, CorporateActionPrice9.mmIndicativeOrMarketPrice,
						CorporateActionPrice12.mmIndicativeOrMarketPrice, CorporateActionPrice27.mmIndicativeOrMarketPrice, CorporateActionPrice33.mmIndicativeOrMarketPrice, CorporateActionPrice39.mmIndicativeOrMarketPrice,
						CorporateActionPrice40.mmIndicativeOrMarketPrice, CorporateActionPrice10.mmIndicativeOrMarketPrice, CorporateActionPrice13.mmIndicativeOrMarketPrice, CorporateActionPrice18.mmIndicativeOrMarketPrice,
						CorporateActionPrice24.mmIndicativeOrMarketPrice, CorporateActionPrice26.mmIndicativeOrMarketPrice, CorporateActionPrice32.mmIndicativeOrMarketPrice, CorporateActionPrice38.mmIndicativeOrMarketPrice,
						CorporateActionPrice41.mmIndicativeOrMarketPrice, CorporateActionPrice31.mmIndicativeOrMarketPrice, CorporateActionPrice37.mmIndicativeOrMarketPrice, CorporateActionPrice4.mmIndicativePrice,
						CorporateActionPrice4.mmMarketPrice, CorporateActionPrice43.mmIndicativeOrMarketPrice, CorporateActionPrice44.mmIndicativeOrMarketPrice, CorporateActionPrice45.mmIndicativeOrMarketPrice,
						CorporateActionPrice52.mmIndicativeOrMarketPrice, CorporateActionPrice55.mmIndicativeOrMarketPrice, CorporateActionPrice51.mmIndicativeOrMarketPrice, CorporateActionPrice59.mmIndicativeOrMarketPrice,
						CorporateActionPrice56.mmIndicativeOrMarketPrice, CorporateActionPrice60.mmIndicativeOrMarketPrice, CorporateActionPrice62.mmIndicativeOrMarketPrice, CorporateActionPrice66.mmIndicativeOrMarketPrice,
						CorporateActionPrice64.mmIndicativeOrMarketPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation,
						com.tools20022.repository.entity.CorporateActionPrice.mmMinimumMultipleCashToInstruct, com.tools20022.repository.entity.CorporateActionPrice.mmMaximumCashToInstruct,
						com.tools20022.repository.entity.CorporateActionPrice.mmMinimumCashToInstruct);
				derivationComponent_lazy = () -> Arrays.asList(CorporateActionPrice8.mmObject(), CorporateActionPrice11.mmObject(), CorporateActionPrice19.mmObject(), CorporateActionPrice20.mmObject(), CorporateActionPrice29.mmObject(),
						CorporateActionPrice35.mmObject(), CorporateActionPrice5.mmObject(), CorporateActionPrice9.mmObject(), CorporateActionPrice7.mmObject(), CorporateActionPrice12.mmObject(), CorporateActionPrice21.mmObject(),
						CorporateActionPrice22.mmObject(), CorporateActionPrice30.mmObject(), CorporateActionPrice27.mmObject(), CorporateActionPrice36.mmObject(), CorporateActionPrice33.mmObject(), CorporateActionPrice39.mmObject(),
						CorporateActionPrice40.mmObject(), CorporateActionPrice6.mmObject(), CorporateActionPrice10.mmObject(), CorporateActionPrice14.mmObject(), CorporateActionPrice13.mmObject(), CorporateActionPrice16.mmObject(),
						CorporateActionPrice18.mmObject(), CorporateActionPrice23.mmObject(), CorporateActionPrice24.mmObject(), CorporateActionPrice28.mmObject(), CorporateActionPrice26.mmObject(), CorporateActionPrice34.mmObject(),
						CorporateActionPrice32.mmObject(), CorporateActionPrice38.mmObject(), CorporateActionPrice41.mmObject(), CorporateActionPrice3.mmObject(), CorporateActionPrice15.mmObject(), CorporateActionPrice17.mmObject(),
						CorporateActionPrice25.mmObject(), CorporateActionPrice31.mmObject(), CorporateActionPrice37.mmObject(), CorporateActionPrice2.mmObject(), CorporateActionPrice1.mmObject(), CorporateActionPrice4.mmObject(),
						CorporateActionPrice42.mmObject(), CorporateActionPrice43.mmObject(), CorporateActionPrice44.mmObject(), CorporateActionPrice45.mmObject(), CorporateActionPrice50.mmObject(), CorporateActionPrice52.mmObject(),
						CorporateActionPrice55.mmObject(), CorporateActionPrice51.mmObject(), CorporateActionPrice59.mmObject(), CorporateActionPrice56.mmObject(), CorporateActionPrice60.mmObject(), CorporateActionPrice58.mmObject(),
						CorporateActionPrice61.mmObject(), CorporateActionPrice57.mmObject(), CorporateActionPrice63.mmObject(), CorporateActionPrice65.mmObject(), CorporateActionPrice62.mmObject(), CorporateActionPrice66.mmObject(),
						CorporateActionPrice67.mmObject(), CorporateActionPrice64.mmObject(), CorporateActionPrice68.mmObject(), CorporateActionPrice69.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionPrice.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionEvent> getCorporateActionEvent() {
		return corporateActionEvent == null ? Optional.empty() : Optional.of(corporateActionEvent);
	}

	public CorporateActionPrice setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
		return this;
	}

	public SecuritiesPricing getCorporateActionExercisePrice() {
		return corporateActionExercisePrice;
	}

	public CorporateActionPrice setCorporateActionExercisePrice(com.tools20022.repository.entity.SecuritiesPricing corporateActionExercisePrice) {
		this.corporateActionExercisePrice = Objects.requireNonNull(corporateActionExercisePrice);
		return this;
	}

	public SecuritiesPricing getGenericCashPriceReceivedPerProduct() {
		return genericCashPriceReceivedPerProduct;
	}

	public CorporateActionPrice setGenericCashPriceReceivedPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPriceReceivedPerProduct) {
		this.genericCashPriceReceivedPerProduct = Objects.requireNonNull(genericCashPriceReceivedPerProduct);
		return this;
	}

	public SecuritiesPricing getGenericCashPricePaidPerProduct() {
		return genericCashPricePaidPerProduct;
	}

	public CorporateActionPrice setGenericCashPricePaidPerProduct(com.tools20022.repository.entity.SecuritiesPricing genericCashPricePaidPerProduct) {
		this.genericCashPricePaidPerProduct = Objects.requireNonNull(genericCashPricePaidPerProduct);
		return this;
	}

	public SecuritiesPricing getCashInLieuOfSharePrice() {
		return cashInLieuOfSharePrice;
	}

	public CorporateActionPrice setCashInLieuOfSharePrice(com.tools20022.repository.entity.SecuritiesPricing cashInLieuOfSharePrice) {
		this.cashInLieuOfSharePrice = Objects.requireNonNull(cashInLieuOfSharePrice);
		return this;
	}

	public SecuritiesPricing getOverSubscriptionDepositPrice() {
		return overSubscriptionDepositPrice;
	}

	public CorporateActionPrice setOverSubscriptionDepositPrice(com.tools20022.repository.entity.SecuritiesPricing overSubscriptionDepositPrice) {
		this.overSubscriptionDepositPrice = Objects.requireNonNull(overSubscriptionDepositPrice);
		return this;
	}

	public SecuritiesPricing getCashValueForTax() {
		return cashValueForTax;
	}

	public CorporateActionPrice setCashValueForTax(com.tools20022.repository.entity.SecuritiesPricing cashValueForTax) {
		this.cashValueForTax = Objects.requireNonNull(cashValueForTax);
		return this;
	}

	public SecuritiesPricing getPricingCalculation() {
		return pricingCalculation;
	}

	public CorporateActionPrice setPricingCalculation(com.tools20022.repository.entity.SecuritiesPricing pricingCalculation) {
		this.pricingCalculation = Objects.requireNonNull(pricingCalculation);
		return this;
	}

	public SecuritiesPricing getMinimumMultipleCashToInstruct() {
		return minimumMultipleCashToInstruct;
	}

	public CorporateActionPrice setMinimumMultipleCashToInstruct(com.tools20022.repository.entity.SecuritiesPricing minimumMultipleCashToInstruct) {
		this.minimumMultipleCashToInstruct = Objects.requireNonNull(minimumMultipleCashToInstruct);
		return this;
	}

	public SecuritiesPricing getMaximumCashToInstruct() {
		return maximumCashToInstruct;
	}

	public CorporateActionPrice setMaximumCashToInstruct(com.tools20022.repository.entity.SecuritiesPricing maximumCashToInstruct) {
		this.maximumCashToInstruct = Objects.requireNonNull(maximumCashToInstruct);
		return this;
	}

	public SecuritiesPricing getMinimumCashToInstruct() {
		return minimumCashToInstruct;
	}

	public CorporateActionPrice setMinimumCashToInstruct(com.tools20022.repository.entity.SecuritiesPricing minimumCashToInstruct) {
		this.minimumCashToInstruct = Objects.requireNonNull(minimumCashToInstruct);
		return this;
	}
}