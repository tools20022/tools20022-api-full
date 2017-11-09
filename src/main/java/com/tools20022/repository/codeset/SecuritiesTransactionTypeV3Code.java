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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies underlying information regarding the type of settlement
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
 * SettlementTransactionType7Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType15Code
 * SecuritiesTransactionType15Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBuySellBack
 * SecuritiesTransactionTypeV3Code.mmBuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBuyIn
 * SecuritiesTransactionTypeV3Code.mmBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCentralBankCollateralOperation
 * SecuritiesTransactionTypeV3Code.mmCentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCollateralIn
 * SecuritiesTransactionTypeV3Code.mmCollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCollateralOut
 * SecuritiesTransactionTypeV3Code.mmCollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmDepositoryReceiptConversion
 * SecuritiesTransactionTypeV3Code.mmDepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmFactorUpdate
 * SecuritiesTransactionTypeV3Code.mmFactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmMoveOfStock
 * SecuritiesTransactionTypeV3Code.mmMoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmIssuance
 * SecuritiesTransactionTypeV3Code.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmMarkDown
 * SecuritiesTransactionTypeV3Code.mmMarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmMarkUp
 * SecuritiesTransactionTypeV3Code.mmMarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmNetting
 * SecuritiesTransactionTypeV3Code.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmNonSyndicated
 * SecuritiesTransactionTypeV3Code.mmNonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmExternalAccountTransfer
 * SecuritiesTransactionTypeV3Code.mmExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmInternalAccountTransfer
 * SecuritiesTransactionTypeV3Code.mmInternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmPairOff
 * SecuritiesTransactionTypeV3Code.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmPlacement
 * SecuritiesTransactionTypeV3Code.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmPortfolioMove
 * SecuritiesTransactionTypeV3Code.mmPortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmRealignment
 * SecuritiesTransactionTypeV3Code.mmRealignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmWithdrawal
 * SecuritiesTransactionTypeV3Code.mmWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmRedemption
 * SecuritiesTransactionTypeV3Code.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmDepositoryReceiptReleaseCancellation
 * SecuritiesTransactionTypeV3Code.mmDepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmRepo
 * SecuritiesTransactionTypeV3Code.mmRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmReturnDeliveryWithoutMatching
 * SecuritiesTransactionTypeV3Code.mmReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmReporting
 * SecuritiesTransactionTypeV3Code.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmReverseRepurchaseAgreement
 * SecuritiesTransactionTypeV3Code.mmReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSellBuyBack
 * SecuritiesTransactionTypeV3Code.mmSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBorrowingReallocation
 * SecuritiesTransactionTypeV3Code.mmBorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSecuritiesBorrowing
 * SecuritiesTransactionTypeV3Code.mmSecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSecuritiesLending
 * SecuritiesTransactionTypeV3Code.mmSecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmLendingReallocation
 * SecuritiesTransactionTypeV3Code.mmLendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSubscription
 * SecuritiesTransactionTypeV3Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSyndicateUnderwriters
 * SecuritiesTransactionTypeV3Code.mmSyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmTBAClosing
 * SecuritiesTransactionTypeV3Code.mmTBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmTrade
 * SecuritiesTransactionTypeV3Code.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmTripartyRepo
 * SecuritiesTransactionTypeV3Code.mmTripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmTripartyReverseRepo
 * SecuritiesTransactionTypeV3Code.mmTripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmTurnaround
 * SecuritiesTransactionTypeV3Code.mmTurnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmPreAdvice
 * SecuritiesTransactionTypeV3Code.mmPreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmAutoCollateralisation
 * SecuritiesTransactionTypeV3Code.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmMarketClaim
 * SecuritiesTransactionTypeV3Code.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCorporateAction
 * SecuritiesTransactionTypeV3Code.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBuy
 * SecuritiesTransactionTypeV3Code.mmBuy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSell
 * SecuritiesTransactionTypeV3Code.mmSell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmInitialPublicOffer
 * SecuritiesTransactionTypeV3Code.mmInitialPublicOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmReinvestmentOfDividend
 * SecuritiesTransactionTypeV3Code.mmReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCrossFrom
 * SecuritiesTransactionTypeV3Code.mmCrossFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmCrossTo
 * SecuritiesTransactionTypeV3Code.mmCrossTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSwitchFrom
 * SecuritiesTransactionTypeV3Code.mmSwitchFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmSwitchTo
 * SecuritiesTransactionTypeV3Code.mmSwitchTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBasket
 * SecuritiesTransactionTypeV3Code.mmBasket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmGuaranteedClose
 * SecuritiesTransactionTypeV3Code.mmGuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmProgram
 * SecuritiesTransactionTypeV3Code.mmProgram}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmEmployeeTradeReporting
 * SecuritiesTransactionTypeV3Code.mmEmployeeTradeReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmAgency
 * SecuritiesTransactionTypeV3Code.mmAgency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmBrokerToBroker
 * SecuritiesTransactionTypeV3Code.mmBrokerToBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmPreAllocation
 * SecuritiesTransactionTypeV3Code.mmPreAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmFundToFund
 * SecuritiesTransactionTypeV3Code.mmFundToFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmList
 * SecuritiesTransactionTypeV3Code.mmList}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmIndex
 * SecuritiesTransactionTypeV3Code.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmVWAPGuarantee
 * SecuritiesTransactionTypeV3Code.mmVWAPGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmRiskTrade
 * SecuritiesTransactionTypeV3Code.mmRiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#mmOfferingIssuingTrade
 * SecuritiesTransactionTypeV3Code.mmOfferingIssuingTrade}</li>
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
 * <li>"BSBK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionTypeV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTransactionTypeV3Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a buy sell back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a buy sell back transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmBuySellBack = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BSBK";
		}
	};
	/**
	 * Transaction relates to a buy-in by the market following a delivery
	 * transaction failure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction relates to a buy-in by the market following a delivery transaction failure."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBuyIn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BIYI";
		}
	};
	/**
	 * Relates to a collateral delivery/receipt to a national central bank for
	 * central bank credit operations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCentralBankCollateralOperation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CNCB";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral taker or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral transaction, from the point of view of the collateral taker or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralIn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "COLI";
		}
	};
	/**
	 * Relates to a collateral transaction, from the point of view of the
	 * collateral giver or its agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a collateral transaction, from the point of view of the collateral giver or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCollateralOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Relates to a depository receipt conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a depository receipt conversion."</li>
	 * </ul>
	 */
	public static final MMCode mmDepositoryReceiptConversion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Relates to a factor update.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a factor update."</li>
	 * </ul>
	 */
	public static final MMCode mmFactorUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "FCTA";
		}
	};
	/**
	 * Relates to a movement of shares into or out of a pooled account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a movement of shares into or out of a pooled account."</li>
	 * </ul>
	 */
	public static final MMCode mmMoveOfStock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Relates to the issuance of a security such as an equity or a depositary
	 * receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issuance of a security such as an equity or a depositary receipt."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Relates to the decrease of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corp. event realigned).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarkDown = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "MKDW";
		}
	};
	/**
	 * Relates to the increase of positions held by an International Central
	 * Securities Depository (ICSD) at the common depository due to custody
	 * operations (repurchase, pre-release, proceed of corporate event
	 * realigned).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMarkUp = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the netting of settlement instructions."</li>
	 * </ul>
	 */
	public static final MMCode mmNetting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Relates to the issue of medium and short term paper (CP, CD, MTN, notes
	 * ...) under a program and without syndication arrangement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSYN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonSyndicated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "NSYN";
		}
	};
	/**
	 * Relates to an account transfer involving more than one instructing party
	 * (messages sender) and/or account servicer (messages receiver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExternalAccountTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "OWNE";
		}
	};
	/**
	 * Relates to an account transfer involving one instructing party (messages
	 * sender) at one account servicer (messages receiver).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInternalAccountTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "OWNI";
		}
	};
	/**
	 * Relates to a pair-off: the transaction is paired off and netted against
	 * one or more previous transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPairOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Relates to the placement/new issue of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the placement/new issue of a financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmPlacement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Relates to a portfolio move from one investment manager to another and/or
	 * from an account servicer to another. It is generally charged differently
	 * than another account transfer, hence the need to identify this type of
	 * transfer as such.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPortfolioMove = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PORT";
		}
	};
	/**
	 * Relates to a realignment of positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a realignment of positions."</li>
	 * </ul>
	 */
	public static final MMCode mmRealignment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "REAL";
		}
	};
	/**
	 * Relates to the withdrawal of specified amounts from specified
	 * subaccounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the withdrawal of specified amounts from specified subaccounts."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "REDI";
		}
	};
	/**
	 * Relates to a redemption of funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a redemption of funds (funds industry only)."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Relates to a release (into/from local) of depository receipt operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RELE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a release (into/from local) of depository receipt operation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositoryReceiptReleaseCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "RELE";
		}
	};
	/**
	 * Relates to a repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "REPU";
		}
	};
	/**
	 * Relates to the return of financial instruments resulting from a rejected
	 * delivery without matching operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the return of financial instruments resulting from a rejected delivery without matching operation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReturnDeliveryWithoutMatching = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a transaction that is for reporting purposes only."</li>
	 * </ul>
	 */
	public static final MMCode mmReporting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Relates to a reverse repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a reverse repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmReverseRepurchaseAgreement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * Relates to a sell buy back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a sell buy back transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmSellBuyBack = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SBBK";
		}
	};
	/**
	 * Internal reallocation of a borrowed holding from one safekeeping account
	 * to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal reallocation of a borrowed holding from one safekeeping account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBorrowingReallocation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SBRE";
		}
	};
	/**
	 * Relates to a securities borrowing operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities borrowing operation."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesBorrowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SECB";
		}
	};
	/**
	 * Relates to a securities lending operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities lending operation."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesLending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SECL";
		}
	};
	/**
	 * Internal reallocation of a holding on loan from one safekeeping account
	 * to another.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Internal reallocation of a holding on loan from one safekeeping account to another."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLendingReallocation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SLRE";
		}
	};
	/**
	 * Relates to a subscription to funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a subscription to funds (funds industry only)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSubscription = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Relates to the issue of financial instruments through a syndicate of
	 * underwriters and a lead manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSyndicateUnderwriters = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SYND";
		}
	};
	/**
	 * Relates to a To Be Announced (TBA) closing trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a To Be Announced (TBA) closing trade."</li>
	 * </ul>
	 */
	public static final MMCode mmTBAClosing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "TBAC";
		}
	};
	/**
	 * Relates to the settlement of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the settlement of a trade."</li>
	 * </ul>
	 */
	public static final MMCode mmTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Relates to a triparty repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "TRPO";
		}
	};
	/**
	 * Relates to a triparty reverse repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty reverse repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyReverseRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "TRVO";
		}
	};
	/**
	 * Relates to a turnaround: the same security is bought and sold to settle
	 * the same day, to or from different brokers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TURN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTurnaround = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "TURN";
		}
	};
	/**
	 * Transaction is a pre-advice, that is, for matching purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a pre-advice, that is, for matching purposes only."</li>
	 * </ul>
	 */
	public static final MMCode mmPreAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Relates to an auto-collateralisation movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to an auto-collateralisation movement."</li>
	 * </ul>
	 */
	public static final MMCode mmAutoCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Relates to a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a market claim."</li>
	 * </ul>
	 */
	public static final MMCode mmMarketClaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Relates to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a corporate action."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Transaction is a purchase of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Buy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a purchase of financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmBuy = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			definition = "Transaction is a purchase of financial instrument.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BUYI";
		}
	};
	/**
	 * Transaction is a sale of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sell"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a sale of financial instrument."</li>
	 * </ul>
	 */
	public static final MMCode mmSell = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			definition = "Transaction is a sale of financial instrument.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Transaction is an Initial Public Offer (IPO) order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialPublicOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an Initial Public Offer (IPO) order."</li>
	 * </ul>
	 */
	public static final MMCode mmInitialPublicOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPublicOffer";
			definition = "Transaction is an Initial Public Offer (IPO) order.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "IPOO";
		}
	};
	/**
	 * Transaction is a reinvestment of dividends.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentOfDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is a reinvestment of dividends."</li>
	 * </ul>
	 */
	public static final MMCode mmReinvestmentOfDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Transaction is a reinvestment of dividends.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "DIVR";
		}
	};
	/**
	 * Indicates that the type of transaction is a cross from.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of transaction is a cross from."</li>
	 * </ul>
	 */
	public static final MMCode mmCrossFrom = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossFrom";
			definition = "Indicates that the type of transaction is a cross from.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CROF";
		}
	};
	/**
	 * Indicates that the type of transaction is a cross to.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CROT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the type of transaction is a cross to."</li>
	 * </ul>
	 */
	public static final MMCode mmCrossTo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossTo";
			definition = "Indicates that the type of transaction is a cross to.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "CROT";
		}
	};
	/**
	 * Transaction is a change of an investment from one sub-fund to another
	 * sub-fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a change of an investment from one sub-fund to another sub-fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSwitchFrom = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			definition = "Transaction is a change of an investment from one sub-fund to another sub-fund.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SWIF";
		}
	};
	/**
	 * Transaction is a change of an investment from one sub-fund to another
	 * sub-fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwitchTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction is a change of an investment from one sub-fund to another sub-fund."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSwitchTo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			definition = "Transaction is a change of an investment from one sub-fund to another sub-fund.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "SWIT";
		}
	};
	/**
	 * A basket trade, i.e. a unit of 15 or more financial instruments used in
	 * program trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBasket = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * Trade which is guaranteed to be finalized
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is guaranteed to be finalized"</li>
	 * </ul>
	 */
	public static final MMCode mmGuaranteedClose = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedClose";
			definition = "Trade which is guaranteed to be finalized";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "GUAR";
		}
	};
	/**
	 * A program trade, i.e. a computer-driven trade of buying and selling of
	 * baskets of 15 or more financial instruments by index arbitrage
	 * specialists or institutional traders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Program"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProgram = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Program";
			definition = "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * Transaction relates to employee trade reporting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployeeTradeReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction relates to employee trade reporting."</li>
	 * </ul>
	 */
	public static final MMCode mmEmployeeTradeReporting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			definition = "Transaction relates to employee trade reporting.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "EMTR";
		}
	};
	/**
	 * Trade in which an agent intermediates between a buyer and a seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade in which an agent intermediates between a buyer and a seller."</li>
	 * </ul>
	 */
	public static final MMCode mmAgency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agency";
			definition = "Trade in which an agent intermediates between a buyer and a seller.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "AGEN";
		}
	};
	/**
	 * A trade from a broker to another broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerToBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A trade from a broker to another broker."</li>
	 * </ul>
	 */
	public static final MMCode mmBrokerToBroker = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerToBroker";
			definition = "A trade from a broker to another broker.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BRBR";
		}
	};
	/**
	 * A pre-allocated trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A pre-allocated trade."</li>
	 * </ul>
	 */
	public static final MMCode mmPreAllocation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocation";
			definition = "A pre-allocated trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "PRAL";
		}
	};
	/**
	 * A trade from an investment fund to another investment fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundToFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A trade from an investment fund to another investment fund."</li>
	 * </ul>
	 */
	public static final MMCode mmFundToFund = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundToFund";
			definition = "A trade from an investment fund to another investment fund.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "FDFD";
		}
	};
	/**
	 * Transaction is an List order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "List"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an List order."</li>
	 * </ul>
	 */
	public static final MMCode mmList = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "List";
			definition = "Transaction is an List order.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "LIST";
		}
	};
	/**
	 * Transaction is an Index order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is an Index order."</li>
	 * </ul>
	 */
	public static final MMCode mmIndex = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Transaction is an Index order.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * Trade whose price is guaranteed as the weighted average of the trade
	 * prices on a specific day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VWAPGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVWAPGuarantee = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPGuarantee";
			definition = "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Trade involving risk
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade involving risk"</li>
	 * </ul>
	 */
	public static final MMCode mmRiskTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskTrade";
			definition = "Trade involving risk";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "RISK";
		}
	};
	/**
	 * Offering issue trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferingIssuingTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offering issue trade."</li>
	 * </ul>
	 */
	public static final MMCode mmOfferingIssuingTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			definition = "Offering issue trade.";
			owner_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "OFIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeV3Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				code_lazy = () -> Arrays.asList(SecuritiesTransactionTypeV3Code.mmBuySellBack, SecuritiesTransactionTypeV3Code.mmBuyIn, SecuritiesTransactionTypeV3Code.mmCentralBankCollateralOperation,
						SecuritiesTransactionTypeV3Code.mmCollateralIn, SecuritiesTransactionTypeV3Code.mmCollateralOut, SecuritiesTransactionTypeV3Code.mmDepositoryReceiptConversion, SecuritiesTransactionTypeV3Code.mmFactorUpdate,
						SecuritiesTransactionTypeV3Code.mmMoveOfStock, SecuritiesTransactionTypeV3Code.mmIssuance, SecuritiesTransactionTypeV3Code.mmMarkDown, SecuritiesTransactionTypeV3Code.mmMarkUp,
						SecuritiesTransactionTypeV3Code.mmNetting, SecuritiesTransactionTypeV3Code.mmNonSyndicated, SecuritiesTransactionTypeV3Code.mmExternalAccountTransfer, SecuritiesTransactionTypeV3Code.mmInternalAccountTransfer,
						SecuritiesTransactionTypeV3Code.mmPairOff, SecuritiesTransactionTypeV3Code.mmPlacement, SecuritiesTransactionTypeV3Code.mmPortfolioMove, SecuritiesTransactionTypeV3Code.mmRealignment,
						SecuritiesTransactionTypeV3Code.mmWithdrawal, SecuritiesTransactionTypeV3Code.mmRedemption, SecuritiesTransactionTypeV3Code.mmDepositoryReceiptReleaseCancellation, SecuritiesTransactionTypeV3Code.mmRepo,
						SecuritiesTransactionTypeV3Code.mmReturnDeliveryWithoutMatching, SecuritiesTransactionTypeV3Code.mmReporting, SecuritiesTransactionTypeV3Code.mmReverseRepurchaseAgreement,
						SecuritiesTransactionTypeV3Code.mmSellBuyBack, SecuritiesTransactionTypeV3Code.mmBorrowingReallocation, SecuritiesTransactionTypeV3Code.mmSecuritiesBorrowing, SecuritiesTransactionTypeV3Code.mmSecuritiesLending,
						SecuritiesTransactionTypeV3Code.mmLendingReallocation, SecuritiesTransactionTypeV3Code.mmSubscription, SecuritiesTransactionTypeV3Code.mmSyndicateUnderwriters, SecuritiesTransactionTypeV3Code.mmTBAClosing,
						SecuritiesTransactionTypeV3Code.mmTrade, SecuritiesTransactionTypeV3Code.mmTripartyRepo, SecuritiesTransactionTypeV3Code.mmTripartyReverseRepo, SecuritiesTransactionTypeV3Code.mmTurnaround,
						SecuritiesTransactionTypeV3Code.mmPreAdvice, SecuritiesTransactionTypeV3Code.mmAutoCollateralisation, SecuritiesTransactionTypeV3Code.mmMarketClaim, SecuritiesTransactionTypeV3Code.mmCorporateAction,
						SecuritiesTransactionTypeV3Code.mmBuy, SecuritiesTransactionTypeV3Code.mmSell, SecuritiesTransactionTypeV3Code.mmInitialPublicOffer, SecuritiesTransactionTypeV3Code.mmReinvestmentOfDividend,
						SecuritiesTransactionTypeV3Code.mmCrossFrom, SecuritiesTransactionTypeV3Code.mmCrossTo, SecuritiesTransactionTypeV3Code.mmSwitchFrom, SecuritiesTransactionTypeV3Code.mmSwitchTo,
						SecuritiesTransactionTypeV3Code.mmBasket, SecuritiesTransactionTypeV3Code.mmGuaranteedClose, SecuritiesTransactionTypeV3Code.mmProgram, SecuritiesTransactionTypeV3Code.mmEmployeeTradeReporting,
						SecuritiesTransactionTypeV3Code.mmAgency, SecuritiesTransactionTypeV3Code.mmBrokerToBroker, SecuritiesTransactionTypeV3Code.mmPreAllocation, SecuritiesTransactionTypeV3Code.mmFundToFund,
						SecuritiesTransactionTypeV3Code.mmList, SecuritiesTransactionTypeV3Code.mmIndex, SecuritiesTransactionTypeV3Code.mmVWAPGuarantee, SecuritiesTransactionTypeV3Code.mmRiskTrade,
						SecuritiesTransactionTypeV3Code.mmOfferingIssuingTrade);
				derivation_lazy = () -> Arrays.asList(SettlementTransactionType7Code.mmObject(), SecuritiesTransactionType15Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}