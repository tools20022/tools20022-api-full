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
import com.tools20022.repository.choice.RateType1Choice;
import com.tools20022.repository.choice.RateType2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Information needed to process a currency exchange or conversion.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CurrencyExchange" src="doc-files/CurrencyExchange.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#OriginalAmount
 * CurrencyExchange.OriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.CurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#UnitCurrency
 * CurrencyExchange.UnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#QuotedCurrency
 * CurrencyExchange.QuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ExchangeRate
 * CurrencyExchange.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ResultingAmount
 * CurrencyExchange.ResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedCorporateActionEvent
 * CurrencyExchange.RelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.CurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#QuotationDate
 * CurrencyExchange.QuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CalculatedAssetValue
 * CurrencyExchange.CalculatedAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#SourceCurrency
 * CurrencyExchange.SourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#TargetCurrency
 * CurrencyExchange.TargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashEntry
 * CurrencyExchange.CurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedPayment
 * CurrencyExchange.RelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#RateType
 * CurrencyExchange.RateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedLimitManagement
 * CurrencyExchange.RelatedLimitManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#FixingConditions
 * CurrencyExchange.FixingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Tax
 * CurrencyExchange.Tax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#RelatedInvoice
 * CurrencyExchange.RelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.CurrencyExchangeForTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#ReportedAccount
 * CurrencyExchange.ReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#PaymentExecution
 * CurrencyExchange.PaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.CurrencyExchangeForSecuritiesQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.CurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#CurrencyExchangeForCashDistribution
 * CurrencyExchange.CurrencyExchangeForCashDistribution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#Adjustment
 * CurrencyExchange.Adjustment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
 * Account.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
 * Tax.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
 * Adjustment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
 * Payment.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
 * CashEntry.CurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
 * AssetHolding.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
 * PaymentExecution.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CurrencyExchange
 * TransactionAdministrator.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
 * ForeignExchangeTrade.AgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
 * SecuritiesConversion.ConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
 * SecuritiesBalance.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
 * CorporateActionEvent.ExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
 * CorporateActionCashEntitlement.ExchangeRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FixingCondition#FixingRate
 * FixingCondition.FixingRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
 * Invoice.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#CurrencyExchange
 * LiquidityManagementLimit.CurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#DistributionCurrencyExchangeInformation
 * CashDistribution.DistributionCurrencyExchangeInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#QuotedRate
 * Quote.QuotedRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#ForeignExchangeDetails
 * TaxVoucher1.ForeignExchangeDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11
 * ForeignExchangeTerms11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12
 * ForeignExchangeTerms12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13
 * ForeignExchangeTerms13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15
 * ForeignExchangeTerms15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19
 * ForeignExchangeTerms19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
 * ForeignExchangeTerms5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1
 * ForeignExchangeTerms1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2
 * ForeignExchangeTerms2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3
 * ForeignExchangeTerms3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6
 * ForeignExchangeTerms6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14
 * ForeignExchangeTerms14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16
 * ForeignExchangeTerms16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails
 * CurrencyReferenceDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange4
 * CurrencyExchange4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18
 * ForeignExchangeTerms18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange3
 * CurrencyExchange3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange5
 * CurrencyExchange5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRateInformation1
 * ExchangeRateInformation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1 ExchangeRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1 AgreedRate1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2 AgreedRate2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4
 * ForeignExchangeTerms4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7
 * ForeignExchangeTerms7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8
 * ForeignExchangeTerms8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9
 * ForeignExchangeTerms9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReference2
 * CurrencyReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria
 * CurrencyExchangeSearchCriteria}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails
 * CurrencyExchangeDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17
 * ForeignExchangeTerms17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange6
 * CurrencyExchange6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10
 * ForeignExchangeTerms10}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType1Choice
 * RateType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.RateType2Choice
 * RateType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencySourceTarget1
 * CurrencySourceTarget1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange7
 * CurrencyExchange7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion1
 * CurrencyConversion1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyDesignation1
 * CurrencyDesignation1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion3
 * CurrencyConversion3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion2
 * CurrencyConversion2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchange1
 * ForeignExchange1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion4
 * CurrencyConversion4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5
 * CurrencyConversion5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22
 * ForeignExchangeTerms22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23
 * ForeignExchangeTerms23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24
 * ForeignExchangeTerms24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3 AgreedRate3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26
 * ForeignExchangeTerms26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28
 * ForeignExchangeTerms28}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27
 * ForeignExchangeTerms27}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31
 * ForeignExchangeTerms31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion7
 * CurrencyConversion7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion6
 * CurrencyConversion6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion8
 * CurrencyConversion8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion9
 * CurrencyConversion9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion10
 * CurrencyConversion10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
 * ForeignExchangeTerms33}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32
 * ForeignExchangeTerms32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyReference3
 * CurrencyReference3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion13
 * CurrencyConversion13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion12
 * CurrencyConversion12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion11
 * CurrencyConversion11}</li>
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
 * "CurrencyExchange"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information needed to process a currency exchange or conversion."</li>
 * </ul>
 */
public class CurrencyExchange {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount in its original currency when conversion from/into another
	 * currency has occurred.
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection8.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection32.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection9.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection12.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection33.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection17.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#OriginalAmount
	 * CorporateActionAmounts2.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#OriginalAmount
	 * CorporateActionAmounts5.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#OriginalAmount
	 * CorporateActionAmounts11.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#OriginalAmount
	 * CorporateActionAmounts12.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#OriginalAmount
	 * CorporateActionAmounts17.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#OriginalAmount
	 * CorporateActionAmounts20.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#OriginalAmount
	 * CorporateActionAmounts23.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#OriginalAmount
	 * CorporateActionAmounts24.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#OriginalAmount
	 * CorporateActionAmounts3.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#OriginalAmount
	 * CorporateActionAmounts6.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#OriginalAmount
	 * CorporateActionAmounts9.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#OriginalAmount
	 * CorporateActionAmounts13.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#OriginalAmount
	 * CorporateActionAmounts16.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#OriginalAmount
	 * CorporateActionAmounts19.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#OriginalAmount
	 * CorporateActionAmounts22.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#OriginalAmount
	 * CorporateActionAmounts25.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#OriginalAmount
	 * CorporateActionAmounts4.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#OriginalAmount
	 * CorporateActionAmounts7.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#OriginalAmount
	 * CorporateActionAmounts10.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#OriginalAmount
	 * CorporateActionAmounts14.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#OriginalAmount
	 * CorporateActionAmounts15.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#OriginalAmount
	 * CorporateActionAmounts18.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#OriginalAmount
	 * CorporateActionAmounts21.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#OriginalAmount
	 * CorporateActionAmounts26.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection24.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection2.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection16.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection1.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection29.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection28.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#OriginalCurrencyAmount
	 * OtherAmounts16.OriginalCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#TransactionAmount
	 * AmountAndCurrencyExchange2.TransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#TransactionAmount
	 * AmountAndCurrencyExchange3.TransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#OriginalAmount
	 * CorporateActionRate2.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#OriginalAmount
	 * CorporateActionAmounts1.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#OriginalAmount
	 * ForeignExchangeTerms9.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection10.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection22.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection11.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection25.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection27.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection36.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection37.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#OriginalAmount
	 * CorporateActionAmounts29.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#OriginalAmount
	 * CorporateActionAmounts27.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#OriginalAmount
	 * CorporateActionAmounts28.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#OriginalAmount
	 * CorporateActionAmounts33.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#OriginalAmount
	 * CorporateActionAmounts32.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#OriginalAmount
	 * CorporateActionAmounts35.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection38.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection40.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#OriginalAmount
	 * CurrencyConversion1.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#OriginalAmount
	 * CurrencyConversion2.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#TransactionNominalAmount
	 * ForeignExchangeSwapTransaction1.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#OriginalAmount
	 * CurrencyConversion4.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection46.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection49.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection48.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection44.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection45.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection51.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#OriginalAmount
	 * CorporateActionAmounts37.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#OriginalAmount
	 * CorporateActionAmounts36.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#OriginalAmount
	 * CorporateActionAmounts38.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#OriginalAmount
	 * CorporateActionAmounts39.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#OriginalAmount
	 * CorporateActionAmounts41.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#OriginalAmount
	 * CorporateActionAmounts40.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection66.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection60.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection71.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection85.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection55.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection58.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#OriginalCurrencyAndOrderedAmount
	 * AmountAndDirection67.OriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#TransactionNominalAmount
	 * ForeignExchangeSwapTransaction2.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#OriginalAmount
	 * CurrencyConversion6.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#OriginalAmount
	 * CurrencyConversion9.OriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#TransactionNominalAmount
	 * ForeignExchangeSwapTransaction3.TransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#OriginalAmount
	 * CurrencyConversion12.OriginalAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute OriginalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountAndDirection8.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection32.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection9.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection12.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection33.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection17.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts2.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts5.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts11.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts12.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts17.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts20.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts23.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts24.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts3.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts6.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts9.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts13.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts16.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts19.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts22.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts25.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts4.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts7.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts10.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts14.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts15.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts18.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts21.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts26.OriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection24.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection2.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection16.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection1.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection29.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection28.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.OtherAmounts16.OriginalCurrencyAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.TransactionAmount,
					com.tools20022.repository.msg.AmountAndCurrencyExchange3.TransactionAmount, com.tools20022.repository.msg.CorporateActionRate2.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts1.OriginalAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms9.OriginalAmount, com.tools20022.repository.msg.AmountAndDirection10.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection22.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection11.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection25.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection27.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection36.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection37.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CorporateActionAmounts29.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts27.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts28.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts33.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts32.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts35.OriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection38.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection40.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.CurrencyConversion1.OriginalAmount, com.tools20022.repository.msg.CurrencyConversion2.OriginalAmount, com.tools20022.repository.msg.ForeignExchangeSwapTransaction1.TransactionNominalAmount,
					com.tools20022.repository.msg.CurrencyConversion4.OriginalAmount, com.tools20022.repository.msg.AmountAndDirection46.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection49.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection48.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection44.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection45.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection51.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.CorporateActionAmounts37.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts36.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts38.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts39.OriginalAmount,
					com.tools20022.repository.msg.CorporateActionAmounts41.OriginalAmount, com.tools20022.repository.msg.CorporateActionAmounts40.OriginalAmount,
					com.tools20022.repository.msg.AmountAndDirection66.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection60.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection71.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection85.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection55.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.AmountAndDirection58.OriginalCurrencyAndOrderedAmount,
					com.tools20022.repository.msg.AmountAndDirection67.OriginalCurrencyAndOrderedAmount, com.tools20022.repository.msg.ForeignExchangeSwapTransaction2.TransactionNominalAmount,
					com.tools20022.repository.msg.CurrencyConversion6.OriginalAmount, com.tools20022.repository.msg.CurrencyConversion9.OriginalAmount, com.tools20022.repository.msg.ForeignExchangeSwapTransaction3.TransactionNominalAmount,
					com.tools20022.repository.msg.CurrencyConversion12.OriginalAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Trade which uses the specified exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#AgreedRate
	 * ForeignExchangeTrade.AgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
	 * ForeignExchangeTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForForeignExchangeTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which uses the specified exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ForeignExchangeTrade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency in which the rate of exchange is expressed in a currency
	 * exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#UnitCurrency
	 * ForeignExchangeTerms11.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#UnitCurrency
	 * ForeignExchangeTerms12.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#UnitCurrency
	 * ForeignExchangeTerms13.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#UnitCurrency
	 * ForeignExchangeTerms15.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#UnitCurrency
	 * ForeignExchangeTerms19.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#UnitCurrency
	 * ForeignExchangeTerms5.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#UnitCurrency
	 * ForeignExchangeTerms1.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#UnitCurrency
	 * ForeignExchangeTerms2.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#UnitCurrency
	 * ForeignExchangeTerms3.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#UnitCurrency
	 * ForeignExchangeTerms6.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#UnitCurrency
	 * ForeignExchangeTerms14.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#UnitCurrency
	 * ForeignExchangeTerms16.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#UnitCurrency
	 * ForeignExchangeTerms18.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#UnitCurrency
	 * CurrencyExchange3.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#UnitCurrency
	 * CurrencyExchange5.UnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#UnitCurrency
	 * ExchangeRate1.UnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#UnitCurrency
	 * AgreedRate1.UnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#UnitCurrency
	 * AgreedRate2.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#UnitCurrency
	 * FundOrderData1.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#UnitCurrency
	 * FundOrderData2.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#UnitCurrency
	 * ForeignExchangeTerms4.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#UnitCurrency
	 * ForeignExchangeTerms7.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#UnitCurrency
	 * ForeignExchangeTerms8.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#UnitCurrency
	 * ForeignExchangeTerms9.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#UnitCurrency
	 * ForeignExchangeTerms17.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#UnitCurrency
	 * CurrencyExchange6.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#UnitCurrency
	 * ForeignExchangeTerms10.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#UnitCurrency
	 * ForeignExchangeTerms22.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#UnitCurrency
	 * ForeignExchangeTerms23.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#UnitCurrency
	 * ForeignExchangeTerms24.UnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#UnitCurrency
	 * AgreedRate3.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#UnitCurrency
	 * ForeignExchangeTerms26.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#UnitCurrency
	 * ForeignExchangeTerms28.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#UnitCurrency
	 * ForeignExchangeTerms27.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#UnitCurrency
	 * ForeignExchangeTerms31.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#UnitCurrency
	 * ForeignExchangeTerms33.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#UnitCurrency
	 * ForeignExchangeTerms32.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#UnitCurrency
	 * FundOrderData5.UnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#UnitCurrency
	 * FundOrderData6.UnitCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute UnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms12.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms13.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms15.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms19.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms5.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms1.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms2.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms3.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms6.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms14.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms16.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms18.UnitCurrency, com.tools20022.repository.msg.CurrencyExchange3.UnitCurrency,
					com.tools20022.repository.msg.CurrencyExchange5.UnitCurrency, com.tools20022.repository.msg.ExchangeRate1.UnitCurrency, com.tools20022.repository.msg.AgreedRate1.UnitCurrency,
					com.tools20022.repository.msg.AgreedRate2.UnitCurrency, com.tools20022.repository.msg.FundOrderData1.UnitCurrency, com.tools20022.repository.msg.FundOrderData2.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms4.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms8.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms9.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms17.UnitCurrency, com.tools20022.repository.msg.CurrencyExchange6.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms10.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms22.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms23.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms24.UnitCurrency, com.tools20022.repository.msg.AgreedRate3.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms26.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms28.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms27.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms31.UnitCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms33.UnitCurrency, com.tools20022.repository.msg.ForeignExchangeTerms32.UnitCurrency, com.tools20022.repository.msg.FundOrderData5.UnitCurrency,
					com.tools20022.repository.msg.FundOrderData6.UnitCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which the base currency is converted, in a currency
	 * exchange.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#QuotedCurrency
	 * ForeignExchangeTerms11.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#QuotedCurrency
	 * ForeignExchangeTerms12.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#QuotedCurrency
	 * ForeignExchangeTerms13.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#QuotedCurrency
	 * ForeignExchangeTerms15.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#QuotedCurrency
	 * ForeignExchangeTerms19.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#QuotedCurrency
	 * ForeignExchangeTerms5.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#QuotedCurrency
	 * ForeignExchangeTerms1.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#QuotedCurrency
	 * ForeignExchangeTerms2.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#QuotedCurrency
	 * ForeignExchangeTerms3.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#QuotedCurrency
	 * ForeignExchangeTerms6.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#QuotedCurrency
	 * ForeignExchangeTerms14.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#QuotedCurrency
	 * ForeignExchangeTerms16.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#QuotedCurrency
	 * ForeignExchangeTerms18.QuotedCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#QuotedCurrency
	 * AgreedRate1.QuotedCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#QuotedCurrency
	 * AgreedRate2.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#QuotedCurrency
	 * FundOrderData1.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#QuotedCurrency
	 * FundOrderData2.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#QuotedCurrency
	 * ForeignExchangeTerms4.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#QuotedCurrency
	 * ForeignExchangeTerms7.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#QuotedCurrency
	 * ForeignExchangeTerms8.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#QuotedCurrency
	 * ForeignExchangeTerms9.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#QuotedCurrency
	 * CurrencyExchangeDetails.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#QuotedCurrency
	 * ForeignExchangeTerms17.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#QuotedCurrency
	 * ForeignExchangeTerms10.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#QuotedCurrency
	 * CurrencyExchange7.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#QuotedCurrency
	 * ForeignExchangeTerms22.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#QuotedCurrency
	 * ForeignExchangeTerms23.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#QuotedCurrency
	 * ForeignExchangeTerms24.QuotedCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#QuotedCurrency
	 * AgreedRate3.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#QuotedCurrency
	 * ForeignExchangeTerms26.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#QuotedCurrency
	 * ForeignExchangeTerms28.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#QuotedCurrency
	 * ForeignExchangeTerms27.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#QuotedCurrency
	 * ForeignExchangeTerms31.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#QuotedCurrency
	 * ForeignExchangeTerms33.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#QuotedCurrency
	 * ForeignExchangeTerms32.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#QuotedCurrency
	 * FundOrderData5.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#QuotedCurrency
	 * FundOrderData6.QuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#SettlementCurrency
	 * OpeningConditions1.SettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the base currency is converted, in a currency exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms12.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms13.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms15.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms19.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms5.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms1.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms2.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms3.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms6.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms14.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms16.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms18.QuotedCurrency, com.tools20022.repository.msg.AgreedRate1.QuotedCurrency,
					com.tools20022.repository.msg.AgreedRate2.QuotedCurrency, com.tools20022.repository.msg.FundOrderData1.QuotedCurrency, com.tools20022.repository.msg.FundOrderData2.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms4.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms7.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms8.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms9.QuotedCurrency, com.tools20022.repository.msg.CurrencyExchangeDetails.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms17.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms10.QuotedCurrency, com.tools20022.repository.msg.CurrencyExchange7.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms22.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms23.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms24.QuotedCurrency, com.tools20022.repository.msg.AgreedRate3.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms26.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms28.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms27.QuotedCurrency,
					com.tools20022.repository.msg.ForeignExchangeTerms31.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms33.QuotedCurrency, com.tools20022.repository.msg.ForeignExchangeTerms32.QuotedCurrency,
					com.tools20022.repository.msg.FundOrderData5.QuotedCurrency, com.tools20022.repository.msg.FundOrderData6.QuotedCurrency, com.tools20022.repository.msg.OpeningConditions1.SettlementCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * The value of one currency expressed in relation to another currency.
	 * ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency
	 * (ExchangeRate = UnitCurrency/QuotedCurrency).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#ExchangeRate
	 * ForeignExchangeTerms11.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#ExchangeRate
	 * ForeignExchangeTerms12.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#ExchangeRate
	 * ForeignExchangeTerms13.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#ExchangeRate
	 * ForeignExchangeTerms15.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#ExchangeRate
	 * ForeignExchangeTerms19.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#ExchangeRate
	 * ForeignExchangeTerms5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#ExchangeRate
	 * ForeignExchangeTerms1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#ExchangeRate
	 * ForeignExchangeTerms2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#ExchangeRate
	 * ForeignExchangeTerms3.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#ExchangeRate
	 * ForeignExchangeTerms6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#ExchangeRate
	 * ForeignExchangeTerms14.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#ExchangeRate
	 * ForeignExchangeTerms16.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#ExchangeRate
	 * CurrencyExchange4.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#ExchangeRate
	 * ForeignExchangeTerms18.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#ExchangeRate
	 * CurrencyExchange3.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#ExchangeRate
	 * CurrencyExchange5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#ExchangeRate
	 * ExchangeRateInformation1.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#ExchangeRate
	 * ExchangeRate1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#ExchangeRate
	 * CreditTransferTransaction2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#ExchangeRate
	 * DirectDebitTransactionInformation2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#ExchangeRate
	 * DirectDebitTransactionInformation10.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#ExchangeRate
	 * DirectDebitTransactionInformation12.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#ExchangeRate
	 * DirectDebitTransactionInformation14.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#ExchangeRate
	 * PaymentTransactionInformation5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#ExchangeRate
	 * PaymentTransactionInformation29.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#ExchangeRate
	 * PaymentTransaction36.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#ExchangeRate
	 * PaymentTransaction45.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#ExchangeRate
	 * PaymentTransactionInformation2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#ExchangeRate
	 * PaymentTransactionInformation27.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#ExchangeRate
	 * PaymentTransaction34.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#ExchangeRate
	 * PaymentTransaction44.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#ExchangeRate
	 * AgreedRate1.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#ExchangeRate
	 * AgreedRate2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#ExchangeRate
	 * ForeignExchangeTerms4.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#ExchangeRate
	 * ForeignExchangeTerms7.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#ExchangeRate
	 * ForeignExchangeTerms8.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#ExchangeRate
	 * ForeignExchangeTerms9.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#ExchangeRateInformation
	 * CurrencyReference2.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#ExchangeRate
	 * CollateralValuation1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#ExchangeRate
	 * CurrencyExchangeDetails.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#ForeignExchangeRate
	 * SecuritiesAccount21.ForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#ExchangeRate
	 * ForeignExchangeTerms17.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#ExchangeRate
	 * CurrencyExchange6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#ExchangeRate
	 * PaymentTransactionInformation16.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#ExchangeRate
	 * PaymentTransactionInformation23.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#ExchangeRate
	 * PaymentTransactionInformation17.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#ExchangeRate
	 * PaymentTransactionInformation24.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#ExchangeRate
	 * PaymentTransactionInformation21.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#ExchangeRate
	 * DirectDebitTransactionInformation6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#ExchangeRate
	 * DirectDebitTransactionInformation8.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#ExchangeRate
	 * ForeignExchangeTerms10.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#ExchangeRate
	 * CurrencyExchange7.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#ExchangeRate
	 * CurrencyConversion1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#InvertedExchangeRate
	 * CurrencyConversion1.InvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#ExchangeRate
	 * PaymentTransaction50.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#ExchangeRate
	 * DirectDebitTransactionInformation17.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#ExchangeRate
	 * PaymentTransaction51.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#ExchangeRate
	 * CollateralValuation2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#ExchangeRate
	 * CurrencyConversion2.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#InvertedExchangeRate
	 * CurrencyConversion2.InvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#ExchangeSpotRate
	 * ForeignExchange1.ExchangeSpotRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#ExchangeRate
	 * CurrencyConversion4.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#InvertedExchangeRate
	 * CurrencyConversion4.InvertedExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5#Rate
	 * CurrencyConversion5.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#ExchangeRate
	 * DetailedAmount8.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#ExchangeRate
	 * ForeignExchangeTerms22.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#ValuationRate
	 * Trade3.ValuationRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#StrikePrice
	 * Option10.StrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#ExchangeRate
	 * ForeignExchangeTerms23.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#ExchangeRate
	 * PaymentTransaction65.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#ExchangeRate
	 * DirectDebitTransactionInformation20.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#ExchangeRate
	 * PaymentTransaction60.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#ExchangeRate
	 * ForeignExchangeTerms24.ExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#ExchangeRate
	 * AgreedRate3.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#ExchangeRate
	 * ForeignExchangeTerms26.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#ExchangeRate
	 * CollateralValuation5.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#ExchangeRate
	 * ForeignExchangeTerms28.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#ExchangeRate
	 * ForeignExchangeTerms27.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#ExchangeRate
	 * ForeignExchangeTerms31.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#ExchangeRate
	 * CurrencyConversion6.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#InvertedExchangeRate
	 * CurrencyConversion6.InvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#ExchangeRate
	 * CurrencyConversion9.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#InvertedExchangeRate
	 * CurrencyConversion9.InvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#ExchangeRate
	 * ForeignExchangeTerms33.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#ExchangeRate
	 * ForeignExchangeTerms32.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#ExchangeRateInformation
	 * CurrencyReference3.ExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#ExchangeRate
	 * DirectDebitTransactionInformation21.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#ExchangeRate
	 * PaymentTransaction81.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#ExchangeRate
	 * PaymentTransaction76.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#ExchangeRate
	 * FixingConditions1.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#ExchangeRate
	 * CurrencyConversion12.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#InvertedExchangeRate
	 * CurrencyConversion12.InvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms12.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms13.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms15.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms19.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms5.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms1.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms2.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms3.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms6.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms14.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms16.ExchangeRate, com.tools20022.repository.msg.CurrencyExchange4.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms18.ExchangeRate,
					com.tools20022.repository.msg.CurrencyExchange3.ExchangeRate, com.tools20022.repository.msg.CurrencyExchange5.ExchangeRate, com.tools20022.repository.msg.ExchangeRateInformation1.ExchangeRate,
					com.tools20022.repository.msg.ExchangeRate1.ExchangeRate, com.tools20022.repository.msg.CreditTransferTransaction2.ExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation2.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation10.ExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation12.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation14.ExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation5.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation29.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction36.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction45.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation2.ExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation27.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction34.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransaction44.ExchangeRate, com.tools20022.repository.msg.AgreedRate1.ExchangeRate, com.tools20022.repository.msg.AgreedRate2.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms4.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms7.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms8.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms9.ExchangeRate, com.tools20022.repository.msg.CurrencyReference2.ExchangeRateInformation, com.tools20022.repository.msg.CollateralValuation1.ExchangeRate,
					com.tools20022.repository.msg.CurrencyExchangeDetails.ExchangeRate, com.tools20022.repository.msg.SecuritiesAccount21.ForeignExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms17.ExchangeRate,
					com.tools20022.repository.msg.CurrencyExchange6.ExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation16.ExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation23.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation17.ExchangeRate, com.tools20022.repository.msg.PaymentTransactionInformation24.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransactionInformation21.ExchangeRate, com.tools20022.repository.msg.DirectDebitTransactionInformation6.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation8.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms10.ExchangeRate, com.tools20022.repository.msg.CurrencyExchange7.ExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion1.ExchangeRate, com.tools20022.repository.msg.CurrencyConversion1.InvertedExchangeRate, com.tools20022.repository.msg.PaymentTransaction50.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation17.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction51.ExchangeRate, com.tools20022.repository.msg.CollateralValuation2.ExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion2.ExchangeRate, com.tools20022.repository.msg.CurrencyConversion2.InvertedExchangeRate, com.tools20022.repository.msg.ForeignExchange1.ExchangeSpotRate,
					com.tools20022.repository.msg.CurrencyConversion4.ExchangeRate, com.tools20022.repository.msg.CurrencyConversion4.InvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion5.Rate,
					com.tools20022.repository.msg.DetailedAmount8.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms22.ExchangeRate, com.tools20022.repository.msg.Trade3.ValuationRate,
					com.tools20022.repository.msg.Option10.StrikePrice, com.tools20022.repository.msg.ForeignExchangeTerms23.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction65.ExchangeRate,
					com.tools20022.repository.msg.DirectDebitTransactionInformation20.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction60.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms24.ExchangeRate,
					com.tools20022.repository.msg.AgreedRate3.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms26.ExchangeRate, com.tools20022.repository.msg.CollateralValuation5.ExchangeRate,
					com.tools20022.repository.msg.ForeignExchangeTerms28.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms27.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms31.ExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion6.ExchangeRate, com.tools20022.repository.msg.CurrencyConversion6.InvertedExchangeRate, com.tools20022.repository.msg.CurrencyConversion9.ExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion9.InvertedExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms33.ExchangeRate, com.tools20022.repository.msg.ForeignExchangeTerms32.ExchangeRate,
					com.tools20022.repository.msg.CurrencyReference3.ExchangeRateInformation, com.tools20022.repository.msg.DirectDebitTransactionInformation21.ExchangeRate, com.tools20022.repository.msg.PaymentTransaction81.ExchangeRate,
					com.tools20022.repository.msg.PaymentTransaction76.ExchangeRate, com.tools20022.repository.msg.FixingConditions1.ExchangeRate, com.tools20022.repository.msg.CurrencyConversion12.ExchangeRate,
					com.tools20022.repository.msg.CurrencyConversion12.InvertedExchangeRate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	/**
	 * Amount of money resulting from a foreign exchange transaction.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#ResultingAmount
	 * ForeignExchangeTerms11.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#ResultingAmount
	 * ForeignExchangeTerms12.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#ResultingAmount
	 * ForeignExchangeTerms13.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#ResultingAmount
	 * ForeignExchangeTerms15.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#ResultingAmount
	 * CurrencyExchange4.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#ConvertedAmount
	 * ForeignExchangeTerms18.ConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#ConvertedAmount
	 * OtherAmounts16.ConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#CounterValueAmount
	 * AmountAndCurrencyExchange2.CounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#CounterValueAmount
	 * AmountAndCurrencyExchange3.CounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Value#AlternateCurrencyItem
	 * Value.AlternateCurrencyItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#ResultingAmount
	 * ForeignExchangeTerms8.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#ResultingAmount
	 * ForeignExchangeTerms9.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#ResultingAmount
	 * ForeignExchangeTerms17.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#ResultingAmount
	 * CurrencyConversion1.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#ResultingAmount
	 * CurrencyConversion2.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#ResultingAmount
	 * CurrencyConversion4.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#CalculatedAmount
	 * CurrencyConversion5.CalculatedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#ResultingAmount
	 * ForeignExchangeTerms23.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#ResultingAmount
	 * ForeignExchangeTerms24.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#ResultingAmount
	 * ForeignExchangeTerms28.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#ResultingAmount
	 * ForeignExchangeTerms27.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#ResultingAmount
	 * CurrencyConversion6.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#ResultingAmount
	 * CurrencyConversion9.ResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#ResultingAmount
	 * CurrencyConversion12.ResultingAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from a foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ResultingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms11.ResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms12.ResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms13.ResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms15.ResultingAmount, com.tools20022.repository.msg.CurrencyExchange4.ResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms18.ConvertedAmount, com.tools20022.repository.msg.OtherAmounts16.ConvertedAmount, com.tools20022.repository.msg.AmountAndCurrencyExchange2.CounterValueAmount,
					com.tools20022.repository.msg.AmountAndCurrencyExchange3.CounterValueAmount, com.tools20022.repository.msg.Value.AlternateCurrencyItem, com.tools20022.repository.msg.ForeignExchangeTerms8.ResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms9.ResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms17.ResultingAmount, com.tools20022.repository.msg.CurrencyConversion1.ResultingAmount,
					com.tools20022.repository.msg.CurrencyConversion2.ResultingAmount, com.tools20022.repository.msg.CurrencyConversion4.ResultingAmount, com.tools20022.repository.msg.CurrencyConversion5.CalculatedAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms23.ResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms24.ResultingAmount, com.tools20022.repository.msg.ForeignExchangeTerms28.ResultingAmount,
					com.tools20022.repository.msg.ForeignExchangeTerms27.ResultingAmount, com.tools20022.repository.msg.CurrencyConversion6.ResultingAmount, com.tools20022.repository.msg.CurrencyConversion9.ResultingAmount,
					com.tools20022.repository.msg.CurrencyConversion12.ResultingAmount);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Corporate action for which the offeror/issuer has specified an exchange
	 * rate for the payment in a currency different from the announced one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#ExchangeRate
	 * CorporateActionEvent.ExchangeRate}</li>
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionEvent.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies a securities balance which used a specific exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#ExchangeRate
	 * SecuritiesBalance.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a securities balance which used a specific exchange rate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date and time at which an exchange rate is quoted.
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#QuotationDate
	 * ForeignExchangeTerms5.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#QuotationDate
	 * ForeignExchangeTerms1.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#QuotationDate
	 * ForeignExchangeTerms2.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#QuotationDate
	 * ForeignExchangeTerms3.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#QuotationDate
	 * ForeignExchangeTerms6.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#QuotationDate
	 * ForeignExchangeTerms14.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#QuotationDate
	 * ForeignExchangeTerms16.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#QuotationDate
	 * CurrencyExchange3.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#QuotationDate
	 * CurrencyExchange5.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#QuotationDate
	 * ForeignExchangeTerms4.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#QuotationDate
	 * ForeignExchangeTerms7.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#QuotationDate
	 * CurrencyExchangeDetails.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#QuotationDate
	 * CurrencyExchange6.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#QuotationDate
	 * CurrencyExchange7.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#QuotationDate
	 * CurrencyConversion1.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#QuotationDate
	 * CurrencyConversion2.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#QuotationDate
	 * CurrencyConversion4.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#QuotationDate
	 * DetailedAmount8.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#QuotationDate
	 * ForeignExchangeTerms22.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#QuotationDate
	 * ForeignExchangeTerms26.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#QuotationDate
	 * ForeignExchangeTerms31.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#QuotationDate
	 * CurrencyConversion6.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#QuotationDate
	 * CurrencyConversion9.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#QuotationDate
	 * ForeignExchangeTerms33.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#QuotationDate
	 * ForeignExchangeTerms32.QuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#QuotationDate
	 * CurrencyConversion12.QuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which an exchange rate is quoted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute QuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ForeignExchangeTerms5.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms1.QuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms2.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms3.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms6.QuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms14.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms16.QuotationDate, com.tools20022.repository.msg.CurrencyExchange3.QuotationDate,
					com.tools20022.repository.msg.CurrencyExchange5.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms4.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms7.QuotationDate,
					com.tools20022.repository.msg.CurrencyExchangeDetails.QuotationDate, com.tools20022.repository.msg.CurrencyExchange6.QuotationDate, com.tools20022.repository.msg.CurrencyExchange7.QuotationDate,
					com.tools20022.repository.msg.CurrencyConversion1.QuotationDate, com.tools20022.repository.msg.CurrencyConversion2.QuotationDate, com.tools20022.repository.msg.CurrencyConversion4.QuotationDate,
					com.tools20022.repository.msg.DetailedAmount8.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms22.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms26.QuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms31.QuotationDate, com.tools20022.repository.msg.CurrencyConversion6.QuotationDate, com.tools20022.repository.msg.CurrencyConversion9.QuotationDate,
					com.tools20022.repository.msg.ForeignExchangeTerms33.QuotationDate, com.tools20022.repository.msg.ForeignExchangeTerms32.QuotationDate, com.tools20022.repository.msg.CurrencyConversion12.QuotationDate);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	/**
	 * Asset value calculated in a different currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#ExchangeRate
	 * AssetHolding.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AssetHolding
	 * AssetHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Asset value calculated in a different currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			type_lazy = () -> AssetHolding.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency of the amount to be converted in a currency conversion.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#SourceCurrency
	 * CurrencyReferenceDetails.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#SourceAndTargetCurrency
	 * CurrencyExchange4.SourceAndTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#SourceCurrency
	 * CurrencyExchange3.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#SourceCurrency
	 * CurrencyExchange5.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#SourceCurrency
	 * CurrencyReference2.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#SourceCurrency
	 * CurrencyExchangeSearchCriteria.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#SourceCurrency
	 * CurrencyExchange6.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#SourceCurrency
	 * CurrencySourceTarget1.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#SourceCurrency
	 * CurrencyConversion1.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#SourceCurrency
	 * CurrencyConversion2.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#SourceCurrency
	 * CurrencyConversion4.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#SourceCurrency
	 * CurrencyConversion5.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#SourceCurrency
	 * CurrencyConversion6.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#SourceCurrency
	 * CurrencyConversion9.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#SourceCurrency
	 * CurrencyReference3.SourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#SourceCurrency
	 * CurrencyConversion12.SourceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency of the amount to be converted in a currency conversion."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SourceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyReferenceDetails.SourceCurrency, com.tools20022.repository.msg.CurrencyExchange4.SourceAndTargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange3.SourceCurrency, com.tools20022.repository.msg.CurrencyExchange5.SourceCurrency, com.tools20022.repository.msg.CurrencyReference2.SourceCurrency,
					com.tools20022.repository.msg.CurrencyExchangeSearchCriteria.SourceCurrency, com.tools20022.repository.msg.CurrencyExchange6.SourceCurrency, com.tools20022.repository.msg.CurrencySourceTarget1.SourceCurrency,
					com.tools20022.repository.msg.CurrencyConversion1.SourceCurrency, com.tools20022.repository.msg.CurrencyConversion2.SourceCurrency, com.tools20022.repository.msg.CurrencyConversion4.SourceCurrency,
					com.tools20022.repository.msg.CurrencyConversion5.SourceCurrency, com.tools20022.repository.msg.CurrencyConversion6.SourceCurrency, com.tools20022.repository.msg.CurrencyConversion9.SourceCurrency,
					com.tools20022.repository.msg.CurrencyReference3.SourceCurrency, com.tools20022.repository.msg.CurrencyConversion12.SourceCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Currency into which an amount is to be converted in a currency
	 * conversion.
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#TargetCurrency
	 * CurrencyReferenceDetails.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#TargetCurrency
	 * CurrencyExchange3.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#TargetCurrency
	 * CurrencyExchange5.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#TargetCurrency
	 * CurrencyReference2.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#TargetCurrency
	 * CurrencyExchangeSearchCriteria.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#TargetCurrency
	 * CurrencyExchange6.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#TargetCurrency
	 * CurrencySourceTarget1.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#TargetCurrency
	 * CurrencyConversion1.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#TargetCurrency
	 * CurrencyConversion2.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#ForeignCurrency
	 * ForeignExchange1.ForeignCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#TargetCurrency
	 * CurrencyConversion4.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#TargetCurrency
	 * CurrencyConversion5.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#SettlementCurrency
	 * CashAccount33.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#SettlementCurrency
	 * PaymentInstrument13.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#TargetCurrency
	 * CurrencyConversion6.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#TargetCurrency
	 * CurrencyConversion9.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#TargetCurrency
	 * CurrencyReference3.TargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#TargetCurrency
	 * CurrencyConversion12.TargetCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TargetCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which an amount is to be converted in a currency conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TargetCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrencyReferenceDetails.TargetCurrency, com.tools20022.repository.msg.CurrencyExchange3.TargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange5.TargetCurrency, com.tools20022.repository.msg.CurrencyReference2.TargetCurrency, com.tools20022.repository.msg.CurrencyExchangeSearchCriteria.TargetCurrency,
					com.tools20022.repository.msg.CurrencyExchange6.TargetCurrency, com.tools20022.repository.msg.CurrencySourceTarget1.TargetCurrency, com.tools20022.repository.msg.CurrencyConversion1.TargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion2.TargetCurrency, com.tools20022.repository.msg.ForeignExchange1.ForeignCurrency, com.tools20022.repository.msg.CurrencyConversion4.TargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion5.TargetCurrency, com.tools20022.repository.msg.CashAccount33.SettlementCurrency, com.tools20022.repository.msg.PaymentInstrument13.SettlementCurrency,
					com.tools20022.repository.msg.CurrencyConversion6.TargetCurrency, com.tools20022.repository.msg.CurrencyConversion9.TargetCurrency, com.tools20022.repository.msg.CurrencyReference3.TargetCurrency,
					com.tools20022.repository.msg.CurrencyConversion12.TargetCurrency);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	/**
	 * Cash entry to which the currency exchange parameters apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CurrencyExchange
	 * CashEntry.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash entry to which the currency exchange parameters apply."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment for which currency exchange parameters are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#CurrencyExchange
	 * Payment.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment for which currency exchange parameters are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedPayment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Payment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the type used to complete the currency exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangeRateTypeCode
	 * ExchangeRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#RateType
	 * ExchangeRateInformation1.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#RateType
	 * ExchangeRate1.RateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType1Choice#Code
	 * RateType1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType1Choice#Proprietary
	 * RateType1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType2Choice#Code
	 * RateType2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType2Choice#Proprietary
	 * RateType2Choice.Proprietary}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type used to complete the currency exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ExchangeRateInformation1.RateType, com.tools20022.repository.msg.ExchangeRate1.RateType, com.tools20022.repository.choice.RateType1Choice.Code,
					com.tools20022.repository.choice.RateType1Choice.Proprietary, com.tools20022.repository.choice.RateType2Choice.Code, com.tools20022.repository.choice.RateType2Choice.Proprietary);
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}
	};
	/**
	 * Limit for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#CurrencyExchange
	 * LiquidityManagementLimit.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit
	 * LiquidityManagementLimit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedLimitManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Limit for which an exchange rate is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> LiquidityManagementLimit.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of parameters used to calculate a rate for instance, the fixing rate
	 * to be applied to a non-deliverable agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#FixingRate
	 * FixingCondition.FixingRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FixingCondition
	 * FixingCondition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FixingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd FixingConditions = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			type_lazy = () -> FixingCondition.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.FixingRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Tax for which exchange information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#CurrencyExchange
	 * Tax.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax for which exchange information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Tax = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Invoice for which currency exchange information is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#CurrencyExchange
	 * Invoice.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invoice for which currency exchange information is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvoice = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Invoice.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Set of applications which use currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#CurrencyExchange
	 * TransactionAdministrator.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator
	 * TransactionAdministrator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForTransactionAdministrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of applications which use currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> TransactionAdministrator.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the account which uses an exchange rate to report entries and
	 * balances.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#CurrencyExchange
	 * Account.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account which uses an exchange rate to report entries and balances."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportedAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash entitlement for which an exchange rate is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#ExchangeRate
	 * CorporateActionCashEntitlement.ExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement
	 * CorporateActionCashEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCorporateActionCashEntitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash entitlement for which an exchange rate is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CorporateActionCashEntitlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Payment execution process for which currrency exchange information is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#CurrencyExchange
	 * PaymentExecution.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PaymentExecution
	 * PaymentExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment execution process for which currrency exchange information is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PaymentExecution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Quote which uses currency exchange information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#QuotedRate
	 * Quote.QuotedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which uses currency exchange information."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> Quote.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.QuotedRate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Securities conversion for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#ConversionUnitCurrency
	 * SecuritiesConversion.ConversionUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SecuritiesConversion.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Cash distribution for which a conversion currency is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#DistributionCurrencyExchangeInformation
	 * CashDistribution.DistributionCurrencyExchangeInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashDistribution
	 * CashDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchangeForCashDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash distribution for which a conversion currency is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CashDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Fees or commission applied to the currency exchange.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#CurrencyExchange
	 * Adjustment.CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Adjustment
	 * Adjustment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fees or commission applied to the currency exchange.\r\n"</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Adjustment = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CurrencyExchange.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.CurrencyExchange;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.CurrencyExchange, com.tools20022.repository.entity.Tax.CurrencyExchange, com.tools20022.repository.entity.Adjustment.CurrencyExchange,
						com.tools20022.repository.entity.Payment.CurrencyExchange, com.tools20022.repository.entity.CashEntry.CurrencyExchange, com.tools20022.repository.entity.AssetHolding.ExchangeRate,
						com.tools20022.repository.entity.PaymentExecution.CurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.CurrencyExchange, com.tools20022.repository.entity.ForeignExchangeTrade.AgreedRate,
						com.tools20022.repository.entity.SecuritiesConversion.ConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.ExchangeRate, com.tools20022.repository.entity.CorporateActionEvent.ExchangeRate,
						com.tools20022.repository.entity.CorporateActionCashEntitlement.ExchangeRate, com.tools20022.repository.entity.FixingCondition.FixingRate, com.tools20022.repository.entity.Invoice.CurrencyExchange,
						com.tools20022.repository.entity.LiquidityManagementLimit.CurrencyExchange, com.tools20022.repository.entity.CashDistribution.DistributionCurrencyExchangeInformation,
						com.tools20022.repository.entity.Quote.QuotedRate);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.ForeignExchangeDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.OriginalAmount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.UnitCurrency, com.tools20022.repository.entity.CurrencyExchange.QuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.ExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.ResultingAmount, com.tools20022.repository.entity.CurrencyExchange.RelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.QuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.CalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.SourceCurrency, com.tools20022.repository.entity.CurrencyExchange.TargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.RelatedPayment, com.tools20022.repository.entity.CurrencyExchange.RateType,
						com.tools20022.repository.entity.CurrencyExchange.RelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.FixingConditions, com.tools20022.repository.entity.CurrencyExchange.Tax,
						com.tools20022.repository.entity.CurrencyExchange.RelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.ReportedAccount, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.PaymentExecution, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.CurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.Adjustment);
				derivationComponent_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmObject(), ForeignExchangeTerms12.mmObject(), ForeignExchangeTerms13.mmObject(), ForeignExchangeTerms15.mmObject(), ForeignExchangeTerms19.mmObject(),
						ForeignExchangeTerms5.mmObject(), ForeignExchangeTerms1.mmObject(), ForeignExchangeTerms2.mmObject(), ForeignExchangeTerms3.mmObject(), ForeignExchangeTerms6.mmObject(), ForeignExchangeTerms14.mmObject(),
						ForeignExchangeTerms16.mmObject(), CurrencyReferenceDetails.mmObject(), CurrencyExchange4.mmObject(), ForeignExchangeTerms18.mmObject(), CurrencyExchange3.mmObject(), CurrencyExchange5.mmObject(),
						ExchangeRateInformation1.mmObject(), ExchangeRate1.mmObject(), AgreedRate1.mmObject(), AgreedRate2.mmObject(), ForeignExchangeTerms4.mmObject(), ForeignExchangeTerms7.mmObject(), ForeignExchangeTerms8.mmObject(),
						ForeignExchangeTerms9.mmObject(), CurrencyReference2.mmObject(), CurrencyExchangeSearchCriteria.mmObject(), CurrencyExchangeDetails.mmObject(), ForeignExchangeTerms17.mmObject(), CurrencyExchange6.mmObject(),
						ForeignExchangeTerms10.mmObject(), RateType1Choice.mmObject(), RateType2Choice.mmObject(), CurrencySourceTarget1.mmObject(), CurrencyExchange7.mmObject(), CurrencyConversion1.mmObject(),
						CurrencyDesignation1.mmObject(), CurrencyConversion3.mmObject(), CurrencyConversion2.mmObject(), ForeignExchange1.mmObject(), CurrencyConversion4.mmObject(), CurrencyConversion5.mmObject(),
						ForeignExchangeTerms22.mmObject(), ForeignExchangeTerms23.mmObject(), ForeignExchangeTerms24.mmObject(), AgreedRate3.mmObject(), ForeignExchangeTerms26.mmObject(), ForeignExchangeTerms28.mmObject(),
						ForeignExchangeTerms27.mmObject(), ForeignExchangeTerms31.mmObject(), CurrencyConversion7.mmObject(), CurrencyConversion6.mmObject(), CurrencyConversion8.mmObject(), CurrencyConversion9.mmObject(),
						CurrencyConversion10.mmObject(), ForeignExchangeTerms33.mmObject(), ForeignExchangeTerms32.mmObject(), CurrencyReference3.mmObject(), CurrencyConversion13.mmObject(), CurrencyConversion12.mmObject(),
						CurrencyConversion11.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}