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
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Distribution of earnings to shareholders, paid for in cash, stock, scrip
 * issue or, rarely, in kind, for example, in company products or property. The
 * dividend amount is decided by the board of directors.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Dividend" src="doc-files/Dividend.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequency
 * Dividend.mmDividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
 * Dividend.mmAnnualTotalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
 * Dividend.mmFinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
 * Dividend.mmFullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
 * Dividend.mmGrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmRateType
 * Dividend.mmRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
 * Dividend.mmNetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
 * Dividend.mmProvisionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendRankingDate
 * Dividend.mmDividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmManufacturedDividendAmount
 * Dividend.mmManufacturedDividendAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmUnfrankedAmount
 * Dividend.mmUnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmNotionalDividendPayableAmount
 * Dividend.mmNotionalDividendPayableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmRate
 * Dividend.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmExDividendDate
 * Dividend.mmExDividendDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmSecurity
 * Dividend.mmSecurity}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmType
 * Dividend.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmCashProceeds
 * Dividend.mmCashProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmObligation
 * Dividend.mmObligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmRelatedDistribution
 * Dividend.mmRelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmDividendFrequenceType
 * Dividend.mmDividendFrequenceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDividendRatio
 * Dividend.mmDividendRatio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmPaymentDate
 * Dividend.mmPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmPaymentFrequency
 * Dividend.mmPaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmReinvestmentDate
 * Dividend.mmReinvestmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmValue
 * Dividend.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDeemedAmount
 * Dividend.mmDeemedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmDeemedRate
 * Dividend.mmDeemedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#mmConduitForeignIncomeAmount
 * Dividend.mmConduitForeignIncomeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmDividend
 * Security.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
 * PaymentObligation.mmDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
 * RateAndAmount.mmFinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
 * RateAndAmount.mmGrossDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
 * RateAndAmount.mmNetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
 * RateAndAmount.mmProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmConduitForeignIncomeAmountDividendParameters
 * RateAndAmount.mmConduitForeignIncomeAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmDeemedAmountDividendParameters
 * RateAndAmount.mmDeemedAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmDividend
 * CashProceedsDefinition.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmDividend
 * Distribution.mmDividend}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#mmRateTypeAmount
 * GrossDividendRate1Choice.mmRateTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRate1Choice#mmRateTypeAmount
 * NetDividendRate1Choice.mmRateTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmNotionalDividendPayable
 * TaxVoucher1.mmNotionalDividendPayable}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.RateType13Choice
 * RateType13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat2Choice
 * GrossDividendRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType7Choice
 * RateType7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat2Choice
 * NetDividendRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType15Choice
 * RateType15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat3Choice
 * GrossDividendRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType16Choice
 * RateType16Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat3Choice
 * NetDividendRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType17Choice
 * RateType17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType18Choice
 * RateType18Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat1Choice
 * NetDividendRateFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat5Choice
 * NetDividendRateFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat7Choice
 * NetDividendRateFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat8Choice
 * NetDividendRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType22Choice
 * RateType22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat10Choice
 * GrossDividendRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType23Choice
 * RateType23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat12Choice
 * NetDividendRateFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType20Choice
 * RateType20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat8Choice
 * GrossDividendRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType21Choice
 * RateType21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat10Choice
 * NetDividendRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType24Choice
 * RateType24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat11Choice
 * GrossDividendRateFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType25Choice
 * RateType25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat13Choice
 * NetDividendRateFormat13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType26Choice
 * RateType26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat12Choice
 * GrossDividendRateFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType27Choice
 * RateType27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat14Choice
 * NetDividendRateFormat14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice
 * GrossDividendRateFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat4Choice
 * GrossDividendRateFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice
 * NetDividendRateFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat5Choice
 * GrossDividendRateFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat6Choice
 * GrossDividendRateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat6Choice
 * NetDividendRateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat9Choice
 * GrossDividendRateFormat9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat11Choice
 * NetDividendRateFormat11Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat7Choice
 * GrossDividendRateFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat9Choice
 * NetDividendRateFormat9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat13Choice
 * GrossDividendRateFormat13Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat15Choice
 * NetDividendRateFormat15Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat14Choice
 * GrossDividendRateFormat14Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat16Choice
 * NetDividendRateFormat16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat1Choice
 * DividendTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat2Choice
 * DividendTypeFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice
 * DividendTypeFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat4Choice
 * DividendTypeFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateType1FormatChoice
 * GrossDividendRateType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GrossDividendRate2
 * GrossDividendRate2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice
 * GrossDividendRate1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateType1FormatChoice
 * NetDividendRateType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetDividendRate2
 * NetDividendRate2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.NetDividendRate1Choice
 * NetDividendRate1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat5Choice
 * DividendTypeFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat8Choice
 * DividendTypeFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DividendSD1 DividendSD1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.GrossDividendRateFormat6SD1
 * GrossDividendRateFormat6SD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1
 * UpdatedAdditionalInformation5SD1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
 * UpdatedAdditionalInformation5SD3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType38Choice
 * RateType38Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType40Choice
 * RateType40Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType41Choice
 * RateType41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType36Choice
 * RateType36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice
 * DividendTypeFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType39Choice
 * RateType39Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice
 * GrossDividendRateFormat19Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice
 * NetDividendRateFormat21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat23Choice
 * NetDividendRateFormat23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat21Choice
 * GrossDividendRateFormat21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat22Choice
 * NetDividendRateFormat22Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat20Choice
 * GrossDividendRateFormat20Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice
 * NetDividendRateFormat24Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat22Choice
 * GrossDividendRateFormat22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType44Choice
 * RateType44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType47Choice
 * RateType47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType49Choice
 * RateType49Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice
 * NetDividendRateFormat28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType50Choice
 * RateType50Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice
 * GrossDividendRateFormat26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat25Choice
 * NetDividendRateFormat25Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat23Choice
 * GrossDividendRateFormat23Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat24Choice
 * GrossDividendRateFormat24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType51Choice
 * RateType51Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat26Choice
 * NetDividendRateFormat26Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat27Choice
 * NetDividendRateFormat27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat25Choice
 * GrossDividendRateFormat25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice
 * DividendTypeFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType69Choice
 * RateType69Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType68Choice
 * RateType68Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat27Choice
 * GrossDividendRateFormat27Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat29Choice
 * NetDividendRateFormat29Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice
 * NetDividendRateFormat32Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat29Choice
 * GrossDividendRateFormat29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType70Choice
 * RateType70Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat30Choice
 * NetDividendRateFormat30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat28Choice
 * GrossDividendRateFormat28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType71Choice
 * RateType71Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat31Choice
 * NetDividendRateFormat31Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat30Choice
 * GrossDividendRateFormat30Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat31Choice
 * GrossDividendRateFormat31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType72Choice
 * RateType72Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat33Choice
 * NetDividendRateFormat33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType73Choice
 * RateType73Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat32Choice
 * GrossDividendRateFormat32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType74Choice
 * RateType74Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat34Choice
 * NetDividendRateFormat34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType75Choice
 * RateType75Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat33Choice
 * GrossDividendRateFormat33Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat35Choice
 * NetDividendRateFormat35Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat34Choice
 * GrossDividendRateFormat34Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat36Choice
 * NetDividendRateFormat36Choice}</li>
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
 * "Dividend"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors."
 * </li>
 * </ul>
 */
public class Dividend {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequencyCode dividendFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#mmDividendFrequency
	 * FinancialInstrument16.mmDividendFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#mmDividendFrequency
	 * FinancialInstrument20.mmDividendFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Frequency with which the income is allocated to investors."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrument16.mmDividendFrequency, FinancialInstrument20.mmDividendFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate annualTotalDividendRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#mmDividendPercentage
	 * PaymentInstrument10.mmDividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#mmDividendPercentage
	 * PaymentInstrument12.mmDividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmTotalAnnualDividendRate
	 * DividendSD1.mmTotalAnnualDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmMaximumAnnualTotalDividendRate
	 * DividendSD1.mmMaximumAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#mmMinimumAnnualTotalDividendRate
	 * DividendSD1.mmMinimumAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRateFormat6SD1#mmMaximumDividendRate
	 * GrossDividendRateFormat6SD1.mmMaximumDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRateFormat6SD1#mmMinimumDividendRate
	 * GrossDividendRateFormat6SD1.mmMinimumDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmDividendPercentage
	 * CashAccount33.mmDividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmDividendPercentage
	 * PaymentInstrument13.mmDividendPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualTotalDividendRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the annual total dividend rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAnnualTotalDividendRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PaymentInstrument10.mmDividendPercentage, PaymentInstrument12.mmDividendPercentage, DividendSD1.mmTotalAnnualDividendRate, DividendSD1.mmMaximumAnnualTotalDividendRate,
					DividendSD1.mmMinimumAnnualTotalDividendRate, GrossDividendRateFormat6SD1.mmMaximumDividendRate, GrossDividendRateFormat6SD1.mmMinimumDividendRate, CashAccount33.mmDividendPercentage,
					PaymentInstrument13.mmDividendPercentage);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnnualTotalDividendRate";
			definition = "Provides the annual total dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getAnnualTotalDividendRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount finalDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFinalDividendParameters
	 * RateAndAmount.mmFinalDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmFinalDividendRate
	 * CorporateActionRate4.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmFinalDividendRate
	 * CorporateActionRate10.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmFinalDividendRate
	 * RateDetails2.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmFinalDividendRate
	 * RateDetails4.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmFinalDividendRate
	 * RateDetails7.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmFinalDividendRate
	 * RateDetails9.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmFinalDividendRate
	 * RateDetails11.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmFinalDividendRate
	 * RateDetails12.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFinalDividendRate
	 * CorporateActionRate5.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmFinalDividendRate
	 * CorporateActionRate12.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmFinalDividendRate
	 * RateDetails3.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmFinalDividendRate
	 * RateDetails5.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFinalDividendRate
	 * RateDetails10.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmFinalDividendRate
	 * RateDetails13.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#mmAmount
	 * GrossDividendRate1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFinalDividend
	 * CorporateActionRate2.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmFinalDividendRate
	 * RateDetails15.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmFinalDividendRate
	 * RateDetails14.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmFinalDividendRate
	 * RateDetails18.mmFinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmFinalDividendRate
	 * RateDetails21.mmFinalDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is final."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFinalDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmFinalDividendRate, CorporateActionRate10.mmFinalDividendRate, RateDetails2.mmFinalDividendRate, RateDetails4.mmFinalDividendRate, RateDetails7.mmFinalDividendRate,
					RateDetails9.mmFinalDividendRate, RateDetails11.mmFinalDividendRate, RateDetails12.mmFinalDividendRate, CorporateActionRate5.mmFinalDividendRate, CorporateActionRate12.mmFinalDividendRate,
					RateDetails3.mmFinalDividendRate, RateDetails5.mmFinalDividendRate, RateDetails10.mmFinalDividendRate, RateDetails13.mmFinalDividendRate, GrossDividendRate1Choice.mmAmount, CorporateActionRate2.mmFinalDividend,
					RateDetails15.mmFinalDividendRate, RateDetails14.mmFinalDividendRate, RateDetails18.mmFinalDividendRate, RateDetails21.mmFinalDividendRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount fullyFrankedRateAndAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmFullyFrankedRateAndAmountDividendParameters
	 * RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmFullyFrankedRate
	 * CorporateActionRate4.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmFullyFrankedRate
	 * CorporateActionRate10.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmFullyFrankedRate
	 * RateDetails2.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmFullyFrankedRate
	 * RateDetails4.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmFullyFrankedRate
	 * RateDetails7.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmFullyFrankedRate
	 * RateDetails9.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmFullyFrankedRate
	 * RateDetails11.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmFullyFrankedRate
	 * RateDetails12.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFullyFrankedRate
	 * CorporateActionRate5.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmFullyFrankedRate
	 * CorporateActionRate12.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmFullyFrankedRate
	 * RateDetails3.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmFullyFrankedRate
	 * RateDetails5.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFullyFrankedRate
	 * RateDetails10.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmFullyFrankedRate
	 * RateDetails13.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFullyFranked
	 * CorporateActionRate2.mmFullyFranked}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmFullyFrankedRate
	 * RateDetails15.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmFullyFrankedRate
	 * RateDetails14.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmFullyFrankedRate
	 * RateDetails18.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmFullyFrankedRate
	 * RateDetails21.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmFullyFrankedRate
	 * RateDetails23.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmFullyFrankedRate
	 * RateDetails22.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmFullyFrankedRate
	 * RateDetails24.mmFullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmFullyFrankedRate
	 * RateDetails25.mmFullyFrankedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRateAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFullyFrankedRateAndAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmFullyFrankedRate, CorporateActionRate10.mmFullyFrankedRate, RateDetails2.mmFullyFrankedRate, RateDetails4.mmFullyFrankedRate, RateDetails7.mmFullyFrankedRate,
					RateDetails9.mmFullyFrankedRate, RateDetails11.mmFullyFrankedRate, RateDetails12.mmFullyFrankedRate, CorporateActionRate5.mmFullyFrankedRate, CorporateActionRate12.mmFullyFrankedRate, RateDetails3.mmFullyFrankedRate,
					RateDetails5.mmFullyFrankedRate, RateDetails10.mmFullyFrankedRate, RateDetails13.mmFullyFrankedRate, CorporateActionRate2.mmFullyFranked, RateDetails15.mmFullyFrankedRate, RateDetails14.mmFullyFrankedRate,
					RateDetails18.mmFullyFrankedRate, RateDetails21.mmFullyFrankedRate, RateDetails23.mmFullyFrankedRate, RateDetails22.mmFullyFrankedRate, RateDetails24.mmFullyFrankedRate, RateDetails25.mmFullyFrankedRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmount";
			definition = "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount grossDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmGrossDividendParameters
	 * RateAndAmount.mmGrossDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmGrossDividendRate
	 * CorporateActionRate4.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmGrossDividendRate
	 * CorporateActionRate10.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmGrossDividendRate
	 * CorporateActionRate20.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmGrossDividendRate
	 * RateDetails2.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmGrossDividendRate
	 * CorporateActionRate22.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmGrossDividendRate
	 * RateDetails4.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmGrossDividendRate
	 * CorporateActionRate26.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmGrossDividendRate
	 * RateDetails7.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmGrossDividendRate
	 * CorporateActionRate31.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmGrossDividendRate
	 * RateDetails9.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmGrossDividendRate
	 * CorporateActionRate38.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmGrossDividendRate
	 * RateDetails11.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmGrossDividendRate
	 * CorporateActionRate39.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmGrossDividendRate
	 * RateDetails12.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmGrossDividendRate
	 * CorporateActionRate5.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmGrossDividendRate
	 * CorporateActionRate12.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmGrossDividendRate
	 * CorporateActionRate15.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmGrossDividendRate
	 * RateDetails3.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmGrossDividendRate
	 * CorporateActionRate18.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmGrossDividendRate
	 * RateDetails5.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmGrossDividendRate
	 * CorporateActionRate25.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmGrossDividendRate
	 * CorporateActionRate30.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmGrossDividendRate
	 * CorporateActionRate37.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmGrossDividendRate
	 * RateDetails10.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmGrossDividendRate
	 * CorporateActionRate40.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmGrossDividendRate
	 * RateDetails13.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmGrossDividendRate
	 * CorporateActionRate36.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmGrossDividendRate
	 * CorporateActionRate42.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGrossDividend
	 * CorporateActionRate2.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmGrossDividendRate
	 * RateDetails15.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmGrossDividendRate
	 * CorporateActionRate46.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmGrossDividendRate
	 * CorporateActionRate45.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmGrossDividendRate
	 * CorporateActionRate44.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmGrossDividendRate
	 * RateDetails14.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmGrossDividendRate
	 * CorporateActionRate60.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmGrossDividendRate
	 * RateDetails18.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmGrossDividendRate
	 * CorporateActionRate64.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmGrossDividendRate
	 * RateDetails21.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmGrossDividendRate
	 * CorporateActionRate57.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmNetAssetDecreaseRatio
	 * UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmAccumulatedProfitPerShare
	 * UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmGrossDividendRate
	 * RateDetails23.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmGrossDividendRate
	 * CorporateActionRate68.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmGrossDividendRate
	 * CorporateActionRate70.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmGrossDividendRate
	 * CorporateActionRate67.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmGrossDividendRate
	 * RateDetails22.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmGrossDividendRate
	 * CorporateActionRate74.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmGrossDividendRate
	 * CorporateActionRate79.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmGrossDividendRate
	 * RateDetails24.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmGrossDividendRate
	 * RateDetails25.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmGrossDividendRate
	 * CorporateActionRate76.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmGrossDividendRate
	 * RateDetails26.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmGrossDividendRate
	 * CorporateActionRate82.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmGrossDividendRate
	 * CorporateActionRate80.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmGrossDividendRate
	 * RateDetails27.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmGrossDividendRate
	 * CorporateActionRate81.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmGrossDividendRate
	 * CorporateActionRate83.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmGrossDividendRate
	 * CorporateActionRate84.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmGrossDividendRate
	 * CorporateActionRate85.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmGrossDividendRate
	 * RateDetails28.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmGrossDividendRate
	 * RateDetails30.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmGrossDividendRate
	 * RateDetails31.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmGrossDividendRate
	 * CorporateActionRate86.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmGrossDividendRate
	 * RateDetails32.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmGrossDividendRate
	 * CorporateActionRate87.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88#mmGrossDividendRate
	 * CorporateActionRate88.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92#mmGrossDividendRate
	 * CorporateActionRate92.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmGrossDividendRate
	 * RateDetails33.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94#mmGrossDividendRate
	 * CorporateActionRate94.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmGrossDividendRate
	 * RateDetails34.mmGrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97#mmGrossDividendRate
	 * CorporateActionRate97.mmGrossDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGrossDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmGrossDividendRate, CorporateActionRate10.mmGrossDividendRate, CorporateActionRate20.mmGrossDividendRate, RateDetails2.mmGrossDividendRate,
					CorporateActionRate22.mmGrossDividendRate, RateDetails4.mmGrossDividendRate, CorporateActionRate26.mmGrossDividendRate, RateDetails7.mmGrossDividendRate, CorporateActionRate31.mmGrossDividendRate,
					RateDetails9.mmGrossDividendRate, CorporateActionRate38.mmGrossDividendRate, RateDetails11.mmGrossDividendRate, CorporateActionRate39.mmGrossDividendRate, RateDetails12.mmGrossDividendRate,
					CorporateActionRate5.mmGrossDividendRate, CorporateActionRate12.mmGrossDividendRate, CorporateActionRate15.mmGrossDividendRate, RateDetails3.mmGrossDividendRate, CorporateActionRate18.mmGrossDividendRate,
					RateDetails5.mmGrossDividendRate, CorporateActionRate25.mmGrossDividendRate, CorporateActionRate30.mmGrossDividendRate, CorporateActionRate37.mmGrossDividendRate, RateDetails10.mmGrossDividendRate,
					CorporateActionRate40.mmGrossDividendRate, RateDetails13.mmGrossDividendRate, CorporateActionRate36.mmGrossDividendRate, CorporateActionRate42.mmGrossDividendRate, CorporateActionRate2.mmGrossDividend,
					RateDetails15.mmGrossDividendRate, CorporateActionRate46.mmGrossDividendRate, CorporateActionRate45.mmGrossDividendRate, CorporateActionRate44.mmGrossDividendRate, RateDetails14.mmGrossDividendRate,
					CorporateActionRate60.mmGrossDividendRate, RateDetails18.mmGrossDividendRate, CorporateActionRate64.mmGrossDividendRate, RateDetails21.mmGrossDividendRate, CorporateActionRate57.mmGrossDividendRate,
					UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio, UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare, RateDetails23.mmGrossDividendRate, CorporateActionRate68.mmGrossDividendRate,
					CorporateActionRate70.mmGrossDividendRate, CorporateActionRate67.mmGrossDividendRate, RateDetails22.mmGrossDividendRate, CorporateActionRate74.mmGrossDividendRate, CorporateActionRate79.mmGrossDividendRate,
					RateDetails24.mmGrossDividendRate, RateDetails25.mmGrossDividendRate, CorporateActionRate76.mmGrossDividendRate, RateDetails26.mmGrossDividendRate, CorporateActionRate82.mmGrossDividendRate,
					CorporateActionRate80.mmGrossDividendRate, RateDetails27.mmGrossDividendRate, CorporateActionRate81.mmGrossDividendRate, CorporateActionRate83.mmGrossDividendRate, CorporateActionRate84.mmGrossDividendRate,
					CorporateActionRate85.mmGrossDividendRate, RateDetails28.mmGrossDividendRate, RateDetails30.mmGrossDividendRate, RateDetails31.mmGrossDividendRate, CorporateActionRate86.mmGrossDividendRate,
					RateDetails32.mmGrossDividendRate, CorporateActionRate87.mmGrossDividendRate, CorporateActionRate88.mmGrossDividendRate, CorporateActionRate92.mmGrossDividendRate, RateDetails33.mmGrossDividendRate,
					CorporateActionRate94.mmGrossDividendRate, RateDetails34.mmGrossDividendRate, CorporateActionRate97.mmGrossDividendRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected DividendRateTypeCode rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType13Choice#mmCode
	 * RateType13Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType13Choice#mmProprietary
	 * RateType13Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType7Choice#mmCode
	 * RateType7Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType7Choice#mmProprietary
	 * RateType7Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType15Choice#mmCode
	 * RateType15Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType15Choice#mmProprietary
	 * RateType15Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType16Choice#mmCode
	 * RateType16Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType16Choice#mmProprietary
	 * RateType16Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType17Choice#mmCode
	 * RateType17Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType17Choice#mmProprietary
	 * RateType17Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType18Choice#mmCode
	 * RateType18Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType18Choice#mmProprietary
	 * RateType18Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType22Choice#mmCode
	 * RateType22Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType22Choice#mmProprietary
	 * RateType22Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType23Choice#mmCode
	 * RateType23Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType23Choice#mmProprietary
	 * RateType23Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType20Choice#mmCode
	 * RateType20Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType20Choice#mmProprietary
	 * RateType20Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType21Choice#mmCode
	 * RateType21Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType21Choice#mmProprietary
	 * RateType21Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType24Choice#mmCode
	 * RateType24Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType24Choice#mmProprietary
	 * RateType24Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType25Choice#mmCode
	 * RateType25Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType25Choice#mmProprietary
	 * RateType25Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType26Choice#mmCode
	 * RateType26Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType26Choice#mmProprietary
	 * RateType26Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType27Choice#mmCode
	 * RateType27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType27Choice#mmProprietary
	 * RateType27Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRate2#mmRateType
	 * GrossDividendRate2.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateType1FormatChoice#mmCode
	 * NetDividendRateType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateType1FormatChoice#mmProprietary
	 * NetDividendRateType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NetDividendRate2#mmRateType
	 * NetDividendRate2.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType38Choice#mmCode
	 * RateType38Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType38Choice#mmProprietary
	 * RateType38Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType40Choice#mmCode
	 * RateType40Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType40Choice#mmProprietary
	 * RateType40Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType41Choice#mmCode
	 * RateType41Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType41Choice#mmProprietary
	 * RateType41Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType36Choice#mmCode
	 * RateType36Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType36Choice#mmProprietary
	 * RateType36Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType39Choice#mmCode
	 * RateType39Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType39Choice#mmProprietary
	 * RateType39Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType44Choice#mmCode
	 * RateType44Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType44Choice#mmProprietary
	 * RateType44Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType47Choice#mmCode
	 * RateType47Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType47Choice#mmProprietary
	 * RateType47Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType49Choice#mmCode
	 * RateType49Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType49Choice#mmProprietary
	 * RateType49Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType50Choice#mmCode
	 * RateType50Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType50Choice#mmProprietary
	 * RateType50Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType51Choice#mmCode
	 * RateType51Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType51Choice#mmProprietary
	 * RateType51Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType69Choice#mmCode
	 * RateType69Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType69Choice#mmProprietary
	 * RateType69Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType68Choice#mmCode
	 * RateType68Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType68Choice#mmProprietary
	 * RateType68Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType70Choice#mmCode
	 * RateType70Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType70Choice#mmProprietary
	 * RateType70Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType71Choice#mmCode
	 * RateType71Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType71Choice#mmProprietary
	 * RateType71Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType72Choice#mmCode
	 * RateType72Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType72Choice#mmProprietary
	 * RateType72Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType73Choice#mmCode
	 * RateType73Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType73Choice#mmProprietary
	 * RateType73Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType74Choice#mmCode
	 * RateType74Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType74Choice#mmProprietary
	 * RateType74Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType75Choice#mmCode
	 * RateType75Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType75Choice#mmProprietary
	 * RateType75Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of dividend rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateType13Choice.mmCode, RateType13Choice.mmProprietary, RateType7Choice.mmCode, RateType7Choice.mmProprietary, RateType15Choice.mmCode, RateType15Choice.mmProprietary,
					RateType16Choice.mmCode, RateType16Choice.mmProprietary, RateType17Choice.mmCode, RateType17Choice.mmProprietary, RateType18Choice.mmCode, RateType18Choice.mmProprietary, RateType22Choice.mmCode,
					RateType22Choice.mmProprietary, RateType23Choice.mmCode, RateType23Choice.mmProprietary, RateType20Choice.mmCode, RateType20Choice.mmProprietary, RateType21Choice.mmCode, RateType21Choice.mmProprietary,
					RateType24Choice.mmCode, RateType24Choice.mmProprietary, RateType25Choice.mmCode, RateType25Choice.mmProprietary, RateType26Choice.mmCode, RateType26Choice.mmProprietary, RateType27Choice.mmCode,
					RateType27Choice.mmProprietary, GrossDividendRate2.mmRateType, NetDividendRateType1FormatChoice.mmCode, NetDividendRateType1FormatChoice.mmProprietary, NetDividendRate2.mmRateType, RateType38Choice.mmCode,
					RateType38Choice.mmProprietary, RateType40Choice.mmCode, RateType40Choice.mmProprietary, RateType41Choice.mmCode, RateType41Choice.mmProprietary, RateType36Choice.mmCode, RateType36Choice.mmProprietary,
					RateType39Choice.mmCode, RateType39Choice.mmProprietary, RateType44Choice.mmCode, RateType44Choice.mmProprietary, RateType47Choice.mmCode, RateType47Choice.mmProprietary, RateType49Choice.mmCode,
					RateType49Choice.mmProprietary, RateType50Choice.mmCode, RateType50Choice.mmProprietary, RateType51Choice.mmCode, RateType51Choice.mmProprietary, RateType69Choice.mmCode, RateType69Choice.mmProprietary,
					RateType68Choice.mmCode, RateType68Choice.mmProprietary, RateType70Choice.mmCode, RateType70Choice.mmProprietary, RateType71Choice.mmCode, RateType71Choice.mmProprietary, RateType72Choice.mmCode,
					RateType72Choice.mmProprietary, RateType73Choice.mmCode, RateType73Choice.mmProprietary, RateType74Choice.mmCode, RateType74Choice.mmProprietary, RateType75Choice.mmCode, RateType75Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of dividend rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount netDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmNetDividendParameters
	 * RateAndAmount.mmNetDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat2Choice#mmAmount
	 * NetDividendRateFormat2Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmNetDividendRate
	 * CorporateActionRate4.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat3Choice#mmAmount
	 * NetDividendRateFormat3Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmNetDividendRate
	 * CorporateActionRate10.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmNetDividendRate
	 * RateDetails2.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmNetDividendRate
	 * RateDetails4.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat1Choice#mmAmount
	 * NetDividendRateFormat1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat5Choice#mmAmount
	 * NetDividendRateFormat5Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat7Choice#mmAmount
	 * NetDividendRateFormat7Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmNetDividendRate
	 * CorporateActionRate26.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmNetDividendRate
	 * RateDetails7.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat8Choice#mmAmount
	 * NetDividendRateFormat8Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmNetDividendRate
	 * CorporateActionRate31.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmNetDividendRate
	 * RateDetails9.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat12Choice#mmAmount
	 * NetDividendRateFormat12Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmNetDividendRate
	 * CorporateActionRate38.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat10Choice#mmAmount
	 * NetDividendRateFormat10Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmNetDividendRate
	 * RateDetails11.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat13Choice#mmAmount
	 * NetDividendRateFormat13Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmNetDividendRate
	 * CorporateActionRate39.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat14Choice#mmAmount
	 * NetDividendRateFormat14Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmNetDividendRate
	 * RateDetails12.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmNetDividendRate
	 * CorporateActionRate5.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice#mmAmount
	 * NetDividendRateFormat4Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmNetDividendRate
	 * CorporateActionRate12.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmNetDividendRate
	 * RateDetails3.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat6Choice#mmAmount
	 * NetDividendRateFormat6Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmNetDividendRate
	 * RateDetails5.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmNetDividendRate
	 * CorporateActionRate25.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmNetDividendRate
	 * CorporateActionRate30.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat11Choice#mmAmount
	 * NetDividendRateFormat11Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmNetDividendRate
	 * CorporateActionRate37.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat9Choice#mmAmount
	 * NetDividendRateFormat9Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmNetDividendRate
	 * RateDetails10.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat15Choice#mmAmount
	 * NetDividendRateFormat15Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmNetDividendRate
	 * CorporateActionRate40.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat16Choice#mmAmount
	 * NetDividendRateFormat16Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmNetDividendRate
	 * RateDetails13.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmNetDividendRate
	 * CorporateActionRate36.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmNetDividendRate
	 * CorporateActionRate42.mmNetDividendRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetDividendRate2#mmAmount
	 * NetDividendRate2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRate1Choice#mmAmount
	 * NetDividendRate1Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNetDividend
	 * CorporateActionRate2.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmNetDividendRate
	 * RateDetails15.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmNetDividendRate
	 * CorporateActionRate46.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmNetDividendRate
	 * CorporateActionRate45.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmNetDividendRate
	 * CorporateActionRate44.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmNetDividendRate
	 * RateDetails14.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmNetDividendRate
	 * CorporateActionRate60.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmNetDividendRate
	 * RateDetails18.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmNetDividendRate
	 * CorporateActionRate64.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmNetDividendRate
	 * RateDetails21.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmNetDividendRate
	 * CorporateActionRate57.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmNetDividendRate
	 * RateDetails23.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmNetDividendRate
	 * CorporateActionRate68.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmNetDividendRate
	 * CorporateActionRate70.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmNetDividendRate
	 * CorporateActionRate67.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmNetDividendRate
	 * RateDetails22.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice#mmAmount
	 * NetDividendRateFormat21Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat23Choice#mmAmount
	 * NetDividendRateFormat23Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat22Choice#mmAmount
	 * NetDividendRateFormat22Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#mmAmount
	 * NetDividendRateFormat24Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmNetDividendRate
	 * CorporateActionRate74.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmNetDividendRate
	 * CorporateActionRate79.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmNetDividendRate
	 * RateDetails24.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmNetDividendRate
	 * RateDetails25.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmNetDividendRate
	 * CorporateActionRate76.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice#mmAmount
	 * NetDividendRateFormat28Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat25Choice#mmAmount
	 * NetDividendRateFormat25Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat26Choice#mmAmount
	 * NetDividendRateFormat26Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat27Choice#mmAmount
	 * NetDividendRateFormat27Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmNetDividendRate
	 * RateDetails26.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmNetDividendRate
	 * CorporateActionRate82.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmNetDividendRate
	 * CorporateActionRate80.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmNetDividendRate
	 * RateDetails27.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmNetDividendRate
	 * CorporateActionRate81.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmNetDividendRate
	 * CorporateActionRate83.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmNetDividendRate
	 * CorporateActionRate84.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmNetDividendRate
	 * CorporateActionRate85.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmNetDividendRate
	 * RateDetails28.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmNetDividendRate
	 * RateDetails30.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails31#mmNetDividendRate
	 * RateDetails31.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate86#mmNetDividendRate
	 * CorporateActionRate86.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat29Choice#mmAmount
	 * NetDividendRateFormat29Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails32#mmNetDividendRate
	 * RateDetails32.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat32Choice#mmAmount
	 * NetDividendRateFormat32Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate87#mmNetDividendRate
	 * CorporateActionRate87.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate88#mmNetDividendRate
	 * CorporateActionRate88.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat30Choice#mmAmount
	 * NetDividendRateFormat30Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat31Choice#mmAmount
	 * NetDividendRateFormat31Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate92#mmNetDividendRate
	 * CorporateActionRate92.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat33Choice#mmAmount
	 * NetDividendRateFormat33Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails33#mmNetDividendRate
	 * RateDetails33.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat34Choice#mmAmount
	 * NetDividendRateFormat34Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate94#mmNetDividendRate
	 * CorporateActionRate94.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat35Choice#mmAmount
	 * NetDividendRateFormat35Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails34#mmNetDividendRate
	 * RateDetails34.mmNetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat36Choice#mmAmount
	 * NetDividendRateFormat36Choice.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate97#mmNetDividendRate
	 * CorporateActionRate97.mmNetDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(NetDividendRateFormat2Choice.mmAmount, CorporateActionRate4.mmNetDividendRate, NetDividendRateFormat3Choice.mmAmount, CorporateActionRate10.mmNetDividendRate,
					RateDetails2.mmNetDividendRate, RateDetails4.mmNetDividendRate, NetDividendRateFormat1Choice.mmAmount, NetDividendRateFormat5Choice.mmAmount, NetDividendRateFormat7Choice.mmAmount,
					CorporateActionRate26.mmNetDividendRate, RateDetails7.mmNetDividendRate, NetDividendRateFormat8Choice.mmAmount, CorporateActionRate31.mmNetDividendRate, RateDetails9.mmNetDividendRate,
					NetDividendRateFormat12Choice.mmAmount, CorporateActionRate38.mmNetDividendRate, NetDividendRateFormat10Choice.mmAmount, RateDetails11.mmNetDividendRate, NetDividendRateFormat13Choice.mmAmount,
					CorporateActionRate39.mmNetDividendRate, NetDividendRateFormat14Choice.mmAmount, RateDetails12.mmNetDividendRate, CorporateActionRate5.mmNetDividendRate, NetDividendRateFormat4Choice.mmAmount,
					CorporateActionRate12.mmNetDividendRate, RateDetails3.mmNetDividendRate, NetDividendRateFormat6Choice.mmAmount, RateDetails5.mmNetDividendRate, CorporateActionRate25.mmNetDividendRate,
					CorporateActionRate30.mmNetDividendRate, NetDividendRateFormat11Choice.mmAmount, CorporateActionRate37.mmNetDividendRate, NetDividendRateFormat9Choice.mmAmount, RateDetails10.mmNetDividendRate,
					NetDividendRateFormat15Choice.mmAmount, CorporateActionRate40.mmNetDividendRate, NetDividendRateFormat16Choice.mmAmount, RateDetails13.mmNetDividendRate, CorporateActionRate36.mmNetDividendRate,
					CorporateActionRate42.mmNetDividendRate, NetDividendRate2.mmAmount, NetDividendRate1Choice.mmAmount, CorporateActionRate2.mmNetDividend, RateDetails15.mmNetDividendRate, CorporateActionRate46.mmNetDividendRate,
					CorporateActionRate45.mmNetDividendRate, CorporateActionRate44.mmNetDividendRate, RateDetails14.mmNetDividendRate, CorporateActionRate60.mmNetDividendRate, RateDetails18.mmNetDividendRate,
					CorporateActionRate64.mmNetDividendRate, RateDetails21.mmNetDividendRate, CorporateActionRate57.mmNetDividendRate, RateDetails23.mmNetDividendRate, CorporateActionRate68.mmNetDividendRate,
					CorporateActionRate70.mmNetDividendRate, CorporateActionRate67.mmNetDividendRate, RateDetails22.mmNetDividendRate, NetDividendRateFormat21Choice.mmAmount, NetDividendRateFormat23Choice.mmAmount,
					NetDividendRateFormat22Choice.mmAmount, NetDividendRateFormat24Choice.mmAmount, CorporateActionRate74.mmNetDividendRate, CorporateActionRate79.mmNetDividendRate, RateDetails24.mmNetDividendRate,
					RateDetails25.mmNetDividendRate, CorporateActionRate76.mmNetDividendRate, NetDividendRateFormat28Choice.mmAmount, NetDividendRateFormat25Choice.mmAmount, NetDividendRateFormat26Choice.mmAmount,
					NetDividendRateFormat27Choice.mmAmount, RateDetails26.mmNetDividendRate, CorporateActionRate82.mmNetDividendRate, CorporateActionRate80.mmNetDividendRate, RateDetails27.mmNetDividendRate,
					CorporateActionRate81.mmNetDividendRate, CorporateActionRate83.mmNetDividendRate, CorporateActionRate84.mmNetDividendRate, CorporateActionRate85.mmNetDividendRate, RateDetails28.mmNetDividendRate,
					RateDetails30.mmNetDividendRate, RateDetails31.mmNetDividendRate, CorporateActionRate86.mmNetDividendRate, NetDividendRateFormat29Choice.mmAmount, RateDetails32.mmNetDividendRate, NetDividendRateFormat32Choice.mmAmount,
					CorporateActionRate87.mmNetDividendRate, CorporateActionRate88.mmNetDividendRate, NetDividendRateFormat30Choice.mmAmount, NetDividendRateFormat31Choice.mmAmount, CorporateActionRate92.mmNetDividendRate,
					NetDividendRateFormat33Choice.mmAmount, RateDetails33.mmNetDividendRate, NetDividendRateFormat34Choice.mmAmount, CorporateActionRate94.mmNetDividendRate, NetDividendRateFormat35Choice.mmAmount,
					RateDetails34.mmNetDividendRate, NetDividendRateFormat36Choice.mmAmount, CorporateActionRate97.mmNetDividendRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected RateAndAmount provisionalDividend;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmProvisionalDividendParameters
	 * RateAndAmount.mmProvisionalDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmProvisionalDividendRate
	 * CorporateActionRate4.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmProvisionalDividendRate
	 * CorporateActionRate10.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmProvisionalDividendRate
	 * RateDetails2.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmProvisionalDividendRate
	 * RateDetails4.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmProvisionalDividendRate
	 * RateDetails7.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmProvisionalDividendRate
	 * RateDetails9.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmProvisionalDividendRate
	 * RateDetails11.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmProvisionalDividendRate
	 * RateDetails12.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmProvisionalDividendRate
	 * CorporateActionRate5.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmProvisionalDividendRate
	 * CorporateActionRate12.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmProvisionalDividendRate
	 * RateDetails3.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmProvisionalDividendRate
	 * RateDetails5.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmProvisionalDividendRate
	 * RateDetails10.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmProvisionalDividendRate
	 * RateDetails13.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmProvisionalDividend
	 * CorporateActionRate2.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmProvisionalDividendRate
	 * RateDetails15.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmProvisionalDividendRate
	 * RateDetails14.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmProvisionalDividendRate
	 * RateDetails18.mmProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmProvisionalDividendRate
	 * RateDetails21.mmProvisionalDividendRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is provisional."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProvisionalDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionRate4.mmProvisionalDividendRate, CorporateActionRate10.mmProvisionalDividendRate, RateDetails2.mmProvisionalDividendRate, RateDetails4.mmProvisionalDividendRate,
					RateDetails7.mmProvisionalDividendRate, RateDetails9.mmProvisionalDividendRate, RateDetails11.mmProvisionalDividendRate, RateDetails12.mmProvisionalDividendRate, CorporateActionRate5.mmProvisionalDividendRate,
					CorporateActionRate12.mmProvisionalDividendRate, RateDetails3.mmProvisionalDividendRate, RateDetails5.mmProvisionalDividendRate, RateDetails10.mmProvisionalDividendRate, RateDetails13.mmProvisionalDividendRate,
					CorporateActionRate2.mmProvisionalDividend, RateDetails15.mmProvisionalDividendRate, RateDetails14.mmProvisionalDividendRate, RateDetails18.mmProvisionalDividendRate, RateDetails21.mmProvisionalDividendRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected ISODateTime dividendRankingDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#mmDividendRankingDate
	 * SecurityDate1.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#mmDividendRankingDate
	 * SecurityDate3.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#mmDividendRankingDate
	 * SecurityDate6.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#mmDividendRankingDate
	 * SecurityDate7.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#mmDividendRankingDate
	 * SecurityDate2.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#mmDividendRankingDate
	 * SecurityDate4.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#mmDividendRankingDate
	 * SecurityDate5.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#mmDividendRankingDate
	 * SecurityDate8.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#mmDividendRankingDate
	 * SecurityDate9.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#mmDividendRankingDate
	 * SecurityDate10.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmDividendRankingDate
	 * CorporateActionDate3.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmDividendRankingDate
	 * SecurityDate12.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmDividendRankingDate
	 * SecurityDate11.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#mmDividendRankingDate
	 * SecurityDate14.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#mmDividendRankingDate
	 * SecurityDate13.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate15#mmDividendRankingDate
	 * SecurityDate15.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate16#mmDividendRankingDate
	 * SecurityDate16.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate17#mmDividendRankingDate
	 * SecurityDate17.mmDividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate18#mmDividendRankingDate
	 * SecurityDate18.mmDividendRankingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRankingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a security will be entitled to a dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendRankingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityDate1.mmDividendRankingDate, SecurityDate3.mmDividendRankingDate, SecurityDate6.mmDividendRankingDate, SecurityDate7.mmDividendRankingDate, SecurityDate2.mmDividendRankingDate,
					SecurityDate4.mmDividendRankingDate, SecurityDate5.mmDividendRankingDate, SecurityDate8.mmDividendRankingDate, SecurityDate9.mmDividendRankingDate, SecurityDate10.mmDividendRankingDate,
					CorporateActionDate3.mmDividendRankingDate, SecurityDate12.mmDividendRankingDate, SecurityDate11.mmDividendRankingDate, SecurityDate14.mmDividendRankingDate, SecurityDate13.mmDividendRankingDate,
					SecurityDate15.mmDividendRankingDate, SecurityDate16.mmDividendRankingDate, SecurityDate17.mmDividendRankingDate, SecurityDate18.mmDividendRankingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendRankingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount manufacturedDividendAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmManufacturedDividendAmount
	 * CorporateActionAmounts2.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmManufacturedDividendAmount
	 * CorporateActionAmounts5.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts11.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts12.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts17.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts20.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts23.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts24.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmManufacturedDividendAmount
	 * CorporateActionAmounts3.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmManufacturedDividendAmount
	 * CorporateActionAmounts6.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts9.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts13.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts16.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts19.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts22.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts25.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmManufacturedDividendAmount
	 * CorporateActionAmounts4.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmManufacturedDividendAmount
	 * CorporateActionAmounts7.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts10.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts14.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts15.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts18.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts21.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts26.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmManufacturedDividendAmount
	 * CorporateActionAmounts1.mmManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts29.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts27.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts28.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts33.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts32.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts35.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts37.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts36.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts38.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts39.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts41.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts40.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts42.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts43.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts44.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts45.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts46.mmManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmManufacturedDividendPaymentAmount
	 * CorporateActionAmounts47.mmManufacturedDividendPaymentAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedDividendAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmManufacturedDividendAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmManufacturedDividendAmount, CorporateActionAmounts5.mmManufacturedDividendAmount, CorporateActionAmounts11.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts12.mmManufacturedDividendPaymentAmount, CorporateActionAmounts17.mmManufacturedDividendPaymentAmount, CorporateActionAmounts20.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts23.mmManufacturedDividendPaymentAmount, CorporateActionAmounts24.mmManufacturedDividendPaymentAmount, CorporateActionAmounts3.mmManufacturedDividendAmount,
					CorporateActionAmounts6.mmManufacturedDividendAmount, CorporateActionAmounts9.mmManufacturedDividendPaymentAmount, CorporateActionAmounts13.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts16.mmManufacturedDividendPaymentAmount, CorporateActionAmounts19.mmManufacturedDividendPaymentAmount, CorporateActionAmounts22.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts25.mmManufacturedDividendPaymentAmount, CorporateActionAmounts4.mmManufacturedDividendAmount, CorporateActionAmounts7.mmManufacturedDividendAmount,
					CorporateActionAmounts10.mmManufacturedDividendPaymentAmount, CorporateActionAmounts14.mmManufacturedDividendPaymentAmount, CorporateActionAmounts15.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts18.mmManufacturedDividendPaymentAmount, CorporateActionAmounts21.mmManufacturedDividendPaymentAmount, CorporateActionAmounts26.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts1.mmManufacturedDividendAmount, CorporateActionAmounts29.mmManufacturedDividendPaymentAmount, CorporateActionAmounts27.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts28.mmManufacturedDividendPaymentAmount, CorporateActionAmounts33.mmManufacturedDividendPaymentAmount, CorporateActionAmounts32.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts35.mmManufacturedDividendPaymentAmount, CorporateActionAmounts37.mmManufacturedDividendPaymentAmount, CorporateActionAmounts36.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts38.mmManufacturedDividendPaymentAmount, CorporateActionAmounts39.mmManufacturedDividendPaymentAmount, CorporateActionAmounts41.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts40.mmManufacturedDividendPaymentAmount, CorporateActionAmounts42.mmManufacturedDividendPaymentAmount, CorporateActionAmounts43.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts44.mmManufacturedDividendPaymentAmount, CorporateActionAmounts45.mmManufacturedDividendPaymentAmount, CorporateActionAmounts46.mmManufacturedDividendPaymentAmount,
					CorporateActionAmounts47.mmManufacturedDividendPaymentAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getManufacturedDividendAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount unfrankedAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmUnfrankedAmount
	 * CorporateActionAmounts2.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmUnfrankedAmount
	 * CorporateActionAmounts5.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmUnfrankedAmount
	 * CorporateActionAmounts11.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmUnfrankedAmount
	 * CorporateActionAmounts12.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmUnfrankedAmount
	 * CorporateActionAmounts17.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmUnfrankedAmount
	 * CorporateActionAmounts20.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmUnfrankedAmount
	 * CorporateActionAmounts23.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmUnfrankedAmount
	 * CorporateActionAmounts24.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmUnfrankedAmount
	 * CorporateActionAmounts3.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmUnfrankedAmount
	 * CorporateActionAmounts6.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmUnfrankedAmount
	 * CorporateActionAmounts9.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmUnfrankedAmount
	 * CorporateActionAmounts13.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmUnfrankedAmount
	 * CorporateActionAmounts16.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmUnfrankedAmount
	 * CorporateActionAmounts19.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmUnfrankedAmount
	 * CorporateActionAmounts22.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmUnfrankedAmount
	 * CorporateActionAmounts25.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmUnfrankedAmount
	 * CorporateActionAmounts4.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmUnfrankedAmount
	 * CorporateActionAmounts7.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmUnfrankedAmount
	 * CorporateActionAmounts10.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmUnfrankedAmount
	 * CorporateActionAmounts14.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmUnfrankedAmount
	 * CorporateActionAmounts15.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmUnfrankedAmount
	 * CorporateActionAmounts18.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmUnfrankedAmount
	 * CorporateActionAmounts21.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmUnfrankedAmount
	 * CorporateActionAmounts26.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmUnfrankedAmount
	 * CorporateActionAmounts1.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmUnfrankedAmount
	 * CorporateActionAmounts29.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmUnfrankedAmount
	 * CorporateActionAmounts27.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmUnfrankedAmount
	 * CorporateActionAmounts28.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmUnfrankedAmount
	 * CorporateActionAmounts33.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmUnfrankedAmount
	 * CorporateActionAmounts32.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmUnfrankedAmount
	 * CorporateActionAmounts35.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmUnfrankedAmount
	 * CorporateActionAmounts37.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmUnfrankedAmount
	 * CorporateActionAmounts36.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmUnfrankedAmount
	 * CorporateActionAmounts38.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmUnfrankedAmount
	 * CorporateActionAmounts39.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmUnfrankedAmount
	 * CorporateActionAmounts41.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmUnfrankedAmount
	 * CorporateActionAmounts40.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmUnfrankedAmount
	 * CorporateActionAmounts42.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmUnfrankedAmount
	 * CorporateActionAmounts43.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmUnfrankedAmount
	 * CorporateActionAmounts44.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmUnfrankedAmount
	 * CorporateActionAmounts45.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmUnfrankedAmount
	 * CorporateActionAmounts46.mmUnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmUnfrankedAmount
	 * CorporateActionAmounts47.mmUnfrankedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUnfrankedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmUnfrankedAmount, CorporateActionAmounts5.mmUnfrankedAmount, CorporateActionAmounts11.mmUnfrankedAmount, CorporateActionAmounts12.mmUnfrankedAmount,
					CorporateActionAmounts17.mmUnfrankedAmount, CorporateActionAmounts20.mmUnfrankedAmount, CorporateActionAmounts23.mmUnfrankedAmount, CorporateActionAmounts24.mmUnfrankedAmount, CorporateActionAmounts3.mmUnfrankedAmount,
					CorporateActionAmounts6.mmUnfrankedAmount, CorporateActionAmounts9.mmUnfrankedAmount, CorporateActionAmounts13.mmUnfrankedAmount, CorporateActionAmounts16.mmUnfrankedAmount, CorporateActionAmounts19.mmUnfrankedAmount,
					CorporateActionAmounts22.mmUnfrankedAmount, CorporateActionAmounts25.mmUnfrankedAmount, CorporateActionAmounts4.mmUnfrankedAmount, CorporateActionAmounts7.mmUnfrankedAmount, CorporateActionAmounts10.mmUnfrankedAmount,
					CorporateActionAmounts14.mmUnfrankedAmount, CorporateActionAmounts15.mmUnfrankedAmount, CorporateActionAmounts18.mmUnfrankedAmount, CorporateActionAmounts21.mmUnfrankedAmount, CorporateActionAmounts26.mmUnfrankedAmount,
					CorporateActionAmounts1.mmUnfrankedAmount, CorporateActionAmounts29.mmUnfrankedAmount, CorporateActionAmounts27.mmUnfrankedAmount, CorporateActionAmounts28.mmUnfrankedAmount, CorporateActionAmounts33.mmUnfrankedAmount,
					CorporateActionAmounts32.mmUnfrankedAmount, CorporateActionAmounts35.mmUnfrankedAmount, CorporateActionAmounts37.mmUnfrankedAmount, CorporateActionAmounts36.mmUnfrankedAmount, CorporateActionAmounts38.mmUnfrankedAmount,
					CorporateActionAmounts39.mmUnfrankedAmount, CorporateActionAmounts41.mmUnfrankedAmount, CorporateActionAmounts40.mmUnfrankedAmount, CorporateActionAmounts42.mmUnfrankedAmount, CorporateActionAmounts43.mmUnfrankedAmount,
					CorporateActionAmounts44.mmUnfrankedAmount, CorporateActionAmounts45.mmUnfrankedAmount, CorporateActionAmounts46.mmUnfrankedAmount, CorporateActionAmounts47.mmUnfrankedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getUnfrankedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount notionalDividendPayableAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts2.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts5.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts11.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts12.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts17.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts20.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts23.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts24.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts29.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts35.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts37.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts39.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts44.mmNotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmNotionalDividendPayableAmount
	 * CorporateActionAmounts45.mmNotionalDividendPayableAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayableAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNotionalDividendPayableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts2.mmNotionalDividendPayableAmount, CorporateActionAmounts5.mmNotionalDividendPayableAmount, CorporateActionAmounts11.mmNotionalDividendPayableAmount,
					CorporateActionAmounts12.mmNotionalDividendPayableAmount, CorporateActionAmounts17.mmNotionalDividendPayableAmount, CorporateActionAmounts20.mmNotionalDividendPayableAmount,
					CorporateActionAmounts23.mmNotionalDividendPayableAmount, CorporateActionAmounts24.mmNotionalDividendPayableAmount, CorporateActionAmounts29.mmNotionalDividendPayableAmount,
					CorporateActionAmounts35.mmNotionalDividendPayableAmount, CorporateActionAmounts37.mmNotionalDividendPayableAmount, CorporateActionAmounts39.mmNotionalDividendPayableAmount,
					CorporateActionAmounts44.mmNotionalDividendPayableAmount, CorporateActionAmounts45.mmNotionalDividendPayableAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getNotionalDividendPayableAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate rate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmNonResidentRate
	 * RateDetails2.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmNonResidentRate
	 * RateDetails4.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmNonResidentRate
	 * RateDetails7.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmNonResidentRate
	 * RateDetails9.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmNonResidentRate
	 * RateDetails11.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmNonResidentRate
	 * RateDetails12.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmNonResidentRate
	 * RateDetails3.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmNonResidentRate
	 * RateDetails5.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmNonResidentRate
	 * RateDetails10.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmNonResidentRate
	 * RateDetails13.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#mmDividendRatio
	 * SecuritiesFinancing10.mmDividendRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmNonResidentRate
	 * RateDetails15.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmNonResidentRate
	 * RateDetails14.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmNonResidentRate
	 * RateDetails18.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmNonResidentRate
	 * RateDetails21.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmNonResidentRate
	 * RateDetails23.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmNonResidentRate
	 * RateDetails22.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmNonResidentRate
	 * RateDetails24.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmNonResidentRate
	 * RateDetails25.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmNonResidentRate
	 * RateDetails26.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmNonResidentRate
	 * RateDetails27.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmNonResidentRate
	 * RateDetails28.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmNonResidentRate
	 * RateDetails30.mmNonResidentRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Planned dividend rate, for example, for preferred shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateDetails2.mmNonResidentRate, RateDetails4.mmNonResidentRate, RateDetails7.mmNonResidentRate, RateDetails9.mmNonResidentRate, RateDetails11.mmNonResidentRate,
					RateDetails12.mmNonResidentRate, RateDetails3.mmNonResidentRate, RateDetails5.mmNonResidentRate, RateDetails10.mmNonResidentRate, RateDetails13.mmNonResidentRate, SecuritiesFinancing10.mmDividendRatio,
					RateDetails15.mmNonResidentRate, RateDetails14.mmNonResidentRate, RateDetails18.mmNonResidentRate, RateDetails21.mmNonResidentRate, RateDetails23.mmNonResidentRate, RateDetails22.mmNonResidentRate,
					RateDetails24.mmNonResidentRate, RateDetails25.mmNonResidentRate, RateDetails26.mmNonResidentRate, RateDetails27.mmNonResidentRate, RateDetails28.mmNonResidentRate, RateDetails30.mmNonResidentRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Planned dividend rate, for example, for preferred shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime exDividendDate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#mmExDividendDate
	 * CorporateActionDate1.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#mmExDividendDate
	 * CorporateActionDate13.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#mmExDividendDate
	 * CorporateActionDate14.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#mmExDividendDate
	 * CorporateActionDate21.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#mmExDividendDate
	 * CorporateActionDate22.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#mmExDividendDate
	 * CorporateActionDate25.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#mmExDividendDate
	 * CorporateActionDate27.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#mmExDividendDate
	 * CorporateActionDate28.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#mmExDividendDate
	 * CorporateActionDate2.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate30#mmExDividendDate
	 * CorporateActionDate30.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate34#mmExDividendDate
	 * CorporateActionDate34.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#mmExDividendDate
	 * CorporateActionDate41.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#mmExDividendDate
	 * CorporateActionDate43.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate49#mmExDividendDate
	 * CorporateActionDate49.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#mmExDividendDate
	 * CorporateActionDate45.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmExDividendDate
	 * CorporateActionDate44.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#mmExDividendDate
	 * CorporateActionDate54.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate50#mmExDividendDate
	 * CorporateActionDate50.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#mmExDividendDate
	 * CorporateActionDate58.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate59#mmExDividendDate
	 * CorporateActionDate59.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate61#mmExDividendDate
	 * CorporateActionDate61.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate63#mmExDividendDate
	 * CorporateActionDate63.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate66#mmExDividendDate
	 * CorporateActionDate66.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate70#mmExDividendDate
	 * CorporateActionDate70.mmExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate74#mmExDividendDate
	 * CorporateActionDate74.mmExDividendDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividendDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExDividendDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate1.mmExDividendDate, CorporateActionDate13.mmExDividendDate, CorporateActionDate14.mmExDividendDate, CorporateActionDate21.mmExDividendDate,
					CorporateActionDate22.mmExDividendDate, CorporateActionDate25.mmExDividendDate, CorporateActionDate27.mmExDividendDate, CorporateActionDate28.mmExDividendDate, CorporateActionDate2.mmExDividendDate,
					CorporateActionDate30.mmExDividendDate, CorporateActionDate34.mmExDividendDate, CorporateActionDate41.mmExDividendDate, CorporateActionDate43.mmExDividendDate, CorporateActionDate49.mmExDividendDate,
					CorporateActionDate45.mmExDividendDate, CorporateActionDate44.mmExDividendDate, CorporateActionDate54.mmExDividendDate, CorporateActionDate50.mmExDividendDate, CorporateActionDate58.mmExDividendDate,
					CorporateActionDate59.mmExDividendDate, CorporateActionDate61.mmExDividendDate, CorporateActionDate63.mmExDividendDate, CorporateActionDate66.mmExDividendDate, CorporateActionDate70.mmExDividendDate,
					CorporateActionDate74.mmExDividendDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getExDividendDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDividend
	 * Security.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security for which a dividend is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a dividend is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected DividendTypeCode type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DividendTypeCode
	 * DividendTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat1Choice#mmCode
	 * DividendTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat1Choice#mmProprietary
	 * DividendTypeFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat2Choice#mmCode
	 * DividendTypeFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat2Choice#mmProprietary
	 * DividendTypeFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice#mmCode
	 * DividendTypeFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice#mmProprietary
	 * DividendTypeFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmDividendType
	 * CorporateAction5.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat4Choice#mmCode
	 * DividendTypeFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat4Choice#mmProprietary
	 * DividendTypeFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmDividendType
	 * CorporateAction6.mmDividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat5Choice#mmCode
	 * DividendTypeFormat5Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat5Choice#mmProprietary
	 * DividendTypeFormat5Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat8Choice#mmCode
	 * DividendTypeFormat8Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat8Choice#mmProprietary
	 * DividendTypeFormat8Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice#mmCode
	 * DividendTypeFormat9Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice#mmProprietary
	 * DividendTypeFormat9Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice#mmCode
	 * DividendTypeFormat10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice#mmProprietary
	 * DividendTypeFormat10Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Nature of the dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DividendTypeFormat1Choice.mmCode, DividendTypeFormat1Choice.mmProprietary, DividendTypeFormat2Choice.mmCode, DividendTypeFormat2Choice.mmProprietary, DividendTypeFormat3Choice.mmCode,
					DividendTypeFormat3Choice.mmProprietary, CorporateAction5.mmDividendType, DividendTypeFormat4Choice.mmCode, DividendTypeFormat4Choice.mmProprietary, CorporateAction6.mmDividendType, DividendTypeFormat5Choice.mmCode,
					DividendTypeFormat5Choice.mmProprietary, DividendTypeFormat8Choice.mmCode, DividendTypeFormat8Choice.mmProprietary, DividendTypeFormat9Choice.mmCode, DividendTypeFormat9Choice.mmProprietary,
					DividendTypeFormat10Choice.mmCode, DividendTypeFormat10Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DividendTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashProceedsDefinition> cashProceeds;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmDividend
	 * CashProceedsDefinition.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition
	 * CashProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashProceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the proceeds which resulted in dividends."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashProceeds = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashProceeds";
			definition = "Defines the proceeds which resulted in dividends.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.PaymentObligation> obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmDividend
	 * PaymentObligation.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentObligation
	 * PaymentObligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the payment terms of the dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmObligation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the payment terms of the dividend.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmObject();
		}
	};
	protected Tax tax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#mmDividend
	 * Tax.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax on dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax on dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Distribution relatedDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDividend
	 * Distribution.mmDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which a dividend is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDistribution";
			definition = "Distribution for which a dividend is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmDividend;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected CorporateActionFrequencyTypeCode dividendFrequenceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
	 * CorporateActionFrequencyTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendFrequenceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cycle of dividends."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendFrequenceType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendFrequenceType";
			definition = "Specifies the cycle of dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendFrequenceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate dividendRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of earnings paid to shareholders in dividends."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDividendRatio = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDividendRatio", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate paymentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the dividend is paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date upon which the dividend is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FrequencyCode paymentFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#mmPaymentFrequency
	 * Debt1.mmPaymentFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#mmPaymentFrequency
	 * Debt2.mmPaymentFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt3#mmPaymentFrequency
	 * Debt3.mmPaymentFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the cycle of dividend payments."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPaymentFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(Debt1.mmPaymentFrequency, Debt2.mmPaymentFrequency, Debt3.mmPaymentFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the cycle of dividend payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getPaymentFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate reinvestmentDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which the dividend is reinvested."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmReinvestmentDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDate";
			definition = "Date upon which the dividend is reinvested.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getReinvestmentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the dividend expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValue = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Value of the dividend expressed as an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount deemedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmDeemedAmountDividendParameters
	 * RateAndAmount.mmDeemedAmountDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmDeemedAmount
	 * CorporateActionAmounts42.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmDeemedAmount
	 * CorporateActionAmounts43.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmDeemedAmount
	 * CorporateActionAmounts44.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmDeemedAmount
	 * CorporateActionAmounts45.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmDeemedAmount
	 * CorporateActionAmounts46.mmDeemedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmDeemedAmount
	 * CorporateActionAmounts47.mmDeemedAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of proceeds which is not actually paid to the security holder but on which withholding tax is applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDeemedAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts42.mmDeemedAmount, CorporateActionAmounts43.mmDeemedAmount, CorporateActionAmounts44.mmDeemedAmount, CorporateActionAmounts45.mmDeemedAmount,
					CorporateActionAmounts46.mmDeemedAmount, CorporateActionAmounts47.mmDeemedAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeemedAmount";
			definition = "Amount of proceeds which is not actually paid to the security holder but on which withholding tax is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmDeemedAmountDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected PercentageRate deemedRate;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails31#mmDeemedRate
	 * RateDetails31.mmDeemedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails32#mmDeemedRate
	 * RateDetails32.mmDeemedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails33#mmDeemedRate
	 * RateDetails33.mmDeemedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails34#mmDeemedRate
	 * RateDetails34.mmDeemedRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applied for the calculation of deemed proceeds which are not paid to security holders but on which withholding tax is applicable."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeemedRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(RateDetails31.mmDeemedRate, RateDetails32.mmDeemedRate, RateDetails33.mmDeemedRate, RateDetails34.mmDeemedRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeemedRate";
			definition = "Rate applied for the calculation of deemed proceeds which are not paid to security holders but on which withholding tax is applicable.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return Dividend.class.getMethod("getDeemedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount conduitForeignIncomeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmConduitForeignIncomeAmountDividendParameters
	 * RateAndAmount.mmConduitForeignIncomeAmountDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts42.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts43.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts44.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts45.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts46.mmConduitForeignIncomeAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmConduitForeignIncomeAmount
	 * CorporateActionAmounts47.mmConduitForeignIncomeAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Dividend
	 * Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount relating to a conduit foreign income."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmConduitForeignIncomeAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionAmounts42.mmConduitForeignIncomeAmount, CorporateActionAmounts43.mmConduitForeignIncomeAmount, CorporateActionAmounts44.mmConduitForeignIncomeAmount,
					CorporateActionAmounts45.mmConduitForeignIncomeAmount, CorporateActionAmounts46.mmConduitForeignIncomeAmount, CorporateActionAmounts47.mmConduitForeignIncomeAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ConduitForeignIncomeAmount";
			definition = "Amount relating to a conduit foreign income.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmConduitForeignIncomeAmountDividendParameters;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Dividend";
				definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmDividend, com.tools20022.repository.entity.Tax.mmDividend, com.tools20022.repository.entity.PaymentObligation.mmDividend,
						com.tools20022.repository.entity.RateAndAmount.mmFinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmFullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmGrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmNetDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.mmConduitForeignIncomeAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.mmDeemedAmountDividendParameters, com.tools20022.repository.entity.CashProceedsDefinition.mmDividend, com.tools20022.repository.entity.Distribution.mmDividend);
				derivationElement_lazy = () -> Arrays.asList(GrossDividendRate1Choice.mmRateTypeAmount, NetDividendRate1Choice.mmRateTypeAmount, TaxVoucher1.mmNotionalDividendPayable);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.mmDividendFrequency, com.tools20022.repository.entity.Dividend.mmAnnualTotalDividendRate,
						com.tools20022.repository.entity.Dividend.mmFinalDividend, com.tools20022.repository.entity.Dividend.mmFullyFrankedRateAndAmount, com.tools20022.repository.entity.Dividend.mmGrossDividend,
						com.tools20022.repository.entity.Dividend.mmRateType, com.tools20022.repository.entity.Dividend.mmNetDividend, com.tools20022.repository.entity.Dividend.mmProvisionalDividend,
						com.tools20022.repository.entity.Dividend.mmDividendRankingDate, com.tools20022.repository.entity.Dividend.mmManufacturedDividendAmount, com.tools20022.repository.entity.Dividend.mmUnfrankedAmount,
						com.tools20022.repository.entity.Dividend.mmNotionalDividendPayableAmount, com.tools20022.repository.entity.Dividend.mmRate, com.tools20022.repository.entity.Dividend.mmExDividendDate,
						com.tools20022.repository.entity.Dividend.mmSecurity, com.tools20022.repository.entity.Dividend.mmType, com.tools20022.repository.entity.Dividend.mmCashProceeds,
						com.tools20022.repository.entity.Dividend.mmObligation, com.tools20022.repository.entity.Dividend.mmTax, com.tools20022.repository.entity.Dividend.mmRelatedDistribution,
						com.tools20022.repository.entity.Dividend.mmDividendFrequenceType, com.tools20022.repository.entity.Dividend.mmDividendRatio, com.tools20022.repository.entity.Dividend.mmPaymentDate,
						com.tools20022.repository.entity.Dividend.mmPaymentFrequency, com.tools20022.repository.entity.Dividend.mmReinvestmentDate, com.tools20022.repository.entity.Dividend.mmValue,
						com.tools20022.repository.entity.Dividend.mmDeemedAmount, com.tools20022.repository.entity.Dividend.mmDeemedRate, com.tools20022.repository.entity.Dividend.mmConduitForeignIncomeAmount);
				derivationComponent_lazy = () -> Arrays.asList(RateType13Choice.mmObject(), GrossDividendRateFormat2Choice.mmObject(), RateType7Choice.mmObject(), NetDividendRateFormat2Choice.mmObject(), RateType15Choice.mmObject(),
						GrossDividendRateFormat3Choice.mmObject(), RateType16Choice.mmObject(), NetDividendRateFormat3Choice.mmObject(), RateType17Choice.mmObject(), RateType18Choice.mmObject(), NetDividendRateFormat1Choice.mmObject(),
						NetDividendRateFormat5Choice.mmObject(), NetDividendRateFormat7Choice.mmObject(), NetDividendRateFormat8Choice.mmObject(), RateType22Choice.mmObject(), GrossDividendRateFormat10Choice.mmObject(),
						RateType23Choice.mmObject(), NetDividendRateFormat12Choice.mmObject(), RateType20Choice.mmObject(), GrossDividendRateFormat8Choice.mmObject(), RateType21Choice.mmObject(), NetDividendRateFormat10Choice.mmObject(),
						RateType24Choice.mmObject(), GrossDividendRateFormat11Choice.mmObject(), RateType25Choice.mmObject(), NetDividendRateFormat13Choice.mmObject(), RateType26Choice.mmObject(),
						GrossDividendRateFormat12Choice.mmObject(), RateType27Choice.mmObject(), NetDividendRateFormat14Choice.mmObject(), GrossDividendRateFormat1Choice.mmObject(), GrossDividendRateFormat4Choice.mmObject(),
						NetDividendRateFormat4Choice.mmObject(), GrossDividendRateFormat5Choice.mmObject(), GrossDividendRateFormat6Choice.mmObject(), NetDividendRateFormat6Choice.mmObject(), GrossDividendRateFormat9Choice.mmObject(),
						NetDividendRateFormat11Choice.mmObject(), GrossDividendRateFormat7Choice.mmObject(), NetDividendRateFormat9Choice.mmObject(), GrossDividendRateFormat13Choice.mmObject(), NetDividendRateFormat15Choice.mmObject(),
						GrossDividendRateFormat14Choice.mmObject(), NetDividendRateFormat16Choice.mmObject(), DividendTypeFormat1Choice.mmObject(), DividendTypeFormat2Choice.mmObject(), DividendTypeFormat3Choice.mmObject(),
						DividendTypeFormat4Choice.mmObject(), GrossDividendRateType1FormatChoice.mmObject(), GrossDividendRate2.mmObject(), GrossDividendRate1Choice.mmObject(), NetDividendRateType1FormatChoice.mmObject(),
						NetDividendRate2.mmObject(), NetDividendRate1Choice.mmObject(), DividendTypeFormat5Choice.mmObject(), DividendTypeFormat8Choice.mmObject(), DividendSD1.mmObject(), GrossDividendRateFormat6SD1.mmObject(),
						UpdatedAdditionalInformation5SD1.mmObject(), UpdatedAdditionalInformation5SD3.mmObject(), RateType38Choice.mmObject(), RateType40Choice.mmObject(), RateType41Choice.mmObject(), RateType36Choice.mmObject(),
						DividendTypeFormat9Choice.mmObject(), RateType39Choice.mmObject(), GrossDividendRateFormat19Choice.mmObject(), NetDividendRateFormat21Choice.mmObject(), NetDividendRateFormat23Choice.mmObject(),
						GrossDividendRateFormat21Choice.mmObject(), NetDividendRateFormat22Choice.mmObject(), GrossDividendRateFormat20Choice.mmObject(), NetDividendRateFormat24Choice.mmObject(), GrossDividendRateFormat22Choice.mmObject(),
						RateType44Choice.mmObject(), RateType47Choice.mmObject(), RateType49Choice.mmObject(), NetDividendRateFormat28Choice.mmObject(), RateType50Choice.mmObject(), GrossDividendRateFormat26Choice.mmObject(),
						NetDividendRateFormat25Choice.mmObject(), GrossDividendRateFormat23Choice.mmObject(), GrossDividendRateFormat24Choice.mmObject(), RateType51Choice.mmObject(), NetDividendRateFormat26Choice.mmObject(),
						NetDividendRateFormat27Choice.mmObject(), GrossDividendRateFormat25Choice.mmObject(), DividendTypeFormat10Choice.mmObject(), RateType69Choice.mmObject(), RateType68Choice.mmObject(),
						GrossDividendRateFormat27Choice.mmObject(), NetDividendRateFormat29Choice.mmObject(), NetDividendRateFormat32Choice.mmObject(), GrossDividendRateFormat29Choice.mmObject(), RateType70Choice.mmObject(),
						NetDividendRateFormat30Choice.mmObject(), GrossDividendRateFormat28Choice.mmObject(), RateType71Choice.mmObject(), NetDividendRateFormat31Choice.mmObject(), GrossDividendRateFormat30Choice.mmObject(),
						GrossDividendRateFormat31Choice.mmObject(), RateType72Choice.mmObject(), NetDividendRateFormat33Choice.mmObject(), RateType73Choice.mmObject(), GrossDividendRateFormat32Choice.mmObject(),
						RateType74Choice.mmObject(), NetDividendRateFormat34Choice.mmObject(), RateType75Choice.mmObject(), GrossDividendRateFormat33Choice.mmObject(), NetDividendRateFormat35Choice.mmObject(),
						GrossDividendRateFormat34Choice.mmObject(), NetDividendRateFormat36Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Dividend.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequencyCode getDividendFrequency() {
		return dividendFrequency;
	}

	public Dividend setDividendFrequency(EventFrequencyCode dividendFrequency) {
		this.dividendFrequency = Objects.requireNonNull(dividendFrequency);
		return this;
	}

	public PercentageRate getAnnualTotalDividendRate() {
		return annualTotalDividendRate;
	}

	public Dividend setAnnualTotalDividendRate(PercentageRate annualTotalDividendRate) {
		this.annualTotalDividendRate = Objects.requireNonNull(annualTotalDividendRate);
		return this;
	}

	public RateAndAmount getFinalDividend() {
		return finalDividend;
	}

	public Dividend setFinalDividend(com.tools20022.repository.entity.RateAndAmount finalDividend) {
		this.finalDividend = Objects.requireNonNull(finalDividend);
		return this;
	}

	public RateAndAmount getFullyFrankedRateAndAmount() {
		return fullyFrankedRateAndAmount;
	}

	public Dividend setFullyFrankedRateAndAmount(com.tools20022.repository.entity.RateAndAmount fullyFrankedRateAndAmount) {
		this.fullyFrankedRateAndAmount = Objects.requireNonNull(fullyFrankedRateAndAmount);
		return this;
	}

	public RateAndAmount getGrossDividend() {
		return grossDividend;
	}

	public Dividend setGrossDividend(com.tools20022.repository.entity.RateAndAmount grossDividend) {
		this.grossDividend = Objects.requireNonNull(grossDividend);
		return this;
	}

	public DividendRateTypeCode getRateType() {
		return rateType;
	}

	public Dividend setRateType(DividendRateTypeCode rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public RateAndAmount getNetDividend() {
		return netDividend;
	}

	public Dividend setNetDividend(com.tools20022.repository.entity.RateAndAmount netDividend) {
		this.netDividend = Objects.requireNonNull(netDividend);
		return this;
	}

	public RateAndAmount getProvisionalDividend() {
		return provisionalDividend;
	}

	public Dividend setProvisionalDividend(com.tools20022.repository.entity.RateAndAmount provisionalDividend) {
		this.provisionalDividend = Objects.requireNonNull(provisionalDividend);
		return this;
	}

	public ISODateTime getDividendRankingDate() {
		return dividendRankingDate;
	}

	public Dividend setDividendRankingDate(ISODateTime dividendRankingDate) {
		this.dividendRankingDate = Objects.requireNonNull(dividendRankingDate);
		return this;
	}

	public CurrencyAndAmount getManufacturedDividendAmount() {
		return manufacturedDividendAmount;
	}

	public Dividend setManufacturedDividendAmount(CurrencyAndAmount manufacturedDividendAmount) {
		this.manufacturedDividendAmount = Objects.requireNonNull(manufacturedDividendAmount);
		return this;
	}

	public CurrencyAndAmount getUnfrankedAmount() {
		return unfrankedAmount;
	}

	public Dividend setUnfrankedAmount(CurrencyAndAmount unfrankedAmount) {
		this.unfrankedAmount = Objects.requireNonNull(unfrankedAmount);
		return this;
	}

	public CurrencyAndAmount getNotionalDividendPayableAmount() {
		return notionalDividendPayableAmount;
	}

	public Dividend setNotionalDividendPayableAmount(CurrencyAndAmount notionalDividendPayableAmount) {
		this.notionalDividendPayableAmount = Objects.requireNonNull(notionalDividendPayableAmount);
		return this;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public Dividend setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public ISODateTime getExDividendDate() {
		return exDividendDate;
	}

	public Dividend setExDividendDate(ISODateTime exDividendDate) {
		this.exDividendDate = Objects.requireNonNull(exDividendDate);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public Dividend setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public DividendTypeCode getType() {
		return type;
	}

	public Dividend setType(DividendTypeCode type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public List<CashProceedsDefinition> getCashProceeds() {
		return cashProceeds == null ? cashProceeds = new ArrayList<>() : cashProceeds;
	}

	public Dividend setCashProceeds(List<com.tools20022.repository.entity.CashProceedsDefinition> cashProceeds) {
		this.cashProceeds = Objects.requireNonNull(cashProceeds);
		return this;
	}

	public List<PaymentObligation> getObligation() {
		return obligation == null ? obligation = new ArrayList<>() : obligation;
	}

	public Dividend setObligation(List<com.tools20022.repository.entity.PaymentObligation> obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Tax getTax() {
		return tax;
	}

	public Dividend setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public Distribution getRelatedDistribution() {
		return relatedDistribution;
	}

	public Dividend setRelatedDistribution(com.tools20022.repository.entity.Distribution relatedDistribution) {
		this.relatedDistribution = Objects.requireNonNull(relatedDistribution);
		return this;
	}

	public CorporateActionFrequencyTypeCode getDividendFrequenceType() {
		return dividendFrequenceType;
	}

	public Dividend setDividendFrequenceType(CorporateActionFrequencyTypeCode dividendFrequenceType) {
		this.dividendFrequenceType = Objects.requireNonNull(dividendFrequenceType);
		return this;
	}

	public PercentageRate getDividendRatio() {
		return dividendRatio;
	}

	public Dividend setDividendRatio(PercentageRate dividendRatio) {
		this.dividendRatio = Objects.requireNonNull(dividendRatio);
		return this;
	}

	public ISODate getPaymentDate() {
		return paymentDate;
	}

	public Dividend setPaymentDate(ISODate paymentDate) {
		this.paymentDate = Objects.requireNonNull(paymentDate);
		return this;
	}

	public FrequencyCode getPaymentFrequency() {
		return paymentFrequency;
	}

	public Dividend setPaymentFrequency(FrequencyCode paymentFrequency) {
		this.paymentFrequency = Objects.requireNonNull(paymentFrequency);
		return this;
	}

	public ISODate getReinvestmentDate() {
		return reinvestmentDate;
	}

	public Dividend setReinvestmentDate(ISODate reinvestmentDate) {
		this.reinvestmentDate = Objects.requireNonNull(reinvestmentDate);
		return this;
	}

	public CurrencyAndAmount getValue() {
		return value;
	}

	public Dividend setValue(CurrencyAndAmount value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public RateAndAmount getDeemedAmount() {
		return deemedAmount;
	}

	public Dividend setDeemedAmount(com.tools20022.repository.entity.RateAndAmount deemedAmount) {
		this.deemedAmount = Objects.requireNonNull(deemedAmount);
		return this;
	}

	public PercentageRate getDeemedRate() {
		return deemedRate;
	}

	public Dividend setDeemedRate(PercentageRate deemedRate) {
		this.deemedRate = Objects.requireNonNull(deemedRate);
		return this;
	}

	public RateAndAmount getConduitForeignIncomeAmount() {
		return conduitForeignIncomeAmount;
	}

	public Dividend setConduitForeignIncomeAmount(com.tools20022.repository.entity.RateAndAmount conduitForeignIncomeAmount) {
		this.conduitForeignIncomeAmount = Objects.requireNonNull(conduitForeignIncomeAmount);
		return this;
	}
}