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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.msg.EUCapitalGain1;
import com.tools20022.repository.msg.InformativeTax1;
import com.tools20022.repository.msg.TaxableIncomePerShareCalculated1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxableIncomePerShare
 * SecuritiesTax.TaxableIncomePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxableIncomePerShareCalculated
 * SecuritiesTax.TaxableIncomePerShareCalculated}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#EUCapitalGain
 * SecuritiesTax.EUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#EUDividendStatus
 * SecuritiesTax.EUDividendStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxableIncomePerDividend
 * SecuritiesTax.TaxableIncomePerDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#StampDutyType
 * SecuritiesTax.StampDutyType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#StampDutyTaxBasis
 * SecuritiesTax.StampDutyTaxBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxVoucher
 * SecuritiesTax.TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxableIncomePerDividendShare
 * SecuritiesTax.TaxableIncomePerDividendShare}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#RelatedTax
 * SecuritiesTax.RelatedTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxLotNumber
 * SecuritiesTax.TaxLotNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#Security
 * SecuritiesTax.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#TaxRuleExemptIndicator
 * SecuritiesTax.TaxRuleExemptIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#EffectivePeriod
 * SecuritiesTax.EffectivePeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#FrankedRate
 * SecuritiesTax.FrankedRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#TEFRARule
 * SecuritiesTax.TEFRARule}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#Jurisdiction
 * SecuritiesTax.Jurisdiction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#TaxDetails
 * Security.TaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RelatedSecurityTax
 * TaxVoucher.RelatedSecurityTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#SecuritiesTax
 * RateAndAmount.SecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedSecuritiesTax
 * Jurisdiction.RelatedSecuritiesTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice#RateTypeAndRate
 * RateAndAmountFormat21Choice.RateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice#RateTypeAndRate
 * RateAndAmountFormat35Choice.RateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice#RateTypeAndRate
 * RateAndAmountFormat32Choice.RateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#RateTypeAndRate
 * RateAndAmountFormat40Choice.RateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice#RateTypeAndRate
 * RateAndAmountFormat45Choice.RateTypeAndRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#InformativeTaxDetails
 * SubscriptionExecution13.InformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#InformativeTaxDetails
 * SubscriptionExecution12.InformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#InformativeTaxDetails
 * RedemptionExecution16.InformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#InformativeTaxDetails
 * SwitchSubscriptionLegExecution4.InformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#InformativeTaxDetails
 * RedemptionExecution15.InformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#InformativeTaxDetails
 * SwitchRedemptionLegExecution4.InformativeTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	/**
	 * Amount included in the NAV that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#TaxableIncomePerShare
	 * UnitPrice6.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#TaxableIncomePerShare
	 * UnitPrice15.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice3#TaxableIncomePerShare
	 * UnitPrice3.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice12#TaxableIncomePerShare
	 * UnitPrice12.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes31#TaxableIncomePerShare
	 * FinancialInstrumentAttributes31.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes44#TaxableIncomePerShare
	 * FinancialInstrumentAttributes44.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice5#TaxableIncomePerShare
	 * UnitPrice5.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#TaxableIncomePerShare
	 * UnitPrice10.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice16#TaxableIncomePerShare
	 * UnitPrice16.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice17#TaxableIncomePerShare
	 * UnitPrice17.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice21#TaxableIncomePerShare
	 * UnitPrice21.TaxableIncomePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#TaxableIncomePerShare
	 * UnitPrice22.TaxableIncomePerShare}</li>
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
	public static final MMBusinessAttribute TaxableIncomePerShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UnitPrice6.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice15.TaxableIncomePerShare,
					com.tools20022.repository.msg.UnitPrice3.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice12.TaxableIncomePerShare, com.tools20022.repository.msg.FinancialInstrumentAttributes31.TaxableIncomePerShare,
					com.tools20022.repository.msg.FinancialInstrumentAttributes44.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice5.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice10.TaxableIncomePerShare,
					com.tools20022.repository.msg.UnitPrice16.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice17.TaxableIncomePerShare, com.tools20022.repository.msg.UnitPrice21.TaxableIncomePerShare,
					com.tools20022.repository.msg.UnitPrice22.TaxableIncomePerShare);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShare";
			definition = "Amount included in the NAV that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies whether the fund calculates a taxable interest per share (TIS).
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TaxableIncomePerShareCalculated1#Structured
	 * TaxableIncomePerShareCalculated1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#TaxableIncomePerShareCalculated
	 * UnitPrice6.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#TaxableIncomePerShareCalculated
	 * UnitPrice15.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#ExtendedTaxableIncomePerShareCalculated
	 * UnitPrice15.ExtendedTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice#Code
	 * TaxableIncomePerShareCalculatedFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice#Proprietary
	 * TaxableIncomePerShareCalculatedFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#TaxableIncomePerShareCalculated
	 * CorporateAction3.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice#Code
	 * TaxableIncomePerShareCalculatedFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice#Proprietary
	 * TaxableIncomePerShareCalculatedFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#TaxableIncomePerShareCalculated
	 * CorporateAction4.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#TaxableIncomePerShareCalculated
	 * CorporateAction5.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#TaxableIncomePerShareCalculated
	 * CorporateAction6.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#TaxableIncomePerShareCalculated
	 * CorporateAction7.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#TaxableIncomePerShareCalculated
	 * CorporateAction8.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#TaxableIncomePerShareCalculated
	 * CorporateAction10.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#TaxableIncomePerShareCalculated
	 * CorporateAction11.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice5#TaxableIncomePerShareCalculated
	 * UnitPrice5.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#TaxableIncomePerShareCalculated
	 * UnitPrice10.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice10#ExtendedTaxableIncomePerShareCalculated
	 * UnitPrice10.ExtendedTaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#TaxableIncomePerShareCalculated
	 * CorporateAction2.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice#TaxableIncomePerShareCalculated
	 * TaxableIncomePerShareCalculatedType1Choice.
	 * TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice#Proprietary
	 * TaxableIncomePerShareCalculatedType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice16#TaxableIncomePerShareCalculated
	 * UnitPrice16.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice17#TaxableIncomePerShareCalculated
	 * UnitPrice17.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#TaxableIncomePerShareCalculated
	 * CorporateAction12.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#TaxableIncomePerShareCalculated
	 * CorporateAction17.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#TaxableIncomePerShareCalculated
	 * CorporateAction31.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#Code
	 * TaxableIncomePerShareCalculatedFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice#Proprietary
	 * TaxableIncomePerShareCalculatedFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#TaxableIncomePerShareCalculated
	 * CorporateAction40.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice#Code
	 * TaxableIncomePerShareCalculatedFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice#Proprietary
	 * TaxableIncomePerShareCalculatedFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice22#TaxableIncomePerShareCalculated
	 * UnitPrice22.TaxableIncomePerShareCalculated}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#Code
	 * TaxableIncomePerShareCalculated2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice#Proprietary
	 * TaxableIncomePerShareCalculated2Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute TaxableIncomePerShareCalculated = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxableIncomePerShareCalculated1.Structured, com.tools20022.repository.msg.UnitPrice6.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.UnitPrice15.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice15.ExtendedTaxableIncomePerShareCalculated,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice.Code, com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.TaxableIncomePerShareCalculated, com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice.Code,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat2Choice.Proprietary, com.tools20022.repository.msg.CorporateAction4.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.CorporateAction5.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction6.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.CorporateAction7.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction8.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.CorporateAction10.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction11.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.UnitPrice5.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice10.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.UnitPrice10.ExtendedTaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction2.TaxableIncomePerShareCalculated,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice.TaxableIncomePerShareCalculated, com.tools20022.repository.choice.TaxableIncomePerShareCalculatedType1Choice.Proprietary,
					com.tools20022.repository.msg.UnitPrice16.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.UnitPrice17.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.CorporateAction12.TaxableIncomePerShareCalculated, com.tools20022.repository.msg.CorporateAction17.TaxableIncomePerShareCalculated,
					com.tools20022.repository.msg.CorporateAction31.TaxableIncomePerShareCalculated, com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice.Code,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction40.TaxableIncomePerShareCalculated,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice.Code, com.tools20022.repository.choice.TaxableIncomePerShareCalculatedFormat4Choice.Proprietary,
					com.tools20022.repository.msg.UnitPrice22.TaxableIncomePerShareCalculated, com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice.Code,
					com.tools20022.repository.choice.TaxableIncomePerShareCalculated2Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerShareCalculated";
			definition = "Specifies whether the fund calculates a taxable interest per share (TIS).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxableIncomePerShareCalculatedCode.mmObject();
		}
	};
	/**
	 * Specifies whether capital gain is in the scope of the European directive
	 * on taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation2#EUCapitalGain
	 * TaxCalculationInformation2.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#EUCapitalGain
	 * TaxCalculationInformation4.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#ExtendedEUCapitalGain
	 * TaxCalculationInformation4.ExtendedEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice#Code
	 * CapitalGainFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat1Choice#Proprietary
	 * CapitalGainFormat1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction3#CapitalGainInOutIndicator
	 * CorporateAction3.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat2Choice#Code
	 * CapitalGainFormat2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat2Choice#Proprietary
	 * CapitalGainFormat2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction4#CapitalGainInOutIndicator
	 * CorporateAction4.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction5#CapitalGainInOutIndicator
	 * CorporateAction5.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction6#CapitalGainInOutIndicator
	 * CorporateAction6.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction7#CapitalGainInOutIndicator
	 * CorporateAction7.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction8#CapitalGainInOutIndicator
	 * CorporateAction8.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction10#CapitalGainInOutIndicator
	 * CorporateAction10.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction11#CapitalGainInOutIndicator
	 * CorporateAction11.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#EUCapitalGain
	 * EUCapitalGainType2Choice.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType2Choice#Proprietary
	 * EUCapitalGainType2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#CapitalGainType
	 * Order16.CapitalGainType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#CapitalGainType
	 * Order14.CapitalGainType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#EUCapitalGain
	 * TaxCalculationInformation3.EUCapitalGain}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes3#EUCapitalGain
	 * TotalTaxes3.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#ExtendedEUCapitalGain
	 * TotalTaxes3.ExtendedEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction2#CapitalGain
	 * CorporateAction2.CapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType1Choice#EUCapitalGain
	 * EUCapitalGainType1Choice.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGainType1Choice#Proprietary
	 * EUCapitalGainType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5#EUCapitalGain
	 * TotalTaxes5.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction12#CapitalGainInOutIndicator
	 * CorporateAction12.CapitalGainInOutIndicator}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#CapitalGainType
	 * Order17.CapitalGainType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#CapitalGainType
	 * Order18.CapitalGainType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction17#CapitalGainInOutIndicator
	 * CorporateAction17.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction31#CapitalGainInOutIndicator
	 * CorporateAction31.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#Code
	 * CapitalGainFormat3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat3Choice#Proprietary
	 * CapitalGainFormat3Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateAction40#CapitalGainInOutIndicator
	 * CorporateAction40.CapitalGainInOutIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice#Code
	 * CapitalGainFormat4Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CapitalGainFormat4Choice#Proprietary
	 * CapitalGainFormat4Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#EUCapitalGain
	 * InformativeTax1.EUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#Code
	 * EUCapitalGain3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUCapitalGain3Choice#Proprietary
	 * EUCapitalGain3Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute EUCapitalGain = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation2.EUCapitalGain, com.tools20022.repository.msg.TaxCalculationInformation4.EUCapitalGain,
					com.tools20022.repository.msg.TaxCalculationInformation4.ExtendedEUCapitalGain, com.tools20022.repository.choice.CapitalGainFormat1Choice.Code, com.tools20022.repository.choice.CapitalGainFormat1Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction3.CapitalGainInOutIndicator, com.tools20022.repository.choice.CapitalGainFormat2Choice.Code, com.tools20022.repository.choice.CapitalGainFormat2Choice.Proprietary,
					com.tools20022.repository.msg.CorporateAction4.CapitalGainInOutIndicator, com.tools20022.repository.msg.CorporateAction5.CapitalGainInOutIndicator,
					com.tools20022.repository.msg.CorporateAction6.CapitalGainInOutIndicator, com.tools20022.repository.msg.CorporateAction7.CapitalGainInOutIndicator,
					com.tools20022.repository.msg.CorporateAction8.CapitalGainInOutIndicator, com.tools20022.repository.msg.CorporateAction10.CapitalGainInOutIndicator,
					com.tools20022.repository.msg.CorporateAction11.CapitalGainInOutIndicator, com.tools20022.repository.choice.EUCapitalGainType2Choice.EUCapitalGain, com.tools20022.repository.choice.EUCapitalGainType2Choice.Proprietary,
					com.tools20022.repository.msg.Order16.CapitalGainType, com.tools20022.repository.msg.Order14.CapitalGainType, com.tools20022.repository.msg.TaxCalculationInformation3.EUCapitalGain,
					com.tools20022.repository.msg.TotalTaxes3.EUCapitalGain, com.tools20022.repository.msg.TotalTaxes3.ExtendedEUCapitalGain, com.tools20022.repository.msg.CorporateAction2.CapitalGain,
					com.tools20022.repository.choice.EUCapitalGainType1Choice.EUCapitalGain, com.tools20022.repository.choice.EUCapitalGainType1Choice.Proprietary, com.tools20022.repository.msg.TotalTaxes5.EUCapitalGain,
					com.tools20022.repository.msg.CorporateAction12.CapitalGainInOutIndicator, com.tools20022.repository.msg.Order17.CapitalGainType, com.tools20022.repository.msg.Order18.CapitalGainType,
					com.tools20022.repository.msg.CorporateAction17.CapitalGainInOutIndicator, com.tools20022.repository.msg.CorporateAction31.CapitalGainInOutIndicator, com.tools20022.repository.choice.CapitalGainFormat3Choice.Code,
					com.tools20022.repository.choice.CapitalGainFormat3Choice.Proprietary, com.tools20022.repository.msg.CorporateAction40.CapitalGainInOutIndicator, com.tools20022.repository.choice.CapitalGainFormat4Choice.Code,
					com.tools20022.repository.choice.CapitalGainFormat4Choice.Proprietary, com.tools20022.repository.msg.InformativeTax1.EUCapitalGain, com.tools20022.repository.choice.EUCapitalGain3Choice.Code,
					com.tools20022.repository.choice.EUCapitalGain3Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EUCapitalGainCode.mmObject();
		}
	};
	/**
	 * Specifies whether dividend is in the scope of the European directive on
	 * taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#EUDividendStatus
	 * TaxCalculationInformation4.EUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#ExtendedEUDividendStatus
	 * TaxCalculationInformation4.ExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#EUDividendStatus
	 * UnitPrice15.EUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#ExtendedEUDividendStatus
	 * UnitPrice15.ExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#EUDividendStatus
	 * TotalTaxes3.EUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#ExtendedEUDividendStatus
	 * TotalTaxes3.ExtendedEUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType1Choice#EUDividendStatus
	 * EUDividendStatusType1Choice.EUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType1Choice#Proprietary
	 * EUDividendStatusType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#EUDividendStatusType
	 * Tax18.EUDividendStatusType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#EUDividendStatusType
	 * Tax19.EUDividendStatusType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#EUDividendStatus
	 * InformativeTax1.EUDividendStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#Code
	 * EUDividendStatusType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.EUDividendStatusType2Choice#Proprietary
	 * EUDividendStatusType2Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute EUDividendStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation4.EUDividendStatus, com.tools20022.repository.msg.TaxCalculationInformation4.ExtendedEUDividendStatus,
					com.tools20022.repository.msg.UnitPrice15.EUDividendStatus, com.tools20022.repository.msg.UnitPrice15.ExtendedEUDividendStatus, com.tools20022.repository.msg.TotalTaxes3.EUDividendStatus,
					com.tools20022.repository.msg.TotalTaxes3.ExtendedEUDividendStatus, com.tools20022.repository.choice.EUDividendStatusType1Choice.EUDividendStatus,
					com.tools20022.repository.choice.EUDividendStatusType1Choice.Proprietary, com.tools20022.repository.msg.Tax18.EUDividendStatusType, com.tools20022.repository.msg.Tax19.EUDividendStatusType,
					com.tools20022.repository.msg.InformativeTax1.EUDividendStatus, com.tools20022.repository.choice.EUDividendStatusType2Choice.Code, com.tools20022.repository.choice.EUDividendStatusType2Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EUDividendStatus";
			definition = "Specifies whether dividend is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EUDividendStatusCode.mmObject();
		}
	};
	/**
	 * Amount included in the dividend that corresponds to gains directly or
	 * indirectly derived from interest payment in the scope of the European
	 * Directive on taxation of savings income in the form of interest payments.
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
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation4#TaxableIncomePerDividend
	 * TaxCalculationInformation4.TaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#TaxableIncomePerDividend
	 * UnitPrice15.TaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes3#TaxableIncomePerDividend
	 * TotalTaxes3.TaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes4#TaxableIncomePerDividend
	 * TotalTaxes4.TaxableIncomePerDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InformativeTax1#TaxableIncomePerDividend
	 * InformativeTax1.TaxableIncomePerDividend}</li>
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
	public static final MMBusinessAttribute TaxableIncomePerDividend = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCalculationInformation4.TaxableIncomePerDividend, com.tools20022.repository.msg.UnitPrice15.TaxableIncomePerDividend,
					com.tools20022.repository.msg.TotalTaxes3.TaxableIncomePerDividend, com.tools20022.repository.msg.TotalTaxes4.TaxableIncomePerDividend, com.tools20022.repository.msg.InformativeTax1.TaxableIncomePerDividend);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividend";
			definition = "Amount included in the dividend that corresponds to gains directly or indirectly derived from interest payment in the scope of the European Directive on taxation of savings income in the form of interest payments.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates how the stamp duty should be applied.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation7#StampDuty
	 * DeliverInformation7.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation8#StampDuty
	 * ReceiveInformation8.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation6#StampDuty
	 * ReceiveInformation6.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation11#StampDuty
	 * ReceiveInformation11.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation11#StampDuty
	 * DeliverInformation11.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation8#StampDuty
	 * DeliverInformation8.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation7#StampDuty
	 * ReceiveInformation7.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation5#StampDuty
	 * ReceiveInformation5.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation9#StampDuty
	 * ReceiveInformation9.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation5#StampDuty
	 * DeliverInformation5.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation9#StampDuty
	 * DeliverInformation9.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation6#StampDuty
	 * DeliverInformation6.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#Code
	 * StampDutyType1FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.StampDutyType1FormatChoice#Proprietary
	 * StampDutyType1FormatChoice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation13#StampDuty
	 * ReceiveInformation13.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation12#StampDuty
	 * ReceiveInformation12.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation12#StampDuty
	 * DeliverInformation12.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation13#StampDuty
	 * DeliverInformation13.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation15#StampDuty
	 * DeliverInformation15.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation14#StampDuty
	 * DeliverInformation14.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation15#StampDuty
	 * ReceiveInformation15.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation14#StampDuty
	 * ReceiveInformation14.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation17#StampDuty
	 * ReceiveInformation17.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReceiveInformation16#StampDuty
	 * ReceiveInformation16.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation16#StampDuty
	 * DeliverInformation16.StampDuty}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DeliverInformation17#StampDuty
	 * DeliverInformation17.StampDuty}</li>
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
	public static final MMBusinessAttribute StampDutyType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliverInformation7.StampDuty, com.tools20022.repository.msg.ReceiveInformation8.StampDuty, com.tools20022.repository.msg.ReceiveInformation6.StampDuty,
					com.tools20022.repository.msg.ReceiveInformation11.StampDuty, com.tools20022.repository.msg.DeliverInformation11.StampDuty, com.tools20022.repository.msg.DeliverInformation8.StampDuty,
					com.tools20022.repository.msg.ReceiveInformation7.StampDuty, com.tools20022.repository.msg.ReceiveInformation5.StampDuty, com.tools20022.repository.msg.ReceiveInformation9.StampDuty,
					com.tools20022.repository.msg.DeliverInformation5.StampDuty, com.tools20022.repository.msg.DeliverInformation9.StampDuty, com.tools20022.repository.msg.DeliverInformation6.StampDuty,
					com.tools20022.repository.choice.StampDutyType1FormatChoice.Code, com.tools20022.repository.choice.StampDutyType1FormatChoice.Proprietary, com.tools20022.repository.msg.ReceiveInformation13.StampDuty,
					com.tools20022.repository.msg.ReceiveInformation12.StampDuty, com.tools20022.repository.msg.DeliverInformation12.StampDuty, com.tools20022.repository.msg.DeliverInformation13.StampDuty,
					com.tools20022.repository.msg.DeliverInformation15.StampDuty, com.tools20022.repository.msg.DeliverInformation14.StampDuty, com.tools20022.repository.msg.ReceiveInformation15.StampDuty,
					com.tools20022.repository.msg.ReceiveInformation14.StampDuty, com.tools20022.repository.msg.ReceiveInformation17.StampDuty, com.tools20022.repository.msg.ReceiveInformation16.StampDuty,
					com.tools20022.repository.msg.DeliverInformation16.StampDuty, com.tools20022.repository.msg.DeliverInformation17.StampDuty);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDutyType";
			definition = "Indicates how the stamp duty should be applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> StampDutyTypeCode.mmObject();
		}
	};
	/**
	 * Specifies the stamp duty type or exemption reason applicable to the
	 * settlement transaction.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails50#StampDutyTaxBasis
	 * SettlementDetails50.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails51#StampDutyTaxBasis
	 * SettlementDetails51.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails9#StampDutyTaxBasis
	 * SettlementDetails9.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails17#StampDutyTaxBasis
	 * SettlementDetails17.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails30#StampDutyTaxBasis
	 * SettlementDetails30.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails32#StampDutyTaxBasis
	 * SettlementDetails32.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails60#StampDutyTaxBasis
	 * SettlementDetails60.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails64#StampDutyTaxBasis
	 * SettlementDetails64.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails3#StampDutyTaxBasis
	 * SettlementDetails3.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails16#StampDutyTaxBasis
	 * SettlementDetails16.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails31#StampDutyTaxBasis
	 * SettlementDetails31.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails40#StampDutyTaxBasis
	 * SettlementDetails40.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails62#StampDutyTaxBasis
	 * SettlementDetails62.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails63#StampDutyTaxBasis
	 * SettlementDetails63.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails6#StampDutyTaxBasis
	 * SettlementDetails6.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails20#StampDutyTaxBasis
	 * SettlementDetails20.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails24#StampDutyTaxBasis
	 * SettlementDetails24.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails33#StampDutyTaxBasis
	 * SettlementDetails33.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails45#StampDutyTaxBasis
	 * SettlementDetails45.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails54#StampDutyTaxBasis
	 * SettlementDetails54.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails1#StampDutyTaxBasis
	 * SettlementDetails1.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails19#StampDutyTaxBasis
	 * SettlementDetails19.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails22#StampDutyTaxBasis
	 * SettlementDetails22.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails35#StampDutyTaxBasis
	 * SettlementDetails35.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails42#StampDutyTaxBasis
	 * SettlementDetails42.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails52#StampDutyTaxBasis
	 * SettlementDetails52.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails8#StampDutyTaxBasis
	 * SettlementDetails8.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails11#StampDutyTaxBasis
	 * SettlementDetails11.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails23#StampDutyTaxBasis
	 * SettlementDetails23.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails37#StampDutyTaxBasis
	 * SettlementDetails37.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails44#StampDutyTaxBasis
	 * SettlementDetails44.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails53#StampDutyTaxBasis
	 * SettlementDetails53.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails7#StampDutyTaxBasis
	 * SettlementDetails7.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails12#StampDutyTaxBasis
	 * SettlementDetails12.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails28#StampDutyTaxBasis
	 * SettlementDetails28.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails38#StampDutyTaxBasis
	 * SettlementDetails38.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails47#StampDutyTaxBasis
	 * SettlementDetails47.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails56#StampDutyTaxBasis
	 * SettlementDetails56.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails2#StampDutyTaxBasis
	 * SettlementDetails2.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails13#StampDutyTaxBasis
	 * SettlementDetails13.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails27#StampDutyTaxBasis
	 * SettlementDetails27.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails39#StampDutyTaxBasis
	 * SettlementDetails39.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails48#StampDutyTaxBasis
	 * SettlementDetails48.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails57#StampDutyTaxBasis
	 * SettlementDetails57.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails43#StampDutyTaxBasis
	 * SettlementDetails43.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails4#StampDutyTaxBasis
	 * SettlementDetails4.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails10#StampDutyTaxBasis
	 * SettlementDetails10.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails29#StampDutyTaxBasis
	 * SettlementDetails29.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails5#StampDutyTaxBasis
	 * SettlementDetails5.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails25#StampDutyTaxBasis
	 * SettlementDetails25.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails26#StampDutyTaxBasis
	 * SettlementDetails26.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails65#StampDutyTaxBasis
	 * SettlementDetails65.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails14#StampDutyTaxBasis
	 * SettlementDetails14.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails41#StampDutyTaxBasis
	 * SettlementDetails41.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails61#StampDutyTaxBasis
	 * SettlementDetails61.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails59#StampDutyTaxBasis
	 * SettlementDetails59.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails15#StampDutyTaxBasis
	 * SettlementDetails15.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails34#StampDutyTaxBasis
	 * SettlementDetails34.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails49#StampDutyTaxBasis
	 * SettlementDetails49.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails58#StampDutyTaxBasis
	 * SettlementDetails58.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails36#StampDutyTaxBasis
	 * SettlementDetails36.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails18#StampDutyTaxBasis
	 * SettlementDetails18.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails66#StampDutyTaxBasis
	 * SettlementDetails66.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails67#StampDutyTaxBasis
	 * SettlementDetails67.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails70#StampDutyTaxBasis
	 * SettlementDetails70.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails68#StampDutyTaxBasis
	 * SettlementDetails68.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails69#StampDutyTaxBasis
	 * SettlementDetails69.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails71#StampDutyTaxBasis
	 * SettlementDetails71.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails72#StampDutyTaxBasis
	 * SettlementDetails72.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails75#StampDutyTaxBasis
	 * SettlementDetails75.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails73#StampDutyTaxBasis
	 * SettlementDetails73.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails74#StampDutyTaxBasis
	 * SettlementDetails74.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails81#StampDutyTaxBasis
	 * SettlementDetails81.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails76#StampDutyTaxBasis
	 * SettlementDetails76.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails80#StampDutyTaxBasis
	 * SettlementDetails80.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails78#StampDutyTaxBasis
	 * SettlementDetails78.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails77#StampDutyTaxBasis
	 * SettlementDetails77.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails79#StampDutyTaxBasis
	 * SettlementDetails79.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails87#StampDutyTaxBasis
	 * SettlementDetails87.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails83#StampDutyTaxBasis
	 * SettlementDetails83.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails86#StampDutyTaxBasis
	 * SettlementDetails86.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails85#StampDutyTaxBasis
	 * SettlementDetails85.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails93#StampDutyTaxBasis
	 * SettlementDetails93.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails90#StampDutyTaxBasis
	 * SettlementDetails90.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails96#StampDutyTaxBasis
	 * SettlementDetails96.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails97#StampDutyTaxBasis
	 * SettlementDetails97.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails99#StampDutyTaxBasis
	 * SettlementDetails99.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails94#StampDutyTaxBasis
	 * SettlementDetails94.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails100#StampDutyTaxBasis
	 * SettlementDetails100.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails95#StampDutyTaxBasis
	 * SettlementDetails95.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails91#StampDutyTaxBasis
	 * SettlementDetails91.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails92#StampDutyTaxBasis
	 * SettlementDetails92.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails98#StampDutyTaxBasis
	 * SettlementDetails98.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails101#StampDutyTaxBasis
	 * SettlementDetails101.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails105#StampDutyTaxBasis
	 * SettlementDetails105.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails106#StampDutyTaxBasis
	 * SettlementDetails106.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails104#StampDutyTaxBasis
	 * SettlementDetails104.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails111#StampDutyTaxBasis
	 * SettlementDetails111.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails112#StampDutyTaxBasis
	 * SettlementDetails112.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails110#StampDutyTaxBasis
	 * SettlementDetails110.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails108#StampDutyTaxBasis
	 * SettlementDetails108.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails103#StampDutyTaxBasis
	 * SettlementDetails103.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails107#StampDutyTaxBasis
	 * SettlementDetails107.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails115#StampDutyTaxBasis
	 * SettlementDetails115.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails117#StampDutyTaxBasis
	 * SettlementDetails117.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails116#StampDutyTaxBasis
	 * SettlementDetails116.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails113#StampDutyTaxBasis
	 * SettlementDetails113.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails128#StampDutyTaxBasis
	 * SettlementDetails128.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails120#StampDutyTaxBasis
	 * SettlementDetails120.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails119#StampDutyTaxBasis
	 * SettlementDetails119.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails125#StampDutyTaxBasis
	 * SettlementDetails125.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails126#StampDutyTaxBasis
	 * SettlementDetails126.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails122#StampDutyTaxBasis
	 * SettlementDetails122.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails127#StampDutyTaxBasis
	 * SettlementDetails127.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails121#StampDutyTaxBasis
	 * SettlementDetails121.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails134#StampDutyTaxBasis
	 * SettlementDetails134.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails137#StampDutyTaxBasis
	 * SettlementDetails137.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails132#StampDutyTaxBasis
	 * SettlementDetails132.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails138#StampDutyTaxBasis
	 * SettlementDetails138.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails130#StampDutyTaxBasis
	 * SettlementDetails130.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails131#StampDutyTaxBasis
	 * SettlementDetails131.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails133#StampDutyTaxBasis
	 * SettlementDetails133.StampDutyTaxBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementDetails139#StampDutyTaxBasis
	 * SettlementDetails139.StampDutyTaxBasis}</li>
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
	 * name} = "StampDutyTaxBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the stamp duty type or exemption reason applicable to the settlement transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StampDutyTaxBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementDetails50.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails51.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails9.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails17.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails30.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails32.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails60.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails64.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails3.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails16.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails31.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails40.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails62.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails63.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails6.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails20.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails24.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails33.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails45.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails54.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails1.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails19.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails22.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails35.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails42.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails52.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails8.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails11.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails23.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails37.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails44.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails53.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails7.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails12.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails28.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails38.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails47.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails56.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails2.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails13.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails27.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails39.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails48.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails57.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails43.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails4.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails10.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails29.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails5.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails25.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails26.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails65.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails14.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails41.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails61.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails59.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails15.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails34.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails49.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails58.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails36.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails18.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails66.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails67.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails70.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails68.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails69.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails71.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails72.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails75.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails73.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails74.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails81.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails76.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails80.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails78.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails77.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails79.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails87.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails83.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails86.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails85.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails93.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails90.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails96.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails97.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails99.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails94.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails100.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails95.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails91.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails92.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails98.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails101.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails105.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails106.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails104.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails111.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails112.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails110.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails108.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails103.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails107.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails115.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails117.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails116.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails113.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails128.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails120.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails119.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails125.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails126.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails122.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails127.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails121.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails134.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails137.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails132.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails138.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails130.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails131.StampDutyTaxBasis, com.tools20022.repository.msg.SettlementDetails133.StampDutyTaxBasis,
					com.tools20022.repository.msg.SettlementDetails139.StampDutyTaxBasis);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StampDutyTaxBasis";
			definition = "Specifies the stamp duty type or exemption reason applicable to the settlement transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max4AlphaNumericText.mmObject();
		}
	};
	/**
	 * Tax voucher which is related to a securities tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#RelatedSecurityTax
	 * TaxVoucher.RelatedSecurityTax}</li>
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
	public static final MMBusinessAssociationEnd TaxVoucher = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher which is related to a securities tax.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.RelatedSecurityTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Amount included in the dividend/NAV that is identified as gains directly
	 * or indirectly derived from interest payments within the scope of the EU
	 * Savings directive
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice5#TaxableIncomePerDividendShare
	 * CorporateActionPrice5.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice7#TaxableIncomePerDividendShare
	 * CorporateActionPrice7.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#TaxableIncomePerDividendShare
	 * CorporateActionRate20.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#TaxableIncomePerDividendShare
	 * CorporateActionRate22.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#TaxableIncomePerDividendShare
	 * CorporateActionRate26.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#TaxableIncomePerDividendShare
	 * CorporateActionRate31.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#TaxableIncomePerDividendShare
	 * CorporateActionRate38.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#TaxableIncomePerDividendShare
	 * CorporateActionRate39.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice6#TaxableIncomePerDividendShare
	 * CorporateActionPrice6.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice14#TaxableIncomePerDividendShare
	 * CorporateActionPrice14.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#TaxableIncomePerDividendShare
	 * CorporateActionRate15.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#TaxableIncomePerDividendShare
	 * CorporateActionRate18.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#TaxableIncomePerDividendShare
	 * CorporateActionRate25.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#TaxableIncomePerDividendShare
	 * CorporateActionRate30.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#TaxableIncomePerDividendShare
	 * CorporateActionRate37.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#TaxableIncomePerDividendShare
	 * CorporateActionRate40.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#TaxableIncomePerDividendShare
	 * CorporateActionRate36.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#TaxableIncomePerDividendShare
	 * CorporateActionRate42.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice1#TaxableIncomePerDividendShare
	 * CorporateActionPrice1.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#TaxableIncomePerDividendShare
	 * CorporateActionRate46.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#TaxableIncomePerDividendShare
	 * CorporateActionRate45.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#TaxableIncomePerDividendShare
	 * CorporateActionRate44.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#TaxableIncomePerDividendShare
	 * CorporateActionRate60.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#TaxableIncomePerDividendShare
	 * CorporateActionRate64.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#TaxableIncomePerDividendShare
	 * CorporateActionRate57.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#TaxableIncomePerDividendShare
	 * CorporateActionRate68.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#TaxableIncomePerDividendShare
	 * CorporateActionRate70.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#TaxableIncomePerDividendShare
	 * CorporateActionRate67.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#TaxableIncomePerDividendShare
	 * CorporateActionRate74.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#TaxableIncomePerDividendShare
	 * CorporateActionRate79.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#TaxableIncomePerDividendShare
	 * CorporateActionRate76.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#TaxableIncomePerDividendShare
	 * CorporateActionRate82.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#TaxableIncomePerDividendShare
	 * CorporateActionRate80.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#TaxableIncomePerDividendShare
	 * CorporateActionRate81.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#TaxableIncomePerDividendShare
	 * CorporateActionRate83.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#TaxableIncomePerDividendShare
	 * CorporateActionRate84.TaxableIncomePerDividendShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#TaxableIncomePerDividendShare
	 * CorporateActionRate85.TaxableIncomePerDividendShare}</li>
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
	public static final MMBusinessAttribute TaxableIncomePerDividendShare = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice5.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionPrice7.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate20.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate22.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate26.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate31.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate38.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate39.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionPrice6.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionPrice14.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate15.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate18.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate25.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate30.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate37.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate40.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate36.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate42.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionPrice1.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate46.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate45.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate44.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate60.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate64.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate57.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate68.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate70.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate67.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate74.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate79.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate76.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate82.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate80.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate81.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate83.TaxableIncomePerDividendShare, com.tools20022.repository.msg.CorporateActionRate84.TaxableIncomePerDividendShare,
					com.tools20022.repository.msg.CorporateActionRate85.TaxableIncomePerDividendShare);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableIncomePerDividendShare";
			definition = "Amount included in the dividend/NAV that is identified as gains directly or indirectly derived from interest payments within the scope of the EU Savings directive";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Percentage of the gross dividend rate on which tax must be paid .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SecuritiesTax
	 * RateAndAmount.SecuritiesTax}</li>
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
	public static final MMBusinessAssociationEnd RelatedTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RateAndAmount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RateAndAmount.SecuritiesTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Identification, for tax purposes, of a lot of identical securities that
	 * are bought at a certain date and at a certain price.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes1#TaxLotNumber
	 * FinancialInstrumentAttributes1.TaxLotNumber}</li>
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
	public static final MMBusinessAttribute TaxLotNumber = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrumentAttributes1.TaxLotNumber);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLotNumber";
			definition = "Identification, for tax purposes, of a lot of identical securities that are bought at a certain date and at a certain price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	/**
	 * Security on which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#TaxDetails
	 * Security.TaxDetails}</li>
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
	public static final MMBusinessAssociationEnd Security = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Security on which the tax applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Security.TaxDetails;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Indicates whether the tax rule applies within the jurisdiction as a
	 * condition of this security.
	 * <p>
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
	public static final MMBusinessAttribute TaxRuleExemptIndicator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRuleExemptIndicator";
			definition = "Indicates whether the tax rule applies within the jurisdiction as a condition of this security.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Period during which the tax rule applies within the jurisdiction.
	 * <p>
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
	public static final MMBusinessAttribute EffectivePeriod = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EffectivePeriod";
			definition = "Period during which the tax rule applies within the jurisdiction.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> DateTimePeriod.mmObject();
		}
	};
	/**
	 * Percentage of dividend for which tax is already paid.
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
	public static final MMBusinessAttribute FrankedRate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FrankedRate";
			definition = "Percentage of dividend for which tax is already paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Indicates the TEFRA rule under which the security is issued.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.choice.TEFRARules2Choice#Code
	 * TEFRARules2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TEFRARules2Choice#Proprietary
	 * TEFRARules2Choice.Proprietary}</li>
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
	public static final MMBusinessAttribute TEFRARule = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TEFRARules2Choice.Code, com.tools20022.repository.choice.TEFRARules2Choice.Proprietary);
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TEFRARule";
			definition = "Indicates the TEFRA rule under which the security is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TEFRARulesCode.mmObject();
		}
	};
	/**
	 * Jurisdiction in which the tax rule applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Jurisdiction#RelatedSecuritiesTax
	 * Jurisdiction.RelatedSecuritiesTax}</li>
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
	public static final MMBusinessAssociationEnd Jurisdiction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Jurisdiction";
			definition = "Jurisdiction in which the tax rule applies.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Jurisdiction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Jurisdiction.RelatedSecuritiesTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.TaxDetails, com.tools20022.repository.entity.TaxVoucher.RelatedSecurityTax,
						com.tools20022.repository.entity.RateAndAmount.SecuritiesTax, com.tools20022.repository.entity.Jurisdiction.RelatedSecuritiesTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateAndAmountFormat21Choice.RateTypeAndRate, com.tools20022.repository.choice.RateAndAmountFormat35Choice.RateTypeAndRate,
						com.tools20022.repository.choice.RateAndAmountFormat32Choice.RateTypeAndRate, com.tools20022.repository.choice.RateAndAmountFormat40Choice.RateTypeAndRate,
						com.tools20022.repository.choice.RateAndAmountFormat45Choice.RateTypeAndRate, com.tools20022.repository.msg.SubscriptionExecution13.InformativeTaxDetails,
						com.tools20022.repository.msg.SubscriptionExecution12.InformativeTaxDetails, com.tools20022.repository.msg.RedemptionExecution16.InformativeTaxDetails,
						com.tools20022.repository.msg.SwitchSubscriptionLegExecution4.InformativeTaxDetails, com.tools20022.repository.msg.RedemptionExecution15.InformativeTaxDetails,
						com.tools20022.repository.msg.SwitchRedemptionLegExecution4.InformativeTaxDetails);
				subType_lazy = () -> Arrays.asList(InvestmentFundTax.mmObject());
				superType_lazy = () -> Tax.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTax.TaxableIncomePerShare, com.tools20022.repository.entity.SecuritiesTax.TaxableIncomePerShareCalculated,
						com.tools20022.repository.entity.SecuritiesTax.EUCapitalGain, com.tools20022.repository.entity.SecuritiesTax.EUDividendStatus, com.tools20022.repository.entity.SecuritiesTax.TaxableIncomePerDividend,
						com.tools20022.repository.entity.SecuritiesTax.StampDutyType, com.tools20022.repository.entity.SecuritiesTax.StampDutyTaxBasis, com.tools20022.repository.entity.SecuritiesTax.TaxVoucher,
						com.tools20022.repository.entity.SecuritiesTax.TaxableIncomePerDividendShare, com.tools20022.repository.entity.SecuritiesTax.RelatedTax, com.tools20022.repository.entity.SecuritiesTax.TaxLotNumber,
						com.tools20022.repository.entity.SecuritiesTax.Security, com.tools20022.repository.entity.SecuritiesTax.TaxRuleExemptIndicator, com.tools20022.repository.entity.SecuritiesTax.EffectivePeriod,
						com.tools20022.repository.entity.SecuritiesTax.FrankedRate, com.tools20022.repository.entity.SecuritiesTax.TEFRARule, com.tools20022.repository.entity.SecuritiesTax.Jurisdiction);
				derivationComponent_lazy = () -> Arrays.asList(TaxableIncomePerShareCalculated1.mmObject(), EUCapitalGain1.mmObject(), CapitalGainFormat1Choice.mmObject(), TaxableIncomePerShareCalculatedFormat1Choice.mmObject(),
						CapitalGainFormat2Choice.mmObject(), TaxableIncomePerShareCalculatedFormat2Choice.mmObject(), EUCapitalGainType2Choice.mmObject(), StampDutyType1FormatChoice.mmObject(),
						TaxableIncomePerShareCalculatedType1Choice.mmObject(), EUDividendStatusType1Choice.mmObject(), EUCapitalGainType1Choice.mmObject(), TEFRARules2Choice.mmObject(), RateAndAmountFormat21Choice.mmObject(),
						RateAndAmountFormat35Choice.mmObject(), RateAndAmountFormat32Choice.mmObject(), RateAndAmountFormat40Choice.mmObject(), TaxableIncomePerShareCalculatedFormat3Choice.mmObject(), CapitalGainFormat3Choice.mmObject(),
						CapitalGainFormat4Choice.mmObject(), RateAndAmountFormat45Choice.mmObject(), TaxableIncomePerShareCalculatedFormat4Choice.mmObject(), InformativeTax1.mmObject(), EUCapitalGain3Choice.mmObject(),
						EUDividendStatusType2Choice.mmObject(), TaxableIncomePerShareCalculated2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}