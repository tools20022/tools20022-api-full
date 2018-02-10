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
import com.tools20022.repository.codeset.SystemBalanceType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the nature of the balance within a system processing the
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Opening
 * SystemBalanceType2Code.Opening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Interim
 * SystemBalanceType2Code.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Closing
 * SystemBalanceType2Code.Closing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Book
 * SystemBalanceType2Code.Book}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Current
 * SystemBalanceType2Code.Current}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Pending
 * SystemBalanceType2Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#LimitRelated
 * SystemBalanceType2Code.LimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Available
 * SystemBalanceType2Code.Available}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#LiquidityTransfer
 * SystemBalanceType2Code.LiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Credit
 * SystemBalanceType2Code.Credit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#EligibleAssets
 * SystemBalanceType2Code.EligibleAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Payment
 * SystemBalanceType2Code.Payment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Blocked
 * SystemBalanceType2Code.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Expected
 * SystemBalanceType2Code.Expected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DaylightOverdraft
 * SystemBalanceType2Code.DaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ExpectedCredit
 * SystemBalanceType2Code.ExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ExpectedDebit
 * SystemBalanceType2Code.ExpectedDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Adjustment
 * SystemBalanceType2Code.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ProgressiveAverage
 * SystemBalanceType2Code.ProgressiveAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Debit
 * SystemBalanceType2Code.Debit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Threshold
 * SystemBalanceType2Code.Threshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Noted
 * SystemBalanceType2Code.Noted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ForecastSettlement
 * SystemBalanceType2Code.ForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#BlockedTrades
 * SystemBalanceType2Code.BlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#OtherBlockedTrades
 * SystemBalanceType2Code.OtherBlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#Custody
 * SystemBalanceType2Code.Custody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CashForecast
 * SystemBalanceType2Code.CashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DividendsCollection
 * SystemBalanceType2Code.DividendsCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#NetFunding
 * SystemBalanceType2Code.NetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#PayInPayOut
 * SystemBalanceType2Code.PayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ExchangeForecast
 * SystemBalanceType2Code.ExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CentralCounterparty
 * SystemBalanceType2Code.CentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#TotalOnHold
 * SystemBalanceType2Code.TotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CreditOnHold
 * SystemBalanceType2Code.CreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DebitOnHold
 * SystemBalanceType2Code.DebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#TotalProcessed
 * SystemBalanceType2Code.TotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CreditProcessed
 * SystemBalanceType2Code.CreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DebitProcessed
 * SystemBalanceType2Code.DebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#TotalFuture
 * SystemBalanceType2Code.TotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#TotalRejected
 * SystemBalanceType2Code.TotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#FirmCollateralisation
 * SystemBalanceType2Code.FirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#UsedAmountsFirmCollateralisation
 * SystemBalanceType2Code.UsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#SelfCollateralisation
 * SystemBalanceType2Code.SelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#UsedAmountsSelfCollateralisation
 * SystemBalanceType2Code.UsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CustodyActual
 * SystemBalanceType2Code.CustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CCPGuaranteedForecasting
 * SystemBalanceType2Code.CCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#NonCCPGuaranteedForecasting
 * SystemBalanceType2Code.NonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DefinitiveSettledSecurities
 * SystemBalanceType2Code.DefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#LackOfHoldingsTransactions
 * SystemBalanceType2Code.LackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#NonSettledSecurities
 * SystemBalanceType2Code.NonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CCPGuaranteedOTCTransactions
 * SystemBalanceType2Code.CCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#ForecastOTCTransactions
 * SystemBalanceType2Code.ForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#NonCCPGuaranteedOTCTransactions
 * SystemBalanceType2Code.NonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#SAPDirectDebitAmount
 * SystemBalanceType2Code.SAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#SAPDirectCreditAmount
 * SystemBalanceType2Code.SAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CMUPRepoDebit
 * SystemBalanceType2Code.CMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#CMUPRepoCredit
 * SystemBalanceType2Code.CMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#BulkSettlementCMUPDebit
 * SystemBalanceType2Code.BulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#BulkSettlementCMUPCredit
 * SystemBalanceType2Code.BulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#SAPQueueAmount
 * SystemBalanceType2Code.SAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#IntradayRepoLimit
 * SystemBalanceType2Code.IntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#IntradayRepoDrawings
 * SystemBalanceType2Code.IntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#DiscountWindowRepoDrawings
 * SystemBalanceType2Code.DiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#AvailableDMVForDiscountWindowRepo
 * SystemBalanceType2Code.AvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#AvailableDMVForIntradayRepo
 * SystemBalanceType2Code.AvailableDMVForIntradayRepo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
 * SystemBalanceTypeCode}</li>
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
 * "SystemBalanceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the nature of the balance within a system processing the transactions."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SystemBalanceType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Opening"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Opening = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Opening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Interim = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closing"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Closing = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Closing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Book"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Book = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Book.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Current"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Current = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Current.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Pending = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitRelated"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code LimitRelated = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.LimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Available"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Available = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Available.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityTransfer"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code LiquidityTransfer = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.LiquidityTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Credit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Credit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Credit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibleAssets"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code EligibleAssets = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleAssets";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.EligibleAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Payment = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Blocked = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Blocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expected"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Expected = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expected";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Expected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DaylightOverdraft"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DaylightOverdraft = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaylightOverdraft";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DaylightOverdraft.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedCredit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ExpectedCredit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ExpectedCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedDebit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ExpectedDebit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ExpectedDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Adjustment = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Adjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgressiveAverage"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ProgressiveAverage = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressiveAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ProgressiveAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Debit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Debit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Threshold"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Threshold = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Threshold";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Threshold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Noted"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Noted = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Noted";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Noted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastSettlement"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ForecastSettlement = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ForecastSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedTrades"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code BlockedTrades = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.BlockedTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBlockedTrades"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code OtherBlockedTrades = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBlockedTrades";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.OtherBlockedTrades.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Custody"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code Custody = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custody";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.Custody.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashForecast"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CashForecast = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecast";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CashForecast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendsCollection"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DividendsCollection = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsCollection";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DividendsCollection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetFunding"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code NetFunding = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetFunding";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.NetFunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInPayOut"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code PayInPayOut = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInPayOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.PayInPayOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeForecast"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ExchangeForecast = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForecast";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ExchangeForecast.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterparty"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CentralCounterparty = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CentralCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOnHold"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code TotalOnHold = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.TotalOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditOnHold"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CreditOnHold = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CreditOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitOnHold"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DebitOnHold = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DebitOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalProcessed"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code TotalProcessed = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.TotalProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditProcessed"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CreditProcessed = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CreditProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitProcessed"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DebitProcessed = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DebitProcessed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalFuture"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code TotalFuture = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFuture";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.TotalFuture.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalRejected"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code TotalRejected = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.TotalRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirmCollateralisation"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code FirmCollateralisation = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.FirmCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsFirmCollateralisation"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code UsedAmountsFirmCollateralisation = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.UsedAmountsFirmCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfCollateralisation"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code SelfCollateralisation = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.SelfCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsedAmountsSelfCollateralisation"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code UsedAmountsSelfCollateralisation = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.UsedAmountsSelfCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyActual"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CustodyActual = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyActual";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CustodyActual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedForecasting"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CCPGuaranteedForecasting = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedForecasting";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CCPGuaranteedForecasting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedForecasting"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code NonCCPGuaranteedForecasting = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.NonCCPGuaranteedForecasting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinitiveSettledSecurities"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DefinitiveSettledSecurities = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinitiveSettledSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DefinitiveSettledSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfHoldingsTransactions"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code LackOfHoldingsTransactions = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfHoldingsTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.LackOfHoldingsTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSettledSecurities"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code NonSettledSecurities = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSettledSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.NonSettledSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CCPGuaranteedOTCTransactions"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CCPGuaranteedOTCTransactions = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CCPGuaranteedOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForecastOTCTransactions"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code ForecastOTCTransactions = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.ForecastOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonCCPGuaranteedOTCTransactions"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code NonCCPGuaranteedOTCTransactions = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.NonCCPGuaranteedOTCTransactions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectDebitAmount"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code SAPDirectDebitAmount = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectDebitAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.SAPDirectDebitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPDirectCreditAmount"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code SAPDirectCreditAmount = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectCreditAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.SAPDirectCreditAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoDebit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CMUPRepoDebit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CMUPRepoDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CMUPRepoCredit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code CMUPRepoCredit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.CMUPRepoCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPDebit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code BulkSettlementCMUPDebit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPDebit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.BulkSettlementCMUPDebit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkSettlementCMUPCredit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code BulkSettlementCMUPCredit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.BulkSettlementCMUPCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SAPQueueAmount"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code SAPQueueAmount = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPQueueAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.SAPQueueAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoLimit"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code IntradayRepoLimit = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.IntradayRepoLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntradayRepoDrawings"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code IntradayRepoDrawings = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoDrawings";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.IntradayRepoDrawings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiscountWindowRepoDrawings"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code DiscountWindowRepoDrawings = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountWindowRepoDrawings";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.DiscountWindowRepoDrawings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForDiscountWindowRepo"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code AvailableDMVForDiscountWindowRepo = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.AvailableDMVForDiscountWindowRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code
	 * SystemBalanceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDMVForIntradayRepo"</li>
	 * </ul>
	 */
	public static final SystemBalanceType2Code AvailableDMVForIntradayRepo = new SystemBalanceType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SystemBalanceType2Code.mmObject();
			codeName = SystemBalanceTypeCode.AvailableDMVForIntradayRepo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SystemBalanceType2Code> codesByName = new LinkedHashMap<>();

	protected SystemBalanceType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPNG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SystemBalanceType2Code";
				definition = "Specifies the nature of the balance within a system processing the transactions.";
				trace_lazy = () -> SystemBalanceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemBalanceType2Code.Opening, com.tools20022.repository.codeset.SystemBalanceType2Code.Interim,
						com.tools20022.repository.codeset.SystemBalanceType2Code.Closing, com.tools20022.repository.codeset.SystemBalanceType2Code.Book, com.tools20022.repository.codeset.SystemBalanceType2Code.Current,
						com.tools20022.repository.codeset.SystemBalanceType2Code.Pending, com.tools20022.repository.codeset.SystemBalanceType2Code.LimitRelated, com.tools20022.repository.codeset.SystemBalanceType2Code.Available,
						com.tools20022.repository.codeset.SystemBalanceType2Code.LiquidityTransfer, com.tools20022.repository.codeset.SystemBalanceType2Code.Credit, com.tools20022.repository.codeset.SystemBalanceType2Code.EligibleAssets,
						com.tools20022.repository.codeset.SystemBalanceType2Code.Payment, com.tools20022.repository.codeset.SystemBalanceType2Code.Blocked, com.tools20022.repository.codeset.SystemBalanceType2Code.Expected,
						com.tools20022.repository.codeset.SystemBalanceType2Code.DaylightOverdraft, com.tools20022.repository.codeset.SystemBalanceType2Code.ExpectedCredit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.ExpectedDebit, com.tools20022.repository.codeset.SystemBalanceType2Code.Adjustment,
						com.tools20022.repository.codeset.SystemBalanceType2Code.ProgressiveAverage, com.tools20022.repository.codeset.SystemBalanceType2Code.Debit, com.tools20022.repository.codeset.SystemBalanceType2Code.Threshold,
						com.tools20022.repository.codeset.SystemBalanceType2Code.Noted, com.tools20022.repository.codeset.SystemBalanceType2Code.ForecastSettlement, com.tools20022.repository.codeset.SystemBalanceType2Code.BlockedTrades,
						com.tools20022.repository.codeset.SystemBalanceType2Code.OtherBlockedTrades, com.tools20022.repository.codeset.SystemBalanceType2Code.Custody, com.tools20022.repository.codeset.SystemBalanceType2Code.CashForecast,
						com.tools20022.repository.codeset.SystemBalanceType2Code.DividendsCollection, com.tools20022.repository.codeset.SystemBalanceType2Code.NetFunding,
						com.tools20022.repository.codeset.SystemBalanceType2Code.PayInPayOut, com.tools20022.repository.codeset.SystemBalanceType2Code.ExchangeForecast,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CentralCounterparty, com.tools20022.repository.codeset.SystemBalanceType2Code.TotalOnHold,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CreditOnHold, com.tools20022.repository.codeset.SystemBalanceType2Code.DebitOnHold, com.tools20022.repository.codeset.SystemBalanceType2Code.TotalProcessed,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CreditProcessed, com.tools20022.repository.codeset.SystemBalanceType2Code.DebitProcessed,
						com.tools20022.repository.codeset.SystemBalanceType2Code.TotalFuture, com.tools20022.repository.codeset.SystemBalanceType2Code.TotalRejected,
						com.tools20022.repository.codeset.SystemBalanceType2Code.FirmCollateralisation, com.tools20022.repository.codeset.SystemBalanceType2Code.UsedAmountsFirmCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceType2Code.SelfCollateralisation, com.tools20022.repository.codeset.SystemBalanceType2Code.UsedAmountsSelfCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CustodyActual, com.tools20022.repository.codeset.SystemBalanceType2Code.CCPGuaranteedForecasting,
						com.tools20022.repository.codeset.SystemBalanceType2Code.NonCCPGuaranteedForecasting, com.tools20022.repository.codeset.SystemBalanceType2Code.DefinitiveSettledSecurities,
						com.tools20022.repository.codeset.SystemBalanceType2Code.LackOfHoldingsTransactions, com.tools20022.repository.codeset.SystemBalanceType2Code.NonSettledSecurities,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.SystemBalanceType2Code.ForecastOTCTransactions,
						com.tools20022.repository.codeset.SystemBalanceType2Code.NonCCPGuaranteedOTCTransactions, com.tools20022.repository.codeset.SystemBalanceType2Code.SAPDirectDebitAmount,
						com.tools20022.repository.codeset.SystemBalanceType2Code.SAPDirectCreditAmount, com.tools20022.repository.codeset.SystemBalanceType2Code.CMUPRepoDebit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.CMUPRepoCredit, com.tools20022.repository.codeset.SystemBalanceType2Code.BulkSettlementCMUPDebit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.BulkSettlementCMUPCredit, com.tools20022.repository.codeset.SystemBalanceType2Code.SAPQueueAmount,
						com.tools20022.repository.codeset.SystemBalanceType2Code.IntradayRepoLimit, com.tools20022.repository.codeset.SystemBalanceType2Code.IntradayRepoDrawings,
						com.tools20022.repository.codeset.SystemBalanceType2Code.DiscountWindowRepoDrawings, com.tools20022.repository.codeset.SystemBalanceType2Code.AvailableDMVForDiscountWindowRepo,
						com.tools20022.repository.codeset.SystemBalanceType2Code.AvailableDMVForIntradayRepo);
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

	public static SystemBalanceType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SystemBalanceType2Code[] values() {
		SystemBalanceType2Code[] values = new SystemBalanceType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SystemBalanceType2Code> {
		@Override
		public SystemBalanceType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SystemBalanceType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}