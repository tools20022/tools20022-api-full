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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTax" src="doc-files/SecuritiesTax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShare
 * SecuritiesTax.mmTaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerShareCalculated
 * SecuritiesTax.mmTaxableIncomePerShareCalculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
 * SecuritiesTax.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUDividendStatus
 * SecuritiesTax.mmEUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividend
 * SecuritiesTax.mmTaxableIncomePerDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyType
 * SecuritiesTax.mmStampDutyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmStampDutyTaxBasis
 * SecuritiesTax.mmStampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxVoucher
 * SecuritiesTax.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxableIncomePerDividendShare
 * SecuritiesTax.mmTaxableIncomePerDividendShare}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmRelatedTax
 * SecuritiesTax.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxLotNumber
 * SecuritiesTax.mmTaxLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmSecurity
 * SecuritiesTax.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTaxRuleExemptIndicator
 * SecuritiesTax.mmTaxRuleExemptIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEffectivePeriod
 * SecuritiesTax.mmEffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmFrankedRate
 * SecuritiesTax.mmFrankedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#mmTEFRARule
 * SecuritiesTax.mmTEFRARule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmJurisdiction
 * SecuritiesTax.mmJurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
 * Security.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
 * TaxVoucher.mmRelatedSecurityTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
 * RateAndAmount.mmSecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
 * Jurisdiction.mmRelatedSecuritiesTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice#mmRateTypeAndRate
 * RateAndAmountFormat21Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice#mmRateTypeAndRate
 * RateAndAmountFormat35Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice#mmRateTypeAndRate
 * RateAndAmountFormat32Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#mmRateTypeAndRate
 * RateAndAmountFormat40Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice#mmRateTypeAndRate
 * RateAndAmountFormat45Choice.mmRateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmInformativeTaxDetails
 * SubscriptionExecution13.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmInformativeTaxDetails
 * SubscriptionExecution12.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativeTaxDetails
 * RedemptionExecution16.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmInformativeTaxDetails
 * SwitchSubscriptionLegExecution4.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmInformativeTaxDetails
 * RedemptionExecution15.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmInformativeTaxDetails
 * SwitchRedemptionLegExecution4.mmInformativeTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxableIncomePerShareCalculated1
 * TaxableIncomePerShareCalculated1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.EUCapitalGain1 EUCapitalGain1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice
 * CapitalGainFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice
 * TaxableIncomePerShareCalculatedFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CapitalGainFormat2Choice
 * CapitalGainFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice
 * TaxableIncomePerShareCalculatedFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice
 * EUCapitalGainType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice
 * StampDutyType1FormatChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice
 * TaxableIncomePerShareCalculatedType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUDividendStatusType1Choice
 * EUDividendStatusType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUCapitalGainType1Choice
 * EUCapitalGainType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TEFRARules2Choice
 * TEFRARules2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice
 * RateAndAmountFormat21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice
 * RateAndAmountFormat35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice
 * RateAndAmountFormat32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice
 * RateAndAmountFormat40Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice
 * TaxableIncomePerShareCalculatedFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice
 * CapitalGainFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice
 * CapitalGainFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice
 * RateAndAmountFormat45Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice
 * TaxableIncomePerShareCalculatedFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InformativeTax1
 * InformativeTax1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice
 * EUCapitalGain3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice
 * EUDividendStatusType2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice
 * TaxableIncomePerShareCalculated2Choice}</li>
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
 * "SecuritiesTax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class SecuritiesTax extends Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount taxableIncomePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxableIncomePerShare
	 * UnitPrice6.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShare
	 * UnitPrice15.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice3#mmTaxableIncomePerShare
	 * UnitPrice3.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#mmTaxableIncomePerShare
	 * UnitPrice12.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#mmTaxableIncomePerShare
	 * FinancialInstrumentAttributes31.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#mmTaxableIncomePerShare
	 * FinancialInstrumentAttributes44.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmTaxableIncomePerShare
	 * UnitPrice5.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmTaxableIncomePerShare
	 * UnitPrice10.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice16#mmTaxableIncomePerShare
	 * UnitPrice16.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice17#mmTaxableIncomePerShare
	 * UnitPrice17.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#mmTaxableIncomePerShare
	 * UnitPrice21.mmTaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShare
	 * UnitPrice22.mmTaxableIncomePerShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmTaxableIncomePerShare, UnitPrice15.mmTaxableIncomePerShare, UnitPrice3.mmTaxableIncomePerShare, UnitPrice12.mmTaxableIncomePerShare,
					FinancialInstrumentAttributes31.mmTaxableIncomePerShare, FinancialInstrumentAttributes44.mmTaxableIncomePerShare, UnitPrice5.mmTaxableIncomePerShare, UnitPrice10.mmTaxableIncomePerShare,
					UnitPrice16.mmTaxableIncomePerShare, UnitPrice17.mmTaxableIncomePerShare, UnitPrice21.mmTaxableIncomePerShare, UnitPrice22.mmTaxableIncomePerShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerShare", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxableIncomePerShareCalculatedCode
	 * TaxableIncomePerShareCalculatedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxableIncomePerShareCalculated1#mmStructured
	 * TaxableIncomePerShareCalculated1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxableIncomePerShareCalculated
	 * UnitPrice6.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerShareCalculated
	 * UnitPrice15.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedTaxableIncomePerShareCalculated
	 * UnitPrice15.mmExtendedTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice#mmCode
	 * TaxableIncomePerShareCalculatedFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmTaxableIncomePerShareCalculated
	 * CorporateAction3.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice#mmCode
	 * TaxableIncomePerShareCalculatedFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmTaxableIncomePerShareCalculated
	 * CorporateAction4.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmTaxableIncomePerShareCalculated
	 * CorporateAction5.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmTaxableIncomePerShareCalculated
	 * CorporateAction6.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmTaxableIncomePerShareCalculated
	 * CorporateAction7.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmTaxableIncomePerShareCalculated
	 * CorporateAction8.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmTaxableIncomePerShareCalculated
	 * CorporateAction10.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmTaxableIncomePerShareCalculated
	 * CorporateAction11.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice5#mmTaxableIncomePerShareCalculated
	 * UnitPrice5.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmTaxableIncomePerShareCalculated
	 * UnitPrice10.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#mmExtendedTaxableIncomePerShareCalculated
	 * UnitPrice10.mmExtendedTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmTaxableIncomePerShareCalculated
	 * CorporateAction2.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice#mmTaxableIncomePerShareCalculated
	 * TaxableIncomePerShareCalculatedType1Choice.
	 * mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice16#mmTaxableIncomePerShareCalculated
	 * UnitPrice16.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice17#mmTaxableIncomePerShareCalculated
	 * UnitPrice17.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmTaxableIncomePerShareCalculated
	 * CorporateAction12.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmTaxableIncomePerShareCalculated
	 * CorporateAction17.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmTaxableIncomePerShareCalculated
	 * CorporateAction31.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#mmCode
	 * TaxableIncomePerShareCalculatedFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmTaxableIncomePerShareCalculated
	 * CorporateAction40.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice#mmCode
	 * TaxableIncomePerShareCalculatedFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice#mmProprietary
	 * TaxableIncomePerShareCalculatedFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#mmTaxableIncomePerShareCalculated
	 * UnitPrice22.mmTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#mmCode
	 * TaxableIncomePerShareCalculated2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#mmProprietary
	 * TaxableIncomePerShareCalculated2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerShareCalculated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the fund calculates a taxable interest per share (TIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerShareCalculated = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxableIncomePerShareCalculated1.mmStructured, UnitPrice6.mmTaxableIncomePerShareCalculated, UnitPrice15.mmTaxableIncomePerShareCalculated,
					UnitPrice15.mmExtendedTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculatedFormat1Choice.mmCode, TaxableIncomePerShareCalculatedFormat1Choice.mmProprietary, CorporateAction3.mmTaxableIncomePerShareCalculated,
					TaxableIncomePerShareCalculatedFormat2Choice.mmCode, TaxableIncomePerShareCalculatedFormat2Choice.mmProprietary, CorporateAction4.mmTaxableIncomePerShareCalculated, CorporateAction5.mmTaxableIncomePerShareCalculated,
					CorporateAction6.mmTaxableIncomePerShareCalculated, CorporateAction7.mmTaxableIncomePerShareCalculated, CorporateAction8.mmTaxableIncomePerShareCalculated, CorporateAction10.mmTaxableIncomePerShareCalculated,
					CorporateAction11.mmTaxableIncomePerShareCalculated, UnitPrice5.mmTaxableIncomePerShareCalculated, UnitPrice10.mmTaxableIncomePerShareCalculated, UnitPrice10.mmExtendedTaxableIncomePerShareCalculated,
					CorporateAction2.mmTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculatedType1Choice.mmTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculatedType1Choice.mmProprietary,
					UnitPrice16.mmTaxableIncomePerShareCalculated, UnitPrice17.mmTaxableIncomePerShareCalculated, CorporateAction12.mmTaxableIncomePerShareCalculated, CorporateAction17.mmTaxableIncomePerShareCalculated,
					CorporateAction31.mmTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculatedFormat3Choice.mmCode, TaxableIncomePerShareCalculatedFormat3Choice.mmProprietary, CorporateAction40.mmTaxableIncomePerShareCalculated,
					TaxableIncomePerShareCalculatedFormat4Choice.mmCode, TaxableIncomePerShareCalculatedFormat4Choice.mmProprietary, UnitPrice22.mmTaxableIncomePerShareCalculated, TaxableIncomePerShareCalculated2Choice.mmCode,
					TaxableIncomePerShareCalculated2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerShareCalculated", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUCapitalGainCode eUCapitalGain;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGainCode
	 * EUCapitalGainCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#mmEUCapitalGain
	 * TaxCalculationInformation2.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUCapitalGain
	 * TaxCalculationInformation4.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUCapitalGain
	 * TaxCalculationInformation4.mmExtendedEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice#mmCode
	 * CapitalGainFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice#mmProprietary
	 * CapitalGainFormat1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#mmCapitalGainInOutIndicator
	 * CorporateAction3.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat2Choice#mmCode
	 * CapitalGainFormat2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat2Choice#mmProprietary
	 * CapitalGainFormat2Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#mmCapitalGainInOutIndicator
	 * CorporateAction4.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#mmCapitalGainInOutIndicator
	 * CorporateAction5.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#mmCapitalGainInOutIndicator
	 * CorporateAction6.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#mmCapitalGainInOutIndicator
	 * CorporateAction7.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#mmCapitalGainInOutIndicator
	 * CorporateAction8.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#mmCapitalGainInOutIndicator
	 * CorporateAction10.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#mmCapitalGainInOutIndicator
	 * CorporateAction11.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#mmEUCapitalGain
	 * EUCapitalGainType2Choice.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#mmProprietary
	 * EUCapitalGainType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmCapitalGainType
	 * Order16.mmCapitalGainType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmCapitalGainType
	 * Order14.mmCapitalGainType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#mmEUCapitalGain
	 * TaxCalculationInformation3.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUCapitalGain
	 * TotalTaxes3.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUCapitalGain
	 * TotalTaxes3.mmExtendedEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#mmCapitalGain
	 * CorporateAction2.mmCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType1Choice#mmEUCapitalGain
	 * EUCapitalGainType1Choice.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType1Choice#mmProprietary
	 * EUCapitalGainType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5#mmEUCapitalGain
	 * TotalTaxes5.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#mmCapitalGainInOutIndicator
	 * CorporateAction12.mmCapitalGainInOutIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmCapitalGainType
	 * Order17.mmCapitalGainType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmCapitalGainType
	 * Order18.mmCapitalGainType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#mmCapitalGainInOutIndicator
	 * CorporateAction17.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#mmCapitalGainInOutIndicator
	 * CorporateAction31.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#mmCode
	 * CapitalGainFormat3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#mmProprietary
	 * CapitalGainFormat3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#mmCapitalGainInOutIndicator
	 * CorporateAction40.mmCapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice#mmCode
	 * CapitalGainFormat4Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice#mmProprietary
	 * CapitalGainFormat4Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmEUCapitalGain
	 * InformativeTax1.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#mmCode
	 * EUCapitalGain3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#mmProprietary
	 * EUCapitalGain3Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUCapitalGain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation2.mmEUCapitalGain, TaxCalculationInformation4.mmEUCapitalGain, TaxCalculationInformation4.mmExtendedEUCapitalGain, CapitalGainFormat1Choice.mmCode,
					CapitalGainFormat1Choice.mmProprietary, CorporateAction3.mmCapitalGainInOutIndicator, CapitalGainFormat2Choice.mmCode, CapitalGainFormat2Choice.mmProprietary, CorporateAction4.mmCapitalGainInOutIndicator,
					CorporateAction5.mmCapitalGainInOutIndicator, CorporateAction6.mmCapitalGainInOutIndicator, CorporateAction7.mmCapitalGainInOutIndicator, CorporateAction8.mmCapitalGainInOutIndicator,
					CorporateAction10.mmCapitalGainInOutIndicator, CorporateAction11.mmCapitalGainInOutIndicator, EUCapitalGainType2Choice.mmEUCapitalGain, EUCapitalGainType2Choice.mmProprietary, Order16.mmCapitalGainType,
					Order14.mmCapitalGainType, TaxCalculationInformation3.mmEUCapitalGain, TotalTaxes3.mmEUCapitalGain, TotalTaxes3.mmExtendedEUCapitalGain, CorporateAction2.mmCapitalGain, EUCapitalGainType1Choice.mmEUCapitalGain,
					EUCapitalGainType1Choice.mmProprietary, TotalTaxes5.mmEUCapitalGain, CorporateAction12.mmCapitalGainInOutIndicator, Order17.mmCapitalGainType, Order18.mmCapitalGainType, CorporateAction17.mmCapitalGainInOutIndicator,
					CorporateAction31.mmCapitalGainInOutIndicator, CapitalGainFormat3Choice.mmCode, CapitalGainFormat3Choice.mmProprietary, CorporateAction40.mmCapitalGainInOutIndicator, CapitalGainFormat4Choice.mmCode,
					CapitalGainFormat4Choice.mmProprietary, InformativeTax1.mmEUCapitalGain, EUCapitalGain3Choice.mmCode, EUCapitalGain3Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUCapitalGainCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEUCapitalGain", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected EUDividendStatusCode eUDividendStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
	 * EUDividendStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmEUDividendStatus
	 * TaxCalculationInformation4.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmExtendedEUDividendStatus
	 * TaxCalculationInformation4.mmExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmEUDividendStatus
	 * UnitPrice15.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedEUDividendStatus
	 * UnitPrice15.mmExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmEUDividendStatus
	 * TotalTaxes3.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmExtendedEUDividendStatus
	 * TotalTaxes3.mmExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType1Choice#mmEUDividendStatus
	 * EUDividendStatusType1Choice.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType1Choice#mmProprietary
	 * EUDividendStatusType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax18#mmEUDividendStatusType
	 * Tax18.mmEUDividendStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax19#mmEUDividendStatusType
	 * Tax19.mmEUDividendStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmEUDividendStatus
	 * InformativeTax1.mmEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#mmCode
	 * EUDividendStatusType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#mmProprietary
	 * EUDividendStatusType2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUDividendStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEUDividendStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmEUDividendStatus, TaxCalculationInformation4.mmExtendedEUDividendStatus, UnitPrice15.mmEUDividendStatus, UnitPrice15.mmExtendedEUDividendStatus,
					TotalTaxes3.mmEUDividendStatus, TotalTaxes3.mmExtendedEUDividendStatus, EUDividendStatusType1Choice.mmEUDividendStatus, EUDividendStatusType1Choice.mmProprietary, Tax18.mmEUDividendStatusType,
					Tax19.mmEUDividendStatusType, InformativeTax1.mmEUDividendStatus, EUDividendStatusType2Choice.mmCode, EUDividendStatusType2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EUDividendStatusCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEUDividendStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount taxableIncomePerDividend;
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#mmTaxableIncomePerDividend
	 * TaxCalculationInformation4.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxableIncomePerDividend
	 * UnitPrice15.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#mmTaxableIncomePerDividend
	 * TotalTaxes3.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#mmTaxableIncomePerDividend
	 * TotalTaxes4.mmTaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#mmTaxableIncomePerDividend
	 * InformativeTax1.mmTaxableIncomePerDividend}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerDividend = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TaxCalculationInformation4.mmTaxableIncomePerDividend, UnitPrice15.mmTaxableIncomePerDividend, TotalTaxes3.mmTaxableIncomePerDividend, TotalTaxes4.mmTaxableIncomePerDividend,
					InformativeTax1.mmTaxableIncomePerDividend);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerDividend", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StampDutyTypeCode stampDutyType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.StampDutyTypeCode
	 * StampDutyTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#mmStampDuty
	 * DeliverInformation7.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#mmStampDuty
	 * ReceiveInformation8.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#mmStampDuty
	 * ReceiveInformation6.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#mmStampDuty
	 * ReceiveInformation11.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#mmStampDuty
	 * DeliverInformation11.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#mmStampDuty
	 * DeliverInformation8.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#mmStampDuty
	 * ReceiveInformation7.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#mmStampDuty
	 * ReceiveInformation5.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#mmStampDuty
	 * ReceiveInformation9.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#mmStampDuty
	 * DeliverInformation5.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#mmStampDuty
	 * DeliverInformation9.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#mmStampDuty
	 * DeliverInformation6.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#mmCode
	 * StampDutyType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#mmProprietary
	 * StampDutyType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#mmStampDuty
	 * ReceiveInformation13.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#mmStampDuty
	 * ReceiveInformation12.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#mmStampDuty
	 * DeliverInformation12.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#mmStampDuty
	 * DeliverInformation13.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#mmStampDuty
	 * DeliverInformation15.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#mmStampDuty
	 * DeliverInformation14.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#mmStampDuty
	 * ReceiveInformation15.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#mmStampDuty
	 * ReceiveInformation14.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#mmStampDuty
	 * ReceiveInformation17.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#mmStampDuty
	 * ReceiveInformation16.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#mmStampDuty
	 * DeliverInformation16.mmStampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#mmStampDuty
	 * DeliverInformation17.mmStampDuty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates how the stamp duty should be applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(DeliverInformation7.mmStampDuty, ReceiveInformation8.mmStampDuty, ReceiveInformation6.mmStampDuty, ReceiveInformation11.mmStampDuty, DeliverInformation11.mmStampDuty,
					DeliverInformation8.mmStampDuty, ReceiveInformation7.mmStampDuty, ReceiveInformation5.mmStampDuty, ReceiveInformation9.mmStampDuty, DeliverInformation5.mmStampDuty, DeliverInformation9.mmStampDuty,
					DeliverInformation6.mmStampDuty, StampDutyType1FormatChoice.mmCode, StampDutyType1FormatChoice.mmProprietary, ReceiveInformation13.mmStampDuty, ReceiveInformation12.mmStampDuty, DeliverInformation12.mmStampDuty,
					DeliverInformation13.mmStampDuty, DeliverInformation15.mmStampDuty, DeliverInformation14.mmStampDuty, ReceiveInformation15.mmStampDuty, ReceiveInformation14.mmStampDuty, ReceiveInformation17.mmStampDuty,
					ReceiveInformation16.mmStampDuty, DeliverInformation16.mmStampDuty, DeliverInformation17.mmStampDuty);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyType";
			definition = "Indicates how the stamp duty should be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> StampDutyTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getStampDutyType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max4AlphaNumericText stampDutyTaxBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max4AlphaNumericText
	 * Max4AlphaNumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#mmStampDutyTaxBasis
	 * SettlementDetails50.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#mmStampDutyTaxBasis
	 * SettlementDetails51.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#mmStampDutyTaxBasis
	 * SettlementDetails9.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#mmStampDutyTaxBasis
	 * SettlementDetails17.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#mmStampDutyTaxBasis
	 * SettlementDetails30.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#mmStampDutyTaxBasis
	 * SettlementDetails32.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#mmStampDutyTaxBasis
	 * SettlementDetails60.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#mmStampDutyTaxBasis
	 * SettlementDetails64.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#mmStampDutyTaxBasis
	 * SettlementDetails3.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#mmStampDutyTaxBasis
	 * SettlementDetails16.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#mmStampDutyTaxBasis
	 * SettlementDetails31.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#mmStampDutyTaxBasis
	 * SettlementDetails40.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#mmStampDutyTaxBasis
	 * SettlementDetails62.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#mmStampDutyTaxBasis
	 * SettlementDetails63.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#mmStampDutyTaxBasis
	 * SettlementDetails6.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#mmStampDutyTaxBasis
	 * SettlementDetails20.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#mmStampDutyTaxBasis
	 * SettlementDetails24.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#mmStampDutyTaxBasis
	 * SettlementDetails33.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#mmStampDutyTaxBasis
	 * SettlementDetails45.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#mmStampDutyTaxBasis
	 * SettlementDetails54.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#mmStampDutyTaxBasis
	 * SettlementDetails1.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#mmStampDutyTaxBasis
	 * SettlementDetails19.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#mmStampDutyTaxBasis
	 * SettlementDetails22.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#mmStampDutyTaxBasis
	 * SettlementDetails35.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#mmStampDutyTaxBasis
	 * SettlementDetails42.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#mmStampDutyTaxBasis
	 * SettlementDetails52.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#mmStampDutyTaxBasis
	 * SettlementDetails8.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#mmStampDutyTaxBasis
	 * SettlementDetails11.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#mmStampDutyTaxBasis
	 * SettlementDetails23.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#mmStampDutyTaxBasis
	 * SettlementDetails37.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#mmStampDutyTaxBasis
	 * SettlementDetails44.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#mmStampDutyTaxBasis
	 * SettlementDetails53.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#mmStampDutyTaxBasis
	 * SettlementDetails7.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#mmStampDutyTaxBasis
	 * SettlementDetails12.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#mmStampDutyTaxBasis
	 * SettlementDetails28.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#mmStampDutyTaxBasis
	 * SettlementDetails38.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#mmStampDutyTaxBasis
	 * SettlementDetails47.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#mmStampDutyTaxBasis
	 * SettlementDetails56.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#mmStampDutyTaxBasis
	 * SettlementDetails2.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#mmStampDutyTaxBasis
	 * SettlementDetails13.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#mmStampDutyTaxBasis
	 * SettlementDetails27.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#mmStampDutyTaxBasis
	 * SettlementDetails39.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#mmStampDutyTaxBasis
	 * SettlementDetails48.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#mmStampDutyTaxBasis
	 * SettlementDetails57.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#mmStampDutyTaxBasis
	 * SettlementDetails43.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#mmStampDutyTaxBasis
	 * SettlementDetails4.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#mmStampDutyTaxBasis
	 * SettlementDetails10.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#mmStampDutyTaxBasis
	 * SettlementDetails29.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#mmStampDutyTaxBasis
	 * SettlementDetails5.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#mmStampDutyTaxBasis
	 * SettlementDetails25.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#mmStampDutyTaxBasis
	 * SettlementDetails26.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#mmStampDutyTaxBasis
	 * SettlementDetails65.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#mmStampDutyTaxBasis
	 * SettlementDetails14.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#mmStampDutyTaxBasis
	 * SettlementDetails41.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#mmStampDutyTaxBasis
	 * SettlementDetails61.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#mmStampDutyTaxBasis
	 * SettlementDetails59.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#mmStampDutyTaxBasis
	 * SettlementDetails15.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#mmStampDutyTaxBasis
	 * SettlementDetails34.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#mmStampDutyTaxBasis
	 * SettlementDetails49.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#mmStampDutyTaxBasis
	 * SettlementDetails58.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#mmStampDutyTaxBasis
	 * SettlementDetails36.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#mmStampDutyTaxBasis
	 * SettlementDetails18.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#mmStampDutyTaxBasis
	 * SettlementDetails66.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#mmStampDutyTaxBasis
	 * SettlementDetails67.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#mmStampDutyTaxBasis
	 * SettlementDetails70.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#mmStampDutyTaxBasis
	 * SettlementDetails68.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#mmStampDutyTaxBasis
	 * SettlementDetails69.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#mmStampDutyTaxBasis
	 * SettlementDetails71.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#mmStampDutyTaxBasis
	 * SettlementDetails72.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#mmStampDutyTaxBasis
	 * SettlementDetails75.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#mmStampDutyTaxBasis
	 * SettlementDetails73.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#mmStampDutyTaxBasis
	 * SettlementDetails74.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#mmStampDutyTaxBasis
	 * SettlementDetails81.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#mmStampDutyTaxBasis
	 * SettlementDetails76.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#mmStampDutyTaxBasis
	 * SettlementDetails80.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#mmStampDutyTaxBasis
	 * SettlementDetails78.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#mmStampDutyTaxBasis
	 * SettlementDetails77.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#mmStampDutyTaxBasis
	 * SettlementDetails79.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#mmStampDutyTaxBasis
	 * SettlementDetails87.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#mmStampDutyTaxBasis
	 * SettlementDetails83.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#mmStampDutyTaxBasis
	 * SettlementDetails86.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#mmStampDutyTaxBasis
	 * SettlementDetails85.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#mmStampDutyTaxBasis
	 * SettlementDetails93.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#mmStampDutyTaxBasis
	 * SettlementDetails90.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#mmStampDutyTaxBasis
	 * SettlementDetails96.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#mmStampDutyTaxBasis
	 * SettlementDetails97.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#mmStampDutyTaxBasis
	 * SettlementDetails99.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#mmStampDutyTaxBasis
	 * SettlementDetails94.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#mmStampDutyTaxBasis
	 * SettlementDetails100.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#mmStampDutyTaxBasis
	 * SettlementDetails95.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#mmStampDutyTaxBasis
	 * SettlementDetails91.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#mmStampDutyTaxBasis
	 * SettlementDetails92.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#mmStampDutyTaxBasis
	 * SettlementDetails98.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#mmStampDutyTaxBasis
	 * SettlementDetails101.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#mmStampDutyTaxBasis
	 * SettlementDetails105.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#mmStampDutyTaxBasis
	 * SettlementDetails106.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#mmStampDutyTaxBasis
	 * SettlementDetails104.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#mmStampDutyTaxBasis
	 * SettlementDetails111.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#mmStampDutyTaxBasis
	 * SettlementDetails112.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#mmStampDutyTaxBasis
	 * SettlementDetails110.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#mmStampDutyTaxBasis
	 * SettlementDetails108.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#mmStampDutyTaxBasis
	 * SettlementDetails103.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#mmStampDutyTaxBasis
	 * SettlementDetails107.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#mmStampDutyTaxBasis
	 * SettlementDetails115.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#mmStampDutyTaxBasis
	 * SettlementDetails117.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#mmStampDutyTaxBasis
	 * SettlementDetails116.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#mmStampDutyTaxBasis
	 * SettlementDetails113.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#mmStampDutyTaxBasis
	 * SettlementDetails128.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#mmStampDutyTaxBasis
	 * SettlementDetails120.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#mmStampDutyTaxBasis
	 * SettlementDetails119.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#mmStampDutyTaxBasis
	 * SettlementDetails125.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#mmStampDutyTaxBasis
	 * SettlementDetails126.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#mmStampDutyTaxBasis
	 * SettlementDetails122.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#mmStampDutyTaxBasis
	 * SettlementDetails127.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#mmStampDutyTaxBasis
	 * SettlementDetails121.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#mmStampDutyTaxBasis
	 * SettlementDetails134.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#mmStampDutyTaxBasis
	 * SettlementDetails137.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#mmStampDutyTaxBasis
	 * SettlementDetails132.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#mmStampDutyTaxBasis
	 * SettlementDetails138.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#mmStampDutyTaxBasis
	 * SettlementDetails130.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#mmStampDutyTaxBasis
	 * SettlementDetails131.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#mmStampDutyTaxBasis
	 * SettlementDetails133.mmStampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#mmStampDutyTaxBasis
	 * SettlementDetails139.mmStampDutyTaxBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::STAM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStampDutyTaxBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SettlementDetails50.mmStampDutyTaxBasis, SettlementDetails51.mmStampDutyTaxBasis, SettlementDetails9.mmStampDutyTaxBasis, SettlementDetails17.mmStampDutyTaxBasis,
					SettlementDetails30.mmStampDutyTaxBasis, SettlementDetails32.mmStampDutyTaxBasis, SettlementDetails60.mmStampDutyTaxBasis, SettlementDetails64.mmStampDutyTaxBasis, SettlementDetails3.mmStampDutyTaxBasis,
					SettlementDetails16.mmStampDutyTaxBasis, SettlementDetails31.mmStampDutyTaxBasis, SettlementDetails40.mmStampDutyTaxBasis, SettlementDetails62.mmStampDutyTaxBasis, SettlementDetails63.mmStampDutyTaxBasis,
					SettlementDetails6.mmStampDutyTaxBasis, SettlementDetails20.mmStampDutyTaxBasis, SettlementDetails24.mmStampDutyTaxBasis, SettlementDetails33.mmStampDutyTaxBasis, SettlementDetails45.mmStampDutyTaxBasis,
					SettlementDetails54.mmStampDutyTaxBasis, SettlementDetails1.mmStampDutyTaxBasis, SettlementDetails19.mmStampDutyTaxBasis, SettlementDetails22.mmStampDutyTaxBasis, SettlementDetails35.mmStampDutyTaxBasis,
					SettlementDetails42.mmStampDutyTaxBasis, SettlementDetails52.mmStampDutyTaxBasis, SettlementDetails8.mmStampDutyTaxBasis, SettlementDetails11.mmStampDutyTaxBasis, SettlementDetails23.mmStampDutyTaxBasis,
					SettlementDetails37.mmStampDutyTaxBasis, SettlementDetails44.mmStampDutyTaxBasis, SettlementDetails53.mmStampDutyTaxBasis, SettlementDetails7.mmStampDutyTaxBasis, SettlementDetails12.mmStampDutyTaxBasis,
					SettlementDetails28.mmStampDutyTaxBasis, SettlementDetails38.mmStampDutyTaxBasis, SettlementDetails47.mmStampDutyTaxBasis, SettlementDetails56.mmStampDutyTaxBasis, SettlementDetails2.mmStampDutyTaxBasis,
					SettlementDetails13.mmStampDutyTaxBasis, SettlementDetails27.mmStampDutyTaxBasis, SettlementDetails39.mmStampDutyTaxBasis, SettlementDetails48.mmStampDutyTaxBasis, SettlementDetails57.mmStampDutyTaxBasis,
					SettlementDetails43.mmStampDutyTaxBasis, SettlementDetails4.mmStampDutyTaxBasis, SettlementDetails10.mmStampDutyTaxBasis, SettlementDetails29.mmStampDutyTaxBasis, SettlementDetails5.mmStampDutyTaxBasis,
					SettlementDetails25.mmStampDutyTaxBasis, SettlementDetails26.mmStampDutyTaxBasis, SettlementDetails65.mmStampDutyTaxBasis, SettlementDetails14.mmStampDutyTaxBasis, SettlementDetails41.mmStampDutyTaxBasis,
					SettlementDetails61.mmStampDutyTaxBasis, SettlementDetails59.mmStampDutyTaxBasis, SettlementDetails15.mmStampDutyTaxBasis, SettlementDetails34.mmStampDutyTaxBasis, SettlementDetails49.mmStampDutyTaxBasis,
					SettlementDetails58.mmStampDutyTaxBasis, SettlementDetails36.mmStampDutyTaxBasis, SettlementDetails18.mmStampDutyTaxBasis, SettlementDetails66.mmStampDutyTaxBasis, SettlementDetails67.mmStampDutyTaxBasis,
					SettlementDetails70.mmStampDutyTaxBasis, SettlementDetails68.mmStampDutyTaxBasis, SettlementDetails69.mmStampDutyTaxBasis, SettlementDetails71.mmStampDutyTaxBasis, SettlementDetails72.mmStampDutyTaxBasis,
					SettlementDetails75.mmStampDutyTaxBasis, SettlementDetails73.mmStampDutyTaxBasis, SettlementDetails74.mmStampDutyTaxBasis, SettlementDetails81.mmStampDutyTaxBasis, SettlementDetails76.mmStampDutyTaxBasis,
					SettlementDetails80.mmStampDutyTaxBasis, SettlementDetails78.mmStampDutyTaxBasis, SettlementDetails77.mmStampDutyTaxBasis, SettlementDetails79.mmStampDutyTaxBasis, SettlementDetails87.mmStampDutyTaxBasis,
					SettlementDetails83.mmStampDutyTaxBasis, SettlementDetails86.mmStampDutyTaxBasis, SettlementDetails85.mmStampDutyTaxBasis, SettlementDetails93.mmStampDutyTaxBasis, SettlementDetails90.mmStampDutyTaxBasis,
					SettlementDetails96.mmStampDutyTaxBasis, SettlementDetails97.mmStampDutyTaxBasis, SettlementDetails99.mmStampDutyTaxBasis, SettlementDetails94.mmStampDutyTaxBasis, SettlementDetails100.mmStampDutyTaxBasis,
					SettlementDetails95.mmStampDutyTaxBasis, SettlementDetails91.mmStampDutyTaxBasis, SettlementDetails92.mmStampDutyTaxBasis, SettlementDetails98.mmStampDutyTaxBasis, SettlementDetails101.mmStampDutyTaxBasis,
					SettlementDetails105.mmStampDutyTaxBasis, SettlementDetails106.mmStampDutyTaxBasis, SettlementDetails104.mmStampDutyTaxBasis, SettlementDetails111.mmStampDutyTaxBasis, SettlementDetails112.mmStampDutyTaxBasis,
					SettlementDetails110.mmStampDutyTaxBasis, SettlementDetails108.mmStampDutyTaxBasis, SettlementDetails103.mmStampDutyTaxBasis, SettlementDetails107.mmStampDutyTaxBasis, SettlementDetails115.mmStampDutyTaxBasis,
					SettlementDetails117.mmStampDutyTaxBasis, SettlementDetails116.mmStampDutyTaxBasis, SettlementDetails113.mmStampDutyTaxBasis, SettlementDetails128.mmStampDutyTaxBasis, SettlementDetails120.mmStampDutyTaxBasis,
					SettlementDetails119.mmStampDutyTaxBasis, SettlementDetails125.mmStampDutyTaxBasis, SettlementDetails126.mmStampDutyTaxBasis, SettlementDetails122.mmStampDutyTaxBasis, SettlementDetails127.mmStampDutyTaxBasis,
					SettlementDetails121.mmStampDutyTaxBasis, SettlementDetails134.mmStampDutyTaxBasis, SettlementDetails137.mmStampDutyTaxBasis, SettlementDetails132.mmStampDutyTaxBasis, SettlementDetails138.mmStampDutyTaxBasis,
					SettlementDetails130.mmStampDutyTaxBasis, SettlementDetails131.mmStampDutyTaxBasis, SettlementDetails133.mmStampDutyTaxBasis, SettlementDetails139.mmStampDutyTaxBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::STAM"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getStampDutyTaxBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher which is related to a securities tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher which is related to a securities tax.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxableIncomePerDividendShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice5.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice7.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmTaxableIncomePerDividendShare
	 * CorporateActionRate20.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmTaxableIncomePerDividendShare
	 * CorporateActionRate22.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmTaxableIncomePerDividendShare
	 * CorporateActionRate26.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmTaxableIncomePerDividendShare
	 * CorporateActionRate31.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmTaxableIncomePerDividendShare
	 * CorporateActionRate38.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmTaxableIncomePerDividendShare
	 * CorporateActionRate39.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice6.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice14.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmTaxableIncomePerDividendShare
	 * CorporateActionRate15.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmTaxableIncomePerDividendShare
	 * CorporateActionRate18.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmTaxableIncomePerDividendShare
	 * CorporateActionRate25.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmTaxableIncomePerDividendShare
	 * CorporateActionRate30.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmTaxableIncomePerDividendShare
	 * CorporateActionRate37.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmTaxableIncomePerDividendShare
	 * CorporateActionRate40.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmTaxableIncomePerDividendShare
	 * CorporateActionRate36.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmTaxableIncomePerDividendShare
	 * CorporateActionRate42.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#mmTaxableIncomePerDividendShare
	 * CorporateActionPrice1.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmTaxableIncomePerDividendShare
	 * CorporateActionRate46.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmTaxableIncomePerDividendShare
	 * CorporateActionRate45.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmTaxableIncomePerDividendShare
	 * CorporateActionRate44.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmTaxableIncomePerDividendShare
	 * CorporateActionRate60.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmTaxableIncomePerDividendShare
	 * CorporateActionRate64.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmTaxableIncomePerDividendShare
	 * CorporateActionRate57.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmTaxableIncomePerDividendShare
	 * CorporateActionRate68.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmTaxableIncomePerDividendShare
	 * CorporateActionRate70.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmTaxableIncomePerDividendShare
	 * CorporateActionRate67.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmTaxableIncomePerDividendShare
	 * CorporateActionRate74.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmTaxableIncomePerDividendShare
	 * CorporateActionRate79.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmTaxableIncomePerDividendShare
	 * CorporateActionRate76.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmTaxableIncomePerDividendShare
	 * CorporateActionRate82.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmTaxableIncomePerDividendShare
	 * CorporateActionRate80.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmTaxableIncomePerDividendShare
	 * CorporateActionRate81.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmTaxableIncomePerDividendShare
	 * CorporateActionRate83.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmTaxableIncomePerDividendShare
	 * CorporateActionRate84.mmTaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmTaxableIncomePerDividendShare
	 * CorporateActionRate85.mmTaxableIncomePerDividendShare}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableIncomePerDividendShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableIncomePerDividendShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPrice5.mmTaxableIncomePerDividendShare, CorporateActionPrice7.mmTaxableIncomePerDividendShare, CorporateActionRate20.mmTaxableIncomePerDividendShare,
					CorporateActionRate22.mmTaxableIncomePerDividendShare, CorporateActionRate26.mmTaxableIncomePerDividendShare, CorporateActionRate31.mmTaxableIncomePerDividendShare, CorporateActionRate38.mmTaxableIncomePerDividendShare,
					CorporateActionRate39.mmTaxableIncomePerDividendShare, CorporateActionPrice6.mmTaxableIncomePerDividendShare, CorporateActionPrice14.mmTaxableIncomePerDividendShare,
					CorporateActionRate15.mmTaxableIncomePerDividendShare, CorporateActionRate18.mmTaxableIncomePerDividendShare, CorporateActionRate25.mmTaxableIncomePerDividendShare, CorporateActionRate30.mmTaxableIncomePerDividendShare,
					CorporateActionRate37.mmTaxableIncomePerDividendShare, CorporateActionRate40.mmTaxableIncomePerDividendShare, CorporateActionRate36.mmTaxableIncomePerDividendShare, CorporateActionRate42.mmTaxableIncomePerDividendShare,
					CorporateActionPrice1.mmTaxableIncomePerDividendShare, CorporateActionRate46.mmTaxableIncomePerDividendShare, CorporateActionRate45.mmTaxableIncomePerDividendShare, CorporateActionRate44.mmTaxableIncomePerDividendShare,
					CorporateActionRate60.mmTaxableIncomePerDividendShare, CorporateActionRate64.mmTaxableIncomePerDividendShare, CorporateActionRate57.mmTaxableIncomePerDividendShare, CorporateActionRate68.mmTaxableIncomePerDividendShare,
					CorporateActionRate70.mmTaxableIncomePerDividendShare, CorporateActionRate67.mmTaxableIncomePerDividendShare, CorporateActionRate74.mmTaxableIncomePerDividendShare, CorporateActionRate79.mmTaxableIncomePerDividendShare,
					CorporateActionRate76.mmTaxableIncomePerDividendShare, CorporateActionRate82.mmTaxableIncomePerDividendShare, CorporateActionRate80.mmTaxableIncomePerDividendShare, CorporateActionRate81.mmTaxableIncomePerDividendShare,
					CorporateActionRate83.mmTaxableIncomePerDividendShare, CorporateActionRate84.mmTaxableIncomePerDividendShare, CorporateActionRate85.mmTaxableIncomePerDividendShare);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxableIncomePerDividendShare", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RateAndAmount relatedTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#mmSecuritiesTax
	 * RateAndAmount.mmSecuritiesTax}</li>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the gross dividend rate on which tax must be paid ."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RateAndAmount.mmObject();
		}
	};
	protected Max15NumericText taxLotNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#mmTaxLotNumber
	 * FinancialInstrumentAttributes1.mmTaxLotNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxLotNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentAttributes1.mmTaxLotNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxLotNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Security security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTaxDetails
	 * Security.mmTaxDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security on which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security on which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmTaxDetails;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected YesNoIndicator taxRuleExemptIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRuleExemptIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the tax rule applies within the jurisdiction as a condition of this security."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRuleExemptIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRuleExemptIndicator";
			definition = "Indicates whether the tax rule applies within the jurisdiction as a condition of this security.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTaxRuleExemptIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DateTimePeriod effectivePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectivePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the tax rule applies within the jurisdiction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEffectivePeriod = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the tax rule applies within the jurisdiction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getEffectivePeriod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate frankedRate;
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
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend for which tax is already paid."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFrankedRate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrankedRate";
			definition = "Percentage of dividend for which tax is already paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getFrankedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TEFRARulesCode tEFRARule;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TEFRARulesCode
	 * TEFRARulesCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TEFRARules2Choice#mmCode
	 * TEFRARules2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TEFRARules2Choice#mmProprietary
	 * TEFRARules2Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TEFRARule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the TEFRA rule under which the security is issued."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTEFRARule = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TEFRARules2Choice.mmCode, TEFRARules2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TEFRARulesCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTax.class.getMethod("getTEFRARule", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Jurisdiction jurisdiction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#mmRelatedSecuritiesTax
	 * Jurisdiction.mmRelatedSecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Jurisdiction
	 * Jurisdiction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Jurisdiction in which the tax rule applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmJurisdiction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction in which the tax rule applies.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmTaxDetails, com.tools20022.repository.entity.TaxVoucher.mmRelatedSecurityTax,
						com.tools20022.repository.entity.RateAndAmount.mmSecuritiesTax, com.tools20022.repository.entity.Jurisdiction.mmRelatedSecuritiesTax);
				derivationElement_lazy = () -> Arrays.asList(RateAndAmountFormat21Choice.mmRateTypeAndRate, RateAndAmountFormat35Choice.mmRateTypeAndRate, RateAndAmountFormat32Choice.mmRateTypeAndRate,
						RateAndAmountFormat40Choice.mmRateTypeAndRate, RateAndAmountFormat45Choice.mmRateTypeAndRate, SubscriptionExecution13.mmInformativeTaxDetails, SubscriptionExecution12.mmInformativeTaxDetails,
						RedemptionExecution16.mmInformativeTaxDetails, SwitchSubscriptionLegExecution4.mmInformativeTaxDetails, RedemptionExecution15.mmInformativeTaxDetails, SwitchRedemptionLegExecution4.mmInformativeTaxDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTax.mmObject());
				superType_lazy = () -> Tax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShare, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerShareCalculated,
						com.tools20022.repository.entity.SecuritiesTax.mmEUCapitalGain, com.tools20022.repository.entity.SecuritiesTax.mmEUDividendStatus, com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividend,
						com.tools20022.repository.entity.SecuritiesTax.mmStampDutyType, com.tools20022.repository.entity.SecuritiesTax.mmStampDutyTaxBasis, com.tools20022.repository.entity.SecuritiesTax.mmTaxVoucher,
						com.tools20022.repository.entity.SecuritiesTax.mmTaxableIncomePerDividendShare, com.tools20022.repository.entity.SecuritiesTax.mmRelatedTax, com.tools20022.repository.entity.SecuritiesTax.mmTaxLotNumber,
						com.tools20022.repository.entity.SecuritiesTax.mmSecurity, com.tools20022.repository.entity.SecuritiesTax.mmTaxRuleExemptIndicator, com.tools20022.repository.entity.SecuritiesTax.mmEffectivePeriod,
						com.tools20022.repository.entity.SecuritiesTax.mmFrankedRate, com.tools20022.repository.entity.SecuritiesTax.mmTEFRARule, com.tools20022.repository.entity.SecuritiesTax.mmJurisdiction);
				derivationComponent_lazy = () -> Arrays.asList(TaxableIncomePerShareCalculated1.mmObject(), EUCapitalGain1.mmObject(), CapitalGainFormat1Choice.mmObject(), TaxableIncomePerShareCalculatedFormat1Choice.mmObject(),
						CapitalGainFormat2Choice.mmObject(), TaxableIncomePerShareCalculatedFormat2Choice.mmObject(), EUCapitalGainType2Choice.mmObject(), StampDutyType1FormatChoice.mmObject(),
						TaxableIncomePerShareCalculatedType1Choice.mmObject(), EUDividendStatusType1Choice.mmObject(), EUCapitalGainType1Choice.mmObject(), TEFRARules2Choice.mmObject(), RateAndAmountFormat21Choice.mmObject(),
						RateAndAmountFormat35Choice.mmObject(), RateAndAmountFormat32Choice.mmObject(), RateAndAmountFormat40Choice.mmObject(), TaxableIncomePerShareCalculatedFormat3Choice.mmObject(), CapitalGainFormat3Choice.mmObject(),
						CapitalGainFormat4Choice.mmObject(), RateAndAmountFormat45Choice.mmObject(), TaxableIncomePerShareCalculatedFormat4Choice.mmObject(), InformativeTax1.mmObject(), EUCapitalGain3Choice.mmObject(),
						EUDividendStatusType2Choice.mmObject(), TaxableIncomePerShareCalculated2Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTax.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerShare() {
		return taxableIncomePerShare;
	}

	public SecuritiesTax setTaxableIncomePerShare(ActiveCurrencyAndAmount taxableIncomePerShare) {
		this.taxableIncomePerShare = Objects.requireNonNull(taxableIncomePerShare);
		return this;
	}

	public TaxableIncomePerShareCalculatedCode getTaxableIncomePerShareCalculated() {
		return taxableIncomePerShareCalculated;
	}

	public SecuritiesTax setTaxableIncomePerShareCalculated(TaxableIncomePerShareCalculatedCode taxableIncomePerShareCalculated) {
		this.taxableIncomePerShareCalculated = Objects.requireNonNull(taxableIncomePerShareCalculated);
		return this;
	}

	public EUCapitalGainCode getEUCapitalGain() {
		return eUCapitalGain;
	}

	public SecuritiesTax setEUCapitalGain(EUCapitalGainCode eUCapitalGain) {
		this.eUCapitalGain = Objects.requireNonNull(eUCapitalGain);
		return this;
	}

	public EUDividendStatusCode getEUDividendStatus() {
		return eUDividendStatus;
	}

	public SecuritiesTax setEUDividendStatus(EUDividendStatusCode eUDividendStatus) {
		this.eUDividendStatus = Objects.requireNonNull(eUDividendStatus);
		return this;
	}

	public CurrencyAndAmount getTaxableIncomePerDividend() {
		return taxableIncomePerDividend;
	}

	public SecuritiesTax setTaxableIncomePerDividend(CurrencyAndAmount taxableIncomePerDividend) {
		this.taxableIncomePerDividend = Objects.requireNonNull(taxableIncomePerDividend);
		return this;
	}

	public StampDutyTypeCode getStampDutyType() {
		return stampDutyType;
	}

	public SecuritiesTax setStampDutyType(StampDutyTypeCode stampDutyType) {
		this.stampDutyType = Objects.requireNonNull(stampDutyType);
		return this;
	}

	public Max4AlphaNumericText getStampDutyTaxBasis() {
		return stampDutyTaxBasis;
	}

	public SecuritiesTax setStampDutyTaxBasis(Max4AlphaNumericText stampDutyTaxBasis) {
		this.stampDutyTaxBasis = Objects.requireNonNull(stampDutyTaxBasis);
		return this;
	}

	public Optional<TaxVoucher> getTaxVoucher() {
		return taxVoucher == null ? Optional.empty() : Optional.of(taxVoucher);
	}

	public SecuritiesTax setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = taxVoucher;
		return this;
	}

	public ActiveCurrencyAndAmount getTaxableIncomePerDividendShare() {
		return taxableIncomePerDividendShare;
	}

	public SecuritiesTax setTaxableIncomePerDividendShare(ActiveCurrencyAndAmount taxableIncomePerDividendShare) {
		this.taxableIncomePerDividendShare = Objects.requireNonNull(taxableIncomePerDividendShare);
		return this;
	}

	public RateAndAmount getRelatedTax() {
		return relatedTax;
	}

	public SecuritiesTax setRelatedTax(com.tools20022.repository.entity.RateAndAmount relatedTax) {
		this.relatedTax = Objects.requireNonNull(relatedTax);
		return this;
	}

	public Max15NumericText getTaxLotNumber() {
		return taxLotNumber;
	}

	public SecuritiesTax setTaxLotNumber(Max15NumericText taxLotNumber) {
		this.taxLotNumber = Objects.requireNonNull(taxLotNumber);
		return this;
	}

	public Optional<Security> getSecurity() {
		return security == null ? Optional.empty() : Optional.of(security);
	}

	public SecuritiesTax setSecurity(com.tools20022.repository.entity.Security security) {
		this.security = security;
		return this;
	}

	public YesNoIndicator getTaxRuleExemptIndicator() {
		return taxRuleExemptIndicator;
	}

	public SecuritiesTax setTaxRuleExemptIndicator(YesNoIndicator taxRuleExemptIndicator) {
		this.taxRuleExemptIndicator = Objects.requireNonNull(taxRuleExemptIndicator);
		return this;
	}

	public DateTimePeriod getEffectivePeriod() {
		return effectivePeriod;
	}

	public SecuritiesTax setEffectivePeriod(com.tools20022.repository.entity.DateTimePeriod effectivePeriod) {
		this.effectivePeriod = Objects.requireNonNull(effectivePeriod);
		return this;
	}

	public PercentageRate getFrankedRate() {
		return frankedRate;
	}

	public SecuritiesTax setFrankedRate(PercentageRate frankedRate) {
		this.frankedRate = Objects.requireNonNull(frankedRate);
		return this;
	}

	public TEFRARulesCode getTEFRARule() {
		return tEFRARule;
	}

	public SecuritiesTax setTEFRARule(TEFRARulesCode tEFRARule) {
		this.tEFRARule = Objects.requireNonNull(tEFRARule);
		return this;
	}

	public Jurisdiction getJurisdiction() {
		return jurisdiction;
	}

	public SecuritiesTax setJurisdiction(com.tools20022.repository.entity.Jurisdiction jurisdiction) {
		this.jurisdiction = Objects.requireNonNull(jurisdiction);
		return this;
	}
}