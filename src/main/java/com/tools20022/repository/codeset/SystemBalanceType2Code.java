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
import com.tools20022.repository.codeset.SystemBalanceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the nature of the balance within a system processing the
 * transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceTypeCode
 * SystemBalanceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmOpening
 * SystemBalanceType2Code.mmOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmInterim
 * SystemBalanceType2Code.mmInterim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmClosing
 * SystemBalanceType2Code.mmClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmBook
 * SystemBalanceType2Code.mmBook}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCurrent
 * SystemBalanceType2Code.mmCurrent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmPending
 * SystemBalanceType2Code.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmLimitRelated
 * SystemBalanceType2Code.mmLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmAvailable
 * SystemBalanceType2Code.mmAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmLiquidityTransfer
 * SystemBalanceType2Code.mmLiquidityTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCredit
 * SystemBalanceType2Code.mmCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmEligibleAssets
 * SystemBalanceType2Code.mmEligibleAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmPayment
 * SystemBalanceType2Code.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmBlocked
 * SystemBalanceType2Code.mmBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmExpected
 * SystemBalanceType2Code.mmExpected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDaylightOverdraft
 * SystemBalanceType2Code.mmDaylightOverdraft}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmExpectedCredit
 * SystemBalanceType2Code.mmExpectedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmExpectedDebit
 * SystemBalanceType2Code.mmExpectedDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmAdjustment
 * SystemBalanceType2Code.mmAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmProgressiveAverage
 * SystemBalanceType2Code.mmProgressiveAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDebit
 * SystemBalanceType2Code.mmDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmThreshold
 * SystemBalanceType2Code.mmThreshold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmNoted
 * SystemBalanceType2Code.mmNoted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmForecastSettlement
 * SystemBalanceType2Code.mmForecastSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmBlockedTrades
 * SystemBalanceType2Code.mmBlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmOtherBlockedTrades
 * SystemBalanceType2Code.mmOtherBlockedTrades}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCustody
 * SystemBalanceType2Code.mmCustody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCashForecast
 * SystemBalanceType2Code.mmCashForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDividendsCollection
 * SystemBalanceType2Code.mmDividendsCollection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmNetFunding
 * SystemBalanceType2Code.mmNetFunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmPayInPayOut
 * SystemBalanceType2Code.mmPayInPayOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmExchangeForecast
 * SystemBalanceType2Code.mmExchangeForecast}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCentralCounterparty
 * SystemBalanceType2Code.mmCentralCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmTotalOnHold
 * SystemBalanceType2Code.mmTotalOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCreditOnHold
 * SystemBalanceType2Code.mmCreditOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDebitOnHold
 * SystemBalanceType2Code.mmDebitOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmTotalProcessed
 * SystemBalanceType2Code.mmTotalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCreditProcessed
 * SystemBalanceType2Code.mmCreditProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDebitProcessed
 * SystemBalanceType2Code.mmDebitProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmTotalFuture
 * SystemBalanceType2Code.mmTotalFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmTotalRejected
 * SystemBalanceType2Code.mmTotalRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmFirmCollateralisation
 * SystemBalanceType2Code.mmFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmUsedAmountsFirmCollateralisation
 * SystemBalanceType2Code.mmUsedAmountsFirmCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmSelfCollateralisation
 * SystemBalanceType2Code.mmSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmUsedAmountsSelfCollateralisation
 * SystemBalanceType2Code.mmUsedAmountsSelfCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCustodyActual
 * SystemBalanceType2Code.mmCustodyActual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCCPGuaranteedForecasting
 * SystemBalanceType2Code.mmCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmNonCCPGuaranteedForecasting
 * SystemBalanceType2Code.mmNonCCPGuaranteedForecasting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDefinitiveSettledSecurities
 * SystemBalanceType2Code.mmDefinitiveSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmLackOfHoldingsTransactions
 * SystemBalanceType2Code.mmLackOfHoldingsTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmNonSettledSecurities
 * SystemBalanceType2Code.mmNonSettledSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCCPGuaranteedOTCTransactions
 * SystemBalanceType2Code.mmCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmForecastOTCTransactions
 * SystemBalanceType2Code.mmForecastOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmNonCCPGuaranteedOTCTransactions
 * SystemBalanceType2Code.mmNonCCPGuaranteedOTCTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmSAPDirectDebitAmount
 * SystemBalanceType2Code.mmSAPDirectDebitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmSAPDirectCreditAmount
 * SystemBalanceType2Code.mmSAPDirectCreditAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCMUPRepoDebit
 * SystemBalanceType2Code.mmCMUPRepoDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmCMUPRepoCredit
 * SystemBalanceType2Code.mmCMUPRepoCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmBulkSettlementCMUPDebit
 * SystemBalanceType2Code.mmBulkSettlementCMUPDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmBulkSettlementCMUPCredit
 * SystemBalanceType2Code.mmBulkSettlementCMUPCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmSAPQueueAmount
 * SystemBalanceType2Code.mmSAPQueueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmIntradayRepoLimit
 * SystemBalanceType2Code.mmIntradayRepoLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmIntradayRepoDrawings
 * SystemBalanceType2Code.mmIntradayRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmDiscountWindowRepoDrawings
 * SystemBalanceType2Code.mmDiscountWindowRepoDrawings}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmAvailableDMVForDiscountWindowRepo
 * SystemBalanceType2Code.mmAvailableDMVForDiscountWindowRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SystemBalanceType2Code#mmAvailableDMVForIntradayRepo
 * SystemBalanceType2Code.mmAvailableDMVForIntradayRepo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class SystemBalanceType2Code extends SystemBalanceTypeCode {

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
	public static final MMCode mmOpening = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Opening";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmInterim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmClosing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closing";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmBook = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Book";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCurrent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Current";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmLimitRelated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitRelated";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Available";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmLiquidityTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityTransfer";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Credit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmEligibleAssets = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibleAssets";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmBlocked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Blocked";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmExpected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expected";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDaylightOverdraft = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DaylightOverdraft";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmExpectedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedCredit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmExpectedDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedDebit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmProgressiveAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgressiveAverage";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmThreshold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Threshold";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmNoted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Noted";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmForecastSettlement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastSettlement";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmBlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedTrades";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmOtherBlockedTrades = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBlockedTrades";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCustody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Custody";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCashForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashForecast";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDividendsCollection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendsCollection";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmNetFunding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetFunding";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmPayInPayOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInPayOut";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmExchangeForecast = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeForecast";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCentralCounterparty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterparty";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmTotalOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOnHold";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCreditOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditOnHold";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDebitOnHold = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitOnHold";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmTotalProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalProcessed";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCreditProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditProcessed";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDebitProcessed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitProcessed";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmTotalFuture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalFuture";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmTotalRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalRejected";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmFirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirmCollateralisation";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmUsedAmountsFirmCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsFirmCollateralisation";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmSelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfCollateralisation";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmUsedAmountsSelfCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsedAmountsSelfCollateralisation";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCustodyActual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyActual";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedForecasting";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmNonCCPGuaranteedForecasting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedForecasting";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDefinitiveSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinitiveSettledSecurities";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmLackOfHoldingsTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfHoldingsTransactions";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmNonSettledSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSettledSecurities";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CCPGuaranteedOTCTransactions";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmForecastOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForecastOTCTransactions";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmNonCCPGuaranteedOTCTransactions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonCCPGuaranteedOTCTransactions";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmSAPDirectDebitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectDebitAmount";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmSAPDirectCreditAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPDirectCreditAmount";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCMUPRepoDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoDebit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmCMUPRepoCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CMUPRepoCredit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmBulkSettlementCMUPDebit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPDebit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmBulkSettlementCMUPCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkSettlementCMUPCredit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmSAPQueueAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SAPQueueAmount";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmIntradayRepoLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoLimit";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmIntradayRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntradayRepoDrawings";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmDiscountWindowRepoDrawings = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiscountWindowRepoDrawings";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmAvailableDMVForDiscountWindowRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForDiscountWindowRepo";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
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
	public static final MMCode mmAvailableDMVForIntradayRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDMVForIntradayRepo";
			owner_lazy = () -> SystemBalanceType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("OPNG");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SystemBalanceType2Code";
				definition = "Specifies the nature of the balance within a system processing the transactions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SystemBalanceType2Code.mmOpening, com.tools20022.repository.codeset.SystemBalanceType2Code.mmInterim,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmClosing, com.tools20022.repository.codeset.SystemBalanceType2Code.mmBook, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCurrent,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmPending, com.tools20022.repository.codeset.SystemBalanceType2Code.mmLimitRelated, com.tools20022.repository.codeset.SystemBalanceType2Code.mmAvailable,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmLiquidityTransfer, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCredit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmEligibleAssets, com.tools20022.repository.codeset.SystemBalanceType2Code.mmPayment, com.tools20022.repository.codeset.SystemBalanceType2Code.mmBlocked,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmExpected, com.tools20022.repository.codeset.SystemBalanceType2Code.mmDaylightOverdraft,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmExpectedCredit, com.tools20022.repository.codeset.SystemBalanceType2Code.mmExpectedDebit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmAdjustment, com.tools20022.repository.codeset.SystemBalanceType2Code.mmProgressiveAverage, com.tools20022.repository.codeset.SystemBalanceType2Code.mmDebit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmThreshold, com.tools20022.repository.codeset.SystemBalanceType2Code.mmNoted, com.tools20022.repository.codeset.SystemBalanceType2Code.mmForecastSettlement,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmBlockedTrades, com.tools20022.repository.codeset.SystemBalanceType2Code.mmOtherBlockedTrades,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmCustody, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCashForecast,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmDividendsCollection, com.tools20022.repository.codeset.SystemBalanceType2Code.mmNetFunding,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmPayInPayOut, com.tools20022.repository.codeset.SystemBalanceType2Code.mmExchangeForecast,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmCentralCounterparty, com.tools20022.repository.codeset.SystemBalanceType2Code.mmTotalOnHold,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmCreditOnHold, com.tools20022.repository.codeset.SystemBalanceType2Code.mmDebitOnHold,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmTotalProcessed, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCreditProcessed,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmDebitProcessed, com.tools20022.repository.codeset.SystemBalanceType2Code.mmTotalFuture,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmTotalRejected, com.tools20022.repository.codeset.SystemBalanceType2Code.mmFirmCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmUsedAmountsFirmCollateralisation, com.tools20022.repository.codeset.SystemBalanceType2Code.mmSelfCollateralisation,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmUsedAmountsSelfCollateralisation, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCustodyActual,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmCCPGuaranteedForecasting, com.tools20022.repository.codeset.SystemBalanceType2Code.mmNonCCPGuaranteedForecasting,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmDefinitiveSettledSecurities, com.tools20022.repository.codeset.SystemBalanceType2Code.mmLackOfHoldingsTransactions,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmNonSettledSecurities, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCCPGuaranteedOTCTransactions,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmForecastOTCTransactions, com.tools20022.repository.codeset.SystemBalanceType2Code.mmNonCCPGuaranteedOTCTransactions,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmSAPDirectDebitAmount, com.tools20022.repository.codeset.SystemBalanceType2Code.mmSAPDirectCreditAmount,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmCMUPRepoDebit, com.tools20022.repository.codeset.SystemBalanceType2Code.mmCMUPRepoCredit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmBulkSettlementCMUPDebit, com.tools20022.repository.codeset.SystemBalanceType2Code.mmBulkSettlementCMUPCredit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmSAPQueueAmount, com.tools20022.repository.codeset.SystemBalanceType2Code.mmIntradayRepoLimit,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmIntradayRepoDrawings, com.tools20022.repository.codeset.SystemBalanceType2Code.mmDiscountWindowRepoDrawings,
						com.tools20022.repository.codeset.SystemBalanceType2Code.mmAvailableDMVForDiscountWindowRepo, com.tools20022.repository.codeset.SystemBalanceType2Code.mmAvailableDMVForIntradayRepo);
				trace_lazy = () -> SystemBalanceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}