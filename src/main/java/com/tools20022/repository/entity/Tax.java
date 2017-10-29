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
 * <li>{@linkplain com.tools20022.repository.entity.Tax#ExemptionReason
 * Tax.ExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Country Tax.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxLiabilityValueCalculation
 * Tax.TaxLiabilityValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Type Tax.Type}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Amount Tax.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Rate Tax.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableParty
 * Tax.TaxableParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#TaxRefundValueCalculation
 * Tax.TaxRefundValueCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Basis Tax.Basis}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#SecuritiesTransfer
 * Tax.SecuritiesTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxRateType
 * Tax.TaxRateType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxAccount
 * Tax.TaxAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxationConditions
 * Tax.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Adjustment
 * Tax.Adjustment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Interest Tax.Interest}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Identification
 * Tax.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedPaymentSettlement
 * Tax.RelatedPaymentSettlement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxableBaseAmount
 * Tax.TaxableBaseAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxDate Tax.TaxDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#CertificateIdentification
 * Tax.CertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#AdministrationZone
 * Tax.AdministrationZone}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Method Tax.Method}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Record Tax.Record}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Product Tax.Product}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
 * Tax.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Currency Tax.Currency}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#PartyRole Tax.PartyRole}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxDeduction
 * Tax.TaxDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#RelatedCorporateActionDistribution
 * Tax.RelatedCorporateActionDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CalculationDate
 * Tax.CalculationDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#Dividend Tax.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#WithholdingTaxType
 * Tax.WithholdingTaxType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CorporateActionEvent
 * Tax.CorporateActionEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#TaxIdentificationType
 * Tax.TaxIdentificationType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Country#Tax Country.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Dividend#Tax Dividend.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxLiability
 * NetAssetValueCalculation.TaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxRefund
 * NetAssetValueCalculation.TaxRefund}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Party#TaxationConditions
 * Party.TaxationConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#Tax
 * CashAccount.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Product#Tax Product.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#Tax
 * Adjustment.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
 * Payment.TaxOnPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
 * SecuritiesTransfer.TransferTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Interest#InterestTax
 * Interest.InterestTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
 * CurrencyExchange.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
 * CorporateActionEvent.TransactionTax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxPartyRole#Tax
 * TaxPartyRole.Tax}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TaxRecord#Tax TaxRecord.Tax}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Distribution#DistributionTax
 * Distribution.DistributionTax}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#AdditionalTax
 * CorporateActionRate4.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#AdditionalTax
 * CorporateActionRate10.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#AdditionalTax
 * CorporateActionRate20.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#AdditionalTax
 * CorporateActionRate22.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#AdditionalTax
 * CorporateActionRate26.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#AdditionalTax
 * CorporateActionRate31.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#AdditionalTax
 * CorporateActionRate38.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#AdditionalTax
 * CorporateActionRate39.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#AdditionalTax
 * CorporateActionRate5.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#AdditionalTax
 * CorporateActionRate12.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#AdditionalTax
 * CorporateActionRate15.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#AdditionalTax
 * CorporateActionRate18.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#AdditionalTax
 * CorporateActionRate25.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#AdditionalTax
 * CorporateActionRate30.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#AdditionalTax
 * CorporateActionRate37.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#AdditionalTax
 * CorporateActionRate40.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#AdditionalTax
 * CorporateActionRate36.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#AdditionalTax
 * CorporateActionRate42.AdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxDetails#TaxType
 * TaxDetails.TaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxInformation2#TaxTypeInformation
 * TaxInformation2.TaxTypeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#GermanLocalTax1
 * CorporateActionRate2.GermanLocalTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#GermanLocalTax2
 * CorporateActionRate2.GermanLocalTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#GermanLocalTax3
 * CorporateActionRate2.GermanLocalTax3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#GermanLocalTax4
 * CorporateActionRate2.GermanLocalTax4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#AdditionalTax
 * CorporateActionRate2.AdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxParty3#TaxExemptionReason
 * TaxParty3.TaxExemptionReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax1#Rate
 * BillingServicesTax1.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax2#Rate
 * BillingServicesTax2.Rate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodA
 * BillingMethod1Choice.MethodA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodB
 * BillingMethod1Choice.MethodB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BillingMethod1Choice#MethodD
 * BillingMethod1Choice.MethodD}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingServicesTax3#Rate
 * BillingServicesTax3.Rate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingMethod4#TaxCalculation
 * BillingMethod4.TaxCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingTaxRegion1#MethodC
 * BillingTaxRegion1.MethodC}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax18#TaxType Tax18.TaxType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax19#TaxType Tax19.TaxType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#AdditionalTax
 * CorporateActionRate46.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#AdditionalTax
 * CorporateActionRate45.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#AdditionalTax
 * CorporateActionRate44.AdditionalTax}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Tax23#AmountOrPercentage
 * Tax23.AmountOrPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#AdditionalTax
 * CorporateActionRate60.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#AdditionalTax
 * CorporateActionRate64.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#AdditionalTax
 * CorporateActionRate57.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#AdditionalTax
 * CorporateActionRate68.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#AdditionalTax
 * CorporateActionRate70.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#AdditionalTax
 * CorporateActionRate67.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#AdditionalTax
 * CorporateActionRate74.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#AdditionalTax
 * CorporateActionRate79.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#AdditionalTax
 * CorporateActionRate76.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeSettlement2#SubTotalCalculatedTax
 * TradeSettlement2.SubTotalCalculatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#AdditionalTax
 * CorporateActionRate82.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#AdditionalTax
 * CorporateActionRate80.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#AdditionalTax
 * CorporateActionRate81.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#AdditionalTax
 * CorporateActionRate83.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#AdditionalTax
 * CorporateActionRate84.AdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#AdditionalTax
 * CorporateActionRate85.AdditionalTax}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#TaxExemptionReason
	 * InvestmentAccount17.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#ExtendedTaxExemptionReason
	 * InvestmentAccount17.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#TaxExemptionReason
	 * InvestmentAccount27.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#ExtendedTaxExemptionReason
	 * InvestmentAccount27.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice#Code
	 * TaxExemptionReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason1Choice#Proprietary
	 * TaxExemptionReason1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#TaxExemptionReason
	 * InvestmentAccount18.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#ExtendedTaxExemptionReason
	 * InvestmentAccount18.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#TaxExemptionReason
	 * InvestmentAccount28.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ExtendedTaxExemptionReason
	 * InvestmentAccount28.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#TaxExemptionReason
	 * InvestmentAccount16.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#ExtendedTaxExemptionReason
	 * InvestmentAccount16.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#TaxExemptionReason
	 * InvestmentAccount26.TaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#ExtendedTaxExemptionReason
	 * InvestmentAccount26.ExtendedTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#Unstructured
	 * TaxExemptionReasonFormatChoice.Unstructured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReasonFormatChoice#Structured
	 * TaxExemptionReasonFormatChoice.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#ExemptionReason
	 * Tax3.ExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#ExemptionReason
	 * Tax15.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax15#ExtendedExemptionReason
	 * Tax15.ExtendedExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#ExemptionReason
	 * Tax6.ExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#ExemptionReason
	 * Tax16.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax16#ExtendedExemptionReason
	 * Tax16.ExtendedExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#ExemptionReason
	 * Tax7.ExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#ExemptionReason
	 * Tax14.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Tax14#ExtendedExemptionReason
	 * Tax14.ExtendedExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#ExemptionReason
	 * SettlementSubTotalCalculatedTax1.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReasonType1Choice#ExemptionReason
	 * ExemptionReasonType1Choice.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReasonType1Choice#Proprietary
	 * ExemptionReasonType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#ExemptionReasonType
	 * Tax18.ExemptionReasonType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#ExemptionReasonType
	 * Tax19.ExemptionReasonType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#ExemptionReason
	 * Tax21.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#Code
	 * ExemptionReason1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ExemptionReason1Choice#Proprietary
	 * ExemptionReason1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#ExemptionReason
	 * Tax25.ExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#Code
	 * TaxExemptionReason2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice#Proprietary
	 * TaxExemptionReason2Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#ExemptionReason
	 * Tax28.ExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#ExemptionReason
	 * Tax32.ExemptionReason}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#ExemptionReason
	 * Tax30.ExemptionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute ExemptionReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount17.TaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount17.ExtendedTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount27.TaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount27.ExtendedTaxExemptionReason, com.tools20022.repository.choice.TaxExemptionReason1Choice.Code,
					com.tools20022.repository.choice.TaxExemptionReason1Choice.Proprietary, com.tools20022.repository.msg.InvestmentAccount18.TaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount18.ExtendedTaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount28.TaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount28.ExtendedTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount16.TaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount16.ExtendedTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount26.TaxExemptionReason,
					com.tools20022.repository.msg.InvestmentAccount26.ExtendedTaxExemptionReason, com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.Unstructured,
					com.tools20022.repository.choice.TaxExemptionReasonFormatChoice.Structured, com.tools20022.repository.msg.Tax3.ExemptionReason, com.tools20022.repository.msg.Tax15.ExemptionReason,
					com.tools20022.repository.msg.Tax15.ExtendedExemptionReason, com.tools20022.repository.msg.Tax6.ExemptionReason, com.tools20022.repository.msg.Tax16.ExemptionReason,
					com.tools20022.repository.msg.Tax16.ExtendedExemptionReason, com.tools20022.repository.msg.Tax7.ExemptionReason, com.tools20022.repository.msg.Tax14.ExemptionReason,
					com.tools20022.repository.msg.Tax14.ExtendedExemptionReason, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.ExemptionReason, com.tools20022.repository.choice.ExemptionReasonType1Choice.ExemptionReason,
					com.tools20022.repository.choice.ExemptionReasonType1Choice.Proprietary, com.tools20022.repository.msg.Tax18.ExemptionReasonType, com.tools20022.repository.msg.Tax19.ExemptionReasonType,
					com.tools20022.repository.msg.Tax21.ExemptionReason, com.tools20022.repository.choice.ExemptionReason1Choice.Code, com.tools20022.repository.choice.ExemptionReason1Choice.Proprietary,
					com.tools20022.repository.msg.Tax25.ExemptionReason, com.tools20022.repository.choice.TaxExemptionReason2Choice.Code, com.tools20022.repository.choice.TaxExemptionReason2Choice.Proprietary,
					com.tools20022.repository.msg.Tax28.ExemptionReason, com.tools20022.repository.msg.Tax32.ExemptionReason, com.tools20022.repository.msg.Tax30.ExemptionReason);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxExemptReasonCode.mmObject();
		}
	};
	/**
	 * Place of taxation of an individual person or an organisation, where the
	 * tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Country#Tax
	 * Country.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation13#TaxationCountry
	 * Organisation13.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson20#TaxationCountry
	 * IndividualPerson20.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#TaxationCountry
	 * IndividualPerson21.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson22#TaxationCountry
	 * IndividualPerson22.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation15#TaxationCountry
	 * Organisation15.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation16#TaxationCountry
	 * Organisation16.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation17#TaxationCountry
	 * Organisation17.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson23#TaxationCountry
	 * IndividualPerson23.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#TaxationCountry
	 * IndividualPerson24.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1#TaxationCountry
	 * TaxReporting1.TaxationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#TaxationCountry
	 * TaxReporting2.TaxationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation13.TaxationCountry, com.tools20022.repository.msg.IndividualPerson20.TaxationCountry,
					com.tools20022.repository.msg.IndividualPerson21.TaxationCountry, com.tools20022.repository.msg.IndividualPerson22.TaxationCountry, com.tools20022.repository.msg.Organisation15.TaxationCountry,
					com.tools20022.repository.msg.Organisation16.TaxationCountry, com.tools20022.repository.msg.Organisation17.TaxationCountry, com.tools20022.repository.msg.IndividualPerson23.TaxationCountry,
					com.tools20022.repository.msg.IndividualPerson24.TaxationCountry, com.tools20022.repository.msg.TaxReporting1.TaxationCountry, com.tools20022.repository.msg.TaxReporting2.TaxationCountry);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Place of taxation of an individual person or an organisation, where the tax is due.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which tax liability information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxLiability
	 * NetAssetValueCalculation.TaxLiability}</li>
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
	public static final MMBusinessAssociationEnd TaxLiabilityValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxLiabilityValueCalculation";
			definition = "Net asset value calculation for which tax liability information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.TaxTypeCode
	 * TaxTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#Type Tax8.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#Type Tax17.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#ExtendedType
	 * Tax17.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat2Choice#Structured
	 * TaxTypeFormat2Choice.Structured}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#Type Tax3.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#Type Tax15.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#ExtendedType
	 * Tax15.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#Code
	 * TaxAmountType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountType1Choice#Proprietary
	 * TaxAmountType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmountAndType1#Type
	 * TaxAmountAndType1.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product1#TaxType
	 * Product1.TaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#Type Tax6.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#Type Tax16.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#ExtendedType
	 * Tax16.ExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#Type Tax7.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#Type Tax14.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#ExtendedType
	 * Tax14.ExtendedType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#Code
	 * TaxType3FormatChoice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3FormatChoice#Proprietary
	 * TaxType3FormatChoice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RelatedTaxType1#TaxType
	 * RelatedTaxType1.TaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#Code
	 * TaxTypeFormat1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice#Proprietary
	 * TaxTypeFormat1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementTax1#TypeCode
	 * SettlementTax1.TypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#TypeCode
	 * SettlementSubTotalCalculatedTax1.TypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#TypeCode
	 * LineItemTax1.TypeCode}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#Type Tax13.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#OtherTaxType
	 * Tax13.OtherTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax12#Type Tax12.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax12#OtherTaxType
	 * Tax12.OtherTaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxDetailsType1Choice#Type
	 * TaxDetailsType1Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxDetailsType1Choice#Proprietary
	 * TaxDetailsType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax20#Type Tax20.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType1Choice#Code
	 * TaxType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType1Choice#Proprietary
	 * TaxType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#Type Tax21.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax22#Type Tax22.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType2Choice#Type
	 * TaxType2Choice.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType2Choice#OtherTaxType
	 * TaxType2Choice.OtherTaxType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax23#Type Tax23.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#Type Tax25.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#Type Tax28.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Product3#TaxType
	 * Product3.TaxType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#TypeCode
	 * SettlementSubTotalCalculatedTax2.TypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#ExemptionReasonCode
	 * SettlementSubTotalCalculatedTax2.ExemptionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxType3Choice#Code
	 * TaxType3Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxType3Choice#Proprietary
	 * TaxType3Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#Type Tax32.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax30#Type Tax30.Type}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#Type Tax31.Type}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Type = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.Type, com.tools20022.repository.msg.Tax17.Type, com.tools20022.repository.msg.Tax17.ExtendedType,
					com.tools20022.repository.choice.TaxTypeFormat2Choice.Structured, com.tools20022.repository.msg.Tax3.Type, com.tools20022.repository.msg.Tax15.Type, com.tools20022.repository.msg.Tax15.ExtendedType,
					com.tools20022.repository.choice.TaxAmountType1Choice.Code, com.tools20022.repository.choice.TaxAmountType1Choice.Proprietary, com.tools20022.repository.msg.TaxAmountAndType1.Type,
					com.tools20022.repository.msg.Product1.TaxType, com.tools20022.repository.msg.Tax6.Type, com.tools20022.repository.msg.Tax16.Type, com.tools20022.repository.msg.Tax16.ExtendedType,
					com.tools20022.repository.msg.Tax7.Type, com.tools20022.repository.msg.Tax14.Type, com.tools20022.repository.msg.Tax14.ExtendedType, com.tools20022.repository.choice.TaxType3FormatChoice.Code,
					com.tools20022.repository.choice.TaxType3FormatChoice.Proprietary, com.tools20022.repository.msg.RelatedTaxType1.TaxType, com.tools20022.repository.choice.TaxTypeFormat1Choice.Code,
					com.tools20022.repository.choice.TaxTypeFormat1Choice.Proprietary, com.tools20022.repository.msg.SettlementTax1.TypeCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.TypeCode,
					com.tools20022.repository.msg.LineItemTax1.TypeCode, com.tools20022.repository.msg.Tax13.Type, com.tools20022.repository.msg.Tax13.OtherTaxType, com.tools20022.repository.msg.Tax12.Type,
					com.tools20022.repository.msg.Tax12.OtherTaxType, com.tools20022.repository.choice.TaxDetailsType1Choice.Type, com.tools20022.repository.choice.TaxDetailsType1Choice.Proprietary,
					com.tools20022.repository.msg.Tax20.Type, com.tools20022.repository.choice.TaxType1Choice.Code, com.tools20022.repository.choice.TaxType1Choice.Proprietary, com.tools20022.repository.msg.Tax21.Type,
					com.tools20022.repository.msg.Tax22.Type, com.tools20022.repository.choice.TaxType2Choice.Type, com.tools20022.repository.choice.TaxType2Choice.OtherTaxType, com.tools20022.repository.msg.Tax23.Type,
					com.tools20022.repository.msg.Tax25.Type, com.tools20022.repository.msg.Tax28.Type, com.tools20022.repository.msg.Product3.TaxType, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.TypeCode,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.ExemptionReasonCode, com.tools20022.repository.choice.TaxType3Choice.Code, com.tools20022.repository.choice.TaxType3Choice.Proprietary,
					com.tools20022.repository.msg.Tax32.Type, com.tools20022.repository.msg.Tax30.Type, com.tools20022.repository.msg.Tax31.Type);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Type";
			definition = "Type of tax applied.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxTypeCode.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} = List of 878 elements</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> ListBuilderForTax_00.addElems(new ArrayList<>());
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Amount of money resulting from the calculation of the tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax8#Rate Tax8.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax17#Rate Tax17.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#FiscalStamp
	 * CorporateActionRate4.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#NonResidentRate
	 * CorporateActionRate4.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#TaxRelatedRate
	 * CorporateActionRate4.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#WithholdingTaxRate
	 * CorporateActionRate4.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#TaxOnIncome
	 * CorporateActionRate4.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#TaxOnProfits
	 * CorporateActionRate4.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate4#TaxReclaimRate
	 * CorporateActionRate4.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#FiscalStamp
	 * CorporateActionRate10.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#NonResidentRate
	 * CorporateActionRate10.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#TaxRelatedRate
	 * CorporateActionRate10.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#WithholdingTaxRate
	 * CorporateActionRate10.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#TaxOnIncome
	 * CorporateActionRate10.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#TaxOnProfits
	 * CorporateActionRate10.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate10#TaxReclaimRate
	 * CorporateActionRate10.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#TaxRelatedRate
	 * CorporateActionRate20.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate20#WithholdingTaxRate
	 * CorporateActionRate20.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#FiscalStamp
	 * RateDetails2.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#TaxRelatedRate
	 * RateDetails2.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#WithholdingTaxRate
	 * RateDetails2.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#TaxOnIncome
	 * RateDetails2.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails2#TaxOnProfits
	 * RateDetails2.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails2#TaxReclaimRate
	 * RateDetails2.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#TaxRelatedRate
	 * CorporateActionRate22.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate22#WithholdingTaxRate
	 * CorporateActionRate22.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#FiscalStamp
	 * RateDetails4.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#TaxRelatedRate
	 * RateDetails4.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#WithholdingTaxRate
	 * RateDetails4.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#TaxOnIncome
	 * RateDetails4.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails4#TaxOnProfits
	 * RateDetails4.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails4#TaxReclaimRate
	 * RateDetails4.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#TaxRelatedRate
	 * CorporateActionRate26.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate26#WithholdingTaxRate
	 * CorporateActionRate26.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate29#FiscalStamp
	 * CorporateActionRate29.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#FiscalStamp
	 * RateDetails7.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#TaxRelatedRate
	 * RateDetails7.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#WithholdingTaxRate
	 * RateDetails7.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#TaxOnIncome
	 * RateDetails7.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails7#TaxOnProfits
	 * RateDetails7.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails7#TaxReclaimRate
	 * RateDetails7.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#TaxRelatedRate
	 * CorporateActionRate31.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate31#WithholdingTaxRate
	 * CorporateActionRate31.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate34#FiscalStamp
	 * CorporateActionRate34.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#FiscalStamp
	 * RateDetails9.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#TaxRelatedRate
	 * RateDetails9.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#WithholdingTaxRate
	 * RateDetails9.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#TaxOnIncome
	 * RateDetails9.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails9#TaxOnProfits
	 * RateDetails9.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails9#TaxReclaimRate
	 * RateDetails9.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#TaxRelatedRate
	 * CorporateActionRate38.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate38#WithholdingTaxRate
	 * CorporateActionRate38.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails11#FiscalStamp
	 * RateDetails11.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#TaxRelatedRate
	 * RateDetails11.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#WithholdingTaxRate
	 * RateDetails11.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails11#TaxOnIncome
	 * RateDetails11.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails11#TaxOnProfits
	 * RateDetails11.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails11#TaxReclaimRate
	 * RateDetails11.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#TaxRelatedRate
	 * CorporateActionRate39.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate39#WithholdingTaxRate
	 * CorporateActionRate39.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails12#FiscalStamp
	 * RateDetails12.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#TaxRelatedRate
	 * RateDetails12.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#WithholdingTaxRate
	 * RateDetails12.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails12#TaxOnIncome
	 * RateDetails12.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails12#TaxOnProfits
	 * RateDetails12.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails12#TaxReclaimRate
	 * RateDetails12.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#FiscalStamp
	 * CorporateActionRate5.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#NonResidentRate
	 * CorporateActionRate5.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#WithholdingTaxRate
	 * CorporateActionRate5.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#TaxOnIncome
	 * CorporateActionRate5.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#TaxOnProfits
	 * CorporateActionRate5.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#TaxReclaimRate
	 * CorporateActionRate5.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate5#TaxRelatedRate
	 * CorporateActionRate5.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#FiscalStamp
	 * CorporateActionRate12.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#NonResidentRate
	 * CorporateActionRate12.NonResidentRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#WithholdingTaxRate
	 * CorporateActionRate12.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#TaxOnIncome
	 * CorporateActionRate12.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#TaxOnProfits
	 * CorporateActionRate12.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#TaxReclaimRate
	 * CorporateActionRate12.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate12#TaxRelatedRate
	 * CorporateActionRate12.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#WithholdingTaxRate
	 * CorporateActionRate15.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate15#TaxRelatedRate
	 * CorporateActionRate15.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#TaxRelatedRate
	 * RateDetails3.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#WithholdingTaxRate
	 * RateDetails3.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#FiscalStamp
	 * RateDetails3.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#TaxOnIncome
	 * RateDetails3.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails3#TaxOnProfits
	 * RateDetails3.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails3#TaxReclaimRate
	 * RateDetails3.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#WithholdingTaxRate
	 * CorporateActionRate18.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate18#TaxRelatedRate
	 * CorporateActionRate18.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#TaxRelatedRate
	 * RateDetails5.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#WithholdingTaxRate
	 * RateDetails5.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#FiscalStamp
	 * RateDetails5.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#TaxOnIncome
	 * RateDetails5.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails5#TaxOnProfits
	 * RateDetails5.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails5#TaxReclaimRate
	 * RateDetails5.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#WithholdingTaxRate
	 * CorporateActionRate25.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate25#TaxRelatedRate
	 * CorporateActionRate25.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate28#FiscalStamp
	 * CorporateActionRate28.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#WithholdingTaxRate
	 * CorporateActionRate30.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate30#TaxRelatedRate
	 * CorporateActionRate30.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate33#FiscalStamp
	 * CorporateActionRate33.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#WithholdingTaxRate
	 * CorporateActionRate37.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate37#TaxRelatedRate
	 * CorporateActionRate37.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#TaxRelatedRate
	 * RateDetails10.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#WithholdingTaxRate
	 * RateDetails10.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails10#FiscalStamp
	 * RateDetails10.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails10#TaxOnIncome
	 * RateDetails10.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails10#TaxOnProfits
	 * RateDetails10.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails10#TaxReclaimRate
	 * RateDetails10.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#WithholdingTaxRate
	 * CorporateActionRate40.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate40#TaxRelatedRate
	 * CorporateActionRate40.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#TaxRelatedRate
	 * RateDetails13.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#WithholdingTaxRate
	 * RateDetails13.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails13#FiscalStamp
	 * RateDetails13.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails13#TaxOnIncome
	 * RateDetails13.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails13#TaxOnProfits
	 * RateDetails13.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails13#TaxReclaimRate
	 * RateDetails13.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#WithholdingTaxRate
	 * CorporateActionRate36.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate36#TaxRelatedRate
	 * CorporateActionRate36.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#WithholdingTaxRate
	 * CorporateActionRate42.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate42#TaxRelatedRate
	 * CorporateActionRate42.TaxRelatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Commission16#VATRate
	 * Commission16.VATRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges1#Rate
	 * TaxCharges1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxType#Rate TaxType.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#Rate
	 * TaxCharges2.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxAmount1#Rate
	 * TaxAmount1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax6#Rate Tax6.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax16#Rate Tax16.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax7#Rate Tax7.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax14#Rate Tax14.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#WithholdingTax
	 * CorporateActionRate2.WithholdingTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#TaxOnIncome
	 * CorporateActionRate2.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#TaxOnProfit
	 * CorporateActionRate2.TaxOnProfit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#TaxReclaim
	 * CorporateActionRate2.TaxReclaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#FiscalStamp
	 * CorporateActionRate2.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#NonResidentRate
	 * CorporateActionRate2.NonResidentRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#TaxCreditRate
	 * TaxVoucher1.TaxCreditRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#WithholdingTaxRate
	 * TaxVoucher1.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#CalculatedRate
	 * SettlementSubTotalCalculatedTax1.CalculatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1#CalculatedRate
	 * LineItemTax1.CalculatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax13#Rate Tax13.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax18#Rate Tax18.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax19#Rate Tax19.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate1#Rate
	 * RateTypeAndPercentageRate1.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails15#FiscalStamp
	 * RateDetails15.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#TaxRelatedRate
	 * RateDetails15.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#WithholdingTaxRate
	 * RateDetails15.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails15#TaxOnIncome
	 * RateDetails15.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails15#TaxOnProfits
	 * RateDetails15.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails15#TaxReclaimRate
	 * RateDetails15.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#TaxRelatedRate
	 * CorporateActionRate46.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate46#WithholdingTaxRate
	 * CorporateActionRate46.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#WithholdingTaxRate
	 * CorporateActionRate45.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#TaxRelatedRate
	 * CorporateActionRate45.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate45#TaxOnIncome
	 * CorporateActionRate45.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat21Choice#Rate
	 * RateAndAmountFormat21Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#WithholdingTaxRate
	 * CorporateActionRate44.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#TaxRelatedRate
	 * CorporateActionRate44.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate44#TaxOnIncome
	 * CorporateActionRate44.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate48#FiscalStamp
	 * CorporateActionRate48.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate49#FiscalStamp
	 * CorporateActionRate49.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#TaxRelatedRate
	 * RateDetails14.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#WithholdingTaxRate
	 * RateDetails14.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#FiscalStamp
	 * RateDetails14.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#TaxOnIncome
	 * RateDetails14.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails14#TaxOnProfits
	 * RateDetails14.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails14#TaxReclaimRate
	 * RateDetails14.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#WithholdingTaxRate
	 * CorporateActionRate60.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#TaxRelatedRate
	 * CorporateActionRate60.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate60#TaxOnIncome
	 * CorporateActionRate60.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate58#FiscalStamp
	 * CorporateActionRate58.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#TaxRelatedRate
	 * RateDetails18.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#WithholdingTaxRate
	 * RateDetails18.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails18#FiscalStamp
	 * RateDetails18.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails18#TaxOnIncome
	 * RateDetails18.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails18#TaxOnProfits
	 * RateDetails18.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails18#TaxReclaimRate
	 * RateDetails18.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3#Rate
	 * RateTypeAndPercentageRate3.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#TaxRelatedRate
	 * CorporateActionRate64.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate64#WithholdingTaxRate
	 * CorporateActionRate64.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat35Choice#Rate
	 * RateAndAmountFormat35Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat32Choice#Rate
	 * RateAndAmountFormat32Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails21#FiscalStamp
	 * RateDetails21.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#TaxRelatedRate
	 * RateDetails21.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#WithholdingTaxRate
	 * RateDetails21.WithholdingTaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails21#TaxOnIncome
	 * RateDetails21.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails21#TaxOnProfits
	 * RateDetails21.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails21#TaxReclaimRate
	 * RateDetails21.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate65#FiscalStamp
	 * CorporateActionRate65.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#WithholdingTaxRate
	 * CorporateActionRate57.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#TaxRelatedRate
	 * CorporateActionRate57.TaxRelatedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate57#TaxOnIncome
	 * CorporateActionRate57.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat40Choice#Rate
	 * RateAndAmountFormat40Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#Rate
	 * RateTypeAndPercentageRate8.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails23#FiscalStamp
	 * RateDetails23.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#WithholdingTaxRate
	 * RateDetails23.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#SecondLevelTax
	 * RateDetails23.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails23#TaxOnIncome
	 * RateDetails23.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails23#TaxOnProfits
	 * RateDetails23.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails23#TaxReclaimRate
	 * RateDetails23.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#WithholdingTaxRate
	 * CorporateActionRate68.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#SecondLevelTax
	 * CorporateActionRate68.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate68#TaxOnIncome
	 * CorporateActionRate68.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate69#FiscalStamp
	 * CorporateActionRate69.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#WithholdingTaxRate
	 * CorporateActionRate70.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate70#SecondLevelTax
	 * CorporateActionRate70.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#WithholdingTaxRate
	 * CorporateActionRate67.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#SecondLevelTax
	 * CorporateActionRate67.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate67#TaxOnIncome
	 * CorporateActionRate67.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#WithholdingTaxRate
	 * RateDetails22.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#SecondLevelTax
	 * RateDetails22.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails22#FiscalStamp
	 * RateDetails22.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails22#TaxOnIncome
	 * RateDetails22.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails22#TaxOnProfits
	 * RateDetails22.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails22#TaxReclaimRate
	 * RateDetails22.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate72#FiscalStamp
	 * CorporateActionRate72.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#TaxRate
	 * TaxReporting1.TaxRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TreasuryProfile1#Rate
	 * TreasuryProfile1.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#WithholdingTaxRate
	 * CorporateActionRate74.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate74#SecondLevelTax
	 * CorporateActionRate74.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#WithholdingTaxRate
	 * CorporateActionRate79.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#SecondLevelTax
	 * CorporateActionRate79.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate79#TaxOnIncome
	 * CorporateActionRate79.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails24#FiscalStamp
	 * RateDetails24.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#WithholdingTaxRate
	 * RateDetails24.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#SecondLevelTax
	 * RateDetails24.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails24#TaxOnIncome
	 * RateDetails24.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails24#TaxOnProfits
	 * RateDetails24.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails24#TaxReclaimRate
	 * RateDetails24.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate9#Rate
	 * RateTypeAndPercentageRate9.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#WithholdingTaxRate
	 * RateDetails25.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#SecondLevelTax
	 * RateDetails25.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails25#FiscalStamp
	 * RateDetails25.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails25#TaxOnIncome
	 * RateDetails25.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails25#TaxOnProfits
	 * RateDetails25.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails25#TaxReclaimRate
	 * RateDetails25.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#WithholdingTaxRate
	 * CorporateActionRate76.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#SecondLevelTax
	 * CorporateActionRate76.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate76#TaxOnIncome
	 * CorporateActionRate76.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate77#FiscalStamp
	 * CorporateActionRate77.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat45Choice#Rate
	 * RateAndAmountFormat45Choice.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate75#FiscalStamp
	 * CorporateActionRate75.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#CalculatedRate
	 * SettlementSubTotalCalculatedTax2.CalculatedRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax32#InformativeRate
	 * Tax32.InformativeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax31#AppliedRate
	 * Tax31.AppliedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxAmountOrRate4Choice#Rate
	 * TaxAmountOrRate4Choice.Rate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#TaxRate
	 * TaxReporting2.TaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#WithholdingTaxRate
	 * RateDetails26.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#SecondLevelTax
	 * RateDetails26.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails26#FiscalStamp
	 * RateDetails26.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails26#TaxOnIncome
	 * RateDetails26.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails26#TaxOnProfits
	 * RateDetails26.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails26#TaxReclaimRate
	 * RateDetails26.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#WithholdingTaxRate
	 * CorporateActionRate82.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate82#SecondLevelTax
	 * CorporateActionRate82.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#WithholdingTaxRate
	 * CorporateActionRate80.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#SecondLevelTax
	 * CorporateActionRate80.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate80#TaxOnIncome
	 * CorporateActionRate80.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails27#FiscalStamp
	 * RateDetails27.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#WithholdingTaxRate
	 * RateDetails27.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#SecondLevelTax
	 * RateDetails27.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails27#TaxOnIncome
	 * RateDetails27.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails27#TaxOnProfits
	 * RateDetails27.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails27#TaxReclaimRate
	 * RateDetails27.TaxReclaimRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#WithholdingTaxRate
	 * CorporateActionRate81.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#SecondLevelTax
	 * CorporateActionRate81.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate81#TaxOnIncome
	 * CorporateActionRate81.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#WithholdingTaxRate
	 * CorporateActionRate83.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#SecondLevelTax
	 * CorporateActionRate83.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate83#TaxOnIncome
	 * CorporateActionRate83.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#WithholdingTaxRate
	 * CorporateActionRate84.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#SecondLevelTax
	 * CorporateActionRate84.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate84#TaxOnIncome
	 * CorporateActionRate84.TaxOnIncome}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#WithholdingTaxRate
	 * CorporateActionRate85.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate85#SecondLevelTax
	 * CorporateActionRate85.SecondLevelTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#WithholdingTaxRate
	 * RateDetails28.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#SecondLevelTax
	 * RateDetails28.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#FiscalStamp
	 * RateDetails28.FiscalStamp}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#TaxOnIncome
	 * RateDetails28.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails28#TaxOnProfits
	 * RateDetails28.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails28#TaxReclaimRate
	 * RateDetails28.TaxReclaimRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails30#FiscalStamp
	 * RateDetails30.FiscalStamp}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#WithholdingTaxRate
	 * RateDetails30.WithholdingTaxRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#SecondLevelTax
	 * RateDetails30.SecondLevelTax}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails30#TaxOnIncome
	 * RateDetails30.TaxOnIncome}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.RateDetails30#TaxOnProfits
	 * RateDetails30.TaxOnProfits}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateDetails30#TaxReclaimRate
	 * RateDetails30.TaxReclaimRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Rate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax8.Rate, com.tools20022.repository.msg.Tax17.Rate, com.tools20022.repository.msg.CorporateActionRate4.FiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate4.NonResidentRate, com.tools20022.repository.msg.CorporateActionRate4.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate4.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate4.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate4.TaxOnProfits, com.tools20022.repository.msg.CorporateActionRate4.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate10.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate10.NonResidentRate, com.tools20022.repository.msg.CorporateActionRate10.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate10.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate10.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate10.TaxOnProfits,
					com.tools20022.repository.msg.CorporateActionRate10.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate20.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate20.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails2.FiscalStamp, com.tools20022.repository.msg.RateDetails2.TaxRelatedRate, com.tools20022.repository.msg.RateDetails2.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails2.TaxOnIncome, com.tools20022.repository.msg.RateDetails2.TaxOnProfits, com.tools20022.repository.msg.RateDetails2.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate22.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate22.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails4.FiscalStamp,
					com.tools20022.repository.msg.RateDetails4.TaxRelatedRate, com.tools20022.repository.msg.RateDetails4.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails4.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails4.TaxOnProfits, com.tools20022.repository.msg.RateDetails4.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate26.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate26.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate29.FiscalStamp, com.tools20022.repository.msg.RateDetails7.FiscalStamp,
					com.tools20022.repository.msg.RateDetails7.TaxRelatedRate, com.tools20022.repository.msg.RateDetails7.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails7.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails7.TaxOnProfits, com.tools20022.repository.msg.RateDetails7.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate31.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate31.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate34.FiscalStamp, com.tools20022.repository.msg.RateDetails9.FiscalStamp,
					com.tools20022.repository.msg.RateDetails9.TaxRelatedRate, com.tools20022.repository.msg.RateDetails9.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails9.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails9.TaxOnProfits, com.tools20022.repository.msg.RateDetails9.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate38.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate38.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails11.FiscalStamp, com.tools20022.repository.msg.RateDetails11.TaxRelatedRate,
					com.tools20022.repository.msg.RateDetails11.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails11.TaxOnIncome, com.tools20022.repository.msg.RateDetails11.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails11.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate39.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate39.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails12.FiscalStamp, com.tools20022.repository.msg.RateDetails12.TaxRelatedRate, com.tools20022.repository.msg.RateDetails12.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails12.TaxOnIncome, com.tools20022.repository.msg.RateDetails12.TaxOnProfits, com.tools20022.repository.msg.RateDetails12.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate5.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate5.NonResidentRate, com.tools20022.repository.msg.CorporateActionRate5.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate5.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate5.TaxOnProfits, com.tools20022.repository.msg.CorporateActionRate5.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate5.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate12.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate12.NonResidentRate,
					com.tools20022.repository.msg.CorporateActionRate12.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate12.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate12.TaxOnProfits,
					com.tools20022.repository.msg.CorporateActionRate12.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate12.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate15.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate15.TaxRelatedRate, com.tools20022.repository.msg.RateDetails3.TaxRelatedRate, com.tools20022.repository.msg.RateDetails3.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails3.FiscalStamp, com.tools20022.repository.msg.RateDetails3.TaxOnIncome, com.tools20022.repository.msg.RateDetails3.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails3.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate18.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate18.TaxRelatedRate,
					com.tools20022.repository.msg.RateDetails5.TaxRelatedRate, com.tools20022.repository.msg.RateDetails5.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails5.FiscalStamp,
					com.tools20022.repository.msg.RateDetails5.TaxOnIncome, com.tools20022.repository.msg.RateDetails5.TaxOnProfits, com.tools20022.repository.msg.RateDetails5.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate25.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate25.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate28.FiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate30.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate30.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate33.FiscalStamp,
					com.tools20022.repository.msg.CorporateActionRate37.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate37.TaxRelatedRate, com.tools20022.repository.msg.RateDetails10.TaxRelatedRate,
					com.tools20022.repository.msg.RateDetails10.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails10.FiscalStamp, com.tools20022.repository.msg.RateDetails10.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails10.TaxOnProfits, com.tools20022.repository.msg.RateDetails10.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate40.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate40.TaxRelatedRate, com.tools20022.repository.msg.RateDetails13.TaxRelatedRate, com.tools20022.repository.msg.RateDetails13.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails13.FiscalStamp, com.tools20022.repository.msg.RateDetails13.TaxOnIncome, com.tools20022.repository.msg.RateDetails13.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails13.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate36.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate36.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate42.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate42.TaxRelatedRate, com.tools20022.repository.msg.Commission16.VATRate,
					com.tools20022.repository.msg.TaxCharges1.Rate, com.tools20022.repository.msg.TaxType.Rate, com.tools20022.repository.msg.TaxCharges2.Rate, com.tools20022.repository.msg.TaxAmount1.Rate,
					com.tools20022.repository.msg.Tax6.Rate, com.tools20022.repository.msg.Tax16.Rate, com.tools20022.repository.msg.Tax7.Rate, com.tools20022.repository.msg.Tax14.Rate,
					com.tools20022.repository.msg.CorporateActionRate2.WithholdingTax, com.tools20022.repository.msg.CorporateActionRate2.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate2.TaxOnProfit,
					com.tools20022.repository.msg.CorporateActionRate2.TaxReclaim, com.tools20022.repository.msg.CorporateActionRate2.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate2.NonResidentRate,
					com.tools20022.repository.msg.TaxVoucher1.TaxCreditRate, com.tools20022.repository.msg.TaxVoucher1.WithholdingTaxRate, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.CalculatedRate,
					com.tools20022.repository.msg.LineItemTax1.CalculatedRate, com.tools20022.repository.msg.Tax13.Rate, com.tools20022.repository.msg.Tax18.Rate, com.tools20022.repository.msg.Tax19.Rate,
					com.tools20022.repository.msg.RateTypeAndPercentageRate1.Rate, com.tools20022.repository.msg.RateDetails15.FiscalStamp, com.tools20022.repository.msg.RateDetails15.TaxRelatedRate,
					com.tools20022.repository.msg.RateDetails15.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails15.TaxOnIncome, com.tools20022.repository.msg.RateDetails15.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails15.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate46.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate46.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate45.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate45.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate45.TaxOnIncome,
					com.tools20022.repository.choice.RateAndAmountFormat21Choice.Rate, com.tools20022.repository.msg.CorporateActionRate44.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate44.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate44.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate48.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate49.FiscalStamp,
					com.tools20022.repository.msg.RateDetails14.TaxRelatedRate, com.tools20022.repository.msg.RateDetails14.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails14.FiscalStamp,
					com.tools20022.repository.msg.RateDetails14.TaxOnIncome, com.tools20022.repository.msg.RateDetails14.TaxOnProfits, com.tools20022.repository.msg.RateDetails14.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate60.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate60.TaxRelatedRate, com.tools20022.repository.msg.CorporateActionRate60.TaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate58.FiscalStamp, com.tools20022.repository.msg.RateDetails18.TaxRelatedRate, com.tools20022.repository.msg.RateDetails18.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails18.FiscalStamp, com.tools20022.repository.msg.RateDetails18.TaxOnIncome, com.tools20022.repository.msg.RateDetails18.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails18.TaxReclaimRate, com.tools20022.repository.msg.RateTypeAndPercentageRate3.Rate, com.tools20022.repository.msg.CorporateActionRate64.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate64.WithholdingTaxRate, com.tools20022.repository.choice.RateAndAmountFormat35Choice.Rate, com.tools20022.repository.choice.RateAndAmountFormat32Choice.Rate,
					com.tools20022.repository.msg.RateDetails21.FiscalStamp, com.tools20022.repository.msg.RateDetails21.TaxRelatedRate, com.tools20022.repository.msg.RateDetails21.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails21.TaxOnIncome, com.tools20022.repository.msg.RateDetails21.TaxOnProfits, com.tools20022.repository.msg.RateDetails21.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate65.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate57.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate57.TaxRelatedRate,
					com.tools20022.repository.msg.CorporateActionRate57.TaxOnIncome, com.tools20022.repository.choice.RateAndAmountFormat40Choice.Rate, com.tools20022.repository.msg.RateTypeAndPercentageRate8.Rate,
					com.tools20022.repository.msg.RateDetails23.FiscalStamp, com.tools20022.repository.msg.RateDetails23.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails23.SecondLevelTax,
					com.tools20022.repository.msg.RateDetails23.TaxOnIncome, com.tools20022.repository.msg.RateDetails23.TaxOnProfits, com.tools20022.repository.msg.RateDetails23.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate68.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate68.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate68.TaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate69.FiscalStamp, com.tools20022.repository.msg.CorporateActionRate70.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate70.SecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate67.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate67.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate67.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails22.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails22.SecondLevelTax, com.tools20022.repository.msg.RateDetails22.FiscalStamp,
					com.tools20022.repository.msg.RateDetails22.TaxOnIncome, com.tools20022.repository.msg.RateDetails22.TaxOnProfits, com.tools20022.repository.msg.RateDetails22.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate72.FiscalStamp, com.tools20022.repository.msg.TaxReporting1.TaxRate, com.tools20022.repository.msg.TreasuryProfile1.Rate,
					com.tools20022.repository.msg.CorporateActionRate74.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate74.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate79.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate79.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate79.TaxOnIncome, com.tools20022.repository.msg.RateDetails24.FiscalStamp,
					com.tools20022.repository.msg.RateDetails24.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails24.SecondLevelTax, com.tools20022.repository.msg.RateDetails24.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails24.TaxOnProfits, com.tools20022.repository.msg.RateDetails24.TaxReclaimRate, com.tools20022.repository.msg.RateTypeAndPercentageRate9.Rate,
					com.tools20022.repository.msg.RateDetails25.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails25.SecondLevelTax, com.tools20022.repository.msg.RateDetails25.FiscalStamp,
					com.tools20022.repository.msg.RateDetails25.TaxOnIncome, com.tools20022.repository.msg.RateDetails25.TaxOnProfits, com.tools20022.repository.msg.RateDetails25.TaxReclaimRate,
					com.tools20022.repository.msg.CorporateActionRate76.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate76.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate76.TaxOnIncome,
					com.tools20022.repository.msg.CorporateActionRate77.FiscalStamp, com.tools20022.repository.choice.RateAndAmountFormat45Choice.Rate, com.tools20022.repository.msg.CorporateActionRate75.FiscalStamp,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.CalculatedRate, com.tools20022.repository.msg.Tax32.InformativeRate, com.tools20022.repository.msg.Tax31.AppliedRate,
					com.tools20022.repository.choice.TaxAmountOrRate4Choice.Rate, com.tools20022.repository.msg.TaxReporting2.TaxRate, com.tools20022.repository.msg.RateDetails26.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails26.SecondLevelTax, com.tools20022.repository.msg.RateDetails26.FiscalStamp, com.tools20022.repository.msg.RateDetails26.TaxOnIncome,
					com.tools20022.repository.msg.RateDetails26.TaxOnProfits, com.tools20022.repository.msg.RateDetails26.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate82.WithholdingTaxRate,
					com.tools20022.repository.msg.CorporateActionRate82.SecondLevelTax, com.tools20022.repository.msg.CorporateActionRate80.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate80.SecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate80.TaxOnIncome, com.tools20022.repository.msg.RateDetails27.FiscalStamp, com.tools20022.repository.msg.RateDetails27.WithholdingTaxRate,
					com.tools20022.repository.msg.RateDetails27.SecondLevelTax, com.tools20022.repository.msg.RateDetails27.TaxOnIncome, com.tools20022.repository.msg.RateDetails27.TaxOnProfits,
					com.tools20022.repository.msg.RateDetails27.TaxReclaimRate, com.tools20022.repository.msg.CorporateActionRate81.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate81.SecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate81.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate83.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate83.SecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate83.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate84.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate84.SecondLevelTax,
					com.tools20022.repository.msg.CorporateActionRate84.TaxOnIncome, com.tools20022.repository.msg.CorporateActionRate85.WithholdingTaxRate, com.tools20022.repository.msg.CorporateActionRate85.SecondLevelTax,
					com.tools20022.repository.msg.RateDetails28.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails28.SecondLevelTax, com.tools20022.repository.msg.RateDetails28.FiscalStamp,
					com.tools20022.repository.msg.RateDetails28.TaxOnIncome, com.tools20022.repository.msg.RateDetails28.TaxOnProfits, com.tools20022.repository.msg.RateDetails28.TaxReclaimRate,
					com.tools20022.repository.msg.RateDetails30.FiscalStamp, com.tools20022.repository.msg.RateDetails30.WithholdingTaxRate, com.tools20022.repository.msg.RateDetails30.SecondLevelTax,
					com.tools20022.repository.msg.RateDetails30.TaxOnIncome, com.tools20022.repository.msg.RateDetails30.TaxOnProfits, com.tools20022.repository.msg.RateDetails30.TaxReclaimRate);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Rate used for calculation of the tax.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Party which is taxable at a specific location
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Party#TaxationConditions
	 * Party.TaxationConditions}</li>
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
	public static final MMBusinessAssociationEnd TaxableParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableParty";
			definition = "Party which is taxable at a specific location";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Party.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Party.TaxationConditions;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Net asset value calculation for which tax refund information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#TaxRefund
	 * NetAssetValueCalculation.TaxRefund}</li>
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
	public static final MMBusinessAssociationEnd TaxRefundValueCalculation = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRefundValueCalculation";
			definition = "Net asset value calculation for which tax refund information is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> NetAssetValueCalculation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax3#Basis Tax3.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#Basis Tax15.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax15#ExtendedBasis
	 * Tax15.ExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#Code
	 * ChargeTaxBasisType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeTaxBasisType1Choice#Proprietary
	 * ChargeTaxBasisType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#ChargeTaxBasisType
	 * Order16.ChargeTaxBasisType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#ChargeTaxBasisType
	 * Order14.ChargeTaxBasisType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxationBasis1#Structured
	 * TaxationBasis1.Structured}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxationBasis1#AdditionalInformation
	 * TaxationBasis1.AdditionalInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation1#Basis
	 * TaxCalculationInformation1.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5#Basis
	 * TaxCalculationInformation5.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation5#ExtendedBasis
	 * TaxCalculationInformation5.ExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#Basis
	 * TaxCalculationInformation3.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#Basis
	 * TaxCalculationInformation6.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#ExtendedBasis
	 * TaxCalculationInformation6.ExtendedBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice#Basis
	 * TaxCalculationBasisType1Choice.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxCalculationBasisType1Choice#Proprietary
	 * TaxCalculationBasisType1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation7#TaxCalculationBasis
	 * TaxCalculationInformation7.TaxCalculationBasis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax21#Basis Tax21.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.TaxBasis1Choice#Code
	 * TaxBasis1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxBasis1Choice#Proprietary
	 * TaxBasis1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#Basis
	 * TaxCalculationInformation8.Basis}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#ChargeTaxBasisType
	 * Order17.ChargeTaxBasisType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#ChargeTaxBasisType
	 * Order18.ChargeTaxBasisType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax25#Basis Tax25.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#Code
	 * ChargeBasisType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ChargeBasisType1Choice#Proprietary
	 * ChargeBasisType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Tax28#Basis Tax28.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation9#Basis
	 * TaxCalculationInformation9.Basis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#Basis
	 * TaxCalculationInformation10.Basis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Basis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Tax3.Basis, com.tools20022.repository.msg.Tax15.Basis, com.tools20022.repository.msg.Tax15.ExtendedBasis,
					com.tools20022.repository.choice.ChargeTaxBasisType1Choice.Code, com.tools20022.repository.choice.ChargeTaxBasisType1Choice.Proprietary, com.tools20022.repository.msg.Order16.ChargeTaxBasisType,
					com.tools20022.repository.msg.Order14.ChargeTaxBasisType, com.tools20022.repository.msg.TaxationBasis1.Structured, com.tools20022.repository.msg.TaxationBasis1.AdditionalInformation,
					com.tools20022.repository.msg.TaxCalculationInformation1.Basis, com.tools20022.repository.msg.TaxCalculationInformation5.Basis, com.tools20022.repository.msg.TaxCalculationInformation5.ExtendedBasis,
					com.tools20022.repository.msg.TaxCalculationInformation3.Basis, com.tools20022.repository.msg.TaxCalculationInformation6.Basis, com.tools20022.repository.msg.TaxCalculationInformation6.ExtendedBasis,
					com.tools20022.repository.choice.TaxCalculationBasisType1Choice.Basis, com.tools20022.repository.choice.TaxCalculationBasisType1Choice.Proprietary,
					com.tools20022.repository.msg.TaxCalculationInformation7.TaxCalculationBasis, com.tools20022.repository.msg.Tax21.Basis, com.tools20022.repository.choice.TaxBasis1Choice.Code,
					com.tools20022.repository.choice.TaxBasis1Choice.Proprietary, com.tools20022.repository.msg.TaxCalculationInformation8.Basis, com.tools20022.repository.msg.Order17.ChargeTaxBasisType,
					com.tools20022.repository.msg.Order18.ChargeTaxBasisType, com.tools20022.repository.msg.Tax25.Basis, com.tools20022.repository.choice.ChargeBasisType1Choice.Code,
					com.tools20022.repository.choice.ChargeBasisType1Choice.Proprietary, com.tools20022.repository.msg.Tax28.Basis, com.tools20022.repository.msg.TaxCalculationInformation9.Basis,
					com.tools20022.repository.msg.TaxCalculationInformation10.Basis);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Basis";
			definition = "Basis used to determine the capital gain or loss, eg, the purchase price.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxationBasisCode.mmObject();
		}
	};
	/**
	 * Transfer process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#TransferTax
	 * SecuritiesTransfer.TransferTax}</li>
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
	public static final MMBusinessAssociationEnd SecuritiesTransfer = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTransfer";
			definition = "Transfer process for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTransfer.TransferTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type of tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.RateTypeCode
	 * RateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType10Choice#Code
	 * RateType10Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType10Choice#Proprietary
	 * RateType10Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType11Choice#Code
	 * RateType11Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType11Choice#Proprietary
	 * RateType11Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType12Choice#Code
	 * RateType12Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType12Choice#Proprietary
	 * RateType12Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType14Choice#Code
	 * RateType14Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType14Choice#Proprietary
	 * RateType14Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType37Choice#Code
	 * RateType37Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType37Choice#Proprietary
	 * RateType37Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType48Choice#Code
	 * RateType48Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType48Choice#Proprietary
	 * RateType48Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute TaxRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RateType10Choice.Code, com.tools20022.repository.choice.RateType10Choice.Proprietary, com.tools20022.repository.choice.RateType11Choice.Code,
					com.tools20022.repository.choice.RateType11Choice.Proprietary, com.tools20022.repository.choice.RateType12Choice.Code, com.tools20022.repository.choice.RateType12Choice.Proprietary,
					com.tools20022.repository.choice.RateType14Choice.Code, com.tools20022.repository.choice.RateType14Choice.Proprietary, com.tools20022.repository.choice.RateType37Choice.Code,
					com.tools20022.repository.choice.RateType37Choice.Proprietary, com.tools20022.repository.choice.RateType48Choice.Code, com.tools20022.repository.choice.RateType48Choice.Proprietary);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxRateType";
			definition = "Specifies the type of tax rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> RateTypeCode.mmObject();
		}
	};
	/**
	 * Account to be used for taxes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.CashAccount#Tax
	 * CashAccount.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account8Choice#TaxAccount
	 * Account8Choice.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Account9Choice#TaxAccount
	 * Account9Choice.TaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1#CashAccountDetails
	 * TaxReporting1.CashAccountDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#CashAccountDetails
	 * TaxReporting2.CashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAssociationEnd TaxAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Account8Choice.TaxAccount, com.tools20022.repository.choice.Account9Choice.TaxAccount, com.tools20022.repository.msg.TaxReporting1.CashAccountDetails,
					com.tools20022.repository.msg.TaxReporting2.CashAccountDetails);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxAccount";
			definition = "Account to be used for taxes.";
			minOccurs = 0;
			type_lazy = () -> CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies other taxation conditions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative4#TaxationConditions
	 * CorporateActionNarrative4.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative14#TaxationConditions
	 * CorporateActionNarrative14.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative5#TaxationConditions
	 * CorporateActionNarrative5.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative6#TaxationConditions
	 * CorporateActionNarrative6.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative15#TaxationConditions
	 * CorporateActionNarrative15.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative16#TaxationConditions
	 * CorporateActionNarrative16.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative20#TaxationConditions
	 * CorporateActionNarrative20.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative22#TaxationConditions
	 * CorporateActionNarrative22.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative11#TaxationConditions
	 * CorporateActionNarrative11.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative17#TaxationConditions
	 * CorporateActionNarrative17.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative1#TaxationConditions
	 * CorporateActionNarrative1.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative2#TaxationConditions
	 * CorporateActionNarrative2.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative27#TaxationConditions
	 * CorporateActionNarrative27.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative31#TaxationConditions
	 * CorporateActionNarrative31.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative28#TaxationConditions
	 * CorporateActionNarrative28.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative29#TaxationConditions
	 * CorporateActionNarrative29.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative35#TaxationConditions
	 * CorporateActionNarrative35.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative37#TaxationConditions
	 * CorporateActionNarrative37.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative41#TaxationConditions
	 * CorporateActionNarrative41.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative36#TaxationConditions
	 * CorporateActionNarrative36.TaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#ExemptionReasonText
	 * SettlementSubTotalCalculatedTax2.ExemptionReasonText}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute TaxationConditions = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionNarrative4.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative14.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative5.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative6.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative15.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative16.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative20.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative22.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative11.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative17.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative1.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative2.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative27.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative31.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative28.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative29.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative35.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative37.TaxationConditions,
					com.tools20022.repository.msg.CorporateActionNarrative41.TaxationConditions, com.tools20022.repository.msg.CorporateActionNarrative36.TaxationConditions,
					com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.ExemptionReasonText);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxationConditions";
			definition = "Specifies other taxation conditions.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	/**
	 * Specifies the adjustments subject to a tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Adjustment#Tax
	 * Adjustment.Tax}</li>
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
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Specifies the adjustments subject to a tax.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Interest for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#InterestTax
	 * Interest.InterestTax}</li>
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
	public static final MMBusinessAssociationEnd Interest = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.InterestTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges1#Identification
	 * TaxCharges1.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#TaxReferenceNumber
	 * TaxInformation2.TaxReferenceNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxCharges2#Identification
	 * TaxCharges2.Identification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#ReferenceNumber
	 * TaxInformation3.ReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#CategoryCode
	 * SettlementSubTotalCalculatedTax1.CategoryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification1#TaxIdentificationNumber
	 * TaxIdentification1.TaxIdentificationNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Garnishment1#ReferenceNumber
	 * Garnishment1.ReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#ReferenceNumber
	 * TaxInformation4.ReferenceNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#Identification
	 * TaxIdentification2.Identification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Identification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxCharges1.Identification, com.tools20022.repository.msg.TaxInformation2.TaxReferenceNumber, com.tools20022.repository.msg.TaxCharges2.Identification,
					com.tools20022.repository.msg.TaxInformation3.ReferenceNumber, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.CategoryCode, com.tools20022.repository.msg.TaxIdentification1.TaxIdentificationNumber,
					com.tools20022.repository.msg.Garnishment1.ReferenceNumber, com.tools20022.repository.msg.TaxInformation4.ReferenceNumber, com.tools20022.repository.msg.TaxIdentification2.Identification);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Payment to which the tax applies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#TaxOnPayment
	 * Payment.TaxOnPayment}</li>
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
	public static final MMBusinessAssociationEnd RelatedPaymentSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPaymentSettlement";
			definition = "Payment to which the tax applies.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.TaxOnPayment;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxType#TaxableBaseAmount
	 * TaxType.TaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation2#TotalTaxableBaseAmount
	 * TaxInformation2.TotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxAmount1#TaxableBaseAmount
	 * TaxAmount1.TaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#TotalTaxableBaseAmount
	 * TaxInformation3.TotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation3#TaxableAmount
	 * TaxCalculationInformation3.TaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation6#TaxableAmount
	 * TaxCalculationInformation6.TaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals1#TotalTaxableAmount
	 * InvoiceTotals1.TotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#TaxBasisAmount
	 * SettlementMonetarySummation1.TaxBasisAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.LineItemMonetarySummation1#TaxBasisTotalAmount
	 * LineItemMonetarySummation1.TaxBasisTotalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation7#TaxableAmount
	 * TaxCalculationInformation7.TaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceItemTotals1#TotalTaxableAmount
	 * ServiceItemTotals1.TotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvoiceTotals2#TotalTaxableAmount
	 * InvoiceTotals2.TotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceCategoryTotals1#TotalTaxableAmount
	 * ServiceCategoryTotals1.TotalTaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation8#TaxableAmount
	 * TaxCalculationInformation8.TaxableAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#TotalTaxableBaseAmount
	 * TaxInformation4.TotalTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculationInformation10#TaxableAmount
	 * TaxCalculationInformation10.TaxableAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute TaxableBaseAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxType.TaxableBaseAmount, com.tools20022.repository.msg.TaxInformation2.TotalTaxableBaseAmount, com.tools20022.repository.msg.TaxAmount1.TaxableBaseAmount,
					com.tools20022.repository.msg.TaxInformation3.TotalTaxableBaseAmount, com.tools20022.repository.msg.TaxCalculationInformation3.TaxableAmount, com.tools20022.repository.msg.TaxCalculationInformation6.TaxableAmount,
					com.tools20022.repository.msg.InvoiceTotals1.TotalTaxableAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.TaxBasisAmount, com.tools20022.repository.msg.LineItemMonetarySummation1.TaxBasisTotalAmount,
					com.tools20022.repository.msg.TaxCalculationInformation7.TaxableAmount, com.tools20022.repository.msg.ServiceItemTotals1.TotalTaxableAmount, com.tools20022.repository.msg.InvoiceTotals2.TotalTaxableAmount,
					com.tools20022.repository.msg.ServiceCategoryTotals1.TotalTaxableAmount, com.tools20022.repository.msg.TaxCalculationInformation8.TaxableAmount, com.tools20022.repository.msg.TaxInformation4.TotalTaxableBaseAmount,
					com.tools20022.repository.msg.TaxCalculationInformation10.TaxableAmount);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxableBaseAmount";
			definition = "Amount of money on which the tax is based.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Date by which tax is due.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation2#TaxDate
	 * TaxInformation2.TaxDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Date
	 * TaxInformation3.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTax1#TaxPointDate
	 * SettlementTax1.TaxPointDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#TaxPointDate
	 * LineItemTax1.TaxPointDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#PointDate
	 * BillingTaxRegion1.PointDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Date
	 * TaxInformation4.Date}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#FiscalYear
	 * InvestmentAccount49.FiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#FiscalYear
	 * InvestmentAccount51.FiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#FiscalYear
	 * InvestmentAccount50.FiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#FiscalYear
	 * InvestmentAccount61.FiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#FiscalYear
	 * InvestmentAccount63.FiscalYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#FiscalYear
	 * InvestmentAccount62.FiscalYear}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute TaxDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation2.TaxDate, com.tools20022.repository.msg.TaxInformation3.Date, com.tools20022.repository.msg.SettlementTax1.TaxPointDate,
					com.tools20022.repository.msg.LineItemTax1.TaxPointDate, com.tools20022.repository.msg.BillingTaxRegion1.PointDate, com.tools20022.repository.msg.TaxInformation4.Date,
					com.tools20022.repository.msg.InvestmentAccount49.FiscalYear, com.tools20022.repository.msg.InvestmentAccount51.FiscalYear, com.tools20022.repository.msg.InvestmentAccount50.FiscalYear,
					com.tools20022.repository.msg.InvestmentAccount61.FiscalYear, com.tools20022.repository.msg.InvestmentAccount63.FiscalYear, com.tools20022.repository.msg.InvestmentAccount62.FiscalYear);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDate";
			definition = "Date by which tax is due.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Document issued by taxing authority identifying the tax payer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxDetails#CertificateIdentification
	 * TaxDetails.CertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxRecord1#CertificateIdentification
	 * TaxRecord1.CertificateIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute CertificateIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxDetails.CertificateIdentification, com.tools20022.repository.msg.TaxRecord1.CertificateIdentification);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateIdentification";
			definition = "Document issued by taxing authority identifying the tax payer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Territorial part of a country to which the tax payment is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation3#AdministrationZone
	 * TaxInformation3.AdministrationZone}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountTax1#Region
	 * AccountTax1.Region}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ServiceTaxDesignation1#Region
	 * ServiceTaxDesignation1.Region}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#RegionName
	 * BillingTaxRegion1.RegionName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement1#TaxRegion
	 * BillingStatement1.TaxRegion}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxInformation4#AdministrationZone
	 * TaxInformation4.AdministrationZone}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxIdentification2#Issuer
	 * TaxIdentification2.Issuer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingStatement2#TaxRegion
	 * BillingStatement2.TaxRegion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute AdministrationZone = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.AdministrationZone, com.tools20022.repository.msg.AccountTax1.Region, com.tools20022.repository.msg.ServiceTaxDesignation1.Region,
					com.tools20022.repository.msg.BillingTaxRegion1.RegionName, com.tools20022.repository.msg.BillingStatement1.TaxRegion, com.tools20022.repository.msg.TaxInformation4.AdministrationZone,
					com.tools20022.repository.msg.TaxIdentification2.Issuer, com.tools20022.repository.msg.BillingStatement2.TaxRegion);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AdministrationZone";
			definition = "Territorial part of a country to which the tax payment is related.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	/**
	 * Method used to indicate the underlying business or how the tax is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Method
	 * TaxInformation3.Method}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Method
	 * TaxInformation4.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Method = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Method, com.tools20022.repository.msg.TaxInformation4.Method);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Method";
			definition = "Method used to indicate the underlying business or how the tax is paid.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Record of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.TaxRecord#Tax
	 * TaxRecord.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation3#Record
	 * TaxInformation3.Record}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod1#TaxIdentification
	 * BillingMethod1.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod2#TaxIdentification
	 * BillingMethod2.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingMethod3#TaxIdentification
	 * BillingMethod3.TaxIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#TaxDesignation
	 * BillingService1.TaxDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#TaxIdentification
	 * TaxCalculation1.TaxIdentification}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxInformation4#Record
	 * TaxInformation4.Record}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#TaxDesignation
	 * BillingService2.TaxDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAssociationEnd Record = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxInformation3.Record, com.tools20022.repository.msg.BillingMethod1.TaxIdentification, com.tools20022.repository.msg.BillingMethod2.TaxIdentification,
					com.tools20022.repository.msg.BillingMethod3.TaxIdentification, com.tools20022.repository.msg.BillingService1.TaxDesignation, com.tools20022.repository.msg.TaxCalculation1.TaxIdentification,
					com.tools20022.repository.msg.TaxInformation4.Record, com.tools20022.repository.msg.BillingService2.TaxDesignation);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Record";
			definition = "Record of tax details.";
			minOccurs = 1;
			type_lazy = () -> TaxRecord.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxRecord.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Product on which a tax is applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Product#Tax
	 * Product.Tax}</li>
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
	public static final MMBusinessAssociationEnd Product = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Product";
			definition = "Product on which a tax is applied.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Product.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Product.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency exchange applicable to a tax
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
	 * CurrencyExchange.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1#TaxCurrencyExchange
	 * TradeSettlement1.TaxCurrencyExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAssociationEnd CurrencyExchange = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeSettlement1.TaxCurrencyExchange);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchange";
			definition = "Currency exchange applicable to a tax";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the tax must be settled.
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
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics1#HostCurrencyCode
	 * CashAccountCharacteristics1.HostCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxCalculation1#HostCurrency
	 * TaxCalculation1.HostCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountCharacteristics2#HostCurrencyCode
	 * CashAccountCharacteristics2.HostCurrencyCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute Currency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashAccountCharacteristics1.HostCurrencyCode, com.tools20022.repository.msg.TaxCalculation1.HostCurrency,
					com.tools20022.repository.msg.CashAccountCharacteristics2.HostCurrencyCode);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Currency";
			definition = "Currency in which the tax must be settled.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Specifies each role linked to a tax and played by a party in that
	 * context.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#Tax
	 * TaxPartyRole.Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxPartyRole
	 * TaxPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingTaxRegion1#SendingFinancialInstitution
	 * BillingTaxRegion1.SendingFinancialInstitution}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAssociationEnd PartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BillingTaxRegion1.SendingFinancialInstitution);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a tax and played by a party in that context.";
			minOccurs = 0;
			type_lazy = () -> TaxPartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TaxPartyRole.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute TaxDeduction = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Distribution process for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#DistributionTax
	 * Distribution.DistributionTax}</li>
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
	public static final MMBusinessAssociationEnd RelatedCorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionDistribution";
			definition = "Distribution process for which a tax is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Distribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.DistributionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	public static final MMBusinessAttribute CalculationDate = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationDate";
			definition = "Date on which the tax is calculated.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Dividend for which a tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Dividend#Tax
	 * Dividend.Tax}</li>
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
	public static final MMBusinessAssociationEnd Dividend = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Dividend for which a tax is specified.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Dividend.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Dividend.Tax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate1#RateType
	 * RateTypeAndPercentageRate1.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType28Choice#Code
	 * RateType28Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType28Choice#Proprietary
	 * RateType28Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType30Choice#Code
	 * RateType30Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType30Choice#Proprietary
	 * RateType30Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate3#RateType
	 * RateTypeAndPercentageRate3.RateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate8#RateType
	 * RateTypeAndPercentageRate8.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType42Choice#Code
	 * RateType42Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType42Choice#Proprietary
	 * RateType42Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RateTypeAndPercentageRate9#RateType
	 * RateTypeAndPercentageRate9.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType46Choice#Code
	 * RateType46Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType46Choice#Proprietary
	 * RateType46Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute WithholdingTaxType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RateTypeAndPercentageRate1.RateType, com.tools20022.repository.choice.RateType28Choice.Code, com.tools20022.repository.choice.RateType28Choice.Proprietary,
					com.tools20022.repository.choice.RateType30Choice.Code, com.tools20022.repository.choice.RateType30Choice.Proprietary, com.tools20022.repository.msg.RateTypeAndPercentageRate3.RateType,
					com.tools20022.repository.msg.RateTypeAndPercentageRate8.RateType, com.tools20022.repository.choice.RateType42Choice.Code, com.tools20022.repository.choice.RateType42Choice.Proprietary,
					com.tools20022.repository.msg.RateTypeAndPercentageRate9.RateType, com.tools20022.repository.choice.RateType46Choice.Code, com.tools20022.repository.choice.RateType46Choice.Proprietary);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "WithholdingTaxType";
			definition = "Type of withholding tax rate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> WithholdingTaxRateTypeCode.mmObject();
		}
	};
	/**
	 * Event for which a transaction tax is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#TransactionTax
	 * CorporateActionEvent.TransactionTax}</li>
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
	public static final MMBusinessAssociationEnd CorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEvent";
			definition = "Event for which a transaction tax is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.TransactionTax;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxIdentification2#TaxIdentificationType
	 * TaxIdentification2.TaxIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TaxIdentificationType1Choice#Code
	 * TaxIdentificationType1Choice.Code}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
	public static final MMBusinessAttribute TaxIdentificationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxIdentification2.TaxIdentificationType, com.tools20022.repository.choice.TaxIdentificationType1Choice.Code);
			elementContext_lazy = () -> Tax.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TaxIdentificationType";
			definition = "Type of tax identification number or identifier.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TaxIdentificationNumberTypeCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Tax";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.Tax, com.tools20022.repository.entity.Dividend.Tax, com.tools20022.repository.entity.NetAssetValueCalculation.TaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.TaxRefund, com.tools20022.repository.entity.Party.TaxationConditions, com.tools20022.repository.entity.CashAccount.Tax,
						com.tools20022.repository.entity.Product.Tax, com.tools20022.repository.entity.Adjustment.Tax, com.tools20022.repository.entity.Payment.TaxOnPayment, com.tools20022.repository.entity.SecuritiesTransfer.TransferTax,
						com.tools20022.repository.entity.Interest.InterestTax, com.tools20022.repository.entity.CurrencyExchange.Tax, com.tools20022.repository.entity.CorporateActionEvent.TransactionTax,
						com.tools20022.repository.entity.TaxPartyRole.Tax, com.tools20022.repository.entity.TaxRecord.Tax, com.tools20022.repository.entity.Distribution.DistributionTax);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate4.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate10.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate20.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate22.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate26.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate31.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate38.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate39.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate5.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate12.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate15.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate18.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate25.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate30.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate37.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate40.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate36.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate42.AdditionalTax, com.tools20022.repository.msg.TaxDetails.TaxType, com.tools20022.repository.msg.TaxInformation2.TaxTypeInformation,
						com.tools20022.repository.msg.CorporateActionRate2.GermanLocalTax1, com.tools20022.repository.msg.CorporateActionRate2.GermanLocalTax2, com.tools20022.repository.msg.CorporateActionRate2.GermanLocalTax3,
						com.tools20022.repository.msg.CorporateActionRate2.GermanLocalTax4, com.tools20022.repository.msg.CorporateActionRate2.AdditionalTax, com.tools20022.repository.msg.TaxParty3.TaxExemptionReason,
						com.tools20022.repository.msg.BillingServicesTax1.Rate, com.tools20022.repository.msg.BillingServicesTax2.Rate, com.tools20022.repository.choice.BillingMethod1Choice.MethodA,
						com.tools20022.repository.choice.BillingMethod1Choice.MethodB, com.tools20022.repository.choice.BillingMethod1Choice.MethodD, com.tools20022.repository.msg.BillingServicesTax3.Rate,
						com.tools20022.repository.msg.BillingMethod4.TaxCalculation, com.tools20022.repository.msg.BillingTaxRegion1.MethodC, com.tools20022.repository.msg.Tax18.TaxType, com.tools20022.repository.msg.Tax19.TaxType,
						com.tools20022.repository.msg.CorporateActionRate46.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate45.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate44.AdditionalTax,
						com.tools20022.repository.msg.Tax23.AmountOrPercentage, com.tools20022.repository.msg.CorporateActionRate60.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate64.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate57.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate68.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate70.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate67.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate74.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate79.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate76.AdditionalTax, com.tools20022.repository.msg.TradeSettlement2.SubTotalCalculatedTax, com.tools20022.repository.msg.CorporateActionRate82.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate80.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate81.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate83.AdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate84.AdditionalTax, com.tools20022.repository.msg.CorporateActionRate85.AdditionalTax);
				subType_lazy = () -> Arrays.asList(SecuritiesTax.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Tax.ExemptionReason, com.tools20022.repository.entity.Tax.Country, com.tools20022.repository.entity.Tax.TaxLiabilityValueCalculation,
						com.tools20022.repository.entity.Tax.Type, com.tools20022.repository.entity.Tax.Amount, com.tools20022.repository.entity.Tax.Rate, com.tools20022.repository.entity.Tax.TaxableParty,
						com.tools20022.repository.entity.Tax.TaxRefundValueCalculation, com.tools20022.repository.entity.Tax.Basis, com.tools20022.repository.entity.Tax.SecuritiesTransfer, com.tools20022.repository.entity.Tax.TaxRateType,
						com.tools20022.repository.entity.Tax.TaxAccount, com.tools20022.repository.entity.Tax.TaxationConditions, com.tools20022.repository.entity.Tax.Adjustment, com.tools20022.repository.entity.Tax.Interest,
						com.tools20022.repository.entity.Tax.Identification, com.tools20022.repository.entity.Tax.RelatedPaymentSettlement, com.tools20022.repository.entity.Tax.TaxableBaseAmount,
						com.tools20022.repository.entity.Tax.TaxDate, com.tools20022.repository.entity.Tax.CertificateIdentification, com.tools20022.repository.entity.Tax.AdministrationZone, com.tools20022.repository.entity.Tax.Method,
						com.tools20022.repository.entity.Tax.Record, com.tools20022.repository.entity.Tax.Product, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Tax.Currency,
						com.tools20022.repository.entity.Tax.PartyRole, com.tools20022.repository.entity.Tax.TaxDeduction, com.tools20022.repository.entity.Tax.RelatedCorporateActionDistribution,
						com.tools20022.repository.entity.Tax.CalculationDate, com.tools20022.repository.entity.Tax.Dividend, com.tools20022.repository.entity.Tax.WithholdingTaxType,
						com.tools20022.repository.entity.Tax.CorporateActionEvent, com.tools20022.repository.entity.Tax.TaxIdentificationType);
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
}