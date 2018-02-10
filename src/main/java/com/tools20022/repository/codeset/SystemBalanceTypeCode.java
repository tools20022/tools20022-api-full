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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SystemBalanceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the system balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Opening
 * SystemBalanceTypeCode.Opening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Interim
 * SystemBalanceTypeCode.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Closing
 * SystemBalanceTypeCode.Closing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Book
 * SystemBalanceTypeCode.Book}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Current
 * SystemBalanceTypeCode.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Pending
 * SystemBalanceTypeCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#LimitRelated
 * SystemBalanceTypeCode.LimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Available
 * SystemBalanceTypeCode.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#LiquidityTransfer
 * SystemBalanceTypeCode.LiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Credit
 * SystemBalanceTypeCode.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#EligibleAssets
 * SystemBalanceTypeCode.EligibleAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Payment
 * SystemBalanceTypeCode.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Blocked
 * SystemBalanceTypeCode.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Expected
 * SystemBalanceTypeCode.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DaylightOverdraft
 * SystemBalanceTypeCode.DaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ExpectedCredit
 * SystemBalanceTypeCode.ExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ExpectedDebit
 * SystemBalanceTypeCode.ExpectedDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Adjustment
 * SystemBalanceTypeCode.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ProgressiveAverage
 * SystemBalanceTypeCode.ProgressiveAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Debit
 * SystemBalanceTypeCode.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Threshold
 * SystemBalanceTypeCode.Threshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Noted
 * SystemBalanceTypeCode.Noted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Self
 * SystemBalanceTypeCode.Self}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Master
 * SystemBalanceTypeCode.Master}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ForecastSettlement
 * SystemBalanceTypeCode.ForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#BlockedTrades
 * SystemBalanceTypeCode.BlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#OtherBlockedTrades
 * SystemBalanceTypeCode.OtherBlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Custody
 * SystemBalanceTypeCode.Custody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CashForecast
 * SystemBalanceTypeCode.CashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DividendsCollection
 * SystemBalanceTypeCode.DividendsCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#NetFunding
 * SystemBalanceTypeCode.NetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#PayInPayOut
 * SystemBalanceTypeCode.PayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ExchangeForecast
 * SystemBalanceTypeCode.ExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CentralCounterparty
 * SystemBalanceTypeCode.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#TotalOnHold
 * SystemBalanceTypeCode.TotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CreditOnHold
 * SystemBalanceTypeCode.CreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DebitOnHold
 * SystemBalanceTypeCode.DebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#TotalProcessed
 * SystemBalanceTypeCode.TotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CreditProcessed
 * SystemBalanceTypeCode.CreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DebitProcessed
 * SystemBalanceTypeCode.DebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#TotalFuture
 * SystemBalanceTypeCode.TotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#TotalRejected
 * SystemBalanceTypeCode.TotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#OpeningAvailable
 * SystemBalanceTypeCode.OpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InterimAvailable
 * SystemBalanceTypeCode.InterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ClosingAvailable
 * SystemBalanceTypeCode.ClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ForwardAvailable
 * SystemBalanceTypeCode.ForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ClosingBooked
 * SystemBalanceTypeCode.ClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InterimBooked
 * SystemBalanceTypeCode.InterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#OpeningBooked
 * SystemBalanceTypeCode.OpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#PreviouslyClosedBooked
 * SystemBalanceTypeCode.PreviouslyClosedBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentOpeningAvailable
 * SystemBalanceTypeCode.InvestmentOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentInterimAvailable
 * SystemBalanceTypeCode.InvestmentInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentClosingAvailable
 * SystemBalanceTypeCode.InvestmentClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentForwardAvailable
 * SystemBalanceTypeCode.InvestmentForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentClosingBooked
 * SystemBalanceTypeCode.InvestmentClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentInterimBooked
 * SystemBalanceTypeCode.InvestmentInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentOpeningBooked
 * SystemBalanceTypeCode.InvestmentOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#InvestmentExpected
 * SystemBalanceTypeCode.InvestmentExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementOpeningAvailable
 * SystemBalanceTypeCode.DisbursementOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementInterimAvailable
 * SystemBalanceTypeCode.DisbursementInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementClosingAvailable
 * SystemBalanceTypeCode.DisbursementClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementForwardAvailable
 * SystemBalanceTypeCode.DisbursementForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementClosingBooked
 * SystemBalanceTypeCode.DisbursementClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementInterimBooked
 * SystemBalanceTypeCode.DisbursementInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementOpeningBooked
 * SystemBalanceTypeCode.DisbursementOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DisbursementExpected
 * SystemBalanceTypeCode.DisbursementExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionOpeningAvailable
 * SystemBalanceTypeCode.CollectionOpeningAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionInterimAvailable
 * SystemBalanceTypeCode.CollectionInterimAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionClosingAvailable
 * SystemBalanceTypeCode.CollectionClosingAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionForwardAvailable
 * SystemBalanceTypeCode.CollectionForwardAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionClosingBooked
 * SystemBalanceTypeCode.CollectionClosingBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionInterimBooked
 * SystemBalanceTypeCode.CollectionInterimBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionOpeningBooked
 * SystemBalanceTypeCode.CollectionOpeningBooked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CollectionExpected
 * SystemBalanceTypeCode.CollectionExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#FirmCollateralisation
 * SystemBalanceTypeCode.FirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#UsedAmountsFirmCollateralisation
 * SystemBalanceTypeCode.UsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#SelfCollateralisation
 * SystemBalanceTypeCode.SelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#UsedAmountsSelfCollateralisation
 * SystemBalanceTypeCode.UsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CustodyActual
 * SystemBalanceTypeCode.CustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CCPGuaranteedForecasting
 * SystemBalanceTypeCode.CCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#NonCCPGuaranteedForecasting
 * SystemBalanceTypeCode.NonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DefinitiveSettledSecurities
 * SystemBalanceTypeCode.DefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#LackOfHoldingsTransactions
 * SystemBalanceTypeCode.LackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#NonSettledSecurities
 * SystemBalanceTypeCode.NonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CCPGuaranteedOTCTransactions
 * SystemBalanceTypeCode.CCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ForecastOTCTransactions
 * SystemBalanceTypeCode.ForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#NonCCPGuaranteedOTCTransactions
 * SystemBalanceTypeCode.NonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#SAPDirectDebitAmount
 * SystemBalanceTypeCode.SAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#SAPDirectCreditAmount
 * SystemBalanceTypeCode.SAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CMUPRepoDebit
 * SystemBalanceTypeCode.CMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#CMUPRepoCredit
 * SystemBalanceTypeCode.CMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#BulkSettlementCMUPDebit
 * SystemBalanceTypeCode.BulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#BulkSettlementCMUPCredit
 * SystemBalanceTypeCode.BulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#SAPQueueAmount
 * SystemBalanceTypeCode.SAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#IntradayRepoLimit
 * SystemBalanceTypeCode.IntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#IntradayRepoDrawings
 * SystemBalanceTypeCode.IntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#DiscountWindowRepoDrawings
 * SystemBalanceTypeCode.DiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#AvailableDMVForDiscountWindowRepo
 * SystemBalanceTypeCode.AvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#AvailableDMVForIntradayRepo
 * SystemBalanceTypeCode.AvailableDMVForIntradayRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Elected
 * SystemBalanceTypeCode.Elected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ReservedForDistribution
 * SystemBalanceTypeCode.ReservedForDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#ReservedForRemoval
 * SystemBalanceTypeCode.ReservedForRemoval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Restricted
 * SystemBalanceTypeCode.Restricted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#TotalEntitled
 * SystemBalanceTypeCode.TotalEntitled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Unelected
 * SystemBalanceTypeCode.Unelected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode#Information
 * SystemBalanceTypeCode.Information}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemBalanceType1Code
 * SystemBalanceType1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
 * SystemBalanceType2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPNG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SystemBalanceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the system balance."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemBalanceTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Book balance of the account at the beginning of the account servicer's
	 * business day. It always equals the closing book balance from the previous
	 * business day. Note: the available balance at the beginning of the account
	 * servicer's business day may be different from the closing book balance
	 * from the previous business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. \nNote: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Opening = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Opening";
			definition = "Book balance of the account at the beginning of the account servicer's business day. It always equals the closing book balance from the previous business day. \nNote: the available balance at the beginning of the account servicer's business day may be different from the closing book balance from the previous business day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OPNG";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Interim = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interim";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "INTM";
		}
	};
	/**
	 * Balance of the account at the end of the account servicer's business day.
	 * It is the sum of the opening balance at the beginning of the day and all
	 * entries booked to the account during the account servicer's business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Closing = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Closing";
			definition = "Balance of the account at the end of the account servicer's business day. It is the sum of the opening balance at the beginning of the day and all entries booked to the account during the account servicer's business day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CLSG";
		}
	};
	/**
	 * Balance that is registered in the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOOK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance that is registered in the books of the account servicer."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Book = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Book";
			definition = "Balance that is registered in the books of the account servicer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "BOOK";
		}
	};
	/**
	 * Balance of the account at a precise moment in time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account at a precise moment in time."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Current = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Current";
			definition = "Balance of the account at a precise moment in time.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CRRT";
		}
	};
	/**
	 * Balance of securities pending delivery, such as the orders to sell
	 * securities have been executed but settlement of the open transactions has
	 * not been confirmed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities pending delivery, such as the orders to sell securities have been executed but settlement of the open transactions has not been confirmed."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Pending = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Pending";
			definition = "Balance of securities pending delivery, such as the orders to sell securities have been executed but settlement of the open transactions has not been confirmed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "PDNG";
		}
	};
	/**
	 * Balance of a specific limit value, such as a bilateral balance is
	 * calculated in relation to a given bilateral limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LRLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of a specific limit value, such as a bilateral balance is calculated in relation to a given bilateral limit."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode LimitRelated = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitRelated";
			definition = "Balance of a specific limit value, such as a bilateral balance is calculated in relation to a given bilateral limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "LRLD";
		}
	};
	/**
	 * Balance of money or securities that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of money or securities that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Available = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Available";
			definition = "Balance of money or securities that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "AVLB";
		}
	};
	/**
	 * Balance composed of the sum of all liquidity transfers made to or from an
	 * account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTSF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance composed of the sum of all liquidity transfers made to or from an account."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode LiquidityTransfer = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LiquidityTransfer";
			definition = "Balance composed of the sum of all liquidity transfers made to or from an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "LTSF";
		}
	};
	/**
	 * Balance representing the sum of all credit entries booked to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of all credit entries booked to an account."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Credit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Credit";
			definition = "Balance representing the sum of all credit entries booked to an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Balance representing the potential loan a Central Bank would make in cash
	 * if the collateral is pledged, such as securities available and eligible
	 * as collateral with the central bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EAST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, such as securities available and eligible as collateral with the central bank."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode EligibleAssets = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EligibleAssets";
			definition = "Balance representing the potential loan a Central Bank would make in cash if the collateral is pledged, such as securities available and eligible as collateral with the central bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "EAST";
		}
	};
	/**
	 * Balance representing the sum of entries as a result of payments
	 * processing. Entries relating to fees, interest, or other movements not a
	 * result of payments sent or received by the account owner are not
	 * included.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PYMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of entries as a result of payments processing. Entries relating to fees, interest, or other movements not a result of payments sent or received by the account owner are not included."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Payment = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Payment";
			definition = "Balance representing the sum of entries as a result of payments processing. Entries relating to fees, interest, or other movements not a result of payments sent or received by the account owner are not included.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "PYMT";
		}
	};
	/**
	 * Balance representing the regulatory reserve that a financial institution
	 * must have with the account servicing institution, such as the minimum
	 * credit balance a financial institution is to keep with its Central Bank
	 * for mandatory reserve purposes. In some countries, a blocked balance is
	 * known as a 'reserve' balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, such as the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes. In some countries, a blocked balance is known as a 'reserve' balance."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Blocked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Balance representing the regulatory reserve that a financial institution must have with the account servicing institution, such as the minimum credit balance a financial institution is to keep with its Central Bank for mandatory reserve purposes. In some countries, a blocked balance is known as a 'reserve' balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "BLCK";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day balance if everything is
	 * booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XPCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Expected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Expected";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XPCD";
		}
	};
	/**
	 * Balance representing the intra day overdraft granted by the central bank
	 * to financial institutions participating in a RTGS system. This balance
	 * may vary over time and shall be offset at the end of the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaylightOverdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the intra day overdraft granted by the central bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DaylightOverdraft = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DaylightOverdraft";
			definition = "Balance representing the intra day overdraft granted by the central bank to financial institutions participating in a RTGS system. This balance may vary over time and shall be offset at the end of the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DLOD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day credit balance if
	 * everything books to the account and no other credit entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ExpectedCredit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedCredit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day credit balance if everything books to the account and no other credit entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XCRD";
		}
	};
	/**
	 * Balance, composed of booked entries and pending items known at the time
	 * of calculation, which projects the end of day debit balance if everything
	 * books to the account and no other debit entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XDBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ExpectedDebit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExpectedDebit";
			definition = "Balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day debit balance if everything books to the account and no other debit entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XDBT";
		}
	};
	/**
	 * Average balance to be held in the settlement account at the end of each
	 * day in order to fulfil the reserve due. The approximation will be always
	 * made rounding up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average balance to be held in the settlement account at the end of each day in order to fulfil the reserve due.\nThe approximation will be always made rounding up."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Adjustment = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Adjustment";
			definition = "Average balance to be held in the settlement account at the end of each day in order to fulfil the reserve due.\nThe approximation will be always made rounding up.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ADJT";
		}
	};
	/**
	 * Average of the daily balances on the account used to fulfil the reserve
	 * requirements calculated from the beginning of the maintenance period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressiveAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ProgressiveAverage = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProgressiveAverage";
			definition = "Average of the daily balances on the account used to fulfil the reserve requirements calculated from the beginning of the maintenance period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "PRAV";
		}
	};
	/**
	 * Balance representing the sum of all debit entries booked to an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the sum of all debit entries booked to an account."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Debit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Debit";
			definition = "Balance representing the sum of all debit entries booked to an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DBIT";
		}
	};
	/**
	 * Balance representing the amount that will be destined for investment.
	 * Difference between available balance and threshold for investment limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Threshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Threshold = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Threshold";
			definition = "Balance representing the amount that will be destined for investment. Difference between available balance and threshold for investment limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "THRE";
		}
	};
	/**
	 * Balance representing the amount that a financial institution has set
	 * aside for a specific reason and which is therefore not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Noted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Noted = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Noted";
			definition = "Balance representing the amount that a financial institution has set aside for a specific reason and which is therefore not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "NOTE";
		}
	};
	/**
	 * Balance of the account identified (as opposed to Master Balance).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Self"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account identified (as opposed to Master Balance)."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Self = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Self";
			definition = "Balance of the account identified (as opposed to Master Balance).";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SELF";
		}
	};
	/**
	 * Balance of the identified account plus the balance of all of its
	 * subaccounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Master"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the identified account plus the balance of all of its subaccounts."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Master = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Master";
			definition = "Balance of the identified account plus the balance of all of its subaccounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "MSTR";
		}
	};
	/**
	 * Balance representing the forecast of total of all cash legs for trades
	 * that are ready to settle via a a central securities depository. Amounts
	 * shown are still subject to processing of the securities settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of total of all cash legs for trades that are ready to settle via a a central securities depository. Amounts shown are still subject to processing of the securities settlement."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ForecastSettlement = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForecastSettlement";
			definition = "Balance representing the forecast of total of all cash legs for trades that are ready to settle via a a central securities depository. Amounts shown are still subject to processing of the securities settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FSET";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via a central securities depository that have been matched but
	 * blocked in order to not settle. These blocked trades are included in the
	 * calculation for settlement (for example to avoid overdrafts). Usage rule:
	 * Blocking can be done by account owner or its counterparties. Usually this
	 * is done to chain transactions or to prioritise other trades. Blocked
	 * trades have an indicator that prevents the transactions from settling.
	 * Once matched, they can settle whenever the freeze is lifted. In this case
	 * they will move to FSET. Lifting the freeze can happen anytime during the
	 * day and the transaction will be settling in the next settlement cycle
	 * which can be the same day if the (international) central securities
	 * depository's operates several settlements cycles per day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BLOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (for example to avoid overdrafts).\nUsage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (international) central securities depository's operates several settlements cycles per day."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode BlockedTrades = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked trades are included in the calculation for settlement (for example to avoid overdrafts).\nUsage rule: Blocking can be done by account owner or its counterparties. Usually this is done to chain transactions or to prioritise other trades. Blocked trades have an indicator that prevents the transactions from settling. Once matched, they can settle whenever the freeze is lifted. In this case they will move to FSET. Lifting the freeze can happen anytime during the day and the transaction will be settling in the next settlement cycle which can be the same day if the (international) central securities depository's operates several settlements cycles per day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "BLOC";
		}
	};
	/**
	 * Balance representing the projected total of all cash legs for trades
	 * settling via a central securities depository that have been matched but
	 * blocked in order to not settle. These blocked transactions are not
	 * included in the calculation for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode OtherBlockedTrades = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OtherBlockedTrades";
			definition = "Balance representing the projected total of all cash legs for trades settling via a central securities depository that have been matched but blocked in order to not settle. These blocked transactions are not included in the calculation for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OTHB";
		}
	};
	/**
	 * Balance representing the projected total of all asset servicing
	 * transactions such as dividends, income corporate actions equivalents, tax
	 * returns, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Custody = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Custody";
			definition = "Balance representing the projected total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CUST";
		}
	};
	/**
	 * Balance representing the total of all balance types representing
	 * transactions to settle, blocked items and custody transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CashForecast = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashForecast";
			definition = "Balance representing the total of all balance types representing transactions to settle, blocked items and custody transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * Balance representing the projected total amount of all payment
	 * obligations to the participant (bank), based on their role as main paying
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsCollection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DividendsCollection = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DividendsCollection";
			definition = "Balance representing the projected total amount of all payment obligations to the participant (bank), based on their role as main paying agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "COLC";
		}
	};
	/**
	 * Balance representing the net amount to be funded resulting from all
	 * transactions which have an impact on the funding requirement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode NetFunding = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetFunding";
			definition = "Balance representing the net amount to be funded resulting from all transactions which have an impact on the funding requirement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FUND";
		}
	};
	/**
	 * Balance representing the fictive forecast of automated direct debits or
	 * payment based on standing arrangements between the a central securities
	 * depository and the user.
	 * 
	 * Usage: Pay-Ins and Pay-Outs can be different based on individual payment
	 * instructions or available funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInPayOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between the a central securities depository and the user.\n\nUsage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode PayInPayOut = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PayInPayOut";
			definition = "Balance representing the fictive forecast of automated direct debits or payment based on standing arrangements between the a central securities depository and the user.\n\nUsage: Pay-Ins and Pay-Outs can be different based on individual payment instructions or available funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "PIPO";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ExchangeForecast = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangeForecast";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XCHG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges that operate a central counterparty
	 * functionality.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CentralCounterparty = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterparty";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges that operate a central counterparty functionality.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CCPS";
		}
	};
	/**
	 * Balance representing the total of the payments that were put on hold
	 * because the limits have been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that were put on hold because the limits have been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode TotalOnHold = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalOnHold";
			definition = "Balance representing the total of the payments that were put on hold because the limits have been exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "TOHB";
		}
	};
	/**
	 * Balance representing the total incoming payments that were put on hold
	 * because the credit limit has been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CreditOnHold = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditOnHold";
			definition = "Balance representing the total incoming payments that were put on hold because the credit limit has been exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "COHB";
		}
	};
	/**
	 * Balance representing the total outgoing payments that were put on hold
	 * because the debit limit has been exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOHB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DebitOnHold = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitOnHold";
			definition = "Balance representing the total outgoing payments that were put on hold because the debit limit has been exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DOHB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been processed
	 * and are waiting for settlement during the day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that have been processed and are waiting for settlement during the day."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode TotalProcessed = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalProcessed";
			definition = "Balance representing the total of the payments that have been processed and are waiting for settlement during the day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "TPBL";
		}
	};
	/**
	 * Balance representing the total incoming payments that have been processed
	 * and are waiting for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total incoming payments that have been processed and are waiting for settlement."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CreditProcessed = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditProcessed";
			definition = "Balance representing the total incoming payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CPBL";
		}
	};
	/**
	 * Balance representing the total outgoing payments that have been processed
	 * and are waiting for settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total outgoing payments that have been processed and are waiting for settlement."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DebitProcessed = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitProcessed";
			definition = "Balance representing the total outgoing payments that have been processed and are waiting for settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DPBL";
		}
	};
	/**
	 * Balance representing the total of the payments with a processing date in
	 * the future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments with a processing date in the future."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode TotalFuture = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalFuture";
			definition = "Balance representing the total of the payments with a processing date in the future.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FUTB";
		}
	};
	/**
	 * Balance representing the total of the payments that have been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the total of the payments that have been rejected."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode TotalRejected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalRejected";
			definition = "Balance representing the total of the payments that have been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "REJB";
		}
	};
	/**
	 * Opening balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode OpeningAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningAvailable";
			definition = "Opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OPAV";
		}
	};
	/**
	 * Available balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InterimAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimAvailable";
			definition = "Available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ITAV";
		}
	};
	/**
	 * Closing balance of amount of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ClosingAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingAvailable";
			definition = "Closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CLAV";
		}
	};
	/**
	 * Forward available balance of money that is at the disposal of the account
	 * owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FWAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ForwardAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForwardAvailable";
			definition = "Forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FWAV";
		}
	};
	/**
	 * Balance of the account at the end of the pre-agreed account reporting
	 * period. It is the sum of the opening booked balance at the beginning of
	 * the period and all entries booked to the account during the pre-agreed
	 * account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ClosingBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClosingBooked";
			definition = "Balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CLBD";
		}
	};
	/**
	 * Balance calculated in the course of the account servicer's business day,
	 * at the time specified, and subject to further changes during the business
	 * day. The interim balance is calculated on the basis of booked credit and
	 * debit items during the calculation time/period specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InterimBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InterimBooked";
			definition = "Balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ITBD";
		}
	};
	/**
	 * Book balance of the account at the beginning of the account reporting
	 * period. It always equals the closing book balance from the previous
	 * report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode OpeningBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OpeningBooked";
			definition = "Book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OPBD";
		}
	};
	/**
	 * Balance of the account at the previously closed account reporting period.
	 * The opening booked balance for the new period has to be equal to this
	 * balance.
	 * 
	 * Usage: the previously booked closing balance should equal (inclusive
	 * date) the booked closing balance of the date it references and equal the
	 * actual booked opening balance of the current date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyClosedBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. \n\nUsage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode PreviouslyClosedBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviouslyClosedBooked";
			definition = "Balance of the account at the previously closed account reporting period. The opening booked balance for the new period has to be equal to this balance. \n\nUsage: the previously booked closing balance should equal (inclusive date) the booked closing balance of the date it references and equal the actual booked opening balance of the current date.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "PRCD";
		}
	};
	/**
	 * Investment opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentOpeningAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningAvailable";
			definition = "Investment opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IOPA";
		}
	};
	/**
	 * Investment available balance for calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentInterimAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimAvailable";
			definition = "Investment available balance for calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IITA";
		}
	};
	/**
	 * Investment closing balance of an amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentClosingAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingAvailable";
			definition = "Investment closing balance of an amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ICLA";
		}
	};
	/**
	 * Investment forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentForwardAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentForwardAvailable";
			definition = "Investment forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IFWA";
		}
	};
	/**
	 * Investment (mutual funds) balance of the account at the end of the
	 * pre-agreed account reporting period. It is the sum of the opening booked
	 * balance at the beginning of the period and all entries booked to the
	 * account during the pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentClosingBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentClosingBooked";
			definition = "Investment (mutual funds) balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ICLB";
		}
	};
	/**
	 * Investment balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentInterimBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentInterimBooked";
			definition = "Investment balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IITB";
		}
	};
	/**
	 * Investment book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * 
	 * .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IOPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report. \n\n."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentOpeningBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentOpeningBooked";
			definition = "Investment book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report. \n\n.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IOPB";
		}
	};
	/**
	 * Investment balance, composed of booked entries and pending items known at
	 * the time of calculation, which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode InvestmentExpected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentExpected";
			definition = "Investment balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IXPC";
		}
	};
	/**
	 * Disbursement opening balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementOpeningAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningAvailable";
			definition = "Disbursement opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DOPA";
		}
	};
	/**
	 * Disbursement available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementInterimAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimAvailable";
			definition = "Disbursement available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DITA";
		}
	};
	/**
	 * Disbursement closing balance of amount of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementClosingAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingAvailable";
			definition = "Disbursement closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DCLA";
		}
	};
	/**
	 * Disbursement forward available balance of money that is at the disposal
	 * of the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementForwardAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementForwardAvailable";
			definition = "Disbursement forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DFWA";
		}
	};
	/**
	 * Disbursement balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementClosingBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementClosingBooked";
			definition = "Disbursement balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DCLB";
		}
	};
	/**
	 * Disbursement balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementInterimBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementInterimBooked";
			definition = "Disbursement balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DITB";
		}
	};
	/**
	 * Disbursement book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DOPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementOpeningBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementOpeningBooked";
			definition = "Disbursement book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DOPB";
		}
	};
	/**
	 * Disbursement balance, composed of booked entries and pending items known
	 * at the time of calculation, which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisbursementExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disbursement balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DisbursementExpected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisbursementExpected";
			definition = "Disbursement balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DXPC";
		}
	};
	/**
	 * Collection opening balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection opening balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionOpeningAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningAvailable";
			definition = "Collection opening balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "COPA";
		}
	};
	/**
	 * Collection available balance calculated in the course of the account
	 * servicer's business day, at the time specified, and subject to further
	 * changes during the business day. The interim balance is calculated on the
	 * basis of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CITA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionInterimAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimAvailable";
			definition = "Collection available balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CITA";
		}
	};
	/**
	 * Collection closing balance of amount of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection closing balance of amount of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionClosingAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingAvailable";
			definition = "Collection closing balance of amount of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CCLA";
		}
	};
	/**
	 * Collection forward available balance of money that is at the disposal of
	 * the account owner on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CFWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionForwardAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection forward available balance of money that is at the disposal of the account owner on the date specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionForwardAvailable = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionForwardAvailable";
			definition = "Collection forward available balance of money that is at the disposal of the account owner on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CFWA";
		}
	};
	/**
	 * Collection balance of the account at the end of the pre-agreed account
	 * reporting period. It is the sum of the opening booked balance at the
	 * beginning of the period and all entries booked to the account during the
	 * pre-agreed account reporting period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionClosingBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionClosingBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionClosingBooked";
			definition = "Collection balance of the account at the end of the pre-agreed account reporting period. It is the sum of the opening booked balance at the beginning of the period and all entries booked to the account during the pre-agreed account reporting period.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CCLB";
		}
	};
	/**
	 * Collection balance calculated in the course of the account servicer's
	 * business day, at the time specified, and subject to further changes
	 * during the business day. The interim balance is calculated on the basis
	 * of booked credit and debit items during the calculation time/period
	 * specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CITB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionInterimBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionInterimBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionInterimBooked";
			definition = "Collection balance calculated in the course of the account servicer's business day, at the time specified, and subject to further changes during the business day. The interim balance is calculated on the basis of booked credit and debit items during the calculation time/period specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CITB";
		}
	};
	/**
	 * Collection book balance of the account at the beginning of the account
	 * reporting period. It always equals the closing book balance from the
	 * previous report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COPB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionOpeningBooked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionOpeningBooked = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionOpeningBooked";
			definition = "Collection book balance of the account at the beginning of the account reporting period. It always equals the closing book balance from the previous report.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "COPB";
		}
	};
	/**
	 * Collection balance, composed of booked entries and pending items known at
	 * the time of calculation, which projects the end of day balance if
	 * everything is booked on the account and no other entry is posted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CXPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionExpected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CollectionExpected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionExpected";
			definition = "Collection balance, composed of booked entries and pending items known at the time of calculation, which projects the end of day balance if everything is booked on the account and no other entry is posted.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CXPC";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of existing holdings at central securities depositary that are
	 * qualified to serve as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at central securities depositary that are qualified to serve as collateral."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode FirmCollateralisation = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirmCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of existing holdings at central securities depositary that are qualified to serve as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FCOL";
		}
	};
	/**
	 * Balance representing the cash equivalent resulting from evaluation of
	 * existing holdings at CSD that are qualified to serve as collateral and
	 * have been used as collateral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsFirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode UsedAmountsFirmCollateralisation = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			definition = "Balance representing the cash equivalent resulting from evaluation of existing holdings at CSD that are qualified to serve as collateral and have been used as collateral.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "FCOU";
		}
	};
	/**
	 * Balance representing the forecast of the cash-equivalent resulting from
	 * evaluation of the net incoming balance of securities qualified to serve
	 * as collateral for which settlement instructions are held at.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode SelfCollateralisation = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SelfCollateralisation";
			definition = "Balance representing the forecast of the cash-equivalent resulting from evaluation of the net incoming balance of securities qualified to serve as collateral for which settlement instructions are held at.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SCOL";
		}
	};
	/**
	 * Balance representing the cash-equivalent resulting from evaluation of
	 * incoming securities, qualified to serve as collateral and actually used
	 * as collateral, which have been settled during the settlement process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCOU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsSelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode UsedAmountsSelfCollateralisation = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			definition = "Balance representing the cash-equivalent resulting from evaluation of incoming securities, qualified to serve as collateral and actually used as collateral, which have been settled during the settlement process.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SCOU";
		}
	};
	/**
	 * Balance representing the actual total of all asset servicing transactions
	 * such as dividends, income corporate actions equivalents, tax returns,
	 * redemptions, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyActual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CustodyActual = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CustodyActual";
			definition = "Balance representing the actual total of all asset servicing transactions such as dividends, income corporate actions equivalents, tax returns, redemptions, etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "CUSA";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions in exchanges, going through CCP functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CCPGuaranteedForecasting = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions in exchanges, going through CCP functions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XCHC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded in exchanges not going through central counter party
	 * (CCP) functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCHN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through central counter party (CCP) functions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode NonCCPGuaranteedForecasting = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded in exchanges not going through central counter party (CCP) functions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "XCHN";
		}
	};
	/**
	 * Balance representing the cash equivalent of all settled securities
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinitiveSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of all settled securities transactions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DefinitiveSettledSecurities = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DefinitiveSettledSecurities";
			definition = "Balance representing the cash equivalent of all settled securities transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DSET";
		}
	};
	/**
	 * Balance representing the cash equivalent of transactions with a lack of
	 * holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfHoldingsTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of transactions with a lack of holdings."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode LackOfHoldingsTransactions = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LackOfHoldingsTransactions";
			definition = "Balance representing the cash equivalent of transactions with a lack of holdings.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Balance representing the cash equivalent of all non-settled securities
	 * transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the cash equivalent of all non-settled securities transactions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode NonSettledSecurities = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonSettledSecurities";
			definition = "Balance representing the cash equivalent of all non-settled securities transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "NSET";
		}
	};
	/**
	 * Balance representing the Forecast of the total of all cash-legs of
	 * transactions 'over the counter' (OTC), going through central counter
	 * party (CCP) functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through central counter party (CCP) functions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CCPGuaranteedOTCTransactions = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			definition = "Balance representing the Forecast of the total of all cash-legs of transactions 'over the counter' (OTC), going through central counter party (CCP) functions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OTCC";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC)."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ForecastOTCTransactions = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForecastOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC).";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OTCG";
		}
	};
	/**
	 * Balance representing the forecast of the total of all cash legs of
	 * transactions traded 'over the counter' (OTC) not going through central
	 * counter party (CCP) functions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through central counter party (CCP) functions."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode NonCCPGuaranteedOTCTransactions = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			definition = "Balance representing the forecast of the total of all cash legs of transactions traded 'over the counter' (OTC) not going through central counter party (CCP) functions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "OTCN";
		}
	};
	/**
	 * Balance represents the settlement account processor direct debit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectDebitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor direct debit amount."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode SAPDirectDebitAmount = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPDirectDebitAmount";
			definition = "Balance represents the settlement account processor direct debit amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SAPD";
		}
	};
	/**
	 * Balance represents the settlement account processor direct credit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor direct credit amount."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode SAPDirectCreditAmount = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPDirectCreditAmount";
			definition = "Balance represents the settlement account processor direct credit amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SAPC";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo debits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the central moneymarkets unit processor repo debits."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CMUPRepoDebit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoDebit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo debits.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "REPD";
		}
	};
	/**
	 * Balance represents the total of the central moneymarkets unit processor
	 * repo credits.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the central moneymarkets unit processor repo credits."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode CMUPRepoCredit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CMUPRepoCredit";
			definition = "Balance represents the total of the central moneymarkets unit processor repo credits.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "REPC";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor debit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the bulk settlement and central moneymarkets unit processor debit."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode BulkSettlementCMUPDebit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPDebit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor debit.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "BSCD";
		}
	};
	/**
	 * Balance represents the total of the bulk settlement and central
	 * moneymarkets unit processor credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the total of the bulk settlement and central moneymarkets unit processor credit."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode BulkSettlementCMUPCredit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BulkSettlementCMUPCredit";
			definition = "Balance represents the total of the bulk settlement and central moneymarkets unit processor credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "BSCC";
		}
	};
	/**
	 * Balance represents the settlement account processor queue amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPQueueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the settlement account processor queue amount."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode SAPQueueAmount = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SAPQueueAmount";
			definition = "Balance represents the settlement account processor queue amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "SAPP";
		}
	};
	/**
	 * Balance represents the intraday repo limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the intraday repo limit."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode IntradayRepoLimit = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoLimit";
			definition = "Balance represents the intraday repo limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IRLT";
		}
	};
	/**
	 * Balance represents the intraday repo drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the intraday repo drawings."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode IntradayRepoDrawings = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IntradayRepoDrawings";
			definition = "Balance represents the intraday repo drawings.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "IRDR";
		}
	};
	/**
	 * Balance represents the discount window repo drawings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DWRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountWindowRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance represents the discount window repo drawings."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode DiscountWindowRepoDrawings = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiscountWindowRepoDrawings";
			definition = "Balance represents the discount window repo drawings.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "DWRD";
		}
	};
	/**
	 * Balance represents the available discounted market value for discount
	 * window repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADWR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForDiscountWindowRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the available discounted market value for discount window repo."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode AvailableDMVForDiscountWindowRepo = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			definition = "Balance represents the available discounted market value for discount window repo.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ADWR";
		}
	};
	/**
	 * Balance represents the available discounted market value for intraday
	 * repo.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForIntradayRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance represents the available discounted market value for intraday repo."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode AvailableDMVForIntradayRepo = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			definition = "Balance represents the available discounted market value for intraday repo.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "AIDR";
		}
	};
	/**
	 * Balance of instructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Elected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of instructed position."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Elected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Elected";
			definition = "Balance of instructed position.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Balance of financial instruments that are reserved for the distribution
	 * of the proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of financial instruments that are reserved for the distribution of the proceeds."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ReservedForDistribution = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservedForDistribution";
			definition = "Balance of financial instruments that are reserved for the distribution of the proceeds.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "RDIS";
		}
	};
	/**
	 * Balance of securities which are reserved temporarily in the SPA account
	 * before they will effectively be exchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservedForRemoval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of securities which are reserved temporarily in the SPA account before they will effectively be exchanged."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode ReservedForRemoval = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReservedForRemoval";
			definition = "Balance of securities which are reserved temporarily in the SPA account before they will effectively be exchanged.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "RREM";
		}
	};
	/**
	 * Balance of cash that may only be used under certain conditions.
	 * 
	 * Balance type is used to block securities/cash in the client account for
	 * example, when related to specific corporate actions, the holding is under
	 * the direct control of the system paying agent, who is the only one who
	 * can transfer securities out of this balance type. Also known as the
	 * "escrow balance" or "sequestered balance".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restricted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Balance of cash that may only be used under certain conditions.\n\nBalance type is used to block securities/cash in the client account for example, when related to specific corporate actions, the holding is under the direct control of the system paying agent, who is the only one who can transfer securities out of this balance type.\nAlso known as the \"escrow balance\" or \"sequestered balance\"."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Restricted = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Restricted";
			definition = "Balance of cash that may only be used under certain conditions.\n\nBalance type is used to block securities/cash in the client account for example, when related to specific corporate actions, the holding is under the direct control of the system paying agent, who is the only one who can transfer securities out of this balance type.\nAlso known as the \"escrow balance\" or \"sequestered balance\".";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Total quantity of financial instruments entitled to the account owner
	 * based on the terms of the corporate action event. .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TENT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalEntitled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of financial instruments entitled to the account owner based on the terms of the corporate action event.\n."
	 * </li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode TotalEntitled = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalEntitled";
			definition = "Total quantity of financial instruments entitled to the account owner based on the terms of the corporate action event.\n.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "TENT";
		}
	};
	/**
	 * Balance of uninstructed position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unelected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of uninstructed position."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Unelected = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unelected";
			definition = "Balance of uninstructed position.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "UNEL";
		}
	};
	/**
	 * Balance for informational purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
	 * SystemBalanceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance for informational purposes."</li>
	 * </ul>
	 */
	public static final SystemBalanceTypeCode Information = new SystemBalanceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Balance for informational purposes.";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceTypeCode.mmObject();
			codeName = "INFO";
		}
	};
	final static private LinkedHashMap<String, SystemBalanceTypeCode> codesByName = new LinkedHashMap<>();

	protected SystemBalanceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemBalanceTypeCode";
				definition = "Specifies the nature of the system balance.";
				derivation_lazy = () -> Arrays.asList(SystemBalanceType1Code.mmObject(), SystemBalanceType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemBalanceTypeCode.Opening, com.tools20022.repository.codeset.SystemBalanceTypeCode.Interim,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Closing, com.tools20022.repository.codeset.SystemBalanceTypeCode.Book, com.tools20022.repository.codeset.SystemBalanceTypeCode.Current,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Pending, com.tools20022.repository.codeset.SystemBalanceTypeCode.LimitRelated, com.tools20022.repository.codeset.SystemBalanceTypeCode.Available,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.LiquidityTransfer, com.tools20022.repository.codeset.SystemBalanceTypeCode.Credit, com.tools20022.repository.codeset.SystemBalanceTypeCode.EligibleAssets,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Payment, com.tools20022.repository.codeset.SystemBalanceTypeCode.Blocked, com.tools20022.repository.codeset.SystemBalanceTypeCode.Expected,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DaylightOverdraft, com.tools20022.repository.codeset.SystemBalanceTypeCode.ExpectedCredit,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.ExpectedDebit, com.tools20022.repository.codeset.SystemBalanceTypeCode.Adjustment, com.tools20022.repository.codeset.SystemBalanceTypeCode.ProgressiveAverage,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Debit, com.tools20022.repository.codeset.SystemBalanceTypeCode.Threshold, com.tools20022.repository.codeset.SystemBalanceTypeCode.Noted,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Self, com.tools20022.repository.codeset.SystemBalanceTypeCode.Master, com.tools20022.repository.codeset.SystemBalanceTypeCode.ForecastSettlement,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.BlockedTrades, com.tools20022.repository.codeset.SystemBalanceTypeCode.OtherBlockedTrades, com.tools20022.repository.codeset.SystemBalanceTypeCode.Custody,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CashForecast, com.tools20022.repository.codeset.SystemBalanceTypeCode.DividendsCollection, com.tools20022.repository.codeset.SystemBalanceTypeCode.NetFunding,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.PayInPayOut, com.tools20022.repository.codeset.SystemBalanceTypeCode.ExchangeForecast,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CentralCounterparty, com.tools20022.repository.codeset.SystemBalanceTypeCode.TotalOnHold, com.tools20022.repository.codeset.SystemBalanceTypeCode.CreditOnHold,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DebitOnHold, com.tools20022.repository.codeset.SystemBalanceTypeCode.TotalProcessed, com.tools20022.repository.codeset.SystemBalanceTypeCode.CreditProcessed,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DebitProcessed, com.tools20022.repository.codeset.SystemBalanceTypeCode.TotalFuture, com.tools20022.repository.codeset.SystemBalanceTypeCode.TotalRejected,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.OpeningAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.InterimAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.ClosingAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.ForwardAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.ClosingBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.InterimBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.OpeningBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.PreviouslyClosedBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentOpeningAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentInterimAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentClosingAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentForwardAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentClosingBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentInterimBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentOpeningBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.InvestmentExpected, com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementOpeningAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementInterimAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementClosingAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementForwardAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementClosingBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementInterimBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementOpeningBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DisbursementExpected, com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionOpeningAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionInterimAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionClosingAvailable,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionForwardAvailable, com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionClosingBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionInterimBooked, com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionOpeningBooked,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CollectionExpected, com.tools20022.repository.codeset.SystemBalanceTypeCode.FirmCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.UsedAmountsFirmCollateralisation, com.tools20022.repository.codeset.SystemBalanceTypeCode.SelfCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.UsedAmountsSelfCollateralisation, com.tools20022.repository.codeset.SystemBalanceTypeCode.CustodyActual,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CCPGuaranteedForecasting, com.tools20022.repository.codeset.SystemBalanceTypeCode.NonCCPGuaranteedForecasting,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.DefinitiveSettledSecurities, com.tools20022.repository.codeset.SystemBalanceTypeCode.LackOfHoldingsTransactions,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.NonSettledSecurities, com.tools20022.repository.codeset.SystemBalanceTypeCode.CCPGuaranteedOTCTransactions,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.ForecastOTCTransactions, com.tools20022.repository.codeset.SystemBalanceTypeCode.NonCCPGuaranteedOTCTransactions,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.SAPDirectDebitAmount, com.tools20022.repository.codeset.SystemBalanceTypeCode.SAPDirectCreditAmount,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.CMUPRepoDebit, com.tools20022.repository.codeset.SystemBalanceTypeCode.CMUPRepoCredit,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.BulkSettlementCMUPDebit, com.tools20022.repository.codeset.SystemBalanceTypeCode.BulkSettlementCMUPCredit,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.SAPQueueAmount, com.tools20022.repository.codeset.SystemBalanceTypeCode.IntradayRepoLimit,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.IntradayRepoDrawings, com.tools20022.repository.codeset.SystemBalanceTypeCode.DiscountWindowRepoDrawings,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.AvailableDMVForDiscountWindowRepo, com.tools20022.repository.codeset.SystemBalanceTypeCode.AvailableDMVForIntradayRepo,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Elected, com.tools20022.repository.codeset.SystemBalanceTypeCode.ReservedForDistribution,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.ReservedForRemoval, com.tools20022.repository.codeset.SystemBalanceTypeCode.Restricted, com.tools20022.repository.codeset.SystemBalanceTypeCode.TotalEntitled,
						com.tools20022.repository.codeset.SystemBalanceTypeCode.Unelected, com.tools20022.repository.codeset.SystemBalanceTypeCode.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Opening.getCodeName().get(), Opening);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Closing.getCodeName().get(), Closing);
		codesByName.put(Book.getCodeName().get(), Book);
		codesByName.put(Current.getCodeName().get(), Current);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(LimitRelated.getCodeName().get(), LimitRelated);
		codesByName.put(Available.getCodeName().get(), Available);
		codesByName.put(LiquidityTransfer.getCodeName().get(), LiquidityTransfer);
		codesByName.put(Credit.getCodeName().get(), Credit);
		codesByName.put(EligibleAssets.getCodeName().get(), EligibleAssets);
		codesByName.put(Payment.getCodeName().get(), Payment);
		codesByName.put(Blocked.getCodeName().get(), Blocked);
		codesByName.put(Expected.getCodeName().get(), Expected);
		codesByName.put(DaylightOverdraft.getCodeName().get(), DaylightOverdraft);
		codesByName.put(ExpectedCredit.getCodeName().get(), ExpectedCredit);
		codesByName.put(ExpectedDebit.getCodeName().get(), ExpectedDebit);
		codesByName.put(Adjustment.getCodeName().get(), Adjustment);
		codesByName.put(ProgressiveAverage.getCodeName().get(), ProgressiveAverage);
		codesByName.put(Debit.getCodeName().get(), Debit);
		codesByName.put(Threshold.getCodeName().get(), Threshold);
		codesByName.put(Noted.getCodeName().get(), Noted);
		codesByName.put(Self.getCodeName().get(), Self);
		codesByName.put(Master.getCodeName().get(), Master);
		codesByName.put(ForecastSettlement.getCodeName().get(), ForecastSettlement);
		codesByName.put(BlockedTrades.getCodeName().get(), BlockedTrades);
		codesByName.put(OtherBlockedTrades.getCodeName().get(), OtherBlockedTrades);
		codesByName.put(Custody.getCodeName().get(), Custody);
		codesByName.put(CashForecast.getCodeName().get(), CashForecast);
		codesByName.put(DividendsCollection.getCodeName().get(), DividendsCollection);
		codesByName.put(NetFunding.getCodeName().get(), NetFunding);
		codesByName.put(PayInPayOut.getCodeName().get(), PayInPayOut);
		codesByName.put(ExchangeForecast.getCodeName().get(), ExchangeForecast);
		codesByName.put(CentralCounterparty.getCodeName().get(), CentralCounterparty);
		codesByName.put(TotalOnHold.getCodeName().get(), TotalOnHold);
		codesByName.put(CreditOnHold.getCodeName().get(), CreditOnHold);
		codesByName.put(DebitOnHold.getCodeName().get(), DebitOnHold);
		codesByName.put(TotalProcessed.getCodeName().get(), TotalProcessed);
		codesByName.put(CreditProcessed.getCodeName().get(), CreditProcessed);
		codesByName.put(DebitProcessed.getCodeName().get(), DebitProcessed);
		codesByName.put(TotalFuture.getCodeName().get(), TotalFuture);
		codesByName.put(TotalRejected.getCodeName().get(), TotalRejected);
		codesByName.put(OpeningAvailable.getCodeName().get(), OpeningAvailable);
		codesByName.put(InterimAvailable.getCodeName().get(), InterimAvailable);
		codesByName.put(ClosingAvailable.getCodeName().get(), ClosingAvailable);
		codesByName.put(ForwardAvailable.getCodeName().get(), ForwardAvailable);
		codesByName.put(ClosingBooked.getCodeName().get(), ClosingBooked);
		codesByName.put(InterimBooked.getCodeName().get(), InterimBooked);
		codesByName.put(OpeningBooked.getCodeName().get(), OpeningBooked);
		codesByName.put(PreviouslyClosedBooked.getCodeName().get(), PreviouslyClosedBooked);
		codesByName.put(InvestmentOpeningAvailable.getCodeName().get(), InvestmentOpeningAvailable);
		codesByName.put(InvestmentInterimAvailable.getCodeName().get(), InvestmentInterimAvailable);
		codesByName.put(InvestmentClosingAvailable.getCodeName().get(), InvestmentClosingAvailable);
		codesByName.put(InvestmentForwardAvailable.getCodeName().get(), InvestmentForwardAvailable);
		codesByName.put(InvestmentClosingBooked.getCodeName().get(), InvestmentClosingBooked);
		codesByName.put(InvestmentInterimBooked.getCodeName().get(), InvestmentInterimBooked);
		codesByName.put(InvestmentOpeningBooked.getCodeName().get(), InvestmentOpeningBooked);
		codesByName.put(InvestmentExpected.getCodeName().get(), InvestmentExpected);
		codesByName.put(DisbursementOpeningAvailable.getCodeName().get(), DisbursementOpeningAvailable);
		codesByName.put(DisbursementInterimAvailable.getCodeName().get(), DisbursementInterimAvailable);
		codesByName.put(DisbursementClosingAvailable.getCodeName().get(), DisbursementClosingAvailable);
		codesByName.put(DisbursementForwardAvailable.getCodeName().get(), DisbursementForwardAvailable);
		codesByName.put(DisbursementClosingBooked.getCodeName().get(), DisbursementClosingBooked);
		codesByName.put(DisbursementInterimBooked.getCodeName().get(), DisbursementInterimBooked);
		codesByName.put(DisbursementOpeningBooked.getCodeName().get(), DisbursementOpeningBooked);
		codesByName.put(DisbursementExpected.getCodeName().get(), DisbursementExpected);
		codesByName.put(CollectionOpeningAvailable.getCodeName().get(), CollectionOpeningAvailable);
		codesByName.put(CollectionInterimAvailable.getCodeName().get(), CollectionInterimAvailable);
		codesByName.put(CollectionClosingAvailable.getCodeName().get(), CollectionClosingAvailable);
		codesByName.put(CollectionForwardAvailable.getCodeName().get(), CollectionForwardAvailable);
		codesByName.put(CollectionClosingBooked.getCodeName().get(), CollectionClosingBooked);
		codesByName.put(CollectionInterimBooked.getCodeName().get(), CollectionInterimBooked);
		codesByName.put(CollectionOpeningBooked.getCodeName().get(), CollectionOpeningBooked);
		codesByName.put(CollectionExpected.getCodeName().get(), CollectionExpected);
		codesByName.put(FirmCollateralisation.getCodeName().get(), FirmCollateralisation);
		codesByName.put(UsedAmountsFirmCollateralisation.getCodeName().get(), UsedAmountsFirmCollateralisation);
		codesByName.put(SelfCollateralisation.getCodeName().get(), SelfCollateralisation);
		codesByName.put(UsedAmountsSelfCollateralisation.getCodeName().get(), UsedAmountsSelfCollateralisation);
		codesByName.put(CustodyActual.getCodeName().get(), CustodyActual);
		codesByName.put(CCPGuaranteedForecasting.getCodeName().get(), CCPGuaranteedForecasting);
		codesByName.put(NonCCPGuaranteedForecasting.getCodeName().get(), NonCCPGuaranteedForecasting);
		codesByName.put(DefinitiveSettledSecurities.getCodeName().get(), DefinitiveSettledSecurities);
		codesByName.put(LackOfHoldingsTransactions.getCodeName().get(), LackOfHoldingsTransactions);
		codesByName.put(NonSettledSecurities.getCodeName().get(), NonSettledSecurities);
		codesByName.put(CCPGuaranteedOTCTransactions.getCodeName().get(), CCPGuaranteedOTCTransactions);
		codesByName.put(ForecastOTCTransactions.getCodeName().get(), ForecastOTCTransactions);
		codesByName.put(NonCCPGuaranteedOTCTransactions.getCodeName().get(), NonCCPGuaranteedOTCTransactions);
		codesByName.put(SAPDirectDebitAmount.getCodeName().get(), SAPDirectDebitAmount);
		codesByName.put(SAPDirectCreditAmount.getCodeName().get(), SAPDirectCreditAmount);
		codesByName.put(CMUPRepoDebit.getCodeName().get(), CMUPRepoDebit);
		codesByName.put(CMUPRepoCredit.getCodeName().get(), CMUPRepoCredit);
		codesByName.put(BulkSettlementCMUPDebit.getCodeName().get(), BulkSettlementCMUPDebit);
		codesByName.put(BulkSettlementCMUPCredit.getCodeName().get(), BulkSettlementCMUPCredit);
		codesByName.put(SAPQueueAmount.getCodeName().get(), SAPQueueAmount);
		codesByName.put(IntradayRepoLimit.getCodeName().get(), IntradayRepoLimit);
		codesByName.put(IntradayRepoDrawings.getCodeName().get(), IntradayRepoDrawings);
		codesByName.put(DiscountWindowRepoDrawings.getCodeName().get(), DiscountWindowRepoDrawings);
		codesByName.put(AvailableDMVForDiscountWindowRepo.getCodeName().get(), AvailableDMVForDiscountWindowRepo);
		codesByName.put(AvailableDMVForIntradayRepo.getCodeName().get(), AvailableDMVForIntradayRepo);
		codesByName.put(Elected.getCodeName().get(), Elected);
		codesByName.put(ReservedForDistribution.getCodeName().get(), ReservedForDistribution);
		codesByName.put(ReservedForRemoval.getCodeName().get(), ReservedForRemoval);
		codesByName.put(Restricted.getCodeName().get(), Restricted);
		codesByName.put(TotalEntitled.getCodeName().get(), TotalEntitled);
		codesByName.put(Unelected.getCodeName().get(), Unelected);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static SystemBalanceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemBalanceTypeCode[] values() {
		SystemBalanceTypeCode[] values = new SystemBalanceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemBalanceTypeCode> {
		@Override
		public SystemBalanceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemBalanceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}