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
import com.tools20022.repository.codeset.OperatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.msg.AmountAndRateStatus1;
import com.tools20022.repository.msg.AmountAndRateStatus2;
import com.tools20022.repository.msg.OriginalAmountDetails1;
import com.tools20022.repository.msg.RelatedTaxType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the value expressed as a rate or an amount. For example, the value
 * of a tax or a commission.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RateAndAmount" src="doc-files/RateAndAmount.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FinalDividendParameters
 * RateAndAmount.FinalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#FullyFrankedRateAndAmountDividendParameters
 * RateAndAmount.FullyFrankedRateAndAmountDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#GrossDividendParameters
 * RateAndAmount.GrossDividendParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Amount
 * RateAndAmount.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Index
 * RateAndAmount.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#NetDividendParameters
 * RateAndAmount.NetDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#MaximumAllowedBiddingConditions
 * RateAndAmount.MaximumAllowedBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#ProvisionalDividendParameters
 * RateAndAmount.ProvisionalDividendParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#SolicitationFeeCorporateActionParameters
 * RateAndAmount.SolicitationFeeCorporateActionParameters}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Rate
 * RateAndAmount.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RateBiddingConditions
 * RateAndAmount.RateBiddingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#SecuritiesTax
 * RateAndAmount.SecuritiesTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#EarlySolicitationFeeCorporateActionParameters
 * RateAndAmount.EarlySolicitationFeeCorporateActionParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#InterestRelatedIssuance
 * RateAndAmount.InterestRelatedIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#LossRelatedIssuance
 * RateAndAmount.LossRelatedIssuance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#AbsoluteValue
 * RateAndAmount.AbsoluteValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RateAndAmount#Operator
 * RateAndAmount.Operator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RateAndAmount#RelatedYieldCalculation
 * RateAndAmount.RelatedYieldCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
 * Dividend.FinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
 * Dividend.FullyFrankedRateAndAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
 * Dividend.GrossDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#NetDividend
 * Dividend.NetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
 * Dividend.ProvisionalDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax#RelatedTax
 * SecuritiesTax.RelatedTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
 * Issuance.InterestShortfall}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
 * Issuance.RealisedLoss}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#IndexFactor
 * Index.IndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
 * BiddingConditions.MaximumAllowedOverSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
 * BiddingConditions.ApplicableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
 * CorporateActionFeesAndCharges.SolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.YieldCalculation#YieldRange
 * YieldCalculation.YieldRange}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice#AmountAndRateStatus
 * GrossDividendRateFormat19Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus1#RateStatus
 * AmountAndRateStatus1.RateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat21Choice#AmountAndRateStatus
 * NetDividendRateFormat21Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat23Choice#AmountAndRateStatus
 * NetDividendRateFormat23Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat21Choice#AmountAndRateStatus
 * GrossDividendRateFormat21Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat22Choice#AmountAndRateStatus
 * NetDividendRateFormat22Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat20Choice#AmountAndRateStatus
 * GrossDividendRateFormat20Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat24Choice#AmountAndRateStatus
 * NetDividendRateFormat24Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat22Choice#AmountAndRateStatus
 * GrossDividendRateFormat22Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat28Choice#AmountAndRateStatus
 * NetDividendRateFormat28Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice#AmountAndRateStatus
 * GrossDividendRateFormat26Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat25Choice#AmountAndRateStatus
 * NetDividendRateFormat25Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat23Choice#AmountAndRateStatus
 * GrossDividendRateFormat23Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat24Choice#AmountAndRateStatus
 * GrossDividendRateFormat24Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat26Choice#AmountAndRateStatus
 * NetDividendRateFormat26Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NetDividendRateFormat27Choice#AmountAndRateStatus
 * NetDividendRateFormat27Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat25Choice#AmountAndRateStatus
 * GrossDividendRateFormat25Choice.AmountAndRateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus2#RateStatus
 * AmountAndRateStatus2.RateStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat12Choice
 * RateAndAmountFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat13Choice
 * RateAndAmountFormat13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice
 * RateAndAmountFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice
 * TaxCreditRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice
 * RateAndAmountFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice
 * TaxCreditRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice
 * RateAndAmountFormat18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat3Choice
 * RateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat2Choice
 * RateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice
 * TaxCreditRateFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice
 * SolicitationFeeRateFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice
 * TaxCreditRateFormat4Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice
 * SolicitationFeeRateFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat6Choice
 * RateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice
 * SolicitationFeeRateFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice
 * TaxCreditRateFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice
 * SolicitationFeeRateFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice
 * TaxCreditRateFormat6Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice
 * SolicitationFeeRateFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat8Choice
 * RateFormat8Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice
 * SolicitationFeeRateFormat6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat9Choice
 * RateFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat5Choice
 * RateFormat5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat7Choice
 * RateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice
 * RateOrAbsoluteValue1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat1Choice
 * RateFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1
 * RelatedTaxType1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat10Choice
 * RateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat12Choice
 * RateFormat12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat11Choice
 * RateFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat14Choice
 * RateFormat14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat17Choice
 * RateFormat17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
 * RateAndAmountFormat36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice
 * TaxCreditRateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice
 * RateAndAmountFormat39Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice
 * SolicitationFeeRateFormat7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice
 * TaxCreditRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat20Choice
 * RateFormat20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndRateStatus1
 * AmountAndRateStatus1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice
 * SolicitationFeeRateFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateFormat21Choice
 * RateFormat21Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice
 * SolicitationFeeRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice
 * TaxCreditRateFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice
 * RateAndAmountFormat43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice
 * TaxCreditRateFormat9Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice
 * SolicitationFeeRateFormat9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountAndRateStatus2
 * AmountAndRateStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalAmountDetails1
 * OriginalAmountDetails1}</li>
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
 * "RateAndAmount"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission."
 * </li>
 * </ul>
 */
public class RateAndAmount {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend information for which a final dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#FinalDividend
	 * Dividend.FinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a final dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FinalDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinalDividendParameters";
			definition = "Dividend information for which a final dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FinalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a fully franked rate and amount is
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#FullyFrankedRateAndAmount
	 * Dividend.FullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedRateAndAmountDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a fully franked rate and amount is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FullyFrankedRateAndAmountDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FullyFrankedRateAndAmountDividendParameters";
			definition = "Dividend information for which a fully franked rate and amount is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a gross dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#GrossDividend
	 * Dividend.GrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a gross dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd GrossDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "GrossDividendParameters";
			definition = "Dividend information for which a gross dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.GrossDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value expressed as an amount.
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
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice#Amount
	 * RateAndAmountFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat2Choice#Amount
	 * GrossDividendRateFormat2Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice#Amount
	 * TaxCreditRateFormat2Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#FullyFrankedAmount
	 * CorporateActionAmounts2.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice#Amount
	 * RateAndAmountFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat3Choice#Amount
	 * GrossDividendRateFormat3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice#Amount
	 * TaxCreditRateFormat3Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#FullyFrankedAmount
	 * CorporateActionAmounts5.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#FullyFrankedAmount
	 * CorporateActionAmounts11.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#FullyFrankedAmount
	 * CorporateActionAmounts12.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#FullyFrankedAmount
	 * CorporateActionAmounts17.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#FullyFrankedAmount
	 * CorporateActionAmounts20.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat10Choice#Amount
	 * GrossDividendRateFormat10Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#FullyFrankedAmount
	 * CorporateActionAmounts23.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat8Choice#Amount
	 * GrossDividendRateFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat11Choice#Amount
	 * GrossDividendRateFormat11Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#FullyFrankedAmount
	 * CorporateActionAmounts24.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat12Choice#Amount
	 * GrossDividendRateFormat12Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice#Amount
	 * RateAndAmountFormat18Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat1Choice#Amount
	 * GrossDividendRateFormat1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice#Amount
	 * TaxCreditRateFormat1Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#FullyFrankedAmount
	 * CorporateActionAmounts3.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat4Choice#Amount
	 * GrossDividendRateFormat4Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice#Amount
	 * TaxCreditRateFormat4Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#FullyFrankedAmount
	 * CorporateActionAmounts6.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat5Choice#Amount
	 * GrossDividendRateFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#FullyFrankedAmount
	 * CorporateActionAmounts9.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice#Amount
	 * TaxCreditRateFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat6Choice#Amount
	 * GrossDividendRateFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#FullyFrankedAmount
	 * CorporateActionAmounts13.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice#Amount
	 * TaxCreditRateFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#FullyFrankedAmount
	 * CorporateActionAmounts16.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#FullyFrankedAmount
	 * CorporateActionAmounts19.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat9Choice#Amount
	 * GrossDividendRateFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#FullyFrankedAmount
	 * CorporateActionAmounts22.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat7Choice#Amount
	 * GrossDividendRateFormat7Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#Amount
	 * SolicitationFeeRateFormat5Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat8Choice#Amount
	 * RateFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat13Choice#Amount
	 * GrossDividendRateFormat13Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#FullyFrankedAmount
	 * CorporateActionAmounts25.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat14Choice#Amount
	 * GrossDividendRateFormat14Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#Amount
	 * SolicitationFeeRateFormat6Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat9Choice#Amount
	 * RateFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#FullyFrankedAmount
	 * CorporateActionAmounts4.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#FullyFrankedAmount
	 * CorporateActionAmounts7.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#FullyFrankedAmount
	 * CorporateActionAmounts10.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#FullyFrankedAmount
	 * CorporateActionAmounts14.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#FullyFrankedAmount
	 * CorporateActionAmounts15.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#FullyFrankedAmount
	 * CorporateActionAmounts18.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#FullyFrankedAmount
	 * CorporateActionAmounts21.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#FullyFrankedAmount
	 * CorporateActionAmounts26.FullyFrankedAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1#Amount
	 * RelatedTaxType1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.GrossDividendRate2#Amount
	 * GrossDividendRate2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#FullyFrankedAmount
	 * CorporateActionAmounts1.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#FullyFrankedAmount
	 * CorporateActionAmounts29.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#FullyFrankedAmount
	 * CorporateActionAmounts27.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#FullyFrankedAmount
	 * CorporateActionAmounts28.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#FullyFrankedAmount
	 * CorporateActionAmounts33.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#FullyFrankedAmount
	 * CorporateActionAmounts32.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#FullyFrankedAmount
	 * CorporateActionAmounts35.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice#Amount
	 * RateAndAmountFormat36Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice#Amount
	 * TaxCreditRateFormat7Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice#Amount
	 * RateAndAmountFormat39Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#FullyFrankedAmount
	 * CorporateActionAmounts37.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#Amount
	 * SolicitationFeeRateFormat7Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice#Amount
	 * TaxCreditRateFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#FullyFrankedAmount
	 * CorporateActionAmounts36.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat20Choice#Amount
	 * RateFormat20Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat19Choice#Amount
	 * GrossDividendRateFormat19Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus1#Amount
	 * AmountAndRateStatus1.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat21Choice#Amount
	 * GrossDividendRateFormat21Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat20Choice#Amount
	 * GrossDividendRateFormat20Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat22Choice#Amount
	 * GrossDividendRateFormat22Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#Amount
	 * SolicitationFeeRateFormat8Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#FullyFrankedAmount
	 * CorporateActionAmounts38.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#FullyFrankedAmount
	 * CorporateActionAmounts39.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateFormat21Choice#Amount
	 * RateFormat21Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#FullyFrankedAmount
	 * CorporateActionAmounts41.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#Amount
	 * SolicitationFeeRateFormat10Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#FullyFrankedAmount
	 * CorporateActionAmounts40.FullyFrankedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice#Amount
	 * TaxCreditRateFormat10Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice#Amount
	 * RateAndAmountFormat43Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat26Choice#Amount
	 * GrossDividendRateFormat26Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat23Choice#Amount
	 * GrossDividendRateFormat23Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat24Choice#Amount
	 * GrossDividendRateFormat24Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice#Amount
	 * TaxCreditRateFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#Amount
	 * SolicitationFeeRateFormat9Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRateFormat25Choice#Amount
	 * GrossDividendRateFormat25Choice.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndRateStatus2#Amount
	 * AmountAndRateStatus2.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#ActualAmount
	 * OriginalAmountDetails1.ActualAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#MinimumAmount
	 * OriginalAmountDetails1.MinimumAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalAmountDetails1#MaximumAmount
	 * OriginalAmountDetails1.MaximumAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as an amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateAndAmountFormat5Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat2Choice.Amount,
					com.tools20022.repository.choice.TaxCreditRateFormat2Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts2.FullyFrankedAmount, com.tools20022.repository.choice.RateAndAmountFormat6Choice.Amount,
					com.tools20022.repository.choice.GrossDividendRateFormat3Choice.Amount, com.tools20022.repository.choice.TaxCreditRateFormat3Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts5.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts11.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts12.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts17.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts20.FullyFrankedAmount,
					com.tools20022.repository.choice.GrossDividendRateFormat10Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts23.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat8Choice.Amount,
					com.tools20022.repository.choice.GrossDividendRateFormat11Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts24.FullyFrankedAmount,
					com.tools20022.repository.choice.GrossDividendRateFormat12Choice.Amount, com.tools20022.repository.choice.RateAndAmountFormat18Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat1Choice.Amount,
					com.tools20022.repository.choice.TaxCreditRateFormat1Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts3.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat4Choice.Amount,
					com.tools20022.repository.choice.TaxCreditRateFormat4Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts6.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat5Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts9.FullyFrankedAmount, com.tools20022.repository.choice.TaxCreditRateFormat5Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat6Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts13.FullyFrankedAmount, com.tools20022.repository.choice.TaxCreditRateFormat6Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts16.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts19.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat9Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts22.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat7Choice.Amount,
					com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice.Amount, com.tools20022.repository.choice.RateFormat8Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat13Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts25.FullyFrankedAmount, com.tools20022.repository.choice.GrossDividendRateFormat14Choice.Amount,
					com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice.Amount, com.tools20022.repository.choice.RateFormat9Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts4.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts7.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts10.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts14.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts15.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts18.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts21.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts26.FullyFrankedAmount, com.tools20022.repository.msg.RelatedTaxType1.Amount, com.tools20022.repository.msg.GrossDividendRate2.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts1.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts29.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts27.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts28.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts32.FullyFrankedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts35.FullyFrankedAmount, com.tools20022.repository.choice.RateAndAmountFormat36Choice.Amount, com.tools20022.repository.choice.TaxCreditRateFormat7Choice.Amount,
					com.tools20022.repository.choice.RateAndAmountFormat39Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts37.FullyFrankedAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice.Amount,
					com.tools20022.repository.choice.TaxCreditRateFormat8Choice.Amount, com.tools20022.repository.msg.CorporateActionAmounts36.FullyFrankedAmount, com.tools20022.repository.choice.RateFormat20Choice.Amount,
					com.tools20022.repository.choice.GrossDividendRateFormat19Choice.Amount, com.tools20022.repository.msg.AmountAndRateStatus1.Amount, com.tools20022.repository.choice.GrossDividendRateFormat21Choice.Amount,
					com.tools20022.repository.choice.GrossDividendRateFormat20Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat22Choice.Amount, com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts38.FullyFrankedAmount, com.tools20022.repository.msg.CorporateActionAmounts39.FullyFrankedAmount, com.tools20022.repository.choice.RateFormat21Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts41.FullyFrankedAmount, com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice.Amount,
					com.tools20022.repository.msg.CorporateActionAmounts40.FullyFrankedAmount, com.tools20022.repository.choice.TaxCreditRateFormat10Choice.Amount, com.tools20022.repository.choice.RateAndAmountFormat43Choice.Amount,
					com.tools20022.repository.choice.GrossDividendRateFormat26Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat23Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat24Choice.Amount,
					com.tools20022.repository.choice.TaxCreditRateFormat9Choice.Amount, com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice.Amount, com.tools20022.repository.choice.GrossDividendRateFormat25Choice.Amount,
					com.tools20022.repository.msg.AmountAndRateStatus2.Amount, com.tools20022.repository.msg.OriginalAmountDetails1.ActualAmount, com.tools20022.repository.msg.OriginalAmountDetails1.MinimumAmount,
					com.tools20022.repository.msg.OriginalAmountDetails1.MaximumAmount);
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Value expressed as an amount.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Index for which a factor is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#IndexFactor
	 * Index.IndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Index for which a factor is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Index = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Index for which a factor is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Index.IndexFactor;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a net dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#NetDividend
	 * Dividend.NetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a net dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NetDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetDividendParameters";
			definition = "Dividend information for which a net dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.NetDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Bidding conditions for which a maximum amount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#MaximumAllowedOverSubscription
	 * BiddingConditions.MaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum amount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd MaximumAllowedBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAllowedBiddingConditions";
			definition = "Bidding conditions for which a maximum amount is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Dividend information for which a provisional dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#ProvisionalDividend
	 * Dividend.ProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividendParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend information for which a provisional dividend rate is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ProvisionalDividendParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProvisionalDividendParameters";
			definition = "Dividend information for which a provisional dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.ProvisionalDividend;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which a solicitation fee is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#SolicitationFee
	 * CorporateActionFeesAndCharges.SolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which a solicitation fee is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which a solicitation fee is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Value expressed as a rate.
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
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat5Choice#Rate
	 * RateAndAmountFormat5Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat2Choice#Rate
	 * TaxCreditRateFormat2Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat6Choice#Rate
	 * RateAndAmountFormat6Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat3Choice#Rate
	 * TaxCreditRateFormat3Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat18Choice#Rate
	 * RateAndAmountFormat18Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat3Choice#Rate
	 * RateFormat3Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat2Choice#Rate
	 * RateFormat2Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat1Choice#Rate
	 * TaxCreditRateFormat1Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice#Rate
	 * SolicitationFeeRateFormat1Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat4Choice#Rate
	 * TaxCreditRateFormat4Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice#Rate
	 * SolicitationFeeRateFormat2Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat6Choice#Rate
	 * RateFormat6Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice#Rate
	 * SolicitationFeeRateFormat3Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat5Choice#Rate
	 * TaxCreditRateFormat5Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice#Rate
	 * SolicitationFeeRateFormat4Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat6Choice#Rate
	 * TaxCreditRateFormat6Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice#Rate
	 * SolicitationFeeRateFormat5Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat8Choice#Rate
	 * RateFormat8Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice#Rate
	 * SolicitationFeeRateFormat6Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat9Choice#Rate
	 * RateFormat9Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat5Choice#Rate
	 * RateFormat5Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice#RateValue
	 * RateOrAbsoluteValue1Choice.RateValue}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat1Choice#Rate
	 * RateFormat1Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat10Choice#Rate
	 * RateFormat10Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat12Choice#Rate
	 * RateFormat12Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat11Choice#Rate
	 * RateFormat11Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat14Choice#Rate
	 * RateFormat14Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat17Choice#Rate
	 * RateFormat17Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice#Rate
	 * RateAndAmountFormat36Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat7Choice#Rate
	 * TaxCreditRateFormat7Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat39Choice#Rate
	 * RateAndAmountFormat39Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice#Rate
	 * SolicitationFeeRateFormat7Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat8Choice#Rate
	 * TaxCreditRateFormat8Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat20Choice#Rate
	 * RateFormat20Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice#Rate
	 * SolicitationFeeRateFormat8Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateFormat21Choice#Rate
	 * RateFormat21Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice#Rate
	 * SolicitationFeeRateFormat10Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat10Choice#Rate
	 * TaxCreditRateFormat10Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat43Choice#Rate
	 * RateAndAmountFormat43Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCreditRateFormat9Choice#Rate
	 * TaxCreditRateFormat9Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice#Rate
	 * SolicitationFeeRateFormat9Choice.Rate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value expressed as a rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateAndAmountFormat5Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat2Choice.Rate,
					com.tools20022.repository.choice.RateAndAmountFormat6Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat3Choice.Rate, com.tools20022.repository.choice.RateAndAmountFormat18Choice.Rate,
					com.tools20022.repository.choice.RateFormat3Choice.Rate, com.tools20022.repository.choice.RateFormat2Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat1Choice.Rate,
					com.tools20022.repository.choice.SolicitationFeeRateFormat1Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat4Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat2Choice.Rate,
					com.tools20022.repository.choice.RateFormat6Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat3Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat5Choice.Rate,
					com.tools20022.repository.choice.SolicitationFeeRateFormat4Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat6Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat5Choice.Rate,
					com.tools20022.repository.choice.RateFormat8Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat6Choice.Rate, com.tools20022.repository.choice.RateFormat9Choice.Rate,
					com.tools20022.repository.choice.RateFormat5Choice.Rate, com.tools20022.repository.choice.RateOrAbsoluteValue1Choice.RateValue, com.tools20022.repository.choice.RateFormat1Choice.Rate,
					com.tools20022.repository.choice.RateFormat10Choice.Rate, com.tools20022.repository.choice.RateFormat12Choice.Rate, com.tools20022.repository.choice.RateFormat11Choice.Rate,
					com.tools20022.repository.choice.RateFormat14Choice.Rate, com.tools20022.repository.choice.RateFormat17Choice.Rate, com.tools20022.repository.choice.RateAndAmountFormat36Choice.Rate,
					com.tools20022.repository.choice.TaxCreditRateFormat7Choice.Rate, com.tools20022.repository.choice.RateAndAmountFormat39Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat7Choice.Rate,
					com.tools20022.repository.choice.TaxCreditRateFormat8Choice.Rate, com.tools20022.repository.choice.RateFormat20Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat8Choice.Rate,
					com.tools20022.repository.choice.RateFormat21Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat10Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat10Choice.Rate,
					com.tools20022.repository.choice.RateAndAmountFormat43Choice.Rate, com.tools20022.repository.choice.TaxCreditRateFormat9Choice.Rate, com.tools20022.repository.choice.SolicitationFeeRateFormat9Choice.Rate);
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Value expressed as a rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Bidding conditions for which a rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#ApplicableRate
	 * BiddingConditions.ApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bidding conditions for which a rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RateBiddingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateBiddingConditions";
			definition = "Bidding conditions for which a rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> BiddingConditions.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.ApplicableRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax for which a percentage of the gross dividend rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#RelatedTax
	 * SecuritiesTax.RelatedTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTax
	 * SecuritiesTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax for which a percentage of the gross dividend rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesTax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTax";
			definition = "Tax for which a percentage of the gross dividend rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTax.RelatedTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Corporate event for which an early solicitation fee is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#EarlySolicitationFeeRate
	 * CorporateActionFeesAndCharges.EarlySolicitationFeeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges
	 * CorporateActionFeesAndCharges}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlySolicitationFeeCorporateActionParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event for which an early solicitation fee is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd EarlySolicitationFeeCorporateActionParameters = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EarlySolicitationFeeCorporateActionParameters";
			definition = "Corporate event for which an early solicitation fee is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionFeesAndCharges.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which an interest shortfall has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#InterestShortfall
	 * Issuance.InterestShortfall}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuance for which an interest shortfall has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestRelatedIssuance";
			definition = "Issuance for which an interest shortfall has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.InterestShortfall;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Issuance for which a realised loss has been specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#RealisedLoss
	 * Issuance.RealisedLoss}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LossRelatedIssuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a realised loss has been specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd LossRelatedIssuance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "LossRelatedIssuance";
			definition = "Issuance for which a realised loss has been specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Issuance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.RealisedLoss;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Absolute value determined with a number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateOrAbsoluteValue1Choice#AbsoluteValue
	 * RateOrAbsoluteValue1Choice.AbsoluteValue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbsoluteValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Absolute value determined with a number."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute AbsoluteValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateOrAbsoluteValue1Choice.AbsoluteValue);
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AbsoluteValue";
			definition = "Absolute value determined with a number.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Provides the relationship between a variable and a fixed value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.OperatorCode
	 * OperatorCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Operator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the relationship between a variable and a fixed value."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Operator = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Operator";
			definition = "Provides the relationship between a variable and a fixed value.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> OperatorCode.mmObject();
		}
	};
	/**
	 * Yield calculation which uses a yield range.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#YieldRange
	 * YieldCalculation.YieldRange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RateAndAmount RateAndAmount}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedYieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Yield calculation which uses a yield range."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedYieldCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> RateAndAmount.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedYieldCalculation";
			definition = "Yield calculation which uses a yield range.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> YieldCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.YieldRange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RateAndAmount";
				definition = "Specifies the value expressed as a rate or an amount. For example, the value of a tax or a commission.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Dividend.FinalDividend, com.tools20022.repository.entity.Dividend.FullyFrankedRateAndAmount,
						com.tools20022.repository.entity.Dividend.GrossDividend, com.tools20022.repository.entity.Dividend.NetDividend, com.tools20022.repository.entity.Dividend.ProvisionalDividend,
						com.tools20022.repository.entity.SecuritiesTax.RelatedTax, com.tools20022.repository.entity.Issuance.InterestShortfall, com.tools20022.repository.entity.Issuance.RealisedLoss,
						com.tools20022.repository.entity.Index.IndexFactor, com.tools20022.repository.entity.BiddingConditions.MaximumAllowedOverSubscription, com.tools20022.repository.entity.BiddingConditions.ApplicableRate,
						com.tools20022.repository.entity.CorporateActionFeesAndCharges.SolicitationFee, com.tools20022.repository.entity.CorporateActionFeesAndCharges.EarlySolicitationFeeRate,
						com.tools20022.repository.entity.YieldCalculation.YieldRange);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.GrossDividendRateFormat19Choice.AmountAndRateStatus, com.tools20022.repository.msg.AmountAndRateStatus1.RateStatus,
						com.tools20022.repository.choice.NetDividendRateFormat21Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat23Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat21Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat22Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat20Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat24Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat22Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat28Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat26Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat25Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat23Choice.AmountAndRateStatus, com.tools20022.repository.choice.GrossDividendRateFormat24Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.NetDividendRateFormat26Choice.AmountAndRateStatus, com.tools20022.repository.choice.NetDividendRateFormat27Choice.AmountAndRateStatus,
						com.tools20022.repository.choice.GrossDividendRateFormat25Choice.AmountAndRateStatus, com.tools20022.repository.msg.AmountAndRateStatus2.RateStatus);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RateAndAmount.FinalDividendParameters, com.tools20022.repository.entity.RateAndAmount.FullyFrankedRateAndAmountDividendParameters,
						com.tools20022.repository.entity.RateAndAmount.GrossDividendParameters, com.tools20022.repository.entity.RateAndAmount.Amount, com.tools20022.repository.entity.RateAndAmount.Index,
						com.tools20022.repository.entity.RateAndAmount.NetDividendParameters, com.tools20022.repository.entity.RateAndAmount.MaximumAllowedBiddingConditions,
						com.tools20022.repository.entity.RateAndAmount.ProvisionalDividendParameters, com.tools20022.repository.entity.RateAndAmount.SolicitationFeeCorporateActionParameters,
						com.tools20022.repository.entity.RateAndAmount.Rate, com.tools20022.repository.entity.RateAndAmount.RateBiddingConditions, com.tools20022.repository.entity.RateAndAmount.SecuritiesTax,
						com.tools20022.repository.entity.RateAndAmount.EarlySolicitationFeeCorporateActionParameters, com.tools20022.repository.entity.RateAndAmount.InterestRelatedIssuance,
						com.tools20022.repository.entity.RateAndAmount.LossRelatedIssuance, com.tools20022.repository.entity.RateAndAmount.AbsoluteValue, com.tools20022.repository.entity.RateAndAmount.Operator,
						com.tools20022.repository.entity.RateAndAmount.RelatedYieldCalculation);
				derivationComponent_lazy = () -> Arrays.asList(RateAndAmountFormat12Choice.mmObject(), RateAndAmountFormat13Choice.mmObject(), RateAndAmountFormat5Choice.mmObject(), TaxCreditRateFormat2Choice.mmObject(),
						RateAndAmountFormat6Choice.mmObject(), TaxCreditRateFormat3Choice.mmObject(), RateAndAmountFormat18Choice.mmObject(), RateFormat3Choice.mmObject(), RateFormat2Choice.mmObject(),
						TaxCreditRateFormat1Choice.mmObject(), SolicitationFeeRateFormat1Choice.mmObject(), TaxCreditRateFormat4Choice.mmObject(), SolicitationFeeRateFormat2Choice.mmObject(), RateFormat6Choice.mmObject(),
						SolicitationFeeRateFormat3Choice.mmObject(), TaxCreditRateFormat5Choice.mmObject(), SolicitationFeeRateFormat4Choice.mmObject(), TaxCreditRateFormat6Choice.mmObject(), SolicitationFeeRateFormat5Choice.mmObject(),
						RateFormat8Choice.mmObject(), SolicitationFeeRateFormat6Choice.mmObject(), RateFormat9Choice.mmObject(), RateFormat5Choice.mmObject(), RateFormat7Choice.mmObject(), RateOrAbsoluteValue1Choice.mmObject(),
						RateFormat1Choice.mmObject(), RelatedTaxType1.mmObject(), RateFormat10Choice.mmObject(), RateFormat12Choice.mmObject(), RateFormat11Choice.mmObject(), RateFormat14Choice.mmObject(), RateFormat17Choice.mmObject(),
						RateAndAmountFormat36Choice.mmObject(), TaxCreditRateFormat7Choice.mmObject(), RateAndAmountFormat39Choice.mmObject(), SolicitationFeeRateFormat7Choice.mmObject(), TaxCreditRateFormat8Choice.mmObject(),
						RateFormat20Choice.mmObject(), AmountAndRateStatus1.mmObject(), SolicitationFeeRateFormat8Choice.mmObject(), RateFormat21Choice.mmObject(), SolicitationFeeRateFormat10Choice.mmObject(),
						TaxCreditRateFormat10Choice.mmObject(), RateAndAmountFormat43Choice.mmObject(), TaxCreditRateFormat9Choice.mmObject(), SolicitationFeeRateFormat9Choice.mmObject(), AmountAndRateStatus2.mmObject(),
						OriginalAmountDetails1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}