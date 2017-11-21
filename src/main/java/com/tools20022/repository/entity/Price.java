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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money for which goods, services or assets are offered, sold, or
 * bought.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Price" src="doc-files/Price.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmAmount
 * Price.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmOption
 * Price.mmOption}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitPriceProduct
 * Price.mmUnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetPriceProduct
 * Price.mmNetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceAdjustment
 * Price.mmPriceAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmGrossPriceProduct
 * Price.mmGrossPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmUnitOfMeasure
 * Price.mmUnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmPriceTolerance
 * Price.mmPriceTolerance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmCurrency
 * Price.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmFactor
 * Price.mmFactor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmNetting
 * Price.mmNetting}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
 * Price.mmSecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1
 * PriceValueChange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1 OtherPrices1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice1
 * ProprietaryPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice2
 * ProprietaryPrice2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1 PriceRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice8 UnitPrice8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice9 UnitPrice9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1 BillingPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2 OtherPrices2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18 UnitPrice18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters1
 * ATMCassetteCounters1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCassetteCounters3
 * ATMCassetteCounters3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice
 * SecuritiesTransactionPrice4Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
 * SecuritiesPricing.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
 * Product.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmNetPrice
 * Product.mmNetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
 * Product.mmGrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
 * Adjustment.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
 * Option.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#mmPrice
 * Tolerance.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#mmAverageDealPrice
 * Netting.mmAverageDealPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2#mmPriceDetails
 * PriceValuation2.mmPriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#mmPriceDetails
 * PriceValuation3.mmPriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMaximum
 * OtherPrices1.mmMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmTransaction
 * OtherPrices1.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedUp
 * OtherPrices1.mmMarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmMarkedDown
 * OtherPrices1.mmMarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetDisclosed
 * OtherPrices1.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNetUndisclosed
 * OtherPrices1.mmNetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmNotionalGross
 * OtherPrices1.mmNotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmarkWeightedAverage
 * OtherPrices1.mmBenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#mmAllMarketsWeightedAverage
 * OtherPrices1.mmAllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmBenchmark
 * OtherPrices1.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmOtherPrice
 * OtherPrices1.mmOtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmIndexPrice
 * OtherPrices1.mmIndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReportedPrice
 * OtherPrices1.mmReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#mmReferencePrice
 * OtherPrices1.mmReferencePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice1#mmPrice
 * ProprietaryPrice1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice2#mmPrice
 * ProprietaryPrice2.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmUnitPrice
 * BillingPrice1.mmUnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMaximum
 * OtherPrices2.mmMaximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmTransaction
 * OtherPrices2.mmTransaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedUp
 * OtherPrices2.mmMarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmMarkedDown
 * OtherPrices2.mmMarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetDisclosed
 * OtherPrices2.mmNetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNetUndisclosed
 * OtherPrices2.mmNetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmNotionalGross
 * OtherPrices2.mmNotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmarkWeightedAverage
 * OtherPrices2.mmBenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#mmAllMarketsWeightedAverage
 * OtherPrices2.mmAllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmBenchmark
 * OtherPrices2.mmBenchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmOtherPrice
 * OtherPrices2.mmOtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmIndexPrice
 * OtherPrices2.mmIndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmReportedPrice
 * OtherPrices2.mmReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#mmReferencePrice
 * OtherPrices2.mmReferencePrice}</li>
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
 * "Price"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods, services or assets are offered, sold, or bought."
 * </li>
 * </ul>
 */
public class Price {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount amount;
	/**
	 * Price expressed as a currency and value.
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
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue1#mmAmount
	 * PriceValue1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue2#mmAmount
	 * PriceValue2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1#mmAmount
	 * PriceValueChange1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue5#mmAmount
	 * PriceValue5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice#mmAmountPrice
	 * PriceFormat5Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#mmAmountPrice
	 * PriceFormat9Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat17Choice#mmAmountPrice
	 * PriceFormat17Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#mmAmountPrice
	 * PriceFormat18Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#mmAmountPrice
	 * PriceFormat21Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#mmAmountPrice
	 * PriceFormat24Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#mmAmountPrice
	 * PriceFormat6Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#mmAmountPrice
	 * PriceFormat7Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#mmAmountPrice
	 * PriceFormat12Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#mmAmountPrice
	 * PriceFormat13Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice#mmAmountPrice
	 * PriceFormat11Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#mmAmountPrice
	 * PriceFormat8Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#mmAmountPrice
	 * PriceFormat10Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat15Choice#mmAmountPrice
	 * PriceFormat15Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#mmAmountPrice
	 * PriceFormat16Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#mmAmountPrice
	 * PriceFormat14Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat19Choice#mmAmountPrice
	 * PriceFormat19Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#mmAmountPrice
	 * PriceFormat20Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#mmAmountPrice
	 * PriceFormat23Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#mmAmountPrice
	 * PriceFormat22Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat25Choice#mmAmountPrice
	 * PriceFormat25Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#mmAmountPrice
	 * PriceFormat26Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#mmAmountPrice
	 * PriceFormat27Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPrice
	 * PriceFormat28Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat29Choice#mmAmountPrice
	 * PriceFormat29Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat31Choice#mmAmountPrice
	 * PriceFormat31Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice#mmAmount
	 * PriceFormat3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmAmount
	 * PriceFormat4Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice#mmAmount
	 * PriceFormat2Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmAmount
	 * PriceFormat1Choice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice8#mmAmount
	 * UnitPrice8.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice9#mmAmount
	 * UnitPrice9.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue6#mmAmount
	 * PriceValue6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmUnitPrice
	 * ServiceItemTotals1.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#mmAmountPrice
	 * PriceFormat33Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#mmAmountPrice
	 * PriceFormat32Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#mmAmountPrice
	 * PriceFormat34Choice.mmAmountPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmAmount
	 * UnitPrice18.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#mmAmountPrice
	 * PriceFormat43Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#mmAmountPrice
	 * PriceFormat40Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#mmAmountPrice
	 * PriceFormat39Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmUnitValue
	 * ATMCassetteCounters1.mmUnitValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCurrentAmount
	 * ATMCassetteCounters1.mmCurrentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat45Choice#mmAmountPrice
	 * PriceFormat45Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice#mmAmountPrice
	 * PriceFormat50Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPrice
	 * PriceFormat48Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#mmAmountPrice
	 * PriceFormat51Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat46Choice#mmAmountPrice
	 * PriceFormat46Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmAmountPrice
	 * PriceFormat49Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmAmountPrice
	 * PriceFormat47Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#mmAmountPrice
	 * PriceFormat44Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#mmAmountPrice
	 * PriceFormat56Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat57Choice#mmAmountPrice
	 * PriceFormat57Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat52Choice#mmAmountPrice
	 * PriceFormat52Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#mmAmountPrice
	 * PriceFormat59Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#mmAmountPrice
	 * PriceFormat55Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPrice
	 * PriceFormat53Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#mmAmountPrice
	 * PriceFormat60Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat58Choice#mmAmountPrice
	 * PriceFormat58Choice.mmAmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmUnitValue
	 * ATMCassetteCounters3.mmUnitValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrentAmount
	 * ATMCassetteCounters3.mmCurrentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValue1.mmAmount, PriceValue2.mmAmount, PriceValueChange1.mmAmount, PriceValue5.mmAmount, PriceFormat5Choice.mmAmountPrice, PriceFormat9Choice.mmAmountPrice,
					PriceFormat17Choice.mmAmountPrice, PriceFormat18Choice.mmAmountPrice, PriceFormat21Choice.mmAmountPrice, PriceFormat24Choice.mmAmountPrice, PriceFormat6Choice.mmAmountPrice, PriceFormat7Choice.mmAmountPrice,
					PriceFormat12Choice.mmAmountPrice, PriceFormat13Choice.mmAmountPrice, PriceFormat11Choice.mmAmountPrice, PriceFormat8Choice.mmAmountPrice, PriceFormat10Choice.mmAmountPrice, PriceFormat15Choice.mmAmountPrice,
					PriceFormat16Choice.mmAmountPrice, PriceFormat14Choice.mmAmountPrice, PriceFormat19Choice.mmAmountPrice, PriceFormat20Choice.mmAmountPrice, PriceFormat23Choice.mmAmountPrice, PriceFormat22Choice.mmAmountPrice,
					PriceFormat25Choice.mmAmountPrice, PriceFormat26Choice.mmAmountPrice, PriceFormat27Choice.mmAmountPrice, PriceFormat28Choice.mmAmountPrice, PriceFormat29Choice.mmAmountPrice, PriceFormat31Choice.mmAmountPrice,
					PriceFormat3Choice.mmAmount, PriceFormat4Choice.mmAmount, PriceFormat2Choice.mmAmount, PriceFormat1Choice.mmAmount, UnitPrice8.mmAmount, UnitPrice9.mmAmount, PriceValue6.mmAmount, ServiceItemTotals1.mmUnitPrice,
					PriceFormat33Choice.mmAmountPrice, PriceFormat32Choice.mmAmountPrice, PriceFormat34Choice.mmAmountPrice, UnitPrice18.mmAmount, PriceFormat43Choice.mmAmountPrice, PriceFormat40Choice.mmAmountPrice,
					PriceFormat39Choice.mmAmountPrice, ATMCassetteCounters1.mmUnitValue, ATMCassetteCounters1.mmCurrentAmount, PriceFormat45Choice.mmAmountPrice, PriceFormat50Choice.mmAmountPrice, PriceFormat48Choice.mmAmountPrice,
					PriceFormat51Choice.mmAmountPrice, PriceFormat46Choice.mmAmountPrice, PriceFormat49Choice.mmAmountPrice, PriceFormat47Choice.mmAmountPrice, PriceFormat44Choice.mmAmountPrice, PriceFormat56Choice.mmAmountPrice,
					PriceFormat57Choice.mmAmountPrice, PriceFormat52Choice.mmAmountPrice, PriceFormat59Choice.mmAmountPrice, PriceFormat55Choice.mmAmountPrice, PriceFormat53Choice.mmAmountPrice, PriceFormat60Choice.mmAmountPrice,
					PriceFormat58Choice.mmAmountPrice, ATMCassetteCounters3.mmUnitValue, ATMCassetteCounters3.mmCurrentAmount);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Price.class.getMethod("getAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Option option;
	/**
	 * Option for which a strike price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#mmStrikePrice
	 * Option.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Option Option}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which a strike price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Option.mmStrikePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
		}
	};
	protected Product unitPriceProduct;
	/**
	 * Product for which a unit price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmUnitPrice
	 * Product.mmUnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a unit price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmUnitPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitPriceProduct";
			definition = "Product for which a unit price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmUnitPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected Product netPriceProduct;
	/**
	 * Product for which a net price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmNetPrice
	 * Product.mmNetPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a net price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetPriceProduct";
			definition = "Product for which a net price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmNetPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Adjustment> priceAdjustment;
	/**
	 * Variance on price for the goods and services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmPrice
	 * Adjustment.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem10#mmNetPriceAllowanceCharge
	 * LineItem10.mmNetPriceAllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmAdjustment
	 * LineItemDetails4.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#mmAdjustment
	 * LineItem5.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmAdjustment
	 * LineItemDetails7.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#mmAdjustment
	 * LineItem7.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#mmAdjustment
	 * LineItemDetails6.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#mmAdjustment
	 * LineItem4.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#mmAdjustment
	 * LineItemDetails9.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#mmAdjustment
	 * LineItem9.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3#mmAdjustment
	 * ReportLine3.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2#mmAdjustment
	 * ReportLine2.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4#mmAdjustment
	 * ReportLine4.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#mmAdjustment
	 * LineItem11.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmAdjustment
	 * LineItemDetails10.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7#mmAdjustment
	 * ReportLine7.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#mmAdjustment
	 * LineItem12.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#mmAdjustment
	 * LineItemDetails11.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#mmAdjustment
	 * ReportLine6.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5#mmAdjustment
	 * ReportLine5.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmAdjustment
	 * LineItemDetails13.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#mmAdjustment
	 * LineItem13.mmAdjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#mmAdjustment
	 * LineItem15.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#mmAdjustment
	 * LineItemDetails14.mmAdjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#mmNetPriceAllowanceCharge
	 * LineItem16.mmNetPriceAllowanceCharge}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance on price for the goods and services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceAdjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItem10.mmNetPriceAllowanceCharge, LineItemDetails4.mmAdjustment, LineItem5.mmAdjustment, LineItemDetails7.mmAdjustment, LineItem7.mmAdjustment, LineItemDetails6.mmAdjustment,
					LineItem4.mmAdjustment, LineItemDetails9.mmAdjustment, LineItem9.mmAdjustment, ReportLine3.mmAdjustment, ReportLine2.mmAdjustment, ReportLine4.mmAdjustment, LineItem11.mmAdjustment, LineItemDetails10.mmAdjustment,
					ReportLine7.mmAdjustment, LineItem12.mmAdjustment, LineItemDetails11.mmAdjustment, ReportLine6.mmAdjustment, ReportLine5.mmAdjustment, LineItemDetails13.mmAdjustment, LineItem13.mmAdjustment, LineItem15.mmAdjustment,
					LineItemDetails14.mmAdjustment, LineItem16.mmNetPriceAllowanceCharge);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceAdjustment";
			definition = "Variance on price for the goods and services.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected Product grossPriceProduct;
	/**
	 * Product for which a gross price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#mmGrossPrice
	 * Product.mmGrossPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossPriceProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product for which a gross price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossPriceProduct";
			definition = "Product for which a gross price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmGrossPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected UnitOfMeasureCode unitOfMeasure;
	/**
	 * Specifies the unit of measurement. For example: kilo, tons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnitOfMeasureCode
	 * UnitOfMeasureCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice8#mmUnitOfMeasureCode
	 * UnitPrice8.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice8#mmOtherUnitOfMeasure
	 * UnitPrice8.mmOtherUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#mmUnitOfMeasureCode
	 * UnitPrice9.mmUnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#mmOtherUnitOfMeasure
	 * UnitPrice9.mmOtherUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#mmUnitPrice
	 * UnitPrice18.mmUnitPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitOfMeasure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unit of measurement. For example: kilo, tons."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice8.mmUnitOfMeasureCode, UnitPrice8.mmOtherUnitOfMeasure, UnitPrice9.mmUnitOfMeasureCode, UnitPrice9.mmOtherUnitOfMeasure, UnitPrice18.mmUnitPrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example: kilo, tons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Price.class.getMethod("getUnitOfMeasure", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tolerance priceTolerance;
	/**
	 * Variance allowed on the price of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tolerance#mmPrice
	 * Tolerance.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tolerance Tolerance}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#mmPriceTolerance
	 * LineItemDetails4.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#mmPriceTolerance
	 * LineItemDetails7.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#mmPriceTolerance
	 * LineItemDetails5.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#mmPriceTolerance
	 * LineItemDetails8.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#mmPriceTolerance
	 * LineItemDetails10.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#mmPriceTolerance
	 * LineItemDetails13.mmPriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#mmPriceTolerance
	 * LineItemDetails12.mmPriceTolerance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Variance allowed on the price of goods."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceTolerance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(LineItemDetails4.mmPriceTolerance, LineItemDetails7.mmPriceTolerance, LineItemDetails5.mmPriceTolerance, LineItemDetails8.mmPriceTolerance, LineItemDetails10.mmPriceTolerance,
					LineItemDetails13.mmPriceTolerance, LineItemDetails12.mmPriceTolerance);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceTolerance";
			definition = "Variance allowed on the price of goods.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tolerance.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency code in which the price is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#mmCurrency
	 * BillingPrice1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#mmCurrency
	 * ATMCassetteCounters1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#mmCurrency
	 * ATMCassetteCounters3.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency code in which the price is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(BillingPrice1.mmCurrency, ATMCassetteCounters1.mmCurrency, ATMCassetteCounters3.mmCurrency);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency code in which the price is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Price.class.getMethod("getCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max15NumericText factor;
	/**
	 * Multiplication factor of measurement values. For example: 36 pieces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Factor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Multiplication factor of measurement values. For example: 36 pieces."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFactor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: 36 pieces.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Price.class.getMethod("getFactor", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Netting netting;
	/**
	 * Netting for which an average price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmAverageDealPrice
	 * Netting.mmAverageDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Netting Netting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Netting for which an average price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting for which an average price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.mmAverageDealPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
		}
	};
	protected SecuritiesPricing securitiesPricing;
	/**
	 * Pricing parameters for a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#mmStrikePrice
	 * FinancialInstrumentAttributes8.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#mmStrikePrice
	 * FinancialInstrumentAttributes20.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#mmStrikePrice
	 * FinancialInstrumentAttributes35.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#mmStrikePrice
	 * FinancialInstrumentAttributes41.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#mmStrikePrice
	 * FinancialInstrumentAttributes4.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#mmStrikePrice
	 * FinancialInstrumentAttributes13.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#mmStrikePrice
	 * FinancialInstrumentAttributes21.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#mmStrikePrice
	 * FinancialInstrumentAttributes26.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#mmStrikePrice
	 * FinancialInstrumentAttributes36.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#mmStrikePrice
	 * FinancialInstrumentAttributes42.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#mmStrikePrice
	 * FinancialInstrumentAttributes27.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#mmStrikePrice
	 * FinancialInstrumentAttributes14.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#mmStrikePrice
	 * FinancialInstrumentAttributes30.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#mmStrikePrice
	 * FinancialInstrumentAttributes28.mmStrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#mmStrikePrice
	 * Option1.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#mmStrikePrice
	 * FinancialInstrumentAttributes15.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#mmStrikePrice
	 * FinancialInstrumentAttributes29.mmStrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#mmStrikePrice
	 * Option7.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#mmStrikePrice
	 * FinancialInstrumentAttributes2.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#mmStrikePrice
	 * FinancialInstrumentAttributes63.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#mmStrikePrice
	 * FinancialInstrumentAttributes64.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#mmStrikePrice
	 * FinancialInstrumentAttributes75.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#mmStrikePrice
	 * FinancialInstrumentAttributes78.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice#mmPrice
	 * SecuritiesTransactionPrice4Choice.mmPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Price
	 * Price}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPricing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pricing parameters for a security."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes8.mmStrikePrice, FinancialInstrumentAttributes20.mmStrikePrice, FinancialInstrumentAttributes35.mmStrikePrice, FinancialInstrumentAttributes41.mmStrikePrice,
					FinancialInstrumentAttributes4.mmStrikePrice, FinancialInstrumentAttributes13.mmStrikePrice, FinancialInstrumentAttributes21.mmStrikePrice, FinancialInstrumentAttributes26.mmStrikePrice,
					FinancialInstrumentAttributes36.mmStrikePrice, FinancialInstrumentAttributes42.mmStrikePrice, FinancialInstrumentAttributes27.mmStrikePrice, FinancialInstrumentAttributes14.mmStrikePrice,
					FinancialInstrumentAttributes30.mmStrikePrice, FinancialInstrumentAttributes28.mmStrikePrice, Option1.mmStrikePrice, FinancialInstrumentAttributes15.mmStrikePrice, FinancialInstrumentAttributes29.mmStrikePrice,
					Option7.mmStrikePrice, FinancialInstrumentAttributes2.mmStrikePrice, FinancialInstrumentAttributes63.mmStrikePrice, FinancialInstrumentAttributes64.mmStrikePrice, FinancialInstrumentAttributes75.mmStrikePrice,
					FinancialInstrumentAttributes78.mmStrikePrice, SecuritiesTransactionPrice4Choice.mmPrice);
			elementContext_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
			isDerived = false;
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing parameters for a security.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Price";
				definition = "Amount of money for which goods, services or assets are offered, sold, or bought.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmPrice, com.tools20022.repository.entity.Product.mmUnitPrice, com.tools20022.repository.entity.Product.mmNetPrice,
						com.tools20022.repository.entity.Product.mmGrossPrice, com.tools20022.repository.entity.Adjustment.mmPrice, com.tools20022.repository.entity.Option.mmStrikePrice, com.tools20022.repository.entity.Tolerance.mmPrice,
						com.tools20022.repository.entity.Netting.mmAverageDealPrice);
				derivationElement_lazy = () -> Arrays.asList(PriceValuation2.mmPriceDetails, PriceValuation3.mmPriceDetails, OtherPrices1.mmMaximum, OtherPrices1.mmTransaction, OtherPrices1.mmMarkedUp, OtherPrices1.mmMarkedDown,
						OtherPrices1.mmNetDisclosed, OtherPrices1.mmNetUndisclosed, OtherPrices1.mmNotionalGross, OtherPrices1.mmBenchmarkWeightedAverage, OtherPrices1.mmAllMarketsWeightedAverage, OtherPrices1.mmBenchmark,
						OtherPrices1.mmOtherPrice, OtherPrices1.mmIndexPrice, OtherPrices1.mmReportedPrice, OtherPrices1.mmReferencePrice, ProprietaryPrice1.mmPrice, ProprietaryPrice2.mmPrice, BillingPrice1.mmUnitPrice,
						OtherPrices2.mmMaximum, OtherPrices2.mmTransaction, OtherPrices2.mmMarkedUp, OtherPrices2.mmMarkedDown, OtherPrices2.mmNetDisclosed, OtherPrices2.mmNetUndisclosed, OtherPrices2.mmNotionalGross,
						OtherPrices2.mmBenchmarkWeightedAverage, OtherPrices2.mmAllMarketsWeightedAverage, OtherPrices2.mmBenchmark, OtherPrices2.mmOtherPrice, OtherPrices2.mmIndexPrice, OtherPrices2.mmReportedPrice,
						OtherPrices2.mmReferencePrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.mmAmount, com.tools20022.repository.entity.Price.mmOption, com.tools20022.repository.entity.Price.mmUnitPriceProduct,
						com.tools20022.repository.entity.Price.mmNetPriceProduct, com.tools20022.repository.entity.Price.mmPriceAdjustment, com.tools20022.repository.entity.Price.mmGrossPriceProduct,
						com.tools20022.repository.entity.Price.mmUnitOfMeasure, com.tools20022.repository.entity.Price.mmPriceTolerance, com.tools20022.repository.entity.Price.mmCurrency, com.tools20022.repository.entity.Price.mmFactor,
						com.tools20022.repository.entity.Price.mmNetting, com.tools20022.repository.entity.Price.mmSecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(PriceValueChange1.mmObject(), OtherPrices1.mmObject(), ProprietaryPrice1.mmObject(), ProprietaryPrice2.mmObject(), PriceRate1.mmObject(), UnitPrice8.mmObject(),
						UnitPrice9.mmObject(), BillingPrice1.mmObject(), OtherPrices2.mmObject(), UnitPrice18.mmObject(), ATMCassetteCounters1.mmObject(), ATMCassetteCounters3.mmObject(), SecuritiesTransactionPrice4Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Price.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public Option getOption() {
		return option;
	}

	public void setOption(com.tools20022.repository.entity.Option option) {
		this.option = option;
	}

	public Product getUnitPriceProduct() {
		return unitPriceProduct;
	}

	public void setUnitPriceProduct(com.tools20022.repository.entity.Product unitPriceProduct) {
		this.unitPriceProduct = unitPriceProduct;
	}

	public Product getNetPriceProduct() {
		return netPriceProduct;
	}

	public void setNetPriceProduct(com.tools20022.repository.entity.Product netPriceProduct) {
		this.netPriceProduct = netPriceProduct;
	}

	public List<Adjustment> getPriceAdjustment() {
		return priceAdjustment;
	}

	public void setPriceAdjustment(List<com.tools20022.repository.entity.Adjustment> priceAdjustment) {
		this.priceAdjustment = priceAdjustment;
	}

	public Product getGrossPriceProduct() {
		return grossPriceProduct;
	}

	public void setGrossPriceProduct(com.tools20022.repository.entity.Product grossPriceProduct) {
		this.grossPriceProduct = grossPriceProduct;
	}

	public UnitOfMeasureCode getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(UnitOfMeasureCode unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public Tolerance getPriceTolerance() {
		return priceTolerance;
	}

	public void setPriceTolerance(com.tools20022.repository.entity.Tolerance priceTolerance) {
		this.priceTolerance = priceTolerance;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public Max15NumericText getFactor() {
		return factor;
	}

	public void setFactor(Max15NumericText factor) {
		this.factor = factor;
	}

	public Netting getNetting() {
		return netting;
	}

	public void setNetting(com.tools20022.repository.entity.Netting netting) {
		this.netting = netting;
	}

	public SecuritiesPricing getSecuritiesPricing() {
		return securitiesPricing;
	}

	public void setSecuritiesPricing(com.tools20022.repository.entity.SecuritiesPricing securitiesPricing) {
		this.securitiesPricing = securitiesPricing;
	}
}