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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionEvent
 * CorporateActionPrice.CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CorporateActionExercisePrice
 * CorporateActionPrice.CorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPriceReceivedPerProduct
 * CorporateActionPrice.GenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#GenericCashPricePaidPerProduct
 * CorporateActionPrice.GenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#OverSubscriptionDepositPrice
 * CorporateActionPrice.OverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashValueForTax
 * CorporateActionPrice.CashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#PricingCalculation
 * CorporateActionPrice.PricingCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
 * CorporateActionEvent.CorporateActionPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#IndicativeOrMarketPrice
 * CorporateActionPrice8.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#IndicativeOrMarketPrice
 * CorporateActionPrice11.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#IndicativeOrMarketPrice
 * CorporateActionPrice19.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#IndicativeOrMarketPrice
 * CorporateActionPrice20.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#IndicativeOrMarketPrice
 * CorporateActionPrice29.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#IndicativeOrMarketPrice
 * CorporateActionPrice35.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#IndicativeOrMarketPrice
 * CorporateActionPrice9.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#IndicativeOrMarketPrice
 * CorporateActionPrice12.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#IndicativeOrMarketPrice
 * CorporateActionPrice27.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#IndicativeOrMarketPrice
 * CorporateActionPrice33.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#IndicativeOrMarketPrice
 * CorporateActionPrice39.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#IndicativeOrMarketPrice
 * CorporateActionPrice40.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#IndicativeOrMarketPrice
 * CorporateActionPrice10.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#IndicativeOrMarketPrice
 * CorporateActionPrice13.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#IndicativeOrMarketPrice
 * CorporateActionPrice18.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#IndicativeOrMarketPrice
 * CorporateActionPrice24.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#IndicativeOrMarketPrice
 * CorporateActionPrice26.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#IndicativeOrMarketPrice
 * CorporateActionPrice32.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#IndicativeOrMarketPrice
 * CorporateActionPrice38.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#IndicativeOrMarketPrice
 * CorporateActionPrice41.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#IndicativeOrMarketPrice
 * CorporateActionPrice31.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#IndicativeOrMarketPrice
 * CorporateActionPrice37.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#IndicativePrice
 * CorporateActionPrice4.IndicativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice4#MarketPrice
 * CorporateActionPrice4.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#IndicativeOrMarketPrice
 * CorporateActionPrice43.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#IndicativeOrMarketPrice
 * CorporateActionPrice44.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#IndicativeOrMarketPrice
 * CorporateActionPrice45.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#IndicativeOrMarketPrice
 * CorporateActionPrice52.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#IndicativeOrMarketPrice
 * CorporateActionPrice55.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#IndicativeOrMarketPrice
 * CorporateActionPrice51.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#IndicativeOrMarketPrice
 * CorporateActionPrice59.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#IndicativeOrMarketPrice
 * CorporateActionPrice56.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#IndicativeOrMarketPrice
 * CorporateActionPrice60.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#IndicativeOrMarketPrice
 * CorporateActionPrice62.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#IndicativeOrMarketPrice
 * CorporateActionPrice66.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#IndicativeOrMarketPrice
 * CorporateActionPrice64.IndicativeOrMarketPrice}</li>
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
	/**
	 * Corporate event for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#CorporateActionPrice
	 * CorporateActionEvent.CorporateActionPrice}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionEvent";
			definition = "Corporate event for which a price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * 1. Price at which security will be purchased/sold if warrant is
	 * exercised, either as an actual amount or a percentage.<br>
	 * 2. Price at which a bond is converted to underlying security either as an
	 * actual amount or a percentage.<br>
	 * 3. Strike price of an option, represented either as an actual amount or a
	 * percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#ExercisePriceRelatedEvent
	 * SecuritiesPricing.ExercisePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#ExercisePrice
	 * CorporateActionPrice8.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#ExercisePrice
	 * CorporateActionPrice11.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#ExercisePrice
	 * CorporateActionPrice19.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#ExercisePrice
	 * CorporateActionPrice20.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#ExercisePrice
	 * CorporateActionPrice5.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#ExercisePrice
	 * CorporateActionPrice7.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#ExercisePrice
	 * CorporateActionPrice6.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#ExercisePrice
	 * CorporateActionPrice14.ExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#ExercisePrice
	 * CorporateActionPrice1.ExercisePrice}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionExercisePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.ExercisePrice, com.tools20022.repository.msg.CorporateActionPrice11.ExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice19.ExercisePrice, com.tools20022.repository.msg.CorporateActionPrice20.ExercisePrice, com.tools20022.repository.msg.CorporateActionPrice5.ExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice7.ExercisePrice, com.tools20022.repository.msg.CorporateActionPrice6.ExercisePrice, com.tools20022.repository.msg.CorporateActionPrice14.ExercisePrice,
					com.tools20022.repository.msg.CorporateActionPrice1.ExercisePrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionExercisePrice";
			definition = "1. Price at which security will be purchased/sold if warrant is exercised, either as an actual amount or a percentage.\r\n2. Price at which a bond is converted to underlying security either as an actual amount or a percentage.\r\n3. Strike price of an option, represented either as an actual amount or a percentage.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Generic cash price received per product by the underlying security holder
	 * either as a percentage or an amount, eg, redemption price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPriceReceivedPerProductRelatedEvent
	 * SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice8.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice11.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice19.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice20.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice29.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice35.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice5.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption2#GenericCashPriceReceivedPerProduct
	 * CashOption2.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice7.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption9#GenericCashPriceReceivedPerProduct
	 * CashOption9.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice21.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#GenericCashPriceReceivedPerProduct
	 * PriceDetails2.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice22.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#GenericCashPriceReceivedPerProduct
	 * PriceDetails4.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice27.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#GenericCashPriceReceivedPerProduct
	 * PriceDetails7.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice33.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#GenericCashPriceReceivedPerProduct
	 * PriceDetails9.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice39.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#GenericCashPriceReceivedPerProduct
	 * PriceDetails11.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice40.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#GenericCashPriceReceivedPerProduct
	 * PriceDetails12.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice6.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption3#GenericCashPriceReceivedPerProduct
	 * CashOption3.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice14.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption6#GenericCashPriceReceivedPerProduct
	 * CashOption6.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice16.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#GenericCashPriceReceivedPerProduct
	 * PriceDetails3.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice23.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#GenericCashPriceReceivedPerProduct
	 * PriceDetails5.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice26.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#GenericCashPriceReceivedPerProduct
	 * PriceDetails6.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice32.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#GenericCashPriceReceivedPerProduct
	 * PriceDetails8.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice38.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#GenericCashPriceReceivedPerProduct
	 * PriceDetails10.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice41.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#GenericCashPriceReceivedPerProduct
	 * PriceDetails13.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption4#GenericCashPriceReceivedPerProduct
	 * CashOption4.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption8#GenericCashPriceReceivedPerProduct
	 * CashOption8.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice31.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice37.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice1.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#GenericCashPriceReceivedPerProduct
	 * PriceDetails14.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice43.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice44.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice45.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#GenericCashPriceReceivedPerProduct
	 * PriceDetails15.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#GenericCashPriceReceivedPerProduct
	 * PriceDetails18.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#GenericCashPriceReceivedPerProduct
	 * PriceDetails21.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice52.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice55.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice51.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice59.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#GenericCashPriceReceivedPerProduct
	 * PriceDetails23.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice56.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice60.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#GenericCashPriceReceivedPerProduct
	 * PriceDetails22.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#GenericCashPriceReceivedPerProduct
	 * PriceDetails24.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#GenericCashPriceReceivedPerProduct
	 * PriceDetails25.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice62.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice66.GenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#GenericCashPriceReceivedPerProduct
	 * CorporateActionPrice64.GenericCashPriceReceivedPerProduct}</li>
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
	public static final MMBusinessAssociationEnd GenericCashPriceReceivedPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice11.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice19.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice20.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice29.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice35.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice5.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption2.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice7.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption9.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice21.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails2.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice22.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails4.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice27.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails7.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice33.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails9.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice39.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails11.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice40.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails12.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice6.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption3.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice14.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption6.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice16.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails3.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice23.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails5.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice26.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails6.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice32.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails8.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice38.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails10.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice41.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails13.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CashOption4.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CashOption8.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice31.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice37.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice1.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails14.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice43.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice44.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice45.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails15.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails18.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails21.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice52.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice55.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice51.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice59.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails23.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice56.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice60.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails22.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.PriceDetails24.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.PriceDetails25.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice62.GenericCashPriceReceivedPerProduct, com.tools20022.repository.msg.CorporateActionPrice66.GenericCashPriceReceivedPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice64.GenericCashPriceReceivedPerProduct);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProduct";
			definition = "Generic cash price received per product by the underlying security holder either as a percentage or an amount, eg, redemption price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#GenericCashPricePaidPerProductRelatedEvent
	 * SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice8#GenericCashPricePaidPerProduct
	 * CorporateActionPrice8.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice11#GenericCashPricePaidPerProduct
	 * CorporateActionPrice11.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice19#GenericCashPricePaidPerProduct
	 * CorporateActionPrice19.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice20#GenericCashPricePaidPerProduct
	 * CorporateActionPrice20.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice29#GenericCashPricePaidPerProduct
	 * CorporateActionPrice29.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice35#GenericCashPricePaidPerProduct
	 * CorporateActionPrice35.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#GenericCashPricePaidPerProduct
	 * CorporateActionPrice5.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#GenericCashPricePaidPerProduct
	 * CorporateActionPrice7.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails2#GenericCashPricePaidPerProduct
	 * PriceDetails2.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails4#GenericCashPricePaidPerProduct
	 * PriceDetails4.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#GenericCashPricePaidPerProduct
	 * CorporateActionPrice27.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails7#GenericCashPricePaidPerProduct
	 * PriceDetails7.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#GenericCashPricePaidPerProduct
	 * CorporateActionPrice33.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails9#GenericCashPricePaidPerProduct
	 * PriceDetails9.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#GenericCashPricePaidPerProduct
	 * CorporateActionPrice39.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails11#GenericCashPricePaidPerProduct
	 * PriceDetails11.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#GenericCashPricePaidPerProduct
	 * CorporateActionPrice40.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails12#GenericCashPricePaidPerProduct
	 * PriceDetails12.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#GenericCashPricePaidPerProduct
	 * CorporateActionPrice6.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#GenericCashPricePaidPerProduct
	 * CorporateActionPrice14.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails3#GenericCashPricePaidPerProduct
	 * PriceDetails3.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails5#GenericCashPricePaidPerProduct
	 * PriceDetails5.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#GenericCashPricePaidPerProduct
	 * CorporateActionPrice26.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails6#GenericCashPricePaidPerProduct
	 * PriceDetails6.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#GenericCashPricePaidPerProduct
	 * CorporateActionPrice32.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails8#GenericCashPricePaidPerProduct
	 * PriceDetails8.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#GenericCashPricePaidPerProduct
	 * CorporateActionPrice38.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails10#GenericCashPricePaidPerProduct
	 * PriceDetails10.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#GenericCashPricePaidPerProduct
	 * CorporateActionPrice41.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails13#GenericCashPricePaidPerProduct
	 * PriceDetails13.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#GenericCashPricePaidPerProduct
	 * CorporateActionPrice31.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#GenericCashPricePaidPerProduct
	 * CorporateActionPrice37.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#GenericCashPricePaidPerProduct
	 * CorporateActionPrice1.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails14#GenericCashPricePaidPerProduct
	 * PriceDetails14.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#GenericCashPricePaidPerProduct
	 * CorporateActionPrice43.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice44#GenericCashPricePaidPerProduct
	 * CorporateActionPrice44.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#GenericCashPricePaidPerProduct
	 * CorporateActionPrice45.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails15#GenericCashPricePaidPerProduct
	 * PriceDetails15.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails18#GenericCashPricePaidPerProduct
	 * PriceDetails18.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails21#GenericCashPricePaidPerProduct
	 * PriceDetails21.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice52#GenericCashPricePaidPerProduct
	 * CorporateActionPrice52.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#GenericCashPricePaidPerProduct
	 * CorporateActionPrice55.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#GenericCashPricePaidPerProduct
	 * CorporateActionPrice51.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#GenericCashPricePaidPerProduct
	 * CorporateActionPrice59.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails23#GenericCashPricePaidPerProduct
	 * PriceDetails23.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#GenericCashPricePaidPerProduct
	 * CorporateActionPrice56.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice60#GenericCashPricePaidPerProduct
	 * CorporateActionPrice60.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails22#GenericCashPricePaidPerProduct
	 * PriceDetails22.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails24#GenericCashPricePaidPerProduct
	 * PriceDetails24.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceDetails25#GenericCashPricePaidPerProduct
	 * PriceDetails25.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice62#GenericCashPricePaidPerProduct
	 * CorporateActionPrice62.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#GenericCashPricePaidPerProduct
	 * CorporateActionPrice66.GenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#GenericCashPricePaidPerProduct
	 * CorporateActionPrice64.GenericCashPricePaidPerProduct}</li>
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
	public static final MMBusinessAssociationEnd GenericCashPricePaidPerProduct = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice11.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice19.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice20.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice29.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice35.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice5.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice7.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails2.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails4.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice27.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails7.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice33.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails9.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice39.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails11.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice40.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails12.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice6.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice14.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails3.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails5.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice26.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails6.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice32.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails8.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice38.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails10.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice41.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails13.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice31.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice37.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice1.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails14.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice43.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice44.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice45.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails15.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails18.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails21.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice52.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice55.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice51.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice59.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails23.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice56.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice60.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails22.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.PriceDetails24.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.PriceDetails25.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice62.GenericCashPricePaidPerProduct, com.tools20022.repository.msg.CorporateActionPrice66.GenericCashPricePaidPerProduct,
					com.tools20022.repository.msg.CorporateActionPrice64.GenericCashPricePaidPerProduct);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProduct";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashInLieuOfSharePriceRelatedEvent
	 * SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#CashInLieuOfSharePrice
	 * CorporateActionPrice5.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice9#CashInLieuOfSharePrice
	 * CorporateActionPrice9.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#CashInLieuOfSharePrice
	 * CorporateActionPrice7.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice12#CashInLieuOfSharePrice
	 * CorporateActionPrice12.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#CashInLieuOfSharePrice
	 * CorporateActionPrice21.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#CashInLieuOfSharePrice
	 * CorporateActionPrice22.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#CashInLieuOfSharePrice
	 * CorporateActionPrice30.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#CashInLieuOfSharePrice
	 * CorporateActionPrice27.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#CashInLieuOfSharePrice
	 * CorporateActionPrice36.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#CashInLieuOfSharePrice
	 * CorporateActionPrice33.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#CashInLieuOfSharePrice
	 * CorporateActionPrice39.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#CashInLieuOfSharePrice
	 * CorporateActionPrice40.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#CashInLieuOfSharePrice
	 * CorporateActionPrice6.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#CashInLieuOfSharePrice
	 * CorporateActionPrice10.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#CashInLieuOfSharePrice
	 * CorporateActionPrice14.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice13#CashInLieuOfSharePrice
	 * CorporateActionPrice13.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#CashInLieuOfSharePrice
	 * CorporateActionPrice16.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice18#CashInLieuOfSharePrice
	 * CorporateActionPrice18.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#CashInLieuOfSharePrice
	 * CorporateActionPrice23.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice24#CashInLieuOfSharePrice
	 * CorporateActionPrice24.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#CashInLieuOfSharePrice
	 * CorporateActionPrice28.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#CashInLieuOfSharePrice
	 * CorporateActionPrice26.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#CashInLieuOfSharePrice
	 * CorporateActionPrice34.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#CashInLieuOfSharePrice
	 * CorporateActionPrice32.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#CashInLieuOfSharePrice
	 * CorporateActionPrice38.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#CashInLieuOfSharePrice
	 * CorporateActionPrice41.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#CashInLieuOfSharePrice
	 * CorporateActionPrice31.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#CashInLieuOfSharePrice
	 * CorporateActionPrice37.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#CashInLieuOfSharePrice
	 * CorporateActionPrice1.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#CashInLieuOfSharePrice
	 * CorporateActionPrice43.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#CashInLieuOfSharePrice
	 * CorporateActionPrice45.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#CashInLieuOfSharePrice
	 * CorporateActionPrice55.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#CashInLieuOfSharePrice
	 * CorporateActionPrice51.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#CashInLieuOfSharePrice
	 * CorporateActionPrice59.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#CashInLieuOfSharePrice
	 * CorporateActionPrice56.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#CashInLieuOfSharePrice
	 * CorporateActionPrice58.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#CashInLieuOfSharePrice
	 * CorporateActionPrice61.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#CashInLieuOfSharePrice
	 * CorporateActionPrice63.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#CashInLieuOfSharePrice
	 * CorporateActionPrice65.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#CashInLieuOfSharePrice
	 * CorporateActionPrice66.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#CashInLieuOfSharePrice
	 * CorporateActionPrice64.CashInLieuOfSharePrice}</li>
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
	public static final MMBusinessAssociationEnd CashInLieuOfSharePrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice9.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice7.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice12.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice21.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice22.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice30.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice27.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice36.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice33.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice39.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice40.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice6.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice10.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice14.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice13.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice16.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice18.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice23.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice24.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice28.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice26.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice34.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice32.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice38.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice41.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice31.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice37.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice1.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice43.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice45.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice55.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice51.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice59.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice56.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice58.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice61.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice63.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice65.CashInLieuOfSharePrice, com.tools20022.repository.msg.CorporateActionPrice66.CashInLieuOfSharePrice,
					com.tools20022.repository.msg.CorporateActionPrice64.CashInLieuOfSharePrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount of money required per over-subscribed equity as defined by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#OverSubscriptionDepositPriceRelatedEvent
	 * SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#OverSubscriptionDepositPrice
	 * CorporateActionPrice5.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#OverSubscriptionDepositPrice
	 * CorporateActionPrice7.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice21#OverSubscriptionDepositPrice
	 * CorporateActionPrice21.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice22#OverSubscriptionDepositPrice
	 * CorporateActionPrice22.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice30#OverSubscriptionDepositPrice
	 * CorporateActionPrice30.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice36#OverSubscriptionDepositPrice
	 * CorporateActionPrice36.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#OverSubscriptionDepositPrice
	 * CorporateActionPrice6.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#OverSubscriptionDepositPrice
	 * CorporateActionPrice14.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice16#OverSubscriptionDepositPrice
	 * CorporateActionPrice16.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice23#OverSubscriptionDepositPrice
	 * CorporateActionPrice23.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice28#OverSubscriptionDepositPrice
	 * CorporateActionPrice28.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice34#OverSubscriptionDepositPrice
	 * CorporateActionPrice34.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#OverSubscriptionDepositPrice
	 * CorporateActionPrice1.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice58#OverSubscriptionDepositPrice
	 * CorporateActionPrice58.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice61#OverSubscriptionDepositPrice
	 * CorporateActionPrice61.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice63#OverSubscriptionDepositPrice
	 * CorporateActionPrice63.OverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice65#OverSubscriptionDepositPrice
	 * CorporateActionPrice65.OverSubscriptionDepositPrice}</li>
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
	public static final MMBusinessAssociationEnd OverSubscriptionDepositPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice7.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice21.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice22.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice30.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice36.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice6.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice14.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice16.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice23.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice28.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice34.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice1.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice58.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice61.OverSubscriptionDepositPrice, com.tools20022.repository.msg.CorporateActionPrice63.OverSubscriptionDepositPrice,
					com.tools20022.repository.msg.CorporateActionPrice65.OverSubscriptionDepositPrice);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPrice";
			definition = "Amount of money required per over-subscribed equity as defined by the issuer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash value of resulting securities proceeds for tax calculation and/or
	 * reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#CashValueForTaxRelatedEvent
	 * SecuritiesPricing.CashValueForTaxRelatedEvent}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice27#CashValueForTax
	 * CorporateActionPrice27.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice33#CashValueForTax
	 * CorporateActionPrice33.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice39#CashValueForTax
	 * CorporateActionPrice39.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice40#CashValueForTax
	 * CorporateActionPrice40.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice26#CashValueForTax
	 * CorporateActionPrice26.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice32#CashValueForTax
	 * CorporateActionPrice32.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice38#CashValueForTax
	 * CorporateActionPrice38.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice41#CashValueForTax
	 * CorporateActionPrice41.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice31#CashValueForTax
	 * CorporateActionPrice31.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice37#CashValueForTax
	 * CorporateActionPrice37.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice43#CashValueForTax
	 * CorporateActionPrice43.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice45#CashValueForTax
	 * CorporateActionPrice45.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice55#CashValueForTax
	 * CorporateActionPrice55.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice51#CashValueForTax
	 * CorporateActionPrice51.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice59#CashValueForTax
	 * CorporateActionPrice59.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice56#CashValueForTax
	 * CorporateActionPrice56.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice66#CashValueForTax
	 * CorporateActionPrice66.CashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice64#CashValueForTax
	 * CorporateActionPrice64.CashValueForTax}</li>
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
	public static final MMBusinessAssociationEnd CashValueForTax = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice27.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice33.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice39.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice40.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice26.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice32.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice38.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice41.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice31.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice37.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice43.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice45.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice55.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice51.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice59.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice56.CashValueForTax, com.tools20022.repository.msg.CorporateActionPrice66.CashValueForTax,
					com.tools20022.repository.msg.CorporateActionPrice64.CashValueForTax);
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashValueForTax";
			definition = "Cash value of resulting securities proceeds for tax calculation and/or reporting.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the parameters taken into account to calculate the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#RelatedCorporateActionPrice
	 * SecuritiesPricing.RelatedCorporateActionPrice}</li>
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
	public static final MMBusinessAssociationEnd PricingCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PricingCalculation";
			definition = "Specifies the parameters taken into account to calculate the price.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice";
				definition = "Prices related to a corporate action.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.ExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.GenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.GenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashInLieuOfSharePriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.OverSubscriptionDepositPriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.CashValueForTaxRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.RelatedCorporateActionPrice, com.tools20022.repository.entity.CorporateActionEvent.CorporateActionPrice);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice8.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice11.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice19.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice20.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice29.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice35.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice9.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice12.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice27.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice33.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice39.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice40.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice10.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice13.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice18.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice24.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice26.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice32.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice38.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice41.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice31.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice37.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice4.IndicativePrice, com.tools20022.repository.msg.CorporateActionPrice4.MarketPrice, com.tools20022.repository.msg.CorporateActionPrice43.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice44.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice45.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice52.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice55.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice51.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice59.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice56.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice60.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice62.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice66.IndicativeOrMarketPrice,
						com.tools20022.repository.msg.CorporateActionPrice64.IndicativeOrMarketPrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionPrice.CorporateActionEvent, com.tools20022.repository.entity.CorporateActionPrice.CorporateActionExercisePrice,
						com.tools20022.repository.entity.CorporateActionPrice.GenericCashPriceReceivedPerProduct, com.tools20022.repository.entity.CorporateActionPrice.GenericCashPricePaidPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice, com.tools20022.repository.entity.CorporateActionPrice.OverSubscriptionDepositPrice,
						com.tools20022.repository.entity.CorporateActionPrice.CashValueForTax, com.tools20022.repository.entity.CorporateActionPrice.PricingCalculation);
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
						CorporateActionPrice67.mmObject(), CorporateActionPrice64.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}