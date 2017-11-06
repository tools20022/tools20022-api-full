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
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Tax" src="doc-files/Tax.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
 * Tax.mmExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableParty
 * Tax.mmTaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmBasis Tax.mmBasis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmSecuritiesTransfer
 * Tax.mmSecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxRateType
 * Tax.mmTaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
 * Tax.mmTaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
 * Tax.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdjustment
 * Tax.mmAdjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmInterest
 * Tax.mmInterest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmIdentification
 * Tax.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedPaymentSettlement
 * Tax.mmRelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
 * Tax.mmTaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
 * Tax.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmAdministrationZone
 * Tax.mmAdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmMethod Tax.mmMethod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmRecord Tax.mmRecord}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmProduct Tax.mmProduct}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrency
 * Tax.mmCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmPartyRole
 * Tax.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxDeduction
 * Tax.mmTaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmRelatedCorporateActionDistribution
 * Tax.mmRelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCalculationDate
 * Tax.mmCalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmDividend
 * Tax.mmDividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmWithholdingTaxType
 * Tax.mmWithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCorporateActionEvent
 * Tax.mmCorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmTaxIdentificationType
 * Tax.mmTaxIdentificationType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#mmTax Country.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#mmTax
 * Dividend.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
 * Party.mmTaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmTax
 * CashAccount.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#mmTax Product.mmTax}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#mmTax
 * Adjustment.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
 * Payment.mmTaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
 * SecuritiesTransfer.mmTransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
 * Interest.mmInterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
 * CorporateActionEvent.mmTransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
 * TaxPartyRole.mmTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
 * TaxRecord.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
 * Distribution.mmDistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmAdditionalTax
 * CorporateActionRate4.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmAdditionalTax
 * CorporateActionRate10.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmAdditionalTax
 * CorporateActionRate20.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmAdditionalTax
 * CorporateActionRate22.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmAdditionalTax
 * CorporateActionRate26.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmAdditionalTax
 * CorporateActionRate31.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmAdditionalTax
 * CorporateActionRate38.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmAdditionalTax
 * CorporateActionRate39.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmAdditionalTax
 * CorporateActionRate5.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmAdditionalTax
 * CorporateActionRate12.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmAdditionalTax
 * CorporateActionRate15.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmAdditionalTax
 * CorporateActionRate18.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmAdditionalTax
 * CorporateActionRate25.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmAdditionalTax
 * CorporateActionRate30.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmAdditionalTax
 * CorporateActionRate37.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmAdditionalTax
 * CorporateActionRate40.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmAdditionalTax
 * CorporateActionRate36.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmAdditionalTax
 * CorporateActionRate42.mmAdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxDetails#mmTaxType
 * TaxDetails.mmTaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxTypeInformation
 * TaxInformation2.mmTaxTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax1
 * CorporateActionRate2.mmGermanLocalTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax2
 * CorporateActionRate2.mmGermanLocalTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax3
 * CorporateActionRate2.mmGermanLocalTax3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax4
 * CorporateActionRate2.mmGermanLocalTax4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalTax
 * CorporateActionRate2.mmAdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3#mmTaxExemptionReason
 * TaxParty3.mmTaxExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#mmRate
 * BillingServicesTax1.mmRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax2#mmRate
 * BillingServicesTax2.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodA
 * BillingMethod1Choice.mmMethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodB
 * BillingMethod1Choice.mmMethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#mmMethodD
 * BillingMethod1Choice.mmMethodD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax3#mmRate
 * BillingServicesTax3.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BillingMethod4#mmTaxCalculation
 * BillingMethod4.mmTaxCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmMethodC
 * BillingTaxRegion1.mmMethodC}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmTaxType
 * Tax18.mmTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmTaxType
 * Tax19.mmTaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmAdditionalTax
 * CorporateActionRate46.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmAdditionalTax
 * CorporateActionRate45.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmAdditionalTax
 * CorporateActionRate44.mmAdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax23#mmAmountOrPercentage
 * Tax23.mmAmountOrPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmAdditionalTax
 * CorporateActionRate60.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmAdditionalTax
 * CorporateActionRate64.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmAdditionalTax
 * CorporateActionRate57.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmAdditionalTax
 * CorporateActionRate68.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmAdditionalTax
 * CorporateActionRate70.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmAdditionalTax
 * CorporateActionRate67.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmAdditionalTax
 * CorporateActionRate74.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmAdditionalTax
 * CorporateActionRate79.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmAdditionalTax
 * CorporateActionRate76.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#mmSubTotalCalculatedTax
 * TradeSettlement2.mmSubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmAdditionalTax
 * CorporateActionRate82.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmAdditionalTax
 * CorporateActionRate80.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmAdditionalTax
 * CorporateActionRate81.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmAdditionalTax
 * CorporateActionRate83.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmAdditionalTax
 * CorporateActionRate84.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmAdditionalTax
 * CorporateActionRate85.mmAdditionalTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice
 * TaxExemptionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxTypeFormat2Choice
 * TaxTypeFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice
 * TaxExemptionReasonFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax3 Tax3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType10Choice
 * RateType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType11Choice
 * RateType11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType12Choice
 * RateType12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType14Choice
 * RateType14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges1 TaxCharges1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxType TaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxDetails TaxDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation2
 * TaxInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2 TaxCharges2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecordDetails1
 * TaxRecordDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1 TaxAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3
 * TaxInformation3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxAmountType1Choice
 * TaxAmountType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1
 * TaxAmountAndType1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxationBasis1 TaxationBasis1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxExemptionReason1
 * TaxExemptionReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxType3FormatChoice
 * TaxType3FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice
 * TaxTypeFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementTax1 SettlementTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
 * SettlementSubTotalCalculatedTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax13 Tax13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax12 Tax12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1 AccountTax1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReason1 TaxReason1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod1 BillingMethod1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod2 BillingMethod2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod3 BillingMethod3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BillingMethod1Choice
 * BillingMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxCalculation1
 * TaxCalculation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4 BillingMethod4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1
 * BillingTaxRegion1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxDetailsType1Choice
 * TaxDetailsType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxIdentification1
 * TaxIdentification1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxType1Choice
 * TaxType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.ExemptionReason1Choice
 * ExemptionReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxBasis1Choice
 * TaxBasis1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate1
 * RateTypeAndPercentageRate1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType28Choice
 * RateType28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4
 * TaxInformation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax22 Tax22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxType2Choice
 * TaxType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax23 Tax23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType30Choice
 * RateType30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3
 * RateTypeAndPercentageRate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxIdentification2
 * TaxIdentification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TaxIdentificationType1Choice
 * TaxIdentificationType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8
 * RateTypeAndPercentageRate8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType42Choice
 * RateType42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType37Choice
 * RateType37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice
 * TaxExemptionReason2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate9
 * RateTypeAndPercentageRate9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType46Choice
 * RateType46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType48Choice
 * RateType48Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
 * SettlementSubTotalCalculatedTax2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
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
 * "Tax"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * </ul>
 */
public class Tax {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected TaxExemptReasonCode exemptionReason;
	/**
	 * Reason for a tax exemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReasonCode
	 * TaxExemptReasonCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmTaxExemptionReason
	 * InvestmentAccount17.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#mmExtendedTaxExemptionReason
	 * InvestmentAccount17.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmTaxExemptionReason
	 * InvestmentAccount27.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#mmExtendedTaxExemptionReason
	 * InvestmentAccount27.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice#mmCode
	 * TaxExemptionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice#mmProprietary
	 * TaxExemptionReason1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmTaxExemptionReason
	 * InvestmentAccount18.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedTaxExemptionReason
	 * InvestmentAccount18.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmTaxExemptionReason
	 * InvestmentAccount28.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#mmExtendedTaxExemptionReason
	 * InvestmentAccount28.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmTaxExemptionReason
	 * InvestmentAccount16.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#mmExtendedTaxExemptionReason
	 * InvestmentAccount16.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmTaxExemptionReason
	 * InvestmentAccount26.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#mmExtendedTaxExemptionReason
	 * InvestmentAccount26.mmExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmUnstructured
	 * TaxExemptionReasonFormatChoice.mmUnstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#mmStructured
	 * TaxExemptionReasonFormatChoice.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#mmExemptionReason
	 * Tax3.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExemptionReason
	 * Tax15.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax15#mmExtendedExemptionReason
	 * Tax15.mmExtendedExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmExemptionReason
	 * Tax6.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmExemptionReason
	 * Tax16.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax16#mmExtendedExemptionReason
	 * Tax16.mmExtendedExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#mmExemptionReason
	 * Tax7.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmExemptionReason
	 * Tax14.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax14#mmExtendedExemptionReason
	 * Tax14.mmExtendedExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmExemptionReason
	 * SettlementSubTotalCalculatedTax1.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReasonType1Choice#mmExemptionReason
	 * ExemptionReasonType1Choice.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReasonType1Choice#mmProprietary
	 * ExemptionReasonType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax18#mmExemptionReasonType
	 * Tax18.mmExemptionReasonType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax19#mmExemptionReasonType
	 * Tax19.mmExemptionReasonType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmExemptionReason
	 * Tax21.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#mmCode
	 * ExemptionReason1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#mmProprietary
	 * ExemptionReason1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#mmExemptionReason
	 * Tax25.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#mmCode
	 * TaxExemptionReason2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#mmProprietary
	 * TaxExemptionReason2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmExemptionReason
	 * Tax28.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmExemptionReason
	 * Tax32.mmExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmExemptionReason
	 * Tax30.mmExemptionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExemptionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.mmTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount17.mmExtendedTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount27.mmTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount27.mmExtendedTaxExemptionReason, com.tools20022.repository.choice.TaxExemptionReason1Choice.mmCode,
					com.tools20022.repository.choice.TaxExemptionReason1Choice.mmProprietary, com.tools20022.repository.msg.InvestmentAccount18.mmTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount18.mmExtendedTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount28.mmTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount28.mmExtendedTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount16.mmTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount16.mmExtendedTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount26.mmTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount26.mmExtendedTaxExemptionReason, com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.mmUnstructured,
					com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.mmStructured, com.tools20022.repository.msg.Tax3.mmExemptionReason, com.tools20022.repository.msg.Tax15.mmExemptionReason,
					com.tools20022.repository.msg.Tax15.mmExtendedExemptionReason, com.tools20022.repository.msg.Tax6.mmExemptionReason, com.tools20022.repository.msg.Tax16.mmExemptionReason,
					com.tools20022.repository.msg.Tax16.mmExtendedExemptionReason, com.tools20022.repository.msg.Tax7.mmExemptionReason, com.tools20022.repository.msg.Tax14.mmExemptionReason,
					com.tools20022.repository.msg.Tax14.mmExtendedExemptionReason, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmExemptionReason,
					com.tools20022.repository.choice.ExemptionReasonType1Choice.mmExemptionReason, com.tools20022.repository.choice.ExemptionReasonType1Choice.mmProprietary, com.tools20022.repository.msg.Tax18.mmExemptionReasonType,
					com.tools20022.repository.msg.Tax19.mmExemptionReasonType, com.tools20022.repository.msg.Tax21.mmExemptionReason, com.tools20022.repository.choice.ExemptionReason1Choice.mmCode,
					com.tools20022.repository.choice.ExemptionReason1Choice.mmProprietary, com.tools20022.repository.msg.Tax25.mmExemptionReason, com.tools20022.repository.choice.TaxExemptionReason2Choice.mmCode,
					com.tools20022.repository.choice.TaxExemptionReason2Choice.mmProprietary, com.tools20022.repository.msg.Tax28.mmExemptionReason, com.tools20022.repository.msg.Tax32.mmExemptionReason,
					com.tools20022.repository.msg.Tax30.mmExemptionReason);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}
	};
	protected Country country;
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#mmTax
	 * Country.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#mmTaxationCountry
	 * Organisation13.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#mmTaxationCountry
	 * IndividualPerson20.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmTaxationCountry
	 * IndividualPerson21.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#mmTaxationCountry
	 * IndividualPerson22.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#mmTaxationCountry
	 * Organisation15.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmTaxationCountry
	 * Organisation16.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#mmTaxationCountry
	 * Organisation17.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#mmTaxationCountry
	 * IndividualPerson23.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmTaxationCountry
	 * IndividualPerson24.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxationCountry
	 * TaxReporting1.mmTaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxationCountry
	 * TaxReporting2.mmTaxationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place of taxation of an individual person or an organisation, where the tax is due."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation13.mmTaxationCountry, com.tools20022.repository.msg.IndividualPerson20.mmTaxationCountry,
					com.tools20022.repository.msg.IndividualPerson21.mmTaxationCountry, com.tools20022.repository.msg.IndividualPerson22.mmTaxationCountry, com.tools20022.repository.msg.Organisation15.mmTaxationCountry,
					com.tools20022.repository.msg.Organisation16.mmTaxationCountry, com.tools20022.repository.msg.Organisation17.mmTaxationCountry, com.tools20022.repository.msg.IndividualPerson23.mmTaxationCountry,
					com.tools20022.repository.msg.IndividualPerson24.mmTaxationCountry, com.tools20022.repository.msg.TaxReporting1.mmTaxationCountry, com.tools20022.repository.msg.TaxReporting2.mmTaxationCountry);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected NetAssetValueCalculation taxLiabilityValueCalculation;
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
	 * NetAssetValueCalculation.mmTaxLiability}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiabilityValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax liability information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxTypeCode type;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#mmType Tax8.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmType Tax17.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmExtendedType
	 * Tax17.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat2Choice#mmStructured
	 * TaxTypeFormat2Choice.mmStructured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#mmType Tax3.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmType Tax15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedType
	 * Tax15.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmCode
	 * TaxAmountType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#mmProprietary
	 * TaxAmountType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#mmType
	 * TaxAmountAndType1.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#mmTaxType
	 * Product1.mmTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmType Tax6.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmType Tax16.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmExtendedType
	 * Tax16.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#mmType Tax7.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmType Tax14.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmExtendedType
	 * Tax14.mmExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#mmCode
	 * TaxType3FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#mmProprietary
	 * TaxType3FormatChoice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1#mmTaxType
	 * RelatedTaxType1.mmTaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#mmCode
	 * TaxTypeFormat1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#mmProprietary
	 * TaxTypeFormat1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementTax1#mmTypeCode
	 * SettlementTax1.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmTypeCode
	 * SettlementSubTotalCalculatedTax1.mmTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmTypeCode
	 * LineItemTax1.mmTypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmType Tax13.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmOtherTaxType
	 * Tax13.mmOtherTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax12#mmType Tax12.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax12#mmOtherTaxType
	 * Tax12.mmOtherTaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxDetailsType1Choice#mmType
	 * TaxDetailsType1Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxDetailsType1Choice#mmProprietary
	 * TaxDetailsType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax20#mmType Tax20.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType1Choice#mmCode
	 * TaxType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType1Choice#mmProprietary
	 * TaxType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmType Tax21.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax22#mmType Tax22.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType2Choice#mmType
	 * TaxType2Choice.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType2Choice#mmOtherTaxType
	 * TaxType2Choice.mmOtherTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax23#mmType Tax23.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#mmType Tax25.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmType Tax28.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#mmTaxType
	 * Product3.mmTaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmTypeCode
	 * SettlementSubTotalCalculatedTax2.mmTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmExemptionReasonCode
	 * SettlementSubTotalCalculatedTax2.mmExemptionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType3Choice#mmCode
	 * TaxType3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3Choice#mmProprietary
	 * TaxType3Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmType Tax32.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#mmType Tax30.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmType Tax31.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.mmType, com.tools20022.repository.msg.Tax17.mmType, com.tools20022.repository.msg.Tax17.mmExtendedType,
					com.tools20022.repository.choice.TaxTypeFormat2Choice.mmStructured, com.tools20022.repository.msg.Tax3.mmType, com.tools20022.repository.msg.Tax15.mmType, com.tools20022.repository.msg.Tax15.mmExtendedType,
					com.tools20022.repository.choice.TaxAmountType1Choice.mmCode, com.tools20022.repository.choice.TaxAmountType1Choice.mmProprietary, com.tools20022.repository.msg.TaxAmountAndType1.mmType,
					com.tools20022.repository.msg.Product1.mmTaxType, com.tools20022.repository.msg.Tax6.mmType, com.tools20022.repository.msg.Tax16.mmType, com.tools20022.repository.msg.Tax16.mmExtendedType,
					com.tools20022.repository.msg.Tax7.mmType, com.tools20022.repository.msg.Tax14.mmType, com.tools20022.repository.msg.Tax14.mmExtendedType, com.tools20022.repository.choice.TaxType3FormatChoice.mmCode,
					com.tools20022.repository.choice.TaxType3FormatChoice.mmProprietary, com.tools20022.repository.msg.RelatedTaxType1.mmTaxType, com.tools20022.repository.choice.TaxTypeFormat1Choice.mmCode,
					com.tools20022.repository.choice.TaxTypeFormat1Choice.mmProprietary, com.tools20022.repository.msg.SettlementTax1.mmTypeCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmTypeCode,
					com.tools20022.repository.msg.LineItemTax1.mmTypeCode, com.tools20022.repository.msg.Tax13.mmType, com.tools20022.repository.msg.Tax13.mmOtherTaxType, com.tools20022.repository.msg.Tax12.mmType,
					com.tools20022.repository.msg.Tax12.mmOtherTaxType, com.tools20022.repository.choice.TaxDetailsType1Choice.mmType, com.tools20022.repository.choice.TaxDetailsType1Choice.mmProprietary,
					com.tools20022.repository.msg.Tax20.mmType, com.tools20022.repository.choice.TaxType1Choice.mmCode, com.tools20022.repository.choice.TaxType1Choice.mmProprietary, com.tools20022.repository.msg.Tax21.mmType,
					com.tools20022.repository.msg.Tax22.mmType, com.tools20022.repository.choice.TaxType2Choice.mmType, com.tools20022.repository.choice.TaxType2Choice.mmOtherTaxType, com.tools20022.repository.msg.Tax23.mmType,
					com.tools20022.repository.msg.Tax25.mmType, com.tools20022.repository.msg.Tax28.mmType, com.tools20022.repository.msg.Product3.mmTaxType, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmTypeCode,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmExemptionReasonCode, com.tools20022.repository.choice.TaxType3Choice.mmCode, com.tools20022.repository.choice.TaxType3Choice.mmProprietary,
					com.tools20022.repository.msg.Tax32.mmType, com.tools20022.repository.msg.Tax30.mmType, com.tools20022.repository.msg.Tax31.mmType);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * Amount of money resulting from the calculation of the tax.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 878 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> ListBuilderForTax_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Rate used for calculation of the tax.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#mmRate Tax8.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#mmRate Tax17.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmFiscalStamp
	 * CorporateActionRate4.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmNonResidentRate
	 * CorporateActionRate4.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmTaxRelatedRate
	 * CorporateActionRate4.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmWithholdingTaxRate
	 * CorporateActionRate4.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmTaxOnIncome
	 * CorporateActionRate4.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmTaxOnProfits
	 * CorporateActionRate4.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#mmTaxReclaimRate
	 * CorporateActionRate4.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmFiscalStamp
	 * CorporateActionRate10.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmNonResidentRate
	 * CorporateActionRate10.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmTaxRelatedRate
	 * CorporateActionRate10.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmWithholdingTaxRate
	 * CorporateActionRate10.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmTaxOnIncome
	 * CorporateActionRate10.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmTaxOnProfits
	 * CorporateActionRate10.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#mmTaxReclaimRate
	 * CorporateActionRate10.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmTaxRelatedRate
	 * CorporateActionRate20.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#mmWithholdingTaxRate
	 * CorporateActionRate20.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmFiscalStamp
	 * RateDetails2.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxRelatedRate
	 * RateDetails2.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmWithholdingTaxRate
	 * RateDetails2.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxOnIncome
	 * RateDetails2.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxOnProfits
	 * RateDetails2.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#mmTaxReclaimRate
	 * RateDetails2.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmTaxRelatedRate
	 * CorporateActionRate22.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#mmWithholdingTaxRate
	 * CorporateActionRate22.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#mmFiscalStamp
	 * RateDetails4.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmTaxRelatedRate
	 * RateDetails4.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmWithholdingTaxRate
	 * RateDetails4.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#mmTaxOnIncome
	 * RateDetails4.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmTaxOnProfits
	 * RateDetails4.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#mmTaxReclaimRate
	 * RateDetails4.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmTaxRelatedRate
	 * CorporateActionRate26.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#mmWithholdingTaxRate
	 * CorporateActionRate26.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#mmFiscalStamp
	 * CorporateActionRate29.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#mmFiscalStamp
	 * RateDetails7.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmTaxRelatedRate
	 * RateDetails7.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmWithholdingTaxRate
	 * RateDetails7.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#mmTaxOnIncome
	 * RateDetails7.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmTaxOnProfits
	 * RateDetails7.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#mmTaxReclaimRate
	 * RateDetails7.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmTaxRelatedRate
	 * CorporateActionRate31.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#mmWithholdingTaxRate
	 * CorporateActionRate31.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#mmFiscalStamp
	 * CorporateActionRate34.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#mmFiscalStamp
	 * RateDetails9.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmTaxRelatedRate
	 * RateDetails9.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmWithholdingTaxRate
	 * RateDetails9.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#mmTaxOnIncome
	 * RateDetails9.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmTaxOnProfits
	 * RateDetails9.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#mmTaxReclaimRate
	 * RateDetails9.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmTaxRelatedRate
	 * CorporateActionRate38.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#mmWithholdingTaxRate
	 * CorporateActionRate38.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmFiscalStamp
	 * RateDetails11.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmTaxRelatedRate
	 * RateDetails11.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmWithholdingTaxRate
	 * RateDetails11.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmTaxOnIncome
	 * RateDetails11.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmTaxOnProfits
	 * RateDetails11.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#mmTaxReclaimRate
	 * RateDetails11.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmTaxRelatedRate
	 * CorporateActionRate39.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#mmWithholdingTaxRate
	 * CorporateActionRate39.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmFiscalStamp
	 * RateDetails12.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmTaxRelatedRate
	 * RateDetails12.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmWithholdingTaxRate
	 * RateDetails12.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmTaxOnIncome
	 * RateDetails12.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmTaxOnProfits
	 * RateDetails12.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#mmTaxReclaimRate
	 * RateDetails12.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmFiscalStamp
	 * CorporateActionRate5.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmNonResidentRate
	 * CorporateActionRate5.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmWithholdingTaxRate
	 * CorporateActionRate5.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxOnIncome
	 * CorporateActionRate5.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxOnProfits
	 * CorporateActionRate5.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxReclaimRate
	 * CorporateActionRate5.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#mmTaxRelatedRate
	 * CorporateActionRate5.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmFiscalStamp
	 * CorporateActionRate12.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmNonResidentRate
	 * CorporateActionRate12.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmWithholdingTaxRate
	 * CorporateActionRate12.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmTaxOnIncome
	 * CorporateActionRate12.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmTaxOnProfits
	 * CorporateActionRate12.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmTaxReclaimRate
	 * CorporateActionRate12.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#mmTaxRelatedRate
	 * CorporateActionRate12.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmWithholdingTaxRate
	 * CorporateActionRate15.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#mmTaxRelatedRate
	 * CorporateActionRate15.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmTaxRelatedRate
	 * RateDetails3.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmWithholdingTaxRate
	 * RateDetails3.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#mmFiscalStamp
	 * RateDetails3.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#mmTaxOnIncome
	 * RateDetails3.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmTaxOnProfits
	 * RateDetails3.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#mmTaxReclaimRate
	 * RateDetails3.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmWithholdingTaxRate
	 * CorporateActionRate18.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#mmTaxRelatedRate
	 * CorporateActionRate18.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmTaxRelatedRate
	 * RateDetails5.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmWithholdingTaxRate
	 * RateDetails5.mmWithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#mmFiscalStamp
	 * RateDetails5.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#mmTaxOnIncome
	 * RateDetails5.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmTaxOnProfits
	 * RateDetails5.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#mmTaxReclaimRate
	 * RateDetails5.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmWithholdingTaxRate
	 * CorporateActionRate25.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#mmTaxRelatedRate
	 * CorporateActionRate25.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#mmFiscalStamp
	 * CorporateActionRate28.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmWithholdingTaxRate
	 * CorporateActionRate30.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#mmTaxRelatedRate
	 * CorporateActionRate30.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#mmFiscalStamp
	 * CorporateActionRate33.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmWithholdingTaxRate
	 * CorporateActionRate37.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#mmTaxRelatedRate
	 * CorporateActionRate37.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxRelatedRate
	 * RateDetails10.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmWithholdingTaxRate
	 * RateDetails10.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmFiscalStamp
	 * RateDetails10.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxOnIncome
	 * RateDetails10.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxOnProfits
	 * RateDetails10.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#mmTaxReclaimRate
	 * RateDetails10.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmWithholdingTaxRate
	 * CorporateActionRate40.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#mmTaxRelatedRate
	 * CorporateActionRate40.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmTaxRelatedRate
	 * RateDetails13.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmWithholdingTaxRate
	 * RateDetails13.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmFiscalStamp
	 * RateDetails13.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmTaxOnIncome
	 * RateDetails13.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmTaxOnProfits
	 * RateDetails13.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#mmTaxReclaimRate
	 * RateDetails13.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmWithholdingTaxRate
	 * CorporateActionRate36.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#mmTaxRelatedRate
	 * CorporateActionRate36.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmWithholdingTaxRate
	 * CorporateActionRate42.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#mmTaxRelatedRate
	 * CorporateActionRate42.mmTaxRelatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission16#mmVATRate
	 * Commission16.mmVATRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges1#mmRate
	 * TaxCharges1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxType#mmRate
	 * TaxType.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#mmRate
	 * TaxCharges2.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#mmRate
	 * TaxAmount1.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#mmRate Tax6.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#mmRate Tax16.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#mmRate Tax7.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#mmRate Tax14.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingTax
	 * CorporateActionRate2.mmWithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnIncome
	 * CorporateActionRate2.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnProfit
	 * CorporateActionRate2.mmTaxOnProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxReclaim
	 * CorporateActionRate2.mmTaxReclaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFiscalStamp
	 * CorporateActionRate2.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNonResidentRate
	 * CorporateActionRate2.mmNonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCreditRate
	 * TaxVoucher1.mmTaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmWithholdingTaxRate
	 * TaxVoucher1.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCalculatedRate
	 * SettlementSubTotalCalculatedTax1.mmCalculatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmCalculatedRate
	 * LineItemTax1.mmCalculatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#mmRate Tax13.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#mmRate Tax18.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#mmRate Tax19.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate1#mmRate
	 * RateTypeAndPercentageRate1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmFiscalStamp
	 * RateDetails15.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmTaxRelatedRate
	 * RateDetails15.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmWithholdingTaxRate
	 * RateDetails15.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmTaxOnIncome
	 * RateDetails15.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmTaxOnProfits
	 * RateDetails15.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#mmTaxReclaimRate
	 * RateDetails15.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmTaxRelatedRate
	 * CorporateActionRate46.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#mmWithholdingTaxRate
	 * CorporateActionRate46.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmWithholdingTaxRate
	 * CorporateActionRate45.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmTaxRelatedRate
	 * CorporateActionRate45.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#mmTaxOnIncome
	 * CorporateActionRate45.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice#mmRate
	 * RateAndAmountFormat21Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmWithholdingTaxRate
	 * CorporateActionRate44.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmTaxRelatedRate
	 * CorporateActionRate44.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#mmTaxOnIncome
	 * CorporateActionRate44.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#mmFiscalStamp
	 * CorporateActionRate48.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#mmFiscalStamp
	 * CorporateActionRate49.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxRelatedRate
	 * RateDetails14.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmWithholdingTaxRate
	 * RateDetails14.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmFiscalStamp
	 * RateDetails14.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxOnIncome
	 * RateDetails14.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxOnProfits
	 * RateDetails14.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#mmTaxReclaimRate
	 * RateDetails14.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmWithholdingTaxRate
	 * CorporateActionRate60.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmTaxRelatedRate
	 * CorporateActionRate60.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#mmTaxOnIncome
	 * CorporateActionRate60.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#mmFiscalStamp
	 * CorporateActionRate58.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmTaxRelatedRate
	 * RateDetails18.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmWithholdingTaxRate
	 * RateDetails18.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmFiscalStamp
	 * RateDetails18.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmTaxOnIncome
	 * RateDetails18.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmTaxOnProfits
	 * RateDetails18.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#mmTaxReclaimRate
	 * RateDetails18.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3#mmRate
	 * RateTypeAndPercentageRate3.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmTaxRelatedRate
	 * CorporateActionRate64.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#mmWithholdingTaxRate
	 * CorporateActionRate64.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice#mmRate
	 * RateAndAmountFormat35Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice#mmRate
	 * RateAndAmountFormat32Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmFiscalStamp
	 * RateDetails21.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmTaxRelatedRate
	 * RateDetails21.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmWithholdingTaxRate
	 * RateDetails21.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmTaxOnIncome
	 * RateDetails21.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmTaxOnProfits
	 * RateDetails21.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#mmTaxReclaimRate
	 * RateDetails21.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#mmFiscalStamp
	 * CorporateActionRate65.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmWithholdingTaxRate
	 * CorporateActionRate57.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmTaxRelatedRate
	 * CorporateActionRate57.mmTaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#mmTaxOnIncome
	 * CorporateActionRate57.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#mmRate
	 * RateAndAmountFormat40Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#mmRate
	 * RateTypeAndPercentageRate8.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmFiscalStamp
	 * RateDetails23.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmWithholdingTaxRate
	 * RateDetails23.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmSecondLevelTax
	 * RateDetails23.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmTaxOnIncome
	 * RateDetails23.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmTaxOnProfits
	 * RateDetails23.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#mmTaxReclaimRate
	 * RateDetails23.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmWithholdingTaxRate
	 * CorporateActionRate68.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmSecondLevelTax
	 * CorporateActionRate68.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#mmTaxOnIncome
	 * CorporateActionRate68.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#mmFiscalStamp
	 * CorporateActionRate69.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmWithholdingTaxRate
	 * CorporateActionRate70.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#mmSecondLevelTax
	 * CorporateActionRate70.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmWithholdingTaxRate
	 * CorporateActionRate67.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmSecondLevelTax
	 * CorporateActionRate67.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#mmTaxOnIncome
	 * CorporateActionRate67.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmWithholdingTaxRate
	 * RateDetails22.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmSecondLevelTax
	 * RateDetails22.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmFiscalStamp
	 * RateDetails22.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxOnIncome
	 * RateDetails22.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxOnProfits
	 * RateDetails22.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#mmTaxReclaimRate
	 * RateDetails22.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#mmFiscalStamp
	 * CorporateActionRate72.mmFiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxRate
	 * TaxReporting1.mmTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#mmRate
	 * TreasuryProfile1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmWithholdingTaxRate
	 * CorporateActionRate74.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#mmSecondLevelTax
	 * CorporateActionRate74.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmWithholdingTaxRate
	 * CorporateActionRate79.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmSecondLevelTax
	 * CorporateActionRate79.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#mmTaxOnIncome
	 * CorporateActionRate79.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmFiscalStamp
	 * RateDetails24.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmWithholdingTaxRate
	 * RateDetails24.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmSecondLevelTax
	 * RateDetails24.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmTaxOnIncome
	 * RateDetails24.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmTaxOnProfits
	 * RateDetails24.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#mmTaxReclaimRate
	 * RateDetails24.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate9#mmRate
	 * RateTypeAndPercentageRate9.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmWithholdingTaxRate
	 * RateDetails25.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmSecondLevelTax
	 * RateDetails25.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmFiscalStamp
	 * RateDetails25.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmTaxOnIncome
	 * RateDetails25.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmTaxOnProfits
	 * RateDetails25.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#mmTaxReclaimRate
	 * RateDetails25.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmWithholdingTaxRate
	 * CorporateActionRate76.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmSecondLevelTax
	 * CorporateActionRate76.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#mmTaxOnIncome
	 * CorporateActionRate76.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#mmFiscalStamp
	 * CorporateActionRate77.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice#mmRate
	 * RateAndAmountFormat45Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#mmFiscalStamp
	 * CorporateActionRate75.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmCalculatedRate
	 * SettlementSubTotalCalculatedTax2.mmCalculatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#mmInformativeRate
	 * Tax32.mmInformativeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#mmAppliedRate
	 * Tax31.mmAppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#mmRate
	 * TaxAmountOrRate4Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRate
	 * TaxReporting2.mmTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmWithholdingTaxRate
	 * RateDetails26.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmSecondLevelTax
	 * RateDetails26.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmFiscalStamp
	 * RateDetails26.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxOnIncome
	 * RateDetails26.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxOnProfits
	 * RateDetails26.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#mmTaxReclaimRate
	 * RateDetails26.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmWithholdingTaxRate
	 * CorporateActionRate82.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#mmSecondLevelTax
	 * CorporateActionRate82.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmWithholdingTaxRate
	 * CorporateActionRate80.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmSecondLevelTax
	 * CorporateActionRate80.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#mmTaxOnIncome
	 * CorporateActionRate80.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmFiscalStamp
	 * RateDetails27.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmWithholdingTaxRate
	 * RateDetails27.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmSecondLevelTax
	 * RateDetails27.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxOnIncome
	 * RateDetails27.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxOnProfits
	 * RateDetails27.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#mmTaxReclaimRate
	 * RateDetails27.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmWithholdingTaxRate
	 * CorporateActionRate81.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmSecondLevelTax
	 * CorporateActionRate81.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#mmTaxOnIncome
	 * CorporateActionRate81.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmWithholdingTaxRate
	 * CorporateActionRate83.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmSecondLevelTax
	 * CorporateActionRate83.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#mmTaxOnIncome
	 * CorporateActionRate83.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmWithholdingTaxRate
	 * CorporateActionRate84.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmSecondLevelTax
	 * CorporateActionRate84.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#mmTaxOnIncome
	 * CorporateActionRate84.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmWithholdingTaxRate
	 * CorporateActionRate85.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#mmSecondLevelTax
	 * CorporateActionRate85.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmWithholdingTaxRate
	 * RateDetails28.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmSecondLevelTax
	 * RateDetails28.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmFiscalStamp
	 * RateDetails28.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxOnIncome
	 * RateDetails28.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxOnProfits
	 * RateDetails28.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#mmTaxReclaimRate
	 * RateDetails28.mmTaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmFiscalStamp
	 * RateDetails30.mmFiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmWithholdingTaxRate
	 * RateDetails30.mmWithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmSecondLevelTax
	 * RateDetails30.mmSecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmTaxOnIncome
	 * RateDetails30.mmTaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmTaxOnProfits
	 * RateDetails30.mmTaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#mmTaxReclaimRate
	 * RateDetails30.mmTaxReclaimRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for calculation of the tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.mmRate, com.tools20022.repository.msg.Tax17.mmRate, com.tools20022.repository.msg.CorporateActionRate4.mmFiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate4.mmNonResidentRate, com.tools20022.repository.msg.CorporateActionRate4.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate4.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate4.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate4.mmTaxOnProfits, com.tools20022.repository.msg.CorporateActionRate4.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate10.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate10.mmNonResidentRate, com.tools20022.repository.msg.CorporateActionRate10.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate10.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate10.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate10.mmTaxOnProfits,
					com.tools20022.repository.msg.CorporateActionRate10.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate20.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate20.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails2.mmFiscalStamp, com.tools20022.repository.msg.RateDetails2.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails2.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails2.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails2.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails2.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate22.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate22.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails4.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails4.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails4.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails4.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails4.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails4.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate26.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate26.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate29.mmFiscalStamp, com.tools20022.repository.msg.RateDetails7.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails7.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails7.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails7.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails7.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails7.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate31.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate31.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate34.mmFiscalStamp, com.tools20022.repository.msg.RateDetails9.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails9.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails9.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails9.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails9.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails9.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate38.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate38.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails11.mmFiscalStamp, com.tools20022.repository.msg.RateDetails11.mmTaxRelatedRate,
					com.tools20022.repository.msg.RateDetails11.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails11.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails11.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails11.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate39.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate39.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails12.mmFiscalStamp, com.tools20022.repository.msg.RateDetails12.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails12.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails12.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails12.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails12.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate5.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate5.mmNonResidentRate, com.tools20022.repository.msg.CorporateActionRate5.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate5.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate5.mmTaxOnProfits, com.tools20022.repository.msg.CorporateActionRate5.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate5.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate12.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate12.mmNonResidentRate,
					com.tools20022.repository.msg.CorporateActionRate12.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate12.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate12.mmTaxOnProfits,
					com.tools20022.repository.msg.CorporateActionRate12.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate12.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate15.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate15.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails3.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails3.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails3.mmFiscalStamp, com.tools20022.repository.msg.RateDetails3.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails3.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails3.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate18.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate18.mmTaxRelatedRate,
					com.tools20022.repository.msg.RateDetails5.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails5.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails5.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails5.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails5.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails5.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate25.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate25.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate28.mmFiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate30.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate30.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate33.mmFiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate37.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate37.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails10.mmTaxRelatedRate,
					com.tools20022.repository.msg.RateDetails10.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails10.mmFiscalStamp, com.tools20022.repository.msg.RateDetails10.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails10.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails10.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate40.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate40.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails13.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails13.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails13.mmFiscalStamp, com.tools20022.repository.msg.RateDetails13.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails13.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails13.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate36.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate36.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate42.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate42.mmTaxRelatedRate, com.tools20022.repository.msg.Commission16.mmVATRate,
					com.tools20022.repository.msg.TaxCharges1.mmRate, com.tools20022.repository.msg.TaxType.mmRate, com.tools20022.repository.msg.TaxCharges2.mmRate, com.tools20022.repository.msg.TaxAmount1.mmRate,
					com.tools20022.repository.msg.Tax6.mmRate, com.tools20022.repository.msg.Tax16.mmRate, com.tools20022.repository.msg.Tax7.mmRate, com.tools20022.repository.msg.Tax14.mmRate,
					com.tools20022.repository.msg.CorporateActionRate2.mmWithholdingTax, com.tools20022.repository.msg.CorporateActionRate2.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate2.mmTaxOnProfit,
					com.tools20022.repository.msg.CorporateActionRate2.mmTaxReclaim, com.tools20022.repository.msg.CorporateActionRate2.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate2.mmNonResidentRate,
					com.tools20022.repository.msg.TaxVoucher1.mmTaxCreditRate, com.tools20022.repository.msg.TaxVoucher1.mmWithholdingTaxRate, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCalculatedRate,
					com.tools20022.repository.msg.LineItemTax1.mmCalculatedRate, com.tools20022.repository.msg.Tax13.mmRate, com.tools20022.repository.msg.Tax18.mmRate, com.tools20022.repository.msg.Tax19.mmRate,
					com.tools20022.repository.msg.RateTypeAndPercentageRate1.mmRate, com.tools20022.repository.msg.RateDetails15.mmFiscalStamp, com.tools20022.repository.msg.RateDetails15.mmTaxRelatedRate,
					com.tools20022.repository.msg.RateDetails15.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails15.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails15.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails15.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate46.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate46.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate45.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate45.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate45.mmTaxOnIncome,
					com.tools20022.repository.choice.RateAndAmountFormat21Choice.mmRate, com.tools20022.repository.msg.CorporateActionRate44.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate44.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate44.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate48.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate49.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails14.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails14.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails14.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails14.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails14.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails14.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate60.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate60.mmTaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate60.mmTaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate58.mmFiscalStamp, com.tools20022.repository.msg.RateDetails18.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails18.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails18.mmFiscalStamp, com.tools20022.repository.msg.RateDetails18.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails18.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails18.mmTaxReclaimRate, com.tools20022.repository.msg.RateTypeAndPercentageRate3.mmRate, com.tools20022.repository.msg.CorporateActionRate64.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate64.mmWithholdingTaxRate, com.tools20022.repository.choice.RateAndAmountFormat35Choice.mmRate, com.tools20022.repository.choice.RateAndAmountFormat32Choice.mmRate,
					com.tools20022.repository.msg.RateDetails21.mmFiscalStamp, com.tools20022.repository.msg.RateDetails21.mmTaxRelatedRate, com.tools20022.repository.msg.RateDetails21.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails21.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails21.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails21.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate65.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate57.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate57.mmTaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate57.mmTaxOnIncome, com.tools20022.repository.choice.RateAndAmountFormat40Choice.mmRate, com.tools20022.repository.msg.RateTypeAndPercentageRate8.mmRate,
					com.tools20022.repository.msg.RateDetails23.mmFiscalStamp, com.tools20022.repository.msg.RateDetails23.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails23.mmSecondLevelTax,
					com.tools20022.repository.msg.RateDetails23.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails23.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails23.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate68.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate68.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate68.mmTaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate69.mmFiscalStamp, com.tools20022.repository.msg.CorporateActionRate70.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate70.mmSecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate67.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate67.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate67.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails22.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails22.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails22.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails22.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails22.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails22.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate72.mmFiscalStamp, com.tools20022.repository.msg.TaxReporting1.mmTaxRate, com.tools20022.repository.msg.TreasuryProfile1.mmRate,
					com.tools20022.repository.msg.CorporateActionRate74.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate74.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate79.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate79.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate79.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails24.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails24.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails24.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails24.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails24.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails24.mmTaxReclaimRate, com.tools20022.repository.msg.RateTypeAndPercentageRate9.mmRate,
					com.tools20022.repository.msg.RateDetails25.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails25.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails25.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails25.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails25.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails25.mmTaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate76.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate76.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate76.mmTaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate77.mmFiscalStamp, com.tools20022.repository.choice.RateAndAmountFormat45Choice.mmRate, com.tools20022.repository.msg.CorporateActionRate75.mmFiscalStamp,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmCalculatedRate, com.tools20022.repository.msg.Tax32.mmInformativeRate, com.tools20022.repository.msg.Tax31.mmAppliedRate,
					com.tools20022.repository.choice.TaxAmountOrRate4Choice.mmRate, com.tools20022.repository.msg.TaxReporting2.mmTaxRate, com.tools20022.repository.msg.RateDetails26.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails26.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails26.mmFiscalStamp, com.tools20022.repository.msg.RateDetails26.mmTaxOnIncome,
					com.tools20022.repository.msg.RateDetails26.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails26.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate82.mmWithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate82.mmSecondLevelTax, com.tools20022.repository.msg.CorporateActionRate80.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate80.mmSecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate80.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails27.mmFiscalStamp, com.tools20022.repository.msg.RateDetails27.mmWithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails27.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails27.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails27.mmTaxOnProfits,
					com.tools20022.repository.msg.RateDetails27.mmTaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate81.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate81.mmSecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate81.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate83.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate83.mmSecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate83.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate84.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate84.mmSecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate84.mmTaxOnIncome, com.tools20022.repository.msg.CorporateActionRate85.mmWithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate85.mmSecondLevelTax,
					com.tools20022.repository.msg.RateDetails28.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails28.mmSecondLevelTax, com.tools20022.repository.msg.RateDetails28.mmFiscalStamp,
					com.tools20022.repository.msg.RateDetails28.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails28.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails28.mmTaxReclaimRate,
					com.tools20022.repository.msg.RateDetails30.mmFiscalStamp, com.tools20022.repository.msg.RateDetails30.mmWithholdingTaxRate, com.tools20022.repository.msg.RateDetails30.mmSecondLevelTax,
					com.tools20022.repository.msg.RateDetails30.mmTaxOnIncome, com.tools20022.repository.msg.RateDetails30.mmTaxOnProfits, com.tools20022.repository.msg.RateDetails30.mmTaxReclaimRate);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Party taxableParty;
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmTaxationConditions
	 * Party.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which is taxable at a specific location"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxableParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Party.mmTaxationConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Party.mmObject();
		}
	};
	protected NetAssetValueCalculation taxRefundValueCalculation;
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
	 * NetAssetValueCalculation.mmTaxRefund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefundValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net asset value calculation for which tax refund information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected TaxationBasisCode basis;
	/**
	 * Basis used to determine the capital gain or loss, eg, the purchase price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxationBasisCode
	 * TaxationBasisCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#mmBasis Tax3.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmBasis
	 * Tax15.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#mmExtendedBasis
	 * Tax15.mmExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#mmCode
	 * ChargeTaxBasisType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#mmProprietary
	 * ChargeTaxBasisType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order16#mmChargeTaxBasisType
	 * Order16.mmChargeTaxBasisType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order14#mmChargeTaxBasisType
	 * Order14.mmChargeTaxBasisType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxationBasis1#mmStructured
	 * TaxationBasis1.mmStructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxationBasis1#mmAdditionalInformation
	 * TaxationBasis1.mmAdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation1#mmBasis
	 * TaxCalculationInformation1.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5#mmBasis
	 * TaxCalculationInformation5.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5#mmExtendedBasis
	 * TaxCalculationInformation5.mmExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#mmBasis
	 * TaxCalculationInformation3.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmBasis
	 * TaxCalculationInformation6.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmExtendedBasis
	 * TaxCalculationInformation6.mmExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice#mmBasis
	 * TaxCalculationBasisType1Choice.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice#mmProprietary
	 * TaxCalculationBasisType1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation7#mmTaxCalculationBasis
	 * TaxCalculationInformation7.mmTaxCalculationBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#mmBasis
	 * Tax21.mmBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxBasis1Choice#mmCode
	 * TaxBasis1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxBasis1Choice#mmProprietary
	 * TaxBasis1Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmBasis
	 * TaxCalculationInformation8.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order17#mmChargeTaxBasisType
	 * Order17.mmChargeTaxBasisType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Order18#mmChargeTaxBasisType
	 * Order18.mmChargeTaxBasisType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#mmBasis
	 * Tax25.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#mmCode
	 * ChargeBasisType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#mmProprietary
	 * ChargeBasisType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#mmBasis
	 * Tax28.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation9#mmBasis
	 * TaxCalculationInformation9.mmBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmBasis
	 * TaxCalculationInformation10.mmBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Basis used to determine the capital gain or loss, eg, the purchase price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax3.mmBasis, com.tools20022.repository.msg.Tax15.mmBasis, com.tools20022.repository.msg.Tax15.mmExtendedBasis,
					com.tools20022.repository.choice.ChargeTaxBasisType1Choice.mmCode, com.tools20022.repository.choice.ChargeTaxBasisType1Choice.mmProprietary, com.tools20022.repository.msg.Order16.mmChargeTaxBasisType,
					com.tools20022.repository.msg.Order14.mmChargeTaxBasisType, com.tools20022.repository.msg.TaxationBasis1.mmStructured, com.tools20022.repository.msg.TaxationBasis1.mmAdditionalInformation,
					com.tools20022.repository.msg.TaxCalculationInformation1.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation5.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation5.mmExtendedBasis,
					com.tools20022.repository.msg.TaxCalculationInformation3.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation6.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation6.mmExtendedBasis,
					com.tools20022.repository.choice.TaxCalculationBasisType1Choice.mmBasis, com.tools20022.repository.choice.TaxCalculationBasisType1Choice.mmProprietary,
					com.tools20022.repository.msg.TaxCalculationInformation7.mmTaxCalculationBasis, com.tools20022.repository.msg.Tax21.mmBasis, com.tools20022.repository.choice.TaxBasis1Choice.mmCode,
					com.tools20022.repository.choice.TaxBasis1Choice.mmProprietary, com.tools20022.repository.msg.TaxCalculationInformation8.mmBasis, com.tools20022.repository.msg.Order17.mmChargeTaxBasisType,
					com.tools20022.repository.msg.Order18.mmChargeTaxBasisType, com.tools20022.repository.msg.Tax25.mmBasis, com.tools20022.repository.choice.ChargeBasisType1Choice.mmCode,
					com.tools20022.repository.choice.ChargeBasisType1Choice.mmProprietary, com.tools20022.repository.msg.Tax28.mmBasis, com.tools20022.repository.msg.TaxCalculationInformation9.mmBasis,
					com.tools20022.repository.msg.TaxCalculationInformation10.mmBasis);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	protected SecuritiesTransfer securitiesTransfer;
	/**
	 * Transfer process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferTax
	 * SecuritiesTransfer.mmTransferTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
	 * SecuritiesTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
		}
	};
	protected RateTypeCode taxRateType;
	/**
	 * Specifies the type of tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType10Choice#mmCode
	 * RateType10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType10Choice#mmProprietary
	 * RateType10Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType11Choice#mmCode
	 * RateType11Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType11Choice#mmProprietary
	 * RateType11Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType12Choice#mmCode
	 * RateType12Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType12Choice#mmProprietary
	 * RateType12Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType14Choice#mmCode
	 * RateType14Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType14Choice#mmProprietary
	 * RateType14Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType37Choice#mmCode
	 * RateType37Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType37Choice#mmProprietary
	 * RateType37Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType48Choice#mmCode
	 * RateType48Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType48Choice#mmProprietary
	 * RateType48Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType10Choice.mmCode, com.tools20022.repository.choice.RateType10Choice.mmProprietary, com.tools20022.repository.choice.RateType11Choice.mmCode,
					com.tools20022.repository.choice.RateType11Choice.mmProprietary, com.tools20022.repository.choice.RateType12Choice.mmCode, com.tools20022.repository.choice.RateType12Choice.mmProprietary,
					com.tools20022.repository.choice.RateType14Choice.mmCode, com.tools20022.repository.choice.RateType14Choice.mmProprietary, com.tools20022.repository.choice.RateType37Choice.mmCode,
					com.tools20022.repository.choice.RateType37Choice.mmProprietary, com.tools20022.repository.choice.RateType48Choice.mmCode, com.tools20022.repository.choice.RateType48Choice.mmProprietary);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> taxAccount;
	/**
	 * Account to be used for taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmTax
	 * CashAccount.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account8Choice#mmTaxAccount
	 * Account8Choice.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account9Choice#mmTaxAccount
	 * Account9Choice.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1#mmCashAccountDetails
	 * TaxReporting1.mmCashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmCashAccountDetails
	 * TaxReporting2.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to be used for taxes."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Account8Choice.mmTaxAccount, com.tools20022.repository.choice.Account9Choice.mmTaxAccount, com.tools20022.repository.msg.TaxReporting1.mmCashAccountDetails,
					com.tools20022.repository.msg.TaxReporting2.mmCashAccountDetails);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected Max350Text taxationConditions;
	/**
	 * Specifies other taxation conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#mmTaxationConditions
	 * CorporateActionNarrative4.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#mmTaxationConditions
	 * CorporateActionNarrative14.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#mmTaxationConditions
	 * CorporateActionNarrative5.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#mmTaxationConditions
	 * CorporateActionNarrative6.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#mmTaxationConditions
	 * CorporateActionNarrative15.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#mmTaxationConditions
	 * CorporateActionNarrative16.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#mmTaxationConditions
	 * CorporateActionNarrative20.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#mmTaxationConditions
	 * CorporateActionNarrative22.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#mmTaxationConditions
	 * CorporateActionNarrative11.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#mmTaxationConditions
	 * CorporateActionNarrative17.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#mmTaxationConditions
	 * CorporateActionNarrative1.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#mmTaxationConditions
	 * CorporateActionNarrative2.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#mmTaxationConditions
	 * CorporateActionNarrative27.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31#mmTaxationConditions
	 * CorporateActionNarrative31.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#mmTaxationConditions
	 * CorporateActionNarrative28.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#mmTaxationConditions
	 * CorporateActionNarrative29.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35#mmTaxationConditions
	 * CorporateActionNarrative35.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#mmTaxationConditions
	 * CorporateActionNarrative37.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#mmTaxationConditions
	 * CorporateActionNarrative41.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#mmTaxationConditions
	 * CorporateActionNarrative36.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmExemptionReasonText
	 * SettlementSubTotalCalculatedTax2.mmExemptionReasonText}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies other taxation conditions."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxationConditions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative4.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative14.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative5.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative6.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative15.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative16.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative20.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative22.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative11.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative1.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative2.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative27.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative31.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative28.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative29.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative35.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative37.mmTaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative41.mmTaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative36.mmTaxationConditions,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmExemptionReasonText);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Adjustment adjustment;
	/**
	 * Specifies the adjustments subject to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmTax
	 * Adjustment.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the adjustments subject to a tax."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};
	protected Interest interest;
	/**
	 * Interest for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmInterestTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected Max35Text identification;
	/**
	 * Reference used to identify the nature of tax levied, such as Value Added
	 * Tax (VAT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCharges1#mmIdentification
	 * TaxCharges1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxReferenceNumber
	 * TaxInformation2.mmTaxReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCharges2#mmIdentification
	 * TaxCharges2.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmReferenceNumber
	 * TaxInformation3.mmReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCategoryCode
	 * SettlementSubTotalCalculatedTax1.mmCategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification1#mmTaxIdentificationNumber
	 * TaxIdentification1.mmTaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#mmReferenceNumber
	 * Garnishment1.mmReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmReferenceNumber
	 * TaxInformation4.mmReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#mmIdentification
	 * TaxIdentification2.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCharges1.mmIdentification, com.tools20022.repository.msg.TaxInformation2.mmTaxReferenceNumber, com.tools20022.repository.msg.TaxCharges2.mmIdentification,
					com.tools20022.repository.msg.TaxInformation3.mmReferenceNumber, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCategoryCode, com.tools20022.repository.msg.TaxIdentification1.mmTaxIdentificationNumber,
					com.tools20022.repository.msg.Garnishment1.mmReferenceNumber, com.tools20022.repository.msg.TaxInformation4.mmReferenceNumber, com.tools20022.repository.msg.TaxIdentification2.mmIdentification);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Payment relatedPaymentSettlement;
	/**
	 * Payment to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmTaxOnPayment
	 * Payment.mmTaxOnPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPaymentSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment to which the tax applies."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmTaxOnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected CurrencyAndAmount taxableBaseAmount;
	/**
	 * Amount of money on which the tax is based.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxType#mmTaxableBaseAmount
	 * TaxType.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#mmTotalTaxableBaseAmount
	 * TaxInformation2.mmTotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxAmount1#mmTaxableBaseAmount
	 * TaxAmount1.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmTotalTaxableBaseAmount
	 * TaxInformation3.mmTotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#mmTaxableAmount
	 * TaxCalculationInformation3.mmTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#mmTaxableAmount
	 * TaxCalculationInformation6.mmTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#mmTotalTaxableAmount
	 * InvoiceTotals1.mmTotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTaxBasisAmount
	 * SettlementMonetarySummation1.mmTaxBasisAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#mmTaxBasisTotalAmount
	 * LineItemMonetarySummation1.mmTaxBasisTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation7#mmTaxableAmount
	 * TaxCalculationInformation7.mmTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#mmTotalTaxableAmount
	 * ServiceItemTotals1.mmTotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#mmTotalTaxableAmount
	 * InvoiceTotals2.mmTotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#mmTotalTaxableAmount
	 * ServiceCategoryTotals1.mmTotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#mmTaxableAmount
	 * TaxCalculationInformation8.mmTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmTotalTaxableBaseAmount
	 * TaxInformation4.mmTotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#mmTaxableAmount
	 * TaxCalculationInformation10.mmTaxableAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxableBaseAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money on which the tax is based."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays
					.asList(com.tools20022.repository.msg.TaxType.mmTaxableBaseAmount, com.tools20022.repository.msg.TaxInformation2.mmTotalTaxableBaseAmount, com.tools20022.repository.msg.TaxAmount1.mmTaxableBaseAmount,
							com.tools20022.repository.msg.TaxInformation3.mmTotalTaxableBaseAmount, com.tools20022.repository.msg.TaxCalculationInformation3.mmTaxableAmount,
							com.tools20022.repository.msg.TaxCalculationInformation6.mmTaxableAmount, com.tools20022.repository.msg.InvoiceTotals1.mmTotalTaxableAmount,
							com.tools20022.repository.msg.SettlementMonetarySummation1.mmTaxBasisAmount, com.tools20022.repository.msg.LineItemMonetarySummation1.mmTaxBasisTotalAmount,
							com.tools20022.repository.msg.TaxCalculationInformation7.mmTaxableAmount, com.tools20022.repository.msg.ServiceItemTotals1.mmTotalTaxableAmount, com.tools20022.repository.msg.InvoiceTotals2.mmTotalTaxableAmount,
							com.tools20022.repository.msg.ServiceCategoryTotals1.mmTotalTaxableAmount, com.tools20022.repository.msg.TaxCalculationInformation8.mmTaxableAmount,
							com.tools20022.repository.msg.TaxInformation4.mmTotalTaxableBaseAmount, com.tools20022.repository.msg.TaxCalculationInformation10.mmTaxableAmount);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected ISODate taxDate;
	/**
	 * Date by which tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation2#mmTaxDate
	 * TaxInformation2.mmTaxDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmDate
	 * TaxInformation3.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTax1#mmTaxPointDate
	 * SettlementTax1.mmTaxPointDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmTaxPointDate
	 * LineItemTax1.mmTaxPointDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmPointDate
	 * BillingTaxRegion1.mmPointDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmDate
	 * TaxInformation4.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#mmFiscalYear
	 * InvestmentAccount49.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#mmFiscalYear
	 * InvestmentAccount51.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmFiscalYear
	 * InvestmentAccount50.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#mmFiscalYear
	 * InvestmentAccount61.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#mmFiscalYear
	 * InvestmentAccount63.mmFiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFiscalYear
	 * InvestmentAccount62.mmFiscalYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which tax is due."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation2.mmTaxDate, com.tools20022.repository.msg.TaxInformation3.mmDate, com.tools20022.repository.msg.SettlementTax1.mmTaxPointDate,
					com.tools20022.repository.msg.LineItemTax1.mmTaxPointDate, com.tools20022.repository.msg.BillingTaxRegion1.mmPointDate, com.tools20022.repository.msg.TaxInformation4.mmDate,
					com.tools20022.repository.msg.InvestmentAccount49.mmFiscalYear, com.tools20022.repository.msg.InvestmentAccount51.mmFiscalYear, com.tools20022.repository.msg.InvestmentAccount50.mmFiscalYear,
					com.tools20022.repository.msg.InvestmentAccount61.mmFiscalYear, com.tools20022.repository.msg.InvestmentAccount63.mmFiscalYear, com.tools20022.repository.msg.InvestmentAccount62.mmFiscalYear);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text certificateIdentification;
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxDetails#mmCertificateIdentification
	 * TaxDetails.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmCertificateIdentification
	 * TaxRecord1.mmCertificateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Document issued by taxing authority identifying the tax payer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCertificateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxDetails.mmCertificateIdentification, com.tools20022.repository.msg.TaxRecord1.mmCertificateIdentification);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max140Text administrationZone;
	/**
	 * Territorial part of a country to which the tax payment is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#mmAdministrationZone
	 * TaxInformation3.mmAdministrationZone}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#mmRegion
	 * AccountTax1.mmRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#mmRegion
	 * ServiceTaxDesignation1.mmRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmRegionName
	 * BillingTaxRegion1.mmRegionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#mmTaxRegion
	 * BillingStatement1.mmTaxRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#mmAdministrationZone
	 * TaxInformation4.mmAdministrationZone}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#mmIssuer
	 * TaxIdentification2.mmIssuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#mmTaxRegion
	 * BillingStatement2.mmTaxRegion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdministrationZone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Territorial part of a country to which the tax payment is related."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAdministrationZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.mmAdministrationZone, com.tools20022.repository.msg.AccountTax1.mmRegion, com.tools20022.repository.msg.ServiceTaxDesignation1.mmRegion,
					com.tools20022.repository.msg.BillingTaxRegion1.mmRegionName, com.tools20022.repository.msg.BillingStatement1.mmTaxRegion, com.tools20022.repository.msg.TaxInformation4.mmAdministrationZone,
					com.tools20022.repository.msg.TaxIdentification2.mmIssuer, com.tools20022.repository.msg.BillingStatement2.mmTaxRegion);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected Max35Text method;
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmMethod
	 * TaxInformation3.mmMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmMethod
	 * TaxInformation4.mmMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Method"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method used to indicate the underlying business or how the tax is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.mmMethod, com.tools20022.repository.msg.TaxInformation4.mmMethod);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TaxRecord> record;
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#mmRecord
	 * TaxInformation3.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#mmTaxIdentification
	 * BillingMethod1.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#mmTaxIdentification
	 * BillingMethod2.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3#mmTaxIdentification
	 * BillingMethod3.mmTaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmTaxDesignation
	 * BillingService1.mmTaxDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmTaxIdentification
	 * TaxCalculation1.mmTaxIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#mmRecord
	 * TaxInformation4.mmRecord}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmTaxDesignation
	 * BillingService2.mmTaxDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Record"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record of tax details."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRecord = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.mmRecord, com.tools20022.repository.msg.BillingMethod1.mmTaxIdentification, com.tools20022.repository.msg.BillingMethod2.mmTaxIdentification,
					com.tools20022.repository.msg.BillingMethod3.mmTaxIdentification, com.tools20022.repository.msg.BillingService1.mmTaxDesignation, com.tools20022.repository.msg.TaxCalculation1.mmTaxIdentification,
					com.tools20022.repository.msg.TaxInformation4.mmRecord, com.tools20022.repository.msg.BillingService2.mmTaxDesignation);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxRecord.mmObject();
		}
	};
	protected Product product;
	/**
	 * Product on which a tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#mmTax
	 * Product.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Product Product}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Product"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Product on which a tax is applied."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmProduct = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Product.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange;
	/**
	 * Currency exchange applicable to a tax
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
	 * CurrencyExchange.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#mmTaxCurrencyExchange
	 * TradeSettlement1.mmTaxCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency exchange applicable to a tax"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.mmTaxCurrencyExchange);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency in which the tax must be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#mmHostCurrencyCode
	 * CashAccountCharacteristics1.mmHostCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#mmHostCurrency
	 * TaxCalculation1.mmHostCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#mmHostCurrencyCode
	 * CashAccountCharacteristics2.mmHostCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the tax must be settled."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.mmHostCurrencyCode, com.tools20022.repository.msg.TaxCalculation1.mmHostCurrency,
					com.tools20022.repository.msg.CashAccountCharacteristics2.mmHostCurrencyCode);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.TaxPartyRole> partyRole;
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#mmSendingFinancialInstitution
	 * BillingTaxRegion1.mmSendingFinancialInstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies each role linked to a tax and played by a party in that context."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxRegion1.mmSendingFinancialInstitution);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.mmObject();
		}
	};
	protected CurrencyAndAmount taxDeduction;
	/**
	 * Amount of tax that have been previously deducted.
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxDeduction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Distribution relatedCorporateActionDistribution;
	/**
	 * Distribution process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmDistributionTax
	 * Distribution.mmDistributionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution process for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmDistributionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected ISODate calculationDate;
	/**
	 * Date on which the tax is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the tax is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Dividend> dividend;
	/**
	 * Dividend for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#mmTax
	 * Dividend.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend for which a tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.mmTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
		}
	};
	protected WithholdingTaxRateTypeCode withholdingTaxType;
	/**
	 * Type of withholding tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.WithholdingTaxRateTypeCode
	 * WithholdingTaxRateTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate1#mmRateType
	 * RateTypeAndPercentageRate1.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType28Choice#mmCode
	 * RateType28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType28Choice#mmProprietary
	 * RateType28Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType30Choice#mmCode
	 * RateType30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType30Choice#mmProprietary
	 * RateType30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3#mmRateType
	 * RateTypeAndPercentageRate3.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#mmRateType
	 * RateTypeAndPercentageRate8.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType42Choice#mmCode
	 * RateType42Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType42Choice#mmProprietary
	 * RateType42Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate9#mmRateType
	 * RateTypeAndPercentageRate9.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType46Choice#mmCode
	 * RateType46Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType46Choice#mmProprietary
	 * RateType46Choice.mmProprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of withholding tax rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmWithholdingTaxType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndPercentageRate1.mmRateType, com.tools20022.repository.choice.RateType28Choice.mmCode,
					com.tools20022.repository.choice.RateType28Choice.mmProprietary, com.tools20022.repository.choice.RateType30Choice.mmCode, com.tools20022.repository.choice.RateType30Choice.mmProprietary,
					com.tools20022.repository.msg.RateTypeAndPercentageRate3.mmRateType, com.tools20022.repository.msg.RateTypeAndPercentageRate8.mmRateType, com.tools20022.repository.choice.RateType42Choice.mmCode,
					com.tools20022.repository.choice.RateType42Choice.mmProprietary, com.tools20022.repository.msg.RateTypeAndPercentageRate9.mmRateType, com.tools20022.repository.choice.RateType46Choice.mmCode,
					com.tools20022.repository.choice.RateType46Choice.mmProprietary);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}
	};
	protected CorporateActionEvent corporateActionEvent;
	/**
	 * Event for which a transaction tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmTransactionTax
	 * CorporateActionEvent.mmTransactionTax}</li>
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
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event for which a transaction tax is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected TaxIdentificationNumberTypeCode taxIdentificationType;
	/**
	 * Type of tax identification number or identifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxIdentificationNumberTypeCode
	 * TaxIdentificationNumberTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#mmTaxIdentificationType
	 * TaxIdentification2.mmTaxIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxIdentificationType1Choice#mmCode
	 * TaxIdentificationType1Choice.mmCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax identification number or identifier."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTaxIdentificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxIdentification2.mmTaxIdentificationType, com.tools20022.repository.choice.TaxIdentificationType1Choice.mmCode);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmTax, com.tools20022.repository.entity.Dividend.mmTax, com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund, com.tools20022.repository.entity.Party.mmTaxationConditions, com.tools20022.repository.entity.CashAccount.mmTax,
						com.tools20022.repository.entity.Product.mmTax, com.tools20022.repository.entity.Adjustment.mmTax, com.tools20022.repository.entity.Payment.mmTaxOnPayment,
						com.tools20022.repository.entity.SecuritiesTransfer.mmTransferTax, com.tools20022.repository.entity.Interest.mmInterestTax, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CorporateActionEvent.mmTransactionTax, com.tools20022.repository.entity.TaxPartyRole.mmTax, com.tools20022.repository.entity.TaxRecord.mmTax,
						com.tools20022.repository.entity.Distribution.mmDistributionTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate10.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate20.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate22.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate26.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate31.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate38.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate39.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate5.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate12.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate15.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate18.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate25.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate30.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate37.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate40.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate36.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate42.mmAdditionalTax, com.tools20022.repository.msg.TaxDetails.mmTaxType, com.tools20022.repository.msg.TaxInformation2.mmTaxTypeInformation,
						com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax1, com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax2, com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax3,
						com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax4, com.tools20022.repository.msg.CorporateActionRate2.mmAdditionalTax, com.tools20022.repository.msg.TaxParty3.mmTaxExemptionReason,
						com.tools20022.repository.msg.BillingServicesTax1.mmRate, com.tools20022.repository.msg.BillingServicesTax2.mmRate, com.tools20022.repository.choice.BillingMethod1Choice.mmMethodA,
						com.tools20022.repository.choice.BillingMethod1Choice.mmMethodB, com.tools20022.repository.choice.BillingMethod1Choice.mmMethodD, com.tools20022.repository.msg.BillingServicesTax3.mmRate,
						com.tools20022.repository.msg.BillingMethod4.mmTaxCalculation, com.tools20022.repository.msg.BillingTaxRegion1.mmMethodC, com.tools20022.repository.msg.Tax18.mmTaxType, com.tools20022.repository.msg.Tax19.mmTaxType,
						com.tools20022.repository.msg.CorporateActionRate46.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate45.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate44.mmAdditionalTax,
						com.tools20022.repository.msg.Tax23.mmAmountOrPercentage, com.tools20022.repository.msg.CorporateActionRate60.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate64.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate57.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate68.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate70.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate67.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate74.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate79.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate76.mmAdditionalTax, com.tools20022.repository.msg.TradeSettlement2.mmSubTotalCalculatedTax, com.tools20022.repository.msg.CorporateActionRate82.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate80.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate81.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate83.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate84.mmAdditionalTax, com.tools20022.repository.msg.CorporateActionRate85.mmAdditionalTax);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.mmExemptionReason, com.tools20022.repository.entity.Tax.mmCountry, com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.mmType, com.tools20022.repository.entity.Tax.mmAmount, com.tools20022.repository.entity.Tax.mmRate, com.tools20022.repository.entity.Tax.mmTaxableParty,
						com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.Tax.mmBasis, com.tools20022.repository.entity.Tax.mmSecuritiesTransfer,
						com.tools20022.repository.entity.Tax.mmTaxRateType, com.tools20022.repository.entity.Tax.mmTaxAccount, com.tools20022.repository.entity.Tax.mmTaxationConditions, com.tools20022.repository.entity.Tax.mmAdjustment,
						com.tools20022.repository.entity.Tax.mmInterest, com.tools20022.repository.entity.Tax.mmIdentification, com.tools20022.repository.entity.Tax.mmRelatedPaymentSettlement,
						com.tools20022.repository.entity.Tax.mmTaxableBaseAmount, com.tools20022.repository.entity.Tax.mmTaxDate, com.tools20022.repository.entity.Tax.mmCertificateIdentification,
						com.tools20022.repository.entity.Tax.mmAdministrationZone, com.tools20022.repository.entity.Tax.mmMethod, com.tools20022.repository.entity.Tax.mmRecord, com.tools20022.repository.entity.Tax.mmProduct,
						com.tools20022.repository.entity.Tax.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrency, com.tools20022.repository.entity.Tax.mmPartyRole, com.tools20022.repository.entity.Tax.mmTaxDeduction,
						com.tools20022.repository.entity.Tax.mmRelatedCorporateActionDistribution, com.tools20022.repository.entity.Tax.mmCalculationDate, com.tools20022.repository.entity.Tax.mmDividend,
						com.tools20022.repository.entity.Tax.mmWithholdingTaxType, com.tools20022.repository.entity.Tax.mmCorporateActionEvent, com.tools20022.repository.entity.Tax.mmTaxIdentificationType);
				derivationComponent_lazy = () -> Arrays.asList(TaxExemptionReason1Choice.mmObject(), TaxTypeFormat2Choice.mmObject(), TaxExemptionReasonFormatChoice.mmObject(), Tax3.mmObject(), RateType10Choice.mmObject(),
						RateType11Choice.mmObject(), RateType12Choice.mmObject(), RateType14Choice.mmObject(), TaxCharges1.mmObject(), TaxType.mmObject(), TaxDetails.mmObject(), TaxInformation2.mmObject(), TaxCharges2.mmObject(),
						TaxRecordDetails1.mmObject(), TaxAmount1.mmObject(), TaxInformation3.mmObject(), TaxAmountType1Choice.mmObject(), TaxAmountAndType1.mmObject(), TaxationBasis1.mmObject(), TaxExemptionReason1.mmObject(),
						TaxType3FormatChoice.mmObject(), TaxTypeFormat1Choice.mmObject(), SettlementTax1.mmObject(), SettlementSubTotalCalculatedTax1.mmObject(), LineItemTax1.mmObject(), Tax13.mmObject(), Tax12.mmObject(),
						AccountTax1.mmObject(), TaxReason1.mmObject(), BillingMethod1.mmObject(), BillingMethod2.mmObject(), BillingMethod3.mmObject(), BillingMethod1Choice.mmObject(), TaxCalculation1.mmObject(), BillingMethod4.mmObject(),
						BillingTaxRegion1.mmObject(), TaxDetailsType1Choice.mmObject(), TaxIdentification1.mmObject(), TaxType1Choice.mmObject(), ExemptionReason1Choice.mmObject(), TaxBasis1Choice.mmObject(),
						RateTypeAndPercentageRate1.mmObject(), RateType28Choice.mmObject(), TaxInformation4.mmObject(), Tax22.mmObject(), TaxType2Choice.mmObject(), Tax23.mmObject(), RateType30Choice.mmObject(),
						RateTypeAndPercentageRate3.mmObject(), TaxIdentification2.mmObject(), TaxIdentificationType1Choice.mmObject(), RateTypeAndPercentageRate8.mmObject(), RateType42Choice.mmObject(), RateType37Choice.mmObject(),
						TaxExemptionReason2Choice.mmObject(), TaxReporting1.mmObject(), RateTypeAndPercentageRate9.mmObject(), RateType46Choice.mmObject(), RateType48Choice.mmObject(), SettlementSubTotalCalculatedTax2.mmObject(),
						TaxReporting2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public TaxExemptReasonCode getExemptionReason() {
		return exemptionReason;
	}

	public void setExemptionReason(TaxExemptReasonCode exemptionReason) {
		this.exemptionReason = exemptionReason;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(com.tools20022.repository.entity.Country country) {
		this.country = country;
	}

	public NetAssetValueCalculation getTaxLiabilityValueCalculation() {
		return taxLiabilityValueCalculation;
	}

	public void setTaxLiabilityValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxLiabilityValueCalculation) {
		this.taxLiabilityValueCalculation = taxLiabilityValueCalculation;
	}

	public TaxTypeCode getType() {
		return type;
	}

	public void setType(TaxTypeCode type) {
		this.type = type;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(CurrencyAndAmount amount) {
		this.amount = amount;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public Party getTaxableParty() {
		return taxableParty;
	}

	public void setTaxableParty(com.tools20022.repository.entity.Party taxableParty) {
		this.taxableParty = taxableParty;
	}

	public NetAssetValueCalculation getTaxRefundValueCalculation() {
		return taxRefundValueCalculation;
	}

	public void setTaxRefundValueCalculation(com.tools20022.repository.entity.NetAssetValueCalculation taxRefundValueCalculation) {
		this.taxRefundValueCalculation = taxRefundValueCalculation;
	}

	public TaxationBasisCode getBasis() {
		return basis;
	}

	public void setBasis(TaxationBasisCode basis) {
		this.basis = basis;
	}

	public SecuritiesTransfer getSecuritiesTransfer() {
		return securitiesTransfer;
	}

	public void setSecuritiesTransfer(com.tools20022.repository.entity.SecuritiesTransfer securitiesTransfer) {
		this.securitiesTransfer = securitiesTransfer;
	}

	public RateTypeCode getTaxRateType() {
		return taxRateType;
	}

	public void setTaxRateType(RateTypeCode taxRateType) {
		this.taxRateType = taxRateType;
	}

	public List<CashAccount> getTaxAccount() {
		return taxAccount;
	}

	public void setTaxAccount(List<com.tools20022.repository.entity.CashAccount> taxAccount) {
		this.taxAccount = taxAccount;
	}

	public Max350Text getTaxationConditions() {
		return taxationConditions;
	}

	public void setTaxationConditions(Max350Text taxationConditions) {
		this.taxationConditions = taxationConditions;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public void setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = adjustment;
	}

	public Interest getInterest() {
		return interest;
	}

	public void setInterest(com.tools20022.repository.entity.Interest interest) {
		this.interest = interest;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Payment getRelatedPaymentSettlement() {
		return relatedPaymentSettlement;
	}

	public void setRelatedPaymentSettlement(com.tools20022.repository.entity.Payment relatedPaymentSettlement) {
		this.relatedPaymentSettlement = relatedPaymentSettlement;
	}

	public CurrencyAndAmount getTaxableBaseAmount() {
		return taxableBaseAmount;
	}

	public void setTaxableBaseAmount(CurrencyAndAmount taxableBaseAmount) {
		this.taxableBaseAmount = taxableBaseAmount;
	}

	public ISODate getTaxDate() {
		return taxDate;
	}

	public void setTaxDate(ISODate taxDate) {
		this.taxDate = taxDate;
	}

	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public void setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
	}

	public Max140Text getAdministrationZone() {
		return administrationZone;
	}

	public void setAdministrationZone(Max140Text administrationZone) {
		this.administrationZone = administrationZone;
	}

	public Max35Text getMethod() {
		return method;
	}

	public void setMethod(Max35Text method) {
		this.method = method;
	}

	public List<TaxRecord> getRecord() {
		return record;
	}

	public void setRecord(List<com.tools20022.repository.entity.TaxRecord> record) {
		this.record = record;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(com.tools20022.repository.entity.Product product) {
		this.product = product;
	}

	public List<CurrencyExchange> getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(List<com.tools20022.repository.entity.CurrencyExchange> currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	public List<TaxPartyRole> getPartyRole() {
		return partyRole;
	}

	public void setPartyRole(List<com.tools20022.repository.entity.TaxPartyRole> partyRole) {
		this.partyRole = partyRole;
	}

	public CurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public void setTaxDeduction(CurrencyAndAmount taxDeduction) {
		this.taxDeduction = taxDeduction;
	}

	public Distribution getRelatedCorporateActionDistribution() {
		return relatedCorporateActionDistribution;
	}

	public void setRelatedCorporateActionDistribution(com.tools20022.repository.entity.Distribution relatedCorporateActionDistribution) {
		this.relatedCorporateActionDistribution = relatedCorporateActionDistribution;
	}

	public ISODate getCalculationDate() {
		return calculationDate;
	}

	public void setCalculationDate(ISODate calculationDate) {
		this.calculationDate = calculationDate;
	}

	public List<Dividend> getDividend() {
		return dividend;
	}

	public void setDividend(List<com.tools20022.repository.entity.Dividend> dividend) {
		this.dividend = dividend;
	}

	public WithholdingTaxRateTypeCode getWithholdingTaxType() {
		return withholdingTaxType;
	}

	public void setWithholdingTaxType(WithholdingTaxRateTypeCode withholdingTaxType) {
		this.withholdingTaxType = withholdingTaxType;
	}

	public CorporateActionEvent getCorporateActionEvent() {
		return corporateActionEvent;
	}

	public void setCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent corporateActionEvent) {
		this.corporateActionEvent = corporateActionEvent;
	}

	public TaxIdentificationNumberTypeCode getTaxIdentificationType() {
		return taxIdentificationType;
	}

	public void setTaxIdentificationType(TaxIdentificationNumberTypeCode taxIdentificationType) {
		this.taxIdentificationType = taxIdentificationType;
	}
}