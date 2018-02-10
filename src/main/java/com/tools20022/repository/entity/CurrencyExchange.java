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
import com.tools20022.repository.choice.RateType1Choice;
import com.tools20022.repository.choice.RateType2Choice;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.codeset.ExchangeRateTypeCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
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
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
 * CurrencyExchange.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForForeignExchangeTrade
 * CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
 * CurrencyExchange.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
 * CurrencyExchange.mmQuotedCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
 * CurrencyExchange.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmResultingAmount
 * CurrencyExchange.mmResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedCorporateActionEvent
 * CurrencyExchange.mmRelatedCorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesBalance
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotationDate
 * CurrencyExchange.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCalculatedAssetValue
 * CurrencyExchange.mmCalculatedAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
 * CurrencyExchange.mmSourceCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
 * CurrencyExchange.mmTargetCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashEntry
 * CurrencyExchange.mmCurrencyExchangeForCashEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedPayment
 * CurrencyExchange.mmRelatedPayment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRateType
 * CurrencyExchange.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedLimitManagement
 * CurrencyExchange.mmRelatedLimitManagement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmFixingConditions
 * CurrencyExchange.mmFixingConditions}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTax
 * CurrencyExchange.mmTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmRelatedInvoice
 * CurrencyExchange.mmRelatedInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForTransactionAdministrator
 * CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmReportedAccount
 * CurrencyExchange.mmReportedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCorporateActionCashEntitlement
 * CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmPaymentExecution
 * CurrencyExchange.mmPaymentExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesQuote
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForSecuritiesConversion
 * CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmCurrencyExchangeForCashDistribution
 * CurrencyExchange.mmCurrencyExchangeForCashDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmAdjustment
 * CurrencyExchange.mmAdjustment}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
 * Account.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
 * Tax.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
 * Adjustment.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
 * Payment.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
 * CashEntry.mmCurrencyExchange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
 * AssetHolding.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
 * PaymentExecution.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
 * TransactionAdministrator.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
 * ForeignExchangeTrade.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
 * SecuritiesConversion.mmConversionUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
 * SecuritiesBalance.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
 * CorporateActionEvent.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
 * CorporateActionCashEntitlement.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
 * FixingCondition.mmFixingRate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
 * Invoice.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
 * LiquidityManagementLimit.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
 * Quote.mmQuotedRate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmForeignExchangeDetails
 * TaxVoucher1.mmForeignExchangeDetails}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.BalanceTransferFundingLimit1
 * BalanceTransferFundingLimit1}</li>
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
 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRateBasis2
 * ExchangeRateBasis2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyExchange11
 * CurrencyExchange11}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria1
 * CurrencyExchangeSearchCriteria1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion14
 * CurrencyConversion14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion15
 * CurrencyConversion15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion16
 * CurrencyConversion16}</li>
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
	protected CurrencyAndAmount originalAmount;
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
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection8#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection8.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection32#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection32.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection9#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection9.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection12#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection12.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection33#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection33.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection17#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection17.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts2#mmOriginalAmount
	 * CorporateActionAmounts2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts5#mmOriginalAmount
	 * CorporateActionAmounts5.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts11#mmOriginalAmount
	 * CorporateActionAmounts11.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts12#mmOriginalAmount
	 * CorporateActionAmounts12.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts17#mmOriginalAmount
	 * CorporateActionAmounts17.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts20#mmOriginalAmount
	 * CorporateActionAmounts20.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts23#mmOriginalAmount
	 * CorporateActionAmounts23.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts24#mmOriginalAmount
	 * CorporateActionAmounts24.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts3#mmOriginalAmount
	 * CorporateActionAmounts3.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts6#mmOriginalAmount
	 * CorporateActionAmounts6.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts9#mmOriginalAmount
	 * CorporateActionAmounts9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts13#mmOriginalAmount
	 * CorporateActionAmounts13.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts16#mmOriginalAmount
	 * CorporateActionAmounts16.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts19#mmOriginalAmount
	 * CorporateActionAmounts19.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts22#mmOriginalAmount
	 * CorporateActionAmounts22.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts25#mmOriginalAmount
	 * CorporateActionAmounts25.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts4#mmOriginalAmount
	 * CorporateActionAmounts4.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts7#mmOriginalAmount
	 * CorporateActionAmounts7.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts10#mmOriginalAmount
	 * CorporateActionAmounts10.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts14#mmOriginalAmount
	 * CorporateActionAmounts14.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts15#mmOriginalAmount
	 * CorporateActionAmounts15.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts18#mmOriginalAmount
	 * CorporateActionAmounts18.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts21#mmOriginalAmount
	 * CorporateActionAmounts21.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts26#mmOriginalAmount
	 * CorporateActionAmounts26.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection24#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection24.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection2#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection2.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection16#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection16.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection1#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection1.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection29#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection29.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection28#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection28.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmOriginalCurrencyAmount
	 * OtherAmounts16.mmOriginalCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmTransactionAmount
	 * AmountAndCurrencyExchange2.mmTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmTransactionAmount
	 * AmountAndCurrencyExchange3.mmTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmOriginalAmount
	 * CorporateActionRate2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmOriginalAmount
	 * CorporateActionAmounts1.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmOriginalAmount
	 * ForeignExchangeTerms9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection10#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection10.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection22#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection22.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection11#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection11.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection25#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection25.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection27#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection27.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection36#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection36.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection37#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection37.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts29#mmOriginalAmount
	 * CorporateActionAmounts29.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts27#mmOriginalAmount
	 * CorporateActionAmounts27.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts28#mmOriginalAmount
	 * CorporateActionAmounts28.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts33#mmOriginalAmount
	 * CorporateActionAmounts33.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts32#mmOriginalAmount
	 * CorporateActionAmounts32.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts35#mmOriginalAmount
	 * CorporateActionAmounts35.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection38#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection38.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection40#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection40.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmOriginalAmount
	 * CurrencyConversion1.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmOriginalAmount
	 * CurrencyConversion2.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction1#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction1.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmOriginalAmount
	 * CurrencyConversion4.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection46#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection46.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection49#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection49.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection48#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection48.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection44#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection44.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection45#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection45.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection51#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection51.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts37#mmOriginalAmount
	 * CorporateActionAmounts37.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts36#mmOriginalAmount
	 * CorporateActionAmounts36.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceTransferFundingLimit1#mmCurrencyAmount
	 * BalanceTransferFundingLimit1.mmCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts38#mmOriginalAmount
	 * CorporateActionAmounts38.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts39#mmOriginalAmount
	 * CorporateActionAmounts39.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts41#mmOriginalAmount
	 * CorporateActionAmounts41.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts40#mmOriginalAmount
	 * CorporateActionAmounts40.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection66#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection66.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection60#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection60.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection71#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection71.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection85#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection85.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection55#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection55.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection58#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection58.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection67#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection67.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction2#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction2.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmOriginalAmount
	 * CurrencyConversion6.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmOriginalAmount
	 * CurrencyConversion9.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeSwapTransaction3#mmTransactionNominalAmount
	 * ForeignExchangeSwapTransaction3.mmTransactionNominalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmOriginalAmount
	 * CurrencyConversion12.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection87#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection87.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection88#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection88.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection89#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection89.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts42#mmOriginalAmount
	 * CorporateActionAmounts42.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts43#mmOriginalAmount
	 * CorporateActionAmounts43.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts44#mmOriginalAmount
	 * CorporateActionAmounts44.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts45#mmOriginalAmount
	 * CorporateActionAmounts45.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts46#mmOriginalAmount
	 * CorporateActionAmounts46.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts47#mmOriginalAmount
	 * CorporateActionAmounts47.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection90#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection90.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection92#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection92.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection91#mmOriginalCurrencyAndOrderedAmount
	 * AmountAndDirection91.mmOriginalCurrencyAndOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmOriginalAmount
	 * CurrencyConversion14.mmOriginalAmount}</li>
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
	public static final MMBusinessAttribute mmOriginalAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountAndDirection8.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection32.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection9.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection12.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection33.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection17.mmOriginalCurrencyAndOrderedAmount, CorporateActionAmounts2.mmOriginalAmount,
					CorporateActionAmounts5.mmOriginalAmount, CorporateActionAmounts11.mmOriginalAmount, CorporateActionAmounts12.mmOriginalAmount, CorporateActionAmounts17.mmOriginalAmount, CorporateActionAmounts20.mmOriginalAmount,
					CorporateActionAmounts23.mmOriginalAmount, CorporateActionAmounts24.mmOriginalAmount, CorporateActionAmounts3.mmOriginalAmount, CorporateActionAmounts6.mmOriginalAmount, CorporateActionAmounts9.mmOriginalAmount,
					CorporateActionAmounts13.mmOriginalAmount, CorporateActionAmounts16.mmOriginalAmount, CorporateActionAmounts19.mmOriginalAmount, CorporateActionAmounts22.mmOriginalAmount, CorporateActionAmounts25.mmOriginalAmount,
					CorporateActionAmounts4.mmOriginalAmount, CorporateActionAmounts7.mmOriginalAmount, CorporateActionAmounts10.mmOriginalAmount, CorporateActionAmounts14.mmOriginalAmount, CorporateActionAmounts15.mmOriginalAmount,
					CorporateActionAmounts18.mmOriginalAmount, CorporateActionAmounts21.mmOriginalAmount, CorporateActionAmounts26.mmOriginalAmount, AmountAndDirection24.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection2.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection16.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection1.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection29.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection28.mmOriginalCurrencyAndOrderedAmount, OtherAmounts16.mmOriginalCurrencyAmount, AmountAndCurrencyExchange2.mmTransactionAmount,
					AmountAndCurrencyExchange3.mmTransactionAmount, CorporateActionRate2.mmOriginalAmount, CorporateActionAmounts1.mmOriginalAmount, ForeignExchangeTerms9.mmOriginalAmount,
					AmountAndDirection10.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection22.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection11.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection25.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection27.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection36.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection37.mmOriginalCurrencyAndOrderedAmount, CorporateActionAmounts29.mmOriginalAmount, CorporateActionAmounts27.mmOriginalAmount, CorporateActionAmounts28.mmOriginalAmount,
					CorporateActionAmounts33.mmOriginalAmount, CorporateActionAmounts32.mmOriginalAmount, CorporateActionAmounts35.mmOriginalAmount, AmountAndDirection38.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection40.mmOriginalCurrencyAndOrderedAmount, CurrencyConversion1.mmOriginalAmount, CurrencyConversion2.mmOriginalAmount, ForeignExchangeSwapTransaction1.mmTransactionNominalAmount,
					CurrencyConversion4.mmOriginalAmount, AmountAndDirection46.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection49.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection48.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection44.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection45.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection51.mmOriginalCurrencyAndOrderedAmount, CorporateActionAmounts37.mmOriginalAmount,
					CorporateActionAmounts36.mmOriginalAmount, BalanceTransferFundingLimit1.mmCurrencyAmount, CorporateActionAmounts38.mmOriginalAmount, CorporateActionAmounts39.mmOriginalAmount, CorporateActionAmounts41.mmOriginalAmount,
					CorporateActionAmounts40.mmOriginalAmount, AmountAndDirection66.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection60.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection71.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection85.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection55.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection58.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection67.mmOriginalCurrencyAndOrderedAmount, ForeignExchangeSwapTransaction2.mmTransactionNominalAmount, CurrencyConversion6.mmOriginalAmount, CurrencyConversion9.mmOriginalAmount,
					ForeignExchangeSwapTransaction3.mmTransactionNominalAmount, CurrencyConversion12.mmOriginalAmount, AmountAndDirection87.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection88.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection89.mmOriginalCurrencyAndOrderedAmount, CorporateActionAmounts42.mmOriginalAmount, CorporateActionAmounts43.mmOriginalAmount, CorporateActionAmounts44.mmOriginalAmount,
					CorporateActionAmounts45.mmOriginalAmount, CorporateActionAmounts46.mmOriginalAmount, CorporateActionAmounts47.mmOriginalAmount, AmountAndDirection90.mmOriginalCurrencyAndOrderedAmount,
					AmountAndDirection92.mmOriginalCurrencyAndOrderedAmount, AmountAndDirection91.mmOriginalCurrencyAndOrderedAmount, CurrencyConversion14.mmOriginalAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getOriginalAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ForeignExchangeTrade currencyExchangeForForeignExchangeTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForForeignExchangeTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForForeignExchangeTrade";
			definition = "Trade which uses the specified exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ForeignExchangeTrade.mmObject();
		}
	};
	protected CurrencyCode unitCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmUnitCurrency
	 * ForeignExchangeTerms11.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmUnitCurrency
	 * ForeignExchangeTerms12.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmUnitCurrency
	 * ForeignExchangeTerms13.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmUnitCurrency
	 * ForeignExchangeTerms15.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmUnitCurrency
	 * ForeignExchangeTerms19.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmUnitCurrency
	 * ForeignExchangeTerms5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmUnitCurrency
	 * ForeignExchangeTerms1.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmUnitCurrency
	 * ForeignExchangeTerms2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmUnitCurrency
	 * ForeignExchangeTerms3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmUnitCurrency
	 * ForeignExchangeTerms6.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmUnitCurrency
	 * ForeignExchangeTerms14.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmUnitCurrency
	 * ForeignExchangeTerms16.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmUnitCurrency
	 * ForeignExchangeTerms18.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmUnitCurrency
	 * CurrencyExchange3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmUnitCurrency
	 * CurrencyExchange5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmUnitCurrency
	 * ExchangeRate1.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmUnitCurrency
	 * AgreedRate1.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#mmUnitCurrency
	 * AgreedRate2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitCurrency
	 * FundOrderData1.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmUnitCurrency
	 * FundOrderData2.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmUnitCurrency
	 * ForeignExchangeTerms4.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmUnitCurrency
	 * ForeignExchangeTerms7.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmUnitCurrency
	 * ForeignExchangeTerms8.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmUnitCurrency
	 * ForeignExchangeTerms9.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmUnitCurrency
	 * ForeignExchangeTerms17.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmUnitCurrency
	 * CurrencyExchange6.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmUnitCurrency
	 * ForeignExchangeTerms10.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmUnitCurrency
	 * ForeignExchangeTerms22.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmUnitCurrency
	 * ForeignExchangeTerms23.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmUnitCurrency
	 * ForeignExchangeTerms24.mmUnitCurrency}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmUnitCurrency
	 * AgreedRate3.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmUnitCurrency
	 * ForeignExchangeTerms26.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmUnitCurrency
	 * ForeignExchangeTerms28.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmUnitCurrency
	 * ForeignExchangeTerms27.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmUnitCurrency
	 * ForeignExchangeTerms31.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmUnitCurrency
	 * ForeignExchangeTerms33.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmUnitCurrency
	 * ForeignExchangeTerms32.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitCurrency
	 * FundOrderData5.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmUnitCurrency
	 * FundOrderData6.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateBasis2#mmBaseCurrency
	 * ExchangeRateBasis2.mmBaseCurrency}</li>
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
	public static final MMBusinessAttribute mmUnitCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmUnitCurrency, ForeignExchangeTerms12.mmUnitCurrency, ForeignExchangeTerms13.mmUnitCurrency, ForeignExchangeTerms15.mmUnitCurrency,
					ForeignExchangeTerms19.mmUnitCurrency, ForeignExchangeTerms5.mmUnitCurrency, ForeignExchangeTerms1.mmUnitCurrency, ForeignExchangeTerms2.mmUnitCurrency, ForeignExchangeTerms3.mmUnitCurrency,
					ForeignExchangeTerms6.mmUnitCurrency, ForeignExchangeTerms14.mmUnitCurrency, ForeignExchangeTerms16.mmUnitCurrency, ForeignExchangeTerms18.mmUnitCurrency, CurrencyExchange3.mmUnitCurrency,
					CurrencyExchange5.mmUnitCurrency, ExchangeRate1.mmUnitCurrency, AgreedRate1.mmUnitCurrency, AgreedRate2.mmUnitCurrency, FundOrderData1.mmUnitCurrency, FundOrderData2.mmUnitCurrency, ForeignExchangeTerms4.mmUnitCurrency,
					ForeignExchangeTerms7.mmUnitCurrency, ForeignExchangeTerms8.mmUnitCurrency, ForeignExchangeTerms9.mmUnitCurrency, ForeignExchangeTerms17.mmUnitCurrency, CurrencyExchange6.mmUnitCurrency,
					ForeignExchangeTerms10.mmUnitCurrency, ForeignExchangeTerms22.mmUnitCurrency, ForeignExchangeTerms23.mmUnitCurrency, ForeignExchangeTerms24.mmUnitCurrency, AgreedRate3.mmUnitCurrency,
					ForeignExchangeTerms26.mmUnitCurrency, ForeignExchangeTerms28.mmUnitCurrency, ForeignExchangeTerms27.mmUnitCurrency, ForeignExchangeTerms31.mmUnitCurrency, ForeignExchangeTerms33.mmUnitCurrency,
					ForeignExchangeTerms32.mmUnitCurrency, FundOrderData5.mmUnitCurrency, FundOrderData6.mmUnitCurrency, ExchangeRateBasis2.mmBaseCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitCurrency";
			definition = "Currency in which the rate of exchange is expressed in a currency exchange. In the example 1GBP = xxxCUR, the unit currency is GBP.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getUnitCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmQuotedCurrency
	 * ForeignExchangeTerms11.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmQuotedCurrency
	 * ForeignExchangeTerms12.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmQuotedCurrency
	 * ForeignExchangeTerms13.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmQuotedCurrency
	 * ForeignExchangeTerms15.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmQuotedCurrency
	 * ForeignExchangeTerms19.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotedCurrency
	 * ForeignExchangeTerms5.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmQuotedCurrency
	 * ForeignExchangeTerms1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmQuotedCurrency
	 * ForeignExchangeTerms2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmQuotedCurrency
	 * ForeignExchangeTerms3.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmQuotedCurrency
	 * ForeignExchangeTerms6.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmQuotedCurrency
	 * ForeignExchangeTerms14.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmQuotedCurrency
	 * ForeignExchangeTerms16.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmQuotedCurrency
	 * ForeignExchangeTerms18.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate1#mmQuotedCurrency
	 * AgreedRate1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate2#mmQuotedCurrency
	 * AgreedRate2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmQuotedCurrency
	 * FundOrderData1.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData2#mmQuotedCurrency
	 * FundOrderData2.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmQuotedCurrency
	 * ForeignExchangeTerms4.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotedCurrency
	 * ForeignExchangeTerms7.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmQuotedCurrency
	 * ForeignExchangeTerms8.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmQuotedCurrency
	 * ForeignExchangeTerms9.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmQuotedCurrency
	 * CurrencyExchangeDetails.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmQuotedCurrency
	 * ForeignExchangeTerms17.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmQuotedCurrency
	 * ForeignExchangeTerms10.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmQuotedCurrency
	 * CurrencyExchange7.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmQuotedCurrency
	 * ForeignExchangeTerms22.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmQuotedCurrency
	 * ForeignExchangeTerms23.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmQuotedCurrency
	 * ForeignExchangeTerms24.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AgreedRate3#mmQuotedCurrency
	 * AgreedRate3.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotedCurrency
	 * ForeignExchangeTerms26.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmQuotedCurrency
	 * ForeignExchangeTerms28.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmQuotedCurrency
	 * ForeignExchangeTerms27.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmQuotedCurrency
	 * ForeignExchangeTerms31.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotedCurrency
	 * ForeignExchangeTerms33.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmQuotedCurrency
	 * ForeignExchangeTerms32.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmQuotedCurrency
	 * FundOrderData5.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundOrderData6#mmQuotedCurrency
	 * FundOrderData6.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OpeningConditions1#mmSettlementCurrency
	 * OpeningConditions1.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateBasis2#mmQuotedCurrency
	 * ExchangeRateBasis2.mmQuotedCurrency}</li>
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
	public static final MMBusinessAttribute mmQuotedCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmQuotedCurrency, ForeignExchangeTerms12.mmQuotedCurrency, ForeignExchangeTerms13.mmQuotedCurrency, ForeignExchangeTerms15.mmQuotedCurrency,
					ForeignExchangeTerms19.mmQuotedCurrency, ForeignExchangeTerms5.mmQuotedCurrency, ForeignExchangeTerms1.mmQuotedCurrency, ForeignExchangeTerms2.mmQuotedCurrency, ForeignExchangeTerms3.mmQuotedCurrency,
					ForeignExchangeTerms6.mmQuotedCurrency, ForeignExchangeTerms14.mmQuotedCurrency, ForeignExchangeTerms16.mmQuotedCurrency, ForeignExchangeTerms18.mmQuotedCurrency, AgreedRate1.mmQuotedCurrency,
					AgreedRate2.mmQuotedCurrency, FundOrderData1.mmQuotedCurrency, FundOrderData2.mmQuotedCurrency, ForeignExchangeTerms4.mmQuotedCurrency, ForeignExchangeTerms7.mmQuotedCurrency, ForeignExchangeTerms8.mmQuotedCurrency,
					ForeignExchangeTerms9.mmQuotedCurrency, CurrencyExchangeDetails.mmQuotedCurrency, ForeignExchangeTerms17.mmQuotedCurrency, ForeignExchangeTerms10.mmQuotedCurrency, CurrencyExchange7.mmQuotedCurrency,
					ForeignExchangeTerms22.mmQuotedCurrency, ForeignExchangeTerms23.mmQuotedCurrency, ForeignExchangeTerms24.mmQuotedCurrency, AgreedRate3.mmQuotedCurrency, ForeignExchangeTerms26.mmQuotedCurrency,
					ForeignExchangeTerms28.mmQuotedCurrency, ForeignExchangeTerms27.mmQuotedCurrency, ForeignExchangeTerms31.mmQuotedCurrency, ForeignExchangeTerms33.mmQuotedCurrency, ForeignExchangeTerms32.mmQuotedCurrency,
					FundOrderData5.mmQuotedCurrency, FundOrderData6.mmQuotedCurrency, OpeningConditions1.mmSettlementCurrency, ExchangeRateBasis2.mmQuotedCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the base currency is converted, in a currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getQuotedCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmExchangeRate
	 * ForeignExchangeTerms11.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmExchangeRate
	 * ForeignExchangeTerms12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmExchangeRate
	 * ForeignExchangeTerms13.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmExchangeRate
	 * ForeignExchangeTerms15.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19#mmExchangeRate
	 * ForeignExchangeTerms19.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmExchangeRate
	 * ForeignExchangeTerms5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmExchangeRate
	 * ForeignExchangeTerms1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmExchangeRate
	 * ForeignExchangeTerms2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmExchangeRate
	 * ForeignExchangeTerms3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmExchangeRate
	 * ForeignExchangeTerms6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmExchangeRate
	 * ForeignExchangeTerms14.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmExchangeRate
	 * ForeignExchangeTerms16.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmExchangeRate
	 * CurrencyExchange4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmExchangeRate
	 * ForeignExchangeTerms18.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmExchangeRate
	 * CurrencyExchange3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmExchangeRate
	 * CurrencyExchange5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#mmExchangeRate
	 * ExchangeRateInformation1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmExchangeRate
	 * ExchangeRate1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction2#mmExchangeRate
	 * CreditTransferTransaction2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation2#mmExchangeRate
	 * DirectDebitTransactionInformation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation10#mmExchangeRate
	 * DirectDebitTransactionInformation10.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation12#mmExchangeRate
	 * DirectDebitTransactionInformation12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation14#mmExchangeRate
	 * DirectDebitTransactionInformation14.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation5#mmExchangeRate
	 * PaymentTransactionInformation5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation29#mmExchangeRate
	 * PaymentTransactionInformation29.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction36#mmExchangeRate
	 * PaymentTransaction36.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction45#mmExchangeRate
	 * PaymentTransaction45.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation2#mmExchangeRate
	 * PaymentTransactionInformation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation27#mmExchangeRate
	 * PaymentTransactionInformation27.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction34#mmExchangeRate
	 * PaymentTransaction34.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction44#mmExchangeRate
	 * PaymentTransaction44.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate1#mmExchangeRate
	 * AgreedRate1.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate2#mmExchangeRate
	 * AgreedRate2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmExchangeRate
	 * ForeignExchangeTerms4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmExchangeRate
	 * ForeignExchangeTerms7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmExchangeRate
	 * ForeignExchangeTerms8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmExchangeRate
	 * ForeignExchangeTerms9.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmExchangeRateInformation
	 * CurrencyReference2.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmExchangeRate
	 * CollateralValuation1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmExchangeRate
	 * CurrencyExchangeDetails.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount21#mmForeignExchangeRate
	 * SecuritiesAccount21.mmForeignExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmExchangeRate
	 * ForeignExchangeTerms17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmExchangeRate
	 * CurrencyExchange6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation16#mmExchangeRate
	 * PaymentTransactionInformation16.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation23#mmExchangeRate
	 * PaymentTransactionInformation23.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation17#mmExchangeRate
	 * PaymentTransactionInformation17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation24#mmExchangeRate
	 * PaymentTransactionInformation24.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransactionInformation21#mmExchangeRate
	 * PaymentTransactionInformation21.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation6#mmExchangeRate
	 * DirectDebitTransactionInformation6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation8#mmExchangeRate
	 * DirectDebitTransactionInformation8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms10#mmExchangeRate
	 * ForeignExchangeTerms10.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmExchangeRate
	 * CurrencyExchange7.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmExchangeRate
	 * CurrencyConversion1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmInvertedExchangeRate
	 * CurrencyConversion1.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction50#mmExchangeRate
	 * PaymentTransaction50.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation17#mmExchangeRate
	 * DirectDebitTransactionInformation17.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction51#mmExchangeRate
	 * PaymentTransaction51.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmExchangeRate
	 * CollateralValuation2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmExchangeRate
	 * CurrencyConversion2.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmInvertedExchangeRate
	 * CurrencyConversion2.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmExchangeSpotRate
	 * ForeignExchange1.mmExchangeSpotRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmExchangeRate
	 * CurrencyConversion4.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmInvertedExchangeRate
	 * CurrencyConversion4.mmInvertedExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmRate
	 * CurrencyConversion5.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#mmExchangeRate
	 * DetailedAmount8.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmExchangeRate
	 * ForeignExchangeTerms22.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Trade3#mmValuationRate
	 * Trade3.mmValuationRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Option10#mmStrikePrice
	 * Option10.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmExchangeRate
	 * ForeignExchangeTerms23.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction65#mmExchangeRate
	 * PaymentTransaction65.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation20#mmExchangeRate
	 * DirectDebitTransactionInformation20.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction60#mmExchangeRate
	 * PaymentTransaction60.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmExchangeRate
	 * ForeignExchangeTerms24.mmExchangeRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AgreedRate3#mmExchangeRate
	 * AgreedRate3.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmExchangeRate
	 * ForeignExchangeTerms26.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation5#mmExchangeRate
	 * CollateralValuation5.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmExchangeRate
	 * ForeignExchangeTerms28.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmExchangeRate
	 * ForeignExchangeTerms27.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmExchangeRate
	 * ForeignExchangeTerms31.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmExchangeRate
	 * CurrencyConversion6.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmInvertedExchangeRate
	 * CurrencyConversion6.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmExchangeRate
	 * CurrencyConversion9.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmInvertedExchangeRate
	 * CurrencyConversion9.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmExchangeRate
	 * ForeignExchangeTerms33.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmExchangeRate
	 * ForeignExchangeTerms32.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmExchangeRateInformation
	 * CurrencyReference3.mmExchangeRateInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#mmExchangeRate
	 * DirectDebitTransactionInformation21.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction81#mmExchangeRate
	 * PaymentTransaction81.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction76#mmExchangeRate
	 * PaymentTransaction76.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FixingConditions1#mmExchangeRate
	 * FixingConditions1.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmExchangeRate
	 * CurrencyConversion12.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmInvertedExchangeRate
	 * CurrencyConversion12.mmInvertedExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange11#mmExchangeRate
	 * CurrencyExchange11.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange11#mmForwardExchangeRate
	 * CurrencyExchange11.mmForwardExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange11#mmExchangeRateBasis
	 * CurrencyExchange11.mmExchangeRateBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction87#mmExchangeRate
	 * PaymentTransaction87.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction88#mmExchangeRate
	 * PaymentTransaction88.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmExchangeRate
	 * CurrencyConversion14.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmInvertedExchangeRate
	 * CurrencyConversion14.mmInvertedExchangeRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92A::EXCH</li>
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
	public static final MMBusinessAttribute mmExchangeRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmExchangeRate, ForeignExchangeTerms12.mmExchangeRate, ForeignExchangeTerms13.mmExchangeRate, ForeignExchangeTerms15.mmExchangeRate,
					ForeignExchangeTerms19.mmExchangeRate, ForeignExchangeTerms5.mmExchangeRate, ForeignExchangeTerms1.mmExchangeRate, ForeignExchangeTerms2.mmExchangeRate, ForeignExchangeTerms3.mmExchangeRate,
					ForeignExchangeTerms6.mmExchangeRate, ForeignExchangeTerms14.mmExchangeRate, ForeignExchangeTerms16.mmExchangeRate, CurrencyExchange4.mmExchangeRate, ForeignExchangeTerms18.mmExchangeRate,
					CurrencyExchange3.mmExchangeRate, CurrencyExchange5.mmExchangeRate, ExchangeRateInformation1.mmExchangeRate, ExchangeRate1.mmExchangeRate, CreditTransferTransaction2.mmExchangeRate,
					DirectDebitTransactionInformation2.mmExchangeRate, DirectDebitTransactionInformation10.mmExchangeRate, DirectDebitTransactionInformation12.mmExchangeRate, DirectDebitTransactionInformation14.mmExchangeRate,
					PaymentTransactionInformation5.mmExchangeRate, PaymentTransactionInformation29.mmExchangeRate, PaymentTransaction36.mmExchangeRate, PaymentTransaction45.mmExchangeRate, PaymentTransactionInformation2.mmExchangeRate,
					PaymentTransactionInformation27.mmExchangeRate, PaymentTransaction34.mmExchangeRate, PaymentTransaction44.mmExchangeRate, AgreedRate1.mmExchangeRate, AgreedRate2.mmExchangeRate, ForeignExchangeTerms4.mmExchangeRate,
					ForeignExchangeTerms7.mmExchangeRate, ForeignExchangeTerms8.mmExchangeRate, ForeignExchangeTerms9.mmExchangeRate, CurrencyReference2.mmExchangeRateInformation, CollateralValuation1.mmExchangeRate,
					CurrencyExchangeDetails.mmExchangeRate, SecuritiesAccount21.mmForeignExchangeRate, ForeignExchangeTerms17.mmExchangeRate, CurrencyExchange6.mmExchangeRate, PaymentTransactionInformation16.mmExchangeRate,
					PaymentTransactionInformation23.mmExchangeRate, PaymentTransactionInformation17.mmExchangeRate, PaymentTransactionInformation24.mmExchangeRate, PaymentTransactionInformation21.mmExchangeRate,
					DirectDebitTransactionInformation6.mmExchangeRate, DirectDebitTransactionInformation8.mmExchangeRate, ForeignExchangeTerms10.mmExchangeRate, CurrencyExchange7.mmExchangeRate, CurrencyConversion1.mmExchangeRate,
					CurrencyConversion1.mmInvertedExchangeRate, PaymentTransaction50.mmExchangeRate, DirectDebitTransactionInformation17.mmExchangeRate, PaymentTransaction51.mmExchangeRate, CollateralValuation2.mmExchangeRate,
					CurrencyConversion2.mmExchangeRate, CurrencyConversion2.mmInvertedExchangeRate, ForeignExchange1.mmExchangeSpotRate, CurrencyConversion4.mmExchangeRate, CurrencyConversion4.mmInvertedExchangeRate,
					CurrencyConversion5.mmRate, DetailedAmount8.mmExchangeRate, ForeignExchangeTerms22.mmExchangeRate, Trade3.mmValuationRate, Option10.mmStrikePrice, ForeignExchangeTerms23.mmExchangeRate,
					PaymentTransaction65.mmExchangeRate, DirectDebitTransactionInformation20.mmExchangeRate, PaymentTransaction60.mmExchangeRate, ForeignExchangeTerms24.mmExchangeRate, AgreedRate3.mmExchangeRate,
					ForeignExchangeTerms26.mmExchangeRate, CollateralValuation5.mmExchangeRate, ForeignExchangeTerms28.mmExchangeRate, ForeignExchangeTerms27.mmExchangeRate, ForeignExchangeTerms31.mmExchangeRate,
					CurrencyConversion6.mmExchangeRate, CurrencyConversion6.mmInvertedExchangeRate, CurrencyConversion9.mmExchangeRate, CurrencyConversion9.mmInvertedExchangeRate, ForeignExchangeTerms33.mmExchangeRate,
					ForeignExchangeTerms32.mmExchangeRate, CurrencyReference3.mmExchangeRateInformation, DirectDebitTransactionInformation21.mmExchangeRate, PaymentTransaction81.mmExchangeRate, PaymentTransaction76.mmExchangeRate,
					FixingConditions1.mmExchangeRate, CurrencyConversion12.mmExchangeRate, CurrencyConversion12.mmInvertedExchangeRate, CurrencyExchange11.mmExchangeRate, CurrencyExchange11.mmForwardExchangeRate,
					CurrencyExchange11.mmExchangeRateBasis, PaymentTransaction87.mmExchangeRate, PaymentTransaction88.mmExchangeRate, CurrencyConversion14.mmExchangeRate, CurrencyConversion14.mmInvertedExchangeRate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92A::EXCH"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeRate";
			definition = "The value of one currency expressed in relation to another currency. ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getExchangeRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount resultingAmount;
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms11#mmResultingAmount
	 * ForeignExchangeTerms11.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms12#mmResultingAmount
	 * ForeignExchangeTerms12.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms13#mmResultingAmount
	 * ForeignExchangeTerms13.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms15#mmResultingAmount
	 * ForeignExchangeTerms15.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmResultingAmount
	 * CurrencyExchange4.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms18#mmConvertedAmount
	 * ForeignExchangeTerms18.mmConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmConvertedAmount
	 * OtherAmounts16.mmConvertedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange2#mmCounterValueAmount
	 * AmountAndCurrencyExchange2.mmCounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountAndCurrencyExchange3#mmCounterValueAmount
	 * AmountAndCurrencyExchange3.mmCounterValueAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Value#mmAlternateCurrencyItem
	 * Value.mmAlternateCurrencyItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8#mmResultingAmount
	 * ForeignExchangeTerms8.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9#mmResultingAmount
	 * ForeignExchangeTerms9.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms17#mmResultingAmount
	 * ForeignExchangeTerms17.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmResultingAmount
	 * CurrencyConversion1.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmResultingAmount
	 * CurrencyConversion2.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmResultingAmount
	 * CurrencyConversion4.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmCalculatedAmount
	 * CurrencyConversion5.mmCalculatedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms23#mmResultingAmount
	 * ForeignExchangeTerms23.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms24#mmResultingAmount
	 * ForeignExchangeTerms24.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms28#mmResultingAmount
	 * ForeignExchangeTerms28.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms27#mmResultingAmount
	 * ForeignExchangeTerms27.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmResultingAmount
	 * CurrencyConversion6.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmResultingAmount
	 * CurrencyConversion9.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmResultingAmount
	 * CurrencyConversion12.mmResultingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmResultingAmount
	 * CurrencyConversion14.mmResultingAmount}</li>
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
	public static final MMBusinessAttribute mmResultingAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmResultingAmount, ForeignExchangeTerms12.mmResultingAmount, ForeignExchangeTerms13.mmResultingAmount, ForeignExchangeTerms15.mmResultingAmount,
					CurrencyExchange4.mmResultingAmount, ForeignExchangeTerms18.mmConvertedAmount, OtherAmounts16.mmConvertedAmount, AmountAndCurrencyExchange2.mmCounterValueAmount, AmountAndCurrencyExchange3.mmCounterValueAmount,
					Value.mmAlternateCurrencyItem, ForeignExchangeTerms8.mmResultingAmount, ForeignExchangeTerms9.mmResultingAmount, ForeignExchangeTerms17.mmResultingAmount, CurrencyConversion1.mmResultingAmount,
					CurrencyConversion2.mmResultingAmount, CurrencyConversion4.mmResultingAmount, CurrencyConversion5.mmCalculatedAmount, ForeignExchangeTerms23.mmResultingAmount, ForeignExchangeTerms24.mmResultingAmount,
					ForeignExchangeTerms28.mmResultingAmount, ForeignExchangeTerms27.mmResultingAmount, CurrencyConversion6.mmResultingAmount, CurrencyConversion9.mmResultingAmount, CurrencyConversion12.mmResultingAmount,
					CurrencyConversion14.mmResultingAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ResultingAmount";
			definition = "Amount of money resulting from a foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getResultingAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionEvent relatedCorporateActionEvent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCorporateActionEvent";
			definition = "Corporate action for which the offeror/issuer has specified an exchange rate for the payment in a currency different from the announced one.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected SecuritiesBalance currencyExchangeForSecuritiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmExchangeRate
	 * SecuritiesBalance.mmExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesBalance";
			definition = "Specifies a securities balance which used a specific exchange rate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected ISODateTime quotationDate;
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
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5#mmQuotationDate
	 * ForeignExchangeTerms5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms1#mmQuotationDate
	 * ForeignExchangeTerms1.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms2#mmQuotationDate
	 * ForeignExchangeTerms2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms3#mmQuotationDate
	 * ForeignExchangeTerms3.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms6#mmQuotationDate
	 * ForeignExchangeTerms6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms14#mmQuotationDate
	 * ForeignExchangeTerms14.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms16#mmQuotationDate
	 * ForeignExchangeTerms16.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmQuotationDate
	 * CurrencyExchange3.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmQuotationDate
	 * CurrencyExchange5.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms4#mmQuotationDate
	 * ForeignExchangeTerms4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms7#mmQuotationDate
	 * ForeignExchangeTerms7.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeDetails#mmQuotationDate
	 * CurrencyExchangeDetails.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmQuotationDate
	 * CurrencyExchange6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange7#mmQuotationDate
	 * CurrencyExchange7.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmQuotationDate
	 * CurrencyConversion1.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmQuotationDate
	 * CurrencyConversion2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmQuotationDate
	 * CurrencyConversion4.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DetailedAmount8#mmQuotationDate
	 * DetailedAmount8.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms22#mmQuotationDate
	 * ForeignExchangeTerms22.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms26#mmQuotationDate
	 * ForeignExchangeTerms26.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms31#mmQuotationDate
	 * ForeignExchangeTerms31.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmQuotationDate
	 * CurrencyConversion6.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmQuotationDate
	 * CurrencyConversion9.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33#mmQuotationDate
	 * ForeignExchangeTerms33.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms32#mmQuotationDate
	 * ForeignExchangeTerms32.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmQuotationDate
	 * CurrencyConversion12.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmQuotationDate
	 * CurrencyConversion14.mmQuotationDate}</li>
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
	public static final MMBusinessAttribute mmQuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ForeignExchangeTerms5.mmQuotationDate, ForeignExchangeTerms1.mmQuotationDate, ForeignExchangeTerms2.mmQuotationDate, ForeignExchangeTerms3.mmQuotationDate,
					ForeignExchangeTerms6.mmQuotationDate, ForeignExchangeTerms14.mmQuotationDate, ForeignExchangeTerms16.mmQuotationDate, CurrencyExchange3.mmQuotationDate, CurrencyExchange5.mmQuotationDate,
					ForeignExchangeTerms4.mmQuotationDate, ForeignExchangeTerms7.mmQuotationDate, CurrencyExchangeDetails.mmQuotationDate, CurrencyExchange6.mmQuotationDate, CurrencyExchange7.mmQuotationDate,
					CurrencyConversion1.mmQuotationDate, CurrencyConversion2.mmQuotationDate, CurrencyConversion4.mmQuotationDate, DetailedAmount8.mmQuotationDate, ForeignExchangeTerms22.mmQuotationDate,
					ForeignExchangeTerms26.mmQuotationDate, ForeignExchangeTerms31.mmQuotationDate, CurrencyConversion6.mmQuotationDate, CurrencyConversion9.mmQuotationDate, ForeignExchangeTerms33.mmQuotationDate,
					ForeignExchangeTerms32.mmQuotationDate, CurrencyConversion12.mmQuotationDate, CurrencyConversion14.mmQuotationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date and time at which an exchange rate is quoted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getQuotationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmExchangeRate
	 * AssetHolding.mmExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd mmCalculatedAssetValue = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculatedAssetValue";
			definition = "Asset value calculated in a different currency.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AssetHolding.mmObject();
		}
	};
	protected CurrencyCode sourceCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#mmSourceCurrency
	 * CurrencyReferenceDetails.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange4#mmSourceAndTargetCurrency
	 * CurrencyExchange4.mmSourceAndTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmSourceCurrency
	 * CurrencyExchange3.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmSourceCurrency
	 * CurrencyExchange5.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmSourceCurrency
	 * CurrencyReference2.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#mmSourceCurrency
	 * CurrencyExchangeSearchCriteria.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmSourceCurrency
	 * CurrencyExchange6.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#mmSourceCurrency
	 * CurrencySourceTarget1.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmSourceCurrency
	 * CurrencyConversion1.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmSourceCurrency
	 * CurrencyConversion2.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmSourceCurrency
	 * CurrencyConversion4.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmSourceCurrency
	 * CurrencyConversion5.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmSourceCurrency
	 * CurrencyConversion6.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmSourceCurrency
	 * CurrencyConversion9.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmSourceCurrency
	 * CurrencyReference3.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmSourceCurrency
	 * CurrencyConversion12.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange11#mmDeliverableCrossCurrency
	 * CurrencyExchange11.mmDeliverableCrossCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeTransaction18#mmCurrency
	 * TradeTransaction18.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmCurrency
	 * ConcentrationAccount1.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria1#mmSourceCurrency
	 * CurrencyExchangeSearchCriteria1.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmSourceCurrency
	 * CurrencyConversion14.mmSourceCurrency}</li>
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
	public static final MMBusinessAttribute mmSourceCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyReferenceDetails.mmSourceCurrency, CurrencyExchange4.mmSourceAndTargetCurrency, CurrencyExchange3.mmSourceCurrency, CurrencyExchange5.mmSourceCurrency,
					CurrencyReference2.mmSourceCurrency, CurrencyExchangeSearchCriteria.mmSourceCurrency, CurrencyExchange6.mmSourceCurrency, CurrencySourceTarget1.mmSourceCurrency, CurrencyConversion1.mmSourceCurrency,
					CurrencyConversion2.mmSourceCurrency, CurrencyConversion4.mmSourceCurrency, CurrencyConversion5.mmSourceCurrency, CurrencyConversion6.mmSourceCurrency, CurrencyConversion9.mmSourceCurrency,
					CurrencyReference3.mmSourceCurrency, CurrencyConversion12.mmSourceCurrency, CurrencyExchange11.mmDeliverableCrossCurrency, TradeTransaction18.mmCurrency, ConcentrationAccount1.mmCurrency,
					CurrencyExchangeSearchCriteria1.mmSourceCurrency, CurrencyConversion14.mmSourceCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SourceCurrency";
			definition = "Currency of the amount to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getSourceCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyCode targetCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.CurrencyReferenceDetails#mmTargetCurrency
	 * CurrencyReferenceDetails.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange3#mmTargetCurrency
	 * CurrencyExchange3.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmTargetCurrency
	 * CurrencyExchange5.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference2#mmTargetCurrency
	 * CurrencyReference2.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria#mmTargetCurrency
	 * CurrencyExchangeSearchCriteria.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange6#mmTargetCurrency
	 * CurrencyExchange6.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencySourceTarget1#mmTargetCurrency
	 * CurrencySourceTarget1.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion1#mmTargetCurrency
	 * CurrencyConversion1.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion2#mmTargetCurrency
	 * CurrencyConversion2.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ForeignExchange1#mmForeignCurrency
	 * ForeignExchange1.mmForeignCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion4#mmTargetCurrency
	 * CurrencyConversion4.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion5#mmTargetCurrency
	 * CurrencyConversion5.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccount33#mmSettlementCurrency
	 * CashAccount33.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSettlementCurrency
	 * PaymentInstrument13.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion6#mmTargetCurrency
	 * CurrencyConversion6.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion9#mmTargetCurrency
	 * CurrencyConversion9.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyReference3#mmTargetCurrency
	 * CurrencyReference3.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion12#mmTargetCurrency
	 * CurrencyConversion12.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchangeSearchCriteria1#mmTargetCurrency
	 * CurrencyExchangeSearchCriteria1.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyConversion14#mmTargetCurrency
	 * CurrencyConversion14.mmTargetCurrency}</li>
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
	public static final MMBusinessAttribute mmTargetCurrency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyReferenceDetails.mmTargetCurrency, CurrencyExchange3.mmTargetCurrency, CurrencyExchange5.mmTargetCurrency, CurrencyReference2.mmTargetCurrency,
					CurrencyExchangeSearchCriteria.mmTargetCurrency, CurrencyExchange6.mmTargetCurrency, CurrencySourceTarget1.mmTargetCurrency, CurrencyConversion1.mmTargetCurrency, CurrencyConversion2.mmTargetCurrency,
					ForeignExchange1.mmForeignCurrency, CurrencyConversion4.mmTargetCurrency, CurrencyConversion5.mmTargetCurrency, CashAccount33.mmSettlementCurrency, PaymentInstrument13.mmSettlementCurrency,
					CurrencyConversion6.mmTargetCurrency, CurrencyConversion9.mmTargetCurrency, CurrencyReference3.mmTargetCurrency, CurrencyConversion12.mmTargetCurrency, CurrencyExchangeSearchCriteria1.mmTargetCurrency,
					CurrencyConversion14.mmTargetCurrency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TargetCurrency";
			definition = "Currency into which an amount is to be converted in a currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getTargetCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCurrencyExchange
	 * CashEntry.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashEntry";
			definition = "Cash entry to which the currency exchange parameters apply.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected Payment relatedPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedPayment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPayment";
			definition = "Payment for which currency exchange parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Payment.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Payment.mmObject();
		}
	};
	protected ExchangeRateTypeCode rateType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.ExchangeRateInformation1#mmRateType
	 * ExchangeRateInformation1.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ExchangeRate1#mmRateType
	 * ExchangeRate1.mmRateType}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType1Choice#mmCode
	 * RateType1Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType1Choice#mmProprietary
	 * RateType1Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.RateType2Choice#mmCode
	 * RateType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RateType2Choice#mmProprietary
	 * RateType2Choice.mmProprietary}</li>
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
	public static final MMBusinessAttribute mmRateType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ExchangeRateInformation1.mmRateType, ExchangeRate1.mmRateType, RateType1Choice.mmCode, RateType1Choice.mmProprietary, RateType2Choice.mmCode, RateType2Choice.mmProprietary);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RateType";
			definition = "Specifies the type used to complete the currency exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangeRateTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CurrencyExchange.class.getMethod("getRateType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected LiquidityManagementLimit relatedLimitManagement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LiquidityManagementLimit#mmCurrencyExchange
	 * LiquidityManagementLimit.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedLimitManagement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedLimitManagement";
			definition = "Limit for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LiquidityManagementLimit.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.FixingCondition> fixingConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingRate
	 * FixingCondition.mmFixingRate}</li>
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
	public static final MMBusinessAssociationEnd mmFixingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FixingConditions";
			definition = "Set of parameters used to calculate a rate for instance, the fixing rate to be applied to a non-deliverable agreement.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmFixingRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FixingCondition.mmObject();
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
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCurrencyExchange
	 * Tax.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmTax = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tax";
			definition = "Tax for which exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Invoice relatedInvoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmCurrencyExchange
	 * Invoice.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedInvoice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvoice";
			definition = "Invoice for which currency exchange information is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Invoice.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Invoice.mmObject();
		}
	};
	protected TransactionAdministrator currencyExchangeForTransactionAdministrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TransactionAdministrator#mmCurrencyExchange
	 * TransactionAdministrator.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForTransactionAdministrator = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForTransactionAdministrator";
			definition = "Set of applications which use currency exchange information.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TransactionAdministrator.mmObject();
		}
	};
	protected Account reportedAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmCurrencyExchange
	 * Account.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmReportedAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportedAccount";
			definition = "Specifies the account which uses an exchange rate to report entries and balances.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionCashEntitlement#mmExchangeRate
	 * CorporateActionCashEntitlement.mmExchangeRate}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCorporateActionCashEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCorporateActionCashEntitlement";
			definition = "Cash entitlement for which an exchange rate is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionCashEntitlement.mmObject();
		}
	};
	protected PaymentExecution paymentExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCurrencyExchange
	 * PaymentExecution.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmPaymentExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PaymentExecution";
			definition = "Payment execution process for which currrency exchange information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PaymentExecution.mmObject();
		}
	};
	protected Quote currencyExchangeForSecuritiesQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuotedRate
	 * Quote.mmQuotedRate}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesQuote";
			definition = "Quote which uses currency exchange information.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmQuotedRate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected SecuritiesConversion currencyExchangeForSecuritiesConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionUnitCurrency
	 * SecuritiesConversion.mmConversionUnitCurrency}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForSecuritiesConversion";
			definition = "Securities conversion for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected CashDistribution currencyExchangeForCashDistribution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashDistribution#mmDistributionCurrencyExchangeInformation
	 * CashDistribution.mmDistributionCurrencyExchangeInformation}</li>
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
	public static final MMBusinessAssociationEnd mmCurrencyExchangeForCashDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CurrencyExchangeForCashDistribution";
			definition = "Cash distribution for which a conversion currency is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashDistribution.mmObject();
		}
	};
	protected Adjustment adjustment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmCurrencyExchange
	 * Adjustment.mmCurrencyExchange}</li>
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
	public static final MMBusinessAssociationEnd mmAdjustment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CurrencyExchange.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Fees or commission applied to the currency exchange.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Adjustment.mmCurrencyExchange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Adjustment.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyExchange";
				definition = "Information needed to process a currency exchange or conversion.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmCurrencyExchange, com.tools20022.repository.entity.Tax.mmCurrencyExchange,
						com.tools20022.repository.entity.Adjustment.mmCurrencyExchange, com.tools20022.repository.entity.Payment.mmCurrencyExchange, com.tools20022.repository.entity.CashEntry.mmCurrencyExchange,
						com.tools20022.repository.entity.AssetHolding.mmExchangeRate, com.tools20022.repository.entity.PaymentExecution.mmCurrencyExchange, com.tools20022.repository.entity.TransactionAdministrator.mmCurrencyExchange,
						com.tools20022.repository.entity.ForeignExchangeTrade.mmAgreedRate, com.tools20022.repository.entity.SecuritiesConversion.mmConversionUnitCurrency, com.tools20022.repository.entity.SecuritiesBalance.mmExchangeRate,
						com.tools20022.repository.entity.CorporateActionEvent.mmExchangeRate, com.tools20022.repository.entity.CorporateActionCashEntitlement.mmExchangeRate, com.tools20022.repository.entity.FixingCondition.mmFixingRate,
						com.tools20022.repository.entity.Invoice.mmCurrencyExchange, com.tools20022.repository.entity.LiquidityManagementLimit.mmCurrencyExchange,
						com.tools20022.repository.entity.CashDistribution.mmDistributionCurrencyExchangeInformation, com.tools20022.repository.entity.Quote.mmQuotedRate);
				derivationElement_lazy = () -> Arrays.asList(TaxVoucher1.mmForeignExchangeDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CurrencyExchange.mmOriginalAmount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForForeignExchangeTrade,
						com.tools20022.repository.entity.CurrencyExchange.mmUnitCurrency, com.tools20022.repository.entity.CurrencyExchange.mmQuotedCurrency, com.tools20022.repository.entity.CurrencyExchange.mmExchangeRate,
						com.tools20022.repository.entity.CurrencyExchange.mmResultingAmount, com.tools20022.repository.entity.CurrencyExchange.mmRelatedCorporateActionEvent,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesBalance, com.tools20022.repository.entity.CurrencyExchange.mmQuotationDate,
						com.tools20022.repository.entity.CurrencyExchange.mmCalculatedAssetValue, com.tools20022.repository.entity.CurrencyExchange.mmSourceCurrency, com.tools20022.repository.entity.CurrencyExchange.mmTargetCurrency,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashEntry, com.tools20022.repository.entity.CurrencyExchange.mmRelatedPayment, com.tools20022.repository.entity.CurrencyExchange.mmRateType,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedLimitManagement, com.tools20022.repository.entity.CurrencyExchange.mmFixingConditions, com.tools20022.repository.entity.CurrencyExchange.mmTax,
						com.tools20022.repository.entity.CurrencyExchange.mmRelatedInvoice, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForTransactionAdministrator,
						com.tools20022.repository.entity.CurrencyExchange.mmReportedAccount, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCorporateActionCashEntitlement,
						com.tools20022.repository.entity.CurrencyExchange.mmPaymentExecution, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesQuote,
						com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForSecuritiesConversion, com.tools20022.repository.entity.CurrencyExchange.mmCurrencyExchangeForCashDistribution,
						com.tools20022.repository.entity.CurrencyExchange.mmAdjustment);
				derivationComponent_lazy = () -> Arrays.asList(ForeignExchangeTerms11.mmObject(), ForeignExchangeTerms12.mmObject(), ForeignExchangeTerms13.mmObject(), ForeignExchangeTerms15.mmObject(), ForeignExchangeTerms19.mmObject(),
						ForeignExchangeTerms5.mmObject(), ForeignExchangeTerms1.mmObject(), ForeignExchangeTerms2.mmObject(), ForeignExchangeTerms3.mmObject(), ForeignExchangeTerms6.mmObject(), ForeignExchangeTerms14.mmObject(),
						ForeignExchangeTerms16.mmObject(), CurrencyReferenceDetails.mmObject(), CurrencyExchange4.mmObject(), ForeignExchangeTerms18.mmObject(), CurrencyExchange3.mmObject(), CurrencyExchange5.mmObject(),
						ExchangeRateInformation1.mmObject(), ExchangeRate1.mmObject(), AgreedRate1.mmObject(), AgreedRate2.mmObject(), ForeignExchangeTerms4.mmObject(), ForeignExchangeTerms7.mmObject(), ForeignExchangeTerms8.mmObject(),
						ForeignExchangeTerms9.mmObject(), CurrencyReference2.mmObject(), CurrencyExchangeSearchCriteria.mmObject(), CurrencyExchangeDetails.mmObject(), ForeignExchangeTerms17.mmObject(), CurrencyExchange6.mmObject(),
						ForeignExchangeTerms10.mmObject(), RateType1Choice.mmObject(), RateType2Choice.mmObject(), CurrencySourceTarget1.mmObject(), CurrencyExchange7.mmObject(), CurrencyConversion1.mmObject(),
						CurrencyDesignation1.mmObject(), CurrencyConversion3.mmObject(), CurrencyConversion2.mmObject(), ForeignExchange1.mmObject(), CurrencyConversion4.mmObject(), CurrencyConversion5.mmObject(),
						ForeignExchangeTerms22.mmObject(), ForeignExchangeTerms23.mmObject(), ForeignExchangeTerms24.mmObject(), AgreedRate3.mmObject(), BalanceTransferFundingLimit1.mmObject(), ForeignExchangeTerms26.mmObject(),
						ForeignExchangeTerms28.mmObject(), ForeignExchangeTerms27.mmObject(), ForeignExchangeTerms31.mmObject(), CurrencyConversion7.mmObject(), CurrencyConversion6.mmObject(), CurrencyConversion8.mmObject(),
						CurrencyConversion9.mmObject(), CurrencyConversion10.mmObject(), ForeignExchangeTerms33.mmObject(), ForeignExchangeTerms32.mmObject(), CurrencyReference3.mmObject(), CurrencyConversion13.mmObject(),
						CurrencyConversion12.mmObject(), CurrencyConversion11.mmObject(), ExchangeRateBasis2.mmObject(), CurrencyExchange11.mmObject(), CurrencyExchangeSearchCriteria1.mmObject(), CurrencyConversion14.mmObject(),
						CurrencyConversion15.mmObject(), CurrencyConversion16.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CurrencyExchange.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public CurrencyExchange setOriginalAmount(CurrencyAndAmount originalAmount) {
		this.originalAmount = Objects.requireNonNull(originalAmount);
		return this;
	}

	public Optional<ForeignExchangeTrade> getCurrencyExchangeForForeignExchangeTrade() {
		return currencyExchangeForForeignExchangeTrade == null ? Optional.empty() : Optional.of(currencyExchangeForForeignExchangeTrade);
	}

	public CurrencyExchange setCurrencyExchangeForForeignExchangeTrade(com.tools20022.repository.entity.ForeignExchangeTrade currencyExchangeForForeignExchangeTrade) {
		this.currencyExchangeForForeignExchangeTrade = currencyExchangeForForeignExchangeTrade;
		return this;
	}

	public CurrencyCode getUnitCurrency() {
		return unitCurrency;
	}

	public CurrencyExchange setUnitCurrency(CurrencyCode unitCurrency) {
		this.unitCurrency = Objects.requireNonNull(unitCurrency);
		return this;
	}

	public CurrencyCode getQuotedCurrency() {
		return quotedCurrency;
	}

	public CurrencyExchange setQuotedCurrency(CurrencyCode quotedCurrency) {
		this.quotedCurrency = Objects.requireNonNull(quotedCurrency);
		return this;
	}

	public BaseOneRate getExchangeRate() {
		return exchangeRate;
	}

	public CurrencyExchange setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = Objects.requireNonNull(exchangeRate);
		return this;
	}

	public CurrencyAndAmount getResultingAmount() {
		return resultingAmount;
	}

	public CurrencyExchange setResultingAmount(CurrencyAndAmount resultingAmount) {
		this.resultingAmount = Objects.requireNonNull(resultingAmount);
		return this;
	}

	public CorporateActionEvent getRelatedCorporateActionEvent() {
		return relatedCorporateActionEvent;
	}

	public CurrencyExchange setRelatedCorporateActionEvent(com.tools20022.repository.entity.CorporateActionEvent relatedCorporateActionEvent) {
		this.relatedCorporateActionEvent = Objects.requireNonNull(relatedCorporateActionEvent);
		return this;
	}

	public SecuritiesBalance getCurrencyExchangeForSecuritiesBalance() {
		return currencyExchangeForSecuritiesBalance;
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance currencyExchangeForSecuritiesBalance) {
		this.currencyExchangeForSecuritiesBalance = Objects.requireNonNull(currencyExchangeForSecuritiesBalance);
		return this;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public CurrencyExchange setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = Objects.requireNonNull(quotationDate);
		return this;
	}

	public List<AssetHolding> getCalculatedAssetValue() {
		return calculatedAssetValue == null ? calculatedAssetValue = new ArrayList<>() : calculatedAssetValue;
	}

	public CurrencyExchange setCalculatedAssetValue(List<com.tools20022.repository.entity.AssetHolding> calculatedAssetValue) {
		this.calculatedAssetValue = Objects.requireNonNull(calculatedAssetValue);
		return this;
	}

	public CurrencyCode getSourceCurrency() {
		return sourceCurrency;
	}

	public CurrencyExchange setSourceCurrency(CurrencyCode sourceCurrency) {
		this.sourceCurrency = Objects.requireNonNull(sourceCurrency);
		return this;
	}

	public CurrencyCode getTargetCurrency() {
		return targetCurrency;
	}

	public CurrencyExchange setTargetCurrency(CurrencyCode targetCurrency) {
		this.targetCurrency = Objects.requireNonNull(targetCurrency);
		return this;
	}

	public List<CashEntry> getCurrencyExchangeForCashEntry() {
		return currencyExchangeForCashEntry == null ? currencyExchangeForCashEntry = new ArrayList<>() : currencyExchangeForCashEntry;
	}

	public CurrencyExchange setCurrencyExchangeForCashEntry(List<com.tools20022.repository.entity.CashEntry> currencyExchangeForCashEntry) {
		this.currencyExchangeForCashEntry = Objects.requireNonNull(currencyExchangeForCashEntry);
		return this;
	}

	public Payment getRelatedPayment() {
		return relatedPayment;
	}

	public CurrencyExchange setRelatedPayment(com.tools20022.repository.entity.Payment relatedPayment) {
		this.relatedPayment = Objects.requireNonNull(relatedPayment);
		return this;
	}

	public ExchangeRateTypeCode getRateType() {
		return rateType;
	}

	public CurrencyExchange setRateType(ExchangeRateTypeCode rateType) {
		this.rateType = Objects.requireNonNull(rateType);
		return this;
	}

	public LiquidityManagementLimit getRelatedLimitManagement() {
		return relatedLimitManagement;
	}

	public CurrencyExchange setRelatedLimitManagement(com.tools20022.repository.entity.LiquidityManagementLimit relatedLimitManagement) {
		this.relatedLimitManagement = Objects.requireNonNull(relatedLimitManagement);
		return this;
	}

	public List<FixingCondition> getFixingConditions() {
		return fixingConditions == null ? fixingConditions = new ArrayList<>() : fixingConditions;
	}

	public CurrencyExchange setFixingConditions(List<com.tools20022.repository.entity.FixingCondition> fixingConditions) {
		this.fixingConditions = Objects.requireNonNull(fixingConditions);
		return this;
	}

	public Tax getTax() {
		return tax;
	}

	public CurrencyExchange setTax(com.tools20022.repository.entity.Tax tax) {
		this.tax = Objects.requireNonNull(tax);
		return this;
	}

	public Invoice getRelatedInvoice() {
		return relatedInvoice;
	}

	public CurrencyExchange setRelatedInvoice(com.tools20022.repository.entity.Invoice relatedInvoice) {
		this.relatedInvoice = Objects.requireNonNull(relatedInvoice);
		return this;
	}

	public TransactionAdministrator getCurrencyExchangeForTransactionAdministrator() {
		return currencyExchangeForTransactionAdministrator;
	}

	public CurrencyExchange setCurrencyExchangeForTransactionAdministrator(com.tools20022.repository.entity.TransactionAdministrator currencyExchangeForTransactionAdministrator) {
		this.currencyExchangeForTransactionAdministrator = Objects.requireNonNull(currencyExchangeForTransactionAdministrator);
		return this;
	}

	public Account getReportedAccount() {
		return reportedAccount;
	}

	public CurrencyExchange setReportedAccount(com.tools20022.repository.entity.Account reportedAccount) {
		this.reportedAccount = Objects.requireNonNull(reportedAccount);
		return this;
	}

	public CorporateActionCashEntitlement getCurrencyExchangeForCorporateActionCashEntitlement() {
		return currencyExchangeForCorporateActionCashEntitlement;
	}

	public CurrencyExchange setCurrencyExchangeForCorporateActionCashEntitlement(com.tools20022.repository.entity.CorporateActionCashEntitlement currencyExchangeForCorporateActionCashEntitlement) {
		this.currencyExchangeForCorporateActionCashEntitlement = Objects.requireNonNull(currencyExchangeForCorporateActionCashEntitlement);
		return this;
	}

	public PaymentExecution getPaymentExecution() {
		return paymentExecution;
	}

	public CurrencyExchange setPaymentExecution(com.tools20022.repository.entity.PaymentExecution paymentExecution) {
		this.paymentExecution = Objects.requireNonNull(paymentExecution);
		return this;
	}

	public Optional<Quote> getCurrencyExchangeForSecuritiesQuote() {
		return currencyExchangeForSecuritiesQuote == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesQuote);
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesQuote(com.tools20022.repository.entity.Quote currencyExchangeForSecuritiesQuote) {
		this.currencyExchangeForSecuritiesQuote = currencyExchangeForSecuritiesQuote;
		return this;
	}

	public Optional<SecuritiesConversion> getCurrencyExchangeForSecuritiesConversion() {
		return currencyExchangeForSecuritiesConversion == null ? Optional.empty() : Optional.of(currencyExchangeForSecuritiesConversion);
	}

	public CurrencyExchange setCurrencyExchangeForSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion currencyExchangeForSecuritiesConversion) {
		this.currencyExchangeForSecuritiesConversion = currencyExchangeForSecuritiesConversion;
		return this;
	}

	public Optional<CashDistribution> getCurrencyExchangeForCashDistribution() {
		return currencyExchangeForCashDistribution == null ? Optional.empty() : Optional.of(currencyExchangeForCashDistribution);
	}

	public CurrencyExchange setCurrencyExchangeForCashDistribution(com.tools20022.repository.entity.CashDistribution currencyExchangeForCashDistribution) {
		this.currencyExchangeForCashDistribution = currencyExchangeForCashDistribution;
		return this;
	}

	public Adjustment getAdjustment() {
		return adjustment;
	}

	public CurrencyExchange setAdjustment(com.tools20022.repository.entity.Adjustment adjustment) {
		this.adjustment = Objects.requireNonNull(adjustment);
		return this;
	}
}