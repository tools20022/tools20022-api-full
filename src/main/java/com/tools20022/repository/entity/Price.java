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
import com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.UnitOfMeasureCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max15NumericText;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Price#Amount Price.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Option Price.Option}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#UnitPriceProduct
 * Price.UnitPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#NetPriceProduct
 * Price.NetPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#PriceAdjustment
 * Price.PriceAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#GrossPriceProduct
 * Price.GrossPriceProduct}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#UnitOfMeasure
 * Price.UnitOfMeasure}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#PriceTolerance
 * Price.PriceTolerance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Currency
 * Price.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Factor Price.Factor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#Netting Price.Netting}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#SecuritiesPricing
 * Price.SecuritiesPricing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#Price
 * SecuritiesPricing.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#UnitPrice
 * Product.UnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#NetPrice
 * Product.NetPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#GrossPrice
 * Product.GrossPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Price
 * Adjustment.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Option#StrikePrice
 * Option.StrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tolerance#Price
 * Tolerance.Price}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Netting#AverageDealPrice
 * Netting.AverageDealPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2#PriceDetails
 * PriceValuation2.PriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#PriceDetails
 * PriceValuation3.PriceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#Maximum
 * OtherPrices1.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#Transaction
 * OtherPrices1.Transaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#MarkedUp
 * OtherPrices1.MarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#MarkedDown
 * OtherPrices1.MarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#NetDisclosed
 * OtherPrices1.NetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#NetUndisclosed
 * OtherPrices1.NetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#NotionalGross
 * OtherPrices1.NotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#BenchmarkWeightedAverage
 * OtherPrices1.BenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices1#AllMarketsWeightedAverage
 * OtherPrices1.AllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#Benchmark
 * OtherPrices1.Benchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#OtherPrice
 * OtherPrices1.OtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#IndexPrice
 * OtherPrices1.IndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#ReportedPrice
 * OtherPrices1.ReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices1#ReferencePrice
 * OtherPrices1.ReferencePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice1#Price
 * ProprietaryPrice1.Price}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ProprietaryPrice2#Price
 * ProprietaryPrice2.Price}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#UnitPrice
 * BillingPrice1.UnitPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Maximum
 * OtherPrices2.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Transaction
 * OtherPrices2.Transaction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#MarkedUp
 * OtherPrices2.MarkedUp}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#MarkedDown
 * OtherPrices2.MarkedDown}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NetDisclosed
 * OtherPrices2.NetDisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NetUndisclosed
 * OtherPrices2.NetUndisclosed}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#NotionalGross
 * OtherPrices2.NotionalGross}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#BenchmarkWeightedAverage
 * OtherPrices2.BenchmarkWeightedAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherPrices2#AllMarketsWeightedAverage
 * OtherPrices2.AllMarketsWeightedAverage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#Benchmark
 * OtherPrices2.Benchmark}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#OtherPrice
 * OtherPrices2.OtherPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#IndexPrice
 * OtherPrices2.IndexPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#ReportedPrice
 * OtherPrices2.ReportedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherPrices2#ReferencePrice
 * OtherPrices2.ReferencePrice}</li>
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
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue1#Amount
	 * PriceValue1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue2#Amount
	 * PriceValue2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1#Amount
	 * PriceValueChange1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue5#Amount
	 * PriceValue5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat5Choice#AmountPrice
	 * PriceFormat5Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat9Choice#AmountPrice
	 * PriceFormat9Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat17Choice#AmountPrice
	 * PriceFormat17Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat18Choice#AmountPrice
	 * PriceFormat18Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat21Choice#AmountPrice
	 * PriceFormat21Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat24Choice#AmountPrice
	 * PriceFormat24Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat6Choice#AmountPrice
	 * PriceFormat6Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat7Choice#AmountPrice
	 * PriceFormat7Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat12Choice#AmountPrice
	 * PriceFormat12Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat13Choice#AmountPrice
	 * PriceFormat13Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice#AmountPrice
	 * PriceFormat11Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat8Choice#AmountPrice
	 * PriceFormat8Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat10Choice#AmountPrice
	 * PriceFormat10Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat15Choice#AmountPrice
	 * PriceFormat15Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat16Choice#AmountPrice
	 * PriceFormat16Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat14Choice#AmountPrice
	 * PriceFormat14Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat19Choice#AmountPrice
	 * PriceFormat19Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPrice
	 * PriceFormat20Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat23Choice#AmountPrice
	 * PriceFormat23Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat22Choice#AmountPrice
	 * PriceFormat22Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat25Choice#AmountPrice
	 * PriceFormat25Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat26Choice#AmountPrice
	 * PriceFormat26Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat27Choice#AmountPrice
	 * PriceFormat27Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#AmountPrice
	 * PriceFormat28Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat29Choice#AmountPrice
	 * PriceFormat29Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat31Choice#AmountPrice
	 * PriceFormat31Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice#Amount
	 * PriceFormat3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#Amount
	 * PriceFormat4Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice#Amount
	 * PriceFormat2Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#Amount
	 * PriceFormat1Choice.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice8#Amount
	 * UnitPrice8.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice9#Amount
	 * UnitPrice9.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValue6#Amount
	 * PriceValue6.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#UnitPrice
	 * ServiceItemTotals1.UnitPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat33Choice#AmountPrice
	 * PriceFormat33Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPrice
	 * PriceFormat32Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat34Choice#AmountPrice
	 * PriceFormat34Choice.AmountPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#Amount
	 * UnitPrice18.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat43Choice#AmountPrice
	 * PriceFormat43Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat40Choice#AmountPrice
	 * PriceFormat40Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat39Choice#AmountPrice
	 * PriceFormat39Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#UnitValue
	 * ATMCassetteCounters1.UnitValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#CurrentAmount
	 * ATMCassetteCounters1.CurrentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat45Choice#AmountPrice
	 * PriceFormat45Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice#AmountPrice
	 * PriceFormat50Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#AmountPrice
	 * PriceFormat48Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#AmountPrice
	 * PriceFormat51Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat46Choice#AmountPrice
	 * PriceFormat46Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#AmountPrice
	 * PriceFormat49Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#AmountPrice
	 * PriceFormat47Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#AmountPrice
	 * PriceFormat44Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat56Choice#AmountPrice
	 * PriceFormat56Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat57Choice#AmountPrice
	 * PriceFormat57Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat52Choice#AmountPrice
	 * PriceFormat52Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat59Choice#AmountPrice
	 * PriceFormat59Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat55Choice#AmountPrice
	 * PriceFormat55Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#AmountPrice
	 * PriceFormat53Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat60Choice#AmountPrice
	 * PriceFormat60Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat58Choice#AmountPrice
	 * PriceFormat58Choice.AmountPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#UnitValue
	 * ATMCassetteCounters3.UnitValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#CurrentAmount
	 * ATMCassetteCounters3.CurrentAmount}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceValue1.Amount, com.tools20022.repository.msg.PriceValue2.Amount, com.tools20022.repository.msg.PriceValueChange1.Amount,
					com.tools20022.repository.msg.PriceValue5.Amount, com.tools20022.repository.choice.PriceFormat5Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat9Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat17Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat18Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat21Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat24Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat6Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat7Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat12Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat13Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat11Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat8Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat10Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat15Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat16Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat14Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat19Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat20Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat23Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat22Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat25Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat26Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat27Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat28Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat29Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat31Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat3Choice.Amount, com.tools20022.repository.choice.PriceFormat4Choice.Amount, com.tools20022.repository.choice.PriceFormat2Choice.Amount,
					com.tools20022.repository.choice.PriceFormat1Choice.Amount, com.tools20022.repository.msg.UnitPrice8.Amount, com.tools20022.repository.msg.UnitPrice9.Amount, com.tools20022.repository.msg.PriceValue6.Amount,
					com.tools20022.repository.msg.ServiceItemTotals1.UnitPrice, com.tools20022.repository.choice.PriceFormat33Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat32Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat34Choice.AmountPrice, com.tools20022.repository.msg.UnitPrice18.Amount, com.tools20022.repository.choice.PriceFormat43Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat40Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat39Choice.AmountPrice, com.tools20022.repository.msg.ATMCassetteCounters1.UnitValue,
					com.tools20022.repository.msg.ATMCassetteCounters1.CurrentAmount, com.tools20022.repository.choice.PriceFormat45Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat50Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat48Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat51Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat46Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat49Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat47Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat44Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat56Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat57Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat52Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat59Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat55Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat53Choice.AmountPrice,
					com.tools20022.repository.choice.PriceFormat60Choice.AmountPrice, com.tools20022.repository.choice.PriceFormat58Choice.AmountPrice, com.tools20022.repository.msg.ATMCassetteCounters3.UnitValue,
					com.tools20022.repository.msg.ATMCassetteCounters3.CurrentAmount);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Option for which a strike price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Option#StrikePrice
	 * Option.StrikePrice}</li>
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
	public static final MMBusinessAssociationEnd Option = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which a strike price is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Option.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Option.StrikePrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product for which a unit price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#UnitPrice
	 * Product.UnitPrice}</li>
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
	public static final MMBusinessAssociationEnd UnitPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitPriceProduct";
			definition = "Product for which a unit price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.UnitPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product for which a net price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#NetPrice
	 * Product.NetPrice}</li>
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
	public static final MMBusinessAssociationEnd NetPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetPriceProduct";
			definition = "Product for which a net price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.NetPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Variance on price for the goods and services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#Price
	 * Adjustment.Price}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LineItem10#NetPriceAllowanceCharge
	 * LineItem10.NetPriceAllowanceCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#Adjustment
	 * LineItemDetails4.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem5#Adjustment
	 * LineItem5.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#Adjustment
	 * LineItemDetails7.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem7#Adjustment
	 * LineItem7.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails6#Adjustment
	 * LineItemDetails6.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem4#Adjustment
	 * LineItem4.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails9#Adjustment
	 * LineItemDetails9.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem9#Adjustment
	 * LineItem9.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine3#Adjustment
	 * ReportLine3.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine2#Adjustment
	 * ReportLine2.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine4#Adjustment
	 * ReportLine4.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem11#Adjustment
	 * LineItem11.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#Adjustment
	 * LineItemDetails10.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine7#Adjustment
	 * ReportLine7.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem12#Adjustment
	 * LineItem12.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails11#Adjustment
	 * LineItemDetails11.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine6#Adjustment
	 * ReportLine6.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportLine5#Adjustment
	 * ReportLine5.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#Adjustment
	 * LineItemDetails13.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem13#Adjustment
	 * LineItem13.Adjustment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItem15#Adjustment
	 * LineItem15.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails14#Adjustment
	 * LineItemDetails14.Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItem16#NetPriceAllowanceCharge
	 * LineItem16.NetPriceAllowanceCharge}</li>
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
	public static final MMBusinessAssociationEnd PriceAdjustment = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItem10.NetPriceAllowanceCharge, com.tools20022.repository.msg.LineItemDetails4.Adjustment, com.tools20022.repository.msg.LineItem5.Adjustment,
					com.tools20022.repository.msg.LineItemDetails7.Adjustment, com.tools20022.repository.msg.LineItem7.Adjustment, com.tools20022.repository.msg.LineItemDetails6.Adjustment,
					com.tools20022.repository.msg.LineItem4.Adjustment, com.tools20022.repository.msg.LineItemDetails9.Adjustment, com.tools20022.repository.msg.LineItem9.Adjustment, com.tools20022.repository.msg.ReportLine3.Adjustment,
					com.tools20022.repository.msg.ReportLine2.Adjustment, com.tools20022.repository.msg.ReportLine4.Adjustment, com.tools20022.repository.msg.LineItem11.Adjustment,
					com.tools20022.repository.msg.LineItemDetails10.Adjustment, com.tools20022.repository.msg.ReportLine7.Adjustment, com.tools20022.repository.msg.LineItem12.Adjustment,
					com.tools20022.repository.msg.LineItemDetails11.Adjustment, com.tools20022.repository.msg.ReportLine6.Adjustment, com.tools20022.repository.msg.ReportLine5.Adjustment,
					com.tools20022.repository.msg.LineItemDetails13.Adjustment, com.tools20022.repository.msg.LineItem13.Adjustment, com.tools20022.repository.msg.LineItem15.Adjustment,
					com.tools20022.repository.msg.LineItemDetails14.Adjustment, com.tools20022.repository.msg.LineItem16.NetPriceAllowanceCharge);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceAdjustment";
			definition = "Variance on price for the goods and services.";
			minOccurs = 0;
			type_lazy = () -> Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product for which a gross price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Product#GrossPrice
	 * Product.GrossPrice}</li>
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
	public static final MMBusinessAssociationEnd GrossPriceProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossPriceProduct";
			definition = "Product for which a gross price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.GrossPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice8#UnitOfMeasureCode
	 * UnitPrice8.UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice8#OtherUnitOfMeasure
	 * UnitPrice8.OtherUnitOfMeasure}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#UnitOfMeasureCode
	 * UnitPrice9.UnitOfMeasureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice9#OtherUnitOfMeasure
	 * UnitPrice9.OtherUnitOfMeasure}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice18#UnitPrice
	 * UnitPrice18.UnitPrice}</li>
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
	public static final MMBusinessAttribute UnitOfMeasure = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice8.UnitOfMeasureCode, com.tools20022.repository.msg.UnitPrice8.OtherUnitOfMeasure, com.tools20022.repository.msg.UnitPrice9.UnitOfMeasureCode,
					com.tools20022.repository.msg.UnitPrice9.OtherUnitOfMeasure, com.tools20022.repository.msg.UnitPrice18.UnitPrice);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitOfMeasure";
			definition = "Specifies the unit of measurement. For example: kilo, tons.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> UnitOfMeasureCode.mmObject();
		}
	};
	/**
	 * Variance allowed on the price of goods.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tolerance#Price
	 * Tolerance.Price}</li>
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
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails4#PriceTolerance
	 * LineItemDetails4.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails7#PriceTolerance
	 * LineItemDetails7.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails5#PriceTolerance
	 * LineItemDetails5.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails8#PriceTolerance
	 * LineItemDetails8.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails10#PriceTolerance
	 * LineItemDetails10.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails13#PriceTolerance
	 * LineItemDetails13.PriceTolerance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemDetails12#PriceTolerance
	 * LineItemDetails12.PriceTolerance}</li>
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
	public static final MMBusinessAssociationEnd PriceTolerance = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemDetails4.PriceTolerance, com.tools20022.repository.msg.LineItemDetails7.PriceTolerance, com.tools20022.repository.msg.LineItemDetails5.PriceTolerance,
					com.tools20022.repository.msg.LineItemDetails8.PriceTolerance, com.tools20022.repository.msg.LineItemDetails10.PriceTolerance, com.tools20022.repository.msg.LineItemDetails13.PriceTolerance,
					com.tools20022.repository.msg.LineItemDetails12.PriceTolerance);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PriceTolerance";
			definition = "Variance allowed on the price of goods.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Tolerance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tolerance.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.repository.msg.BillingPrice1#Currency
	 * BillingPrice1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters1#Currency
	 * ATMCassetteCounters1.Currency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCassetteCounters3#Currency
	 * ATMCassetteCounters3.Currency}</li>
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
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingPrice1.Currency, com.tools20022.repository.msg.ATMCassetteCounters1.Currency, com.tools20022.repository.msg.ATMCassetteCounters3.Currency);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency code in which the price is expressed.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
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
	public static final MMBusinessAttribute Factor = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Factor";
			definition = "Multiplication factor of measurement values. For example: 36 pieces.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Netting for which an average price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Netting#AverageDealPrice
	 * Netting.AverageDealPrice}</li>
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
	public static final MMBusinessAssociationEnd Netting = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Netting for which an average price is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Netting.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Netting.AverageDealPrice;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Pricing parameters for a security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Price
	 * SecuritiesPricing.Price}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes8#StrikePrice
	 * FinancialInstrumentAttributes8.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes20#StrikePrice
	 * FinancialInstrumentAttributes20.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes35#StrikePrice
	 * FinancialInstrumentAttributes35.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41#StrikePrice
	 * FinancialInstrumentAttributes41.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes4#StrikePrice
	 * FinancialInstrumentAttributes4.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes13#StrikePrice
	 * FinancialInstrumentAttributes13.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes21#StrikePrice
	 * FinancialInstrumentAttributes21.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes26#StrikePrice
	 * FinancialInstrumentAttributes26.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36#StrikePrice
	 * FinancialInstrumentAttributes36.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes42#StrikePrice
	 * FinancialInstrumentAttributes42.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes27#StrikePrice
	 * FinancialInstrumentAttributes27.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes14#StrikePrice
	 * FinancialInstrumentAttributes14.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes30#StrikePrice
	 * FinancialInstrumentAttributes30.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes28#StrikePrice
	 * FinancialInstrumentAttributes28.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option1#StrikePrice
	 * Option1.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes15#StrikePrice
	 * FinancialInstrumentAttributes15.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes29#StrikePrice
	 * FinancialInstrumentAttributes29.StrikePrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option7#StrikePrice
	 * Option7.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes2#StrikePrice
	 * FinancialInstrumentAttributes2.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes63#StrikePrice
	 * FinancialInstrumentAttributes63.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64#StrikePrice
	 * FinancialInstrumentAttributes64.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes75#StrikePrice
	 * FinancialInstrumentAttributes75.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes78#StrikePrice
	 * FinancialInstrumentAttributes78.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice#Price
	 * SecuritiesTransactionPrice4Choice.Price}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesPricing = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes8.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes20.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes35.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes41.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes4.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes13.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes21.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes26.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes36.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes42.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes27.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes14.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes30.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes28.StrikePrice, com.tools20022.repository.msg.Option1.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes15.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes29.StrikePrice, com.tools20022.repository.msg.Option7.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes2.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes63.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes64.StrikePrice, com.tools20022.repository.msg.FinancialInstrumentAttributes75.StrikePrice,
					com.tools20022.repository.msg.FinancialInstrumentAttributes78.StrikePrice, com.tools20022.repository.choice.SecuritiesTransactionPrice4Choice.Price);
			elementContext_lazy = () -> Price.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesPricing";
			definition = "Pricing parameters for a security.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Price;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Price";
				definition = "Amount of money for which goods, services or assets are offered, sold, or bought.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.Price, com.tools20022.repository.entity.Product.UnitPrice, com.tools20022.repository.entity.Product.NetPrice,
						com.tools20022.repository.entity.Product.GrossPrice, com.tools20022.repository.entity.Adjustment.Price, com.tools20022.repository.entity.Option.StrikePrice, com.tools20022.repository.entity.Tolerance.Price,
						com.tools20022.repository.entity.Netting.AverageDealPrice);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceValuation2.PriceDetails, com.tools20022.repository.msg.PriceValuation3.PriceDetails, com.tools20022.repository.msg.OtherPrices1.Maximum,
						com.tools20022.repository.msg.OtherPrices1.Transaction, com.tools20022.repository.msg.OtherPrices1.MarkedUp, com.tools20022.repository.msg.OtherPrices1.MarkedDown,
						com.tools20022.repository.msg.OtherPrices1.NetDisclosed, com.tools20022.repository.msg.OtherPrices1.NetUndisclosed, com.tools20022.repository.msg.OtherPrices1.NotionalGross,
						com.tools20022.repository.msg.OtherPrices1.BenchmarkWeightedAverage, com.tools20022.repository.msg.OtherPrices1.AllMarketsWeightedAverage, com.tools20022.repository.msg.OtherPrices1.Benchmark,
						com.tools20022.repository.msg.OtherPrices1.OtherPrice, com.tools20022.repository.msg.OtherPrices1.IndexPrice, com.tools20022.repository.msg.OtherPrices1.ReportedPrice,
						com.tools20022.repository.msg.OtherPrices1.ReferencePrice, com.tools20022.repository.msg.ProprietaryPrice1.Price, com.tools20022.repository.msg.ProprietaryPrice2.Price,
						com.tools20022.repository.msg.BillingPrice1.UnitPrice, com.tools20022.repository.msg.OtherPrices2.Maximum, com.tools20022.repository.msg.OtherPrices2.Transaction, com.tools20022.repository.msg.OtherPrices2.MarkedUp,
						com.tools20022.repository.msg.OtherPrices2.MarkedDown, com.tools20022.repository.msg.OtherPrices2.NetDisclosed, com.tools20022.repository.msg.OtherPrices2.NetUndisclosed,
						com.tools20022.repository.msg.OtherPrices2.NotionalGross, com.tools20022.repository.msg.OtherPrices2.BenchmarkWeightedAverage, com.tools20022.repository.msg.OtherPrices2.AllMarketsWeightedAverage,
						com.tools20022.repository.msg.OtherPrices2.Benchmark, com.tools20022.repository.msg.OtherPrices2.OtherPrice, com.tools20022.repository.msg.OtherPrices2.IndexPrice,
						com.tools20022.repository.msg.OtherPrices2.ReportedPrice, com.tools20022.repository.msg.OtherPrices2.ReferencePrice);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Price.Amount, com.tools20022.repository.entity.Price.Option, com.tools20022.repository.entity.Price.UnitPriceProduct,
						com.tools20022.repository.entity.Price.NetPriceProduct, com.tools20022.repository.entity.Price.PriceAdjustment, com.tools20022.repository.entity.Price.GrossPriceProduct,
						com.tools20022.repository.entity.Price.UnitOfMeasure, com.tools20022.repository.entity.Price.PriceTolerance, com.tools20022.repository.entity.Price.Currency, com.tools20022.repository.entity.Price.Factor,
						com.tools20022.repository.entity.Price.Netting, com.tools20022.repository.entity.Price.SecuritiesPricing);
				derivationComponent_lazy = () -> Arrays.asList(PriceValueChange1.mmObject(), OtherPrices1.mmObject(), ProprietaryPrice1.mmObject(), ProprietaryPrice2.mmObject(), PriceRate1.mmObject(), UnitPrice8.mmObject(),
						UnitPrice9.mmObject(), BillingPrice1.mmObject(), OtherPrices2.mmObject(), UnitPrice18.mmObject(), ATMCassetteCounters1.mmObject(), ATMCassetteCounters3.mmObject(), SecuritiesTransactionPrice4Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}