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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#DividendFrequency
 * Dividend.DividendFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#AnnualTotalDividendRate
 * Dividend.AnnualTotalDividendRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
 * Dividend.FinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
 * Dividend.FullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
 * Dividend.GrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#RateType
 * Dividend.RateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#NetDividend
 * Dividend.NetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
 * Dividend.ProvisionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#DividendRankingDate
 * Dividend.DividendRankingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ManufacturedDividendAmount
 * Dividend.ManufacturedDividendAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#UnfrankedAmount
 * Dividend.UnfrankedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#NotionalDividendPayableAmount
 * Dividend.NotionalDividendPayableAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Rate Dividend.Rate}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#ExDividendDate
 * Dividend.ExDividendDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Security
 * Dividend.Security}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Type Dividend.Type}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#CashProceeds
 * Dividend.CashProceeds}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Obligation
 * Dividend.Obligation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Tax Dividend.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#RelatedDistribution
 * Dividend.RelatedDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#DividendFrequenceType
 * Dividend.DividendFrequenceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#DividendRatio
 * Dividend.DividendRatio}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#PaymentDate
 * Dividend.PaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#PaymentFrequency
 * Dividend.PaymentFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#ReinvestmentDate
 * Dividend.ReinvestmentDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Value
 * Dividend.Value}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#Dividend
 * Security.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Dividend Tax.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
 * PaymentObligation.Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
 * RateAndAmount.FinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
 * RateAndAmount.GrossDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
 * RateAndAmount.NetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
 * RateAndAmount.ProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
 * CashProceedsDefinition.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#Dividend
 * Distribution.Dividend}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#RateTypeAmount
 * GrossDividendRate1Choice.RateTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRate1Choice#RateTypeAmount
 * NetDividendRate1Choice.RateTypeAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#NotionalDividendPayable
 * TaxVoucher1.NotionalDividendPayable}</li>
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
	/**
	 * Frequency with which the income is allocated to investors.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument16#DividendFrequency
	 * FinancialInstrument16.DividendFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument20#DividendFrequency
	 * FinancialInstrument20.DividendFrequency}</li>
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
	public static final MMBusinessAttribute DividendFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument16.DividendFrequency, com.tools20022.repository.msg.FinancialInstrument20.DividendFrequency);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequency";
			definition = "Frequency with which the income is allocated to investors.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}
	};
	/**
	 * Provides the annual total dividend rate.
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
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument10#DividendPercentage
	 * PaymentInstrument10.DividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument12#DividendPercentage
	 * PaymentInstrument12.DividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#TotalAnnualDividendRate
	 * DividendSD1.TotalAnnualDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#MaximumAnnualTotalDividendRate
	 * DividendSD1.MaximumAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DividendSD1#MinimumAnnualTotalDividendRate
	 * DividendSD1.MinimumAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRateFormat6SD1#MaximumDividendRate
	 * GrossDividendRateFormat6SD1.MaximumDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRateFormat6SD1#MinimumDividendRate
	 * GrossDividendRateFormat6SD1.MinimumDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#DividendPercentage
	 * CashAccount33.DividendPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#DividendPercentage
	 * PaymentInstrument13.DividendPercentage}</li>
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
	public static final MMBusinessAttribute AnnualTotalDividendRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument10.DividendPercentage, com.tools20022.repository.msg.PaymentInstrument12.DividendPercentage,
					com.tools20022.repository.msg.DividendSD1.TotalAnnualDividendRate, com.tools20022.repository.msg.DividendSD1.MaximumAnnualTotalDividendRate, com.tools20022.repository.msg.DividendSD1.MinimumAnnualTotalDividendRate,
					com.tools20022.repository.msg.GrossDividendRateFormat6SD1.MaximumDividendRate, com.tools20022.repository.msg.GrossDividendRateFormat6SD1.MinimumDividendRate,
					com.tools20022.repository.msg.CashAccount33.DividendPercentage, com.tools20022.repository.msg.PaymentInstrument13.DividendPercentage);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AnnualTotalDividendRate";
			definition = "Provides the annual total dividend rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
	 * RateAndAmount.FinalDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#FinalDividendRate
	 * CorporateActionRate4.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#FinalDividendRate
	 * CorporateActionRate10.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#FinalDividendRate
	 * RateDetails2.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#FinalDividendRate
	 * RateDetails4.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#FinalDividendRate
	 * RateDetails7.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#FinalDividendRate
	 * RateDetails9.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#FinalDividendRate
	 * RateDetails11.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#FinalDividendRate
	 * RateDetails12.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#FinalDividendRate
	 * CorporateActionRate5.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#FinalDividendRate
	 * CorporateActionRate12.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#FinalDividendRate
	 * RateDetails3.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#FinalDividendRate
	 * RateDetails5.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#FinalDividendRate
	 * RateDetails10.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#FinalDividendRate
	 * RateDetails13.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice#Amount
	 * GrossDividendRate1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#FinalDividend
	 * CorporateActionRate2.FinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#FinalDividendRate
	 * RateDetails15.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#FinalDividendRate
	 * RateDetails14.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#FinalDividendRate
	 * RateDetails18.FinalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#FinalDividendRate
	 * RateDetails21.FinalDividendRate}</li>
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
	public static final MMBusinessAssociationEnd FinalDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.FinalDividendRate, com.tools20022.repository.msg.CorporateActionRate10.FinalDividendRate,
					com.tools20022.repository.msg.RateDetails2.FinalDividendRate, com.tools20022.repository.msg.RateDetails4.FinalDividendRate, com.tools20022.repository.msg.RateDetails7.FinalDividendRate,
					com.tools20022.repository.msg.RateDetails9.FinalDividendRate, com.tools20022.repository.msg.RateDetails11.FinalDividendRate, com.tools20022.repository.msg.RateDetails12.FinalDividendRate,
					com.tools20022.repository.msg.CorporateActionRate5.FinalDividendRate, com.tools20022.repository.msg.CorporateActionRate12.FinalDividendRate, com.tools20022.repository.msg.RateDetails3.FinalDividendRate,
					com.tools20022.repository.msg.RateDetails5.FinalDividendRate, com.tools20022.repository.msg.RateDetails10.FinalDividendRate, com.tools20022.repository.msg.RateDetails13.FinalDividendRate,
					com.tools20022.repository.choice.GrossDividendRate1Choice.Amount, com.tools20022.repository.msg.CorporateActionRate2.FinalDividend, com.tools20022.repository.msg.RateDetails15.FinalDividendRate,
					com.tools20022.repository.msg.RateDetails14.FinalDividendRate, com.tools20022.repository.msg.RateDetails18.FinalDividendRate, com.tools20022.repository.msg.RateDetails21.FinalDividendRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Rate of a fully franked dividend paid by a company, or amount resulting
	 * from a fully franked dividend paid by a company; amount includes tax
	 * credit for companies that have made sufficient tax payments during the
	 * fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
	 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#FullyFrankedRate
	 * CorporateActionRate4.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#FullyFrankedRate
	 * CorporateActionRate10.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#FullyFrankedRate
	 * RateDetails2.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#FullyFrankedRate
	 * RateDetails4.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#FullyFrankedRate
	 * RateDetails7.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#FullyFrankedRate
	 * RateDetails9.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#FullyFrankedRate
	 * RateDetails11.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#FullyFrankedRate
	 * RateDetails12.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#FullyFrankedRate
	 * CorporateActionRate5.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#FullyFrankedRate
	 * CorporateActionRate12.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#FullyFrankedRate
	 * RateDetails3.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#FullyFrankedRate
	 * RateDetails5.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#FullyFrankedRate
	 * RateDetails10.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#FullyFrankedRate
	 * RateDetails13.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#FullyFranked
	 * CorporateActionRate2.FullyFranked}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#FullyFrankedRate
	 * RateDetails15.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#FullyFrankedRate
	 * RateDetails14.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#FullyFrankedRate
	 * RateDetails18.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#FullyFrankedRate
	 * RateDetails21.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#FullyFrankedRate
	 * RateDetails23.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#FullyFrankedRate
	 * RateDetails22.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#FullyFrankedRate
	 * RateDetails24.FullyFrankedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#FullyFrankedRate
	 * RateDetails25.FullyFrankedRate}</li>
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
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.FullyFrankedRate, com.tools20022.repository.msg.CorporateActionRate10.FullyFrankedRate,
					com.tools20022.repository.msg.RateDetails2.FullyFrankedRate, com.tools20022.repository.msg.RateDetails4.FullyFrankedRate, com.tools20022.repository.msg.RateDetails7.FullyFrankedRate,
					com.tools20022.repository.msg.RateDetails9.FullyFrankedRate, com.tools20022.repository.msg.RateDetails11.FullyFrankedRate, com.tools20022.repository.msg.RateDetails12.FullyFrankedRate,
					com.tools20022.repository.msg.CorporateActionRate5.FullyFrankedRate, com.tools20022.repository.msg.CorporateActionRate12.FullyFrankedRate, com.tools20022.repository.msg.RateDetails3.FullyFrankedRate,
					com.tools20022.repository.msg.RateDetails5.FullyFrankedRate, com.tools20022.repository.msg.RateDetails10.FullyFrankedRate, com.tools20022.repository.msg.RateDetails13.FullyFrankedRate,
					com.tools20022.repository.msg.CorporateActionRate2.FullyFranked, com.tools20022.repository.msg.RateDetails15.FullyFrankedRate, com.tools20022.repository.msg.RateDetails14.FullyFrankedRate,
					com.tools20022.repository.msg.RateDetails18.FullyFrankedRate, com.tools20022.repository.msg.RateDetails21.FullyFrankedRate, com.tools20022.repository.msg.RateDetails23.FullyFrankedRate,
					com.tools20022.repository.msg.RateDetails22.FullyFrankedRate, com.tools20022.repository.msg.RateDetails24.FullyFrankedRate, com.tools20022.repository.msg.RateDetails25.FullyFrankedRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmount";
			definition = "Rate of a fully franked dividend paid by a company, or amount resulting from a fully franked dividend paid by a company; amount includes tax credit for companies that have made sufficient tax payments during the fiscal period.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
	 * RateAndAmount.GrossDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#GrossDividendRate
	 * CorporateActionRate4.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#GrossDividendRate
	 * CorporateActionRate10.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#GrossDividendRate
	 * CorporateActionRate20.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#GrossDividendRate
	 * RateDetails2.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#GrossDividendRate
	 * CorporateActionRate22.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#GrossDividendRate
	 * RateDetails4.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#GrossDividendRate
	 * CorporateActionRate26.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#GrossDividendRate
	 * RateDetails7.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#GrossDividendRate
	 * CorporateActionRate31.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#GrossDividendRate
	 * RateDetails9.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#GrossDividendRate
	 * CorporateActionRate38.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#GrossDividendRate
	 * RateDetails11.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#GrossDividendRate
	 * CorporateActionRate39.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#GrossDividendRate
	 * RateDetails12.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#GrossDividendRate
	 * CorporateActionRate5.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#GrossDividendRate
	 * CorporateActionRate12.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#GrossDividendRate
	 * CorporateActionRate15.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#GrossDividendRate
	 * RateDetails3.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#GrossDividendRate
	 * CorporateActionRate18.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#GrossDividendRate
	 * RateDetails5.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#GrossDividendRate
	 * CorporateActionRate25.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#GrossDividendRate
	 * CorporateActionRate30.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#GrossDividendRate
	 * CorporateActionRate37.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#GrossDividendRate
	 * RateDetails10.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#GrossDividendRate
	 * CorporateActionRate40.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#GrossDividendRate
	 * RateDetails13.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#GrossDividendRate
	 * CorporateActionRate36.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#GrossDividendRate
	 * CorporateActionRate42.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#GrossDividend
	 * CorporateActionRate2.GrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#GrossDividendRate
	 * RateDetails15.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#GrossDividendRate
	 * CorporateActionRate46.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#GrossDividendRate
	 * CorporateActionRate45.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#GrossDividendRate
	 * CorporateActionRate44.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#GrossDividendRate
	 * RateDetails14.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#GrossDividendRate
	 * CorporateActionRate60.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#GrossDividendRate
	 * RateDetails18.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#GrossDividendRate
	 * CorporateActionRate64.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#GrossDividendRate
	 * RateDetails21.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#GrossDividendRate
	 * CorporateActionRate57.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#NetAssetDecreaseRatio
	 * UpdatedAdditionalInformation5SD3.NetAssetDecreaseRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#AccumulatedProfitPerShare
	 * UpdatedAdditionalInformation5SD3.AccumulatedProfitPerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#GrossDividendRate
	 * RateDetails23.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#GrossDividendRate
	 * CorporateActionRate68.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#GrossDividendRate
	 * CorporateActionRate70.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#GrossDividendRate
	 * CorporateActionRate67.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#GrossDividendRate
	 * RateDetails22.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#GrossDividendRate
	 * CorporateActionRate74.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#GrossDividendRate
	 * CorporateActionRate79.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#GrossDividendRate
	 * RateDetails24.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#GrossDividendRate
	 * RateDetails25.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#GrossDividendRate
	 * CorporateActionRate76.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#GrossDividendRate
	 * RateDetails26.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#GrossDividendRate
	 * CorporateActionRate82.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#GrossDividendRate
	 * CorporateActionRate80.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#GrossDividendRate
	 * RateDetails27.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#GrossDividendRate
	 * CorporateActionRate81.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#GrossDividendRate
	 * CorporateActionRate83.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#GrossDividendRate
	 * CorporateActionRate84.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#GrossDividendRate
	 * CorporateActionRate85.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#GrossDividendRate
	 * RateDetails28.GrossDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#GrossDividendRate
	 * RateDetails30.GrossDividendRate}</li>
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
	public static final MMBusinessAssociationEnd GrossDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate10.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate20.GrossDividendRate, com.tools20022.repository.msg.RateDetails2.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate22.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails4.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate26.GrossDividendRate, com.tools20022.repository.msg.RateDetails7.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate31.GrossDividendRate, com.tools20022.repository.msg.RateDetails9.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate38.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails11.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate39.GrossDividendRate, com.tools20022.repository.msg.RateDetails12.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate5.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate12.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate15.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails3.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate18.GrossDividendRate, com.tools20022.repository.msg.RateDetails5.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate25.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate30.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate37.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails10.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate40.GrossDividendRate, com.tools20022.repository.msg.RateDetails13.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate36.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate42.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate2.GrossDividend,
					com.tools20022.repository.msg.RateDetails15.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate46.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate45.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate44.GrossDividendRate, com.tools20022.repository.msg.RateDetails14.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate60.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails18.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate64.GrossDividendRate, com.tools20022.repository.msg.RateDetails21.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate57.GrossDividendRate, com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.NetAssetDecreaseRatio,
					com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.AccumulatedProfitPerShare, com.tools20022.repository.msg.RateDetails23.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate68.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate70.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate67.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails22.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate74.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate79.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails24.GrossDividendRate, com.tools20022.repository.msg.RateDetails25.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate76.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails26.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate82.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate80.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails27.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate81.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate83.GrossDividendRate,
					com.tools20022.repository.msg.CorporateActionRate84.GrossDividendRate, com.tools20022.repository.msg.CorporateActionRate85.GrossDividendRate, com.tools20022.repository.msg.RateDetails28.GrossDividendRate,
					com.tools20022.repository.msg.RateDetails30.GrossDividendRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of dividend rate.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.RateType13Choice#Code
	 * RateType13Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType13Choice#Proprietary
	 * RateType13Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType7Choice#Code
	 * RateType7Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType7Choice#Proprietary
	 * RateType7Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType15Choice#Code
	 * RateType15Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType15Choice#Proprietary
	 * RateType15Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType16Choice#Code
	 * RateType16Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType16Choice#Proprietary
	 * RateType16Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType17Choice#Code
	 * RateType17Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType17Choice#Proprietary
	 * RateType17Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType18Choice#Code
	 * RateType18Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType18Choice#Proprietary
	 * RateType18Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType22Choice#Code
	 * RateType22Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType22Choice#Proprietary
	 * RateType22Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType23Choice#Code
	 * RateType23Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType23Choice#Proprietary
	 * RateType23Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType20Choice#Code
	 * RateType20Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType20Choice#Proprietary
	 * RateType20Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType21Choice#Code
	 * RateType21Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType21Choice#Proprietary
	 * RateType21Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType24Choice#Code
	 * RateType24Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType24Choice#Proprietary
	 * RateType24Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType25Choice#Code
	 * RateType25Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType25Choice#Proprietary
	 * RateType25Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType26Choice#Code
	 * RateType26Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType26Choice#Proprietary
	 * RateType26Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType27Choice#Code
	 * RateType27Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType27Choice#Proprietary
	 * RateType27Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.GrossDividendRate2#RateType
	 * GrossDividendRate2.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateType1FormatChoice#Code
	 * NetDividendRateType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateType1FormatChoice#Proprietary
	 * NetDividendRateType1FormatChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetDividendRate2#RateType
	 * NetDividendRate2.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType38Choice#Code
	 * RateType38Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType38Choice#Proprietary
	 * RateType38Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType40Choice#Code
	 * RateType40Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType40Choice#Proprietary
	 * RateType40Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType41Choice#Code
	 * RateType41Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType41Choice#Proprietary
	 * RateType41Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType36Choice#Code
	 * RateType36Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType36Choice#Proprietary
	 * RateType36Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType39Choice#Code
	 * RateType39Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType39Choice#Proprietary
	 * RateType39Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType44Choice#Code
	 * RateType44Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType44Choice#Proprietary
	 * RateType44Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType47Choice#Code
	 * RateType47Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType47Choice#Proprietary
	 * RateType47Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType49Choice#Code
	 * RateType49Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType49Choice#Proprietary
	 * RateType49Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType50Choice#Code
	 * RateType50Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType50Choice#Proprietary
	 * RateType50Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType51Choice#Code
	 * RateType51Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType51Choice#Proprietary
	 * RateType51Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType13Choice.Code, com.tools20022.repository.choice.RateType13Choice.Proprietary, com.tools20022.repository.choice.RateType7Choice.Code,
					com.tools20022.repository.choice.RateType7Choice.Proprietary, com.tools20022.repository.choice.RateType15Choice.Code, com.tools20022.repository.choice.RateType15Choice.Proprietary,
					com.tools20022.repository.choice.RateType16Choice.Code, com.tools20022.repository.choice.RateType16Choice.Proprietary, com.tools20022.repository.choice.RateType17Choice.Code,
					com.tools20022.repository.choice.RateType17Choice.Proprietary, com.tools20022.repository.choice.RateType18Choice.Code, com.tools20022.repository.choice.RateType18Choice.Proprietary,
					com.tools20022.repository.choice.RateType22Choice.Code, com.tools20022.repository.choice.RateType22Choice.Proprietary, com.tools20022.repository.choice.RateType23Choice.Code,
					com.tools20022.repository.choice.RateType23Choice.Proprietary, com.tools20022.repository.choice.RateType20Choice.Code, com.tools20022.repository.choice.RateType20Choice.Proprietary,
					com.tools20022.repository.choice.RateType21Choice.Code, com.tools20022.repository.choice.RateType21Choice.Proprietary, com.tools20022.repository.choice.RateType24Choice.Code,
					com.tools20022.repository.choice.RateType24Choice.Proprietary, com.tools20022.repository.choice.RateType25Choice.Code, com.tools20022.repository.choice.RateType25Choice.Proprietary,
					com.tools20022.repository.choice.RateType26Choice.Code, com.tools20022.repository.choice.RateType26Choice.Proprietary, com.tools20022.repository.choice.RateType27Choice.Code,
					com.tools20022.repository.choice.RateType27Choice.Proprietary, com.tools20022.repository.msg.GrossDividendRate2.RateType, com.tools20022.repository.choice.NetDividendRateType1FormatChoice.Code,
					com.tools20022.repository.choice.NetDividendRateType1FormatChoice.Proprietary, com.tools20022.repository.msg.NetDividendRate2.RateType, com.tools20022.repository.choice.RateType38Choice.Code,
					com.tools20022.repository.choice.RateType38Choice.Proprietary, com.tools20022.repository.choice.RateType40Choice.Code, com.tools20022.repository.choice.RateType40Choice.Proprietary,
					com.tools20022.repository.choice.RateType41Choice.Code, com.tools20022.repository.choice.RateType41Choice.Proprietary, com.tools20022.repository.choice.RateType36Choice.Code,
					com.tools20022.repository.choice.RateType36Choice.Proprietary, com.tools20022.repository.choice.RateType39Choice.Code, com.tools20022.repository.choice.RateType39Choice.Proprietary,
					com.tools20022.repository.choice.RateType44Choice.Code, com.tools20022.repository.choice.RateType44Choice.Proprietary, com.tools20022.repository.choice.RateType47Choice.Code,
					com.tools20022.repository.choice.RateType47Choice.Proprietary, com.tools20022.repository.choice.RateType49Choice.Code, com.tools20022.repository.choice.RateType49Choice.Proprietary,
					com.tools20022.repository.choice.RateType50Choice.Code, com.tools20022.repository.choice.RateType50Choice.Proprietary, com.tools20022.repository.choice.RateType51Choice.Code,
					com.tools20022.repository.choice.RateType51Choice.Proprietary);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type of dividend rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DividendRateTypeCode.mmObject();
		}
	};
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
	 * RateAndAmount.NetDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat2Choice#Amount
	 * NetDividendRateFormat2Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#NetDividendRate
	 * CorporateActionRate4.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat3Choice#Amount
	 * NetDividendRateFormat3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#NetDividendRate
	 * CorporateActionRate10.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#NetDividendRate
	 * RateDetails2.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#NetDividendRate
	 * RateDetails4.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat1Choice#Amount
	 * NetDividendRateFormat1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat5Choice#Amount
	 * NetDividendRateFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat7Choice#Amount
	 * NetDividendRateFormat7Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#NetDividendRate
	 * CorporateActionRate26.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#NetDividendRate
	 * RateDetails7.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat8Choice#Amount
	 * NetDividendRateFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#NetDividendRate
	 * CorporateActionRate31.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#NetDividendRate
	 * RateDetails9.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat12Choice#Amount
	 * NetDividendRateFormat12Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#NetDividendRate
	 * CorporateActionRate38.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat10Choice#Amount
	 * NetDividendRateFormat10Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#NetDividendRate
	 * RateDetails11.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat13Choice#Amount
	 * NetDividendRateFormat13Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#NetDividendRate
	 * CorporateActionRate39.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat14Choice#Amount
	 * NetDividendRateFormat14Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#NetDividendRate
	 * RateDetails12.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#NetDividendRate
	 * CorporateActionRate5.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat4Choice#Amount
	 * NetDividendRateFormat4Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#NetDividendRate
	 * CorporateActionRate12.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#NetDividendRate
	 * RateDetails3.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat6Choice#Amount
	 * NetDividendRateFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#NetDividendRate
	 * RateDetails5.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#NetDividendRate
	 * CorporateActionRate25.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#NetDividendRate
	 * CorporateActionRate30.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat11Choice#Amount
	 * NetDividendRateFormat11Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#NetDividendRate
	 * CorporateActionRate37.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat9Choice#Amount
	 * NetDividendRateFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#NetDividendRate
	 * RateDetails10.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat15Choice#Amount
	 * NetDividendRateFormat15Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#NetDividendRate
	 * CorporateActionRate40.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat16Choice#Amount
	 * NetDividendRateFormat16Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#NetDividendRate
	 * RateDetails13.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#NetDividendRate
	 * CorporateActionRate36.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#NetDividendRate
	 * CorporateActionRate42.NetDividendRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NetDividendRate2#Amount
	 * NetDividendRate2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRate1Choice#Amount
	 * NetDividendRate1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#NetDividend
	 * CorporateActionRate2.NetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#NetDividendRate
	 * RateDetails15.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#NetDividendRate
	 * CorporateActionRate46.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#NetDividendRate
	 * CorporateActionRate45.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#NetDividendRate
	 * CorporateActionRate44.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#NetDividendRate
	 * RateDetails14.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#NetDividendRate
	 * CorporateActionRate60.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#NetDividendRate
	 * RateDetails18.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#NetDividendRate
	 * CorporateActionRate64.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#NetDividendRate
	 * RateDetails21.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#NetDividendRate
	 * CorporateActionRate57.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#NetDividendRate
	 * RateDetails23.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#NetDividendRate
	 * CorporateActionRate68.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#NetDividendRate
	 * CorporateActionRate70.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#NetDividendRate
	 * CorporateActionRate67.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#NetDividendRate
	 * RateDetails22.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice#Amount
	 * NetDividendRateFormat21Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat23Choice#Amount
	 * NetDividendRateFormat23Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat22Choice#Amount
	 * NetDividendRateFormat22Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#Amount
	 * NetDividendRateFormat24Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#NetDividendRate
	 * CorporateActionRate74.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#NetDividendRate
	 * CorporateActionRate79.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#NetDividendRate
	 * RateDetails24.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#NetDividendRate
	 * RateDetails25.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#NetDividendRate
	 * CorporateActionRate76.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice#Amount
	 * NetDividendRateFormat28Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat25Choice#Amount
	 * NetDividendRateFormat25Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat26Choice#Amount
	 * NetDividendRateFormat26Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat27Choice#Amount
	 * NetDividendRateFormat27Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#NetDividendRate
	 * RateDetails26.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#NetDividendRate
	 * CorporateActionRate82.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#NetDividendRate
	 * CorporateActionRate80.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#NetDividendRate
	 * RateDetails27.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#NetDividendRate
	 * CorporateActionRate81.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#NetDividendRate
	 * CorporateActionRate83.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#NetDividendRate
	 * CorporateActionRate84.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#NetDividendRate
	 * CorporateActionRate85.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#NetDividendRate
	 * RateDetails28.NetDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#NetDividendRate
	 * RateDetails30.NetDividendRate}</li>
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
	public static final MMBusinessAssociationEnd NetDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NetDividendRateFormat2Choice.Amount, com.tools20022.repository.msg.CorporateActionRate4.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat3Choice.Amount, com.tools20022.repository.msg.CorporateActionRate10.NetDividendRate, com.tools20022.repository.msg.RateDetails2.NetDividendRate,
					com.tools20022.repository.msg.RateDetails4.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat1Choice.Amount, com.tools20022.repository.choice.NetDividendRateFormat5Choice.Amount,
					com.tools20022.repository.choice.NetDividendRateFormat7Choice.Amount, com.tools20022.repository.msg.CorporateActionRate26.NetDividendRate, com.tools20022.repository.msg.RateDetails7.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat8Choice.Amount, com.tools20022.repository.msg.CorporateActionRate31.NetDividendRate, com.tools20022.repository.msg.RateDetails9.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat12Choice.Amount, com.tools20022.repository.msg.CorporateActionRate38.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat10Choice.Amount,
					com.tools20022.repository.msg.RateDetails11.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat13Choice.Amount, com.tools20022.repository.msg.CorporateActionRate39.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat14Choice.Amount, com.tools20022.repository.msg.RateDetails12.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate5.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat4Choice.Amount, com.tools20022.repository.msg.CorporateActionRate12.NetDividendRate, com.tools20022.repository.msg.RateDetails3.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat6Choice.Amount, com.tools20022.repository.msg.RateDetails5.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate25.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate30.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat11Choice.Amount, com.tools20022.repository.msg.CorporateActionRate37.NetDividendRate,
					com.tools20022.repository.choice.NetDividendRateFormat9Choice.Amount, com.tools20022.repository.msg.RateDetails10.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat15Choice.Amount,
					com.tools20022.repository.msg.CorporateActionRate40.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat16Choice.Amount, com.tools20022.repository.msg.RateDetails13.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate36.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate42.NetDividendRate, com.tools20022.repository.msg.NetDividendRate2.Amount,
					com.tools20022.repository.choice.NetDividendRate1Choice.Amount, com.tools20022.repository.msg.CorporateActionRate2.NetDividend, com.tools20022.repository.msg.RateDetails15.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate46.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate45.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate44.NetDividendRate,
					com.tools20022.repository.msg.RateDetails14.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate60.NetDividendRate, com.tools20022.repository.msg.RateDetails18.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate64.NetDividendRate, com.tools20022.repository.msg.RateDetails21.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate57.NetDividendRate,
					com.tools20022.repository.msg.RateDetails23.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate68.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate70.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate67.NetDividendRate, com.tools20022.repository.msg.RateDetails22.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat21Choice.Amount,
					com.tools20022.repository.choice.NetDividendRateFormat23Choice.Amount, com.tools20022.repository.choice.NetDividendRateFormat22Choice.Amount, com.tools20022.repository.choice.NetDividendRateFormat24Choice.Amount,
					com.tools20022.repository.msg.CorporateActionRate74.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate79.NetDividendRate, com.tools20022.repository.msg.RateDetails24.NetDividendRate,
					com.tools20022.repository.msg.RateDetails25.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate76.NetDividendRate, com.tools20022.repository.choice.NetDividendRateFormat28Choice.Amount,
					com.tools20022.repository.choice.NetDividendRateFormat25Choice.Amount, com.tools20022.repository.choice.NetDividendRateFormat26Choice.Amount, com.tools20022.repository.choice.NetDividendRateFormat27Choice.Amount,
					com.tools20022.repository.msg.RateDetails26.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate82.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate80.NetDividendRate,
					com.tools20022.repository.msg.RateDetails27.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate81.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate83.NetDividendRate,
					com.tools20022.repository.msg.CorporateActionRate84.NetDividendRate, com.tools20022.repository.msg.CorporateActionRate85.NetDividendRate, com.tools20022.repository.msg.RateDetails28.NetDividendRate,
					com.tools20022.repository.msg.RateDetails30.NetDividendRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.NetDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
	 * RateAndAmount.ProvisionalDividendParameters}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#ProvisionalDividendRate
	 * CorporateActionRate4.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#ProvisionalDividendRate
	 * CorporateActionRate10.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#ProvisionalDividendRate
	 * RateDetails2.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#ProvisionalDividendRate
	 * RateDetails4.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#ProvisionalDividendRate
	 * RateDetails7.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#ProvisionalDividendRate
	 * RateDetails9.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#ProvisionalDividendRate
	 * RateDetails11.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#ProvisionalDividendRate
	 * RateDetails12.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#ProvisionalDividendRate
	 * CorporateActionRate5.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#ProvisionalDividendRate
	 * CorporateActionRate12.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#ProvisionalDividendRate
	 * RateDetails3.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#ProvisionalDividendRate
	 * RateDetails5.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#ProvisionalDividendRate
	 * RateDetails10.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#ProvisionalDividendRate
	 * RateDetails13.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#ProvisionalDividend
	 * CorporateActionRate2.ProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#ProvisionalDividendRate
	 * RateDetails15.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#ProvisionalDividendRate
	 * RateDetails14.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#ProvisionalDividendRate
	 * RateDetails18.ProvisionalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#ProvisionalDividendRate
	 * RateDetails21.ProvisionalDividendRate}</li>
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
	public static final MMBusinessAssociationEnd ProvisionalDividend = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.ProvisionalDividendRate, com.tools20022.repository.msg.CorporateActionRate10.ProvisionalDividendRate,
					com.tools20022.repository.msg.RateDetails2.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails4.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails7.ProvisionalDividendRate,
					com.tools20022.repository.msg.RateDetails9.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails11.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails12.ProvisionalDividendRate,
					com.tools20022.repository.msg.CorporateActionRate5.ProvisionalDividendRate, com.tools20022.repository.msg.CorporateActionRate12.ProvisionalDividendRate,
					com.tools20022.repository.msg.RateDetails3.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails5.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails10.ProvisionalDividendRate,
					com.tools20022.repository.msg.RateDetails13.ProvisionalDividendRate, com.tools20022.repository.msg.CorporateActionRate2.ProvisionalDividend, com.tools20022.repository.msg.RateDetails15.ProvisionalDividendRate,
					com.tools20022.repository.msg.RateDetails14.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails18.ProvisionalDividendRate, com.tools20022.repository.msg.RateDetails21.ProvisionalDividendRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which a security will be entitled to a dividend.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityDate1#DividendRankingDate
	 * SecurityDate1.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate3#DividendRankingDate
	 * SecurityDate3.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate6#DividendRankingDate
	 * SecurityDate6.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate7#DividendRankingDate
	 * SecurityDate7.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate2#DividendRankingDate
	 * SecurityDate2.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate4#DividendRankingDate
	 * SecurityDate4.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate5#DividendRankingDate
	 * SecurityDate5.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate8#DividendRankingDate
	 * SecurityDate8.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate9#DividendRankingDate
	 * SecurityDate9.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate10#DividendRankingDate
	 * SecurityDate10.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#DividendRankingDate
	 * CorporateActionDate3.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#DividendRankingDate
	 * SecurityDate12.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#DividendRankingDate
	 * SecurityDate11.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate14#DividendRankingDate
	 * SecurityDate14.DividendRankingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate13#DividendRankingDate
	 * SecurityDate13.DividendRankingDate}</li>
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
	public static final MMBusinessAttribute DividendRankingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityDate1.DividendRankingDate, com.tools20022.repository.msg.SecurityDate3.DividendRankingDate,
					com.tools20022.repository.msg.SecurityDate6.DividendRankingDate, com.tools20022.repository.msg.SecurityDate7.DividendRankingDate, com.tools20022.repository.msg.SecurityDate2.DividendRankingDate,
					com.tools20022.repository.msg.SecurityDate4.DividendRankingDate, com.tools20022.repository.msg.SecurityDate5.DividendRankingDate, com.tools20022.repository.msg.SecurityDate8.DividendRankingDate,
					com.tools20022.repository.msg.SecurityDate9.DividendRankingDate, com.tools20022.repository.msg.SecurityDate10.DividendRankingDate, com.tools20022.repository.msg.CorporateActionDate3.DividendRankingDate,
					com.tools20022.repository.msg.SecurityDate12.DividendRankingDate, com.tools20022.repository.msg.SecurityDate11.DividendRankingDate, com.tools20022.repository.msg.SecurityDate14.DividendRankingDate,
					com.tools20022.repository.msg.SecurityDate13.DividendRankingDate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRankingDate";
			definition = "Date on which a security will be entitled to a dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Amount of money that the borrower pays to the lender as a compensation.
	 * It does not entitle the lender to reclaim any tax credit and is sometimes
	 * treated differently by the local tax authorities of the lender.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#ManufacturedDividendAmount
	 * CorporateActionAmounts2.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#ManufacturedDividendAmount
	 * CorporateActionAmounts5.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts11.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts12.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts17.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts20.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts23.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts24.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#ManufacturedDividendAmount
	 * CorporateActionAmounts3.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#ManufacturedDividendAmount
	 * CorporateActionAmounts6.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts9.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts13.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts16.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts19.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts22.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts25.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#ManufacturedDividendAmount
	 * CorporateActionAmounts4.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#ManufacturedDividendAmount
	 * CorporateActionAmounts7.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts10.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts14.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts15.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts18.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts21.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts26.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#ManufacturedDividendAmount
	 * CorporateActionAmounts1.ManufacturedDividendAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts29.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts27.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts28.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts33.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts32.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts35.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts37.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts36.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts38.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts39.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts41.ManufacturedDividendPaymentAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#ManufacturedDividendPaymentAmount
	 * CorporateActionAmounts40.ManufacturedDividendPaymentAmount}</li>
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
	public static final MMBusinessAttribute ManufacturedDividendAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.ManufacturedDividendAmount, com.tools20022.repository.msg.CorporateActionAmounts5.ManufacturedDividendAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts12.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts20.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts24.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.ManufacturedDividendAmount, com.tools20022.repository.msg.CorporateActionAmounts6.ManufacturedDividendAmount,
					com.tools20022.repository.msg.CorporateActionAmounts9.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts13.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts19.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts25.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts4.ManufacturedDividendAmount, com.tools20022.repository.msg.CorporateActionAmounts7.ManufacturedDividendAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts14.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts18.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts21.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts26.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts1.ManufacturedDividendAmount, com.tools20022.repository.msg.CorporateActionAmounts29.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts28.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts32.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts37.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts38.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts39.ManufacturedDividendPaymentAmount, com.tools20022.repository.msg.CorporateActionAmounts41.ManufacturedDividendPaymentAmount,
					com.tools20022.repository.msg.CorporateActionAmounts40.ManufacturedDividendPaymentAmount);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManufacturedDividendAmount";
			definition = "Amount of money that the borrower pays to the lender as a compensation. It does not entitle the lender to reclaim any tax credit and is sometimes treated differently by the local tax authorities of the lender.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount resulting from an unfranked dividend paid by a company; the amount
	 * does not include tax credit and is subject to withholding tax.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#UnfrankedAmount
	 * CorporateActionAmounts2.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#UnfrankedAmount
	 * CorporateActionAmounts5.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#UnfrankedAmount
	 * CorporateActionAmounts11.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#UnfrankedAmount
	 * CorporateActionAmounts12.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#UnfrankedAmount
	 * CorporateActionAmounts17.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#UnfrankedAmount
	 * CorporateActionAmounts20.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#UnfrankedAmount
	 * CorporateActionAmounts23.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#UnfrankedAmount
	 * CorporateActionAmounts24.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#UnfrankedAmount
	 * CorporateActionAmounts3.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#UnfrankedAmount
	 * CorporateActionAmounts6.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#UnfrankedAmount
	 * CorporateActionAmounts9.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#UnfrankedAmount
	 * CorporateActionAmounts13.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#UnfrankedAmount
	 * CorporateActionAmounts16.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#UnfrankedAmount
	 * CorporateActionAmounts19.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#UnfrankedAmount
	 * CorporateActionAmounts22.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#UnfrankedAmount
	 * CorporateActionAmounts25.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#UnfrankedAmount
	 * CorporateActionAmounts4.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#UnfrankedAmount
	 * CorporateActionAmounts7.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#UnfrankedAmount
	 * CorporateActionAmounts10.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#UnfrankedAmount
	 * CorporateActionAmounts14.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#UnfrankedAmount
	 * CorporateActionAmounts15.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#UnfrankedAmount
	 * CorporateActionAmounts18.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#UnfrankedAmount
	 * CorporateActionAmounts21.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#UnfrankedAmount
	 * CorporateActionAmounts26.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#UnfrankedAmount
	 * CorporateActionAmounts1.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#UnfrankedAmount
	 * CorporateActionAmounts29.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#UnfrankedAmount
	 * CorporateActionAmounts27.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#UnfrankedAmount
	 * CorporateActionAmounts28.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#UnfrankedAmount
	 * CorporateActionAmounts33.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#UnfrankedAmount
	 * CorporateActionAmounts32.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#UnfrankedAmount
	 * CorporateActionAmounts35.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#UnfrankedAmount
	 * CorporateActionAmounts37.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#UnfrankedAmount
	 * CorporateActionAmounts36.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#UnfrankedAmount
	 * CorporateActionAmounts38.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#UnfrankedAmount
	 * CorporateActionAmounts39.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#UnfrankedAmount
	 * CorporateActionAmounts41.UnfrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#UnfrankedAmount
	 * CorporateActionAmounts40.UnfrankedAmount}</li>
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
	public static final MMBusinessAttribute UnfrankedAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts5.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts12.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts17.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts20.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts23.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts24.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts3.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts6.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts9.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts13.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts16.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts19.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts22.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts25.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts4.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts10.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts14.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts15.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts18.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts21.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts1.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts29.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts28.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts33.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts32.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts35.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts37.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts38.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts39.UnfrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.UnfrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts40.UnfrankedAmount);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnfrankedAmount";
			definition = "Amount resulting from an unfranked dividend paid by a company; the amount does not include tax credit and is subject to withholding tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of cash that would have been payable if the dividend had been
	 * taken in the form of cash rather than shares.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#NotionalDividendPayableAmount
	 * CorporateActionAmounts2.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#NotionalDividendPayableAmount
	 * CorporateActionAmounts5.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#NotionalDividendPayableAmount
	 * CorporateActionAmounts11.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#NotionalDividendPayableAmount
	 * CorporateActionAmounts12.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#NotionalDividendPayableAmount
	 * CorporateActionAmounts17.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#NotionalDividendPayableAmount
	 * CorporateActionAmounts20.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#NotionalDividendPayableAmount
	 * CorporateActionAmounts23.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#NotionalDividendPayableAmount
	 * CorporateActionAmounts24.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#NotionalDividendPayableAmount
	 * CorporateActionAmounts29.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#NotionalDividendPayableAmount
	 * CorporateActionAmounts35.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#NotionalDividendPayableAmount
	 * CorporateActionAmounts37.NotionalDividendPayableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#NotionalDividendPayableAmount
	 * CorporateActionAmounts39.NotionalDividendPayableAmount}</li>
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
	public static final MMBusinessAttribute NotionalDividendPayableAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionAmounts2.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts5.NotionalDividendPayableAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts12.NotionalDividendPayableAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts20.NotionalDividendPayableAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts24.NotionalDividendPayableAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts35.NotionalDividendPayableAmount,
					com.tools20022.repository.msg.CorporateActionAmounts37.NotionalDividendPayableAmount, com.tools20022.repository.msg.CorporateActionAmounts39.NotionalDividendPayableAmount);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotionalDividendPayableAmount";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Planned dividend rate, for example, for preferred shares.
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
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#NonResidentRate
	 * RateDetails2.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#NonResidentRate
	 * RateDetails4.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#NonResidentRate
	 * RateDetails7.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#NonResidentRate
	 * RateDetails9.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#NonResidentRate
	 * RateDetails11.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#NonResidentRate
	 * RateDetails12.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#NonResidentRate
	 * RateDetails3.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#NonResidentRate
	 * RateDetails5.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#NonResidentRate
	 * RateDetails10.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#NonResidentRate
	 * RateDetails13.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancing10#DividendRatio
	 * SecuritiesFinancing10.DividendRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#NonResidentRate
	 * RateDetails15.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#NonResidentRate
	 * RateDetails14.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#NonResidentRate
	 * RateDetails18.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#NonResidentRate
	 * RateDetails21.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#NonResidentRate
	 * RateDetails23.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#NonResidentRate
	 * RateDetails22.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#NonResidentRate
	 * RateDetails24.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#NonResidentRate
	 * RateDetails25.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#NonResidentRate
	 * RateDetails26.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#NonResidentRate
	 * RateDetails27.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#NonResidentRate
	 * RateDetails28.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#NonResidentRate
	 * RateDetails30.NonResidentRate}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateDetails2.NonResidentRate, com.tools20022.repository.msg.RateDetails4.NonResidentRate, com.tools20022.repository.msg.RateDetails7.NonResidentRate,
					com.tools20022.repository.msg.RateDetails9.NonResidentRate, com.tools20022.repository.msg.RateDetails11.NonResidentRate, com.tools20022.repository.msg.RateDetails12.NonResidentRate,
					com.tools20022.repository.msg.RateDetails3.NonResidentRate, com.tools20022.repository.msg.RateDetails5.NonResidentRate, com.tools20022.repository.msg.RateDetails10.NonResidentRate,
					com.tools20022.repository.msg.RateDetails13.NonResidentRate, com.tools20022.repository.msg.SecuritiesFinancing10.DividendRatio, com.tools20022.repository.msg.RateDetails15.NonResidentRate,
					com.tools20022.repository.msg.RateDetails14.NonResidentRate, com.tools20022.repository.msg.RateDetails18.NonResidentRate, com.tools20022.repository.msg.RateDetails21.NonResidentRate,
					com.tools20022.repository.msg.RateDetails23.NonResidentRate, com.tools20022.repository.msg.RateDetails22.NonResidentRate, com.tools20022.repository.msg.RateDetails24.NonResidentRate,
					com.tools20022.repository.msg.RateDetails25.NonResidentRate, com.tools20022.repository.msg.RateDetails26.NonResidentRate, com.tools20022.repository.msg.RateDetails27.NonResidentRate,
					com.tools20022.repository.msg.RateDetails28.NonResidentRate, com.tools20022.repository.msg.RateDetails30.NonResidentRate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Planned dividend rate, for example, for preferred shares.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date/time as from which trading (including exchange and OTC trading)
	 * occurs on the underlying security without the benefit.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate1#ExDividendDate
	 * CorporateActionDate1.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate13#ExDividendDate
	 * CorporateActionDate13.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate14#ExDividendDate
	 * CorporateActionDate14.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate21#ExDividendDate
	 * CorporateActionDate21.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate22#ExDividendDate
	 * CorporateActionDate22.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate25#ExDividendDate
	 * CorporateActionDate25.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate27#ExDividendDate
	 * CorporateActionDate27.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate28#ExDividendDate
	 * CorporateActionDate28.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate2#ExDividendDate
	 * CorporateActionDate2.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate30#ExDividendDate
	 * CorporateActionDate30.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate34#ExDividendDate
	 * CorporateActionDate34.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate41#ExDividendDate
	 * CorporateActionDate41.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate43#ExDividendDate
	 * CorporateActionDate43.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate49#ExDividendDate
	 * CorporateActionDate49.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate45#ExDividendDate
	 * CorporateActionDate45.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#ExDividendDate
	 * CorporateActionDate44.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate54#ExDividendDate
	 * CorporateActionDate54.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate50#ExDividendDate
	 * CorporateActionDate50.ExDividendDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate58#ExDividendDate
	 * CorporateActionDate58.ExDividendDate}</li>
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
	public static final MMBusinessAttribute ExDividendDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDate1.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate13.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate14.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate21.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate22.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate25.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate27.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate28.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate2.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate30.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate34.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate41.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate43.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate49.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate45.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate44.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate54.ExDividendDate,
					com.tools20022.repository.msg.CorporateActionDate50.ExDividendDate, com.tools20022.repository.msg.CorporateActionDate58.ExDividendDate);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExDividendDate";
			definition = "Date/time as from which trading (including exchange and OTC trading) occurs on the underlying security without the benefit.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Security for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#Dividend
	 * Security.Dividend}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security for which a dividend is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Nature of the dividend.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat1Choice#Code
	 * DividendTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat1Choice#Proprietary
	 * DividendTypeFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat2Choice#Code
	 * DividendTypeFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat2Choice#Proprietary
	 * DividendTypeFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice#Code
	 * DividendTypeFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat3Choice#Proprietary
	 * DividendTypeFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#DividendType
	 * CorporateAction5.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat4Choice#Code
	 * DividendTypeFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat4Choice#Proprietary
	 * DividendTypeFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#DividendType
	 * CorporateAction6.DividendType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat5Choice#Code
	 * DividendTypeFormat5Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat5Choice#Proprietary
	 * DividendTypeFormat5Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat8Choice#Code
	 * DividendTypeFormat8Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat8Choice#Proprietary
	 * DividendTypeFormat8Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice#Code
	 * DividendTypeFormat9Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat9Choice#Proprietary
	 * DividendTypeFormat9Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice#Code
	 * DividendTypeFormat10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.DividendTypeFormat10Choice#Proprietary
	 * DividendTypeFormat10Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.DividendTypeFormat1Choice.Code, com.tools20022.repository.choice.DividendTypeFormat1Choice.Proprietary,
					com.tools20022.repository.choice.DividendTypeFormat2Choice.Code, com.tools20022.repository.choice.DividendTypeFormat2Choice.Proprietary, com.tools20022.repository.choice.DividendTypeFormat3Choice.Code,
					com.tools20022.repository.choice.DividendTypeFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction5.DividendType, com.tools20022.repository.choice.DividendTypeFormat4Choice.Code,
					com.tools20022.repository.choice.DividendTypeFormat4Choice.Proprietary, com.tools20022.repository.msg.CorporateAction6.DividendType, com.tools20022.repository.choice.DividendTypeFormat5Choice.Code,
					com.tools20022.repository.choice.DividendTypeFormat5Choice.Proprietary, com.tools20022.repository.choice.DividendTypeFormat8Choice.Code, com.tools20022.repository.choice.DividendTypeFormat8Choice.Proprietary,
					com.tools20022.repository.choice.DividendTypeFormat9Choice.Code, com.tools20022.repository.choice.DividendTypeFormat9Choice.Proprietary, com.tools20022.repository.choice.DividendTypeFormat10Choice.Code,
					com.tools20022.repository.choice.DividendTypeFormat10Choice.Proprietary);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Nature of the dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> DividendTypeCode.mmObject();
		}
	};
	/**
	 * Defines the proceeds which resulted in dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#Dividend
	 * CashProceedsDefinition.Dividend}</li>
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
	public static final MMBusinessAssociationEnd CashProceeds = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashProceeds";
			definition = "Defines the proceeds which resulted in dividends.";
			minOccurs = 0;
			type_lazy = () -> CashProceedsDefinition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashProceedsDefinition.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the payment terms of the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#Dividend
	 * PaymentObligation.Dividend}</li>
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
	 * definition} = "Specifies the  payment terms of the dividend."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Obligation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Obligation";
			definition = "Specifies the  payment terms of the dividend.";
			minOccurs = 0;
			type_lazy = () -> PaymentObligation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentObligation.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax on dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Tax#Dividend
	 * Tax.Dividend}</li>
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
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax on dividend.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Distribution for which a dividend is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#Dividend
	 * Distribution.Dividend}</li>
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
	public static final MMBusinessAssociationEnd RelatedDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedDistribution";
			definition = "Distribution for which a dividend is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.Dividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the cycle of dividends.
	 * <p>
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
	public static final MMBusinessAttribute DividendFrequenceType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendFrequenceType";
			definition = "Specifies the cycle of dividends.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
		}
	};
	/**
	 * Percentage of earnings paid to shareholders in dividends.
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
	public static final MMBusinessAttribute DividendRatio = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DividendRatio";
			definition = "Percentage of earnings paid to shareholders in dividends.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Date upon which the dividend is paid.
	 * <p>
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
	public static final MMBusinessAttribute PaymentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentDate";
			definition = "Date upon which the dividend is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Specifies the cycle of dividend payments.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.Debt1#PaymentFrequency
	 * Debt1.PaymentFrequency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Debt2#PaymentFrequency
	 * Debt2.PaymentFrequency}</li>
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
	public static final MMBusinessAttribute PaymentFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Debt1.PaymentFrequency, com.tools20022.repository.msg.Debt2.PaymentFrequency);
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentFrequency";
			definition = "Specifies the cycle of dividend payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Date upon which the dividend is reinvested.
	 * <p>
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
	public static final MMBusinessAttribute ReinvestmentDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentDate";
			definition = "Date upon which the dividend is reinvested.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Value of the dividend expressed as an amount.
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
	public static final MMBusinessAttribute Value = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Dividend.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Value";
			definition = "Value of the dividend expressed as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Dividend";
				definition = "Distribution of earnings to shareholders, paid for in cash, stock, scrip issue or, rarely, in kind, for example, in company products or property. The dividend amount is decided by the board of directors.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.Dividend, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.PaymentObligation.Dividend,
						com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.NetDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.CashProceedsDefinition.Dividend, com.tools20022.repository.entity.Distribution.Dividend);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GrossDividendRate1Choice.RateTypeAmount, com.tools20022.repository.choice.NetDividendRate1Choice.RateTypeAmount,
						com.tools20022.repository.msg.TaxVoucher1.NotionalDividendPayable);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.DividendFrequency, com.tools20022.repository.entity.Dividend.AnnualTotalDividendRate, com.tools20022.repository.entity.Dividend.FinalDividend,
						com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount, com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.RateType,
						com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend, com.tools20022.repository.entity.Dividend.DividendRankingDate,
						com.tools20022.repository.entity.Dividend.ManufacturedDividendAmount, com.tools20022.repository.entity.Dividend.UnfrankedAmount, com.tools20022.repository.entity.Dividend.NotionalDividendPayableAmount,
						com.tools20022.repository.entity.Dividend.Rate, com.tools20022.repository.entity.Dividend.ExDividendDate, com.tools20022.repository.entity.Dividend.Security, com.tools20022.repository.entity.Dividend.Type,
						com.tools20022.repository.entity.Dividend.CashProceeds, com.tools20022.repository.entity.Dividend.Obligation, com.tools20022.repository.entity.Dividend.Tax,
						com.tools20022.repository.entity.Dividend.RelatedDistribution, com.tools20022.repository.entity.Dividend.DividendFrequenceType, com.tools20022.repository.entity.Dividend.DividendRatio,
						com.tools20022.repository.entity.Dividend.PaymentDate, com.tools20022.repository.entity.Dividend.PaymentFrequency, com.tools20022.repository.entity.Dividend.ReinvestmentDate,
						com.tools20022.repository.entity.Dividend.Value);
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
						NetDividendRateFormat27Choice.mmObject(), GrossDividendRateFormat25Choice.mmObject(), DividendTypeFormat10Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}