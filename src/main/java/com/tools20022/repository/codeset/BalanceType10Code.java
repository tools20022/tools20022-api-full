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
import com.tools20022.repository.codeset.BalanceType10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the balance, eg, opening balance.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Opening
 * BalanceType10Code.Opening}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Interim
 * BalanceType10Code.Interim}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Closing
 * BalanceType10Code.Closing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Book
 * BalanceType10Code.Book}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Current
 * BalanceType10Code.Current}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Pending
 * BalanceType10Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#LimitRelated
 * BalanceType10Code.LimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#Available
 * BalanceType10Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#LiquidityTransfer
 * BalanceType10Code.LiquidityTransfer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Credit
 * BalanceType10Code.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#EligibleAssets
 * BalanceType10Code.EligibleAssets}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Payment
 * BalanceType10Code.Payment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Blocked
 * BalanceType10Code.Blocked}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Expected
 * BalanceType10Code.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DaylightOverdraft
 * BalanceType10Code.DaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ExpectedCredit
 * BalanceType10Code.ExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ExpectedDebit
 * BalanceType10Code.ExpectedDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#Adjustment
 * BalanceType10Code.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ProgressiveAverage
 * BalanceType10Code.ProgressiveAverage}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Debit
 * BalanceType10Code.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#Threshold
 * BalanceType10Code.Threshold}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Noted
 * BalanceType10Code.Noted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Self
 * BalanceType10Code.Self}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Master
 * BalanceType10Code.Master}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ForecastSettlement
 * BalanceType10Code.ForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#BlockedTrades
 * BalanceType10Code.BlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#OtherBlockedTrades
 * BalanceType10Code.OtherBlockedTrades}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BalanceType10Code#Custody
 * BalanceType10Code.Custody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CashForecast
 * BalanceType10Code.CashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DividendsCollection
 * BalanceType10Code.DividendsCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#NetFunding
 * BalanceType10Code.NetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#PayInPayOut
 * BalanceType10Code.PayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ExchangeForecast
 * BalanceType10Code.ExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CentralCounterparty
 * BalanceType10Code.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#TotalOnHold
 * BalanceType10Code.TotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CreditOnHold
 * BalanceType10Code.CreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DebitOnHold
 * BalanceType10Code.DebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#TotalProcessed
 * BalanceType10Code.TotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CreditProcessed
 * BalanceType10Code.CreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DebitProcessed
 * BalanceType10Code.DebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#TotalFuture
 * BalanceType10Code.TotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#TotalRejected
 * BalanceType10Code.TotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#FirmCollateralisation
 * BalanceType10Code.FirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#UsedAmountsFirmCollateralisation
 * BalanceType10Code.UsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#SelfCollateralisation
 * BalanceType10Code.SelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#UsedAmountsSelfCollateralisation
 * BalanceType10Code.UsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CustodyActual
 * BalanceType10Code.CustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CCPGuaranteedForecasting
 * BalanceType10Code.CCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#NonCCPGuaranteedForecasting
 * BalanceType10Code.NonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DefinitiveSettledSecurities
 * BalanceType10Code.DefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#LackOfHoldingsTransactions
 * BalanceType10Code.LackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#NonSettledSecurities
 * BalanceType10Code.NonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CCPGuaranteedOTCTransactions
 * BalanceType10Code.CCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#ForecastOTCTransactions
 * BalanceType10Code.ForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#NonCCPGuaranteedOTCTransactions
 * BalanceType10Code.NonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#SAPDirectDebitAmount
 * BalanceType10Code.SAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#SAPDirectCreditAmount
 * BalanceType10Code.SAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CMUPRepoDebit
 * BalanceType10Code.CMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#CMUPRepoCredit
 * BalanceType10Code.CMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#BulkSettlementCMUPDebit
 * BalanceType10Code.BulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#BulkSettlementCMUPCredit
 * BalanceType10Code.BulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#SAPQueueAmount
 * BalanceType10Code.SAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#IntradayRepoLimit
 * BalanceType10Code.IntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#IntradayRepoDrawings
 * BalanceType10Code.IntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#DiscountWindowRepoDrawings
 * BalanceType10Code.DiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#AvailableDMVForDiscountWindowRepo
 * BalanceType10Code.AvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code#AvailableDMVForIntradayRepo
 * BalanceType10Code.AvailableDMVForIntradayRepo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BalanceTypeCode
 * BalanceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BalanceType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the nature of the balance, eg, opening balance."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BalanceType10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Opening = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Opening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Interim = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Closing = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Closing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Book = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Book.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Current = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Pending = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitRelated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code LimitRelated = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.LimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Available = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Available.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code LiquidityTransfer = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.LiquidityTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Credit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code EligibleAssets = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleAssets";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.EligibleAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Payment = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Blocked = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Expected = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Expected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaylightOverdraft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DaylightOverdraft = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaylightOverdraft";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DaylightOverdraft.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ExpectedCredit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ExpectedCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ExpectedDebit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ExpectedDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Adjustment = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Adjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressiveAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ProgressiveAverage = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressiveAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ProgressiveAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Debit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Debit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Threshold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Threshold = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Threshold";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Threshold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Noted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Noted = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Noted";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Noted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Self"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Self = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Self";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Self.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Master"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Master = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Master";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Master.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ForecastSettlement = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ForecastSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code BlockedTrades = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.BlockedTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBlockedTrades"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code OtherBlockedTrades = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBlockedTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.OtherBlockedTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code Custody = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custody";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.Custody.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CashForecast = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecast";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CashForecast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsCollection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DividendsCollection = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsCollection";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DividendsCollection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetFunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code NetFunding = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetFunding";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.NetFunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInPayOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code PayInPayOut = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInPayOut";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.PayInPayOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForecast"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ExchangeForecast = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForecast";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ExchangeForecast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CentralCounterparty = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CentralCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code TotalOnHold = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.TotalOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CreditOnHold = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CreditOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitOnHold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DebitOnHold = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DebitOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code TotalProcessed = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.TotalProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CreditProcessed = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CreditProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DebitProcessed = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DebitProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code TotalFuture = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFuture";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.TotalFuture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code TotalRejected = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.TotalRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code FirmCollateralisation = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.FirmCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsFirmCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code UsedAmountsFirmCollateralisation = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.UsedAmountsFirmCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code SelfCollateralisation = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.SelfCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsSelfCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code UsedAmountsSelfCollateralisation = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.UsedAmountsSelfCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyActual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CustodyActual = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyActual";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CustodyActual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CCPGuaranteedForecasting = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedForecasting";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CCPGuaranteedForecasting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedForecasting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code NonCCPGuaranteedForecasting = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.NonCCPGuaranteedForecasting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinitiveSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DefinitiveSettledSecurities = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinitiveSettledSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DefinitiveSettledSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfHoldingsTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code LackOfHoldingsTransactions = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfHoldingsTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.LackOfHoldingsTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSettledSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code NonSettledSecurities = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSettledSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.NonSettledSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CCPGuaranteedOTCTransactions = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CCPGuaranteedOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code ForecastOTCTransactions = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.ForecastOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedOTCTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code NonCCPGuaranteedOTCTransactions = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.NonCCPGuaranteedOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectDebitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code SAPDirectDebitAmount = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectDebitAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.SAPDirectDebitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectCreditAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code SAPDirectCreditAmount = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectCreditAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.SAPDirectCreditAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CMUPRepoDebit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CMUPRepoDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code CMUPRepoCredit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.CMUPRepoCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code BulkSettlementCMUPDebit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.BulkSettlementCMUPDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code BulkSettlementCMUPCredit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.BulkSettlementCMUPCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPQueueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code SAPQueueAmount = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPQueueAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.SAPQueueAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code IntradayRepoLimit = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.IntradayRepoLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code IntradayRepoDrawings = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoDrawings";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.IntradayRepoDrawings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountWindowRepoDrawings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code DiscountWindowRepoDrawings = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountWindowRepoDrawings";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.DiscountWindowRepoDrawings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForDiscountWindowRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code AvailableDMVForDiscountWindowRepo = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.AvailableDMVForDiscountWindowRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceType10Code
	 * BalanceType10Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForIntradayRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BalanceType10Code AvailableDMVForIntradayRepo = new BalanceType10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.BalanceType10Code.mmObject();
			codeName = BalanceTypeCode.AvailableDMVForIntradayRepo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BalanceType10Code> codesByName = new LinkedHashMap<>();

	protected BalanceType10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BalanceType10Code";
				definition = "Specifies the nature of the balance, eg, opening balance.";
				trace_lazy = () -> BalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BalanceType10Code.Opening, com.tools20022.repository.codeset.BalanceType10Code.Interim, com.tools20022.repository.codeset.BalanceType10Code.Closing,
						com.tools20022.repository.codeset.BalanceType10Code.Book, com.tools20022.repository.codeset.BalanceType10Code.Current, com.tools20022.repository.codeset.BalanceType10Code.Pending,
						com.tools20022.repository.codeset.BalanceType10Code.LimitRelated, com.tools20022.repository.codeset.BalanceType10Code.Available, com.tools20022.repository.codeset.BalanceType10Code.LiquidityTransfer,
						com.tools20022.repository.codeset.BalanceType10Code.Credit, com.tools20022.repository.codeset.BalanceType10Code.EligibleAssets, com.tools20022.repository.codeset.BalanceType10Code.Payment,
						com.tools20022.repository.codeset.BalanceType10Code.Blocked, com.tools20022.repository.codeset.BalanceType10Code.Expected, com.tools20022.repository.codeset.BalanceType10Code.DaylightOverdraft,
						com.tools20022.repository.codeset.BalanceType10Code.ExpectedCredit, com.tools20022.repository.codeset.BalanceType10Code.ExpectedDebit, com.tools20022.repository.codeset.BalanceType10Code.Adjustment,
						com.tools20022.repository.codeset.BalanceType10Code.ProgressiveAverage, com.tools20022.repository.codeset.BalanceType10Code.Debit, com.tools20022.repository.codeset.BalanceType10Code.Threshold,
						com.tools20022.repository.codeset.BalanceType10Code.Noted, com.tools20022.repository.codeset.BalanceType10Code.Self, com.tools20022.repository.codeset.BalanceType10Code.Master,
						com.tools20022.repository.codeset.BalanceType10Code.ForecastSettlement, com.tools20022.repository.codeset.BalanceType10Code.BlockedTrades, com.tools20022.repository.codeset.BalanceType10Code.OtherBlockedTrades,
						com.tools20022.repository.codeset.BalanceType10Code.Custody, com.tools20022.repository.codeset.BalanceType10Code.CashForecast, com.tools20022.repository.codeset.BalanceType10Code.DividendsCollection,
						com.tools20022.repository.codeset.BalanceType10Code.NetFunding, com.tools20022.repository.codeset.BalanceType10Code.PayInPayOut, com.tools20022.repository.codeset.BalanceType10Code.ExchangeForecast,
						com.tools20022.repository.codeset.BalanceType10Code.CentralCounterparty, com.tools20022.repository.codeset.BalanceType10Code.TotalOnHold, com.tools20022.repository.codeset.BalanceType10Code.CreditOnHold,
						com.tools20022.repository.codeset.BalanceType10Code.DebitOnHold, com.tools20022.repository.codeset.BalanceType10Code.TotalProcessed, com.tools20022.repository.codeset.BalanceType10Code.CreditProcessed,
						com.tools20022.repository.codeset.BalanceType10Code.DebitProcessed, com.tools20022.repository.codeset.BalanceType10Code.TotalFuture, com.tools20022.repository.codeset.BalanceType10Code.TotalRejected,
						com.tools20022.repository.codeset.BalanceType10Code.FirmCollateralisation, com.tools20022.repository.codeset.BalanceType10Code.UsedAmountsFirmCollateralisation,
						com.tools20022.repository.codeset.BalanceType10Code.SelfCollateralisation, com.tools20022.repository.codeset.BalanceType10Code.UsedAmountsSelfCollateralisation,
						com.tools20022.repository.codeset.BalanceType10Code.CustodyActual, com.tools20022.repository.codeset.BalanceType10Code.CCPGuaranteedForecasting,
						com.tools20022.repository.codeset.BalanceType10Code.NonCCPGuaranteedForecasting, com.tools20022.repository.codeset.BalanceType10Code.DefinitiveSettledSecurities,
						com.tools20022.repository.codeset.BalanceType10Code.LackOfHoldingsTransactions, com.tools20022.repository.codeset.BalanceType10Code.NonSettledSecurities,
						com.tools20022.repository.codeset.BalanceType10Code.CCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceType10Code.ForecastOTCTransactions,
						com.tools20022.repository.codeset.BalanceType10Code.NonCCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.BalanceType10Code.SAPDirectDebitAmount,
						com.tools20022.repository.codeset.BalanceType10Code.SAPDirectCreditAmount, com.tools20022.repository.codeset.BalanceType10Code.CMUPRepoDebit, com.tools20022.repository.codeset.BalanceType10Code.CMUPRepoCredit,
						com.tools20022.repository.codeset.BalanceType10Code.BulkSettlementCMUPDebit, com.tools20022.repository.codeset.BalanceType10Code.BulkSettlementCMUPCredit,
						com.tools20022.repository.codeset.BalanceType10Code.SAPQueueAmount, com.tools20022.repository.codeset.BalanceType10Code.IntradayRepoLimit, com.tools20022.repository.codeset.BalanceType10Code.IntradayRepoDrawings,
						com.tools20022.repository.codeset.BalanceType10Code.DiscountWindowRepoDrawings, com.tools20022.repository.codeset.BalanceType10Code.AvailableDMVForDiscountWindowRepo,
						com.tools20022.repository.codeset.BalanceType10Code.AvailableDMVForIntradayRepo);
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
	}

	public static BalanceType10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BalanceType10Code[] values() {
		BalanceType10Code[] values = new BalanceType10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BalanceType10Code> {
		@Override
		public BalanceType10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BalanceType10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}